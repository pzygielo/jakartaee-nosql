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
package jakarta.nosql.communication.graph;

/**
 * Represents a vertex within a graph database.
 *
 * <p>A {@code Vertex} defines a graph-native structure used
 * to represent entities, nodes, or connected elements within
 * a graph model.</p>
 *
 * <p>Vertices are commonly connected through relationships
 * represented by {@link Edge} instances and may contain
 * labels, properties, metadata, or provider-specific
 * structures according to the semantics of the underlying
 * database implementation.</p>
 *
 * <p>The interpretation, visibility guarantees, durability
 * semantics, consistency model, serialization strategy,
 * connectivity behavior, and execution semantics associated
 * with vertices are determined by the provider
 * implementation.</p>
 *
 * <p>Implementations may support additional capabilities such
 * as labels, graph partitioning, distributed graph storage,
 * provider-specific metadata, or eventual consistency
 * strategies.</p>
 */
public interface Vertex {

    /**
     * Returns the logical label associated with this vertex.
     *
     * <p>The interpretation and semantics of the label are
     * determined by the underlying database implementation.</p>
     *
     * <pre>{@code
     * Vertex vertex = ...
     *
     * String label = vertex.label();
     * }</pre>
     *
     * @return the vertex label
     */
    String label();

    /**
     * Returns the edges associated with this vertex.
     *
     * <p>The organization, direction semantics, visibility
     * guarantees, connectivity behavior, and relationship
     * structure are determined by the underlying database
     * implementation.</p>
     *
     * <pre>{@code
     * Vertex vertex = ...
     *
     * for (Edge edge : vertex.edges()) {
     *     System.out.println(edge.type());
     * }
     * }</pre>
     *
     * @return the vertex edges
     */
    List<Edge> edges();
}
