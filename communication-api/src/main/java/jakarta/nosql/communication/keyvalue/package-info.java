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
 *
 * <p>The key-value communication model represents interaction with NoSQL
 * databases based on the association of a unique key to a value. It focuses
 * on fundamental operations such as storing, retrieving, and removing data
 * using a key as the primary access mechanism.</p>
 *
 * <p>This model is intentionally minimal and reflects the intrinsic
 * characteristics of key-value systems. It does not introduce query
 * capabilities or access patterns beyond key-based interaction.</p>
 *
 * <p>The design supports extensibility to accommodate variations across
 * key-value databases, including features such as expiration, atomic
 * operations, or distributed consistency. The availability and behavior of
 * these features are determined by the underlying database.</p>
 *
 * <p>This model is part of the Communication API and follows its principles
 * of optional adoption, minimal abstraction, and preservation of native
 * database behavior. Implementations may extend or adapt this model to
 * support provider-specific capabilities.</p>
 *
 * <p>In summary, the key-value communication model defines a minimal and
 * extensible foundation for interacting with key-value NoSQL systems,
 * preserving their simplicity while enabling integration within Jakarta
 * NoSQL.</p>
 */
package jakarta.nosql.communication.keyvalue;