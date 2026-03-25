package o;

import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.uhc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C49070uhc {
    public static final android.os.Bundle OLrzqt(@NotNull JsonObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "");
        android.os.Bundle bundle = new android.os.Bundle();
        for (Map.Entry<java.lang.String, JsonElement> entry : jsonObject.entrySet()) {
            EZpvd(bundle, entry.getKey(), entry.getValue());
        }
        return bundle;
    }

    public static final void EZpvd(android.os.Bundle bundle, java.lang.String str, JsonElement jsonElement) {
        if (jsonElement instanceof JsonNull) {
            return;
        }
        if (jsonElement instanceof JsonPrimitive) {
            AEQbTJ(bundle, str, (JsonPrimitive) jsonElement);
            return;
        }
        if (!(jsonElement instanceof JsonObject)) {
            if (!(jsonElement instanceof JsonArray)) {
                throw new NoWhenBranchMatchedException();
            }
            Json.Default r0 = Json.Default;
            r0.getSerializersModule();
            bundle.putString(str, r0.encodeToString(JsonArray.Companion.serializer(), jsonElement));
            return;
        }
        Json.Default r02 = Json.Default;
        r02.getSerializersModule();
        bundle.putString(str, r02.encodeToString(JsonObject.Companion.serializer(), jsonElement));
    }

    public static final void AEQbTJ(android.os.Bundle bundle, java.lang.String str, JsonPrimitive jsonPrimitive) {
        if (jsonPrimitive.isString()) {
            bundle.putString(str, jsonPrimitive.getContent());
            return;
        }
        java.lang.Boolean booleanOrNull = JsonElementKt.getBooleanOrNull(jsonPrimitive);
        if (booleanOrNull != null) {
            bundle.putBoolean(str, booleanOrNull.booleanValue());
            return;
        }
        java.lang.Long longOrNull = JsonElementKt.getLongOrNull(jsonPrimitive);
        if (longOrNull != null) {
            long jLongValue = longOrNull.longValue();
            if (-2147483648L <= jLongValue && jLongValue <= 2147483647L) {
                java.lang.Integer intOrNull = JsonElementKt.getIntOrNull(jsonPrimitive);
                int i = (int) jLongValue;
                if (intOrNull != null && intOrNull.intValue() == i) {
                    bundle.putInt(str, i);
                    return;
                }
            }
            bundle.putLong(str, jLongValue);
            return;
        }
        java.lang.Double doubleOrNull = JsonElementKt.getDoubleOrNull(jsonPrimitive);
        if (doubleOrNull != null) {
            bundle.putDouble(str, doubleOrNull.doubleValue());
        } else {
            bundle.putString(str, jsonPrimitive.getContent());
        }
    }
}
