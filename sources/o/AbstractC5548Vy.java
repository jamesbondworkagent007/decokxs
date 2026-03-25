package o;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReader;
import com.fasterxml.jackson.databind.type.LogicalType;
import com.fasterxml.jackson.databind.util.AccessPattern;
import com.fasterxml.jackson.databind.util.NameTransformer;

/* JADX INFO: renamed from: o.Vy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public abstract class AbstractC5548Vy<T> implements InterfaceC5555Wf {
    public abstract T deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws java.io.IOException;

    public AbstractC5548Vy<?> getDelegatee() {
        return null;
    }

    public java.util.Collection<java.lang.Object> getKnownPropertyNames() {
        return null;
    }

    @java.lang.Deprecated
    public T getNullValue() {
        return null;
    }

    public ObjectIdReader getObjectIdReader() {
        return null;
    }

    public java.lang.Class<?> handledType() {
        return null;
    }

    public boolean isCachable() {
        return false;
    }

    public LogicalType logicalType() {
        return null;
    }

    public java.lang.Boolean supportsUpdate(DeserializationConfig deserializationConfig) {
        return null;
    }

    public AbstractC5548Vy<T> unwrappingDeserializer(NameTransformer nameTransformer) {
        return this;
    }

    public T deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, T t) throws java.io.IOException {
        deserializationContext.handleBadMerge(this);
        return deserialize(jsonParser, deserializationContext);
    }

    public java.lang.Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, AbstractC5597Xv abstractC5597Xv) throws java.io.IOException {
        return abstractC5597Xv.deserializeTypedFromAny(jsonParser, deserializationContext);
    }

    public java.lang.Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, AbstractC5597Xv abstractC5597Xv, T t) throws java.io.IOException {
        deserializationContext.handleBadMerge(this);
        return deserializeWithType(jsonParser, deserializationContext, abstractC5597Xv);
    }

    public AbstractC5548Vy<?> replaceDelegatee(AbstractC5548Vy<?> abstractC5548Vy) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // o.InterfaceC5555Wf
    public T getNullValue(DeserializationContext deserializationContext) throws JsonMappingException {
        return getNullValue();
    }

    public AccessPattern getNullAccessPattern() {
        return AccessPattern.CONSTANT;
    }

    @Override // o.InterfaceC5555Wf
    public java.lang.Object getAbsentValue(DeserializationContext deserializationContext) throws JsonMappingException {
        return getNullValue(deserializationContext);
    }

    public java.lang.Object getEmptyValue(DeserializationContext deserializationContext) throws JsonMappingException {
        return getNullValue(deserializationContext);
    }

    public AccessPattern getEmptyAccessPattern() {
        return AccessPattern.DYNAMIC;
    }

    public SettableBeanProperty findBackReference(java.lang.String str) {
        throw new java.lang.IllegalArgumentException("Cannot handle managed/back reference '" + str + "': type: value deserializer of type " + getClass().getName() + " does not support them");
    }

    @java.lang.Deprecated
    public java.lang.Object getEmptyValue() {
        return getNullValue();
    }

    /* JADX INFO: renamed from: o.Vy$Activity */
    public static abstract class Activity extends AbstractC5548Vy<java.lang.Object> {
        private Activity() {
        }
    }
}
