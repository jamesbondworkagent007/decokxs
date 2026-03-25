package o;

import com.okinc.okcomponents.feature.oknotificationcenter.api.business.systempush.model.AppNotificationBizType;
import com.okinc.okcomponents.feature.oknotificationcenter.impl.presentation.advancedsettings.model.NotificationSettingChannel;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public interface rZE {
    void EZpvd(@NotNull android.content.Context context, @NotNull AppNotificationBizType appNotificationBizType);

    void copydefault(@NotNull android.content.Context context, @NotNull NotificationSettingChannel notificationSettingChannel, @NotNull AppNotificationBizType appNotificationBizType);
}
