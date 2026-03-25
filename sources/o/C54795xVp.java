package o;

import com.engagelab.privates.push.constants.MTPushConstants;
import com.okinc.biz.TradeType;
import com.okinc.unify_trade.biz.BizInstrument;
import java.math.RoundingMode;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import o.C55688xof;
import o.InterfaceC54581xNr;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xVp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C54795xVp {
    public static final int KWHzl(int i) {
        if (i != 10 && i != 16) {
            switch (i) {
                case 1:
                    return 1;
                case 2:
                    return 4;
                case 3:
                    return 2;
                case 4:
                    return 5;
                case 5:
                    return 6;
                case 6:
                    return 7;
                case 7:
                    break;
                default:
                    return 0;
            }
        }
        return 3;
    }

    public static final java.lang.String copydefault(java.lang.String str) {
        return (str == null || str.length() == 0) ? "--" : pTA.formatSimpleDateTime$default(new Date(C33129mqd.valueOf(str)), null, 1, null);
    }

    public static final java.lang.String AEQbTJ(java.lang.String str) {
        if (str == null || str.length() == 0 || C33129mqd.valueOf(str, 0)) {
            return "--";
        }
        java.lang.String strDivS$default = C33129mqd.divS$default(str, "86400000", 0, null, null, 12, null);
        java.lang.String strDivS$default2 = C33129mqd.divS$default(C33129mqd.remS$default(str, "86400000", null, null, null, 14, null), "3600000", 0, null, null, 12, null);
        if (C33129mqd.gEmmrt(strDivS$default, 1) && C33129mqd.gEmmrt(strDivS$default2, 1)) {
            return C33070mpX.AYXKKw(C55688xof.Application.OgHfcT);
        }
        int i = C55688xof.Application.RFmUsE;
        xMR xmr = xMR.copydefault;
        return C33069mpW.copydefault(i, C56424yEw.gEmmrt(C56390yDp.OLrzqt(MTPushConstants.NotificationTime.KEY_DAYS, xmr.copydefault(strDivS$default)), C56390yDp.OLrzqt("hour", xmr.copydefault(strDivS$default2))));
    }

    public static final java.lang.String KWHzl(java.lang.String str) {
        return (str == null || str.length() == 0) ? "--" : xMR.formatPercent$default(xMR.copydefault, str, 0, null, 6, null);
    }

    public static final java.lang.String AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        java.lang.String instId;
        java.lang.String instType;
        C54536xML c54536xMLDjBIcL;
        C54536xML c54536xMLFetchVPNInfo;
        java.lang.String safeString$default;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (str3 != null && str3.length() != 0) {
            InterfaceC54581xNr interfaceC54581xNrCopydefault = C54589xNz.EZpvd.copydefault();
            BizInstrument suggestedInstrument$default = interfaceC54581xNrCopydefault != null ? InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrCopydefault, str2, str, null, null, 12, null) : null;
            C54797xVr c54797xVr = C54797xVr.copydefault;
            if (suggestedInstrument$default == null || (instId = suggestedInstrument$default.getInstId()) == null) {
                instId = "";
            }
            if (suggestedInstrument$default == null || (instType = suggestedInstrument$default.getInstType()) == null) {
                instType = "";
            }
            xMS xmsAEQbTJ = c54797xVr.AEQbTJ(instId, instType);
            if (xmsAEQbTJ != null) {
                if (str3 == null) {
                    str3 = "";
                }
                C54536xML c54536xMLAYXKKw = xmsAEQbTJ.AYXKKw(str3);
                if (c54536xMLAYXKKw != null) {
                    if (str4 == null) {
                        str4 = "";
                    }
                    C54536xML c54536xMLEZpvd = c54536xMLAYXKKw.EZpvd(str4);
                    if (c54536xMLEZpvd != null && (c54536xMLDjBIcL = c54536xMLEZpvd.djBIcL()) != null && (c54536xMLFetchVPNInfo = c54536xMLDjBIcL.fetchVPNInfo()) != null && (safeString$default = C54536xML.toSafeString$default(c54536xMLFetchVPNInfo, false, 1, null)) != null) {
                        return safeString$default;
                    }
                }
            }
        }
        return "--";
    }

    public static /* synthetic */ java.lang.String getAmount$default(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, int i, java.lang.Object obj) {
        if ((i & 64) != 0) {
            str7 = "1.0";
        }
        return copydefault(str, str2, str3, str4, str5, str6, str7);
    }

    public static final java.lang.String copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7) {
        C54536xML c54536xMLDjBIcL;
        C54536xML c54536xMLDjBIcL2;
        C54536xML c54536xMLFetchVPNInfo;
        java.lang.String safeString$default;
        java.lang.String instType;
        java.lang.String instId;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (str4 != null && str4.length() != 0 && str7 != null && str7.length() != 0) {
            if (Intrinsics.EZpvd((java.lang.Object) str3, (java.lang.Object) "Buy")) {
                str4 = C33129mqd.divS$default(str4, str5, null, null, null, 14, null);
            }
            java.lang.String strMulS$default = C33129mqd.mulS$default(str4, str7, null, null, null, 14, null);
            InterfaceC54581xNr interfaceC54581xNrCopydefault = C54589xNz.EZpvd.copydefault();
            BizInstrument suggestedInstrument$default = interfaceC54581xNrCopydefault != null ? InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrCopydefault, str2, str, null, null, 12, null) : null;
            C54571xNh c54571xNhCreateAmtConvertor$default = C54797xVr.createAmtConvertor$default(C54797xVr.copydefault, (suggestedInstrument$default == null || (instId = suggestedInstrument$default.getInstId()) == null) ? "" : instId, (suggestedInstrument$default == null || (instType = suggestedInstrument$default.getInstType()) == null) ? "" : instType, null, false, null, 28, null);
            if (c54571xNhCreateAmtConvertor$default != null && (c54536xMLDjBIcL = c54571xNhCreateAmtConvertor$default.djBIcL(strMulS$default)) != null) {
                if (str6 == null) {
                    str6 = "";
                }
                C54536xML c54536xMLEZpvd = c54536xMLDjBIcL.EZpvd(str6);
                if (c54536xMLEZpvd != null && (c54536xMLDjBIcL2 = c54536xMLEZpvd.djBIcL()) != null && (c54536xMLFetchVPNInfo = c54536xMLDjBIcL2.fetchVPNInfo()) != null && (safeString$default = C54536xML.toSafeString$default(c54536xMLFetchVPNInfo, false, 1, null)) != null) {
                    return safeString$default;
                }
            }
        }
        return "--";
    }

    public static final java.lang.String copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6) {
        C54536xML c54536xMLDjBIcL;
        C54536xML c54536xMLFetchVPNInfo;
        java.lang.String safeString$default;
        java.lang.String instType;
        java.lang.String instId;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (!Intrinsics.EZpvd((java.lang.Object) str3, (java.lang.Object) "Buy")) {
            str4 = (str4 == null || str4.length() != 0) ? C33129mqd.subS$default(str5, str4, null, null, null, 14, null) : "";
        }
        if (str4 != null && str4.length() == 0) {
            return "--";
        }
        InterfaceC54581xNr interfaceC54581xNrCopydefault = C54589xNz.EZpvd.copydefault();
        BizInstrument suggestedInstrument$default = interfaceC54581xNrCopydefault != null ? InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrCopydefault, str2, str, null, null, 12, null) : null;
        C54571xNh c54571xNhCreateAmtConvertor$default = C54797xVr.createAmtConvertor$default(C54797xVr.copydefault, (suggestedInstrument$default == null || (instId = suggestedInstrument$default.getInstId()) == null) ? "" : instId, (suggestedInstrument$default == null || (instType = suggestedInstrument$default.getInstType()) == null) ? "" : instType, null, false, null, 28, null);
        if (c54571xNhCreateAmtConvertor$default == null) {
            return "--";
        }
        if (str4 == null) {
            str4 = "";
        }
        C54536xML c54536xMLDjBIcL2 = c54571xNhCreateAmtConvertor$default.djBIcL(str4);
        if (c54536xMLDjBIcL2 == null) {
            return "--";
        }
        if (str6 == null) {
            str6 = "";
        }
        C54536xML c54536xMLEZpvd = c54536xMLDjBIcL2.EZpvd(str6);
        return (c54536xMLEZpvd == null || (c54536xMLDjBIcL = c54536xMLEZpvd.djBIcL()) == null || (c54536xMLFetchVPNInfo = c54536xMLDjBIcL.fetchVPNInfo()) == null || (safeString$default = C54536xML.toSafeString$default(c54536xMLFetchVPNInfo, false, 1, null)) == null) ? "--" : safeString$default;
    }

    public static final java.lang.String AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6) {
        C54536xML c54536xMLDjBIcL;
        C54536xML c54536xMLFetchVPNInfo;
        java.lang.String safeString$default;
        java.lang.String instType;
        java.lang.String instId;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (!Intrinsics.EZpvd((java.lang.Object) str3, (java.lang.Object) "Buy")) {
            str4 = C33129mqd.mulS$default(str4, str5, null, null, null, 14, null);
        }
        InterfaceC54581xNr interfaceC54581xNrCopydefault = C54589xNz.EZpvd.copydefault();
        BizInstrument suggestedInstrument$default = interfaceC54581xNrCopydefault != null ? InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrCopydefault, str2, str, null, null, 12, null) : null;
        C54571xNh c54571xNhCreateAmtConvertor$default = C54797xVr.createAmtConvertor$default(C54797xVr.copydefault, (suggestedInstrument$default == null || (instId = suggestedInstrument$default.getInstId()) == null) ? "" : instId, (suggestedInstrument$default == null || (instType = suggestedInstrument$default.getInstType()) == null) ? "" : instType, null, true, null, 20, null);
        if (c54571xNhCreateAmtConvertor$default != null) {
            if (str4 == null) {
                str4 = "";
            }
            C54536xML c54536xMLDjBIcL2 = c54571xNhCreateAmtConvertor$default.djBIcL(str4);
            if (c54536xMLDjBIcL2 != null) {
                if (str6 == null) {
                    str6 = "";
                }
                C54536xML c54536xMLEZpvd = c54536xMLDjBIcL2.EZpvd(str6);
                if (c54536xMLEZpvd != null && (c54536xMLDjBIcL = c54536xMLEZpvd.djBIcL()) != null && (c54536xMLFetchVPNInfo = c54536xMLDjBIcL.fetchVPNInfo()) != null && (safeString$default = C54536xML.toSafeString$default(c54536xMLFetchVPNInfo, false, 1, null)) != null) {
                    return safeString$default;
                }
            }
        }
        return "--";
    }

    public static final java.lang.String EZpvd(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        java.lang.String strSubS$default;
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "Buy")) {
            strSubS$default = C33129mqd.divS$default(str4, C33129mqd.divS$default(str3, str2, null, null, null, 14, null), null, null, null, 14, null);
        } else {
            strSubS$default = (str4 == null || str4.length() != 0) ? C33129mqd.subS$default(1, C33129mqd.divS$default(str4, str3, null, null, null, 14, null), null, null, null, 14, null) : "";
        }
        java.lang.String str5 = strSubS$default;
        return C33129mqd.valueOf(str5, "0") ? "--" : xMR.formatPercent$default(xMR.copydefault, str5, 0, null, 6, null);
    }

    public static final boolean OLrzqt(java.lang.String str) {
        int iKWHzl = KWHzl(C33129mqd.AhwBna(str));
        return iKWHzl == 6 || iKWHzl == 7;
    }

    public static final kotlin.Pair<java.lang.String, java.lang.Integer> OLrzqt(@NotNull java.lang.String str, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        switch (KWHzl(C33129mqd.AhwBna(str))) {
            case 1:
                return new kotlin.Pair<>(C33070mpX.AYXKKw(C55688xof.Application.QnnRaN), java.lang.Integer.valueOf(C33070mpX.copydefault(C52761wXj.Activity.DeEinT)));
            case 2:
                return new kotlin.Pair<>(C33070mpX.AYXKKw(C55688xof.Application.AhwBna), java.lang.Integer.valueOf(C33070mpX.copydefault(C52761wXj.Activity.DeEinT)));
            case 3:
                return new kotlin.Pair<>(C33070mpX.AYXKKw(C55688xof.Application.DQnQnb), java.lang.Integer.valueOf(C33070mpX.copydefault(C52761wXj.Activity.HJWChPUUMfbK)));
            case 4:
                return new kotlin.Pair<>(C33070mpX.AYXKKw(C55688xof.Application.removeOnContextAvailableListener), java.lang.Integer.valueOf(C33070mpX.copydefault(C52761wXj.Activity.iLAtSv)));
            case 5:
                return new kotlin.Pair<>(Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "Buy") ? C33070mpX.AYXKKw(C55688xof.Application.DeEinT) : C33070mpX.AYXKKw(C55688xof.Application.fAklCm), java.lang.Integer.valueOf(C33070mpX.copydefault(C52761wXj.Activity.DeEinT)));
            case 6:
            case 7:
                return new kotlin.Pair<>(Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "Buy") ? C33070mpX.AYXKKw(C55688xof.Application.QUeTTI) : C33070mpX.AYXKKw(C55688xof.Application.DYICSh), java.lang.Integer.valueOf(C33070mpX.copydefault(C52761wXj.Activity.DeEinT)));
            default:
                return new kotlin.Pair<>(C33070mpX.AYXKKw(C55688xof.Application.OrsvgJ), java.lang.Integer.valueOf(C33070mpX.copydefault(C52761wXj.Activity.onReceive)));
        }
    }

    public static /* synthetic */ java.lang.String getPriceDiscountText$default(java.lang.String str, java.lang.String str2, TradeType tradeType, boolean z, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            z = false;
        }
        return OLrzqt(str, str2, tradeType, z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001c, code lost:
    
        if (o.C38303pTu.OLrzqt(r1) != false) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.String KWHzl(boolean z, TradeType tradeType) {
        if (z) {
            java.util.Locale locale = java.util.Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale, "");
            if (!C38303pTu.KWHzl(locale)) {
                java.util.Locale locale2 = java.util.Locale.getDefault();
                Intrinsics.checkNotNullExpressionValue(locale2, "");
            }
            return "-- " + (tradeType == TradeType.BUY_OPEN ? C33070mpX.AYXKKw(C55688xof.Application.dGgpab) : C33070mpX.AYXKKw(C55688xof.Application.doTurnConnection));
        }
        return "--";
    }

    public static final java.lang.String OLrzqt(java.lang.String str, java.lang.String str2, @NotNull TradeType tradeType, boolean z) {
        Intrinsics.checkNotNullParameter(tradeType, "");
        if (str2 == null || str2.length() == 0 || str == null || str.length() == 0) {
            return KWHzl(z, tradeType);
        }
        if (tradeType == TradeType.BUY_OPEN) {
            java.util.Locale locale = java.util.Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale, "");
            if (!C38303pTu.KWHzl(locale)) {
                java.util.Locale locale2 = java.util.Locale.getDefault();
                Intrinsics.checkNotNullExpressionValue(locale2, "");
                if (!C38303pTu.OLrzqt(locale2)) {
                    return pTB.formatPercent$default(pTB.AEQbTJ(C33129mqd.divS$default(C33129mqd.subS$default(str2, str, null, null, null, 14, null), str2, null, null, null, 14, null)), 2, null, 2, null);
                }
            }
            java.lang.String s$default = C33129mqd.formatS$default(C33129mqd.mulS$default(C33129mqd.divS$default(str, str2, null, null, null, 14, null), 10, null, null, null, 14, null), 1, null, RoundingMode.DOWN, 2, null);
            if (C33129mqd.copydefault((java.lang.Object) s$default, (java.lang.Object) 10)) {
                return KWHzl(z, tradeType);
            }
            return s$default + " " + C33070mpX.AYXKKw(C55688xof.Application.dGgpab);
        }
        java.util.Locale locale3 = java.util.Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale3, "");
        if (!C38303pTu.KWHzl(locale3)) {
            java.util.Locale locale4 = java.util.Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale4, "");
            if (!C38303pTu.OLrzqt(locale4)) {
                return pTB.formatPercent$default(pTB.AEQbTJ(C33129mqd.divS$default(C33129mqd.subS$default(str, str2, null, null, null, 14, null), str2, null, null, null, 14, null)), 2, null, 2, null);
            }
        }
        java.lang.String s$default2 = C33129mqd.formatS$default(C33129mqd.divS$default(str, str2, null, null, null, 14, null), 2, null, RoundingMode.UP, 2, null);
        if (C33129mqd.valueOf(s$default2, 1)) {
            return KWHzl(z, tradeType);
        }
        return s$default2 + " " + C33070mpX.AYXKKw(C55688xof.Application.doTurnConnection);
    }
}
