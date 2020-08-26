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

import com.demo.workflow.core.model.Leave;
import com.demo.workflow.core.service.base.LeaveLocalServiceBaseImpl;
import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.User;

/**
 * The implementation of the leave local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.demo.workflow.core.service.LeaveLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see LeaveLocalServiceBaseImpl
 * @see com.demo.workflow.core.service.LeaveLocalServiceUtil
 */
public class LeaveLocalServiceImpl extends LeaveLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link com.demo.workflow.core.service.LeaveLocalServiceUtil} to access the leave local service.
	 * 
	 */
	
	public int getLeaveCount(long userId){
		return leavePersistence.countByuserId(userId);
	}
	
	public Leave addLeave(String leaveName,long userId,long groupId,long companyId,Date leaveStartDate,Date leaveEndDate){
		long leaveId = CounterLocalServiceUtil.increment(Leave.class.getName());
		Leave leave = null;
		
		try{
			User user = userLocalService.getUser(userId);
			leave = leaveLocalService.createLeave(leaveId);
			leave.setUserId(userId);	
			leave.setCreateDate(new Date());
			leave.setLeaveName(leaveName);
			leave.setStartDate(leaveStartDate);
			leave.setEndDate(leaveEndDate);
			leave.setUserName(user.getFirstName());
			leave.setCompanyId(companyId);
			leave.setGroupId(groupId);
			
			leave = leaveLocalService.addLeave(leave);
			
		}catch(PortalException e){
			e.printStackTrace();
		}
		return leave;
	}
	
	public List<Leave> getLeaveByUserId(long userId){
		return leavePersistence.findByuserId(userId);
	}
			
	public List<Leave> getLeaveByUserId(long userId,int start,int end){
		return leavePersistence.findByuserId(userId, start, end);
	}
}