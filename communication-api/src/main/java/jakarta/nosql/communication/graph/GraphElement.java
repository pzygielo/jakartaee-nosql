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

import java.util.List;

/**
 * Represents a graph element within a graph database.
 *
 * <p>A {@code GraphElement} defines the minimal communication
 * structure shared by graph-oriented database elements such
 * as vertices and edges.</p>
 *
 * <p>Graph databases commonly organize data using connected
 * structures composed of vertices, relationships, labels,
 * and properties. Graph elements expose properties associated
 * with graph-native structures according to the semantics of
 * the underlying database implementation.</p>
 *
 * <p>The interpretation, visibility guarantees, durability
 * semantics, consistency model, serialization strategy,
 * identity model, and execution behavior associated with
 * graph elements are determined by the provider
 * implementation.</p>
 *
 * <p>Implementations may support additional capabilities such
 * as labels, typed relationships, distributed graph storage,
 * provider-specific metadata, graph partitioning, or eventual
 * consistency strategies.</p>
 */
public interface GraphElement {

    /**
     * Returns the graph element identifier.
     *
     * <p>The interpretation and structure of the identifier
     * are determined by the underlying database implementation.</p>
     *
     * <pre>{@code
     * GraphElement element = ...
     *
     * String id = element.id();
     * }</pre>
     *
     * @param <K> the identifier type
     * @return the graph element identifier
     */
    <K> K id();


    /**
     * Returns the properties associated with this graph element.
     *
     * <p>The organization, visibility semantics, ordering
     * guarantees, and property structure are determined by
     * the underlying database implementation.</p>
     *
     * <pre>{@code
     * GraphElement element = ...
     *
     * for (Property property : element.properties()) {
     *     System.out.println(property.name());
     * }
     * }</pre>
     *
     * @return the graph element properties
     */
    List<Property> properties();
}
