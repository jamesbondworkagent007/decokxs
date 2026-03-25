package com.reown.sign.common.adapters;

import androidx.camera.video.AudioStats;
import com.amplifyframework.core.model.ModelIdentifier;
import com.reown.sign.common.model.vo.clientsync.session.payload.SessionEventVO;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C59449zhJ;
import o.yEE;
import o.yFA;
import okio.BufferedSink;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class SessionEventVOJsonAdapter extends JsonAdapter<SessionEventVO> {
    public final JsonAdapter<Object> anyAdapter;
    public final JsonReader.Options options;
    public final JsonAdapter<String> stringAdapter;

    public SessionEventVOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "");
        JsonReader.Options optionsOf = JsonReader.Options.of("name", "data");
        Intrinsics.checkNotNullExpressionValue(optionsOf, "");
        this.options = optionsOf;
        JsonAdapter<String> jsonAdapterAdapter = moshi.adapter(String.class, yEE.copydefault(), "name");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter, "");
        this.stringAdapter = jsonAdapterAdapter;
        JsonAdapter<Object> jsonAdapterAdapter2 = moshi.adapter(Object.class, yEE.copydefault(), "data");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter2, "");
        this.anyAdapter = jsonAdapterAdapter2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(38);
        sb.append("GeneratedJsonAdapter(");
        sb.append("SessionEventVO");
        sb.append(')');
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    /* JADX DEBUG: Method merged with bridge method: fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object; */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.JsonAdapter
    public SessionEventVO fromJson(@NotNull JsonReader jsonReader) throws IOException {
        Object objValueOf;
        Intrinsics.checkNotNullParameter(jsonReader, "");
        jsonReader.beginObject();
        String strFromJson = null;
        String string = null;
        while (jsonReader.hasNext()) {
            int iSelectName = jsonReader.selectName(this.options);
            if (iSelectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (iSelectName == 0) {
                strFromJson = this.stringAdapter.fromJson(jsonReader);
                if (strFromJson == null) {
                    JsonDataException jsonDataExceptionUnexpectedNull = Util.unexpectedNull("name", "name", jsonReader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull, "");
                    throw jsonDataExceptionUnexpectedNull;
                }
            } else if (iSelectName == 1) {
                Object objFromJson = this.anyAdapter.fromJson(jsonReader);
                if (objFromJson == null) {
                    JsonDataException jsonDataExceptionUnexpectedNull2 = Util.unexpectedNull("data", "data", jsonReader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull2, "");
                    throw jsonDataExceptionUnexpectedNull2;
                }
                if (objFromJson instanceof List) {
                    string = upsertArray(new JSONArray(), (List) objFromJson).toString();
                } else if (objFromJson instanceof Map) {
                    string = upsertObject(new JSONObject(), (Map) objFromJson).toString();
                } else if (objFromJson instanceof Number) {
                    Number number = (Number) objFromJson;
                    if (number.doubleValue() % ((double) 1) == AudioStats.AUDIO_AMPLITUDE_NONE) {
                        objValueOf = Long.valueOf(number.longValue());
                    } else {
                        objValueOf = Double.valueOf(number.doubleValue());
                    }
                    string = objValueOf.toString();
                } else {
                    string = objFromJson.toString();
                }
            } else {
                continue;
            }
        }
        jsonReader.endObject();
        if (strFromJson == null) {
            JsonDataException jsonDataExceptionMissingProperty = Util.missingProperty("name", "name", jsonReader);
            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty, "");
            throw jsonDataExceptionMissingProperty;
        }
        if (string != null) {
            return new SessionEventVO(strFromJson, string);
        }
        JsonDataException jsonDataExceptionMissingProperty2 = Util.missingProperty("data", "data", jsonReader);
        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty2, "");
        throw jsonDataExceptionMissingProperty2;
    }

    public final JSONObject upsertObject(JSONObject jSONObject, Map<?, ?> map) throws JSONException {
        Object objValueOf;
        Intrinsics.copydefault(map, "");
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (value instanceof List) {
                jSONObject.putOpt(str, upsertArray(new JSONArray(), (List) value));
            } else if (value instanceof Map) {
                jSONObject.putOpt(str, upsertObject(new JSONObject(), (Map) value));
            } else if (value instanceof Number) {
                Number number = (Number) value;
                if (number.doubleValue() % ((double) 1) == AudioStats.AUDIO_AMPLITUDE_NONE) {
                    objValueOf = Long.valueOf(number.longValue());
                } else {
                    objValueOf = Double.valueOf(number.doubleValue());
                }
                jSONObject.put(str, objValueOf);
            } else {
                if (value == null) {
                    value = JSONObject.NULL;
                }
                jSONObject.putOpt(str, value);
            }
        }
        return jSONObject;
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX DEBUG: Method merged with bridge method: toJson(Lcom/squareup/moshi/JsonWriter;Ljava/lang/Object;)V */
    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(@NotNull JsonWriter jsonWriter, SessionEventVO sessionEventVO) throws IOException {
        Intrinsics.checkNotNullParameter(jsonWriter, "");
        if (sessionEventVO == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        jsonWriter.beginObject();
        jsonWriter.name("name");
        this.stringAdapter.toJson(jsonWriter, sessionEventVO.getName());
        jsonWriter.name("data");
        BufferedSink bufferedSinkValueSink = jsonWriter.valueSink();
        try {
            String json = this.anyAdapter.toJson(sessionEventVO.getData());
            Intrinsics.checkNotNullExpressionValue(json, "");
            bufferedSinkValueSink.writeUtf8(C59449zhJ.replace$default(C59449zhJ.replace$default(StringsKt__StringsKt.valueOf(json, (CharSequence) ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR), "\\\"", ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR, false, 4, (Object) null), "\\\\\"", "\\\"", false, 4, (Object) null));
            yFA.copydefault(bufferedSinkValueSink, null);
            jsonWriter.endObject();
        } finally {
        }
    }

    public final JSONArray upsertArray(JSONArray jSONArray, List<?> list) {
        Object objValueOf;
        for (Object obj : list) {
            if (obj instanceof List) {
                jSONArray.put(upsertArray(new JSONArray(), (List) obj));
            } else if (obj instanceof Map) {
                jSONArray.put(upsertObject(new JSONObject(), (Map) obj));
            } else if (obj instanceof String) {
                try {
                    Object objFromJson = this.anyAdapter.fromJson((String) obj);
                    if (objFromJson instanceof List) {
                        jSONArray.put(upsertArray(new JSONArray(), (List) objFromJson));
                    } else if (objFromJson instanceof Map) {
                        jSONArray.put(upsertObject(new JSONObject(), (Map) objFromJson));
                    } else {
                        if (!(objFromJson instanceof Number)) {
                            throw new IllegalArgumentException("Failed Deserializing Unknown Type " + obj);
                        }
                        jSONArray.put(((String) obj).toString());
                    }
                } catch (Exception unused) {
                    jSONArray.put(obj);
                }
            } else if (obj instanceof Number) {
                Number number = (Number) obj;
                if (number.doubleValue() % ((double) 1) == AudioStats.AUDIO_AMPLITUDE_NONE) {
                    objValueOf = Long.valueOf(number.longValue());
                } else {
                    objValueOf = Double.valueOf(number.doubleValue());
                }
                jSONArray.put(objValueOf);
            } else {
                if (obj == null) {
                    obj = JSONObject.NULL;
                }
                jSONArray.put(obj);
            }
        }
        return jSONArray;
    }
}
