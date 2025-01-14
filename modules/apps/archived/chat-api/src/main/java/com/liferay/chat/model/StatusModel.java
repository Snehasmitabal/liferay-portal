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

package com.liferay.chat.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the Status service. Represents a row in the &quot;Chat_Status&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.liferay.chat.model.impl.StatusModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.liferay.chat.model.impl.StatusImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Status
 * @generated
 */
@ProviderType
public interface StatusModel extends BaseModel<Status> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a status model instance should use the {@link Status} interface instead.
	 */

	/**
	 * Returns the primary key of this status.
	 *
	 * @return the primary key of this status
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this status.
	 *
	 * @param primaryKey the primary key of this status
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the status ID of this status.
	 *
	 * @return the status ID of this status
	 */
	public long getStatusId();

	/**
	 * Sets the status ID of this status.
	 *
	 * @param statusId the status ID of this status
	 */
	public void setStatusId(long statusId);

	/**
	 * Returns the user ID of this status.
	 *
	 * @return the user ID of this status
	 */
	public long getUserId();

	/**
	 * Sets the user ID of this status.
	 *
	 * @param userId the user ID of this status
	 */
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this status.
	 *
	 * @return the user uuid of this status
	 */
	public String getUserUuid();

	/**
	 * Sets the user uuid of this status.
	 *
	 * @param userUuid the user uuid of this status
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Returns the modified date of this status.
	 *
	 * @return the modified date of this status
	 */
	public long getModifiedDate();

	/**
	 * Sets the modified date of this status.
	 *
	 * @param modifiedDate the modified date of this status
	 */
	public void setModifiedDate(long modifiedDate);

	/**
	 * Returns the online of this status.
	 *
	 * @return the online of this status
	 */
	public boolean getOnline();

	/**
	 * Returns <code>true</code> if this status is online.
	 *
	 * @return <code>true</code> if this status is online; <code>false</code> otherwise
	 */
	public boolean isOnline();

	/**
	 * Sets whether this status is online.
	 *
	 * @param online the online of this status
	 */
	public void setOnline(boolean online);

	/**
	 * Returns the awake of this status.
	 *
	 * @return the awake of this status
	 */
	public boolean getAwake();

	/**
	 * Returns <code>true</code> if this status is awake.
	 *
	 * @return <code>true</code> if this status is awake; <code>false</code> otherwise
	 */
	public boolean isAwake();

	/**
	 * Sets whether this status is awake.
	 *
	 * @param awake the awake of this status
	 */
	public void setAwake(boolean awake);

	/**
	 * Returns the active panel IDs of this status.
	 *
	 * @return the active panel IDs of this status
	 */
	@AutoEscape
	public String getActivePanelIds();

	/**
	 * Sets the active panel IDs of this status.
	 *
	 * @param activePanelIds the active panel IDs of this status
	 */
	public void setActivePanelIds(String activePanelIds);

	/**
	 * Returns the message of this status.
	 *
	 * @return the message of this status
	 */
	@AutoEscape
	public String getMessage();

	/**
	 * Sets the message of this status.
	 *
	 * @param message the message of this status
	 */
	public void setMessage(String message);

	/**
	 * Returns the play sound of this status.
	 *
	 * @return the play sound of this status
	 */
	public boolean getPlaySound();

	/**
	 * Returns <code>true</code> if this status is play sound.
	 *
	 * @return <code>true</code> if this status is play sound; <code>false</code> otherwise
	 */
	public boolean isPlaySound();

	/**
	 * Sets whether this status is play sound.
	 *
	 * @param playSound the play sound of this status
	 */
	public void setPlaySound(boolean playSound);

	@Override
	public Status cloneWithOriginalValues();

	public default String toXmlString() {
		return null;
	}

}