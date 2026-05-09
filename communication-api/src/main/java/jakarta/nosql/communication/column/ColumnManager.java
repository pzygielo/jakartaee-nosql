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
package jakarta.nosql.communication.column;

import jakarta.nosql.communication.RecordManager;

/**
 * Defines the communication contract for interacting with
 * column-family databases.
 *
 * <p>A {@code ColumnManager} specializes {@link RecordManager}
 * for {@link ColumnRecord} instances, providing lifecycle
 * operations aligned with column-family storage semantics.</p>
 *
 * <p>Column-family databases commonly organize data using
 * sparse and partition-oriented models, where records may
 * contain dynamic collections of columns associated with
 * logical structures defined by the underlying database
 * implementation.</p>
 *
 * <p>The visibility guarantees, durability semantics,
 * consistency model, partitioning behavior, replication
 * strategies, batching semantics, and execution timing
 * associated with operations are determined by the
 * provider implementation.</p>
 *
 * <p>Implementations may support additional capabilities
 * such as clustering strategies, sparse storage models,
 * append-oriented persistence, distributed replication,
 * provider-specific optimizations, or eventual consistency
 * strategies.</p>
 */
public interface ColumnManager extends RecordManager<ColumnRecord> {
}
