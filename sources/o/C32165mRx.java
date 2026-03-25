package o;

import com.okinc.dexkline.dexlogic.main.market.bean.DexTokenCandleParam;
import com.okinc.dexkline.dexlogic.main.market.bean.LatestMarketInfoBean;
import com.okinc.dexkline.dexlogic.main.market.bean.SupportSwapData;
import com.okinc.dexkline.market.data.model.MarketBuySellKLinePoint;
import com.okinc.network.okg.response.ResponseData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mRx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C32165mRx {
    @yCM
    public C32165mRx() {
    }

    public final InterfaceC32162mRu EZpvd() {
        return InterfaceC32162mRu.Companion.EZpvd(C32160mRs.KWHzl);
    }

    public final AbstractC58185ywX<ResponseData<LatestMarketInfoBean>> copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, java.lang.String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return C33024moe.KWHzl((AbstractC58185ywX) EZpvd().OLrzqt(str, str2, str3, str4));
    }

    public final AbstractC58185ywX<ResponseData<SupportSwapData>> OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return C33024moe.KWHzl((AbstractC58185ywX) EZpvd().copydefault(str, str2));
    }

    public final AbstractC58185ywX<ResponseData<java.util.List<java.util.List<java.lang.String>>>> copydefault(@NotNull DexTokenCandleParam dexTokenCandleParam) {
        Intrinsics.checkNotNullParameter(dexTokenCandleParam, "");
        return C33024moe.KWHzl((AbstractC58185ywX) EZpvd().AEQbTJ(dexTokenCandleParam.getChainId(), dexTokenCandleParam.getAddress(), dexTokenCandleParam.getAfter(), dexTokenCandleParam.getBefore(), dexTokenCandleParam.getBar(), dexTokenCandleParam.getLimit()));
    }

    public final AbstractC58185ywX<ResponseData<java.util.List<MarketBuySellKLinePoint>>> EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, java.lang.String str4, int i, @NotNull java.lang.String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str5, "");
        if (str5.length() > 0) {
            return C33024moe.KWHzl((AbstractC58185ywX) EZpvd().EZpvd(str, i, str2, str3, str5));
        }
        return C33024moe.KWHzl((AbstractC58185ywX) EZpvd().KWHzl(str, i, str2, str3, str4));
    }

    public final AbstractC58185ywX<ResponseData<java.util.List<java.util.List<java.lang.String>>>> AEQbTJ(@NotNull DexTokenCandleParam dexTokenCandleParam) {
        Intrinsics.checkNotNullParameter(dexTokenCandleParam, "");
        return C33024moe.KWHzl((AbstractC58185ywX) EZpvd().EZpvd(dexTokenCandleParam.getChainId(), dexTokenCandleParam.getAddress(), dexTokenCandleParam.getAfter(), dexTokenCandleParam.getBefore(), dexTokenCandleParam.getBar(), dexTokenCandleParam.getLimit()));
    }
}
