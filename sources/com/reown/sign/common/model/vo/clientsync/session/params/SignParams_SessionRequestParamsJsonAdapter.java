package com.reown.sign.common.model.vo.clientsync.session.params;

import com.reown.sign.common.model.vo.clientsync.session.params.SignParams;
import com.reown.sign.common.model.vo.clientsync.session.payload.SessionRequestVO;
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
public final class SignParams_SessionRequestParamsJsonAdapter extends JsonAdapter<SignParams.SessionRequestParams> {
    public final JsonReader.Options options;
    public final JsonAdapter<SessionRequestVO> sessionRequestVOAdapter;
    public final JsonAdapter<String> stringAdapter;

    public SignParams_SessionRequestParamsJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "");
        JsonReader.Options optionsOf = JsonReader.Options.of("request", "chainId");
        Intrinsics.checkNotNullExpressionValue(optionsOf, "");
        this.options = optionsOf;
        JsonAdapter<SessionRequestVO> jsonAdapterAdapter = moshi.adapter(SessionRequestVO.class, yEE.copydefault(), "request");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter, "");
        this.sessionRequestVOAdapter = jsonAdapterAdapter;
        JsonAdapter<String> jsonAdapterAdapter2 = moshi.adapter(String.class, yEE.copydefault(), "chainId");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter2, "");
        this.stringAdapter = jsonAdapterAdapter2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(53);
        sb.append("GeneratedJsonAdapter(");
        sb.append("SignParams.SessionRequestParams");
        sb.append(')');
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    /* JADX DEBUG: Method merged with bridge method: fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object; */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.JsonAdapter
    public SignParams.SessionRequestParams fromJson(@NotNull JsonReader jsonReader) throws IOException {
        Intrinsics.checkNotNullParameter(jsonReader, "");
        jsonReader.beginObject();
        SessionRequestVO sessionRequestVOFromJson = null;
        String strFromJson = null;
        while (jsonReader.hasNext()) {
            int iSelectName = jsonReader.selectName(this.options);
            if (iSelectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (iSelectName == 0) {
                sessionRequestVOFromJson = this.sessionRequestVOAdapter.fromJson(jsonReader);
                if (sessionRequestVOFromJson == null) {
                    JsonDataException jsonDataExceptionUnexpectedNull = Util.unexpectedNull("request", "request", jsonReader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull, "");
                    throw jsonDataExceptionUnexpectedNull;
                }
            } else if (iSelectName == 1 && (strFromJson = this.stringAdapter.fromJson(jsonReader)) == null) {
                JsonDataException jsonDataExceptionUnexpectedNull2 = Util.unexpectedNull("chainId", "chainId", jsonReader);
                Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull2, "");
                throw jsonDataExceptionUnexpectedNull2;
            }
        }
        jsonReader.endObject();
        if (sessionRequestVOFromJson == null) {
            JsonDataException jsonDataExceptionMissingProperty = Util.missingProperty("request", "request", jsonReader);
            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty, "");
            throw jsonDataExceptionMissingProperty;
        }
        if (strFromJson != null) {
            return new SignParams.SessionRequestParams(sessionRequestVOFromJson, strFromJson);
        }
        JsonDataException jsonDataExceptionMissingProperty2 = Util.missingProperty("chainId", "chainId", jsonReader);
        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty2, "");
        throw jsonDataExceptionMissingProperty2;
    }

    /* JADX DEBUG: Method merged with bridge method: toJson(Lcom/squareup/moshi/JsonWriter;Ljava/lang/Object;)V */
    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(@NotNull JsonWriter jsonWriter, SignParams.SessionRequestParams sessionRequestParams) throws IOException {
        Intrinsics.checkNotNullParameter(jsonWriter, "");
        if (sessionRequestParams == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        jsonWriter.beginObject();
        jsonWriter.name("request");
        this.sessionRequestVOAdapter.toJson(jsonWriter, sessionRequestParams.getRequest());
        jsonWriter.name("chainId");
        this.stringAdapter.toJson(jsonWriter, sessionRequestParams.getChainId());
        jsonWriter.endObject();
    }
}
