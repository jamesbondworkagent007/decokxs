package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.ser.std.ToEmptyObjectSerializer;
import java.io.IOException;
import o.AbstractC5601Xz;
import o.C5622Yv;
import o.VI;

/* JADX INFO: loaded from: classes21.dex */
public class UnknownSerializer extends ToEmptyObjectSerializer {
    public UnknownSerializer() {
        super((Class<?>) Object.class);
    }

    public UnknownSerializer(Class<?> cls) {
        super(cls);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.ToEmptyObjectSerializer, com.fasterxml.jackson.databind.ser.std.StdSerializer, o.VD
    public void serialize(Object obj, JsonGenerator jsonGenerator, VI vi) throws IOException {
        if (vi.isEnabled(SerializationFeature.FAIL_ON_EMPTY_BEANS)) {
            failForEmpty(vi, obj);
        }
        super.serialize(obj, jsonGenerator, vi);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.ToEmptyObjectSerializer, o.VD
    public void serializeWithType(Object obj, JsonGenerator jsonGenerator, VI vi, AbstractC5601Xz abstractC5601Xz) throws IOException {
        if (vi.isEnabled(SerializationFeature.FAIL_ON_EMPTY_BEANS)) {
            failForEmpty(vi, obj);
        }
        super.serializeWithType(obj, jsonGenerator, vi, abstractC5601Xz);
    }

    public void failForEmpty(VI vi, Object obj) throws JsonMappingException {
        Class<?> cls = obj.getClass();
        if (C5622Yv.copydefault(cls)) {
            vi.reportBadDefinition(handledType(), String.format("No serializer found for class %s and no properties discovered to create BeanSerializer (to avoid exception, disable SerializationFeature.FAIL_ON_EMPTY_BEANS). This appears to be a native image, in which case you may need to configure reflection for the class that is to be serialized", cls.getName()));
        } else {
            vi.reportBadDefinition(handledType(), String.format("No serializer found for class %s and no properties discovered to create BeanSerializer (to avoid exception, disable SerializationFeature.FAIL_ON_EMPTY_BEANS)", cls.getName()));
        }
    }
}
