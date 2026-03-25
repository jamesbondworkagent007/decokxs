package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class yHX {
    public static final <T> java.util.Iterator<T> EZpvd(@NotNull T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "");
        return new yHV(tArr);
    }
}
