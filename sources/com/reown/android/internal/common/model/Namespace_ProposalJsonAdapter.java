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
public final class Namespace_ProposalJsonAdapter extends JsonAdapter<Namespace.Proposal> {
    public volatile Constructor<Namespace.Proposal> constructorRef;
    public final JsonAdapter<List<String>> listOfStringAdapter;
    public final JsonAdapter<List<String>> nullableListOfStringAdapter;
    public final JsonReader.Options options;

    public Namespace_ProposalJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "");
        JsonReader.Options optionsOf = JsonReader.Options.of("methods", "chains", "events");
        Intrinsics.checkNotNullExpressionValue(optionsOf, "");
        this.options = optionsOf;
        JsonAdapter<List<String>> jsonAdapterAdapter = moshi.adapter(Types.newParameterizedType(List.class, String.class), yEE.copydefault(), "methods");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter, "");
        this.listOfStringAdapter = jsonAdapterAdapter;
        JsonAdapter<List<String>> jsonAdapterAdapter2 = moshi.adapter(Types.newParameterizedType(List.class, String.class), yEE.copydefault(), "chains");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter2, "");
        this.nullableListOfStringAdapter = jsonAdapterAdapter2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(40);
        sb.append("GeneratedJsonAdapter(");
        sb.append("Namespace.Proposal");
        sb.append(')');
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    /* JADX DEBUG: Method merged with bridge method: fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object; */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.JsonAdapter
    public Namespace.Proposal fromJson(@NotNull JsonReader jsonReader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, InvocationTargetException {
        Intrinsics.checkNotNullParameter(jsonReader, "");
        jsonReader.beginObject();
        List<String> listFromJson = null;
        List<String> listFromJson2 = null;
        List<String> listFromJson3 = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int iSelectName = jsonReader.selectName(this.options);
            if (iSelectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (iSelectName == 0) {
                listFromJson = this.listOfStringAdapter.fromJson(jsonReader);
                if (listFromJson == null) {
                    JsonDataException jsonDataExceptionUnexpectedNull = Util.unexpectedNull("methods", "methods", jsonReader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull, "");
                    throw jsonDataExceptionUnexpectedNull;
                }
            } else if (iSelectName == 1) {
                listFromJson3 = this.nullableListOfStringAdapter.fromJson(jsonReader);
                i = -3;
            } else if (iSelectName == 2 && (listFromJson2 = this.listOfStringAdapter.fromJson(jsonReader)) == null) {
                JsonDataException jsonDataExceptionUnexpectedNull2 = Util.unexpectedNull("events", "events", jsonReader);
                Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull2, "");
                throw jsonDataExceptionUnexpectedNull2;
            }
        }
        jsonReader.endObject();
        if (i == -3) {
            if (listFromJson == null) {
                JsonDataException jsonDataExceptionMissingProperty = Util.missingProperty("methods", "methods", jsonReader);
                Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty, "");
                throw jsonDataExceptionMissingProperty;
            }
            if (listFromJson2 != null) {
                return new Namespace.Proposal(listFromJson, listFromJson3, listFromJson2);
            }
            JsonDataException jsonDataExceptionMissingProperty2 = Util.missingProperty("events", "events", jsonReader);
            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty2, "");
            throw jsonDataExceptionMissingProperty2;
        }
        Constructor<Namespace.Proposal> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            declaredConstructor = Namespace.Proposal.class.getDeclaredConstructor(List.class, List.class, List.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = declaredConstructor;
            Intrinsics.checkNotNullExpressionValue(declaredConstructor, "");
        }
        if (listFromJson == null) {
            JsonDataException jsonDataExceptionMissingProperty3 = Util.missingProperty("methods", "methods", jsonReader);
            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty3, "");
            throw jsonDataExceptionMissingProperty3;
        }
        if (listFromJson2 != null) {
            Namespace.Proposal proposalNewInstance = declaredConstructor.newInstance(listFromJson, listFromJson3, listFromJson2, Integer.valueOf(i), null);
            Intrinsics.checkNotNullExpressionValue(proposalNewInstance, "");
            return proposalNewInstance;
        }
        JsonDataException jsonDataExceptionMissingProperty4 = Util.missingProperty("events", "events", jsonReader);
        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty4, "");
        throw jsonDataExceptionMissingProperty4;
    }

    /* JADX DEBUG: Method merged with bridge method: toJson(Lcom/squareup/moshi/JsonWriter;Ljava/lang/Object;)V */
    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(@NotNull JsonWriter jsonWriter, Namespace.Proposal proposal) throws IOException {
        Intrinsics.checkNotNullParameter(jsonWriter, "");
        if (proposal == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        jsonWriter.beginObject();
        jsonWriter.name("methods");
        this.listOfStringAdapter.toJson(jsonWriter, proposal.getMethods());
        jsonWriter.name("chains");
        this.nullableListOfStringAdapter.toJson(jsonWriter, proposal.getChains());
        jsonWriter.name("events");
        this.listOfStringAdapter.toJson(jsonWriter, proposal.getEvents());
        jsonWriter.endObject();
    }
}
