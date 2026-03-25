package com.reown.android.verify.model;

import com.google.firebase.messaging.Constants;
import com.reown.android.verify.model.VerifyServerResponse;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import o.yEE;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final class VerifyServerResponse_ResolveAttestationJsonAdapter extends JsonAdapter<VerifyServerResponse.ResolveAttestation> {
    public final JsonAdapter<VerifyServerResponse.Error> nullableErrorAdapter;
    public final JsonAdapter<Origin> nullableOriginAdapter;
    public final JsonReader.Options options;

    public VerifyServerResponse_ResolveAttestationJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "");
        JsonReader.Options optionsOf = JsonReader.Options.of(Constants.IPC_BUNDLE_KEY_SEND_ERROR, "value");
        Intrinsics.checkNotNullExpressionValue(optionsOf, "");
        this.options = optionsOf;
        JsonAdapter<VerifyServerResponse.Error> jsonAdapterAdapter = moshi.adapter(VerifyServerResponse.Error.class, yEE.copydefault(), Constants.IPC_BUNDLE_KEY_SEND_ERROR);
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter, "");
        this.nullableErrorAdapter = jsonAdapterAdapter;
        JsonAdapter<Origin> jsonAdapterAdapter2 = moshi.adapter(Origin.class, yEE.copydefault(), "value");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter2, "");
        this.nullableOriginAdapter = jsonAdapterAdapter2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(61);
        sb.append("GeneratedJsonAdapter(");
        sb.append("VerifyServerResponse.ResolveAttestation");
        sb.append(')');
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    /* JADX DEBUG: Method merged with bridge method: fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object; */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.JsonAdapter
    public VerifyServerResponse.ResolveAttestation fromJson(@NotNull JsonReader jsonReader) throws IOException {
        Intrinsics.checkNotNullParameter(jsonReader, "");
        jsonReader.beginObject();
        VerifyServerResponse.Error errorFromJson = null;
        Origin originFromJson = null;
        while (jsonReader.hasNext()) {
            int iSelectName = jsonReader.selectName(this.options);
            if (iSelectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (iSelectName == 0) {
                errorFromJson = this.nullableErrorAdapter.fromJson(jsonReader);
            } else if (iSelectName == 1) {
                originFromJson = this.nullableOriginAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        return new VerifyServerResponse.ResolveAttestation(errorFromJson, originFromJson);
    }

    /* JADX DEBUG: Method merged with bridge method: toJson(Lcom/squareup/moshi/JsonWriter;Ljava/lang/Object;)V */
    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(@NotNull JsonWriter jsonWriter, VerifyServerResponse.ResolveAttestation resolveAttestation) throws IOException {
        Intrinsics.checkNotNullParameter(jsonWriter, "");
        if (resolveAttestation == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        jsonWriter.beginObject();
        jsonWriter.name(Constants.IPC_BUNDLE_KEY_SEND_ERROR);
        this.nullableErrorAdapter.toJson(jsonWriter, resolveAttestation.getError());
        jsonWriter.name("value");
        this.nullableOriginAdapter.toJson(jsonWriter, resolveAttestation.getValue());
        jsonWriter.endObject();
    }
}
