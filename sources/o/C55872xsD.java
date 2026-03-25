package o;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.okinc.unify_trade.biz.AIData;
import com.okinc.unify_trade.biz.AdvancedTriggerSign;
import com.okinc.unify_trade.biz.GridReq;
import com.okinc.unify_trade.biz.ProfitAutoReinvestParam;
import com.okinc.unify_trade.biz.StrategyConfigInfo;
import com.okinc.unify_trade.biz.TrailingConfig;
import com.okinc.unify_trade.biz.TrailingPxResp;
import com.okinc.unify_trade.biz.bot.SmartEarnConfig;
import com.okinc.unify_trade.biz.bot.SmartEarnRequestParam;
import com.okinc.unify_trade.biz.bot.TpSLTriggerItem;
import com.okinc.unify_trade.biz.bot.TpSlTriggerParam;
import com.okinc.unify_trade.biz.bot.TpSlTriggerParamReqResp;
import com.okinc.unify_trade.bot.config.GridStartTriggerType;
import com.okinc.unify_trade.bot.config.GridStopTriggerType;
import com.okinc.unify_trade.bot.config.TimeFrame;
import com.okinc.unify_trade.bot.config.TriggerCond;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xsD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C55872xsD {
    public StrategyConfigInfo AEQbTJ;
    public TrailingPxResp AhwBna;
    public C55887xsS KWHzl;
    public boolean OLrzqt;
    public java.lang.String copydefault;
    public GridReq EZpvd = new GridReq((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (TpSlTriggerParamReqResp) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.ArrayList) null, (java.lang.Boolean) null, (TrailingConfig) null, (TrailingConfig) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (SmartEarnRequestParam) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (ProfitAutoReinvestParam) null, -1, 15, (DefaultConstructorMarker) null);
    public TpSlTriggerParam djBIcL = new TpSlTriggerParam((java.lang.String) null, (java.lang.String) null, (TpSLTriggerItem) null, (TpSLTriggerItem) null, 15, (DefaultConstructorMarker) null);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(@NotNull StrategyConfigInfo strategyConfigInfo) {
        Intrinsics.checkNotNullParameter(strategyConfigInfo, "");
        this.AEQbTJ = strategyConfigInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(java.lang.String str) {
        this.copydefault = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StrategyConfigInfo OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull C55887xsS c55887xsS) {
        Intrinsics.checkNotNullParameter(c55887xsS, "");
        this.KWHzl = c55887xsS;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TpSlTriggerParam djBIcL() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean fetchVPNInfo() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TrailingPxResp gEmmrt() {
        return this.AhwBna;
    }

    public final C55887xsS AEQbTJ() {
        C55887xsS c55887xsS = this.KWHzl;
        if (c55887xsS != null) {
            return c55887xsS;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final GridReq copydefault() {
        this.EZpvd.setTpslTriggerParamReq(C55765xqC.AEQbTJ(this.djBIcL));
        return this.EZpvd;
    }

    public final boolean AkhnZx() {
        SmartEarnConfig earnConfig;
        StrategyConfigInfo strategyConfigInfo = this.AEQbTJ;
        if (strategyConfigInfo == null || (earnConfig = strategyConfigInfo.getEarnConfig()) == null) {
            return false;
        }
        return earnConfig.isEarnSupported();
    }

    public static /* synthetic */ void initAdvancedSetting$default(C55872xsD c55872xsD, GridReq gridReq, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        c55872xsD.AEQbTJ(gridReq, str);
    }

    public final void AEQbTJ(@NotNull GridReq gridReq, java.lang.String str) {
        TpSlTriggerParam tpSlTriggerParam;
        Intrinsics.checkNotNullParameter(gridReq, "");
        this.EZpvd = gridReq;
        TpSlTriggerParamReqResp tpslTriggerParamReq = gridReq.getTpslTriggerParamReq();
        if (tpslTriggerParamReq == null || (tpSlTriggerParam = C55765xqC.OLrzqt(tpslTriggerParamReq)) == null) {
            tpSlTriggerParam = new TpSlTriggerParam((java.lang.String) null, (java.lang.String) null, (TpSLTriggerItem) null, (TpSLTriggerItem) null, 15, (DefaultConstructorMarker) null);
        }
        this.djBIcL = tpSlTriggerParam;
        this.copydefault = str;
        if (gridReq.getSignParams().isEmpty()) {
            gridReq.setSignParams(yDY.copydefault(new AdvancedTriggerSign(TtmlNode.START, GridStartTriggerType.INSTANT.getMode(), (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 4092, (DefaultConstructorMarker) null), new AdvancedTriggerSign("stop", GridStopTriggerType.MANUAL_STOP.getMode(), (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, "1", (java.lang.String) null, 3068, (DefaultConstructorMarker) null)));
        }
        OLrzqt(new C55887xsS(gridReq.getInstType(), gridReq.getInstId()));
    }

    public final void OLrzqt(@NotNull AIData aIData) {
        Intrinsics.checkNotNullParameter(aIData, "");
        copydefault().setTrailingUpConfig(aIData.getTrailingUpConfig());
        copydefault().setTrailingDownConfig(aIData.getTrailingDownConfig());
        if (!aIData.getSignParams().isEmpty()) {
            copydefault().setSignParams(aIData.getSignParams());
        }
        this.djBIcL = aIData.getTpslTriggerParam();
        copydefault().setReserveFunds(aIData.getReserveFunds());
    }

    public final void OLrzqt(@NotNull android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "");
        GridReq gridReq = (GridReq) bundle.getParcelable("bot_grid_req");
        copydefault().setTrailingUpConfig(gridReq != null ? gridReq.getTrailingUpConfig() : null);
        copydefault().setTrailingDownConfig(gridReq != null ? gridReq.getTrailingDownConfig() : null);
    }

    public final void AEQbTJ(@NotNull android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "");
        GridReq gridReq = (GridReq) bundle.getParcelable("bot_grid_req");
        if (gridReq != null) {
            TpSlTriggerParam tpSlTriggerParam = this.djBIcL;
            TpSlTriggerParamReqResp tpslTriggerParamReq = gridReq.getTpslTriggerParamReq();
            tpSlTriggerParam.updateWith(tpslTriggerParamReq != null ? C55765xqC.OLrzqt(tpslTriggerParamReq) : null);
        }
    }

    public final void EZpvd(@NotNull android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "");
        GridReq gridReqCopydefault = copydefault();
        java.util.ArrayList<AdvancedTriggerSign> parcelableArrayList = bundle.getParcelableArrayList("trigger_sign");
        if (parcelableArrayList == null) {
            parcelableArrayList = copydefault().getSignParams();
        }
        gridReqCopydefault.setSignParams(parcelableArrayList);
    }

    public static /* synthetic */ void refreshInvestmentType$default(C55872xsD c55872xsD, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        c55872xsD.KWHzl(str);
    }

    public static /* synthetic */ void parseTrailingResp$default(C55872xsD c55872xsD, TrailingPxResp trailingPxResp, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            trailingPxResp = null;
        }
        c55872xsD.AEQbTJ(trailingPxResp);
    }

    public final void AEQbTJ(TrailingPxResp trailingPxResp) {
        this.AhwBna = trailingPxResp;
        java.lang.String maxTrailingUpPx = trailingPxResp != null ? trailingPxResp.getMaxTrailingUpPx() : null;
        java.lang.String stopTrailingUpPx = trailingPxResp != null ? trailingPxResp.getStopTrailingUpPx() : null;
        java.lang.String maxPx = copydefault().getMaxPx();
        boolean z = false;
        if (C33129mqd.AEQbTJ(maxTrailingUpPx, 0) && C33129mqd.AEQbTJ(stopTrailingUpPx, 0) && C33129mqd.AEQbTJ(maxPx, 0) && C33129mqd.OLrzqt(maxTrailingUpPx, stopTrailingUpPx) && C33129mqd.OLrzqt(maxTrailingUpPx, maxPx) && C33129mqd.OLrzqt(stopTrailingUpPx, maxPx)) {
            z = true;
        }
        this.OLrzqt = z;
        if (z) {
            copydefault().setTrailingUpConfig(null);
        }
    }

    public final java.lang.String AYXKKw() {
        TrailingConfig trailingUpConfig = copydefault().getTrailingUpConfig();
        java.lang.String stopPx = trailingUpConfig != null ? trailingUpConfig.getStopPx() : null;
        if (!C33129mqd.OLrzqt((java.lang.CharSequence) stopPx)) {
            return "--";
        }
        xMR xmr = xMR.copydefault;
        Intrinsics.copydefault((java.lang.Object) stopPx);
        return xmr.copydefault(stopPx) + " " + KWHzl();
    }

    public final java.lang.String AhwBna() {
        TrailingConfig trailingDownConfig = copydefault().getTrailingDownConfig();
        java.lang.String stopPx = trailingDownConfig != null ? trailingDownConfig.getStopPx() : null;
        if (!C33129mqd.OLrzqt((java.lang.CharSequence) stopPx)) {
            return "--";
        }
        xMR xmr = xMR.copydefault;
        Intrinsics.copydefault((java.lang.Object) stopPx);
        return xmr.copydefault(stopPx) + " " + KWHzl();
    }

    public final kotlin.Pair<java.lang.String, java.lang.String> valueOf() {
        java.lang.String strCopydefault;
        java.lang.String strEZpvd;
        AdvancedTriggerSign advancedTriggerSign = (AdvancedTriggerSign) CollectionsKt___CollectionsKt.AuCTelauCTel(copydefault().getSignParams());
        java.lang.String indicator = advancedTriggerSign.getIndicator();
        if (Intrinsics.EZpvd((java.lang.Object) indicator, (java.lang.Object) GridStartTriggerType.PRICE.getMode())) {
            java.lang.String strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.getClipDataUrisactivity_release);
            xMR xmr = xMR.copydefault;
            java.lang.String triggerPx = advancedTriggerSign.getTriggerPx();
            if (triggerPx == null) {
                triggerPx = "";
            }
            strCopydefault = strAYXKKw + " | " + xmr.copydefault(triggerPx) + " " + KWHzl();
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
        AdvancedTriggerSign advancedTriggerSign2 = (AdvancedTriggerSign) CollectionsKt___CollectionsKt.AubY(copydefault().getSignParams());
        java.lang.String indicator2 = advancedTriggerSign2.getIndicator();
        if (Intrinsics.EZpvd((java.lang.Object) indicator2, (java.lang.Object) GridStopTriggerType.PRICE.getMode())) {
            java.lang.String strAYXKKw2 = C33070mpX.AYXKKw(C55688xof.Application.getClipDataUrisactivity_release);
            xMR xmr2 = xMR.copydefault;
            java.lang.String triggerPx2 = advancedTriggerSign2.getTriggerPx();
            strEZpvd = strAYXKKw2 + " | " + xmr2.copydefault(triggerPx2 != null ? triggerPx2 : "") + " " + KWHzl();
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

    public final java.lang.String KWHzl() {
        java.lang.String strAYXKKw = AEQbTJ().AYXKKw();
        return strAYXKKw == null ? "" : strAYXKKw;
    }
}
