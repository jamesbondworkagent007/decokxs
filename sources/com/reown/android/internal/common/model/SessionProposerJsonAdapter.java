package com.reown.android.internal.common.model;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
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
public final class SessionProposerJsonAdapter extends JsonAdapter<SessionProposer> {
    public final JsonAdapter<AppMetaData> appMetaDataAdapter;
    public final JsonReader.Options options;
    public final JsonAdapter<String> stringAdapter;

    public SessionProposerJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "");
        JsonReader.Options optionsOf = JsonReader.Options.of("publicKey", TtmlNode.TAG_METADATA);
        Intrinsics.checkNotNullExpressionValue(optionsOf, "");
        this.options = optionsOf;
        JsonAdapter<String> jsonAdapterAdapter = moshi.adapter(String.class, yEE.copydefault(), "publicKey");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter, "");
        this.stringAdapter = jsonAdapterAdapter;
        JsonAdapter<AppMetaData> jsonAdapterAdapter2 = moshi.adapter(AppMetaData.class, yEE.copydefault(), TtmlNode.TAG_METADATA);
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter2, "");
        this.appMetaDataAdapter = jsonAdapterAdapter2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(37);
        sb.append("GeneratedJsonAdapter(");
        sb.append("SessionProposer");
        sb.append(')');
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    /* JADX DEBUG: Method merged with bridge method: fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object; */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.JsonAdapter
    public SessionProposer fromJson(@NotNull JsonReader jsonReader) throws IOException {
        Intrinsics.checkNotNullParameter(jsonReader, "");
        jsonReader.beginObject();
        String strFromJson = null;
        AppMetaData appMetaDataFromJson = null;
        while (jsonReader.hasNext()) {
            int iSelectName = jsonReader.selectName(this.options);
            if (iSelectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (iSelectName == 0) {
                strFromJson = this.stringAdapter.fromJson(jsonReader);
                if (strFromJson == null) {
                    JsonDataException jsonDataExceptionUnexpectedNull = Util.unexpectedNull("publicKey", "publicKey", jsonReader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull, "");
                    throw jsonDataExceptionUnexpectedNull;
                }
            } else if (iSelectName == 1 && (appMetaDataFromJson = this.appMetaDataAdapter.fromJson(jsonReader)) == null) {
                JsonDataException jsonDataExceptionUnexpectedNull2 = Util.unexpectedNull(TtmlNode.TAG_METADATA, TtmlNode.TAG_METADATA, jsonReader);
                Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull2, "");
                throw jsonDataExceptionUnexpectedNull2;
            }
        }
        jsonReader.endObject();
        if (strFromJson == null) {
            JsonDataException jsonDataExceptionMissingProperty = Util.missingProperty("publicKey", "publicKey", jsonReader);
            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty, "");
            throw jsonDataExceptionMissingProperty;
        }
        if (appMetaDataFromJson != null) {
            return new SessionProposer(strFromJson, appMetaDataFromJson);
        }
        JsonDataException jsonDataExceptionMissingProperty2 = Util.missingProperty(TtmlNode.TAG_METADATA, TtmlNode.TAG_METADATA, jsonReader);
        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty2, "");
        throw jsonDataExceptionMissingProperty2;
    }

    /* JADX DEBUG: Method merged with bridge method: toJson(Lcom/squareup/moshi/JsonWriter;Ljava/lang/Object;)V */
    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(@NotNull JsonWriter jsonWriter, SessionProposer sessionProposer) throws IOException {
        Intrinsics.checkNotNullParameter(jsonWriter, "");
        if (sessionProposer == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        jsonWriter.beginObject();
        jsonWriter.name("publicKey");
        this.stringAdapter.toJson(jsonWriter, sessionProposer.getPublicKey());
        jsonWriter.name(TtmlNode.TAG_METADATA);
        this.appMetaDataAdapter.toJson(jsonWriter, sessionProposer.getMetadata());
        jsonWriter.endObject();
    }
}
