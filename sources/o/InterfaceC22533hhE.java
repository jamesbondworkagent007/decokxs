package o;

import com.okinc.business.dex.api.bean.DexMarketCheckCoinDetailResultVo;
import com.okinc.business.dex.api.bean.DexMarketCheckCoinDetailVO;
import com.okinc.business.dexlogic.main.market.bean.CandlesticksBean;
import com.okinc.business.dexlogic.main.market.bean.CompositeInfoBean;
import com.okinc.business.dexlogic.main.market.bean.DexTokenCandleParam;
import com.okinc.business.dexlogic.main.market.bean.LatestMarketInfoBean;
import com.okinc.business.dexlogic.main.market.bean.SupportSwapData;
import com.okinc.business.market.data.model.MarketBuySellKLinePoint;
import com.okinc.network.okg.response.ResponseData;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hhE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC22533hhE extends InterfaceC22387heR {
    AbstractC58185ywX<java.util.List<CandlesticksBean>> AEQbTJ(@NotNull DexTokenCandleParam dexTokenCandleParam);

    AbstractC58185ywX<ResponseData<DexMarketCheckCoinDetailResultVo>> KWHzl(@NotNull DexMarketCheckCoinDetailVO dexMarketCheckCoinDetailVO);

    AbstractC58185ywX<SupportSwapData> KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2);

    AbstractC58185ywX<java.util.List<CandlesticksBean>> OLrzqt(@NotNull DexTokenCandleParam dexTokenCandleParam);

    AbstractC58185ywX<LatestMarketInfoBean> OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, java.lang.String str4);

    AbstractC58185ywX<java.util.List<MarketBuySellKLinePoint>> OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, java.lang.String str4, int i, @NotNull java.lang.String str5);

    AbstractC58185ywX<CompositeInfoBean> copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2);
}
