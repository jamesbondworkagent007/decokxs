package o;

import com.okinc.okcomponents.feature.oknotificationcenter.api.business.systempush.model.AppNotificationBizType;
import com.okinc.okcomponents.feature.oknotificationcenter.impl.presentation.advancedsettings.model.NotificationSettingChannel;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@yCR
public final class rZF implements rZE {
    @yCM
    public rZF() {
    }

    @Override // o.rZE
    public void EZpvd(@NotNull android.content.Context context, @NotNull AppNotificationBizType appNotificationBizType) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(appNotificationBizType, "");
        rZC.Companion.KWHzl(context, appNotificationBizType.getType());
    }

    @Override // o.rZE
    public void copydefault(@NotNull android.content.Context context, @NotNull NotificationSettingChannel notificationSettingChannel, @NotNull AppNotificationBizType appNotificationBizType) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(notificationSettingChannel, "");
        Intrinsics.checkNotNullParameter(appNotificationBizType, "");
        rZK.Companion.KWHzl(context, notificationSettingChannel, appNotificationBizType.getType());
    }
}
