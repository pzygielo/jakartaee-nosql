/*
 * Copyright (c) 2026 Contributors to the Eclipse Foundation
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * This Source Code may also be made available under the following Secondary
 * Licenses when the conditions for such availability set forth in the Eclipse
 * Public License v. 2.0 are satisfied: GNU General Public License, version 2
 * with the GNU Classpath Exception which is available at
 * https://www.gnu.org/software/classpath/license.html.
 *
 * SPDX-License-Identifier: EPL-2.0 OR GPL-2.0 WITH Classpath-exception-2.0
 */
package jakarta.nosql.communication;

/**
 * Defines the minimal communication contract for managing records within
 * a NoSQL database.
 *
 * <p>A {@code RecordManager} provides basic lifecycle operations for
 * interacting with records, including insertion, update, retrieval,
 * and deletion. This interface represents the common operational
 * foundation shared across NoSQL database models.</p>
 *
 * <p>The Communication API is intentionally minimal and does not define
 * query languages, traversal semantics, aggregation models, or other
 * database-specific capabilities. Specialized communication models may
 * extend this interface to provide additional behaviors according to
 * the characteristics of the underlying database.</p>
 *
 * <p>Implementations are expected to preserve the native behavior and
 * semantics of the target NoSQL database.</p>
 */
public interface RecordManager {
}
