package o;

import com.okinc.localization.util.format.OKDateEnum;
import com.okinc.tradeapi.framework.constant.TradeKey;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.OptionInstrument;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C35966oKh;
import o.InterfaceC54581xNr;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class pDZ {
    public static final pDZ KWHzl = new pDZ();

    private pDZ() {
    }

    public static /* synthetic */ java.lang.String getTitleByIdAndType$default(pDZ pdz, java.lang.String str, java.lang.String str2, boolean z, boolean z2, android.content.Context context, int i, java.lang.Object obj) {
        boolean z3 = (i & 4) != 0 ? false : z;
        boolean z4 = (i & 8) != 0 ? false : z2;
        if ((i & 16) != 0) {
            context = null;
        }
        return pdz.copydefault(str, str2, z3, z4, context);
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [56=4] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final java.lang.String copydefault(java.lang.String str, java.lang.String str2, boolean z, boolean z2, android.content.Context context) {
        InterfaceC49425uoM interfaceC49425uoM;
        InterfaceC54577xNn interfaceC54577xNn;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        BizInstrument suggestedInstrument$default;
        java.lang.String instFamily;
        java.lang.String strReplaceFirst$default;
        java.lang.String strReplace$default;
        InterfaceC49425uoM interfaceC49425uoM2;
        InterfaceC54577xNn interfaceC54577xNn2;
        InterfaceC54581xNr interfaceC54581xNrCopydefault;
        BizInstrument suggestedInstrument$default2;
        if (!z2 ? str2 == null || (interfaceC49425uoM = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class)) == null || (interfaceC54577xNn = (InterfaceC54577xNn) interfaceC49425uoM.KWHzl(TradeKey.MANAGER)) == null || (interfaceC54581xNrOLrzqt = interfaceC54577xNn.OLrzqt()) == null || (suggestedInstrument$default = InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, str2, str, null, null, 12, null)) == null || (instFamily = suggestedInstrument$default.getInstFamily()) == null : str2 == null || (interfaceC49425uoM2 = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class)) == null || (interfaceC54577xNn2 = (InterfaceC54577xNn) interfaceC49425uoM2.KWHzl(TradeKey.MANAGER)) == null || (interfaceC54581xNrCopydefault = interfaceC54577xNn2.copydefault()) == null || (suggestedInstrument$default2 = InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrCopydefault, str2, str, null, null, 12, null)) == null || (instFamily = suggestedInstrument$default2.getInstFamily()) == null) {
            instFamily = "";
        }
        if (instFamily.length() == 0) {
            instFamily = xVE.copydefault.KWHzl(str == null ? "" : str);
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
                if (context == null && C55296xhK.OLrzqt(context)) {
                    java.lang.String strEZpvd = str != null ? KWHzl.EZpvd(str) : null;
                    return (str != null ? KWHzl.OLrzqt(str) : null) + "/" + strEZpvd;
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
                return listSplit$default.get(0) + listSplit$default.get(1) + "-20" + listSplit$default.get(2) + "-" + listSplit$default.get(3) + "-" + listSplit$default.get(4);
            case 2552066:
                if (!str2.equals("SPOT")) {
                    return "";
                }
                if (context == null) {
                    break;
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
                    strReplaceFirst$default = upperCase + " " + C55734xpY.Companion.copydefault().getResources().getString(C35966oKh.TaskDescription.KWHzl);
                } else {
                    java.lang.String strReplace$default2 = str3 != null ? C59449zhJ.replace$default(str3, "-", "", false, 4, (java.lang.Object) null) : null;
                    strReplaceFirst$default = strReplace$default2 + " " + C55734xpY.Companion.copydefault().getResources().getString(C35966oKh.TaskDescription.KWHzl);
                }
                return strReplaceFirst$default;
            case 214415088:
                return !str2.equals("FUTURES") ? "" : C54799xVt.getTitleByIdAndType$default(C54799xVt.AEQbTJ, str, str2, false, false, 12, null);
            default:
                return "";
        }
    }

    public final java.lang.String AEQbTJ(java.lang.String str, @NotNull java.lang.String str2) {
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

    public final java.lang.String OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        try {
            if (C33129mqd.OLrzqt((java.lang.CharSequence) str) && StringsKt__StringsKt.split$default((java.lang.CharSequence) str, new java.lang.String[]{"-"}, false, 0, 6, (java.lang.Object) null).size() > 1) {
                return (java.lang.String) StringsKt__StringsKt.split$default((java.lang.CharSequence) str, new java.lang.String[]{"-"}, false, 0, 6, (java.lang.Object) null).get(1);
            }
        } catch (java.lang.Exception unused) {
        }
        return "";
    }
}
