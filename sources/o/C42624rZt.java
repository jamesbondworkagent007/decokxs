package o;

import com.okinc.okcomponents.feature.oknotificationcenter.impl.data.remote.NotificationSettingsService;
import com.okinc.okcomponents.feature.oknotificationcenter.impl.module.di.NotificationSettingsModule;

/* JADX INFO: renamed from: o.rZt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C42624rZt implements InterfaceC58162ywA<C42600rYw> {
    public final InterfaceC58164ywC<NotificationSettingsService> KWHzl;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public C42600rYw get() {
        return AEQbTJ(this.KWHzl.get());
    }

    public static C42600rYw AEQbTJ(NotificationSettingsService notificationSettingsService) {
        return (C42600rYw) C58165ywD.KWHzl(NotificationSettingsModule.Companion.EZpvd(notificationSettingsService));
    }
}
