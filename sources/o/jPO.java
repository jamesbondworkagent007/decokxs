package o;

import com.okinc.business.market.features.coindetail_liquidity.LiquidityChangeModule;
import kotlinx.coroutines.CoroutineDispatcher;

/* JADX INFO: loaded from: classes6.dex */
public final class jPO implements InterfaceC58162ywA<jPU> {
    public final InterfaceC58164ywC<CoroutineDispatcher> AEQbTJ;
    public final InterfaceC58164ywC<jPR> EZpvd;
    public final InterfaceC58164ywC<InterfaceC27595jyE> copydefault;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public jPU get() {
        return KWHzl(this.copydefault.get(), this.EZpvd.get(), this.AEQbTJ.get());
    }

    public static jPU KWHzl(InterfaceC27595jyE interfaceC27595jyE, jPR jpr, CoroutineDispatcher coroutineDispatcher) {
        return (jPU) C58165ywD.KWHzl(LiquidityChangeModule.KWHzl.copydefault(interfaceC27595jyE, jpr, coroutineDispatcher));
    }
}
