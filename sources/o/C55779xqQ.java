package o;

import androidx.lifecycle.TradeLiveData;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.GridOrderTpSlReq;
import com.okinc.unify_trade.biz.bot.TpSlTriggerParamReqResp;
import com.okinc.unify_trade.bot.data.TacticsData;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC54581xNr;
import o.xMJ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xqQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C55779xqQ implements InterfaceC55843xrb {
    public java.util.HashMap<java.lang.String, java.lang.Boolean> AEQbTJ;
    public TacticsData AYXKKw;
    public java.lang.String AhwBna;
    public java.util.HashMap<java.lang.String, java.lang.String> EZpvd;
    public boolean KWHzl;
    public final C55777xqO OLrzqt;
    public boolean copydefault;
    public TradeLiveData<C55853xrl> djBIcL;
    public TradeLiveData<xMJ.Application> gEmmrt;
    public java.lang.String isConnected;
    public int valueOf;
    public java.lang.String values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void AEQbTJ(boolean z) {
        this.KWHzl = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC55843xrb
    public java.util.HashMap<java.lang.String, java.lang.String> AYXKKw() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC55843xrb
    public TradeLiveData<xMJ.Application> AhwBna() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean AubY() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC55843xrb
    public void EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.isConnected = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC55843xrb
    public void EZpvd(boolean z, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void OLrzqt(boolean z) {
        this.copydefault = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC55843xrb
    public void OLrzqt(boolean z, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC55843xrb
    public void copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.values = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC55843xrb
    public java.util.HashMap<java.lang.String, java.lang.Boolean> djBIcL() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C55777xqO fARcdN() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC55843xrb
    public java.lang.String fIwbmz() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC55843xrb
    public java.lang.String fetchVPNInfo() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC55843xrb
    public TradeLiveData<C55853xrl> gEmmrt() {
        return this.djBIcL;
    }

    @Override // o.InterfaceC55843xrb
    public boolean iwGUEr() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean zsXlph() {
        return this.copydefault;
    }

    public C55779xqQ() {
        C55777xqO c55777xqO = new C55777xqO();
        this.OLrzqt = c55777xqO;
        this.gEmmrt = c55777xqO.fetchVPNInfo();
        this.djBIcL = c55777xqO.KWHzl();
        this.AEQbTJ = new java.util.HashMap<>();
        this.EZpvd = new java.util.HashMap<>();
        this.copydefault = true;
        this.KWHzl = true;
        this.isConnected = "tp_sl_price";
        this.values = "tp_sl_price";
        this.AhwBna = "";
        this.valueOf = 8;
    }

    @Override // o.InterfaceC55843xrb
    public void copydefault(android.os.Bundle bundle) {
        BizInstrument suggestedInstrument$default;
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        java.lang.String tpTriggerPx;
        java.lang.String slTriggerPx;
        java.lang.String instId;
        java.lang.String instId2;
        java.lang.String instType;
        java.lang.String algoId;
        java.lang.String instId3;
        this.OLrzqt.OLrzqt(bundle != null ? bundle.getBoolean("edit_detail") : false);
        TacticsData tacticsData = bundle != null ? (TacticsData) bundle.getParcelable("bot_grid_req") : null;
        if (!(tacticsData instanceof TacticsData)) {
            tacticsData = null;
        }
        this.AYXKKw = tacticsData;
        C55777xqO c55777xqO = this.OLrzqt;
        java.lang.String str = "";
        java.lang.String str2 = (tacticsData == null || (instId3 = tacticsData.getInstId()) == null) ? "" : instId3;
        TacticsData tacticsData2 = this.AYXKKw;
        java.lang.String str3 = (tacticsData2 == null || (algoId = tacticsData2.getAlgoId()) == null) ? "" : algoId;
        TacticsData tacticsData3 = this.AYXKKw;
        java.lang.String slTriggerPx2 = tacticsData3 != null ? tacticsData3.getSlTriggerPx() : null;
        TacticsData tacticsData4 = this.AYXKKw;
        java.lang.String tpTriggerPx2 = tacticsData4 != null ? tacticsData4.getTpTriggerPx() : null;
        TacticsData tacticsData5 = this.AYXKKw;
        java.lang.String slRatio = tacticsData5 != null ? tacticsData5.getSlRatio() : null;
        TacticsData tacticsData6 = this.AYXKKw;
        c55777xqO.KWHzl(new GridOrderTpSlReq(str3, str2, slTriggerPx2, tpTriggerPx2, (TpSlTriggerParamReqResp) null, (java.util.List) null, (java.util.List) null, tacticsData6 != null ? tacticsData6.getTpRatio() : null, slRatio, (java.lang.String) null, 624, (DefaultConstructorMarker) null));
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt != null) {
            TacticsData tacticsData7 = this.AYXKKw;
            java.lang.String str4 = (tacticsData7 == null || (instType = tacticsData7.getInstType()) == null) ? "" : instType;
            TacticsData tacticsData8 = this.AYXKKw;
            suggestedInstrument$default = InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, str4, (tacticsData8 == null || (instId2 = tacticsData8.getInstId()) == null) ? "" : instId2, null, null, 12, null);
        } else {
            suggestedInstrument$default = null;
        }
        if (interfaceC54581xNrOLrzqt != null) {
            java.lang.String instType2 = suggestedInstrument$default != null ? suggestedInstrument$default.getInstType() : null;
            if (instType2 == null) {
                instType2 = "";
            }
            abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt.OLrzqt(instType2);
        } else {
            abstractC54531xLwOLrzqt = null;
        }
        java.lang.String strDjBIcL = abstractC54531xLwOLrzqt != null ? abstractC54531xLwOLrzqt.djBIcL(suggestedInstrument$default) : null;
        if (strDjBIcL == null) {
            strDjBIcL = "";
        }
        this.AhwBna = strDjBIcL;
        if (abstractC54531xLwOLrzqt != null) {
            instFamily = suggestedInstrument$default != null ? suggestedInstrument$default.getInstFamily() : null;
            if (instFamily == null) {
                instFamily = "";
            }
            instFamily = abstractC54531xLwOLrzqt.fIwbmz(instFamily);
        }
        int iAhwBna = C33129mqd.AhwBna(instFamily);
        if (iAhwBna > 0) {
            this.valueOf = iAhwBna;
        }
        TacticsData tacticsData9 = this.AYXKKw;
        if (tacticsData9 == null || (tpTriggerPx = tacticsData9.getTpTriggerPx()) == null) {
            tpTriggerPx = "";
        }
        this.isConnected = C56040xvM.EZpvd(tpTriggerPx);
        TacticsData tacticsData10 = this.AYXKKw;
        if (tacticsData10 == null || (slTriggerPx = tacticsData10.getSlTriggerPx()) == null) {
            slTriggerPx = "";
        }
        this.values = C56040xvM.copydefault(slTriggerPx);
        AuCTelauCTel();
        getNewProxyInstance();
        this.OLrzqt.values();
        C55777xqO c55777xqO2 = this.OLrzqt;
        TacticsData tacticsData11 = this.AYXKKw;
        if (tacticsData11 != null && (instId = tacticsData11.getInstId()) != null) {
            str = instId;
        }
        c55777xqO2.copydefault("contract_grid", str);
        if (this.OLrzqt.djBIcL()) {
            return;
        }
        this.OLrzqt.isConnected();
    }

    public void AuCTelauCTel() {
        java.util.HashMap<java.lang.String, java.lang.Boolean> mapDjBIcL = djBIcL();
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        mapDjBIcL.put("ticker_info", bool);
        djBIcL().put("price_range", bool);
        djBIcL().put("bot_pnl_ratio", bool);
    }

    public void getNewProxyInstance() {
        TacticsData tacticsData = this.AYXKKw;
        if (tacticsData != null) {
            AYXKKw().put("price_range", C56040xvM.AEQbTJ(tacticsData.getInstType(), tacticsData.getInstId(), tacticsData.getMinPx(), tacticsData.getMaxPx()));
        }
    }

    @Override // o.InterfaceC55843xrb
    public void OLrzqt(@NotNull java.lang.String str) {
        java.lang.String strDivS$default;
        strDivS$default = "";
        Intrinsics.checkNotNullParameter(str, "");
        if (!Intrinsics.EZpvd((java.lang.Object) fIwbmz(), (java.lang.Object) "tp_sl_price")) {
            strDivS$default = C33129mqd.valueOf(str, 0) ? "" : C33129mqd.divS$default(str, 100, null, null, null, 14, null);
            GridOrderTpSlReq gridOrderTpSlReqAkhnZx = this.OLrzqt.AkhnZx();
            if (gridOrderTpSlReqAkhnZx != null) {
                gridOrderTpSlReqAkhnZx.setTpRatio(strDivS$default);
                return;
            }
            return;
        }
        GridOrderTpSlReq gridOrderTpSlReqAkhnZx2 = this.OLrzqt.AkhnZx();
        if (gridOrderTpSlReqAkhnZx2 != null) {
            if (!C33129mqd.valueOf(str, 0)) {
                TacticsData tacticsData = this.AYXKKw;
                java.lang.String instType = tacticsData != null ? tacticsData.getInstType() : null;
                if (instType == null) {
                    instType = "";
                }
                TacticsData tacticsData2 = this.AYXKKw;
                java.lang.String instId = tacticsData2 != null ? tacticsData2.getInstId() : null;
                strDivS$default = C56033xvF.AEQbTJ(str, instType, instId != null ? instId : "");
            }
            gridOrderTpSlReqAkhnZx2.setTpTriggerPx(strDivS$default);
        }
    }

    @Override // o.InterfaceC55843xrb
    public void AEQbTJ(@NotNull java.lang.String str) {
        java.lang.String strDivS$default;
        strDivS$default = "";
        Intrinsics.checkNotNullParameter(str, "");
        if (!Intrinsics.EZpvd((java.lang.Object) fetchVPNInfo(), (java.lang.Object) "tp_sl_price")) {
            strDivS$default = C33129mqd.valueOf(str, 0) ? "" : C33129mqd.divS$default(str, 100, null, null, null, 14, null);
            GridOrderTpSlReq gridOrderTpSlReqAkhnZx = this.OLrzqt.AkhnZx();
            if (gridOrderTpSlReqAkhnZx != null) {
                gridOrderTpSlReqAkhnZx.setSlRatio(strDivS$default);
                return;
            }
            return;
        }
        GridOrderTpSlReq gridOrderTpSlReqAkhnZx2 = this.OLrzqt.AkhnZx();
        if (gridOrderTpSlReqAkhnZx2 != null) {
            if (!C33129mqd.valueOf(str, 0)) {
                TacticsData tacticsData = this.AYXKKw;
                java.lang.String instType = tacticsData != null ? tacticsData.getInstType() : null;
                if (instType == null) {
                    instType = "";
                }
                TacticsData tacticsData2 = this.AYXKKw;
                java.lang.String instId = tacticsData2 != null ? tacticsData2.getInstId() : null;
                strDivS$default = C56033xvF.AEQbTJ(str, instType, instId != null ? instId : "");
            }
            gridOrderTpSlReqAkhnZx2.setSlTriggerPx(strDivS$default);
        }
    }

    @Override // o.InterfaceC55843xrb
    public boolean getFieldNames() {
        java.lang.String tpTriggerPx;
        java.lang.String tpRatio;
        java.lang.String slTriggerPx;
        java.lang.String slRatio;
        TacticsData tacticsData = this.AYXKKw;
        java.lang.String str = "";
        if (tacticsData == null || (tpTriggerPx = tacticsData.getTpTriggerPx()) == null) {
            tpTriggerPx = "";
        }
        TacticsData tacticsData2 = this.AYXKKw;
        if (tacticsData2 == null || (tpRatio = tacticsData2.getTpRatio()) == null) {
            tpRatio = "";
        }
        TacticsData tacticsData3 = this.AYXKKw;
        if (tacticsData3 == null || (slTriggerPx = tacticsData3.getSlTriggerPx()) == null) {
            slTriggerPx = "";
        }
        TacticsData tacticsData4 = this.AYXKKw;
        if (tacticsData4 != null && (slRatio = tacticsData4.getSlRatio()) != null) {
            str = slRatio;
        }
        return C56040xvM.OLrzqt(tpTriggerPx, tpRatio, slTriggerPx, str);
    }

    @Override // o.InterfaceC55843xrb
    public boolean hDKMBd() {
        java.lang.String tpTriggerPx;
        java.lang.String tpRatio;
        java.lang.String slTriggerPx;
        java.lang.String slRatio;
        TacticsData tacticsData = this.AYXKKw;
        java.lang.String str = "";
        if (tacticsData == null || (tpTriggerPx = tacticsData.getTpTriggerPx()) == null) {
            tpTriggerPx = "";
        }
        TacticsData tacticsData2 = this.AYXKKw;
        if (tacticsData2 == null || (tpRatio = tacticsData2.getTpRatio()) == null) {
            tpRatio = "";
        }
        TacticsData tacticsData3 = this.AYXKKw;
        if (tacticsData3 == null || (slTriggerPx = tacticsData3.getSlTriggerPx()) == null) {
            slTriggerPx = "";
        }
        TacticsData tacticsData4 = this.AYXKKw;
        if (tacticsData4 != null && (slRatio = tacticsData4.getSlRatio()) != null) {
            str = slRatio;
        }
        return C56040xvM.KWHzl(tpTriggerPx, tpRatio, slTriggerPx, str);
    }

    @Override // o.InterfaceC55843xrb
    public java.lang.String fJNWhG() {
        java.lang.String instType;
        java.lang.String instId;
        java.lang.String tpTriggerPx;
        java.lang.String tpRatio;
        java.lang.String str = this.isConnected;
        TacticsData tacticsData = this.AYXKKw;
        java.lang.String str2 = "";
        if (tacticsData == null || (instType = tacticsData.getInstType()) == null) {
            instType = "";
        }
        TacticsData tacticsData2 = this.AYXKKw;
        if (tacticsData2 == null || (instId = tacticsData2.getInstId()) == null) {
            instId = "";
        }
        TacticsData tacticsData3 = this.AYXKKw;
        if (tacticsData3 == null || (tpTriggerPx = tacticsData3.getTpTriggerPx()) == null) {
            tpTriggerPx = "";
        }
        TacticsData tacticsData4 = this.AYXKKw;
        if (tacticsData4 != null && (tpRatio = tacticsData4.getTpRatio()) != null) {
            str2 = tpRatio;
        }
        return C56040xvM.copydefault(str, instType, instId, tpTriggerPx, str2);
    }

    @Override // o.InterfaceC55843xrb
    public java.lang.String AkhnZx() {
        java.lang.String instType;
        java.lang.String instId;
        java.lang.String slTriggerPx;
        java.lang.String slRatio;
        java.lang.String str = this.values;
        TacticsData tacticsData = this.AYXKKw;
        java.lang.String str2 = "";
        if (tacticsData == null || (instType = tacticsData.getInstType()) == null) {
            instType = "";
        }
        TacticsData tacticsData2 = this.AYXKKw;
        if (tacticsData2 == null || (instId = tacticsData2.getInstId()) == null) {
            instId = "";
        }
        TacticsData tacticsData3 = this.AYXKKw;
        if (tacticsData3 == null || (slTriggerPx = tacticsData3.getSlTriggerPx()) == null) {
            slTriggerPx = "";
        }
        TacticsData tacticsData4 = this.AYXKKw;
        if (tacticsData4 != null && (slRatio = tacticsData4.getSlRatio()) != null) {
            str2 = slRatio;
        }
        return C56040xvM.EZpvd(str, instType, instId, slTriggerPx, str2);
    }

    @Override // o.InterfaceC55843xrb
    public C55851xrj AuCTel() {
        return C56040xvM.KWHzl(this.isConnected, this.valueOf, this.AhwBna, gEmmrt().getValue());
    }

    @Override // o.InterfaceC55843xrb
    public C55851xrj values() {
        return C56040xvM.OLrzqt(this.values, this.valueOf, this.AhwBna, gEmmrt().getValue());
    }

    @Override // o.InterfaceC55843xrb
    public void EZpvd() {
        this.OLrzqt.OLrzqt();
    }

    @Override // o.InterfaceC55843xrb
    public void KWHzl() {
        this.OLrzqt.AEQbTJ();
    }

    @Override // o.InterfaceC55843xrb
    public kotlin.Pair<java.lang.Boolean, java.lang.Object> OLrzqt() {
        return new kotlin.Pair<>(java.lang.Boolean.TRUE, "");
    }

    @Override // o.InterfaceC55843xrb
    public kotlin.Pair<java.lang.Boolean, java.lang.Object> AEQbTJ() {
        return new kotlin.Pair<>(java.lang.Boolean.TRUE, "");
    }

    @Override // o.InterfaceC55843xrb
    public kotlin.Pair<java.lang.String, java.lang.Integer> DbNXlk() {
        return C56040xvM.KWHzl(this.isConnected, this.values, zsXlph(), AubY());
    }

    @Override // o.InterfaceC55843xrb
    public void copydefault() {
        this.OLrzqt.EZpvd();
    }

    @Override // o.InterfaceC55843xrb
    public void copydefault(boolean z) {
        OLrzqt(z);
    }

    @Override // o.InterfaceC55843xrb
    public void EZpvd(boolean z) {
        AEQbTJ(z);
    }

    @Override // o.InterfaceC55843xrb
    public android.os.Parcelable isConnected() {
        return new android.os.Bundle();
    }

    @Override // o.InterfaceC55843xrb
    public java.lang.String valueOf() {
        java.lang.String instType;
        java.lang.String instId;
        java.lang.String strAYXKKw;
        TacticsData tacticsData = this.AYXKKw;
        java.lang.String str = "";
        if (tacticsData == null || (instType = tacticsData.getInstType()) == null) {
            instType = "";
        }
        TacticsData tacticsData2 = this.AYXKKw;
        if (tacticsData2 == null || (instId = tacticsData2.getInstId()) == null) {
            instId = "";
        }
        xMJ.Application value = AhwBna().getValue();
        if (value != null && (strAYXKKw = value.AYXKKw()) != null) {
            str = strAYXKKw;
        }
        return C56040xvM.copydefault(instType, instId, str);
    }

    public final TradeLiveData<kotlin.Pair<java.lang.String, java.lang.Integer>> uzCIH() {
        return this.OLrzqt.gEmmrt();
    }

    public final TradeLiveData<java.util.List<C56157xxX>> ejfBZ() {
        return this.OLrzqt.valueOf();
    }
}
