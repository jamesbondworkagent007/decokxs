package o;

import com.okinc.lifecycle.impl.di.LinkModule;

/* JADX INFO: renamed from: o.pOm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C38161pOm implements InterfaceC58162ywA<pMI> {
    public final LinkModule EZpvd;
    public final InterfaceC58164ywC<pLC> KWHzl;
    public final InterfaceC58164ywC<InterfaceC38106pMl> OLrzqt;
    public final InterfaceC58164ywC<InterfaceC38101pMg> copydefault;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public pMI get() {
        return AEQbTJ(this.EZpvd, this.OLrzqt.get(), this.copydefault.get(), this.KWHzl.get());
    }

    public static pMI AEQbTJ(LinkModule linkModule, InterfaceC38106pMl interfaceC38106pMl, InterfaceC38101pMg interfaceC38101pMg, pLC plc) {
        return (pMI) C58165ywD.KWHzl(linkModule.AEQbTJ(interfaceC38106pMl, interfaceC38101pMg, plc));
    }
}
