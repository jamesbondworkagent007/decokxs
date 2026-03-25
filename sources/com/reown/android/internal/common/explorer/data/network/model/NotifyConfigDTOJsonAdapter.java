package com.reown.android.internal.common.explorer.data.network.model;

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
public final class NotifyConfigDTOJsonAdapter extends JsonAdapter<NotifyConfigDTO> {
    public final JsonAdapter<NotifyConfigDataDTO> notifyConfigDataDTOAdapter;
    public final JsonReader.Options options;

    public NotifyConfigDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "");
        JsonReader.Options optionsOf = JsonReader.Options.of("data");
        Intrinsics.checkNotNullExpressionValue(optionsOf, "");
        this.options = optionsOf;
        JsonAdapter<NotifyConfigDataDTO> jsonAdapterAdapter = moshi.adapter(NotifyConfigDataDTO.class, yEE.copydefault(), "data");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter, "");
        this.notifyConfigDataDTOAdapter = jsonAdapterAdapter;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(37);
        sb.append("GeneratedJsonAdapter(");
        sb.append("NotifyConfigDTO");
        sb.append(')');
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    /* JADX DEBUG: Method merged with bridge method: fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object; */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.JsonAdapter
    public NotifyConfigDTO fromJson(@NotNull JsonReader jsonReader) throws IOException {
        Intrinsics.checkNotNullParameter(jsonReader, "");
        jsonReader.beginObject();
        NotifyConfigDataDTO notifyConfigDataDTOFromJson = null;
        while (jsonReader.hasNext()) {
            int iSelectName = jsonReader.selectName(this.options);
            if (iSelectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (iSelectName == 0 && (notifyConfigDataDTOFromJson = this.notifyConfigDataDTOAdapter.fromJson(jsonReader)) == null) {
                JsonDataException jsonDataExceptionUnexpectedNull = Util.unexpectedNull("data_", "data", jsonReader);
                Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull, "");
                throw jsonDataExceptionUnexpectedNull;
            }
        }
        jsonReader.endObject();
        if (notifyConfigDataDTOFromJson != null) {
            return new NotifyConfigDTO(notifyConfigDataDTOFromJson);
        }
        JsonDataException jsonDataExceptionMissingProperty = Util.missingProperty("data_", "data", jsonReader);
        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty, "");
        throw jsonDataExceptionMissingProperty;
    }

    /* JADX DEBUG: Method merged with bridge method: toJson(Lcom/squareup/moshi/JsonWriter;Ljava/lang/Object;)V */
    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(@NotNull JsonWriter jsonWriter, NotifyConfigDTO notifyConfigDTO) throws IOException {
        Intrinsics.checkNotNullParameter(jsonWriter, "");
        if (notifyConfigDTO == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        jsonWriter.beginObject();
        jsonWriter.name("data");
        this.notifyConfigDataDTOAdapter.toJson(jsonWriter, notifyConfigDTO.getData());
        jsonWriter.endObject();
    }
}
