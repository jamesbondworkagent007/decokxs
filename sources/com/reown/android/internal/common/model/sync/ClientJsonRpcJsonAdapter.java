package com.reown.android.internal.common.model.sync;

import com.google.firebase.analytics.FirebaseAnalytics;
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
public final class ClientJsonRpcJsonAdapter extends JsonAdapter<ClientJsonRpc> {
    public final JsonAdapter<Long> longAdapter;
    public final JsonReader.Options options;
    public final JsonAdapter<String> stringAdapter;

    public ClientJsonRpcJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "");
        JsonReader.Options optionsOf = JsonReader.Options.of("id", "jsonrpc", FirebaseAnalytics.Param.METHOD);
        Intrinsics.checkNotNullExpressionValue(optionsOf, "");
        this.options = optionsOf;
        JsonAdapter<Long> jsonAdapterAdapter = moshi.adapter(Long.TYPE, yEE.copydefault(), "id");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter, "");
        this.longAdapter = jsonAdapterAdapter;
        JsonAdapter<String> jsonAdapterAdapter2 = moshi.adapter(String.class, yEE.copydefault(), "jsonrpc");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter2, "");
        this.stringAdapter = jsonAdapterAdapter2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(35);
        sb.append("GeneratedJsonAdapter(");
        sb.append("ClientJsonRpc");
        sb.append(')');
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    /* JADX DEBUG: Method merged with bridge method: fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object; */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.JsonAdapter
    public ClientJsonRpc fromJson(@NotNull JsonReader jsonReader) throws IOException {
        Intrinsics.checkNotNullParameter(jsonReader, "");
        jsonReader.beginObject();
        Long lFromJson = null;
        String strFromJson = null;
        String strFromJson2 = null;
        while (jsonReader.hasNext()) {
            int iSelectName = jsonReader.selectName(this.options);
            if (iSelectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (iSelectName == 0) {
                lFromJson = this.longAdapter.fromJson(jsonReader);
                if (lFromJson == null) {
                    JsonDataException jsonDataExceptionUnexpectedNull = Util.unexpectedNull("id", "id", jsonReader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull, "");
                    throw jsonDataExceptionUnexpectedNull;
                }
            } else if (iSelectName == 1) {
                strFromJson = this.stringAdapter.fromJson(jsonReader);
                if (strFromJson == null) {
                    JsonDataException jsonDataExceptionUnexpectedNull2 = Util.unexpectedNull("jsonrpc", "jsonrpc", jsonReader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull2, "");
                    throw jsonDataExceptionUnexpectedNull2;
                }
            } else if (iSelectName == 2 && (strFromJson2 = this.stringAdapter.fromJson(jsonReader)) == null) {
                JsonDataException jsonDataExceptionUnexpectedNull3 = Util.unexpectedNull(FirebaseAnalytics.Param.METHOD, FirebaseAnalytics.Param.METHOD, jsonReader);
                Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull3, "");
                throw jsonDataExceptionUnexpectedNull3;
            }
        }
        jsonReader.endObject();
        if (lFromJson != null) {
            long jLongValue = lFromJson.longValue();
            if (strFromJson == null) {
                JsonDataException jsonDataExceptionMissingProperty = Util.missingProperty("jsonrpc", "jsonrpc", jsonReader);
                Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty, "");
                throw jsonDataExceptionMissingProperty;
            }
            if (strFromJson2 != null) {
                return new ClientJsonRpc(jLongValue, strFromJson, strFromJson2);
            }
            JsonDataException jsonDataExceptionMissingProperty2 = Util.missingProperty(FirebaseAnalytics.Param.METHOD, FirebaseAnalytics.Param.METHOD, jsonReader);
            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty2, "");
            throw jsonDataExceptionMissingProperty2;
        }
        JsonDataException jsonDataExceptionMissingProperty3 = Util.missingProperty("id", "id", jsonReader);
        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty3, "");
        throw jsonDataExceptionMissingProperty3;
    }

    /* JADX DEBUG: Method merged with bridge method: toJson(Lcom/squareup/moshi/JsonWriter;Ljava/lang/Object;)V */
    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(@NotNull JsonWriter jsonWriter, ClientJsonRpc clientJsonRpc) throws IOException {
        Intrinsics.checkNotNullParameter(jsonWriter, "");
        if (clientJsonRpc == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        jsonWriter.beginObject();
        jsonWriter.name("id");
        this.longAdapter.toJson(jsonWriter, Long.valueOf(clientJsonRpc.getId()));
        jsonWriter.name("jsonrpc");
        this.stringAdapter.toJson(jsonWriter, clientJsonRpc.getJsonrpc());
        jsonWriter.name(FirebaseAnalytics.Param.METHOD);
        this.stringAdapter.toJson(jsonWriter, clientJsonRpc.getMethod());
        jsonWriter.endObject();
    }
}
