package o;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o.yMB;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yRd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C56756yRd {
    public static final java.util.Map<C56935yXu, java.util.List<C56935yXu>> AEQbTJ;
    public static final java.util.Set<C56935yXu> AhwBna;
    public static final C56756yRd EZpvd = new C56756yRd();
    public static final java.util.Set<C56933yXs> KWHzl;
    public static final java.util.Map<C56933yXs, C56935yXu> OLrzqt;
    public static final java.util.Set<C56933yXs> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.Map<C56933yXs, C56935yXu> EZpvd() {
        return OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.Set<C56933yXs> KWHzl() {
        return copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.Set<C56935yXu> copydefault() {
        return AhwBna;
    }

    private C56756yRd() {
    }

    static {
        C56930yXp c56930yXp = yMB.Application.valueOf;
        kotlin.Pair pairOLrzqt = C56390yDp.OLrzqt(C56758yRf.KWHzl(c56930yXp, "name"), yMB.AubY);
        kotlin.Pair pairOLrzqt2 = C56390yDp.OLrzqt(C56758yRf.KWHzl(c56930yXp, "ordinal"), C56935yXu.AEQbTJ("ordinal"));
        kotlin.Pair pairOLrzqt3 = C56390yDp.OLrzqt(C56758yRf.OLrzqt(yMB.Application.fIwbmz, "size"), C56935yXu.AEQbTJ("size"));
        C56933yXs c56933yXs = yMB.Application.dNCPSb;
        java.util.Map<C56933yXs, C56935yXu> mapGEmmrt = C56424yEw.gEmmrt(pairOLrzqt, pairOLrzqt2, pairOLrzqt3, C56390yDp.OLrzqt(C56758yRf.OLrzqt(c56933yXs, "size"), C56935yXu.AEQbTJ("size")), C56390yDp.OLrzqt(C56758yRf.KWHzl(yMB.Application.AuCTel, "length"), C56935yXu.AEQbTJ("length")), C56390yDp.OLrzqt(C56758yRf.OLrzqt(c56933yXs, UserMetadata.KEYDATA_FILENAME), C56935yXu.AEQbTJ("keySet")), C56390yDp.OLrzqt(C56758yRf.OLrzqt(c56933yXs, "values"), C56935yXu.AEQbTJ("values")), C56390yDp.OLrzqt(C56758yRf.OLrzqt(c56933yXs, "entries"), C56935yXu.AEQbTJ("entrySet")));
        OLrzqt = mapGEmmrt;
        java.util.Set<Map.Entry<C56933yXs, C56935yXu>> setEntrySet = mapGEmmrt.entrySet();
        java.util.ArrayList<kotlin.Pair> arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(setEntrySet, 10));
        java.util.Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            arrayList.add(new kotlin.Pair(((C56933yXs) entry.getKey()).OLrzqt(), entry.getValue()));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (kotlin.Pair pair : arrayList) {
            C56935yXu c56935yXu = (C56935yXu) pair.getSecond();
            java.lang.Object arrayList2 = linkedHashMap.get(c56935yXu);
            if (arrayList2 == null) {
                arrayList2 = new java.util.ArrayList();
                linkedHashMap.put(c56935yXu, arrayList2);
            }
            ((java.util.List) arrayList2).add((C56935yXu) pair.getFirst());
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(C56423yEv.copydefault(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry2.getKey(), CollectionsKt___CollectionsKt.QbewEr((java.lang.Iterable) entry2.getValue()));
        }
        AEQbTJ = linkedHashMap2;
        java.util.Map<C56933yXs, C56935yXu> map = OLrzqt;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Map.Entry<C56933yXs, C56935yXu> entry3 : map.entrySet()) {
            C56929yXo c56929yXoAEQbTJ = yML.OLrzqt.AEQbTJ(entry3.getKey().EZpvd().AYXKKw());
            Intrinsics.copydefault(c56929yXoAEQbTJ);
            linkedHashSet.add(c56929yXoAEQbTJ.AEQbTJ().KWHzl(entry3.getValue()));
        }
        KWHzl = linkedHashSet;
        java.util.Set<C56933yXs> setKeySet = OLrzqt.keySet();
        copydefault = setKeySet;
        java.util.Set<C56933yXs> set = setKeySet;
        java.util.ArrayList arrayList3 = new java.util.ArrayList(C56403yEb.AYXKKw(set, 10));
        java.util.Iterator<T> it2 = set.iterator();
        while (it2.hasNext()) {
            arrayList3.add(((C56933yXs) it2.next()).OLrzqt());
        }
        AhwBna = CollectionsKt___CollectionsKt.OqFWZa(arrayList3);
    }

    public final java.util.List<C56935yXu> KWHzl(@NotNull C56935yXu c56935yXu) {
        Intrinsics.checkNotNullParameter(c56935yXu, "");
        java.util.List<C56935yXu> list = AEQbTJ.get(c56935yXu);
        return list == null ? yDY.AhwBna() : list;
    }
}
