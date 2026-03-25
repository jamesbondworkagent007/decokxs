package com.amplifyframework.notifications.pushnotifications;

import com.amplifyframework.analytics.UserProfile;
import com.amplifyframework.core.Action;
import com.amplifyframework.core.Consumer;
import com.amplifyframework.core.category.Category;
import com.amplifyframework.core.category.CategoryType;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class PushNotificationsCategory extends Category<PushNotificationsPlugin<?>> implements PushNotificationsCategoryBehavior {
    @Override // com.amplifyframework.core.category.CategoryTypeable
    public CategoryType getCategoryType() {
        return getSelectedPlugin().getCategoryType();
    }

    @Override // com.amplifyframework.notifications.NotificationsCategoryBehavior
    public void identifyUser(@NotNull String str, @NotNull Action action, @NotNull Consumer<PushNotificationsException> consumer) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(action, "");
        Intrinsics.checkNotNullParameter(consumer, "");
        getSelectedPlugin().identifyUser(str, action, consumer);
    }

    @Override // com.amplifyframework.notifications.NotificationsCategoryBehavior
    public void identifyUser(@NotNull String str, @NotNull UserProfile userProfile, @NotNull Action action, @NotNull Consumer<PushNotificationsException> consumer) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(userProfile, "");
        Intrinsics.checkNotNullParameter(action, "");
        Intrinsics.checkNotNullParameter(consumer, "");
        getSelectedPlugin().identifyUser(str, userProfile, action, consumer);
    }

    @Override // com.amplifyframework.notifications.pushnotifications.PushNotificationsCategoryBehavior
    public void registerDevice(@NotNull String str, @NotNull Action action, @NotNull Consumer<PushNotificationsException> consumer) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(action, "");
        Intrinsics.checkNotNullParameter(consumer, "");
        getSelectedPlugin().registerDevice(str, action, consumer);
    }

    @Override // com.amplifyframework.notifications.pushnotifications.PushNotificationsCategoryBehavior
    public void recordNotificationReceived(@NotNull NotificationPayload notificationPayload, @NotNull Action action, @NotNull Consumer<PushNotificationsException> consumer) {
        Intrinsics.checkNotNullParameter(notificationPayload, "");
        Intrinsics.checkNotNullParameter(action, "");
        Intrinsics.checkNotNullParameter(consumer, "");
        getSelectedPlugin().recordNotificationReceived(notificationPayload, action, consumer);
    }

    @Override // com.amplifyframework.notifications.pushnotifications.PushNotificationsCategoryBehavior
    public void recordNotificationOpened(@NotNull NotificationPayload notificationPayload, @NotNull Action action, @NotNull Consumer<PushNotificationsException> consumer) {
        Intrinsics.checkNotNullParameter(notificationPayload, "");
        Intrinsics.checkNotNullParameter(action, "");
        Intrinsics.checkNotNullParameter(consumer, "");
        getSelectedPlugin().recordNotificationOpened(notificationPayload, action, consumer);
    }

    @Override // com.amplifyframework.notifications.pushnotifications.PushNotificationsCategoryBehavior
    public boolean shouldHandleNotification(@NotNull NotificationPayload notificationPayload) {
        Intrinsics.checkNotNullParameter(notificationPayload, "");
        return getSelectedPlugin().shouldHandleNotification(notificationPayload);
    }

    @Override // com.amplifyframework.notifications.pushnotifications.PushNotificationsCategoryBehavior
    public void handleNotificationReceived(@NotNull NotificationPayload notificationPayload, @NotNull Consumer<PushNotificationResult> consumer, @NotNull Consumer<PushNotificationsException> consumer2) {
        Intrinsics.checkNotNullParameter(notificationPayload, "");
        Intrinsics.checkNotNullParameter(consumer, "");
        Intrinsics.checkNotNullParameter(consumer2, "");
        getSelectedPlugin().handleNotificationReceived(notificationPayload, consumer, consumer2);
    }
}
