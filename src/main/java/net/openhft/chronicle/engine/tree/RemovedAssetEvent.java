/*
 *     Copyright (C) 2015  higherfrequencytrading.com
 *
 *     This program is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU Lesser General Public License as published by
 *     the Free Software Foundation, either version 3 of the License.
 *
 *     This program is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU Lesser General Public License for more details.
 *
 *     You should have received a copy of the GNU Lesser General Public License
 *     along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package net.openhft.chronicle.engine.tree;

import net.openhft.chronicle.wire.AbstractMarshallable;
import org.jetbrains.annotations.NotNull;

/**
 * Created by peter on 22/05/15.
 */
public class RemovedAssetEvent extends AbstractMarshallable implements TopologicalEvent {
    private String assetName;
    private String name;

    private RemovedAssetEvent(String assetName, String name) {
        this.assetName = assetName;
        this.name = name;
    }

    @NotNull
    public static RemovedAssetEvent of(String assetName, String name) {
        return new RemovedAssetEvent(assetName, name);
    }

    @Override
    public boolean added() {
        return false;
    }

    @Override
    public String assetName() {
        return assetName;
    }

    public String name() {
        return name;
    }
}
