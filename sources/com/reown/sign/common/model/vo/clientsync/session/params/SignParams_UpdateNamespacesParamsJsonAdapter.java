package com.reown.sign.common.model.vo.clientsync.session.params;

import com.reown.android.internal.common.model.Namespace;
import com.reown.sign.common.model.vo.clientsync.session.params.SignParams;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import java.io.IOException;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import o.yEE;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final class SignParams_UpdateNamespacesParamsJsonAdapter extends JsonAdapter<SignParams.UpdateNamespacesParams> {
    public final JsonAdapter<Map<String, Namespace.Session>> mapOfStringSessionAdapter;
    public final JsonReader.Options options;

    public SignParams_UpdateNamespacesParamsJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "");
        JsonReader.Options optionsOf = JsonReader.Options.of("namespaces");
        Intrinsics.checkNotNullExpressionValue(optionsOf, "");
        this.options = optionsOf;
        JsonAdapter<Map<String, Namespace.Session>> jsonAdapterAdapter = moshi.adapter(Types.newParameterizedType(Map.class, String.class, Namespace.Session.class), yEE.copydefault(), "namespaces");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter, "");
        this.mapOfStringSessionAdapter = jsonAdapterAdapter;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(55);
        sb.append("GeneratedJsonAdapter(");
        sb.append("SignParams.UpdateNamespacesParams");
        sb.append(')');
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    /* JADX DEBUG: Method merged with bridge method: fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object; */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.JsonAdapter
    public SignParams.UpdateNamespacesParams fromJson(@NotNull JsonReader jsonReader) throws IOException {
        Intrinsics.checkNotNullParameter(jsonReader, "");
        jsonReader.beginObject();
        Map<String, Namespace.Session> mapFromJson = null;
        while (jsonReader.hasNext()) {
            int iSelectName = jsonReader.selectName(this.options);
            if (iSelectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (iSelectName == 0 && (mapFromJson = this.mapOfStringSessionAdapter.fromJson(jsonReader)) == null) {
                JsonDataException jsonDataExceptionUnexpectedNull = Util.unexpectedNull("namespaces", "namespaces", jsonReader);
                Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull, "");
                throw jsonDataExceptionUnexpectedNull;
            }
        }
        jsonReader.endObject();
        if (mapFromJson != null) {
            return new SignParams.UpdateNamespacesParams(mapFromJson);
        }
        JsonDataException jsonDataExceptionMissingProperty = Util.missingProperty("namespaces", "namespaces", jsonReader);
        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty, "");
        throw jsonDataExceptionMissingProperty;
    }

    /* JADX DEBUG: Method merged with bridge method: toJson(Lcom/squareup/moshi/JsonWriter;Ljava/lang/Object;)V */
    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(@NotNull JsonWriter jsonWriter, SignParams.UpdateNamespacesParams updateNamespacesParams) throws IOException {
        Intrinsics.checkNotNullParameter(jsonWriter, "");
        if (updateNamespacesParams == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        jsonWriter.beginObject();
        jsonWriter.name("namespaces");
        this.mapOfStringSessionAdapter.toJson(jsonWriter, updateNamespacesParams.getNamespaces());
        jsonWriter.endObject();
    }
}
