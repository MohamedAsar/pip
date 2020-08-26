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

import com.demo.workflow.core.model.Hotel;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Hotel in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see Hotel
 * @generated
 */
@ProviderType
public class HotelCacheModel implements CacheModel<Hotel>, Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof HotelCacheModel)) {
			return false;
		}

		HotelCacheModel hotelCacheModel = (HotelCacheModel)obj;

		if (orderId == hotelCacheModel.orderId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, orderId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(31);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", orderId=");
		sb.append(orderId);
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
		sb.append(", pizza=");
		sb.append(pizza);
		sb.append(", burger=");
		sb.append(burger);
		sb.append(", Doughnut=");
		sb.append(Doughnut);
		sb.append(", status=");
		sb.append(status);
		sb.append(", statusByUserId=");
		sb.append(statusByUserId);
		sb.append(", statusByUserName=");
		sb.append(statusByUserName);
		sb.append(", statusDate=");
		sb.append(statusDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Hotel toEntityModel() {
		HotelImpl hotelImpl = new HotelImpl();

		if (uuid == null) {
			hotelImpl.setUuid("");
		}
		else {
			hotelImpl.setUuid(uuid);
		}

		hotelImpl.setOrderId(orderId);
		hotelImpl.setGroupId(groupId);
		hotelImpl.setCompanyId(companyId);
		hotelImpl.setUserId(userId);

		if (userName == null) {
			hotelImpl.setUserName("");
		}
		else {
			hotelImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			hotelImpl.setCreateDate(null);
		}
		else {
			hotelImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			hotelImpl.setModifiedDate(null);
		}
		else {
			hotelImpl.setModifiedDate(new Date(modifiedDate));
		}

		hotelImpl.setPizza(pizza);
		hotelImpl.setBurger(burger);
		hotelImpl.setDoughnut(Doughnut);
		hotelImpl.setStatus(status);
		hotelImpl.setStatusByUserId(statusByUserId);

		if (statusByUserName == null) {
			hotelImpl.setStatusByUserName("");
		}
		else {
			hotelImpl.setStatusByUserName(statusByUserName);
		}

		if (statusDate == Long.MIN_VALUE) {
			hotelImpl.setStatusDate(null);
		}
		else {
			hotelImpl.setStatusDate(new Date(statusDate));
		}

		hotelImpl.resetOriginalValues();

		return hotelImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		orderId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();

		pizza = objectInput.readInt();

		burger = objectInput.readInt();

		Doughnut = objectInput.readInt();

		status = objectInput.readInt();

		statusByUserId = objectInput.readLong();
		statusByUserName = objectInput.readUTF();
		statusDate = objectInput.readLong();
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

		objectOutput.writeLong(orderId);

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

		objectOutput.writeInt(pizza);

		objectOutput.writeInt(burger);

		objectOutput.writeInt(Doughnut);

		objectOutput.writeInt(status);

		objectOutput.writeLong(statusByUserId);

		if (statusByUserName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(statusByUserName);
		}

		objectOutput.writeLong(statusDate);
	}

	public String uuid;
	public long orderId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public int pizza;
	public int burger;
	public int Doughnut;
	public int status;
	public long statusByUserId;
	public String statusByUserName;
	public long statusDate;
}