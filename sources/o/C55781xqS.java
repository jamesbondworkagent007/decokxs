package o;

import androidx.lifecycle.TradeLiveData;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.GridReq;
import com.okinc.unify_trade.biz.ProfitAutoReinvestParam;
import com.okinc.unify_trade.biz.TrailingConfig;
import com.okinc.unify_trade.biz.bot.SmartEarnRequestParam;
import com.okinc.unify_trade.biz.bot.TpSlTriggerParamReqResp;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.InterfaceC54581xNr;
import o.xMJ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xqS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C55781xqS implements InterfaceC55843xrb {
    public GridReq gEmmrt = new GridReq((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (TpSlTriggerParamReqResp) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.ArrayList) null, (java.lang.Boolean) null, (TrailingConfig) null, (TrailingConfig) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (SmartEarnRequestParam) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (ProfitAutoReinvestParam) null, -1, 15, (DefaultConstructorMarker) null);
    public TradeLiveData<xMJ.Application> AhwBna = new TradeLiveData<>();
    public TradeLiveData<C55853xrl> AEQbTJ = new TradeLiveData<>(new C55853xrl(null, null, null, null, 15, null));
    public java.util.HashMap<java.lang.String, java.lang.Boolean> EZpvd = new java.util.HashMap<>();
    public java.util.HashMap<java.lang.String, java.lang.String> OLrzqt = new java.util.HashMap<>();
    public boolean copydefault = true;
    public boolean KWHzl = true;
    public java.lang.String values = "tp_sl_price";
    public java.lang.String valueOf = "tp_sl_price";
    public java.lang.String djBIcL = "";
    public int AYXKKw = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC55843xrb
    public java.util.HashMap<java.lang.String, java.lang.String> AYXKKw() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC55843xrb
    public TradeLiveData<xMJ.Application> AhwBna() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void EZpvd(@NotNull TradeLiveData<xMJ.Application> tradeLiveData) {
        Intrinsics.checkNotNullParameter(tradeLiveData, "");
        this.AhwBna = tradeLiveData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC55843xrb
    public void EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.values = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void KWHzl(boolean z) {
        this.KWHzl = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void OLrzqt(boolean z) {
        this.copydefault = z;
    }

    @Override // o.InterfaceC55843xrb
    public void copydefault() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC55843xrb
    public void copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.valueOf = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC55843xrb
    public java.util.HashMap<java.lang.String, java.lang.Boolean> djBIcL() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC55843xrb
    public java.lang.String fIwbmz() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC55843xrb
    public java.lang.String fetchVPNInfo() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC55843xrb
    public TradeLiveData<C55853xrl> gEmmrt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC55843xrb
    public android.os.Parcelable isConnected() {
        return this.gEmmrt;
    }

    @Override // o.InterfaceC55843xrb
    public boolean iwGUEr() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00b8  */
    @Override // o.InterfaceC55843xrb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void copydefault(android.os.Bundle bundle) {
        GridReq gridReq;
        java.lang.String quoteSymbol;
        int iIntValue;
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        java.lang.String strFIwbmz;
        GridReq gridReq2;
        if (bundle == null || (gridReq2 = (GridReq) bundle.getParcelable("bot_grid_req")) == null || (gridReq = (GridReq) xVA.EZpvd(gridReq2)) == null) {
            gridReq = new GridReq((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (TpSlTriggerParamReqResp) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.ArrayList) null, (java.lang.Boolean) null, (TrailingConfig) null, (TrailingConfig) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (SmartEarnRequestParam) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (ProfitAutoReinvestParam) null, -1, 15, (DefaultConstructorMarker) null);
        }
        this.gEmmrt = gridReq;
        C54589xNz c54589xNz = C54589xNz.EZpvd;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = c54589xNz.OLrzqt();
        java.lang.Integer numValueOf = null;
        BizInstrument suggestedInstrument$default = interfaceC54581xNrOLrzqt != null ? InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, this.gEmmrt.getInstType(), this.gEmmrt.getInstId(), null, null, 12, null) : null;
        if (suggestedInstrument$default == null || (quoteSymbol = suggestedInstrument$default.getQuoteSymbol()) == null) {
            quoteSymbol = "";
        }
        this.djBIcL = quoteSymbol;
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
        this.AYXKKw = iIntValue;
        ejfBZ();
        fARcdN();
        EZpvd(C54782xVc.AEQbTJ.AhwBna());
    }

    public void ejfBZ() {
        C56043xvP.OLrzqt(djBIcL());
    }

    public void fARcdN() {
        C56043xvP.EZpvd(this.gEmmrt.getInstType(), this.gEmmrt.getInstId(), this.gEmmrt.getMinPx(), AYXKKw());
    }

    @Override // o.InterfaceC55843xrb
    public void OLrzqt(@NotNull java.lang.String str) {
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        java.lang.String strValueOf;
        java.lang.String str2 = "";
        Intrinsics.checkNotNullParameter(str, "");
        GridReq gridReq = this.gEmmrt;
        if (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str) && (interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt()) != null) {
            java.lang.String instType = this.gEmmrt.getInstType();
            if (instType == null) {
                instType = "";
            }
            AbstractC54531xLw abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt.OLrzqt(instType);
            if (abstractC54531xLwOLrzqt != null) {
                java.lang.String instId = this.gEmmrt.getInstId();
                if (instId == null) {
                    instId = "";
                }
                xMS xmsGEmmrt = abstractC54531xLwOLrzqt.gEmmrt(instId);
                if (xmsGEmmrt != null && (strValueOf = xmsGEmmrt.valueOf(str)) != null) {
                    str2 = strValueOf;
                }
            }
        }
        gridReq.setTpTriggerPx(str2);
    }

    @Override // o.InterfaceC55843xrb
    public void AEQbTJ(@NotNull java.lang.String str) {
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        java.lang.String strValueOf;
        java.lang.String str2 = "";
        Intrinsics.checkNotNullParameter(str, "");
        GridReq gridReq = this.gEmmrt;
        if (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str) && (interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt()) != null) {
            java.lang.String instType = this.gEmmrt.getInstType();
            if (instType == null) {
                instType = "";
            }
            AbstractC54531xLw abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt.OLrzqt(instType);
            if (abstractC54531xLwOLrzqt != null) {
                java.lang.String instId = this.gEmmrt.getInstId();
                if (instId == null) {
                    instId = "";
                }
                xMS xmsGEmmrt = abstractC54531xLwOLrzqt.gEmmrt(instId);
                if (xmsGEmmrt != null && (strValueOf = xmsGEmmrt.valueOf(str)) != null) {
                    str2 = strValueOf;
                }
            }
        }
        gridReq.setSlTriggerPx(str2);
    }

    @Override // o.InterfaceC55843xrb
    public void OLrzqt(boolean z, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (z || !(!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str))) {
            return;
        }
        C32866mlf.onEvent$default("BotPlaceOrder_AdvancedSetting_TPSLInputBox_Input", (TrackChannel[]) null, new Function1() { // from class: o.xqT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C55781xqS.KWHzl((EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit KWHzl(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "bot_type", "infinite_grid", false, 4, null);
        EventParamsList.put$default(eventParamsList, "tpsl_input", "take_profit", false, 4, null);
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC55843xrb
    public void EZpvd(boolean z, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (z || !(!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str))) {
            return;
        }
        C32866mlf.onEvent$default("BotPlaceOrder_AdvancedSetting_TPSLInputBox_Input", (TrackChannel[]) null, new Function1() { // from class: o.xqW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C55781xqS.OLrzqt((EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OLrzqt(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "bot_type", "infinite_grid", false, 4, null);
        EventParamsList.put$default(eventParamsList, "tpsl_input", "stop_loss", false, 4, null);
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC55843xrb
    public boolean getFieldNames() {
        return C56043xvP.KWHzl(this.gEmmrt.getTpTriggerPx(), this.gEmmrt.getSlTriggerPx());
    }

    @Override // o.InterfaceC55843xrb
    public boolean hDKMBd() {
        return C56043xvP.OLrzqt(this.gEmmrt.getTpTriggerPx(), this.gEmmrt.getSlTriggerPx());
    }

    @Override // o.InterfaceC55843xrb
    public java.lang.String fJNWhG() {
        return C56043xvP.AEQbTJ(this.gEmmrt.getInstType(), this.gEmmrt.getInstId(), this.gEmmrt.getTpTriggerPx());
    }

    @Override // o.InterfaceC55843xrb
    public java.lang.String AkhnZx() {
        return C56043xvP.OLrzqt(this.gEmmrt.getInstType(), this.gEmmrt.getInstId(), this.gEmmrt.getSlTriggerPx());
    }

    @Override // o.InterfaceC55843xrb
    public C55851xrj AuCTel() {
        return C56043xvP.copydefault(this.djBIcL, this.AYXKKw);
    }

    @Override // o.InterfaceC55843xrb
    public C55851xrj values() {
        return C56043xvP.AEQbTJ(this.djBIcL, this.AYXKKw);
    }

    @Override // o.InterfaceC55843xrb
    public void EZpvd() {
        this.gEmmrt.setTpTriggerPx(null);
    }

    @Override // o.InterfaceC55843xrb
    public void KWHzl() {
        this.gEmmrt.setSlTriggerPx(null);
    }

    @Override // o.InterfaceC55843xrb
    public kotlin.Pair<java.lang.Boolean, java.lang.Object> OLrzqt() {
        xVK xvk = xVK.EZpvd;
        java.lang.String tpTriggerPx = this.gEmmrt.getTpTriggerPx();
        if (tpTriggerPx == null) {
            tpTriggerPx = "";
        }
        java.lang.String[] strArrEZpvd = xvk.EZpvd(tpTriggerPx, this.gEmmrt.getInstId(), this.gEmmrt.getInstType());
        if (strArrEZpvd == null || strArrEZpvd.length == 0) {
            java.lang.String strEZpvd = C56049xvV.EZpvd(this.gEmmrt);
            if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strEZpvd)) {
                return new kotlin.Pair<>(java.lang.Boolean.TRUE, "");
            }
            return new kotlin.Pair<>(java.lang.Boolean.FALSE, strEZpvd);
        }
        return new kotlin.Pair<>(java.lang.Boolean.FALSE, strArrEZpvd);
    }

    @Override // o.InterfaceC55843xrb
    public kotlin.Pair<java.lang.Boolean, java.lang.Object> AEQbTJ() {
        xVK xvk = xVK.EZpvd;
        java.lang.String slTriggerPx = this.gEmmrt.getSlTriggerPx();
        if (slTriggerPx == null) {
            slTriggerPx = "";
        }
        java.lang.String[] strArrEZpvd = xvk.EZpvd(slTriggerPx, this.gEmmrt.getInstId(), this.gEmmrt.getInstType());
        if (strArrEZpvd == null || strArrEZpvd.length == 0) {
            java.lang.String strKWHzl = C56049xvV.KWHzl(this.gEmmrt);
            if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strKWHzl)) {
                return new kotlin.Pair<>(java.lang.Boolean.TRUE, "");
            }
            return new kotlin.Pair<>(java.lang.Boolean.FALSE, strKWHzl);
        }
        return new kotlin.Pair<>(java.lang.Boolean.FALSE, strArrEZpvd);
    }

    @Override // o.InterfaceC55843xrb
    public kotlin.Pair<java.lang.String, java.lang.Integer> DbNXlk() {
        return new kotlin.Pair<>("", 0);
    }

    @Override // o.InterfaceC55843xrb
    public void copydefault(boolean z) {
        OLrzqt(z);
    }

    @Override // o.InterfaceC55843xrb
    public void EZpvd(boolean z) {
        KWHzl(z);
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
        return C56043xvP.copydefault(instType, instId, strAYXKKw);
    }
}
