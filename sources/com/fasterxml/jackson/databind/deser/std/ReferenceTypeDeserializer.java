package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.type.LogicalType;
import com.fasterxml.jackson.databind.util.AccessPattern;
import java.io.IOException;
import o.AbstractC5548Vy;
import o.AbstractC5597Xv;
import o.InterfaceC5554We;

/* JADX INFO: loaded from: classes21.dex */
public abstract class ReferenceTypeDeserializer<T> extends StdDeserializer<T> implements InterfaceC5554We {
    private static final long serialVersionUID = 2;
    protected final JavaType _fullType;
    protected final AbstractC5548Vy<Object> _valueDeserializer;
    protected final ValueInstantiator _valueInstantiator;
    protected final AbstractC5597Xv _valueTypeDeserializer;

    @Override // o.AbstractC5548Vy, o.InterfaceC5555Wf
    public abstract T getNullValue(DeserializationContext deserializationContext) throws JsonMappingException;

    public abstract Object getReferenced(T t);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer
    public ValueInstantiator getValueInstantiator() {
        return this._valueInstantiator;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer
    public JavaType getValueType() {
        return this._fullType;
    }

    public abstract T referenceValue(Object obj);

    public abstract T updateReference(T t, Object obj);

    public abstract ReferenceTypeDeserializer<T> withResolved(AbstractC5597Xv abstractC5597Xv, AbstractC5548Vy<?> abstractC5548Vy);

    public ReferenceTypeDeserializer(JavaType javaType, ValueInstantiator valueInstantiator, AbstractC5597Xv abstractC5597Xv, AbstractC5548Vy<?> abstractC5548Vy) {
        super(javaType);
        this._valueInstantiator = valueInstantiator;
        this._fullType = javaType;
        this._valueDeserializer = abstractC5548Vy;
        this._valueTypeDeserializer = abstractC5597Xv;
    }

    @Deprecated
    public ReferenceTypeDeserializer(JavaType javaType, AbstractC5597Xv abstractC5597Xv, AbstractC5548Vy<?> abstractC5548Vy) {
        this(javaType, null, abstractC5597Xv, abstractC5548Vy);
    }

    @Override // o.InterfaceC5554We
    public AbstractC5548Vy<?> createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) throws JsonMappingException {
        AbstractC5548Vy<?> abstractC5548VyHandleSecondaryContextualization;
        AbstractC5548Vy<?> abstractC5548Vy = this._valueDeserializer;
        if (abstractC5548Vy == null) {
            abstractC5548VyHandleSecondaryContextualization = deserializationContext.findContextualValueDeserializer(this._fullType.getReferencedType(), beanProperty);
        } else {
            abstractC5548VyHandleSecondaryContextualization = deserializationContext.handleSecondaryContextualization(abstractC5548Vy, beanProperty, this._fullType.getReferencedType());
        }
        AbstractC5597Xv abstractC5597XvForProperty = this._valueTypeDeserializer;
        if (abstractC5597XvForProperty != null) {
            abstractC5597XvForProperty = abstractC5597XvForProperty.forProperty(beanProperty);
        }
        return (abstractC5548VyHandleSecondaryContextualization == this._valueDeserializer && abstractC5597XvForProperty == this._valueTypeDeserializer) ? this : withResolved(abstractC5597XvForProperty, abstractC5548VyHandleSecondaryContextualization);
    }

    @Override // o.AbstractC5548Vy
    public AccessPattern getNullAccessPattern() {
        return AccessPattern.DYNAMIC;
    }

    @Override // o.AbstractC5548Vy
    public AccessPattern getEmptyAccessPattern() {
        return AccessPattern.DYNAMIC;
    }

    @Override // o.AbstractC5548Vy
    public Object getEmptyValue(DeserializationContext deserializationContext) throws JsonMappingException {
        return getNullValue(deserializationContext);
    }

    @Override // o.AbstractC5548Vy
    public LogicalType logicalType() {
        AbstractC5548Vy<Object> abstractC5548Vy = this._valueDeserializer;
        if (abstractC5548Vy != null) {
            return abstractC5548Vy.logicalType();
        }
        return super.logicalType();
    }

    @Override // o.AbstractC5548Vy
    public Boolean supportsUpdate(DeserializationConfig deserializationConfig) {
        AbstractC5548Vy<Object> abstractC5548Vy = this._valueDeserializer;
        if (abstractC5548Vy == null) {
            return null;
        }
        return abstractC5548Vy.supportsUpdate(deserializationConfig);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.fasterxml.jackson.databind.deser.std.ReferenceTypeDeserializer<T> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC5548Vy
    public T deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        Object objDeserializeWithType;
        ValueInstantiator valueInstantiator = this._valueInstantiator;
        if (valueInstantiator != null) {
            return (T) deserialize(jsonParser, deserializationContext, valueInstantiator.createUsingDefault(deserializationContext));
        }
        AbstractC5597Xv abstractC5597Xv = this._valueTypeDeserializer;
        if (abstractC5597Xv == null) {
            objDeserializeWithType = this._valueDeserializer.deserialize(jsonParser, deserializationContext);
        } else {
            objDeserializeWithType = this._valueDeserializer.deserializeWithType(jsonParser, deserializationContext, abstractC5597Xv);
        }
        return (T) referenceValue(objDeserializeWithType);
    }

    @Override // o.AbstractC5548Vy
    public T deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, T t) throws IOException {
        Object objDeserializeWithType;
        Object objDeserializeWithType2;
        if (this._valueDeserializer.supportsUpdate(deserializationContext.getConfig()).equals(Boolean.FALSE) || this._valueTypeDeserializer != null) {
            AbstractC5597Xv abstractC5597Xv = this._valueTypeDeserializer;
            if (abstractC5597Xv == null) {
                objDeserializeWithType = this._valueDeserializer.deserialize(jsonParser, deserializationContext);
            } else {
                objDeserializeWithType = this._valueDeserializer.deserializeWithType(jsonParser, deserializationContext, abstractC5597Xv);
            }
        } else {
            Object referenced = getReferenced(t);
            if (referenced == null) {
                AbstractC5597Xv abstractC5597Xv2 = this._valueTypeDeserializer;
                if (abstractC5597Xv2 == null) {
                    objDeserializeWithType2 = this._valueDeserializer.deserialize(jsonParser, deserializationContext);
                } else {
                    objDeserializeWithType2 = this._valueDeserializer.deserializeWithType(jsonParser, deserializationContext, abstractC5597Xv2);
                }
                return referenceValue(objDeserializeWithType2);
            }
            objDeserializeWithType = this._valueDeserializer.deserialize(jsonParser, deserializationContext, referenced);
        }
        return updateReference(t, objDeserializeWithType);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer, o.AbstractC5548Vy
    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, AbstractC5597Xv abstractC5597Xv) throws IOException {
        if (jsonParser.copydefault(JsonToken.VALUE_NULL)) {
            return getNullValue(deserializationContext);
        }
        AbstractC5597Xv abstractC5597Xv2 = this._valueTypeDeserializer;
        if (abstractC5597Xv2 == null) {
            return deserialize(jsonParser, deserializationContext);
        }
        return referenceValue(abstractC5597Xv2.deserializeTypedFromAny(jsonParser, deserializationContext));
    }
}
