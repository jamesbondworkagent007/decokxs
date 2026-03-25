package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class yEW implements java.util.Comparator<java.lang.Comparable<? super java.lang.Object>> {
    public static final yEW EZpvd = new yEW();

    private yEW() {
    }

    /* JADX DEBUG: Method merged with bridge method: compare(Ljava/lang/Object;Ljava/lang/Object;)I */
    @Override // java.util.Comparator
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public int compare(@NotNull java.lang.Comparable<java.lang.Object> comparable, @NotNull java.lang.Comparable<java.lang.Object> comparable2) {
        Intrinsics.checkNotNullParameter(comparable, "");
        Intrinsics.checkNotNullParameter(comparable2, "");
        return comparable.compareTo(comparable2);
    }

    /* JADX DEBUG: Return type fixed from 'java.util.Comparator<java.lang.Comparable<java.lang.Object>>' to match base method */
    @Override // java.util.Comparator
    public final java.util.Comparator<java.lang.Comparable<? super java.lang.Object>> reversed() {
        return yEZ.copydefault;
    }
}
