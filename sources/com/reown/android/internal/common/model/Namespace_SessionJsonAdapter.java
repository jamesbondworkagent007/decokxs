package com.reown.android.internal.common.model;

import com.reown.android.internal.common.model.Namespace;
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
public final class Namespace_SessionJsonAdapter extends JsonAdapter<Namespace.Session> {
    public volatile Constructor<Namespace.Session> constructorRef;
    public final JsonAdapter<List<String>> listOfStringAdapter;
    public final JsonAdapter<List<String>> nullableListOfStringAdapter;
    public final JsonReader.Options options;

    public Namespace_SessionJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "");
        JsonReader.Options optionsOf = JsonReader.Options.of("chains", "accounts", "methods", "events");
        Intrinsics.checkNotNullExpressionValue(optionsOf, "");
        this.options = optionsOf;
        JsonAdapter<List<String>> jsonAdapterAdapter = moshi.adapter(Types.newParameterizedType(List.class, String.class), yEE.copydefault(), "chains");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter, "");
        this.nullableListOfStringAdapter = jsonAdapterAdapter;
        JsonAdapter<List<String>> jsonAdapterAdapter2 = moshi.adapter(Types.newParameterizedType(List.class, String.class), yEE.copydefault(), "accounts");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter2, "");
        this.listOfStringAdapter = jsonAdapterAdapter2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(39);
        sb.append("GeneratedJsonAdapter(");
        sb.append("Namespace.Session");
        sb.append(')');
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    /* JADX DEBUG: Method merged with bridge method: fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object; */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.JsonAdapter
    public Namespace.Session fromJson(@NotNull JsonReader jsonReader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, InvocationTargetException {
        Intrinsics.checkNotNullParameter(jsonReader, "");
        jsonReader.beginObject();
        List<String> listFromJson = null;
        List<String> listFromJson2 = null;
        List<String> listFromJson3 = null;
        List<String> listFromJson4 = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int iSelectName = jsonReader.selectName(this.options);
            if (iSelectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (iSelectName == 0) {
                listFromJson = this.nullableListOfStringAdapter.fromJson(jsonReader);
                i = -2;
            } else if (iSelectName == 1) {
                listFromJson2 = this.listOfStringAdapter.fromJson(jsonReader);
                if (listFromJson2 == null) {
                    JsonDataException jsonDataExceptionUnexpectedNull = Util.unexpectedNull("accounts", "accounts", jsonReader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull, "");
                    throw jsonDataExceptionUnexpectedNull;
                }
            } else if (iSelectName == 2) {
                listFromJson3 = this.listOfStringAdapter.fromJson(jsonReader);
                if (listFromJson3 == null) {
                    JsonDataException jsonDataExceptionUnexpectedNull2 = Util.unexpectedNull("methods", "methods", jsonReader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull2, "");
                    throw jsonDataExceptionUnexpectedNull2;
                }
            } else if (iSelectName == 3 && (listFromJson4 = this.listOfStringAdapter.fromJson(jsonReader)) == null) {
                JsonDataException jsonDataExceptionUnexpectedNull3 = Util.unexpectedNull("events", "events", jsonReader);
                Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull3, "");
                throw jsonDataExceptionUnexpectedNull3;
            }
        }
        jsonReader.endObject();
        if (i == -2) {
            if (listFromJson2 == null) {
                JsonDataException jsonDataExceptionMissingProperty = Util.missingProperty("accounts", "accounts", jsonReader);
                Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty, "");
                throw jsonDataExceptionMissingProperty;
            }
            if (listFromJson3 == null) {
                JsonDataException jsonDataExceptionMissingProperty2 = Util.missingProperty("methods", "methods", jsonReader);
                Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty2, "");
                throw jsonDataExceptionMissingProperty2;
            }
            if (listFromJson4 != null) {
                return new Namespace.Session(listFromJson, listFromJson2, listFromJson3, listFromJson4);
            }
            JsonDataException jsonDataExceptionMissingProperty3 = Util.missingProperty("events", "events", jsonReader);
            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty3, "");
            throw jsonDataExceptionMissingProperty3;
        }
        Constructor<Namespace.Session> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            declaredConstructor = Namespace.Session.class.getDeclaredConstructor(List.class, List.class, List.class, List.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = declaredConstructor;
            Intrinsics.checkNotNullExpressionValue(declaredConstructor, "");
        }
        if (listFromJson2 == null) {
            JsonDataException jsonDataExceptionMissingProperty4 = Util.missingProperty("accounts", "accounts", jsonReader);
            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty4, "");
            throw jsonDataExceptionMissingProperty4;
        }
        if (listFromJson3 == null) {
            JsonDataException jsonDataExceptionMissingProperty5 = Util.missingProperty("methods", "methods", jsonReader);
            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty5, "");
            throw jsonDataExceptionMissingProperty5;
        }
        if (listFromJson4 != null) {
            Namespace.Session sessionNewInstance = declaredConstructor.newInstance(listFromJson, listFromJson2, listFromJson3, listFromJson4, Integer.valueOf(i), null);
            Intrinsics.checkNotNullExpressionValue(sessionNewInstance, "");
            return sessionNewInstance;
        }
        JsonDataException jsonDataExceptionMissingProperty6 = Util.missingProperty("events", "events", jsonReader);
        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty6, "");
        throw jsonDataExceptionMissingProperty6;
    }

    /* JADX DEBUG: Method merged with bridge method: toJson(Lcom/squareup/moshi/JsonWriter;Ljava/lang/Object;)V */
    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(@NotNull JsonWriter jsonWriter, Namespace.Session session) throws IOException {
        Intrinsics.checkNotNullParameter(jsonWriter, "");
        if (session == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        jsonWriter.beginObject();
        jsonWriter.name("chains");
        this.nullableListOfStringAdapter.toJson(jsonWriter, session.getChains());
        jsonWriter.name("accounts");
        this.listOfStringAdapter.toJson(jsonWriter, session.getAccounts());
        jsonWriter.name("methods");
        this.listOfStringAdapter.toJson(jsonWriter, session.getMethods());
        jsonWriter.name("events");
        this.listOfStringAdapter.toJson(jsonWriter, session.getEvents());
        jsonWriter.endObject();
    }
}
