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
import com.liferay.portal.workflow.kaleo.model.KaleoInstanceToken;
import com.liferay.portal.workflow.kaleo.model.KaleoTask;
import com.liferay.portal.workflow.kaleo.model.KaleoTaskInstanceAssignment;
import com.liferay.portal.workflow.kaleo.model.KaleoTaskInstanceToken;
import com.liferay.portal.workflow.kaleo.service.KaleoInstanceTokenLocalServiceUtil;
import com.liferay.portal.workflow.kaleo.service.KaleoTaskInstanceAssignmentLocalServiceUtil;
import com.liferay.portal.workflow.kaleo.service.KaleoTaskLocalServiceUtil;

/**
 * <a href="KaleoTaskInstanceTokenImpl.java.html"><b><i>View Source</i></b></a>
 *
 * @author Brian Wing Shun Chan
 */
public class KaleoTaskInstanceTokenImpl
	extends KaleoTaskInstanceTokenModelImpl implements KaleoTaskInstanceToken {

	public KaleoTaskInstanceTokenImpl() {
	}

	public KaleoInstanceToken getKaleoInstanceToken()
		throws PortalException, SystemException {

		return KaleoInstanceTokenLocalServiceUtil.getKaleoInstanceToken(
			getKaleoInstanceTokenId());
	}

	public KaleoTask getKaleoTask() throws PortalException, SystemException {
		return KaleoTaskLocalServiceUtil.getKaleoTask(getKaleoTaskId());
	}

	public KaleoTaskInstanceAssignment getKaleoTaskInstanceAssignment()
		throws PortalException, SystemException {

		return KaleoTaskInstanceAssignmentLocalServiceUtil.
			getKaleoTaskInstanceAssignmentByKaleoTaskInstanceTokenId(
				getKaleoTaskInstanceTokenId());
	}

	public boolean isCompleted() {
		if (getCompletionDate() != null) {
			return true;
		}
		else {
			return false;
		}
	}

}