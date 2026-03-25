package com.reown.android.internal.common.explorer.data.network.model;

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
public final class SupportedStandardDTOJsonAdapter extends JsonAdapter<SupportedStandardDTO> {
    public final JsonAdapter<Integer> intAdapter;
    public final JsonReader.Options options;
    public final JsonAdapter<String> stringAdapter;

    public SupportedStandardDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "");
        JsonReader.Options optionsOf = JsonReader.Options.of("id", "url", "title", "standard_id", "standard_prefix");
        Intrinsics.checkNotNullExpressionValue(optionsOf, "");
        this.options = optionsOf;
        JsonAdapter<String> jsonAdapterAdapter = moshi.adapter(String.class, yEE.copydefault(), "id");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter, "");
        this.stringAdapter = jsonAdapterAdapter;
        JsonAdapter<Integer> jsonAdapterAdapter2 = moshi.adapter(Integer.TYPE, yEE.copydefault(), "standardId");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter2, "");
        this.intAdapter = jsonAdapterAdapter2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(42);
        sb.append("GeneratedJsonAdapter(");
        sb.append("SupportedStandardDTO");
        sb.append(')');
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    /* JADX DEBUG: Method merged with bridge method: fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object; */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.JsonAdapter
    public SupportedStandardDTO fromJson(@NotNull JsonReader jsonReader) throws IOException {
        Intrinsics.checkNotNullParameter(jsonReader, "");
        jsonReader.beginObject();
        Integer numFromJson = null;
        String strFromJson = null;
        String strFromJson2 = null;
        String strFromJson3 = null;
        String strFromJson4 = null;
        while (jsonReader.hasNext()) {
            int iSelectName = jsonReader.selectName(this.options);
            String str = strFromJson4;
            if (iSelectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (iSelectName == 0) {
                strFromJson = this.stringAdapter.fromJson(jsonReader);
                if (strFromJson == null) {
                    JsonDataException jsonDataExceptionUnexpectedNull = Util.unexpectedNull("id", "id", jsonReader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull, "");
                    throw jsonDataExceptionUnexpectedNull;
                }
            } else if (iSelectName == 1) {
                strFromJson2 = this.stringAdapter.fromJson(jsonReader);
                if (strFromJson2 == null) {
                    JsonDataException jsonDataExceptionUnexpectedNull2 = Util.unexpectedNull("url", "url", jsonReader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull2, "");
                    throw jsonDataExceptionUnexpectedNull2;
                }
            } else if (iSelectName == 2) {
                strFromJson3 = this.stringAdapter.fromJson(jsonReader);
                if (strFromJson3 == null) {
                    JsonDataException jsonDataExceptionUnexpectedNull3 = Util.unexpectedNull("title", "title", jsonReader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull3, "");
                    throw jsonDataExceptionUnexpectedNull3;
                }
            } else if (iSelectName == 3) {
                numFromJson = this.intAdapter.fromJson(jsonReader);
                if (numFromJson == null) {
                    JsonDataException jsonDataExceptionUnexpectedNull4 = Util.unexpectedNull("standardId", "standard_id", jsonReader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull4, "");
                    throw jsonDataExceptionUnexpectedNull4;
                }
            } else if (iSelectName == 4) {
                strFromJson4 = this.stringAdapter.fromJson(jsonReader);
                if (strFromJson4 == null) {
                    JsonDataException jsonDataExceptionUnexpectedNull5 = Util.unexpectedNull("standardPrefix", "standard_prefix", jsonReader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull5, "");
                    throw jsonDataExceptionUnexpectedNull5;
                }
            }
            strFromJson4 = str;
        }
        String str2 = strFromJson4;
        jsonReader.endObject();
        if (strFromJson == null) {
            JsonDataException jsonDataExceptionMissingProperty = Util.missingProperty("id", "id", jsonReader);
            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty, "");
            throw jsonDataExceptionMissingProperty;
        }
        if (strFromJson2 == null) {
            JsonDataException jsonDataExceptionMissingProperty2 = Util.missingProperty("url", "url", jsonReader);
            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty2, "");
            throw jsonDataExceptionMissingProperty2;
        }
        if (strFromJson3 == null) {
            JsonDataException jsonDataExceptionMissingProperty3 = Util.missingProperty("title", "title", jsonReader);
            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty3, "");
            throw jsonDataExceptionMissingProperty3;
        }
        if (numFromJson != null) {
            int iIntValue = numFromJson.intValue();
            if (str2 != null) {
                return new SupportedStandardDTO(strFromJson, strFromJson2, strFromJson3, iIntValue, str2);
            }
            JsonDataException jsonDataExceptionMissingProperty4 = Util.missingProperty("standardPrefix", "standard_prefix", jsonReader);
            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty4, "");
            throw jsonDataExceptionMissingProperty4;
        }
        JsonDataException jsonDataExceptionMissingProperty5 = Util.missingProperty("standardId", "standard_id", jsonReader);
        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty5, "");
        throw jsonDataExceptionMissingProperty5;
    }

    /* JADX DEBUG: Method merged with bridge method: toJson(Lcom/squareup/moshi/JsonWriter;Ljava/lang/Object;)V */
    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(@NotNull JsonWriter jsonWriter, SupportedStandardDTO supportedStandardDTO) throws IOException {
        Intrinsics.checkNotNullParameter(jsonWriter, "");
        if (supportedStandardDTO == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        jsonWriter.beginObject();
        jsonWriter.name("id");
        this.stringAdapter.toJson(jsonWriter, supportedStandardDTO.getId());
        jsonWriter.name("url");
        this.stringAdapter.toJson(jsonWriter, supportedStandardDTO.getUrl());
        jsonWriter.name("title");
        this.stringAdapter.toJson(jsonWriter, supportedStandardDTO.getTitle());
        jsonWriter.name("standard_id");
        this.intAdapter.toJson(jsonWriter, Integer.valueOf(supportedStandardDTO.getStandardId()));
        jsonWriter.name("standard_prefix");
        this.stringAdapter.toJson(jsonWriter, supportedStandardDTO.getStandardPrefix());
        jsonWriter.endObject();
    }
}
