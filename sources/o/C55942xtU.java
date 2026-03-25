package o;

import com.okinc.trade.arch.util.Quartet;
import com.okinc.unify_trade.biz.BotUserSummaryData;
import com.okinc.unify_trade.biz.StrategyUserSummaryData;
import com.okinc.unify_trade.biz.subscribe.ExchangeRateResponse;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C52761wXj;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xtU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C55942xtU implements InterfaceC54501xKt<kotlin.Pair<? extends java.util.List<? extends StrategyUserSummaryData>, ? extends ExchangeRateResponse>, BotUserSummaryData> {
    public static final Application Companion = new Application(null);
    public static final int OLrzqt = 8;
    public final java.lang.String EZpvd;
    public java.lang.String KWHzl = "1";
    public final java.lang.Boolean copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.KWHzl = str;
    }

    public C55942xtU(java.lang.String str, java.lang.Boolean bool) {
        this.EZpvd = str;
        this.copydefault = bool;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // o.InterfaceC54501xKt
    public /* bridge */ /* synthetic */ BotUserSummaryData KWHzl(kotlin.Pair<? extends java.util.List<? extends StrategyUserSummaryData>, ? extends ExchangeRateResponse> pair) {
        return KWHzl2((kotlin.Pair<? extends java.util.List<StrategyUserSummaryData>, ExchangeRateResponse>) pair);
    }

    /* JADX INFO: renamed from: o.xtU$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.xtU.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d8  */
    /* JADX INFO: renamed from: KWHzl, reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public BotUserSummaryData KWHzl2(@NotNull kotlin.Pair<? extends java.util.List<StrategyUserSummaryData>, ExchangeRateResponse> pair) {
        java.lang.String sourceCcyToThisRate;
        java.lang.Boolean bool;
        Quartet quartet;
        java.lang.String strAYXKKw;
        java.lang.String str;
        java.lang.String tdyTotalProfit;
        Intrinsics.checkNotNullParameter(pair, "");
        StrategyUserSummaryData strategyUserSummaryData = (StrategyUserSummaryData) CollectionsKt___CollectionsKt.firstOrNull(pair.getFirst());
        if (strategyUserSummaryData == null) {
            strategyUserSummaryData = new StrategyUserSummaryData((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 31, (DefaultConstructorMarker) null);
        }
        StrategyUserSummaryData strategyUserSummaryData2 = strategyUserSummaryData;
        ExchangeRateResponse second = pair.getSecond();
        java.lang.String str2 = this.EZpvd;
        java.lang.String str3 = "USDT";
        if (str2 == null) {
            str2 = "USDT";
        }
        boolean z = (Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "USDT") || second == null) ? false : true;
        int precision = second != null ? second.getPrecision() : 2;
        if (second == null || (sourceCcyToThisRate = second.getSourceCcyToThisRate()) == null) {
            sourceCcyToThisRate = this.KWHzl;
        }
        java.lang.String str4 = sourceCcyToThisRate;
        java.lang.Boolean bool2 = this.copydefault;
        java.lang.Boolean bool3 = java.lang.Boolean.TRUE;
        java.lang.String strGEmmrt = C33129mqd.gEmmrt(java.lang.Integer.valueOf(Intrinsics.EZpvd(bool2, bool3) ? java.lang.Math.max(precision, 2) : precision));
        if (z) {
            java.lang.String targetCcy = second != null ? second.getTargetCcy() : null;
            java.lang.String totalAsset = strategyUserSummaryData2.getTotalAsset();
            if (totalAsset != null) {
                bool = bool3;
                java.lang.String strMulS$default = C33129mqd.mulS$default(totalAsset, str4, java.lang.Integer.valueOf(precision), null, null, 12, null);
                if (strMulS$default != null) {
                    str = strMulS$default;
                }
                java.lang.String strCopydefault = C56033xvF.copydefault(str, targetCcy != null ? "" : targetCcy, (88 & 4) != 0 ? false : false, (88 & 8) != 0 ? null : strGEmmrt.toString(), (88 & 16) != 0 ? false : true, (88 & 32) == 0 ? false : false, (88 & 64) == 0 ? null : null);
                tdyTotalProfit = strategyUserSummaryData2.getTdyTotalProfit();
                if (tdyTotalProfit != null || (strMulS$default = C33129mqd.mulS$default(tdyTotalProfit, str4, java.lang.Integer.valueOf(precision), null, null, 12, null)) == null) {
                    java.lang.String strMulS$default2 = "0";
                }
                quartet = new Quartet(targetCcy, strCopydefault, C56033xvF.getBotPnl$default("", "", strMulS$default2, targetCcy != null ? "" : targetCcy, false, true, strGEmmrt, false, null, null, null, 1936, null), strMulS$default2);
            } else {
                bool = bool3;
            }
            str = "0";
            java.lang.String strCopydefault2 = C56033xvF.copydefault(str, targetCcy != null ? "" : targetCcy, (88 & 4) != 0 ? false : false, (88 & 8) != 0 ? null : strGEmmrt.toString(), (88 & 16) != 0 ? false : true, (88 & 32) == 0 ? false : false, (88 & 64) == 0 ? null : null);
            tdyTotalProfit = strategyUserSummaryData2.getTdyTotalProfit();
            if (tdyTotalProfit != null) {
                java.lang.String strMulS$default22 = "0";
                quartet = new Quartet(targetCcy, strCopydefault2, C56033xvF.getBotPnl$default("", "", strMulS$default22, targetCcy != null ? "" : targetCcy, false, true, strGEmmrt, false, null, null, null, 1936, null), strMulS$default22);
            }
        } else {
            bool = bool3;
            java.lang.String ccy = strategyUserSummaryData2.getCcy();
            if (ccy != null && ccy.length() != 0 && !StringsKt__StringsKt.fARcdN((java.lang.CharSequence) ccy)) {
                str3 = ccy;
            }
            java.lang.String totalAsset2 = strategyUserSummaryData2.getTotalAsset();
            java.lang.String strCopydefault3 = C56033xvF.copydefault(totalAsset2 == null ? "0" : totalAsset2, str3, (88 & 4) != 0 ? false : false, (88 & 8) != 0 ? null : strGEmmrt, (88 & 16) != 0 ? false : true, (88 & 32) == 0 ? false : false, (88 & 64) == 0 ? null : null);
            java.lang.String tdyTotalProfit2 = strategyUserSummaryData2.getTdyTotalProfit();
            if (tdyTotalProfit2 == null) {
                tdyTotalProfit2 = "0";
            }
            java.lang.String ccy2 = strategyUserSummaryData2.getCcy();
            quartet = new Quartet(str3, strCopydefault3, C56033xvF.getBotPnl$default("", "", tdyTotalProfit2, ccy2 == null ? "" : ccy2, false, true, strGEmmrt, false, null, null, null, 1936, null), tdyTotalProfit2);
        }
        java.lang.String str5 = (java.lang.String) quartet.component1();
        java.lang.String str6 = (java.lang.String) quartet.component2();
        java.lang.String str7 = (java.lang.String) quartet.component3();
        java.lang.String str8 = (java.lang.String) quartet.component4();
        java.lang.String str9 = C33070mpX.AYXKKw(C55688xof.Application.OeawrHOeawrH) + " (" + str5 + ")";
        java.lang.String tdyPnlRatio = strategyUserSummaryData2.getTdyPnlRatio();
        if (tdyPnlRatio == null) {
            tdyPnlRatio = "0";
        }
        java.lang.String strKWHzl = C56033xvF.KWHzl(tdyPnlRatio);
        java.lang.String strFmtBotPnlPercent$default = C56033xvF.fmtBotPnlPercent$default(strKWHzl, true, 0, 4, null);
        int iAEQbTJ = C56033xvF.AEQbTJ(str8, this.copydefault);
        int iAEQbTJ2 = C56033xvF.AEQbTJ(strKWHzl, this.copydefault);
        if (Intrinsics.EZpvd(this.copydefault, bool)) {
            strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.AEQbTJ);
        } else {
            strAYXKKw = C56071xvr.gEmmrt.ejfBZ() ? C33070mpX.AYXKKw(C55688xof.Application.valueOf) : C33070mpX.AYXKKw(C55688xof.Application.OqHLSf);
        }
        java.lang.String str10 = strAYXKKw;
        int iCopydefault = C33070mpX.copydefault(C52761wXj.Activity.aappFQ);
        java.lang.String str11 = Intrinsics.EZpvd((java.lang.Object) str6, (java.lang.Object) "--") ? "0" : str6;
        java.lang.String str12 = str5 == null ? "" : str5;
        java.lang.String strAEQbTJ = pTF.KWHzl.AEQbTJ(str7);
        java.lang.String stgyCount = strategyUserSummaryData2.getStgyCount();
        return new BotUserSummaryData(str9, str11, str12, strAEQbTJ, iAEQbTJ, strFmtBotPnlPercent$default, iAEQbTJ2, str10, iCopydefault, strategyUserSummaryData2, str4, z, precision, stgyCount == null ? "0" : stgyCount);
    }
}
