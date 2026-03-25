package o;

import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.bot.TpSlTriggerParam;
import com.okinc.unify_trade.bot.config.SpotTpSlStopType;
import com.okinc.unify_trade.bot.config.SpotTpSlTypeConfigData;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C55688xof;
import o.InterfaceC55914xst;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Marker;

/* JADX INFO: renamed from: o.xsr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C55912xsr {
    public final java.lang.String AEQbTJ;
    public final C55910xsp AYXKKw;
    public final C55906xsl AhwBna;
    public final C55919xsy AkhnZx;
    public final int EZpvd;
    public final java.lang.String KWHzl;
    public final C55887xsS OLrzqt;
    public final C55908xsn copydefault;
    public final C55913xss djBIcL;
    public final java.lang.String fetchVPNInfo;
    public final C55911xsq gEmmrt;
    public final java.lang.String isConnected;
    public final java.lang.String valueOf;
    public final java.lang.String values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C55887xsS AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AYXKKw() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AhwBna() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int djBIcL() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String valueOf() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String values() {
        return this.values;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C55912xsr(@NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        int iIntValue;
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        java.lang.String strFIwbmz;
        java.lang.String tradeSymbol;
        java.lang.String str5 = "";
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.KWHzl = str;
        this.AEQbTJ = str2;
        this.valueOf = str3;
        this.fetchVPNInfo = str4;
        C55887xsS c55887xsS = new C55887xsS(str, str2);
        this.OLrzqt = c55887xsS;
        this.AYXKKw = new C55910xsp();
        this.AkhnZx = new C55919xsy();
        this.gEmmrt = new C55911xsq();
        this.AhwBna = new C55906xsl();
        this.djBIcL = new C55913xss();
        this.copydefault = new C55908xsn();
        c55887xsS.gEmmrt(str4);
        java.lang.String strCopydefault = c55887xsS.copydefault("grid");
        this.values = strCopydefault;
        BizInstrument bizInstrumentAhwBna = c55887xsS.AhwBna();
        if (bizInstrumentAhwBna != null && (tradeSymbol = bizInstrumentAhwBna.getTradeSymbol()) != null) {
            str5 = tradeSymbol;
        }
        this.isConnected = str5;
        if (bizInstrumentAhwBna == null) {
            iIntValue = 8;
        } else {
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
            java.lang.Integer numValueOf = (interfaceC54581xNrOLrzqt == null || (abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt.OLrzqt(bizInstrumentAhwBna.getInstType())) == null || (strFIwbmz = abstractC54531xLwOLrzqt.fIwbmz(bizInstrumentAhwBna.getInstFamily())) == null) ? null : java.lang.Integer.valueOf(C33129mqd.AhwBna(strFIwbmz));
            if (numValueOf != null) {
                iIntValue = numValueOf.intValue();
            }
        }
        this.EZpvd = iIntValue;
        SpotTpSlStopType.CLOSURE_RETURN_USDT.setTitle("USDT");
        SpotTpSlStopType.CLOSURE_RETURN_QUOTE.setTitle(strCopydefault);
        SpotTpSlStopType.CLOSURE_RETURN_BASE_QUOTE.setTitle(str5 + " + " + strCopydefault);
    }

    public final InterfaceC55914xst AhwBna(@NotNull TpSlTriggerParam tpSlTriggerParam) {
        Intrinsics.checkNotNullParameter(tpSlTriggerParam, "");
        java.lang.String indicator = tpSlTriggerParam.getTp().getIndicator();
        if (Intrinsics.EZpvd((java.lang.Object) indicator, (java.lang.Object) SpotTpSlTypeConfigData.PRICE.getType())) {
            return this.AYXKKw;
        }
        if (Intrinsics.EZpvd((java.lang.Object) indicator, (java.lang.Object) SpotTpSlTypeConfigData.RATIO.getType())) {
            return this.AkhnZx;
        }
        if (Intrinsics.EZpvd((java.lang.Object) indicator, (java.lang.Object) SpotTpSlTypeConfigData.PNL.getType())) {
            return this.gEmmrt;
        }
        return null;
    }

    public final InterfaceC55914xst AYXKKw(@NotNull TpSlTriggerParam tpSlTriggerParam) {
        Intrinsics.checkNotNullParameter(tpSlTriggerParam, "");
        java.lang.String indicator = tpSlTriggerParam.getSl().getIndicator();
        if (Intrinsics.EZpvd((java.lang.Object) indicator, (java.lang.Object) SpotTpSlTypeConfigData.PRICE.getType())) {
            return this.AhwBna;
        }
        if (Intrinsics.EZpvd((java.lang.Object) indicator, (java.lang.Object) SpotTpSlTypeConfigData.RATIO.getType())) {
            return this.djBIcL;
        }
        if (Intrinsics.EZpvd((java.lang.Object) indicator, (java.lang.Object) SpotTpSlTypeConfigData.PNL.getType())) {
            return this.copydefault;
        }
        return null;
    }

    public final java.lang.String DbNXlk(TpSlTriggerParam tpSlTriggerParam) {
        SpotTpSlStopType spotTpSlStopTypeOLrzqt;
        if (tpSlTriggerParam == null || (spotTpSlStopTypeOLrzqt = SpotTpSlStopType.Companion.OLrzqt(tpSlTriggerParam.getStopType())) == null) {
            return null;
        }
        return spotTpSlStopTypeOLrzqt.getTitle();
    }

    public final java.lang.String fetchVPNInfo(TpSlTriggerParam tpSlTriggerParam) {
        InterfaceC55914xst interfaceC55914xstAhwBna;
        if (tpSlTriggerParam != null && (interfaceC55914xstAhwBna = AhwBna(tpSlTriggerParam)) != null) {
            int i = this.EZpvd;
            java.lang.String strAYXKKw = this.OLrzqt.AYXKKw();
            if (strAYXKKw == null) {
                strAYXKKw = "";
            }
            C55851xrj inputConfigData$default = InterfaceC55914xst.StateListAnimator.getInputConfigData$default(interfaceC55914xstAhwBna, i, strAYXKKw, this.fetchVPNInfo, this.valueOf, this.AEQbTJ, this.KWHzl, null, null, 192, null);
            if (inputConfigData$default != null) {
                return inputConfigData$default.EZpvd();
            }
        }
        return null;
    }

    public final java.lang.String isConnected(TpSlTriggerParam tpSlTriggerParam) {
        InterfaceC55914xst interfaceC55914xstAYXKKw;
        if (tpSlTriggerParam != null && (interfaceC55914xstAYXKKw = AYXKKw(tpSlTriggerParam)) != null) {
            int i = this.EZpvd;
            java.lang.String strAYXKKw = this.OLrzqt.AYXKKw();
            if (strAYXKKw == null) {
                strAYXKKw = "";
            }
            C55851xrj inputConfigData$default = InterfaceC55914xst.StateListAnimator.getInputConfigData$default(interfaceC55914xstAYXKKw, i, strAYXKKw, this.fetchVPNInfo, this.valueOf, this.AEQbTJ, this.KWHzl, null, null, 192, null);
            if (inputConfigData$default != null) {
                return inputConfigData$default.EZpvd();
            }
        }
        return null;
    }

    public final java.lang.String AkhnZx(@NotNull TpSlTriggerParam tpSlTriggerParam) {
        java.lang.String strOLrzqt;
        Intrinsics.checkNotNullParameter(tpSlTriggerParam, "");
        InterfaceC55914xst interfaceC55914xstAhwBna = AhwBna(tpSlTriggerParam);
        return (interfaceC55914xstAhwBna == null || (strOLrzqt = interfaceC55914xstAhwBna.OLrzqt()) == null) ? "" : strOLrzqt;
    }

    public final java.lang.String gEmmrt(@NotNull TpSlTriggerParam tpSlTriggerParam) {
        java.lang.String strOLrzqt;
        Intrinsics.checkNotNullParameter(tpSlTriggerParam, "");
        InterfaceC55914xst interfaceC55914xstAYXKKw = AYXKKw(tpSlTriggerParam);
        return (interfaceC55914xstAYXKKw == null || (strOLrzqt = interfaceC55914xstAYXKKw.OLrzqt()) == null) ? "" : strOLrzqt;
    }

    public final java.lang.String copydefault() {
        return C33070mpX.AYXKKw(C55688xof.Application.MediaBrowserCompatSubscriptionCallbackSubscriptionCallbackApi26);
    }

    public final java.lang.String gEmmrt() {
        return C33070mpX.AYXKKw(C55688xof.Application.getOptionsList);
    }

    public final java.lang.String values(TpSlTriggerParam tpSlTriggerParam) {
        InterfaceC55914xst interfaceC55914xstAhwBna;
        java.lang.String strOLrzqt;
        return (tpSlTriggerParam == null || (interfaceC55914xstAhwBna = AhwBna(tpSlTriggerParam)) == null || (strOLrzqt = interfaceC55914xstAhwBna.OLrzqt(this.OLrzqt, tpSlTriggerParam.getTp().getValue(), this.valueOf, Marker.ANY_NON_NULL_MARKER)) == null) ? "--" : strOLrzqt;
    }

    public final java.lang.String valueOf(TpSlTriggerParam tpSlTriggerParam) {
        InterfaceC55914xst interfaceC55914xstAYXKKw;
        java.lang.String strOLrzqt;
        return (tpSlTriggerParam == null || (interfaceC55914xstAYXKKw = AYXKKw(tpSlTriggerParam)) == null || (strOLrzqt = interfaceC55914xstAYXKKw.OLrzqt(this.OLrzqt, tpSlTriggerParam.getSl().getValue(), this.valueOf, "-")) == null) ? "--" : strOLrzqt;
    }

    public final java.lang.String djBIcL(TpSlTriggerParam tpSlTriggerParam) {
        java.lang.String delaySeconds = tpSlTriggerParam != null ? tpSlTriggerParam.getDelaySeconds() : null;
        if (delaySeconds == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) delaySeconds)) {
            return "--";
        }
        return tpSlTriggerParam.getDelaySeconds() + " s";
    }

    public final java.lang.String EZpvd(java.lang.String str) {
        java.lang.String strAYXKKw;
        SpotTpSlTypeConfigData spotTpSlTypeConfigDataEZpvd = SpotTpSlTypeConfigData.Companion.EZpvd(str);
        return (spotTpSlTypeConfigDataEZpvd == null || (strAYXKKw = C33070mpX.AYXKKw(spotTpSlTypeConfigDataEZpvd.getTitle())) == null) ? "" : strAYXKKw;
    }
}
