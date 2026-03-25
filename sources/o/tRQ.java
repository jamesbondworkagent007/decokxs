package o;

import androidx.camera.video.AudioStats;
import com.okinc.localization.util.format.OKDateEnum;
import com.okinc.planet.serializer.PlanetNumericString;
import com.okinc.unify_trade.biz.BizInstrument;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.tRU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class tRQ {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005f, code lost:
    
        if (r8.equals("FUTURES") == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0069, code lost:
    
        if (r8.equals("SWAP") == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0071, code lost:
    
        if (o.C59449zhJ.gEmmrt(r9, "net", true) == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0077, code lost:
    
        if (o.C59449zhJ.gEmmrt(r10, "buy", true) == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0096, code lost:
    
        if (o.C59449zhJ.gEmmrt(r9, "long", true) == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b6, code lost:
    
        if (r8.equals("SPOT") == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00bf, code lost:
    
        if (r8.equals("OPTION") != false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00c8, code lost:
    
        if (r8.equals("MARGIN") == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00cf, code lost:
    
        if (o.C59449zhJ.gEmmrt(r10, "buy", true) == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:?, code lost:
    
        return new o.tRU.ActionBar(o.C33070mpX.AYXKKw(o.C47501trL.Fragment.DcMfJKDcMfJK), r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:?, code lost:
    
        return new o.tRU.Activity(o.C33070mpX.AYXKKw(o.C47501trL.Fragment.DsL), r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:?, code lost:
    
        return new o.tRU.ActionBar(o.C33070mpX.AYXKKw(o.C47501trL.Fragment.hUfVAv), r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:?, code lost:
    
        return new o.tRU.Activity(o.C33070mpX.AYXKKw(o.C47501trL.Fragment.AxsJAYaxsJAY), r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:?, code lost:
    
        return new o.tRU.ActionBar(o.C33070mpX.AYXKKw(o.C47501trL.Fragment.DcMfJKDcMfJK), r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:?, code lost:
    
        return new o.tRU.Activity(o.C33070mpX.AYXKKw(o.C47501trL.Fragment.DsL), r9);
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final tRU AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
        java.lang.String str4;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        int iHashCode = str2.hashCode();
        if (iHashCode != 108957) {
            if (iHashCode != 3327612) {
                if (iHashCode == 109413500 && str2.equals("short")) {
                    str4 = "sell";
                }
            } else if (str2.equals("long")) {
                str4 = "buy";
            }
            str4 = str2;
        } else {
            if (str2.equals("net")) {
                if (C33129mqd.AEQbTJ(PlanetNumericString.OLrzqt(str3)) > AudioStats.AUDIO_AMPLITUDE_NONE) {
                }
            }
            str4 = str2;
        }
        switch (str.hashCode()) {
            case -2027980370:
                break;
            case -1956807563:
                break;
            case 2552066:
                break;
            case 2558355:
                break;
            case 214415088:
                break;
            default:
                return new tRU.TaskDescription("", str2);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0057, code lost:
    
        if (r6.equals("FUTURES") == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0061, code lost:
    
        if (r6.equals("SWAP") == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0069, code lost:
    
        if (o.C59449zhJ.gEmmrt(r7, "net", true) == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x006f, code lost:
    
        if (o.C59449zhJ.gEmmrt(r8, "buy", true) == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x008e, code lost:
    
        if (o.C59449zhJ.gEmmrt(r7, "long", true) == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ae, code lost:
    
        if (r6.equals("SPOT") == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b7, code lost:
    
        if (r6.equals("OPTION") != false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00c0, code lost:
    
        if (r6.equals("MARGIN") == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00c7, code lost:
    
        if (o.C59449zhJ.gEmmrt(r8, "buy", true) == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:?, code lost:
    
        return new o.tRU.ActionBar(o.C33070mpX.AYXKKw(o.C47501trL.Fragment.DcMfJKDcMfJK), r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:?, code lost:
    
        return new o.tRU.Activity(o.C33070mpX.AYXKKw(o.C47501trL.Fragment.DsL), r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:?, code lost:
    
        return new o.tRU.ActionBar(o.C33070mpX.AYXKKw(o.C47501trL.Fragment.hUfVAv), r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:?, code lost:
    
        return new o.tRU.Activity(o.C33070mpX.AYXKKw(o.C47501trL.Fragment.AxsJAYaxsJAY), r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:?, code lost:
    
        return new o.tRU.ActionBar(o.C33070mpX.AYXKKw(o.C47501trL.Fragment.DcMfJKDcMfJK), r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:?, code lost:
    
        return new o.tRU.Activity(o.C33070mpX.AYXKKw(o.C47501trL.Fragment.DsL), r7);
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final tRU copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
        java.lang.String str4;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        int iHashCode = str2.hashCode();
        if (iHashCode != 108957) {
            if (iHashCode != 3327612) {
                if (iHashCode == 109413500 && str2.equals("short")) {
                    str4 = "sell";
                }
            } else if (str2.equals("long")) {
                str4 = "buy";
            }
            str4 = str2;
        } else {
            if (str2.equals("net")) {
                if (Intrinsics.EZpvd((java.lang.Object) str3, (java.lang.Object) "buy")) {
                }
            }
            str4 = str2;
        }
        switch (str.hashCode()) {
            case -2027980370:
                break;
            case -1956807563:
                break;
            case 2552066:
                break;
            case 2558355:
                break;
            case 214415088:
                break;
            default:
                return new tRU.TaskDescription("", str2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.String KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        xMS xmsGEmmrt;
        C54536xML c54536xMLAYXKKw;
        AbstractC54531xLw abstractC54531xLwOLrzqt2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        C46392tSq c46392tSq = C46392tSq.EZpvd;
        BizInstrument bizInstrumentKWHzl = c46392tSq.KWHzl(str2, str);
        java.lang.String strGEmmrt = null;
        java.lang.String instFamily = bizInstrumentKWHzl != null ? bizInstrumentKWHzl.getInstFamily() : null;
        if (instFamily == null || instFamily.length() == 0) {
            java.lang.String strAEQbTJ = xUW.KWHzl.AEQbTJ(str);
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = c46392tSq.AhwBna().OLrzqt();
            if (interfaceC54581xNrOLrzqt != null && (abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt.OLrzqt(str2)) != null && (xmsGEmmrt = abstractC54531xLwOLrzqt.gEmmrt(strAEQbTJ)) != null && (c54536xMLAYXKKw = xmsGEmmrt.AYXKKw("0")) != null) {
                strGEmmrt = c54536xMLAYXKKw.gEmmrt();
            }
            if (strGEmmrt == null) {
                strGEmmrt = "";
            }
        } else {
            InterfaceC54581xNr interfaceC54581xNrOLrzqt2 = c46392tSq.AhwBna().OLrzqt();
            if (interfaceC54581xNrOLrzqt2 != null && (abstractC54531xLwOLrzqt2 = interfaceC54581xNrOLrzqt2.OLrzqt(str2)) != null) {
                strGEmmrt = abstractC54531xLwOLrzqt2.djBIcL(bizInstrumentKWHzl);
            }
            if (strGEmmrt == null) {
            }
        }
        if (strGEmmrt.length() != 0) {
            return strGEmmrt;
        }
        java.lang.String upperCase = TaskDescription.AEQbTJ(str).AEQbTJ().toUpperCase(java.util.Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "");
        return upperCase;
    }

    public static final java.lang.String EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C46392tSq.EZpvd.KWHzl(copydefault(str));
    }

    /* JADX INFO: renamed from: getCoinTitle-jjRfxO4$default, reason: not valid java name */
    public static /* synthetic */ java.lang.String m8743getCoinTitlejjRfxO4$default(java.lang.String str, java.lang.String str2, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return KWHzl(str, str2, z);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002c, code lost:
    
        if (r12.equals("FUTURES") == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0036, code lost:
    
        if (r12.equals("SWAP") == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004f, code lost:
    
        if (r12.equals("SPOT") == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x014d, code lost:
    
        if (r12.equals("MARGIN") == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:?, code lost:
    
        return o.C54799xVt.getTitleByIdAndType$default(o.C54799xVt.AEQbTJ, r11, r12, r13, false, 8, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:?, code lost:
    
        return o.C54799xVt.getTitleByIdAndType$default(o.C54799xVt.AEQbTJ, r11, r12, false, false, 12, null);
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.String KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, boolean z) {
        java.lang.String strAEQbTJ;
        java.lang.String strCopydefault;
        java.lang.String date$default = "";
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        C46392tSq c46392tSq = C46392tSq.EZpvd;
        BizInstrument bizInstrumentKWHzl = c46392tSq.KWHzl(str2, str);
        if (bizInstrumentKWHzl == null || (strAEQbTJ = bizInstrumentKWHzl.getInstFamily()) == null) {
            strAEQbTJ = xUW.KWHzl.AEQbTJ(str);
        }
        java.lang.String str3 = strAEQbTJ;
        switch (str2.hashCode()) {
            case -2027980370:
                break;
            case -1956807563:
                if (str2.equals("OPTION")) {
                    InterfaceC54581xNr interfaceC54581xNrOLrzqt = c46392tSq.AhwBna().OLrzqt();
                    java.lang.Long lValueOf = null;
                    AbstractC54531xLw abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt != null ? interfaceC54581xNrOLrzqt.OLrzqt(str2) : null;
                    xLJ xlj = abstractC54531xLwOLrzqt instanceof xLJ ? (xLJ) abstractC54531xLwOLrzqt : null;
                    if (xlj != null && (strCopydefault = xlj.copydefault(str)) != null) {
                        lValueOf = java.lang.Long.valueOf(C33129mqd.valueOf(strCopydefault));
                    }
                    if (lValueOf == null || lValueOf.longValue() == 0) {
                        java.util.List listSplit$default = StringsKt__StringsKt.split$default((java.lang.CharSequence) str, new java.lang.String[]{"-"}, false, 0, 6, (java.lang.Object) null);
                        if (listSplit$default.size() == 5) {
                            date$default = "20" + listSplit$default.get(2);
                        }
                    } else {
                        date$default = pTA.formatDate$default(new Date(lValueOf.longValue()), OKDateEnum.DATE_FORMAT_SIMPLE, null, null, 6, null);
                    }
                    if (z) {
                        return C59449zhJ.replace$default(str3, "-", "", false, 4, (java.lang.Object) null) + date$default;
                    }
                    java.util.List listSplit$default2 = StringsKt__StringsKt.split$default((java.lang.CharSequence) str, new java.lang.String[]{"-"}, false, 0, 6, (java.lang.Object) null);
                    if (listSplit$default2.size() == 5) {
                        return listSplit$default2.get(0) + listSplit$default2.get(1) + "-" + date$default + "-" + listSplit$default2.get(3) + "-" + listSplit$default2.get(4);
                    }
                    return C59449zhJ.replaceFirst$default(str, "-", "", false, 4, (java.lang.Object) null);
                }
                java.lang.String strReplace$default = C59449zhJ.replace$default(str, "-", "/", false, 4, (java.lang.Object) null);
                java.util.Locale locale = java.util.Locale.ROOT;
                Intrinsics.checkNotNullExpressionValue(locale, "");
                java.lang.String upperCase = strReplace$default.toUpperCase(locale);
                Intrinsics.checkNotNullExpressionValue(upperCase, "");
                return upperCase;
            case 2552066:
                break;
            case 2558355:
                break;
            case 214415088:
                break;
            default:
                java.lang.String strReplace$default2 = C59449zhJ.replace$default(str, "-", "/", false, 4, (java.lang.Object) null);
                java.util.Locale locale2 = java.util.Locale.ROOT;
                Intrinsics.checkNotNullExpressionValue(locale2, "");
                java.lang.String upperCase2 = strReplace$default2.toUpperCase(locale2);
                Intrinsics.checkNotNullExpressionValue(upperCase2, "");
                return upperCase2;
        }
    }

    public static final java.lang.String copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.util.List listSplit$default = StringsKt__StringsKt.split$default((java.lang.CharSequence) str, new java.lang.String[]{"-"}, false, 0, 6, (java.lang.Object) null);
        return listSplit$default.isEmpty() ^ true ? (java.lang.String) listSplit$default.get(0) : "";
    }
}
