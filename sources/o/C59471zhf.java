package o;

import java.util.stream.Collectors;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zhf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C59471zhf {
    public static final <T> java.util.List<T> OLrzqt(@NotNull java.util.stream.Stream<T> stream) {
        Intrinsics.checkNotNullParameter(stream, "");
        java.lang.Object objCollect = stream.collect(Collectors.toList());
        Intrinsics.checkNotNullExpressionValue(objCollect, "");
        return (java.util.List) objCollect;
    }

    public static final java.util.List<java.lang.Integer> AEQbTJ(@NotNull java.util.stream.IntStream intStream) {
        Intrinsics.checkNotNullParameter(intStream, "");
        int[] array = intStream.toArray();
        Intrinsics.checkNotNullExpressionValue(array, "");
        return yDT.AuCTel(array);
    }
}
