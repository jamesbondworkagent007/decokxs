package com.jakewharton.retrofit2.converter.kotlinx.serialization;

import java.io.IOException;
import java.lang.reflect.Type;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialFormat;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.SerializersKt;
import kotlinx.serialization.StringFormat;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Serializer {
    public abstract <T> T KWHzl(@NotNull DeserializationStrategy<T> deserializationStrategy, @NotNull ResponseBody responseBody);

    public abstract SerialFormat KWHzl();

    public abstract <T> RequestBody KWHzl(@NotNull MediaType mediaType, @NotNull SerializationStrategy<? super T> serializationStrategy, T t);

    private Serializer() {
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:16) call: com.jakewharton.retrofit2.converter.kotlinx.serialization.Serializer.<init>():void type: THIS */
    public /* synthetic */ Serializer(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @ExperimentalSerializationApi
    public final KSerializer<Object> serializer(@NotNull Type type) {
        Intrinsics.checkNotNullParameter(type, "");
        return SerializersKt.serializer(KWHzl().getSerializersModule(), type);
    }

    public static final class TaskDescription extends Serializer {
        public final StringFormat KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: KWHzl()Lkotlinx/serialization/SerialFormat; */
        @Override // com.jakewharton.retrofit2.converter.kotlinx.serialization.Serializer
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public StringFormat KWHzl() {
            return this.KWHzl;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull StringFormat stringFormat) {
            super(null);
            Intrinsics.checkNotNullParameter(stringFormat, "");
            this.KWHzl = stringFormat;
        }

        @Override // com.jakewharton.retrofit2.converter.kotlinx.serialization.Serializer
        public <T> T KWHzl(@NotNull DeserializationStrategy<T> deserializationStrategy, @NotNull ResponseBody responseBody) throws IOException {
            Intrinsics.checkNotNullParameter(deserializationStrategy, "");
            Intrinsics.checkNotNullParameter(responseBody, "");
            String strString = responseBody.string();
            Intrinsics.checkNotNullExpressionValue(strString, "");
            return (T) KWHzl().decodeFromString(deserializationStrategy, strString);
        }

        @Override // com.jakewharton.retrofit2.converter.kotlinx.serialization.Serializer
        public <T> RequestBody KWHzl(@NotNull MediaType mediaType, @NotNull SerializationStrategy<? super T> serializationStrategy, T t) {
            Intrinsics.checkNotNullParameter(mediaType, "");
            Intrinsics.checkNotNullParameter(serializationStrategy, "");
            RequestBody requestBodyCreate = RequestBody.create(mediaType, KWHzl().encodeToString(serializationStrategy, t));
            Intrinsics.checkNotNullExpressionValue(requestBodyCreate, "");
            return requestBodyCreate;
        }
    }
}
