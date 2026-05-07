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
 * Defines the minimal communication contract for managing records within
 * a NoSQL database.
 *
 * <p>A {@code RecordManager} provides basic lifecycle operations for
 * interacting with records, including insertion, update, retrieval,
 * and deletion. This interface represents the common operational
 * foundation shared across NoSQL database models.</p>
 *
 * <p>The visibility, durability, consistency, and execution timing of
 * operations defined by this interface are determined by the underlying
 * database implementation.</p>
 *
 * <p>The Communication API is intentionally minimal and does not define
 * query languages, traversal semantics, aggregation models, or other
 * database-specific capabilities. Specialized communication models may
 * extend this interface to provide additional behaviors according to
 * the characteristics of the underlying database.</p>
 *
 * <p>Implementations are expected to preserve the native behavior and
 * semantics of the target NoSQL database.</p>
 */
public interface RecordManager {

    /**
     * Requests the insertion of a new record into the database.
     *
     * <p>The behavior of this operation, including conflict handling,
     * key generation, validation rules, visibility, durability, and
     * consistency guarantees, is determined by the underlying database
     * implementation.</p>
     *
     * <p>This operation returns the persisted record instance. Provider
     * implementations may return the same instance or a new instance
     * containing additional generated information, such as a database-generated
     * key or provider-specific metadata.</p>
     *
     * <p>Databases that require a key during insertion may reject records
     * without a defined key, typically by throwing a provider-specific
     * exception. Other implementations may generate the key automatically
     * and return a new record instance containing the generated value.</p>
     *
     * <pre>{@code
     * Record record = ...
     *
     * RecordManager manager = ...
     * Record persisted = manager.insert(record);
     * }</pre>
     *
     * @param record the record to insert
     * @return the persisted record instance
     * @throws NullPointerException when the record is {@code null}
     */
    Record insert(Record record);
}
