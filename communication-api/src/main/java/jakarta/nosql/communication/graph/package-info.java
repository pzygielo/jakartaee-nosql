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
 * Provides the graph communication model for Jakarta NoSQL.
 *
 * <p>The graph communication model represents interaction
 * with graph-oriented NoSQL databases based on connected
 * structures composed of vertices, edges, and properties.</p>
 *
 * <p>The APIs defined in this package provide a minimal and
 * extensible communication structure aligned with the native
 * behavior of graph databases:</p>
 *
 * <pre>{@code
 * GraphManagerFactory factory = ...
 *
 * GraphManager manager = factory.get("social");
 *
 * Vertex vertex = ...
 *
 * manager.put(vertex);
 *
 * Optional<Vertex> result = manager.findVertexById("user:10");
 * manager.deleteVertexById("user:10");
 * }</pre>
 *
 * <p>Edges represent relationships between vertices according
 * to the semantics of the underlying database implementation:</p>
 *
 * <pre>{@code
 * Edge edge = ...
 *
 * String type = edge.type();
 *
 * String source = edge.source();
 *
 * String target = edge.target();
 * }</pre>
 *
 * <p>Graph elements expose properties associated with
 * vertices and relationships:</p>
 *
 * <pre>{@code
 * Vertex vertex = ...
 *
 * Optional<String> name =
 *         vertex.get("name");
 * }</pre>
 *
 * <p>This model intentionally avoids introducing traversal
 * APIs, graph query languages, path semantics, graph
 * algorithms, or provider-specific navigation capabilities
 * beyond the minimal lifecycle operations defined by the
 * Communication API.</p>
 *
 * <p>The design supports extensibility to accommodate
 * variations across graph databases, including capabilities
 * such as typed relationships, distributed graph storage,
 * graph partitioning, replication strategies,
 * provider-specific metadata, or eventual consistency
 * models.</p>
 *
 * <p>This model is part of the Jakarta NoSQL Communication API
 * and follows its principles of optional adoption, minimal
 * abstraction, extensibility, and preservation of native
 * database semantics.</p>
 *
 * <p>In summary, the graph communication model defines a
 * minimal, low-level, and extensible foundation for
 * interacting with graph-oriented NoSQL systems while
 * preserving their native operational characteristics.</p>
 */
package jakarta.nosql.communication.graph;