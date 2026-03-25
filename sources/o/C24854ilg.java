package o;

import com.okinc.business.dexui.main.swap.trade.savings.di.SavingsModule;
import kotlinx.coroutines.CoroutineDispatcher;

/* JADX INFO: renamed from: o.ilg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C24854ilg implements InterfaceC58162ywA<InterfaceC24852ile> {
    public final InterfaceC58164ywC<CoroutineDispatcher> EZpvd;
    public final InterfaceC58164ywC<InterfaceC23234huQ> KWHzl;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public InterfaceC24852ile get() {
        return AEQbTJ(this.KWHzl.get(), this.EZpvd.get());
    }

    public static InterfaceC24852ile AEQbTJ(InterfaceC23234huQ interfaceC23234huQ, CoroutineDispatcher coroutineDispatcher) {
        return (InterfaceC24852ile) C58165ywD.KWHzl(SavingsModule.KWHzl.EZpvd(interfaceC23234huQ, coroutineDispatcher));
    }
}
