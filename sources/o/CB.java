package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class CB {
    public static final void copydefault(@NotNull java.lang.Object obj) throws java.io.IOException {
        Intrinsics.checkNotNullParameter(obj, "");
        if (obj instanceof java.io.Closeable) {
            ((java.io.Closeable) obj).close();
        }
    }
}
