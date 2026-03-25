package com.squareup.moshi;

import java.io.IOException;
import java.util.Date;

/* JADX INFO: loaded from: classes24.dex */
public final class Rfc3339DateJsonAdapter extends JsonAdapter<Date> {
    private final com.squareup.moshi.adapters.Rfc3339DateJsonAdapter delegate = new com.squareup.moshi.adapters.Rfc3339DateJsonAdapter();

    /* JADX DEBUG: Method merged with bridge method: fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object; */
    @Override // com.squareup.moshi.JsonAdapter
    public Date fromJson(JsonReader jsonReader) throws IOException {
        return this.delegate.fromJson(jsonReader);
    }

    /* JADX DEBUG: Method merged with bridge method: toJson(Lcom/squareup/moshi/JsonWriter;Ljava/lang/Object;)V */
    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter jsonWriter, Date date) throws IOException {
        this.delegate.toJson(jsonWriter, date);
    }
}
