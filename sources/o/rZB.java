package o;

import com.okinc.okcomponents.feature.oknotificationcenter.impl.module.di.SystemPushModule;

/* JADX INFO: loaded from: classes10.dex */
public final class rZB implements InterfaceC58162ywA<C42629rZy> {
    public final InterfaceC58164ywC<C42596rYs> KWHzl;
    public final InterfaceC58164ywC<InterfaceC47278tmy> OLrzqt;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public C42629rZy get() {
        return AEQbTJ(this.KWHzl.get(), this.OLrzqt.get());
    }

    public static C42629rZy AEQbTJ(C42596rYs c42596rYs, InterfaceC47278tmy interfaceC47278tmy) {
        return (C42629rZy) C58165ywD.KWHzl(SystemPushModule.Companion.EZpvd(c42596rYs, interfaceC47278tmy));
    }
}
