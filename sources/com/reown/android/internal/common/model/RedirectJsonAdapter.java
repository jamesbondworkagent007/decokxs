package com.reown.android.internal.common.model;

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
public final class RedirectJsonAdapter extends JsonAdapter<Redirect> {
    public final JsonAdapter<Boolean> booleanAdapter;
    public volatile Constructor<Redirect> constructorRef;
    public final JsonAdapter<String> nullableStringAdapter;
    public final JsonReader.Options options;

    public RedirectJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "");
        JsonReader.Options optionsOf = JsonReader.Options.of("native", "universal", "linkMode");
        Intrinsics.checkNotNullExpressionValue(optionsOf, "");
        this.options = optionsOf;
        JsonAdapter<String> jsonAdapterAdapter = moshi.adapter(String.class, yEE.copydefault(), "native");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter, "");
        this.nullableStringAdapter = jsonAdapterAdapter;
        JsonAdapter<Boolean> jsonAdapterAdapter2 = moshi.adapter(Boolean.TYPE, yEE.copydefault(), "linkMode");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter2, "");
        this.booleanAdapter = jsonAdapterAdapter2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(30);
        sb.append("GeneratedJsonAdapter(");
        sb.append("Redirect");
        sb.append(')');
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    /* JADX DEBUG: Method merged with bridge method: fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object; */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.JsonAdapter
    public Redirect fromJson(@NotNull JsonReader jsonReader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, InvocationTargetException {
        Intrinsics.checkNotNullParameter(jsonReader, "");
        Boolean boolFromJson = Boolean.FALSE;
        jsonReader.beginObject();
        String strFromJson = null;
        String strFromJson2 = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int iSelectName = jsonReader.selectName(this.options);
            if (iSelectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (iSelectName == 0) {
                strFromJson = this.nullableStringAdapter.fromJson(jsonReader);
                i &= -2;
            } else if (iSelectName == 1) {
                strFromJson2 = this.nullableStringAdapter.fromJson(jsonReader);
                i &= -3;
            } else if (iSelectName == 2) {
                boolFromJson = this.booleanAdapter.fromJson(jsonReader);
                if (boolFromJson == null) {
                    JsonDataException jsonDataExceptionUnexpectedNull = Util.unexpectedNull("linkMode", "linkMode", jsonReader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull, "");
                    throw jsonDataExceptionUnexpectedNull;
                }
                i &= -5;
            } else {
                continue;
            }
        }
        jsonReader.endObject();
        if (i == -8) {
            return new Redirect(strFromJson, strFromJson2, boolFromJson.booleanValue());
        }
        Constructor<Redirect> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            declaredConstructor = Redirect.class.getDeclaredConstructor(String.class, String.class, Boolean.TYPE, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = declaredConstructor;
            Intrinsics.checkNotNullExpressionValue(declaredConstructor, "");
        }
        Redirect redirectNewInstance = declaredConstructor.newInstance(strFromJson, strFromJson2, boolFromJson, Integer.valueOf(i), null);
        Intrinsics.checkNotNullExpressionValue(redirectNewInstance, "");
        return redirectNewInstance;
    }

    /* JADX DEBUG: Method merged with bridge method: toJson(Lcom/squareup/moshi/JsonWriter;Ljava/lang/Object;)V */
    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(@NotNull JsonWriter jsonWriter, Redirect redirect) throws IOException {
        Intrinsics.checkNotNullParameter(jsonWriter, "");
        if (redirect == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        jsonWriter.beginObject();
        jsonWriter.name("native");
        this.nullableStringAdapter.toJson(jsonWriter, redirect.getNative());
        jsonWriter.name("universal");
        this.nullableStringAdapter.toJson(jsonWriter, redirect.getUniversal());
        jsonWriter.name("linkMode");
        this.booleanAdapter.toJson(jsonWriter, Boolean.valueOf(redirect.getLinkMode()));
        jsonWriter.endObject();
    }
}
