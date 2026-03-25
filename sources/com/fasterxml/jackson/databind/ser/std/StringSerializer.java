package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
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
public final class StringSerializer extends StdScalarSerializer<Object> {
    private static final long serialVersionUID = 1;

    public StringSerializer() {
        super(String.class, false);
    }

    @Override // o.VD
    public boolean isEmpty(VI vi, Object obj) {
        return ((String) obj).isEmpty();
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, o.VD
    public void serialize(Object obj, JsonGenerator jsonGenerator, VI vi) throws IOException {
        jsonGenerator.AhwBna((String) obj);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdScalarSerializer, o.VD
    public final void serializeWithType(Object obj, JsonGenerator jsonGenerator, VI vi, AbstractC5601Xz abstractC5601Xz) throws IOException {
        jsonGenerator.AhwBna((String) obj);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdScalarSerializer, com.fasterxml.jackson.databind.ser.std.StdSerializer, o.InterfaceC5598Xw
    public JsonNode getSchema(VI vi, Type type) {
        return createSchemaNode("string", true);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdScalarSerializer, com.fasterxml.jackson.databind.ser.std.StdSerializer, o.VD
    public void acceptJsonFormatVisitor(InterfaceC5584Xi interfaceC5584Xi, JavaType javaType) throws JsonMappingException {
        visitStringFormat(interfaceC5584Xi, javaType);
    }
}
