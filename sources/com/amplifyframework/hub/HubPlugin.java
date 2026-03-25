package com.amplifyframework.hub;

import android.content.Context;
import androidx.annotation.NonNull;
import com.amplifyframework.AmplifyException;
import com.amplifyframework.core.category.CategoryType;
import com.amplifyframework.core.plugin.Plugin;

/* JADX INFO: loaded from: classes2.dex */
public abstract class HubPlugin<E> implements HubCategoryBehavior, Plugin<E> {
    @Override // com.amplifyframework.core.plugin.Plugin
    public void initialize(@NonNull Context context) throws AmplifyException {
    }

    @Override // com.amplifyframework.core.category.CategoryTypeable
    public final CategoryType getCategoryType() {
        return CategoryType.HUB;
    }
}
