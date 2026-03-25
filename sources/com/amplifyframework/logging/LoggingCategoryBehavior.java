package com.amplifyframework.logging;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amplifyframework.core.category.CategoryType;

/* JADX INFO: loaded from: classes2.dex */
public interface LoggingCategoryBehavior {
    void disable();

    void enable();

    @Deprecated
    Logger forNamespace(@Nullable String str);

    Logger logger(@NonNull CategoryType categoryType, @NonNull String str);

    Logger logger(@NonNull String str);
}
