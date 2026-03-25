package com.reown.sign.common.model.vo.clientsync.session.params;

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
public final class SignParams_DeleteParamsJsonAdapter extends JsonAdapter<SignParams.DeleteParams> {
    public volatile Constructor<SignParams.DeleteParams> constructorRef;
    public final JsonAdapter<Integer> intAdapter;
    public final JsonReader.Options options;
    public final JsonAdapter<String> stringAdapter;

    public SignParams_DeleteParamsJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "");
        JsonReader.Options optionsOf = JsonReader.Options.of("code", "message");
        Intrinsics.checkNotNullExpressionValue(optionsOf, "");
        this.options = optionsOf;
        JsonAdapter<Integer> jsonAdapterAdapter = moshi.adapter(Integer.TYPE, yEE.copydefault(), "code");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter, "");
        this.intAdapter = jsonAdapterAdapter;
        JsonAdapter<String> jsonAdapterAdapter2 = moshi.adapter(String.class, yEE.copydefault(), "message");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter2, "");
        this.stringAdapter = jsonAdapterAdapter2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(45);
        sb.append("GeneratedJsonAdapter(");
        sb.append("SignParams.DeleteParams");
        sb.append(')');
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    /* JADX DEBUG: Method merged with bridge method: fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object; */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.JsonAdapter
    public SignParams.DeleteParams fromJson(@NotNull JsonReader jsonReader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, InvocationTargetException {
        Intrinsics.checkNotNullParameter(jsonReader, "");
        Integer numFromJson = 0;
        jsonReader.beginObject();
        String strFromJson = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int iSelectName = jsonReader.selectName(this.options);
            if (iSelectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (iSelectName == 0) {
                numFromJson = this.intAdapter.fromJson(jsonReader);
                if (numFromJson == null) {
                    JsonDataException jsonDataExceptionUnexpectedNull = Util.unexpectedNull("code", "code", jsonReader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull, "");
                    throw jsonDataExceptionUnexpectedNull;
                }
                i = -2;
            } else if (iSelectName == 1 && (strFromJson = this.stringAdapter.fromJson(jsonReader)) == null) {
                JsonDataException jsonDataExceptionUnexpectedNull2 = Util.unexpectedNull("message", "message", jsonReader);
                Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull2, "");
                throw jsonDataExceptionUnexpectedNull2;
            }
        }
        jsonReader.endObject();
        if (i == -2) {
            int iIntValue = numFromJson.intValue();
            if (strFromJson != null) {
                return new SignParams.DeleteParams(iIntValue, strFromJson);
            }
            JsonDataException jsonDataExceptionMissingProperty = Util.missingProperty("message", "message", jsonReader);
            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty, "");
            throw jsonDataExceptionMissingProperty;
        }
        Constructor<SignParams.DeleteParams> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            Class cls = Integer.TYPE;
            declaredConstructor = SignParams.DeleteParams.class.getDeclaredConstructor(cls, String.class, cls, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = declaredConstructor;
            Intrinsics.checkNotNullExpressionValue(declaredConstructor, "");
        }
        if (strFromJson != null) {
            SignParams.DeleteParams deleteParamsNewInstance = declaredConstructor.newInstance(numFromJson, strFromJson, Integer.valueOf(i), null);
            Intrinsics.checkNotNullExpressionValue(deleteParamsNewInstance, "");
            return deleteParamsNewInstance;
        }
        JsonDataException jsonDataExceptionMissingProperty2 = Util.missingProperty("message", "message", jsonReader);
        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty2, "");
        throw jsonDataExceptionMissingProperty2;
    }

    /* JADX DEBUG: Method merged with bridge method: toJson(Lcom/squareup/moshi/JsonWriter;Ljava/lang/Object;)V */
    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(@NotNull JsonWriter jsonWriter, SignParams.DeleteParams deleteParams) throws IOException {
        Intrinsics.checkNotNullParameter(jsonWriter, "");
        if (deleteParams == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        jsonWriter.beginObject();
        jsonWriter.name("code");
        this.intAdapter.toJson(jsonWriter, Integer.valueOf(deleteParams.getCode()));
        jsonWriter.name("message");
        this.stringAdapter.toJson(jsonWriter, deleteParams.getMessage());
        jsonWriter.endObject();
    }
}
