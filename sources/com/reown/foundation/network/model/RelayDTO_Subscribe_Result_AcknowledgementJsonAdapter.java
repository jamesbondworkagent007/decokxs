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
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.Intrinsics;
import o.yED;
import o.yEE;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final class RelayDTO_Subscribe_Result_AcknowledgementJsonAdapter extends JsonAdapter<RelayDTO.Subscribe.Result.Acknowledgement> {
    private volatile Constructor<RelayDTO.Subscribe.Result.Acknowledgement> constructorRef;
    private final JsonAdapter<Long> longAdapter;
    private final JsonReader.Options options;
    private final JsonAdapter<String> stringAdapter;
    private final JsonAdapter<SubscriptionId> subscriptionIdAtQualifierAdapter;

    public RelayDTO_Subscribe_Result_AcknowledgementJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "");
        JsonReader.Options optionsOf = JsonReader.Options.of("id", "jsonrpc", "result");
        Intrinsics.checkNotNullExpressionValue(optionsOf, "");
        this.options = optionsOf;
        JsonAdapter<Long> jsonAdapterAdapter = moshi.adapter(Long.TYPE, yEE.copydefault(), "id");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter, "");
        this.longAdapter = jsonAdapterAdapter;
        JsonAdapter<String> jsonAdapterAdapter2 = moshi.adapter(String.class, yEE.copydefault(), "jsonrpc");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter2, "");
        this.stringAdapter = jsonAdapterAdapter2;
        JsonAdapter<SubscriptionId> jsonAdapterAdapter3 = moshi.adapter(SubscriptionId.class, yED.AEQbTJ(new SubscriptionIdAdapter.Qualifier() { // from class: com.reown.foundation.network.model.RelayDTO_Subscribe_Result_AcknowledgementJsonAdapter$annotationImpl$com_reown_foundation_common_adapters_SubscriptionIdAdapter_Qualifier$0
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
        }), "result");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter3, "");
        this.subscriptionIdAtQualifierAdapter = jsonAdapterAdapter3;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(63);
        sb.append("GeneratedJsonAdapter(");
        sb.append("RelayDTO.Subscribe.Result.Acknowledgement");
        sb.append(')');
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    /* JADX DEBUG: Method merged with bridge method: fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object; */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.JsonAdapter
    public RelayDTO.Subscribe.Result.Acknowledgement fromJson(@NotNull JsonReader jsonReader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, InvocationTargetException {
        Intrinsics.checkNotNullParameter(jsonReader, "");
        jsonReader.beginObject();
        int i = -1;
        Long lFromJson = null;
        String strFromJson = null;
        SubscriptionId subscriptionIdFromJson = null;
        while (jsonReader.hasNext()) {
            int iSelectName = jsonReader.selectName(this.options);
            if (iSelectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (iSelectName == 0) {
                lFromJson = this.longAdapter.fromJson(jsonReader);
                if (lFromJson == null) {
                    JsonDataException jsonDataExceptionUnexpectedNull = Util.unexpectedNull("id", "id", jsonReader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull, "");
                    throw jsonDataExceptionUnexpectedNull;
                }
            } else if (iSelectName == 1) {
                strFromJson = this.stringAdapter.fromJson(jsonReader);
                if (strFromJson == null) {
                    JsonDataException jsonDataExceptionUnexpectedNull2 = Util.unexpectedNull("jsonrpc", "jsonrpc", jsonReader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull2, "");
                    throw jsonDataExceptionUnexpectedNull2;
                }
                i = -3;
            } else if (iSelectName == 2 && (subscriptionIdFromJson = this.subscriptionIdAtQualifierAdapter.fromJson(jsonReader)) == null) {
                JsonDataException jsonDataExceptionUnexpectedNull3 = Util.unexpectedNull("result", "result", jsonReader);
                Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull3, "");
                throw jsonDataExceptionUnexpectedNull3;
            }
        }
        jsonReader.endObject();
        if (i == -3) {
            if (lFromJson != null) {
                long jLongValue = lFromJson.longValue();
                Intrinsics.copydefault(strFromJson, "");
                if (subscriptionIdFromJson != null) {
                    return new RelayDTO.Subscribe.Result.Acknowledgement(jLongValue, strFromJson, subscriptionIdFromJson);
                }
                JsonDataException jsonDataExceptionMissingProperty = Util.missingProperty("result", "result", jsonReader);
                Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty, "");
                throw jsonDataExceptionMissingProperty;
            }
            JsonDataException jsonDataExceptionMissingProperty2 = Util.missingProperty("id", "id", jsonReader);
            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty2, "");
            throw jsonDataExceptionMissingProperty2;
        }
        Constructor<RelayDTO.Subscribe.Result.Acknowledgement> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            declaredConstructor = RelayDTO.Subscribe.Result.Acknowledgement.class.getDeclaredConstructor(Long.TYPE, String.class, SubscriptionId.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = declaredConstructor;
            Intrinsics.checkNotNullExpressionValue(declaredConstructor, "");
        }
        Object[] objArr = new Object[5];
        if (lFromJson != null) {
            objArr[0] = Long.valueOf(lFromJson.longValue());
            objArr[1] = strFromJson;
            if (subscriptionIdFromJson == null) {
                JsonDataException jsonDataExceptionMissingProperty3 = Util.missingProperty("result", "result", jsonReader);
                Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty3, "");
                throw jsonDataExceptionMissingProperty3;
            }
            objArr[2] = subscriptionIdFromJson;
            objArr[3] = Integer.valueOf(i);
            objArr[4] = null;
            RelayDTO.Subscribe.Result.Acknowledgement acknowledgementNewInstance = declaredConstructor.newInstance(objArr);
            Intrinsics.checkNotNullExpressionValue(acknowledgementNewInstance, "");
            return acknowledgementNewInstance;
        }
        JsonDataException jsonDataExceptionMissingProperty4 = Util.missingProperty("id", "id", jsonReader);
        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty4, "");
        throw jsonDataExceptionMissingProperty4;
    }

    /* JADX DEBUG: Method merged with bridge method: toJson(Lcom/squareup/moshi/JsonWriter;Ljava/lang/Object;)V */
    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(@NotNull JsonWriter jsonWriter, RelayDTO.Subscribe.Result.Acknowledgement acknowledgement) throws IOException {
        Intrinsics.checkNotNullParameter(jsonWriter, "");
        if (acknowledgement == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        jsonWriter.beginObject();
        jsonWriter.name("id");
        this.longAdapter.toJson(jsonWriter, Long.valueOf(acknowledgement.getId()));
        jsonWriter.name("jsonrpc");
        this.stringAdapter.toJson(jsonWriter, acknowledgement.getJsonrpc());
        jsonWriter.name("result");
        this.subscriptionIdAtQualifierAdapter.toJson(jsonWriter, acknowledgement.getResult());
        jsonWriter.endObject();
    }
}
