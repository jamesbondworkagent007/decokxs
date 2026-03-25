package o;

import com.okinc.okcomponents.feature.oknotificationcenter.impl.data.remote.NotificationSettingsService;
import com.okinc.okcomponents.feature.oknotificationcenter.impl.module.di.NotificationSettingsModule;

/* JADX INFO: renamed from: o.rZs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C42623rZs implements InterfaceC58162ywA<NotificationSettingsService> {
    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public NotificationSettingsService get() {
        return KWHzl();
    }

    public static NotificationSettingsService KWHzl() {
        return (NotificationSettingsService) C58165ywD.KWHzl(NotificationSettingsModule.Companion.KWHzl());
    }
}
