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

package com.demo.workflow.core.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.demo.workflow.core.exception.NoSuchLeaveException;
import com.demo.workflow.core.model.Leave;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the leave service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.demo.workflow.core.service.persistence.impl.LeavePersistenceImpl
 * @see LeaveUtil
 * @generated
 */
@ProviderType
public interface LeavePersistence extends BasePersistence<Leave> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link LeaveUtil} to access the leave persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the leaves where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching leaves
	*/
	public java.util.List<Leave> findByUuid(String uuid);

	/**
	* Returns a range of all the leaves where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LeaveModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of leaves
	* @param end the upper bound of the range of leaves (not inclusive)
	* @return the range of matching leaves
	*/
	public java.util.List<Leave> findByUuid(String uuid, int start, int end);

	/**
	* Returns an ordered range of all the leaves where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LeaveModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of leaves
	* @param end the upper bound of the range of leaves (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching leaves
	*/
	public java.util.List<Leave> findByUuid(String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Leave> orderByComparator);

	/**
	* Returns an ordered range of all the leaves where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LeaveModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of leaves
	* @param end the upper bound of the range of leaves (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching leaves
	*/
	public java.util.List<Leave> findByUuid(String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Leave> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first leave in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching leave
	* @throws NoSuchLeaveException if a matching leave could not be found
	*/
	public Leave findByUuid_First(String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Leave> orderByComparator)
		throws NoSuchLeaveException;

	/**
	* Returns the first leave in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching leave, or <code>null</code> if a matching leave could not be found
	*/
	public Leave fetchByUuid_First(String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Leave> orderByComparator);

	/**
	* Returns the last leave in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching leave
	* @throws NoSuchLeaveException if a matching leave could not be found
	*/
	public Leave findByUuid_Last(String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Leave> orderByComparator)
		throws NoSuchLeaveException;

	/**
	* Returns the last leave in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching leave, or <code>null</code> if a matching leave could not be found
	*/
	public Leave fetchByUuid_Last(String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Leave> orderByComparator);

	/**
	* Returns the leaves before and after the current leave in the ordered set where uuid = &#63;.
	*
	* @param leaveId the primary key of the current leave
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next leave
	* @throws NoSuchLeaveException if a leave with the primary key could not be found
	*/
	public Leave[] findByUuid_PrevAndNext(long leaveId, String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Leave> orderByComparator)
		throws NoSuchLeaveException;

	/**
	* Removes all the leaves where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public void removeByUuid(String uuid);

	/**
	* Returns the number of leaves where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching leaves
	*/
	public int countByUuid(String uuid);

	/**
	* Returns the leave where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchLeaveException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching leave
	* @throws NoSuchLeaveException if a matching leave could not be found
	*/
	public Leave findByUUID_G(String uuid, long groupId)
		throws NoSuchLeaveException;

	/**
	* Returns the leave where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching leave, or <code>null</code> if a matching leave could not be found
	*/
	public Leave fetchByUUID_G(String uuid, long groupId);

	/**
	* Returns the leave where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching leave, or <code>null</code> if a matching leave could not be found
	*/
	public Leave fetchByUUID_G(String uuid, long groupId,
		boolean retrieveFromCache);

	/**
	* Removes the leave where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the leave that was removed
	*/
	public Leave removeByUUID_G(String uuid, long groupId)
		throws NoSuchLeaveException;

	/**
	* Returns the number of leaves where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching leaves
	*/
	public int countByUUID_G(String uuid, long groupId);

	/**
	* Returns all the leaves where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching leaves
	*/
	public java.util.List<Leave> findByUuid_C(String uuid, long companyId);

	/**
	* Returns a range of all the leaves where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LeaveModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of leaves
	* @param end the upper bound of the range of leaves (not inclusive)
	* @return the range of matching leaves
	*/
	public java.util.List<Leave> findByUuid_C(String uuid, long companyId,
		int start, int end);

	/**
	* Returns an ordered range of all the leaves where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LeaveModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of leaves
	* @param end the upper bound of the range of leaves (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching leaves
	*/
	public java.util.List<Leave> findByUuid_C(String uuid, long companyId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Leave> orderByComparator);

	/**
	* Returns an ordered range of all the leaves where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LeaveModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of leaves
	* @param end the upper bound of the range of leaves (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching leaves
	*/
	public java.util.List<Leave> findByUuid_C(String uuid, long companyId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Leave> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first leave in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching leave
	* @throws NoSuchLeaveException if a matching leave could not be found
	*/
	public Leave findByUuid_C_First(String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Leave> orderByComparator)
		throws NoSuchLeaveException;

	/**
	* Returns the first leave in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching leave, or <code>null</code> if a matching leave could not be found
	*/
	public Leave fetchByUuid_C_First(String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Leave> orderByComparator);

	/**
	* Returns the last leave in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching leave
	* @throws NoSuchLeaveException if a matching leave could not be found
	*/
	public Leave findByUuid_C_Last(String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Leave> orderByComparator)
		throws NoSuchLeaveException;

	/**
	* Returns the last leave in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching leave, or <code>null</code> if a matching leave could not be found
	*/
	public Leave fetchByUuid_C_Last(String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Leave> orderByComparator);

	/**
	* Returns the leaves before and after the current leave in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param leaveId the primary key of the current leave
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next leave
	* @throws NoSuchLeaveException if a leave with the primary key could not be found
	*/
	public Leave[] findByUuid_C_PrevAndNext(long leaveId, String uuid,
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Leave> orderByComparator)
		throws NoSuchLeaveException;

	/**
	* Removes all the leaves where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public void removeByUuid_C(String uuid, long companyId);

	/**
	* Returns the number of leaves where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching leaves
	*/
	public int countByUuid_C(String uuid, long companyId);

	/**
	* Returns all the leaves where userId = &#63;.
	*
	* @param userId the user ID
	* @return the matching leaves
	*/
	public java.util.List<Leave> findByuserId(long userId);

	/**
	* Returns a range of all the leaves where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LeaveModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of leaves
	* @param end the upper bound of the range of leaves (not inclusive)
	* @return the range of matching leaves
	*/
	public java.util.List<Leave> findByuserId(long userId, int start, int end);

	/**
	* Returns an ordered range of all the leaves where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LeaveModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of leaves
	* @param end the upper bound of the range of leaves (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching leaves
	*/
	public java.util.List<Leave> findByuserId(long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Leave> orderByComparator);

	/**
	* Returns an ordered range of all the leaves where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LeaveModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of leaves
	* @param end the upper bound of the range of leaves (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching leaves
	*/
	public java.util.List<Leave> findByuserId(long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Leave> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first leave in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching leave
	* @throws NoSuchLeaveException if a matching leave could not be found
	*/
	public Leave findByuserId_First(long userId,
		com.liferay.portal.kernel.util.OrderByComparator<Leave> orderByComparator)
		throws NoSuchLeaveException;

	/**
	* Returns the first leave in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching leave, or <code>null</code> if a matching leave could not be found
	*/
	public Leave fetchByuserId_First(long userId,
		com.liferay.portal.kernel.util.OrderByComparator<Leave> orderByComparator);

	/**
	* Returns the last leave in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching leave
	* @throws NoSuchLeaveException if a matching leave could not be found
	*/
	public Leave findByuserId_Last(long userId,
		com.liferay.portal.kernel.util.OrderByComparator<Leave> orderByComparator)
		throws NoSuchLeaveException;

	/**
	* Returns the last leave in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching leave, or <code>null</code> if a matching leave could not be found
	*/
	public Leave fetchByuserId_Last(long userId,
		com.liferay.portal.kernel.util.OrderByComparator<Leave> orderByComparator);

	/**
	* Returns the leaves before and after the current leave in the ordered set where userId = &#63;.
	*
	* @param leaveId the primary key of the current leave
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next leave
	* @throws NoSuchLeaveException if a leave with the primary key could not be found
	*/
	public Leave[] findByuserId_PrevAndNext(long leaveId, long userId,
		com.liferay.portal.kernel.util.OrderByComparator<Leave> orderByComparator)
		throws NoSuchLeaveException;

	/**
	* Removes all the leaves where userId = &#63; from the database.
	*
	* @param userId the user ID
	*/
	public void removeByuserId(long userId);

	/**
	* Returns the number of leaves where userId = &#63;.
	*
	* @param userId the user ID
	* @return the number of matching leaves
	*/
	public int countByuserId(long userId);

	/**
	* Caches the leave in the entity cache if it is enabled.
	*
	* @param leave the leave
	*/
	public void cacheResult(Leave leave);

	/**
	* Caches the leaves in the entity cache if it is enabled.
	*
	* @param leaves the leaves
	*/
	public void cacheResult(java.util.List<Leave> leaves);

	/**
	* Creates a new leave with the primary key. Does not add the leave to the database.
	*
	* @param leaveId the primary key for the new leave
	* @return the new leave
	*/
	public Leave create(long leaveId);

	/**
	* Removes the leave with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param leaveId the primary key of the leave
	* @return the leave that was removed
	* @throws NoSuchLeaveException if a leave with the primary key could not be found
	*/
	public Leave remove(long leaveId) throws NoSuchLeaveException;

	public Leave updateImpl(Leave leave);

	/**
	* Returns the leave with the primary key or throws a {@link NoSuchLeaveException} if it could not be found.
	*
	* @param leaveId the primary key of the leave
	* @return the leave
	* @throws NoSuchLeaveException if a leave with the primary key could not be found
	*/
	public Leave findByPrimaryKey(long leaveId) throws NoSuchLeaveException;

	/**
	* Returns the leave with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param leaveId the primary key of the leave
	* @return the leave, or <code>null</code> if a leave with the primary key could not be found
	*/
	public Leave fetchByPrimaryKey(long leaveId);

	@Override
	public java.util.Map<java.io.Serializable, Leave> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the leaves.
	*
	* @return the leaves
	*/
	public java.util.List<Leave> findAll();

	/**
	* Returns a range of all the leaves.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LeaveModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of leaves
	* @param end the upper bound of the range of leaves (not inclusive)
	* @return the range of leaves
	*/
	public java.util.List<Leave> findAll(int start, int end);

	/**
	* Returns an ordered range of all the leaves.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LeaveModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of leaves
	* @param end the upper bound of the range of leaves (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of leaves
	*/
	public java.util.List<Leave> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Leave> orderByComparator);

	/**
	* Returns an ordered range of all the leaves.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LeaveModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of leaves
	* @param end the upper bound of the range of leaves (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of leaves
	*/
	public java.util.List<Leave> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Leave> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the leaves from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of leaves.
	*
	* @return the number of leaves
	*/
	public int countAll();

	@Override
	public java.util.Set<String> getBadColumnNames();
}