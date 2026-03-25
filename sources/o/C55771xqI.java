package o;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.okinc.unify_trade.biz.AIData;
import com.okinc.unify_trade.biz.AdvancedTriggerSign;
import com.okinc.unify_trade.biz.BotRangeConfig;
import com.okinc.unify_trade.biz.ContractGridReq;
import com.okinc.unify_trade.biz.StrategyConfigInfo;
import com.okinc.unify_trade.bot.config.GridStartTriggerType;
import com.okinc.unify_trade.bot.config.GridStopTriggerType;
import com.okinc.unify_trade.bot.config.TimeFrame;
import com.okinc.unify_trade.bot.config.TriggerCond;
import java.math.RoundingMode;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xqI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C55771xqI {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int copydefault = 8;
    public StrategyConfigInfo EZpvd;
    public C55887xsS KWHzl;
    public ContractGridReq OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(@NotNull ContractGridReq contractGridReq) {
        Intrinsics.checkNotNullParameter(contractGridReq, "");
        this.OLrzqt = contractGridReq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(StrategyConfigInfo strategyConfigInfo) {
        this.EZpvd = strategyConfigInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StrategyConfigInfo KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull C55887xsS c55887xsS) {
        Intrinsics.checkNotNullParameter(c55887xsS, "");
        this.KWHzl = c55887xsS;
    }

    public final C55887xsS copydefault() {
        C55887xsS c55887xsS = this.KWHzl;
        if (c55887xsS != null) {
            return c55887xsS;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final ContractGridReq OLrzqt() {
        ContractGridReq contractGridReq = this.OLrzqt;
        if (contractGridReq != null) {
            return contractGridReq;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final void AEQbTJ(@NotNull ContractGridReq contractGridReq) {
        Intrinsics.checkNotNullParameter(contractGridReq, "");
        EZpvd(contractGridReq);
        if (contractGridReq.getSignParams().isEmpty()) {
            contractGridReq.setSignParams(yDY.copydefault(new AdvancedTriggerSign(TtmlNode.START, GridStartTriggerType.INSTANT.getMode(), (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 4092, (DefaultConstructorMarker) null), new AdvancedTriggerSign("stop", GridStopTriggerType.MANUAL_STOP.getMode(), (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, "1", (java.lang.String) null, 3068, (DefaultConstructorMarker) null)));
        }
        copydefault(new C55887xsS(contractGridReq.getInstType(), contractGridReq.getInstId()));
    }

    public final void OLrzqt(@NotNull AIData aIData) {
        Intrinsics.checkNotNullParameter(aIData, "");
        if (!aIData.getSignParams().isEmpty()) {
            OLrzqt().setSignParams(aIData.getSignParams());
        }
        if (C33129mqd.AEQbTJ(aIData.getTpPx(), 0)) {
            OLrzqt().setTpTriggerPx(aIData.getTpPx());
        }
        if (C33129mqd.AEQbTJ(aIData.getSlPx(), 0)) {
            OLrzqt().setSlTriggerPx(aIData.getSlPx());
        }
        if (C33129mqd.AEQbTJ(aIData.getTpRatio(), 0)) {
            OLrzqt().setTpRatio(aIData.getTpRatio());
        }
        if (C33129mqd.AEQbTJ(aIData.getSlRatio(), 0)) {
            OLrzqt().setSlRatio(aIData.getSlRatio());
        }
    }

    public final void copydefault(@NotNull android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "");
        ContractGridReq contractGridReqOLrzqt = (ContractGridReq) bundle.getParcelable("bot_grid_req");
        if (contractGridReqOLrzqt == null) {
            contractGridReqOLrzqt = OLrzqt();
        }
        OLrzqt().setTpTriggerPx(C33129mqd.valueOf(contractGridReqOLrzqt.getTpTriggerPx(), 0) ? "" : contractGridReqOLrzqt.getTpTriggerPx());
        OLrzqt().setSlTriggerPx(C33129mqd.valueOf(contractGridReqOLrzqt.getSlTriggerPx(), 0) ? "" : contractGridReqOLrzqt.getSlTriggerPx());
        OLrzqt().setTpRatio(C33129mqd.valueOf(contractGridReqOLrzqt.getTpRatio(), 0) ? "" : contractGridReqOLrzqt.getTpRatio());
        OLrzqt().setSlRatio(C33129mqd.valueOf(contractGridReqOLrzqt.getSlRatio(), 0) ? "" : contractGridReqOLrzqt.getSlRatio());
    }

    public final void OLrzqt(@NotNull android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "");
        java.lang.String string = bundle.getString("slippage_ratio_params");
        if (string == null) {
            string = "";
        }
        OLrzqt().setOpenPosSlippage(C33129mqd.valueOf(string, 0) ? "" : string);
    }

    public final void KWHzl(@NotNull android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "");
        ContractGridReq contractGridReqOLrzqt = (ContractGridReq) bundle.getParcelable("bot_grid_req");
        if (contractGridReqOLrzqt == null) {
            contractGridReqOLrzqt = OLrzqt();
        }
        OLrzqt().setSignParams(contractGridReqOLrzqt.getSignParams());
        OLrzqt().setBasePos(contractGridReqOLrzqt.getBasePos());
    }

    public final java.lang.String valueOf() {
        kotlin.Pair<java.lang.String, java.lang.String> pairOLrzqt = C56037xvJ.OLrzqt(OLrzqt().getInstType(), OLrzqt().getInstId(), OLrzqt().getTpTriggerPx(), OLrzqt().getTpRatio());
        kotlin.Pair<java.lang.String, java.lang.String> pairKWHzl = C56037xvJ.KWHzl(OLrzqt().getInstType(), OLrzqt().getInstId(), OLrzqt().getSlTriggerPx(), OLrzqt().getSlRatio());
        if (djBIcL().length() == 0 && AEQbTJ().length() == 0) {
            return C33070mpX.AYXKKw(C55688xof.Application.StyleableRes);
        }
        if ((!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) djBIcL())) && (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) AEQbTJ())) && Intrinsics.EZpvd((java.lang.Object) djBIcL(), (java.lang.Object) "tp_sl_price") && Intrinsics.EZpvd((java.lang.Object) AEQbTJ(), (java.lang.Object) "tp_sl_price")) {
            return C56037xvJ.EZpvd(OLrzqt().getInstType(), OLrzqt().getInstId(), OLrzqt().getTpTriggerPx(), OLrzqt().getTpRatio()) + " / " + C56037xvJ.EZpvd(OLrzqt().getInstType(), OLrzqt().getInstId(), OLrzqt().getSlTriggerPx(), OLrzqt().getSlRatio()) + " " + EZpvd();
        }
        return ((java.lang.Object) pairOLrzqt.getSecond()) + " / " + ((java.lang.Object) pairKWHzl.getSecond());
    }

    public final java.lang.String djBIcL() {
        return C33129mqd.AEQbTJ(OLrzqt().getTpTriggerPx(), 0) ? "tp_sl_price" : C33129mqd.AEQbTJ(OLrzqt().getTpRatio(), 0) ? "tp_sl_ratio" : "";
    }

    public final java.lang.String AEQbTJ() {
        return C33129mqd.AEQbTJ(OLrzqt().getSlTriggerPx(), 0) ? "tp_sl_price" : C33129mqd.AEQbTJ(OLrzqt().getSlRatio(), 0) ? "tp_sl_ratio" : "";
    }

    public final kotlin.Pair<java.lang.String, java.lang.String> AYXKKw() {
        java.lang.String strCopydefault;
        java.lang.String strEZpvd;
        AdvancedTriggerSign advancedTriggerSign = (AdvancedTriggerSign) CollectionsKt___CollectionsKt.AuCTelauCTel(OLrzqt().getSignParams());
        java.lang.String indicator = advancedTriggerSign.getIndicator();
        if (Intrinsics.EZpvd((java.lang.Object) indicator, (java.lang.Object) GridStartTriggerType.PRICE.getMode())) {
            java.lang.String strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.getClipDataUrisactivity_release);
            java.lang.String instType = OLrzqt().getInstType();
            java.lang.String instId = OLrzqt().getInstId();
            java.lang.String triggerPx = advancedTriggerSign.getTriggerPx();
            strCopydefault = strAYXKKw + " | " + C56033xvF.getBotPrice$default(instType, instId, triggerPx == null ? "" : triggerPx, true, false, RoundingMode.HALF_UP, null, 80, null);
        } else if (Intrinsics.EZpvd((java.lang.Object) indicator, (java.lang.Object) GridStartTriggerType.RSI_14.getMode())) {
            java.lang.String str = TriggerCond.Companion.KWHzl(advancedTriggerSign.getTriggerCond()) + advancedTriggerSign.getOversoldThold();
            int i = C55688xof.Application.multiple;
            kotlin.Pair[] pairArr = new kotlin.Pair[3];
            java.lang.String timePeriod = advancedTriggerSign.getTimePeriod();
            if (timePeriod == null) {
                timePeriod = "";
            }
            pairArr[0] = C56390yDp.OLrzqt("RSIFactor1", timePeriod);
            TimeFrame.Application application = TimeFrame.Companion;
            java.lang.String timeframe = advancedTriggerSign.getTimeframe();
            if (timeframe == null) {
                timeframe = "";
            }
            pairArr[1] = C56390yDp.OLrzqt("RSIFactor2", application.copydefault(timeframe));
            pairArr[2] = C56390yDp.OLrzqt("RSIFactor3", str);
            strCopydefault = C33069mpW.copydefault(i, C56424yEw.gEmmrt(pairArr));
        } else {
            strCopydefault = GridStartTriggerType.Companion.copydefault(advancedTriggerSign.getIndicator());
        }
        AdvancedTriggerSign advancedTriggerSign2 = (AdvancedTriggerSign) CollectionsKt___CollectionsKt.AubY(OLrzqt().getSignParams());
        java.lang.String indicator2 = advancedTriggerSign2.getIndicator();
        if (Intrinsics.EZpvd((java.lang.Object) indicator2, (java.lang.Object) GridStopTriggerType.PRICE.getMode())) {
            java.lang.String strAYXKKw2 = C33070mpX.AYXKKw(C55688xof.Application.getClipDataUrisactivity_release);
            java.lang.String instType2 = OLrzqt().getInstType();
            java.lang.String instId2 = OLrzqt().getInstId();
            java.lang.String triggerPx2 = advancedTriggerSign2.getTriggerPx();
            strEZpvd = strAYXKKw2 + " | " + C56033xvF.getBotPrice$default(instType2, instId2, triggerPx2 == null ? "" : triggerPx2, true, false, RoundingMode.HALF_UP, null, 80, null);
        } else if (Intrinsics.EZpvd((java.lang.Object) indicator2, (java.lang.Object) GridStopTriggerType.RSI_14.getMode())) {
            java.lang.String str2 = TriggerCond.Companion.KWHzl(advancedTriggerSign2.getTriggerCond()) + advancedTriggerSign2.getOversoldThold();
            int i2 = C55688xof.Application.multiple;
            kotlin.Pair[] pairArr2 = new kotlin.Pair[3];
            java.lang.String timePeriod2 = advancedTriggerSign2.getTimePeriod();
            if (timePeriod2 == null) {
                timePeriod2 = "";
            }
            pairArr2[0] = C56390yDp.OLrzqt("RSIFactor1", timePeriod2);
            TimeFrame.Application application2 = TimeFrame.Companion;
            java.lang.String timeframe2 = advancedTriggerSign2.getTimeframe();
            pairArr2[1] = C56390yDp.OLrzqt("RSIFactor2", application2.copydefault(timeframe2 != null ? timeframe2 : ""));
            pairArr2[2] = C56390yDp.OLrzqt("RSIFactor3", str2);
            strEZpvd = C33069mpW.copydefault(i2, C56424yEw.gEmmrt(pairArr2));
        } else {
            strEZpvd = GridStopTriggerType.Companion.EZpvd(advancedTriggerSign2.getIndicator());
        }
        return C56390yDp.OLrzqt(strCopydefault, strEZpvd);
    }

    public final C55853xrl gEmmrt() {
        java.lang.String min;
        java.lang.String max;
        java.lang.String min2;
        java.lang.String max2;
        BotRangeConfig slPct;
        BotRangeConfig slPct2;
        BotRangeConfig tpPct;
        BotRangeConfig tpPct2;
        StrategyConfigInfo strategyConfigInfo = this.EZpvd;
        if (strategyConfigInfo == null || (tpPct2 = strategyConfigInfo.getTpPct()) == null || (min = tpPct2.getMin()) == null) {
            min = "0.004";
        }
        StrategyConfigInfo strategyConfigInfo2 = this.EZpvd;
        if (strategyConfigInfo2 == null || (tpPct = strategyConfigInfo2.getTpPct()) == null || (max = tpPct.getMax()) == null) {
            max = "100";
        }
        StrategyConfigInfo strategyConfigInfo3 = this.EZpvd;
        if (strategyConfigInfo3 == null || (slPct2 = strategyConfigInfo3.getSlPct()) == null || (min2 = slPct2.getMin()) == null) {
            min2 = "0.005";
        }
        StrategyConfigInfo strategyConfigInfo4 = this.EZpvd;
        if (strategyConfigInfo4 == null || (slPct = strategyConfigInfo4.getSlPct()) == null || (max2 = slPct.getMax()) == null) {
            max2 = "0.9999";
        }
        return new C55853xrl(min, max, min2, max2);
    }

    public final java.lang.String EZpvd() {
        return C54794xVo.copydefault.EZpvd(copydefault().AhwBna());
    }

    /* JADX INFO: renamed from: o.xqI$StateListAnimator */
    /* JADX INFO: loaded from: classes19.dex */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.xqI.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }
}
