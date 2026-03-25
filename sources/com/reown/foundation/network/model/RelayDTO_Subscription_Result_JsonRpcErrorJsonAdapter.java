package com.reown.foundation.network.model;

import com.google.firebase.messaging.Constants;
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
public final class RelayDTO_Subscription_Result_JsonRpcErrorJsonAdapter extends JsonAdapter<RelayDTO.Subscription.Result.JsonRpcError> {
    private volatile Constructor<RelayDTO.Subscription.Result.JsonRpcError> constructorRef;
    private final JsonAdapter<RelayDTO.Error> errorAdapter;
    private final JsonAdapter<Long> longAdapter;
    private final JsonReader.Options options;
    private final JsonAdapter<String> stringAdapter;

    public RelayDTO_Subscription_Result_JsonRpcErrorJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "");
        JsonReader.Options optionsOf = JsonReader.Options.of("jsonrpc", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "id");
        Intrinsics.checkNotNullExpressionValue(optionsOf, "");
        this.options = optionsOf;
        JsonAdapter<String> jsonAdapterAdapter = moshi.adapter(String.class, yEE.copydefault(), "jsonrpc");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter, "");
        this.stringAdapter = jsonAdapterAdapter;
        JsonAdapter<RelayDTO.Error> jsonAdapterAdapter2 = moshi.adapter(RelayDTO.Error.class, yEE.copydefault(), Constants.IPC_BUNDLE_KEY_SEND_ERROR);
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter2, "");
        this.errorAdapter = jsonAdapterAdapter2;
        JsonAdapter<Long> jsonAdapterAdapter3 = moshi.adapter(Long.TYPE, yEE.copydefault(), "id");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter3, "");
        this.longAdapter = jsonAdapterAdapter3;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(63);
        sb.append("GeneratedJsonAdapter(");
        sb.append("RelayDTO.Subscription.Result.JsonRpcError");
        sb.append(')');
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    /* JADX DEBUG: Method merged with bridge method: fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object; */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.JsonAdapter
    public RelayDTO.Subscription.Result.JsonRpcError fromJson(@NotNull JsonReader jsonReader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, InvocationTargetException {
        Intrinsics.checkNotNullParameter(jsonReader, "");
        jsonReader.beginObject();
        int i = -1;
        String strFromJson = null;
        RelayDTO.Error errorFromJson = null;
        Long lFromJson = null;
        while (jsonReader.hasNext()) {
            int iSelectName = jsonReader.selectName(this.options);
            if (iSelectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (iSelectName == 0) {
                strFromJson = this.stringAdapter.fromJson(jsonReader);
                if (strFromJson == null) {
                    JsonDataException jsonDataExceptionUnexpectedNull = Util.unexpectedNull("jsonrpc", "jsonrpc", jsonReader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull, "");
                    throw jsonDataExceptionUnexpectedNull;
                }
                i = -2;
            } else if (iSelectName == 1) {
                errorFromJson = this.errorAdapter.fromJson(jsonReader);
                if (errorFromJson == null) {
                    JsonDataException jsonDataExceptionUnexpectedNull2 = Util.unexpectedNull(Constants.IPC_BUNDLE_KEY_SEND_ERROR, Constants.IPC_BUNDLE_KEY_SEND_ERROR, jsonReader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull2, "");
                    throw jsonDataExceptionUnexpectedNull2;
                }
            } else if (iSelectName == 2 && (lFromJson = this.longAdapter.fromJson(jsonReader)) == null) {
                JsonDataException jsonDataExceptionUnexpectedNull3 = Util.unexpectedNull("id", "id", jsonReader);
                Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull3, "");
                throw jsonDataExceptionUnexpectedNull3;
            }
        }
        jsonReader.endObject();
        if (i == -2) {
            Intrinsics.copydefault(strFromJson, "");
            if (errorFromJson == null) {
                JsonDataException jsonDataExceptionMissingProperty = Util.missingProperty(Constants.IPC_BUNDLE_KEY_SEND_ERROR, Constants.IPC_BUNDLE_KEY_SEND_ERROR, jsonReader);
                Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty, "");
                throw jsonDataExceptionMissingProperty;
            }
            if (lFromJson != null) {
                return new RelayDTO.Subscription.Result.JsonRpcError(strFromJson, errorFromJson, lFromJson.longValue());
            }
            JsonDataException jsonDataExceptionMissingProperty2 = Util.missingProperty("id", "id", jsonReader);
            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty2, "");
            throw jsonDataExceptionMissingProperty2;
        }
        Constructor<RelayDTO.Subscription.Result.JsonRpcError> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            declaredConstructor = RelayDTO.Subscription.Result.JsonRpcError.class.getDeclaredConstructor(String.class, RelayDTO.Error.class, Long.TYPE, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = declaredConstructor;
            Intrinsics.checkNotNullExpressionValue(declaredConstructor, "");
        }
        Object[] objArr = new Object[5];
        objArr[0] = strFromJson;
        if (errorFromJson == null) {
            JsonDataException jsonDataExceptionMissingProperty3 = Util.missingProperty(Constants.IPC_BUNDLE_KEY_SEND_ERROR, Constants.IPC_BUNDLE_KEY_SEND_ERROR, jsonReader);
            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty3, "");
            throw jsonDataExceptionMissingProperty3;
        }
        objArr[1] = errorFromJson;
        if (lFromJson == null) {
            JsonDataException jsonDataExceptionMissingProperty4 = Util.missingProperty("id", "id", jsonReader);
            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty4, "");
            throw jsonDataExceptionMissingProperty4;
        }
        objArr[2] = Long.valueOf(lFromJson.longValue());
        objArr[3] = Integer.valueOf(i);
        objArr[4] = null;
        RelayDTO.Subscription.Result.JsonRpcError jsonRpcErrorNewInstance = declaredConstructor.newInstance(objArr);
        Intrinsics.checkNotNullExpressionValue(jsonRpcErrorNewInstance, "");
        return jsonRpcErrorNewInstance;
    }

    /* JADX DEBUG: Method merged with bridge method: toJson(Lcom/squareup/moshi/JsonWriter;Ljava/lang/Object;)V */
    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(@NotNull JsonWriter jsonWriter, RelayDTO.Subscription.Result.JsonRpcError jsonRpcError) throws IOException {
        Intrinsics.checkNotNullParameter(jsonWriter, "");
        if (jsonRpcError == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        jsonWriter.beginObject();
        jsonWriter.name("jsonrpc");
        this.stringAdapter.toJson(jsonWriter, jsonRpcError.getJsonrpc());
        jsonWriter.name(Constants.IPC_BUNDLE_KEY_SEND_ERROR);
        this.errorAdapter.toJson(jsonWriter, jsonRpcError.getError());
        jsonWriter.name("id");
        this.longAdapter.toJson(jsonWriter, Long.valueOf(jsonRpcError.getId()));
        jsonWriter.endObject();
    }
}
