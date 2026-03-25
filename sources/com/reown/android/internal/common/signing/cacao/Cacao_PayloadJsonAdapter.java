package com.reown.android.internal.common.signing.cacao;

import com.reown.android.internal.common.signing.cacao.Cacao;
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
public final class Cacao_PayloadJsonAdapter extends JsonAdapter<Cacao.Payload> {
    public final JsonAdapter<List<String>> nullableListOfStringAdapter;
    public final JsonAdapter<String> nullableStringAdapter;
    public final JsonReader.Options options;
    public final JsonAdapter<String> stringAdapter;

    public Cacao_PayloadJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "");
        JsonReader.Options optionsOf = JsonReader.Options.of("iss", "domain", "aud", "version", "nonce", "iat", "nbf", "exp", "statement", "requestId", "resources");
        Intrinsics.checkNotNullExpressionValue(optionsOf, "");
        this.options = optionsOf;
        JsonAdapter<String> jsonAdapterAdapter = moshi.adapter(String.class, yEE.copydefault(), "iss");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter, "");
        this.stringAdapter = jsonAdapterAdapter;
        JsonAdapter<String> jsonAdapterAdapter2 = moshi.adapter(String.class, yEE.copydefault(), "nbf");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter2, "");
        this.nullableStringAdapter = jsonAdapterAdapter2;
        JsonAdapter<List<String>> jsonAdapterAdapter3 = moshi.adapter(Types.newParameterizedType(List.class, String.class), yEE.copydefault(), "resources");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter3, "");
        this.nullableListOfStringAdapter = jsonAdapterAdapter3;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(35);
        sb.append("GeneratedJsonAdapter(");
        sb.append("Cacao.Payload");
        sb.append(')');
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    /* JADX DEBUG: Method merged with bridge method: fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object; */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.JsonAdapter
    public Cacao.Payload fromJson(@NotNull JsonReader jsonReader) throws IOException {
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
        List<String> listFromJson = null;
        while (true) {
            List<String> list = listFromJson;
            String str = strFromJson10;
            String str2 = strFromJson9;
            String str3 = strFromJson8;
            String str4 = strFromJson7;
            if (jsonReader.hasNext()) {
                switch (jsonReader.selectName(this.options)) {
                    case -1:
                        jsonReader.skipName();
                        jsonReader.skipValue();
                        listFromJson = list;
                        strFromJson10 = str;
                        strFromJson9 = str2;
                        strFromJson8 = str3;
                        strFromJson7 = str4;
                        break;
                    case 0:
                        strFromJson = this.stringAdapter.fromJson(jsonReader);
                        if (strFromJson == null) {
                            JsonDataException jsonDataExceptionUnexpectedNull = Util.unexpectedNull("iss", "iss", jsonReader);
                            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull, "");
                            throw jsonDataExceptionUnexpectedNull;
                        }
                        listFromJson = list;
                        strFromJson10 = str;
                        strFromJson9 = str2;
                        strFromJson8 = str3;
                        strFromJson7 = str4;
                        break;
                    case 1:
                        strFromJson2 = this.stringAdapter.fromJson(jsonReader);
                        if (strFromJson2 == null) {
                            JsonDataException jsonDataExceptionUnexpectedNull2 = Util.unexpectedNull("domain", "domain", jsonReader);
                            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull2, "");
                            throw jsonDataExceptionUnexpectedNull2;
                        }
                        listFromJson = list;
                        strFromJson10 = str;
                        strFromJson9 = str2;
                        strFromJson8 = str3;
                        strFromJson7 = str4;
                        break;
                    case 2:
                        strFromJson3 = this.stringAdapter.fromJson(jsonReader);
                        if (strFromJson3 == null) {
                            JsonDataException jsonDataExceptionUnexpectedNull3 = Util.unexpectedNull("aud", "aud", jsonReader);
                            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull3, "");
                            throw jsonDataExceptionUnexpectedNull3;
                        }
                        listFromJson = list;
                        strFromJson10 = str;
                        strFromJson9 = str2;
                        strFromJson8 = str3;
                        strFromJson7 = str4;
                        break;
                    case 3:
                        strFromJson4 = this.stringAdapter.fromJson(jsonReader);
                        if (strFromJson4 == null) {
                            JsonDataException jsonDataExceptionUnexpectedNull4 = Util.unexpectedNull("version", "version", jsonReader);
                            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull4, "");
                            throw jsonDataExceptionUnexpectedNull4;
                        }
                        listFromJson = list;
                        strFromJson10 = str;
                        strFromJson9 = str2;
                        strFromJson8 = str3;
                        strFromJson7 = str4;
                        break;
                    case 4:
                        strFromJson5 = this.stringAdapter.fromJson(jsonReader);
                        if (strFromJson5 == null) {
                            JsonDataException jsonDataExceptionUnexpectedNull5 = Util.unexpectedNull("nonce", "nonce", jsonReader);
                            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull5, "");
                            throw jsonDataExceptionUnexpectedNull5;
                        }
                        listFromJson = list;
                        strFromJson10 = str;
                        strFromJson9 = str2;
                        strFromJson8 = str3;
                        strFromJson7 = str4;
                        break;
                    case 5:
                        strFromJson6 = this.stringAdapter.fromJson(jsonReader);
                        if (strFromJson6 == null) {
                            JsonDataException jsonDataExceptionUnexpectedNull6 = Util.unexpectedNull("iat", "iat", jsonReader);
                            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull6, "");
                            throw jsonDataExceptionUnexpectedNull6;
                        }
                        listFromJson = list;
                        strFromJson10 = str;
                        strFromJson9 = str2;
                        strFromJson8 = str3;
                        strFromJson7 = str4;
                        break;
                    case 6:
                        strFromJson7 = this.nullableStringAdapter.fromJson(jsonReader);
                        listFromJson = list;
                        strFromJson10 = str;
                        strFromJson9 = str2;
                        strFromJson8 = str3;
                        break;
                    case 7:
                        strFromJson8 = this.nullableStringAdapter.fromJson(jsonReader);
                        listFromJson = list;
                        strFromJson10 = str;
                        strFromJson9 = str2;
                        strFromJson7 = str4;
                        break;
                    case 8:
                        strFromJson9 = this.nullableStringAdapter.fromJson(jsonReader);
                        listFromJson = list;
                        strFromJson10 = str;
                        strFromJson8 = str3;
                        strFromJson7 = str4;
                        break;
                    case 9:
                        strFromJson10 = this.nullableStringAdapter.fromJson(jsonReader);
                        listFromJson = list;
                        strFromJson9 = str2;
                        strFromJson8 = str3;
                        strFromJson7 = str4;
                        break;
                    case 10:
                        listFromJson = this.nullableListOfStringAdapter.fromJson(jsonReader);
                        strFromJson10 = str;
                        strFromJson9 = str2;
                        strFromJson8 = str3;
                        strFromJson7 = str4;
                        break;
                    default:
                        listFromJson = list;
                        strFromJson10 = str;
                        strFromJson9 = str2;
                        strFromJson8 = str3;
                        strFromJson7 = str4;
                        break;
                }
            } else {
                jsonReader.endObject();
                if (strFromJson == null) {
                    JsonDataException jsonDataExceptionMissingProperty = Util.missingProperty("iss", "iss", jsonReader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty, "");
                    throw jsonDataExceptionMissingProperty;
                }
                if (strFromJson2 == null) {
                    JsonDataException jsonDataExceptionMissingProperty2 = Util.missingProperty("domain", "domain", jsonReader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty2, "");
                    throw jsonDataExceptionMissingProperty2;
                }
                if (strFromJson3 == null) {
                    JsonDataException jsonDataExceptionMissingProperty3 = Util.missingProperty("aud", "aud", jsonReader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty3, "");
                    throw jsonDataExceptionMissingProperty3;
                }
                if (strFromJson4 == null) {
                    JsonDataException jsonDataExceptionMissingProperty4 = Util.missingProperty("version", "version", jsonReader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty4, "");
                    throw jsonDataExceptionMissingProperty4;
                }
                if (strFromJson5 == null) {
                    JsonDataException jsonDataExceptionMissingProperty5 = Util.missingProperty("nonce", "nonce", jsonReader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty5, "");
                    throw jsonDataExceptionMissingProperty5;
                }
                if (strFromJson6 != null) {
                    return new Cacao.Payload(strFromJson, strFromJson2, strFromJson3, strFromJson4, strFromJson5, strFromJson6, str4, str3, str2, str, list);
                }
                JsonDataException jsonDataExceptionMissingProperty6 = Util.missingProperty("iat", "iat", jsonReader);
                Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty6, "");
                throw jsonDataExceptionMissingProperty6;
            }
        }
    }

    /* JADX DEBUG: Method merged with bridge method: toJson(Lcom/squareup/moshi/JsonWriter;Ljava/lang/Object;)V */
    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(@NotNull JsonWriter jsonWriter, Cacao.Payload payload) throws IOException {
        Intrinsics.checkNotNullParameter(jsonWriter, "");
        if (payload == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        jsonWriter.beginObject();
        jsonWriter.name("iss");
        this.stringAdapter.toJson(jsonWriter, payload.getIss());
        jsonWriter.name("domain");
        this.stringAdapter.toJson(jsonWriter, payload.getDomain());
        jsonWriter.name("aud");
        this.stringAdapter.toJson(jsonWriter, payload.getAud());
        jsonWriter.name("version");
        this.stringAdapter.toJson(jsonWriter, payload.getVersion());
        jsonWriter.name("nonce");
        this.stringAdapter.toJson(jsonWriter, payload.getNonce());
        jsonWriter.name("iat");
        this.stringAdapter.toJson(jsonWriter, payload.getIat());
        jsonWriter.name("nbf");
        this.nullableStringAdapter.toJson(jsonWriter, payload.getNbf());
        jsonWriter.name("exp");
        this.nullableStringAdapter.toJson(jsonWriter, payload.getExp());
        jsonWriter.name("statement");
        this.nullableStringAdapter.toJson(jsonWriter, payload.getStatement());
        jsonWriter.name("requestId");
        this.nullableStringAdapter.toJson(jsonWriter, payload.getRequestId());
        jsonWriter.name("resources");
        this.nullableListOfStringAdapter.toJson(jsonWriter, payload.getResources());
        jsonWriter.endObject();
    }
}
