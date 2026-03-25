package o;

import androidx.camera.video.AudioStats;
import com.okinc.localization.util.format.DisplaySign;
import java.math.RoundingMode;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchGroup;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hvw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23319hvw {
    public static final java.util.List<kotlin.Pair<java.lang.Double, java.lang.Integer>> AEQbTJ;
    public static final java.util.List<kotlin.Pair<java.lang.Double, java.lang.Integer>> EZpvd;

    public static final java.lang.String OLrzqt(java.lang.String str) {
        if (str == null || str.length() == 0) {
            return "";
        }
        if (str.length() < 10) {
            return str;
        }
        return C59454zhO.AkhnZx(str, 10) + "...";
    }

    public static /* synthetic */ java.lang.String getNumberICU$default(java.lang.String str, RoundingMode roundingMode, C38307pTy c38307pTy, DisplaySign displaySign, java.util.Locale locale, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            roundingMode = RoundingMode.HALF_UP;
        }
        if ((i & 2) != 0) {
            c38307pTy = C38307pTy.Companion.KWHzl(0, 2);
        }
        if ((i & 4) != 0) {
            displaySign = DisplaySign.AUTO;
        }
        if ((i & 8) != 0) {
            locale = java.util.Locale.getDefault();
        }
        return OLrzqt(str, roundingMode, c38307pTy, displaySign, locale);
    }

    public static final java.lang.String OLrzqt(java.lang.String str, @NotNull RoundingMode roundingMode, @NotNull C38307pTy c38307pTy, @NotNull DisplaySign displaySign, @NotNull java.util.Locale locale) {
        Intrinsics.checkNotNullParameter(roundingMode, "");
        Intrinsics.checkNotNullParameter(c38307pTy, "");
        Intrinsics.checkNotNullParameter(displaySign, "");
        Intrinsics.checkNotNullParameter(locale, "");
        return C33129mqd.OLrzqt((java.lang.CharSequence) str) ? pTB.KWHzl(C33129mqd.EZpvd(str), roundingMode, c38307pTy, displaySign, locale) : "--";
    }

    public static /* synthetic */ java.lang.String getFormattedNumberICU$default(java.lang.String str, RoundingMode roundingMode, C38307pTy c38307pTy, DisplaySign displaySign, java.util.Locale locale, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            roundingMode = RoundingMode.DOWN;
        }
        if ((i & 2) != 0) {
            c38307pTy = C38307pTy.Companion.KWHzl(0, 2);
        }
        C38307pTy c38307pTy2 = c38307pTy;
        if ((i & 4) != 0) {
            displaySign = DisplaySign.AUTO;
        }
        DisplaySign displaySign2 = displaySign;
        if ((i & 8) != 0) {
            locale = java.util.Locale.getDefault();
        }
        java.util.Locale locale2 = locale;
        boolean z3 = (i & 16) == 0 ? z : false;
        if ((i & 32) != 0) {
            z2 = true;
        }
        return EZpvd(str, roundingMode, c38307pTy2, displaySign2, locale2, z3, z2);
    }

    public static final java.lang.String EZpvd(java.lang.String str, @NotNull RoundingMode roundingMode, @NotNull C38307pTy c38307pTy, @NotNull DisplaySign displaySign, @NotNull java.util.Locale locale, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(roundingMode, "");
        Intrinsics.checkNotNullParameter(c38307pTy, "");
        Intrinsics.checkNotNullParameter(displaySign, "");
        Intrinsics.checkNotNullParameter(locale, "");
        if (str != null && StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str)) {
            return "--";
        }
        C23313hvq.OLrzqt(str);
        double dAEQbTJ = C33129mqd.AEQbTJ(str);
        if (KWHzl(java.lang.Double.valueOf(dAEQbTJ))) {
            return z ? "0.00" : "0";
        }
        if (dAEQbTJ >= 1.0E-6d || dAEQbTJ <= -1.0E-6d) {
            return KWHzl(dAEQbTJ, roundingMode, c38307pTy, displaySign, locale);
        }
        if ((1.0E-12d <= dAEQbTJ && dAEQbTJ <= 1.0E-6d) || (-1.0E-6d <= dAEQbTJ && dAEQbTJ <= -1.0E-12d)) {
            return KWHzl(dAEQbTJ, roundingMode, c38307pTy, displaySign, locale, z2);
        }
        if (dAEQbTJ < 1.0E-12d || dAEQbTJ > -1.0E-12d) {
            return "<" + pTB.formatLocalized$default("0.000000000001", null, 1, null);
        }
        return KWHzl(dAEQbTJ, roundingMode, c38307pTy, displaySign, locale);
    }

    public static final boolean KWHzl(java.lang.Object obj) {
        return C23313hvq.copydefault(obj, 0) || C23313hvq.copydefault(obj, java.lang.Double.valueOf(AudioStats.AUDIO_AMPLITUDE_NONE));
    }

    public static final java.lang.String KWHzl(double d, RoundingMode roundingMode, C38307pTy c38307pTy, DisplaySign displaySign, java.util.Locale locale) {
        return EZpvd(pTB.KWHzl(C33129mqd.EZpvd(java.lang.Double.valueOf(d)), roundingMode, c38307pTy, displaySign, locale));
    }

    public static final java.lang.String KWHzl(double d, RoundingMode roundingMode, C38307pTy c38307pTy, DisplaySign displaySign, java.util.Locale locale, boolean z) {
        java.lang.String strKWHzl = pTB.KWHzl(C33129mqd.EZpvd(java.lang.Double.valueOf(d)), roundingMode, c38307pTy, displaySign, locale);
        if (z) {
            int length = strKWHzl.length();
            int i = 0;
            while (true) {
                if (i < length) {
                    char cCharAt = strKWHzl.charAt(i);
                    if (cCharAt != '0' && cCharAt != '.') {
                        break;
                    }
                    i++;
                } else {
                    i = -1;
                    break;
                }
            }
            strKWHzl = C59454zhO.AkhnZx(strKWHzl, i + 2);
        }
        return EZpvd(strKWHzl);
    }

    public static final java.lang.String EZpvd(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return StringsKt__StringsKt.OLrzqt(StringsKt__StringsKt.OLrzqt(new Regex("(\\.\\d*?[1-9]+)(0+)(\\d+)?").replace(str, new Function1() { // from class: o.hvx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C23319hvw.copydefault(str, (MatchResult) obj);
            }
        }), '0'), '.');
    }

    public static final java.lang.CharSequence copydefault(java.lang.String str, MatchResult matchResult) {
        java.lang.String strAEQbTJ;
        Intrinsics.checkNotNullParameter(matchResult, "");
        MatchGroup matchGroupOLrzqt = matchResult.EZpvd().OLrzqt(1);
        return (matchGroupOLrzqt == null || (strAEQbTJ = matchGroupOLrzqt.AEQbTJ()) == null) ? str : strAEQbTJ;
    }

    public static /* synthetic */ int getDecimalDigits$default(java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return OLrzqt(str, z);
    }

    public static final int OLrzqt(@NotNull java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        for (kotlin.Pair<java.lang.Double, java.lang.Integer> pair : z ? EZpvd : AEQbTJ) {
            double dDoubleValue = pair.component1().doubleValue();
            int iIntValue = pair.component2().intValue();
            if (C23313hvq.EZpvd(str, java.lang.Double.valueOf(dDoubleValue))) {
                return iIntValue;
            }
        }
        return 0;
    }

    public static final java.lang.String OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return C23271hvA.getLocalCurrencyWithPrecision$default(C23271hvA.copydefault, C23313hvq.mulCheckS$default(str, str2, null, null, null, 14, null), null, 1, null);
    }

    static {
        java.lang.Double dValueOf = java.lang.Double.valueOf(1.0E-5d);
        kotlin.Pair pair = new kotlin.Pair(dValueOf, 6);
        java.lang.Double dValueOf2 = java.lang.Double.valueOf(1.0E-6d);
        kotlin.Pair pair2 = new kotlin.Pair(dValueOf2, 7);
        java.lang.Double dValueOf3 = java.lang.Double.valueOf(1.0E-7d);
        kotlin.Pair pair3 = new kotlin.Pair(dValueOf3, 8);
        java.lang.Double dValueOf4 = java.lang.Double.valueOf(1.0E-8d);
        kotlin.Pair pair4 = new kotlin.Pair(dValueOf4, 9);
        java.lang.Double dValueOf5 = java.lang.Double.valueOf(1.0E-9d);
        kotlin.Pair pair5 = new kotlin.Pair(dValueOf5, 10);
        java.lang.Double dValueOf6 = java.lang.Double.valueOf(1.0E-10d);
        kotlin.Pair pair6 = new kotlin.Pair(dValueOf6, 11);
        java.lang.Double dValueOf7 = java.lang.Double.valueOf(1.0E-11d);
        kotlin.Pair pair7 = new kotlin.Pair(dValueOf7, 12);
        java.lang.Double dValueOf8 = java.lang.Double.valueOf(1.0E-12d);
        EZpvd = yDY.gEmmrt(pair, pair2, pair3, pair4, pair5, pair6, pair7, new kotlin.Pair(dValueOf8, 13));
        AEQbTJ = yDY.gEmmrt(new kotlin.Pair(java.lang.Double.valueOf(1.0d), 1), new kotlin.Pair(java.lang.Double.valueOf(0.1d), 2), new kotlin.Pair(java.lang.Double.valueOf(0.01d), 3), new kotlin.Pair(java.lang.Double.valueOf(0.001d), 4), new kotlin.Pair(java.lang.Double.valueOf(1.0E-4d), 5), new kotlin.Pair(dValueOf, 6), new kotlin.Pair(dValueOf2, 7), new kotlin.Pair(dValueOf3, 8), new kotlin.Pair(dValueOf4, 9), new kotlin.Pair(dValueOf5, 10), new kotlin.Pair(dValueOf6, 11), new kotlin.Pair(dValueOf7, 12), new kotlin.Pair(dValueOf8, 13));
    }
}
