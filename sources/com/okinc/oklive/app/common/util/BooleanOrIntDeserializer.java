package com.okinc.oklive.app.common.util;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import java.lang.reflect.Type;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes24.dex */
public final class BooleanOrIntDeserializer implements JsonDeserializer<Boolean> {
    /* JADX DEBUG: Method merged with bridge method: deserialize(Lcom/google/gson/JsonElement;Ljava/lang/reflect/Type;Lcom/google/gson/JsonDeserializationContext;)Ljava/lang/Object; */
    @Override // com.google.gson.JsonDeserializer
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public Boolean deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        if (jsonElement != null && !jsonElement.isJsonNull()) {
            try {
                if (jsonElement.isJsonPrimitive()) {
                    JsonPrimitive asJsonPrimitive = jsonElement.getAsJsonPrimitive();
                    if (asJsonPrimitive.isBoolean()) {
                        return Boolean.valueOf(asJsonPrimitive.getAsBoolean());
                    }
                    if (asJsonPrimitive.isNumber()) {
                        boolean z = true;
                        if (asJsonPrimitive.getAsInt() != 1) {
                            z = false;
                        }
                        return Boolean.valueOf(z);
                    }
                    if (asJsonPrimitive.isString()) {
                        String asString = asJsonPrimitive.getAsString();
                        Intrinsics.checkNotNullExpressionValue(asString, "");
                        String lowerCase = asString.toLowerCase(Locale.ROOT);
                        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                        int iHashCode = lowerCase.hashCode();
                        if (iHashCode == 48) {
                            if (!lowerCase.equals("0")) {
                            }
                            return Boolean.FALSE;
                        }
                        if (iHashCode == 49) {
                            if (!lowerCase.equals("1")) {
                            }
                            return Boolean.TRUE;
                        }
                        if (iHashCode == 3569038) {
                            if (!lowerCase.equals("true")) {
                            }
                            return Boolean.TRUE;
                        }
                        if (iHashCode != 97196323 || !lowerCase.equals("false")) {
                        }
                        return Boolean.FALSE;
                    }
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }
}
