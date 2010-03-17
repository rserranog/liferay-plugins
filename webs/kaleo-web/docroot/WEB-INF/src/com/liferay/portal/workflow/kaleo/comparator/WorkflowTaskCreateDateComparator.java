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

package com.liferay.portal.workflow.kaleo.comparator;

import com.liferay.portal.kernel.workflow.comparator.BaseWorkflowTaskCreateDateComparator;

/**
 * <a href="WorkflowTaskCreateDateComparator.java.html"><b><i>View Source</i>
 * </b></a>
 *
 * @author Shuyang Zhou
 */
public class WorkflowTaskCreateDateComparator
	extends BaseWorkflowTaskCreateDateComparator {

	public static String ORDER_BY_ASC =
		"createDate ASC, kaleoTaskInstanceId ASC";

	public static String ORDER_BY_DESC =
		"createDate DESC, kaleoTaskInstanceId DESC";

	public static String[] ORDER_BY_FIELDS = {
		"createDate", "kaleoTaskInstanceId"
	};

	public WorkflowTaskCreateDateComparator() {
		super();
	}

	public WorkflowTaskCreateDateComparator(boolean asc) {
		super(asc);
	}

	public String getOrderBy() {
		if (isAscending()) {
			return ORDER_BY_ASC;
		}
		else {
			return ORDER_BY_DESC;
		}
	}

	public String[] getOrderByFields() {
		return ORDER_BY_FIELDS;
	}

}