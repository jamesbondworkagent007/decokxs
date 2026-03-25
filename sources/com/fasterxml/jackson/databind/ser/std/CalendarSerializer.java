package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import java.io.IOException;
import java.text.DateFormat;
import java.util.Calendar;
import o.VI;
import o.VK;

/* JADX INFO: loaded from: classes21.dex */
@VK
public class CalendarSerializer extends DateTimeSerializerBase<Calendar> {
    public static final CalendarSerializer instance = new CalendarSerializer();

    public CalendarSerializer() {
        this(null, null);
    }

    public CalendarSerializer(Boolean bool, DateFormat dateFormat) {
        super(Calendar.class, bool, dateFormat);
    }

    /* JADX DEBUG: Method merged with bridge method: withFormat(Ljava/lang/Boolean;Ljava/text/DateFormat;)Lcom/fasterxml/jackson/databind/ser/std/DateTimeSerializerBase; */
    /* JADX DEBUG: Return type fixed from 'com.fasterxml.jackson.databind.ser.std.CalendarSerializer' to match base method */
    @Override // com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase
    /* JADX INFO: renamed from: withFormat */
    public DateTimeSerializerBase<Calendar> withFormat2(Boolean bool, DateFormat dateFormat) {
        return new CalendarSerializer(bool, dateFormat);
    }

    /* JADX DEBUG: Method merged with bridge method: _timestamp(Ljava/lang/Object;)J */
    @Override // com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase
    public long _timestamp(Calendar calendar) {
        if (calendar == null) {
            return 0L;
        }
        return calendar.getTimeInMillis();
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Ljava/lang/Object;Lcom/fasterxml/jackson/core/JsonGenerator;Lo/VI;)V */
    @Override // com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase, com.fasterxml.jackson.databind.ser.std.StdSerializer, o.VD
    public void serialize(Calendar calendar, JsonGenerator jsonGenerator, VI vi) throws IOException {
        if (_asTimestamp(vi)) {
            jsonGenerator.EZpvd(_timestamp(calendar));
        } else {
            _serializeAsString(calendar.getTime(), jsonGenerator, vi);
        }
    }
}
