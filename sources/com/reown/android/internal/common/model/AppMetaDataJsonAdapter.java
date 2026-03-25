package com.reown.android.internal.common.model;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
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
public final class AppMetaDataJsonAdapter extends JsonAdapter<AppMetaData> {
    public volatile Constructor<AppMetaData> constructorRef;
    public final JsonAdapter<List<String>> listOfStringAdapter;
    public final JsonAdapter<Redirect> nullableRedirectAdapter;
    public final JsonAdapter<String> nullableStringAdapter;
    public final JsonReader.Options options;
    public final JsonAdapter<String> stringAdapter;

    public AppMetaDataJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "");
        JsonReader.Options optionsOf = JsonReader.Options.of("description", "url", "icons", "name", "redirect", "verifyUrl");
        Intrinsics.checkNotNullExpressionValue(optionsOf, "");
        this.options = optionsOf;
        JsonAdapter<String> jsonAdapterAdapter = moshi.adapter(String.class, yEE.copydefault(), "description");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter, "");
        this.stringAdapter = jsonAdapterAdapter;
        JsonAdapter<List<String>> jsonAdapterAdapter2 = moshi.adapter(Types.newParameterizedType(List.class, String.class), yEE.copydefault(), "icons");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter2, "");
        this.listOfStringAdapter = jsonAdapterAdapter2;
        JsonAdapter<Redirect> jsonAdapterAdapter3 = moshi.adapter(Redirect.class, yEE.copydefault(), "redirect");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter3, "");
        this.nullableRedirectAdapter = jsonAdapterAdapter3;
        JsonAdapter<String> jsonAdapterAdapter4 = moshi.adapter(String.class, yEE.copydefault(), "verifyUrl");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter4, "");
        this.nullableStringAdapter = jsonAdapterAdapter4;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(33);
        sb.append("GeneratedJsonAdapter(");
        sb.append("AppMetaData");
        sb.append(')');
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    /* JADX DEBUG: Method merged with bridge method: fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object; */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.JsonAdapter
    public AppMetaData fromJson(@NotNull JsonReader jsonReader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, InvocationTargetException {
        Intrinsics.checkNotNullParameter(jsonReader, "");
        jsonReader.beginObject();
        String strFromJson = null;
        int i = -1;
        String strFromJson2 = null;
        List<String> listFromJson = null;
        String strFromJson3 = null;
        Redirect redirectFromJson = null;
        String strFromJson4 = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    strFromJson = this.stringAdapter.fromJson(jsonReader);
                    if (strFromJson == null) {
                        JsonDataException jsonDataExceptionUnexpectedNull = Util.unexpectedNull("description", "description", jsonReader);
                        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull, "");
                        throw jsonDataExceptionUnexpectedNull;
                    }
                    break;
                    break;
                case 1:
                    strFromJson2 = this.stringAdapter.fromJson(jsonReader);
                    if (strFromJson2 == null) {
                        JsonDataException jsonDataExceptionUnexpectedNull2 = Util.unexpectedNull("url", "url", jsonReader);
                        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull2, "");
                        throw jsonDataExceptionUnexpectedNull2;
                    }
                    break;
                    break;
                case 2:
                    listFromJson = this.listOfStringAdapter.fromJson(jsonReader);
                    if (listFromJson == null) {
                        JsonDataException jsonDataExceptionUnexpectedNull3 = Util.unexpectedNull("icons", "icons", jsonReader);
                        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull3, "");
                        throw jsonDataExceptionUnexpectedNull3;
                    }
                    break;
                    break;
                case 3:
                    strFromJson3 = this.stringAdapter.fromJson(jsonReader);
                    if (strFromJson3 == null) {
                        JsonDataException jsonDataExceptionUnexpectedNull4 = Util.unexpectedNull("name", "name", jsonReader);
                        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull4, "");
                        throw jsonDataExceptionUnexpectedNull4;
                    }
                    break;
                    break;
                case 4:
                    redirectFromJson = this.nullableRedirectAdapter.fromJson(jsonReader);
                    i &= -17;
                    break;
                case 5:
                    strFromJson4 = this.nullableStringAdapter.fromJson(jsonReader);
                    i &= -33;
                    break;
            }
        }
        jsonReader.endObject();
        if (i == -49) {
            if (strFromJson == null) {
                JsonDataException jsonDataExceptionMissingProperty = Util.missingProperty("description", "description", jsonReader);
                Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty, "");
                throw jsonDataExceptionMissingProperty;
            }
            if (strFromJson2 == null) {
                JsonDataException jsonDataExceptionMissingProperty2 = Util.missingProperty("url", "url", jsonReader);
                Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty2, "");
                throw jsonDataExceptionMissingProperty2;
            }
            if (listFromJson == null) {
                JsonDataException jsonDataExceptionMissingProperty3 = Util.missingProperty("icons", "icons", jsonReader);
                Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty3, "");
                throw jsonDataExceptionMissingProperty3;
            }
            if (strFromJson3 != null) {
                return new AppMetaData(strFromJson, strFromJson2, listFromJson, strFromJson3, redirectFromJson, strFromJson4);
            }
            JsonDataException jsonDataExceptionMissingProperty4 = Util.missingProperty("name", "name", jsonReader);
            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty4, "");
            throw jsonDataExceptionMissingProperty4;
        }
        Constructor<AppMetaData> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            declaredConstructor = AppMetaData.class.getDeclaredConstructor(String.class, String.class, List.class, String.class, Redirect.class, String.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = declaredConstructor;
            Intrinsics.checkNotNullExpressionValue(declaredConstructor, "");
        }
        Constructor<AppMetaData> constructor = declaredConstructor;
        if (strFromJson == null) {
            JsonDataException jsonDataExceptionMissingProperty5 = Util.missingProperty("description", "description", jsonReader);
            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty5, "");
            throw jsonDataExceptionMissingProperty5;
        }
        if (strFromJson2 == null) {
            JsonDataException jsonDataExceptionMissingProperty6 = Util.missingProperty("url", "url", jsonReader);
            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty6, "");
            throw jsonDataExceptionMissingProperty6;
        }
        if (listFromJson == null) {
            JsonDataException jsonDataExceptionMissingProperty7 = Util.missingProperty("icons", "icons", jsonReader);
            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty7, "");
            throw jsonDataExceptionMissingProperty7;
        }
        if (strFromJson3 == null) {
            JsonDataException jsonDataExceptionMissingProperty8 = Util.missingProperty("name", "name", jsonReader);
            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty8, "");
            throw jsonDataExceptionMissingProperty8;
        }
        AppMetaData appMetaDataNewInstance = constructor.newInstance(strFromJson, strFromJson2, listFromJson, strFromJson3, redirectFromJson, strFromJson4, Integer.valueOf(i), null);
        Intrinsics.checkNotNullExpressionValue(appMetaDataNewInstance, "");
        return appMetaDataNewInstance;
    }

    /* JADX DEBUG: Method merged with bridge method: toJson(Lcom/squareup/moshi/JsonWriter;Ljava/lang/Object;)V */
    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(@NotNull JsonWriter jsonWriter, AppMetaData appMetaData) throws IOException {
        Intrinsics.checkNotNullParameter(jsonWriter, "");
        if (appMetaData == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        jsonWriter.beginObject();
        jsonWriter.name("description");
        this.stringAdapter.toJson(jsonWriter, appMetaData.getDescription());
        jsonWriter.name("url");
        this.stringAdapter.toJson(jsonWriter, appMetaData.getUrl());
        jsonWriter.name("icons");
        this.listOfStringAdapter.toJson(jsonWriter, appMetaData.getIcons());
        jsonWriter.name("name");
        this.stringAdapter.toJson(jsonWriter, appMetaData.getName());
        jsonWriter.name("redirect");
        this.nullableRedirectAdapter.toJson(jsonWriter, appMetaData.getRedirect());
        jsonWriter.name("verifyUrl");
        this.nullableStringAdapter.toJson(jsonWriter, appMetaData.getVerifyUrl());
        jsonWriter.endObject();
    }
}
