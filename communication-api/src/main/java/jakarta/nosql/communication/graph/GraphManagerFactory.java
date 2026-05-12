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
 * Creates {@link GraphManager} instances for graph database
 * communication.
 *
 * <p>A {@code GraphManagerFactory} is an entry point to the
 * graph portion of the Jakarta NoSQL Communication API.
 * It provides access to managers associated with logical
 * graph structures according to the behavior of the
 * underlying database implementation.</p>
 *
 * <p>Depending on the provider implementation, names may
 * represent concepts such as graphs, namespaces,
 * logical graph groups, databases, or provider-specific
 * graph structures.</p>
 *
 * <p>The configuration, initialization, caching behavior,
 * lifecycle semantics, visibility guarantees, and manager
 * creation strategies are determined by the provider
 * implementation.</p>
 *
 * <p>Providers may configure managers using mechanisms such
 * as Java properties, environment variables, configuration
 * files, dependency injection, or provider-specific
 * strategies.</p>
 */
public interface GraphManagerFactory {

    /**
     * Returns the default {@link GraphManager} associated
     * with the underlying database implementation.
     *
     * <p>This method allows interaction with graph databases
     * that rely on provider-defined default communication
     * contexts.</p>
     *
     * <pre>{@code
     * GraphManagerFactory factory = ...
     *
     * GraphManager manager = factory.get();
     * }</pre>
     *
     * @return the default graph manager
     */
    GraphManager get();


    /**
     * Returns a {@link GraphManager} associated with the
     * provided logical name.
     *
     * <p>The interpretation and semantics of the provided
     * name are determined by the underlying database
     * implementation.</p>
     *
     * <pre>{@code
     * GraphManagerFactory factory = ...
     *
     * GraphManager manager =
     *         factory.get("social");
     * }</pre>
     *
     * @param name the logical name associated with the manager
     * @return the graph manager associated with the provided name
     * @throws NullPointerException when the name is {@code null}
     */
    GraphManager get(String name);
}
