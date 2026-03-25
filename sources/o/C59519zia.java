package o;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlin.time.DurationUnit;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.C59462zhW;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Marker;

/* JADX INFO: renamed from: o.zia, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C59519zia {
    public static final long DbNXlk(long j) {
        return j * ((long) 1000000);
    }

    public static final long EZpvd(int i, @NotNull DurationUnit durationUnit) {
        Intrinsics.checkNotNullParameter(durationUnit, "");
        if (durationUnit.compareTo(DurationUnit.SECONDS) <= 0) {
            return AhwBna(C59465zhZ.OLrzqt(i, durationUnit, DurationUnit.NANOSECONDS));
        }
        return AEQbTJ(i, durationUnit);
    }

    public static final long AEQbTJ(long j, @NotNull DurationUnit durationUnit) {
        Intrinsics.checkNotNullParameter(durationUnit, "");
        DurationUnit durationUnit2 = DurationUnit.NANOSECONDS;
        long jOLrzqt = C59465zhZ.OLrzqt(4611686018426999999L, durationUnit2, durationUnit);
        if ((-jOLrzqt) <= j && j <= jOLrzqt) {
            return AhwBna(C59465zhZ.OLrzqt(j, durationUnit, durationUnit2));
        }
        return AYXKKw(C56548yJl.copydefault(C59465zhZ.AEQbTJ(j, durationUnit, DurationUnit.MILLISECONDS), -4611686018427387903L, 4611686018427387903L));
    }

    public static final long OLrzqt(double d, @NotNull DurationUnit durationUnit) {
        Intrinsics.checkNotNullParameter(durationUnit, "");
        double dAEQbTJ = C59465zhZ.AEQbTJ(d, durationUnit, DurationUnit.NANOSECONDS);
        if (!(!java.lang.Double.isNaN(dAEQbTJ))) {
            throw new java.lang.IllegalArgumentException("Duration value cannot be NaN.".toString());
        }
        long jCopydefault = yII.copydefault(dAEQbTJ);
        if (-4611686018426999999L <= jCopydefault && jCopydefault < 4611686018427000000L) {
            return AhwBna(jCopydefault);
        }
        return valueOf(yII.copydefault(C59465zhZ.AEQbTJ(d, durationUnit, DurationUnit.MILLISECONDS)));
    }

    public static final long KWHzl(java.lang.String str, boolean z) {
        boolean z2;
        long jCopydefault;
        char cCharAt;
        char cCharAt2;
        java.lang.String str2;
        long jCopydefault2;
        char cCharAt3;
        int length = str.length();
        if (length == 0) {
            throw new java.lang.IllegalArgumentException("The string is empty");
        }
        C59462zhW.Activity activity = C59462zhW.OLrzqt;
        long jKWHzl = activity.KWHzl();
        char cCharAt4 = str.charAt(0);
        int length2 = (cCharAt4 == '+' || cCharAt4 == '-') ? 1 : 0;
        boolean z3 = length2 > 0;
        boolean z4 = z3 && StringsKt__StringsKt.startsWith$default((java.lang.CharSequence) str, '-', false, 2, (java.lang.Object) null);
        if (length <= length2) {
            throw new java.lang.IllegalArgumentException("No components");
        }
        char cCharAt5 = str.charAt(length2);
        char c = AbstractJsonLexerKt.COLON;
        char c2 = '0';
        java.lang.String str3 = "Unexpected order of duration components";
        if (cCharAt5 == 'P') {
            int i = length2 + 1;
            if (i == length) {
                throw new java.lang.IllegalArgumentException();
            }
            boolean z5 = false;
            DurationUnit durationUnit = null;
            while (i < length) {
                if (str.charAt(i) != 'T') {
                    int i2 = i;
                    while (i2 < str.length() && ((c2 <= (cCharAt3 = str.charAt(i2)) && cCharAt3 < c) || StringsKt__StringsKt.contains$default((java.lang.CharSequence) "+-.", cCharAt3, false, 2, (java.lang.Object) null))) {
                        i2++;
                        c2 = '0';
                        c = AbstractJsonLexerKt.COLON;
                    }
                    Intrinsics.copydefault(str, "");
                    java.lang.String strSubstring = str.substring(i, i2);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                    if (strSubstring.length() == 0) {
                        throw new java.lang.IllegalArgumentException();
                    }
                    int length3 = i + strSubstring.length();
                    if (length3 < 0 || length3 >= str.length()) {
                        throw new java.lang.IllegalArgumentException("Missing unit for value " + strSubstring);
                    }
                    char cCharAt6 = str.charAt(length3);
                    i = length3 + 1;
                    DurationUnit durationUnitOLrzqt = C59464zhY.OLrzqt(cCharAt6, z5);
                    if (durationUnit != null && durationUnit.compareTo(durationUnitOLrzqt) <= 0) {
                        throw new java.lang.IllegalArgumentException(str3);
                    }
                    int iIndexOf$default = StringsKt__StringsKt.indexOf$default((java.lang.CharSequence) strSubstring, '.', 0, false, 6, (java.lang.Object) null);
                    if (durationUnitOLrzqt == DurationUnit.SECONDS && iIndexOf$default > 0) {
                        Intrinsics.copydefault(strSubstring, "");
                        java.lang.String strSubstring2 = strSubstring.substring(0, iIndexOf$default);
                        Intrinsics.checkNotNullExpressionValue(strSubstring2, "");
                        str2 = str3;
                        long jCopydefault3 = C59462zhW.copydefault(jKWHzl, AEQbTJ(KWHzl(strSubstring2), durationUnitOLrzqt));
                        Intrinsics.copydefault(strSubstring, "");
                        java.lang.String strSubstring3 = strSubstring.substring(iIndexOf$default);
                        Intrinsics.checkNotNullExpressionValue(strSubstring3, "");
                        jCopydefault2 = C59462zhW.copydefault(jCopydefault3, OLrzqt(java.lang.Double.parseDouble(strSubstring3), durationUnitOLrzqt));
                    } else {
                        str2 = str3;
                        jCopydefault2 = C59462zhW.copydefault(jKWHzl, AEQbTJ(KWHzl(strSubstring), durationUnitOLrzqt));
                    }
                    jKWHzl = jCopydefault2;
                    durationUnit = durationUnitOLrzqt;
                    str3 = str2;
                    c2 = '0';
                    c = AbstractJsonLexerKt.COLON;
                } else {
                    if (z5 || (i = i + 1) == length) {
                        throw new java.lang.IllegalArgumentException();
                    }
                    z5 = true;
                }
            }
        } else {
            if (z) {
                throw new java.lang.IllegalArgumentException();
            }
            java.lang.String str4 = "Unexpected order of duration components";
            if (C59449zhJ.AEQbTJ(str, length2, "Infinity", 0, java.lang.Math.max(length - length2, 8), true)) {
                jKWHzl = activity.EZpvd();
            } else {
                if (z3 && str.charAt(length2) == '(' && C59454zhO.zsXlph(str) == ')') {
                    length2++;
                    length--;
                    if (length2 == length) {
                        throw new java.lang.IllegalArgumentException("No components");
                    }
                    z2 = true;
                } else {
                    z2 = !z3;
                }
                DurationUnit durationUnit2 = null;
                boolean z6 = false;
                while (length2 < length) {
                    if (z6 && z2) {
                        while (length2 < str.length() && str.charAt(length2) == ' ') {
                            length2++;
                        }
                    }
                    int i3 = length2;
                    while (i3 < str.length() && (('0' <= (cCharAt2 = str.charAt(i3)) && cCharAt2 < ':') || cCharAt2 == '.')) {
                        i3++;
                    }
                    Intrinsics.copydefault(str, "");
                    java.lang.String strSubstring4 = str.substring(length2, i3);
                    Intrinsics.checkNotNullExpressionValue(strSubstring4, "");
                    if (strSubstring4.length() == 0) {
                        throw new java.lang.IllegalArgumentException();
                    }
                    int length4 = length2 + strSubstring4.length();
                    int i4 = length4;
                    while (i4 < str.length() && 'a' <= (cCharAt = str.charAt(i4)) && cCharAt < '{') {
                        i4++;
                    }
                    Intrinsics.copydefault(str, "");
                    java.lang.String strSubstring5 = str.substring(length4, i4);
                    Intrinsics.checkNotNullExpressionValue(strSubstring5, "");
                    length2 = length4 + strSubstring5.length();
                    DurationUnit durationUnitEZpvd = C59464zhY.EZpvd(strSubstring5);
                    if (durationUnit2 != null && durationUnit2.compareTo(durationUnitEZpvd) <= 0) {
                        throw new java.lang.IllegalArgumentException(str4);
                    }
                    java.lang.String str5 = str4;
                    int iIndexOf$default2 = StringsKt__StringsKt.indexOf$default((java.lang.CharSequence) strSubstring4, '.', 0, false, 6, (java.lang.Object) null);
                    if (iIndexOf$default2 > 0) {
                        Intrinsics.copydefault(strSubstring4, "");
                        java.lang.String strSubstring6 = strSubstring4.substring(0, iIndexOf$default2);
                        Intrinsics.checkNotNullExpressionValue(strSubstring6, "");
                        long jCopydefault4 = C59462zhW.copydefault(jKWHzl, AEQbTJ(java.lang.Long.parseLong(strSubstring6), durationUnitEZpvd));
                        Intrinsics.copydefault(strSubstring4, "");
                        java.lang.String strSubstring7 = strSubstring4.substring(iIndexOf$default2);
                        Intrinsics.checkNotNullExpressionValue(strSubstring7, "");
                        jCopydefault = C59462zhW.copydefault(jCopydefault4, OLrzqt(java.lang.Double.parseDouble(strSubstring7), durationUnitEZpvd));
                        if (length2 < length) {
                            throw new java.lang.IllegalArgumentException("Fractional component must be last");
                        }
                    } else {
                        jCopydefault = C59462zhW.copydefault(jKWHzl, AEQbTJ(java.lang.Long.parseLong(strSubstring4), durationUnitEZpvd));
                    }
                    jKWHzl = jCopydefault;
                    str4 = str5;
                    durationUnit2 = durationUnitEZpvd;
                    z6 = true;
                }
            }
        }
        return z4 ? C59462zhW.wlaJM(jKWHzl) : jKWHzl;
    }

    public static final long KWHzl(java.lang.String str) {
        int length = str.length();
        int i = (length <= 0 || !StringsKt__StringsKt.contains$default((java.lang.CharSequence) "+-", str.charAt(0), false, 2, (java.lang.Object) null)) ? 0 : 1;
        if (length - i > 16) {
            java.lang.Iterable intRange = new kotlin.ranges.IntRange(i, StringsKt__StringsKt.fIwbmz((java.lang.CharSequence) str));
            if (!(intRange instanceof java.util.Collection) || !((java.util.Collection) intRange).isEmpty()) {
                java.util.Iterator it = intRange.iterator();
                while (it.hasNext()) {
                    char cCharAt = str.charAt(((AbstractC56415yEn) it).nextInt());
                    if ('0' > cCharAt || cCharAt >= ':') {
                    }
                }
            }
            return str.charAt(0) == '-' ? Long.MIN_VALUE : Long.MAX_VALUE;
        }
        if (C59449zhJ.startsWith$default(str, Marker.ANY_NON_NULL_MARKER, false, 2, null)) {
            str = C59454zhO.fetchVPNInfo(str, 1);
        }
        return java.lang.Long.parseLong(str);
    }

    public static final long isConnected(long j) {
        return j / ((long) 1000000);
    }

    public static final long AhwBna(long j) {
        return C59462zhW.copydefault(j << 1);
    }

    public static final long AYXKKw(long j) {
        return C59462zhW.copydefault((j << 1) + 1);
    }

    public static final long AEQbTJ(long j, int i) {
        return C59462zhW.copydefault((j << 1) + ((long) i));
    }

    public static final long djBIcL(long j) {
        if (-4611686018426999999L <= j && j < 4611686018427000000L) {
            return AhwBna(j);
        }
        return AYXKKw(isConnected(j));
    }

    public static final long valueOf(long j) {
        if (-4611686018426L <= j && j < 4611686018427L) {
            return AhwBna(DbNXlk(j));
        }
        return AYXKKw(C56548yJl.copydefault(j, -4611686018427387903L, 4611686018427387903L));
    }
}
