package com.reown.sign.common.model.vo.clientsync.session.params;

import com.reown.android.internal.common.model.Namespace;
import com.reown.android.internal.common.model.RelayProtocolOptions;
import com.reown.sign.common.model.vo.clientsync.common.SessionParticipant;
import com.reown.sign.common.model.vo.clientsync.session.params.SignParams;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import java.io.IOException;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import o.yEE;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final class SignParams_SessionSettleParamsJsonAdapter extends JsonAdapter<SignParams.SessionSettleParams> {
    public final JsonAdapter<Long> longAdapter;
    public final JsonAdapter<Map<String, Namespace.Session>> mapOfStringSessionAdapter;
    public final JsonAdapter<Map<String, String>> nullableMapOfStringStringAdapter;
    public final JsonReader.Options options;
    public final JsonAdapter<RelayProtocolOptions> relayProtocolOptionsAdapter;
    public final JsonAdapter<SessionParticipant> sessionParticipantAdapter;

    public SignParams_SessionSettleParamsJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "");
        JsonReader.Options optionsOf = JsonReader.Options.of("relay", "controller", "namespaces", "expiry", "sessionProperties");
        Intrinsics.checkNotNullExpressionValue(optionsOf, "");
        this.options = optionsOf;
        JsonAdapter<RelayProtocolOptions> jsonAdapterAdapter = moshi.adapter(RelayProtocolOptions.class, yEE.copydefault(), "relay");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter, "");
        this.relayProtocolOptionsAdapter = jsonAdapterAdapter;
        JsonAdapter<SessionParticipant> jsonAdapterAdapter2 = moshi.adapter(SessionParticipant.class, yEE.copydefault(), "controller");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter2, "");
        this.sessionParticipantAdapter = jsonAdapterAdapter2;
        JsonAdapter<Map<String, Namespace.Session>> jsonAdapterAdapter3 = moshi.adapter(Types.newParameterizedType(Map.class, String.class, Namespace.Session.class), yEE.copydefault(), "namespaces");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter3, "");
        this.mapOfStringSessionAdapter = jsonAdapterAdapter3;
        JsonAdapter<Long> jsonAdapterAdapter4 = moshi.adapter(Long.TYPE, yEE.copydefault(), "expiry");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter4, "");
        this.longAdapter = jsonAdapterAdapter4;
        JsonAdapter<Map<String, String>> jsonAdapterAdapter5 = moshi.adapter(Types.newParameterizedType(Map.class, String.class, String.class), yEE.copydefault(), "properties");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter5, "");
        this.nullableMapOfStringStringAdapter = jsonAdapterAdapter5;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(52);
        sb.append("GeneratedJsonAdapter(");
        sb.append("SignParams.SessionSettleParams");
        sb.append(')');
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    /* JADX DEBUG: Method merged with bridge method: fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object; */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.JsonAdapter
    public SignParams.SessionSettleParams fromJson(@NotNull JsonReader jsonReader) throws IOException {
        Intrinsics.checkNotNullParameter(jsonReader, "");
        jsonReader.beginObject();
        Long lFromJson = null;
        RelayProtocolOptions relayProtocolOptionsFromJson = null;
        SessionParticipant sessionParticipantFromJson = null;
        Map<String, Namespace.Session> mapFromJson = null;
        Map<String, String> mapFromJson2 = null;
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
            } else if (iSelectName == 1) {
                sessionParticipantFromJson = this.sessionParticipantAdapter.fromJson(jsonReader);
                if (sessionParticipantFromJson == null) {
                    JsonDataException jsonDataExceptionUnexpectedNull2 = Util.unexpectedNull("controller", "controller", jsonReader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull2, "");
                    throw jsonDataExceptionUnexpectedNull2;
                }
            } else if (iSelectName == 2) {
                mapFromJson = this.mapOfStringSessionAdapter.fromJson(jsonReader);
                if (mapFromJson == null) {
                    JsonDataException jsonDataExceptionUnexpectedNull3 = Util.unexpectedNull("namespaces", "namespaces", jsonReader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull3, "");
                    throw jsonDataExceptionUnexpectedNull3;
                }
            } else if (iSelectName == 3) {
                lFromJson = this.longAdapter.fromJson(jsonReader);
                if (lFromJson == null) {
                    JsonDataException jsonDataExceptionUnexpectedNull4 = Util.unexpectedNull("expiry", "expiry", jsonReader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull4, "");
                    throw jsonDataExceptionUnexpectedNull4;
                }
            } else if (iSelectName == 4) {
                mapFromJson2 = this.nullableMapOfStringStringAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        if (relayProtocolOptionsFromJson == null) {
            JsonDataException jsonDataExceptionMissingProperty = Util.missingProperty("relay", "relay", jsonReader);
            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty, "");
            throw jsonDataExceptionMissingProperty;
        }
        if (sessionParticipantFromJson == null) {
            JsonDataException jsonDataExceptionMissingProperty2 = Util.missingProperty("controller", "controller", jsonReader);
            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty2, "");
            throw jsonDataExceptionMissingProperty2;
        }
        if (mapFromJson == null) {
            JsonDataException jsonDataExceptionMissingProperty3 = Util.missingProperty("namespaces", "namespaces", jsonReader);
            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty3, "");
            throw jsonDataExceptionMissingProperty3;
        }
        if (lFromJson != null) {
            return new SignParams.SessionSettleParams(relayProtocolOptionsFromJson, sessionParticipantFromJson, mapFromJson, lFromJson.longValue(), mapFromJson2);
        }
        JsonDataException jsonDataExceptionMissingProperty4 = Util.missingProperty("expiry", "expiry", jsonReader);
        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty4, "");
        throw jsonDataExceptionMissingProperty4;
    }

    /* JADX DEBUG: Method merged with bridge method: toJson(Lcom/squareup/moshi/JsonWriter;Ljava/lang/Object;)V */
    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(@NotNull JsonWriter jsonWriter, SignParams.SessionSettleParams sessionSettleParams) throws IOException {
        Intrinsics.checkNotNullParameter(jsonWriter, "");
        if (sessionSettleParams == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        jsonWriter.beginObject();
        jsonWriter.name("relay");
        this.relayProtocolOptionsAdapter.toJson(jsonWriter, sessionSettleParams.getRelay());
        jsonWriter.name("controller");
        this.sessionParticipantAdapter.toJson(jsonWriter, sessionSettleParams.getController());
        jsonWriter.name("namespaces");
        this.mapOfStringSessionAdapter.toJson(jsonWriter, sessionSettleParams.getNamespaces());
        jsonWriter.name("expiry");
        this.longAdapter.toJson(jsonWriter, Long.valueOf(sessionSettleParams.getExpiry()));
        jsonWriter.name("sessionProperties");
        this.nullableMapOfStringStringAdapter.toJson(jsonWriter, sessionSettleParams.getProperties());
        jsonWriter.endObject();
    }
}
