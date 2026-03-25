package o;

import com.okinc.dexkline.dexlogic.main.market.bean.CandlesticksBean;
import com.okinc.dexkline.dexlogic.main.market.bean.DexTokenCandleParam;
import com.okinc.dexkline.dexlogic.main.market.bean.LatestMarketInfoBean;
import com.okinc.dexkline.dexlogic.main.market.bean.SupportSwapData;
import com.okinc.dexkline.market.data.model.MarketBuySellKLinePoint;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mQc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public interface InterfaceC32117mQc {
    AbstractC58185ywX<java.util.List<MarketBuySellKLinePoint>> AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, java.lang.String str4, int i, @NotNull java.lang.String str5);

    AbstractC58185ywX<java.util.List<CandlesticksBean>> KWHzl(@NotNull DexTokenCandleParam dexTokenCandleParam);

    AbstractC58185ywX<LatestMarketInfoBean> KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, java.lang.String str4);

    AbstractC58185ywX<java.util.List<CandlesticksBean>> OLrzqt(@NotNull DexTokenCandleParam dexTokenCandleParam);

    AbstractC58185ywX<SupportSwapData> OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2);
}
