/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.demo.workflow.core.service.impl;

import java.util.Date;
import java.util.List;

import com.demo.workflow.core.model.Hotel;
import com.demo.workflow.core.model.Leave;
import com.demo.workflow.core.service.HotelLocalService;
import com.demo.workflow.core.service.HotelLocalServiceUtil;
import com.demo.workflow.core.service.base.HotelLocalServiceBaseImpl;
import com.liferay.asset.kernel.model.AssetEntry;
import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.search.Indexer;
import com.liferay.portal.kernel.search.IndexerRegistryUtil;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.ContentTypes;
import com.liferay.portal.kernel.workflow.WorkflowConstants;
import com.liferay.portal.kernel.workflow.WorkflowHandlerRegistryUtil;

/**
 * The implementation of the hotel local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.demo.workflow.core.service.HotelLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see HotelLocalServiceBaseImpl
 * @see com.demo.workflow.core.service.HotelLocalServiceUtil
 */
public class HotelLocalServiceImpl extends HotelLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link com.demo.workflow.core.service.HotelLocalServiceUtil} to access the hotel local service.
	 * 
	 */
	
	public Hotel addItemsInList(ServiceContext serviceContext,int pizzaConut,int burgerCount,int DoughnutCount){
		
		long orderId = CounterLocalServiceUtil.increment(Hotel.class.getName());
		Hotel hotel = null;
		
		try{
			User user = userLocalService.getUser(serviceContext.getUserId());
			hotel = hotelLocalService.createHotel(orderId);
			hotel.setPizza(pizzaConut);
			hotel.setBurger(burgerCount);
			hotel.setDoughnut(DoughnutCount);
			hotel.setUserId(serviceContext.getUserId());
			hotel.setUserName(user.getFullName());
			hotel.setCompanyId(serviceContext.getCompanyId());
			hotel.setGroupId(serviceContext.getScopeGroupId());
			
			hotel.setStatus(WorkflowConstants.STATUS_DRAFT);
			hotel.setStatusByUserId(user.getUserId());
			hotel.setStatusDate(new Date());
			hotel.setStatusByUserName(user.getFirstName());
			hotel.setStatusByUserUuid(user.getUserUuid());
	        
			hotel = hotelLocalService.addHotel(hotel);
			
			 AssetEntry assetEntry = assetEntryLocalService.updateEntry( user.getUserId(), serviceContext.getScopeGroupId(), new Date(),
			            new Date(), Hotel.class.getName(),hotel.getOrderId(), hotel.getUuid(), 0, null, null, true, false, new Date(), null,
			            new Date(), null, ContentTypes.TEXT_HTML, hotel.getUserName(), hotel.getUserName(), null, null, null, 0, 0, null);
			       Indexer<Hotel> indexer = IndexerRegistryUtil.nullSafeGetIndexer(Hotel.class);
			       indexer.reindex(hotel);
			 
			       WorkflowHandlerRegistryUtil.startWorkflowInstance(hotel.getCompanyId(), hotel.getGroupId(), hotel.getUserId(), Hotel.class.getName(),hotel.getPrimaryKey(), hotel, serviceContext);
		}catch(PortalException e){
			e.printStackTrace();
		}
		
		
		return hotel;
		
		
	}
	
	public Hotel updateStatus(long userId,long orderId,int status,ServiceContext serviceContext){
		 
		Hotel hotel = hotelPersistence.fetchByPrimaryKey(orderId);
		hotel.setStatus(status);
		hotel.setStatusByUserId(userId);
		hotel.setStatusDate(new Date());
		User user = null;
		 try {
		      user = userLocalService.getUser(userId);
		      hotel.setStatusByUserName(user.getFullName());
		      hotel.setStatusByUserUuid(user.getUserUuid());
		 } catch (PortalException e) {
		     e.printStackTrace();
		 }
		 hotel = hotelPersistence.update(hotel);
		 try {
		 if (status == WorkflowConstants.STATUS_APPROVED) {  
		     // update the asset status to visibile
		    assetEntryLocalService.updateEntry(Hotel.class.getName(), orderId, new Date(),null, true, true);
		 } else {
		     // set leave entity status to false
		     assetEntryLocalService.updateVisible(Hotel.class.getName(), orderId, false);  
		 }
		 } catch (Exception e) {
		     e.printStackTrace();
		 }
		 return hotel;
 	}
	
	public List<Hotel> getItemsByStatus(long groupId,int status){
		return hotelPersistence.findBystatus(groupId, status);
	}
	
	public List<Hotel> getItemsByStatus(long groupId,int status,int start,int end){
		return hotelPersistence.findBystatus(groupId, status, start, end);
	}

	@Override
	public Hotel addItemsInList(long userId, int pizzaConut, int burgerCount, int DoughnutCount) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}