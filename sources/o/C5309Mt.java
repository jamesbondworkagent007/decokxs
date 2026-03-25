package o;

import QfgSZK.AEQbTJ;
import com.amplitude.experiment.evaluation.EvaluationContext;
import com.appsflyer.AdRevenueScheme;
import com.engagelab.privates.core.constants.MTCoreConstants;
import com.engagelab.privates.push.constants.MTPushConstants;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C5309Mt;
import o.C56424yEw;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.Mt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5309Mt {
    public static final java.lang.String EZpvd(@NotNull LF lf) {
        java.util.Map linkedHashMap;
        Intrinsics.checkNotNullParameter(lf, "");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(MTCoreConstants.Register.KEY_USER_ID, lf.ejfBZ);
            jSONObject.put("device_id", lf.copydefault);
            jSONObject.put(AdRevenueScheme.COUNTRY, lf.KWHzl);
            jSONObject.put("city", lf.OLrzqt);
            jSONObject.put("region", lf.DbNXlk);
            jSONObject.put("dma", lf.gEmmrt);
            jSONObject.put("language", lf.isConnected);
            jSONObject.put(MTPushConstants.PlatformNode.KEY_PLATFORM, lf.values);
            jSONObject.put("version", lf.fARcdN);
            jSONObject.put("os", lf.fetchVPNInfo);
            jSONObject.put("device_brand", lf.EZpvd);
            jSONObject.put("device_manufacturer", lf.AhwBna);
            jSONObject.put("device_model", lf.AYXKKw);
            jSONObject.put("carrier", lf.AEQbTJ);
            jSONObject.put("library", lf.AkhnZx);
            java.util.Map<java.lang.String, java.lang.Object> map = lf.AuCTel;
            if (map == null || (linkedHashMap = C56424yEw.isConnected(map)) == null) {
                linkedHashMap = new LinkedHashMap();
            }
            jSONObject.put("user_properties", new JSONObject(linkedHashMap));
            java.util.Map<java.lang.String, java.util.Set<java.lang.String>> map2 = lf.djBIcL;
            jSONObject.put("groups", map2 != null ? C5308Ms.OLrzqt(map2) : null);
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Object>>> map3 = lf.valueOf;
            jSONObject.put("group_properties", map3 != null ? C5308Ms.OLrzqt(map3) : null);
        } catch (JSONException e) {
            C5310Mu.copydefault.AEQbTJ("Error converting SkylabUser to JSONObject", e);
        }
        java.lang.String string = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public static final EvaluationContext KWHzl(@NotNull LF lf) {
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Object>> map;
        Intrinsics.checkNotNullParameter(lf, "");
        EvaluationContext evaluationContext = new EvaluationContext();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        java.util.Map<java.lang.String, java.util.Set<java.lang.String>> map2 = lf.djBIcL;
        if (map2 != null && !map2.isEmpty()) {
            for (Map.Entry<java.lang.String, java.util.Set<java.lang.String>> entry : lf.djBIcL.entrySet()) {
                java.lang.String key = entry.getKey();
                java.util.Set<java.lang.String> value = entry.getValue();
                if (!value.isEmpty()) {
                    java.lang.String str = (java.lang.String) CollectionsKt___CollectionsKt.dNCPSb(value);
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    linkedHashMap2.put("group_name", str);
                    java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Object>>> map3 = lf.valueOf;
                    java.util.Map<java.lang.String, java.lang.Object> map4 = (map3 == null || (map = map3.get(key)) == null) ? null : map.get(str);
                    if (map4 != null && !map4.isEmpty()) {
                        linkedHashMap2.put("group_properties", map4);
                    }
                    linkedHashMap.put(key, linkedHashMap2);
                }
            }
            evaluationContext.put("groups", linkedHashMap);
        }
        java.util.Map mapIsConnected = C56424yEw.isConnected(copydefault(lf));
        mapIsConnected.remove("groups");
        mapIsConnected.remove("group_properties");
        evaluationContext.put("user", mapIsConnected);
        return evaluationContext;
    }

    public static final java.util.Map<java.lang.String, java.lang.Object> copydefault(@NotNull LF lf) {
        Intrinsics.checkNotNullParameter(lf, "");
        java.util.Map mapGEmmrt = C56424yEw.gEmmrt(C56390yDp.OLrzqt(MTCoreConstants.Register.KEY_USER_ID, lf.ejfBZ), C56390yDp.OLrzqt("device_id", lf.copydefault), C56390yDp.OLrzqt(AdRevenueScheme.COUNTRY, lf.KWHzl), C56390yDp.OLrzqt("region", lf.DbNXlk), C56390yDp.OLrzqt("dma", lf.gEmmrt), C56390yDp.OLrzqt("city", lf.OLrzqt), C56390yDp.OLrzqt("language", lf.isConnected), C56390yDp.OLrzqt(MTPushConstants.PlatformNode.KEY_PLATFORM, lf.values), C56390yDp.OLrzqt("version", lf.fARcdN), C56390yDp.OLrzqt("os", lf.fetchVPNInfo), C56390yDp.OLrzqt("device_manufacturer", lf.AhwBna), C56390yDp.OLrzqt("device_brand", lf.EZpvd), C56390yDp.OLrzqt("device_model", lf.AYXKKw), C56390yDp.OLrzqt("carrier", lf.AEQbTJ), C56390yDp.OLrzqt("library", lf.AkhnZx), C56390yDp.OLrzqt("user_properties", lf.AuCTel), C56390yDp.OLrzqt("groups", lf.djBIcL), C56390yDp.OLrzqt("group_properties", lf.valueOf));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : mapGEmmrt.entrySet()) {
            if (entry.getValue() != null) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    public static final LF copydefault(LF lf, LF lf2) {
        LF lf3 = lf == null ? new LF() : lf;
        java.util.Map<java.lang.String, ? extends java.lang.Object> map = (java.util.Map) copydefault(lf != null ? lf.AuCTel : null, lf2 != null ? lf2.AuCTel : null, new Function2<java.util.Map<java.lang.String, ? extends java.lang.Object>, java.util.Map<java.lang.String, ? extends java.lang.Object>, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.amplitude.experiment.util.UserKt$merge$mergedUserProperties$1
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Map<String, Object> invoke(@NotNull Map<String, ? extends Object> map2, @NotNull Map<String, ? extends Object> map3) {
                Intrinsics.checkNotNullParameter(map2, "");
                Intrinsics.checkNotNullParameter(map3, "");
                return C56424yEw.OLrzqt(map3, map2);
            }
        });
        return lf3.AEQbTJ().fetchVPNInfo((java.lang.String) merge$default(lf3.ejfBZ, lf2 != null ? lf2.ejfBZ : null, null, 2, null)).copydefault((java.lang.String) merge$default(lf3.copydefault, lf2 != null ? lf2.copydefault : null, null, 2, null)).KWHzl((java.lang.String) merge$default(lf3.KWHzl, lf2 != null ? lf2.KWHzl : null, null, 2, null)).isConnected((java.lang.String) merge$default(lf3.DbNXlk, lf2 != null ? lf2.DbNXlk : null, null, 2, null)).AhwBna((java.lang.String) merge$default(lf3.gEmmrt, lf2 != null ? lf2.gEmmrt : null, null, 2, null)).OLrzqt((java.lang.String) merge$default(lf3.OLrzqt, lf2 != null ? lf2.OLrzqt : null, null, 2, null)).djBIcL((java.lang.String) merge$default(lf3.isConnected, lf2 != null ? lf2.isConnected : null, null, 2, null)).values((java.lang.String) merge$default(lf3.values, lf2 != null ? lf2.values : null, null, 2, null)).DbNXlk((java.lang.String) merge$default(lf3.fARcdN, lf2 != null ? lf2.fARcdN : null, null, 2, null)).AkhnZx((java.lang.String) merge$default(lf3.fetchVPNInfo, lf2 != null ? lf2.fetchVPNInfo : null, null, 2, null)).gEmmrt((java.lang.String) merge$default(lf3.AhwBna, lf2 != null ? lf2.AhwBna : null, null, 2, null)).AEQbTJ((java.lang.String) merge$default(lf3.EZpvd, lf2 != null ? lf2.EZpvd : null, null, 2, null)).valueOf((java.lang.String) merge$default(lf3.AYXKKw, lf2 != null ? lf2.AYXKKw : null, null, 2, null)).EZpvd((java.lang.String) merge$default(lf3.AEQbTJ, lf2 != null ? lf2.AEQbTJ : null, null, 2, null)).AYXKKw((java.lang.String) merge$default(lf3.AkhnZx, lf2 != null ? lf2.AkhnZx : null, null, 2, null)).OLrzqt(map).KWHzl((java.util.Map<java.lang.String, ? extends java.util.Set<java.lang.String>>) copydefault(lf != null ? lf.djBIcL : null, lf2 != null ? lf2.djBIcL : null, new Function2<java.util.Map<java.lang.String, ? extends java.util.Set<? extends java.lang.String>>, java.util.Map<java.lang.String, ? extends java.util.Set<? extends java.lang.String>>, java.util.Map<java.lang.String, ? extends java.util.Set<? extends java.lang.String>>>() { // from class: com.amplitude.experiment.util.UserKt$merge$mergedGroups$1
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Map<String, ? extends Set<? extends String>> invoke(Map<String, ? extends Set<? extends String>> map2, Map<String, ? extends Set<? extends String>> map3) {
                return invoke2((Map<String, ? extends Set<String>>) map2, (Map<String, ? extends Set<String>>) map3);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Map<String, Set<String>> invoke2(@NotNull Map<String, ? extends Set<String>> map2, @NotNull Map<String, ? extends Set<String>> map3) {
                Intrinsics.checkNotNullParameter(map2, "");
                Intrinsics.checkNotNullParameter(map3, "");
                return C56424yEw.OLrzqt(map3, map2);
            }
        })).AEQbTJ(AEQbTJ(lf != null ? lf.valueOf : null, lf2 != null ? lf2.valueOf : null, new Function2<java.util.Map<java.lang.String, ? extends java.util.Map<java.lang.String, ? extends java.lang.Object>>, java.util.Map<java.lang.String, ? extends java.util.Map<java.lang.String, ? extends java.lang.Object>>, java.util.Map<java.lang.String, ? extends java.util.Map<java.lang.String, ? extends java.lang.Object>>>() { // from class: com.amplitude.experiment.util.UserKt$merge$mergedGroupProperties$1
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Map<String, Map<String, Object>> invoke(@NotNull Map<String, ? extends Map<String, ? extends Object>> map2, @NotNull Map<String, ? extends Map<String, ? extends Object>> map3) {
                Intrinsics.checkNotNullParameter(map2, "");
                Intrinsics.checkNotNullParameter(map3, "");
                return C5309Mt.AEQbTJ(map2, map3, new Function2<Map<String, ? extends Object>, Map<String, ? extends Object>, Map<String, ? extends Object>>() { // from class: com.amplitude.experiment.util.UserKt$merge$mergedGroupProperties$1.1
                    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                    @Override // kotlin.jvm.functions.Function2
                    public final Map<String, Object> invoke(@NotNull Map<String, ? extends Object> map4, @NotNull Map<String, ? extends Object> map5) {
                        Intrinsics.checkNotNullParameter(map4, "");
                        Intrinsics.checkNotNullParameter(map5, "");
                        return C56424yEw.OLrzqt(map5, map4);
                    }
                });
            }
        })).OLrzqt();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.util.Map<java.lang.String, ? extends T> */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: java.util.Map<java.lang.String, ? extends T> */
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> java.util.Map<java.lang.String, T> AEQbTJ(java.util.Map<java.lang.String, ? extends T> map, java.util.Map<java.lang.String, ? extends T> map2, Function2<? super T, ? super T, ? extends T> function2) {
        if (map == 0) {
            return map2;
        }
        if (map2 == 0) {
            return map;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            java.lang.String str = (java.lang.String) entry.getKey();
            T tInvoke = (java.lang.Object) entry.getValue();
            AEQbTJ aEQbTJ = (java.lang.Object) map2.get(str);
            if (aEQbTJ != null) {
                tInvoke = function2.invoke(tInvoke, aEQbTJ);
            }
            if (tInvoke != null) {
                linkedHashMap.put(str, tInvoke);
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            java.lang.String str2 = (java.lang.String) entry2.getKey();
            java.lang.Object value = entry2.getValue();
            if (!linkedHashMap.containsKey(str2)) {
                linkedHashMap.put(str2, value);
            }
        }
        return linkedHashMap;
    }

    public static /* synthetic */ java.lang.Object merge$default(java.lang.Object obj, java.lang.Object obj2, Function2 function2, int i, java.lang.Object obj3) {
        if ((i & 2) != 0) {
            function2 = new Function2<java.lang.Object, java.lang.Object, java.lang.Object>() { // from class: com.amplitude.experiment.util.UserKt$merge$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj4, Object obj5) {
                    return obj4;
                }
            };
        }
        return copydefault(obj, obj2, function2);
    }

    public static final <T> T copydefault(T t, T t2, Function2<? super T, ? super T, ? extends T> function2) {
        return t == null ? t2 : t2 == null ? t : function2.invoke(t, t2);
    }
}
