package o;

import com.okinc.lifecycle.impl.di.LifecycleModule;
import com.okinc.lifecycle.impl.net.LifecycleApiRetrofitService;

/* JADX INFO: renamed from: o.pNi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C38130pNi implements InterfaceC58162ywA<LifecycleApiRetrofitService> {
    public final LifecycleModule copydefault;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public LifecycleApiRetrofitService get() {
        return OLrzqt(this.copydefault);
    }

    public static LifecycleApiRetrofitService OLrzqt(LifecycleModule lifecycleModule) {
        return (LifecycleApiRetrofitService) C58165ywD.KWHzl(lifecycleModule.AEQbTJ());
    }
}
