package com.amplifyframework.notifications.pushnotifications;

import com.amplifyframework.core.Action;
import com.amplifyframework.core.Consumer;
import com.amplifyframework.notifications.NotificationsCategoryBehavior;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public interface PushNotificationsCategoryBehavior extends NotificationsCategoryBehavior {
    void handleNotificationReceived(@NotNull NotificationPayload notificationPayload, @NotNull Consumer<PushNotificationResult> consumer, @NotNull Consumer<PushNotificationsException> consumer2);

    void recordNotificationOpened(@NotNull NotificationPayload notificationPayload, @NotNull Action action, @NotNull Consumer<PushNotificationsException> consumer);

    void recordNotificationReceived(@NotNull NotificationPayload notificationPayload, @NotNull Action action, @NotNull Consumer<PushNotificationsException> consumer);

    void registerDevice(@NotNull String str, @NotNull Action action, @NotNull Consumer<PushNotificationsException> consumer);

    boolean shouldHandleNotification(@NotNull NotificationPayload notificationPayload);
}
