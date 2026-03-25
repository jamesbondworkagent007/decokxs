package com.amplifyframework.logging;

import android.content.Context;
import androidx.annotation.NonNull;
import com.amplifyframework.AmplifyException;
import com.amplifyframework.core.category.CategoryType;
import com.amplifyframework.core.plugin.Plugin;

/* JADX INFO: loaded from: classes2.dex */
public abstract class LoggingPlugin<E> implements LoggingCategoryBehavior, Plugin<E> {
    @Override // com.amplifyframework.core.plugin.Plugin
    public void initialize(@NonNull Context context) throws AmplifyException {
    }

    @Override // com.amplifyframework.core.category.CategoryTypeable
    public final CategoryType getCategoryType() {
        return CategoryType.LOGGING;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LoggingPlugin) {
            return getPluginKey().equals(((LoggingPlugin) obj).getPluginKey());
        }
        return false;
    }

    public final int hashCode() {
        return getPluginKey().hashCode();
    }
}
