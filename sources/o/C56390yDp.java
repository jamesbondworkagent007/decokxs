package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yDp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C56390yDp {
    public static final <A, B> kotlin.Pair<A, B> OLrzqt(A a2, B b) {
        return new kotlin.Pair<>(a2, b);
    }

    public static final <T> java.util.List<T> copydefault(@NotNull kotlin.Pair<? extends T, ? extends T> pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        return yDY.gEmmrt(pair.getFirst(), pair.getSecond());
    }
}
