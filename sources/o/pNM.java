package o;

import com.okinc.lifecycle.impl.di.LinkModule;

/* JADX INFO: loaded from: classes9.dex */
public final class pNM implements InterfaceC58162ywA<InterfaceC38113pMs> {
    public final InterfaceC58164ywC<pMK> EZpvd;
    public final InterfaceC58164ywC<InterfaceC47278tmy> KWHzl;
    public final InterfaceC58164ywC<InterfaceC33253msv> OLrzqt;
    public final LinkModule copydefault;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public InterfaceC38113pMs get() {
        return OLrzqt(this.copydefault, this.KWHzl.get(), this.EZpvd.get(), this.OLrzqt.get());
    }

    public static InterfaceC38113pMs OLrzqt(LinkModule linkModule, InterfaceC47278tmy interfaceC47278tmy, pMK pmk, InterfaceC33253msv interfaceC33253msv) {
        return (InterfaceC38113pMs) C58165ywD.KWHzl(linkModule.OLrzqt(interfaceC47278tmy, pmk, interfaceC33253msv));
    }
}
