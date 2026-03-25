package com.amplifyframework.notifications;

import android.content.Context;
import com.amplifyframework.AmplifyException;
import com.amplifyframework.analytics.UserProfile;
import com.amplifyframework.core.Action;
import com.amplifyframework.core.Consumer;
import com.amplifyframework.core.category.Category;
import com.amplifyframework.core.category.CategoryConfiguration;
import com.amplifyframework.core.category.CategoryType;
import com.amplifyframework.core.category.EmptyCategoryConfiguration;
import com.amplifyframework.core.category.SubCategoryType;
import com.amplifyframework.notifications.pushnotifications.PushNotificationsCategory;
import com.amplifyframework.notifications.pushnotifications.PushNotificationsException;
import com.amplifyframework.notifications.pushnotifications.PushNotificationsPlugin;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public class NotificationsCategory extends Category<NotificationsPlugin<?>> implements NotificationsCategoryBehavior {
    public PushNotificationsCategory Push = new PushNotificationsCategory();

    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[SubCategoryType.values().length];
            try {
                iArr[SubCategoryType.PUSH_NOTIFICATIONS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static /* synthetic */ void getPush$annotations() {
    }

    @Override // com.amplifyframework.core.category.CategoryTypeable
    public CategoryType getCategoryType() {
        return CategoryType.NOTIFICATIONS;
    }

    @Override // com.amplifyframework.core.category.Category
    public void configure(@NotNull CategoryConfiguration categoryConfiguration, @NotNull Context context) throws AmplifyException {
        Intrinsics.checkNotNullParameter(categoryConfiguration, "");
        Intrinsics.checkNotNullParameter(context, "");
        Set<NotificationsPlugin<?>> plugins = getPlugins();
        Intrinsics.checkNotNullExpressionValue(plugins, "");
        Iterator<T> it = plugins.iterator();
        while (it.hasNext()) {
            NotificationsPlugin notificationsPlugin = (NotificationsPlugin) it.next();
            if (WhenMappings.$EnumSwitchMapping$0[notificationsPlugin.getSubCategoryType().ordinal()] == 1) {
                PushNotificationsCategory pushNotificationsCategory = this.Push;
                Intrinsics.copydefault(notificationsPlugin, "");
                pushNotificationsCategory.addPlugin((PushNotificationsPlugin) notificationsPlugin);
                CategoryConfiguration categoryConfigurationForCategoryType = categoryConfiguration instanceof NotificationsCategoryConfiguration ? (NotificationsCategoryConfiguration) categoryConfiguration : null;
                PushNotificationsCategory pushNotificationsCategory2 = this.Push;
                if (categoryConfigurationForCategoryType == null) {
                    categoryConfigurationForCategoryType = EmptyCategoryConfiguration.forCategoryType(getCategoryType());
                }
                pushNotificationsCategory2.configure(categoryConfigurationForCategoryType, context);
            }
        }
    }

    @Override // com.amplifyframework.notifications.NotificationsCategoryBehavior
    public void identifyUser(@NotNull String str, @NotNull Action action, @NotNull Consumer<PushNotificationsException> consumer) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(action, "");
        Intrinsics.checkNotNullParameter(consumer, "");
        this.Push.identifyUser(str, action, consumer);
    }

    @Override // com.amplifyframework.notifications.NotificationsCategoryBehavior
    public void identifyUser(@NotNull String str, @NotNull UserProfile userProfile, @NotNull Action action, @NotNull Consumer<PushNotificationsException> consumer) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(userProfile, "");
        Intrinsics.checkNotNullParameter(action, "");
        Intrinsics.checkNotNullParameter(consumer, "");
        this.Push.identifyUser(str, userProfile, action, consumer);
    }
}
