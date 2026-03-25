package o;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.eaX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C15939eaX {
    public final JsonObject KWHzl(@NotNull JsonObject jsonObject, @NotNull java.lang.String str) {
        JsonObject jsonObject2;
        JsonArray jsonArray;
        JsonObject jsonObject3;
        JsonPrimitive jsonPrimitive;
        Intrinsics.checkNotNullParameter(jsonObject, "");
        Intrinsics.checkNotNullParameter(str, "");
        java.util.Map mapIsConnected = C56424yEw.isConnected(jsonObject);
        JsonElement jsonElement = (JsonElement) jsonObject.get("data");
        if (jsonElement == null || (jsonObject2 = JsonElementKt.getJsonObject(jsonElement)) == null) {
            jsonObject2 = new JsonObject(C56424yEw.KWHzl());
        }
        java.util.Map mapIsConnected2 = C56424yEw.isConnected(jsonObject2);
        JsonElement jsonElement2 = (JsonElement) jsonObject2.get((java.lang.Object) "msgs");
        if (jsonElement2 == null || (jsonArray = JsonElementKt.getJsonArray(jsonElement2)) == null) {
            jsonArray = new JsonArray(yDY.AhwBna());
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(jsonArray, 10));
        for (JsonElement jsonObject4 : jsonArray) {
            JsonObject jsonObject5 = JsonElementKt.getJsonObject(jsonObject4);
            JsonElement jsonElement3 = (JsonElement) jsonObject5.get((java.lang.Object) "type");
            if (Intrinsics.EZpvd((java.lang.Object) ((jsonElement3 == null || (jsonPrimitive = JsonElementKt.getJsonPrimitive(jsonElement3)) == null) ? null : jsonPrimitive.getContent()), (java.lang.Object) "sign/MsgSignData")) {
                JsonElement jsonElement4 = (JsonElement) jsonObject5.get((java.lang.Object) "value");
                if (jsonElement4 == null || (jsonObject3 = JsonElementKt.getJsonObject(jsonElement4)) == null) {
                    jsonObject3 = new JsonObject(C56424yEw.KWHzl());
                }
                java.util.Map mapIsConnected3 = C56424yEw.isConnected(jsonObject3);
                mapIsConnected3.put("signer", JsonElementKt.JsonPrimitive(str));
                java.util.Map mapIsConnected4 = C56424yEw.isConnected(jsonObject5);
                mapIsConnected4.put("value", new JsonObject(mapIsConnected3));
                jsonObject4 = new JsonObject(mapIsConnected4);
            }
            arrayList.add(jsonObject4);
        }
        mapIsConnected2.put("msgs", new JsonArray(arrayList));
        mapIsConnected.put("data", new JsonObject(mapIsConnected2));
        return new JsonObject(mapIsConnected);
    }
}
