package o;

import com.okinc.planet.format.TextColor;
import com.okinc.planet.serializer.PlanetNumericString;
import com.okinc.unify_trade.biz.BizInstrument;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C52761wXj;
import o.InterfaceC54581xNr;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class tRP {
    /* JADX INFO: renamed from: formatPNL-XGakEKM$default, reason: not valid java name */
    public static /* synthetic */ kotlin.Pair m8737formatPNLXGakEKM$default(java.lang.Number number, java.lang.String str, java.lang.String str2, boolean z, boolean z2, int i, java.lang.String str3, int i2, java.lang.Object obj) {
        if ((i2 & 4) != 0) {
            z = true;
        }
        boolean z3 = z;
        if ((i2 & 8) != 0) {
            z2 = false;
        }
        boolean z4 = z2;
        if ((i2 & 16) != 0) {
            i = C52761wXj.Activity.fdOvFl;
        }
        int i3 = i;
        if ((i2 & 32) != 0) {
            str3 = null;
        }
        return AEQbTJ(number, str, str2, z3, z4, i3, str3);
    }

    public static final kotlin.Pair<java.lang.String, java.lang.Integer> AEQbTJ(@NotNull java.lang.Number number, @NotNull java.lang.String str, @NotNull java.lang.String str2, boolean z, boolean z2, @androidx.annotation.ColorRes int i, java.lang.String str3) {
        Intrinsics.checkNotNullParameter(number, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        kotlin.Pair<java.lang.String, TextColor> pairOLrzqt = OLrzqt(EZpvd(str2, str, str3), number, z2, z);
        return C56390yDp.OLrzqt(pairOLrzqt.component1(), java.lang.Integer.valueOf(pairOLrzqt.component2().color(i)));
    }

    /* JADX INFO: renamed from: formatPNL-9YYFDSw$default, reason: not valid java name */
    public static /* synthetic */ kotlin.Pair m8736formatPNL9YYFDSw$default(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, boolean z2, int i, java.lang.String str4, int i2, java.lang.Object obj) {
        if ((i2 & 4) != 0) {
            z = false;
        }
        boolean z3 = z;
        if ((i2 & 8) != 0) {
            z2 = true;
        }
        boolean z4 = z2;
        if ((i2 & 16) != 0) {
            i = C52761wXj.Activity.fdOvFl;
        }
        int i3 = i;
        if ((i2 & 32) != 0) {
            str4 = null;
        }
        return EZpvd(str, str2, str3, z3, z4, i3, str4);
    }

    public static final kotlin.Pair<java.lang.String, java.lang.Integer> EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, boolean z, boolean z2, @androidx.annotation.ColorRes int i, java.lang.String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return AEQbTJ(C33129mqd.EZpvd(PlanetNumericString.OLrzqt(str)), str2, str3, z2, z, i, str4);
    }

    /* JADX INFO: renamed from: formatPNLPlain-qX7pWv0$default, reason: not valid java name */
    public static /* synthetic */ java.lang.String m8741formatPNLPlainqX7pWv0$default(java.lang.Number number, java.lang.String str, java.lang.String str2, boolean z, boolean z2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        boolean z3 = z;
        if ((i & 8) != 0) {
            z2 = true;
        }
        boolean z4 = z2;
        if ((i & 16) != 0) {
            str3 = null;
        }
        return EZpvd(number, str, str2, z3, z4, str3);
    }

    public static final java.lang.String EZpvd(@NotNull java.lang.Number number, @NotNull java.lang.String str, @NotNull java.lang.String str2, boolean z, boolean z2, java.lang.String str3) {
        Intrinsics.checkNotNullParameter(number, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return OLrzqt(EZpvd(str2, str, str3), number, z, z2).getFirst();
    }

    /* JADX INFO: renamed from: formatPNLPlain-bKhnqJI$default, reason: not valid java name */
    public static /* synthetic */ java.lang.String m8740formatPNLPlainbKhnqJI$default(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, boolean z2, java.lang.String str4, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        boolean z3 = z;
        if ((i & 8) != 0) {
            z2 = true;
        }
        boolean z4 = z2;
        if ((i & 16) != 0) {
            str4 = null;
        }
        return copydefault(str, str2, str3, z3, z4, str4);
    }

    public static final java.lang.String copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, boolean z, boolean z2, java.lang.String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return EZpvd(C33129mqd.EZpvd(PlanetNumericString.OLrzqt(str)), str2, str3, z, z2, str4);
    }

    /* JADX INFO: renamed from: formatPNL-eLEVFN8$default, reason: not valid java name */
    public static /* synthetic */ kotlin.Pair m8738formatPNLeLEVFN8$default(xMV xmv, java.lang.String str, boolean z, boolean z2, int i, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            z = true;
        }
        if ((i2 & 4) != 0) {
            z2 = false;
        }
        if ((i2 & 8) != 0) {
            i = C52761wXj.Activity.fdOvFl;
        }
        return KWHzl(xmv, str, z, z2, i);
    }

    public static final kotlin.Pair<java.lang.String, java.lang.Integer> KWHzl(xMV xmv, @NotNull java.lang.String str, boolean z, boolean z2, @androidx.annotation.ColorRes int i) {
        Intrinsics.checkNotNullParameter(str, "");
        return KWHzl(xmv, C33129mqd.EZpvd(PlanetNumericString.OLrzqt(str)), z, z2, i);
    }

    public static /* synthetic */ kotlin.Pair formatPNL$default(xMV xmv, java.lang.Number number, boolean z, boolean z2, int i, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            z = true;
        }
        if ((i2 & 4) != 0) {
            z2 = false;
        }
        if ((i2 & 8) != 0) {
            i = C52761wXj.Activity.fdOvFl;
        }
        return KWHzl(xmv, number, z, z2, i);
    }

    public static final kotlin.Pair<java.lang.String, java.lang.Integer> KWHzl(xMV xmv, @NotNull java.lang.Number number, boolean z, boolean z2, @androidx.annotation.ColorRes int i) {
        Intrinsics.checkNotNullParameter(number, "");
        kotlin.Pair<java.lang.String, TextColor> pairOLrzqt = OLrzqt(xmv, number, z2, z);
        return C56390yDp.OLrzqt(pairOLrzqt.getFirst(), java.lang.Integer.valueOf(pairOLrzqt.getSecond().color(i)));
    }

    /* JADX INFO: renamed from: formatPNLPlain-P8q7UIc$default, reason: not valid java name */
    public static /* synthetic */ java.lang.String m8739formatPNLPlainP8q7UIc$default(xMV xmv, java.lang.String str, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        return copydefault(xmv, str, z, z2);
    }

    public static final java.lang.String copydefault(xMV xmv, @NotNull java.lang.String str, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        return OLrzqt(xmv, C33129mqd.EZpvd(PlanetNumericString.OLrzqt(str)), z2, z).getFirst();
    }

    public static /* synthetic */ java.lang.String formatPNLPlain$default(xMV xmv, java.lang.Number number, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return copydefault(xmv, number, z);
    }

    public static final java.lang.String copydefault(xMV xmv, @NotNull java.lang.Number number, boolean z) {
        Intrinsics.checkNotNullParameter(number, "");
        return OLrzqt(xmv, number, false, z).getFirst();
    }

    public static final java.lang.String OLrzqt(xMV xmv) {
        java.lang.String strEZpvd = xmv != null ? xmv.EZpvd() : null;
        return strEZpvd == null ? "" : strEZpvd;
    }

    /* JADX INFO: renamed from: getPNLConverter-4MWxQ20$default, reason: not valid java name */
    public static /* synthetic */ xMV m8742getPNLConverter4MWxQ20$default(java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str3 = null;
        }
        return EZpvd(str, str2, str3);
    }

    public static final xMV EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        InterfaceC54581xNr interfaceC54581xNrEZpvd = C46392tSq.EZpvd.EZpvd();
        if (interfaceC54581xNrEZpvd == null) {
            return null;
        }
        BizInstrument suggestedInstrument$default = InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrEZpvd, str2, str, null, null, 12, null);
        java.lang.String instFamily = suggestedInstrument$default != null ? suggestedInstrument$default.getInstFamily() : null;
        if (instFamily == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) instFamily)) {
            instFamily = xUW.KWHzl.AEQbTJ(str);
        }
        AbstractC54531xLw abstractC54531xLwOLrzqt = interfaceC54581xNrEZpvd.OLrzqt(str2);
        if (abstractC54531xLwOLrzqt != null) {
            xMV xmvAEQbTJ = abstractC54531xLwOLrzqt.AEQbTJ(instFamily, str3 == null ? null : str3);
            if (xmvAEQbTJ != null) {
                if (xmvAEQbTJ.copydefault().length() == 0) {
                    if (str3 == null) {
                        str3 = null;
                    }
                    java.lang.String upperCase = TaskDescription.AEQbTJ(str).AEQbTJ().toUpperCase(java.util.Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(upperCase, "");
                    if (str3 == null || str3.length() == 0 || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str3)) {
                        str3 = upperCase;
                    }
                    xmvAEQbTJ.KWHzl(str3, "2");
                }
                return xmvAEQbTJ;
            }
        }
        return null;
    }

    public static final kotlin.Pair<java.lang.String, TextColor> OLrzqt(xMV xmv, java.lang.Number number, boolean z, boolean z2) {
        C54536xML c54536xMLOLrzqt;
        if (xmv != null) {
            java.lang.String plainString = number instanceof BigDecimal ? ((BigDecimal) number).toPlainString() : C33129mqd.gEmmrt(number);
            Intrinsics.copydefault((java.lang.Object) plainString);
            c54536xMLOLrzqt = xmv.OLrzqt(plainString);
        } else {
            c54536xMLOLrzqt = null;
        }
        if (c54536xMLOLrzqt == null || xmv == null) {
            return C56390yDp.OLrzqt(pTB.formatICUNumber$default(number, null, C38307pTy.Companion.EZpvd(2), C46367tRs.AEQbTJ(z2), null, 9, null), TextColor.Companion.AEQbTJ(C33129mqd.EZpvd(C33129mqd.formatS$default(C33129mqd.EZpvd(number).setScale(2, RoundingMode.DOWN), null, null, null, 7, null))));
        }
        int iAhwBna = C33129mqd.AhwBna(xmv.copydefault());
        java.lang.String safeString$default = C54536xML.toSafeString$default(c54536xMLOLrzqt.AEQbTJ(true).copydefault(), false, 1, null);
        TextColor textColorAEQbTJ = TextColor.Companion.AEQbTJ(C33129mqd.EZpvd(safeString$default));
        java.lang.String iCUNumber$default = pTB.formatICUNumber$default(C33129mqd.EZpvd(safeString$default), null, C38307pTy.Companion.KWHzl(iAhwBna, 100), C46367tRs.AEQbTJ(z2), null, 9, null);
        if (z) {
            iCUNumber$default = C46367tRs.AEQbTJ(iCUNumber$default, xmv.EZpvd());
        }
        return C56390yDp.OLrzqt(iCUNumber$default, textColorAEQbTJ);
    }
}
