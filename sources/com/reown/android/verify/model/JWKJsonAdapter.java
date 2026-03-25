package com.reown.android.verify.model;

import com.ibm.icu.text.DateFormat;
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
public final class JWKJsonAdapter extends JsonAdapter<JWK> {
    public final JsonAdapter<Boolean> booleanAdapter;
    public final JsonAdapter<List<String>> listOfStringAdapter;
    public final JsonReader.Options options;
    public final JsonAdapter<String> stringAdapter;

    public JWKJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "");
        JsonReader.Options optionsOf = JsonReader.Options.of("crv", "ext", "key_ops", "kty", "x", DateFormat.YEAR);
        Intrinsics.checkNotNullExpressionValue(optionsOf, "");
        this.options = optionsOf;
        JsonAdapter<String> jsonAdapterAdapter = moshi.adapter(String.class, yEE.copydefault(), "crv");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter, "");
        this.stringAdapter = jsonAdapterAdapter;
        JsonAdapter<Boolean> jsonAdapterAdapter2 = moshi.adapter(Boolean.TYPE, yEE.copydefault(), "ext");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter2, "");
        this.booleanAdapter = jsonAdapterAdapter2;
        JsonAdapter<List<String>> jsonAdapterAdapter3 = moshi.adapter(Types.newParameterizedType(List.class, String.class), yEE.copydefault(), "keyOps");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter3, "");
        this.listOfStringAdapter = jsonAdapterAdapter3;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(25);
        sb.append("GeneratedJsonAdapter(");
        sb.append("JWK");
        sb.append(')');
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    /* JADX DEBUG: Method merged with bridge method: fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object; */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.JsonAdapter
    public JWK fromJson(@NotNull JsonReader jsonReader) throws IOException {
        Intrinsics.checkNotNullParameter(jsonReader, "");
        jsonReader.beginObject();
        Boolean boolFromJson = null;
        String str = null;
        List<String> list = null;
        String str2 = null;
        String str3 = null;
        String strFromJson = null;
        while (true) {
            String str4 = strFromJson;
            if (jsonReader.hasNext()) {
                switch (jsonReader.selectName(this.options)) {
                    case -1:
                        jsonReader.skipName();
                        jsonReader.skipValue();
                        break;
                    case 0:
                        String strFromJson2 = this.stringAdapter.fromJson(jsonReader);
                        if (strFromJson2 == null) {
                            JsonDataException jsonDataExceptionUnexpectedNull = Util.unexpectedNull("crv", "crv", jsonReader);
                            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull, "");
                            throw jsonDataExceptionUnexpectedNull;
                        }
                        str = strFromJson2;
                        break;
                        break;
                    case 1:
                        boolFromJson = this.booleanAdapter.fromJson(jsonReader);
                        if (boolFromJson == null) {
                            JsonDataException jsonDataExceptionUnexpectedNull2 = Util.unexpectedNull("ext", "ext", jsonReader);
                            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull2, "");
                            throw jsonDataExceptionUnexpectedNull2;
                        }
                        break;
                    case 2:
                        List<String> listFromJson = this.listOfStringAdapter.fromJson(jsonReader);
                        if (listFromJson == null) {
                            JsonDataException jsonDataExceptionUnexpectedNull3 = Util.unexpectedNull("keyOps", "key_ops", jsonReader);
                            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull3, "");
                            throw jsonDataExceptionUnexpectedNull3;
                        }
                        list = listFromJson;
                        break;
                        break;
                    case 3:
                        String strFromJson3 = this.stringAdapter.fromJson(jsonReader);
                        if (strFromJson3 == null) {
                            JsonDataException jsonDataExceptionUnexpectedNull4 = Util.unexpectedNull("kty", "kty", jsonReader);
                            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull4, "");
                            throw jsonDataExceptionUnexpectedNull4;
                        }
                        str2 = strFromJson3;
                        break;
                        break;
                    case 4:
                        String strFromJson4 = this.stringAdapter.fromJson(jsonReader);
                        if (strFromJson4 == null) {
                            JsonDataException jsonDataExceptionUnexpectedNull5 = Util.unexpectedNull("x", "x", jsonReader);
                            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull5, "");
                            throw jsonDataExceptionUnexpectedNull5;
                        }
                        str3 = strFromJson4;
                        break;
                        break;
                    case 5:
                        strFromJson = this.stringAdapter.fromJson(jsonReader);
                        if (strFromJson == null) {
                            JsonDataException jsonDataExceptionUnexpectedNull6 = Util.unexpectedNull(DateFormat.YEAR, DateFormat.YEAR, jsonReader);
                            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull6, "");
                            throw jsonDataExceptionUnexpectedNull6;
                        }
                        continue;
                        break;
                }
                strFromJson = str4;
            } else {
                jsonReader.endObject();
                if (str == null) {
                    JsonDataException jsonDataExceptionMissingProperty = Util.missingProperty("crv", "crv", jsonReader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty, "");
                    throw jsonDataExceptionMissingProperty;
                }
                if (boolFromJson != null) {
                    boolean zBooleanValue = boolFromJson.booleanValue();
                    if (list == null) {
                        JsonDataException jsonDataExceptionMissingProperty2 = Util.missingProperty("keyOps", "key_ops", jsonReader);
                        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty2, "");
                        throw jsonDataExceptionMissingProperty2;
                    }
                    if (str2 == null) {
                        JsonDataException jsonDataExceptionMissingProperty3 = Util.missingProperty("kty", "kty", jsonReader);
                        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty3, "");
                        throw jsonDataExceptionMissingProperty3;
                    }
                    if (str3 == null) {
                        JsonDataException jsonDataExceptionMissingProperty4 = Util.missingProperty("x", "x", jsonReader);
                        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty4, "");
                        throw jsonDataExceptionMissingProperty4;
                    }
                    if (str4 != null) {
                        return new JWK(str, zBooleanValue, list, str2, str3, str4);
                    }
                    JsonDataException jsonDataExceptionMissingProperty5 = Util.missingProperty(DateFormat.YEAR, DateFormat.YEAR, jsonReader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty5, "");
                    throw jsonDataExceptionMissingProperty5;
                }
                JsonDataException jsonDataExceptionMissingProperty6 = Util.missingProperty("ext", "ext", jsonReader);
                Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty6, "");
                throw jsonDataExceptionMissingProperty6;
            }
        }
    }

    /* JADX DEBUG: Method merged with bridge method: toJson(Lcom/squareup/moshi/JsonWriter;Ljava/lang/Object;)V */
    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(@NotNull JsonWriter jsonWriter, JWK jwk) throws IOException {
        Intrinsics.checkNotNullParameter(jsonWriter, "");
        if (jwk == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        jsonWriter.beginObject();
        jsonWriter.name("crv");
        this.stringAdapter.toJson(jsonWriter, jwk.getCrv());
        jsonWriter.name("ext");
        this.booleanAdapter.toJson(jsonWriter, Boolean.valueOf(jwk.getExt()));
        jsonWriter.name("key_ops");
        this.listOfStringAdapter.toJson(jsonWriter, jwk.getKeyOps());
        jsonWriter.name("kty");
        this.stringAdapter.toJson(jsonWriter, jwk.getKty());
        jsonWriter.name("x");
        this.stringAdapter.toJson(jsonWriter, jwk.getX());
        jsonWriter.name(DateFormat.YEAR);
        this.stringAdapter.toJson(jsonWriter, jwk.getY());
        jsonWriter.endObject();
    }
}
