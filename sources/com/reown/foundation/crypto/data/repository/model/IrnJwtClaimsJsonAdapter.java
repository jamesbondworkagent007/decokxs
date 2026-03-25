package com.reown.foundation.crypto.data.repository.model;

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
public final class IrnJwtClaimsJsonAdapter extends JsonAdapter<IrnJwtClaims> {
    private final JsonAdapter<Long> longAdapter;
    private final JsonReader.Options options;
    private final JsonAdapter<String> stringAdapter;

    public IrnJwtClaimsJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "");
        JsonReader.Options optionsOf = JsonReader.Options.of("iss", "sub", "aud", "iat", "exp");
        Intrinsics.checkNotNullExpressionValue(optionsOf, "");
        this.options = optionsOf;
        JsonAdapter<String> jsonAdapterAdapter = moshi.adapter(String.class, yEE.copydefault(), "issuer");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter, "");
        this.stringAdapter = jsonAdapterAdapter;
        JsonAdapter<Long> jsonAdapterAdapter2 = moshi.adapter(Long.TYPE, yEE.copydefault(), "issuedAt");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter2, "");
        this.longAdapter = jsonAdapterAdapter2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(34);
        sb.append("GeneratedJsonAdapter(");
        sb.append("IrnJwtClaims");
        sb.append(')');
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    /* JADX DEBUG: Method merged with bridge method: fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object; */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.JsonAdapter
    public IrnJwtClaims fromJson(@NotNull JsonReader jsonReader) throws IOException {
        Intrinsics.checkNotNullParameter(jsonReader, "");
        jsonReader.beginObject();
        Long lFromJson = null;
        Long l = null;
        String strFromJson = null;
        String strFromJson2 = null;
        String strFromJson3 = null;
        while (true) {
            Long l2 = l;
            Long l3 = lFromJson;
            String str = strFromJson3;
            if (jsonReader.hasNext()) {
                int iSelectName = jsonReader.selectName(this.options);
                String str2 = strFromJson2;
                if (iSelectName == -1) {
                    jsonReader.skipName();
                    jsonReader.skipValue();
                } else if (iSelectName == 0) {
                    strFromJson = this.stringAdapter.fromJson(jsonReader);
                    if (strFromJson == null) {
                        JsonDataException jsonDataExceptionUnexpectedNull = Util.unexpectedNull("issuer", "iss", jsonReader);
                        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull, "");
                        throw jsonDataExceptionUnexpectedNull;
                    }
                } else if (iSelectName == 1) {
                    strFromJson2 = this.stringAdapter.fromJson(jsonReader);
                    if (strFromJson2 == null) {
                        JsonDataException jsonDataExceptionUnexpectedNull2 = Util.unexpectedNull("subject", "sub", jsonReader);
                        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull2, "");
                        throw jsonDataExceptionUnexpectedNull2;
                    }
                    l = l2;
                    lFromJson = l3;
                    strFromJson3 = str;
                } else if (iSelectName != 2) {
                    if (iSelectName == 3) {
                        lFromJson = this.longAdapter.fromJson(jsonReader);
                        if (lFromJson == null) {
                            JsonDataException jsonDataExceptionUnexpectedNull3 = Util.unexpectedNull("issuedAt", "iat", jsonReader);
                            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull3, "");
                            throw jsonDataExceptionUnexpectedNull3;
                        }
                        l = l2;
                    } else if (iSelectName == 4) {
                        Long lFromJson2 = this.longAdapter.fromJson(jsonReader);
                        if (lFromJson2 == null) {
                            JsonDataException jsonDataExceptionUnexpectedNull4 = Util.unexpectedNull("expiration", "exp", jsonReader);
                            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull4, "");
                            throw jsonDataExceptionUnexpectedNull4;
                        }
                        l = lFromJson2;
                        lFromJson = l3;
                    }
                    strFromJson2 = str2;
                    strFromJson3 = str;
                } else {
                    strFromJson3 = this.stringAdapter.fromJson(jsonReader);
                    if (strFromJson3 == null) {
                        JsonDataException jsonDataExceptionUnexpectedNull5 = Util.unexpectedNull("audience", "aud", jsonReader);
                        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull5, "");
                        throw jsonDataExceptionUnexpectedNull5;
                    }
                    l = l2;
                    lFromJson = l3;
                    strFromJson2 = str2;
                }
                strFromJson2 = str2;
                l = l2;
                lFromJson = l3;
                strFromJson3 = str;
            } else {
                String str3 = strFromJson2;
                jsonReader.endObject();
                if (strFromJson == null) {
                    JsonDataException jsonDataExceptionMissingProperty = Util.missingProperty("issuer", "iss", jsonReader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty, "");
                    throw jsonDataExceptionMissingProperty;
                }
                if (str3 == null) {
                    JsonDataException jsonDataExceptionMissingProperty2 = Util.missingProperty("subject", "sub", jsonReader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty2, "");
                    throw jsonDataExceptionMissingProperty2;
                }
                if (str == null) {
                    JsonDataException jsonDataExceptionMissingProperty3 = Util.missingProperty("audience", "aud", jsonReader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty3, "");
                    throw jsonDataExceptionMissingProperty3;
                }
                if (l3 != null) {
                    long jLongValue = l3.longValue();
                    if (l2 != null) {
                        return new IrnJwtClaims(strFromJson, str3, str, jLongValue, l2.longValue());
                    }
                    JsonDataException jsonDataExceptionMissingProperty4 = Util.missingProperty("expiration", "exp", jsonReader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty4, "");
                    throw jsonDataExceptionMissingProperty4;
                }
                JsonDataException jsonDataExceptionMissingProperty5 = Util.missingProperty("issuedAt", "iat", jsonReader);
                Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty5, "");
                throw jsonDataExceptionMissingProperty5;
            }
        }
    }

    /* JADX DEBUG: Method merged with bridge method: toJson(Lcom/squareup/moshi/JsonWriter;Ljava/lang/Object;)V */
    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(@NotNull JsonWriter jsonWriter, IrnJwtClaims irnJwtClaims) throws IOException {
        Intrinsics.checkNotNullParameter(jsonWriter, "");
        if (irnJwtClaims == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        jsonWriter.beginObject();
        jsonWriter.name("iss");
        this.stringAdapter.toJson(jsonWriter, irnJwtClaims.getIssuer());
        jsonWriter.name("sub");
        this.stringAdapter.toJson(jsonWriter, irnJwtClaims.getSubject());
        jsonWriter.name("aud");
        this.stringAdapter.toJson(jsonWriter, irnJwtClaims.getAudience());
        jsonWriter.name("iat");
        this.longAdapter.toJson(jsonWriter, Long.valueOf(irnJwtClaims.getIssuedAt()));
        jsonWriter.name("exp");
        this.longAdapter.toJson(jsonWriter, Long.valueOf(irnJwtClaims.getExpiration()));
        jsonWriter.endObject();
    }
}
