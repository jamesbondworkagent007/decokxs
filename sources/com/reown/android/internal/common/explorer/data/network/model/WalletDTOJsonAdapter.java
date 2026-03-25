package com.reown.android.internal.common.explorer.data.network.model;

import com.reown.android.pulse.model.ConnectionMethod;
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
public final class WalletDTOJsonAdapter extends JsonAdapter<WalletDTO> {
    public final JsonAdapter<AppDTO> appDTOAdapter;
    public final JsonAdapter<MobileDTO> mobileDTOAdapter;
    public final JsonAdapter<String> nullableStringAdapter;
    public final JsonReader.Options options;
    public final JsonAdapter<String> stringAdapter;

    public WalletDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "");
        JsonReader.Options optionsOf = JsonReader.Options.of("id", "name", "description", "homepage", "image_id", ConnectionMethod.MOBILE, "app");
        Intrinsics.checkNotNullExpressionValue(optionsOf, "");
        this.options = optionsOf;
        JsonAdapter<String> jsonAdapterAdapter = moshi.adapter(String.class, yEE.copydefault(), "id");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter, "");
        this.stringAdapter = jsonAdapterAdapter;
        JsonAdapter<String> jsonAdapterAdapter2 = moshi.adapter(String.class, yEE.copydefault(), "description");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter2, "");
        this.nullableStringAdapter = jsonAdapterAdapter2;
        JsonAdapter<MobileDTO> jsonAdapterAdapter3 = moshi.adapter(MobileDTO.class, yEE.copydefault(), ConnectionMethod.MOBILE);
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter3, "");
        this.mobileDTOAdapter = jsonAdapterAdapter3;
        JsonAdapter<AppDTO> jsonAdapterAdapter4 = moshi.adapter(AppDTO.class, yEE.copydefault(), "app");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter4, "");
        this.appDTOAdapter = jsonAdapterAdapter4;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(31);
        sb.append("GeneratedJsonAdapter(");
        sb.append("WalletDTO");
        sb.append(')');
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    /* JADX DEBUG: Method merged with bridge method: fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object; */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.JsonAdapter
    public WalletDTO fromJson(@NotNull JsonReader jsonReader) throws IOException {
        Intrinsics.checkNotNullParameter(jsonReader, "");
        jsonReader.beginObject();
        String strFromJson = null;
        String strFromJson2 = null;
        String strFromJson3 = null;
        String strFromJson4 = null;
        String strFromJson5 = null;
        MobileDTO mobileDTOFromJson = null;
        AppDTO appDTO = null;
        while (true) {
            String str = strFromJson3;
            AppDTO appDTO2 = appDTO;
            MobileDTO mobileDTO = mobileDTOFromJson;
            if (jsonReader.hasNext()) {
                switch (jsonReader.selectName(this.options)) {
                    case -1:
                        jsonReader.skipName();
                        jsonReader.skipValue();
                        strFromJson3 = str;
                        appDTO = appDTO2;
                        mobileDTOFromJson = mobileDTO;
                        break;
                    case 0:
                        strFromJson = this.stringAdapter.fromJson(jsonReader);
                        if (strFromJson == null) {
                            JsonDataException jsonDataExceptionUnexpectedNull = Util.unexpectedNull("id", "id", jsonReader);
                            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull, "");
                            throw jsonDataExceptionUnexpectedNull;
                        }
                        strFromJson3 = str;
                        appDTO = appDTO2;
                        mobileDTOFromJson = mobileDTO;
                        break;
                    case 1:
                        strFromJson2 = this.stringAdapter.fromJson(jsonReader);
                        if (strFromJson2 == null) {
                            JsonDataException jsonDataExceptionUnexpectedNull2 = Util.unexpectedNull("name", "name", jsonReader);
                            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull2, "");
                            throw jsonDataExceptionUnexpectedNull2;
                        }
                        strFromJson3 = str;
                        appDTO = appDTO2;
                        mobileDTOFromJson = mobileDTO;
                        break;
                    case 2:
                        strFromJson3 = this.nullableStringAdapter.fromJson(jsonReader);
                        appDTO = appDTO2;
                        mobileDTOFromJson = mobileDTO;
                        break;
                    case 3:
                        strFromJson4 = this.stringAdapter.fromJson(jsonReader);
                        if (strFromJson4 == null) {
                            JsonDataException jsonDataExceptionUnexpectedNull3 = Util.unexpectedNull("homePage", "homepage", jsonReader);
                            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull3, "");
                            throw jsonDataExceptionUnexpectedNull3;
                        }
                        strFromJson3 = str;
                        appDTO = appDTO2;
                        mobileDTOFromJson = mobileDTO;
                        break;
                    case 4:
                        strFromJson5 = this.stringAdapter.fromJson(jsonReader);
                        if (strFromJson5 == null) {
                            JsonDataException jsonDataExceptionUnexpectedNull4 = Util.unexpectedNull("imageId", "image_id", jsonReader);
                            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull4, "");
                            throw jsonDataExceptionUnexpectedNull4;
                        }
                        strFromJson3 = str;
                        appDTO = appDTO2;
                        mobileDTOFromJson = mobileDTO;
                        break;
                    case 5:
                        mobileDTOFromJson = this.mobileDTOAdapter.fromJson(jsonReader);
                        if (mobileDTOFromJson == null) {
                            JsonDataException jsonDataExceptionUnexpectedNull5 = Util.unexpectedNull(ConnectionMethod.MOBILE, ConnectionMethod.MOBILE, jsonReader);
                            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull5, "");
                            throw jsonDataExceptionUnexpectedNull5;
                        }
                        strFromJson3 = str;
                        appDTO = appDTO2;
                        break;
                        break;
                    case 6:
                        AppDTO appDTOFromJson = this.appDTOAdapter.fromJson(jsonReader);
                        if (appDTOFromJson == null) {
                            JsonDataException jsonDataExceptionUnexpectedNull6 = Util.unexpectedNull("app", "app", jsonReader);
                            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull6, "");
                            throw jsonDataExceptionUnexpectedNull6;
                        }
                        appDTO = appDTOFromJson;
                        strFromJson3 = str;
                        mobileDTOFromJson = mobileDTO;
                        break;
                        break;
                    default:
                        strFromJson3 = str;
                        appDTO = appDTO2;
                        mobileDTOFromJson = mobileDTO;
                        break;
                }
            } else {
                jsonReader.endObject();
                if (strFromJson == null) {
                    JsonDataException jsonDataExceptionMissingProperty = Util.missingProperty("id", "id", jsonReader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty, "");
                    throw jsonDataExceptionMissingProperty;
                }
                if (strFromJson2 == null) {
                    JsonDataException jsonDataExceptionMissingProperty2 = Util.missingProperty("name", "name", jsonReader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty2, "");
                    throw jsonDataExceptionMissingProperty2;
                }
                if (strFromJson4 == null) {
                    JsonDataException jsonDataExceptionMissingProperty3 = Util.missingProperty("homePage", "homepage", jsonReader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty3, "");
                    throw jsonDataExceptionMissingProperty3;
                }
                if (strFromJson5 == null) {
                    JsonDataException jsonDataExceptionMissingProperty4 = Util.missingProperty("imageId", "image_id", jsonReader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty4, "");
                    throw jsonDataExceptionMissingProperty4;
                }
                if (mobileDTO == null) {
                    JsonDataException jsonDataExceptionMissingProperty5 = Util.missingProperty(ConnectionMethod.MOBILE, ConnectionMethod.MOBILE, jsonReader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty5, "");
                    throw jsonDataExceptionMissingProperty5;
                }
                if (appDTO2 != null) {
                    return new WalletDTO(strFromJson, strFromJson2, str, strFromJson4, strFromJson5, mobileDTO, appDTO2);
                }
                JsonDataException jsonDataExceptionMissingProperty6 = Util.missingProperty("app", "app", jsonReader);
                Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty6, "");
                throw jsonDataExceptionMissingProperty6;
            }
        }
    }

    /* JADX DEBUG: Method merged with bridge method: toJson(Lcom/squareup/moshi/JsonWriter;Ljava/lang/Object;)V */
    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(@NotNull JsonWriter jsonWriter, WalletDTO walletDTO) throws IOException {
        Intrinsics.checkNotNullParameter(jsonWriter, "");
        if (walletDTO == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        jsonWriter.beginObject();
        jsonWriter.name("id");
        this.stringAdapter.toJson(jsonWriter, walletDTO.getId());
        jsonWriter.name("name");
        this.stringAdapter.toJson(jsonWriter, walletDTO.getName());
        jsonWriter.name("description");
        this.nullableStringAdapter.toJson(jsonWriter, walletDTO.getDescription());
        jsonWriter.name("homepage");
        this.stringAdapter.toJson(jsonWriter, walletDTO.getHomePage());
        jsonWriter.name("image_id");
        this.stringAdapter.toJson(jsonWriter, walletDTO.getImageId());
        jsonWriter.name(ConnectionMethod.MOBILE);
        this.mobileDTOAdapter.toJson(jsonWriter, walletDTO.getMobile());
        jsonWriter.name("app");
        this.appDTOAdapter.toJson(jsonWriter, walletDTO.getApp());
        jsonWriter.endObject();
    }
}
