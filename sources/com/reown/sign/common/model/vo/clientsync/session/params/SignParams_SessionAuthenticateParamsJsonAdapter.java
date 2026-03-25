package com.reown.sign.common.model.vo.clientsync.session.params;

import com.reown.sign.common.model.vo.clientsync.common.PayloadParams;
import com.reown.sign.common.model.vo.clientsync.common.Requester;
import com.reown.sign.common.model.vo.clientsync.session.params.SignParams;
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
public final class SignParams_SessionAuthenticateParamsJsonAdapter extends JsonAdapter<SignParams.SessionAuthenticateParams> {
    public final JsonAdapter<Long> longAdapter;
    public final JsonReader.Options options;
    public final JsonAdapter<PayloadParams> payloadParamsAdapter;
    public final JsonAdapter<Requester> requesterAdapter;

    public SignParams_SessionAuthenticateParamsJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "");
        JsonReader.Options optionsOf = JsonReader.Options.of("requester", "authPayload", "expiryTimestamp");
        Intrinsics.checkNotNullExpressionValue(optionsOf, "");
        this.options = optionsOf;
        JsonAdapter<Requester> jsonAdapterAdapter = moshi.adapter(Requester.class, yEE.copydefault(), "requester");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter, "");
        this.requesterAdapter = jsonAdapterAdapter;
        JsonAdapter<PayloadParams> jsonAdapterAdapter2 = moshi.adapter(PayloadParams.class, yEE.copydefault(), "authPayload");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter2, "");
        this.payloadParamsAdapter = jsonAdapterAdapter2;
        JsonAdapter<Long> jsonAdapterAdapter3 = moshi.adapter(Long.TYPE, yEE.copydefault(), "expiryTimestamp");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter3, "");
        this.longAdapter = jsonAdapterAdapter3;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(58);
        sb.append("GeneratedJsonAdapter(");
        sb.append("SignParams.SessionAuthenticateParams");
        sb.append(')');
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    /* JADX DEBUG: Method merged with bridge method: fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object; */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.JsonAdapter
    public SignParams.SessionAuthenticateParams fromJson(@NotNull JsonReader jsonReader) throws IOException {
        Intrinsics.checkNotNullParameter(jsonReader, "");
        jsonReader.beginObject();
        Requester requesterFromJson = null;
        PayloadParams payloadParamsFromJson = null;
        Long lFromJson = null;
        while (jsonReader.hasNext()) {
            int iSelectName = jsonReader.selectName(this.options);
            if (iSelectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (iSelectName == 0) {
                requesterFromJson = this.requesterAdapter.fromJson(jsonReader);
                if (requesterFromJson == null) {
                    JsonDataException jsonDataExceptionUnexpectedNull = Util.unexpectedNull("requester", "requester", jsonReader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull, "");
                    throw jsonDataExceptionUnexpectedNull;
                }
            } else if (iSelectName == 1) {
                payloadParamsFromJson = this.payloadParamsAdapter.fromJson(jsonReader);
                if (payloadParamsFromJson == null) {
                    JsonDataException jsonDataExceptionUnexpectedNull2 = Util.unexpectedNull("authPayload", "authPayload", jsonReader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull2, "");
                    throw jsonDataExceptionUnexpectedNull2;
                }
            } else if (iSelectName == 2 && (lFromJson = this.longAdapter.fromJson(jsonReader)) == null) {
                JsonDataException jsonDataExceptionUnexpectedNull3 = Util.unexpectedNull("expiryTimestamp", "expiryTimestamp", jsonReader);
                Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull3, "");
                throw jsonDataExceptionUnexpectedNull3;
            }
        }
        jsonReader.endObject();
        if (requesterFromJson == null) {
            JsonDataException jsonDataExceptionMissingProperty = Util.missingProperty("requester", "requester", jsonReader);
            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty, "");
            throw jsonDataExceptionMissingProperty;
        }
        if (payloadParamsFromJson == null) {
            JsonDataException jsonDataExceptionMissingProperty2 = Util.missingProperty("authPayload", "authPayload", jsonReader);
            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty2, "");
            throw jsonDataExceptionMissingProperty2;
        }
        if (lFromJson != null) {
            return new SignParams.SessionAuthenticateParams(requesterFromJson, payloadParamsFromJson, lFromJson.longValue());
        }
        JsonDataException jsonDataExceptionMissingProperty3 = Util.missingProperty("expiryTimestamp", "expiryTimestamp", jsonReader);
        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty3, "");
        throw jsonDataExceptionMissingProperty3;
    }

    /* JADX DEBUG: Method merged with bridge method: toJson(Lcom/squareup/moshi/JsonWriter;Ljava/lang/Object;)V */
    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(@NotNull JsonWriter jsonWriter, SignParams.SessionAuthenticateParams sessionAuthenticateParams) throws IOException {
        Intrinsics.checkNotNullParameter(jsonWriter, "");
        if (sessionAuthenticateParams == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        jsonWriter.beginObject();
        jsonWriter.name("requester");
        this.requesterAdapter.toJson(jsonWriter, sessionAuthenticateParams.getRequester());
        jsonWriter.name("authPayload");
        this.payloadParamsAdapter.toJson(jsonWriter, sessionAuthenticateParams.getAuthPayload());
        jsonWriter.name("expiryTimestamp");
        this.longAdapter.toJson(jsonWriter, Long.valueOf(sessionAuthenticateParams.getExpiryTimestamp()));
        jsonWriter.endObject();
    }
}
