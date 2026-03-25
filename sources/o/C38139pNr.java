package o;

import com.okinc.lifecycle.impl.di.LifecycleOKCoreModule;

/* JADX INFO: renamed from: o.pNr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C38139pNr implements InterfaceC58162ywA<InterfaceC43294rma> {
    public final InterfaceC58164ywC<pLE> AEQbTJ;
    public final InterfaceC58164ywC<InterfaceC38118pMx> EZpvd;
    public final InterfaceC58164ywC<InterfaceC38101pMg> KWHzl;
    public final InterfaceC58164ywC<AUI> OLrzqt;
    public final InterfaceC58164ywC<pMM> copydefault;
    public final LifecycleOKCoreModule djBIcL;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public InterfaceC43294rma get() {
        return KWHzl(this.djBIcL, this.AEQbTJ.get(), this.KWHzl.get(), this.EZpvd.get(), this.copydefault.get(), this.OLrzqt.get());
    }

    public static InterfaceC43294rma KWHzl(LifecycleOKCoreModule lifecycleOKCoreModule, pLE ple, InterfaceC38101pMg interfaceC38101pMg, InterfaceC38118pMx interfaceC38118pMx, pMM pmm, AUI aui) {
        return (InterfaceC43294rma) C58165ywD.KWHzl(lifecycleOKCoreModule.copydefault(ple, interfaceC38101pMg, interfaceC38118pMx, pmm, aui));
    }
}
