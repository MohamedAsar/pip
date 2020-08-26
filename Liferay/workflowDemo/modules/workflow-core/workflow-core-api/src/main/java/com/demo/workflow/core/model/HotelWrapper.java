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

package com.demo.workflow.core.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.exportimport.kernel.lar.StagedModelType;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link Hotel}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Hotel
 * @generated
 */
@ProviderType
public class HotelWrapper implements Hotel, ModelWrapper<Hotel> {
	public HotelWrapper(Hotel hotel) {
		_hotel = hotel;
	}

	@Override
	public Class<?> getModelClass() {
		return Hotel.class;
	}

	@Override
	public String getModelClassName() {
		return Hotel.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("orderId", getOrderId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("pizza", getPizza());
		attributes.put("burger", getBurger());
		attributes.put("Doughnut", getDoughnut());
		attributes.put("status", getStatus());
		attributes.put("statusByUserId", getStatusByUserId());
		attributes.put("statusByUserName", getStatusByUserName());
		attributes.put("statusDate", getStatusDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long orderId = (Long)attributes.get("orderId");

		if (orderId != null) {
			setOrderId(orderId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		Integer pizza = (Integer)attributes.get("pizza");

		if (pizza != null) {
			setPizza(pizza);
		}

		Integer burger = (Integer)attributes.get("burger");

		if (burger != null) {
			setBurger(burger);
		}

		Integer Doughnut = (Integer)attributes.get("Doughnut");

		if (Doughnut != null) {
			setDoughnut(Doughnut);
		}

		Integer status = (Integer)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}

		Long statusByUserId = (Long)attributes.get("statusByUserId");

		if (statusByUserId != null) {
			setStatusByUserId(statusByUserId);
		}

		String statusByUserName = (String)attributes.get("statusByUserName");

		if (statusByUserName != null) {
			setStatusByUserName(statusByUserName);
		}

		Date statusDate = (Date)attributes.get("statusDate");

		if (statusDate != null) {
			setStatusDate(statusDate);
		}
	}

	@Override
	public Object clone() {
		return new HotelWrapper((Hotel)_hotel.clone());
	}

	@Override
	public int compareTo(Hotel hotel) {
		return _hotel.compareTo(hotel);
	}

	/**
	* Returns the burger of this hotel.
	*
	* @return the burger of this hotel
	*/
	@Override
	public int getBurger() {
		return _hotel.getBurger();
	}

	/**
	* Returns the company ID of this hotel.
	*
	* @return the company ID of this hotel
	*/
	@Override
	public long getCompanyId() {
		return _hotel.getCompanyId();
	}

	/**
	* Returns the create date of this hotel.
	*
	* @return the create date of this hotel
	*/
	@Override
	public Date getCreateDate() {
		return _hotel.getCreateDate();
	}

	/**
	* Returns the doughnut of this hotel.
	*
	* @return the doughnut of this hotel
	*/
	@Override
	public int getDoughnut() {
		return _hotel.getDoughnut();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _hotel.getExpandoBridge();
	}

	/**
	* Returns the group ID of this hotel.
	*
	* @return the group ID of this hotel
	*/
	@Override
	public long getGroupId() {
		return _hotel.getGroupId();
	}

	/**
	* Returns the modified date of this hotel.
	*
	* @return the modified date of this hotel
	*/
	@Override
	public Date getModifiedDate() {
		return _hotel.getModifiedDate();
	}

	/**
	* Returns the order ID of this hotel.
	*
	* @return the order ID of this hotel
	*/
	@Override
	public long getOrderId() {
		return _hotel.getOrderId();
	}

	/**
	* Returns the pizza of this hotel.
	*
	* @return the pizza of this hotel
	*/
	@Override
	public int getPizza() {
		return _hotel.getPizza();
	}

	/**
	* Returns the primary key of this hotel.
	*
	* @return the primary key of this hotel
	*/
	@Override
	public long getPrimaryKey() {
		return _hotel.getPrimaryKey();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _hotel.getPrimaryKeyObj();
	}

	/**
	* Returns the status of this hotel.
	*
	* @return the status of this hotel
	*/
	@Override
	public int getStatus() {
		return _hotel.getStatus();
	}

	/**
	* Returns the status by user ID of this hotel.
	*
	* @return the status by user ID of this hotel
	*/
	@Override
	public long getStatusByUserId() {
		return _hotel.getStatusByUserId();
	}

	/**
	* Returns the status by user name of this hotel.
	*
	* @return the status by user name of this hotel
	*/
	@Override
	public String getStatusByUserName() {
		return _hotel.getStatusByUserName();
	}

	/**
	* Returns the status by user uuid of this hotel.
	*
	* @return the status by user uuid of this hotel
	*/
	@Override
	public String getStatusByUserUuid() {
		return _hotel.getStatusByUserUuid();
	}

	/**
	* Returns the status date of this hotel.
	*
	* @return the status date of this hotel
	*/
	@Override
	public Date getStatusDate() {
		return _hotel.getStatusDate();
	}

	/**
	* Returns the user ID of this hotel.
	*
	* @return the user ID of this hotel
	*/
	@Override
	public long getUserId() {
		return _hotel.getUserId();
	}

	/**
	* Returns the user name of this hotel.
	*
	* @return the user name of this hotel
	*/
	@Override
	public String getUserName() {
		return _hotel.getUserName();
	}

	/**
	* Returns the user uuid of this hotel.
	*
	* @return the user uuid of this hotel
	*/
	@Override
	public String getUserUuid() {
		return _hotel.getUserUuid();
	}

	/**
	* Returns the uuid of this hotel.
	*
	* @return the uuid of this hotel
	*/
	@Override
	public String getUuid() {
		return _hotel.getUuid();
	}

	@Override
	public int hashCode() {
		return _hotel.hashCode();
	}

	/**
	* Returns <code>true</code> if this hotel is approved.
	*
	* @return <code>true</code> if this hotel is approved; <code>false</code> otherwise
	*/
	@Override
	public boolean isApproved() {
		return _hotel.isApproved();
	}

	@Override
	public boolean isCachedModel() {
		return _hotel.isCachedModel();
	}

	/**
	* Returns <code>true</code> if this hotel is denied.
	*
	* @return <code>true</code> if this hotel is denied; <code>false</code> otherwise
	*/
	@Override
	public boolean isDenied() {
		return _hotel.isDenied();
	}

	/**
	* Returns <code>true</code> if this hotel is a draft.
	*
	* @return <code>true</code> if this hotel is a draft; <code>false</code> otherwise
	*/
	@Override
	public boolean isDraft() {
		return _hotel.isDraft();
	}

	@Override
	public boolean isEscapedModel() {
		return _hotel.isEscapedModel();
	}

	/**
	* Returns <code>true</code> if this hotel is expired.
	*
	* @return <code>true</code> if this hotel is expired; <code>false</code> otherwise
	*/
	@Override
	public boolean isExpired() {
		return _hotel.isExpired();
	}

	/**
	* Returns <code>true</code> if this hotel is inactive.
	*
	* @return <code>true</code> if this hotel is inactive; <code>false</code> otherwise
	*/
	@Override
	public boolean isInactive() {
		return _hotel.isInactive();
	}

	/**
	* Returns <code>true</code> if this hotel is incomplete.
	*
	* @return <code>true</code> if this hotel is incomplete; <code>false</code> otherwise
	*/
	@Override
	public boolean isIncomplete() {
		return _hotel.isIncomplete();
	}

	@Override
	public boolean isNew() {
		return _hotel.isNew();
	}

	/**
	* Returns <code>true</code> if this hotel is pending.
	*
	* @return <code>true</code> if this hotel is pending; <code>false</code> otherwise
	*/
	@Override
	public boolean isPending() {
		return _hotel.isPending();
	}

	/**
	* Returns <code>true</code> if this hotel is scheduled.
	*
	* @return <code>true</code> if this hotel is scheduled; <code>false</code> otherwise
	*/
	@Override
	public boolean isScheduled() {
		return _hotel.isScheduled();
	}

	@Override
	public void persist() {
		_hotel.persist();
	}

	/**
	* Sets the burger of this hotel.
	*
	* @param burger the burger of this hotel
	*/
	@Override
	public void setBurger(int burger) {
		_hotel.setBurger(burger);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_hotel.setCachedModel(cachedModel);
	}

	/**
	* Sets the company ID of this hotel.
	*
	* @param companyId the company ID of this hotel
	*/
	@Override
	public void setCompanyId(long companyId) {
		_hotel.setCompanyId(companyId);
	}

	/**
	* Sets the create date of this hotel.
	*
	* @param createDate the create date of this hotel
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_hotel.setCreateDate(createDate);
	}

	/**
	* Sets the doughnut of this hotel.
	*
	* @param Doughnut the doughnut of this hotel
	*/
	@Override
	public void setDoughnut(int Doughnut) {
		_hotel.setDoughnut(Doughnut);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_hotel.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_hotel.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_hotel.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the group ID of this hotel.
	*
	* @param groupId the group ID of this hotel
	*/
	@Override
	public void setGroupId(long groupId) {
		_hotel.setGroupId(groupId);
	}

	/**
	* Sets the modified date of this hotel.
	*
	* @param modifiedDate the modified date of this hotel
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_hotel.setModifiedDate(modifiedDate);
	}

	@Override
	public void setNew(boolean n) {
		_hotel.setNew(n);
	}

	/**
	* Sets the order ID of this hotel.
	*
	* @param orderId the order ID of this hotel
	*/
	@Override
	public void setOrderId(long orderId) {
		_hotel.setOrderId(orderId);
	}

	/**
	* Sets the pizza of this hotel.
	*
	* @param pizza the pizza of this hotel
	*/
	@Override
	public void setPizza(int pizza) {
		_hotel.setPizza(pizza);
	}

	/**
	* Sets the primary key of this hotel.
	*
	* @param primaryKey the primary key of this hotel
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_hotel.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_hotel.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the status of this hotel.
	*
	* @param status the status of this hotel
	*/
	@Override
	public void setStatus(int status) {
		_hotel.setStatus(status);
	}

	/**
	* Sets the status by user ID of this hotel.
	*
	* @param statusByUserId the status by user ID of this hotel
	*/
	@Override
	public void setStatusByUserId(long statusByUserId) {
		_hotel.setStatusByUserId(statusByUserId);
	}

	/**
	* Sets the status by user name of this hotel.
	*
	* @param statusByUserName the status by user name of this hotel
	*/
	@Override
	public void setStatusByUserName(String statusByUserName) {
		_hotel.setStatusByUserName(statusByUserName);
	}

	/**
	* Sets the status by user uuid of this hotel.
	*
	* @param statusByUserUuid the status by user uuid of this hotel
	*/
	@Override
	public void setStatusByUserUuid(String statusByUserUuid) {
		_hotel.setStatusByUserUuid(statusByUserUuid);
	}

	/**
	* Sets the status date of this hotel.
	*
	* @param statusDate the status date of this hotel
	*/
	@Override
	public void setStatusDate(Date statusDate) {
		_hotel.setStatusDate(statusDate);
	}

	/**
	* Sets the user ID of this hotel.
	*
	* @param userId the user ID of this hotel
	*/
	@Override
	public void setUserId(long userId) {
		_hotel.setUserId(userId);
	}

	/**
	* Sets the user name of this hotel.
	*
	* @param userName the user name of this hotel
	*/
	@Override
	public void setUserName(String userName) {
		_hotel.setUserName(userName);
	}

	/**
	* Sets the user uuid of this hotel.
	*
	* @param userUuid the user uuid of this hotel
	*/
	@Override
	public void setUserUuid(String userUuid) {
		_hotel.setUserUuid(userUuid);
	}

	/**
	* Sets the uuid of this hotel.
	*
	* @param uuid the uuid of this hotel
	*/
	@Override
	public void setUuid(String uuid) {
		_hotel.setUuid(uuid);
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<Hotel> toCacheModel() {
		return _hotel.toCacheModel();
	}

	@Override
	public Hotel toEscapedModel() {
		return new HotelWrapper(_hotel.toEscapedModel());
	}

	@Override
	public String toString() {
		return _hotel.toString();
	}

	@Override
	public Hotel toUnescapedModel() {
		return new HotelWrapper(_hotel.toUnescapedModel());
	}

	@Override
	public String toXmlString() {
		return _hotel.toXmlString();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof HotelWrapper)) {
			return false;
		}

		HotelWrapper hotelWrapper = (HotelWrapper)obj;

		if (Objects.equals(_hotel, hotelWrapper._hotel)) {
			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _hotel.getStagedModelType();
	}

	@Override
	public Hotel getWrappedModel() {
		return _hotel;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _hotel.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _hotel.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_hotel.resetOriginalValues();
	}

	private final Hotel _hotel;
}