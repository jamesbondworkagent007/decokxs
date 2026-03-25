package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import java.io.IOException;
import o.AbstractC5548Vy;
import o.AbstractC5597Xv;
import o.InterfaceC5557Wh;

/* JADX INFO: loaded from: classes21.dex */
public abstract class StdNodeBasedDeserializer<T> extends StdDeserializer<T> implements InterfaceC5557Wh {
    private static final long serialVersionUID = 1;
    protected AbstractC5548Vy<Object> _treeDeserializer;

    public abstract T convert(JsonNode jsonNode, DeserializationContext deserializationContext) throws IOException;

    public StdNodeBasedDeserializer(JavaType javaType) {
        super(javaType);
    }

    public StdNodeBasedDeserializer(Class<T> cls) {
        super((Class<?>) cls);
    }

    public StdNodeBasedDeserializer(StdNodeBasedDeserializer<?> stdNodeBasedDeserializer) {
        super(stdNodeBasedDeserializer);
        this._treeDeserializer = stdNodeBasedDeserializer._treeDeserializer;
    }

    @Override // o.InterfaceC5557Wh
    public void resolve(DeserializationContext deserializationContext) throws JsonMappingException {
        this._treeDeserializer = deserializationContext.findRootValueDeserializer(deserializationContext.constructType(JsonNode.class));
    }

    @Override // o.AbstractC5548Vy
    public T deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        return convert((JsonNode) this._treeDeserializer.deserialize(jsonParser, deserializationContext), deserializationContext);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer, o.AbstractC5548Vy
    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, AbstractC5597Xv abstractC5597Xv) throws IOException {
        return convert((JsonNode) this._treeDeserializer.deserializeWithType(jsonParser, deserializationContext, abstractC5597Xv), deserializationContext);
    }
}
