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

package com.liferay.docs.guestbook.service.persistence;

import com.liferay.docs.guestbook.exception.NoSuchGuestbookEntryException;
import com.liferay.docs.guestbook.model.GuestbookEntry;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the guestbookweb entry service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Liferay
 * @see GuestbookEntryUtil
 * @generated
 */
@ProviderType
public interface GuestbookEntryPersistence
	extends BasePersistence<GuestbookEntry> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link GuestbookEntryUtil} to access the guestbookweb entry persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the guestbookweb entries where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching guestbookweb entries
	 */
	public java.util.List<GuestbookEntry> findByUuid(String uuid);

	/**
	 * Returns a range of all the guestbookweb entries where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>GuestbookEntryModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of guestbookweb entries
	 * @param end the upper bound of the range of guestbookweb entries (not inclusive)
	 * @return the range of matching guestbookweb entries
	 */
	public java.util.List<GuestbookEntry> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the guestbookweb entries where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>GuestbookEntryModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of guestbookweb entries
	 * @param end the upper bound of the range of guestbookweb entries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching guestbookweb entries
	 */
	public java.util.List<GuestbookEntry> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<GuestbookEntry>
			orderByComparator);

	/**
	 * Returns an ordered range of all the guestbookweb entries where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>GuestbookEntryModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of guestbookweb entries
	 * @param end the upper bound of the range of guestbookweb entries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching guestbookweb entries
	 */
	public java.util.List<GuestbookEntry> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<GuestbookEntry>
			orderByComparator,
		boolean retrieveFromCache);

	/**
	 * Returns the first guestbookweb entry in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching guestbookweb entry
	 * @throws NoSuchGuestbookEntryException if a matching guestbookweb entry could not be found
	 */
	public GuestbookEntry findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<GuestbookEntry>
				orderByComparator)
		throws NoSuchGuestbookEntryException;

	/**
	 * Returns the first guestbookweb entry in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching guestbookweb entry, or <code>null</code> if a matching guestbookweb entry could not be found
	 */
	public GuestbookEntry fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<GuestbookEntry>
			orderByComparator);

	/**
	 * Returns the last guestbookweb entry in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching guestbookweb entry
	 * @throws NoSuchGuestbookEntryException if a matching guestbookweb entry could not be found
	 */
	public GuestbookEntry findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<GuestbookEntry>
				orderByComparator)
		throws NoSuchGuestbookEntryException;

	/**
	 * Returns the last guestbookweb entry in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching guestbookweb entry, or <code>null</code> if a matching guestbookweb entry could not be found
	 */
	public GuestbookEntry fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<GuestbookEntry>
			orderByComparator);

	/**
	 * Returns the guestbookweb entries before and after the current guestbookweb entry in the ordered set where uuid = &#63;.
	 *
	 * @param entryId the primary key of the current guestbookweb entry
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next guestbookweb entry
	 * @throws NoSuchGuestbookEntryException if a guestbookweb entry with the primary key could not be found
	 */
	public GuestbookEntry[] findByUuid_PrevAndNext(
			long entryId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<GuestbookEntry>
				orderByComparator)
		throws NoSuchGuestbookEntryException;

	/**
	 * Removes all the guestbookweb entries where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of guestbookweb entries where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching guestbookweb entries
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the guestbookweb entry where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchGuestbookEntryException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching guestbookweb entry
	 * @throws NoSuchGuestbookEntryException if a matching guestbookweb entry could not be found
	 */
	public GuestbookEntry findByUUID_G(String uuid, long groupId)
		throws NoSuchGuestbookEntryException;

	/**
	 * Returns the guestbookweb entry where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching guestbookweb entry, or <code>null</code> if a matching guestbookweb entry could not be found
	 */
	public GuestbookEntry fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the guestbookweb entry where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching guestbookweb entry, or <code>null</code> if a matching guestbookweb entry could not be found
	 */
	public GuestbookEntry fetchByUUID_G(
		String uuid, long groupId, boolean retrieveFromCache);

	/**
	 * Removes the guestbookweb entry where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the guestbookweb entry that was removed
	 */
	public GuestbookEntry removeByUUID_G(String uuid, long groupId)
		throws NoSuchGuestbookEntryException;

	/**
	 * Returns the number of guestbookweb entries where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching guestbookweb entries
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the guestbookweb entries where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching guestbookweb entries
	 */
	public java.util.List<GuestbookEntry> findByUuid_C(
		String uuid, long companyId);

	/**
	 * Returns a range of all the guestbookweb entries where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>GuestbookEntryModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of guestbookweb entries
	 * @param end the upper bound of the range of guestbookweb entries (not inclusive)
	 * @return the range of matching guestbookweb entries
	 */
	public java.util.List<GuestbookEntry> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the guestbookweb entries where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>GuestbookEntryModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of guestbookweb entries
	 * @param end the upper bound of the range of guestbookweb entries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching guestbookweb entries
	 */
	public java.util.List<GuestbookEntry> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<GuestbookEntry>
			orderByComparator);

	/**
	 * Returns an ordered range of all the guestbookweb entries where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>GuestbookEntryModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of guestbookweb entries
	 * @param end the upper bound of the range of guestbookweb entries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching guestbookweb entries
	 */
	public java.util.List<GuestbookEntry> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<GuestbookEntry>
			orderByComparator,
		boolean retrieveFromCache);

	/**
	 * Returns the first guestbookweb entry in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching guestbookweb entry
	 * @throws NoSuchGuestbookEntryException if a matching guestbookweb entry could not be found
	 */
	public GuestbookEntry findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<GuestbookEntry>
				orderByComparator)
		throws NoSuchGuestbookEntryException;

	/**
	 * Returns the first guestbookweb entry in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching guestbookweb entry, or <code>null</code> if a matching guestbookweb entry could not be found
	 */
	public GuestbookEntry fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<GuestbookEntry>
			orderByComparator);

	/**
	 * Returns the last guestbookweb entry in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching guestbookweb entry
	 * @throws NoSuchGuestbookEntryException if a matching guestbookweb entry could not be found
	 */
	public GuestbookEntry findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<GuestbookEntry>
				orderByComparator)
		throws NoSuchGuestbookEntryException;

	/**
	 * Returns the last guestbookweb entry in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching guestbookweb entry, or <code>null</code> if a matching guestbookweb entry could not be found
	 */
	public GuestbookEntry fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<GuestbookEntry>
			orderByComparator);

	/**
	 * Returns the guestbookweb entries before and after the current guestbookweb entry in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param entryId the primary key of the current guestbookweb entry
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next guestbookweb entry
	 * @throws NoSuchGuestbookEntryException if a guestbookweb entry with the primary key could not be found
	 */
	public GuestbookEntry[] findByUuid_C_PrevAndNext(
			long entryId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<GuestbookEntry>
				orderByComparator)
		throws NoSuchGuestbookEntryException;

	/**
	 * Removes all the guestbookweb entries where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of guestbookweb entries where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching guestbookweb entries
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns all the guestbookweb entries where groupId = &#63; and guestbookId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param guestbookId the guestbookweb ID
	 * @return the matching guestbookweb entries
	 */
	public java.util.List<GuestbookEntry> findByG_G(
		long groupId, long guestbookId);

	/**
	 * Returns a range of all the guestbookweb entries where groupId = &#63; and guestbookId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>GuestbookEntryModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param guestbookId the guestbookweb ID
	 * @param start the lower bound of the range of guestbookweb entries
	 * @param end the upper bound of the range of guestbookweb entries (not inclusive)
	 * @return the range of matching guestbookweb entries
	 */
	public java.util.List<GuestbookEntry> findByG_G(
		long groupId, long guestbookId, int start, int end);

	/**
	 * Returns an ordered range of all the guestbookweb entries where groupId = &#63; and guestbookId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>GuestbookEntryModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param guestbookId the guestbookweb ID
	 * @param start the lower bound of the range of guestbookweb entries
	 * @param end the upper bound of the range of guestbookweb entries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching guestbookweb entries
	 */
	public java.util.List<GuestbookEntry> findByG_G(
		long groupId, long guestbookId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<GuestbookEntry>
			orderByComparator);

	/**
	 * Returns an ordered range of all the guestbookweb entries where groupId = &#63; and guestbookId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>GuestbookEntryModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param guestbookId the guestbookweb ID
	 * @param start the lower bound of the range of guestbookweb entries
	 * @param end the upper bound of the range of guestbookweb entries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching guestbookweb entries
	 */
	public java.util.List<GuestbookEntry> findByG_G(
		long groupId, long guestbookId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<GuestbookEntry>
			orderByComparator,
		boolean retrieveFromCache);

	/**
	 * Returns the first guestbookweb entry in the ordered set where groupId = &#63; and guestbookId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param guestbookId the guestbookweb ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching guestbookweb entry
	 * @throws NoSuchGuestbookEntryException if a matching guestbookweb entry could not be found
	 */
	public GuestbookEntry findByG_G_First(
			long groupId, long guestbookId,
			com.liferay.portal.kernel.util.OrderByComparator<GuestbookEntry>
				orderByComparator)
		throws NoSuchGuestbookEntryException;

	/**
	 * Returns the first guestbookweb entry in the ordered set where groupId = &#63; and guestbookId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param guestbookId the guestbookweb ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching guestbookweb entry, or <code>null</code> if a matching guestbookweb entry could not be found
	 */
	public GuestbookEntry fetchByG_G_First(
		long groupId, long guestbookId,
		com.liferay.portal.kernel.util.OrderByComparator<GuestbookEntry>
			orderByComparator);

	/**
	 * Returns the last guestbookweb entry in the ordered set where groupId = &#63; and guestbookId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param guestbookId the guestbookweb ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching guestbookweb entry
	 * @throws NoSuchGuestbookEntryException if a matching guestbookweb entry could not be found
	 */
	public GuestbookEntry findByG_G_Last(
			long groupId, long guestbookId,
			com.liferay.portal.kernel.util.OrderByComparator<GuestbookEntry>
				orderByComparator)
		throws NoSuchGuestbookEntryException;

	/**
	 * Returns the last guestbookweb entry in the ordered set where groupId = &#63; and guestbookId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param guestbookId the guestbookweb ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching guestbookweb entry, or <code>null</code> if a matching guestbookweb entry could not be found
	 */
	public GuestbookEntry fetchByG_G_Last(
		long groupId, long guestbookId,
		com.liferay.portal.kernel.util.OrderByComparator<GuestbookEntry>
			orderByComparator);

	/**
	 * Returns the guestbookweb entries before and after the current guestbookweb entry in the ordered set where groupId = &#63; and guestbookId = &#63;.
	 *
	 * @param entryId the primary key of the current guestbookweb entry
	 * @param groupId the group ID
	 * @param guestbookId the guestbookweb ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next guestbookweb entry
	 * @throws NoSuchGuestbookEntryException if a guestbookweb entry with the primary key could not be found
	 */
	public GuestbookEntry[] findByG_G_PrevAndNext(
			long entryId, long groupId, long guestbookId,
			com.liferay.portal.kernel.util.OrderByComparator<GuestbookEntry>
				orderByComparator)
		throws NoSuchGuestbookEntryException;

	/**
	 * Removes all the guestbookweb entries where groupId = &#63; and guestbookId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param guestbookId the guestbookweb ID
	 */
	public void removeByG_G(long groupId, long guestbookId);

	/**
	 * Returns the number of guestbookweb entries where groupId = &#63; and guestbookId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param guestbookId the guestbookweb ID
	 * @return the number of matching guestbookweb entries
	 */
	public int countByG_G(long groupId, long guestbookId);

	/**
	 * Caches the guestbookweb entry in the entity cache if it is enabled.
	 *
	 * @param guestbookEntry the guestbookweb entry
	 */
	public void cacheResult(GuestbookEntry guestbookEntry);

	/**
	 * Caches the guestbookweb entries in the entity cache if it is enabled.
	 *
	 * @param guestbookEntries the guestbookweb entries
	 */
	public void cacheResult(java.util.List<GuestbookEntry> guestbookEntries);

	/**
	 * Creates a new guestbookweb entry with the primary key. Does not add the guestbookweb entry to the database.
	 *
	 * @param entryId the primary key for the new guestbookweb entry
	 * @return the new guestbookweb entry
	 */
	public GuestbookEntry create(long entryId);

	/**
	 * Removes the guestbookweb entry with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param entryId the primary key of the guestbookweb entry
	 * @return the guestbookweb entry that was removed
	 * @throws NoSuchGuestbookEntryException if a guestbookweb entry with the primary key could not be found
	 */
	public GuestbookEntry remove(long entryId)
		throws NoSuchGuestbookEntryException;

	public GuestbookEntry updateImpl(GuestbookEntry guestbookEntry);

	/**
	 * Returns the guestbookweb entry with the primary key or throws a <code>NoSuchGuestbookEntryException</code> if it could not be found.
	 *
	 * @param entryId the primary key of the guestbookweb entry
	 * @return the guestbookweb entry
	 * @throws NoSuchGuestbookEntryException if a guestbookweb entry with the primary key could not be found
	 */
	public GuestbookEntry findByPrimaryKey(long entryId)
		throws NoSuchGuestbookEntryException;

	/**
	 * Returns the guestbookweb entry with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param entryId the primary key of the guestbookweb entry
	 * @return the guestbookweb entry, or <code>null</code> if a guestbookweb entry with the primary key could not be found
	 */
	public GuestbookEntry fetchByPrimaryKey(long entryId);

	/**
	 * Returns all the guestbookweb entries.
	 *
	 * @return the guestbookweb entries
	 */
	public java.util.List<GuestbookEntry> findAll();

	/**
	 * Returns a range of all the guestbookweb entries.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>GuestbookEntryModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of guestbookweb entries
	 * @param end the upper bound of the range of guestbookweb entries (not inclusive)
	 * @return the range of guestbookweb entries
	 */
	public java.util.List<GuestbookEntry> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the guestbookweb entries.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>GuestbookEntryModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of guestbookweb entries
	 * @param end the upper bound of the range of guestbookweb entries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of guestbookweb entries
	 */
	public java.util.List<GuestbookEntry> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<GuestbookEntry>
			orderByComparator);

	/**
	 * Returns an ordered range of all the guestbookweb entries.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>GuestbookEntryModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of guestbookweb entries
	 * @param end the upper bound of the range of guestbookweb entries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of guestbookweb entries
	 */
	public java.util.List<GuestbookEntry> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<GuestbookEntry>
			orderByComparator,
		boolean retrieveFromCache);

	/**
	 * Removes all the guestbookweb entries from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of guestbookweb entries.
	 *
	 * @return the number of guestbookweb entries
	 */
	public int countAll();

}