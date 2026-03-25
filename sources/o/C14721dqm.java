package o;

import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dqm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C14721dqm {
    public static final <T> java.util.List<T> OLrzqt(@NotNull java.util.List<? extends T> list, int i) {
        Intrinsics.checkNotNullParameter(list, "");
        if (i < 2) {
            throw new java.lang.IllegalArgumentException("Number of samples must be at least 2 to include both the first and last elements.".toString());
        }
        if (list.size() < i) {
            throw new java.lang.IllegalArgumentException("Array must have at least as many elements as the number of requested samples.".toString());
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(CollectionsKt___CollectionsKt.AuCTelauCTel(list));
        int size = list.size();
        if (i > 2) {
            double d = ((double) (size - 2)) / ((double) (i - 2));
            for (int i2 = 1; i2 < i - 1; i2++) {
                arrayList.add(list.get(yII.EZpvd(((double) (i2 - 1)) * d) + 1));
            }
        }
        arrayList.add(CollectionsKt___CollectionsKt.AubY(list));
        return arrayList;
    }
}
