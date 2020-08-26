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

package com.demo.workflow.core.service;

import aQute.bnd.annotation.ProviderType;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for Hotel. This utility wraps
 * {@link com.demo.workflow.core.service.impl.HotelLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see HotelLocalService
 * @see com.demo.workflow.core.service.base.HotelLocalServiceBaseImpl
 * @see com.demo.workflow.core.service.impl.HotelLocalServiceImpl
 * @generated
 */
@ProviderType
public class HotelLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.demo.workflow.core.service.impl.HotelLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the hotel to the database. Also notifies the appropriate model listeners.
	*
	* @param hotel the hotel
	* @return the hotel that was added
	*/
	public static com.demo.workflow.core.model.Hotel addHotel(
		com.demo.workflow.core.model.Hotel hotel) {
		return getService().addHotel(hotel);
	}

	public static com.demo.workflow.core.model.Hotel addItemsInList(
		long userId, int pizzaConut, int burgerCount, int DoughnutCount) {
		return getService()
				   .addItemsInList(userId, pizzaConut, burgerCount,
			DoughnutCount);
	}

	public static com.demo.workflow.core.model.Hotel addItemsInList(
		com.liferay.portal.kernel.service.ServiceContext serviceContext,
		int pizzaConut, int burgerCount, int DoughnutCount) {
		return getService()
				   .addItemsInList(serviceContext, pizzaConut, burgerCount,
			DoughnutCount);
	}

	/**
	* Creates a new hotel with the primary key. Does not add the hotel to the database.
	*
	* @param orderId the primary key for the new hotel
	* @return the new hotel
	*/
	public static com.demo.workflow.core.model.Hotel createHotel(long orderId) {
		return getService().createHotel(orderId);
	}

	/**
	* Deletes the hotel from the database. Also notifies the appropriate model listeners.
	*
	* @param hotel the hotel
	* @return the hotel that was removed
	*/
	public static com.demo.workflow.core.model.Hotel deleteHotel(
		com.demo.workflow.core.model.Hotel hotel) {
		return getService().deleteHotel(hotel);
	}

	/**
	* Deletes the hotel with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param orderId the primary key of the hotel
	* @return the hotel that was removed
	* @throws PortalException if a hotel with the primary key could not be found
	*/
	public static com.demo.workflow.core.model.Hotel deleteHotel(long orderId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteHotel(orderId);
	}

	/**
	* @throws PortalException
	*/
	public static com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deletePersistedModel(persistedModel);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.demo.workflow.core.model.impl.HotelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.demo.workflow.core.model.impl.HotelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static com.demo.workflow.core.model.Hotel fetchHotel(long orderId) {
		return getService().fetchHotel(orderId);
	}

	/**
	* Returns the hotel matching the UUID and group.
	*
	* @param uuid the hotel's UUID
	* @param groupId the primary key of the group
	* @return the matching hotel, or <code>null</code> if a matching hotel could not be found
	*/
	public static com.demo.workflow.core.model.Hotel fetchHotelByUuidAndGroupId(
		String uuid, long groupId) {
		return getService().fetchHotelByUuidAndGroupId(uuid, groupId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return getService().getActionableDynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery getExportActionableDynamicQuery(
		com.liferay.exportimport.kernel.lar.PortletDataContext portletDataContext) {
		return getService().getExportActionableDynamicQuery(portletDataContext);
	}

	/**
	* Returns the hotel with the primary key.
	*
	* @param orderId the primary key of the hotel
	* @return the hotel
	* @throws PortalException if a hotel with the primary key could not be found
	*/
	public static com.demo.workflow.core.model.Hotel getHotel(long orderId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getHotel(orderId);
	}

	/**
	* Returns the hotel matching the UUID and group.
	*
	* @param uuid the hotel's UUID
	* @param groupId the primary key of the group
	* @return the matching hotel
	* @throws PortalException if a matching hotel could not be found
	*/
	public static com.demo.workflow.core.model.Hotel getHotelByUuidAndGroupId(
		String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getHotelByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Returns a range of all the hotels.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.demo.workflow.core.model.impl.HotelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of hotels
	* @param end the upper bound of the range of hotels (not inclusive)
	* @return the range of hotels
	*/
	public static java.util.List<com.demo.workflow.core.model.Hotel> getHotels(
		int start, int end) {
		return getService().getHotels(start, end);
	}

	/**
	* Returns all the hotels matching the UUID and company.
	*
	* @param uuid the UUID of the hotels
	* @param companyId the primary key of the company
	* @return the matching hotels, or an empty list if no matches were found
	*/
	public static java.util.List<com.demo.workflow.core.model.Hotel> getHotelsByUuidAndCompanyId(
		String uuid, long companyId) {
		return getService().getHotelsByUuidAndCompanyId(uuid, companyId);
	}

	/**
	* Returns a range of hotels matching the UUID and company.
	*
	* @param uuid the UUID of the hotels
	* @param companyId the primary key of the company
	* @param start the lower bound of the range of hotels
	* @param end the upper bound of the range of hotels (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the range of matching hotels, or an empty list if no matches were found
	*/
	public static java.util.List<com.demo.workflow.core.model.Hotel> getHotelsByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<com.demo.workflow.core.model.Hotel> orderByComparator) {
		return getService()
				   .getHotelsByUuidAndCompanyId(uuid, companyId, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of hotels.
	*
	* @return the number of hotels
	*/
	public static int getHotelsCount() {
		return getService().getHotelsCount();
	}

	public static com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return getService().getIndexableActionableDynamicQuery();
	}

	public static java.util.List<com.demo.workflow.core.model.Hotel> getItemsByStatus(
		long groupId, int status) {
		return getService().getItemsByStatus(groupId, status);
	}

	public static java.util.List<com.demo.workflow.core.model.Hotel> getItemsByStatus(
		long groupId, int status, int start, int end) {
		return getService().getItemsByStatus(groupId, status, start, end);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Updates the hotel in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param hotel the hotel
	* @return the hotel that was updated
	*/
	public static com.demo.workflow.core.model.Hotel updateHotel(
		com.demo.workflow.core.model.Hotel hotel) {
		return getService().updateHotel(hotel);
	}

	public static com.demo.workflow.core.model.Hotel updateStatus(long userId,
		long orderId, int status,
		com.liferay.portal.kernel.service.ServiceContext serviceContext) {
		return getService().updateStatus(userId, orderId, status, serviceContext);
	}

	public static HotelLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<HotelLocalService, HotelLocalService> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(HotelLocalService.class);

		ServiceTracker<HotelLocalService, HotelLocalService> serviceTracker = new ServiceTracker<HotelLocalService, HotelLocalService>(bundle.getBundleContext(),
				HotelLocalService.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}
}