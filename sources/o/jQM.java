package o;

import com.okinc.business.dexlogic.main.market.bean.LiquidityPairData;
import com.okinc.business.market.data.model.LiquidityChartData;
import com.okinc.business.market.features.data.repo.LiquidityRepoImpl$getLiquidityChart$3;
import com.okinc.business.market.features.data.repo.LiquidityRepoImpl$getLiquidityList$2;
import com.okinc.core.util.SPUtils;
import com.okinc.network.okg.response.OKServerException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class jQM implements jQL {
    public final int AEQbTJ;
    public final InterfaceC23229huL KWHzl;

    @yCM
    public jQM(@NotNull InterfaceC23229huL interfaceC23229huL) {
        Intrinsics.checkNotNullParameter(interfaceC23229huL, "");
        this.KWHzl = interfaceC23229huL;
        this.AEQbTJ = 5;
    }

    @Override // o.jQL
    public java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3, @NotNull Continuation<? super AbstractC43419rot<LiquidityChartData, OKServerException>> continuation) {
        java.util.HashMap map = new java.util.HashMap();
        map.put("chainId", str);
        map.put("tokenContractAddress", str2);
        if (str3 != null) {
            map.put("periodType", str3);
        }
        return kAB.EZpvd(new LiquidityRepoImpl$getLiquidityChart$3(this, map, null), continuation);
    }

    @Override // o.jQL
    public java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super AbstractC43419rot<LiquidityPairData, OKServerException>> continuation) {
        java.util.HashMap map = new java.util.HashMap();
        map.put("chainId", str);
        map.put("tokenContractAddress", str2);
        map.put("limit", C56443yFo.AEQbTJ(this.AEQbTJ));
        return kAB.EZpvd(new LiquidityRepoImpl$getLiquidityList$2(this, map, null), continuation);
    }

    @Override // o.jQL
    public void AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        SPUtils.put("dex_market_liquidity_period_type", str, "dex_market");
    }

    @Override // o.jQL
    public java.lang.String KWHzl(java.lang.String str) {
        return SPUtils.getString("dex_market_liquidity_period_type", str, "dex_market");
    }

    @Override // o.jQL
    public void EZpvd() {
        SPUtils.remove("dex_market_liquidity_period_type", "dex_market");
    }
}
