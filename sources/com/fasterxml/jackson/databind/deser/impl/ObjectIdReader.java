package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import java.io.IOException;
import java.io.Serializable;
import o.AbstractC5548Vy;
import o.InterfaceC5500Ud;

/* JADX INFO: loaded from: classes21.dex */
public class ObjectIdReader implements Serializable {
    private static final long serialVersionUID = 1;
    protected final AbstractC5548Vy<Object> _deserializer;
    protected final JavaType _idType;
    public final ObjectIdGenerator<?> generator;
    public final SettableBeanProperty idProperty;
    public final PropertyName propertyName;
    public final InterfaceC5500Ud resolver;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AbstractC5548Vy<Object> getDeserializer() {
        return this._deserializer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public JavaType getIdType() {
        return this._idType;
    }

    public ObjectIdReader(JavaType javaType, PropertyName propertyName, ObjectIdGenerator<?> objectIdGenerator, AbstractC5548Vy<?> abstractC5548Vy, SettableBeanProperty settableBeanProperty, InterfaceC5500Ud interfaceC5500Ud) {
        this._idType = javaType;
        this.propertyName = propertyName;
        this.generator = objectIdGenerator;
        this.resolver = interfaceC5500Ud;
        this._deserializer = abstractC5548Vy;
        this.idProperty = settableBeanProperty;
    }

    public static ObjectIdReader construct(JavaType javaType, PropertyName propertyName, ObjectIdGenerator<?> objectIdGenerator, AbstractC5548Vy<?> abstractC5548Vy, SettableBeanProperty settableBeanProperty, InterfaceC5500Ud interfaceC5500Ud) {
        return new ObjectIdReader(javaType, propertyName, objectIdGenerator, abstractC5548Vy, settableBeanProperty, interfaceC5500Ud);
    }

    public boolean maySerializeAsObject() {
        return this.generator.maySerializeAsObject();
    }

    public boolean isValidReferencePropertyName(String str, JsonParser jsonParser) {
        return this.generator.isValidReferencePropertyName(str, jsonParser);
    }

    public Object readObjectReference(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        return this._deserializer.deserialize(jsonParser, deserializationContext);
    }
}
