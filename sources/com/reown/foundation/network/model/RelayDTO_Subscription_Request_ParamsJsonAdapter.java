package com.reown.foundation.network.model;

import com.reown.foundation.common.adapters.SubscriptionIdAdapter;
import com.reown.foundation.common.model.SubscriptionId;
import com.reown.foundation.network.model.RelayDTO;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import o.yED;
import o.yEE;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final class RelayDTO_Subscription_Request_ParamsJsonAdapter extends JsonAdapter<RelayDTO.Subscription.Request.Params> {
    private final JsonReader.Options options;
    private final JsonAdapter<RelayDTO.Subscription.Request.Params.SubscriptionData> subscriptionDataAdapter;
    private final JsonAdapter<SubscriptionId> subscriptionIdAtQualifierAdapter;

    public RelayDTO_Subscription_Request_ParamsJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "");
        JsonReader.Options optionsOf = JsonReader.Options.of("id", "data");
        Intrinsics.checkNotNullExpressionValue(optionsOf, "");
        this.options = optionsOf;
        JsonAdapter<SubscriptionId> jsonAdapterAdapter = moshi.adapter(SubscriptionId.class, yED.AEQbTJ(new SubscriptionIdAdapter.Qualifier() { // from class: com.reown.foundation.network.model.RelayDTO_Subscription_Request_ParamsJsonAdapter$annotationImpl$com_reown_foundation_common_adapters_SubscriptionIdAdapter_Qualifier$0
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.annotation.Annotation
            public final /* synthetic */ Class annotationType() {
                return SubscriptionIdAdapter.Qualifier.class;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.annotation.Annotation
            public final boolean equals(Object obj) {
                if (!(obj instanceof SubscriptionIdAdapter.Qualifier)) {
                    return false;
                }
                return true;
            }

            @Override // java.lang.annotation.Annotation
            public final int hashCode() {
                return 0;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.annotation.Annotation
            public final String toString() {
                return "@com.reown.foundation.common.adapters.SubscriptionIdAdapter.Qualifier()";
            }
        }), "subscriptionId");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter, "");
        this.subscriptionIdAtQualifierAdapter = jsonAdapterAdapter;
        JsonAdapter<RelayDTO.Subscription.Request.Params.SubscriptionData> jsonAdapterAdapter2 = moshi.adapter(RelayDTO.Subscription.Request.Params.SubscriptionData.class, yEE.copydefault(), "subscriptionData");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter2, "");
        this.subscriptionDataAdapter = jsonAdapterAdapter2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(58);
        sb.append("GeneratedJsonAdapter(");
        sb.append("RelayDTO.Subscription.Request.Params");
        sb.append(')');
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    /* JADX DEBUG: Method merged with bridge method: fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object; */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.JsonAdapter
    public RelayDTO.Subscription.Request.Params fromJson(@NotNull JsonReader jsonReader) throws IOException {
        Intrinsics.checkNotNullParameter(jsonReader, "");
        jsonReader.beginObject();
        SubscriptionId subscriptionIdFromJson = null;
        RelayDTO.Subscription.Request.Params.SubscriptionData subscriptionDataFromJson = null;
        while (jsonReader.hasNext()) {
            int iSelectName = jsonReader.selectName(this.options);
            if (iSelectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (iSelectName == 0) {
                subscriptionIdFromJson = this.subscriptionIdAtQualifierAdapter.fromJson(jsonReader);
                if (subscriptionIdFromJson == null) {
                    JsonDataException jsonDataExceptionUnexpectedNull = Util.unexpectedNull("subscriptionId", "id", jsonReader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull, "");
                    throw jsonDataExceptionUnexpectedNull;
                }
            } else if (iSelectName == 1 && (subscriptionDataFromJson = this.subscriptionDataAdapter.fromJson(jsonReader)) == null) {
                JsonDataException jsonDataExceptionUnexpectedNull2 = Util.unexpectedNull("subscriptionData", "data", jsonReader);
                Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull2, "");
                throw jsonDataExceptionUnexpectedNull2;
            }
        }
        jsonReader.endObject();
        if (subscriptionIdFromJson == null) {
            JsonDataException jsonDataExceptionMissingProperty = Util.missingProperty("subscriptionId", "id", jsonReader);
            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty, "");
            throw jsonDataExceptionMissingProperty;
        }
        if (subscriptionDataFromJson != null) {
            return new RelayDTO.Subscription.Request.Params(subscriptionIdFromJson, subscriptionDataFromJson);
        }
        JsonDataException jsonDataExceptionMissingProperty2 = Util.missingProperty("subscriptionData", "data", jsonReader);
        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty2, "");
        throw jsonDataExceptionMissingProperty2;
    }

    /* JADX DEBUG: Method merged with bridge method: toJson(Lcom/squareup/moshi/JsonWriter;Ljava/lang/Object;)V */
    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(@NotNull JsonWriter jsonWriter, RelayDTO.Subscription.Request.Params params) throws IOException {
        Intrinsics.checkNotNullParameter(jsonWriter, "");
        if (params == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        jsonWriter.beginObject();
        jsonWriter.name("id");
        this.subscriptionIdAtQualifierAdapter.toJson(jsonWriter, params.getSubscriptionId());
        jsonWriter.name("data");
        this.subscriptionDataAdapter.toJson(jsonWriter, params.getSubscriptionData());
        jsonWriter.endObject();
    }
}
