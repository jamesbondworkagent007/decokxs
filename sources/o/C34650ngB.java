package o;

import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ngB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C34650ngB {
    public static final <T> java.util.List<T> EZpvd(@NotNull java.lang.Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "");
        if ((iterable instanceof java.util.Collection) && ((java.util.Collection) iterable).size() <= 1) {
            return CollectionsKt___CollectionsKt.AxsJAYsNCnLh(iterable);
        }
        java.util.List<T> listDAIeex = CollectionsKt___CollectionsKt.DAIeex(iterable);
        C56404yEc.zsXlph(listDAIeex);
        return listDAIeex;
    }
}
