package com.reown.android.pulse.model;

import com.reown.android.pulse.model.properties.Props;
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
import o.yEE;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final class EventJsonAdapter extends JsonAdapter<Event> {
    public volatile Constructor<Event> constructorRef;
    public final JsonAdapter<Long> longAdapter;
    public final JsonReader.Options options;
    public final JsonAdapter<Props> propsAdapter;
    public final JsonAdapter<String> stringAdapter;

    public EventJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "");
        JsonReader.Options optionsOf = JsonReader.Options.of("eventId", "bundleId", "timestamp", "props");
        Intrinsics.checkNotNullExpressionValue(optionsOf, "");
        this.options = optionsOf;
        JsonAdapter<Long> jsonAdapterAdapter = moshi.adapter(Long.TYPE, yEE.copydefault(), "eventId");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter, "");
        this.longAdapter = jsonAdapterAdapter;
        JsonAdapter<String> jsonAdapterAdapter2 = moshi.adapter(String.class, yEE.copydefault(), "bundleId");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter2, "");
        this.stringAdapter = jsonAdapterAdapter2;
        JsonAdapter<Props> jsonAdapterAdapter3 = moshi.adapter(Props.class, yEE.copydefault(), "props");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter3, "");
        this.propsAdapter = jsonAdapterAdapter3;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(27);
        sb.append("GeneratedJsonAdapter(");
        sb.append("Event");
        sb.append(')');
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    /* JADX DEBUG: Method merged with bridge method: fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object; */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.JsonAdapter
    public Event fromJson(@NotNull JsonReader jsonReader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, InvocationTargetException {
        Intrinsics.checkNotNullParameter(jsonReader, "");
        jsonReader.beginObject();
        Long lFromJson = 0L;
        Long lFromJson2 = null;
        String strFromJson = null;
        Props propsFromJson = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int iSelectName = jsonReader.selectName(this.options);
            if (iSelectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (iSelectName == 0) {
                lFromJson = this.longAdapter.fromJson(jsonReader);
                if (lFromJson == null) {
                    JsonDataException jsonDataExceptionUnexpectedNull = Util.unexpectedNull("eventId", "eventId", jsonReader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull, "");
                    throw jsonDataExceptionUnexpectedNull;
                }
                i &= -2;
            } else if (iSelectName == 1) {
                strFromJson = this.stringAdapter.fromJson(jsonReader);
                if (strFromJson == null) {
                    JsonDataException jsonDataExceptionUnexpectedNull2 = Util.unexpectedNull("bundleId", "bundleId", jsonReader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull2, "");
                    throw jsonDataExceptionUnexpectedNull2;
                }
            } else if (iSelectName == 2) {
                lFromJson2 = this.longAdapter.fromJson(jsonReader);
                if (lFromJson2 == null) {
                    JsonDataException jsonDataExceptionUnexpectedNull3 = Util.unexpectedNull("timestamp", "timestamp", jsonReader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull3, "");
                    throw jsonDataExceptionUnexpectedNull3;
                }
                i &= -5;
            } else if (iSelectName == 3 && (propsFromJson = this.propsAdapter.fromJson(jsonReader)) == null) {
                JsonDataException jsonDataExceptionUnexpectedNull4 = Util.unexpectedNull("props", "props", jsonReader);
                Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull4, "");
                throw jsonDataExceptionUnexpectedNull4;
            }
        }
        jsonReader.endObject();
        if (i == -6) {
            long jLongValue = lFromJson.longValue();
            if (strFromJson == null) {
                JsonDataException jsonDataExceptionMissingProperty = Util.missingProperty("bundleId", "bundleId", jsonReader);
                Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty, "");
                throw jsonDataExceptionMissingProperty;
            }
            long jLongValue2 = lFromJson2.longValue();
            if (propsFromJson != null) {
                return new Event(jLongValue, strFromJson, jLongValue2, propsFromJson);
            }
            JsonDataException jsonDataExceptionMissingProperty2 = Util.missingProperty("props", "props", jsonReader);
            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty2, "");
            throw jsonDataExceptionMissingProperty2;
        }
        Constructor<Event> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            Class cls = Long.TYPE;
            declaredConstructor = Event.class.getDeclaredConstructor(cls, String.class, cls, Props.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = declaredConstructor;
            Intrinsics.checkNotNullExpressionValue(declaredConstructor, "");
        }
        if (strFromJson == null) {
            JsonDataException jsonDataExceptionMissingProperty3 = Util.missingProperty("bundleId", "bundleId", jsonReader);
            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty3, "");
            throw jsonDataExceptionMissingProperty3;
        }
        if (propsFromJson != null) {
            Event eventNewInstance = declaredConstructor.newInstance(lFromJson, strFromJson, lFromJson2, propsFromJson, Integer.valueOf(i), null);
            Intrinsics.checkNotNullExpressionValue(eventNewInstance, "");
            return eventNewInstance;
        }
        JsonDataException jsonDataExceptionMissingProperty4 = Util.missingProperty("props", "props", jsonReader);
        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty4, "");
        throw jsonDataExceptionMissingProperty4;
    }

    /* JADX DEBUG: Method merged with bridge method: toJson(Lcom/squareup/moshi/JsonWriter;Ljava/lang/Object;)V */
    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(@NotNull JsonWriter jsonWriter, Event event) throws IOException {
        Intrinsics.checkNotNullParameter(jsonWriter, "");
        if (event == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        jsonWriter.beginObject();
        jsonWriter.name("eventId");
        this.longAdapter.toJson(jsonWriter, Long.valueOf(event.getEventId()));
        jsonWriter.name("bundleId");
        this.stringAdapter.toJson(jsonWriter, event.getBundleId());
        jsonWriter.name("timestamp");
        this.longAdapter.toJson(jsonWriter, Long.valueOf(event.getTimestamp()));
        jsonWriter.name("props");
        this.propsAdapter.toJson(jsonWriter, event.getProps());
        jsonWriter.endObject();
    }
}
