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
package jakarta.nosql.communication.document;

/**
 * Creates {@link DocumentManager} instances for document
 * database communication.
 *
 * <p>A {@code DocumentManagerFactory} is an entry point to
 * the document portion of the Jakarta NoSQL Communication API.
 * It provides access to managers associated with logical names
 * according to the behavior of the underlying database
 * implementation.</p>
 *
 * <p>Depending on the provider implementation, names may
 * represent concepts such as collections, namespaces,
 * logical groups, document sets, or provider-specific
 * structures.</p>
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
public interface DocumentManagerFactory {

    /**
     * Returns a {@link DocumentManager} associated with the
     * provider-defined communication context.
     *
     * <p>The underlying database implementation determines
     * how the document manager is resolved and configured.</p>
     *
     * <p>Depending on the provider implementation, the manager
     * may be associated with a default collection,
     * a configured namespace, an injected communication
     * context, environment-based configuration,
     * or provider-specific document structures.</p>
     *
     * <pre>{@code
     * DocumentManagerFactory factory = ...
     *
     * DocumentManager manager = factory.get();
     * }</pre>
     *
     * @return the document manager associated with the
     * provider-defined communication context
     * @throws IllegalStateException when the provider
     * cannot resolve a communication context or when
     * the underlying configuration is incomplete
     * or invalid
     */
    DocumentManager get();

    /**
     * Returns a {@link DocumentManager} associated with the
     * provided logical name.
     *
     * <p>The interpretation and semantics of the provided
     * name are determined by the underlying database
     * implementation.</p>
     *
     * <pre>{@code
     * DocumentManagerFactory factory = ...
     *
     * DocumentManager manager =
     *         factory.get("users");
     * }</pre>
     *
     * @param name the logical name associated with the manager
     * @return the document manager associated with the provided name
     * @throws NullPointerException when the name is {@code null}
     */
    DocumentManager get(String name);
}
