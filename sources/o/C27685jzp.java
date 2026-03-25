package o;

import com.okinc.business.market.di.MemeModule;
import kotlinx.coroutines.CoroutineDispatcher;

/* JADX INFO: renamed from: o.jzp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C27685jzp implements InterfaceC58162ywA<InterfaceC28744kgZ> {
    public final InterfaceC58164ywC<InterfaceC27595jyE> EZpvd;
    public final InterfaceC58164ywC<CoroutineDispatcher> KWHzl;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public InterfaceC28744kgZ get() {
        return OLrzqt(this.EZpvd.get(), this.KWHzl.get());
    }

    public static InterfaceC28744kgZ OLrzqt(InterfaceC27595jyE interfaceC27595jyE, CoroutineDispatcher coroutineDispatcher) {
        return (InterfaceC28744kgZ) C58165ywD.KWHzl(MemeModule.EZpvd.copydefault(interfaceC27595jyE, coroutineDispatcher));
    }
}
