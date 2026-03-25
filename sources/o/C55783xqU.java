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

/* JADX INFO: renamed from: o.xqU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C55783xqU implements InterfaceC55843xrb {
    public java.util.HashMap<java.lang.String, java.lang.String> AEQbTJ;
    public TacticsData AYXKKw;
    public TradeLiveData<xMJ.Application> AhwBna;
    public final C55777xqO EZpvd;
    public boolean KWHzl;
    public java.util.HashMap<java.lang.String, java.lang.Boolean> OLrzqt;
    public boolean copydefault;
    public TradeLiveData<C55853xrl> djBIcL;
    public java.lang.String gEmmrt;
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
        return this.AEQbTJ;
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
        this.isConnected = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC55843xrb
    public void EZpvd(boolean z, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void KWHzl(boolean z) {
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
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C55777xqO ejfBZ() {
        return this.EZpvd;
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
        return false;
    }

    public C55783xqU() {
        C55777xqO c55777xqO = new C55777xqO();
        this.EZpvd = c55777xqO;
        this.AhwBna = c55777xqO.fetchVPNInfo();
        this.djBIcL = c55777xqO.KWHzl();
        this.OLrzqt = new java.util.HashMap<>();
        this.AEQbTJ = new java.util.HashMap<>();
        this.copydefault = true;
        this.KWHzl = true;
        this.isConnected = "tp_sl_price";
        this.values = "tp_sl_price";
        this.gEmmrt = "";
        this.valueOf = 8;
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x00c6  */
    @Override // o.InterfaceC55843xrb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void copydefault(android.os.Bundle bundle) {
        BizInstrument suggestedInstrument$default;
        int iIntValue;
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        java.lang.String strFIwbmz;
        java.lang.String quoteSymbol;
        java.lang.String instId;
        java.lang.String instType;
        java.lang.String algoId;
        java.lang.String instId2;
        java.lang.Integer numValueOf = null;
        TacticsData tacticsData = bundle != null ? (TacticsData) bundle.getParcelable("bot_grid_req") : null;
        if (!(tacticsData instanceof TacticsData)) {
            tacticsData = null;
        }
        this.AYXKKw = tacticsData;
        C55777xqO c55777xqO = this.EZpvd;
        java.lang.String str = "";
        java.lang.String str2 = (tacticsData == null || (instId2 = tacticsData.getInstId()) == null) ? "" : instId2;
        TacticsData tacticsData2 = this.AYXKKw;
        java.lang.String str3 = (tacticsData2 == null || (algoId = tacticsData2.getAlgoId()) == null) ? "" : algoId;
        TacticsData tacticsData3 = this.AYXKKw;
        java.lang.String slTriggerPx = tacticsData3 != null ? tacticsData3.getSlTriggerPx() : null;
        TacticsData tacticsData4 = this.AYXKKw;
        c55777xqO.KWHzl(new GridOrderTpSlReq(str3, str2, slTriggerPx, tacticsData4 != null ? tacticsData4.getTpTriggerPx() : null, (TpSlTriggerParamReqResp) null, (java.util.List) null, (java.util.List) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 1008, (DefaultConstructorMarker) null));
        C54589xNz c54589xNz = C54589xNz.EZpvd;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = c54589xNz.OLrzqt();
        if (interfaceC54581xNrOLrzqt != null) {
            TacticsData tacticsData5 = this.AYXKKw;
            java.lang.String str4 = (tacticsData5 == null || (instType = tacticsData5.getInstType()) == null) ? "" : instType;
            TacticsData tacticsData6 = this.AYXKKw;
            suggestedInstrument$default = InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, str4, (tacticsData6 == null || (instId = tacticsData6.getInstId()) == null) ? "" : instId, null, null, 12, null);
        } else {
            suggestedInstrument$default = null;
        }
        if (suggestedInstrument$default != null && (quoteSymbol = suggestedInstrument$default.getQuoteSymbol()) != null) {
            str = quoteSymbol;
        }
        this.gEmmrt = str;
        if (suggestedInstrument$default == null) {
            iIntValue = 8;
        } else {
            InterfaceC54581xNr interfaceC54581xNrOLrzqt2 = c54589xNz.OLrzqt();
            if (interfaceC54581xNrOLrzqt2 != null && (abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt2.OLrzqt(suggestedInstrument$default.getInstType())) != null && (strFIwbmz = abstractC54531xLwOLrzqt.fIwbmz(suggestedInstrument$default.getInstFamily())) != null) {
                numValueOf = java.lang.Integer.valueOf(C33129mqd.AhwBna(strFIwbmz));
            }
            if (numValueOf != null) {
                iIntValue = numValueOf.intValue();
            }
        }
        this.valueOf = iIntValue;
        zsXlph();
        getNewProxyInstance();
        this.EZpvd.values();
    }

    public void zsXlph() {
        C56043xvP.OLrzqt(djBIcL());
    }

    public void getNewProxyInstance() {
        TacticsData tacticsData = this.AYXKKw;
        java.lang.String instType = tacticsData != null ? tacticsData.getInstType() : null;
        TacticsData tacticsData2 = this.AYXKKw;
        java.lang.String instId = tacticsData2 != null ? tacticsData2.getInstId() : null;
        TacticsData tacticsData3 = this.AYXKKw;
        C56043xvP.EZpvd(instType, instId, tacticsData3 != null ? tacticsData3.getMinPx() : null, AYXKKw());
    }

    @Override // o.InterfaceC55843xrb
    public void OLrzqt(@NotNull java.lang.String str) {
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        java.lang.String instType;
        java.lang.String instId;
        java.lang.String strValueOf;
        java.lang.String str2 = "";
        Intrinsics.checkNotNullParameter(str, "");
        GridOrderTpSlReq gridOrderTpSlReqAkhnZx = this.EZpvd.AkhnZx();
        if (gridOrderTpSlReqAkhnZx != null) {
            if (!C33129mqd.valueOf(str, 0) && (interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt()) != null) {
                TacticsData tacticsData = this.AYXKKw;
                if (tacticsData == null || (instType = tacticsData.getInstType()) == null) {
                    instType = "";
                }
                AbstractC54531xLw abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt.OLrzqt(instType);
                if (abstractC54531xLwOLrzqt != null) {
                    TacticsData tacticsData2 = this.AYXKKw;
                    if (tacticsData2 == null || (instId = tacticsData2.getInstId()) == null) {
                        instId = "";
                    }
                    xMS xmsGEmmrt = abstractC54531xLwOLrzqt.gEmmrt(instId);
                    if (xmsGEmmrt != null && (strValueOf = xmsGEmmrt.valueOf(str)) != null) {
                        str2 = strValueOf;
                    }
                }
            }
            gridOrderTpSlReqAkhnZx.setTpTriggerPx(str2);
        }
    }

    @Override // o.InterfaceC55843xrb
    public void AEQbTJ(@NotNull java.lang.String str) {
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        java.lang.String instType;
        java.lang.String instId;
        java.lang.String strValueOf;
        java.lang.String str2 = "";
        Intrinsics.checkNotNullParameter(str, "");
        GridOrderTpSlReq gridOrderTpSlReqAkhnZx = this.EZpvd.AkhnZx();
        if (gridOrderTpSlReqAkhnZx != null) {
            if (!C33129mqd.valueOf(str, 0) && (interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt()) != null) {
                TacticsData tacticsData = this.AYXKKw;
                if (tacticsData == null || (instType = tacticsData.getInstType()) == null) {
                    instType = "";
                }
                AbstractC54531xLw abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt.OLrzqt(instType);
                if (abstractC54531xLwOLrzqt != null) {
                    TacticsData tacticsData2 = this.AYXKKw;
                    if (tacticsData2 == null || (instId = tacticsData2.getInstId()) == null) {
                        instId = "";
                    }
                    xMS xmsGEmmrt = abstractC54531xLwOLrzqt.gEmmrt(instId);
                    if (xmsGEmmrt != null && (strValueOf = xmsGEmmrt.valueOf(str)) != null) {
                        str2 = strValueOf;
                    }
                }
            }
            gridOrderTpSlReqAkhnZx.setSlTriggerPx(str2);
        }
    }

    @Override // o.InterfaceC55843xrb
    public boolean getFieldNames() {
        TacticsData tacticsData = this.AYXKKw;
        java.lang.String tpTriggerPx = tacticsData != null ? tacticsData.getTpTriggerPx() : null;
        TacticsData tacticsData2 = this.AYXKKw;
        return C56043xvP.KWHzl(tpTriggerPx, tacticsData2 != null ? tacticsData2.getSlTriggerPx() : null);
    }

    @Override // o.InterfaceC55843xrb
    public boolean hDKMBd() {
        TacticsData tacticsData = this.AYXKKw;
        java.lang.String tpTriggerPx = tacticsData != null ? tacticsData.getTpTriggerPx() : null;
        TacticsData tacticsData2 = this.AYXKKw;
        return C56043xvP.OLrzqt(tpTriggerPx, tacticsData2 != null ? tacticsData2.getSlTriggerPx() : null);
    }

    @Override // o.InterfaceC55843xrb
    public java.lang.String fJNWhG() {
        TacticsData tacticsData = this.AYXKKw;
        java.lang.String instType = tacticsData != null ? tacticsData.getInstType() : null;
        TacticsData tacticsData2 = this.AYXKKw;
        java.lang.String instId = tacticsData2 != null ? tacticsData2.getInstId() : null;
        TacticsData tacticsData3 = this.AYXKKw;
        return C56043xvP.AEQbTJ(instType, instId, tacticsData3 != null ? tacticsData3.getTpTriggerPx() : null);
    }

    @Override // o.InterfaceC55843xrb
    public java.lang.String AkhnZx() {
        TacticsData tacticsData = this.AYXKKw;
        java.lang.String instType = tacticsData != null ? tacticsData.getInstType() : null;
        TacticsData tacticsData2 = this.AYXKKw;
        java.lang.String instId = tacticsData2 != null ? tacticsData2.getInstId() : null;
        TacticsData tacticsData3 = this.AYXKKw;
        return C56043xvP.OLrzqt(instType, instId, tacticsData3 != null ? tacticsData3.getSlTriggerPx() : null);
    }

    @Override // o.InterfaceC55843xrb
    public C55851xrj AuCTel() {
        return C56043xvP.copydefault(this.gEmmrt, this.valueOf);
    }

    @Override // o.InterfaceC55843xrb
    public C55851xrj values() {
        return C56043xvP.AEQbTJ(this.gEmmrt, this.valueOf);
    }

    @Override // o.InterfaceC55843xrb
    public void EZpvd() {
        this.EZpvd.OLrzqt();
    }

    @Override // o.InterfaceC55843xrb
    public void KWHzl() {
        this.EZpvd.AEQbTJ();
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
        return new kotlin.Pair<>("", 0);
    }

    @Override // o.InterfaceC55843xrb
    public void copydefault() {
        this.EZpvd.EZpvd();
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
    public android.os.Parcelable isConnected() {
        return new android.os.Bundle();
    }

    @Override // o.InterfaceC55843xrb
    public java.lang.String valueOf() {
        java.lang.String strAYXKKw;
        TacticsData tacticsData = this.AYXKKw;
        java.lang.String instType = tacticsData != null ? tacticsData.getInstType() : null;
        TacticsData tacticsData2 = this.AYXKKw;
        java.lang.String instId = tacticsData2 != null ? tacticsData2.getInstId() : null;
        xMJ.Application value = AhwBna().getValue();
        if (value == null || (strAYXKKw = value.AYXKKw()) == null) {
            strAYXKKw = "";
        }
        return C56043xvP.copydefault(instType, instId, strAYXKKw);
    }

    public final TradeLiveData<kotlin.Pair<java.lang.String, java.lang.Integer>> uzCIH() {
        return this.EZpvd.gEmmrt();
    }

    public final TradeLiveData<java.util.List<C56157xxX>> fARcdN() {
        return this.EZpvd.valueOf();
    }
}
