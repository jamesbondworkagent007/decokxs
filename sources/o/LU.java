package o;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonBuilder;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonKt;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class LU {
    public static final /* synthetic */ Json OLrzqt = JsonKt.Json$default(null, new Function1<JsonBuilder, Unit>() { // from class: com.amplitude.experiment.evaluation.EvaluationSerializationKt$json$1
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(JsonBuilder jsonBuilder) {
            invoke2(jsonBuilder);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull JsonBuilder jsonBuilder) {
            Intrinsics.checkNotNullParameter(jsonBuilder, "");
            jsonBuilder.setIgnoreUnknownKeys(true);
            jsonBuilder.setLenient(true);
            jsonBuilder.setCoerceInputValues(true);
            jsonBuilder.setExplicitNulls(false);
        }
    }, 1, null);

    public static final /* synthetic */ JsonElement EZpvd(java.lang.Object obj) {
        if (obj == null) {
            return JsonNull.INSTANCE;
        }
        return obj instanceof java.util.Map ? OLrzqt((java.util.Map) obj) : obj instanceof java.util.Collection ? AEQbTJ((java.util.Collection) obj) : obj instanceof java.lang.Boolean ? JsonElementKt.JsonPrimitive((java.lang.Boolean) obj) : obj instanceof java.lang.Number ? JsonElementKt.JsonPrimitive((java.lang.Number) obj) : obj instanceof java.lang.String ? JsonElementKt.JsonPrimitive((java.lang.String) obj) : JsonElementKt.JsonPrimitive(obj.toString());
    }

    public static final /* synthetic */ JsonArray AEQbTJ(java.util.Collection collection) {
        Intrinsics.checkNotNullParameter(collection, "");
        java.util.Collection collection2 = collection;
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(collection2, 10));
        java.util.Iterator it = collection2.iterator();
        while (it.hasNext()) {
            arrayList.add(EZpvd(it.next()));
        }
        return new JsonArray(arrayList);
    }

    public static final /* synthetic */ java.lang.Object AEQbTJ(JsonElement jsonElement) {
        Intrinsics.checkNotNullParameter(jsonElement, "");
        if (jsonElement instanceof JsonPrimitive) {
            return AEQbTJ((JsonPrimitive) jsonElement);
        }
        if (jsonElement instanceof JsonArray) {
            return EZpvd((JsonArray) jsonElement);
        }
        if (jsonElement instanceof JsonObject) {
            return AEQbTJ((JsonObject) jsonElement);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final /* synthetic */ java.lang.Object AEQbTJ(JsonPrimitive jsonPrimitive) {
        Intrinsics.checkNotNullParameter(jsonPrimitive, "");
        if (jsonPrimitive.isString()) {
            return JsonElementKt.getContentOrNull(jsonPrimitive);
        }
        java.lang.Object booleanOrNull = JsonElementKt.getBooleanOrNull(jsonPrimitive);
        return (booleanOrNull == null && (booleanOrNull = JsonElementKt.getIntOrNull(jsonPrimitive)) == null && (booleanOrNull = JsonElementKt.getLongOrNull(jsonPrimitive)) == null) ? JsonElementKt.getDoubleOrNull(jsonPrimitive) : booleanOrNull;
    }

    public static final /* synthetic */ JsonObject OLrzqt(java.util.Map map) {
        Intrinsics.checkNotNullParameter(map, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            java.lang.Object key = entry.getKey();
            java.lang.String str = key instanceof java.lang.String ? (java.lang.String) key : null;
            kotlin.Pair pairOLrzqt = str != null ? C56390yDp.OLrzqt(str, EZpvd(entry.getValue())) : null;
            if (pairOLrzqt != null) {
                arrayList.add(pairOLrzqt);
            }
        }
        return new JsonObject(C56424yEw.copydefault(arrayList));
    }

    public static final /* synthetic */ java.util.List EZpvd(JsonArray jsonArray) {
        Intrinsics.checkNotNullParameter(jsonArray, "");
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(jsonArray, 10));
        java.util.Iterator<JsonElement> it = jsonArray.iterator();
        while (it.hasNext()) {
            arrayList.add(AEQbTJ(it.next()));
        }
        return arrayList;
    }

    public static final /* synthetic */ java.util.Map AEQbTJ(JsonObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap(C56423yEv.copydefault(jsonObject.size()));
        java.util.Iterator<T> it = jsonObject.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), AEQbTJ((JsonElement) entry.getValue()));
        }
        return linkedHashMap;
    }
}
