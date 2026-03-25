package o;

import androidx.collection.MutableObjectList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gXi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C20004gXi {
    @yCM
    public C20004gXi() {
    }

    public final <T extends gYZ> java.util.List<T> AEQbTJ(@NotNull java.util.List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "");
        MutableObjectList.ObjectListMutableList objectListMutableList = (java.util.List<T>) CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) list);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (java.lang.Object obj : list) {
            java.lang.String simpleDate$default = pTA.formatSimpleDate$default(new Date(C33129mqd.valueOf(((gYZ) obj).fJNWhG())), null, 1, null);
            java.lang.Object arrayList = linkedHashMap.get(simpleDate$default);
            if (arrayList == null) {
                arrayList = new java.util.ArrayList();
                linkedHashMap.put(simpleDate$default, arrayList);
            }
            ((java.util.List) arrayList).add(obj);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            java.lang.String str = (java.lang.String) entry.getKey();
            java.util.List list2 = (java.util.List) entry.getValue();
            if (!linkedHashSet.contains(str)) {
                linkedHashSet.add(str);
                java.util.Iterator it = objectListMutableList.iterator();
                int i = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i = -1;
                        break;
                    }
                    if (Intrinsics.EZpvd((java.lang.Object) ((gYZ) it.next()).ejfBZ(), (java.lang.Object) ((gYZ) CollectionsKt___CollectionsKt.AuCTelauCTel(list2)).ejfBZ())) {
                        break;
                    }
                    i++;
                }
                if (i != -1) {
                    gYZ gyzEZpvd = ((gYZ) CollectionsKt___CollectionsKt.AuCTelauCTel(list2)).EZpvd(str);
                    Intrinsics.copydefault(gyzEZpvd, "");
                    objectListMutableList.set(i, gyzEZpvd);
                }
            }
        }
        return objectListMutableList;
    }
}
