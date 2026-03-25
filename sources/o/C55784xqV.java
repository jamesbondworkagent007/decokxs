package o;

import androidx.lifecycle.TradeLiveData;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.BotRangeConfig;
import com.okinc.unify_trade.biz.GridProfitAutoReinvestResponse;
import com.okinc.unify_trade.biz.GridReq;
import com.okinc.unify_trade.biz.LmtOrderNumber;
import com.okinc.unify_trade.biz.ProfitAutoReinvestParam;
import com.okinc.unify_trade.biz.SlippageControl;
import com.okinc.unify_trade.biz.SmartPortfolioConfig;
import com.okinc.unify_trade.biz.SpotGridTpSlConfig;
import com.okinc.unify_trade.biz.StrategyConfigInfo;
import com.okinc.unify_trade.biz.TrailingConfig;
import com.okinc.unify_trade.biz.bot.SmartEarnConfig;
import com.okinc.unify_trade.biz.bot.SmartEarnRequestParam;
import com.okinc.unify_trade.biz.bot.TpSLTriggerItem;
import com.okinc.unify_trade.biz.bot.TpSlTriggerParam;
import com.okinc.unify_trade.biz.bot.TpSlTriggerParamReqResp;
import com.okinc.unify_trade.bot.config.SpotTpSlTypeConfigData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C52761wXj;
import o.C55688xof;
import o.InterfaceC54581xNr;
import o.xMJ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xqV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C55784xqV implements InterfaceC55873xsE {
    public java.lang.String AEQbTJ;
    public C55850xri AkhnZx;
    public java.lang.String isConnected;
    public GridReq gEmmrt = new GridReq((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (TpSlTriggerParamReqResp) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.ArrayList) null, (java.lang.Boolean) null, (TrailingConfig) null, (TrailingConfig) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (SmartEarnRequestParam) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (ProfitAutoReinvestParam) null, -1, 15, (DefaultConstructorMarker) null);
    public java.util.HashMap<java.lang.String, java.lang.Boolean> KWHzl = new java.util.HashMap<>();
    public TradeLiveData<xMJ.Application> fetchVPNInfo = new TradeLiveData<>();
    public TradeLiveData<SpotGridTpSlConfig> valueOf = new TradeLiveData<>();
    public TradeLiveData<C55853xrl> AYXKKw = new TradeLiveData<>();
    public java.util.HashMap<java.lang.String, java.lang.String> OLrzqt = new java.util.HashMap<>();
    public boolean copydefault = true;
    public boolean EZpvd = true;
    public java.lang.String djBIcL = "";
    public int AhwBna = 8;
    public TpSlTriggerParam values = new TpSlTriggerParam((java.lang.String) null, (java.lang.String) null, (TpSLTriggerItem) null, (TpSLTriggerItem) null, 15, (DefaultConstructorMarker) null);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void AEQbTJ(boolean z) {
        this.EZpvd = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC55843xrb
    public java.util.HashMap<java.lang.String, java.lang.String> AYXKKw() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC55843xrb
    public TradeLiveData<xMJ.Application> AhwBna() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC55873xsE
    public TpSlTriggerParam AubY() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void KWHzl(boolean z) {
        this.copydefault = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void OLrzqt(@NotNull TradeLiveData<xMJ.Application> tradeLiveData) {
        Intrinsics.checkNotNullParameter(tradeLiveData, "");
        this.fetchVPNInfo = tradeLiveData;
    }

    @Override // o.InterfaceC55843xrb
    public void copydefault() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC55843xrb
    public java.util.HashMap<java.lang.String, java.lang.Boolean> djBIcL() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC55873xsE
    public TradeLiveData<SpotGridTpSlConfig> ejfBZ() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC55843xrb
    public TradeLiveData<C55853xrl> gEmmrt() {
        return this.AYXKKw;
    }

    @Override // o.InterfaceC55843xrb
    public boolean iwGUEr() {
        return false;
    }

    @Override // o.InterfaceC55873xsE
    public boolean wlaJM() {
        return true;
    }

    public final java.lang.String uzCIH() {
        return this.values.getTp().getValue();
    }

    public final void AhwBna(java.lang.String str) {
        this.values.getTp().setValue(str);
    }

    public final java.lang.String getNewProxyInstance() {
        return this.values.getSl().getValue();
    }

    public final void djBIcL(java.lang.String str) {
        this.values.getSl().setValue(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x019a  */
    @Override // o.InterfaceC55843xrb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void copydefault(android.os.Bundle bundle) {
        GridReq gridReq;
        java.lang.String string;
        StrategyConfigInfo strategyConfigInfo;
        java.lang.String tradeSymbol;
        java.lang.String displayQuoteSymbol;
        int iIntValue;
        TpSlTriggerParam tpSlTriggerParam;
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        java.lang.String strFIwbmz;
        StrategyConfigInfo strategyConfigInfo2;
        GridReq gridReq2;
        if (bundle == null || (gridReq2 = (GridReq) bundle.getParcelable("bot_grid_req")) == null || (gridReq = (GridReq) xVA.EZpvd(gridReq2)) == null) {
            gridReq = new GridReq((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (TpSlTriggerParamReqResp) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.ArrayList) null, (java.lang.Boolean) null, (TrailingConfig) null, (TrailingConfig) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (SmartEarnRequestParam) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (ProfitAutoReinvestParam) null, -1, 15, (DefaultConstructorMarker) null);
        }
        this.gEmmrt = gridReq;
        if (bundle == null || (string = bundle.getString("bot_order_amount")) == null) {
            string = "";
        }
        this.AEQbTJ = string;
        if (bundle == null || (strategyConfigInfo2 = (StrategyConfigInfo) bundle.getParcelable("bot_config")) == null || (strategyConfigInfo = (StrategyConfigInfo) xVA.EZpvd(strategyConfigInfo2)) == null) {
            strategyConfigInfo = new StrategyConfigInfo((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (java.lang.String) null, (java.lang.String) null, (SpotGridTpSlConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (BotRangeConfig) null, (java.lang.String) null, (java.lang.String) null, (LmtOrderNumber) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (SmartEarnConfig) null, (java.lang.String) null, (java.util.List) null, (java.util.List) null, (java.lang.String) null, (GridProfitAutoReinvestResponse) null, (SmartPortfolioConfig) null, (SlippageControl) null, -1, -1, 131071, (DefaultConstructorMarker) null);
        }
        ejfBZ().setValue(strategyConfigInfo.getTpslConfig());
        C54589xNz c54589xNz = C54589xNz.EZpvd;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = c54589xNz.OLrzqt();
        C55850xri c55850xri = null;
        BizInstrument suggestedInstrument$default = interfaceC54581xNrOLrzqt != null ? InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, this.gEmmrt.getInstType(), this.gEmmrt.getInstId(), null, null, 12, null) : null;
        if (suggestedInstrument$default == null || (tradeSymbol = suggestedInstrument$default.getTradeSymbol()) == null) {
            tradeSymbol = "";
        }
        this.isConnected = tradeSymbol;
        if (suggestedInstrument$default == null || (displayQuoteSymbol = suggestedInstrument$default.getDisplayQuoteSymbol()) == null) {
            displayQuoteSymbol = "";
        }
        this.djBIcL = displayQuoteSymbol;
        if (suggestedInstrument$default == null) {
            iIntValue = 8;
        } else {
            InterfaceC54581xNr interfaceC54581xNrOLrzqt2 = c54589xNz.OLrzqt();
            java.lang.Integer numValueOf = (interfaceC54581xNrOLrzqt2 == null || (abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt2.OLrzqt(suggestedInstrument$default.getInstType())) == null || (strFIwbmz = abstractC54531xLwOLrzqt.fIwbmz(suggestedInstrument$default.getInstFamily())) == null) ? null : java.lang.Integer.valueOf(C33129mqd.AhwBna(strFIwbmz));
            if (numValueOf != null) {
                iIntValue = numValueOf.intValue();
            }
        }
        this.AhwBna = iIntValue;
        this.AkhnZx = new C55850xri(this.gEmmrt.getInstType(), this.gEmmrt.getInstId(), this.gEmmrt.getSourceCcy(), this.gEmmrt.getTradeQuoteCcy());
        TpSlTriggerParamReqResp tpslTriggerParamReq = this.gEmmrt.getTpslTriggerParamReq();
        if (tpslTriggerParamReq == null || (tpSlTriggerParam = C55765xqC.OLrzqt(tpslTriggerParamReq)) == null) {
            tpSlTriggerParam = new TpSlTriggerParam((java.lang.String) null, (java.lang.String) null, (TpSLTriggerItem) null, (TpSLTriggerItem) null, 15, (DefaultConstructorMarker) null);
        }
        java.lang.String stopType = tpSlTriggerParam.getStopType();
        if (stopType == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) stopType)) {
            C55850xri c55850xri2 = this.AkhnZx;
            if (c55850xri2 == null) {
                Intrinsics.gEmmrt("");
            } else {
                c55850xri = c55850xri2;
            }
            tpSlTriggerParam.setStopType(c55850xri.EZpvd());
        }
        this.values = tpSlTriggerParam;
        OLrzqt(C54782xVc.AEQbTJ.AhwBna());
        AuCTelauCTel();
        zLjUOn();
    }

    public void AuCTelauCTel() {
        C56044xvQ.KWHzl(this.gEmmrt.getTrailingUpConfig(), this.gEmmrt.getTrailingDownConfig(), djBIcL());
    }

    public void zLjUOn() {
        GridReq gridReq = this.gEmmrt;
        C56044xvQ.copydefault(gridReq.getInstType(), gridReq.getInstId(), gridReq.getTrailingUpConfig(), gridReq.getTrailingDownConfig(), gridReq.getMinPx(), gridReq.getMaxPx(), this.djBIcL, AYXKKw());
    }

    @Override // o.InterfaceC55843xrb
    public void EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.values.getTp().setIndicator(str);
    }

    @Override // o.InterfaceC55843xrb
    public void copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.values.getSl().setIndicator(str);
    }

    @Override // o.InterfaceC55843xrb
    public void OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str)) {
            AhwBna("");
            return;
        }
        C55850xri c55850xri = this.AkhnZx;
        if (c55850xri == null) {
            Intrinsics.gEmmrt("");
            c55850xri = null;
        }
        AhwBna(c55850xri.KWHzl(str, this.values));
    }

    @Override // o.InterfaceC55843xrb
    public void AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str)) {
            djBIcL("");
            return;
        }
        C55850xri c55850xri = this.AkhnZx;
        if (c55850xri == null) {
            Intrinsics.gEmmrt("");
            c55850xri = null;
        }
        djBIcL(c55850xri.EZpvd(str, this.values));
    }

    @Override // o.InterfaceC55843xrb
    public void OLrzqt(boolean z, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (z || !(!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str))) {
            return;
        }
        C32866mlf.onEvent$default("BotPlaceOrder_AdvancedSetting_TPSLInputBox_Input", (TrackChannel[]) null, new Function1() { // from class: o.xra
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C55784xqV.AEQbTJ((EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit AEQbTJ(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "bot_type", "grid", false, 4, null);
        EventParamsList.put$default(eventParamsList, "tpsl_input", "take_profit", false, 4, null);
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC55843xrb
    public void EZpvd(boolean z, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (z || !(!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str))) {
            return;
        }
        C32866mlf.onEvent$default("BotPlaceOrder_AdvancedSetting_TPSLInputBox_Input", (TrackChannel[]) null, new Function1() { // from class: o.xqZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C55784xqV.EZpvd((EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit EZpvd(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "bot_type", "grid", false, 4, null);
        EventParamsList.put$default(eventParamsList, "tpsl_input", "stop_loss", false, 4, null);
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC55843xrb
    public boolean getFieldNames() {
        return C56044xvQ.EZpvd(uzCIH(), this.gEmmrt.getSlTriggerPx());
    }

    @Override // o.InterfaceC55843xrb
    public boolean hDKMBd() {
        return C56044xvQ.OLrzqt(getNewProxyInstance(), this.gEmmrt.getSlTriggerPx());
    }

    @Override // o.InterfaceC55843xrb
    public java.lang.String fJNWhG() {
        C55850xri c55850xri = this.AkhnZx;
        if (c55850xri == null) {
            Intrinsics.gEmmrt("");
            c55850xri = null;
        }
        return c55850xri.EZpvd(this.values);
    }

    @Override // o.InterfaceC55843xrb
    public java.lang.String AkhnZx() {
        C55850xri c55850xri = this.AkhnZx;
        if (c55850xri == null) {
            Intrinsics.gEmmrt("");
            c55850xri = null;
        }
        return c55850xri.copydefault(this.values);
    }

    @Override // o.InterfaceC55843xrb
    public java.lang.String fIwbmz() {
        return this.values.getTp().getIndicator();
    }

    @Override // o.InterfaceC55843xrb
    public java.lang.String fetchVPNInfo() {
        return this.values.getSl().getIndicator();
    }

    @Override // o.InterfaceC55843xrb
    public C55851xrj AuCTel() {
        C55850xri c55850xri = this.AkhnZx;
        if (c55850xri == null) {
            Intrinsics.gEmmrt("");
            c55850xri = null;
        }
        TpSlTriggerParam tpSlTriggerParam = this.values;
        SpotGridTpSlConfig value = ejfBZ().getValue();
        if (value == null) {
            value = new SpotGridTpSlConfig((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 31, (DefaultConstructorMarker) null);
        }
        return c55850xri.copydefault(tpSlTriggerParam, value);
    }

    @Override // o.InterfaceC55843xrb
    public C55851xrj values() {
        C55850xri c55850xri = this.AkhnZx;
        java.lang.String str = null;
        if (c55850xri == null) {
            Intrinsics.gEmmrt("");
            c55850xri = null;
        }
        TpSlTriggerParam tpSlTriggerParam = this.values;
        SpotGridTpSlConfig value = ejfBZ().getValue();
        if (value == null) {
            value = new SpotGridTpSlConfig((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 31, (DefaultConstructorMarker) null);
        }
        java.lang.String str2 = this.AEQbTJ;
        if (str2 == null) {
            Intrinsics.gEmmrt("");
        } else {
            str = str2;
        }
        return c55850xri.OLrzqt(tpSlTriggerParam, value, str);
    }

    @Override // o.InterfaceC55843xrb
    public void EZpvd() {
        AhwBna(null);
    }

    @Override // o.InterfaceC55843xrb
    public void KWHzl() {
        djBIcL(null);
    }

    @Override // o.InterfaceC55843xrb
    public kotlin.Pair<java.lang.Boolean, java.lang.Object> OLrzqt() {
        java.lang.String[] strArrEZpvd;
        java.lang.String strAYXKKw;
        C55850xri c55850xri = null;
        java.lang.String str = "";
        if (Intrinsics.EZpvd((java.lang.Object) this.values.getTp().getIndicator(), (java.lang.Object) SpotTpSlTypeConfigData.PRICE.getType())) {
            xVK xvk = xVK.EZpvd;
            java.lang.String strUzCIH = uzCIH();
            if (strUzCIH == null) {
                strUzCIH = "";
            }
            strArrEZpvd = xvk.EZpvd(strUzCIH, this.gEmmrt.getInstId(), this.gEmmrt.getInstType());
        } else {
            strArrEZpvd = null;
        }
        if (strArrEZpvd == null || strArrEZpvd.length == 0) {
            C55850xri c55850xri2 = this.AkhnZx;
            if (c55850xri2 == null) {
                Intrinsics.gEmmrt("");
            } else {
                c55850xri = c55850xri2;
            }
            TpSlTriggerParam tpSlTriggerParam = this.values;
            SpotGridTpSlConfig value = ejfBZ().getValue();
            if (value == null) {
                value = new SpotGridTpSlConfig((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 31, (DefaultConstructorMarker) null);
            }
            xMJ.Application value2 = C54782xVc.AEQbTJ.AhwBna().getValue();
            if (value2 != null && (strAYXKKw = value2.AYXKKw()) != null) {
                str = strAYXKKw;
            }
            java.lang.String strAEQbTJ = c55850xri.AEQbTJ(tpSlTriggerParam, value, str);
            return new kotlin.Pair<>(java.lang.Boolean.valueOf(StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strAEQbTJ)), strAEQbTJ);
        }
        return new kotlin.Pair<>(java.lang.Boolean.FALSE, strArrEZpvd);
    }

    @Override // o.InterfaceC55843xrb
    public kotlin.Pair<java.lang.Boolean, java.lang.Object> AEQbTJ() {
        java.lang.String[] strArrEZpvd;
        java.lang.String strAYXKKw;
        java.lang.String str = "";
        java.lang.String str2 = null;
        if (Intrinsics.EZpvd((java.lang.Object) this.values.getSl().getIndicator(), (java.lang.Object) SpotTpSlTypeConfigData.PRICE.getType())) {
            xVK xvk = xVK.EZpvd;
            java.lang.String newProxyInstance = getNewProxyInstance();
            if (newProxyInstance == null) {
                newProxyInstance = "";
            }
            strArrEZpvd = xvk.EZpvd(newProxyInstance, this.gEmmrt.getInstId(), this.gEmmrt.getInstType());
        } else {
            strArrEZpvd = null;
        }
        if (strArrEZpvd == null || strArrEZpvd.length == 0) {
            C55850xri c55850xri = this.AkhnZx;
            if (c55850xri == null) {
                Intrinsics.gEmmrt("");
                c55850xri = null;
            }
            TpSlTriggerParam tpSlTriggerParam = this.values;
            java.lang.String str3 = this.AEQbTJ;
            if (str3 == null) {
                Intrinsics.gEmmrt("");
            } else {
                str2 = str3;
            }
            SpotGridTpSlConfig value = ejfBZ().getValue();
            if (value == null) {
                value = new SpotGridTpSlConfig((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 31, (DefaultConstructorMarker) null);
            }
            xMJ.Application value2 = C54782xVc.AEQbTJ.AhwBna().getValue();
            if (value2 != null && (strAYXKKw = value2.AYXKKw()) != null) {
                str = strAYXKKw;
            }
            java.lang.String strEZpvd = c55850xri.EZpvd(tpSlTriggerParam, str2, value, str);
            return new kotlin.Pair<>(java.lang.Boolean.valueOf(StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strEZpvd)), strEZpvd);
        }
        return new kotlin.Pair<>(java.lang.Boolean.FALSE, strArrEZpvd);
    }

    @Override // o.InterfaceC55843xrb
    public kotlin.Pair<java.lang.String, java.lang.Integer> DbNXlk() {
        java.lang.String strUzCIH = uzCIH();
        TrailingConfig trailingUpConfig = this.gEmmrt.getTrailingUpConfig();
        java.lang.String stopPx = trailingUpConfig != null ? trailingUpConfig.getStopPx() : null;
        boolean z = false;
        boolean z2 = C33129mqd.AEQbTJ(strUzCIH, 0) && C33129mqd.AEQbTJ(stopPx, 0) && C33129mqd.gEmmrt(strUzCIH, stopPx);
        java.lang.String newProxyInstance = getNewProxyInstance();
        TrailingConfig trailingDownConfig = this.gEmmrt.getTrailingDownConfig();
        java.lang.String stopPx2 = trailingDownConfig != null ? trailingDownConfig.getStopPx() : null;
        if (C33129mqd.AEQbTJ(newProxyInstance, 0) && C33129mqd.AEQbTJ(stopPx2, 0) && C33129mqd.AEQbTJ(newProxyInstance, stopPx2)) {
            z = true;
        }
        java.lang.String strAYXKKw = z2 ? C33070mpX.AYXKKw(C55688xof.Application.RestrictTo) : "";
        if (z) {
            strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.RequiresPermissionRead);
        }
        if (z2 && z) {
            strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.conditional);
        }
        return new kotlin.Pair<>(strAYXKKw, java.lang.Integer.valueOf(C33070mpX.copydefault(C52761wXj.Activity.iLAtSv)));
    }

    @Override // o.InterfaceC55843xrb
    public void copydefault(boolean z) {
        KWHzl(z);
    }

    @Override // o.InterfaceC55843xrb
    public void EZpvd(boolean z) {
        AEQbTJ(z);
    }

    @Override // o.InterfaceC55843xrb
    public java.lang.String valueOf() {
        java.lang.String strAYXKKw;
        java.lang.String instType = this.gEmmrt.getInstType();
        java.lang.String instId = this.gEmmrt.getInstId();
        xMJ.Application value = AhwBna().getValue();
        if (value == null || (strAYXKKw = value.AYXKKw()) == null) {
            strAYXKKw = "";
        }
        return C56044xvQ.OLrzqt(instType, instId, strAYXKKw);
    }

    @Override // o.InterfaceC55843xrb
    public android.os.Parcelable isConnected() {
        GridReq gridReq = this.gEmmrt;
        gridReq.setTpslTriggerParamReq(C55765xqC.AEQbTJ(this.values));
        return gridReq;
    }

    @Override // o.InterfaceC55873xsE
    public void AYXKKw(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.values.setStopType(str);
    }

    @Override // o.InterfaceC55873xsE
    public void KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.values.setDelaySeconds(str);
    }

    @Override // o.InterfaceC55873xsE
    public kotlin.Pair<java.lang.Boolean, java.lang.String> fARcdN() {
        TpSlTriggerParam tpSlTriggerParam = this.values;
        SpotGridTpSlConfig value = ejfBZ().getValue();
        if (value == null) {
            value = new SpotGridTpSlConfig((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 31, (DefaultConstructorMarker) null);
        }
        java.lang.String strAEQbTJ = C56042xvO.AEQbTJ(tpSlTriggerParam, value);
        return new kotlin.Pair<>(java.lang.Boolean.valueOf(StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strAEQbTJ)), strAEQbTJ);
    }

    @Override // o.InterfaceC55873xsE
    public C55850xri zsXlph() {
        C55850xri c55850xri = this.AkhnZx;
        if (c55850xri != null) {
            return c55850xri;
        }
        Intrinsics.gEmmrt("");
        return null;
    }
}
