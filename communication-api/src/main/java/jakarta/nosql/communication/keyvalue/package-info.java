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
 * Provides the key-value communication model for Jakarta NoSQL.
 *
 * <p>The key-value communication model represents interaction
 * with NoSQL databases based on the association of a unique
 * key to a value. It focuses on fundamental operations such
 * as storing, retrieving, replacing, and removing data using
 * a key as the primary access mechanism.</p>
 *
 *
 *
 * <pre>{@code
 * BucketManagerFactory factory = ...
 *
 * BucketManager manager = factory.get("users");
 * }</pre>
 *
 * <p>Records are represented using a key and a value structure:</p>
 *
 * <pre>{@code
 * KeyValueRecord record = ...
 *
 * String key = record.key();
 * String value = record.value();
 * }</pre>
 *
 * <p>The manager provides the basic lifecycle operations for
 * interacting with key-value systems:</p>
 *
 * <pre>{@code
 * manager.put(record);
 *
 * Optional<KeyValueRecord> result =
 *         manager.findByKey("user:10");
 *
 * manager.deleteByKey("user:10");
 * }</pre>
 *
 * <p>This model defines a minimal and extensible communication
 * structure aligned with the native behavior of key-value
 * databases. It intentionally avoids introducing query
 * abstractions, traversal semantics, aggregation models,
 * or relational-style operations beyond key-based access.</p>
 *
 * <p>The design supports extensibility to accommodate
 * variations across key-value databases, including capabilities
 * such as expiration policies, atomic operations, distributed
 * consistency strategies, replication models, batching
 * optimizations, or provider-specific behaviors.</p>
 *
 * <p>Provider-specific APIs may extend this model to expose
 * additional capabilities:</p>
 *
 * <pre>{@code
 * public interface RedisBucketManager extends BucketManager {
 *
 *     void increment(String key);
 * }
 * }</pre>
 *
 * <p>This model is part of the Jakarta NoSQL Communication API
 * and follows its principles of optional adoption, minimal
 * abstraction, extensibility, and preservation of native
 * database semantics.</p>
 *
 * <p>In summary, the key-value communication model defines a
 * minimal, low-level, and extensible foundation for
 * interacting with key-value NoSQL systems while preserving
 * their native operational characteristics.</p>
 */
package jakarta.nosql.communication.keyvalue;