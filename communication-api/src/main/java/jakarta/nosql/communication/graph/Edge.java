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
 * Represents a relationship between two vertices within
 * a graph database.
 *
 * <p>An {@code Edge} defines a graph-native structure used
 * to represent connections, associations, or relationships
 * between vertices according to the semantics of the
 * underlying database implementation.</p>
 *
 * <p>Edges commonly contain relationship types, properties,
 * direction semantics, metadata, or provider-specific
 * structures associated with graph connectivity.</p>
 *
 * <p>The interpretation, visibility guarantees, durability
 * semantics, consistency model, serialization strategy,
 * connectivity behavior, and execution semantics associated
 * with edges are determined by the provider implementation.</p>
 *
 * <p>Implementations may support additional capabilities such
 * as typed relationships, graph partitioning, distributed
 * graph storage, provider-specific metadata, or eventual
 * consistency strategies.</p>
 */
public interface Edge extends GraphElement {

    /**
     * Returns the relationship type associated with this edge.
     *
     * <p>The interpretation and semantics of the type are
     * determined by the underlying database implementation.</p>
     *
     * <pre>{@code
     * Edge edge = ...
     *
     * String type = edge.type();
     * }</pre>
     *
     * @return the relationship type
     */
    String type();

    /**
     * Returns the source vertex identifier associated
     * with this edge.
     *
     * <p>The interpretation and structure of the identifier
     * are determined by the underlying database
     * implementation.</p>
     *
     * <pre>{@code
     * Edge edge = ...
     *
     * String source = edge.source();
     * }</pre>
     *
     * @param <K> the identifier type
     * @return the source vertex identifier
     */
    <K> K source();

    /**
     * Returns the target vertex identifier associated
     * with this edge.
     *
     * <p>The interpretation and structure of the identifier
     * are determined by the underlying database
     * implementation.</p>
     *
     * <pre>{@code
     * Edge edge = ...
     *
     * String target = edge.target();
     * }</pre>
     *
     * @param <K> the identifier type
     * @return the target vertex identifier
     */
    <K> K target();
}
