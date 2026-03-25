package com.amplifyframework.api.aws;

import com.amplifyframework.core.model.Model;
import com.amplifyframework.core.model.ModelList;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class ModelListDeserializer<M extends Model> implements JsonDeserializer<ModelList<? extends M>> {
    public static final Companion Companion = new Companion(null);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final void register(@NotNull GsonBuilder gsonBuilder) {
        Companion.register(gsonBuilder);
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lcom/google/gson/JsonElement;Ljava/lang/reflect/Type;Lcom/google/gson/JsonDeserializationContext;)Ljava/lang/Object; */
    @Override // com.google.gson.JsonDeserializer
    public ModelList<M> deserialize(@NotNull JsonElement jsonElement, @NotNull Type type, @NotNull JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        Intrinsics.checkNotNullParameter(jsonElement, "");
        Intrinsics.checkNotNullParameter(type, "");
        Intrinsics.checkNotNullParameter(jsonDeserializationContext, "");
        return new ApiLoadedModelList(LazyTypeDeserializersKt.deserializeItems(jsonElement, type, jsonDeserializationContext));
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.amplifyframework.api.aws.ModelListDeserializer.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final void register(@NotNull GsonBuilder gsonBuilder) {
            Intrinsics.checkNotNullParameter(gsonBuilder, "");
            gsonBuilder.registerTypeAdapter(ModelList.class, new ModelListDeserializer());
        }
    }
}
