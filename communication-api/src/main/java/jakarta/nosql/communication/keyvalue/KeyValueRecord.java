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

import jakarta.nosql.communication.Record;

/**
 * Represents a record in a key-value database.
 *
 * <p>A {@code KeyValueRecord} defines the minimal communication
 * structure used by key-value systems, where data is represented
 * as the association between a unique key and a corresponding value.</p>
 *
 * <p>This model intentionally preserves the simplicity of key-value
 * databases and does not impose assumptions about the internal
 * structure, schema, or semantics of the stored value. The value
 * may represent primitive types, binary content, serialized objects,
 * structured documents, or provider-specific data representations.</p>
 *
 * <p>The interpretation, serialization strategy, visibility guarantees,
 * durability semantics, and consistency model associated with the
 * value are determined by the underlying database implementation.</p>
 *
 * <p>Implementations may support additional capabilities such as
 * expiration policies, distributed replication, append-only storage,
 * provider-specific metadata, or eventual consistency strategies.</p>
 */

public interface KeyValueRecord extends Record {

    /**
     * Returns the value associated with this record.
     *
     * @param <V> the value type
     * @return the record value
     */
    <V> V value();
}
