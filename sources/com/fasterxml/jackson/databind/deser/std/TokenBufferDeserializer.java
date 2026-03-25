package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.type.LogicalType;
import java.io.IOException;
import o.VK;
import o.YA;

/* JADX INFO: loaded from: classes21.dex */
@VK
public class TokenBufferDeserializer extends StdScalarDeserializer<YA> {
    private static final long serialVersionUID = 1;

    public TokenBufferDeserializer() {
        super((Class<?>) YA.class);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, o.AbstractC5548Vy
    public LogicalType logicalType() {
        return LogicalType.Untyped;
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;)Ljava/lang/Object; */
    @Override // o.AbstractC5548Vy
    public YA deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        return deserializationContext.bufferForInputBuffering(jsonParser).AEQbTJ(jsonParser, deserializationContext);
    }
}
