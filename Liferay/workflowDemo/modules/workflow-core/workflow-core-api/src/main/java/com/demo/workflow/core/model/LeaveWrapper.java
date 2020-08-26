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
 * This class is a wrapper for {@link Leave}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Leave
 * @generated
 */
@ProviderType
public class LeaveWrapper implements Leave, ModelWrapper<Leave> {
	public LeaveWrapper(Leave leave) {
		_leave = leave;
	}

	@Override
	public Class<?> getModelClass() {
		return Leave.class;
	}

	@Override
	public String getModelClassName() {
		return Leave.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("leaveId", getLeaveId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("leaveName", getLeaveName());
		attributes.put("startDate", getStartDate());
		attributes.put("endDate", getEndDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long leaveId = (Long)attributes.get("leaveId");

		if (leaveId != null) {
			setLeaveId(leaveId);
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

		String leaveName = (String)attributes.get("leaveName");

		if (leaveName != null) {
			setLeaveName(leaveName);
		}

		Date startDate = (Date)attributes.get("startDate");

		if (startDate != null) {
			setStartDate(startDate);
		}

		Date endDate = (Date)attributes.get("endDate");

		if (endDate != null) {
			setEndDate(endDate);
		}
	}

	@Override
	public Object clone() {
		return new LeaveWrapper((Leave)_leave.clone());
	}

	@Override
	public int compareTo(Leave leave) {
		return _leave.compareTo(leave);
	}

	/**
	* Returns the company ID of this leave.
	*
	* @return the company ID of this leave
	*/
	@Override
	public long getCompanyId() {
		return _leave.getCompanyId();
	}

	/**
	* Returns the create date of this leave.
	*
	* @return the create date of this leave
	*/
	@Override
	public Date getCreateDate() {
		return _leave.getCreateDate();
	}

	/**
	* Returns the end date of this leave.
	*
	* @return the end date of this leave
	*/
	@Override
	public Date getEndDate() {
		return _leave.getEndDate();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _leave.getExpandoBridge();
	}

	/**
	* Returns the group ID of this leave.
	*
	* @return the group ID of this leave
	*/
	@Override
	public long getGroupId() {
		return _leave.getGroupId();
	}

	/**
	* Returns the leave ID of this leave.
	*
	* @return the leave ID of this leave
	*/
	@Override
	public long getLeaveId() {
		return _leave.getLeaveId();
	}

	/**
	* Returns the leave name of this leave.
	*
	* @return the leave name of this leave
	*/
	@Override
	public String getLeaveName() {
		return _leave.getLeaveName();
	}

	/**
	* Returns the modified date of this leave.
	*
	* @return the modified date of this leave
	*/
	@Override
	public Date getModifiedDate() {
		return _leave.getModifiedDate();
	}

	/**
	* Returns the primary key of this leave.
	*
	* @return the primary key of this leave
	*/
	@Override
	public long getPrimaryKey() {
		return _leave.getPrimaryKey();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _leave.getPrimaryKeyObj();
	}

	/**
	* Returns the start date of this leave.
	*
	* @return the start date of this leave
	*/
	@Override
	public Date getStartDate() {
		return _leave.getStartDate();
	}

	/**
	* Returns the user ID of this leave.
	*
	* @return the user ID of this leave
	*/
	@Override
	public long getUserId() {
		return _leave.getUserId();
	}

	/**
	* Returns the user name of this leave.
	*
	* @return the user name of this leave
	*/
	@Override
	public String getUserName() {
		return _leave.getUserName();
	}

	/**
	* Returns the user uuid of this leave.
	*
	* @return the user uuid of this leave
	*/
	@Override
	public String getUserUuid() {
		return _leave.getUserUuid();
	}

	/**
	* Returns the uuid of this leave.
	*
	* @return the uuid of this leave
	*/
	@Override
	public String getUuid() {
		return _leave.getUuid();
	}

	@Override
	public int hashCode() {
		return _leave.hashCode();
	}

	@Override
	public boolean isCachedModel() {
		return _leave.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _leave.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _leave.isNew();
	}

	@Override
	public void persist() {
		_leave.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_leave.setCachedModel(cachedModel);
	}

	/**
	* Sets the company ID of this leave.
	*
	* @param companyId the company ID of this leave
	*/
	@Override
	public void setCompanyId(long companyId) {
		_leave.setCompanyId(companyId);
	}

	/**
	* Sets the create date of this leave.
	*
	* @param createDate the create date of this leave
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_leave.setCreateDate(createDate);
	}

	/**
	* Sets the end date of this leave.
	*
	* @param endDate the end date of this leave
	*/
	@Override
	public void setEndDate(Date endDate) {
		_leave.setEndDate(endDate);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_leave.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_leave.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_leave.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the group ID of this leave.
	*
	* @param groupId the group ID of this leave
	*/
	@Override
	public void setGroupId(long groupId) {
		_leave.setGroupId(groupId);
	}

	/**
	* Sets the leave ID of this leave.
	*
	* @param leaveId the leave ID of this leave
	*/
	@Override
	public void setLeaveId(long leaveId) {
		_leave.setLeaveId(leaveId);
	}

	/**
	* Sets the leave name of this leave.
	*
	* @param leaveName the leave name of this leave
	*/
	@Override
	public void setLeaveName(String leaveName) {
		_leave.setLeaveName(leaveName);
	}

	/**
	* Sets the modified date of this leave.
	*
	* @param modifiedDate the modified date of this leave
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_leave.setModifiedDate(modifiedDate);
	}

	@Override
	public void setNew(boolean n) {
		_leave.setNew(n);
	}

	/**
	* Sets the primary key of this leave.
	*
	* @param primaryKey the primary key of this leave
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_leave.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_leave.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the start date of this leave.
	*
	* @param startDate the start date of this leave
	*/
	@Override
	public void setStartDate(Date startDate) {
		_leave.setStartDate(startDate);
	}

	/**
	* Sets the user ID of this leave.
	*
	* @param userId the user ID of this leave
	*/
	@Override
	public void setUserId(long userId) {
		_leave.setUserId(userId);
	}

	/**
	* Sets the user name of this leave.
	*
	* @param userName the user name of this leave
	*/
	@Override
	public void setUserName(String userName) {
		_leave.setUserName(userName);
	}

	/**
	* Sets the user uuid of this leave.
	*
	* @param userUuid the user uuid of this leave
	*/
	@Override
	public void setUserUuid(String userUuid) {
		_leave.setUserUuid(userUuid);
	}

	/**
	* Sets the uuid of this leave.
	*
	* @param uuid the uuid of this leave
	*/
	@Override
	public void setUuid(String uuid) {
		_leave.setUuid(uuid);
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<Leave> toCacheModel() {
		return _leave.toCacheModel();
	}

	@Override
	public Leave toEscapedModel() {
		return new LeaveWrapper(_leave.toEscapedModel());
	}

	@Override
	public String toString() {
		return _leave.toString();
	}

	@Override
	public Leave toUnescapedModel() {
		return new LeaveWrapper(_leave.toUnescapedModel());
	}

	@Override
	public String toXmlString() {
		return _leave.toXmlString();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof LeaveWrapper)) {
			return false;
		}

		LeaveWrapper leaveWrapper = (LeaveWrapper)obj;

		if (Objects.equals(_leave, leaveWrapper._leave)) {
			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _leave.getStagedModelType();
	}

	@Override
	public Leave getWrappedModel() {
		return _leave;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _leave.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _leave.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_leave.resetOriginalValues();
	}

	private final Leave _leave;
}