package com.reown.android.internal.common.signing.cacao;

import com.ibm.icu.text.DateFormat;
import com.reown.android.internal.common.signing.cacao.Cacao;
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
public final class Cacao_SignatureJsonAdapter extends JsonAdapter<Cacao.Signature> {
    public volatile Constructor<Cacao.Signature> constructorRef;
    public final JsonAdapter<String> nullableStringAdapter;
    public final JsonReader.Options options;
    public final JsonAdapter<String> stringAdapter;

    public Cacao_SignatureJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "");
        JsonReader.Options optionsOf = JsonReader.Options.of("t", DateFormat.SECOND, DateFormat.MINUTE);
        Intrinsics.checkNotNullExpressionValue(optionsOf, "");
        this.options = optionsOf;
        JsonAdapter<String> jsonAdapterAdapter = moshi.adapter(String.class, yEE.copydefault(), "t");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter, "");
        this.stringAdapter = jsonAdapterAdapter;
        JsonAdapter<String> jsonAdapterAdapter2 = moshi.adapter(String.class, yEE.copydefault(), DateFormat.MINUTE);
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter2, "");
        this.nullableStringAdapter = jsonAdapterAdapter2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(37);
        sb.append("GeneratedJsonAdapter(");
        sb.append("Cacao.Signature");
        sb.append(')');
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    /* JADX DEBUG: Method merged with bridge method: fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object; */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.JsonAdapter
    public Cacao.Signature fromJson(@NotNull JsonReader jsonReader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, InvocationTargetException {
        Intrinsics.checkNotNullParameter(jsonReader, "");
        jsonReader.beginObject();
        String strFromJson = null;
        String strFromJson2 = null;
        String strFromJson3 = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int iSelectName = jsonReader.selectName(this.options);
            if (iSelectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (iSelectName == 0) {
                strFromJson = this.stringAdapter.fromJson(jsonReader);
                if (strFromJson == null) {
                    JsonDataException jsonDataExceptionUnexpectedNull = Util.unexpectedNull("t", "t", jsonReader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull, "");
                    throw jsonDataExceptionUnexpectedNull;
                }
            } else if (iSelectName == 1) {
                strFromJson2 = this.stringAdapter.fromJson(jsonReader);
                if (strFromJson2 == null) {
                    JsonDataException jsonDataExceptionUnexpectedNull2 = Util.unexpectedNull(DateFormat.SECOND, DateFormat.SECOND, jsonReader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull2, "");
                    throw jsonDataExceptionUnexpectedNull2;
                }
            } else if (iSelectName == 2) {
                strFromJson3 = this.nullableStringAdapter.fromJson(jsonReader);
                i = -5;
            }
        }
        jsonReader.endObject();
        if (i == -5) {
            if (strFromJson == null) {
                JsonDataException jsonDataExceptionMissingProperty = Util.missingProperty("t", "t", jsonReader);
                Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty, "");
                throw jsonDataExceptionMissingProperty;
            }
            if (strFromJson2 != null) {
                return new Cacao.Signature(strFromJson, strFromJson2, strFromJson3);
            }
            JsonDataException jsonDataExceptionMissingProperty2 = Util.missingProperty(DateFormat.SECOND, DateFormat.SECOND, jsonReader);
            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty2, "");
            throw jsonDataExceptionMissingProperty2;
        }
        Constructor<Cacao.Signature> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            declaredConstructor = Cacao.Signature.class.getDeclaredConstructor(String.class, String.class, String.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = declaredConstructor;
            Intrinsics.checkNotNullExpressionValue(declaredConstructor, "");
        }
        if (strFromJson == null) {
            JsonDataException jsonDataExceptionMissingProperty3 = Util.missingProperty("t", "t", jsonReader);
            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty3, "");
            throw jsonDataExceptionMissingProperty3;
        }
        if (strFromJson2 != null) {
            Cacao.Signature signatureNewInstance = declaredConstructor.newInstance(strFromJson, strFromJson2, strFromJson3, Integer.valueOf(i), null);
            Intrinsics.checkNotNullExpressionValue(signatureNewInstance, "");
            return signatureNewInstance;
        }
        JsonDataException jsonDataExceptionMissingProperty4 = Util.missingProperty(DateFormat.SECOND, DateFormat.SECOND, jsonReader);
        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty4, "");
        throw jsonDataExceptionMissingProperty4;
    }

    /* JADX DEBUG: Method merged with bridge method: toJson(Lcom/squareup/moshi/JsonWriter;Ljava/lang/Object;)V */
    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(@NotNull JsonWriter jsonWriter, Cacao.Signature signature) throws IOException {
        Intrinsics.checkNotNullParameter(jsonWriter, "");
        if (signature == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        jsonWriter.beginObject();
        jsonWriter.name("t");
        this.stringAdapter.toJson(jsonWriter, signature.getT());
        jsonWriter.name(DateFormat.SECOND);
        this.stringAdapter.toJson(jsonWriter, signature.getS());
        jsonWriter.name(DateFormat.MINUTE);
        this.nullableStringAdapter.toJson(jsonWriter, signature.getM());
        jsonWriter.endObject();
    }
}
