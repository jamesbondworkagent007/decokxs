package com.reown.foundation.network.model;

import com.reown.android.push.notifications.PushMessagingService;
import com.reown.foundation.common.adapters.SubscriptionIdAdapter;
import com.reown.foundation.common.adapters.TopicAdapter;
import com.reown.foundation.common.model.SubscriptionId;
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
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final class RelayDTO_Unsubscribe_Request_ParamsJsonAdapter extends JsonAdapter<RelayDTO.Unsubscribe.Request.Params> {
    private final JsonReader.Options options;
    private final JsonAdapter<SubscriptionId> subscriptionIdAtQualifierAdapter;
    private final JsonAdapter<Topic> topicAtQualifierAdapter;

    public RelayDTO_Unsubscribe_Request_ParamsJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "");
        JsonReader.Options optionsOf = JsonReader.Options.of(PushMessagingService.KEY_TOPIC, "id");
        Intrinsics.checkNotNullExpressionValue(optionsOf, "");
        this.options = optionsOf;
        JsonAdapter<Topic> jsonAdapterAdapter = moshi.adapter(Topic.class, yED.AEQbTJ(new TopicAdapter.Qualifier() { // from class: com.reown.foundation.network.model.RelayDTO_Unsubscribe_Request_ParamsJsonAdapter$annotationImpl$com_reown_foundation_common_adapters_TopicAdapter_Qualifier$0
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
        JsonAdapter<SubscriptionId> jsonAdapterAdapter2 = moshi.adapter(SubscriptionId.class, yED.AEQbTJ(new SubscriptionIdAdapter.Qualifier() { // from class: com.reown.foundation.network.model.RelayDTO_Unsubscribe_Request_ParamsJsonAdapter$annotationImpl$com_reown_foundation_common_adapters_SubscriptionIdAdapter_Qualifier$0
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
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter2, "");
        this.subscriptionIdAtQualifierAdapter = jsonAdapterAdapter2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(57);
        sb.append("GeneratedJsonAdapter(");
        sb.append("RelayDTO.Unsubscribe.Request.Params");
        sb.append(')');
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    /* JADX DEBUG: Method merged with bridge method: fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object; */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.JsonAdapter
    public RelayDTO.Unsubscribe.Request.Params fromJson(@NotNull JsonReader jsonReader) throws IOException {
        Intrinsics.checkNotNullParameter(jsonReader, "");
        jsonReader.beginObject();
        Topic topicFromJson = null;
        SubscriptionId subscriptionIdFromJson = null;
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
            } else if (iSelectName == 1 && (subscriptionIdFromJson = this.subscriptionIdAtQualifierAdapter.fromJson(jsonReader)) == null) {
                JsonDataException jsonDataExceptionUnexpectedNull2 = Util.unexpectedNull("subscriptionId", "id", jsonReader);
                Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull2, "");
                throw jsonDataExceptionUnexpectedNull2;
            }
        }
        jsonReader.endObject();
        if (topicFromJson == null) {
            JsonDataException jsonDataExceptionMissingProperty = Util.missingProperty(PushMessagingService.KEY_TOPIC, PushMessagingService.KEY_TOPIC, jsonReader);
            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty, "");
            throw jsonDataExceptionMissingProperty;
        }
        if (subscriptionIdFromJson != null) {
            return new RelayDTO.Unsubscribe.Request.Params(topicFromJson, subscriptionIdFromJson);
        }
        JsonDataException jsonDataExceptionMissingProperty2 = Util.missingProperty("subscriptionId", "id", jsonReader);
        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty2, "");
        throw jsonDataExceptionMissingProperty2;
    }

    /* JADX DEBUG: Method merged with bridge method: toJson(Lcom/squareup/moshi/JsonWriter;Ljava/lang/Object;)V */
    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(@NotNull JsonWriter jsonWriter, RelayDTO.Unsubscribe.Request.Params params) throws IOException {
        Intrinsics.checkNotNullParameter(jsonWriter, "");
        if (params == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        jsonWriter.beginObject();
        jsonWriter.name(PushMessagingService.KEY_TOPIC);
        this.topicAtQualifierAdapter.toJson(jsonWriter, params.getTopic());
        jsonWriter.name("id");
        this.subscriptionIdAtQualifierAdapter.toJson(jsonWriter, params.getSubscriptionId());
        jsonWriter.endObject();
    }
}
