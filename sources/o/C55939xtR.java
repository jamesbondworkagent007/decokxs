package o;

import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.SmartArbListItem;
import com.okinc.unify_trade.biz.SmartPortfolioListItem;
import com.okinc.unify_trade.biz.TacticsVoucherInfo;
import com.okinc.unify_trade.biz.TrailingConfig;
import com.okinc.unify_trade.biz.VoucherStatus;
import com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo;
import com.okinc.unify_trade.bot.data.TacticsListLabelData;
import com.okinc.unify_trade.bot.data.TacticsListLabelLeverPrincipalData;
import com.okinc.unify_trade.bot.data.TacticsListLabelRoleData;
import com.okinc.unify_trade.bot.data.TacticsListLabelUiData;
import com.okinc.unify_trade.bot.data.TacticsListLabelVipProfitData;
import com.okinc.unify_trade.bot.data.TacticsListLabelVoucherData;
import com.okinc.unify_trade.bot.data.TacticsVipProfitData;
import java.math.BigDecimal;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xtR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C55939xtR {
    public static final C55939xtR AEQbTJ = new C55939xtR();
    public static final java.util.Set<java.lang.String> KWHzl = yEE.AhwBna("smart_arbitrage", "grid", "contract_grid", "spot_dca", "contract_dca");
    public static final int OLrzqt = 8;

    private C55939xtR() {
    }

    public static /* synthetic */ java.util.ArrayList buildLabelList$default(C55939xtR c55939xtR, BizTradeStrategyInfo bizTradeStrategyInfo, boolean z, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            str = "";
        }
        if ((i & 8) != 0) {
            str2 = "";
        }
        return c55939xtR.EZpvd(bizTradeStrategyInfo, z, str, str2);
    }

    public final java.util.ArrayList<TacticsListLabelUiData> EZpvd(@NotNull BizTradeStrategyInfo bizTradeStrategyInfo, boolean z, java.lang.String str, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(bizTradeStrategyInfo, "");
        java.util.ArrayList<TacticsListLabelUiData> arrayListKWHzl = KWHzl(bizTradeStrategyInfo);
        EZpvd(bizTradeStrategyInfo, arrayListKWHzl);
        copydefault(bizTradeStrategyInfo, arrayListKWHzl);
        EZpvd(bizTradeStrategyInfo, z, str, str2, arrayListKWHzl);
        return arrayListKWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [86=7] */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0023, code lost:
    
        if (r0.equals("twap") == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0064, code lost:
    
        if (r0.equals("smart_iceberg") == false) goto L36;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.util.ArrayList<TacticsListLabelUiData> KWHzl(BizTradeStrategyInfo bizTradeStrategyInfo) {
        java.lang.String orderType = bizTradeStrategyInfo.getOrderType();
        switch (orderType.hashCode()) {
            case -1402017003:
                if (orderType.equals("contract_dca")) {
                    return AEQbTJ(bizTradeStrategyInfo);
                }
                return new java.util.ArrayList<>();
            case -1148661171:
                break;
            case -1086683216:
                if (orderType.equals("signal_bot")) {
                    return EZpvd(bizTradeStrategyInfo);
                }
                return new java.util.ArrayList<>();
            case -557961837:
                if (orderType.equals("smart_arbitrage")) {
                    return AYXKKw(bizTradeStrategyInfo);
                }
                return new java.util.ArrayList<>();
            case -512749997:
                if (orderType.equals("contract_grid")) {
                    return AEQbTJ(bizTradeStrategyInfo);
                }
                return new java.util.ArrayList<>();
            case 3181382:
                if (orderType.equals("grid")) {
                    return gEmmrt(bizTradeStrategyInfo);
                }
                return new java.util.ArrayList<>();
            case 3573234:
                break;
            case 1629187779:
                if (orderType.equals("iceberg")) {
                    return copydefault(bizTradeStrategyInfo);
                }
                return new java.util.ArrayList<>();
            default:
                return new java.util.ArrayList<>();
        }
        return OLrzqt(bizTradeStrategyInfo);
    }

    public final java.util.ArrayList<TacticsListLabelUiData> gEmmrt(BizTradeStrategyInfo bizTradeStrategyInfo) {
        kotlin.Pair<java.lang.Boolean, java.lang.String> pairAhwBna = AhwBna(bizTradeStrategyInfo);
        return pairAhwBna.getFirst().booleanValue() ? yDY.copydefault(new TacticsListLabelData(pairAhwBna.getSecond(), false, 0, 0, 0, 30, null)) : new java.util.ArrayList<>();
    }

    public final java.util.ArrayList<TacticsListLabelUiData> AEQbTJ(BizTradeStrategyInfo bizTradeStrategyInfo) {
        int iValueOf = C56033xvF.valueOf(bizTradeStrategyInfo.getOrderDirection());
        return yDY.copydefault(new TacticsListLabelData(C56033xvF.AhwBna(bizTradeStrategyInfo.getOrderDirection()), false, iValueOf, 0, 0, 26, null), new TacticsListLabelData(C56033xvF.getBotLever$default(bizTradeStrategyInfo.getOrderLever(), false, 2, null), false, iValueOf, 0, 0, 26, null));
    }

    public final java.util.ArrayList<TacticsListLabelUiData> OLrzqt(BizTradeStrategyInfo bizTradeStrategyInfo) {
        java.util.ArrayList<TacticsListLabelUiData> arrayList = new java.util.ArrayList<>();
        kotlin.Pair<java.lang.String, java.lang.Boolean> pairAYXKKw = C56033xvF.AYXKKw(bizTradeStrategyInfo.getOrderInstType(), bizTradeStrategyInfo.getOrderSide(), bizTradeStrategyInfo.getOrderPosSide());
        java.lang.String strComponent1 = pairAYXKKw.component1();
        int i = pairAYXKKw.component2().booleanValue() ? 14 : 13;
        java.lang.String strFJNWhG = C56033xvF.fJNWhG(bizTradeStrategyInfo.getOrderTdMode());
        java.lang.String str = StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strFJNWhG) ^ true ? strFJNWhG : null;
        if (str != null) {
            arrayList.add(new TacticsListLabelData(str, false, 0, 0, 0, 30, null));
        }
        arrayList.add(new TacticsListLabelData(strComponent1, false, i, 0, 0, 26, null));
        if (!Intrinsics.EZpvd((java.lang.Object) bizTradeStrategyInfo.getOrderInstType(), (java.lang.Object) "SPOT")) {
            java.lang.String botLever$default = C56033xvF.getBotLever$default(bizTradeStrategyInfo.getOrderLever(), false, 2, null);
            java.lang.String str2 = StringsKt__StringsKt.fARcdN((java.lang.CharSequence) botLever$default) ^ true ? botLever$default : null;
            if (str2 != null) {
                arrayList.add(new TacticsListLabelData(str2, false, i, 0, 0, 26, null));
            }
        }
        return arrayList;
    }

    public final java.util.ArrayList<TacticsListLabelUiData> copydefault(BizTradeStrategyInfo bizTradeStrategyInfo) {
        java.util.ArrayList<TacticsListLabelUiData> arrayList = new java.util.ArrayList<>();
        kotlin.Pair<java.lang.String, java.lang.Boolean> pairAYXKKw = C56033xvF.AYXKKw(bizTradeStrategyInfo.getOrderInstType(), bizTradeStrategyInfo.getOrderSide(), bizTradeStrategyInfo.getOrderPosSide());
        arrayList.add(new TacticsListLabelData(pairAYXKKw.component1(), false, pairAYXKKw.component2().booleanValue() ? 14 : 13, 0, 0, 26, null));
        java.lang.String strFJNWhG = C56033xvF.fJNWhG(bizTradeStrategyInfo.getOrderTdMode());
        java.lang.String str = StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strFJNWhG) ^ true ? strFJNWhG : null;
        if (str != null) {
            arrayList.add(new TacticsListLabelData(str, false, 0, 0, 0, 30, null));
        }
        java.lang.String botLever$default = C56033xvF.getBotLever$default(bizTradeStrategyInfo.getOrderLever(), false, 2, null);
        java.lang.String str2 = StringsKt__StringsKt.fARcdN((java.lang.CharSequence) botLever$default) ^ true ? botLever$default : null;
        if (str2 != null) {
            arrayList.add(new TacticsListLabelData(str2, false, 0, 0, 0, 30, null));
        }
        return arrayList;
    }

    public final java.util.ArrayList<TacticsListLabelUiData> EZpvd(BizTradeStrategyInfo bizTradeStrategyInfo) {
        java.util.ArrayList<TacticsListLabelUiData> arrayList = new java.util.ArrayList<>();
        java.lang.String botLever$default = C56033xvF.getBotLever$default(bizTradeStrategyInfo.getOrderLever(), false, 2, null);
        java.lang.String str = StringsKt__StringsKt.fARcdN((java.lang.CharSequence) botLever$default) ^ true ? botLever$default : null;
        if (str != null) {
            arrayList.add(new TacticsListLabelData(str, false, 0, 0, 0, 30, null));
        }
        return arrayList;
    }

    public final java.util.ArrayList<TacticsListLabelUiData> AYXKKw(BizTradeStrategyInfo bizTradeStrategyInfo) {
        SmartArbListItem smartArbListItem;
        java.util.ArrayList<TacticsListLabelUiData> arrayList = new java.util.ArrayList<>();
        java.lang.Float leverPrincipal = bizTradeStrategyInfo.getLeverPrincipal();
        if (leverPrincipal != null) {
            float fFloatValue = leverPrincipal.floatValue();
            java.lang.String leverPrincipal$default = C56033xvF.formatLeverPrincipal$default(java.lang.Float.valueOf(fFloatValue), null, 2, null);
            BigDecimal bigDecimalEZpvd = C33129mqd.EZpvd(java.lang.Float.valueOf(fFloatValue));
            BigDecimal bigDecimalEZpvd2 = C33129mqd.EZpvd(bizTradeStrategyInfo.getOrderTotalAmt());
            C56051xvX c56051xvX = C56051xvX.AEQbTJ;
            java.util.ArrayList<SmartArbListItem> smartArbList = bizTradeStrategyInfo.getSmartArbList();
            java.lang.String instFamily = (smartArbList == null || (smartArbListItem = (SmartArbListItem) CollectionsKt___CollectionsKt.firstOrNull(smartArbList)) == null) ? null : smartArbListItem.getInstFamily();
            if (instFamily == null) {
                instFamily = "";
            }
            BizInstrument bizInstrumentCopydefault = c56051xvX.copydefault(instFamily, "SWAP");
            java.lang.String quoteSymbol = bizInstrumentCopydefault != null ? bizInstrumentCopydefault.getQuoteSymbol() : null;
            arrayList.add(new TacticsListLabelLeverPrincipalData(leverPrincipal$default, bigDecimalEZpvd, bigDecimalEZpvd2, quoteSymbol == null ? "" : quoteSymbol, false, 0, 0, 0, PsExtractor.VIDEO_STREAM_MASK, null));
        }
        return arrayList;
    }

    public final void EZpvd(BizTradeStrategyInfo bizTradeStrategyInfo, java.util.ArrayList<TacticsListLabelUiData> arrayList) {
        java.lang.String strAYXKKw;
        if (Intrinsics.EZpvd((java.lang.Object) bizTradeStrategyInfo.getOrdCopyType(), (java.lang.Object) "3")) {
            strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.onPlayFromMediaId);
        } else if (Intrinsics.EZpvd((java.lang.Object) bizTradeStrategyInfo.getOrdCopyType(), (java.lang.Object) "2")) {
            strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.izFvvl);
        } else {
            strAYXKKw = bizTradeStrategyInfo.isCopy() ? C33070mpX.AYXKKw(C55688xof.Application.sanrWj) : "";
        }
        java.lang.String str = strAYXKKw;
        if (str.length() > 0) {
            arrayList.add(new TacticsListLabelRoleData(str, false, 0, 0, 0, 30, null));
        }
    }

    public final void copydefault(BizTradeStrategyInfo bizTradeStrategyInfo, java.util.ArrayList<TacticsListLabelUiData> arrayList) {
        TacticsVoucherInfo tacticsVoucherInfo;
        java.lang.Integer label;
        if (!KWHzl.contains(bizTradeStrategyInfo.getOrderType()) || (tacticsVoucherInfo = bizTradeStrategyInfo.getTacticsVoucherInfo()) == null) {
            return;
        }
        VoucherStatus voucherStatus = tacticsVoucherInfo.getVoucherStatus();
        java.lang.String strAYXKKw = (voucherStatus == null || (label = voucherStatus.getLabel()) == null) ? null : C33070mpX.AYXKKw(label.intValue());
        if (strAYXKKw == null) {
            strAYXKKw = "";
        }
        arrayList.add(new TacticsListLabelVoucherData(strAYXKKw, true, 0, 0, 0, tacticsVoucherInfo, 28, null));
    }

    public final void EZpvd(BizTradeStrategyInfo bizTradeStrategyInfo, boolean z, java.lang.String str, java.lang.String str2, java.util.ArrayList<TacticsListLabelUiData> arrayList) {
        if (z) {
            return;
        }
        for (java.lang.String str3 : bizTradeStrategyInfo.getVipProfitState()) {
            arrayList.add(new TacticsListLabelVipProfitData(str3, true, 8, -5, 0, AEQbTJ.EZpvd(bizTradeStrategyInfo, str3, str, str2), 16, null));
        }
    }

    public final TacticsVipProfitData EZpvd(BizTradeStrategyInfo bizTradeStrategyInfo, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.lang.String orderInstId = bizTradeStrategyInfo.getOrderInstId();
        if (orderInstId.length() == 0) {
            orderInstId = null;
        }
        java.lang.String str4 = orderInstId == null ? str2 == null ? "" : str2 : orderInstId;
        java.lang.String orderInstType = bizTradeStrategyInfo.getOrderInstType();
        java.lang.String str5 = orderInstType.length() != 0 ? orderInstType : null;
        return new TacticsVipProfitData(str4, str5 == null ? str3 == null ? "" : str3 : str5, Intrinsics.EZpvd((java.lang.Object) C33070mpX.AYXKKw(C55688xof.Application.getQueueTitle), (java.lang.Object) str) ? "auto_education_single_earn" : "auto_education_single_staking", bizTradeStrategyInfo.getOrderType(), bizTradeStrategyInfo.getCurrentTradeQuoteCcy(), Intrinsics.EZpvd((java.lang.Object) bizTradeStrategyInfo.getOrderType(), (java.lang.Object) "smart_portfolio") ? CollectionsKt___CollectionsKt.joinToString$default(bizTradeStrategyInfo.getSmartPortfolioList(), ",", null, null, 0, null, new Function1() { // from class: o.xtS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C55939xtR.copydefault((SmartPortfolioListItem) obj);
            }
        }, 30, null) : "");
    }

    public static final java.lang.CharSequence copydefault(SmartPortfolioListItem smartPortfolioListItem) {
        Intrinsics.checkNotNullParameter(smartPortfolioListItem, "");
        java.lang.String ccy = smartPortfolioListItem.getCcy();
        return ccy == null ? "" : ccy;
    }

    public final kotlin.Pair<java.lang.Boolean, java.lang.String> AhwBna(BizTradeStrategyInfo bizTradeStrategyInfo) {
        TrailingConfig trailingUp = bizTradeStrategyInfo.getTrailingUp();
        TrailingConfig trailingDown = bizTradeStrategyInfo.getTrailingDown();
        if (trailingUp != null && trailingUp.getEnabled() && trailingDown != null && trailingDown.getEnabled()) {
            return C56390yDp.OLrzqt(java.lang.Boolean.TRUE, C33070mpX.AYXKKw(C55688xof.Application.max));
        }
        if (trailingUp != null && trailingUp.getEnabled() && (trailingDown == null || !trailingDown.getEnabled())) {
            return C56390yDp.OLrzqt(java.lang.Boolean.TRUE, C33070mpX.AYXKKw(C55688xof.Application.StringDef));
        }
        if (trailingDown != null && trailingDown.getEnabled() && (trailingUp == null || !trailingUp.getEnabled())) {
            return C56390yDp.OLrzqt(java.lang.Boolean.TRUE, C33070mpX.AYXKKw(C55688xof.Application.Size));
        }
        return C56390yDp.OLrzqt(java.lang.Boolean.FALSE, "");
    }
}
