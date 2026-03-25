package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.type.LogicalType;
import java.io.IOException;
import o.AbstractC5597Xv;
import o.VK;

/* JADX INFO: loaded from: classes21.dex */
@VK
public class StringDeserializer extends StdScalarDeserializer<String> {
    public static final StringDeserializer instance = new StringDeserializer();
    private static final long serialVersionUID = 1;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC5548Vy
    public Object getEmptyValue(DeserializationContext deserializationContext) throws JsonMappingException {
        return "";
    }

    @Override // o.AbstractC5548Vy
    public boolean isCachable() {
        return true;
    }

    public StringDeserializer() {
        super((Class<?>) String.class);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, o.AbstractC5548Vy
    public LogicalType logicalType() {
        return LogicalType.Textual;
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;)Ljava/lang/Object; */
    @Override // o.AbstractC5548Vy
    public String deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        if (jsonParser.copydefault(JsonToken.VALUE_STRING)) {
            return jsonParser.zLjUOn();
        }
        if (jsonParser.copydefault(JsonToken.START_ARRAY)) {
            return _deserializeFromArray(jsonParser, deserializationContext);
        }
        return _parseString(jsonParser, deserializationContext, this);
    }

    /* JADX DEBUG: Method merged with bridge method: deserializeWithType(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;Lo/Xv;)Ljava/lang/Object; */
    @Override // com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, com.fasterxml.jackson.databind.deser.std.StdDeserializer, o.AbstractC5548Vy
    public String deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, AbstractC5597Xv abstractC5597Xv) throws IOException {
        return deserialize(jsonParser, deserializationContext);
    }
}
