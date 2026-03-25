package com.amplifyframework.api.aws;

import com.amplifyframework.core.model.LoadedModelReferenceImpl;
import com.amplifyframework.core.model.Model;
import com.amplifyframework.core.model.ModelReference;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import o.C56403yEb;
import o.C56423yEv;
import o.C56548yJl;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class ModelReferenceDeserializer<M extends Model> implements JsonDeserializer<ModelReference<M>> {
    private final String apiName;
    private final AWSApiSchemaRegistry schemaRegistry;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getApiName() {
        return this.apiName;
    }

    public ModelReferenceDeserializer(String str, @NotNull AWSApiSchemaRegistry aWSApiSchemaRegistry) {
        Intrinsics.checkNotNullParameter(aWSApiSchemaRegistry, "");
        this.apiName = str;
        this.schemaRegistry = aWSApiSchemaRegistry;
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lcom/google/gson/JsonElement;Ljava/lang/reflect/Type;Lcom/google/gson/JsonDeserializationContext;)Ljava/lang/Object; */
    @Override // com.google.gson.JsonDeserializer
    public ModelReference<M> deserialize(@NotNull JsonElement jsonElement, @NotNull Type type, @NotNull JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        Intrinsics.checkNotNullParameter(jsonElement, "");
        Intrinsics.checkNotNullParameter(type, "");
        Intrinsics.checkNotNullParameter(jsonDeserializationContext, "");
        ParameterizedType parameterizedType = type instanceof ParameterizedType ? (ParameterizedType) type : null;
        if (parameterizedType == null) {
            throw new JsonParseException("Expected a parameterized type during list deserialization.");
        }
        Type type2 = parameterizedType.getActualTypeArguments()[0];
        Intrinsics.copydefault(type2, "");
        Class cls = (Class) type2;
        JsonObject jsonObject = LazyTypeDeserializersKt.getJsonObject(jsonElement);
        List<String> primaryIndexFields = this.schemaRegistry.getModelSchemaForModelClass(cls).getPrimaryIndexFields();
        Intrinsics.checkNotNullExpressionValue(primaryIndexFields, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap(C56548yJl.copydefault(C56423yEv.copydefault(C56403yEb.AYXKKw(primaryIndexFields, 10)), 16));
        for (Object obj : primaryIndexFields) {
            linkedHashMap.put(obj, jsonObject.get((String) obj));
        }
        if (jsonObject.size() > linkedHashMap.size()) {
            try {
                return new LoadedModelReferenceImpl((Model) jsonDeserializationContext.deserialize(jsonElement, cls));
            } catch (Exception unused) {
            }
        }
        return new ApiLazyModelReference(cls, linkedHashMap, this.apiName, null, 8, null);
    }
}
