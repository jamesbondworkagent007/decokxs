package com.squareup.moshi.adapters;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import java.io.IOException;
import java.util.Date;

/* JADX INFO: loaded from: classes24.dex */
public final class Rfc3339DateJsonAdapter extends JsonAdapter<Date> {
    /* JADX DEBUG: Method merged with bridge method: fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object; */
    @Override // com.squareup.moshi.JsonAdapter
    public Date fromJson(JsonReader jsonReader) throws IOException {
        synchronized (this) {
            if (jsonReader.peek() == JsonReader.Token.NULL) {
                return (Date) jsonReader.nextNull();
            }
            return Iso8601Utils.parse(jsonReader.nextString());
        }
    }

    /* JADX DEBUG: Method merged with bridge method: toJson(Lcom/squareup/moshi/JsonWriter;Ljava/lang/Object;)V */
    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter jsonWriter, Date date) throws IOException {
        synchronized (this) {
            if (date == null) {
                jsonWriter.nullValue();
            } else {
                jsonWriter.value(Iso8601Utils.format(date));
            }
        }
    }
}
