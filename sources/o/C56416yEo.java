package o;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yEo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public class C56416yEo {
    public static <T, K> java.util.Map<K, java.lang.Integer> OLrzqt(@NotNull InterfaceC56413yEl<T, ? extends K> interfaceC56413yEl) {
        Intrinsics.checkNotNullParameter(interfaceC56413yEl, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        java.util.Iterator<T> itSourceIterator = interfaceC56413yEl.sourceIterator();
        while (itSourceIterator.hasNext()) {
            K kKeyOf = interfaceC56413yEl.keyOf(itSourceIterator.next());
            java.lang.Object intRef = linkedHashMap.get(kKeyOf);
            if (intRef == null && !linkedHashMap.containsKey(kKeyOf)) {
                intRef = new Ref.IntRef();
            }
            Ref.IntRef intRef2 = (Ref.IntRef) intRef;
            intRef2.element++;
            linkedHashMap.put(kKeyOf, intRef2);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Intrinsics.copydefault(entry, "");
            C56532yIw.KWHzl(entry).setValue(java.lang.Integer.valueOf(((Ref.IntRef) entry.getValue()).element));
        }
        return C56532yIw.AEQbTJ(linkedHashMap);
    }
}
