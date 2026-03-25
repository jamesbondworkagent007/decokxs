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
public final class VerifyServerResponse_RegisterAttestationJsonAdapter extends JsonAdapter<VerifyServerResponse.RegisterAttestation> {
    public final JsonAdapter<VerifyServerResponse.Error> nullableErrorAdapter;
    public final JsonAdapter<String> nullableStringAdapter;
    public final JsonReader.Options options;

    public VerifyServerResponse_RegisterAttestationJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "");
        JsonReader.Options optionsOf = JsonReader.Options.of(Constants.IPC_BUNDLE_KEY_SEND_ERROR, "value");
        Intrinsics.checkNotNullExpressionValue(optionsOf, "");
        this.options = optionsOf;
        JsonAdapter<VerifyServerResponse.Error> jsonAdapterAdapter = moshi.adapter(VerifyServerResponse.Error.class, yEE.copydefault(), Constants.IPC_BUNDLE_KEY_SEND_ERROR);
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter, "");
        this.nullableErrorAdapter = jsonAdapterAdapter;
        JsonAdapter<String> jsonAdapterAdapter2 = moshi.adapter(String.class, yEE.copydefault(), "value");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter2, "");
        this.nullableStringAdapter = jsonAdapterAdapter2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(62);
        sb.append("GeneratedJsonAdapter(");
        sb.append("VerifyServerResponse.RegisterAttestation");
        sb.append(')');
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    /* JADX DEBUG: Method merged with bridge method: fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object; */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.JsonAdapter
    public VerifyServerResponse.RegisterAttestation fromJson(@NotNull JsonReader jsonReader) throws IOException {
        Intrinsics.checkNotNullParameter(jsonReader, "");
        jsonReader.beginObject();
        VerifyServerResponse.Error errorFromJson = null;
        String strFromJson = null;
        while (jsonReader.hasNext()) {
            int iSelectName = jsonReader.selectName(this.options);
            if (iSelectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (iSelectName == 0) {
                errorFromJson = this.nullableErrorAdapter.fromJson(jsonReader);
            } else if (iSelectName == 1) {
                strFromJson = this.nullableStringAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        return new VerifyServerResponse.RegisterAttestation(errorFromJson, strFromJson);
    }

    /* JADX DEBUG: Method merged with bridge method: toJson(Lcom/squareup/moshi/JsonWriter;Ljava/lang/Object;)V */
    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(@NotNull JsonWriter jsonWriter, VerifyServerResponse.RegisterAttestation registerAttestation) throws IOException {
        Intrinsics.checkNotNullParameter(jsonWriter, "");
        if (registerAttestation == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        jsonWriter.beginObject();
        jsonWriter.name(Constants.IPC_BUNDLE_KEY_SEND_ERROR);
        this.nullableErrorAdapter.toJson(jsonWriter, registerAttestation.getError());
        jsonWriter.name("value");
        this.nullableStringAdapter.toJson(jsonWriter, registerAttestation.getValue());
        jsonWriter.endObject();
    }
}
