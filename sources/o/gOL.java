package o;

import com.okinc.business.dex.trade.common.reminder.BusinessType;
import com.okinc.business.dex.trade.common.reminder.PreCheckModel;
import com.okinc.business.dex.trade.common.reminder.PreCheckReminderType;
import com.okinc.business.dex.trade.common.reminder.PreCheckStatus;
import com.okinc.business.dex.trade.common.reminder.ReminderInfoConfig;
import com.okinc.business.dex.trade.common.reminder.ReminderShowType;
import com.okinc.business.dex.trade.common.reminder.TradeReminderType;
import com.okinc.business.dex.trade.common.reminder.data.PreCheckOrderStatus;
import com.okinc.business.dex.trade.common.reminder.data.PreCheckOrderWarning;
import com.okinc.business.dex.trade.common.reminder.data.ReminderListConfig;
import com.okinc.business.dex.trade.core.domain.model.V6BaseQuoteResponse;
import com.okinc.business.dex.trade.core.domain.model.limit.TokenPairRateQuote;
import com.okinc.business.dexlogic.bean.DefiChainInfo;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.bean.PreCheckBean;
import com.okinc.business.dexui.main.swap.widget.slippage.SlippageMode;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class gOL {
    public static final gOL EZpvd = new gOL();

    private gOL() {
    }

    public final ReminderListConfig KWHzl(PreCheckModel preCheckModel, @NotNull BusinessType businessType, @NotNull DefiChainInfo defiChainInfo, V6BaseQuoteResponse v6BaseQuoteResponse, java.lang.Throwable th, java.lang.Throwable th2, @NotNull SlippageMode slippageMode, java.lang.String str, java.lang.String str2, java.lang.String str3, DexMultiTokenInfoBean dexMultiTokenInfoBean, DexMultiTokenInfoBean dexMultiTokenInfoBean2, int i, int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4, @NotNull InterfaceC19780gPa interfaceC19780gPa, @NotNull gOT got, boolean z5) {
        Intrinsics.checkNotNullParameter(businessType, "");
        Intrinsics.checkNotNullParameter(defiChainInfo, "");
        Intrinsics.checkNotNullParameter(slippageMode, "");
        Intrinsics.checkNotNullParameter(interfaceC19780gPa, "");
        Intrinsics.checkNotNullParameter(got, "");
        return gOS.OLrzqt.copydefault(new C19783gPd(preCheckModel, businessType, defiChainInfo, v6BaseQuoteResponse != null ? new gOK(v6BaseQuoteResponse) : null, th, th2, slippageMode, str, str2, str3, dexMultiTokenInfoBean, dexMultiTokenInfoBean2, i, i2, i3, z, z2, z3, z4, z5, null, z5 ? java.lang.Long.valueOf(java.lang.System.currentTimeMillis() + 604800000) : null, interfaceC19780gPa, got, null, android.R.raw.loaderror, null));
    }

    public final ReminderListConfig KWHzl(PreCheckModel preCheckModel, @NotNull BusinessType businessType, @NotNull DefiChainInfo defiChainInfo, TokenPairRateQuote tokenPairRateQuote, java.lang.Throwable th, java.lang.Throwable th2, @NotNull SlippageMode slippageMode, java.lang.String str, java.lang.String str2, java.lang.String str3, DexMultiTokenInfoBean dexMultiTokenInfoBean, DexMultiTokenInfoBean dexMultiTokenInfoBean2, int i, int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4, @NotNull InterfaceC19780gPa interfaceC19780gPa, @NotNull gOT got, boolean z5, java.lang.String str4, long j, InterfaceC9738bbJ interfaceC9738bbJ) {
        Intrinsics.checkNotNullParameter(businessType, "");
        Intrinsics.checkNotNullParameter(defiChainInfo, "");
        Intrinsics.checkNotNullParameter(slippageMode, "");
        Intrinsics.checkNotNullParameter(interfaceC19780gPa, "");
        Intrinsics.checkNotNullParameter(got, "");
        return gOS.OLrzqt.copydefault(new C19783gPd(preCheckModel, businessType, defiChainInfo, tokenPairRateQuote != null ? new gOO(tokenPairRateQuote) : null, th, th2, slippageMode, str, str2, str3, dexMultiTokenInfoBean, dexMultiTokenInfoBean2, i, i2, i3, z, z2, z3, z4, z5, str4, java.lang.Long.valueOf(j), interfaceC19780gPa, got, interfaceC9738bbJ));
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.gON.KWHzl(com.okinc.business.dex.trade.common.reminder.TradeReminderType, com.okinc.business.dex.trade.common.reminder.PreCheckModel, com.okinc.business.dex.trade.common.reminder.BusinessType, com.okinc.business.dexlogic.bean.DefiChainInfo, o.gOU, java.lang.Throwable, com.okinc.business.dexui.main.swap.widget.slippage.SlippageMode, java.lang.String, java.lang.String, com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean, com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean, int, int, o.gPa, o.gOT, o.gLQ):kotlin.Pair */
    public final ReminderInfoConfig OLrzqt(@NotNull TradeReminderType tradeReminderType, PreCheckModel preCheckModel, @NotNull BusinessType businessType, @NotNull DefiChainInfo defiChainInfo, gOU gou, java.lang.Throwable th, java.lang.Throwable th2, @NotNull SlippageMode slippageMode, java.lang.String str, java.lang.String str2, java.lang.String str3, DexMultiTokenInfoBean dexMultiTokenInfoBean, DexMultiTokenInfoBean dexMultiTokenInfoBean2, int i, int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4, @NotNull InterfaceC19780gPa interfaceC19780gPa, gOT got, boolean z5) {
        ReminderShowType reminderShowTypeCopydefault;
        Intrinsics.checkNotNullParameter(tradeReminderType, "");
        Intrinsics.checkNotNullParameter(businessType, "");
        Intrinsics.checkNotNullParameter(defiChainInfo, "");
        Intrinsics.checkNotNullParameter(slippageMode, "");
        Intrinsics.checkNotNullParameter(interfaceC19780gPa, "");
        gLQ glqKWHzl = null;
        if (tradeReminderType == TradeReminderType.None || tradeReminderType == TradeReminderType.ConnectWallet || tradeReminderType == TradeReminderType.AntiMevInstability) {
            return null;
        }
        if (z2 && got != null) {
            glqKWHzl = got.KWHzl(defiChainInfo.getChainId());
        }
        gLQ glq = glqKWHzl;
        if (tradeReminderType != TradeReminderType.TokenHoneypot) {
            reminderShowTypeCopydefault = gON.copydefault(tradeReminderType);
        } else {
            boolean z6 = dexMultiTokenInfoBean != null && dexMultiTokenInfoBean.isHoneypotToken();
            boolean z7 = (gou == null && th == null) ? false : true;
            if (z6 && !z7) {
                reminderShowTypeCopydefault = ReminderShowType.Warning;
            } else {
                reminderShowTypeCopydefault = ReminderShowType.Critical;
            }
        }
        ReminderShowType reminderShowType = reminderShowTypeCopydefault;
        kotlin.Pair pairCopydefault = gON.copydefault(tradeReminderType, preCheckModel, businessType, defiChainInfo, gou, th, slippageMode, str, str2, dexMultiTokenInfoBean, dexMultiTokenInfoBean2, i, i2, interfaceC19780gPa, got, glq);
        return new ReminderInfoConfig(tradeReminderType, (java.lang.String) pairCopydefault.component1(), (java.lang.String) pairCopydefault.component2(), reminderShowType, gON.OLrzqt(tradeReminderType, got, glq));
    }

    public final boolean OLrzqt(@NotNull DefiChainInfo defiChainInfo) {
        Intrinsics.checkNotNullParameter(defiChainInfo, "");
        return copydefault(defiChainInfo);
    }

    public final boolean copydefault(DefiChainInfo defiChainInfo) {
        return defiChainInfo.swapUnsupportedNetworkForDAppRedirect() || defiChainInfo.swapNotSupportedForDAppRedirect();
    }

    public final TradeReminderType KWHzl(DexMultiTokenInfoBean dexMultiTokenInfoBean, DexMultiTokenInfoBean dexMultiTokenInfoBean2, gOU gou, java.lang.Throwable th) {
        boolean z = true;
        if ((dexMultiTokenInfoBean != null && dexMultiTokenInfoBean.isLeverage()) || (dexMultiTokenInfoBean2 != null && dexMultiTokenInfoBean2.isLeverage())) {
            return TradeReminderType.TokenHighRiskLeverage;
        }
        boolean z2 = (dexMultiTokenInfoBean != null && dexMultiTokenInfoBean.isHoneypotToken()) || (dexMultiTokenInfoBean2 != null && dexMultiTokenInfoBean2.isHoneypotToken());
        if (gou == null && th == null) {
            z = false;
        }
        if (!z2 || z) {
            return null;
        }
        return TradeReminderType.TokenHoneypot;
    }

    public static /* synthetic */ TradeReminderType checkQuoteError$OKDex_dex_impl$default(gOL gol, java.lang.Throwable th, gOU gou, int i, int i2, boolean z, int i3, java.lang.Object obj) {
        if ((i3 & 16) != 0) {
            z = false;
        }
        return gol.KWHzl(th, gou, i, i2, z);
    }

    public final TradeReminderType KWHzl(java.lang.Throwable th, gOU gou, int i, int i2, boolean z) {
        if (th == null) {
            return null;
        }
        if (z) {
            C31212lpk c31212lpk = C31212lpk.copydefault;
            if (c31212lpk.KWHzl(th)) {
                return TradeReminderType.QuoteBlackAddress;
            }
            if (c31212lpk.AEQbTJ(th)) {
                return TradeReminderType.QuoteHoneypot;
            }
            if (c31212lpk.OLrzqt(th)) {
                return TradeReminderType.QuoteNewAddress;
            }
        }
        C31212lpk c31212lpk2 = C31212lpk.copydefault;
        if (c31212lpk2.EZpvd(th)) {
            return TradeReminderType.QuoteDapp;
        }
        if (!c31212lpk2.djBIcL(th) && (!c31212lpk2.copydefault(th) || !z)) {
            return c31212lpk2.valueOf(th) ? TradeReminderType.ServiceSuspendedRecommendDapp : TradeReminderType.QuoteFailed;
        }
        if (i > 0 && i > i2) {
            return TradeReminderType.NoLiquidityForOKX;
        }
        return TradeReminderType.QuoteNoLiquidityFallback;
    }

    public static /* synthetic */ TradeReminderType checkQuoteResponse$OKDex_dex_impl$default(gOL gol, gOU gou, DefiChainInfo defiChainInfo, int i, int i2, boolean z, boolean z2, int i3, java.lang.Object obj) {
        if ((i3 & 32) != 0) {
            z2 = false;
        }
        return gol.copydefault(gou, defiChainInfo, i, i2, z, z2);
    }

    public final TradeReminderType copydefault(gOU gou, @NotNull DefiChainInfo defiChainInfo, int i, int i2, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(defiChainInfo, "");
        if (gou == null) {
            return null;
        }
        if (z2) {
            java.lang.String strOLrzqt = gou.OLrzqt();
            java.lang.Integer intOrNull = strOLrzqt != null ? StringsKt__StringNumberConversionsKt.toIntOrNull(strOLrzqt) : null;
            if (intOrNull != null) {
                C31212lpk c31212lpk = C31212lpk.copydefault;
                if (c31212lpk.EZpvd(intOrNull.intValue())) {
                    return TradeReminderType.QuoteBlackAddress;
                }
                if (c31212lpk.OLrzqt(intOrNull.intValue())) {
                    return TradeReminderType.TokenHoneypot;
                }
            }
        }
        if (!gou.values()) {
            if (i > 0 && i > i2) {
                return TradeReminderType.NoLiquidityForOKX;
            }
            java.lang.String strAhwBna = gou.AhwBna();
            if ((strAhwBna != null ? strAhwBna : "").length() > 0) {
                return TradeReminderType.QuoteNoLiquidityServer;
            }
            return TradeReminderType.QuoteNoLiquidityFallback;
        }
        if (z && !KWHzl(gou)) {
            return TradeReminderType.NoSupportTPLS;
        }
        if (gou.AkhnZx() && gou.ejfBZ()) {
            return TradeReminderType.QuoteValueDiffExceeded;
        }
        if (i <= 0 || i <= i2 || !gou.isConnected()) {
            return null;
        }
        return TradeReminderType.NoLiquidityForOKXWarning;
    }

    public final boolean KWHzl(gOU gou) {
        return gou.fetchVPNInfo();
    }

    public final TradeReminderType KWHzl(gOU gou, @NotNull DefiChainInfo defiChainInfo, @NotNull BusinessType businessType, java.lang.String str) {
        Intrinsics.checkNotNullParameter(defiChainInfo, "");
        Intrinsics.checkNotNullParameter(businessType, "");
        if (!businessType.isLimit()) {
            return null;
        }
        java.lang.String limitOrderTradeMinUSD = defiChainInfo.getLimitOrderTradeMinUSD();
        java.lang.String strValueOf = gou != null ? gou.valueOf() : null;
        if (C23313hvq.OLrzqt(limitOrderTradeMinUSD, 0) && C23313hvq.OLrzqt(strValueOf, 0) && C23313hvq.OLrzqt(str, 0)) {
            if (C23313hvq.KWHzl(str != null ? C23313hvq.mulCheckS$default(str, strValueOf, null, null, null, 14, null) : null, limitOrderTradeMinUSD)) {
                return TradeReminderType.LimitMiniTradeAmount;
            }
        }
        return null;
    }

    public final TradeReminderType KWHzl(gOU gou, DexMultiTokenInfoBean dexMultiTokenInfoBean, DexMultiTokenInfoBean dexMultiTokenInfoBean2) {
        DexMultiTokenInfoBean dexMultiTokenInfoBeanDjBIcL;
        DexMultiTokenInfoBean dexMultiTokenInfoBeanAYXKKw;
        if ((gou != null && (dexMultiTokenInfoBeanAYXKKw = gou.AYXKKw()) != null && dexMultiTokenInfoBeanAYXKKw.isSafeMoonCoinToken()) || (gou != null && (dexMultiTokenInfoBeanDjBIcL = gou.djBIcL()) != null && dexMultiTokenInfoBeanDjBIcL.isSafeMoonCoinToken())) {
            boolean z = dexMultiTokenInfoBean != null && dexMultiTokenInfoBean.isHoneypotToken();
            boolean z2 = dexMultiTokenInfoBean2 != null && dexMultiTokenInfoBean2.isHoneypotToken();
            if (!z && !z2) {
                java.lang.String strDbNXlk = gou != null ? gou.DbNXlk() : null;
                if (strDbNXlk != null && !StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strDbNXlk)) {
                    return TradeReminderType.QuoteSafemoon;
                }
            }
        }
        return null;
    }

    public final PreCheckModel KWHzl(@NotNull PreCheckBean preCheckBean) {
        PreCheckReminderType preCheckReminderType;
        Intrinsics.checkNotNullParameter(preCheckBean, "");
        PreCheckStatus preCheckStatus = preCheckBean.getStatus() == PreCheckOrderStatus.PRE_CHECK_NORMAL.getValue() ? PreCheckStatus.None : PreCheckStatus.ERROR;
        int type = preCheckBean.getType();
        if (type == PreCheckOrderWarning.PRE_CHECK_TYPE_NONE.getType()) {
            preCheckReminderType = PreCheckReminderType.NONE;
        } else if (type == PreCheckOrderWarning.PRE_CHECK_TYPE_WARNING.getType()) {
            preCheckReminderType = PreCheckReminderType.Warning;
        } else {
            preCheckReminderType = type == PreCheckOrderWarning.PRE_CHECK_TYPE_ERROR.getType() ? PreCheckReminderType.Error : PreCheckReminderType.NONE;
        }
        return new PreCheckModel(preCheckStatus, preCheckReminderType, preCheckBean.getMsg());
    }
}
