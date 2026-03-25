package com.reown.sign.common.model.vo.clientsync.common;

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
public final class PayloadParamsJsonAdapter extends JsonAdapter<PayloadParams> {
    public final JsonAdapter<List<String>> listOfStringAdapter;
    public final JsonAdapter<List<String>> nullableListOfStringAdapter;
    public final JsonAdapter<String> nullableStringAdapter;
    public final JsonReader.Options options;
    public final JsonAdapter<String> stringAdapter;

    public PayloadParamsJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "");
        JsonReader.Options optionsOf = JsonReader.Options.of("type", "chains", "domain", "aud", "nonce", "version", "iat", "nbf", "exp", "statement", "requestId", "resources");
        Intrinsics.checkNotNullExpressionValue(optionsOf, "");
        this.options = optionsOf;
        JsonAdapter<String> jsonAdapterAdapter = moshi.adapter(String.class, yEE.copydefault(), "type");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter, "");
        this.stringAdapter = jsonAdapterAdapter;
        JsonAdapter<List<String>> jsonAdapterAdapter2 = moshi.adapter(Types.newParameterizedType(List.class, String.class), yEE.copydefault(), "chains");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter2, "");
        this.listOfStringAdapter = jsonAdapterAdapter2;
        JsonAdapter<String> jsonAdapterAdapter3 = moshi.adapter(String.class, yEE.copydefault(), "nbf");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter3, "");
        this.nullableStringAdapter = jsonAdapterAdapter3;
        JsonAdapter<List<String>> jsonAdapterAdapter4 = moshi.adapter(Types.newParameterizedType(List.class, String.class), yEE.copydefault(), "resources");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter4, "");
        this.nullableListOfStringAdapter = jsonAdapterAdapter4;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(35);
        sb.append("GeneratedJsonAdapter(");
        sb.append("PayloadParams");
        sb.append(')');
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    /* JADX DEBUG: Method merged with bridge method: fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object; */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.JsonAdapter
    public PayloadParams fromJson(@NotNull JsonReader jsonReader) throws IOException {
        Intrinsics.checkNotNullParameter(jsonReader, "");
        jsonReader.beginObject();
        String strFromJson = null;
        List<String> listFromJson = null;
        String strFromJson2 = null;
        String strFromJson3 = null;
        String strFromJson4 = null;
        String strFromJson5 = null;
        String str = null;
        String strFromJson6 = null;
        String strFromJson7 = null;
        String strFromJson8 = null;
        String strFromJson9 = null;
        List<String> listFromJson2 = null;
        while (true) {
            String str2 = strFromJson9;
            String str3 = strFromJson8;
            String str4 = strFromJson7;
            String str5 = strFromJson6;
            String str6 = str;
            String str7 = strFromJson5;
            if (jsonReader.hasNext()) {
                switch (jsonReader.selectName(this.options)) {
                    case -1:
                        jsonReader.skipName();
                        jsonReader.skipValue();
                        strFromJson9 = str2;
                        strFromJson8 = str3;
                        strFromJson7 = str4;
                        strFromJson6 = str5;
                        str = str6;
                        strFromJson5 = str7;
                        break;
                    case 0:
                        strFromJson = this.stringAdapter.fromJson(jsonReader);
                        if (strFromJson == null) {
                            JsonDataException jsonDataExceptionUnexpectedNull = Util.unexpectedNull("type", "type", jsonReader);
                            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull, "");
                            throw jsonDataExceptionUnexpectedNull;
                        }
                        strFromJson9 = str2;
                        strFromJson8 = str3;
                        strFromJson7 = str4;
                        strFromJson6 = str5;
                        str = str6;
                        strFromJson5 = str7;
                        break;
                    case 1:
                        listFromJson = this.listOfStringAdapter.fromJson(jsonReader);
                        if (listFromJson == null) {
                            JsonDataException jsonDataExceptionUnexpectedNull2 = Util.unexpectedNull("chains", "chains", jsonReader);
                            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull2, "");
                            throw jsonDataExceptionUnexpectedNull2;
                        }
                        strFromJson9 = str2;
                        strFromJson8 = str3;
                        strFromJson7 = str4;
                        strFromJson6 = str5;
                        str = str6;
                        strFromJson5 = str7;
                        break;
                    case 2:
                        strFromJson2 = this.stringAdapter.fromJson(jsonReader);
                        if (strFromJson2 == null) {
                            JsonDataException jsonDataExceptionUnexpectedNull3 = Util.unexpectedNull("domain", "domain", jsonReader);
                            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull3, "");
                            throw jsonDataExceptionUnexpectedNull3;
                        }
                        strFromJson9 = str2;
                        strFromJson8 = str3;
                        strFromJson7 = str4;
                        strFromJson6 = str5;
                        str = str6;
                        strFromJson5 = str7;
                        break;
                    case 3:
                        strFromJson3 = this.stringAdapter.fromJson(jsonReader);
                        if (strFromJson3 == null) {
                            JsonDataException jsonDataExceptionUnexpectedNull4 = Util.unexpectedNull("aud", "aud", jsonReader);
                            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull4, "");
                            throw jsonDataExceptionUnexpectedNull4;
                        }
                        strFromJson9 = str2;
                        strFromJson8 = str3;
                        strFromJson7 = str4;
                        strFromJson6 = str5;
                        str = str6;
                        strFromJson5 = str7;
                        break;
                    case 4:
                        strFromJson4 = this.stringAdapter.fromJson(jsonReader);
                        if (strFromJson4 == null) {
                            JsonDataException jsonDataExceptionUnexpectedNull5 = Util.unexpectedNull("nonce", "nonce", jsonReader);
                            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull5, "");
                            throw jsonDataExceptionUnexpectedNull5;
                        }
                        strFromJson9 = str2;
                        strFromJson8 = str3;
                        strFromJson7 = str4;
                        strFromJson6 = str5;
                        str = str6;
                        strFromJson5 = str7;
                        break;
                    case 5:
                        strFromJson5 = this.stringAdapter.fromJson(jsonReader);
                        if (strFromJson5 == null) {
                            JsonDataException jsonDataExceptionUnexpectedNull6 = Util.unexpectedNull("version", "version", jsonReader);
                            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull6, "");
                            throw jsonDataExceptionUnexpectedNull6;
                        }
                        strFromJson9 = str2;
                        strFromJson8 = str3;
                        strFromJson7 = str4;
                        strFromJson6 = str5;
                        str = str6;
                        break;
                        break;
                    case 6:
                        String strFromJson10 = this.stringAdapter.fromJson(jsonReader);
                        if (strFromJson10 == null) {
                            JsonDataException jsonDataExceptionUnexpectedNull7 = Util.unexpectedNull("iat", "iat", jsonReader);
                            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull7, "");
                            throw jsonDataExceptionUnexpectedNull7;
                        }
                        str = strFromJson10;
                        strFromJson9 = str2;
                        strFromJson8 = str3;
                        strFromJson7 = str4;
                        strFromJson6 = str5;
                        strFromJson5 = str7;
                        break;
                        break;
                    case 7:
                        strFromJson6 = this.nullableStringAdapter.fromJson(jsonReader);
                        strFromJson9 = str2;
                        strFromJson8 = str3;
                        strFromJson7 = str4;
                        str = str6;
                        strFromJson5 = str7;
                        break;
                    case 8:
                        strFromJson7 = this.nullableStringAdapter.fromJson(jsonReader);
                        strFromJson9 = str2;
                        strFromJson8 = str3;
                        strFromJson6 = str5;
                        str = str6;
                        strFromJson5 = str7;
                        break;
                    case 9:
                        strFromJson8 = this.nullableStringAdapter.fromJson(jsonReader);
                        strFromJson9 = str2;
                        strFromJson7 = str4;
                        strFromJson6 = str5;
                        str = str6;
                        strFromJson5 = str7;
                        break;
                    case 10:
                        strFromJson9 = this.nullableStringAdapter.fromJson(jsonReader);
                        strFromJson8 = str3;
                        strFromJson7 = str4;
                        strFromJson6 = str5;
                        str = str6;
                        strFromJson5 = str7;
                        break;
                    case 11:
                        listFromJson2 = this.nullableListOfStringAdapter.fromJson(jsonReader);
                        strFromJson9 = str2;
                        strFromJson8 = str3;
                        strFromJson7 = str4;
                        strFromJson6 = str5;
                        str = str6;
                        strFromJson5 = str7;
                        break;
                    default:
                        strFromJson9 = str2;
                        strFromJson8 = str3;
                        strFromJson7 = str4;
                        strFromJson6 = str5;
                        str = str6;
                        strFromJson5 = str7;
                        break;
                }
            } else {
                jsonReader.endObject();
                if (strFromJson == null) {
                    JsonDataException jsonDataExceptionMissingProperty = Util.missingProperty("type", "type", jsonReader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty, "");
                    throw jsonDataExceptionMissingProperty;
                }
                if (listFromJson == null) {
                    JsonDataException jsonDataExceptionMissingProperty2 = Util.missingProperty("chains", "chains", jsonReader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty2, "");
                    throw jsonDataExceptionMissingProperty2;
                }
                if (strFromJson2 == null) {
                    JsonDataException jsonDataExceptionMissingProperty3 = Util.missingProperty("domain", "domain", jsonReader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty3, "");
                    throw jsonDataExceptionMissingProperty3;
                }
                if (strFromJson3 == null) {
                    JsonDataException jsonDataExceptionMissingProperty4 = Util.missingProperty("aud", "aud", jsonReader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty4, "");
                    throw jsonDataExceptionMissingProperty4;
                }
                if (strFromJson4 == null) {
                    JsonDataException jsonDataExceptionMissingProperty5 = Util.missingProperty("nonce", "nonce", jsonReader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty5, "");
                    throw jsonDataExceptionMissingProperty5;
                }
                if (str7 == null) {
                    JsonDataException jsonDataExceptionMissingProperty6 = Util.missingProperty("version", "version", jsonReader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty6, "");
                    throw jsonDataExceptionMissingProperty6;
                }
                if (str6 != null) {
                    return new PayloadParams(strFromJson, listFromJson, strFromJson2, strFromJson3, strFromJson4, str7, str6, str5, str4, str3, str2, listFromJson2);
                }
                JsonDataException jsonDataExceptionMissingProperty7 = Util.missingProperty("iat", "iat", jsonReader);
                Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty7, "");
                throw jsonDataExceptionMissingProperty7;
            }
        }
    }

    /* JADX DEBUG: Method merged with bridge method: toJson(Lcom/squareup/moshi/JsonWriter;Ljava/lang/Object;)V */
    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(@NotNull JsonWriter jsonWriter, PayloadParams payloadParams) throws IOException {
        Intrinsics.checkNotNullParameter(jsonWriter, "");
        if (payloadParams == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        jsonWriter.beginObject();
        jsonWriter.name("type");
        this.stringAdapter.toJson(jsonWriter, payloadParams.getType());
        jsonWriter.name("chains");
        this.listOfStringAdapter.toJson(jsonWriter, payloadParams.getChains());
        jsonWriter.name("domain");
        this.stringAdapter.toJson(jsonWriter, payloadParams.getDomain());
        jsonWriter.name("aud");
        this.stringAdapter.toJson(jsonWriter, payloadParams.getAud());
        jsonWriter.name("nonce");
        this.stringAdapter.toJson(jsonWriter, payloadParams.getNonce());
        jsonWriter.name("version");
        this.stringAdapter.toJson(jsonWriter, payloadParams.getVersion());
        jsonWriter.name("iat");
        this.stringAdapter.toJson(jsonWriter, payloadParams.getIat());
        jsonWriter.name("nbf");
        this.nullableStringAdapter.toJson(jsonWriter, payloadParams.getNbf());
        jsonWriter.name("exp");
        this.nullableStringAdapter.toJson(jsonWriter, payloadParams.getExp());
        jsonWriter.name("statement");
        this.nullableStringAdapter.toJson(jsonWriter, payloadParams.getStatement());
        jsonWriter.name("requestId");
        this.nullableStringAdapter.toJson(jsonWriter, payloadParams.getRequestId());
        jsonWriter.name("resources");
        this.nullableListOfStringAdapter.toJson(jsonWriter, payloadParams.getResources());
        jsonWriter.endObject();
    }
}
