package com.amplifyframework.notifications;

import android.content.Context;
import com.amplifyframework.AmplifyException;
import com.amplifyframework.core.category.CategoryType;
import com.amplifyframework.core.category.SubCategoryType;
import com.amplifyframework.core.plugin.Plugin;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public abstract class NotificationsPlugin<E> implements NotificationsCategoryBehavior, Plugin<E> {
    public abstract SubCategoryType getSubCategoryType();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.amplifyframework.core.plugin.Plugin
    public void initialize(@NotNull Context context) throws AmplifyException {
        Intrinsics.checkNotNullParameter(context, "");
    }

    @Override // com.amplifyframework.core.category.CategoryTypeable
    public CategoryType getCategoryType() {
        return CategoryType.NOTIFICATIONS;
    }
}
