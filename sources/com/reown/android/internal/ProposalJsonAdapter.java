package com.reown.android.internal;

import com.reown.android.internal.Proposal;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import java.io.IOException;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import o.yEE;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final class ProposalJsonAdapter extends JsonAdapter<Proposal> {
    public final JsonAdapter<List<String>> listOfStringAdapter;
    public final JsonAdapter<List<Proposal.Extension>> nullableListOfExtensionAdapter;
    public final JsonReader.Options options;

    public ProposalJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "");
        JsonReader.Options optionsOf = JsonReader.Options.of("chains", "methods", "events", "extension");
        Intrinsics.checkNotNullExpressionValue(optionsOf, "");
        this.options = optionsOf;
        JsonAdapter<List<String>> jsonAdapterAdapter = moshi.adapter(Types.newParameterizedType(List.class, String.class), yEE.copydefault(), "chains");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter, "");
        this.listOfStringAdapter = jsonAdapterAdapter;
        JsonAdapter<List<Proposal.Extension>> jsonAdapterAdapter2 = moshi.adapter(Types.newParameterizedType(List.class, Proposal.Extension.class), yEE.copydefault(), "extensions");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter2, "");
        this.nullableListOfExtensionAdapter = jsonAdapterAdapter2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(30);
        sb.append("GeneratedJsonAdapter(");
        sb.append("Proposal");
        sb.append(')');
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    /* JADX DEBUG: Method merged with bridge method: fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object; */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.JsonAdapter
    public Proposal fromJson(@NotNull JsonReader jsonReader) throws IOException {
        Intrinsics.checkNotNullParameter(jsonReader, "");
        jsonReader.beginObject();
        List<String> listFromJson = null;
        List<String> listFromJson2 = null;
        List<String> listFromJson3 = null;
        List<Proposal.Extension> listFromJson4 = null;
        while (jsonReader.hasNext()) {
            int iSelectName = jsonReader.selectName(this.options);
            if (iSelectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (iSelectName == 0) {
                listFromJson = this.listOfStringAdapter.fromJson(jsonReader);
                if (listFromJson == null) {
                    JsonDataException jsonDataExceptionUnexpectedNull = Util.unexpectedNull("chains", "chains", jsonReader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull, "");
                    throw jsonDataExceptionUnexpectedNull;
                }
            } else if (iSelectName == 1) {
                listFromJson2 = this.listOfStringAdapter.fromJson(jsonReader);
                if (listFromJson2 == null) {
                    JsonDataException jsonDataExceptionUnexpectedNull2 = Util.unexpectedNull("methods", "methods", jsonReader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull2, "");
                    throw jsonDataExceptionUnexpectedNull2;
                }
            } else if (iSelectName == 2) {
                listFromJson3 = this.listOfStringAdapter.fromJson(jsonReader);
                if (listFromJson3 == null) {
                    JsonDataException jsonDataExceptionUnexpectedNull3 = Util.unexpectedNull("events", "events", jsonReader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull3, "");
                    throw jsonDataExceptionUnexpectedNull3;
                }
            } else if (iSelectName == 3) {
                listFromJson4 = this.nullableListOfExtensionAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        if (listFromJson == null) {
            JsonDataException jsonDataExceptionMissingProperty = Util.missingProperty("chains", "chains", jsonReader);
            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty, "");
            throw jsonDataExceptionMissingProperty;
        }
        if (listFromJson2 == null) {
            JsonDataException jsonDataExceptionMissingProperty2 = Util.missingProperty("methods", "methods", jsonReader);
            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty2, "");
            throw jsonDataExceptionMissingProperty2;
        }
        if (listFromJson3 != null) {
            return new Proposal(listFromJson, listFromJson2, listFromJson3, listFromJson4);
        }
        JsonDataException jsonDataExceptionMissingProperty3 = Util.missingProperty("events", "events", jsonReader);
        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty3, "");
        throw jsonDataExceptionMissingProperty3;
    }

    /* JADX DEBUG: Method merged with bridge method: toJson(Lcom/squareup/moshi/JsonWriter;Ljava/lang/Object;)V */
    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(@NotNull JsonWriter jsonWriter, Proposal proposal) throws IOException {
        Intrinsics.checkNotNullParameter(jsonWriter, "");
        if (proposal == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        jsonWriter.beginObject();
        jsonWriter.name("chains");
        this.listOfStringAdapter.toJson(jsonWriter, proposal.getChains());
        jsonWriter.name("methods");
        this.listOfStringAdapter.toJson(jsonWriter, proposal.getMethods());
        jsonWriter.name("events");
        this.listOfStringAdapter.toJson(jsonWriter, proposal.getEvents());
        jsonWriter.name("extension");
        this.nullableListOfExtensionAdapter.toJson(jsonWriter, proposal.getExtensions());
        jsonWriter.endObject();
    }
}
