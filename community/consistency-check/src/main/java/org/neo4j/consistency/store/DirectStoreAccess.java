/*
 * Copyright (c) 2002-2019 "Neo4j,"
 * Neo4j Sweden AB [http://neo4j.com]
 *
 * This file is part of Neo4j.
 *
 * Neo4j is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.neo4j.consistency.store;

import org.neo4j.internal.index.label.LabelScanStore;
import org.neo4j.kernel.impl.api.index.IndexProviderMap;
import org.neo4j.kernel.impl.store.StoreAccess;
import org.neo4j.kernel.impl.store.counts.CountsTracker;
import org.neo4j.token.TokenHolders;

public class DirectStoreAccess
{
    private final StoreAccess nativeStores;
    private final LabelScanStore labelScanStore;
    private final IndexProviderMap indexes;
    private final CountsTracker counts;
    private final TokenHolders tokenHolders;

    public DirectStoreAccess( StoreAccess nativeStores, LabelScanStore labelScanStore, IndexProviderMap indexes, CountsTracker counts,
            TokenHolders tokenHolders )
    {
        this.nativeStores = nativeStores;
        this.labelScanStore = labelScanStore;
        this.indexes = indexes;
        this.counts = counts;
        this.tokenHolders = tokenHolders;
    }

    public StoreAccess nativeStores()
    {
        return nativeStores;
    }

    public LabelScanStore labelScanStore()
    {
        return labelScanStore;
    }

    public IndexProviderMap indexes()
    {
        return indexes;
    }

    public CountsTracker counts()
    {
        return counts;
    }

    public TokenHolders tokenHolders()
    {
        return tokenHolders;
    }
}
