package o;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import o.C56929yXo;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yRp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C56768yRp {
    public static final java.util.Map<C56933yXs, C56933yXs> AEQbTJ;
    public static final C56768yRp EZpvd;
    public static final java.util.Map<C56929yXo, C56929yXo> copydefault;

    private C56768yRp() {
    }

    public final C56933yXs OLrzqt(@NotNull C56933yXs c56933yXs) {
        Intrinsics.checkNotNullParameter(c56933yXs, "");
        return AEQbTJ.get(c56933yXs);
    }

    static {
        C56768yRp c56768yRp = new C56768yRp();
        EZpvd = c56768yRp;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        copydefault = linkedHashMap;
        C56934yXt c56934yXt = C56934yXt.QOLQEE;
        c56768yRp.KWHzl(c56934yXt.fetchVPNInfo(), c56768yRp.copydefault("java.util.ArrayList", "java.util.LinkedList"));
        c56768yRp.KWHzl(c56934yXt.values(), c56768yRp.copydefault("java.util.HashSet", "java.util.TreeSet", "java.util.LinkedHashSet"));
        c56768yRp.KWHzl(c56934yXt.isConnected(), c56768yRp.copydefault("java.util.HashMap", "java.util.TreeMap", "java.util.LinkedHashMap", "java.util.concurrent.ConcurrentHashMap", "java.util.concurrent.ConcurrentSkipListMap"));
        C56929yXo.ActionBar actionBar = C56929yXo.AEQbTJ;
        c56768yRp.KWHzl(actionBar.KWHzl(new C56933yXs("java.util.function.Function")), c56768yRp.copydefault("java.util.function.UnaryOperator"));
        c56768yRp.KWHzl(actionBar.KWHzl(new C56933yXs("java.util.function.BiFunction")), c56768yRp.copydefault("java.util.function.BinaryOperator"));
        java.util.ArrayList arrayList = new java.util.ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            arrayList.add(C56390yDp.OLrzqt(((C56929yXo) entry.getKey()).AEQbTJ(), ((C56929yXo) entry.getValue()).AEQbTJ()));
        }
        AEQbTJ = C56424yEw.copydefault(arrayList);
    }

    public final void KWHzl(C56929yXo c56929yXo, java.util.List<C56929yXo> list) {
        java.util.Map<C56929yXo, C56929yXo> map = copydefault;
        for (java.lang.Object obj : list) {
            map.put((C56929yXo) obj, c56929yXo);
        }
    }

    public final java.util.List<C56929yXo> copydefault(java.lang.String... strArr) {
        java.util.ArrayList arrayList = new java.util.ArrayList(strArr.length);
        for (java.lang.String str : strArr) {
            arrayList.add(C56929yXo.AEQbTJ.KWHzl(new C56933yXs(str)));
        }
        return arrayList;
    }
}
