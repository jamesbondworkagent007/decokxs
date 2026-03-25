package o;

import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.IdxConfig;
import com.okinc.unify_trade.biz.TradeCoinInfo;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC54581xNr;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xsk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public abstract class AbstractC55905xsk implements InterfaceC55914xst {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC55914xst
    public java.lang.String KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return str3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC55914xst
    public java.lang.String OLrzqt() {
        return "PnL ";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC55914xst
    public java.lang.String OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return str3 == null ? "" : str3;
    }

    public final boolean OLrzqt(java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str2, "");
        return C56044xvQ.AEQbTJ(str2) && AEQbTJ(str, str2);
    }

    public final boolean AEQbTJ(java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str2, "");
        return C33129mqd.OLrzqt((java.lang.CharSequence) str) && !Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) str2);
    }

    @Override // o.InterfaceC55914xst
    public java.lang.String OLrzqt(@NotNull C55887xsS c55887xsS, java.lang.String str, java.lang.String str2, @NotNull java.lang.String str3) {
        C54536xML c54536xMLDjBIcL;
        C54536xML c54536xMLCopydefault;
        C54536xML c54536xMLFetchVPNInfo;
        Intrinsics.checkNotNullParameter(c55887xsS, "");
        Intrinsics.checkNotNullParameter(str3, "");
        java.lang.String strDbNXlk = c55887xsS.DbNXlk();
        if (strDbNXlk == null) {
            strDbNXlk = "";
        }
        java.lang.String safeString$default = null;
        if (OLrzqt(str2, strDbNXlk)) {
            java.lang.String strDjBIcL = c55887xsS.djBIcL();
            BizInstrument bizInstrumentAhwBna = c55887xsS.AhwBna();
            c55887xsS = new C55887xsS(strDjBIcL, (bizInstrumentAhwBna != null ? bizInstrumentAhwBna.getTradeSymbol() : null) + "-" + str2);
        }
        C54571xNh c54571xNhEZpvd = c55887xsS.EZpvd(c55887xsS.copydefault("grid"));
        if (c54571xNhEZpvd != null) {
            if (str == null) {
                str = "";
            }
            C54536xML c54536xMLAYXKKw = c54571xNhEZpvd.AYXKKw(str);
            if (c54536xMLAYXKKw != null && (c54536xMLDjBIcL = c54536xMLAYXKKw.djBIcL()) != null && (c54536xMLCopydefault = c54536xMLDjBIcL.copydefault()) != null && (c54536xMLFetchVPNInfo = c54536xMLCopydefault.fetchVPNInfo()) != null) {
                safeString$default = C54536xML.toSafeString$default(c54536xMLFetchVPNInfo, false, 1, null);
            }
        }
        return str3 + safeString$default;
    }

    public final C55887xsS AEQbTJ(java.lang.String str, java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4) {
        java.lang.String quoteSymbol;
        java.lang.String tradeSymbol;
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        BizInstrument suggestedInstrument$default = interfaceC54581xNrOLrzqt != null ? InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, str4, str3, null, null, 12, null) : null;
        if (suggestedInstrument$default == null || (quoteSymbol = suggestedInstrument$default.getQuoteSymbol()) == null) {
            quoteSymbol = "";
        }
        if (suggestedInstrument$default == null || (tradeSymbol = suggestedInstrument$default.getTradeSymbol()) == null) {
            tradeSymbol = "";
        }
        if (C56044xvQ.AEQbTJ(quoteSymbol)) {
            if (AEQbTJ(str != null ? str : "", quoteSymbol)) {
                return new C55887xsS(str4, tradeSymbol + "-" + str);
            }
            return new C55887xsS(str4, str3);
        }
        C55887xsS c55887xsS = new C55887xsS(str4, str3);
        c55887xsS.gEmmrt(str2);
        return c55887xsS;
    }

    public final java.lang.String EZpvd(java.lang.String str, java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5) {
        C54536xML c54536xMLAYXKKw;
        C54536xML c54536xMLDjBIcL;
        C54536xML c54536xMLAuCTel;
        java.lang.String safeString$default;
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        C55887xsS c55887xsSAEQbTJ = AEQbTJ(str, str2, str3, str4);
        C54571xNh c54571xNhEZpvd = c55887xsSAEQbTJ.EZpvd(c55887xsSAEQbTJ.copydefault("grid"));
        return (c54571xNhEZpvd == null || (c54536xMLAYXKKw = c54571xNhEZpvd.AYXKKw(str5)) == null || (c54536xMLDjBIcL = c54536xMLAYXKKw.djBIcL()) == null || (c54536xMLAuCTel = c54536xMLDjBIcL.AuCTel()) == null || (safeString$default = C54536xML.toSafeString$default(c54536xMLAuCTel, false, 1, null)) == null) ? "--" : safeString$default;
    }

    public final java.lang.String EZpvd(java.lang.String str, java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4) {
        java.lang.String quoteSymbol;
        java.lang.String tradeSymbol;
        TradeCoinInfo tradeCoinInfoAhwBna;
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        C54589xNz c54589xNz = C54589xNz.EZpvd;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = c54589xNz.OLrzqt();
        java.lang.String sizeDig = null;
        BizInstrument suggestedInstrument$default = interfaceC54581xNrOLrzqt != null ? InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, str4, str3, null, null, 12, null) : null;
        if (suggestedInstrument$default == null || (quoteSymbol = suggestedInstrument$default.getQuoteSymbol()) == null) {
            quoteSymbol = "";
        }
        if (suggestedInstrument$default == null || (tradeSymbol = suggestedInstrument$default.getTradeSymbol()) == null) {
            tradeSymbol = "";
        }
        C55887xsS c55887xsSAEQbTJ = AEQbTJ(str, str2, str3, str4);
        if (C56044xvQ.AEQbTJ(quoteSymbol)) {
            if (AEQbTJ(str == null ? "" : str, quoteSymbol)) {
                InterfaceC54581xNr interfaceC54581xNrCopydefault = c54589xNz.copydefault();
                if (interfaceC54581xNrCopydefault != null) {
                    if (str == null) {
                        str = "";
                    }
                    TradeCoinInfo tradeCoinInfoAhwBna2 = interfaceC54581xNrCopydefault.AhwBna(str);
                    if (tradeCoinInfoAhwBna2 != null) {
                        sizeDig = tradeCoinInfoAhwBna2.getSizeDig();
                    }
                }
            } else {
                AbstractC54531xLw abstractC54531xLwAEQbTJ = c55887xsSAEQbTJ.AEQbTJ();
                if (abstractC54531xLwAEQbTJ != null) {
                    java.lang.String strValueOf = c55887xsSAEQbTJ.valueOf();
                    IdxConfig idxConfigAkhnZx = abstractC54531xLwAEQbTJ.AkhnZx(strValueOf != null ? strValueOf : "");
                    if (idxConfigAkhnZx != null) {
                        sizeDig = idxConfigAkhnZx.getQuoteDig();
                    }
                }
            }
        } else {
            InterfaceC54581xNr interfaceC54581xNrCopydefault2 = c54589xNz.copydefault();
            if (interfaceC54581xNrCopydefault2 != null && (tradeCoinInfoAhwBna = interfaceC54581xNrCopydefault2.AhwBna(tradeSymbol)) != null) {
                sizeDig = tradeCoinInfoAhwBna.getSizeDig();
            }
        }
        return "0." + C59449zhJ.copydefault("0", C33129mqd.AhwBna(sizeDig) - 1) + "1";
    }
}
