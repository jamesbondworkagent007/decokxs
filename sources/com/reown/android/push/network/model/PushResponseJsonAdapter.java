package com.reown.android.push.network.model;

import com.reown.android.push.network.model.PushResponse;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import java.io.IOException;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import o.yEE;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final class PushResponseJsonAdapter extends JsonAdapter<PushResponse> {
    public final JsonAdapter<List<PushResponse.Error>> nullableListOfErrorAdapter;
    public final JsonAdapter<List<PushResponse.Field>> nullableListOfFieldAdapter;
    public final JsonReader.Options options;
    public final JsonAdapter<String> stringAdapter;

    public PushResponseJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "");
        JsonReader.Options optionsOf = JsonReader.Options.of("errors", "fields", "status");
        Intrinsics.checkNotNullExpressionValue(optionsOf, "");
        this.options = optionsOf;
        JsonAdapter<List<PushResponse.Error>> jsonAdapterAdapter = moshi.adapter(Types.newParameterizedType(List.class, PushResponse.Error.class), yEE.copydefault(), "errors");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter, "");
        this.nullableListOfErrorAdapter = jsonAdapterAdapter;
        JsonAdapter<List<PushResponse.Field>> jsonAdapterAdapter2 = moshi.adapter(Types.newParameterizedType(List.class, PushResponse.Field.class), yEE.copydefault(), "fields");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter2, "");
        this.nullableListOfFieldAdapter = jsonAdapterAdapter2;
        JsonAdapter<String> jsonAdapterAdapter3 = moshi.adapter(String.class, yEE.copydefault(), "status");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter3, "");
        this.stringAdapter = jsonAdapterAdapter3;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(34);
        sb.append("GeneratedJsonAdapter(");
        sb.append("PushResponse");
        sb.append(')');
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    /* JADX DEBUG: Method merged with bridge method: fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object; */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.JsonAdapter
    public PushResponse fromJson(@NotNull JsonReader jsonReader) throws IOException {
        Intrinsics.checkNotNullParameter(jsonReader, "");
        jsonReader.beginObject();
        String strFromJson = null;
        List<PushResponse.Error> listFromJson = null;
        List<PushResponse.Field> listFromJson2 = null;
        while (jsonReader.hasNext()) {
            int iSelectName = jsonReader.selectName(this.options);
            if (iSelectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (iSelectName == 0) {
                listFromJson = this.nullableListOfErrorAdapter.fromJson(jsonReader);
            } else if (iSelectName == 1) {
                listFromJson2 = this.nullableListOfFieldAdapter.fromJson(jsonReader);
            } else if (iSelectName == 2 && (strFromJson = this.stringAdapter.fromJson(jsonReader)) == null) {
                JsonDataException jsonDataExceptionUnexpectedNull = Util.unexpectedNull("status", "status", jsonReader);
                Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull, "");
                throw jsonDataExceptionUnexpectedNull;
            }
        }
        jsonReader.endObject();
        if (strFromJson != null) {
            return new PushResponse(listFromJson, listFromJson2, strFromJson);
        }
        JsonDataException jsonDataExceptionMissingProperty = Util.missingProperty("status", "status", jsonReader);
        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty, "");
        throw jsonDataExceptionMissingProperty;
    }

    /* JADX DEBUG: Method merged with bridge method: toJson(Lcom/squareup/moshi/JsonWriter;Ljava/lang/Object;)V */
    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(@NotNull JsonWriter jsonWriter, PushResponse pushResponse) throws IOException {
        Intrinsics.checkNotNullParameter(jsonWriter, "");
        if (pushResponse == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        jsonWriter.beginObject();
        jsonWriter.name("errors");
        this.nullableListOfErrorAdapter.toJson(jsonWriter, pushResponse.getErrors());
        jsonWriter.name("fields");
        this.nullableListOfFieldAdapter.toJson(jsonWriter, pushResponse.getFields());
        jsonWriter.name("status");
        this.stringAdapter.toJson(jsonWriter, pushResponse.getStatus());
        jsonWriter.endObject();
    }
}
