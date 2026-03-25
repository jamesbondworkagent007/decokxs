package com.amplifyframework.datastore.appsync;

import com.amplifyframework.core.Amplify;
import com.amplifyframework.core.category.CategoryType;
import com.amplifyframework.core.model.CustomTypeField;
import com.amplifyframework.core.model.CustomTypeSchema;
import com.amplifyframework.core.model.SerializedCustomType;
import com.amplifyframework.logging.Logger;
import com.amplifyframework.util.GsonObjectConverter;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes21.dex */
public final class SerializedCustomTypeAdapter implements JsonDeserializer<SerializedCustomType>, JsonSerializer<SerializedCustomType> {
    private static final Logger LOGGER = Amplify.Logging.logger(CategoryType.DATASTORE, SerializedCustomTypeAdapter.class.getName());

    private SerializedCustomTypeAdapter() {
    }

    public static void register(GsonBuilder gsonBuilder) {
        gsonBuilder.registerTypeAdapter(SerializedCustomType.class, new SerializedCustomTypeAdapter());
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Ljava/lang/Object;Ljava/lang/reflect/Type;Lcom/google/gson/JsonSerializationContext;)Lcom/google/gson/JsonElement; */
    @Override // com.google.gson.JsonSerializer
    public JsonElement serialize(SerializedCustomType serializedCustomType, Type type, JsonSerializationContext jsonSerializationContext) {
        LOGGER.verbose(String.format("serialize: src=%s, typeOfSrc=%s", serializedCustomType, type));
        CustomTypeSchema customTypeSchema = serializedCustomType.getCustomTypeSchema();
        JsonObject jsonObject = new JsonObject();
        jsonObject.add("customTypeSchema", jsonSerializationContext.serialize(customTypeSchema));
        JsonObject jsonObject2 = new JsonObject();
        for (Map.Entry<String, Object> entry : serializedCustomType.getSerializedData().entrySet()) {
            Object value = entry.getValue();
            if (value instanceof SerializedCustomType) {
                jsonObject2.add(entry.getKey(), jsonSerializationContext.serialize((SerializedCustomType) value));
            } else {
                jsonObject2.add(entry.getKey(), jsonSerializationContext.serialize(value));
            }
        }
        jsonObject.add("serializedData", jsonObject2);
        return jsonObject;
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lcom/google/gson/JsonElement;Ljava/lang/reflect/Type;Lcom/google/gson/JsonDeserializationContext;)Ljava/lang/Object; */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.gson.JsonDeserializer
    public SerializedCustomType deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        LOGGER.verbose(String.format("deserialize: json=%s, typeOfT=%s", jsonElement, type));
        JsonObject asJsonObject = jsonElement.getAsJsonObject();
        CustomTypeSchema customTypeSchema = (CustomTypeSchema) jsonDeserializationContext.deserialize(asJsonObject.get("customTypeSchema"), CustomTypeSchema.class);
        JsonObject asJsonObject2 = asJsonObject.get("serializedData").getAsJsonObject();
        HashMap map = new HashMap(GsonObjectConverter.toMap(asJsonObject2));
        for (Map.Entry<String, JsonElement> entry : asJsonObject2.entrySet()) {
            CustomTypeField customTypeField = customTypeSchema.getFields().get(entry.getKey());
            if (customTypeField != null) {
                JsonElement value = entry.getValue();
                String name = customTypeField.getName();
                if (customTypeField.isCustomType()) {
                    if (!customTypeField.isArray() && value.isJsonObject()) {
                        map.put(name, jsonDeserializationContext.deserialize(value, SerializedCustomType.class));
                    } else if (customTypeField.isArray() && value.isJsonArray()) {
                        JsonArray asJsonArray = value.getAsJsonArray();
                        ArrayList arrayList = new ArrayList();
                        for (int i = 0; i < asJsonArray.size(); i++) {
                            arrayList.add(jsonDeserializationContext.deserialize(asJsonArray.get(i), SerializedCustomType.class));
                        }
                        map.put(name, arrayList);
                    }
                }
            }
        }
        return SerializedCustomType.builder().serializedData(map).customTypeSchema(customTypeSchema).build();
    }
}
