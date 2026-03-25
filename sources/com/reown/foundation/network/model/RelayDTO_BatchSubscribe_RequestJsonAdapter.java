package com.reown.foundation.network.model;

import com.bytedance.applog.aggregation.MetricsSQLiteCacheKt;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.reown.foundation.network.model.RelayDTO;
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
public final class RelayDTO_BatchSubscribe_RequestJsonAdapter extends JsonAdapter<RelayDTO.BatchSubscribe.Request> {
    private volatile Constructor<RelayDTO.BatchSubscribe.Request> constructorRef;
    private final JsonAdapter<Long> longAdapter;
    private final JsonReader.Options options;
    private final JsonAdapter<RelayDTO.BatchSubscribe.Request.Params> paramsAdapter;
    private final JsonAdapter<String> stringAdapter;

    public RelayDTO_BatchSubscribe_RequestJsonAdapter(@NotNull Moshi moshi) {
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
        JsonAdapter<RelayDTO.BatchSubscribe.Request.Params> jsonAdapterAdapter3 = moshi.adapter(RelayDTO.BatchSubscribe.Request.Params.class, yEE.copydefault(), MetricsSQLiteCacheKt.METRICS_PARAMS);
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter3, "");
        this.paramsAdapter = jsonAdapterAdapter3;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(53);
        sb.append("GeneratedJsonAdapter(");
        sb.append("RelayDTO.BatchSubscribe.Request");
        sb.append(')');
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    /* JADX DEBUG: Method merged with bridge method: fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object; */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.JsonAdapter
    public RelayDTO.BatchSubscribe.Request fromJson(@NotNull JsonReader jsonReader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, InvocationTargetException {
        Intrinsics.checkNotNullParameter(jsonReader, "");
        Long lFromJson = 0L;
        jsonReader.beginObject();
        int i = -1;
        String strFromJson = null;
        String strFromJson2 = null;
        RelayDTO.BatchSubscribe.Request.Params paramsFromJson = null;
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
            } else if (iSelectName == 3 && (paramsFromJson = this.paramsAdapter.fromJson(jsonReader)) == null) {
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
            if (paramsFromJson != null) {
                return new RelayDTO.BatchSubscribe.Request(jLongValue, strFromJson, strFromJson2, paramsFromJson);
            }
            JsonDataException jsonDataExceptionMissingProperty = Util.missingProperty(MetricsSQLiteCacheKt.METRICS_PARAMS, MetricsSQLiteCacheKt.METRICS_PARAMS, jsonReader);
            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty, "");
            throw jsonDataExceptionMissingProperty;
        }
        Constructor<RelayDTO.BatchSubscribe.Request> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            declaredConstructor = RelayDTO.BatchSubscribe.Request.class.getDeclaredConstructor(Long.TYPE, String.class, String.class, RelayDTO.BatchSubscribe.Request.Params.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = declaredConstructor;
            Intrinsics.checkNotNullExpressionValue(declaredConstructor, "");
        }
        Object[] objArr = new Object[6];
        objArr[0] = lFromJson;
        objArr[1] = strFromJson;
        objArr[2] = strFromJson2;
        if (paramsFromJson == null) {
            JsonDataException jsonDataExceptionMissingProperty2 = Util.missingProperty(MetricsSQLiteCacheKt.METRICS_PARAMS, MetricsSQLiteCacheKt.METRICS_PARAMS, jsonReader);
            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty2, "");
            throw jsonDataExceptionMissingProperty2;
        }
        objArr[3] = paramsFromJson;
        objArr[4] = Integer.valueOf(i);
        objArr[5] = null;
        RelayDTO.BatchSubscribe.Request requestNewInstance = declaredConstructor.newInstance(objArr);
        Intrinsics.checkNotNullExpressionValue(requestNewInstance, "");
        return requestNewInstance;
    }

    /* JADX DEBUG: Method merged with bridge method: toJson(Lcom/squareup/moshi/JsonWriter;Ljava/lang/Object;)V */
    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(@NotNull JsonWriter jsonWriter, RelayDTO.BatchSubscribe.Request request) throws IOException {
        Intrinsics.checkNotNullParameter(jsonWriter, "");
        if (request == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        jsonWriter.beginObject();
        jsonWriter.name("id");
        this.longAdapter.toJson(jsonWriter, Long.valueOf(request.getId()));
        jsonWriter.name("jsonrpc");
        this.stringAdapter.toJson(jsonWriter, request.getJsonrpc());
        jsonWriter.name(FirebaseAnalytics.Param.METHOD);
        this.stringAdapter.toJson(jsonWriter, request.getMethod());
        jsonWriter.name(MetricsSQLiteCacheKt.METRICS_PARAMS);
        this.paramsAdapter.toJson(jsonWriter, request.getParams());
        jsonWriter.endObject();
    }
}
