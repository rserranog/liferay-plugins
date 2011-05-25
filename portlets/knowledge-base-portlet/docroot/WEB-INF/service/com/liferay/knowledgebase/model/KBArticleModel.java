/**
 * Copyright (c) 2000-2011 Liferay, Inc. All rights reserved.
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

package com.liferay.knowledgebase.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.GroupedModel;
import com.liferay.portal.model.ResourcedModel;
import com.liferay.portal.model.WorkflowedModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the KBArticle service. Represents a row in the &quot;KBArticle&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.knowledgebase.model.impl.KBArticleModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.knowledgebase.model.impl.KBArticleImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see KBArticle
 * @see com.liferay.knowledgebase.model.impl.KBArticleImpl
 * @see com.liferay.knowledgebase.model.impl.KBArticleModelImpl
 * @generated
 */
public interface KBArticleModel extends BaseModel<KBArticle>, GroupedModel,
	ResourcedModel, WorkflowedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a k b article model instance should use the {@link KBArticle} interface instead.
	 */

	/**
	 * Gets the primary key of this k b article.
	 *
	 * @return the primary key of this k b article
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this k b article
	 *
	 * @param primaryKey the primary key of this k b article
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Gets the uuid of this k b article.
	 *
	 * @return the uuid of this k b article
	 */
	@AutoEscape
	public String getUuid();

	/**
	 * Sets the uuid of this k b article.
	 *
	 * @param uuid the uuid of this k b article
	 */
	public void setUuid(String uuid);

	/**
	 * Gets the kb article ID of this k b article.
	 *
	 * @return the kb article ID of this k b article
	 */
	public long getKbArticleId();

	/**
	 * Sets the kb article ID of this k b article.
	 *
	 * @param kbArticleId the kb article ID of this k b article
	 */
	public void setKbArticleId(long kbArticleId);

	/**
	 * Gets the resource prim key of this k b article.
	 *
	 * @return the resource prim key of this k b article
	 */
	public long getResourcePrimKey();

	/**
	 * Sets the resource prim key of this k b article.
	 *
	 * @param resourcePrimKey the resource prim key of this k b article
	 */
	public void setResourcePrimKey(long resourcePrimKey);

	public boolean isResourceMain();

	/**
	 * Gets the group ID of this k b article.
	 *
	 * @return the group ID of this k b article
	 */
	public long getGroupId();

	/**
	 * Sets the group ID of this k b article.
	 *
	 * @param groupId the group ID of this k b article
	 */
	public void setGroupId(long groupId);

	/**
	 * Gets the company ID of this k b article.
	 *
	 * @return the company ID of this k b article
	 */
	public long getCompanyId();

	/**
	 * Sets the company ID of this k b article.
	 *
	 * @param companyId the company ID of this k b article
	 */
	public void setCompanyId(long companyId);

	/**
	 * Gets the user ID of this k b article.
	 *
	 * @return the user ID of this k b article
	 */
	public long getUserId();

	/**
	 * Sets the user ID of this k b article.
	 *
	 * @param userId the user ID of this k b article
	 */
	public void setUserId(long userId);

	/**
	 * Gets the user uuid of this k b article.
	 *
	 * @return the user uuid of this k b article
	 * @throws SystemException if a system exception occurred
	 */
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this k b article.
	 *
	 * @param userUuid the user uuid of this k b article
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Gets the user name of this k b article.
	 *
	 * @return the user name of this k b article
	 */
	@AutoEscape
	public String getUserName();

	/**
	 * Sets the user name of this k b article.
	 *
	 * @param userName the user name of this k b article
	 */
	public void setUserName(String userName);

	/**
	 * Gets the create date of this k b article.
	 *
	 * @return the create date of this k b article
	 */
	public Date getCreateDate();

	/**
	 * Sets the create date of this k b article.
	 *
	 * @param createDate the create date of this k b article
	 */
	public void setCreateDate(Date createDate);

	/**
	 * Gets the modified date of this k b article.
	 *
	 * @return the modified date of this k b article
	 */
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this k b article.
	 *
	 * @param modifiedDate the modified date of this k b article
	 */
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Gets the root resource prim key of this k b article.
	 *
	 * @return the root resource prim key of this k b article
	 */
	public long getRootResourcePrimKey();

	/**
	 * Sets the root resource prim key of this k b article.
	 *
	 * @param rootResourcePrimKey the root resource prim key of this k b article
	 */
	public void setRootResourcePrimKey(long rootResourcePrimKey);

	/**
	 * Gets the parent resource prim key of this k b article.
	 *
	 * @return the parent resource prim key of this k b article
	 */
	public long getParentResourcePrimKey();

	/**
	 * Sets the parent resource prim key of this k b article.
	 *
	 * @param parentResourcePrimKey the parent resource prim key of this k b article
	 */
	public void setParentResourcePrimKey(long parentResourcePrimKey);

	/**
	 * Gets the version of this k b article.
	 *
	 * @return the version of this k b article
	 */
	public int getVersion();

	/**
	 * Sets the version of this k b article.
	 *
	 * @param version the version of this k b article
	 */
	public void setVersion(int version);

	/**
	 * Gets the title of this k b article.
	 *
	 * @return the title of this k b article
	 */
	@AutoEscape
	public String getTitle();

	/**
	 * Sets the title of this k b article.
	 *
	 * @param title the title of this k b article
	 */
	public void setTitle(String title);

	/**
	 * Gets the content of this k b article.
	 *
	 * @return the content of this k b article
	 */
	@AutoEscape
	public String getContent();

	/**
	 * Sets the content of this k b article.
	 *
	 * @param content the content of this k b article
	 */
	public void setContent(String content);

	/**
	 * Gets the description of this k b article.
	 *
	 * @return the description of this k b article
	 */
	@AutoEscape
	public String getDescription();

	/**
	 * Sets the description of this k b article.
	 *
	 * @param description the description of this k b article
	 */
	public void setDescription(String description);

	/**
	 * Gets the kb template ID of this k b article.
	 *
	 * @return the kb template ID of this k b article
	 */
	public long getKbTemplateId();

	/**
	 * Sets the kb template ID of this k b article.
	 *
	 * @param kbTemplateId the kb template ID of this k b article
	 */
	public void setKbTemplateId(long kbTemplateId);

	/**
	 * Gets the priority of this k b article.
	 *
	 * @return the priority of this k b article
	 */
	public double getPriority();

	/**
	 * Sets the priority of this k b article.
	 *
	 * @param priority the priority of this k b article
	 */
	public void setPriority(double priority);

	/**
	 * Gets the sections of this k b article.
	 *
	 * @return the sections of this k b article
	 */
	@AutoEscape
	public String getSections();

	/**
	 * Sets the sections of this k b article.
	 *
	 * @param sections the sections of this k b article
	 */
	public void setSections(String sections);

	/**
	 * Gets the view count of this k b article.
	 *
	 * @return the view count of this k b article
	 */
	public int getViewCount();

	/**
	 * Sets the view count of this k b article.
	 *
	 * @param viewCount the view count of this k b article
	 */
	public void setViewCount(int viewCount);

	/**
	 * Gets the latest of this k b article.
	 *
	 * @return the latest of this k b article
	 */
	public boolean getLatest();

	/**
	 * Determines if this k b article is latest.
	 *
	 * @return <code>true</code> if this k b article is latest; <code>false</code> otherwise
	 */
	public boolean isLatest();

	/**
	 * Sets whether this k b article is latest.
	 *
	 * @param latest the latest of this k b article
	 */
	public void setLatest(boolean latest);

	/**
	 * Gets the main of this k b article.
	 *
	 * @return the main of this k b article
	 */
	public boolean getMain();

	/**
	 * Determines if this k b article is main.
	 *
	 * @return <code>true</code> if this k b article is main; <code>false</code> otherwise
	 */
	public boolean isMain();

	/**
	 * Sets whether this k b article is main.
	 *
	 * @param main the main of this k b article
	 */
	public void setMain(boolean main);

	/**
	 * Gets the status of this k b article.
	 *
	 * @return the status of this k b article
	 */
	public int getStatus();

	/**
	 * Sets the status of this k b article.
	 *
	 * @param status the status of this k b article
	 */
	public void setStatus(int status);

	/**
	 * Gets the status by user ID of this k b article.
	 *
	 * @return the status by user ID of this k b article
	 */
	public long getStatusByUserId();

	/**
	 * Sets the status by user ID of this k b article.
	 *
	 * @param statusByUserId the status by user ID of this k b article
	 */
	public void setStatusByUserId(long statusByUserId);

	/**
	 * Gets the status by user uuid of this k b article.
	 *
	 * @return the status by user uuid of this k b article
	 * @throws SystemException if a system exception occurred
	 */
	public String getStatusByUserUuid() throws SystemException;

	/**
	 * Sets the status by user uuid of this k b article.
	 *
	 * @param statusByUserUuid the status by user uuid of this k b article
	 */
	public void setStatusByUserUuid(String statusByUserUuid);

	/**
	 * Gets the status by user name of this k b article.
	 *
	 * @return the status by user name of this k b article
	 */
	@AutoEscape
	public String getStatusByUserName();

	/**
	 * Sets the status by user name of this k b article.
	 *
	 * @param statusByUserName the status by user name of this k b article
	 */
	public void setStatusByUserName(String statusByUserName);

	/**
	 * Gets the status date of this k b article.
	 *
	 * @return the status date of this k b article
	 */
	public Date getStatusDate();

	/**
	 * Sets the status date of this k b article.
	 *
	 * @param statusDate the status date of this k b article
	 */
	public void setStatusDate(Date statusDate);

	/**
	 * @deprecated {@link #isApproved}
	 */
	public boolean getApproved();

	/**
	 * Determines if this k b article is approved.
	 *
	 * @return <code>true</code> if this k b article is approved; <code>false</code> otherwise
	 */
	public boolean isApproved();

	/**
	 * Determines if this k b article is a draft.
	 *
	 * @return <code>true</code> if this k b article is a draft; <code>false</code> otherwise
	 */
	public boolean isDraft();

	/**
	 * Determines if this k b article is expired.
	 *
	 * @return <code>true</code> if this k b article is expired; <code>false</code> otherwise
	 */
	public boolean isExpired();

	/**
	 * Determines if this k b article is pending.
	 *
	 * @return <code>true</code> if this k b article is pending; <code>false</code> otherwise
	 */
	public boolean isPending();

	public boolean isNew();

	public void setNew(boolean n);

	public boolean isCachedModel();

	public void setCachedModel(boolean cachedModel);

	public boolean isEscapedModel();

	public void setEscapedModel(boolean escapedModel);

	public Serializable getPrimaryKeyObj();

	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	public ExpandoBridge getExpandoBridge();

	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	public Object clone();

	public int compareTo(KBArticle kbArticle);

	public int hashCode();

	public KBArticle toEscapedModel();

	public String toString();

	public String toXmlString();
}