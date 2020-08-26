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
 * Provides the local service utility for Leave. This utility wraps
 * {@link com.demo.workflow.core.service.impl.LeaveLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see LeaveLocalService
 * @see com.demo.workflow.core.service.base.LeaveLocalServiceBaseImpl
 * @see com.demo.workflow.core.service.impl.LeaveLocalServiceImpl
 * @generated
 */
@ProviderType
public class LeaveLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.demo.workflow.core.service.impl.LeaveLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the leave to the database. Also notifies the appropriate model listeners.
	*
	* @param leave the leave
	* @return the leave that was added
	*/
	public static com.demo.workflow.core.model.Leave addLeave(
		com.demo.workflow.core.model.Leave leave) {
		return getService().addLeave(leave);
	}

	public static com.demo.workflow.core.model.Leave addLeave(
		String leaveName, long userId, long groupId, long companyId,
		java.util.Date leaveStartDate, java.util.Date leaveEndDate) {
		return getService()
				   .addLeave(leaveName, userId, groupId, companyId,
			leaveStartDate, leaveEndDate);
	}

	/**
	* Creates a new leave with the primary key. Does not add the leave to the database.
	*
	* @param leaveId the primary key for the new leave
	* @return the new leave
	*/
	public static com.demo.workflow.core.model.Leave createLeave(long leaveId) {
		return getService().createLeave(leaveId);
	}

	/**
	* Deletes the leave from the database. Also notifies the appropriate model listeners.
	*
	* @param leave the leave
	* @return the leave that was removed
	*/
	public static com.demo.workflow.core.model.Leave deleteLeave(
		com.demo.workflow.core.model.Leave leave) {
		return getService().deleteLeave(leave);
	}

	/**
	* Deletes the leave with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param leaveId the primary key of the leave
	* @return the leave that was removed
	* @throws PortalException if a leave with the primary key could not be found
	*/
	public static com.demo.workflow.core.model.Leave deleteLeave(long leaveId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteLeave(leaveId);
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.demo.workflow.core.model.impl.LeaveModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.demo.workflow.core.model.impl.LeaveModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static com.demo.workflow.core.model.Leave fetchLeave(long leaveId) {
		return getService().fetchLeave(leaveId);
	}

	/**
	* Returns the leave matching the UUID and group.
	*
	* @param uuid the leave's UUID
	* @param groupId the primary key of the group
	* @return the matching leave, or <code>null</code> if a matching leave could not be found
	*/
	public static com.demo.workflow.core.model.Leave fetchLeaveByUuidAndGroupId(
		String uuid, long groupId) {
		return getService().fetchLeaveByUuidAndGroupId(uuid, groupId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return getService().getActionableDynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery getExportActionableDynamicQuery(
		com.liferay.exportimport.kernel.lar.PortletDataContext portletDataContext) {
		return getService().getExportActionableDynamicQuery(portletDataContext);
	}

	public static com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	* Returns the leave with the primary key.
	*
	* @param leaveId the primary key of the leave
	* @return the leave
	* @throws PortalException if a leave with the primary key could not be found
	*/
	public static com.demo.workflow.core.model.Leave getLeave(long leaveId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getLeave(leaveId);
	}

	public static java.util.List<com.demo.workflow.core.model.Leave> getLeaveByUserId(
		long userId) {
		return getService().getLeaveByUserId(userId);
	}

	public static java.util.List<com.demo.workflow.core.model.Leave> getLeaveByUserId(
		long userId, int start, int end) {
		return getService().getLeaveByUserId(userId, start, end);
	}

	/**
	* Returns the leave matching the UUID and group.
	*
	* @param uuid the leave's UUID
	* @param groupId the primary key of the group
	* @return the matching leave
	* @throws PortalException if a matching leave could not be found
	*/
	public static com.demo.workflow.core.model.Leave getLeaveByUuidAndGroupId(
		String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getLeaveByUuidAndGroupId(uuid, groupId);
	}

	public static int getLeaveCount(long userId) {
		return getService().getLeaveCount(userId);
	}

	/**
	* Returns a range of all the leaves.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.demo.workflow.core.model.impl.LeaveModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of leaves
	* @param end the upper bound of the range of leaves (not inclusive)
	* @return the range of leaves
	*/
	public static java.util.List<com.demo.workflow.core.model.Leave> getLeaves(
		int start, int end) {
		return getService().getLeaves(start, end);
	}

	/**
	* Returns all the leaves matching the UUID and company.
	*
	* @param uuid the UUID of the leaves
	* @param companyId the primary key of the company
	* @return the matching leaves, or an empty list if no matches were found
	*/
	public static java.util.List<com.demo.workflow.core.model.Leave> getLeavesByUuidAndCompanyId(
		String uuid, long companyId) {
		return getService().getLeavesByUuidAndCompanyId(uuid, companyId);
	}

	/**
	* Returns a range of leaves matching the UUID and company.
	*
	* @param uuid the UUID of the leaves
	* @param companyId the primary key of the company
	* @param start the lower bound of the range of leaves
	* @param end the upper bound of the range of leaves (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the range of matching leaves, or an empty list if no matches were found
	*/
	public static java.util.List<com.demo.workflow.core.model.Leave> getLeavesByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<com.demo.workflow.core.model.Leave> orderByComparator) {
		return getService()
				   .getLeavesByUuidAndCompanyId(uuid, companyId, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of leaves.
	*
	* @return the number of leaves
	*/
	public static int getLeavesCount() {
		return getService().getLeavesCount();
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
	* Updates the leave in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param leave the leave
	* @return the leave that was updated
	*/
	public static com.demo.workflow.core.model.Leave updateLeave(
		com.demo.workflow.core.model.Leave leave) {
		return getService().updateLeave(leave);
	}

	public static LeaveLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<LeaveLocalService, LeaveLocalService> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(LeaveLocalService.class);

		ServiceTracker<LeaveLocalService, LeaveLocalService> serviceTracker = new ServiceTracker<LeaveLocalService, LeaveLocalService>(bundle.getBundleContext(),
				LeaveLocalService.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}
}