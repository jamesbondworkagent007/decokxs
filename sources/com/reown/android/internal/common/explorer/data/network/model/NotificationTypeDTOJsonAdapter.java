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
public final class NotificationTypeDTOJsonAdapter extends JsonAdapter<NotificationTypeDTO> {
    public final JsonAdapter<ImageUrlDTO> nullableImageUrlDTOAdapter;
    public final JsonReader.Options options;
    public final JsonAdapter<String> stringAdapter;

    public NotificationTypeDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "");
        JsonReader.Options optionsOf = JsonReader.Options.of("name", "id", "description", "imageUrls");
        Intrinsics.checkNotNullExpressionValue(optionsOf, "");
        this.options = optionsOf;
        JsonAdapter<String> jsonAdapterAdapter = moshi.adapter(String.class, yEE.copydefault(), "name");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter, "");
        this.stringAdapter = jsonAdapterAdapter;
        JsonAdapter<ImageUrlDTO> jsonAdapterAdapter2 = moshi.adapter(ImageUrlDTO.class, yEE.copydefault(), "imageUrl");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter2, "");
        this.nullableImageUrlDTOAdapter = jsonAdapterAdapter2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(41);
        sb.append("GeneratedJsonAdapter(");
        sb.append("NotificationTypeDTO");
        sb.append(')');
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    /* JADX DEBUG: Method merged with bridge method: fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object; */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.JsonAdapter
    public NotificationTypeDTO fromJson(@NotNull JsonReader jsonReader) throws IOException {
        Intrinsics.checkNotNullParameter(jsonReader, "");
        jsonReader.beginObject();
        String strFromJson = null;
        String strFromJson2 = null;
        String strFromJson3 = null;
        ImageUrlDTO imageUrlDTOFromJson = null;
        while (jsonReader.hasNext()) {
            int iSelectName = jsonReader.selectName(this.options);
            if (iSelectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (iSelectName == 0) {
                strFromJson = this.stringAdapter.fromJson(jsonReader);
                if (strFromJson == null) {
                    JsonDataException jsonDataExceptionUnexpectedNull = Util.unexpectedNull("name", "name", jsonReader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull, "");
                    throw jsonDataExceptionUnexpectedNull;
                }
            } else if (iSelectName == 1) {
                strFromJson2 = this.stringAdapter.fromJson(jsonReader);
                if (strFromJson2 == null) {
                    JsonDataException jsonDataExceptionUnexpectedNull2 = Util.unexpectedNull("id", "id", jsonReader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull2, "");
                    throw jsonDataExceptionUnexpectedNull2;
                }
            } else if (iSelectName == 2) {
                strFromJson3 = this.stringAdapter.fromJson(jsonReader);
                if (strFromJson3 == null) {
                    JsonDataException jsonDataExceptionUnexpectedNull3 = Util.unexpectedNull("description", "description", jsonReader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull3, "");
                    throw jsonDataExceptionUnexpectedNull3;
                }
            } else if (iSelectName == 3) {
                imageUrlDTOFromJson = this.nullableImageUrlDTOAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        if (strFromJson == null) {
            JsonDataException jsonDataExceptionMissingProperty = Util.missingProperty("name", "name", jsonReader);
            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty, "");
            throw jsonDataExceptionMissingProperty;
        }
        if (strFromJson2 == null) {
            JsonDataException jsonDataExceptionMissingProperty2 = Util.missingProperty("id", "id", jsonReader);
            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty2, "");
            throw jsonDataExceptionMissingProperty2;
        }
        if (strFromJson3 != null) {
            return new NotificationTypeDTO(strFromJson, strFromJson2, strFromJson3, imageUrlDTOFromJson);
        }
        JsonDataException jsonDataExceptionMissingProperty3 = Util.missingProperty("description", "description", jsonReader);
        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty3, "");
        throw jsonDataExceptionMissingProperty3;
    }

    /* JADX DEBUG: Method merged with bridge method: toJson(Lcom/squareup/moshi/JsonWriter;Ljava/lang/Object;)V */
    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(@NotNull JsonWriter jsonWriter, NotificationTypeDTO notificationTypeDTO) throws IOException {
        Intrinsics.checkNotNullParameter(jsonWriter, "");
        if (notificationTypeDTO == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        jsonWriter.beginObject();
        jsonWriter.name("name");
        this.stringAdapter.toJson(jsonWriter, notificationTypeDTO.getName());
        jsonWriter.name("id");
        this.stringAdapter.toJson(jsonWriter, notificationTypeDTO.getId());
        jsonWriter.name("description");
        this.stringAdapter.toJson(jsonWriter, notificationTypeDTO.getDescription());
        jsonWriter.name("imageUrls");
        this.nullableImageUrlDTOAdapter.toJson(jsonWriter, notificationTypeDTO.getImageUrl());
        jsonWriter.endObject();
    }
}
