package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;
import o.VI;
import o.VK;

/* JADX INFO: loaded from: classes21.dex */
@VK
public class DateSerializer extends DateTimeSerializerBase<Date> {
    public static final DateSerializer instance = new DateSerializer();

    public DateSerializer() {
        this(null, null);
    }

    public DateSerializer(Boolean bool, DateFormat dateFormat) {
        super(Date.class, bool, dateFormat);
    }

    /* JADX DEBUG: Method merged with bridge method: withFormat(Ljava/lang/Boolean;Ljava/text/DateFormat;)Lcom/fasterxml/jackson/databind/ser/std/DateTimeSerializerBase; */
    /* JADX DEBUG: Return type fixed from 'com.fasterxml.jackson.databind.ser.std.DateSerializer' to match base method */
    @Override // com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase
    /* JADX INFO: renamed from: withFormat, reason: merged with bridge method [inline-methods] */
    public DateTimeSerializerBase<Date> withFormat2(Boolean bool, DateFormat dateFormat) {
        return new DateSerializer(bool, dateFormat);
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
        } else {
            _serializeAsString(date, jsonGenerator, vi);
        }
    }
}
