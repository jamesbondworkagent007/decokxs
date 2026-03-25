package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.type.LogicalType;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes21.dex */
public class AtomicLongDeserializer extends StdScalarDeserializer<AtomicLong> {
    private static final long serialVersionUID = 1;

    public AtomicLongDeserializer() {
        super((Class<?>) AtomicLong.class);
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;)Ljava/lang/Object; */
    @Override // o.AbstractC5548Vy
    public AtomicLong deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        if (jsonParser.QUSxYX()) {
            return new AtomicLong(jsonParser.getNewProxyInstance());
        }
        if (_parseLong(jsonParser, deserializationContext, AtomicLong.class) == null) {
            return null;
        }
        return new AtomicLong(r3.intValue());
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, o.AbstractC5548Vy
    public LogicalType logicalType() {
        return LogicalType.Integer;
    }

    @Override // o.AbstractC5548Vy
    public Object getEmptyValue(DeserializationContext deserializationContext) throws JsonMappingException {
        return new AtomicLong();
    }
}
