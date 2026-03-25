package o;

import com.ibm.icu.text.DecimalFormatSymbols;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pTz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C38308pTz {
    public static final java.lang.String[] OLrzqt = {"₀", "₁", "₂", "₃", "₄", "₅", "₆", "₇", "₈", "₉"};

    public static /* synthetic */ java.lang.String toSubscript$default(java.lang.String str, int i, java.util.Locale locale, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            i = 4;
        }
        if ((i2 & 4) != 0) {
            locale = java.util.Locale.getDefault();
        }
        return EZpvd(str, i, locale);
    }

    public static final java.lang.String EZpvd(@NotNull java.lang.String str, int i, @NotNull java.util.Locale locale) {
        char c;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(locale, "");
        if (i <= 0) {
            throw new java.lang.IllegalArgumentException("minLeadingZeros must > 0");
        }
        char decimalSeparator = new DecimalFormatSymbols(locale).getDecimalSeparator();
        if (StringsKt__StringsKt.split$default((java.lang.CharSequence) str, new char[]{decimalSeparator}, false, 0, 6, (java.lang.Object) null).size() != 2) {
            return str;
        }
        int iIndexOf$default = StringsKt__StringsKt.indexOf$default((java.lang.CharSequence) str, decimalSeparator, 0, false, 6, (java.lang.Object) null);
        int length = str.length();
        int i2 = iIndexOf$default;
        int length2 = iIndexOf$default - 1;
        int i3 = iIndexOf$default + 1;
        while (true) {
            if (i3 >= length) {
                c = '0';
                break;
            }
            if (str.charAt(i3) == '0') {
                c = '0';
                if (i3 == StringsKt__StringsKt.indexOf$default((java.lang.CharSequence) str, decimalSeparator, 0, false, 6, (java.lang.Object) null) + 1) {
                    i2 = i3;
                }
            } else {
                c = '0';
            }
            if (str.charAt(i3) != c) {
                length2 = i3;
                break;
            }
            if (i3 == str.length() - 1) {
                length2 = str.length();
            }
            i3++;
        }
        int i4 = length2 - i2;
        if (i4 < i) {
            return str;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("0");
        char[] charArray = java.lang.String.valueOf(i4).toCharArray();
        Intrinsics.checkNotNullExpressionValue(charArray, "");
        for (char c2 : charArray) {
            sb.append(OLrzqt[c2 - c]);
        }
        return StringsKt__StringsKt.AEQbTJ(str, i2, length2, sb).toString();
    }
}
