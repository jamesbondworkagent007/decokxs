package com.reown.android.pulse.model.properties;

import com.engagelab.privates.push.constants.MTPushConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.reown.android.push.notifications.PushMessagingService;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import o.yEE;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final class PropertiesJsonAdapter extends JsonAdapter<Properties> {
    public volatile Constructor<Properties> constructorRef;
    public final JsonAdapter<Boolean> nullableBooleanAdapter;
    public final JsonAdapter<List<String>> nullableListOfStringAdapter;
    public final JsonAdapter<Long> nullableLongAdapter;
    public final JsonAdapter<String> nullableStringAdapter;
    public final JsonReader.Options options;

    public PropertiesJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "");
        JsonReader.Options optionsOf = JsonReader.Options.of("message", "name", FirebaseAnalytics.Param.METHOD, "connected", "network", MTPushConstants.PlatformNode.KEY_PLATFORM, "trace", PushMessagingService.KEY_TOPIC, "correlation_id", "client_id", HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, "user_agent");
        Intrinsics.checkNotNullExpressionValue(optionsOf, "");
        this.options = optionsOf;
        JsonAdapter<String> jsonAdapterAdapter = moshi.adapter(String.class, yEE.copydefault(), "message");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter, "");
        this.nullableStringAdapter = jsonAdapterAdapter;
        JsonAdapter<Boolean> jsonAdapterAdapter2 = moshi.adapter(Boolean.class, yEE.copydefault(), "connected");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter2, "");
        this.nullableBooleanAdapter = jsonAdapterAdapter2;
        JsonAdapter<List<String>> jsonAdapterAdapter3 = moshi.adapter(Types.newParameterizedType(List.class, String.class), yEE.copydefault(), "trace");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter3, "");
        this.nullableListOfStringAdapter = jsonAdapterAdapter3;
        JsonAdapter<Long> jsonAdapterAdapter4 = moshi.adapter(Long.class, yEE.copydefault(), "correlationId");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter4, "");
        this.nullableLongAdapter = jsonAdapterAdapter4;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append("GeneratedJsonAdapter(");
        sb.append("Properties");
        sb.append(')');
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    /* JADX DEBUG: Method merged with bridge method: fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object; */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.JsonAdapter
    public Properties fromJson(@NotNull JsonReader jsonReader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, InvocationTargetException {
        int i;
        Intrinsics.checkNotNullParameter(jsonReader, "");
        jsonReader.beginObject();
        String strFromJson = null;
        int i2 = -1;
        String strFromJson2 = null;
        String strFromJson3 = null;
        Boolean boolFromJson = null;
        String strFromJson4 = null;
        String strFromJson5 = null;
        List<String> listFromJson = null;
        String strFromJson6 = null;
        Long lFromJson = null;
        String strFromJson7 = null;
        String strFromJson8 = null;
        String strFromJson9 = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    continue;
                case 0:
                    strFromJson = this.nullableStringAdapter.fromJson(jsonReader);
                    i = -2;
                    break;
                case 1:
                    i = -3;
                    strFromJson2 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 2:
                    i = -5;
                    strFromJson3 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 3:
                    i = -9;
                    boolFromJson = this.nullableBooleanAdapter.fromJson(jsonReader);
                    break;
                case 4:
                    i = -17;
                    strFromJson4 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 5:
                    i = -33;
                    strFromJson5 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 6:
                    i = -65;
                    listFromJson = this.nullableListOfStringAdapter.fromJson(jsonReader);
                    break;
                case 7:
                    i = -129;
                    strFromJson6 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 8:
                    i = -257;
                    lFromJson = this.nullableLongAdapter.fromJson(jsonReader);
                    break;
                case 9:
                    i = -513;
                    strFromJson7 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 10:
                    i = -1025;
                    strFromJson8 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 11:
                    i = -2049;
                    strFromJson9 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
            }
            i2 &= i;
        }
        jsonReader.endObject();
        if (i2 == -4096) {
            return new Properties(strFromJson, strFromJson2, strFromJson3, boolFromJson, strFromJson4, strFromJson5, listFromJson, strFromJson6, lFromJson, strFromJson7, strFromJson8, strFromJson9);
        }
        Constructor<Properties> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            declaredConstructor = Properties.class.getDeclaredConstructor(String.class, String.class, String.class, Boolean.class, String.class, String.class, List.class, String.class, Long.class, String.class, String.class, String.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = declaredConstructor;
            Intrinsics.checkNotNullExpressionValue(declaredConstructor, "");
        }
        Properties propertiesNewInstance = declaredConstructor.newInstance(strFromJson, strFromJson2, strFromJson3, boolFromJson, strFromJson4, strFromJson5, listFromJson, strFromJson6, lFromJson, strFromJson7, strFromJson8, strFromJson9, Integer.valueOf(i2), null);
        Intrinsics.checkNotNullExpressionValue(propertiesNewInstance, "");
        return propertiesNewInstance;
    }

    /* JADX DEBUG: Method merged with bridge method: toJson(Lcom/squareup/moshi/JsonWriter;Ljava/lang/Object;)V */
    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(@NotNull JsonWriter jsonWriter, Properties properties) throws IOException {
        Intrinsics.checkNotNullParameter(jsonWriter, "");
        if (properties == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        jsonWriter.beginObject();
        jsonWriter.name("message");
        this.nullableStringAdapter.toJson(jsonWriter, properties.getMessage());
        jsonWriter.name("name");
        this.nullableStringAdapter.toJson(jsonWriter, properties.getName());
        jsonWriter.name(FirebaseAnalytics.Param.METHOD);
        this.nullableStringAdapter.toJson(jsonWriter, properties.getMethod());
        jsonWriter.name("connected");
        this.nullableBooleanAdapter.toJson(jsonWriter, properties.getConnected());
        jsonWriter.name("network");
        this.nullableStringAdapter.toJson(jsonWriter, properties.getNetwork());
        jsonWriter.name(MTPushConstants.PlatformNode.KEY_PLATFORM);
        this.nullableStringAdapter.toJson(jsonWriter, properties.getPlatform());
        jsonWriter.name("trace");
        this.nullableListOfStringAdapter.toJson(jsonWriter, properties.getTrace());
        jsonWriter.name(PushMessagingService.KEY_TOPIC);
        this.nullableStringAdapter.toJson(jsonWriter, properties.getTopic());
        jsonWriter.name("correlation_id");
        this.nullableLongAdapter.toJson(jsonWriter, properties.getCorrelationId());
        jsonWriter.name("client_id");
        this.nullableStringAdapter.toJson(jsonWriter, properties.getClientId());
        jsonWriter.name(HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION);
        this.nullableStringAdapter.toJson(jsonWriter, properties.getDirection());
        jsonWriter.name("user_agent");
        this.nullableStringAdapter.toJson(jsonWriter, properties.getUserAgent());
        jsonWriter.endObject();
    }
}
