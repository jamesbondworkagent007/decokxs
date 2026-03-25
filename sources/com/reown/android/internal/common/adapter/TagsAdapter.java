package com.reown.android.internal.common.adapter;

import com.reown.android.internal.common.model.Tags;
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
public final class TagsAdapter extends JsonAdapter<Tags> {
    public static final TagsAdapter INSTANCE = new TagsAdapter();

    /* JADX INFO: loaded from: classes17.dex */
    @Retention(RetentionPolicy.RUNTIME)
    @JsonQualifier
    public @interface Qualifier {
    }

    /* JADX DEBUG: Method merged with bridge method: fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object; */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.JsonAdapter
    @Qualifier
    @FromJson
    public /* synthetic */ Tags fromJson(JsonReader jsonReader) {
        Intrinsics.checkNotNullParameter(jsonReader, "");
        jsonReader.setLenient(true);
        Integer numValueOf = (jsonReader.hasNext() && jsonReader.peek() == JsonReader.Token.NUMBER) ? Integer.valueOf(jsonReader.nextInt()) : null;
        for (Tags tags : Tags.values()) {
            int id = tags.getId();
            if (numValueOf != null && id == numValueOf.intValue()) {
                return tags;
            }
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: toJson(Lcom/squareup/moshi/JsonWriter;Ljava/lang/Object;)V */
    @Override // com.squareup.moshi.JsonAdapter
    @ToJson
    public /* synthetic */ void toJson(JsonWriter jsonWriter, @Qualifier Tags tags) throws IOException {
        Intrinsics.checkNotNullParameter(jsonWriter, "");
        if (tags != null) {
            jsonWriter.value(Integer.valueOf(tags.getId()));
        } else {
            jsonWriter.value(0L);
        }
    }
}
