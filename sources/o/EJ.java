package o;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt__CharJVMKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class EJ {
    public static final boolean KWHzl(char c) {
        return c == '\"' || c == '\\' || (c >= 0 && c < ' ');
    }

    public static final java.lang.String KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        for (int i = 0; i < str.length(); i++) {
            if (KWHzl(str.charAt(i))) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder(str.length() + 1);
                for (int i2 = 0; i2 < str.length(); i2++) {
                    char cCharAt = str.charAt(i2);
                    if (cCharAt == '\"') {
                        sb.append("\\\"");
                    } else if (cCharAt == '\\') {
                        sb.append("\\\\");
                    } else if (cCharAt == '\n') {
                        sb.append("\\n");
                    } else if (cCharAt == '\r') {
                        sb.append("\\r");
                    } else if (cCharAt == '\t') {
                        sb.append("\\t");
                    } else if (cCharAt == '\b') {
                        sb.append("\\b");
                    } else if (cCharAt == '\f') {
                        sb.append("\\f");
                    } else if (cCharAt >= 0 && cCharAt < ' ') {
                        java.lang.String string = java.lang.Integer.toString(cCharAt, CharsKt__CharJVMKt.checkRadix(16));
                        Intrinsics.checkNotNullExpressionValue(string, "");
                        sb.append("\\u");
                        sb.append(StringsKt__StringsKt.copydefault(string, 4, '0'));
                    } else {
                        sb.append(cCharAt);
                    }
                }
                java.lang.String string2 = sb.toString();
                Intrinsics.checkNotNullExpressionValue(string2, "");
                return string2;
            }
        }
        return str;
    }
}
