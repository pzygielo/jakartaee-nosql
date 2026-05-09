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
package jakarta.nosql.communication.keyvalue;


/**
 * Creates {@link BucketManager} instances for key-value communication.
 *
 * <p>A {@code BucketManagerFactory} is an entry point to the key-value
 * portion of the Jakarta NoSQL Communication API. It provides access to
 * managers associated with bucket names according to the behavior of the
 * underlying database implementation.</p>
 *
 * <p>Some databases expose buckets as first-class structures, while others
 * may interpret bucket names as namespaces, collections, key prefixes,
 * logical groups, or provider-specific conventions.</p>
 *
 * <p>The configuration, initialization, caching behavior, lifecycle,
 * visibility guarantees, and creation semantics of managers are determined
 * by the provider implementation.</p>
 */
public interface BucketManagerFactory {

    /**
     * Returns a {@link BucketManager} associated with the provided bucket name.
     *
     * <p>The interpretation and semantics of the bucket name are determined
     * by the underlying database implementation.</p>
     *
     * <pre>{@code
     * BucketManagerFactory factory = ...
     *
     * BucketManager users = factory.get("users");
     * }</pre>
     *
     * @param bucket the bucket name
     * @return the bucket manager associated with the bucket
     * @throws NullPointerException when the bucket is {@code null}
     */
    BucketManager get(String bucket);

    /**
     * Returns the default {@link BucketManager} associated with
     * the underlying database implementation.
     *
     * <p>This method allows interaction with key-value databases
     * that do not expose bucket concepts directly or rely on
     * provider-defined default communication contexts.</p>
     *
     * <p>Implementations may interpret the default manager using
     * provider-specific strategies such as namespaces, key prefixes,
     * configuration defaults, or logical grouping mechanisms.</p>
     *
     * <pre>{@code
     * BucketManagerFactory factory = ...
     *
     * BucketManager manager = factory.get();
     * }</pre>
     *
     * @return the default bucket manager
     */
    BucketManager get();
}
