package o;

import java.util.LinkedHashMap;
import kotlin.collections.IndexedValue;

/* JADX INFO: renamed from: o.kdk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28596kdk {
    public static final java.util.Map<java.lang.Character, java.lang.Integer> copydefault;

    static {
        java.lang.Iterable<IndexedValue> iterableORxRYg = C59454zhO.ORxRYg("123456789ABCDEFGHJKLMNPQRSTUVWXYZabcdefghijkmnopqrstuvwxyz");
        LinkedHashMap linkedHashMap = new LinkedHashMap(C56548yJl.copydefault(C56423yEv.copydefault(C56403yEb.AYXKKw(iterableORxRYg, 10)), 16));
        for (IndexedValue indexedValue : iterableORxRYg) {
            kotlin.Pair pairOLrzqt = C56390yDp.OLrzqt(indexedValue.AEQbTJ(), java.lang.Integer.valueOf(indexedValue.OLrzqt()));
            linkedHashMap.put(pairOLrzqt.getFirst(), pairOLrzqt.getSecond());
        }
        copydefault = linkedHashMap;
    }
}
