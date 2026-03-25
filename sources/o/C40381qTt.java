package o;

import com.okinc.localization.util.format.OKDateEnum;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.OptionInstrument;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C35966oKh;
import o.InterfaceC54581xNr;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qTt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C40381qTt {
    public static final C40381qTt copydefault = new C40381qTt();

    private C40381qTt() {
    }

    public static /* synthetic */ java.lang.String getTitleFromNewInfo$default(C40381qTt c40381qTt, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            z = false;
        }
        return c40381qTt.KWHzl(str, str2, str3, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [45=4] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final java.lang.String KWHzl(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z) {
        java.lang.String strReplaceFirst$default;
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
                    strReplaceFirst$default = strReplace$default.toUpperCase(locale);
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
                if (!str2.equals("SWAP")) {
                    return "";
                }
                if (z) {
                    java.lang.String strCopydefault = TaskDescription.AEQbTJ(str3).copydefault();
                    java.util.Locale locale2 = java.util.Locale.getDefault();
                    Intrinsics.checkNotNullExpressionValue(locale2, "");
                    java.lang.String upperCase = strCopydefault.toUpperCase(locale2);
                    Intrinsics.checkNotNullExpressionValue(upperCase, "");
                    strReplaceFirst$default = upperCase + C33070mpX.AYXKKw(qZH.PendingIntent.dvKsVJ);
                } else {
                    java.lang.String strReplace$default2 = str3 != null ? C59449zhJ.replace$default(str3, "-", "", false, 4, (java.lang.Object) null) : null;
                    strReplaceFirst$default = strReplace$default2 + " " + C33070mpX.AYXKKw(qZH.PendingIntent.dvKsVJ);
                }
                return strReplaceFirst$default;
            case 214415088:
                return !str2.equals("FUTURES") ? "" : getTitleByIdAndType$default(this, str, str2, false, false, false, 28, null);
            default:
                return "";
        }
    }

    public static /* synthetic */ java.lang.String setHqFutureText$default(C40381qTt c40381qTt, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            z = false;
        }
        return c40381qTt.EZpvd(str, str2, str3, z, z2);
    }

    public final java.lang.String EZpvd(java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3, boolean z, boolean z2) {
        java.lang.String strCopydefault;
        Intrinsics.checkNotNullParameter(str2, "");
        if (z2) {
            strCopydefault = copydefault(str);
            if (strCopydefault == null) {
                strCopydefault = "";
            }
        } else {
            strCopydefault = getTitleByIdAndType$default(this, str, str2, false, false, false, 28, null);
        }
        return z ? strCopydefault : "";
    }

    public final java.lang.String copydefault(java.lang.String str) {
        AbstractC54531xLw abstractC54531xLwKWHzl;
        BizInstrument bizInstrumentValueOf;
        java.lang.String instFamily;
        java.lang.String strReplace$default;
        if (str == null || (abstractC54531xLwKWHzl = xUD.KWHzl("FUTURES")) == null || (bizInstrumentValueOf = abstractC54531xLwKWHzl.valueOf(str)) == null || (instFamily = bizInstrumentValueOf.getInstFamily()) == null || (strReplace$default = C59449zhJ.replace$default(instFamily, "-", "", false, 4, (java.lang.Object) null)) == null) {
            return null;
        }
        return C33069mpW.copydefault(C35966oKh.TaskDescription.gEmmrt, C56423yEv.EZpvd(C56390yDp.OLrzqt("uly", strReplace$default)));
    }

    public final java.lang.String copydefault(java.lang.String str, @NotNull java.lang.String str2, boolean z, boolean z2, boolean z3) {
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        BizInstrument suggestedInstrument$default;
        java.lang.String instFamily;
        java.lang.String strCopydefault;
        InterfaceC54581xNr interfaceC54581xNrCopydefault;
        BizInstrument suggestedInstrument$default2;
        Intrinsics.checkNotNullParameter(str2, "");
        if (!z ? (interfaceC54581xNrOLrzqt = pWO.KWHzl().OLrzqt()) == null || (suggestedInstrument$default = InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, str2, str, null, null, 12, null)) == null || (instFamily = suggestedInstrument$default.getInstFamily()) == null : (interfaceC54581xNrCopydefault = pWO.KWHzl().copydefault()) == null || (suggestedInstrument$default2 = InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrCopydefault, str2, str, null, null, 12, null)) == null || (instFamily = suggestedInstrument$default2.getInstFamily()) == null) {
            instFamily = "";
        }
        if (instFamily.length() == 0) {
            xVE.copydefault.KWHzl(str == null ? "" : str);
        }
        if (z3) {
            strCopydefault = copydefault(str);
            if (strCopydefault == null) {
                strCopydefault = "";
            }
        } else {
            strCopydefault = java.lang.String.valueOf(str != null ? C54799xVt.getTitleByIdAndType$default(C54799xVt.AEQbTJ, str, str2, false, false, 12, null) : null);
        }
        return z2 ? strCopydefault : "";
    }

    public static /* synthetic */ java.lang.String getTitleByIdAndType$default(C40381qTt c40381qTt, java.lang.String str, java.lang.String str2, boolean z, boolean z2, boolean z3, int i, java.lang.Object obj) {
        boolean z4 = (i & 4) != 0 ? false : z;
        boolean z5 = (i & 8) != 0 ? false : z2;
        if ((i & 16) != 0) {
            z3 = true;
        }
        return c40381qTt.KWHzl(str, str2, z4, z5, z3);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.xUD.getWatchMarketInstrument$default(java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, int, java.lang.Object):com.okinc.unify_trade.biz.BizInstrument */
    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [198=4] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x016f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.String KWHzl(java.lang.String str, java.lang.String str2, boolean z, boolean z2, boolean z3) {
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        BizInstrument suggestedInstrument$default;
        java.lang.String instFamily;
        java.lang.String strReplaceFirst$default;
        InterfaceC54581xNr interfaceC54581xNrCopydefault;
        BizInstrument watchMarketInstrument$default;
        InterfaceC54581xNr interfaceC54581xNrCopydefault2;
        BizInstrument suggestedInstrument$default2;
        if (str == null || str.length() == 0 || str2 == null || str2.length() == 0) {
            return "";
        }
        if (!z2 ? (interfaceC54581xNrOLrzqt = pWO.KWHzl().OLrzqt()) == null || (suggestedInstrument$default = InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, str2, str, null, null, 12, null)) == null || (instFamily = suggestedInstrument$default.getInstFamily()) == null : (interfaceC54581xNrCopydefault2 = pWO.KWHzl().copydefault()) == null || (suggestedInstrument$default2 = InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrCopydefault2, str2, str, null, null, 12, null)) == null || (instFamily = suggestedInstrument$default2.getInstFamily()) == null) {
            instFamily = "";
        }
        if (instFamily.length() == 0) {
            instFamily = xVE.copydefault.KWHzl(str);
        }
        java.lang.String str3 = instFamily;
        if (str2 == null) {
            return "";
        }
        switch (str2.hashCode()) {
            case -2027980370:
                if (!str2.equals("MARGIN")) {
                    return "";
                }
                interfaceC54581xNrCopydefault = pWO.KWHzl().copydefault();
                if (interfaceC54581xNrCopydefault != null || (watchMarketInstrument$default = InterfaceC54581xNr.TaskDescription.getMinSuggestedInstrument$default(interfaceC54581xNrCopydefault, str2, str, null, null, 12, null)) == null) {
                    watchMarketInstrument$default = xUD.getWatchMarketInstrument$default(str2, str, null, null, false, 28, null);
                }
                if (watchMarketInstrument$default != null || (strReplaceFirst$default = C54799xVt.AEQbTJ.OLrzqt(watchMarketInstrument$default)) == null) {
                    strReplaceFirst$default = C54799xVt.getTitleByIdAndType$default(C54799xVt.AEQbTJ, str, str2, false, false, 12, null);
                }
                return strReplaceFirst$default;
            case -1956807563:
                if (!str2.equals("OPTION")) {
                    return "";
                }
                java.lang.String strCopydefault = copydefault(str, str2);
                if (z) {
                    strReplaceFirst$default = C59449zhJ.replace$default(str3, "-", "", false, 4, (java.lang.Object) null) + strCopydefault;
                } else {
                    java.util.List listSplit$default = StringsKt__StringsKt.split$default((java.lang.CharSequence) str, new java.lang.String[]{"-"}, false, 0, 6, (java.lang.Object) null);
                    if (listSplit$default.size() == 5) {
                        return listSplit$default.get(0) + listSplit$default.get(1) + "-" + strCopydefault + "-" + listSplit$default.get(3) + "-" + listSplit$default.get(4);
                    }
                    strReplaceFirst$default = C59449zhJ.replaceFirst$default(str, "-", "", false, 4, (java.lang.Object) null);
                }
                return strReplaceFirst$default;
            case 2552066:
                if (!str2.equals("SPOT")) {
                    return "";
                }
                interfaceC54581xNrCopydefault = pWO.KWHzl().copydefault();
                if (interfaceC54581xNrCopydefault != null) {
                    watchMarketInstrument$default = xUD.getWatchMarketInstrument$default(str2, str, null, null, false, 28, null);
                    if (watchMarketInstrument$default != null) {
                        strReplaceFirst$default = C54799xVt.getTitleByIdAndType$default(C54799xVt.AEQbTJ, str, str2, false, false, 12, null);
                    }
                }
                return strReplaceFirst$default;
            case 2558355:
                return !str2.equals("SWAP") ? "" : C54799xVt.getTitleByIdAndType$default(C54799xVt.AEQbTJ, str, str2, z, false, null, z3, null, 88, null);
            case 214415088:
                return !str2.equals("FUTURES") ? "" : C54799xVt.getTitleByIdAndType$default(C54799xVt.AEQbTJ, str, str2, false, false, 12, null);
            default:
                return "";
        }
    }

    public static /* synthetic */ java.lang.String getTitleByIdAndType$default(C40381qTt c40381qTt, BizInstrument bizInstrument, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return c40381qTt.KWHzl(bizInstrument, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [245=4] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final java.lang.String KWHzl(@NotNull BizInstrument bizInstrument, boolean z) {
        java.lang.String strOLrzqt = "";
        Intrinsics.checkNotNullParameter(bizInstrument, "");
        java.lang.String instId = bizInstrument.getInstId();
        java.lang.String instType = bizInstrument.getInstType();
        java.lang.String instFamily = bizInstrument.getInstFamily();
        if (instFamily.length() == 0) {
            instFamily = xVE.copydefault.KWHzl(bizInstrument.getInstId());
        }
        java.lang.String str = instFamily;
        java.lang.String instType2 = bizInstrument.getInstType();
        switch (instType2.hashCode()) {
            case -2027980370:
                if (!instType2.equals("MARGIN")) {
                    return "";
                }
                return C54799xVt.AEQbTJ.OLrzqt(bizInstrument);
            case -1956807563:
                if (instType2.equals("OPTION")) {
                    java.lang.String strCopydefault = copydefault(instId, instType);
                    if (z) {
                        return C59449zhJ.replace$default(str, "-", "", false, 4, (java.lang.Object) null) + strCopydefault;
                    }
                    java.util.List listSplit$default = StringsKt__StringsKt.split$default((java.lang.CharSequence) instId, new java.lang.String[]{"-"}, false, 0, 6, (java.lang.Object) null);
                    if (listSplit$default.size() != 5) {
                        return C59449zhJ.replaceFirst$default(instId, "-", "", false, 4, (java.lang.Object) null);
                    }
                    return listSplit$default.get(0) + listSplit$default.get(1) + "-" + strCopydefault + "-" + listSplit$default.get(3) + "-" + listSplit$default.get(4);
                }
                break;
            case 2552066:
                if (instType2.equals("SPOT")) {
                    return C54799xVt.AEQbTJ.OLrzqt(bizInstrument);
                }
                break;
            case 2558355:
                if (instType2.equals("SWAP")) {
                    strOLrzqt = C54799xVt.AEQbTJ.OLrzqt(bizInstrument);
                }
                break;
            case 214415088:
                if (instType2.equals("FUTURES")) {
                    strOLrzqt = C54799xVt.AEQbTJ.OLrzqt(bizInstrument);
                }
                break;
        }
        return strOLrzqt;
    }

    public final java.lang.String AEQbTJ(java.lang.String str, @NotNull java.lang.String str2) {
        java.lang.String expTime;
        Intrinsics.checkNotNullParameter(str2, "");
        InterfaceC54581xNr interfaceC54581xNrCopydefault = pWO.KWHzl().copydefault();
        BizInstrument minSuggestedInstrument$default = interfaceC54581xNrCopydefault != null ? InterfaceC54581xNr.TaskDescription.getMinSuggestedInstrument$default(interfaceC54581xNrCopydefault, str2, str, null, null, 12, null) : null;
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

    public final java.lang.String copydefault(java.lang.String str, @NotNull java.lang.String str2) {
        java.lang.String expTime;
        Intrinsics.checkNotNullParameter(str2, "");
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = pWO.KWHzl().OLrzqt();
        BizInstrument suggestedInstrument$default = interfaceC54581xNrOLrzqt != null ? InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, str2, str, null, null, 12, null) : null;
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
}
