package o;

import androidx.lifecycle.TradeLiveData;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.BotRangeConfig;
import com.okinc.unify_trade.biz.GridOrderTpSlReq;
import com.okinc.unify_trade.biz.GridProfitAutoReinvestResponse;
import com.okinc.unify_trade.biz.LmtOrderNumber;
import com.okinc.unify_trade.biz.SlippageControl;
import com.okinc.unify_trade.biz.SmartPortfolioConfig;
import com.okinc.unify_trade.biz.SpotGridTpSlConfig;
import com.okinc.unify_trade.biz.StrategyConfigInfo;
import com.okinc.unify_trade.biz.StrategyDetailsResponse;
import com.okinc.unify_trade.biz.TrailingConfig;
import com.okinc.unify_trade.biz.bot.SmartEarnConfig;
import com.okinc.unify_trade.biz.bot.TpSLTriggerItem;
import com.okinc.unify_trade.biz.bot.TpSlTriggerParam;
import com.okinc.unify_trade.biz.bot.TpSlTriggerParamReqResp;
import com.okinc.unify_trade.bot.config.SpotTpSlTypeConfigData;
import com.okinc.unify_trade.bot.data.TacticsData;
import java.math.RoundingMode;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.InterfaceC54581xNr;
import o.xMJ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xqX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C55786xqX implements InterfaceC55873xsE {
    public boolean AEQbTJ;
    public TradeLiveData<SpotGridTpSlConfig> AYXKKw;
    public int AhwBna;
    public final TradeLiveData<C55804xqp<StrategyDetailsResponse>> AkhnZx;
    public TpSlTriggerParam DbNXlk;
    public java.util.HashMap<java.lang.String, java.lang.String> EZpvd;
    public java.util.HashMap<java.lang.String, java.lang.Boolean> KWHzl;
    public final C55777xqO OLrzqt;
    public boolean copydefault;
    public TradeLiveData<xMJ.Application> djBIcL;
    public C55850xri fetchVPNInfo;
    public TradeLiveData<C55853xrl> gEmmrt;
    public TacticsData isConnected;
    public java.lang.String valueOf;
    public TpSlTriggerParam values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void AEQbTJ(boolean z) {
        this.copydefault = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC55843xrb
    public java.util.HashMap<java.lang.String, java.lang.String> AYXKKw() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC55843xrb
    public TradeLiveData<xMJ.Application> AhwBna() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<C55804xqp<StrategyDetailsResponse>> AuCTelauCTel() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC55873xsE
    public TpSlTriggerParam AubY() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC55843xrb
    public void EZpvd(boolean z, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void KWHzl(boolean z) {
        this.AEQbTJ = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC55843xrb
    public void OLrzqt(boolean z, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC55843xrb
    public java.util.HashMap<java.lang.String, java.lang.Boolean> djBIcL() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC55873xsE
    public TradeLiveData<SpotGridTpSlConfig> ejfBZ() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC55843xrb
    public TradeLiveData<C55853xrl> gEmmrt() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C55777xqO getNewProxyInstance() {
        return this.OLrzqt;
    }

    @Override // o.InterfaceC55843xrb
    public boolean iwGUEr() {
        return false;
    }

    public C55786xqX() {
        C55777xqO c55777xqO = new C55777xqO();
        this.OLrzqt = c55777xqO;
        this.djBIcL = c55777xqO.fetchVPNInfo();
        this.gEmmrt = c55777xqO.KWHzl();
        this.KWHzl = new java.util.HashMap<>();
        this.EZpvd = new java.util.HashMap<>();
        this.copydefault = true;
        this.AEQbTJ = true;
        this.valueOf = "";
        this.AhwBna = 8;
        this.AYXKKw = new TradeLiveData<>();
        this.DbNXlk = new TpSlTriggerParam((java.lang.String) null, (java.lang.String) null, (TpSLTriggerItem) null, (TpSLTriggerItem) null, 15, (DefaultConstructorMarker) null);
        this.AkhnZx = new TradeLiveData<>();
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x018f  */
    @Override // o.InterfaceC55843xrb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void copydefault(android.os.Bundle bundle) {
        StrategyConfigInfo strategyConfigInfo;
        BizInstrument suggestedInstrument$default;
        java.lang.String displayQuoteSymbol;
        int iIntValue;
        java.lang.String instType;
        java.lang.String instId;
        TpSlTriggerParam tpSlTriggerParam;
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        java.lang.String strFIwbmz;
        java.lang.String instId2;
        java.lang.String instType2;
        java.lang.String algoId;
        java.lang.String instId3;
        StrategyConfigInfo strategyConfigInfo2;
        C55850xri c55850xri = null;
        TacticsData tacticsData = bundle != null ? (TacticsData) bundle.getParcelable("bot_grid_req") : null;
        if (!(tacticsData instanceof TacticsData)) {
            tacticsData = null;
        }
        this.isConnected = tacticsData;
        if (bundle == null || (strategyConfigInfo2 = (StrategyConfigInfo) bundle.getParcelable("bot_config")) == null || (strategyConfigInfo = (StrategyConfigInfo) xVA.EZpvd(strategyConfigInfo2)) == null) {
            strategyConfigInfo = new StrategyConfigInfo((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (java.lang.String) null, (java.lang.String) null, (SpotGridTpSlConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (BotRangeConfig) null, (java.lang.String) null, (java.lang.String) null, (LmtOrderNumber) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (SmartEarnConfig) null, (java.lang.String) null, (java.util.List) null, (java.util.List) null, (java.lang.String) null, (GridProfitAutoReinvestResponse) null, (SmartPortfolioConfig) null, (SlippageControl) null, -1, -1, 131071, (DefaultConstructorMarker) null);
        }
        ejfBZ().setValue(strategyConfigInfo.getTpslConfig());
        C55777xqO c55777xqO = this.OLrzqt;
        TacticsData tacticsData2 = this.isConnected;
        java.lang.String str = (tacticsData2 == null || (instId3 = tacticsData2.getInstId()) == null) ? "" : instId3;
        TacticsData tacticsData3 = this.isConnected;
        java.lang.String str2 = (tacticsData3 == null || (algoId = tacticsData3.getAlgoId()) == null) ? "" : algoId;
        TacticsData tacticsData4 = this.isConnected;
        java.lang.String slTriggerPx = tacticsData4 != null ? tacticsData4.getSlTriggerPx() : null;
        TacticsData tacticsData5 = this.isConnected;
        c55777xqO.KWHzl(new GridOrderTpSlReq(str2, str, slTriggerPx, tacticsData5 != null ? tacticsData5.getTpTriggerPx() : null, (TpSlTriggerParamReqResp) null, (java.util.List) null, (java.util.List) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 1008, (DefaultConstructorMarker) null));
        C54589xNz c54589xNz = C54589xNz.EZpvd;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = c54589xNz.OLrzqt();
        if (interfaceC54581xNrOLrzqt != null) {
            TacticsData tacticsData6 = this.isConnected;
            java.lang.String str3 = (tacticsData6 == null || (instType2 = tacticsData6.getInstType()) == null) ? "" : instType2;
            TacticsData tacticsData7 = this.isConnected;
            suggestedInstrument$default = InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, str3, (tacticsData7 == null || (instId2 = tacticsData7.getInstId()) == null) ? "" : instId2, null, null, 12, null);
        } else {
            suggestedInstrument$default = null;
        }
        if (suggestedInstrument$default == null || (displayQuoteSymbol = suggestedInstrument$default.getDisplayQuoteSymbol()) == null) {
            displayQuoteSymbol = "";
        }
        this.valueOf = displayQuoteSymbol;
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
        TacticsData tacticsData8 = this.isConnected;
        if (tacticsData8 == null || (instType = tacticsData8.getInstType()) == null) {
            instType = "";
        }
        TacticsData tacticsData9 = this.isConnected;
        if (tacticsData9 == null || (instId = tacticsData9.getInstId()) == null) {
            instId = "";
        }
        TacticsData tacticsData10 = this.isConnected;
        java.lang.String sourceCcy = tacticsData10 != null ? tacticsData10.getSourceCcy() : null;
        TacticsData tacticsData11 = this.isConnected;
        this.fetchVPNInfo = new C55850xri(instType, instId, sourceCcy, tacticsData11 != null ? tacticsData11.getTradeQuoteCcy() : null);
        TacticsData tacticsData12 = this.isConnected;
        if (tacticsData12 == null || (tpSlTriggerParam = tacticsData12.getTpslTriggerParam()) == null) {
            tpSlTriggerParam = new TpSlTriggerParam((java.lang.String) null, (java.lang.String) null, (TpSLTriggerItem) null, (TpSLTriggerItem) null, 15, (DefaultConstructorMarker) null);
        }
        java.lang.String stopType = tpSlTriggerParam.getStopType();
        if (stopType == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) stopType)) {
            C55850xri c55850xri2 = this.fetchVPNInfo;
            if (c55850xri2 == null) {
                Intrinsics.gEmmrt("");
            } else {
                c55850xri = c55850xri2;
            }
            tpSlTriggerParam.setStopType(c55850xri.EZpvd());
        }
        this.DbNXlk = tpSlTriggerParam;
        this.values = tpSlTriggerParam.m7132clone();
        AwvSrB();
        gHZMYf();
        this.OLrzqt.values();
        if (this.OLrzqt.djBIcL()) {
            return;
        }
        this.OLrzqt.EZpvd(this.AkhnZx);
    }

    public void AwvSrB() {
        TacticsData tacticsData = this.isConnected;
        TrailingConfig trailingUpConfig = tacticsData != null ? tacticsData.getTrailingUpConfig() : null;
        TacticsData tacticsData2 = this.isConnected;
        C56044xvQ.KWHzl(trailingUpConfig, tacticsData2 != null ? tacticsData2.getTrailingDownConfig() : null, djBIcL());
        djBIcL().put("bot_pnl_ratio", java.lang.Boolean.TRUE);
    }

    public void gHZMYf() {
        TacticsData tacticsData = this.isConnected;
        if (tacticsData != null) {
            C56044xvQ.copydefault(tacticsData.getInstType(), tacticsData.getInstId(), tacticsData.getTrailingUpConfig(), tacticsData.getTrailingDownConfig(), tacticsData.getMinPx(), tacticsData.getMaxPx(), this.valueOf, AYXKKw());
        }
    }

    @Override // o.InterfaceC55843xrb
    public void EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.DbNXlk.getTp().setIndicator(str);
    }

    @Override // o.InterfaceC55843xrb
    public void copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.DbNXlk.getSl().setIndicator(str);
    }

    @Override // o.InterfaceC55843xrb
    public void OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str)) {
            this.DbNXlk.getTp().setValue("");
            return;
        }
        TpSLTriggerItem tp = this.DbNXlk.getTp();
        C55850xri c55850xri = this.fetchVPNInfo;
        if (c55850xri == null) {
            Intrinsics.gEmmrt("");
            c55850xri = null;
        }
        tp.setValue(c55850xri.KWHzl(str, this.DbNXlk));
    }

    @Override // o.InterfaceC55843xrb
    public void AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str)) {
            this.DbNXlk.getSl().setValue("");
            return;
        }
        TpSLTriggerItem sl = this.DbNXlk.getSl();
        C55850xri c55850xri = this.fetchVPNInfo;
        if (c55850xri == null) {
            Intrinsics.gEmmrt("");
            c55850xri = null;
        }
        sl.setValue(c55850xri.EZpvd(str, this.DbNXlk));
    }

    @Override // o.InterfaceC55843xrb
    public boolean getFieldNames() {
        TacticsData tacticsData = this.isConnected;
        java.lang.String tpTriggerPx = tacticsData != null ? tacticsData.getTpTriggerPx() : null;
        TacticsData tacticsData2 = this.isConnected;
        return C56044xvQ.EZpvd(tpTriggerPx, tacticsData2 != null ? tacticsData2.getSlTriggerPx() : null);
    }

    @Override // o.InterfaceC55843xrb
    public boolean hDKMBd() {
        TacticsData tacticsData = this.isConnected;
        java.lang.String tpTriggerPx = tacticsData != null ? tacticsData.getTpTriggerPx() : null;
        TacticsData tacticsData2 = this.isConnected;
        return C56044xvQ.OLrzqt(tpTriggerPx, tacticsData2 != null ? tacticsData2.getSlTriggerPx() : null);
    }

    @Override // o.InterfaceC55843xrb
    public java.lang.String fJNWhG() {
        C55850xri c55850xri = this.fetchVPNInfo;
        if (c55850xri == null) {
            Intrinsics.gEmmrt("");
            c55850xri = null;
        }
        return c55850xri.EZpvd(this.DbNXlk);
    }

    @Override // o.InterfaceC55843xrb
    public java.lang.String AkhnZx() {
        C55850xri c55850xri = this.fetchVPNInfo;
        if (c55850xri == null) {
            Intrinsics.gEmmrt("");
            c55850xri = null;
        }
        return c55850xri.copydefault(this.DbNXlk);
    }

    @Override // o.InterfaceC55843xrb
    public java.lang.String fIwbmz() {
        return this.DbNXlk.getTp().getIndicator();
    }

    @Override // o.InterfaceC55843xrb
    public java.lang.String fetchVPNInfo() {
        return this.DbNXlk.getSl().getIndicator();
    }

    @Override // o.InterfaceC55843xrb
    public C55851xrj AuCTel() {
        C55850xri c55850xri = this.fetchVPNInfo;
        if (c55850xri == null) {
            Intrinsics.gEmmrt("");
            c55850xri = null;
        }
        TpSlTriggerParam tpSlTriggerParam = this.DbNXlk;
        SpotGridTpSlConfig value = ejfBZ().getValue();
        if (value == null) {
            value = new SpotGridTpSlConfig((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 31, (DefaultConstructorMarker) null);
        }
        return c55850xri.copydefault(tpSlTriggerParam, value);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
    @Override // o.InterfaceC55843xrb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C55851xrj values() {
        java.lang.String investment;
        TacticsData tacticsData = this.isConnected;
        if (tacticsData == null) {
            investment = "";
        } else {
            if (C33129mqd.OLrzqt((java.lang.CharSequence) tacticsData.getSourceCcy())) {
                investment = tacticsData.getSourceCcySz();
            } else {
                investment = tacticsData.getInvestment();
                if (investment == null) {
                    investment = "";
                }
            }
            if (investment == null) {
            }
        }
        C55850xri c55850xri = this.fetchVPNInfo;
        if (c55850xri == null) {
            Intrinsics.gEmmrt("");
            c55850xri = null;
        }
        TpSlTriggerParam tpSlTriggerParam = this.DbNXlk;
        SpotGridTpSlConfig value = ejfBZ().getValue();
        if (value == null) {
            value = new SpotGridTpSlConfig((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 31, (DefaultConstructorMarker) null);
        }
        return c55850xri.OLrzqt(tpSlTriggerParam, value, investment);
    }

    @Override // o.InterfaceC55843xrb
    public void EZpvd() {
        this.DbNXlk.getTp().setValue(null);
    }

    @Override // o.InterfaceC55843xrb
    public void KWHzl() {
        this.DbNXlk.getSl().setValue(null);
    }

    @Override // o.InterfaceC55843xrb
    public kotlin.Pair<java.lang.Boolean, java.lang.Object> OLrzqt() {
        java.lang.String[] strArrEZpvd;
        java.lang.String strAYXKKw;
        java.lang.String str = "";
        C55850xri c55850xri = null;
        if (Intrinsics.EZpvd((java.lang.Object) this.DbNXlk.getTp().getIndicator(), (java.lang.Object) SpotTpSlTypeConfigData.PRICE.getType())) {
            xVK xvk = xVK.EZpvd;
            java.lang.String value = this.DbNXlk.getTp().getValue();
            if (value == null) {
                value = "";
            }
            TacticsData tacticsData = this.isConnected;
            java.lang.String instId = tacticsData != null ? tacticsData.getInstId() : null;
            TacticsData tacticsData2 = this.isConnected;
            strArrEZpvd = xvk.EZpvd(value, instId, tacticsData2 != null ? tacticsData2.getInstType() : null);
        } else {
            strArrEZpvd = null;
        }
        if (strArrEZpvd == null || strArrEZpvd.length == 0) {
            C55850xri c55850xri2 = this.fetchVPNInfo;
            if (c55850xri2 == null) {
                Intrinsics.gEmmrt("");
            } else {
                c55850xri = c55850xri2;
            }
            TpSlTriggerParam tpSlTriggerParam = this.DbNXlk;
            SpotGridTpSlConfig value2 = ejfBZ().getValue();
            if (value2 == null) {
                value2 = new SpotGridTpSlConfig((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 31, (DefaultConstructorMarker) null);
            }
            xMJ.Application value3 = AhwBna().getValue();
            if (value3 != null && (strAYXKKw = value3.AYXKKw()) != null) {
                str = strAYXKKw;
            }
            java.lang.String strAEQbTJ = c55850xri.AEQbTJ(tpSlTriggerParam, value2, str);
            return new kotlin.Pair<>(java.lang.Boolean.valueOf(StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strAEQbTJ)), strAEQbTJ);
        }
        return new kotlin.Pair<>(java.lang.Boolean.FALSE, strArrEZpvd);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x005e  */
    @Override // o.InterfaceC55843xrb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public kotlin.Pair<java.lang.Boolean, java.lang.Object> AEQbTJ() {
        java.lang.String[] strArrEZpvd;
        java.lang.String investment;
        java.lang.String strAYXKKw;
        C55850xri c55850xri = null;
        java.lang.String str = "";
        if (Intrinsics.EZpvd((java.lang.Object) this.DbNXlk.getSl().getIndicator(), (java.lang.Object) SpotTpSlTypeConfigData.PRICE.getType())) {
            xVK xvk = xVK.EZpvd;
            java.lang.String value = this.DbNXlk.getSl().getValue();
            if (value == null) {
                value = "";
            }
            TacticsData tacticsData = this.isConnected;
            java.lang.String instId = tacticsData != null ? tacticsData.getInstId() : null;
            TacticsData tacticsData2 = this.isConnected;
            strArrEZpvd = xvk.EZpvd(value, instId, tacticsData2 != null ? tacticsData2.getInstType() : null);
        } else {
            strArrEZpvd = null;
        }
        TacticsData tacticsData3 = this.isConnected;
        if (tacticsData3 == null) {
            investment = "";
        } else {
            if (C33129mqd.OLrzqt((java.lang.CharSequence) tacticsData3.getSourceCcy())) {
                investment = tacticsData3.getSourceCcySz();
            } else {
                investment = tacticsData3.getInvestment();
                if (investment == null) {
                    investment = "";
                }
            }
            if (investment == null) {
            }
        }
        if (strArrEZpvd == null || strArrEZpvd.length == 0) {
            C55850xri c55850xri2 = this.fetchVPNInfo;
            if (c55850xri2 == null) {
                Intrinsics.gEmmrt("");
            } else {
                c55850xri = c55850xri2;
            }
            TpSlTriggerParam tpSlTriggerParam = this.DbNXlk;
            SpotGridTpSlConfig value2 = ejfBZ().getValue();
            if (value2 == null) {
                value2 = new SpotGridTpSlConfig((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 31, (DefaultConstructorMarker) null);
            }
            xMJ.Application value3 = AhwBna().getValue();
            if (value3 != null && (strAYXKKw = value3.AYXKKw()) != null) {
                str = strAYXKKw;
            }
            java.lang.String strEZpvd = c55850xri.EZpvd(tpSlTriggerParam, investment, value2, str);
            return new kotlin.Pair<>(java.lang.Boolean.valueOf(StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strEZpvd)), strEZpvd);
        }
        return new kotlin.Pair<>(java.lang.Boolean.FALSE, strArrEZpvd);
    }

    @Override // o.InterfaceC55843xrb
    public kotlin.Pair<java.lang.String, java.lang.Integer> DbNXlk() {
        return new kotlin.Pair<>("", 0);
    }

    @Override // o.InterfaceC55873xsE
    public boolean wlaJM() {
        TpSlTriggerParam tpSlTriggerParam = this.values;
        if (tpSlTriggerParam == null) {
            Intrinsics.gEmmrt("");
            tpSlTriggerParam = null;
        }
        return !Intrinsics.EZpvd(tpSlTriggerParam, this.DbNXlk);
    }

    @Override // o.InterfaceC55843xrb
    public void copydefault() {
        GridOrderTpSlReq gridOrderTpSlReqAkhnZx = this.OLrzqt.AkhnZx();
        if (gridOrderTpSlReqAkhnZx != null) {
            TpSlTriggerParam tpSlTriggerParam = this.values;
            if (tpSlTriggerParam == null) {
                Intrinsics.gEmmrt("");
                tpSlTriggerParam = null;
            }
            gridOrderTpSlReqAkhnZx.setTpSlTriggerParamReqResp(C55765xqC.AEQbTJ(tpSlTriggerParam.updateWith(this.DbNXlk)));
        }
        this.OLrzqt.EZpvd();
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
    public android.os.Parcelable isConnected() {
        return new android.os.Bundle();
    }

    @Override // o.InterfaceC55843xrb
    public java.lang.String valueOf() {
        java.lang.String strAYXKKw;
        TacticsData tacticsData = this.isConnected;
        java.lang.String instType = tacticsData != null ? tacticsData.getInstType() : null;
        TacticsData tacticsData2 = this.isConnected;
        java.lang.String instId = tacticsData2 != null ? tacticsData2.getInstId() : null;
        xMJ.Application value = AhwBna().getValue();
        if (value == null || (strAYXKKw = value.AYXKKw()) == null) {
            strAYXKKw = "";
        }
        return C56044xvQ.OLrzqt(instType, instId, strAYXKKw);
    }

    public final TradeLiveData<kotlin.Pair<java.lang.String, java.lang.Integer>> zLjUOn() {
        return this.OLrzqt.gEmmrt();
    }

    public final TradeLiveData<java.util.List<C56157xxX>> uzCIH() {
        return this.OLrzqt.valueOf();
    }

    @Override // o.InterfaceC55873xsE
    public void AYXKKw(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.DbNXlk.setStopType(str);
    }

    @Override // o.InterfaceC55873xsE
    public void KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.DbNXlk.setDelaySeconds(str);
    }

    @Override // o.InterfaceC55873xsE
    public kotlin.Pair<java.lang.Boolean, java.lang.String> fARcdN() {
        TpSlTriggerParam tpSlTriggerParam = this.DbNXlk;
        SpotGridTpSlConfig value = ejfBZ().getValue();
        if (value == null) {
            value = new SpotGridTpSlConfig((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 31, (DefaultConstructorMarker) null);
        }
        java.lang.String strAEQbTJ = C56042xvO.AEQbTJ(tpSlTriggerParam, value);
        return new kotlin.Pair<>(java.lang.Boolean.valueOf(StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strAEQbTJ)), strAEQbTJ);
    }

    @Override // o.InterfaceC55873xsE
    public C55850xri zsXlph() {
        C55850xri c55850xri = this.fetchVPNInfo;
        if (c55850xri != null) {
            return c55850xri;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final kotlin.Pair<java.lang.String, java.lang.Integer> EZpvd(@NotNull StrategyDetailsResponse strategyDetailsResponse) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String pnlRatio = "";
        Intrinsics.checkNotNullParameter(strategyDetailsResponse, "");
        if (C33129mqd.OLrzqt((java.lang.CharSequence) strategyDetailsResponse.getSourceCcy())) {
            java.lang.String totalPnlInSourceCcy = strategyDetailsResponse.getTotalPnlInSourceCcy();
            if (totalPnlInSourceCcy == null) {
                totalPnlInSourceCcy = "";
            }
            java.lang.String sourceCcy = strategyDetailsResponse.getSourceCcy();
            if (sourceCcy == null) {
                sourceCcy = "";
            }
            java.lang.String pnlRatioInSourceCcy = strategyDetailsResponse.getPnlRatioInSourceCcy();
            str = totalPnlInSourceCcy;
            str2 = sourceCcy;
            if (pnlRatioInSourceCcy != null) {
                pnlRatio = pnlRatioInSourceCcy;
            }
        } else {
            java.lang.String totalPnl = strategyDetailsResponse.getTotalPnl();
            java.lang.String strValues = zsXlph().values();
            pnlRatio = strategyDetailsResponse.getPnlRatio();
            str = totalPnl;
            str2 = strValues;
        }
        C56068xvo c56068xvo = C56068xvo.copydefault;
        return new kotlin.Pair<>(c56068xvo.AEQbTJ(strategyDetailsResponse.getInstId(), strategyDetailsResponse.getInstType(), str, (536 & 8) != 0 ? "" : null, (536 & 16) != 0, (536 & 32) != 0 ? false : false, (536 & 64) != 0 ? false : true, (536 & 128) != 0 ? null : null, (536 & 256) != 0 ? RoundingMode.FLOOR : null, (536 & 512) != 0 ? null : null) + " " + str2 + " (" + c56068xvo.copydefault(pnlRatio, true) + ")", java.lang.Integer.valueOf(C56033xvF.OLrzqt((java.lang.Object) str)));
    }
}
