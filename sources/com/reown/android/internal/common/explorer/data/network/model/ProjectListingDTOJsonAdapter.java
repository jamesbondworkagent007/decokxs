package com.reown.android.internal.common.explorer.data.network.model;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import java.io.IOException;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import o.yEE;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final class ProjectListingDTOJsonAdapter extends JsonAdapter<ProjectListingDTO> {
    public final JsonAdapter<Integer> intAdapter;
    public final JsonAdapter<Map<String, ProjectDTO>> mapOfStringProjectDTOAdapter;
    public final JsonReader.Options options;

    public ProjectListingDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "");
        JsonReader.Options optionsOf = JsonReader.Options.of("projects", "count", "total");
        Intrinsics.checkNotNullExpressionValue(optionsOf, "");
        this.options = optionsOf;
        JsonAdapter<Map<String, ProjectDTO>> jsonAdapterAdapter = moshi.adapter(Types.newParameterizedType(Map.class, String.class, ProjectDTO.class), yEE.copydefault(), "projects");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter, "");
        this.mapOfStringProjectDTOAdapter = jsonAdapterAdapter;
        JsonAdapter<Integer> jsonAdapterAdapter2 = moshi.adapter(Integer.TYPE, yEE.copydefault(), "count");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter2, "");
        this.intAdapter = jsonAdapterAdapter2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(39);
        sb.append("GeneratedJsonAdapter(");
        sb.append("ProjectListingDTO");
        sb.append(')');
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    /* JADX DEBUG: Method merged with bridge method: fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object; */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.JsonAdapter
    public ProjectListingDTO fromJson(@NotNull JsonReader jsonReader) throws IOException {
        Intrinsics.checkNotNullParameter(jsonReader, "");
        jsonReader.beginObject();
        Map<String, ProjectDTO> mapFromJson = null;
        Integer numFromJson = null;
        Integer numFromJson2 = null;
        while (jsonReader.hasNext()) {
            int iSelectName = jsonReader.selectName(this.options);
            if (iSelectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (iSelectName == 0) {
                mapFromJson = this.mapOfStringProjectDTOAdapter.fromJson(jsonReader);
                if (mapFromJson == null) {
                    JsonDataException jsonDataExceptionUnexpectedNull = Util.unexpectedNull("projects", "projects", jsonReader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull, "");
                    throw jsonDataExceptionUnexpectedNull;
                }
            } else if (iSelectName == 1) {
                numFromJson = this.intAdapter.fromJson(jsonReader);
                if (numFromJson == null) {
                    JsonDataException jsonDataExceptionUnexpectedNull2 = Util.unexpectedNull("count", "count", jsonReader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull2, "");
                    throw jsonDataExceptionUnexpectedNull2;
                }
            } else if (iSelectName == 2 && (numFromJson2 = this.intAdapter.fromJson(jsonReader)) == null) {
                JsonDataException jsonDataExceptionUnexpectedNull3 = Util.unexpectedNull("total", "total", jsonReader);
                Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull3, "");
                throw jsonDataExceptionUnexpectedNull3;
            }
        }
        jsonReader.endObject();
        if (mapFromJson == null) {
            JsonDataException jsonDataExceptionMissingProperty = Util.missingProperty("projects", "projects", jsonReader);
            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty, "");
            throw jsonDataExceptionMissingProperty;
        }
        if (numFromJson != null) {
            int iIntValue = numFromJson.intValue();
            if (numFromJson2 != null) {
                return new ProjectListingDTO(mapFromJson, iIntValue, numFromJson2.intValue());
            }
            JsonDataException jsonDataExceptionMissingProperty2 = Util.missingProperty("total", "total", jsonReader);
            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty2, "");
            throw jsonDataExceptionMissingProperty2;
        }
        JsonDataException jsonDataExceptionMissingProperty3 = Util.missingProperty("count", "count", jsonReader);
        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty3, "");
        throw jsonDataExceptionMissingProperty3;
    }

    /* JADX DEBUG: Method merged with bridge method: toJson(Lcom/squareup/moshi/JsonWriter;Ljava/lang/Object;)V */
    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(@NotNull JsonWriter jsonWriter, ProjectListingDTO projectListingDTO) throws IOException {
        Intrinsics.checkNotNullParameter(jsonWriter, "");
        if (projectListingDTO == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        jsonWriter.beginObject();
        jsonWriter.name("projects");
        this.mapOfStringProjectDTOAdapter.toJson(jsonWriter, projectListingDTO.getProjects());
        jsonWriter.name("count");
        this.intAdapter.toJson(jsonWriter, Integer.valueOf(projectListingDTO.getCount()));
        jsonWriter.name("total");
        this.intAdapter.toJson(jsonWriter, Integer.valueOf(projectListingDTO.getTotal()));
        jsonWriter.endObject();
    }
}
