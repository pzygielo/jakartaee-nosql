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

import java.util.Optional;

/**
 * Defines the communication contract for interacting with
 * graph databases.
 *
 * <p>A {@code GraphManager} provides lifecycle operations
 * for graph-native structures such as {@link Vertex}
 * and {@link Edge}.</p>
 *
 * <p>Graph databases commonly organize data using connected
 * structures composed of vertices, relationships, labels,
 * properties, and provider-specific graph semantics.</p>
 *
 * <p>The visibility guarantees, durability semantics,
 * consistency model, graph partitioning behavior,
 * replication strategies, connectivity semantics,
 * and execution timing associated with operations are
 * determined by the provider implementation.</p>
 *
 * <p>This interface intentionally avoids introducing
 * traversal APIs, graph query languages, path semantics,
 * graph algorithms, or provider-specific navigation
 * capabilities beyond the minimal lifecycle operations
 * defined by the Communication API.</p>
 *
 * <p>Implementations may support additional capabilities
 * such as distributed graph storage, typed relationships,
 * provider-specific metadata, graph partitioning,
 * replication optimizations, or eventual consistency
 * strategies.</p>
 */
public interface GraphManager {

    /**
     * Stores a vertex in the graph database.
     *
     * <p>This operation behaves according to the semantics
     * of the underlying database implementation.</p>
     *
     * <p>When the vertex identifier does not exist,
     * the operation may behave as an insertion. When the
     * identifier already exists, the existing vertex may
     * be replaced, merged, updated, or synchronized
     * according to the provider implementation.</p>
     *
     * <p>The visibility guarantees, durability semantics,
     * consistency model, graph synchronization behavior,
     * and execution timing associated with this operation
     * are determined by the provider implementation.</p>
     *
     * <pre>{@code
     * GraphManager manager = ...
     *
     * Vertex vertex = ...
     *
     * Vertex stored = manager.put(vertex);
     * }</pre>
     *
     * @param vertex the vertex to store
     * @return the stored vertex instance
     * @throws NullPointerException when the vertex is {@code null}
     */
    Vertex put(Vertex vertex);

    /**
     * Stores an edge in the graph database.
     *
     * <p>This operation behaves according to the semantics
     * of the underlying database implementation.</p>
     *
     * <p>When the edge identifier does not exist,
     * the operation may behave as an insertion. When the
     * identifier already exists, the existing edge may
     * be replaced, merged, updated, or synchronized
     * according to the provider implementation.</p>
     *
     * <p>The visibility guarantees, durability semantics,
     * consistency model, graph synchronization behavior,
     * connectivity semantics, and execution timing
     * associated with this operation are determined by
     * the provider implementation.</p>
     *
     * <pre>{@code
     * GraphManager manager = ...
     *
     * Edge edge = ...
     *
     * Edge stored = manager.put(edge);
     * }</pre>
     *
     * @param edge the edge to store
     * @return the stored edge instance
     * @throws NullPointerException when the edge is {@code null}
     */
    Edge put(Edge edge);

    /**
     * Returns the vertex associated with the provided identifier.
     *
     * <p>The interpretation and structure of the identifier
     * are determined by the underlying database
     * implementation.</p>
     *
     * <pre>{@code
     * GraphManager manager = ...
     *
     * Optional<Vertex> vertex =
     *         manager.findVertexById("user:10");
     * }</pre>
     *
     * @param id the vertex identifier
     * @param <K> the identifier type
     * @return the vertex associated with the identifier,
     * otherwise an empty {@link Optional}
     * @throws NullPointerException when the identifier
     * is {@code null}
     */
    <K> Optional<Vertex> findVertexById(K id);

    /**
     * Returns the edge associated with the provided identifier.
     *
     * <p>The interpretation and structure of the identifier
     * are determined by the underlying database
     * implementation.</p>
     *
     * <pre>{@code
     * GraphManager manager = ...
     *
     * Optional<Edge> edge =
     *         manager.findEdgeById("edge:10");
     * }</pre>
     *
     * @param id the edge identifier
     * @param <K> the identifier type
     * @return the edge associated with the identifier,
     * otherwise an empty {@link Optional}
     * @throws NullPointerException when the identifier
     * is {@code null}
     */
    <K> Optional<Edge> findEdgeById(K id);

    /**
     * Requests the removal of a vertex using its identifier.
     *
     * <p>The visibility guarantees, graph synchronization
     * semantics, relationship consistency behavior,
     * durability semantics, and execution timing associated
     * with this operation are determined by the provider
     * implementation.</p>
     *
     * <p>Depending on the underlying database implementation,
     * removing a vertex may affect associated edges,
     * relationships, graph connectivity, or provider-specific
     * graph structures.</p>
     *
     * <pre>{@code
     * GraphManager manager = ...
     *
     * manager.deleteVertexById("user:10");
     * }</pre>
     *
     * @param id the vertex identifier
     * @param <K> the identifier type
     * @throws NullPointerException when the identifier
     * is {@code null}
     */
    <K> void deleteVertexById(K id);

    /**
     * Requests the removal of an edge using its identifier.
     *
     * <p>The visibility guarantees, graph synchronization
     * semantics, durability semantics, consistency model,
     * and execution timing associated with this operation
     * are determined by the provider implementation.</p>
     *
     * <pre>{@code
     * GraphManager manager = ...
     *
     * manager.deleteEdgeById("edge:10");
     * }</pre>
     *
     * @param id the edge identifier
     * @param <K> the identifier type
     * @throws NullPointerException when the identifier
     * is {@code null}
     */
    <K> void deleteEdgeById(K id);

}
