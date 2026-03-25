package com.reown.sign.common.model.vo.clientsync.session;

import com.bytedance.applog.aggregation.MetricsSQLiteCacheKt;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.reown.sign.common.model.vo.clientsync.session.SignRpc;
import com.reown.sign.common.model.vo.clientsync.session.params.SignParams;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.Intrinsics;
import o.yEE;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final class SignRpc_SessionProposeJsonAdapter extends JsonAdapter<SignRpc.SessionPropose> {
    public volatile Constructor<SignRpc.SessionPropose> constructorRef;
    public final JsonAdapter<Long> longAdapter;
    public final JsonReader.Options options;
    public final JsonAdapter<SignParams.SessionProposeParams> sessionProposeParamsAdapter;
    public final JsonAdapter<String> stringAdapter;

    public SignRpc_SessionProposeJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "");
        JsonReader.Options optionsOf = JsonReader.Options.of("id", "jsonrpc", FirebaseAnalytics.Param.METHOD, MetricsSQLiteCacheKt.METRICS_PARAMS);
        Intrinsics.checkNotNullExpressionValue(optionsOf, "");
        this.options = optionsOf;
        JsonAdapter<Long> jsonAdapterAdapter = moshi.adapter(Long.TYPE, yEE.copydefault(), "id");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter, "");
        this.longAdapter = jsonAdapterAdapter;
        JsonAdapter<String> jsonAdapterAdapter2 = moshi.adapter(String.class, yEE.copydefault(), "jsonrpc");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter2, "");
        this.stringAdapter = jsonAdapterAdapter2;
        JsonAdapter<SignParams.SessionProposeParams> jsonAdapterAdapter3 = moshi.adapter(SignParams.SessionProposeParams.class, yEE.copydefault(), MetricsSQLiteCacheKt.METRICS_PARAMS);
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter3, "");
        this.sessionProposeParamsAdapter = jsonAdapterAdapter3;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(44);
        sb.append("GeneratedJsonAdapter(");
        sb.append("SignRpc.SessionPropose");
        sb.append(')');
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    /* JADX DEBUG: Method merged with bridge method: fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object; */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.JsonAdapter
    public SignRpc.SessionPropose fromJson(@NotNull JsonReader jsonReader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, InvocationTargetException {
        Intrinsics.checkNotNullParameter(jsonReader, "");
        jsonReader.beginObject();
        Long lFromJson = 0L;
        String strFromJson = null;
        String strFromJson2 = null;
        SignParams.SessionProposeParams sessionProposeParamsFromJson = null;
        int i = -1;
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
                i &= -2;
            } else if (iSelectName == 1) {
                strFromJson = this.stringAdapter.fromJson(jsonReader);
                if (strFromJson == null) {
                    JsonDataException jsonDataExceptionUnexpectedNull2 = Util.unexpectedNull("jsonrpc", "jsonrpc", jsonReader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull2, "");
                    throw jsonDataExceptionUnexpectedNull2;
                }
                i &= -3;
            } else if (iSelectName == 2) {
                strFromJson2 = this.stringAdapter.fromJson(jsonReader);
                if (strFromJson2 == null) {
                    JsonDataException jsonDataExceptionUnexpectedNull3 = Util.unexpectedNull(FirebaseAnalytics.Param.METHOD, FirebaseAnalytics.Param.METHOD, jsonReader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull3, "");
                    throw jsonDataExceptionUnexpectedNull3;
                }
                i &= -5;
            } else if (iSelectName == 3 && (sessionProposeParamsFromJson = this.sessionProposeParamsAdapter.fromJson(jsonReader)) == null) {
                JsonDataException jsonDataExceptionUnexpectedNull4 = Util.unexpectedNull(MetricsSQLiteCacheKt.METRICS_PARAMS, MetricsSQLiteCacheKt.METRICS_PARAMS, jsonReader);
                Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull4, "");
                throw jsonDataExceptionUnexpectedNull4;
            }
        }
        jsonReader.endObject();
        if (i == -8) {
            long jLongValue = lFromJson.longValue();
            Intrinsics.copydefault(strFromJson, "");
            Intrinsics.copydefault(strFromJson2, "");
            if (sessionProposeParamsFromJson != null) {
                return new SignRpc.SessionPropose(jLongValue, strFromJson, strFromJson2, sessionProposeParamsFromJson);
            }
            JsonDataException jsonDataExceptionMissingProperty = Util.missingProperty(MetricsSQLiteCacheKt.METRICS_PARAMS, MetricsSQLiteCacheKt.METRICS_PARAMS, jsonReader);
            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty, "");
            throw jsonDataExceptionMissingProperty;
        }
        Constructor<SignRpc.SessionPropose> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            declaredConstructor = SignRpc.SessionPropose.class.getDeclaredConstructor(Long.TYPE, String.class, String.class, SignParams.SessionProposeParams.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = declaredConstructor;
            Intrinsics.checkNotNullExpressionValue(declaredConstructor, "");
        }
        if (sessionProposeParamsFromJson != null) {
            SignRpc.SessionPropose sessionProposeNewInstance = declaredConstructor.newInstance(lFromJson, strFromJson, strFromJson2, sessionProposeParamsFromJson, Integer.valueOf(i), null);
            Intrinsics.checkNotNullExpressionValue(sessionProposeNewInstance, "");
            return sessionProposeNewInstance;
        }
        JsonDataException jsonDataExceptionMissingProperty2 = Util.missingProperty(MetricsSQLiteCacheKt.METRICS_PARAMS, MetricsSQLiteCacheKt.METRICS_PARAMS, jsonReader);
        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty2, "");
        throw jsonDataExceptionMissingProperty2;
    }

    /* JADX DEBUG: Method merged with bridge method: toJson(Lcom/squareup/moshi/JsonWriter;Ljava/lang/Object;)V */
    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(@NotNull JsonWriter jsonWriter, SignRpc.SessionPropose sessionPropose) throws IOException {
        Intrinsics.checkNotNullParameter(jsonWriter, "");
        if (sessionPropose == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        jsonWriter.beginObject();
        jsonWriter.name("id");
        this.longAdapter.toJson(jsonWriter, Long.valueOf(sessionPropose.getId()));
        jsonWriter.name("jsonrpc");
        this.stringAdapter.toJson(jsonWriter, sessionPropose.getJsonrpc());
        jsonWriter.name(FirebaseAnalytics.Param.METHOD);
        this.stringAdapter.toJson(jsonWriter, sessionPropose.getMethod());
        jsonWriter.name(MetricsSQLiteCacheKt.METRICS_PARAMS);
        this.sessionProposeParamsAdapter.toJson(jsonWriter, sessionPropose.getParams());
        jsonWriter.endObject();
    }
}
