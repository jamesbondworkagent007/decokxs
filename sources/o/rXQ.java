package o;

import com.okinc.okcomponents.feature.oknotificationcenter.api.business.notificationmessage.model.NotificationCategoryBean;
import com.okinc.okcomponents.feature.oknotificationcenter.api.business.notificationmessage.model.NotificationEntryPointEnum;
import com.okinc.okcomponents.feature.oknotificationcenter.api.business.notificationmessage.model.SystemNotification;
import com.okinc.okcomponents.feature.oknotificationcenter.api.business.notificationmessage.model.UnViewedNotificationResp;
import com.okinc.okcomponents.feature.oknotificationcenter.api.business.systempush.model.AppNotificationBizType;
import com.okinc.okcomponents.feature.oknotificationcenter.api.business.systempush.model.NotificationType;
import com.okinc.okcomponents.feature.oknotificationcenter.api.business.systempush.model.ViewAllNotificationResp;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import o.rXQ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public interface rXQ extends InterfaceC43217rlC {
    java.lang.Object AEQbTJ(@NotNull java.lang.String str, java.lang.Long l, int i, @NotNull Continuation<? super java.util.List<SystemNotification>> continuation);

    Flow<java.lang.Integer> AEQbTJ();

    void AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, int i, java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, boolean z, android.net.Uri uri, @NotNull java.lang.String str6, boolean z2, boolean z3);

    void AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3);

    java.lang.Object EZpvd(@NotNull NotificationEntryPointEnum notificationEntryPointEnum, @NotNull Continuation<? super java.util.List<NotificationCategoryBean>> continuation);

    java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull Continuation<? super ViewAllNotificationResp> continuation);

    Flow<rXZ> EZpvd();

    void KWHzl();

    void KWHzl(int i);

    java.lang.Object OLrzqt(@NotNull java.util.List<rXL> list, @NotNull Continuation<? super UnViewedNotificationResp> continuation);

    java.lang.Object copydefault(@NotNull AppNotificationBizType appNotificationBizType, @NotNull java.util.List<? extends NotificationType> list, @NotNull Continuation<? super java.util.List<rXN>> continuation);

    void copydefault(@NotNull android.content.Context context, int i, @NotNull AppNotificationBizType appNotificationBizType, int i2, @NotNull Function1<? super java.lang.Throwable, Unit> function1);

    void copydefault(@NotNull android.content.Context context, @NotNull AppNotificationBizType appNotificationBizType, int i, @NotNull Function1<? super java.lang.Throwable, Unit> function1);

    public static final class Activity {
        public static Unit AEQbTJ(java.lang.Throwable th) {
            Intrinsics.checkNotNullParameter(th, "");
            return Unit.INSTANCE;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.rXQ */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void startAppPushAdvancedSettingsPageForResult$default(rXQ rxq, android.content.Context context, AppNotificationBizType appNotificationBizType, int i, Function1 function1, int i2, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startAppPushAdvancedSettingsPageForResult");
            }
            if ((i2 & 8) != 0) {
                function1 = new Function1() { // from class: o.rXR
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return rXQ.Activity.AEQbTJ((java.lang.Throwable) obj2);
                    }
                };
            }
            rxq.copydefault(context, appNotificationBizType, i, function1);
        }

        public static /* synthetic */ void showSystemNotification$default(rXQ rxq, java.lang.String str, java.lang.String str2, int i, java.lang.String str3, java.lang.String str4, java.lang.String str5, boolean z, android.net.Uri uri, java.lang.String str6, boolean z2, boolean z3, int i2, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showSystemNotification");
            }
            rxq.AEQbTJ(str, str2, i, str3, str4, str5, z, (i2 & 128) != 0 ? null : uri, str6, z2, z3);
        }
    }
}
