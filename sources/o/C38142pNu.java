package o;

import com.okinc.lifecycle.impl.di.LifecycleOKCoreModule;

/* JADX INFO: renamed from: o.pNu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C38142pNu implements InterfaceC58162ywA<InterfaceC38120pMz> {
    public final LifecycleOKCoreModule AEQbTJ;
    public final InterfaceC58164ywC<pLH> EZpvd;
    public final InterfaceC58164ywC<pMX> KWHzl;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public InterfaceC38120pMz get() {
        return OLrzqt(this.AEQbTJ, this.KWHzl.get(), this.EZpvd.get());
    }

    public static InterfaceC38120pMz OLrzqt(LifecycleOKCoreModule lifecycleOKCoreModule, pMX pmx, pLH plh) {
        return (InterfaceC38120pMz) C58165ywD.KWHzl(lifecycleOKCoreModule.EZpvd(pmx, plh));
    }
}
