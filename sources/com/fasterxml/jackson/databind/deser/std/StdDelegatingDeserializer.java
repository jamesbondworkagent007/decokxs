package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.type.LogicalType;
import com.fasterxml.jackson.databind.util.AccessPattern;
import java.io.IOException;
import java.util.Collection;
import o.AbstractC5548Vy;
import o.AbstractC5597Xv;
import o.C5619Yr;
import o.InterfaceC5554We;
import o.InterfaceC5557Wh;
import o.InterfaceC5621Yt;

/* JADX INFO: loaded from: classes21.dex */
public class StdDelegatingDeserializer<T> extends StdDeserializer<T> implements InterfaceC5554We, InterfaceC5557Wh {
    private static final long serialVersionUID = 1;
    protected final InterfaceC5621Yt<Object, T> _converter;
    protected final AbstractC5548Vy<Object> _delegateDeserializer;
    protected final JavaType _delegateType;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC5548Vy
    public AbstractC5548Vy<?> getDelegatee() {
        return this._delegateDeserializer;
    }

    public StdDelegatingDeserializer(InterfaceC5621Yt<?, T> interfaceC5621Yt) {
        super((Class<?>) Object.class);
        this._converter = interfaceC5621Yt;
        this._delegateType = null;
        this._delegateDeserializer = null;
    }

    public StdDelegatingDeserializer(InterfaceC5621Yt<Object, T> interfaceC5621Yt, JavaType javaType, AbstractC5548Vy<?> abstractC5548Vy) {
        super(javaType);
        this._converter = interfaceC5621Yt;
        this._delegateType = javaType;
        this._delegateDeserializer = abstractC5548Vy;
    }

    public StdDelegatingDeserializer(StdDelegatingDeserializer<T> stdDelegatingDeserializer) {
        super(stdDelegatingDeserializer);
        this._converter = stdDelegatingDeserializer._converter;
        this._delegateType = stdDelegatingDeserializer._delegateType;
        this._delegateDeserializer = stdDelegatingDeserializer._delegateDeserializer;
    }

    public StdDelegatingDeserializer<T> withDelegate(InterfaceC5621Yt<Object, T> interfaceC5621Yt, JavaType javaType, AbstractC5548Vy<?> abstractC5548Vy) {
        C5619Yr.AEQbTJ((Class<?>) StdDelegatingDeserializer.class, this, "withDelegate");
        return new StdDelegatingDeserializer<>(interfaceC5621Yt, javaType, abstractC5548Vy);
    }

    @Override // o.InterfaceC5557Wh
    public void resolve(DeserializationContext deserializationContext) throws JsonMappingException {
        Object obj = this._delegateDeserializer;
        if (obj == null || !(obj instanceof InterfaceC5557Wh)) {
            return;
        }
        ((InterfaceC5557Wh) obj).resolve(deserializationContext);
    }

    @Override // o.InterfaceC5554We
    public AbstractC5548Vy<?> createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) throws JsonMappingException {
        AbstractC5548Vy<?> abstractC5548Vy = this._delegateDeserializer;
        if (abstractC5548Vy != null) {
            AbstractC5548Vy<?> abstractC5548VyHandleSecondaryContextualization = deserializationContext.handleSecondaryContextualization(abstractC5548Vy, beanProperty, this._delegateType);
            return abstractC5548VyHandleSecondaryContextualization != this._delegateDeserializer ? withDelegate(this._converter, this._delegateType, abstractC5548VyHandleSecondaryContextualization) : this;
        }
        JavaType javaTypeAEQbTJ = this._converter.AEQbTJ(deserializationContext.getTypeFactory());
        return withDelegate(this._converter, javaTypeAEQbTJ, deserializationContext.findContextualValueDeserializer(javaTypeAEQbTJ, beanProperty));
    }

    @Override // o.AbstractC5548Vy
    public T deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        Object objDeserialize = this._delegateDeserializer.deserialize(jsonParser, deserializationContext);
        if (objDeserialize == null) {
            return null;
        }
        return convertValue(objDeserialize);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer, o.AbstractC5548Vy
    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, AbstractC5597Xv abstractC5597Xv) throws IOException {
        Object objDeserialize = this._delegateDeserializer.deserialize(jsonParser, deserializationContext);
        if (objDeserialize == null) {
            return null;
        }
        return convertValue(objDeserialize);
    }

    @Override // o.AbstractC5548Vy
    public T deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        if (this._delegateType.getRawClass().isAssignableFrom(obj.getClass())) {
            return (T) this._delegateDeserializer.deserialize(jsonParser, deserializationContext, obj);
        }
        return (T) _handleIncompatibleUpdateValue(jsonParser, deserializationContext, obj);
    }

    public Object _handleIncompatibleUpdateValue(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        throw new UnsupportedOperationException(String.format("Cannot update object of type %s (using deserializer for type %s)" + obj.getClass().getName(), this._delegateType));
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer, o.AbstractC5548Vy
    public Class<?> handledType() {
        return this._delegateDeserializer.handledType();
    }

    @Override // o.AbstractC5548Vy
    public LogicalType logicalType() {
        return this._delegateDeserializer.logicalType();
    }

    @Override // o.AbstractC5548Vy
    public boolean isCachable() {
        AbstractC5548Vy<Object> abstractC5548Vy = this._delegateDeserializer;
        return abstractC5548Vy != null && abstractC5548Vy.isCachable();
    }

    @Override // o.AbstractC5548Vy
    public Collection<Object> getKnownPropertyNames() {
        return this._delegateDeserializer.getKnownPropertyNames();
    }

    @Override // o.AbstractC5548Vy, o.InterfaceC5555Wf
    public T getNullValue(DeserializationContext deserializationContext) throws JsonMappingException {
        return _convertIfNonNull(this._delegateDeserializer.getNullValue(deserializationContext));
    }

    @Override // o.AbstractC5548Vy
    public AccessPattern getNullAccessPattern() {
        return this._delegateDeserializer.getNullAccessPattern();
    }

    @Override // o.AbstractC5548Vy, o.InterfaceC5555Wf
    public Object getAbsentValue(DeserializationContext deserializationContext) throws JsonMappingException {
        return _convertIfNonNull(this._delegateDeserializer.getAbsentValue(deserializationContext));
    }

    @Override // o.AbstractC5548Vy
    public Object getEmptyValue(DeserializationContext deserializationContext) throws JsonMappingException {
        return _convertIfNonNull(this._delegateDeserializer.getEmptyValue(deserializationContext));
    }

    @Override // o.AbstractC5548Vy
    public AccessPattern getEmptyAccessPattern() {
        return this._delegateDeserializer.getEmptyAccessPattern();
    }

    @Override // o.AbstractC5548Vy
    public Boolean supportsUpdate(DeserializationConfig deserializationConfig) {
        return this._delegateDeserializer.supportsUpdate(deserializationConfig);
    }

    public T convertValue(Object obj) {
        return this._converter.OLrzqt(obj);
    }

    public T _convertIfNonNull(Object obj) {
        if (obj == null) {
            return null;
        }
        return this._converter.OLrzqt(obj);
    }
}
