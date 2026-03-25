package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class pFX {
    public static final pFX AEQbTJ = new pFX();

    private pFX() {
    }

    public final java.lang.String copydefault(@NotNull java.lang.String str, @NotNull java.lang.String... strArr) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(strArr, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("javascript:window." + str);
        if (strArr.length == 0) {
            sb.append("()");
        } else {
            sb.append("(`");
            sb.append(KWHzl((java.lang.String[]) java.util.Arrays.copyOf(strArr, strArr.length)));
            sb.append("`)");
        }
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public final java.lang.String KWHzl(@NotNull java.lang.String str, boolean z, @NotNull java.lang.String... strArr) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(strArr, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("javascript:window." + str);
        if (strArr.length == 0) {
            sb.append("()");
        } else {
            sb.append("(`");
            sb.append(KWHzl((java.lang.String[]) java.util.Arrays.copyOf(strArr, strArr.length)));
            sb.append("`,");
            sb.append(z);
            sb.append(")");
        }
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public final java.lang.String KWHzl(@NotNull java.lang.String... strArr) {
        Intrinsics.checkNotNullParameter(strArr, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            sb.append(strArr[i]);
            if (i != strArr.length - 1) {
                sb.append(" , ");
            }
        }
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }
}
