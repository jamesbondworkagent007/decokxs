package com.reown.foundation.network.model;

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
public final class RelayDTO_Publish_Result_AcknowledgementJsonAdapter extends JsonAdapter<RelayDTO.Publish.Result.Acknowledgement> {
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<RelayDTO.Publish.Result.Acknowledgement> constructorRef;
    private final JsonAdapter<Long> longAdapter;
    private final JsonReader.Options options;
    private final JsonAdapter<String> stringAdapter;

    public RelayDTO_Publish_Result_AcknowledgementJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "");
        JsonReader.Options optionsOf = JsonReader.Options.of("id", "jsonrpc", "result");
        Intrinsics.checkNotNullExpressionValue(optionsOf, "");
        this.options = optionsOf;
        JsonAdapter<Long> jsonAdapterAdapter = moshi.adapter(Long.TYPE, yEE.copydefault(), "id");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter, "");
        this.longAdapter = jsonAdapterAdapter;
        JsonAdapter<String> jsonAdapterAdapter2 = moshi.adapter(String.class, yEE.copydefault(), "jsonrpc");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter2, "");
        this.stringAdapter = jsonAdapterAdapter2;
        JsonAdapter<Boolean> jsonAdapterAdapter3 = moshi.adapter(Boolean.TYPE, yEE.copydefault(), "result");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter3, "");
        this.booleanAdapter = jsonAdapterAdapter3;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(61);
        sb.append("GeneratedJsonAdapter(");
        sb.append("RelayDTO.Publish.Result.Acknowledgement");
        sb.append(')');
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    /* JADX DEBUG: Method merged with bridge method: fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object; */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.JsonAdapter
    public RelayDTO.Publish.Result.Acknowledgement fromJson(@NotNull JsonReader jsonReader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, InvocationTargetException {
        Intrinsics.checkNotNullParameter(jsonReader, "");
        jsonReader.beginObject();
        int i = -1;
        Long lFromJson = null;
        String strFromJson = null;
        Boolean boolFromJson = null;
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
                i = -3;
            } else if (iSelectName == 2 && (boolFromJson = this.booleanAdapter.fromJson(jsonReader)) == null) {
                JsonDataException jsonDataExceptionUnexpectedNull3 = Util.unexpectedNull("result", "result", jsonReader);
                Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull3, "");
                throw jsonDataExceptionUnexpectedNull3;
            }
        }
        jsonReader.endObject();
        if (i == -3) {
            if (lFromJson != null) {
                long jLongValue = lFromJson.longValue();
                Intrinsics.copydefault(strFromJson, "");
                if (boolFromJson != null) {
                    return new RelayDTO.Publish.Result.Acknowledgement(jLongValue, strFromJson, boolFromJson.booleanValue());
                }
                JsonDataException jsonDataExceptionMissingProperty = Util.missingProperty("result", "result", jsonReader);
                Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty, "");
                throw jsonDataExceptionMissingProperty;
            }
            JsonDataException jsonDataExceptionMissingProperty2 = Util.missingProperty("id", "id", jsonReader);
            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty2, "");
            throw jsonDataExceptionMissingProperty2;
        }
        Constructor<RelayDTO.Publish.Result.Acknowledgement> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            declaredConstructor = RelayDTO.Publish.Result.Acknowledgement.class.getDeclaredConstructor(Long.TYPE, String.class, Boolean.TYPE, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = declaredConstructor;
            Intrinsics.checkNotNullExpressionValue(declaredConstructor, "");
        }
        Object[] objArr = new Object[5];
        if (lFromJson != null) {
            objArr[0] = Long.valueOf(lFromJson.longValue());
            objArr[1] = strFromJson;
            if (boolFromJson == null) {
                JsonDataException jsonDataExceptionMissingProperty3 = Util.missingProperty("result", "result", jsonReader);
                Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty3, "");
                throw jsonDataExceptionMissingProperty3;
            }
            objArr[2] = Boolean.valueOf(boolFromJson.booleanValue());
            objArr[3] = Integer.valueOf(i);
            objArr[4] = null;
            RelayDTO.Publish.Result.Acknowledgement acknowledgementNewInstance = declaredConstructor.newInstance(objArr);
            Intrinsics.checkNotNullExpressionValue(acknowledgementNewInstance, "");
            return acknowledgementNewInstance;
        }
        JsonDataException jsonDataExceptionMissingProperty4 = Util.missingProperty("id", "id", jsonReader);
        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty4, "");
        throw jsonDataExceptionMissingProperty4;
    }

    /* JADX DEBUG: Method merged with bridge method: toJson(Lcom/squareup/moshi/JsonWriter;Ljava/lang/Object;)V */
    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(@NotNull JsonWriter jsonWriter, RelayDTO.Publish.Result.Acknowledgement acknowledgement) throws IOException {
        Intrinsics.checkNotNullParameter(jsonWriter, "");
        if (acknowledgement == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        jsonWriter.beginObject();
        jsonWriter.name("id");
        this.longAdapter.toJson(jsonWriter, Long.valueOf(acknowledgement.getId()));
        jsonWriter.name("jsonrpc");
        this.stringAdapter.toJson(jsonWriter, acknowledgement.getJsonrpc());
        jsonWriter.name("result");
        this.booleanAdapter.toJson(jsonWriter, Boolean.valueOf(acknowledgement.getResult()));
        jsonWriter.endObject();
    }
}
