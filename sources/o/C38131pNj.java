package o;

import com.okinc.lifecycle.impl.di.LifecycleModule;
import com.okinc.lifecycle.impl.net.LifecycleApiRetrofitService;

/* JADX INFO: renamed from: o.pNj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C38131pNj implements InterfaceC58162ywA<pKL> {
    public final InterfaceC58164ywC<C38069pLb> AEQbTJ;
    public final LifecycleModule KWHzl;
    public final InterfaceC58164ywC<LifecycleApiRetrofitService> copydefault;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public pKL get() {
        return copydefault(this.KWHzl, this.copydefault.get(), this.AEQbTJ.get());
    }

    public static pKL copydefault(LifecycleModule lifecycleModule, LifecycleApiRetrofitService lifecycleApiRetrofitService, C38069pLb c38069pLb) {
        return (pKL) C58165ywD.KWHzl(lifecycleModule.EZpvd(lifecycleApiRetrofitService, c38069pLb));
    }
}
