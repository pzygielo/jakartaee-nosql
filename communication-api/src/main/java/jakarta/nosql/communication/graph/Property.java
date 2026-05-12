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
 * Represents a property associated with a graph element.
 *
 * <p>A {@code Property} defines the association between a
 * property name and its corresponding value according to
 * the semantics of the underlying graph database
 * implementation.</p>
 *
 * <p>Graph databases commonly associate properties with
 * nodes and relationships to describe attributes,
 * metadata, labels, or provider-specific information.</p>
 *
 * <p>The interpretation, visibility guarantees, durability
 * semantics, consistency model, serialization strategy,
 * and execution behavior associated with properties are
 * determined by the provider implementation.</p>
 */
public interface Property {

    String name();

    <T> T value();

}