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

/**
 * Defines the semistructured communication model within the Jakarta NoSQL
 * Communication API.
 *
 * <p>The semistructured communication model represents interaction with
 * NoSQL databases that manage data with a flexible and hierarchical
 * structure, typically organized as documents or nested fields.</p>
 *
 * <p>This model supports operations on data where structure is not strictly
 * defined by a fixed schema, allowing fields and relationships to vary
 * between records. Interaction is based on accessing and manipulating
 * structured content rather than relying solely on a single key.</p>
 *
 * <p>The model is intentionally minimal and does not define a unified query
 * language or execution semantics. It focuses on representing operations
 * over semistructured data while preserving the native behavior and
 * capabilities of each database.</p>
 *
 * <p>Semistructured databases may provide features such as nested field
 * access, partial updates, indexing, or aggregation. The availability and
 * behavior of these features are determined by the underlying database and
 * may be exposed through provider-specific extensions.</p>
 *
 * <p>This model is part of the Communication API and follows its principles
 * of optional adoption, minimal abstraction, and extensibility. Implementations
 * may extend or adapt this model to support provider-specific capabilities.</p>
 *
 * <p>In summary, the semistructured communication model defines a minimal and
 * extensible foundation for interacting with NoSQL systems that manage
 * hierarchical and flexible data, enabling integration while preserving
 * their native characteristics.</p>
 *
 */
package jakarta.nosql.communication.semistructured;