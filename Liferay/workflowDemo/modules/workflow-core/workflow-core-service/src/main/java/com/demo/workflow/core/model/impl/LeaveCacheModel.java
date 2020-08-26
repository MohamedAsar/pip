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

package com.demo.workflow.core.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.demo.workflow.core.model.Leave;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Leave in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see Leave
 * @generated
 */
@ProviderType
public class LeaveCacheModel implements CacheModel<Leave>, Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof LeaveCacheModel)) {
			return false;
		}

		LeaveCacheModel leaveCacheModel = (LeaveCacheModel)obj;

		if (leaveId == leaveCacheModel.leaveId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, leaveId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", leaveId=");
		sb.append(leaveId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", leaveName=");
		sb.append(leaveName);
		sb.append(", startDate=");
		sb.append(startDate);
		sb.append(", endDate=");
		sb.append(endDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Leave toEntityModel() {
		LeaveImpl leaveImpl = new LeaveImpl();

		if (uuid == null) {
			leaveImpl.setUuid("");
		}
		else {
			leaveImpl.setUuid(uuid);
		}

		leaveImpl.setLeaveId(leaveId);
		leaveImpl.setGroupId(groupId);
		leaveImpl.setCompanyId(companyId);
		leaveImpl.setUserId(userId);

		if (userName == null) {
			leaveImpl.setUserName("");
		}
		else {
			leaveImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			leaveImpl.setCreateDate(null);
		}
		else {
			leaveImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			leaveImpl.setModifiedDate(null);
		}
		else {
			leaveImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (leaveName == null) {
			leaveImpl.setLeaveName("");
		}
		else {
			leaveImpl.setLeaveName(leaveName);
		}

		if (startDate == Long.MIN_VALUE) {
			leaveImpl.setStartDate(null);
		}
		else {
			leaveImpl.setStartDate(new Date(startDate));
		}

		if (endDate == Long.MIN_VALUE) {
			leaveImpl.setEndDate(null);
		}
		else {
			leaveImpl.setEndDate(new Date(endDate));
		}

		leaveImpl.resetOriginalValues();

		return leaveImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		leaveId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		leaveName = objectInput.readUTF();
		startDate = objectInput.readLong();
		endDate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(leaveId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		if (leaveName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(leaveName);
		}

		objectOutput.writeLong(startDate);
		objectOutput.writeLong(endDate);
	}

	public String uuid;
	public long leaveId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String leaveName;
	public long startDate;
	public long endDate;
}