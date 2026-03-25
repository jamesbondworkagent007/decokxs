package o;

import androidx.lifecycle.MutableLiveData;
import com.okinc.business.dex.trade.swap.priorityfee.data.model.SwapPriorityFeeInfo;
import com.okinc.business.dexlogic.bean.CommonDexInfo;
import com.okinc.business.dexlogic.bean.ConsumeData;
import com.okinc.business.dexlogic.bean.DefiPlatformInfo;
import com.okinc.business.dexlogic.bean.QuoteErrorBean;
import com.okinc.business.dexlogic.bean.QuotePriceRes;
import com.okinc.business.dexlogic.bean.TraceData;
import com.okinc.business.dexlogic.main.swap.trade.status.helper.CheckStep;
import com.okinc.business.dexlogic.main.swap.trade.status.helper.SwapState;
import com.okinc.business.dexlogic.main.swap.trade.status.helper.TradeStatePool;
import com.okinc.business.dexlogic.main.swap.trade.status.helper.TradeStep;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hpd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C22982hpd {
    public static final void KWHzl(@NotNull QuotePriceRes quotePriceRes, @NotNull TradeStatePool tradeStatePool, boolean z, @NotNull java.lang.String str, boolean z2) {
        Intrinsics.checkNotNullParameter(quotePriceRes, "");
        Intrinsics.checkNotNullParameter(tradeStatePool, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (!z) {
            tradeStatePool.refreshStatePool(new TradeStep(CheckStep.QUOTES, true, SwapState.HETEROGENEOUS_CHAIN_INVALID, true, false));
        } else if (quotePriceRes.isQuotesSafeMoonSlipError(str, z2)) {
            tradeStatePool.refreshStatePool(new TradeStep(CheckStep.QUOTES, true, SwapState.SAFE_MOON_SLIP_ERROR, true, false));
        } else if (quotePriceRes.isLeverage()) {
            tradeStatePool.refreshStatePool(new TradeStep(CheckStep.QUOTES, true, SwapState.STAND_BY_LEVERAGE, true, false));
        } else if (z2 && quotePriceRes.dAppRedirectDueToInsufficientLiquidity()) {
            tradeStatePool.refreshStatePool(new TradeStep(CheckStep.QUOTES, true, SwapState.SWAP_UNSUPPORTED_FOR_DAPP, true, false));
        } else {
            tradeStatePool.refreshStatePool(new TradeStep(CheckStep.QUOTES, true, SwapState.FETCHING_SUCCESS, false, true));
        }
        tradeStatePool.setQuotePriceSuccess(true);
    }

    public static /* synthetic */ void quoteFailStateProcessing$default(QuotePriceRes quotePriceRes, java.lang.String str, TradeStatePool tradeStatePool, MutableLiveData mutableLiveData, MutableLiveData mutableLiveData2, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = "default_trade";
        }
        KWHzl(quotePriceRes, str, tradeStatePool, mutableLiveData, mutableLiveData2, str2);
    }

    public static final void KWHzl(@NotNull QuotePriceRes quotePriceRes, @NotNull java.lang.String str, @NotNull TradeStatePool tradeStatePool, @NotNull MutableLiveData<QuotePriceRes> mutableLiveData, @NotNull MutableLiveData<ConsumeData<QuoteErrorBean>> mutableLiveData2, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(quotePriceRes, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(tradeStatePool, "");
        Intrinsics.checkNotNullParameter(mutableLiveData, "");
        Intrinsics.checkNotNullParameter(mutableLiveData2, "");
        Intrinsics.checkNotNullParameter(str2, "");
        tradeStatePool.setQuotePriceSuccess(false);
        CheckStep checkStep = CheckStep.QUOTES;
        tradeStatePool.refreshStatePool(new TradeStep(checkStep, true, SwapState.FETCHING_NONE, true, false));
        mutableLiveData.setValue(new QuotePriceRes((java.util.List) null, (java.util.List) null, (java.lang.String) null, new CommonDexInfo((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, quotePriceRes.getCommonDexInfo().isHoneypot(), (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, quotePriceRes.getCommonDexInfo().getFromToken(), quotePriceRes.getCommonDexInfo().getToToken(), (DefiPlatformInfo) null, quotePriceRes.getCommonDexInfo().getFromTokenPrice(), (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, -1441921, 15, (DefaultConstructorMarker) null), false, false, false, quotePriceRes.isSupportDappTrade(), (TraceData) null, (SwapPriorityFeeInfo) null, (java.lang.String) null, (java.lang.String) null, 3959, (DefaultConstructorMarker) null));
        if (quotePriceRes.isLeverage()) {
            tradeStatePool.refreshStatePool(new TradeStep(checkStep, true, SwapState.STAND_BY_LEVERAGE, true, false));
            mutableLiveData2.setValue(C22332hdP.EZpvd(new QuoteErrorBean((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 247, (DefaultConstructorMarker) null)));
            return;
        }
        if (quotePriceRes.isSingle() && quotePriceRes.dAppRedirectDueToInsufficientLiquidity()) {
            tradeStatePool.refreshStatePool(new TradeStep(checkStep, true, SwapState.SWAP_UNSUPPORTED_FOR_DAPP, true, false));
            mutableLiveData2.setValue(C22332hdP.EZpvd(new QuoteErrorBean((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 247, (DefaultConstructorMarker) null)));
            return;
        }
        if (Intrinsics.EZpvd((java.lang.Object) quotePriceRes.getCommonDexInfo().getCode(), (java.lang.Object) QuoteErrorBean.QUOTE_ERROR_VALUE_OUT_OF_SCOPE) || Intrinsics.EZpvd((java.lang.Object) quotePriceRes.getCommonDexInfo().getCode(), (java.lang.Object) QuoteErrorBean.QUOTE_ERROR_MIN_AMOUNT_LIMIT) || Intrinsics.EZpvd((java.lang.Object) quotePriceRes.getCommonDexInfo().getCode(), (java.lang.Object) QuoteErrorBean.QUOTE_ERROR_MAX_AMOUNT_LIMIT)) {
            mutableLiveData2.setValue(C22332hdP.EZpvd(new QuoteErrorBean(quotePriceRes.getCommonDexInfo().getCode(), (java.lang.String) null, quotePriceRes.getCommonDexInfo().getErrorMsg(), false, str2, quotePriceRes.getCommonDexInfo().getCrossMiniAmount(), quotePriceRes.getCommonDexInfo().getCrossMaxAmount(), (java.lang.String) null, 130, (DefaultConstructorMarker) null)));
            return;
        }
        if (Intrinsics.EZpvd((java.lang.Object) quotePriceRes.getCommonDexInfo().getCode(), (java.lang.Object) QuoteErrorBean.QUOTE_ERROR_TWO_NON_FACET_ETH) || Intrinsics.EZpvd((java.lang.Object) quotePriceRes.getCommonDexInfo().getCode(), (java.lang.Object) QuoteErrorBean.QUOTE_ERROR_ETH_AND_NON_FACET_ETH) || Intrinsics.EZpvd((java.lang.Object) quotePriceRes.getCommonDexInfo().getCode(), (java.lang.Object) QuoteErrorBean.QUOTE_ERROR_ERC20_AND_ANY_FACET_TOKEN) || Intrinsics.EZpvd((java.lang.Object) quotePriceRes.getCommonDexInfo().getCode(), (java.lang.Object) QuoteErrorBean.QUOTE_ERROR_ERC20_AND_FACET_ETH)) {
            mutableLiveData2.setValue(C22332hdP.EZpvd(new QuoteErrorBean(quotePriceRes.getCommonDexInfo().getCode(), (java.lang.String) null, quotePriceRes.getCommonDexInfo().getErrorMsg(), false, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 242, (DefaultConstructorMarker) null)));
            return;
        }
        if (Intrinsics.EZpvd((java.lang.Object) quotePriceRes.getCommonDexInfo().getCode(), (java.lang.Object) QuoteErrorBean.ORBITER_QUOTE_NO_QUOTE_FETCHED)) {
            mutableLiveData2.setValue(C22332hdP.EZpvd(new QuoteErrorBean(quotePriceRes.getCommonDexInfo().getCode(), (java.lang.String) null, (java.lang.String) null, false, str2, (java.lang.String) null, (java.lang.String) null, quotePriceRes.getCommonDexInfo().getCrossAccuracyLimit(), 102, (DefaultConstructorMarker) null)));
            return;
        }
        if (quotePriceRes.getCommonDexInfo().isThorswapBtcAddressError()) {
            mutableLiveData2.setValue(C22332hdP.EZpvd(new QuoteErrorBean(quotePriceRes.getCommonDexInfo().getCode(), (java.lang.String) null, quotePriceRes.getCommonDexInfo().getErrorMsg(), false, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 242, (DefaultConstructorMarker) null)));
            return;
        }
        if (Intrinsics.EZpvd((java.lang.Object) quotePriceRes.getCommonDexInfo().getCode(), (java.lang.Object) "0")) {
            mutableLiveData2.setValue(C22332hdP.EZpvd(new QuoteErrorBean(quotePriceRes.getCommonDexInfo().getCode(), (java.lang.String) null, "", false, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 242, (DefaultConstructorMarker) null)));
        } else if (quotePriceRes.isHoneypotErrorCode()) {
            tradeStatePool.refreshStatePool(new TradeStep(checkStep, true, SwapState.STAND_BY_DISH_WARNING, true, true));
            mutableLiveData2.setValue(C22332hdP.EZpvd(new QuoteErrorBean((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 247, (DefaultConstructorMarker) null)));
        } else {
            mutableLiveData2.setValue(C22332hdP.EZpvd(new QuoteErrorBean("0", (java.lang.String) null, quotePriceRes.getCommonDexInfo().getErrorMsg(), false, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 242, (DefaultConstructorMarker) null)));
        }
    }
}
