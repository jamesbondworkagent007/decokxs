package com.reown.android.push.network.model;

import com.reown.android.internal.common.di.CoreNetworkModuleKt;
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
public final class PushBodyJsonAdapter extends JsonAdapter<PushBody> {
    public volatile Constructor<PushBody> constructorRef;
    public final JsonAdapter<Boolean> nullableBooleanAdapter;
    public final JsonReader.Options options;
    public final JsonAdapter<String> stringAdapter;

    public PushBodyJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "");
        JsonReader.Options optionsOf = JsonReader.Options.of("client_id", "token", "type", "always_raw");
        Intrinsics.checkNotNullExpressionValue(optionsOf, "");
        this.options = optionsOf;
        JsonAdapter<String> jsonAdapterAdapter = moshi.adapter(String.class, yEE.copydefault(), CoreNetworkModuleKt.KEY_CLIENT_ID);
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter, "");
        this.stringAdapter = jsonAdapterAdapter;
        JsonAdapter<Boolean> jsonAdapterAdapter2 = moshi.adapter(Boolean.class, yEE.copydefault(), "enableEncrypted");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter2, "");
        this.nullableBooleanAdapter = jsonAdapterAdapter2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(30);
        sb.append("GeneratedJsonAdapter(");
        sb.append("PushBody");
        sb.append(')');
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    /* JADX DEBUG: Method merged with bridge method: fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object; */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.JsonAdapter
    public PushBody fromJson(@NotNull JsonReader jsonReader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, InvocationTargetException {
        Intrinsics.checkNotNullParameter(jsonReader, "");
        jsonReader.beginObject();
        String strFromJson = null;
        String strFromJson2 = null;
        String str = null;
        Boolean boolFromJson = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int iSelectName = jsonReader.selectName(this.options);
            if (iSelectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (iSelectName == 0) {
                strFromJson = this.stringAdapter.fromJson(jsonReader);
                if (strFromJson == null) {
                    JsonDataException jsonDataExceptionUnexpectedNull = Util.unexpectedNull(CoreNetworkModuleKt.KEY_CLIENT_ID, "client_id", jsonReader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull, "");
                    throw jsonDataExceptionUnexpectedNull;
                }
            } else if (iSelectName == 1) {
                strFromJson2 = this.stringAdapter.fromJson(jsonReader);
                if (strFromJson2 == null) {
                    JsonDataException jsonDataExceptionUnexpectedNull2 = Util.unexpectedNull("token", "token", jsonReader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull2, "");
                    throw jsonDataExceptionUnexpectedNull2;
                }
            } else if (iSelectName == 2) {
                String strFromJson3 = this.stringAdapter.fromJson(jsonReader);
                if (strFromJson3 == null) {
                    JsonDataException jsonDataExceptionUnexpectedNull3 = Util.unexpectedNull("type", "type", jsonReader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull3, "");
                    throw jsonDataExceptionUnexpectedNull3;
                }
                str = strFromJson3;
                i = -5;
            } else if (iSelectName == 3) {
                boolFromJson = this.nullableBooleanAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        if (i == -5) {
            if (strFromJson == null) {
                JsonDataException jsonDataExceptionMissingProperty = Util.missingProperty(CoreNetworkModuleKt.KEY_CLIENT_ID, "client_id", jsonReader);
                Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty, "");
                throw jsonDataExceptionMissingProperty;
            }
            if (strFromJson2 == null) {
                JsonDataException jsonDataExceptionMissingProperty2 = Util.missingProperty("token", "token", jsonReader);
                Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty2, "");
                throw jsonDataExceptionMissingProperty2;
            }
            Intrinsics.copydefault(str, "");
            return new PushBody(strFromJson, strFromJson2, str, boolFromJson);
        }
        Constructor<PushBody> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            declaredConstructor = PushBody.class.getDeclaredConstructor(String.class, String.class, String.class, Boolean.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = declaredConstructor;
            Intrinsics.checkNotNullExpressionValue(declaredConstructor, "");
        }
        if (strFromJson == null) {
            JsonDataException jsonDataExceptionMissingProperty3 = Util.missingProperty(CoreNetworkModuleKt.KEY_CLIENT_ID, "client_id", jsonReader);
            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty3, "");
            throw jsonDataExceptionMissingProperty3;
        }
        if (strFromJson2 != null) {
            PushBody pushBodyNewInstance = declaredConstructor.newInstance(strFromJson, strFromJson2, str, boolFromJson, Integer.valueOf(i), null);
            Intrinsics.checkNotNullExpressionValue(pushBodyNewInstance, "");
            return pushBodyNewInstance;
        }
        JsonDataException jsonDataExceptionMissingProperty4 = Util.missingProperty("token", "token", jsonReader);
        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty4, "");
        throw jsonDataExceptionMissingProperty4;
    }

    /* JADX DEBUG: Method merged with bridge method: toJson(Lcom/squareup/moshi/JsonWriter;Ljava/lang/Object;)V */
    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(@NotNull JsonWriter jsonWriter, PushBody pushBody) throws IOException {
        Intrinsics.checkNotNullParameter(jsonWriter, "");
        if (pushBody == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        jsonWriter.beginObject();
        jsonWriter.name("client_id");
        this.stringAdapter.toJson(jsonWriter, pushBody.getClientId());
        jsonWriter.name("token");
        this.stringAdapter.toJson(jsonWriter, pushBody.getToken());
        jsonWriter.name("type");
        this.stringAdapter.toJson(jsonWriter, pushBody.getType());
        jsonWriter.name("always_raw");
        this.nullableBooleanAdapter.toJson(jsonWriter, pushBody.getEnableEncrypted());
        jsonWriter.endObject();
    }
}
