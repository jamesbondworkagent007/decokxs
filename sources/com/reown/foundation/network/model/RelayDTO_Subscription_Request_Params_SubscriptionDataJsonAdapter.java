package com.reown.foundation.network.model;

import com.reown.android.push.notifications.PushMessagingService;
import com.reown.foundation.common.adapters.TopicAdapter;
import com.reown.foundation.common.model.Topic;
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
public final class RelayDTO_Subscription_Request_Params_SubscriptionDataJsonAdapter extends JsonAdapter<RelayDTO.Subscription.Request.Params.SubscriptionData> {
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<Long> longAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options;
    private final JsonAdapter<String> stringAdapter;
    private final JsonAdapter<Topic> topicAtQualifierAdapter;

    public RelayDTO_Subscription_Request_Params_SubscriptionDataJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "");
        JsonReader.Options optionsOf = JsonReader.Options.of(PushMessagingService.KEY_TOPIC, "message", "publishedAt", "attestation", "tag");
        Intrinsics.checkNotNullExpressionValue(optionsOf, "");
        this.options = optionsOf;
        JsonAdapter<Topic> jsonAdapterAdapter = moshi.adapter(Topic.class, yED.AEQbTJ(new TopicAdapter.Qualifier() { // from class: com.reown.foundation.network.model.RelayDTO_Subscription_Request_Params_SubscriptionDataJsonAdapter$annotationImpl$com_reown_foundation_common_adapters_TopicAdapter_Qualifier$0
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.annotation.Annotation
            public final /* synthetic */ Class annotationType() {
                return TopicAdapter.Qualifier.class;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.annotation.Annotation
            public final boolean equals(Object obj) {
                if (!(obj instanceof TopicAdapter.Qualifier)) {
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
                return "@com.reown.foundation.common.adapters.TopicAdapter.Qualifier()";
            }
        }), PushMessagingService.KEY_TOPIC);
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter, "");
        this.topicAtQualifierAdapter = jsonAdapterAdapter;
        JsonAdapter<String> jsonAdapterAdapter2 = moshi.adapter(String.class, yEE.copydefault(), "message");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter2, "");
        this.stringAdapter = jsonAdapterAdapter2;
        JsonAdapter<Long> jsonAdapterAdapter3 = moshi.adapter(Long.TYPE, yEE.copydefault(), "publishedAt");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter3, "");
        this.longAdapter = jsonAdapterAdapter3;
        JsonAdapter<String> jsonAdapterAdapter4 = moshi.adapter(String.class, yEE.copydefault(), "attestation");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter4, "");
        this.nullableStringAdapter = jsonAdapterAdapter4;
        JsonAdapter<Integer> jsonAdapterAdapter5 = moshi.adapter(Integer.TYPE, yEE.copydefault(), "tag");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter5, "");
        this.intAdapter = jsonAdapterAdapter5;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(75);
        sb.append("GeneratedJsonAdapter(");
        sb.append("RelayDTO.Subscription.Request.Params.SubscriptionData");
        sb.append(')');
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    /* JADX DEBUG: Method merged with bridge method: fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object; */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.JsonAdapter
    public RelayDTO.Subscription.Request.Params.SubscriptionData fromJson(@NotNull JsonReader jsonReader) throws IOException {
        Intrinsics.checkNotNullParameter(jsonReader, "");
        jsonReader.beginObject();
        Long lFromJson = null;
        Integer numFromJson = null;
        Topic topicFromJson = null;
        String strFromJson = null;
        String strFromJson2 = null;
        while (jsonReader.hasNext()) {
            int iSelectName = jsonReader.selectName(this.options);
            if (iSelectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (iSelectName == 0) {
                topicFromJson = this.topicAtQualifierAdapter.fromJson(jsonReader);
                if (topicFromJson == null) {
                    JsonDataException jsonDataExceptionUnexpectedNull = Util.unexpectedNull(PushMessagingService.KEY_TOPIC, PushMessagingService.KEY_TOPIC, jsonReader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull, "");
                    throw jsonDataExceptionUnexpectedNull;
                }
            } else if (iSelectName == 1) {
                strFromJson = this.stringAdapter.fromJson(jsonReader);
                if (strFromJson == null) {
                    JsonDataException jsonDataExceptionUnexpectedNull2 = Util.unexpectedNull("message", "message", jsonReader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull2, "");
                    throw jsonDataExceptionUnexpectedNull2;
                }
            } else if (iSelectName == 2) {
                lFromJson = this.longAdapter.fromJson(jsonReader);
                if (lFromJson == null) {
                    JsonDataException jsonDataExceptionUnexpectedNull3 = Util.unexpectedNull("publishedAt", "publishedAt", jsonReader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull3, "");
                    throw jsonDataExceptionUnexpectedNull3;
                }
            } else if (iSelectName == 3) {
                strFromJson2 = this.nullableStringAdapter.fromJson(jsonReader);
            } else if (iSelectName == 4 && (numFromJson = this.intAdapter.fromJson(jsonReader)) == null) {
                JsonDataException jsonDataExceptionUnexpectedNull4 = Util.unexpectedNull("tag", "tag", jsonReader);
                Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull4, "");
                throw jsonDataExceptionUnexpectedNull4;
            }
        }
        jsonReader.endObject();
        if (topicFromJson == null) {
            JsonDataException jsonDataExceptionMissingProperty = Util.missingProperty(PushMessagingService.KEY_TOPIC, PushMessagingService.KEY_TOPIC, jsonReader);
            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty, "");
            throw jsonDataExceptionMissingProperty;
        }
        if (strFromJson == null) {
            JsonDataException jsonDataExceptionMissingProperty2 = Util.missingProperty("message", "message", jsonReader);
            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty2, "");
            throw jsonDataExceptionMissingProperty2;
        }
        if (lFromJson != null) {
            long jLongValue = lFromJson.longValue();
            if (numFromJson != null) {
                return new RelayDTO.Subscription.Request.Params.SubscriptionData(topicFromJson, strFromJson, jLongValue, strFromJson2, numFromJson.intValue());
            }
            JsonDataException jsonDataExceptionMissingProperty3 = Util.missingProperty("tag", "tag", jsonReader);
            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty3, "");
            throw jsonDataExceptionMissingProperty3;
        }
        JsonDataException jsonDataExceptionMissingProperty4 = Util.missingProperty("publishedAt", "publishedAt", jsonReader);
        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty4, "");
        throw jsonDataExceptionMissingProperty4;
    }

    /* JADX DEBUG: Method merged with bridge method: toJson(Lcom/squareup/moshi/JsonWriter;Ljava/lang/Object;)V */
    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(@NotNull JsonWriter jsonWriter, RelayDTO.Subscription.Request.Params.SubscriptionData subscriptionData) throws IOException {
        Intrinsics.checkNotNullParameter(jsonWriter, "");
        if (subscriptionData == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        jsonWriter.beginObject();
        jsonWriter.name(PushMessagingService.KEY_TOPIC);
        this.topicAtQualifierAdapter.toJson(jsonWriter, subscriptionData.getTopic());
        jsonWriter.name("message");
        this.stringAdapter.toJson(jsonWriter, subscriptionData.getMessage());
        jsonWriter.name("publishedAt");
        this.longAdapter.toJson(jsonWriter, Long.valueOf(subscriptionData.getPublishedAt()));
        jsonWriter.name("attestation");
        this.nullableStringAdapter.toJson(jsonWriter, subscriptionData.getAttestation());
        jsonWriter.name("tag");
        this.intAdapter.toJson(jsonWriter, Integer.valueOf(subscriptionData.getTag()));
        jsonWriter.endObject();
    }
}
