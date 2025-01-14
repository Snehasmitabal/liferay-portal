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

package com.liferay.portal.kernel.audit;

import com.liferay.portal.kernel.util.ServiceProxyFactory;

/**
 * @author Michael C. Han
 * @author Raymond Augé
 */
public class AuditRouterUtil {

	public static AuditRouter getAuditRouter() {
		return _auditRouter;
	}

	public static boolean isDeployed() {
		return _auditRouter.isDeployed();
	}

	public static void route(AuditMessage auditMessage) throws AuditException {
		_auditRouter.route(auditMessage);
	}

	private static volatile AuditRouter _auditRouter =
		ServiceProxyFactory.newServiceTrackedInstance(
			AuditRouter.class, AuditRouterUtil.class, "_auditRouter", false);

}