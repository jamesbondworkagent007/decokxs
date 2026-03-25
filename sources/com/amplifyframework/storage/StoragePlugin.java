package com.amplifyframework.storage;

import android.content.Context;
import androidx.annotation.NonNull;
import com.amplifyframework.AmplifyException;
import com.amplifyframework.core.category.CategoryType;
import com.amplifyframework.core.plugin.Plugin;

/* JADX INFO: loaded from: classes14.dex */
public abstract class StoragePlugin<E> implements StorageCategoryBehavior, Plugin<E> {
    @Override // com.amplifyframework.core.plugin.Plugin
    public void initialize(@NonNull Context context) throws AmplifyException {
    }

    @Override // com.amplifyframework.core.category.CategoryTypeable
    public final CategoryType getCategoryType() {
        return CategoryType.STORAGE;
    }
}
