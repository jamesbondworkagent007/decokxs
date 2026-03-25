package com.reown.android.internal.common.model.params;

import com.reown.android.internal.common.model.RelayProtocolOptions;
import com.reown.android.internal.common.model.params.CoreSignParams;
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
public final class CoreSignParams_ApprovalParamsJsonAdapter extends JsonAdapter<CoreSignParams.ApprovalParams> {
    public final JsonReader.Options options;
    public final JsonAdapter<RelayProtocolOptions> relayProtocolOptionsAdapter;
    public final JsonAdapter<String> stringAdapter;

    public CoreSignParams_ApprovalParamsJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "");
        JsonReader.Options optionsOf = JsonReader.Options.of("relay", "responderPublicKey");
        Intrinsics.checkNotNullExpressionValue(optionsOf, "");
        this.options = optionsOf;
        JsonAdapter<RelayProtocolOptions> jsonAdapterAdapter = moshi.adapter(RelayProtocolOptions.class, yEE.copydefault(), "relay");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter, "");
        this.relayProtocolOptionsAdapter = jsonAdapterAdapter;
        JsonAdapter<String> jsonAdapterAdapter2 = moshi.adapter(String.class, yEE.copydefault(), "responderPublicKey");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter2, "");
        this.stringAdapter = jsonAdapterAdapter2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(51);
        sb.append("GeneratedJsonAdapter(");
        sb.append("CoreSignParams.ApprovalParams");
        sb.append(')');
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    /* JADX DEBUG: Method merged with bridge method: fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object; */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.JsonAdapter
    public CoreSignParams.ApprovalParams fromJson(@NotNull JsonReader jsonReader) throws IOException {
        Intrinsics.checkNotNullParameter(jsonReader, "");
        jsonReader.beginObject();
        RelayProtocolOptions relayProtocolOptionsFromJson = null;
        String strFromJson = null;
        while (jsonReader.hasNext()) {
            int iSelectName = jsonReader.selectName(this.options);
            if (iSelectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (iSelectName == 0) {
                relayProtocolOptionsFromJson = this.relayProtocolOptionsAdapter.fromJson(jsonReader);
                if (relayProtocolOptionsFromJson == null) {
                    JsonDataException jsonDataExceptionUnexpectedNull = Util.unexpectedNull("relay", "relay", jsonReader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull, "");
                    throw jsonDataExceptionUnexpectedNull;
                }
            } else if (iSelectName == 1 && (strFromJson = this.stringAdapter.fromJson(jsonReader)) == null) {
                JsonDataException jsonDataExceptionUnexpectedNull2 = Util.unexpectedNull("responderPublicKey", "responderPublicKey", jsonReader);
                Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull2, "");
                throw jsonDataExceptionUnexpectedNull2;
            }
        }
        jsonReader.endObject();
        if (relayProtocolOptionsFromJson == null) {
            JsonDataException jsonDataExceptionMissingProperty = Util.missingProperty("relay", "relay", jsonReader);
            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty, "");
            throw jsonDataExceptionMissingProperty;
        }
        if (strFromJson != null) {
            return new CoreSignParams.ApprovalParams(relayProtocolOptionsFromJson, strFromJson);
        }
        JsonDataException jsonDataExceptionMissingProperty2 = Util.missingProperty("responderPublicKey", "responderPublicKey", jsonReader);
        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty2, "");
        throw jsonDataExceptionMissingProperty2;
    }

    /* JADX DEBUG: Method merged with bridge method: toJson(Lcom/squareup/moshi/JsonWriter;Ljava/lang/Object;)V */
    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(@NotNull JsonWriter jsonWriter, CoreSignParams.ApprovalParams approvalParams) throws IOException {
        Intrinsics.checkNotNullParameter(jsonWriter, "");
        if (approvalParams == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        jsonWriter.beginObject();
        jsonWriter.name("relay");
        this.relayProtocolOptionsAdapter.toJson(jsonWriter, approvalParams.getRelay());
        jsonWriter.name("responderPublicKey");
        this.stringAdapter.toJson(jsonWriter, approvalParams.getResponderPublicKey());
        jsonWriter.endObject();
    }
}
