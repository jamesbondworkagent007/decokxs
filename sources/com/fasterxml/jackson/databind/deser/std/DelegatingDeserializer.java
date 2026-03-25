package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReader;
import com.fasterxml.jackson.databind.type.LogicalType;
import com.fasterxml.jackson.databind.util.AccessPattern;
import java.io.IOException;
import java.util.Collection;
import o.AbstractC5548Vy;
import o.AbstractC5597Xv;
import o.InterfaceC5554We;
import o.InterfaceC5557Wh;

/* JADX INFO: loaded from: classes21.dex */
public abstract class DelegatingDeserializer extends StdDeserializer<Object> implements InterfaceC5554We, InterfaceC5557Wh {
    private static final long serialVersionUID = 1;
    protected final AbstractC5548Vy<?> _delegatee;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC5548Vy
    public AbstractC5548Vy<?> getDelegatee() {
        return this._delegatee;
    }

    public abstract AbstractC5548Vy<?> newDelegatingInstance(AbstractC5548Vy<?> abstractC5548Vy);

    public DelegatingDeserializer(AbstractC5548Vy<?> abstractC5548Vy) {
        super(abstractC5548Vy.handledType());
        this._delegatee = abstractC5548Vy;
    }

    @Override // o.InterfaceC5557Wh
    public void resolve(DeserializationContext deserializationContext) throws JsonMappingException {
        Object obj = this._delegatee;
        if (obj instanceof InterfaceC5557Wh) {
            ((InterfaceC5557Wh) obj).resolve(deserializationContext);
        }
    }

    @Override // o.InterfaceC5554We
    public AbstractC5548Vy<?> createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) throws JsonMappingException {
        AbstractC5548Vy<?> abstractC5548VyHandleSecondaryContextualization = deserializationContext.handleSecondaryContextualization(this._delegatee, beanProperty, deserializationContext.constructType(this._delegatee.handledType()));
        return abstractC5548VyHandleSecondaryContextualization == this._delegatee ? this : newDelegatingInstance(abstractC5548VyHandleSecondaryContextualization);
    }

    @Override // o.AbstractC5548Vy
    public AbstractC5548Vy<?> replaceDelegatee(AbstractC5548Vy<?> abstractC5548Vy) {
        return abstractC5548Vy == this._delegatee ? this : newDelegatingInstance(abstractC5548Vy);
    }

    @Override // o.AbstractC5548Vy
    public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        return this._delegatee.deserialize(jsonParser, deserializationContext);
    }

    @Override // o.AbstractC5548Vy
    public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        return this._delegatee.deserialize(jsonParser, deserializationContext, obj);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer, o.AbstractC5548Vy
    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, AbstractC5597Xv abstractC5597Xv) throws IOException {
        return this._delegatee.deserializeWithType(jsonParser, deserializationContext, abstractC5597Xv);
    }

    @Override // o.AbstractC5548Vy
    public boolean isCachable() {
        return this._delegatee.isCachable();
    }

    @Override // o.AbstractC5548Vy
    public Boolean supportsUpdate(DeserializationConfig deserializationConfig) {
        return this._delegatee.supportsUpdate(deserializationConfig);
    }

    @Override // o.AbstractC5548Vy
    public SettableBeanProperty findBackReference(String str) {
        return this._delegatee.findBackReference(str);
    }

    @Override // o.AbstractC5548Vy
    public AccessPattern getNullAccessPattern() {
        return this._delegatee.getNullAccessPattern();
    }

    @Override // o.AbstractC5548Vy, o.InterfaceC5555Wf
    public Object getNullValue(DeserializationContext deserializationContext) throws JsonMappingException {
        return this._delegatee.getNullValue(deserializationContext);
    }

    @Override // o.AbstractC5548Vy
    public Object getEmptyValue(DeserializationContext deserializationContext) throws JsonMappingException {
        return this._delegatee.getEmptyValue(deserializationContext);
    }

    @Override // o.AbstractC5548Vy
    public LogicalType logicalType() {
        return this._delegatee.logicalType();
    }

    @Override // o.AbstractC5548Vy
    public Collection<Object> getKnownPropertyNames() {
        return this._delegatee.getKnownPropertyNames();
    }

    @Override // o.AbstractC5548Vy
    public ObjectIdReader getObjectIdReader() {
        return this._delegatee.getObjectIdReader();
    }
}
