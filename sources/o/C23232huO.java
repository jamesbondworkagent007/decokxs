package o;

import com.okinc.business.dex.api.bean.DexMarketCheckCoinDetailResultVo;
import com.okinc.business.dex.api.bean.DexMarketCheckCoinDetailVO;
import com.okinc.business.dexlogic.main.market.bean.CompositeInfoBean;
import com.okinc.business.dexlogic.main.market.bean.DexTokenCandleParam;
import com.okinc.business.dexlogic.main.market.bean.LatestMarketInfoBean;
import com.okinc.business.dexlogic.main.market.bean.SupportSwapData;
import com.okinc.business.market.data.model.MarketBuySellKLinePoint;
import com.okinc.network.okg.response.ResponseData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.huO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23232huO {
    @yCM
    public C23232huO() {
    }

    public final InterfaceC23229huL AEQbTJ() {
        return InterfaceC23229huL.Companion.EZpvd(C23222huE.AEQbTJ);
    }

    public final AbstractC58185ywX<ResponseData<DexMarketCheckCoinDetailResultVo>> EZpvd(@NotNull DexMarketCheckCoinDetailVO dexMarketCheckCoinDetailVO) {
        Intrinsics.checkNotNullParameter(dexMarketCheckCoinDetailVO, "");
        return C33024moe.KWHzl((AbstractC58185ywX) AEQbTJ().OLrzqt(dexMarketCheckCoinDetailVO));
    }

    public final AbstractC58185ywX<ResponseData<LatestMarketInfoBean>> copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, java.lang.String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return C33024moe.KWHzl((AbstractC58185ywX) AEQbTJ().AEQbTJ(str, str2, str3, str4));
    }

    public final AbstractC58185ywX<ResponseData<SupportSwapData>> copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return C33024moe.KWHzl((AbstractC58185ywX) AEQbTJ().OLrzqt(str, str2));
    }

    public final AbstractC58185ywX<ResponseData<CompositeInfoBean>> KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return C33024moe.KWHzl((AbstractC58185ywX) AEQbTJ().KWHzl(str, str2));
    }

    public final AbstractC58185ywX<ResponseData<java.util.List<java.util.List<java.lang.String>>>> AEQbTJ(@NotNull DexTokenCandleParam dexTokenCandleParam) {
        Intrinsics.checkNotNullParameter(dexTokenCandleParam, "");
        return C33024moe.KWHzl((AbstractC58185ywX) AEQbTJ().AEQbTJ(dexTokenCandleParam.getChainId(), dexTokenCandleParam.getAddress(), dexTokenCandleParam.getAfter(), dexTokenCandleParam.getBefore(), dexTokenCandleParam.getBar(), dexTokenCandleParam.getLimit()));
    }

    public final AbstractC58185ywX<ResponseData<java.util.List<MarketBuySellKLinePoint>>> copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, java.lang.String str4, int i, @NotNull java.lang.String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str5, "");
        if (str5.length() > 0) {
            return C33024moe.KWHzl((AbstractC58185ywX) AEQbTJ().KWHzl(str, i, str2, str3, str5));
        }
        return C33024moe.KWHzl((AbstractC58185ywX) AEQbTJ().OLrzqt(str, i, str2, str3, str4));
    }

    public final AbstractC58185ywX<ResponseData<java.util.List<java.util.List<java.lang.String>>>> OLrzqt(@NotNull DexTokenCandleParam dexTokenCandleParam) {
        Intrinsics.checkNotNullParameter(dexTokenCandleParam, "");
        return C33024moe.KWHzl((AbstractC58185ywX) AEQbTJ().OLrzqt(dexTokenCandleParam.getChainId(), dexTokenCandleParam.getAddress(), dexTokenCandleParam.getAfter(), dexTokenCandleParam.getBefore(), dexTokenCandleParam.getBar(), dexTokenCandleParam.getLimit()));
    }
}
