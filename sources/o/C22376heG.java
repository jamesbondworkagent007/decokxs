package o;

import com.okinc.business.dexlogic.main.market.bean.CoinDetailPoolList;
import com.okinc.business.dexlogic.main.market.bean.CoinDetailPoolToken;
import com.okinc.business.dexlogic.main.market.bean.LiquidityPairData;
import com.okinc.business.dexui.main.market.detail.fragment.chart.pooltransactions.liquiditypools.itemviewbinding.liqpool.LiquidityPoolPairUIItem;
import com.okinc.business.dexui.main.market.detail.fragment.chart.pooltransactions.liquiditypools.itemviewbinding.liqpool.PoolTokenInfoUIItem;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.heG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C22376heG {
    public static final LiquidityPoolPairUIItem KWHzl(@NotNull CoinDetailPoolList coinDetailPoolList) {
        java.util.ArrayList arrayList;
        Intrinsics.checkNotNullParameter(coinDetailPoolList, "");
        java.util.List<CoinDetailPoolToken> poolTokenInfoList = coinDetailPoolList.getPoolTokenInfoList();
        if (poolTokenInfoList != null) {
            arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(poolTokenInfoList, 10));
            for (CoinDetailPoolToken coinDetailPoolToken : poolTokenInfoList) {
                java.lang.String amount = coinDetailPoolToken.getAmount();
                java.lang.String tokenAmountUsd = coinDetailPoolToken.getTokenAmountUsd();
                java.lang.String tokenSymbol = coinDetailPoolToken.getTokenSymbol();
                arrayList.add(new PoolTokenInfoUIItem(amount, tokenAmountUsd, coinDetailPoolToken.getTokenContractAddress(), coinDetailPoolToken.getTokenLogoUrl(), tokenSymbol));
            }
        } else {
            arrayList = null;
        }
        return new LiquidityPoolPairUIItem(coinDetailPoolList.getDexName(), coinDetailPoolList.getExplorerUrl(), coinDetailPoolList.getLiquidity(), coinDetailPoolList.getPairAddress(), coinDetailPoolList.getPoolLogoUrl(), (java.util.List) arrayList, false, 64, (DefaultConstructorMarker) null);
    }

    public static final java.util.List<LiquidityPoolPairUIItem> EZpvd(@NotNull LiquidityPairData liquidityPairData) {
        Intrinsics.checkNotNullParameter(liquidityPairData, "");
        java.util.List<CoinDetailPoolList> list = liquidityPairData.getList();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(KWHzl((CoinDetailPoolList) it.next()));
        }
        return arrayList;
    }
}
