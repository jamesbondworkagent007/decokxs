package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes;
import java.io.IOException;
import java.lang.reflect.Type;
import o.AbstractC5601Xz;
import o.InterfaceC5583Xh;
import o.InterfaceC5584Xi;
import o.VI;
import o.VK;

/* JADX INFO: loaded from: classes21.dex */
@VK
public class ByteArraySerializer extends StdSerializer<byte[]> {
    private static final long serialVersionUID = 1;

    public ByteArraySerializer() {
        super(byte[].class);
    }

    /* JADX DEBUG: Method merged with bridge method: isEmpty(Lo/VI;Ljava/lang/Object;)Z */
    @Override // o.VD
    public boolean isEmpty(VI vi, byte[] bArr) {
        return bArr.length == 0;
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Ljava/lang/Object;Lcom/fasterxml/jackson/core/JsonGenerator;Lo/VI;)V */
    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, o.VD
    public void serialize(byte[] bArr, JsonGenerator jsonGenerator, VI vi) throws IOException {
        jsonGenerator.EZpvd(vi.getConfig().getBase64Variant(), bArr, 0, bArr.length);
    }

    /* JADX DEBUG: Method merged with bridge method: serializeWithType(Ljava/lang/Object;Lcom/fasterxml/jackson/core/JsonGenerator;Lo/VI;Lo/Xz;)V */
    @Override // o.VD
    public void serializeWithType(byte[] bArr, JsonGenerator jsonGenerator, VI vi, AbstractC5601Xz abstractC5601Xz) throws IOException {
        WritableTypeId writableTypeIdAEQbTJ = abstractC5601Xz.AEQbTJ(jsonGenerator, abstractC5601Xz.AEQbTJ(bArr, JsonToken.VALUE_EMBEDDED_OBJECT));
        jsonGenerator.EZpvd(vi.getConfig().getBase64Variant(), bArr, 0, bArr.length);
        abstractC5601Xz.copydefault(jsonGenerator, writableTypeIdAEQbTJ);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, o.InterfaceC5598Xw
    public JsonNode getSchema(VI vi, Type type) {
        return createSchemaNode("array", true).set("items", createSchemaNode("byte"));
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, o.VD
    public void acceptJsonFormatVisitor(InterfaceC5584Xi interfaceC5584Xi, JavaType javaType) throws JsonMappingException {
        InterfaceC5583Xh interfaceC5583XhKWHzl = interfaceC5584Xi.KWHzl(javaType);
        if (interfaceC5583XhKWHzl != null) {
            interfaceC5583XhKWHzl.AEQbTJ(JsonFormatTypes.INTEGER);
        }
    }
}
