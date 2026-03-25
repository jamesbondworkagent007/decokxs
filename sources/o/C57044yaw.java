package o;

import com.okinc.wallet.hardware.api.onekey.HDNodePathType;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonObjectBuilder;
import kotlinx.serialization.json.JsonPrimitive;
import kotlinx.serialization.json.JsonTransformingSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yaw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C57044yaw extends JsonTransformingSerializer<HDNodePathType.NodeType> {
    public static final C57044yaw OLrzqt = new C57044yaw();

    private C57044yaw() {
        super(HDNodePathType.NodeType.Companion.serializer());
    }

    @Override // kotlinx.serialization.json.JsonTransformingSerializer
    public JsonElement transformSerialize(@NotNull JsonElement jsonElement) {
        Intrinsics.checkNotNullParameter(jsonElement, "");
        JsonElement jsonElement2 = (JsonElement) JsonElementKt.getJsonObject(jsonElement).get((java.lang.Object) "stringNode");
        JsonElement jsonElement3 = (JsonElement) JsonElementKt.getJsonObject(jsonElement).get((java.lang.Object) "typedNode");
        if (jsonElement2 != null && jsonElement3 == null) {
            return jsonElement2;
        }
        if (jsonElement2 != null || jsonElement3 == null) {
            throw new java.lang.IllegalStateException("Only one of `stringNode` and `typedNode` can be null");
        }
        return jsonElement3;
    }

    /* JADX DEBUG: Method merged with bridge method: transformDeserialize(Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonElement; */
    @Override // kotlinx.serialization.json.JsonTransformingSerializer
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public JsonObject transformDeserialize(@NotNull JsonElement jsonElement) {
        Intrinsics.checkNotNullParameter(jsonElement, "");
        if (!(jsonElement instanceof JsonObject)) {
            if (!(jsonElement instanceof JsonPrimitive)) {
                throw new java.lang.IllegalStateException("Invalid element type: " + jsonElement);
            }
            JsonObjectBuilder jsonObjectBuilder = new JsonObjectBuilder();
            jsonObjectBuilder.put("stringNode", jsonElement);
            return jsonObjectBuilder.build();
        }
        JsonObjectBuilder jsonObjectBuilder2 = new JsonObjectBuilder();
        jsonObjectBuilder2.put("typedNode", jsonElement);
        return jsonObjectBuilder2.build();
    }
}
