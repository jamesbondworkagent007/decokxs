package o;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zgp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C59428zgp {
    public static final java.lang.String copydefault(@NotNull java.lang.String str, boolean z) {
        java.lang.Integer next;
        Intrinsics.checkNotNullParameter(str, "");
        if (str.length() == 0 || !KWHzl(str, 0, z)) {
            return str;
        }
        if (str.length() == 1 || !KWHzl(str, 1, z)) {
            if (z) {
                return AEQbTJ(str);
            }
            if (str.length() <= 0) {
                return str;
            }
            char lowerCase = java.lang.Character.toLowerCase(str.charAt(0));
            java.lang.String strSubstring = str.substring(1);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "");
            return lowerCase + strSubstring;
        }
        java.util.Iterator<java.lang.Integer> it = StringsKt__StringsKt.fJNWhG((java.lang.CharSequence) str).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (!KWHzl(str, next.intValue(), z)) {
                break;
            }
        }
        java.lang.Integer num = next;
        if (num == null) {
            return AEQbTJ(str, z);
        }
        int iIntValue = num.intValue() - 1;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.String strSubstring2 = str.substring(0, iIntValue);
        Intrinsics.checkNotNullExpressionValue(strSubstring2, "");
        sb.append(AEQbTJ(strSubstring2, z));
        java.lang.String strSubstring3 = str.substring(iIntValue);
        Intrinsics.checkNotNullExpressionValue(strSubstring3, "");
        sb.append(strSubstring3);
        return sb.toString();
    }

    public static final boolean KWHzl(java.lang.String str, int i, boolean z) {
        char cCharAt = str.charAt(i);
        if (z) {
            return 'A' <= cCharAt && cCharAt < '[';
        }
        return java.lang.Character.isUpperCase(cCharAt);
    }

    public static final java.lang.String AEQbTJ(java.lang.String str, boolean z) {
        if (z) {
            return OLrzqt(str);
        }
        java.lang.String lowerCase = str.toLowerCase(java.util.Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        return lowerCase;
    }

    public static final java.lang.String EZpvd(@NotNull java.lang.String str) {
        char cCharAt;
        Intrinsics.checkNotNullParameter(str, "");
        if (str.length() == 0 || 'a' > (cCharAt = str.charAt(0)) || cCharAt >= '{') {
            return str;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(str.length());
        sb.append(java.lang.Character.toUpperCase(cCharAt));
        sb.append((java.lang.CharSequence) str, 1, str.length());
        return sb.toString();
    }

    public static final java.lang.String AEQbTJ(@NotNull java.lang.String str) {
        char cCharAt;
        Intrinsics.checkNotNullParameter(str, "");
        if (str.length() == 0 || 'A' > (cCharAt = str.charAt(0)) || cCharAt >= '[') {
            return str;
        }
        char lowerCase = java.lang.Character.toLowerCase(cCharAt);
        java.lang.String strSubstring = str.substring(1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        return lowerCase + strSubstring;
    }

    public static final java.lang.String OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder(str.length());
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if ('A' <= cCharAt && cCharAt < '[') {
                cCharAt = java.lang.Character.toLowerCase(cCharAt);
            }
            sb.append(cCharAt);
        }
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }
}
