package com.reown.android.keyserver.model;

import com.reown.android.internal.common.signing.cacao.Cacao;
import com.reown.android.keyserver.model.KeyServerBody;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import o.yEE;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final class KeyServerBody_RegisterIdentityJsonAdapter extends JsonAdapter<KeyServerBody.RegisterIdentity> {
    public final JsonAdapter<Cacao> cacaoAdapter;
    public final JsonReader.Options options;

    public KeyServerBody_RegisterIdentityJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "");
        JsonReader.Options optionsOf = JsonReader.Options.of("cacao");
        Intrinsics.checkNotNullExpressionValue(optionsOf, "");
        this.options = optionsOf;
        JsonAdapter<Cacao> jsonAdapterAdapter = moshi.adapter(Cacao.class, yEE.copydefault(), "cacao");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter, "");
        this.cacaoAdapter = jsonAdapterAdapter;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(52);
        sb.append("GeneratedJsonAdapter(");
        sb.append("KeyServerBody.RegisterIdentity");
        sb.append(')');
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    /* JADX DEBUG: Method merged with bridge method: fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object; */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.JsonAdapter
    public KeyServerBody.RegisterIdentity fromJson(@NotNull JsonReader jsonReader) throws IOException {
        Intrinsics.checkNotNullParameter(jsonReader, "");
        jsonReader.beginObject();
        Cacao cacaoFromJson = null;
        while (jsonReader.hasNext()) {
            int iSelectName = jsonReader.selectName(this.options);
            if (iSelectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (iSelectName == 0 && (cacaoFromJson = this.cacaoAdapter.fromJson(jsonReader)) == null) {
                JsonDataException jsonDataExceptionUnexpectedNull = Util.unexpectedNull("cacao", "cacao", jsonReader);
                Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull, "");
                throw jsonDataExceptionUnexpectedNull;
            }
        }
        jsonReader.endObject();
        if (cacaoFromJson != null) {
            return new KeyServerBody.RegisterIdentity(cacaoFromJson);
        }
        JsonDataException jsonDataExceptionMissingProperty = Util.missingProperty("cacao", "cacao", jsonReader);
        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty, "");
        throw jsonDataExceptionMissingProperty;
    }

    /* JADX DEBUG: Method merged with bridge method: toJson(Lcom/squareup/moshi/JsonWriter;Ljava/lang/Object;)V */
    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(@NotNull JsonWriter jsonWriter, KeyServerBody.RegisterIdentity registerIdentity) throws IOException {
        Intrinsics.checkNotNullParameter(jsonWriter, "");
        if (registerIdentity == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        jsonWriter.beginObject();
        jsonWriter.name("cacao");
        this.cacaoAdapter.toJson(jsonWriter, registerIdentity.getCacao());
        jsonWriter.endObject();
    }
}
