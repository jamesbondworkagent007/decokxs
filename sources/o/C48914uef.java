package o;

import com.okinc.localization.util.format.OKDateEnum;
import com.okinc.tradeapi.framework.constant.TradeKey;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.OptionInstrument;
import com.okinc.unify_trade.biz.SpotInstrument;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C35964oKf;
import o.C35966oKh;
import o.InterfaceC54581xNr;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.uef, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C48914uef {
    public static final C48914uef EZpvd = new C48914uef();

    private C48914uef() {
    }

    public static /* synthetic */ java.lang.String getTitleFromNewInfo$default(C48914uef c48914uef, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            z = false;
        }
        return c48914uef.EZpvd(str, str2, str3, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [124=4] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final java.lang.String EZpvd(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z) {
        java.lang.String strReplace$default;
        if (str2 == null) {
            return "";
        }
        switch (str2.hashCode()) {
            case -2027980370:
                if (!str2.equals("MARGIN")) {
                    return "";
                }
                if (str == null && (strReplace$default = C59449zhJ.replace$default(str, "-", "/", false, 4, (java.lang.Object) null)) != null) {
                    java.util.Locale locale = java.util.Locale.getDefault();
                    Intrinsics.checkNotNullExpressionValue(locale, "");
                    java.lang.String strReplaceFirst$default = strReplace$default.toUpperCase(locale);
                    Intrinsics.checkNotNullExpressionValue(strReplaceFirst$default, "");
                    if (strReplaceFirst$default == null) {
                        return "";
                    }
                    return strReplaceFirst$default;
                }
            case -1956807563:
                if (!str2.equals("OPTION")) {
                    return "";
                }
                java.lang.String strAEQbTJ = AEQbTJ(str, str2);
                if (z) {
                    return (str3 != null ? C59449zhJ.replace$default(str3, "-", "", false, 4, (java.lang.Object) null) : null) + strAEQbTJ;
                }
                java.util.List listSplit$default = str != null ? StringsKt__StringsKt.split$default((java.lang.CharSequence) str, new java.lang.String[]{"-"}, false, 0, 6, (java.lang.Object) null) : null;
                if (listSplit$default == null || listSplit$default.size() != 5) {
                    if (str == null || (strReplaceFirst$default = C59449zhJ.replaceFirst$default(str, "-", "", false, 4, (java.lang.Object) null)) == null) {
                        return "";
                    }
                    return strReplaceFirst$default;
                }
                return listSplit$default.get(0) + listSplit$default.get(1) + "-" + strAEQbTJ + "-" + listSplit$default.get(3) + "-" + listSplit$default.get(4);
            case 2552066:
                if (!str2.equals("SPOT")) {
                    return "";
                }
                return str == null ? "" : "";
            case 2558355:
                return !str2.equals("SWAP") ? "" : getTitleByIdAndType$default(this, str, str2, false, false, null, false, false, 124, null);
            case 214415088:
                return !str2.equals("FUTURES") ? "" : getTitleByIdAndType$default(this, str, str2, false, false, null, false, false, 124, null);
            default:
                return "";
        }
    }

    public static /* synthetic */ java.lang.String setHqFutureText$default(C48914uef c48914uef, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            z = false;
        }
        return c48914uef.OLrzqt(str, str2, str3, z);
    }

    public final java.lang.String OLrzqt(java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3, boolean z) {
        Intrinsics.checkNotNullParameter(str2, "");
        return getTitleByIdAndType$default(this, str, str2, false, false, null, false, false, 124, null);
    }

    public static /* synthetic */ java.lang.String getTitleByIdAndType$default(C48914uef c48914uef, java.lang.String str, java.lang.String str2, boolean z, boolean z2, android.content.Context context, boolean z3, boolean z4, int i, java.lang.Object obj) {
        return c48914uef.KWHzl(str, str2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? null : context, (i & 32) != 0 ? false : z3, (i & 64) != 0 ? false : z4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [200=4] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final java.lang.String KWHzl(java.lang.String str, java.lang.String str2, boolean z, boolean z2, android.content.Context context, boolean z3, boolean z4) {
        InterfaceC49425uoM interfaceC49425uoM;
        InterfaceC54577xNn interfaceC54577xNn;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        BizInstrument suggestedInstrument$default;
        java.lang.String instFamily;
        java.lang.String strReplaceFirst$default;
        InterfaceC49425uoM interfaceC49425uoM2;
        InterfaceC54577xNn interfaceC54577xNn2;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt2;
        BizInstrument suggestedInstrument$default2;
        java.lang.String str3 = "";
        if (!z2 ? str2 == null || (interfaceC49425uoM = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class)) == null || (interfaceC54577xNn = (InterfaceC54577xNn) interfaceC49425uoM.KWHzl(TradeKey.MANAGER)) == null || (interfaceC54581xNrOLrzqt = interfaceC54577xNn.OLrzqt()) == null || (suggestedInstrument$default = InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, str2, str, null, null, 12, null)) == null || (instFamily = suggestedInstrument$default.getInstFamily()) == null : str2 == null || (interfaceC49425uoM2 = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class)) == null || (interfaceC54577xNn2 = (InterfaceC54577xNn) interfaceC49425uoM2.KWHzl(TradeKey.MANAGER)) == null || (interfaceC54581xNrOLrzqt2 = interfaceC54577xNn2.OLrzqt()) == null || (suggestedInstrument$default2 = InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt2, str2, str, null, null, 12, null)) == null || (instFamily = suggestedInstrument$default2.getInstFamily()) == null) {
            instFamily = "";
        }
        if (instFamily.length() == 0) {
            instFamily = xVE.copydefault.KWHzl(str == null ? "" : str);
        }
        if (str2 == null) {
            return "";
        }
        switch (str2.hashCode()) {
            case -2027980370:
                if (!str2.equals("MARGIN")) {
                    return "";
                }
                break;
            case -1956807563:
                if (!str2.equals("OPTION")) {
                    return "";
                }
                java.lang.String strOLrzqt = OLrzqt(str, str2);
                if (z) {
                    strReplaceFirst$default = (instFamily != null ? C59449zhJ.replace$default(instFamily, "-", "", false, 4, (java.lang.Object) null) : null) + strOLrzqt;
                } else {
                    java.util.List listSplit$default = str != null ? StringsKt__StringsKt.split$default((java.lang.CharSequence) str, new java.lang.String[]{"-"}, false, 0, 6, (java.lang.Object) null) : null;
                    if (listSplit$default != null && listSplit$default.size() == 5) {
                        return listSplit$default.get(0) + listSplit$default.get(1) + "-20" + listSplit$default.get(2) + "-" + listSplit$default.get(3) + "-" + listSplit$default.get(4);
                    }
                    if (str == null || (strReplaceFirst$default = C59449zhJ.replaceFirst$default(str, "-", "", false, 4, (java.lang.Object) null)) == null) {
                        return "";
                    }
                }
                return strReplaceFirst$default;
            case 2552066:
                if (!str2.equals("SPOT")) {
                    return "";
                }
                break;
            case 2558355:
                if (!str2.equals("SWAP")) {
                    return "";
                }
                if (!z3) {
                    str3 = " " + C55734xpY.Companion.copydefault().getResources().getString(C35966oKh.TaskDescription.KWHzl);
                }
                return C54799xVt.getTitleByIdAndType$default(C54799xVt.AEQbTJ, str, str2, false, false, null, false, null, 92, null) + str3;
            case 214415088:
                return !str2.equals("FUTURES") ? "" : C54799xVt.getTitleByIdAndType$default(C54799xVt.AEQbTJ, str, str2, false, false, 12, null);
            default:
                return "";
        }
        InterfaceC54577xNn interfaceC54577xNnOLrzqt = pWO.OLrzqt();
        return AEQbTJ(context, str, "", interfaceC54577xNnOLrzqt != null ? interfaceC54577xNnOLrzqt.OLrzqt() : null, true);
    }

    public final java.lang.String AEQbTJ(android.content.Context context, java.lang.String str, java.lang.String str2, InterfaceC54581xNr interfaceC54581xNr, boolean z) {
        java.lang.String strReplace$default;
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        BizInstrument bizInstrumentValueOf = (str == null || interfaceC54581xNr == null || (abstractC54531xLwOLrzqt = interfaceC54581xNr.OLrzqt("SPOT")) == null) ? null : abstractC54531xLwOLrzqt.valueOf(str);
        if (z && bizInstrumentValueOf != null) {
            return bizInstrumentValueOf.getTradeSymbol() + "/" + bizInstrumentValueOf.getDisplayQuoteSymbol();
        }
        if (context != null && C55296xhK.OLrzqt(context)) {
            java.lang.String strEZpvd = str != null ? EZpvd.EZpvd(str) : null;
            return (str != null ? EZpvd.KWHzl(str) : null) + "/" + strEZpvd;
        }
        if (str == null || (strReplace$default = C59449zhJ.replace$default(str, "-", "/", false, 4, (java.lang.Object) null)) == null) {
            return "";
        }
        java.util.Locale locale = java.util.Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "");
        java.lang.String upperCase = strReplace$default.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase, "");
        return upperCase == null ? "" : upperCase;
    }

    public final java.lang.String EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        try {
            if (C33129mqd.OLrzqt((java.lang.CharSequence) str)) {
                return (java.lang.String) StringsKt__StringsKt.split$default((java.lang.CharSequence) str, new java.lang.String[]{"-"}, false, 0, 6, (java.lang.Object) null).get(0);
            }
        } catch (java.lang.Exception unused) {
        }
        return "";
    }

    public final java.lang.String KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        try {
            if (C33129mqd.OLrzqt((java.lang.CharSequence) str) && StringsKt__StringsKt.split$default((java.lang.CharSequence) str, new java.lang.String[]{"-"}, false, 0, 6, (java.lang.Object) null).size() > 1) {
                return (java.lang.String) StringsKt__StringsKt.split$default((java.lang.CharSequence) str, new java.lang.String[]{"-"}, false, 0, 6, (java.lang.Object) null).get(1);
            }
        } catch (java.lang.Exception unused) {
        }
        return "";
    }

    public static /* synthetic */ java.lang.String getIdNameByIdAndType$default(C48914uef c48914uef, java.lang.String str, java.lang.String str2, boolean z, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return c48914uef.EZpvd(str, str2, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [307=4] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final java.lang.String EZpvd(java.lang.String str, java.lang.String str2, boolean z) {
        java.lang.String strKWHzl;
        java.lang.String strReplace$default;
        InterfaceC49425uoM interfaceC49425uoM;
        InterfaceC54577xNn interfaceC54577xNn;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        BizInstrument suggestedInstrument$default;
        if (str2 == null || (interfaceC49425uoM = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class)) == null || (interfaceC54577xNn = (InterfaceC54577xNn) interfaceC49425uoM.KWHzl(TradeKey.MANAGER)) == null || (interfaceC54581xNrOLrzqt = interfaceC54577xNn.OLrzqt()) == null || (suggestedInstrument$default = InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, str2, str, null, null, 12, null)) == null || (strKWHzl = suggestedInstrument$default.getInstFamily()) == null) {
            strKWHzl = "";
        }
        if (strKWHzl.length() == 0) {
            strKWHzl = xVE.copydefault.KWHzl(str == null ? "" : str);
        }
        java.lang.String str3 = strKWHzl;
        if (str2 == null) {
            return "";
        }
        switch (str2.hashCode()) {
            case -2027980370:
                if (!str2.equals("MARGIN")) {
                    return "";
                }
                break;
            case -1956807563:
                if (str2.equals("OPTION")) {
                    return java.lang.String.valueOf(str3 != null ? C59449zhJ.replace$default(str3, "-", "", false, 4, (java.lang.Object) null) : null);
                }
                return "";
            case 2552066:
                if (!str2.equals("SPOT")) {
                    return "";
                }
                break;
            case 2558355:
                if (str2.equals("SWAP")) {
                    return java.lang.String.valueOf(str3 != null ? C59449zhJ.replace$default(str3, "-", "", false, 4, (java.lang.Object) null) : null);
                }
                return "";
            case 214415088:
                if (!str2.equals("FUTURES")) {
                    return "";
                }
                java.util.List listSplit$default = str != null ? StringsKt__StringsKt.split$default((java.lang.CharSequence) str, new java.lang.String[]{"-"}, false, 0, 6, (java.lang.Object) null) : null;
                if (listSplit$default == null || listSplit$default.size() < 3) {
                    return "";
                }
                return (listSplit$default != null ? (java.lang.String) listSplit$default.get(0) : null) + (listSplit$default != null ? (java.lang.String) listSplit$default.get(1) : null);
            default:
                return "";
        }
        if (str == null || (strReplace$default = C59449zhJ.replace$default(str, "-", "/", false, 4, (java.lang.Object) null)) == null) {
            return "";
        }
        java.util.Locale locale = java.util.Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "");
        java.lang.String upperCase = strReplace$default.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase, "");
        return upperCase == null ? "" : upperCase;
    }

    public static /* synthetic */ java.lang.String getTypeNameByIdAndType$default(C48914uef c48914uef, java.lang.String str, java.lang.String str2, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        if ((i & 8) != 0) {
            z2 = false;
        }
        return c48914uef.AEQbTJ(str, str2, z, z2);
    }

    public final java.lang.String AEQbTJ(java.lang.String str, java.lang.String str2, boolean z, boolean z2) {
        java.lang.String instFamily;
        InterfaceC49425uoM interfaceC49425uoM;
        InterfaceC54577xNn interfaceC54577xNn;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        BizInstrument suggestedInstrument$default;
        java.lang.String str3 = "";
        if (str2 == null || (interfaceC49425uoM = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class)) == null || (interfaceC54577xNn = (InterfaceC54577xNn) interfaceC49425uoM.KWHzl(TradeKey.MANAGER)) == null || (interfaceC54581xNrOLrzqt = interfaceC54577xNn.OLrzqt()) == null || (suggestedInstrument$default = InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, str2, str, null, null, 12, null)) == null || (instFamily = suggestedInstrument$default.getInstFamily()) == null) {
            instFamily = "";
        }
        if (instFamily.length() == 0) {
            xVE.copydefault.KWHzl(str == null ? "" : str);
        }
        if (str2 == null) {
            return "";
        }
        int iHashCode = str2.hashCode();
        if (iHashCode == -1956807563) {
            return !str2.equals("OPTION") ? "" : OLrzqt(str, str2);
        }
        if (iHashCode == 2558355) {
            return !str2.equals("SWAP") ? "" : C55734xpY.Companion.copydefault().getResources().getString(C35966oKh.TaskDescription.KWHzl);
        }
        if (iHashCode != 214415088 || !str2.equals("FUTURES")) {
            return "";
        }
        if (z2) {
            return C59449zhJ.replace$default(C33069mpW.copydefault(C35966oKh.TaskDescription.gEmmrt, C56423yEv.EZpvd(C56390yDp.OLrzqt("uly", ""))), " ", "", false, 4, (java.lang.Object) null);
        }
        java.util.List listSplit$default = str != null ? StringsKt__StringsKt.split$default((java.lang.CharSequence) str, new java.lang.String[]{"-"}, false, 0, 6, (java.lang.Object) null) : null;
        if (listSplit$default != null && listSplit$default.size() >= 3) {
            Intrinsics.copydefault(listSplit$default);
            if (((java.lang.String) listSplit$default.get(2)).length() >= 6) {
                java.lang.String strSubstring = ((java.lang.String) listSplit$default.get(2)).substring(2, 6);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                str3 = strSubstring;
            }
        }
        return java.lang.String.valueOf(str3);
    }

    public final java.lang.String AEQbTJ(java.lang.String str, @NotNull java.lang.String str2) {
        java.lang.String expTime;
        InterfaceC54577xNn interfaceC54577xNn;
        InterfaceC54581xNr interfaceC54581xNrCopydefault;
        Intrinsics.checkNotNullParameter(str2, "");
        InterfaceC49425uoM interfaceC49425uoM = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
        BizInstrument minSuggestedInstrument$default = (interfaceC49425uoM == null || (interfaceC54577xNn = (InterfaceC54577xNn) interfaceC49425uoM.KWHzl(TradeKey.MANAGER)) == null || (interfaceC54581xNrCopydefault = interfaceC54577xNn.copydefault()) == null) ? null : InterfaceC54581xNr.TaskDescription.getMinSuggestedInstrument$default(interfaceC54581xNrCopydefault, str2, str, null, null, 12, null);
        OptionInstrument optionInstrument = minSuggestedInstrument$default instanceof OptionInstrument ? (OptionInstrument) minSuggestedInstrument$default : null;
        long j = (optionInstrument == null || (expTime = optionInstrument.getExpTime()) == null) ? 0L : java.lang.Long.parseLong(expTime);
        if (j == 0) {
            java.util.List listSplit$default = str != null ? StringsKt__StringsKt.split$default((java.lang.CharSequence) str, new java.lang.String[]{"-"}, false, 0, 6, (java.lang.Object) null) : null;
            if (listSplit$default == null || listSplit$default.size() != 5) {
                return "";
            }
            return "20" + listSplit$default.get(2);
        }
        return pTA.formatDate$default(new Date(j), OKDateEnum.DATE_FORMAT_SIMPLE, null, null, 6, null);
    }

    public final java.lang.String OLrzqt(java.lang.String str, @NotNull java.lang.String str2) {
        java.lang.String expTime;
        InterfaceC54577xNn interfaceC54577xNn;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        Intrinsics.checkNotNullParameter(str2, "");
        InterfaceC49425uoM interfaceC49425uoM = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
        BizInstrument suggestedInstrument$default = (interfaceC49425uoM == null || (interfaceC54577xNn = (InterfaceC54577xNn) interfaceC49425uoM.KWHzl(TradeKey.MANAGER)) == null || (interfaceC54581xNrOLrzqt = interfaceC54577xNn.OLrzqt()) == null) ? null : InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, str2, str, null, null, 12, null);
        OptionInstrument optionInstrument = suggestedInstrument$default instanceof OptionInstrument ? (OptionInstrument) suggestedInstrument$default : null;
        long j = (optionInstrument == null || (expTime = optionInstrument.getExpTime()) == null) ? 0L : java.lang.Long.parseLong(expTime);
        if (j == 0) {
            java.util.List listSplit$default = str != null ? StringsKt__StringsKt.split$default((java.lang.CharSequence) str, new java.lang.String[]{"-"}, false, 0, 6, (java.lang.Object) null) : null;
            if (listSplit$default == null || listSplit$default.size() != 5) {
                return "";
            }
            return "20" + listSplit$default.get(2);
        }
        return pTA.formatDate$default(new Date(j), OKDateEnum.DATE_FORMAT_SIMPLE, null, null, 6, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [459=7] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final java.lang.String copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        switch (str.hashCode()) {
            case -2027980370:
                if (str.equals("MARGIN")) {
                    return C33070mpX.AYXKKw(C35964oKf.Fragment.sEAkxl);
                }
                break;
            case -1956807563:
                if (str.equals("OPTION")) {
                    return C33070mpX.AYXKKw(C35964oKf.Fragment.onLocationChanged);
                }
                break;
            case 2552066:
                if (str.equals("SPOT")) {
                    return C33070mpX.AYXKKw(C35964oKf.Fragment.onProviderDisabled);
                }
                break;
            case 2558355:
                if (str.equals("SWAP")) {
                    return C33070mpX.AYXKKw(C35964oKf.Fragment.HrMTQN);
                }
                break;
            case 214415088:
                if (str.equals("FUTURES")) {
                    return C33070mpX.AYXKKw(C35964oKf.Fragment.nriSR);
                }
                break;
            case 1669573011:
                if (str.equals("CONVERT")) {
                    return C33070mpX.AYXKKw(C35964oKf.Fragment.zHQtTQ);
                }
                break;
        }
        return C33070mpX.AYXKKw(C35964oKf.Fragment.DAgZj);
    }

    public final java.lang.String AEQbTJ(java.lang.String str) {
        InterfaceC54577xNn interfaceC54577xNn;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        xOU xouWlaJM;
        InterfaceC49425uoM interfaceC49425uoM = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
        if (Intrinsics.EZpvd((java.lang.Object) ((interfaceC49425uoM == null || (interfaceC54577xNn = (InterfaceC54577xNn) interfaceC49425uoM.KWHzl(TradeKey.MANAGER)) == null || (interfaceC54581xNrOLrzqt = interfaceC54577xNn.OLrzqt()) == null || (xouWlaJM = interfaceC54581xNrOLrzqt.wlaJM()) == null) ? null : xouWlaJM.KWHzl()), (java.lang.Object) "trade_manual") || str == null) {
            return "";
        }
        int iHashCode = str.hashCode();
        if (iHashCode == 2552066) {
            return !str.equals("SPOT") ? "" : "grid";
        }
        if (iHashCode != 2558355) {
            if (iHashCode != 214415088 || !str.equals("FUTURES")) {
                return "";
            }
        } else if (!str.equals("SWAP")) {
            return "";
        }
        return "contract_grid";
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final int OLrzqt(java.lang.String str) {
        if (str != null) {
            switch (str.hashCode()) {
                case -2027980370:
                    if (str.equals("MARGIN")) {
                        return 1;
                    }
                    break;
                case -1956807563:
                    if (str.equals("OPTION")) {
                        return 4;
                    }
                    break;
                case 2552066:
                    str.equals("SPOT");
                    break;
                case 2558355:
                    if (str.equals("SWAP")) {
                        return 2;
                    }
                    break;
                case 214415088:
                    if (str.equals("FUTURES")) {
                        return 3;
                    }
                    break;
            }
        }
        return 0;
    }

    public static /* synthetic */ java.lang.String getPremarketTitle$default(C48914uef c48914uef, java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return c48914uef.EZpvd(str, z);
    }

    public final java.lang.String EZpvd(java.lang.String str, boolean z) {
        BizInstrument bizInstrumentValueOf;
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        AbstractC54531xLw abstractC54531xLwOLrzqt2;
        BizInstrument bizInstrumentValueOf2;
        java.lang.String instFamily;
        java.lang.String strReplace$default;
        AbstractC54531xLw abstractC54531xLwOLrzqt3;
        if (str == null) {
            return null;
        }
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = pWO.KWHzl().OLrzqt();
        if (interfaceC54581xNrOLrzqt == null || (abstractC54531xLwOLrzqt3 = interfaceC54581xNrOLrzqt.OLrzqt("FUTURES")) == null || (bizInstrumentValueOf = abstractC54531xLwOLrzqt3.valueOf(str)) == null) {
            InterfaceC54581xNr interfaceC54581xNrOLrzqt2 = pWO.KWHzl().OLrzqt();
            bizInstrumentValueOf = (interfaceC54581xNrOLrzqt2 == null || (abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt2.OLrzqt("SWAP")) == null) ? null : abstractC54531xLwOLrzqt.valueOf(str);
        }
        if (Intrinsics.EZpvd((java.lang.Object) (bizInstrumentValueOf != null ? bizInstrumentValueOf.getInstType() : null), (java.lang.Object) "SWAP")) {
            return getTitleByIdAndType$default(this, bizInstrumentValueOf.getInstId(), bizInstrumentValueOf.getInstType(), false, false, null, z, false, 88, null);
        }
        if (!Intrinsics.EZpvd((java.lang.Object) (bizInstrumentValueOf != null ? bizInstrumentValueOf.getInstType() : null), (java.lang.Object) "FUTURES")) {
            return "";
        }
        InterfaceC54581xNr interfaceC54581xNrOLrzqt3 = pWO.KWHzl().OLrzqt();
        if (interfaceC54581xNrOLrzqt3 == null || (abstractC54531xLwOLrzqt2 = interfaceC54581xNrOLrzqt3.OLrzqt("FUTURES")) == null || (bizInstrumentValueOf2 = abstractC54531xLwOLrzqt2.valueOf(str)) == null || (instFamily = bizInstrumentValueOf2.getInstFamily()) == null || (strReplace$default = C59449zhJ.replace$default(instFamily, "-", "", false, 4, (java.lang.Object) null)) == null) {
            return null;
        }
        return C33069mpW.copydefault(C35966oKh.TaskDescription.gEmmrt, C56423yEv.EZpvd(C56390yDp.OLrzqt("uly", strReplace$default)));
    }

    public final java.lang.String KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        InterfaceC54577xNn interfaceC54577xNn;
        InterfaceC54581xNr interfaceC54581xNrCopydefault;
        AbstractC54531xLw abstractC54531xLwDjBIcL;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        InterfaceC49425uoM interfaceC49425uoM = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
        BizInstrument bizInstrumentValueOf = (interfaceC49425uoM == null || (interfaceC54577xNn = (InterfaceC54577xNn) interfaceC49425uoM.KWHzl(TradeKey.MANAGER)) == null || (interfaceC54581xNrCopydefault = interfaceC54577xNn.copydefault()) == null || (abstractC54531xLwDjBIcL = interfaceC54581xNrCopydefault.djBIcL(str2)) == null) ? null : abstractC54531xLwDjBIcL.valueOf(str);
        if (!(bizInstrumentValueOf instanceof SpotInstrument)) {
            return null;
        }
        SpotInstrument spotInstrument = (SpotInstrument) bizInstrumentValueOf;
        java.lang.String level = spotInstrument.getLevel();
        java.lang.String str3 = C33129mqd.OLrzqt((java.lang.CharSequence) level) ? level : null;
        return str3 == null ? spotInstrument.getCoinLever() : str3;
    }
}
