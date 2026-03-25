package com.reown.foundation.network.model;

import com.huawei.hms.push.constant.RemoteMessageConst;
import com.reown.android.push.notifications.PushMessagingService;
import com.reown.foundation.common.adapters.TopicAdapter;
import com.reown.foundation.common.adapters.TtlAdapter;
import com.reown.foundation.common.model.Topic;
import com.reown.foundation.common.model.Ttl;
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
public final class RelayDTO_Publish_Request_ParamsJsonAdapter extends JsonAdapter<RelayDTO.Publish.Request.Params> {
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<Boolean> nullableBooleanAdapter;
    private final JsonReader.Options options;
    private final JsonAdapter<String> stringAdapter;
    private final JsonAdapter<Topic> topicAtQualifierAdapter;
    private final JsonAdapter<Ttl> ttlAtQualifierAdapter;

    public RelayDTO_Publish_Request_ParamsJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "");
        JsonReader.Options optionsOf = JsonReader.Options.of(PushMessagingService.KEY_TOPIC, "message", RemoteMessageConst.TTL, "tag", "prompt");
        Intrinsics.checkNotNullExpressionValue(optionsOf, "");
        this.options = optionsOf;
        JsonAdapter<Topic> jsonAdapterAdapter = moshi.adapter(Topic.class, yED.AEQbTJ(new TopicAdapter.Qualifier() { // from class: com.reown.foundation.network.model.RelayDTO_Publish_Request_ParamsJsonAdapter$annotationImpl$com_reown_foundation_common_adapters_TopicAdapter_Qualifier$0
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
        JsonAdapter<Ttl> jsonAdapterAdapter3 = moshi.adapter(Ttl.class, yED.AEQbTJ(new TtlAdapter.Qualifier() { // from class: com.reown.foundation.network.model.RelayDTO_Publish_Request_ParamsJsonAdapter$annotationImpl$com_reown_foundation_common_adapters_TtlAdapter_Qualifier$0
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.annotation.Annotation
            public final /* synthetic */ Class annotationType() {
                return TtlAdapter.Qualifier.class;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.annotation.Annotation
            public final boolean equals(Object obj) {
                if (!(obj instanceof TtlAdapter.Qualifier)) {
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
                return "@com.reown.foundation.common.adapters.TtlAdapter.Qualifier()";
            }
        }), RemoteMessageConst.TTL);
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter3, "");
        this.ttlAtQualifierAdapter = jsonAdapterAdapter3;
        JsonAdapter<Integer> jsonAdapterAdapter4 = moshi.adapter(Integer.TYPE, yEE.copydefault(), "tag");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter4, "");
        this.intAdapter = jsonAdapterAdapter4;
        JsonAdapter<Boolean> jsonAdapterAdapter5 = moshi.adapter(Boolean.class, yEE.copydefault(), "prompt");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter5, "");
        this.nullableBooleanAdapter = jsonAdapterAdapter5;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(53);
        sb.append("GeneratedJsonAdapter(");
        sb.append("RelayDTO.Publish.Request.Params");
        sb.append(')');
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    /* JADX DEBUG: Method merged with bridge method: fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object; */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.JsonAdapter
    public RelayDTO.Publish.Request.Params fromJson(@NotNull JsonReader jsonReader) throws IOException {
        Intrinsics.checkNotNullParameter(jsonReader, "");
        jsonReader.beginObject();
        Integer numFromJson = null;
        Topic topicFromJson = null;
        String strFromJson = null;
        Ttl ttlFromJson = null;
        Boolean boolFromJson = null;
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
                ttlFromJson = this.ttlAtQualifierAdapter.fromJson(jsonReader);
                if (ttlFromJson == null) {
                    JsonDataException jsonDataExceptionUnexpectedNull3 = Util.unexpectedNull(RemoteMessageConst.TTL, RemoteMessageConst.TTL, jsonReader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull3, "");
                    throw jsonDataExceptionUnexpectedNull3;
                }
            } else if (iSelectName == 3) {
                numFromJson = this.intAdapter.fromJson(jsonReader);
                if (numFromJson == null) {
                    JsonDataException jsonDataExceptionUnexpectedNull4 = Util.unexpectedNull("tag", "tag", jsonReader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull4, "");
                    throw jsonDataExceptionUnexpectedNull4;
                }
            } else if (iSelectName == 4) {
                boolFromJson = this.nullableBooleanAdapter.fromJson(jsonReader);
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
        if (ttlFromJson == null) {
            JsonDataException jsonDataExceptionMissingProperty3 = Util.missingProperty(RemoteMessageConst.TTL, RemoteMessageConst.TTL, jsonReader);
            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty3, "");
            throw jsonDataExceptionMissingProperty3;
        }
        if (numFromJson != null) {
            return new RelayDTO.Publish.Request.Params(topicFromJson, strFromJson, ttlFromJson, numFromJson.intValue(), boolFromJson);
        }
        JsonDataException jsonDataExceptionMissingProperty4 = Util.missingProperty("tag", "tag", jsonReader);
        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty4, "");
        throw jsonDataExceptionMissingProperty4;
    }

    /* JADX DEBUG: Method merged with bridge method: toJson(Lcom/squareup/moshi/JsonWriter;Ljava/lang/Object;)V */
    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(@NotNull JsonWriter jsonWriter, RelayDTO.Publish.Request.Params params) throws IOException {
        Intrinsics.checkNotNullParameter(jsonWriter, "");
        if (params == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        jsonWriter.beginObject();
        jsonWriter.name(PushMessagingService.KEY_TOPIC);
        this.topicAtQualifierAdapter.toJson(jsonWriter, params.getTopic());
        jsonWriter.name("message");
        this.stringAdapter.toJson(jsonWriter, params.getMessage());
        jsonWriter.name(RemoteMessageConst.TTL);
        this.ttlAtQualifierAdapter.toJson(jsonWriter, params.getTtl());
        jsonWriter.name("tag");
        this.intAdapter.toJson(jsonWriter, Integer.valueOf(params.getTag()));
        jsonWriter.name("prompt");
        this.nullableBooleanAdapter.toJson(jsonWriter, params.getPrompt());
        jsonWriter.endObject();
    }
}
