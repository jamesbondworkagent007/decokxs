package o;

import java.math.BigDecimal;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.Ms, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5308Ms {
    public static final JSONObject OLrzqt(java.util.Map<?, ?> map) throws JSONException {
        if (map == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            java.lang.Object key = entry.getKey();
            java.lang.String str = key instanceof java.lang.String ? (java.lang.String) key : null;
            if (str != null) {
                jSONObject.put(str, EZpvd(entry.getValue()));
            }
        }
        return jSONObject;
    }

    public static final java.util.Map<java.lang.String, java.lang.Object> KWHzl(@NotNull JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(jSONObject, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        java.util.Iterator<java.lang.String> itKeys = jSONObject.keys();
        Intrinsics.checkNotNullExpressionValue(itKeys, "");
        while (itKeys.hasNext()) {
            java.lang.String next = itKeys.next();
            Intrinsics.checkNotNullExpressionValue(next, "");
            linkedHashMap.put(next, KWHzl(jSONObject.get(next)));
        }
        return linkedHashMap;
    }

    public static final java.util.List<java.lang.Object> KWHzl(@NotNull JSONArray jSONArray) {
        Intrinsics.checkNotNullParameter(jSONArray, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            arrayList.add(KWHzl(jSONArray.get(i)));
        }
        return arrayList;
    }

    public static final JSONArray EZpvd(java.util.Collection<?> collection) {
        if (collection == null) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        java.util.Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            jSONArray.put(EZpvd(it.next()));
        }
        return jSONArray;
    }

    public static final java.lang.Object KWHzl(java.lang.Object obj) {
        if (obj instanceof JSONObject) {
            return KWHzl((JSONObject) obj);
        }
        if (obj instanceof JSONArray) {
            return KWHzl((JSONArray) obj);
        }
        if (obj instanceof BigDecimal) {
            return java.lang.Double.valueOf(((BigDecimal) obj).doubleValue());
        }
        if (Intrinsics.EZpvd(obj, JSONObject.NULL)) {
            return null;
        }
        return obj;
    }

    public static final java.lang.Object EZpvd(java.lang.Object obj) {
        return obj instanceof java.util.Map ? OLrzqt((java.util.Map) obj) : obj instanceof java.util.Collection ? EZpvd((java.util.Collection<?>) obj) : obj;
    }
}
