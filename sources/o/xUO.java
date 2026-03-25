package o;

import com.okinc.localization.util.format.OKDateEnum;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.OptionInstrument;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C55688xof;
import o.InterfaceC54581xNr;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class xUO {
    public static final xUO AEQbTJ = new xUO();

    private xUO() {
    }

    public final BizInstrument copydefault(@NotNull java.lang.String str) {
        BizInstrument bizInstrumentValueOf;
        Intrinsics.checkNotNullParameter(str, "");
        InterfaceC54581xNr interfaceC54581xNrCopydefault = C54589xNz.EZpvd.copydefault();
        BizInstrument bizInstrumentValueOf2 = null;
        AbstractC54531xLw abstractC54531xLwDjBIcL = interfaceC54581xNrCopydefault != null ? interfaceC54581xNrCopydefault.djBIcL("SPOT") : null;
        if (abstractC54531xLwDjBIcL != null) {
            bizInstrumentValueOf = abstractC54531xLwDjBIcL.valueOf(str + "-USDT");
        } else {
            bizInstrumentValueOf = null;
        }
        if (bizInstrumentValueOf != null) {
            return bizInstrumentValueOf;
        }
        if (abstractC54531xLwDjBIcL != null) {
            bizInstrumentValueOf2 = abstractC54531xLwDjBIcL.valueOf(str + "-BTC");
        }
        return bizInstrumentValueOf2;
    }

    public final java.lang.String OLrzqt(java.lang.String str) {
        java.lang.String strReplace$default;
        if (str == null || (strReplace$default = C59449zhJ.replace$default(str, "-", "_", false, 4, (java.lang.Object) null)) == null) {
            return null;
        }
        java.util.Locale locale = java.util.Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(locale, "");
        java.lang.String lowerCase = strReplace$default.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        return lowerCase;
    }

    public static /* synthetic */ java.lang.String getBizInfoFormatName$default(xUO xuo, android.content.Context context, java.lang.String str, java.lang.String str2, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 16) != 0) {
            z2 = false;
        }
        return xuo.copydefault(context, str, str2, z, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [43=4] */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final java.lang.String copydefault(@NotNull android.content.Context context, java.lang.String str, @NotNull java.lang.String str2, boolean z, boolean z2) {
        java.lang.String strReplaceFirst$default;
        java.lang.String strReplace$default;
        java.lang.String upperCase;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5 = "";
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str2, "");
        InterfaceC54581xNr interfaceC54581xNrCopydefault = C54589xNz.EZpvd.copydefault();
        BizInstrument minSuggestedInstrument$default = interfaceC54581xNrCopydefault != null ? InterfaceC54581xNr.TaskDescription.getMinSuggestedInstrument$default(interfaceC54581xNrCopydefault, str2, str, null, null, 12, null) : null;
        java.lang.String instType = minSuggestedInstrument$default != null ? minSuggestedInstrument$default.getInstType() : null;
        if (instType != null) {
            switch (instType.hashCode()) {
                case -2027980370:
                    if (!instType.equals("MARGIN")) {
                        return "";
                    }
                    if (str == null && (strReplace$default = C59449zhJ.replace$default(str, "-", "/", false, 4, (java.lang.Object) null)) != null) {
                        java.util.Locale locale = java.util.Locale.ROOT;
                        Intrinsics.checkNotNullExpressionValue(locale, "");
                        upperCase = strReplace$default.toUpperCase(locale);
                        Intrinsics.checkNotNullExpressionValue(upperCase, "");
                        if (upperCase == null) {
                            return "";
                        }
                        return upperCase;
                    }
                case -1956807563:
                    if (instType.equals("OPTION")) {
                        Intrinsics.copydefault(minSuggestedInstrument$default, "");
                        OptionInstrument optionInstrument = (OptionInstrument) minSuggestedInstrument$default;
                        java.lang.String strCopydefault = copydefault(optionInstrument);
                        if (z) {
                            return C59449zhJ.replace$default(optionInstrument.getInstFamily(), "-", "", false, 4, (java.lang.Object) null) + strCopydefault;
                        }
                        java.util.List listSplit$default = str != null ? StringsKt__StringsKt.split$default((java.lang.CharSequence) str, new java.lang.String[]{"-"}, false, 0, 6, (java.lang.Object) null) : null;
                        if (listSplit$default == null || listSplit$default.size() != 5) {
                            return (str == null || (strReplaceFirst$default = C59449zhJ.replaceFirst$default(str, "-", "", false, 4, (java.lang.Object) null)) == null) ? "" : strReplaceFirst$default;
                        }
                        return listSplit$default.get(0) + listSplit$default.get(1) + "-" + strCopydefault + "-" + listSplit$default.get(3) + "-" + listSplit$default.get(4);
                    }
                    break;
                case 2552066:
                    if (instType.equals("SPOT")) {
                        return str == null ? "" : "";
                    }
                    break;
                case 2558355:
                    if (instType.equals("SWAP")) {
                        java.util.List listSplit$default2 = StringsKt__StringsKt.split$default((java.lang.CharSequence) minSuggestedInstrument$default.getInstFamily(), new java.lang.String[]{"-"}, false, 0, 6, (java.lang.Object) null);
                        if (!C33129mqd.KWHzl((java.util.Collection) listSplit$default2) || (str3 = (java.lang.String) listSplit$default2.get(0)) == null) {
                            str3 = "";
                        }
                        if (C33129mqd.KWHzl((java.util.Collection) listSplit$default2) && listSplit$default2.size() > 1 && (str4 = (java.lang.String) listSplit$default2.get(1)) != null) {
                            str5 = str4;
                        }
                        upperCase = str3 + str5 + " " + context.getResources().getString(C55688xof.Application.QSAYLr);
                        return upperCase;
                    }
                    break;
                case 214415088:
                    if (instType.equals("FUTURES")) {
                        xVE.copydefault.OLrzqt(minSuggestedInstrument$default.getInstId());
                    }
                    break;
            }
        }
        return "";
    }

    public final java.lang.String copydefault(@NotNull OptionInstrument optionInstrument) {
        Intrinsics.checkNotNullParameter(optionInstrument, "");
        long j = java.lang.Long.parseLong(optionInstrument.getExpTime());
        if (j == 0) {
            java.util.List listSplit$default = StringsKt__StringsKt.split$default((java.lang.CharSequence) optionInstrument.getInstId(), new java.lang.String[]{"-"}, false, 0, 6, (java.lang.Object) null);
            if (listSplit$default.size() != 5) {
                return "";
            }
            return "20" + listSplit$default.get(2);
        }
        return pTA.formatDate$default(new Date(j), OKDateEnum.DATE_FORMAT_SIMPLE, null, null, 6, null);
    }
}
