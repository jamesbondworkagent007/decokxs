package o;

import java.util.Map;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yEz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C56427yEz extends C56425yEx {
    public static <K, V> java.util.List<kotlin.Pair<K, V>> AkhnZx(@NotNull java.util.Map<? extends K, ? extends V> map) {
        Intrinsics.checkNotNullParameter(map, "");
        if (map.size() == 0) {
            return yDY.AhwBna();
        }
        java.util.Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return yDY.AhwBna();
        }
        Map.Entry<? extends K, ? extends V> next = it.next();
        if (!it.hasNext()) {
            return C56402yEa.EZpvd(new kotlin.Pair(next.getKey(), next.getValue()));
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(map.size());
        arrayList.add(new kotlin.Pair(next.getKey(), next.getValue()));
        do {
            Map.Entry<? extends K, ? extends V> next2 = it.next();
            arrayList.add(new kotlin.Pair(next2.getKey(), next2.getValue()));
        } while (it.hasNext());
        return arrayList;
    }

    public static <K, V> Sequence<Map.Entry<K, V>> DbNXlk(@NotNull java.util.Map<? extends K, ? extends V> map) {
        Intrinsics.checkNotNullParameter(map, "");
        return CollectionsKt___CollectionsKt.QVAiDq(map.entrySet());
    }
}
