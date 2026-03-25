package com.reown.android.internal.common.modal.data.network.model;

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
public final class WalletDTOJsonAdapter extends JsonAdapter<WalletDTO> {
    public final JsonAdapter<String> nullableStringAdapter;
    public final JsonReader.Options options;
    public final JsonAdapter<String> stringAdapter;

    public WalletDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "");
        JsonReader.Options optionsOf = JsonReader.Options.of("id", "name", "homepage", "image_id", OtcExtraKeys.ORDER, "mobile_link", "desktop_link", "webapp_link", "app_store", "play_store", "link_mode");
        Intrinsics.checkNotNullExpressionValue(optionsOf, "");
        this.options = optionsOf;
        JsonAdapter<String> jsonAdapterAdapter = moshi.adapter(String.class, yEE.copydefault(), "id");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter, "");
        this.stringAdapter = jsonAdapterAdapter;
        JsonAdapter<String> jsonAdapterAdapter2 = moshi.adapter(String.class, yEE.copydefault(), "mobileLink");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter2, "");
        this.nullableStringAdapter = jsonAdapterAdapter2;
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
        String strFromJson6 = null;
        String strFromJson7 = null;
        String strFromJson8 = null;
        String strFromJson9 = null;
        String strFromJson10 = null;
        String strFromJson11 = null;
        while (true) {
            String str = strFromJson11;
            String str2 = strFromJson10;
            String str3 = strFromJson9;
            String str4 = strFromJson8;
            String str5 = strFromJson7;
            String str6 = strFromJson6;
            if (jsonReader.hasNext()) {
                switch (jsonReader.selectName(this.options)) {
                    case -1:
                        jsonReader.skipName();
                        jsonReader.skipValue();
                        strFromJson11 = str;
                        strFromJson10 = str2;
                        strFromJson9 = str3;
                        strFromJson8 = str4;
                        strFromJson7 = str5;
                        strFromJson6 = str6;
                        break;
                    case 0:
                        strFromJson = this.stringAdapter.fromJson(jsonReader);
                        if (strFromJson == null) {
                            JsonDataException jsonDataExceptionUnexpectedNull = Util.unexpectedNull("id", "id", jsonReader);
                            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull, "");
                            throw jsonDataExceptionUnexpectedNull;
                        }
                        strFromJson11 = str;
                        strFromJson10 = str2;
                        strFromJson9 = str3;
                        strFromJson8 = str4;
                        strFromJson7 = str5;
                        strFromJson6 = str6;
                        break;
                    case 1:
                        strFromJson2 = this.stringAdapter.fromJson(jsonReader);
                        if (strFromJson2 == null) {
                            JsonDataException jsonDataExceptionUnexpectedNull2 = Util.unexpectedNull("name", "name", jsonReader);
                            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull2, "");
                            throw jsonDataExceptionUnexpectedNull2;
                        }
                        strFromJson11 = str;
                        strFromJson10 = str2;
                        strFromJson9 = str3;
                        strFromJson8 = str4;
                        strFromJson7 = str5;
                        strFromJson6 = str6;
                        break;
                    case 2:
                        strFromJson3 = this.stringAdapter.fromJson(jsonReader);
                        if (strFromJson3 == null) {
                            JsonDataException jsonDataExceptionUnexpectedNull3 = Util.unexpectedNull("homePage", "homepage", jsonReader);
                            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull3, "");
                            throw jsonDataExceptionUnexpectedNull3;
                        }
                        strFromJson11 = str;
                        strFromJson10 = str2;
                        strFromJson9 = str3;
                        strFromJson8 = str4;
                        strFromJson7 = str5;
                        strFromJson6 = str6;
                        break;
                    case 3:
                        strFromJson4 = this.stringAdapter.fromJson(jsonReader);
                        if (strFromJson4 == null) {
                            JsonDataException jsonDataExceptionUnexpectedNull4 = Util.unexpectedNull("imageId", "image_id", jsonReader);
                            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull4, "");
                            throw jsonDataExceptionUnexpectedNull4;
                        }
                        strFromJson11 = str;
                        strFromJson10 = str2;
                        strFromJson9 = str3;
                        strFromJson8 = str4;
                        strFromJson7 = str5;
                        strFromJson6 = str6;
                        break;
                    case 4:
                        strFromJson5 = this.stringAdapter.fromJson(jsonReader);
                        if (strFromJson5 == null) {
                            JsonDataException jsonDataExceptionUnexpectedNull5 = Util.unexpectedNull(OtcExtraKeys.ORDER, OtcExtraKeys.ORDER, jsonReader);
                            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull5, "");
                            throw jsonDataExceptionUnexpectedNull5;
                        }
                        strFromJson11 = str;
                        strFromJson10 = str2;
                        strFromJson9 = str3;
                        strFromJson8 = str4;
                        strFromJson7 = str5;
                        strFromJson6 = str6;
                        break;
                    case 5:
                        strFromJson6 = this.nullableStringAdapter.fromJson(jsonReader);
                        strFromJson11 = str;
                        strFromJson10 = str2;
                        strFromJson9 = str3;
                        strFromJson8 = str4;
                        strFromJson7 = str5;
                        break;
                    case 6:
                        strFromJson7 = this.nullableStringAdapter.fromJson(jsonReader);
                        strFromJson11 = str;
                        strFromJson10 = str2;
                        strFromJson9 = str3;
                        strFromJson8 = str4;
                        strFromJson6 = str6;
                        break;
                    case 7:
                        strFromJson8 = this.nullableStringAdapter.fromJson(jsonReader);
                        strFromJson11 = str;
                        strFromJson10 = str2;
                        strFromJson9 = str3;
                        strFromJson7 = str5;
                        strFromJson6 = str6;
                        break;
                    case 8:
                        strFromJson9 = this.nullableStringAdapter.fromJson(jsonReader);
                        strFromJson11 = str;
                        strFromJson10 = str2;
                        strFromJson8 = str4;
                        strFromJson7 = str5;
                        strFromJson6 = str6;
                        break;
                    case 9:
                        strFromJson10 = this.nullableStringAdapter.fromJson(jsonReader);
                        strFromJson11 = str;
                        strFromJson9 = str3;
                        strFromJson8 = str4;
                        strFromJson7 = str5;
                        strFromJson6 = str6;
                        break;
                    case 10:
                        strFromJson11 = this.nullableStringAdapter.fromJson(jsonReader);
                        strFromJson10 = str2;
                        strFromJson9 = str3;
                        strFromJson8 = str4;
                        strFromJson7 = str5;
                        strFromJson6 = str6;
                        break;
                    default:
                        strFromJson11 = str;
                        strFromJson10 = str2;
                        strFromJson9 = str3;
                        strFromJson8 = str4;
                        strFromJson7 = str5;
                        strFromJson6 = str6;
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
                if (strFromJson3 == null) {
                    JsonDataException jsonDataExceptionMissingProperty3 = Util.missingProperty("homePage", "homepage", jsonReader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty3, "");
                    throw jsonDataExceptionMissingProperty3;
                }
                if (strFromJson4 == null) {
                    JsonDataException jsonDataExceptionMissingProperty4 = Util.missingProperty("imageId", "image_id", jsonReader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty4, "");
                    throw jsonDataExceptionMissingProperty4;
                }
                if (strFromJson5 != null) {
                    return new WalletDTO(strFromJson, strFromJson2, strFromJson3, strFromJson4, strFromJson5, str6, str5, str4, str3, str2, str);
                }
                JsonDataException jsonDataExceptionMissingProperty5 = Util.missingProperty(OtcExtraKeys.ORDER, OtcExtraKeys.ORDER, jsonReader);
                Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty5, "");
                throw jsonDataExceptionMissingProperty5;
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
        jsonWriter.name("homepage");
        this.stringAdapter.toJson(jsonWriter, walletDTO.getHomePage());
        jsonWriter.name("image_id");
        this.stringAdapter.toJson(jsonWriter, walletDTO.getImageId());
        jsonWriter.name(OtcExtraKeys.ORDER);
        this.stringAdapter.toJson(jsonWriter, walletDTO.getOrder());
        jsonWriter.name("mobile_link");
        this.nullableStringAdapter.toJson(jsonWriter, walletDTO.getMobileLink());
        jsonWriter.name("desktop_link");
        this.nullableStringAdapter.toJson(jsonWriter, walletDTO.getDesktopLink());
        jsonWriter.name("webapp_link");
        this.nullableStringAdapter.toJson(jsonWriter, walletDTO.getWebappLink());
        jsonWriter.name("app_store");
        this.nullableStringAdapter.toJson(jsonWriter, walletDTO.getAppStore());
        jsonWriter.name("play_store");
        this.nullableStringAdapter.toJson(jsonWriter, walletDTO.getPlayStore());
        jsonWriter.name("link_mode");
        this.nullableStringAdapter.toJson(jsonWriter, walletDTO.getLinkMode());
        jsonWriter.endObject();
    }
}
