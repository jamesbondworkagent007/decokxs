package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.type.LogicalType;
import java.io.IOException;
import java.io.Serializable;
import java.util.Collection;
import o.AbstractC5548Vy;
import o.AbstractC5597Xv;

/* JADX INFO: loaded from: classes21.dex */
public final class TypeWrappedDeserializer extends AbstractC5548Vy<Object> implements Serializable {
    private static final long serialVersionUID = 1;
    protected final AbstractC5548Vy<Object> _deserializer;
    protected final AbstractC5597Xv _typeDeserializer;

    public TypeWrappedDeserializer(AbstractC5597Xv abstractC5597Xv, AbstractC5548Vy<?> abstractC5548Vy) {
        this._typeDeserializer = abstractC5597Xv;
        this._deserializer = abstractC5548Vy;
    }

    @Override // o.AbstractC5548Vy
    public LogicalType logicalType() {
        return this._deserializer.logicalType();
    }

    @Override // o.AbstractC5548Vy
    public Class<?> handledType() {
        return this._deserializer.handledType();
    }

    @Override // o.AbstractC5548Vy
    public Boolean supportsUpdate(DeserializationConfig deserializationConfig) {
        return this._deserializer.supportsUpdate(deserializationConfig);
    }

    @Override // o.AbstractC5548Vy
    public AbstractC5548Vy<?> getDelegatee() {
        return this._deserializer.getDelegatee();
    }

    @Override // o.AbstractC5548Vy
    public Collection<Object> getKnownPropertyNames() {
        return this._deserializer.getKnownPropertyNames();
    }

    @Override // o.AbstractC5548Vy, o.InterfaceC5555Wf
    public Object getNullValue(DeserializationContext deserializationContext) throws JsonMappingException {
        return this._deserializer.getNullValue(deserializationContext);
    }

    @Override // o.AbstractC5548Vy
    public Object getEmptyValue(DeserializationContext deserializationContext) throws JsonMappingException {
        return this._deserializer.getEmptyValue(deserializationContext);
    }

    @Override // o.AbstractC5548Vy
    public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        return this._deserializer.deserializeWithType(jsonParser, deserializationContext, this._typeDeserializer);
    }

    @Override // o.AbstractC5548Vy
    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, AbstractC5597Xv abstractC5597Xv) throws IOException {
        throw new IllegalStateException("Type-wrapped deserializer's deserializeWithType should never get called");
    }

    @Override // o.AbstractC5548Vy
    public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        return this._deserializer.deserialize(jsonParser, deserializationContext, obj);
    }
}
