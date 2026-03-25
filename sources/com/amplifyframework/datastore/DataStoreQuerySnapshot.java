package com.amplifyframework.datastore;

import com.amplifyframework.core.model.Model;
import com.amplifyframework.util.Immutable;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public class DataStoreQuerySnapshot<T extends Model> {
    private final boolean isSynced;
    private final List<T> items;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean getIsSynced() {
        return this.isSynced;
    }

    public DataStoreQuerySnapshot(List<T> list, boolean z) {
        this.items = list;
        this.isSynced = z;
    }

    public List<T> getItems() {
        return Immutable.of(this.items);
    }
}
