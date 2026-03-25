package com.reown.sign.engine.model;

import com.google.firebase.messaging.Constants;
import com.reown.sign.engine.model.EngineDO;
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
public final class EngineDO_JsonRpcResponse_JsonRpcErrorJsonAdapter extends JsonAdapter<EngineDO.JsonRpcResponse.JsonRpcError> {
    public volatile Constructor<EngineDO.JsonRpcResponse.JsonRpcError> constructorRef;
    public final JsonAdapter<EngineDO.JsonRpcResponse.Error> errorAdapter;
    public final JsonAdapter<Long> longAdapter;
    public final JsonReader.Options options;
    public final JsonAdapter<String> stringAdapter;

    public EngineDO_JsonRpcResponse_JsonRpcErrorJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "");
        JsonReader.Options optionsOf = JsonReader.Options.of("id", "jsonrpc", Constants.IPC_BUNDLE_KEY_SEND_ERROR);
        Intrinsics.checkNotNullExpressionValue(optionsOf, "");
        this.options = optionsOf;
        JsonAdapter<Long> jsonAdapterAdapter = moshi.adapter(Long.TYPE, yEE.copydefault(), "id");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter, "");
        this.longAdapter = jsonAdapterAdapter;
        JsonAdapter<String> jsonAdapterAdapter2 = moshi.adapter(String.class, yEE.copydefault(), "jsonrpc");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter2, "");
        this.stringAdapter = jsonAdapterAdapter2;
        JsonAdapter<EngineDO.JsonRpcResponse.Error> jsonAdapterAdapter3 = moshi.adapter(EngineDO.JsonRpcResponse.Error.class, yEE.copydefault(), Constants.IPC_BUNDLE_KEY_SEND_ERROR);
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter3, "");
        this.errorAdapter = jsonAdapterAdapter3;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(59);
        sb.append("GeneratedJsonAdapter(");
        sb.append("EngineDO.JsonRpcResponse.JsonRpcError");
        sb.append(')');
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    /* JADX DEBUG: Method merged with bridge method: fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object; */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.JsonAdapter
    public EngineDO.JsonRpcResponse.JsonRpcError fromJson(@NotNull JsonReader jsonReader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, InvocationTargetException {
        Intrinsics.checkNotNullParameter(jsonReader, "");
        jsonReader.beginObject();
        Long lFromJson = null;
        String strFromJson = null;
        EngineDO.JsonRpcResponse.Error errorFromJson = null;
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
            } else if (iSelectName == 1) {
                strFromJson = this.stringAdapter.fromJson(jsonReader);
                if (strFromJson == null) {
                    JsonDataException jsonDataExceptionUnexpectedNull2 = Util.unexpectedNull("jsonrpc", "jsonrpc", jsonReader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull2, "");
                    throw jsonDataExceptionUnexpectedNull2;
                }
                i = -3;
            } else if (iSelectName == 2 && (errorFromJson = this.errorAdapter.fromJson(jsonReader)) == null) {
                JsonDataException jsonDataExceptionUnexpectedNull3 = Util.unexpectedNull(Constants.IPC_BUNDLE_KEY_SEND_ERROR, Constants.IPC_BUNDLE_KEY_SEND_ERROR, jsonReader);
                Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull3, "");
                throw jsonDataExceptionUnexpectedNull3;
            }
        }
        jsonReader.endObject();
        if (i == -3) {
            if (lFromJson != null) {
                long jLongValue = lFromJson.longValue();
                Intrinsics.copydefault(strFromJson, "");
                if (errorFromJson != null) {
                    return new EngineDO.JsonRpcResponse.JsonRpcError(jLongValue, strFromJson, errorFromJson);
                }
                JsonDataException jsonDataExceptionMissingProperty = Util.missingProperty(Constants.IPC_BUNDLE_KEY_SEND_ERROR, Constants.IPC_BUNDLE_KEY_SEND_ERROR, jsonReader);
                Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty, "");
                throw jsonDataExceptionMissingProperty;
            }
            JsonDataException jsonDataExceptionMissingProperty2 = Util.missingProperty("id", "id", jsonReader);
            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty2, "");
            throw jsonDataExceptionMissingProperty2;
        }
        Constructor<EngineDO.JsonRpcResponse.JsonRpcError> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            declaredConstructor = EngineDO.JsonRpcResponse.JsonRpcError.class.getDeclaredConstructor(Long.TYPE, String.class, EngineDO.JsonRpcResponse.Error.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = declaredConstructor;
            Intrinsics.checkNotNullExpressionValue(declaredConstructor, "");
        }
        if (lFromJson == null) {
            JsonDataException jsonDataExceptionMissingProperty3 = Util.missingProperty("id", "id", jsonReader);
            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty3, "");
            throw jsonDataExceptionMissingProperty3;
        }
        if (errorFromJson != null) {
            EngineDO.JsonRpcResponse.JsonRpcError jsonRpcErrorNewInstance = declaredConstructor.newInstance(lFromJson, strFromJson, errorFromJson, Integer.valueOf(i), null);
            Intrinsics.checkNotNullExpressionValue(jsonRpcErrorNewInstance, "");
            return jsonRpcErrorNewInstance;
        }
        JsonDataException jsonDataExceptionMissingProperty4 = Util.missingProperty(Constants.IPC_BUNDLE_KEY_SEND_ERROR, Constants.IPC_BUNDLE_KEY_SEND_ERROR, jsonReader);
        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty4, "");
        throw jsonDataExceptionMissingProperty4;
    }

    /* JADX DEBUG: Method merged with bridge method: toJson(Lcom/squareup/moshi/JsonWriter;Ljava/lang/Object;)V */
    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(@NotNull JsonWriter jsonWriter, EngineDO.JsonRpcResponse.JsonRpcError jsonRpcError) throws IOException {
        Intrinsics.checkNotNullParameter(jsonWriter, "");
        if (jsonRpcError == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        jsonWriter.beginObject();
        jsonWriter.name("id");
        this.longAdapter.toJson(jsonWriter, Long.valueOf(jsonRpcError.getId()));
        jsonWriter.name("jsonrpc");
        this.stringAdapter.toJson(jsonWriter, jsonRpcError.getJsonrpc());
        jsonWriter.name(Constants.IPC_BUNDLE_KEY_SEND_ERROR);
        this.errorAdapter.toJson(jsonWriter, jsonRpcError.getError());
        jsonWriter.endObject();
    }
}
