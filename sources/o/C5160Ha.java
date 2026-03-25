package o;

import kotlin.jvm.internal.Intrinsics;
import okio.Utf8;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Ha, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5160Ha {
    public static final char[] EZpvd(@NotNull yHZ yhz, int i) {
        Intrinsics.checkNotNullParameter(yhz, "");
        if (i >= 0 && i < 65536) {
            return new char[]{(char) i};
        }
        if (65536 <= i && i < 1114112) {
            int i2 = i - 65536;
            return new char[]{(char) (((i2 >>> 10) & 1023) + 55296), (char) ((i2 & 1023) + Utf8.LOG_SURROGATE_HEADER)};
        }
        throw new java.lang.IllegalArgumentException("invalid codepoint " + i);
    }
}
