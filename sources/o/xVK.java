package o;

import androidx.camera.video.AudioStats;
import com.okinc.biz.OptionLimitSubtype;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.DataInputModuleModel;
import com.okinc.unify_trade.biz.BizInstrument;
import com.reown.foundation.util.jwt.JwtUtilsKt;
import java.math.RoundingMode;
import kotlin.jvm.internal.Intrinsics;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class xVK {
    public static final xVK EZpvd = new xVK();

    private xVK() {
    }

    public final java.lang.String KWHzl(@NotNull java.lang.String str, java.lang.String str2, java.lang.String str3) {
        kotlin.Pair<java.lang.String, java.lang.String> pairEZpvd;
        Intrinsics.checkNotNullParameter(str, "");
        if (str2 == null || str2.length() == 0 || str.length() == 0 || C59449zhJ.endsWith$default(str, JwtUtilsKt.JWT_DELIMITER, false, 2, null)) {
            return null;
        }
        if ((Intrinsics.EZpvd((java.lang.Object) str3, (java.lang.Object) "FUTURES") || Intrinsics.EZpvd((java.lang.Object) str3, (java.lang.Object) "SWAP")) && (pairEZpvd = C54801xVv.OLrzqt.EZpvd(str, str2, str3)) != null) {
            return pairEZpvd.getSecond();
        }
        return null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final java.lang.String[] EZpvd(@NotNull java.lang.String str, java.lang.String str2, java.lang.String str3) {
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        BizInstrument bizInstrumentValueOf;
        java.lang.String tickerSize;
        AbstractC54531xLw abstractC54531xLwOLrzqt2;
        java.lang.String str4 = "";
        Intrinsics.checkNotNullParameter(str, "");
        if (str2 == null || str2.length() == 0 || str.length() == 0 || C33129mqd.AEQbTJ(str) == AudioStats.AUDIO_AMPLITUDE_NONE) {
            return null;
        }
        if (((InterfaceC46553tYp) C43248rlh.KWHzl.AEQbTJ(InterfaceC46553tYp.class)).QKVWgx() != 0 && (Intrinsics.EZpvd((java.lang.Object) str3, (java.lang.Object) "FUTURES") || Intrinsics.EZpvd((java.lang.Object) str3, (java.lang.Object) "SWAP"))) {
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
            BizInstrument bizInstrumentValueOf2 = (interfaceC54581xNrOLrzqt == null || (abstractC54531xLwOLrzqt2 = interfaceC54581xNrOLrzqt.OLrzqt(str3)) == null) ? null : abstractC54531xLwOLrzqt2.valueOf(str2);
            if (bizInstrumentValueOf2 != null && Intrinsics.EZpvd(bizInstrumentValueOf2.isNegativeContract(), java.lang.Boolean.TRUE)) {
                return null;
            }
        }
        if (str3 == null) {
            return null;
        }
        switch (str3.hashCode()) {
            case -2027980370:
                if (!str3.equals("MARGIN")) {
                    return null;
                }
                break;
            case -1956807563:
                if (str3.equals("OPTION")) {
                    return xVF.OLrzqt.AEQbTJ(str, str2);
                }
                return null;
            case 2552066:
                if (!str3.equals("SPOT")) {
                    return null;
                }
                break;
            case 2558355:
                if (!str3.equals("SWAP")) {
                    return null;
                }
                break;
            case 214415088:
                if (!str3.equals("FUTURES")) {
                    return null;
                }
                break;
            default:
                return null;
        }
        InterfaceC54581xNr interfaceC54581xNrOLrzqt2 = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt2 != null && (abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt2.OLrzqt(str3)) != null && (bizInstrumentValueOf = abstractC54531xLwOLrzqt.valueOf(str2)) != null && (tickerSize = bizInstrumentValueOf.getTickerSize()) != null) {
            str4 = tickerSize;
        }
        kotlin.Pair<java.lang.String, java.lang.String> pairOLrzqt = OLrzqt(str4, str, str2, str3);
        if (pairOLrzqt != null) {
            return EZpvd.KWHzl(pairOLrzqt);
        }
        return null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final java.lang.String[] OLrzqt(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        BizInstrument bizInstrumentValueOf;
        java.lang.String minSize;
        java.lang.String safeString$default;
        C54536xML c54536xMLDjBIcL;
        C54536xML c54536xMLCopydefault;
        C54536xML c54536xMLAEQbTJ;
        C54536xML c54536xMLDjBIcL2;
        if (str2 == null || str2.length() == 0 || str == null || str.length() == 0 || str3 == null) {
            return null;
        }
        switch (str3.hashCode()) {
            case -2027980370:
                if (!str3.equals("MARGIN")) {
                    return null;
                }
                break;
            case -1956807563:
                if (str3.equals("OPTION")) {
                    return xVF.OLrzqt.KWHzl(str, str2);
                }
                return null;
            case 2552066:
                if (!str3.equals("SPOT")) {
                    return null;
                }
                break;
            case 2558355:
                if (!str3.equals("SWAP")) {
                    return null;
                }
                return C54801xVv.OLrzqt.OLrzqt(str, str2, str3);
            case 214415088:
                if (!str3.equals("FUTURES")) {
                    return null;
                }
                return C54801xVv.OLrzqt.OLrzqt(str, str2, str3);
            default:
                return null;
        }
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt == null || (abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt.OLrzqt(str3)) == null || (bizInstrumentValueOf = abstractC54531xLwOLrzqt.valueOf(str2)) == null || (minSize = bizInstrumentValueOf.getMinSize()) == null || C33129mqd.AEQbTJ(str) >= C33129mqd.AEQbTJ(minSize)) {
            return null;
        }
        C54571xNh c54571xNhCreateAmtConvertor$default = C54797xVr.createAmtConvertor$default(C54797xVr.copydefault, str2, str3, "1", false, null, 24, null);
        if (c54571xNhCreateAmtConvertor$default == null || (c54536xMLDjBIcL = c54571xNhCreateAmtConvertor$default.djBIcL(minSize)) == null || (c54536xMLCopydefault = c54536xMLDjBIcL.copydefault()) == null || (c54536xMLAEQbTJ = c54536xMLCopydefault.AEQbTJ(true)) == null || (c54536xMLDjBIcL2 = c54536xMLAEQbTJ.djBIcL()) == null || (safeString$default = C54536xML.toSafeString$default(c54536xMLDjBIcL2, false, 1, null)) == null) {
            safeString$default = "";
        }
        return new java.lang.String[]{C33069mpW.KWHzl(C55734xpY.Companion.copydefault(), C55688xof.Application.ActivityResultCallerKt, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("minsize", safeString$default)))};
    }

    public static /* synthetic */ java.lang.String getProbablyValue$default(xVK xvk, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i, java.lang.Object obj) {
        if ((i & 16) != 0) {
            str5 = null;
        }
        return xvk.EZpvd(str, str2, str3, str4, str5);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.String EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        java.lang.String strKWHzl;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (str.length() == 0 || C33129mqd.AEQbTJ(str) == AudioStats.AUDIO_AMPLITUDE_NONE || str2.length() == 0 || C33129mqd.AEQbTJ(str2) == AudioStats.AUDIO_AMPLITUDE_NONE) {
            return "";
        }
        if (str4 == null) {
            strKWHzl = "";
        } else {
            int iHashCode = str4.hashCode();
            if (iHashCode == -1956807563) {
                if (str4.equals("OPTION")) {
                    strKWHzl = xVF.OLrzqt.KWHzl(str, str2, str3, str5);
                }
            } else {
                strKWHzl = iHashCode != 2558355 ? C54801xVv.OLrzqt.KWHzl(str, str2, str3, str4) : C54801xVv.OLrzqt.KWHzl(str, str2, str3, str4);
            }
        }
        if (strKWHzl.length() == 0) {
            return "";
        }
        return "≈ " + strKWHzl;
    }

    public static /* synthetic */ java.lang.String getProbablyCalculatorValue$default(xVK xvk, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i, java.lang.Object obj) {
        if ((i & 16) != 0) {
            str5 = null;
        }
        return xvk.KWHzl(str, str2, str3, str4, str5);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.String KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        java.lang.String strCopydefault;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (str.length() == 0 || C33129mqd.AEQbTJ(str) == AudioStats.AUDIO_AMPLITUDE_NONE || str2.length() == 0 || C33129mqd.AEQbTJ(str2) == AudioStats.AUDIO_AMPLITUDE_NONE) {
            return "";
        }
        if (str4 == null) {
            strCopydefault = "";
        } else {
            int iHashCode = str4.hashCode();
            if (iHashCode == -1956807563) {
                if (str4.equals("OPTION")) {
                    strCopydefault = xVF.OLrzqt.copydefault(str, str2, str3, str5);
                }
            } else {
                strCopydefault = iHashCode != 2558355 ? C54801xVv.OLrzqt.EZpvd(str, str2, str3, str4) : C54801xVv.OLrzqt.EZpvd(str, str2, str3, str4);
            }
        }
        if (strCopydefault.length() == 0) {
            return "";
        }
        return "≈ " + strCopydefault;
    }

    public static /* synthetic */ java.lang.String getMaxPrice$default(xVK xvk, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, OptionLimitSubtype optionLimitSubtype, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            str4 = "";
        }
        java.lang.String str5 = str4;
        if ((i & 16) != 0) {
            optionLimitSubtype = null;
        }
        return xvk.KWHzl(str, str2, str3, str5, optionLimitSubtype);
    }

    public final java.lang.String KWHzl(@NotNull java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, OptionLimitSubtype optionLimitSubtype) {
        Intrinsics.checkNotNullParameter(str, "");
        if (Intrinsics.EZpvd((java.lang.Object) str3, (java.lang.Object) "OPTION")) {
            java.lang.String strCopydefault = copydefault(str4, optionLimitSubtype, str2, str3);
            if (C33129mqd.AEQbTJ(str) > C33129mqd.AEQbTJ(strCopydefault)) {
                return strCopydefault;
            }
        }
        return null;
    }

    public final java.lang.String copydefault(java.lang.String str, OptionLimitSubtype optionLimitSubtype, java.lang.String str2, java.lang.String str3) {
        C54536xML c54536xMLAYXKKw;
        C54536xML c54536xMLCopydefault;
        C54536xML c54536xMLAEQbTJ;
        java.lang.String safeString$default;
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "LIMIT") && optionLimitSubtype == OptionLimitSubtype.TRACKING_IV) {
            return C33129mqd.subS$default(500, java.lang.Double.valueOf(java.lang.Math.pow(10.0d, -C33129mqd.AEQbTJ(1))), null, null, null, 14, null);
        }
        C54797xVr c54797xVr = C54797xVr.copydefault;
        if (str2 == null) {
            str2 = "";
        }
        if (str3 == null) {
            str3 = "";
        }
        xMS xmsAEQbTJ = c54797xVr.AEQbTJ(str2, str3);
        return (xmsAEQbTJ == null || (c54536xMLAYXKKw = xmsAEQbTJ.AYXKKw("1000000")) == null || (c54536xMLCopydefault = c54536xMLAYXKKw.copydefault()) == null || (c54536xMLAEQbTJ = c54536xMLCopydefault.AEQbTJ(true)) == null || (safeString$default = C54536xML.toSafeString$default(c54536xMLAEQbTJ, false, 1, null)) == null) ? "" : safeString$default;
    }

    public final kotlin.Pair<java.lang.String, java.lang.String> KWHzl(java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4) {
        java.lang.String strMulS$default;
        java.lang.String safeString$default;
        C54536xML c54536xMLAEQbTJ;
        C54536xML c54536xMLCopydefault;
        C54536xML c54536xMLDjBIcL;
        C54536xML c54536xMLAEQbTJ2;
        java.lang.String safeString$default2;
        C54536xML c54536xMLAEQbTJ3;
        C54536xML c54536xMLCopydefault2;
        C54536xML c54536xMLDjBIcL2;
        C54536xML c54536xMLAEQbTJ4;
        java.lang.String str5 = "";
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        if (str == null || str.length() == 0 || C33129mqd.AEQbTJ(str) == AudioStats.AUDIO_AMPLITUDE_NONE) {
            return null;
        }
        xMR xmr = xMR.copydefault;
        if (xmr.OLrzqt((java.lang.Object) str2).remainder(xmr.OLrzqt((java.lang.Object) str)).doubleValue() == AudioStats.AUDIO_AMPLITUDE_NONE) {
            return null;
        }
        double dDivD$default = C33129mqd.divD$default(str2, str, null, null, null, 14, null);
        if (dDivD$default < 1.0d) {
            strMulS$default = str;
        } else {
            strMulS$default = C33129mqd.mulS$default(java.lang.Integer.valueOf((int) java.lang.Math.floor(dDivD$default)), str, null, null, null, 14, null);
            java.lang.String strMulS$default2 = C33129mqd.mulS$default(java.lang.Integer.valueOf((int) java.lang.Math.ceil(dDivD$default)), str, null, null, null, 14, null);
            if (C33129mqd.subD$default(str2, strMulS$default, null, null, null, 14, null) > C33129mqd.subD$default(strMulS$default2, str2, null, null, null, 14, null)) {
                strMulS$default = strMulS$default2;
            }
        }
        C54797xVr c54797xVr = C54797xVr.copydefault;
        xMS xmsAEQbTJ = c54797xVr.AEQbTJ(str3, str4);
        if (xmsAEQbTJ == null || (c54536xMLAEQbTJ3 = xmsAEQbTJ.AEQbTJ(str)) == null || (c54536xMLCopydefault2 = c54536xMLAEQbTJ3.copydefault()) == null || (c54536xMLDjBIcL2 = c54536xMLCopydefault2.djBIcL()) == null || (c54536xMLAEQbTJ4 = c54536xMLDjBIcL2.AEQbTJ(true)) == null || (safeString$default = C54536xML.toSafeString$default(c54536xMLAEQbTJ4, false, 1, null)) == null) {
            safeString$default = "";
        }
        xMS xmsAEQbTJ2 = c54797xVr.AEQbTJ(str3, str4);
        if (xmsAEQbTJ2 != null && (c54536xMLAEQbTJ = xmsAEQbTJ2.AEQbTJ(strMulS$default)) != null && (c54536xMLCopydefault = c54536xMLAEQbTJ.copydefault()) != null && (c54536xMLDjBIcL = c54536xMLCopydefault.djBIcL()) != null && (c54536xMLAEQbTJ2 = c54536xMLDjBIcL.AEQbTJ(true)) != null && (safeString$default2 = C54536xML.toSafeString$default(c54536xMLAEQbTJ2, false, 1, null)) != null) {
            str5 = safeString$default2;
        }
        return C56390yDp.OLrzqt(safeString$default, str5);
    }

    public final kotlin.Pair<java.lang.String, java.lang.String> OLrzqt(java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4) {
        java.lang.String strMulS$default;
        java.lang.String safeString$default;
        C54536xML c54536xMLAEQbTJ;
        C54536xML c54536xMLCopydefault;
        C54536xML c54536xMLDjBIcL;
        C54536xML c54536xMLAEQbTJ2;
        java.lang.String safeString$default2;
        C54536xML c54536xMLAEQbTJ3;
        C54536xML c54536xMLCopydefault2;
        C54536xML c54536xMLDjBIcL2;
        C54536xML c54536xMLAEQbTJ4;
        java.lang.String str5 = "";
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        if (str == null || str.length() == 0 || C33129mqd.AEQbTJ(str) == AudioStats.AUDIO_AMPLITUDE_NONE) {
            return null;
        }
        xMR xmr = xMR.copydefault;
        if (xmr.OLrzqt((java.lang.Object) str2).remainder(xmr.OLrzqt((java.lang.Object) str)).doubleValue() == AudioStats.AUDIO_AMPLITUDE_NONE) {
            return null;
        }
        double dDivD$default = C33129mqd.divD$default(str2, str, null, null, null, 14, null);
        if (dDivD$default < 1.0d) {
            strMulS$default = str;
        } else {
            strMulS$default = C33129mqd.mulS$default(java.lang.Integer.valueOf((int) java.lang.Math.floor(dDivD$default)), str, null, null, null, 14, null);
            java.lang.String strMulS$default2 = C33129mqd.mulS$default(java.lang.Integer.valueOf((int) java.lang.Math.ceil(dDivD$default)), str, null, null, null, 14, null);
            if (C33129mqd.subD$default(str2, strMulS$default, null, null, null, 14, null) >= C33129mqd.subD$default(strMulS$default2, str2, null, null, null, 14, null)) {
                strMulS$default = strMulS$default2;
            }
        }
        C54797xVr c54797xVr = C54797xVr.copydefault;
        xMS xmsAEQbTJ = c54797xVr.AEQbTJ(str3, str4);
        if (xmsAEQbTJ == null || (c54536xMLAEQbTJ3 = xmsAEQbTJ.AEQbTJ(str)) == null || (c54536xMLCopydefault2 = c54536xMLAEQbTJ3.copydefault()) == null || (c54536xMLDjBIcL2 = c54536xMLCopydefault2.djBIcL()) == null || (c54536xMLAEQbTJ4 = c54536xMLDjBIcL2.AEQbTJ(true)) == null || (safeString$default = C54536xML.toSafeString$default(c54536xMLAEQbTJ4, false, 1, null)) == null) {
            safeString$default = "";
        }
        xMS xmsAEQbTJ2 = c54797xVr.AEQbTJ(str3, str4);
        if (xmsAEQbTJ2 != null && (c54536xMLAEQbTJ = xmsAEQbTJ2.AEQbTJ(strMulS$default)) != null && (c54536xMLCopydefault = c54536xMLAEQbTJ.copydefault()) != null && (c54536xMLDjBIcL = c54536xMLCopydefault.djBIcL()) != null && (c54536xMLAEQbTJ2 = c54536xMLDjBIcL.AEQbTJ(true)) != null && (safeString$default2 = C54536xML.toSafeString$default(c54536xMLAEQbTJ2, false, 1, null)) != null) {
            str5 = safeString$default2;
        }
        return C56390yDp.OLrzqt(safeString$default, str5);
    }

    public final kotlin.Pair<java.lang.String, java.lang.String> gEmmrt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4) {
        C54536xML c54536xMLIsConnected;
        java.lang.String safeString$default;
        C54536xML c54536xMLIsConnected2;
        java.lang.String safeString$default2;
        java.lang.String str5 = "";
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        kotlin.Pair<java.lang.String, java.lang.String> pairDjBIcL = djBIcL(str, str2, str3, str4);
        if (pairDjBIcL == null) {
            return null;
        }
        C54797xVr c54797xVr = C54797xVr.copydefault;
        C54571xNh c54571xNhCreateAmtConvertor$default = C54797xVr.createAmtConvertor$default(c54797xVr, str3, str4, null, false, null, 28, null);
        java.lang.String str6 = (c54571xNhCreateAmtConvertor$default == null || (c54536xMLIsConnected2 = c54571xNhCreateAmtConvertor$default.isConnected(pairDjBIcL.getFirst())) == null || (safeString$default2 = C54536xML.toSafeString$default(c54536xMLIsConnected2, false, 1, null)) == null) ? "" : safeString$default2;
        C54571xNh c54571xNhCreateAmtConvertor$default2 = C54797xVr.createAmtConvertor$default(c54797xVr, str3, str4, null, false, null, 28, null);
        if (c54571xNhCreateAmtConvertor$default2 != null && (c54536xMLIsConnected = c54571xNhCreateAmtConvertor$default2.isConnected(pairDjBIcL.getSecond())) != null && (safeString$default = C54536xML.toSafeString$default(c54536xMLIsConnected, false, 1, null)) != null) {
            str5 = safeString$default;
        }
        return C56390yDp.OLrzqt(str6, str5);
    }

    public final kotlin.Pair<java.lang.String, java.lang.String> copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4) {
        C54536xML c54536xMLAYXKKw;
        java.lang.String safeString$default;
        C54536xML c54536xMLAYXKKw2;
        java.lang.String safeString$default2;
        java.lang.String str5 = "";
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        kotlin.Pair<java.lang.String, java.lang.String> pairAEQbTJ = AEQbTJ(str, str2, str3, str4);
        if (pairAEQbTJ == null) {
            return null;
        }
        C54797xVr c54797xVr = C54797xVr.copydefault;
        C54571xNh c54571xNhCreateAmtConvertor$default = C54797xVr.createAmtConvertor$default(c54797xVr, str3, str4, null, false, null, 28, null);
        java.lang.String str6 = (c54571xNhCreateAmtConvertor$default == null || (c54536xMLAYXKKw2 = c54571xNhCreateAmtConvertor$default.AYXKKw(pairAEQbTJ.getFirst())) == null || (safeString$default2 = C54536xML.toSafeString$default(c54536xMLAYXKKw2, false, 1, null)) == null) ? "" : safeString$default2;
        C54571xNh c54571xNhCreateAmtConvertor$default2 = C54797xVr.createAmtConvertor$default(c54797xVr, str3, str4, null, false, null, 28, null);
        if (c54571xNhCreateAmtConvertor$default2 != null && (c54536xMLAYXKKw = c54571xNhCreateAmtConvertor$default2.AYXKKw(pairAEQbTJ.getSecond())) != null && (safeString$default = C54536xML.toSafeString$default(c54536xMLAYXKKw, false, 1, null)) != null) {
            str5 = safeString$default;
        }
        return C56390yDp.OLrzqt(str6, str5);
    }

    public static /* synthetic */ kotlin.Pair getBestDisplayAmtForSegmentOrder$default(xVK xvk, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i, java.lang.Object obj) {
        if ((i & 16) != 0) {
            str5 = "0";
        }
        return xvk.AEQbTJ(str, str2, str3, str4, str5);
    }

    public final kotlin.Pair<java.lang.String, java.lang.String> AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, java.lang.String str5) {
        kotlin.Pair<java.lang.String, java.lang.String> pairEZpvd;
        java.lang.String safeString$default;
        C54536xML c54536xMLAYXKKw;
        java.lang.String safeString$default2;
        C54536xML c54536xMLAYXKKw2;
        java.lang.String str6 = "";
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        if (Intrinsics.EZpvd((java.lang.Object) str5, (java.lang.Object) "2") || (pairEZpvd = EZpvd(str, str2, str3, str4)) == null) {
            return null;
        }
        C54571xNh c54571xNhCreateAmtConvertorForSegment$default = C54797xVr.createAmtConvertorForSegment$default(C54797xVr.copydefault, str3, str4, str5, null, 8, null);
        if (c54571xNhCreateAmtConvertorForSegment$default == null || (c54536xMLAYXKKw2 = c54571xNhCreateAmtConvertorForSegment$default.AYXKKw(pairEZpvd.getFirst())) == null || (safeString$default = C54536xML.toSafeString$default(c54536xMLAYXKKw2, false, 1, null)) == null) {
            safeString$default = "";
        }
        if (c54571xNhCreateAmtConvertorForSegment$default != null && (c54536xMLAYXKKw = c54571xNhCreateAmtConvertorForSegment$default.AYXKKw(pairEZpvd.getSecond())) != null && (safeString$default2 = C54536xML.toSafeString$default(c54536xMLAYXKKw, false, 1, null)) != null) {
            str6 = safeString$default2;
        }
        return C56390yDp.OLrzqt(safeString$default, str6);
    }

    public final kotlin.Pair<java.lang.String, java.lang.String> AEQbTJ(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        if (str2.length() == 0 || C33129mqd.AEQbTJ(str2) == AudioStats.AUDIO_AMPLITUDE_NONE) {
            return null;
        }
        if (!C33129mqd.OLrzqt(str, "0") && xMR.copydefault.OLrzqt((java.lang.Object) str).remainder(pTB.AEQbTJ(str2)).doubleValue() == AudioStats.AUDIO_AMPLITUDE_NONE) {
            return null;
        }
        double dDivD$default = C33129mqd.divD$default(str, str2, null, null, null, 14, null);
        return C56390yDp.OLrzqt(str2, C33129mqd.mulS$default(str2, java.lang.Integer.valueOf(dDivD$default < 1.0d ? 1 : (int) java.lang.Math.floor(dDivD$default)), null, null, null, 14, null));
    }

    public final kotlin.Pair<java.lang.String, java.lang.String> EZpvd(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        if (str2.length() == 0 || C33129mqd.AEQbTJ(str2) == AudioStats.AUDIO_AMPLITUDE_NONE || xMR.copydefault.OLrzqt((java.lang.Object) str).remainder(pTB.AEQbTJ(str2)).doubleValue() == AudioStats.AUDIO_AMPLITUDE_NONE) {
            return null;
        }
        double dDivD$default = C33129mqd.divD$default(str, str2, null, null, null, 14, null);
        return C56390yDp.OLrzqt(str2, C33129mqd.mulS$default(str2, java.lang.Integer.valueOf(dDivD$default < 1.0d ? 0 : (int) java.lang.Math.floor(dDivD$default)), null, null, null, 14, null));
    }

    public final kotlin.Pair<java.lang.String, java.lang.String> djBIcL(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        if (str2.length() == 0 || C33129mqd.AEQbTJ(str2) == AudioStats.AUDIO_AMPLITUDE_NONE) {
            return null;
        }
        if (!C33129mqd.OLrzqt(str, "0") && xMR.copydefault.OLrzqt((java.lang.Object) str).remainder(pTB.AEQbTJ(str2)).doubleValue() == AudioStats.AUDIO_AMPLITUDE_NONE) {
            return null;
        }
        double dDivD$default = C33129mqd.divD$default(str, str2, null, null, null, 14, null);
        return C56390yDp.OLrzqt(str2, C33129mqd.mulS$default(str2, java.lang.Integer.valueOf(dDivD$default < 1.0d ? 1 : C33129mqd.AhwBna(C33129mqd.formatS$default(java.lang.Double.valueOf(dDivD$default), 0, null, RoundingMode.HALF_UP, 2, null))), null, null, null, 14, null));
    }

    public final java.lang.String[] KWHzl(@NotNull kotlin.Pair<java.lang.String, java.lang.String> pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        return new java.lang.String[]{C33069mpW.KWHzl(C55734xpY.Companion.copydefault(), C55688xof.Application.onOptionsItemSelected, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56424yEw.gEmmrt(C56390yDp.OLrzqt("multiple", pair.getFirst()), C56390yDp.OLrzqt(DataInputModuleModel.DataInputItem.INPUT_TYPE_NUMBER, pair.getSecond()))), pair.getSecond()};
    }

    public final java.lang.String[] EZpvd(@NotNull kotlin.Pair<java.lang.String, java.lang.String> pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        xMR xmr = xMR.copydefault;
        return new java.lang.String[]{C33069mpW.KWHzl(C55734xpY.Companion.copydefault(), C55688xof.Application.onOptionsItemSelected, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56424yEw.gEmmrt(C56390yDp.OLrzqt("multiple", xmr.copydefault(pair.getFirst())), C56390yDp.OLrzqt(DataInputModuleModel.DataInputItem.INPUT_TYPE_NUMBER, xmr.copydefault(pair.getSecond())))), pair.getSecond()};
    }
}
