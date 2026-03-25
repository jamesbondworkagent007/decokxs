package o;

import androidx.lifecycle.TradeLiveData;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.BotRangeConfig;
import com.okinc.unify_trade.biz.ContractGridReq;
import com.okinc.unify_trade.biz.GridProfitAutoReinvestResponse;
import com.okinc.unify_trade.biz.LmtOrderNumber;
import com.okinc.unify_trade.biz.SlippageControl;
import com.okinc.unify_trade.biz.SmartPortfolioConfig;
import com.okinc.unify_trade.biz.SpotGridTpSlConfig;
import com.okinc.unify_trade.biz.StrategyConfigInfo;
import com.okinc.unify_trade.biz.bot.SmartEarnConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.InterfaceC54581xNr;
import o.xMJ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xqR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C55780xqR implements InterfaceC55843xrb {
    public ContractGridReq AYXKKw = new ContractGridReq((java.lang.String) null, (java.lang.String) null, (java.lang.Boolean) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.ArrayList) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.Boolean) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.Boolean) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, -1, 15, (DefaultConstructorMarker) null);
    public TradeLiveData<xMJ.Application> AhwBna = new TradeLiveData<>();
    public TradeLiveData<C55853xrl> AEQbTJ = new TradeLiveData<>(new C55853xrl(null, null, null, null, 15, null));
    public java.util.HashMap<java.lang.String, java.lang.Boolean> EZpvd = new java.util.HashMap<>();
    public java.util.HashMap<java.lang.String, java.lang.String> KWHzl = new java.util.HashMap<>();
    public boolean copydefault = true;
    public boolean OLrzqt = true;
    public java.lang.String AkhnZx = "tp_sl_price";
    public java.lang.String gEmmrt = "tp_sl_price";
    public java.lang.String valueOf = "";
    public int djBIcL = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void AEQbTJ(@NotNull TradeLiveData<xMJ.Application> tradeLiveData) {
        Intrinsics.checkNotNullParameter(tradeLiveData, "");
        this.AhwBna = tradeLiveData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void AEQbTJ(boolean z) {
        this.copydefault = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC55843xrb
    public java.util.HashMap<java.lang.String, java.lang.String> AYXKKw() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC55843xrb
    public TradeLiveData<xMJ.Application> AhwBna() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC55843xrb
    public void EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AkhnZx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void KWHzl(boolean z) {
        this.OLrzqt = z;
    }

    @Override // o.InterfaceC55843xrb
    public void copydefault() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC55843xrb
    public void copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.gEmmrt = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC55843xrb
    public java.util.HashMap<java.lang.String, java.lang.Boolean> djBIcL() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC55843xrb
    public java.lang.String fIwbmz() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC55843xrb
    public java.lang.String fetchVPNInfo() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC55843xrb
    public TradeLiveData<C55853xrl> gEmmrt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean getNewProxyInstance() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC55843xrb
    public android.os.Parcelable isConnected() {
        return this.AYXKKw;
    }

    @Override // o.InterfaceC55843xrb
    public boolean iwGUEr() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean uzCIH() {
        return this.copydefault;
    }

    @Override // o.InterfaceC55843xrb
    public void copydefault(android.os.Bundle bundle) {
        ContractGridReq contractGridReq;
        StrategyConfigInfo strategyConfigInfo;
        java.lang.String min;
        java.lang.String max;
        java.lang.String min2;
        java.lang.String max2;
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        StrategyConfigInfo strategyConfigInfo2;
        ContractGridReq contractGridReq2;
        if (bundle == null || (contractGridReq2 = (ContractGridReq) bundle.getParcelable("bot_grid_req")) == null || (contractGridReq = (ContractGridReq) xVA.EZpvd(contractGridReq2)) == null) {
            contractGridReq = new ContractGridReq((java.lang.String) null, (java.lang.String) null, (java.lang.Boolean) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.ArrayList) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.Boolean) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.Boolean) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, -1, 15, (DefaultConstructorMarker) null);
        }
        this.AYXKKw = contractGridReq;
        if (bundle == null || (strategyConfigInfo2 = (StrategyConfigInfo) bundle.getParcelable("bot_config")) == null || (strategyConfigInfo = (StrategyConfigInfo) xVA.EZpvd(strategyConfigInfo2)) == null) {
            strategyConfigInfo = new StrategyConfigInfo((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (java.lang.String) null, (java.lang.String) null, (SpotGridTpSlConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (BotRangeConfig) null, (java.lang.String) null, (java.lang.String) null, (LmtOrderNumber) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (SmartEarnConfig) null, (java.lang.String) null, (java.util.List) null, (java.util.List) null, (java.lang.String) null, (GridProfitAutoReinvestResponse) null, (SmartPortfolioConfig) null, (SlippageControl) null, -1, -1, 131071, (DefaultConstructorMarker) null);
        }
        TradeLiveData<C55853xrl> tradeLiveDataGEmmrt = gEmmrt();
        BotRangeConfig tpPct = strategyConfigInfo.getTpPct();
        if (tpPct == null || (min = tpPct.getMin()) == null) {
            min = "0.004";
        }
        BotRangeConfig tpPct2 = strategyConfigInfo.getTpPct();
        if (tpPct2 == null || (max = tpPct2.getMax()) == null) {
            max = "100";
        }
        BotRangeConfig slPct = strategyConfigInfo.getSlPct();
        if (slPct == null || (min2 = slPct.getMin()) == null) {
            min2 = "0.005";
        }
        BotRangeConfig slPct2 = strategyConfigInfo.getSlPct();
        if (slPct2 == null || (max2 = slPct2.getMax()) == null) {
            max2 = "0.9999";
        }
        tradeLiveDataGEmmrt.setValue(new C55853xrl(min, max, min2, max2));
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        BizInstrument suggestedInstrument$default = interfaceC54581xNrOLrzqt != null ? InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, this.AYXKKw.getInstType(), this.AYXKKw.getInstId(), null, null, 12, null) : null;
        if (interfaceC54581xNrOLrzqt != null) {
            java.lang.String instType = suggestedInstrument$default != null ? suggestedInstrument$default.getInstType() : null;
            if (instType == null) {
                instType = "";
            }
            abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt.OLrzqt(instType);
        } else {
            abstractC54531xLwOLrzqt = null;
        }
        java.lang.String strDjBIcL = abstractC54531xLwOLrzqt != null ? abstractC54531xLwOLrzqt.djBIcL(suggestedInstrument$default) : null;
        if (strDjBIcL == null) {
            strDjBIcL = "";
        }
        this.valueOf = strDjBIcL;
        if (abstractC54531xLwOLrzqt != null) {
            instFamily = suggestedInstrument$default != null ? suggestedInstrument$default.getInstFamily() : null;
            if (instFamily == null) {
                instFamily = "";
            }
            instFamily = abstractC54531xLwOLrzqt.fIwbmz(instFamily);
        }
        int iAhwBna = C33129mqd.AhwBna(instFamily);
        if (iAhwBna > 0) {
            this.djBIcL = iAhwBna;
        }
        java.lang.String tpTriggerPx = this.AYXKKw.getTpTriggerPx();
        if (tpTriggerPx == null) {
            tpTriggerPx = "";
        }
        this.AkhnZx = C56040xvM.EZpvd(tpTriggerPx);
        java.lang.String slTriggerPx = this.AYXKKw.getSlTriggerPx();
        this.gEmmrt = C56040xvM.copydefault(slTriggerPx != null ? slTriggerPx : "");
        fARcdN();
        ejfBZ();
        AEQbTJ(C54782xVc.AEQbTJ.AhwBna());
    }

    public void fARcdN() {
        java.util.HashMap<java.lang.String, java.lang.Boolean> mapDjBIcL = djBIcL();
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        mapDjBIcL.put("ticker_info", bool);
        djBIcL().put("price_range", bool);
    }

    public void ejfBZ() {
        AYXKKw().put("price_range", C56040xvM.AEQbTJ(this.AYXKKw.getInstType(), this.AYXKKw.getInstId(), this.AYXKKw.getMinPx(), this.AYXKKw.getMaxPx()));
    }

    @Override // o.InterfaceC55843xrb
    public java.lang.String fJNWhG() {
        java.lang.String str = this.AkhnZx;
        java.lang.String instType = this.AYXKKw.getInstType();
        java.lang.String instId = this.AYXKKw.getInstId();
        java.lang.String tpTriggerPx = this.AYXKKw.getTpTriggerPx();
        if (tpTriggerPx == null) {
            tpTriggerPx = "";
        }
        java.lang.String tpRatio = this.AYXKKw.getTpRatio();
        return C56040xvM.copydefault(str, instType, instId, tpTriggerPx, tpRatio != null ? tpRatio : "");
    }

    @Override // o.InterfaceC55843xrb
    public java.lang.String AkhnZx() {
        java.lang.String str = this.gEmmrt;
        java.lang.String instType = this.AYXKKw.getInstType();
        java.lang.String instId = this.AYXKKw.getInstId();
        java.lang.String slTriggerPx = this.AYXKKw.getSlTriggerPx();
        if (slTriggerPx == null) {
            slTriggerPx = "";
        }
        java.lang.String slRatio = this.AYXKKw.getSlRatio();
        return C56040xvM.EZpvd(str, instType, instId, slTriggerPx, slRatio != null ? slRatio : "");
    }

    @Override // o.InterfaceC55843xrb
    public void OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (Intrinsics.EZpvd((java.lang.Object) fIwbmz(), (java.lang.Object) "tp_sl_price")) {
            this.AYXKKw.setTpTriggerPx(StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str) ? "" : C56033xvF.AEQbTJ(str, this.AYXKKw.getInstType(), this.AYXKKw.getInstId()));
        } else {
            this.AYXKKw.setTpRatio(StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str) ? "" : C33129mqd.divS$default(str, 100, null, null, null, 14, null));
        }
    }

    @Override // o.InterfaceC55843xrb
    public void AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (Intrinsics.EZpvd((java.lang.Object) fetchVPNInfo(), (java.lang.Object) "tp_sl_price")) {
            this.AYXKKw.setSlTriggerPx(StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str) ? "" : C56033xvF.AEQbTJ(str, this.AYXKKw.getInstType(), this.AYXKKw.getInstId()));
        } else {
            this.AYXKKw.setSlRatio(StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str) ? "" : C33129mqd.divS$default(str, 100, null, null, null, 14, null));
        }
    }

    @Override // o.InterfaceC55843xrb
    public void OLrzqt(boolean z, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (z || !(!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str))) {
            return;
        }
        C32866mlf.onEvent$default("BotPlaceOrder_AdvancedSetting_TPSLInputBox_Input", (TrackChannel[]) null, new Function1() { // from class: o.xqP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C55780xqR.OLrzqt((EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit OLrzqt(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "bot_type", "contract_grid", false, 4, null);
        EventParamsList.put$default(eventParamsList, "tpsl_input", "take_profit", false, 4, null);
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC55843xrb
    public void EZpvd(boolean z, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (z || !(!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str))) {
            return;
        }
        C32866mlf.onEvent$default("BotPlaceOrder_AdvancedSetting_TPSLInputBox_Input", (TrackChannel[]) null, new Function1() { // from class: o.xqN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C55780xqR.KWHzl((EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit KWHzl(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "bot_type", "contract_grid", false, 4, null);
        EventParamsList.put$default(eventParamsList, "tpsl_input", "stop_loss", false, 4, null);
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC55843xrb
    public boolean getFieldNames() {
        ContractGridReq contractGridReq = this.AYXKKw;
        return C56040xvM.OLrzqt(contractGridReq.getTpTriggerPx(), contractGridReq.getTpRatio(), contractGridReq.getSlTriggerPx(), contractGridReq.getSlRatio());
    }

    @Override // o.InterfaceC55843xrb
    public boolean hDKMBd() {
        ContractGridReq contractGridReq = this.AYXKKw;
        return C56040xvM.KWHzl(contractGridReq.getTpTriggerPx(), contractGridReq.getTpRatio(), contractGridReq.getSlTriggerPx(), contractGridReq.getSlRatio());
    }

    @Override // o.InterfaceC55843xrb
    public C55851xrj AuCTel() {
        return C56040xvM.KWHzl(this.AkhnZx, this.djBIcL, this.valueOf, gEmmrt().getValue());
    }

    @Override // o.InterfaceC55843xrb
    public C55851xrj values() {
        return C56040xvM.OLrzqt(this.gEmmrt, this.djBIcL, this.valueOf, gEmmrt().getValue());
    }

    @Override // o.InterfaceC55843xrb
    public void EZpvd() {
        this.AYXKKw.setTpTriggerPx(null);
        this.AYXKKw.setTpRatio(null);
    }

    @Override // o.InterfaceC55843xrb
    public void KWHzl() {
        this.AYXKKw.setSlTriggerPx(null);
        this.AYXKKw.setSlRatio(null);
    }

    @Override // o.InterfaceC55843xrb
    public kotlin.Pair<java.lang.Boolean, java.lang.Object> OLrzqt() {
        if (Intrinsics.EZpvd((java.lang.Object) this.AkhnZx, (java.lang.Object) "tp_sl_price")) {
            xVK xvk = xVK.EZpvd;
            java.lang.String tpTriggerPx = this.AYXKKw.getTpTriggerPx();
            if (tpTriggerPx == null) {
                tpTriggerPx = "";
            }
            java.lang.String[] strArrEZpvd = xvk.EZpvd(tpTriggerPx, this.AYXKKw.getInstId(), this.AYXKKw.getInstType());
            if (strArrEZpvd == null || strArrEZpvd.length == 0) {
                java.lang.String strKWHzl = C56038xvK.KWHzl(this.AYXKKw);
                if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strKWHzl)) {
                    return new kotlin.Pair<>(java.lang.Boolean.TRUE, "");
                }
                return new kotlin.Pair<>(java.lang.Boolean.FALSE, strKWHzl);
            }
            return new kotlin.Pair<>(java.lang.Boolean.FALSE, strArrEZpvd);
        }
        java.lang.String strAEQbTJ = C56038xvK.AEQbTJ(this.AYXKKw, gEmmrt().getValue());
        if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strAEQbTJ)) {
            return new kotlin.Pair<>(java.lang.Boolean.TRUE, "");
        }
        return new kotlin.Pair<>(java.lang.Boolean.FALSE, strAEQbTJ);
    }

    @Override // o.InterfaceC55843xrb
    public kotlin.Pair<java.lang.Boolean, java.lang.Object> AEQbTJ() {
        if (Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) "tp_sl_price")) {
            xVK xvk = xVK.EZpvd;
            java.lang.String slTriggerPx = this.AYXKKw.getSlTriggerPx();
            if (slTriggerPx == null) {
                slTriggerPx = "";
            }
            java.lang.String[] strArrEZpvd = xvk.EZpvd(slTriggerPx, this.AYXKKw.getInstId(), this.AYXKKw.getInstType());
            if (strArrEZpvd == null || strArrEZpvd.length == 0) {
                java.lang.String strEZpvd = C56038xvK.EZpvd(this.AYXKKw);
                if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strEZpvd)) {
                    return new kotlin.Pair<>(java.lang.Boolean.TRUE, "");
                }
                return new kotlin.Pair<>(java.lang.Boolean.FALSE, strEZpvd);
            }
            return new kotlin.Pair<>(java.lang.Boolean.FALSE, strArrEZpvd);
        }
        java.lang.String strEZpvd2 = C56038xvK.EZpvd(this.AYXKKw, gEmmrt().getValue());
        if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strEZpvd2)) {
            return new kotlin.Pair<>(java.lang.Boolean.TRUE, "");
        }
        return new kotlin.Pair<>(java.lang.Boolean.FALSE, strEZpvd2);
    }

    @Override // o.InterfaceC55843xrb
    public void copydefault(boolean z) {
        AEQbTJ(z);
    }

    @Override // o.InterfaceC55843xrb
    public void EZpvd(boolean z) {
        KWHzl(z);
    }

    @Override // o.InterfaceC55843xrb
    public kotlin.Pair<java.lang.String, java.lang.Integer> DbNXlk() {
        return C56040xvM.KWHzl(this.AkhnZx, this.gEmmrt, uzCIH(), getNewProxyInstance());
    }

    @Override // o.InterfaceC55843xrb
    public java.lang.String valueOf() {
        java.lang.String strAYXKKw;
        java.lang.String instType = this.AYXKKw.getInstType();
        java.lang.String instId = this.AYXKKw.getInstId();
        xMJ.Application value = AhwBna().getValue();
        if (value == null || (strAYXKKw = value.AYXKKw()) == null) {
            strAYXKKw = "";
        }
        return C56040xvM.copydefault(instType, instId, strAYXKKw);
    }
}
