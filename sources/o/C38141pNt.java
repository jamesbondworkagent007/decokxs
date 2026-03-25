package o;

import com.okinc.lifecycle.impl.di.LifecycleOKCoreModule;

/* JADX INFO: renamed from: o.pNt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C38141pNt implements InterfaceC58162ywA<pKD> {
    public final InterfaceC58164ywC<InterfaceC38120pMz> AEQbTJ;
    public final InterfaceC58164ywC<pMH> EZpvd;
    public final InterfaceC58164ywC<AUI> KWHzl;
    public final InterfaceC58164ywC<pMI> OLrzqt;
    public final LifecycleOKCoreModule copydefault;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public pKD get() {
        return AEQbTJ(this.copydefault, this.OLrzqt.get(), this.EZpvd.get(), this.KWHzl.get(), this.AEQbTJ.get());
    }

    public static pKD AEQbTJ(LifecycleOKCoreModule lifecycleOKCoreModule, pMI pmi, pMH pmh, AUI aui, InterfaceC38120pMz interfaceC38120pMz) {
        return (pKD) C58165ywD.KWHzl(lifecycleOKCoreModule.AEQbTJ(pmi, pmh, aui, interfaceC38120pMz));
    }
}
