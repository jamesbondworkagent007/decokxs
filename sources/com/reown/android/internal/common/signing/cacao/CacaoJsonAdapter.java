package com.reown.android.internal.common.signing.cacao;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.ibm.icu.text.DateFormat;
import com.reown.android.internal.common.signing.cacao.Cacao;
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
public final class CacaoJsonAdapter extends JsonAdapter<Cacao> {
    public final JsonAdapter<Cacao.Header> headerAdapter;
    public final JsonReader.Options options;
    public final JsonAdapter<Cacao.Payload> payloadAdapter;
    public final JsonAdapter<Cacao.Signature> signatureAdapter;

    public CacaoJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "");
        JsonReader.Options optionsOf = JsonReader.Options.of("h", TtmlNode.TAG_P, DateFormat.SECOND);
        Intrinsics.checkNotNullExpressionValue(optionsOf, "");
        this.options = optionsOf;
        JsonAdapter<Cacao.Header> jsonAdapterAdapter = moshi.adapter(Cacao.Header.class, yEE.copydefault(), "header");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter, "");
        this.headerAdapter = jsonAdapterAdapter;
        JsonAdapter<Cacao.Payload> jsonAdapterAdapter2 = moshi.adapter(Cacao.Payload.class, yEE.copydefault(), "payload");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter2, "");
        this.payloadAdapter = jsonAdapterAdapter2;
        JsonAdapter<Cacao.Signature> jsonAdapterAdapter3 = moshi.adapter(Cacao.Signature.class, yEE.copydefault(), "signature");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter3, "");
        this.signatureAdapter = jsonAdapterAdapter3;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(27);
        sb.append("GeneratedJsonAdapter(");
        sb.append("Cacao");
        sb.append(')');
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    /* JADX DEBUG: Method merged with bridge method: fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object; */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.JsonAdapter
    public Cacao fromJson(@NotNull JsonReader jsonReader) throws IOException {
        Intrinsics.checkNotNullParameter(jsonReader, "");
        jsonReader.beginObject();
        Cacao.Header headerFromJson = null;
        Cacao.Payload payloadFromJson = null;
        Cacao.Signature signatureFromJson = null;
        while (jsonReader.hasNext()) {
            int iSelectName = jsonReader.selectName(this.options);
            if (iSelectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (iSelectName == 0) {
                headerFromJson = this.headerAdapter.fromJson(jsonReader);
                if (headerFromJson == null) {
                    JsonDataException jsonDataExceptionUnexpectedNull = Util.unexpectedNull("header_", "h", jsonReader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull, "");
                    throw jsonDataExceptionUnexpectedNull;
                }
            } else if (iSelectName == 1) {
                payloadFromJson = this.payloadAdapter.fromJson(jsonReader);
                if (payloadFromJson == null) {
                    JsonDataException jsonDataExceptionUnexpectedNull2 = Util.unexpectedNull("payload", TtmlNode.TAG_P, jsonReader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull2, "");
                    throw jsonDataExceptionUnexpectedNull2;
                }
            } else if (iSelectName == 2 && (signatureFromJson = this.signatureAdapter.fromJson(jsonReader)) == null) {
                JsonDataException jsonDataExceptionUnexpectedNull3 = Util.unexpectedNull("signature", DateFormat.SECOND, jsonReader);
                Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull3, "");
                throw jsonDataExceptionUnexpectedNull3;
            }
        }
        jsonReader.endObject();
        if (headerFromJson == null) {
            JsonDataException jsonDataExceptionMissingProperty = Util.missingProperty("header_", "h", jsonReader);
            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty, "");
            throw jsonDataExceptionMissingProperty;
        }
        if (payloadFromJson == null) {
            JsonDataException jsonDataExceptionMissingProperty2 = Util.missingProperty("payload", TtmlNode.TAG_P, jsonReader);
            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty2, "");
            throw jsonDataExceptionMissingProperty2;
        }
        if (signatureFromJson != null) {
            return new Cacao(headerFromJson, payloadFromJson, signatureFromJson);
        }
        JsonDataException jsonDataExceptionMissingProperty3 = Util.missingProperty("signature", DateFormat.SECOND, jsonReader);
        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty3, "");
        throw jsonDataExceptionMissingProperty3;
    }

    /* JADX DEBUG: Method merged with bridge method: toJson(Lcom/squareup/moshi/JsonWriter;Ljava/lang/Object;)V */
    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(@NotNull JsonWriter jsonWriter, Cacao cacao) throws IOException {
        Intrinsics.checkNotNullParameter(jsonWriter, "");
        if (cacao == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        jsonWriter.beginObject();
        jsonWriter.name("h");
        this.headerAdapter.toJson(jsonWriter, cacao.getHeader());
        jsonWriter.name(TtmlNode.TAG_P);
        this.payloadAdapter.toJson(jsonWriter, cacao.getPayload());
        jsonWriter.name(DateFormat.SECOND);
        this.signatureAdapter.toJson(jsonWriter, cacao.getSignature());
        jsonWriter.endObject();
    }
}
