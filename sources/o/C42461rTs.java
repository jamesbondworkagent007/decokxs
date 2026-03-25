package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rTs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C42461rTs {
    public static final C42461rTs OLrzqt = new C42461rTs();
    public static final int AEQbTJ = 127462;
    public static final int copydefault = 65;

    private C42461rTs() {
    }

    public final java.lang.String AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        int iCodePointAt = java.lang.Character.codePointAt(str, 0);
        int i = copydefault;
        int i2 = AEQbTJ;
        int iCodePointAt2 = java.lang.Character.codePointAt(str, 1);
        char[] chars = java.lang.Character.toChars((iCodePointAt - i) + i2);
        Intrinsics.checkNotNullExpressionValue(chars, "");
        java.lang.String str2 = new java.lang.String(chars);
        char[] chars2 = java.lang.Character.toChars((iCodePointAt2 - i) + i2);
        Intrinsics.checkNotNullExpressionValue(chars2, "");
        return str2 + new java.lang.String(chars2);
    }
}
