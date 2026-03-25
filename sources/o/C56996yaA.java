package o;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonObjectBuilder;
import kotlinx.serialization.json.JsonPrimitive;
import kotlinx.serialization.json.JsonTransformingSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yaA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C56996yaA extends JsonTransformingSerializer<com.okinc.wallet.hardware.api.onekey.Path> {
    public static final C56996yaA KWHzl = new C56996yaA();

    private C56996yaA() {
        super(com.okinc.wallet.hardware.api.onekey.Path.Companion.serializer());
    }

    @Override // kotlinx.serialization.json.JsonTransformingSerializer
    public JsonElement transformDeserialize(@NotNull JsonElement jsonElement) {
        Intrinsics.checkNotNullParameter(jsonElement, "");
        if (!(jsonElement instanceof JsonPrimitive)) {
            if (!(jsonElement instanceof JsonArray)) {
                throw new java.lang.IllegalStateException("Unknown `element` type: " + jsonElement);
            }
            JsonObjectBuilder jsonObjectBuilder = new JsonObjectBuilder();
            jsonObjectBuilder.put("segments", jsonElement);
            return jsonObjectBuilder.build();
        }
        JsonObjectBuilder jsonObjectBuilder2 = new JsonObjectBuilder();
        jsonObjectBuilder2.put("path", jsonElement);
        return jsonObjectBuilder2.build();
    }

    @Override // kotlinx.serialization.json.JsonTransformingSerializer
    public JsonElement transformSerialize(@NotNull JsonElement jsonElement) {
        Intrinsics.checkNotNullParameter(jsonElement, "");
        JsonElement jsonElement2 = (JsonElement) JsonElementKt.getJsonObject(jsonElement).get((java.lang.Object) "path");
        JsonElement jsonElement3 = (JsonElement) JsonElementKt.getJsonObject(jsonElement).get((java.lang.Object) "segments");
        if (jsonElement2 != null && jsonElement3 == null) {
            return jsonElement2;
        }
        if (jsonElement2 != null || jsonElement3 == null) {
            throw new java.lang.IllegalStateException("Only one of `path` and `segments` can be null");
        }
        return jsonElement3;
    }
}
