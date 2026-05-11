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

import jakarta.nosql.communication.Record;
import jakarta.nosql.communication.column.Column;

import java.util.List;

/**
 * Represents a record in a document database.
 *
 * <p>A {@code DocumentRecord} defines the minimal communication
 * structure used by document-oriented systems, where data is
 * commonly represented using hierarchical and nested document
 * models.</p>
 *
 * <p>In addition to the unique record key inherited from
 * {@link Record}, document databases expose named collections
 * of document elements associated with a logical record
 * structure.</p>
 *
 * <p>The interpretation, organization, visibility guarantees,
 * durability semantics, consistency model, serialization
 * strategy, and execution behavior associated with records
 * and document elements are determined by the underlying
 * database implementation.</p>
 *
 * <p>Implementations may support additional capabilities such
 * as nested documents, hierarchical structures, schema
 * flexibility, distributed replication, provider-specific
 * serialization models, append-oriented persistence,
 * or eventual consistency strategies.</p>
 */
public interface DocumentRecord extends Record {


    /**
     * Returns the columns associated with this record.
     *
     * <p>The organization, ordering guarantees, visibility semantics,
     * and column structure are determined by the underlying database
     * implementation.</p>
     *
     * <pre>{@code
     * ColumnRecord record = ...
     *
     * for (Column column : record.columns()) {
     *     System.out.println(column.name());
     * }
     * }</pre>
     *
     * @return the record columns
     */
    List<Column> columns();

    /**
     * Returns the value associated with the provided column name.
     *
     * <p>The interpretation, serialization strategy, and visibility
     * semantics associated with column values are determined by the
     * underlying database implementation.</p>
     *
     * <p>If the column does not exist, this method may return
     * {@code null} according to the provider implementation.</p>
     *
     * <pre>{@code
     * ColumnRecord record = ...
     *
     * String name = record.get("name");
     * }</pre>
     *
     * @param column the column name
     * @param <T> the column value type
     * @return the column value
     * @throws NullPointerException when the column is {@code null}
     */
    <T> T get(String column);

    /**
     * Returns whether this record contains the provided column.
     *
     * <p>The existence semantics associated with columns are
     * determined by the underlying database implementation.</p>
     *
     * <pre>{@code
     * ColumnRecord record = ...
     *
     * boolean contains = record.contains("name");
     * }</pre>
     *
     * @param column the column name
     * @return {@code true} when the column exists,
     * otherwise {@code false}
     * @throws NullPointerException when the column is {@code null}
     */
    boolean contains(String column);

    /**
     * Returns the logical name associated with this record.
     *
     * <p>The meaning and semantics of the name are determined
     * by the underlying database implementation. Depending on
     * the provider, the name may represent concepts such as
     * column families, tables, namespaces, logical groups,
     * or provider-specific structures.</p>
     *
     * <pre>{@code
     * ColumnRecord record = ...
     *
     * String name = record.name();
     * }</pre>
     *
     * @return the logical record name
     */
    String name();

}
