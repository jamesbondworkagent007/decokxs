package o;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt__CharJVMKt;

/* JADX INFO: loaded from: classes21.dex */
public final class FN {
    public static final java.lang.String OLrzqt(char c) {
        java.lang.String string = java.lang.Integer.toString(c, CharsKt__CharJVMKt.checkRadix(16));
        Intrinsics.checkNotNullExpressionValue(string, "");
        java.lang.String upperCase = string.toUpperCase(java.util.Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "");
        return upperCase;
    }
}
