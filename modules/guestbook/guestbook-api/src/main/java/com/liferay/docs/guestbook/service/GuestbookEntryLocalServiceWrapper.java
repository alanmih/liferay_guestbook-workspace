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

package com.liferay.docs.guestbook.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

import org.osgi.annotation.versioning.ProviderType;

/**
 * Provides a wrapper for {@link GuestbookEntryLocalService}.
 *
 * @author Liferay
 * @see GuestbookEntryLocalService
 * @generated
 */
@ProviderType
public class GuestbookEntryLocalServiceWrapper
	implements GuestbookEntryLocalService,
			   ServiceWrapper<GuestbookEntryLocalService> {

	public GuestbookEntryLocalServiceWrapper(
		GuestbookEntryLocalService guestbookEntryLocalService) {

		_guestbookEntryLocalService = guestbookEntryLocalService;
	}

	/**
	 * Adds the guestbookweb entry to the database. Also notifies the appropriate model listeners.
	 *
	 * @param guestbookEntry the guestbookweb entry
	 * @return the guestbookweb entry that was added
	 */
	@Override
	public com.liferay.docs.guestbook.model.GuestbookEntry addGuestbookEntry(
		com.liferay.docs.guestbook.model.GuestbookEntry guestbookEntry) {

		return _guestbookEntryLocalService.addGuestbookEntry(guestbookEntry);
	}

	@Override
	public com.liferay.docs.guestbook.model.GuestbookEntry addGuestbookEntry(
			long userId, long guestbookId, String name, String email,
			String phone, String address, String message,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _guestbookEntryLocalService.addGuestbookEntry(
			userId, guestbookId, name, email, phone, address, message,
			serviceContext);
	}

	/**
	 * Creates a new guestbookweb entry with the primary key. Does not add the guestbookweb entry to the database.
	 *
	 * @param entryId the primary key for the new guestbookweb entry
	 * @return the new guestbookweb entry
	 */
	@Override
	public com.liferay.docs.guestbook.model.GuestbookEntry createGuestbookEntry(
		long entryId) {

		return _guestbookEntryLocalService.createGuestbookEntry(entryId);
	}

	/**
	 * Deletes the guestbookweb entry from the database. Also notifies the appropriate model listeners.
	 *
	 * @param guestbookEntry the guestbookweb entry
	 * @return the guestbookweb entry that was removed
	 * @throws PortalException
	 */
	@Override
	public com.liferay.docs.guestbook.model.GuestbookEntry deleteGuestbookEntry(
			com.liferay.docs.guestbook.model.GuestbookEntry guestbookEntry)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _guestbookEntryLocalService.deleteGuestbookEntry(guestbookEntry);
	}

	/**
	 * Deletes the guestbookweb entry with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param entryId the primary key of the guestbookweb entry
	 * @return the guestbookweb entry that was removed
	 * @throws PortalException if a guestbookweb entry with the primary key could not be found
	 */
	@Override
	public com.liferay.docs.guestbook.model.GuestbookEntry deleteGuestbookEntry(
			long entryId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _guestbookEntryLocalService.deleteGuestbookEntry(entryId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _guestbookEntryLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _guestbookEntryLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _guestbookEntryLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>com.liferay.docs.guestbookweb.model.impl.GuestbookEntryModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _guestbookEntryLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>com.liferay.docs.guestbookweb.model.impl.GuestbookEntryModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _guestbookEntryLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _guestbookEntryLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _guestbookEntryLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.liferay.docs.guestbook.model.GuestbookEntry fetchGuestbookEntry(
		long entryId) {

		return _guestbookEntryLocalService.fetchGuestbookEntry(entryId);
	}

	/**
	 * Returns the guestbookweb entry matching the UUID and group.
	 *
	 * @param uuid the guestbookweb entry's UUID
	 * @param groupId the primary key of the group
	 * @return the matching guestbookweb entry, or <code>null</code> if a matching guestbookweb entry could not be found
	 */
	@Override
	public com.liferay.docs.guestbook.model.GuestbookEntry
		fetchGuestbookEntryByUuidAndGroupId(String uuid, long groupId) {

		return _guestbookEntryLocalService.fetchGuestbookEntryByUuidAndGroupId(
			uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _guestbookEntryLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _guestbookEntryLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	/**
	 * Returns a range of all the guestbookweb entries.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>com.liferay.docs.guestbookweb.model.impl.GuestbookEntryModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of guestbookweb entries
	 * @param end the upper bound of the range of guestbookweb entries (not inclusive)
	 * @return the range of guestbookweb entries
	 */
	@Override
	public java.util.List<com.liferay.docs.guestbook.model.GuestbookEntry>
		getGuestbookEntries(int start, int end) {

		return _guestbookEntryLocalService.getGuestbookEntries(start, end);
	}

	@Override
	public java.util.List<com.liferay.docs.guestbook.model.GuestbookEntry>
		getGuestbookEntries(long groupId, long guestbookId) {

		return _guestbookEntryLocalService.getGuestbookEntries(
			groupId, guestbookId);
	}

	@Override
	public java.util.List<com.liferay.docs.guestbook.model.GuestbookEntry>
			getGuestbookEntries(
				long groupId, long guestbookId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {

		return _guestbookEntryLocalService.getGuestbookEntries(
			groupId, guestbookId, start, end);
	}

	@Override
	public java.util.List<com.liferay.docs.guestbook.model.GuestbookEntry>
		getGuestbookEntries(
			long groupId, long guestbookId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.liferay.docs.guestbook.model.GuestbookEntry> obc) {

		return _guestbookEntryLocalService.getGuestbookEntries(
			groupId, guestbookId, start, end, obc);
	}

	/**
	 * Returns all the guestbookweb entries matching the UUID and company.
	 *
	 * @param uuid the UUID of the guestbookweb entries
	 * @param companyId the primary key of the company
	 * @return the matching guestbookweb entries, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.liferay.docs.guestbook.model.GuestbookEntry>
		getGuestbookEntriesByUuidAndCompanyId(String uuid, long companyId) {

		return _guestbookEntryLocalService.
			getGuestbookEntriesByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of guestbookweb entries matching the UUID and company.
	 *
	 * @param uuid the UUID of the guestbookweb entries
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of guestbookweb entries
	 * @param end the upper bound of the range of guestbookweb entries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching guestbookweb entries, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.liferay.docs.guestbook.model.GuestbookEntry>
		getGuestbookEntriesByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.liferay.docs.guestbook.model.GuestbookEntry>
					orderByComparator) {

		return _guestbookEntryLocalService.
			getGuestbookEntriesByUuidAndCompanyId(
				uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of guestbookweb entries.
	 *
	 * @return the number of guestbookweb entries
	 */
	@Override
	public int getGuestbookEntriesCount() {
		return _guestbookEntryLocalService.getGuestbookEntriesCount();
	}

	@Override
	public int getGuestbookEntriesCount(long groupId, long guestbookId) {
		return _guestbookEntryLocalService.getGuestbookEntriesCount(
			groupId, guestbookId);
	}

	/**
	 * Returns the guestbookweb entry with the primary key.
	 *
	 * @param entryId the primary key of the guestbookweb entry
	 * @return the guestbookweb entry
	 * @throws PortalException if a guestbookweb entry with the primary key could not be found
	 */
	@Override
	public com.liferay.docs.guestbook.model.GuestbookEntry getGuestbookEntry(
			long entryId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _guestbookEntryLocalService.getGuestbookEntry(entryId);
	}

	/**
	 * Returns the guestbookweb entry matching the UUID and group.
	 *
	 * @param uuid the guestbookweb entry's UUID
	 * @param groupId the primary key of the group
	 * @return the matching guestbookweb entry
	 * @throws PortalException if a matching guestbookweb entry could not be found
	 */
	@Override
	public com.liferay.docs.guestbook.model.GuestbookEntry
			getGuestbookEntryByUuidAndGroupId(String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _guestbookEntryLocalService.getGuestbookEntryByUuidAndGroupId(
			uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _guestbookEntryLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _guestbookEntryLocalService.getOSGiServiceIdentifier();
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _guestbookEntryLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the guestbookweb entry in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param guestbookEntry the guestbookweb entry
	 * @return the guestbookweb entry that was updated
	 */
	@Override
	public com.liferay.docs.guestbook.model.GuestbookEntry updateGuestbookEntry(
		com.liferay.docs.guestbook.model.GuestbookEntry guestbookEntry) {

		return _guestbookEntryLocalService.updateGuestbookEntry(guestbookEntry);
	}

	@Override
	public com.liferay.docs.guestbook.model.GuestbookEntry updateGuestbookEntry(
			long userId, long guestbookId, long entryId, String name,
			String email, String phone, String address, String message,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			   com.liferay.portal.kernel.exception.SystemException {

		return _guestbookEntryLocalService.updateGuestbookEntry(
			userId, guestbookId, entryId, name, email, phone, address, message,
			serviceContext);
	}

	@Override
	public GuestbookEntryLocalService getWrappedService() {
		return _guestbookEntryLocalService;
	}

	@Override
	public void setWrappedService(
		GuestbookEntryLocalService guestbookEntryLocalService) {

		_guestbookEntryLocalService = guestbookEntryLocalService;
	}

	private GuestbookEntryLocalService _guestbookEntryLocalService;

}