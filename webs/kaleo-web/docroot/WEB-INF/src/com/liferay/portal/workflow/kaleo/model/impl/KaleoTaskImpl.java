/**
 * Copyright (c) 2000-2010 Liferay, Inc. All rights reserved.
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

package com.liferay.portal.workflow.kaleo.model.impl;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.workflow.kaleo.model.KaleoNode;
import com.liferay.portal.workflow.kaleo.model.KaleoTask;
import com.liferay.portal.workflow.kaleo.model.KaleoTaskAssignment;
import com.liferay.portal.workflow.kaleo.service.KaleoNodeLocalServiceUtil;
import com.liferay.portal.workflow.kaleo.service.KaleoTaskAssignmentLocalServiceUtil;

import java.util.List;

/**
 * <a href="KaleoTaskImpl.java.html"><b><i>View Source</i></b></a>
 *
 * @author Brian Wing Shun Chan
 */
public class KaleoTaskImpl extends KaleoTaskModelImpl implements KaleoTask {

	public KaleoTaskImpl() {
	}

	public KaleoTaskAssignment getDefaultKaleoTaskAssignment()
		throws PortalException, SystemException {

		return KaleoTaskAssignmentLocalServiceUtil.
			getDefaultKaleoTaskAssignment(getKaleoTaskId());
	}

	public KaleoNode getKaleoNode() throws PortalException, SystemException {
		return KaleoNodeLocalServiceUtil.getKaleoNode(
			getKaleoNodeId());
	}

	public List<KaleoTaskAssignment> getKaleoTaskAssignments()
		throws SystemException {

		return KaleoTaskAssignmentLocalServiceUtil.getKaleoTaskAssignments(
			getKaleoTaskId());
	}

}