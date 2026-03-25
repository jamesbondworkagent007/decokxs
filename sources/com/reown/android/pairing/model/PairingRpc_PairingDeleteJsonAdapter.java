package com.reown.android.pairing.model;

import com.bytedance.applog.aggregation.MetricsSQLiteCacheKt;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.reown.android.pairing.model.PairingParams;
import com.reown.android.pairing.model.PairingRpc;
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
public final class PairingRpc_PairingDeleteJsonAdapter extends JsonAdapter<PairingRpc.PairingDelete> {
    public volatile Constructor<PairingRpc.PairingDelete> constructorRef;
    public final JsonAdapter<PairingParams.DeleteParams> deleteParamsAdapter;
    public final JsonAdapter<Long> longAdapter;
    public final JsonReader.Options options;
    public final JsonAdapter<String> stringAdapter;

    public PairingRpc_PairingDeleteJsonAdapter(@NotNull Moshi moshi) {
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
        JsonAdapter<PairingParams.DeleteParams> jsonAdapterAdapter3 = moshi.adapter(PairingParams.DeleteParams.class, yEE.copydefault(), MetricsSQLiteCacheKt.METRICS_PARAMS);
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter3, "");
        this.deleteParamsAdapter = jsonAdapterAdapter3;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(46);
        sb.append("GeneratedJsonAdapter(");
        sb.append("PairingRpc.PairingDelete");
        sb.append(')');
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    /* JADX DEBUG: Method merged with bridge method: fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object; */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.JsonAdapter
    public PairingRpc.PairingDelete fromJson(@NotNull JsonReader jsonReader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, InvocationTargetException {
        Intrinsics.checkNotNullParameter(jsonReader, "");
        jsonReader.beginObject();
        Long lFromJson = 0L;
        String strFromJson = null;
        String strFromJson2 = null;
        PairingParams.DeleteParams deleteParamsFromJson = null;
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
            } else if (iSelectName == 3 && (deleteParamsFromJson = this.deleteParamsAdapter.fromJson(jsonReader)) == null) {
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
            if (deleteParamsFromJson != null) {
                return new PairingRpc.PairingDelete(jLongValue, strFromJson, strFromJson2, deleteParamsFromJson);
            }
            JsonDataException jsonDataExceptionMissingProperty = Util.missingProperty(MetricsSQLiteCacheKt.METRICS_PARAMS, MetricsSQLiteCacheKt.METRICS_PARAMS, jsonReader);
            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty, "");
            throw jsonDataExceptionMissingProperty;
        }
        Constructor<PairingRpc.PairingDelete> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            declaredConstructor = PairingRpc.PairingDelete.class.getDeclaredConstructor(Long.TYPE, String.class, String.class, PairingParams.DeleteParams.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = declaredConstructor;
            Intrinsics.checkNotNullExpressionValue(declaredConstructor, "");
        }
        if (deleteParamsFromJson != null) {
            PairingRpc.PairingDelete pairingDeleteNewInstance = declaredConstructor.newInstance(lFromJson, strFromJson, strFromJson2, deleteParamsFromJson, Integer.valueOf(i), null);
            Intrinsics.checkNotNullExpressionValue(pairingDeleteNewInstance, "");
            return pairingDeleteNewInstance;
        }
        JsonDataException jsonDataExceptionMissingProperty2 = Util.missingProperty(MetricsSQLiteCacheKt.METRICS_PARAMS, MetricsSQLiteCacheKt.METRICS_PARAMS, jsonReader);
        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty2, "");
        throw jsonDataExceptionMissingProperty2;
    }

    /* JADX DEBUG: Method merged with bridge method: toJson(Lcom/squareup/moshi/JsonWriter;Ljava/lang/Object;)V */
    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(@NotNull JsonWriter jsonWriter, PairingRpc.PairingDelete pairingDelete) throws IOException {
        Intrinsics.checkNotNullParameter(jsonWriter, "");
        if (pairingDelete == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        jsonWriter.beginObject();
        jsonWriter.name("id");
        this.longAdapter.toJson(jsonWriter, Long.valueOf(pairingDelete.getId()));
        jsonWriter.name("jsonrpc");
        this.stringAdapter.toJson(jsonWriter, pairingDelete.getJsonrpc());
        jsonWriter.name(FirebaseAnalytics.Param.METHOD);
        this.stringAdapter.toJson(jsonWriter, pairingDelete.getMethod());
        jsonWriter.name(MetricsSQLiteCacheKt.METRICS_PARAMS);
        this.deleteParamsAdapter.toJson(jsonWriter, pairingDelete.getParams());
        jsonWriter.endObject();
    }
}
