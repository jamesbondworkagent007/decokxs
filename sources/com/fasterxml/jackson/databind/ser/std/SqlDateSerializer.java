package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import java.io.IOException;
import java.sql.Date;
import java.text.DateFormat;
import o.VI;
import o.VK;

/* JADX INFO: loaded from: classes21.dex */
@VK
public class SqlDateSerializer extends DateTimeSerializerBase<Date> {
    public SqlDateSerializer() {
        this(null, null);
    }

    public SqlDateSerializer(Boolean bool, DateFormat dateFormat) {
        super(Date.class, bool, dateFormat);
    }

    /* JADX DEBUG: Method merged with bridge method: withFormat(Ljava/lang/Boolean;Ljava/text/DateFormat;)Lcom/fasterxml/jackson/databind/ser/std/DateTimeSerializerBase; */
    /* JADX DEBUG: Return type fixed from 'com.fasterxml.jackson.databind.ser.std.SqlDateSerializer' to match base method */
    @Override // com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase
    /* JADX INFO: renamed from: withFormat, reason: avoid collision after fix types in other method */
    public DateTimeSerializerBase<Date> withFormat2(Boolean bool, DateFormat dateFormat) {
        return new SqlDateSerializer(bool, dateFormat);
    }

    /* JADX DEBUG: Method merged with bridge method: _timestamp(Ljava/lang/Object;)J */
    @Override // com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase
    public long _timestamp(Date date) {
        if (date == null) {
            return 0L;
        }
        return date.getTime();
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Ljava/lang/Object;Lcom/fasterxml/jackson/core/JsonGenerator;Lo/VI;)V */
    @Override // com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase, com.fasterxml.jackson.databind.ser.std.StdSerializer, o.VD
    public void serialize(Date date, JsonGenerator jsonGenerator, VI vi) throws IOException {
        if (_asTimestamp(vi)) {
            jsonGenerator.EZpvd(_timestamp(date));
        } else if (this._customFormat == null) {
            jsonGenerator.AhwBna(date.toString());
        } else {
            _serializeAsString(date, jsonGenerator, vi);
        }
    }
}
