package com.reown.android.keyserver.model;

import com.google.firebase.messaging.Constants;
import com.reown.android.keyserver.model.KeyServerHttpResponse;
import com.reown.android.keyserver.model.KeyServerResponse;
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
public final class KeyServerHttpResponse_ResolveIdentityJsonAdapter extends JsonAdapter<KeyServerHttpResponse.ResolveIdentity> {
    public final JsonAdapter<KeyServerHttpResponse.Error> nullableErrorAdapter;
    public final JsonReader.Options options;
    public final JsonAdapter<KeyServerResponse.ResolveIdentity> resolveIdentityAdapter;
    public final JsonAdapter<String> stringAdapter;

    public KeyServerHttpResponse_ResolveIdentityJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "");
        JsonReader.Options optionsOf = JsonReader.Options.of("status", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "value");
        Intrinsics.checkNotNullExpressionValue(optionsOf, "");
        this.options = optionsOf;
        JsonAdapter<String> jsonAdapterAdapter = moshi.adapter(String.class, yEE.copydefault(), "status");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter, "");
        this.stringAdapter = jsonAdapterAdapter;
        JsonAdapter<KeyServerHttpResponse.Error> jsonAdapterAdapter2 = moshi.adapter(KeyServerHttpResponse.Error.class, yEE.copydefault(), Constants.IPC_BUNDLE_KEY_SEND_ERROR);
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter2, "");
        this.nullableErrorAdapter = jsonAdapterAdapter2;
        JsonAdapter<KeyServerResponse.ResolveIdentity> jsonAdapterAdapter3 = moshi.adapter(KeyServerResponse.ResolveIdentity.class, yEE.copydefault(), "value");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter3, "");
        this.resolveIdentityAdapter = jsonAdapterAdapter3;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(59);
        sb.append("GeneratedJsonAdapter(");
        sb.append("KeyServerHttpResponse.ResolveIdentity");
        sb.append(')');
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    /* JADX DEBUG: Method merged with bridge method: fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object; */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.JsonAdapter
    public KeyServerHttpResponse.ResolveIdentity fromJson(@NotNull JsonReader jsonReader) throws IOException {
        Intrinsics.checkNotNullParameter(jsonReader, "");
        jsonReader.beginObject();
        String strFromJson = null;
        KeyServerResponse.ResolveIdentity resolveIdentityFromJson = null;
        KeyServerHttpResponse.Error errorFromJson = null;
        while (jsonReader.hasNext()) {
            int iSelectName = jsonReader.selectName(this.options);
            if (iSelectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (iSelectName == 0) {
                strFromJson = this.stringAdapter.fromJson(jsonReader);
                if (strFromJson == null) {
                    JsonDataException jsonDataExceptionUnexpectedNull = Util.unexpectedNull("status", "status", jsonReader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull, "");
                    throw jsonDataExceptionUnexpectedNull;
                }
            } else if (iSelectName == 1) {
                errorFromJson = this.nullableErrorAdapter.fromJson(jsonReader);
            } else if (iSelectName == 2 && (resolveIdentityFromJson = this.resolveIdentityAdapter.fromJson(jsonReader)) == null) {
                JsonDataException jsonDataExceptionUnexpectedNull2 = Util.unexpectedNull("value__", "value", jsonReader);
                Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull2, "");
                throw jsonDataExceptionUnexpectedNull2;
            }
        }
        jsonReader.endObject();
        if (strFromJson == null) {
            JsonDataException jsonDataExceptionMissingProperty = Util.missingProperty("status", "status", jsonReader);
            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty, "");
            throw jsonDataExceptionMissingProperty;
        }
        if (resolveIdentityFromJson != null) {
            return new KeyServerHttpResponse.ResolveIdentity(strFromJson, errorFromJson, resolveIdentityFromJson);
        }
        JsonDataException jsonDataExceptionMissingProperty2 = Util.missingProperty("value__", "value", jsonReader);
        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty2, "");
        throw jsonDataExceptionMissingProperty2;
    }

    /* JADX DEBUG: Method merged with bridge method: toJson(Lcom/squareup/moshi/JsonWriter;Ljava/lang/Object;)V */
    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(@NotNull JsonWriter jsonWriter, KeyServerHttpResponse.ResolveIdentity resolveIdentity) throws IOException {
        Intrinsics.checkNotNullParameter(jsonWriter, "");
        if (resolveIdentity == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        jsonWriter.beginObject();
        jsonWriter.name("status");
        this.stringAdapter.toJson(jsonWriter, resolveIdentity.getStatus());
        jsonWriter.name(Constants.IPC_BUNDLE_KEY_SEND_ERROR);
        this.nullableErrorAdapter.toJson(jsonWriter, resolveIdentity.getError());
        jsonWriter.name("value");
        this.resolveIdentityAdapter.toJson(jsonWriter, resolveIdentity.getValue());
        jsonWriter.endObject();
    }
}
