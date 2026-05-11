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

import jakarta.nosql.communication.RecordManager;
import jakarta.nosql.communication.column.ColumnRecord;

/**
 * Defines the communication contract for interacting with
 * document databases.
 *
 * <p>A {@code DocumentManager} specializes {@link RecordManager}
 * for {@link DocumentRecord} instances, providing lifecycle
 * operations aligned with document storage semantics.</p>
 *
 * <p>Document databases commonly organize data using
 * hierarchical and nested structures, where records may
 * contain dynamic collections of document elements
 * associated with logical structures defined by the
 * underlying database implementation.</p>
 *
 * <p>The visibility guarantees, durability semantics,
 * consistency model, replication strategies, batching
 * semantics, and execution timing associated with
 * operations are determined by the provider implementation.</p>
 *
 * <p>Implementations may support additional capabilities
 * such as nested documents, hierarchical structures,
 * distributed replication, provider-specific serialization
 * strategies, schema flexibility, or eventual consistency
 * models.</p>
 */
public interface DocumentManager extends RecordManager<DocumentRecord> {

    /**
     * Stores a record in the column-family database.
     *
     * <p>This operation behaves as a complete replacement
     * operation according to the semantics of the underlying
     * database implementation.</p>
     *
     * <p>When the record key does not exist, the operation
     * may behave as an insertion. When the key already exists,
     * the existing record may be replaced, merged, appended,
     * or updated according to the storage model and provider
     * implementation.</p>
     *
     * <p>The visibility guarantees, durability semantics,
     * consistency model, partitioning behavior, replication
     * strategies, batching semantics, and execution timing
     * associated with this operation are determined by the
     * provider implementation.</p>
     *
     * <p>Some databases may execute this operation
     * asynchronously or using eventual consistency strategies.
     * In such systems, updates may not become immediately
     * visible across all nodes, replicas, or distributed
     * regions.</p>
     *
     * <p>This operation returns the stored record instance.
     * Implementations may return the same instance or a new
     * instance containing additional generated information
     * or provider-specific metadata.</p>
     *
     * <pre>{@code
     * ColumnRecord record = ...
     *
     * ColumnManager manager = ...
     *
     * ColumnRecord stored = manager.put(record);
     * }</pre>
     *
     * @param record the record to store
     * @return the stored record instance
     * @throws NullPointerException when the record is {@code null}
     */
    DocumentRecord put(DocumentRecord record);

    /**
     * Stores multiple records in the column-family database.
     *
     * <p>The batching behavior, visibility guarantees,
     * durability semantics, consistency model, partitioning
     * behavior, replication strategies, partial failure
     * handling, and execution timing associated with this
     * operation are determined by the provider implementation.</p>
     *
     * <p>Some databases may process records sequentially,
     * lazily, asynchronously, or using provider-specific
     * batching optimizations.</p>
     *
     * <p>Depending on the underlying database implementation,
     * this operation may behave as insertion, replacement,
     * merge, append, or update operations according to the
     * storage semantics of the provider.</p>
     *
     * <p>Some databases may execute this operation using
     * eventual consistency strategies. In such systems,
     * updates may not become immediately visible across all
     * nodes, replicas, or distributed regions.</p>
     *
     * <p>This operation returns the stored record instances.
     * Implementations may return the same instances or new
     * instances containing additional generated information
     * or provider-specific metadata.</p>
     *
     * <pre>{@code
     * Iterable<ColumnRecord> records = ...
     *
     * ColumnManager manager = ...
     *
     * Iterable<ColumnRecord> stored =
     *         manager.put(records);
     * }</pre>
     *
     * @param records the records to store
     * @return the stored record instances
     * @throws NullPointerException when the records are {@code null}
     */
    Iterable<ColumnRecord> put(Iterable<DocumentRecord> records);
}
