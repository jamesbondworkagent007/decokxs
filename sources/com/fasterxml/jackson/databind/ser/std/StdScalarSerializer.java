package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import java.io.IOException;
import java.lang.reflect.Type;
import o.AbstractC5601Xz;
import o.InterfaceC5584Xi;
import o.VI;

/* JADX INFO: loaded from: classes21.dex */
public abstract class StdScalarSerializer<T> extends StdSerializer<T> {
    public StdScalarSerializer(Class<T> cls) {
        super(cls);
    }

    public StdScalarSerializer(Class<?> cls, boolean z) {
        super(cls);
    }

    public StdScalarSerializer(StdScalarSerializer<?> stdScalarSerializer) {
        super(stdScalarSerializer);
    }

    @Override // o.VD
    public void serializeWithType(T t, JsonGenerator jsonGenerator, VI vi, AbstractC5601Xz abstractC5601Xz) throws IOException {
        WritableTypeId writableTypeIdAEQbTJ = abstractC5601Xz.AEQbTJ(jsonGenerator, abstractC5601Xz.AEQbTJ(t, JsonToken.VALUE_STRING));
        serialize(t, jsonGenerator, vi);
        abstractC5601Xz.copydefault(jsonGenerator, writableTypeIdAEQbTJ);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, o.InterfaceC5598Xw
    public JsonNode getSchema(VI vi, Type type) throws JsonMappingException {
        return createSchemaNode("string", true);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, o.VD
    public void acceptJsonFormatVisitor(InterfaceC5584Xi interfaceC5584Xi, JavaType javaType) throws JsonMappingException {
        visitStringFormat(interfaceC5584Xi, javaType);
    }
}
