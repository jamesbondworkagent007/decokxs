package com.reown.android.internal.common.model.params;

import com.reown.android.internal.common.model.Participant;
import com.reown.android.internal.common.model.params.CoreSignParams;
import com.reown.android.internal.common.signing.cacao.Cacao;
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
public final class CoreSignParams_SessionAuthenticateApproveParamsJsonAdapter extends JsonAdapter<CoreSignParams.SessionAuthenticateApproveParams> {
    public final JsonAdapter<List<Cacao>> listOfCacaoAdapter;
    public final JsonReader.Options options;
    public final JsonAdapter<Participant> participantAdapter;

    public CoreSignParams_SessionAuthenticateApproveParamsJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "");
        JsonReader.Options optionsOf = JsonReader.Options.of("responder", "cacaos");
        Intrinsics.checkNotNullExpressionValue(optionsOf, "");
        this.options = optionsOf;
        JsonAdapter<Participant> jsonAdapterAdapter = moshi.adapter(Participant.class, yEE.copydefault(), "responder");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter, "");
        this.participantAdapter = jsonAdapterAdapter;
        JsonAdapter<List<Cacao>> jsonAdapterAdapter2 = moshi.adapter(Types.newParameterizedType(List.class, Cacao.class), yEE.copydefault(), "cacaos");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter2, "");
        this.listOfCacaoAdapter = jsonAdapterAdapter2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(69);
        sb.append("GeneratedJsonAdapter(");
        sb.append("CoreSignParams.SessionAuthenticateApproveParams");
        sb.append(')');
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    /* JADX DEBUG: Method merged with bridge method: fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object; */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.JsonAdapter
    public CoreSignParams.SessionAuthenticateApproveParams fromJson(@NotNull JsonReader jsonReader) throws IOException {
        Intrinsics.checkNotNullParameter(jsonReader, "");
        jsonReader.beginObject();
        Participant participantFromJson = null;
        List<Cacao> listFromJson = null;
        while (jsonReader.hasNext()) {
            int iSelectName = jsonReader.selectName(this.options);
            if (iSelectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (iSelectName == 0) {
                participantFromJson = this.participantAdapter.fromJson(jsonReader);
                if (participantFromJson == null) {
                    JsonDataException jsonDataExceptionUnexpectedNull = Util.unexpectedNull("responder", "responder", jsonReader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull, "");
                    throw jsonDataExceptionUnexpectedNull;
                }
            } else if (iSelectName == 1 && (listFromJson = this.listOfCacaoAdapter.fromJson(jsonReader)) == null) {
                JsonDataException jsonDataExceptionUnexpectedNull2 = Util.unexpectedNull("cacaos", "cacaos", jsonReader);
                Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull2, "");
                throw jsonDataExceptionUnexpectedNull2;
            }
        }
        jsonReader.endObject();
        if (participantFromJson == null) {
            JsonDataException jsonDataExceptionMissingProperty = Util.missingProperty("responder", "responder", jsonReader);
            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty, "");
            throw jsonDataExceptionMissingProperty;
        }
        if (listFromJson != null) {
            return new CoreSignParams.SessionAuthenticateApproveParams(participantFromJson, listFromJson);
        }
        JsonDataException jsonDataExceptionMissingProperty2 = Util.missingProperty("cacaos", "cacaos", jsonReader);
        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty2, "");
        throw jsonDataExceptionMissingProperty2;
    }

    /* JADX DEBUG: Method merged with bridge method: toJson(Lcom/squareup/moshi/JsonWriter;Ljava/lang/Object;)V */
    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(@NotNull JsonWriter jsonWriter, CoreSignParams.SessionAuthenticateApproveParams sessionAuthenticateApproveParams) throws IOException {
        Intrinsics.checkNotNullParameter(jsonWriter, "");
        if (sessionAuthenticateApproveParams == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        jsonWriter.beginObject();
        jsonWriter.name("responder");
        this.participantAdapter.toJson(jsonWriter, sessionAuthenticateApproveParams.getResponder());
        jsonWriter.name("cacaos");
        this.listOfCacaoAdapter.toJson(jsonWriter, sessionAuthenticateApproveParams.getCacaos());
        jsonWriter.endObject();
    }
}
