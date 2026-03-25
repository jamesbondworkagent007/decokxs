package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import java.io.IOException;
import java.lang.reflect.Type;
import o.AbstractC5601Xz;
import o.InterfaceC5584Xi;
import o.VI;
import o.VK;

/* JADX INFO: loaded from: classes21.dex */
@VK
public class ToEmptyObjectSerializer extends StdSerializer<Object> {
    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, o.InterfaceC5598Xw
    public JsonNode getSchema(VI vi, Type type) throws JsonMappingException {
        return null;
    }

    @Override // o.VD
    public boolean isEmpty(VI vi, Object obj) {
        return true;
    }

    public ToEmptyObjectSerializer(Class<?> cls) {
        super(cls, false);
    }

    public ToEmptyObjectSerializer(JavaType javaType) {
        super(javaType);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, o.VD
    public void serialize(Object obj, JsonGenerator jsonGenerator, VI vi) throws IOException {
        jsonGenerator.EZpvd(obj, 0);
        jsonGenerator.DbNXlk();
    }

    @Override // o.VD
    public void serializeWithType(Object obj, JsonGenerator jsonGenerator, VI vi, AbstractC5601Xz abstractC5601Xz) throws IOException {
        abstractC5601Xz.copydefault(jsonGenerator, abstractC5601Xz.AEQbTJ(jsonGenerator, abstractC5601Xz.AEQbTJ(obj, JsonToken.START_OBJECT)));
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, o.VD
    public void acceptJsonFormatVisitor(InterfaceC5584Xi interfaceC5584Xi, JavaType javaType) throws JsonMappingException {
        interfaceC5584Xi.djBIcL(javaType);
    }
}
