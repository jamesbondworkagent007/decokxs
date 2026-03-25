package com.reown.android.internal.common;

import com.reown.android.internal.common.JsonRpcResponse;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import o.yEE;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final class JsonRpcResponse_ErrorJsonAdapter extends JsonAdapter<JsonRpcResponse.Error> {
    public final JsonAdapter<Integer> intAdapter;
    public final JsonReader.Options options;
    public final JsonAdapter<String> stringAdapter;

    public JsonRpcResponse_ErrorJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "");
        JsonReader.Options optionsOf = JsonReader.Options.of("code", "message");
        Intrinsics.checkNotNullExpressionValue(optionsOf, "");
        this.options = optionsOf;
        JsonAdapter<Integer> jsonAdapterAdapter = moshi.adapter(Integer.TYPE, yEE.copydefault(), "code");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter, "");
        this.intAdapter = jsonAdapterAdapter;
        JsonAdapter<String> jsonAdapterAdapter2 = moshi.adapter(String.class, yEE.copydefault(), "message");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter2, "");
        this.stringAdapter = jsonAdapterAdapter2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(43);
        sb.append("GeneratedJsonAdapter(");
        sb.append("JsonRpcResponse.Error");
        sb.append(')');
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    /* JADX DEBUG: Method merged with bridge method: fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object; */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.JsonAdapter
    public JsonRpcResponse.Error fromJson(@NotNull JsonReader jsonReader) throws IOException {
        Intrinsics.checkNotNullParameter(jsonReader, "");
        jsonReader.beginObject();
        Integer numFromJson = null;
        String strFromJson = null;
        while (jsonReader.hasNext()) {
            int iSelectName = jsonReader.selectName(this.options);
            if (iSelectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (iSelectName == 0) {
                numFromJson = this.intAdapter.fromJson(jsonReader);
                if (numFromJson == null) {
                    JsonDataException jsonDataExceptionUnexpectedNull = Util.unexpectedNull("code", "code", jsonReader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull, "");
                    throw jsonDataExceptionUnexpectedNull;
                }
            } else if (iSelectName == 1 && (strFromJson = this.stringAdapter.fromJson(jsonReader)) == null) {
                JsonDataException jsonDataExceptionUnexpectedNull2 = Util.unexpectedNull("message", "message", jsonReader);
                Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull2, "");
                throw jsonDataExceptionUnexpectedNull2;
            }
        }
        jsonReader.endObject();
        if (numFromJson != null) {
            int iIntValue = numFromJson.intValue();
            if (strFromJson != null) {
                return new JsonRpcResponse.Error(iIntValue, strFromJson);
            }
            JsonDataException jsonDataExceptionMissingProperty = Util.missingProperty("message", "message", jsonReader);
            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty, "");
            throw jsonDataExceptionMissingProperty;
        }
        JsonDataException jsonDataExceptionMissingProperty2 = Util.missingProperty("code", "code", jsonReader);
        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty2, "");
        throw jsonDataExceptionMissingProperty2;
    }

    /* JADX DEBUG: Method merged with bridge method: toJson(Lcom/squareup/moshi/JsonWriter;Ljava/lang/Object;)V */
    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(@NotNull JsonWriter jsonWriter, JsonRpcResponse.Error error) throws IOException {
        Intrinsics.checkNotNullParameter(jsonWriter, "");
        if (error == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        jsonWriter.beginObject();
        jsonWriter.name("code");
        this.intAdapter.toJson(jsonWriter, Integer.valueOf(error.getCode()));
        jsonWriter.name("message");
        this.stringAdapter.toJson(jsonWriter, error.getMessage());
        jsonWriter.endObject();
    }
}
