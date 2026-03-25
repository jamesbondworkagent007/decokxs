package o;

import com.okinc.business.market.features.coindetail_liquidity.LiquidityChangeModule;
import kotlinx.coroutines.CoroutineDispatcher;

/* JADX INFO: loaded from: classes6.dex */
public final class jPP implements InterfaceC58162ywA<jPQ> {
    public final InterfaceC58164ywC<CoroutineDispatcher> AEQbTJ;
    public final InterfaceC58164ywC<InterfaceC27595jyE> EZpvd;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public jPQ get() {
        return copydefault(this.EZpvd.get(), this.AEQbTJ.get());
    }

    public static jPQ copydefault(InterfaceC27595jyE interfaceC27595jyE, CoroutineDispatcher coroutineDispatcher) {
        return (jPQ) C58165ywD.KWHzl(LiquidityChangeModule.KWHzl.OLrzqt(interfaceC27595jyE, coroutineDispatcher));
    }
}
