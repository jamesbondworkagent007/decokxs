package o;

import com.okinc.business.market.features.coindetail_liquidity.LiquidityChangeModule;
import kotlinx.coroutines.CoroutineDispatcher;

/* JADX INFO: loaded from: classes6.dex */
public final class jPN implements InterfaceC58162ywA<jPS> {
    public final InterfaceC58164ywC<CoroutineDispatcher> AEQbTJ;
    public final InterfaceC58164ywC<jPU> OLrzqt;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public jPS get() {
        return AEQbTJ(this.OLrzqt.get(), this.AEQbTJ.get());
    }

    public static jPS AEQbTJ(jPU jpu, CoroutineDispatcher coroutineDispatcher) {
        return (jPS) C58165ywD.KWHzl(LiquidityChangeModule.KWHzl.OLrzqt(jpu, coroutineDispatcher));
    }
}
