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

import com.demo.workflow.core.exception.NoSuchHotelException;
import com.demo.workflow.core.model.Hotel;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the hotel service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.demo.workflow.core.service.persistence.impl.HotelPersistenceImpl
 * @see HotelUtil
 * @generated
 */
@ProviderType
public interface HotelPersistence extends BasePersistence<Hotel> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link HotelUtil} to access the hotel persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the hotels where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching hotels
	*/
	public java.util.List<Hotel> findByUuid(String uuid);

	/**
	* Returns a range of all the hotels where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link HotelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of hotels
	* @param end the upper bound of the range of hotels (not inclusive)
	* @return the range of matching hotels
	*/
	public java.util.List<Hotel> findByUuid(String uuid, int start, int end);

	/**
	* Returns an ordered range of all the hotels where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link HotelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of hotels
	* @param end the upper bound of the range of hotels (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching hotels
	*/
	public java.util.List<Hotel> findByUuid(String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Hotel> orderByComparator);

	/**
	* Returns an ordered range of all the hotels where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link HotelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of hotels
	* @param end the upper bound of the range of hotels (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching hotels
	*/
	public java.util.List<Hotel> findByUuid(String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Hotel> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first hotel in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching hotel
	* @throws NoSuchHotelException if a matching hotel could not be found
	*/
	public Hotel findByUuid_First(String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Hotel> orderByComparator)
		throws NoSuchHotelException;

	/**
	* Returns the first hotel in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching hotel, or <code>null</code> if a matching hotel could not be found
	*/
	public Hotel fetchByUuid_First(String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Hotel> orderByComparator);

	/**
	* Returns the last hotel in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching hotel
	* @throws NoSuchHotelException if a matching hotel could not be found
	*/
	public Hotel findByUuid_Last(String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Hotel> orderByComparator)
		throws NoSuchHotelException;

	/**
	* Returns the last hotel in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching hotel, or <code>null</code> if a matching hotel could not be found
	*/
	public Hotel fetchByUuid_Last(String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Hotel> orderByComparator);

	/**
	* Returns the hotels before and after the current hotel in the ordered set where uuid = &#63;.
	*
	* @param orderId the primary key of the current hotel
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next hotel
	* @throws NoSuchHotelException if a hotel with the primary key could not be found
	*/
	public Hotel[] findByUuid_PrevAndNext(long orderId, String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Hotel> orderByComparator)
		throws NoSuchHotelException;

	/**
	* Removes all the hotels where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public void removeByUuid(String uuid);

	/**
	* Returns the number of hotels where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching hotels
	*/
	public int countByUuid(String uuid);

	/**
	* Returns the hotel where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchHotelException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching hotel
	* @throws NoSuchHotelException if a matching hotel could not be found
	*/
	public Hotel findByUUID_G(String uuid, long groupId)
		throws NoSuchHotelException;

	/**
	* Returns the hotel where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching hotel, or <code>null</code> if a matching hotel could not be found
	*/
	public Hotel fetchByUUID_G(String uuid, long groupId);

	/**
	* Returns the hotel where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching hotel, or <code>null</code> if a matching hotel could not be found
	*/
	public Hotel fetchByUUID_G(String uuid, long groupId,
		boolean retrieveFromCache);

	/**
	* Removes the hotel where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the hotel that was removed
	*/
	public Hotel removeByUUID_G(String uuid, long groupId)
		throws NoSuchHotelException;

	/**
	* Returns the number of hotels where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching hotels
	*/
	public int countByUUID_G(String uuid, long groupId);

	/**
	* Returns all the hotels where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching hotels
	*/
	public java.util.List<Hotel> findByUuid_C(String uuid, long companyId);

	/**
	* Returns a range of all the hotels where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link HotelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of hotels
	* @param end the upper bound of the range of hotels (not inclusive)
	* @return the range of matching hotels
	*/
	public java.util.List<Hotel> findByUuid_C(String uuid, long companyId,
		int start, int end);

	/**
	* Returns an ordered range of all the hotels where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link HotelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of hotels
	* @param end the upper bound of the range of hotels (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching hotels
	*/
	public java.util.List<Hotel> findByUuid_C(String uuid, long companyId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Hotel> orderByComparator);

	/**
	* Returns an ordered range of all the hotels where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link HotelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of hotels
	* @param end the upper bound of the range of hotels (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching hotels
	*/
	public java.util.List<Hotel> findByUuid_C(String uuid, long companyId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Hotel> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first hotel in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching hotel
	* @throws NoSuchHotelException if a matching hotel could not be found
	*/
	public Hotel findByUuid_C_First(String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Hotel> orderByComparator)
		throws NoSuchHotelException;

	/**
	* Returns the first hotel in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching hotel, or <code>null</code> if a matching hotel could not be found
	*/
	public Hotel fetchByUuid_C_First(String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Hotel> orderByComparator);

	/**
	* Returns the last hotel in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching hotel
	* @throws NoSuchHotelException if a matching hotel could not be found
	*/
	public Hotel findByUuid_C_Last(String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Hotel> orderByComparator)
		throws NoSuchHotelException;

	/**
	* Returns the last hotel in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching hotel, or <code>null</code> if a matching hotel could not be found
	*/
	public Hotel fetchByUuid_C_Last(String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Hotel> orderByComparator);

	/**
	* Returns the hotels before and after the current hotel in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param orderId the primary key of the current hotel
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next hotel
	* @throws NoSuchHotelException if a hotel with the primary key could not be found
	*/
	public Hotel[] findByUuid_C_PrevAndNext(long orderId, String uuid,
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Hotel> orderByComparator)
		throws NoSuchHotelException;

	/**
	* Removes all the hotels where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public void removeByUuid_C(String uuid, long companyId);

	/**
	* Returns the number of hotels where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching hotels
	*/
	public int countByUuid_C(String uuid, long companyId);

	/**
	* Returns all the hotels where userId = &#63;.
	*
	* @param userId the user ID
	* @return the matching hotels
	*/
	public java.util.List<Hotel> findByuserId(long userId);

	/**
	* Returns a range of all the hotels where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link HotelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of hotels
	* @param end the upper bound of the range of hotels (not inclusive)
	* @return the range of matching hotels
	*/
	public java.util.List<Hotel> findByuserId(long userId, int start, int end);

	/**
	* Returns an ordered range of all the hotels where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link HotelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of hotels
	* @param end the upper bound of the range of hotels (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching hotels
	*/
	public java.util.List<Hotel> findByuserId(long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Hotel> orderByComparator);

	/**
	* Returns an ordered range of all the hotels where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link HotelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of hotels
	* @param end the upper bound of the range of hotels (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching hotels
	*/
	public java.util.List<Hotel> findByuserId(long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Hotel> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first hotel in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching hotel
	* @throws NoSuchHotelException if a matching hotel could not be found
	*/
	public Hotel findByuserId_First(long userId,
		com.liferay.portal.kernel.util.OrderByComparator<Hotel> orderByComparator)
		throws NoSuchHotelException;

	/**
	* Returns the first hotel in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching hotel, or <code>null</code> if a matching hotel could not be found
	*/
	public Hotel fetchByuserId_First(long userId,
		com.liferay.portal.kernel.util.OrderByComparator<Hotel> orderByComparator);

	/**
	* Returns the last hotel in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching hotel
	* @throws NoSuchHotelException if a matching hotel could not be found
	*/
	public Hotel findByuserId_Last(long userId,
		com.liferay.portal.kernel.util.OrderByComparator<Hotel> orderByComparator)
		throws NoSuchHotelException;

	/**
	* Returns the last hotel in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching hotel, or <code>null</code> if a matching hotel could not be found
	*/
	public Hotel fetchByuserId_Last(long userId,
		com.liferay.portal.kernel.util.OrderByComparator<Hotel> orderByComparator);

	/**
	* Returns the hotels before and after the current hotel in the ordered set where userId = &#63;.
	*
	* @param orderId the primary key of the current hotel
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next hotel
	* @throws NoSuchHotelException if a hotel with the primary key could not be found
	*/
	public Hotel[] findByuserId_PrevAndNext(long orderId, long userId,
		com.liferay.portal.kernel.util.OrderByComparator<Hotel> orderByComparator)
		throws NoSuchHotelException;

	/**
	* Removes all the hotels where userId = &#63; from the database.
	*
	* @param userId the user ID
	*/
	public void removeByuserId(long userId);

	/**
	* Returns the number of hotels where userId = &#63;.
	*
	* @param userId the user ID
	* @return the number of matching hotels
	*/
	public int countByuserId(long userId);

	/**
	* Returns all the hotels where groupId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param status the status
	* @return the matching hotels
	*/
	public java.util.List<Hotel> findBystatus(long groupId, int status);

	/**
	* Returns a range of all the hotels where groupId = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link HotelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param status the status
	* @param start the lower bound of the range of hotels
	* @param end the upper bound of the range of hotels (not inclusive)
	* @return the range of matching hotels
	*/
	public java.util.List<Hotel> findBystatus(long groupId, int status,
		int start, int end);

	/**
	* Returns an ordered range of all the hotels where groupId = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link HotelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param status the status
	* @param start the lower bound of the range of hotels
	* @param end the upper bound of the range of hotels (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching hotels
	*/
	public java.util.List<Hotel> findBystatus(long groupId, int status,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Hotel> orderByComparator);

	/**
	* Returns an ordered range of all the hotels where groupId = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link HotelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param status the status
	* @param start the lower bound of the range of hotels
	* @param end the upper bound of the range of hotels (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching hotels
	*/
	public java.util.List<Hotel> findBystatus(long groupId, int status,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Hotel> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first hotel in the ordered set where groupId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching hotel
	* @throws NoSuchHotelException if a matching hotel could not be found
	*/
	public Hotel findBystatus_First(long groupId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<Hotel> orderByComparator)
		throws NoSuchHotelException;

	/**
	* Returns the first hotel in the ordered set where groupId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching hotel, or <code>null</code> if a matching hotel could not be found
	*/
	public Hotel fetchBystatus_First(long groupId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<Hotel> orderByComparator);

	/**
	* Returns the last hotel in the ordered set where groupId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching hotel
	* @throws NoSuchHotelException if a matching hotel could not be found
	*/
	public Hotel findBystatus_Last(long groupId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<Hotel> orderByComparator)
		throws NoSuchHotelException;

	/**
	* Returns the last hotel in the ordered set where groupId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching hotel, or <code>null</code> if a matching hotel could not be found
	*/
	public Hotel fetchBystatus_Last(long groupId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<Hotel> orderByComparator);

	/**
	* Returns the hotels before and after the current hotel in the ordered set where groupId = &#63; and status = &#63;.
	*
	* @param orderId the primary key of the current hotel
	* @param groupId the group ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next hotel
	* @throws NoSuchHotelException if a hotel with the primary key could not be found
	*/
	public Hotel[] findBystatus_PrevAndNext(long orderId, long groupId,
		int status,
		com.liferay.portal.kernel.util.OrderByComparator<Hotel> orderByComparator)
		throws NoSuchHotelException;

	/**
	* Removes all the hotels where groupId = &#63; and status = &#63; from the database.
	*
	* @param groupId the group ID
	* @param status the status
	*/
	public void removeBystatus(long groupId, int status);

	/**
	* Returns the number of hotels where groupId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param status the status
	* @return the number of matching hotels
	*/
	public int countBystatus(long groupId, int status);

	/**
	* Caches the hotel in the entity cache if it is enabled.
	*
	* @param hotel the hotel
	*/
	public void cacheResult(Hotel hotel);

	/**
	* Caches the hotels in the entity cache if it is enabled.
	*
	* @param hotels the hotels
	*/
	public void cacheResult(java.util.List<Hotel> hotels);

	/**
	* Creates a new hotel with the primary key. Does not add the hotel to the database.
	*
	* @param orderId the primary key for the new hotel
	* @return the new hotel
	*/
	public Hotel create(long orderId);

	/**
	* Removes the hotel with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param orderId the primary key of the hotel
	* @return the hotel that was removed
	* @throws NoSuchHotelException if a hotel with the primary key could not be found
	*/
	public Hotel remove(long orderId) throws NoSuchHotelException;

	public Hotel updateImpl(Hotel hotel);

	/**
	* Returns the hotel with the primary key or throws a {@link NoSuchHotelException} if it could not be found.
	*
	* @param orderId the primary key of the hotel
	* @return the hotel
	* @throws NoSuchHotelException if a hotel with the primary key could not be found
	*/
	public Hotel findByPrimaryKey(long orderId) throws NoSuchHotelException;

	/**
	* Returns the hotel with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param orderId the primary key of the hotel
	* @return the hotel, or <code>null</code> if a hotel with the primary key could not be found
	*/
	public Hotel fetchByPrimaryKey(long orderId);

	@Override
	public java.util.Map<java.io.Serializable, Hotel> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the hotels.
	*
	* @return the hotels
	*/
	public java.util.List<Hotel> findAll();

	/**
	* Returns a range of all the hotels.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link HotelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of hotels
	* @param end the upper bound of the range of hotels (not inclusive)
	* @return the range of hotels
	*/
	public java.util.List<Hotel> findAll(int start, int end);

	/**
	* Returns an ordered range of all the hotels.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link HotelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of hotels
	* @param end the upper bound of the range of hotels (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of hotels
	*/
	public java.util.List<Hotel> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Hotel> orderByComparator);

	/**
	* Returns an ordered range of all the hotels.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link HotelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of hotels
	* @param end the upper bound of the range of hotels (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of hotels
	*/
	public java.util.List<Hotel> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Hotel> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the hotels from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of hotels.
	*
	* @return the number of hotels
	*/
	public int countAll();

	@Override
	public java.util.Set<String> getBadColumnNames();
}