package o;

import com.okinc.okcomponents.feature.oknotificationcenter.impl.module.di.InfrastructureModule;

/* JADX INFO: renamed from: o.rZn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C42618rZn implements InterfaceC58162ywA<android.app.NotificationManager> {
    public final InterfaceC58164ywC<android.content.Context> KWHzl;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public android.app.NotificationManager get() {
        return EZpvd(this.KWHzl.get());
    }

    public static android.app.NotificationManager EZpvd(android.content.Context context) {
        return (android.app.NotificationManager) C58165ywD.KWHzl(InfrastructureModule.AEQbTJ.copydefault(context));
    }
}
