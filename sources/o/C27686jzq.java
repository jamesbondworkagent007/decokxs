package o;

import com.okinc.business.market.di.MemeModule;
import kotlinx.coroutines.CoroutineDispatcher;

/* JADX INFO: renamed from: o.jzq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C27686jzq implements InterfaceC58162ywA<C28800khc> {
    public final InterfaceC58164ywC<C28804khg> EZpvd;
    public final InterfaceC58164ywC<InterfaceC28744kgZ> KWHzl;
    public final InterfaceC58164ywC<CoroutineDispatcher> copydefault;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public C28800khc get() {
        return EZpvd(this.KWHzl.get(), this.EZpvd.get(), this.copydefault.get());
    }

    public static C28800khc EZpvd(InterfaceC28744kgZ interfaceC28744kgZ, C28804khg c28804khg, CoroutineDispatcher coroutineDispatcher) {
        return (C28800khc) C58165ywD.KWHzl(MemeModule.EZpvd.EZpvd(interfaceC28744kgZ, c28804khg, coroutineDispatcher));
    }
}
