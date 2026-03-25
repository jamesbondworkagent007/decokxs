package com.amplifyframework.storage.result;

import androidx.annotation.Nullable;
import com.amplifyframework.storage.StorageItem;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public final class StorageListResult {
    private final List<StorageItem> items;
    private final String nextToken;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public List<StorageItem> getItems() {
        return this.items;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getNextToken() {
        return this.nextToken;
    }

    private StorageListResult(List<StorageItem> list, String str) {
        this.items = list;
        this.nextToken = str;
    }

    public static StorageListResult fromItems(@Nullable List<StorageItem> list, @Nullable String str) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            arrayList.addAll(list);
        }
        return new StorageListResult(Collections.unmodifiableList(arrayList), str);
    }
}
