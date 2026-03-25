package o;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.sZw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C44600sZw {
    public static final C44600sZw AEQbTJ = new C44600sZw();
    public static final int EZpvd = 8;
    public static java.util.Map<java.lang.String, ? extends java.lang.Object> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        copydefault = map;
    }

    private C44600sZw() {
    }

    public final java.util.Map<java.lang.String, java.lang.String> copydefault() {
        java.util.Map<java.lang.String, ? extends java.lang.Object> map = copydefault;
        java.lang.Object obj = map != null ? map.get("utm_source") : null;
        java.lang.String str = obj instanceof java.lang.String ? (java.lang.String) obj : null;
        java.util.Map<java.lang.String, ? extends java.lang.Object> map2 = copydefault;
        java.lang.Object obj2 = map2 != null ? map2.get("utm_medium") : null;
        java.lang.String str2 = obj2 instanceof java.lang.String ? (java.lang.String) obj2 : null;
        java.util.Map<java.lang.String, ? extends java.lang.Object> map3 = copydefault;
        java.lang.Object obj3 = map3 != null ? map3.get("utm_campaign") : null;
        java.lang.String str3 = obj3 instanceof java.lang.String ? (java.lang.String) obj3 : null;
        java.util.Map<java.lang.String, ? extends java.lang.Object> map4 = copydefault;
        java.lang.Object obj4 = map4 != null ? map4.get("utm_term") : null;
        java.lang.String str4 = obj4 instanceof java.lang.String ? (java.lang.String) obj4 : null;
        java.util.Map<java.lang.String, ? extends java.lang.Object> map5 = copydefault;
        java.lang.Object obj5 = map5 != null ? map5.get("utm_content") : null;
        java.util.Map mapGEmmrt = C56424yEw.gEmmrt(C56390yDp.OLrzqt("utm_source", str), C56390yDp.OLrzqt("utm_medium", str2), C56390yDp.OLrzqt("utm_campaign", str3), C56390yDp.OLrzqt("utm_term", str4), C56390yDp.OLrzqt("utm_content", obj5 instanceof java.lang.String ? (java.lang.String) obj5 : null));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : mapGEmmrt.entrySet()) {
            if (((java.lang.String) entry.getValue()) != null) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(C56423yEv.copydefault(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            java.lang.Object key = entry2.getKey();
            java.lang.Object value = entry2.getValue();
            Intrinsics.copydefault(value);
            linkedHashMap2.put(key, (java.lang.String) value);
        }
        return linkedHashMap2;
    }
}
