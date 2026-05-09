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

/**
 * Represents a column within a column-family record.
 *
 * <p>A {@code Column} defines the association between a
 * column name and its corresponding value according to
 * the semantics of the underlying database implementation.</p>
 *
 * <p>The interpretation, visibility guarantees, durability
 * semantics, consistency model, serialization strategy,
 * and execution behavior associated with columns are
 * determined by the provider implementation.</p>
 */
public interface Column {

    /**
     * Returns the column name.
     *
     * @return the column name
     */
    String name();

    /**
     * Returns the column value.
     *
     * @param <T> the value type
     * @return the column value
     */
    <T> T value();

}