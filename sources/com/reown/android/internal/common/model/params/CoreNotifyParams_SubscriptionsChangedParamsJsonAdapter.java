package com.reown.android.internal.common.model.params;

import com.reown.android.internal.common.model.params.CoreNotifyParams;
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
public final class CoreNotifyParams_SubscriptionsChangedParamsJsonAdapter extends JsonAdapter<CoreNotifyParams.SubscriptionsChangedParams> {
    public final JsonReader.Options options;
    public final JsonAdapter<String> stringAdapter;

    public CoreNotifyParams_SubscriptionsChangedParamsJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "");
        JsonReader.Options optionsOf = JsonReader.Options.of("subscriptionsChangedAuth");
        Intrinsics.checkNotNullExpressionValue(optionsOf, "");
        this.options = optionsOf;
        JsonAdapter<String> jsonAdapterAdapter = moshi.adapter(String.class, yEE.copydefault(), "subscriptionsChangedAuth");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter, "");
        this.stringAdapter = jsonAdapterAdapter;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(65);
        sb.append("GeneratedJsonAdapter(");
        sb.append("CoreNotifyParams.SubscriptionsChangedParams");
        sb.append(')');
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    /* JADX DEBUG: Method merged with bridge method: fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object; */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.JsonAdapter
    public CoreNotifyParams.SubscriptionsChangedParams fromJson(@NotNull JsonReader jsonReader) throws IOException {
        Intrinsics.checkNotNullParameter(jsonReader, "");
        jsonReader.beginObject();
        String strFromJson = null;
        while (jsonReader.hasNext()) {
            int iSelectName = jsonReader.selectName(this.options);
            if (iSelectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (iSelectName == 0 && (strFromJson = this.stringAdapter.fromJson(jsonReader)) == null) {
                JsonDataException jsonDataExceptionUnexpectedNull = Util.unexpectedNull("subscriptionsChangedAuth", "subscriptionsChangedAuth", jsonReader);
                Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull, "");
                throw jsonDataExceptionUnexpectedNull;
            }
        }
        jsonReader.endObject();
        if (strFromJson != null) {
            return new CoreNotifyParams.SubscriptionsChangedParams(strFromJson);
        }
        JsonDataException jsonDataExceptionMissingProperty = Util.missingProperty("subscriptionsChangedAuth", "subscriptionsChangedAuth", jsonReader);
        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty, "");
        throw jsonDataExceptionMissingProperty;
    }

    /* JADX DEBUG: Method merged with bridge method: toJson(Lcom/squareup/moshi/JsonWriter;Ljava/lang/Object;)V */
    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(@NotNull JsonWriter jsonWriter, CoreNotifyParams.SubscriptionsChangedParams subscriptionsChangedParams) throws IOException {
        Intrinsics.checkNotNullParameter(jsonWriter, "");
        if (subscriptionsChangedParams == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        jsonWriter.beginObject();
        jsonWriter.name("subscriptionsChangedAuth");
        this.stringAdapter.toJson(jsonWriter, subscriptionsChangedParams.getSubscriptionsChangedAuth());
        jsonWriter.endObject();
    }
}
