package com.amplifyframework.core.async;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amplifyframework.core.category.CategoryType;

/* JADX INFO: loaded from: classes14.dex */
public abstract class AmplifyOperation<R> {
    private final CategoryType categoryType;
    private final R request;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CategoryType getCategoryType() {
        return this.categoryType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public R getRequest() {
        return this.request;
    }

    public abstract void start();

    public AmplifyOperation(@NonNull CategoryType categoryType, @Nullable R r) {
        this.categoryType = categoryType;
        this.request = r;
    }
}
