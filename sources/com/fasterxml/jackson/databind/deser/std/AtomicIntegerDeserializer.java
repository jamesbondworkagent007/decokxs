package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.type.LogicalType;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes21.dex */
public class AtomicIntegerDeserializer extends StdScalarDeserializer<AtomicInteger> {
    private static final long serialVersionUID = 1;

    public AtomicIntegerDeserializer() {
        super((Class<?>) AtomicInteger.class);
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;)Ljava/lang/Object; */
    @Override // o.AbstractC5548Vy
    public AtomicInteger deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        if (jsonParser.QUSxYX()) {
            return new AtomicInteger(jsonParser.getFieldNames());
        }
        Integer num_parseInteger = _parseInteger(jsonParser, deserializationContext, AtomicInteger.class);
        if (num_parseInteger == null) {
            return null;
        }
        return new AtomicInteger(num_parseInteger.intValue());
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, o.AbstractC5548Vy
    public LogicalType logicalType() {
        return LogicalType.Integer;
    }

    @Override // o.AbstractC5548Vy
    public Object getEmptyValue(DeserializationContext deserializationContext) throws JsonMappingException {
        return new AtomicInteger();
    }
}
