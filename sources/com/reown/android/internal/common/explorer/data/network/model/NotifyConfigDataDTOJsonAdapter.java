package com.reown.android.internal.common.explorer.data.network.model;

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
public final class NotifyConfigDataDTOJsonAdapter extends JsonAdapter<NotifyConfigDataDTO> {
    public final JsonAdapter<Boolean> booleanAdapter;
    public final JsonAdapter<List<NotificationTypeDTO>> listOfNotificationTypeDTOAdapter;
    public final JsonAdapter<ImageUrlDTO> nullableImageUrlDTOAdapter;
    public final JsonAdapter<String> nullableStringAdapter;
    public final JsonReader.Options options;
    public final JsonAdapter<String> stringAdapter;

    public NotifyConfigDataDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "");
        JsonReader.Options optionsOf = JsonReader.Options.of("name", "homepage", "description", "dapp_url", "image_url", "notificationTypes", "isVerified");
        Intrinsics.checkNotNullExpressionValue(optionsOf, "");
        this.options = optionsOf;
        JsonAdapter<String> jsonAdapterAdapter = moshi.adapter(String.class, yEE.copydefault(), "name");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter, "");
        this.stringAdapter = jsonAdapterAdapter;
        JsonAdapter<String> jsonAdapterAdapter2 = moshi.adapter(String.class, yEE.copydefault(), "homepage");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter2, "");
        this.nullableStringAdapter = jsonAdapterAdapter2;
        JsonAdapter<ImageUrlDTO> jsonAdapterAdapter3 = moshi.adapter(ImageUrlDTO.class, yEE.copydefault(), "imageUrl");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter3, "");
        this.nullableImageUrlDTOAdapter = jsonAdapterAdapter3;
        JsonAdapter<List<NotificationTypeDTO>> jsonAdapterAdapter4 = moshi.adapter(Types.newParameterizedType(List.class, NotificationTypeDTO.class), yEE.copydefault(), "notificationTypes");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter4, "");
        this.listOfNotificationTypeDTOAdapter = jsonAdapterAdapter4;
        JsonAdapter<Boolean> jsonAdapterAdapter5 = moshi.adapter(Boolean.TYPE, yEE.copydefault(), "isVerified");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter5, "");
        this.booleanAdapter = jsonAdapterAdapter5;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(41);
        sb.append("GeneratedJsonAdapter(");
        sb.append("NotifyConfigDataDTO");
        sb.append(')');
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    /* JADX DEBUG: Method merged with bridge method: fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object; */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.JsonAdapter
    public NotifyConfigDataDTO fromJson(@NotNull JsonReader jsonReader) throws IOException {
        Intrinsics.checkNotNullParameter(jsonReader, "");
        jsonReader.beginObject();
        Boolean boolFromJson = null;
        String str = null;
        String strFromJson = null;
        String str2 = null;
        String str3 = null;
        ImageUrlDTO imageUrlDTOFromJson = null;
        List<NotificationTypeDTO> list = null;
        while (true) {
            ImageUrlDTO imageUrlDTO = imageUrlDTOFromJson;
            if (jsonReader.hasNext()) {
                switch (jsonReader.selectName(this.options)) {
                    case -1:
                        jsonReader.skipName();
                        jsonReader.skipValue();
                        break;
                    case 0:
                        String strFromJson2 = this.stringAdapter.fromJson(jsonReader);
                        if (strFromJson2 == null) {
                            JsonDataException jsonDataExceptionUnexpectedNull = Util.unexpectedNull("name", "name", jsonReader);
                            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull, "");
                            throw jsonDataExceptionUnexpectedNull;
                        }
                        str = strFromJson2;
                        break;
                        break;
                    case 1:
                        strFromJson = this.nullableStringAdapter.fromJson(jsonReader);
                        break;
                    case 2:
                        String strFromJson3 = this.stringAdapter.fromJson(jsonReader);
                        if (strFromJson3 == null) {
                            JsonDataException jsonDataExceptionUnexpectedNull2 = Util.unexpectedNull("description", "description", jsonReader);
                            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull2, "");
                            throw jsonDataExceptionUnexpectedNull2;
                        }
                        str2 = strFromJson3;
                        break;
                        break;
                    case 3:
                        String strFromJson4 = this.stringAdapter.fromJson(jsonReader);
                        if (strFromJson4 == null) {
                            JsonDataException jsonDataExceptionUnexpectedNull3 = Util.unexpectedNull("dappUrl", "dapp_url", jsonReader);
                            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull3, "");
                            throw jsonDataExceptionUnexpectedNull3;
                        }
                        str3 = strFromJson4;
                        break;
                        break;
                    case 4:
                        imageUrlDTOFromJson = this.nullableImageUrlDTOAdapter.fromJson(jsonReader);
                        continue;
                    case 5:
                        List<NotificationTypeDTO> listFromJson = this.listOfNotificationTypeDTOAdapter.fromJson(jsonReader);
                        if (listFromJson == null) {
                            JsonDataException jsonDataExceptionUnexpectedNull4 = Util.unexpectedNull("notificationTypes", "notificationTypes", jsonReader);
                            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull4, "");
                            throw jsonDataExceptionUnexpectedNull4;
                        }
                        list = listFromJson;
                        break;
                        break;
                    case 6:
                        boolFromJson = this.booleanAdapter.fromJson(jsonReader);
                        if (boolFromJson == null) {
                            JsonDataException jsonDataExceptionUnexpectedNull5 = Util.unexpectedNull("isVerified", "isVerified", jsonReader);
                            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull5, "");
                            throw jsonDataExceptionUnexpectedNull5;
                        }
                        break;
                }
                imageUrlDTOFromJson = imageUrlDTO;
            } else {
                jsonReader.endObject();
                if (str == null) {
                    JsonDataException jsonDataExceptionMissingProperty = Util.missingProperty("name", "name", jsonReader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty, "");
                    throw jsonDataExceptionMissingProperty;
                }
                if (str2 == null) {
                    JsonDataException jsonDataExceptionMissingProperty2 = Util.missingProperty("description", "description", jsonReader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty2, "");
                    throw jsonDataExceptionMissingProperty2;
                }
                if (str3 == null) {
                    JsonDataException jsonDataExceptionMissingProperty3 = Util.missingProperty("dappUrl", "dapp_url", jsonReader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty3, "");
                    throw jsonDataExceptionMissingProperty3;
                }
                if (list == null) {
                    JsonDataException jsonDataExceptionMissingProperty4 = Util.missingProperty("notificationTypes", "notificationTypes", jsonReader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty4, "");
                    throw jsonDataExceptionMissingProperty4;
                }
                if (boolFromJson != null) {
                    return new NotifyConfigDataDTO(str, strFromJson, str2, str3, imageUrlDTO, list, boolFromJson.booleanValue());
                }
                JsonDataException jsonDataExceptionMissingProperty5 = Util.missingProperty("isVerified", "isVerified", jsonReader);
                Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty5, "");
                throw jsonDataExceptionMissingProperty5;
            }
        }
    }

    /* JADX DEBUG: Method merged with bridge method: toJson(Lcom/squareup/moshi/JsonWriter;Ljava/lang/Object;)V */
    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(@NotNull JsonWriter jsonWriter, NotifyConfigDataDTO notifyConfigDataDTO) throws IOException {
        Intrinsics.checkNotNullParameter(jsonWriter, "");
        if (notifyConfigDataDTO == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        jsonWriter.beginObject();
        jsonWriter.name("name");
        this.stringAdapter.toJson(jsonWriter, notifyConfigDataDTO.getName());
        jsonWriter.name("homepage");
        this.nullableStringAdapter.toJson(jsonWriter, notifyConfigDataDTO.getHomepage());
        jsonWriter.name("description");
        this.stringAdapter.toJson(jsonWriter, notifyConfigDataDTO.getDescription());
        jsonWriter.name("dapp_url");
        this.stringAdapter.toJson(jsonWriter, notifyConfigDataDTO.getDappUrl());
        jsonWriter.name("image_url");
        this.nullableImageUrlDTOAdapter.toJson(jsonWriter, notifyConfigDataDTO.getImageUrl());
        jsonWriter.name("notificationTypes");
        this.listOfNotificationTypeDTOAdapter.toJson(jsonWriter, notifyConfigDataDTO.getNotificationTypes());
        jsonWriter.name("isVerified");
        this.booleanAdapter.toJson(jsonWriter, Boolean.valueOf(notifyConfigDataDTO.isVerified()));
        jsonWriter.endObject();
    }
}
