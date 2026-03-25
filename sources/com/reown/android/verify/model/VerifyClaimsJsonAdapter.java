package com.reown.android.verify.model;

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
public final class VerifyClaimsJsonAdapter extends JsonAdapter<VerifyClaims> {
    public final JsonAdapter<Boolean> booleanAdapter;
    public final JsonAdapter<Long> longAdapter;
    public final JsonAdapter<Boolean> nullableBooleanAdapter;
    public final JsonReader.Options options;
    public final JsonAdapter<String> stringAdapter;

    public VerifyClaimsJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "");
        JsonReader.Options optionsOf = JsonReader.Options.of("origin", "id", "isScam", "exp", "isVerified");
        Intrinsics.checkNotNullExpressionValue(optionsOf, "");
        this.options = optionsOf;
        JsonAdapter<String> jsonAdapterAdapter = moshi.adapter(String.class, yEE.copydefault(), "origin");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter, "");
        this.stringAdapter = jsonAdapterAdapter;
        JsonAdapter<Boolean> jsonAdapterAdapter2 = moshi.adapter(Boolean.class, yEE.copydefault(), "isScam");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter2, "");
        this.nullableBooleanAdapter = jsonAdapterAdapter2;
        JsonAdapter<Long> jsonAdapterAdapter3 = moshi.adapter(Long.TYPE, yEE.copydefault(), "expiration");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter3, "");
        this.longAdapter = jsonAdapterAdapter3;
        JsonAdapter<Boolean> jsonAdapterAdapter4 = moshi.adapter(Boolean.TYPE, yEE.copydefault(), "isVerified");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter4, "");
        this.booleanAdapter = jsonAdapterAdapter4;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(34);
        sb.append("GeneratedJsonAdapter(");
        sb.append("VerifyClaims");
        sb.append(')');
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    /* JADX DEBUG: Method merged with bridge method: fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object; */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.JsonAdapter
    public VerifyClaims fromJson(@NotNull JsonReader jsonReader) throws IOException {
        Intrinsics.checkNotNullParameter(jsonReader, "");
        jsonReader.beginObject();
        Long lFromJson = null;
        Boolean boolFromJson = null;
        String strFromJson = null;
        String strFromJson2 = null;
        Boolean boolFromJson2 = null;
        while (jsonReader.hasNext()) {
            int iSelectName = jsonReader.selectName(this.options);
            if (iSelectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (iSelectName == 0) {
                strFromJson = this.stringAdapter.fromJson(jsonReader);
                if (strFromJson == null) {
                    JsonDataException jsonDataExceptionUnexpectedNull = Util.unexpectedNull("origin", "origin", jsonReader);
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
                boolFromJson2 = this.nullableBooleanAdapter.fromJson(jsonReader);
            } else if (iSelectName == 3) {
                lFromJson = this.longAdapter.fromJson(jsonReader);
                if (lFromJson == null) {
                    JsonDataException jsonDataExceptionUnexpectedNull3 = Util.unexpectedNull("expiration", "exp", jsonReader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull3, "");
                    throw jsonDataExceptionUnexpectedNull3;
                }
            } else if (iSelectName == 4 && (boolFromJson = this.booleanAdapter.fromJson(jsonReader)) == null) {
                JsonDataException jsonDataExceptionUnexpectedNull4 = Util.unexpectedNull("isVerified", "isVerified", jsonReader);
                Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull4, "");
                throw jsonDataExceptionUnexpectedNull4;
            }
        }
        jsonReader.endObject();
        if (strFromJson == null) {
            JsonDataException jsonDataExceptionMissingProperty = Util.missingProperty("origin", "origin", jsonReader);
            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty, "");
            throw jsonDataExceptionMissingProperty;
        }
        if (strFromJson2 == null) {
            JsonDataException jsonDataExceptionMissingProperty2 = Util.missingProperty("id", "id", jsonReader);
            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty2, "");
            throw jsonDataExceptionMissingProperty2;
        }
        if (lFromJson != null) {
            long jLongValue = lFromJson.longValue();
            if (boolFromJson != null) {
                return new VerifyClaims(strFromJson, strFromJson2, boolFromJson2, jLongValue, boolFromJson.booleanValue());
            }
            JsonDataException jsonDataExceptionMissingProperty3 = Util.missingProperty("isVerified", "isVerified", jsonReader);
            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty3, "");
            throw jsonDataExceptionMissingProperty3;
        }
        JsonDataException jsonDataExceptionMissingProperty4 = Util.missingProperty("expiration", "exp", jsonReader);
        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty4, "");
        throw jsonDataExceptionMissingProperty4;
    }

    /* JADX DEBUG: Method merged with bridge method: toJson(Lcom/squareup/moshi/JsonWriter;Ljava/lang/Object;)V */
    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(@NotNull JsonWriter jsonWriter, VerifyClaims verifyClaims) throws IOException {
        Intrinsics.checkNotNullParameter(jsonWriter, "");
        if (verifyClaims == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        jsonWriter.beginObject();
        jsonWriter.name("origin");
        this.stringAdapter.toJson(jsonWriter, verifyClaims.getOrigin());
        jsonWriter.name("id");
        this.stringAdapter.toJson(jsonWriter, verifyClaims.getId());
        jsonWriter.name("isScam");
        this.nullableBooleanAdapter.toJson(jsonWriter, verifyClaims.isScam());
        jsonWriter.name("exp");
        this.longAdapter.toJson(jsonWriter, Long.valueOf(verifyClaims.getExpiration()));
        jsonWriter.name("isVerified");
        this.booleanAdapter.toJson(jsonWriter, Boolean.valueOf(verifyClaims.isVerified()));
        jsonWriter.endObject();
    }
}
