package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes;
import java.io.IOException;
import java.nio.ByteBuffer;
import o.C5615Yn;
import o.InterfaceC5583Xh;
import o.InterfaceC5584Xi;
import o.VI;

/* JADX INFO: loaded from: classes21.dex */
public class ByteBufferSerializer extends StdScalarSerializer<ByteBuffer> {
    public ByteBufferSerializer() {
        super(ByteBuffer.class);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Ljava/lang/Object;Lcom/fasterxml/jackson/core/JsonGenerator;Lo/VI;)V */
    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, o.VD
    public void serialize(ByteBuffer byteBuffer, JsonGenerator jsonGenerator, VI vi) throws IOException {
        if (byteBuffer.hasArray()) {
            int iPosition = byteBuffer.position();
            jsonGenerator.EZpvd(byteBuffer.array(), byteBuffer.arrayOffset() + iPosition, byteBuffer.limit() - iPosition);
            return;
        }
        ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        if (byteBufferAsReadOnlyBuffer.position() > 0) {
            byteBufferAsReadOnlyBuffer.rewind();
        }
        C5615Yn c5615Yn = new C5615Yn(byteBufferAsReadOnlyBuffer);
        jsonGenerator.KWHzl(c5615Yn, byteBufferAsReadOnlyBuffer.remaining());
        c5615Yn.close();
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdScalarSerializer, com.fasterxml.jackson.databind.ser.std.StdSerializer, o.VD
    public void acceptJsonFormatVisitor(InterfaceC5584Xi interfaceC5584Xi, JavaType javaType) throws JsonMappingException {
        InterfaceC5583Xh interfaceC5583XhKWHzl = interfaceC5584Xi.KWHzl(javaType);
        if (interfaceC5583XhKWHzl != null) {
            interfaceC5583XhKWHzl.AEQbTJ(JsonFormatTypes.INTEGER);
        }
    }
}
