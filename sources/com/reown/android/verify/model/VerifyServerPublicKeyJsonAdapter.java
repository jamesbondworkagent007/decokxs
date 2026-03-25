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
public final class VerifyServerPublicKeyJsonAdapter extends JsonAdapter<VerifyServerPublicKey> {
    public final JsonAdapter<JWK> jWKAdapter;
    public final JsonAdapter<Long> longAdapter;
    public final JsonReader.Options options;

    public VerifyServerPublicKeyJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "");
        JsonReader.Options optionsOf = JsonReader.Options.of("publicKey", "expiresAt");
        Intrinsics.checkNotNullExpressionValue(optionsOf, "");
        this.options = optionsOf;
        JsonAdapter<JWK> jsonAdapterAdapter = moshi.adapter(JWK.class, yEE.copydefault(), "jwk");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter, "");
        this.jWKAdapter = jsonAdapterAdapter;
        JsonAdapter<Long> jsonAdapterAdapter2 = moshi.adapter(Long.TYPE, yEE.copydefault(), "expiresAt");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter2, "");
        this.longAdapter = jsonAdapterAdapter2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(43);
        sb.append("GeneratedJsonAdapter(");
        sb.append("VerifyServerPublicKey");
        sb.append(')');
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    /* JADX DEBUG: Method merged with bridge method: fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object; */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.JsonAdapter
    public VerifyServerPublicKey fromJson(@NotNull JsonReader jsonReader) throws IOException {
        Intrinsics.checkNotNullParameter(jsonReader, "");
        jsonReader.beginObject();
        JWK jwkFromJson = null;
        Long lFromJson = null;
        while (jsonReader.hasNext()) {
            int iSelectName = jsonReader.selectName(this.options);
            if (iSelectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (iSelectName == 0) {
                jwkFromJson = this.jWKAdapter.fromJson(jsonReader);
                if (jwkFromJson == null) {
                    JsonDataException jsonDataExceptionUnexpectedNull = Util.unexpectedNull("jwk", "publicKey", jsonReader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull, "");
                    throw jsonDataExceptionUnexpectedNull;
                }
            } else if (iSelectName == 1 && (lFromJson = this.longAdapter.fromJson(jsonReader)) == null) {
                JsonDataException jsonDataExceptionUnexpectedNull2 = Util.unexpectedNull("expiresAt", "expiresAt", jsonReader);
                Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull2, "");
                throw jsonDataExceptionUnexpectedNull2;
            }
        }
        jsonReader.endObject();
        if (jwkFromJson == null) {
            JsonDataException jsonDataExceptionMissingProperty = Util.missingProperty("jwk", "publicKey", jsonReader);
            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty, "");
            throw jsonDataExceptionMissingProperty;
        }
        if (lFromJson != null) {
            return new VerifyServerPublicKey(jwkFromJson, lFromJson.longValue());
        }
        JsonDataException jsonDataExceptionMissingProperty2 = Util.missingProperty("expiresAt", "expiresAt", jsonReader);
        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty2, "");
        throw jsonDataExceptionMissingProperty2;
    }

    /* JADX DEBUG: Method merged with bridge method: toJson(Lcom/squareup/moshi/JsonWriter;Ljava/lang/Object;)V */
    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(@NotNull JsonWriter jsonWriter, VerifyServerPublicKey verifyServerPublicKey) throws IOException {
        Intrinsics.checkNotNullParameter(jsonWriter, "");
        if (verifyServerPublicKey == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        jsonWriter.beginObject();
        jsonWriter.name("publicKey");
        this.jWKAdapter.toJson(jsonWriter, verifyServerPublicKey.getJwk());
        jsonWriter.name("expiresAt");
        this.longAdapter.toJson(jsonWriter, Long.valueOf(verifyServerPublicKey.getExpiresAt()));
        jsonWriter.endObject();
    }
}
