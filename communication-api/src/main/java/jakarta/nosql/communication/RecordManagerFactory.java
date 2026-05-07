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
package jakarta.nosql.communication;

/**
 * Defines the factory contract for creating and accessing
 * {@link RecordManager} instances.
 *
 * <p>A {@code RecordManagerFactory} acts as the primary entry point
 * to the Jakarta NoSQL Communication API. It provides access to
 * generic and specialized communication managers according to the
 * capabilities of the underlying database implementation.</p>
 *
 * <p>The availability, lifecycle, caching behavior, and creation
 * semantics of managers are determined by the underlying
 * provider implementation.</p>
 *
 * <p>Implementations may return shared, cached, lazily initialized,
 * or provider-specific manager instances.</p>
 */
public interface RecordManagerFactory {

    /**
     * Returns the default {@link RecordManager} associated with
     * the underlying database implementation.
     *
     * <p>The returned manager provides access to the minimal
     * communication operations defined by the Communication API.</p>
     *
     * <p>The configuration and initialization required to create
     * the manager are determined by the provider implementation.
     * Providers may configure managers using mechanisms such as
     * Java properties, environment variables, configuration files,
     * dependency injection, or provider-specific strategies.</p>
     *
     * <pre>{@code
     * RecordManagerFactory factory = ...
     *
     * RecordManager manager = factory.manager();
     * }</pre>
     *
     * @return the default record manager
     */
    RecordManager manager();
}
