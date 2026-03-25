package o;

import com.okinc.lifecycle.impl.di.LinkModule;

/* JADX INFO: renamed from: o.pOh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C38156pOh implements InterfaceC58162ywA<InterfaceC38100pMf> {
    public final InterfaceC58164ywC<pMX> AEQbTJ;
    public final InterfaceC58164ywC<InterfaceC47278tmy> AhwBna;
    public final InterfaceC58164ywC<InterfaceC38084pLq> EZpvd;
    public final InterfaceC58164ywC<pMV> KWHzl;
    public final InterfaceC58164ywC<InterfaceC38081pLn> OLrzqt;
    public final InterfaceC58164ywC<InterfaceC38089pLv> copydefault;
    public final LinkModule gEmmrt;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public InterfaceC38100pMf get() {
        return copydefault(this.gEmmrt, this.KWHzl.get(), this.AEQbTJ.get(), this.EZpvd.get(), this.copydefault.get(), this.OLrzqt.get(), this.AhwBna.get());
    }

    public static InterfaceC38100pMf copydefault(LinkModule linkModule, pMV pmv, pMX pmx, InterfaceC38084pLq interfaceC38084pLq, InterfaceC38089pLv interfaceC38089pLv, InterfaceC38081pLn interfaceC38081pLn, InterfaceC47278tmy interfaceC47278tmy) {
        return (InterfaceC38100pMf) C58165ywD.KWHzl(linkModule.KWHzl(pmv, pmx, interfaceC38084pLq, interfaceC38089pLv, interfaceC38081pLn, interfaceC47278tmy));
    }
}
