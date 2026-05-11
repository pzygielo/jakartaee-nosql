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
 * Provides the document communication model for Jakarta NoSQL.
 *
 * <p>The document communication model represents interaction
 * with NoSQL databases based on hierarchical and nested
 * document structures. It focuses on fundamental operations
 * such as storing, retrieving, replacing, and removing
 * records represented as collections of document elements.</p>
 *
 * <p>The APIs defined in this package provide a minimal and
 * extensible communication structure aligned with the native
 * behavior of document databases:</p>
 *
 * <pre>{@code
 * DocumentManagerFactory factory = ...
 *
 * DocumentManager manager = factory.get("users");
 *
 * DocumentRecord record = ...
 *
 * manager.put(record);
 *
 * Optional<DocumentRecord> result =
 *         manager.findByKey("user:10");
 *
 * manager.deleteByKey("user:10");
 * }</pre>
 *
 * <p>Document records expose hierarchical structures using
 * named document elements:</p>
 *
 * <pre>{@code
 * DocumentRecord record = ...
 *
 * String name = record.get("name");
 *
 * List<Document> documents =
 *         record.documents();
 * }</pre>
 *
 * <p>This model intentionally avoids introducing query
 * abstractions, traversal semantics, aggregation models,
 * or relational-style operations beyond document-based
 * interaction.</p>
 *
 * <p>The design supports extensibility to accommodate
 * variations across document databases, including capabilities
 * such as nested structures, schema flexibility,
 * provider-specific serialization strategies, distributed
 * replication, batching optimizations, or eventual
 * consistency models.</p>
 *
 * <p>This model is part of the Jakarta NoSQL Communication API
 * and follows its principles of optional adoption, minimal
 * abstraction, extensibility, and preservation of native
 * database semantics.</p>
 *
 * <p>In summary, the document communication model defines a
 * minimal, low-level, and extensible foundation for
 * interacting with document-oriented NoSQL systems while
 * preserving their native operational characteristics.</p>
 */
package jakarta.nosql.communication.document;