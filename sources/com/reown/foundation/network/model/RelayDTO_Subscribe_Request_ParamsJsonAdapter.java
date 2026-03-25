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
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final class RelayDTO_Subscribe_Request_ParamsJsonAdapter extends JsonAdapter<RelayDTO.Subscribe.Request.Params> {
    private final JsonReader.Options options;
    private final JsonAdapter<Topic> topicAtQualifierAdapter;

    public RelayDTO_Subscribe_Request_ParamsJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "");
        JsonReader.Options optionsOf = JsonReader.Options.of(PushMessagingService.KEY_TOPIC);
        Intrinsics.checkNotNullExpressionValue(optionsOf, "");
        this.options = optionsOf;
        JsonAdapter<Topic> jsonAdapterAdapter = moshi.adapter(Topic.class, yED.AEQbTJ(new TopicAdapter.Qualifier() { // from class: com.reown.foundation.network.model.RelayDTO_Subscribe_Request_ParamsJsonAdapter$annotationImpl$com_reown_foundation_common_adapters_TopicAdapter_Qualifier$0
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
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(55);
        sb.append("GeneratedJsonAdapter(");
        sb.append("RelayDTO.Subscribe.Request.Params");
        sb.append(')');
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    /* JADX DEBUG: Method merged with bridge method: fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object; */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.JsonAdapter
    public RelayDTO.Subscribe.Request.Params fromJson(@NotNull JsonReader jsonReader) throws IOException {
        Intrinsics.checkNotNullParameter(jsonReader, "");
        jsonReader.beginObject();
        Topic topicFromJson = null;
        while (jsonReader.hasNext()) {
            int iSelectName = jsonReader.selectName(this.options);
            if (iSelectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (iSelectName == 0 && (topicFromJson = this.topicAtQualifierAdapter.fromJson(jsonReader)) == null) {
                JsonDataException jsonDataExceptionUnexpectedNull = Util.unexpectedNull(PushMessagingService.KEY_TOPIC, PushMessagingService.KEY_TOPIC, jsonReader);
                Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull, "");
                throw jsonDataExceptionUnexpectedNull;
            }
        }
        jsonReader.endObject();
        if (topicFromJson != null) {
            return new RelayDTO.Subscribe.Request.Params(topicFromJson);
        }
        JsonDataException jsonDataExceptionMissingProperty = Util.missingProperty(PushMessagingService.KEY_TOPIC, PushMessagingService.KEY_TOPIC, jsonReader);
        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty, "");
        throw jsonDataExceptionMissingProperty;
    }

    /* JADX DEBUG: Method merged with bridge method: toJson(Lcom/squareup/moshi/JsonWriter;Ljava/lang/Object;)V */
    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(@NotNull JsonWriter jsonWriter, RelayDTO.Subscribe.Request.Params params) throws IOException {
        Intrinsics.checkNotNullParameter(jsonWriter, "");
        if (params == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        jsonWriter.beginObject();
        jsonWriter.name(PushMessagingService.KEY_TOPIC);
        this.topicAtQualifierAdapter.toJson(jsonWriter, params.getTopic());
        jsonWriter.endObject();
    }
}
