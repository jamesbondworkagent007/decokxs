package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.okcomponents.feature.oknotificationcenter.impl.data.remote.NotificationSettingsService;
import com.okinc.okcomponents.feature.oknotificationcenter.impl.presentation.advancedsettings.model.NotificationAdvancedSettings;
import com.okinc.okcomponents.feature.oknotificationcenter.impl.presentation.advancedsettings.model.SwitchNotificationSettingsChannelReq;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rYw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@yCR
public final class C42600rYw {
    public final NotificationSettingsService OLrzqt;

    @yCM
    public C42600rYw(@NotNull NotificationSettingsService notificationSettingsService) {
        Intrinsics.checkNotNullParameter(notificationSettingsService, "");
        this.OLrzqt = notificationSettingsService;
    }

    public final java.lang.Object copydefault(int i, @NotNull Continuation<? super ResponseData<java.util.List<NotificationAdvancedSettings>>> continuation) {
        return this.OLrzqt.getNotificationAdvanceSettings(i, continuation);
    }

    public final java.lang.Object KWHzl(@NotNull SwitchNotificationSettingsChannelReq switchNotificationSettingsChannelReq, @NotNull Continuation<? super ResponseData<Unit>> continuation) {
        return this.OLrzqt.updateNotificationSettingsChannel(switchNotificationSettingsChannelReq, continuation);
    }
}
