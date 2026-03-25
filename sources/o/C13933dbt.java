package o;

import com.google.gson.Gson;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import java.util.Map;
import java.util.TreeMap;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonObject;
import o.C13932dbs;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dbt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C13933dbt {
    public static final java.util.Comparator<java.lang.String> OLrzqt = new java.util.Comparator() { // from class: o.dbr
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // java.util.Comparator
        public final int compare(java.lang.Object obj, java.lang.Object obj2) {
            return C13933dbt.KWHzl((java.lang.String) obj, (java.lang.String) obj2);
        }
    };

    public static final <T> java.lang.String AEQbTJ(@NotNull SerializationStrategy<? super T> serializationStrategy, T t) {
        Intrinsics.checkNotNullParameter(serializationStrategy, "");
        return copydefault(serializationStrategy, t).toString();
    }

    public static final <T> JsonObject copydefault(@NotNull SerializationStrategy<? super T> serializationStrategy, T t) {
        Intrinsics.checkNotNullParameter(serializationStrategy, "");
        return KWHzl(JsonElementKt.getJsonObject(C33489mxS.KWHzl.OLrzqt(serializationStrategy, t)));
    }

    public static final java.lang.String AEQbTJ(@NotNull JsonObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "");
        return KWHzl(jsonObject).toString();
    }

    public static final int KWHzl(java.lang.String str, java.lang.String str2) {
        Intrinsics.copydefault((java.lang.Object) str);
        Intrinsics.copydefault((java.lang.Object) str2);
        return C59449zhJ.OLrzqt(str, str2, true);
    }

    public static final JsonObject KWHzl(@NotNull JsonObject jsonObject) {
        java.lang.Object jsonArray;
        Intrinsics.checkNotNullParameter(jsonObject, "");
        TreeMap treeMap = new TreeMap(OLrzqt);
        for (Map.Entry<java.lang.String, JsonElement> entry : jsonObject.entrySet()) {
            java.lang.String key = entry.getKey();
            JsonElement value = entry.getValue();
            if (value instanceof JsonObject) {
                JsonElement value2 = entry.getValue();
                Intrinsics.copydefault(value2, "");
                jsonArray = KWHzl((JsonObject) value2);
            } else if (value instanceof JsonArray) {
                JsonElement value3 = entry.getValue();
                Intrinsics.copydefault(value3, "");
                JsonArray jsonArray2 = (JsonArray) value3;
                if (CollectionsKt___CollectionsKt.firstOrNull(jsonArray2) instanceof JsonObject) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    for (JsonElement jsonElement : jsonArray2) {
                        if (jsonElement instanceof JsonObject) {
                            arrayList.add(KWHzl((JsonObject) jsonElement));
                        } else {
                            arrayList.add(jsonElement);
                        }
                    }
                    jsonArray = new JsonArray(arrayList);
                } else {
                    jsonArray = (JsonElement) entry.getValue();
                }
            } else {
                jsonArray = (JsonElement) entry.getValue();
            }
            treeMap.put(key, jsonArray);
        }
        return new JsonObject(treeMap);
    }

    public static final JsonArray KWHzl(@NotNull JsonArray jsonArray) {
        Intrinsics.checkNotNullParameter(jsonArray, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (!(CollectionsKt___CollectionsKt.firstOrNull(jsonArray) instanceof JsonObject)) {
            return jsonArray;
        }
        for (JsonElement jsonElement : jsonArray) {
            if (jsonElement instanceof JsonObject) {
                arrayList.add(KWHzl((JsonObject) jsonElement));
            } else {
                arrayList.add(jsonElement);
            }
        }
        return new JsonArray(arrayList);
    }

    public static /* synthetic */ AbstractC58185ywX okServerExceptionFilter$default(AbstractC58185ywX abstractC58185ywX, java.lang.reflect.Type type, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            type = null;
        }
        return OLrzqt(abstractC58185ywX, type);
    }

    public static final <T> AbstractC58185ywX<ResponseData<T>> OLrzqt(@NotNull AbstractC58185ywX<ResponseData<T>> abstractC58185ywX, final java.lang.reflect.Type type) {
        Intrinsics.checkNotNullParameter(abstractC58185ywX, "");
        AbstractC58185ywX<ResponseData<T>> abstractC58185ywXAEQbTJ = yBG.AEQbTJ(new C13932dbs(abstractC58185ywX, new C13932dbs.Activity() { // from class: o.dbq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.C13932dbs.Activity
            public final boolean EZpvd(OKServerException oKServerException, InterfaceC60097zve interfaceC60097zve) {
                return C13933dbt.EZpvd(type, oKServerException, interfaceC60097zve);
            }
        }));
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final boolean EZpvd(java.lang.reflect.Type type, OKServerException oKServerException, InterfaceC60097zve interfaceC60097zve) {
        com.google.gson.JsonObject response = oKServerException.getResponse();
        if (response == null) {
            return false;
        }
        int code = oKServerException.getCode();
        java.lang.String message = oKServerException.getMessage();
        if (message == null) {
            message = "";
        }
        com.google.gson.JsonElement jsonElement = response.get("detailMsg");
        java.lang.String asString = jsonElement != null ? jsonElement.getAsString() : null;
        if (asString == null) {
            asString = "";
        }
        com.google.gson.JsonElement jsonElement2 = response.get(EopTrackEvent.KEY_ERROR_MESSAGE);
        java.lang.String asString2 = jsonElement2 != null ? jsonElement2.getAsString() : null;
        if (asString2 == null) {
            asString2 = "";
        }
        java.lang.Object objFromJson = type == null ? null : new Gson().fromJson(response.get("data"), type);
        com.google.gson.JsonElement jsonElement3 = response.get("error_code");
        java.lang.String asString3 = jsonElement3 != null ? jsonElement3.getAsString() : null;
        interfaceC60097zve.onNext(new ResponseData(code, message, asString, asString2, objFromJson, asString3 == null ? "" : asString3));
        interfaceC60097zve.onComplete();
        return true;
    }
}
