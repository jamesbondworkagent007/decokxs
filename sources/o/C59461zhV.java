package o;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.zhV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C59461zhV {
    public static final java.lang.String AEQbTJ(char c) {
        java.lang.String strValueOf = java.lang.String.valueOf(c);
        Intrinsics.copydefault(strValueOf, "");
        java.util.Locale locale = java.util.Locale.ROOT;
        java.lang.String upperCase = strValueOf.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase, "");
        if (upperCase.length() <= 1) {
            return java.lang.String.valueOf(java.lang.Character.toTitleCase(c));
        }
        if (c == 329) {
            return upperCase;
        }
        char cCharAt = upperCase.charAt(0);
        Intrinsics.copydefault(upperCase, "");
        java.lang.String strSubstring = upperCase.substring(1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        Intrinsics.copydefault(strSubstring, "");
        java.lang.String lowerCase = strSubstring.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        return cCharAt + lowerCase;
    }
}
