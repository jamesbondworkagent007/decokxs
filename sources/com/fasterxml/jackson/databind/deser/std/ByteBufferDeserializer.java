package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.type.LogicalType;
import java.io.IOException;
import java.nio.ByteBuffer;
import o.C5613Yl;

/* JADX INFO: loaded from: classes21.dex */
public class ByteBufferDeserializer extends StdScalarDeserializer<ByteBuffer> {
    private static final long serialVersionUID = 1;

    public ByteBufferDeserializer() {
        super((Class<?>) ByteBuffer.class);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, o.AbstractC5548Vy
    public LogicalType logicalType() {
        return LogicalType.Binary;
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;)Ljava/lang/Object; */
    @Override // o.AbstractC5548Vy
    public ByteBuffer deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        return ByteBuffer.wrap(jsonParser.AhwBna());
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, o.AbstractC5548Vy
    public ByteBuffer deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, ByteBuffer byteBuffer) throws IOException {
        C5613Yl c5613Yl = new C5613Yl(byteBuffer);
        jsonParser.KWHzl(deserializationContext.getBase64Variant(), c5613Yl);
        c5613Yl.close();
        return byteBuffer;
    }
}
