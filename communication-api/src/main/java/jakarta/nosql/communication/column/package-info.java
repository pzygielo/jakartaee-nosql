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
 * Provides the column-family communication model for Jakarta NoSQL.
 *
 * <p>The column-family communication model represents
 * interaction with NoSQL databases based on sparse and
 * partition-oriented column structures. It focuses on
 * fundamental operations such as storing, retrieving,
 * replacing, and removing records composed of dynamic
 * collections of columns.</p>
 *
 * <p>The APIs defined in this package provide a minimal and
 * extensible communication structure aligned with the native
 * behavior of column-family databases:</p>
 *
 * <pre>{@code
 * ColumnManagerFactory factory = ...
 *
 * ColumnManager manager = factory.get("users");
 *
 * ColumnRecord record = ...
 *
 * manager.put(record);
 *
 * Optional<ColumnRecord> result =
 *         manager.findByKey("user:10");
 *
 * manager.deleteByKey("user:10");
 * }</pre>
 *
 * <p>Column records expose sparse structures using named
 * columns associated with a logical record:</p>
 *
 * <pre>{@code
 * ColumnRecord record = ...
 *
 * String name = record.get("name");
 *
 * List<Column> columns =
 *         record.columns();
 * }</pre>
 *
 * <p>This model intentionally avoids introducing query
 * abstractions, traversal semantics, aggregation models,
 * or relational-style operations beyond column-oriented
 * interaction.</p>
 *
 * <p>The design supports extensibility to accommodate
 * variations across column-family databases, including
 * capabilities such as partitioning, clustering strategies,
 * sparse storage models, distributed replication,
 * batching optimizations, append-oriented persistence,
 * or eventual consistency strategies.</p>
 *
 * <p>This model is part of the Jakarta NoSQL Communication API
 * and follows its principles of optional adoption, minimal
 * abstraction, extensibility, and preservation of native
 * database semantics.</p>
 *
 * <p>In summary, the column-family communication model defines
 * a minimal, low-level, and extensible foundation for
 * interacting with column-family NoSQL systems while
 * preserving their native operational characteristics.</p>
 */
package jakarta.nosql.communication.column;