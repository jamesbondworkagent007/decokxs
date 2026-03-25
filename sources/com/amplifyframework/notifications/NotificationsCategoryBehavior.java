package com.amplifyframework.notifications;

import com.amplifyframework.analytics.UserProfile;
import com.amplifyframework.core.Action;
import com.amplifyframework.core.Consumer;
import com.amplifyframework.notifications.pushnotifications.PushNotificationsException;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public interface NotificationsCategoryBehavior {
    void identifyUser(@NotNull String str, @NotNull UserProfile userProfile, @NotNull Action action, @NotNull Consumer<PushNotificationsException> consumer);

    void identifyUser(@NotNull String str, @NotNull Action action, @NotNull Consumer<PushNotificationsException> consumer);
}
