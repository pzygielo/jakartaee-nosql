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
 * <p>The Communication API is an optional, lower-level API for interacting
 * directly with NoSQL databases. It provides a minimal and flexible contract
 * that enables integration between Jakarta NoSQL and vendor-specific drivers.</p>
 *
 * <p>This API acts as an integration layer between the Mapping API and
 * underlying NoSQL database providers. Implementations may use this layer
 * to standardize communication, or they may integrate directly with the
 * Mapping API without using it.</p>
 *
 * <p>The Communication API is designed to preserve the native behavior and
 * capabilities of each NoSQL database. It does not enforce a unified query
 * language or execution model, allowing different database types such as
 * document, key-value, column-family, and graph systems to be supported
 * without restriction.</p>
 *
 * <p>This package defines a minimal set of abstractions for representing
 * operations and interacting with NoSQL systems. Support for specific
 * features depends on the capabilities of the underlying database.</p>
 *
 * <p>This API is primarily intended for database providers, framework
 * implementers, and integration layers. Application developers are expected
 * to use higher-level APIs, such as the Mapping API.</p>
 *
 * <p>In summary, the Communication API provides an optional and extensible
 * foundation for integrating Jakarta NoSQL with diverse NoSQL systems,
 * while preserving their native characteristics.</p>
 */
package jakarta.nosql.communication;