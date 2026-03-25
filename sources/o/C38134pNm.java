package o;

import com.okinc.lifecycle.impl.di.LifecycleModule;

/* JADX INFO: renamed from: o.pNm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C38134pNm implements InterfaceC58162ywA<pMH> {
    public final LifecycleModule AEQbTJ;
    public final InterfaceC58164ywC<InterfaceC38081pLn> EZpvd;
    public final InterfaceC58164ywC<pMX> copydefault;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public pMH get() {
        return OLrzqt(this.AEQbTJ, this.EZpvd.get(), this.copydefault.get());
    }

    public static pMH OLrzqt(LifecycleModule lifecycleModule, InterfaceC38081pLn interfaceC38081pLn, pMX pmx) {
        return (pMH) C58165ywD.KWHzl(lifecycleModule.KWHzl(interfaceC38081pLn, pmx));
    }
}
