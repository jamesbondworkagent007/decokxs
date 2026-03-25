package o;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.yXw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C56937yXw {
    public static final C56929yXo AYXKKw(java.lang.String str) {
        C56933yXs c56933yXsGEmmrt = C56934yXt.QOLQEE.gEmmrt();
        C56935yXu c56935yXuAEQbTJ = C56935yXu.AEQbTJ(str);
        Intrinsics.checkNotNullExpressionValue(c56935yXuAEQbTJ, "");
        return new C56929yXo(c56933yXsGEmmrt, c56935yXuAEQbTJ);
    }

    public static final C56929yXo AEQbTJ(C56929yXo c56929yXo) {
        C56933yXs c56933yXsGEmmrt = C56934yXt.QOLQEE.gEmmrt();
        C56935yXu c56935yXuAEQbTJ = C56935yXu.AEQbTJ('U' + c56929yXo.AYXKKw().copydefault());
        Intrinsics.checkNotNullExpressionValue(c56935yXuAEQbTJ, "");
        return new C56929yXo(c56933yXsGEmmrt, c56935yXuAEQbTJ);
    }

    public static final C56929yXo AkhnZx(java.lang.String str) {
        C56933yXs c56933yXsValueOf = C56934yXt.QOLQEE.valueOf();
        C56935yXu c56935yXuAEQbTJ = C56935yXu.AEQbTJ(str);
        Intrinsics.checkNotNullExpressionValue(c56935yXuAEQbTJ, "");
        return new C56929yXo(c56933yXsValueOf, c56935yXuAEQbTJ);
    }

    public static final C56929yXo AEQbTJ(C56935yXu c56935yXu) {
        C56934yXt c56934yXt = C56934yXt.QOLQEE;
        C56933yXs c56933yXsOLrzqt = c56934yXt.KWHzl().OLrzqt();
        C56935yXu c56935yXuAEQbTJ = C56935yXu.AEQbTJ(c56935yXu.copydefault() + c56934yXt.KWHzl().AYXKKw().copydefault());
        Intrinsics.checkNotNullExpressionValue(c56935yXuAEQbTJ, "");
        return new C56929yXo(c56933yXsOLrzqt, c56935yXuAEQbTJ);
    }

    public static final C56929yXo valueOf(java.lang.String str) {
        C56933yXs c56933yXsCopydefault = C56934yXt.QOLQEE.copydefault();
        C56935yXu c56935yXuAEQbTJ = C56935yXu.AEQbTJ(str);
        Intrinsics.checkNotNullExpressionValue(c56935yXuAEQbTJ, "");
        return new C56929yXo(c56933yXsCopydefault, c56935yXuAEQbTJ);
    }

    public static final C56929yXo values(java.lang.String str) {
        C56933yXs c56933yXsDjBIcL = C56934yXt.QOLQEE.djBIcL();
        C56935yXu c56935yXuAEQbTJ = C56935yXu.AEQbTJ(str);
        Intrinsics.checkNotNullExpressionValue(c56935yXuAEQbTJ, "");
        return new C56929yXo(c56933yXsDjBIcL, c56935yXuAEQbTJ);
    }

    public static final C56929yXo djBIcL(java.lang.String str) {
        C56933yXs c56933yXsEZpvd = C56934yXt.QOLQEE.EZpvd();
        C56935yXu c56935yXuAEQbTJ = C56935yXu.AEQbTJ(str);
        Intrinsics.checkNotNullExpressionValue(c56935yXuAEQbTJ, "");
        return new C56929yXo(c56933yXsEZpvd, c56935yXuAEQbTJ);
    }

    public static final C56929yXo DbNXlk(java.lang.String str) {
        C56933yXs c56933yXsAEQbTJ = C56934yXt.QOLQEE.AEQbTJ();
        C56935yXu c56935yXuAEQbTJ = C56935yXu.AEQbTJ(str);
        Intrinsics.checkNotNullExpressionValue(c56935yXuAEQbTJ, "");
        return new C56929yXo(c56933yXsAEQbTJ, c56935yXuAEQbTJ);
    }

    public static final C56929yXo isConnected(java.lang.String str) {
        C56933yXs c56933yXsOLrzqt = C56934yXt.QOLQEE.OLrzqt();
        C56935yXu c56935yXuAEQbTJ = C56935yXu.AEQbTJ(str);
        Intrinsics.checkNotNullExpressionValue(c56935yXuAEQbTJ, "");
        return new C56929yXo(c56933yXsOLrzqt, c56935yXuAEQbTJ);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: QfgSZK.DCJXGO */
    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> java.util.Map<V, K> copydefault(java.util.Map<K, ? extends V> map) {
        java.util.Set<Map.Entry<K, ? extends V>> setEntrySet = map.entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(C56548yJl.copydefault(C56423yEv.copydefault(C56403yEb.AYXKKw(setEntrySet, 10)), 16));
        java.util.Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            kotlin.Pair pairOLrzqt = C56390yDp.OLrzqt(entry.getValue(), entry.getKey());
            linkedHashMap.put(pairOLrzqt.getFirst(), pairOLrzqt.getSecond());
        }
        return linkedHashMap;
    }
}
