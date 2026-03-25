package o;

import com.okinc.business.market.features.coindetail_liquidity.LiquidityChangeModule;
import kotlinx.serialization.json.Json;

/* JADX INFO: loaded from: classes6.dex */
public final class jPL implements InterfaceC58162ywA<jPR> {
    public final InterfaceC58164ywC<Json> AEQbTJ;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public jPR get() {
        return KWHzl(this.AEQbTJ.get());
    }

    public static jPR KWHzl(Json json) {
        return (jPR) C58165ywD.KWHzl(LiquidityChangeModule.KWHzl.KWHzl(json));
    }
}
