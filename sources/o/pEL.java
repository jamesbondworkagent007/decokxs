package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class pEL {
    public static final pEL OLrzqt = new pEL();

    private pEL() {
    }

    public final kotlin.Pair<java.lang.String, java.lang.Integer> KWHzl(@NotNull java.lang.String str) {
        java.lang.String strSubstring;
        int i;
        Intrinsics.checkNotNullParameter(str, "");
        if (str.length() == 9) {
            strSubstring = str.substring(0, 7);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        } else {
            strSubstring = str;
        }
        if (str.length() == 9) {
            java.lang.String strSubstring2 = str.substring(7);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "");
            i = java.lang.Integer.parseInt(strSubstring2, 16);
        } else {
            i = 255;
        }
        return new kotlin.Pair<>(strSubstring, java.lang.Integer.valueOf(i));
    }

    public final java.lang.String KWHzl(@NotNull java.lang.String str, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        C56529yIt c56529yIt = C56529yIt.KWHzl;
        java.lang.String str2 = java.lang.String.format("%02X", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(i)}, 1));
        Intrinsics.checkNotNullExpressionValue(str2, "");
        return str + str2;
    }
}
