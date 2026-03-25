package o;

import java.util.Map;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.upB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C49467upB {
    public static final android.os.Bundle EZpvd(@NotNull java.util.Map<java.lang.String, ? extends java.lang.Object> map, @NotNull kotlin.Pair<java.lang.String, ? extends java.lang.Object>... pairArr) {
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(pairArr, "");
        java.util.Collection arrayList = new java.util.ArrayList(map.size());
        for (Map.Entry<java.lang.String, ? extends java.lang.Object> entry : map.entrySet()) {
            arrayList.add(C56390yDp.OLrzqt(entry.getKey(), entry.getValue()));
        }
        if (!(pairArr.length == 0)) {
            arrayList = CollectionsKt___CollectionsKt.AhwBna(arrayList, (java.lang.Object[]) pairArr);
        }
        return C33048mpB.EZpvd((kotlin.Pair[]) arrayList.toArray(new kotlin.Pair[0]));
    }
}
