package o;

import com.okinc.okcomponents.feature.oknotificationcenter.api.business.systempush.model.NotificationCategory;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public interface rXT extends InterfaceC43217rlC {
    android.content.Intent AEQbTJ(@NotNull android.content.Context context, java.lang.String str, NotificationCategory notificationCategory);

    void KWHzl();

    void copydefault(@NotNull android.content.Context context, @NotNull java.lang.String str);

    public static final class StateListAnimator {
        public static /* synthetic */ android.content.Intent buildNotificationCenterIntent$default(rXT rxt, android.content.Context context, java.lang.String str, NotificationCategory notificationCategory, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: buildNotificationCenterIntent");
            }
            if ((i & 4) != 0) {
                notificationCategory = null;
            }
            return rxt.AEQbTJ(context, str, notificationCategory);
        }
    }
}
