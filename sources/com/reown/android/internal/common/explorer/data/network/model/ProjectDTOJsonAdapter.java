package com.reown.android.internal.common.explorer.data.network.model;

import com.okinc.p2p.api.OtcExtraKeys;
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
public final class ProjectDTOJsonAdapter extends JsonAdapter<ProjectDTO> {
    public final JsonAdapter<ImageUrlDTO> nullableImageUrlDTOAdapter;
    public final JsonAdapter<Long> nullableLongAdapter;
    public final JsonAdapter<String> nullableStringAdapter;
    public final JsonReader.Options options;
    public final JsonAdapter<String> stringAdapter;

    public ProjectDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "");
        JsonReader.Options optionsOf = JsonReader.Options.of("id", "name", "homepage", "image_id", "description", "image_url", "dapp_url", OtcExtraKeys.ORDER);
        Intrinsics.checkNotNullExpressionValue(optionsOf, "");
        this.options = optionsOf;
        JsonAdapter<String> jsonAdapterAdapter = moshi.adapter(String.class, yEE.copydefault(), "id");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter, "");
        this.stringAdapter = jsonAdapterAdapter;
        JsonAdapter<String> jsonAdapterAdapter2 = moshi.adapter(String.class, yEE.copydefault(), "name");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter2, "");
        this.nullableStringAdapter = jsonAdapterAdapter2;
        JsonAdapter<ImageUrlDTO> jsonAdapterAdapter3 = moshi.adapter(ImageUrlDTO.class, yEE.copydefault(), "imageUrl");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter3, "");
        this.nullableImageUrlDTOAdapter = jsonAdapterAdapter3;
        JsonAdapter<Long> jsonAdapterAdapter4 = moshi.adapter(Long.class, yEE.copydefault(), OtcExtraKeys.ORDER);
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter4, "");
        this.nullableLongAdapter = jsonAdapterAdapter4;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append("GeneratedJsonAdapter(");
        sb.append("ProjectDTO");
        sb.append(')');
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    /* JADX DEBUG: Method merged with bridge method: fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object; */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.JsonAdapter
    public ProjectDTO fromJson(@NotNull JsonReader jsonReader) throws IOException {
        Intrinsics.checkNotNullParameter(jsonReader, "");
        jsonReader.beginObject();
        String strFromJson = null;
        String strFromJson2 = null;
        String strFromJson3 = null;
        String strFromJson4 = null;
        String strFromJson5 = null;
        ImageUrlDTO imageUrlDTOFromJson = null;
        String strFromJson6 = null;
        Long lFromJson = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    strFromJson = this.stringAdapter.fromJson(jsonReader);
                    if (strFromJson == null) {
                        JsonDataException jsonDataExceptionUnexpectedNull = Util.unexpectedNull("id", "id", jsonReader);
                        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull, "");
                        throw jsonDataExceptionUnexpectedNull;
                    }
                    break;
                    break;
                case 1:
                    strFromJson2 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 2:
                    strFromJson3 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 3:
                    strFromJson4 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 4:
                    strFromJson5 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 5:
                    imageUrlDTOFromJson = this.nullableImageUrlDTOAdapter.fromJson(jsonReader);
                    break;
                case 6:
                    strFromJson6 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 7:
                    lFromJson = this.nullableLongAdapter.fromJson(jsonReader);
                    break;
            }
        }
        jsonReader.endObject();
        if (strFromJson != null) {
            return new ProjectDTO(strFromJson, strFromJson2, strFromJson3, strFromJson4, strFromJson5, imageUrlDTOFromJson, strFromJson6, lFromJson);
        }
        JsonDataException jsonDataExceptionMissingProperty = Util.missingProperty("id", "id", jsonReader);
        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty, "");
        throw jsonDataExceptionMissingProperty;
    }

    /* JADX DEBUG: Method merged with bridge method: toJson(Lcom/squareup/moshi/JsonWriter;Ljava/lang/Object;)V */
    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(@NotNull JsonWriter jsonWriter, ProjectDTO projectDTO) throws IOException {
        Intrinsics.checkNotNullParameter(jsonWriter, "");
        if (projectDTO == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        jsonWriter.beginObject();
        jsonWriter.name("id");
        this.stringAdapter.toJson(jsonWriter, projectDTO.getId());
        jsonWriter.name("name");
        this.nullableStringAdapter.toJson(jsonWriter, projectDTO.getName());
        jsonWriter.name("homepage");
        this.nullableStringAdapter.toJson(jsonWriter, projectDTO.getHomepage());
        jsonWriter.name("image_id");
        this.nullableStringAdapter.toJson(jsonWriter, projectDTO.getImageId());
        jsonWriter.name("description");
        this.nullableStringAdapter.toJson(jsonWriter, projectDTO.getDescription());
        jsonWriter.name("image_url");
        this.nullableImageUrlDTOAdapter.toJson(jsonWriter, projectDTO.getImageUrl());
        jsonWriter.name("dapp_url");
        this.nullableStringAdapter.toJson(jsonWriter, projectDTO.getDappUrl());
        jsonWriter.name(OtcExtraKeys.ORDER);
        this.nullableLongAdapter.toJson(jsonWriter, projectDTO.getOrder());
        jsonWriter.endObject();
    }
}
