package com.reown.sign.common.model.vo.clientsync.session.params;

import com.reown.android.internal.common.model.Namespace;
import com.reown.android.internal.common.model.RelayProtocolOptions;
import com.reown.android.internal.common.model.SessionProposer;
import com.reown.sign.common.model.vo.clientsync.session.params.SignParams;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import o.yEE;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final class SignParams_SessionProposeParamsJsonAdapter extends JsonAdapter<SignParams.SessionProposeParams> {
    public final JsonAdapter<List<RelayProtocolOptions>> listOfRelayProtocolOptionsAdapter;
    public final JsonAdapter<Map<String, Namespace.Proposal>> mapOfStringProposalAdapter;
    public final JsonAdapter<Long> nullableLongAdapter;
    public final JsonAdapter<Map<String, Namespace.Proposal>> nullableMapOfStringProposalAdapter;
    public final JsonAdapter<Map<String, String>> nullableMapOfStringStringAdapter;
    public final JsonReader.Options options;
    public final JsonAdapter<SessionProposer> sessionProposerAdapter;

    public SignParams_SessionProposeParamsJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "");
        JsonReader.Options optionsOf = JsonReader.Options.of("requiredNamespaces", "optionalNamespaces", "relays", "proposer", "sessionProperties", "expiryTimestamp");
        Intrinsics.checkNotNullExpressionValue(optionsOf, "");
        this.options = optionsOf;
        JsonAdapter<Map<String, Namespace.Proposal>> jsonAdapterAdapter = moshi.adapter(Types.newParameterizedType(Map.class, String.class, Namespace.Proposal.class), yEE.copydefault(), "requiredNamespaces");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter, "");
        this.mapOfStringProposalAdapter = jsonAdapterAdapter;
        JsonAdapter<Map<String, Namespace.Proposal>> jsonAdapterAdapter2 = moshi.adapter(Types.newParameterizedType(Map.class, String.class, Namespace.Proposal.class), yEE.copydefault(), "optionalNamespaces");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter2, "");
        this.nullableMapOfStringProposalAdapter = jsonAdapterAdapter2;
        JsonAdapter<List<RelayProtocolOptions>> jsonAdapterAdapter3 = moshi.adapter(Types.newParameterizedType(List.class, RelayProtocolOptions.class), yEE.copydefault(), "relays");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter3, "");
        this.listOfRelayProtocolOptionsAdapter = jsonAdapterAdapter3;
        JsonAdapter<SessionProposer> jsonAdapterAdapter4 = moshi.adapter(SessionProposer.class, yEE.copydefault(), "proposer");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter4, "");
        this.sessionProposerAdapter = jsonAdapterAdapter4;
        JsonAdapter<Map<String, String>> jsonAdapterAdapter5 = moshi.adapter(Types.newParameterizedType(Map.class, String.class, String.class), yEE.copydefault(), "properties");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter5, "");
        this.nullableMapOfStringStringAdapter = jsonAdapterAdapter5;
        JsonAdapter<Long> jsonAdapterAdapter6 = moshi.adapter(Long.class, yEE.copydefault(), "expiryTimestamp");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter6, "");
        this.nullableLongAdapter = jsonAdapterAdapter6;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(53);
        sb.append("GeneratedJsonAdapter(");
        sb.append("SignParams.SessionProposeParams");
        sb.append(')');
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    /* JADX DEBUG: Method merged with bridge method: fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object; */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.JsonAdapter
    public SignParams.SessionProposeParams fromJson(@NotNull JsonReader jsonReader) throws IOException {
        Intrinsics.checkNotNullParameter(jsonReader, "");
        jsonReader.beginObject();
        Map<String, Namespace.Proposal> mapFromJson = null;
        Map<String, Namespace.Proposal> mapFromJson2 = null;
        List<RelayProtocolOptions> listFromJson = null;
        SessionProposer sessionProposerFromJson = null;
        Map<String, String> mapFromJson3 = null;
        Long lFromJson = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    mapFromJson = this.mapOfStringProposalAdapter.fromJson(jsonReader);
                    if (mapFromJson == null) {
                        JsonDataException jsonDataExceptionUnexpectedNull = Util.unexpectedNull("requiredNamespaces", "requiredNamespaces", jsonReader);
                        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull, "");
                        throw jsonDataExceptionUnexpectedNull;
                    }
                    break;
                    break;
                case 1:
                    mapFromJson2 = this.nullableMapOfStringProposalAdapter.fromJson(jsonReader);
                    break;
                case 2:
                    listFromJson = this.listOfRelayProtocolOptionsAdapter.fromJson(jsonReader);
                    if (listFromJson == null) {
                        JsonDataException jsonDataExceptionUnexpectedNull2 = Util.unexpectedNull("relays", "relays", jsonReader);
                        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull2, "");
                        throw jsonDataExceptionUnexpectedNull2;
                    }
                    break;
                    break;
                case 3:
                    sessionProposerFromJson = this.sessionProposerAdapter.fromJson(jsonReader);
                    if (sessionProposerFromJson == null) {
                        JsonDataException jsonDataExceptionUnexpectedNull3 = Util.unexpectedNull("proposer", "proposer", jsonReader);
                        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull3, "");
                        throw jsonDataExceptionUnexpectedNull3;
                    }
                    break;
                    break;
                case 4:
                    mapFromJson3 = this.nullableMapOfStringStringAdapter.fromJson(jsonReader);
                    break;
                case 5:
                    lFromJson = this.nullableLongAdapter.fromJson(jsonReader);
                    break;
            }
        }
        jsonReader.endObject();
        if (mapFromJson == null) {
            JsonDataException jsonDataExceptionMissingProperty = Util.missingProperty("requiredNamespaces", "requiredNamespaces", jsonReader);
            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty, "");
            throw jsonDataExceptionMissingProperty;
        }
        if (listFromJson == null) {
            JsonDataException jsonDataExceptionMissingProperty2 = Util.missingProperty("relays", "relays", jsonReader);
            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty2, "");
            throw jsonDataExceptionMissingProperty2;
        }
        if (sessionProposerFromJson != null) {
            return new SignParams.SessionProposeParams(mapFromJson, mapFromJson2, listFromJson, sessionProposerFromJson, mapFromJson3, lFromJson);
        }
        JsonDataException jsonDataExceptionMissingProperty3 = Util.missingProperty("proposer", "proposer", jsonReader);
        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty3, "");
        throw jsonDataExceptionMissingProperty3;
    }

    /* JADX DEBUG: Method merged with bridge method: toJson(Lcom/squareup/moshi/JsonWriter;Ljava/lang/Object;)V */
    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(@NotNull JsonWriter jsonWriter, SignParams.SessionProposeParams sessionProposeParams) throws IOException {
        Intrinsics.checkNotNullParameter(jsonWriter, "");
        if (sessionProposeParams == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        jsonWriter.beginObject();
        jsonWriter.name("requiredNamespaces");
        this.mapOfStringProposalAdapter.toJson(jsonWriter, sessionProposeParams.getRequiredNamespaces());
        jsonWriter.name("optionalNamespaces");
        this.nullableMapOfStringProposalAdapter.toJson(jsonWriter, sessionProposeParams.getOptionalNamespaces());
        jsonWriter.name("relays");
        this.listOfRelayProtocolOptionsAdapter.toJson(jsonWriter, sessionProposeParams.getRelays());
        jsonWriter.name("proposer");
        this.sessionProposerAdapter.toJson(jsonWriter, sessionProposeParams.getProposer());
        jsonWriter.name("sessionProperties");
        this.nullableMapOfStringStringAdapter.toJson(jsonWriter, sessionProposeParams.getProperties());
        jsonWriter.name("expiryTimestamp");
        this.nullableLongAdapter.toJson(jsonWriter, sessionProposeParams.getExpiryTimestamp());
        jsonWriter.endObject();
    }
}
