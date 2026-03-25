package com.reown.foundation.common.adapters;

import com.reown.foundation.common.model.Ttl;
import com.squareup.moshi.FromJson;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonQualifier;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.ToJson;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class TtlAdapter extends JsonAdapter<Ttl> {
    public static final TtlAdapter INSTANCE = new TtlAdapter();

    /* JADX INFO: loaded from: classes17.dex */
    @Retention(RetentionPolicy.RUNTIME)
    @JsonQualifier
    public @interface Qualifier {
    }

    private TtlAdapter() {
    }

    /* JADX DEBUG: Method merged with bridge method: fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object; */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.JsonAdapter
    @Qualifier
    @FromJson
    public /* synthetic */ Ttl fromJson(JsonReader jsonReader) {
        Intrinsics.checkNotNullParameter(jsonReader, "");
        jsonReader.setLenient(true);
        Long lValueOf = (jsonReader.hasNext() && jsonReader.peek() == JsonReader.Token.NUMBER) ? Long.valueOf(jsonReader.nextLong()) : null;
        if (lValueOf != null) {
            return new Ttl(lValueOf.longValue());
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: toJson(Lcom/squareup/moshi/JsonWriter;Ljava/lang/Object;)V */
    @Override // com.squareup.moshi.JsonAdapter
    @ToJson
    public /* synthetic */ void toJson(JsonWriter jsonWriter, @Qualifier Ttl ttl) throws IOException {
        Intrinsics.checkNotNullParameter(jsonWriter, "");
        if (ttl != null) {
            jsonWriter.value(ttl.getSeconds());
        } else {
            jsonWriter.value(0L);
        }
    }
}
