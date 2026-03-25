package com.okinc.lexical.parser;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonSyntaxException;
import java.lang.reflect.Type;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class IntegerDefault0Adapter implements JsonDeserializer<Integer> {
    /* JADX DEBUG: Method merged with bridge method: deserialize(Lcom/google/gson/JsonElement;Ljava/lang/reflect/Type;Lcom/google/gson/JsonDeserializationContext;)Ljava/lang/Object; */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001f, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.EZpvd((java.lang.Object) r2.getAsString(), (java.lang.Object) kotlinx.serialization.json.internal.AbstractJsonLexerKt.NULL) != false) goto L7;
     */
    @Override // com.google.gson.JsonDeserializer
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Integer deserialize(@NotNull JsonElement jsonElement, @NotNull Type type, @NotNull JsonDeserializationContext jsonDeserializationContext) {
        Intrinsics.checkNotNullParameter(jsonElement, "");
        Intrinsics.checkNotNullParameter(type, "");
        Intrinsics.checkNotNullParameter(jsonDeserializationContext, "");
        try {
            if (!Intrinsics.EZpvd((Object) jsonElement.getAsString(), (Object) "")) {
            }
            return 0;
        } catch (Exception unused) {
        }
        try {
            return Integer.valueOf(jsonElement.getAsInt());
        } catch (NumberFormatException e) {
            throw new JsonSyntaxException(e);
        }
    }
}
