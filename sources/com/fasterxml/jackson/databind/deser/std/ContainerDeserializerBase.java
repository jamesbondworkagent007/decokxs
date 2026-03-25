package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.deser.impl.NullsConstantProvider;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.AccessPattern;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import o.AbstractC5548Vy;
import o.C5619Yr;
import o.InterfaceC5555Wf;

/* JADX INFO: loaded from: classes21.dex */
public abstract class ContainerDeserializerBase<T> extends StdDeserializer<T> {
    protected final JavaType _containerType;
    protected final InterfaceC5555Wf _nullProvider;
    protected final boolean _skipNullValues;
    protected final Boolean _unwrapSingle;

    public abstract AbstractC5548Vy<Object> getContentDeserializer();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer
    public JavaType getValueType() {
        return this._containerType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC5548Vy
    public Boolean supportsUpdate(DeserializationConfig deserializationConfig) {
        return Boolean.TRUE;
    }

    public ContainerDeserializerBase(JavaType javaType, InterfaceC5555Wf interfaceC5555Wf, Boolean bool) {
        super(javaType);
        this._containerType = javaType;
        this._unwrapSingle = bool;
        this._nullProvider = interfaceC5555Wf;
        this._skipNullValues = NullsConstantProvider.isSkipper(interfaceC5555Wf);
    }

    public ContainerDeserializerBase(JavaType javaType) {
        this(javaType, (InterfaceC5555Wf) null, (Boolean) null);
    }

    public ContainerDeserializerBase(ContainerDeserializerBase<?> containerDeserializerBase) {
        this(containerDeserializerBase, containerDeserializerBase._nullProvider, containerDeserializerBase._unwrapSingle);
    }

    public ContainerDeserializerBase(ContainerDeserializerBase<?> containerDeserializerBase, InterfaceC5555Wf interfaceC5555Wf, Boolean bool) {
        super(containerDeserializerBase._containerType);
        this._containerType = containerDeserializerBase._containerType;
        this._nullProvider = interfaceC5555Wf;
        this._unwrapSingle = bool;
        this._skipNullValues = NullsConstantProvider.isSkipper(interfaceC5555Wf);
    }

    @Override // o.AbstractC5548Vy
    public SettableBeanProperty findBackReference(String str) {
        AbstractC5548Vy<Object> contentDeserializer = getContentDeserializer();
        if (contentDeserializer == null) {
            throw new IllegalArgumentException(String.format("Cannot handle managed/back reference '%s': type: container deserializer of type %s returned null for 'getContentDeserializer()'", str, getClass().getName()));
        }
        return contentDeserializer.findBackReference(str);
    }

    public JavaType getContentType() {
        JavaType javaType = this._containerType;
        if (javaType == null) {
            return TypeFactory.unknownType();
        }
        return javaType.getContentType();
    }

    @Override // o.AbstractC5548Vy
    public AccessPattern getEmptyAccessPattern() {
        return AccessPattern.DYNAMIC;
    }

    @Override // o.AbstractC5548Vy
    public Object getEmptyValue(DeserializationContext deserializationContext) throws JsonMappingException {
        ValueInstantiator valueInstantiator = getValueInstantiator();
        if (valueInstantiator == null || !valueInstantiator.canCreateUsingDefault()) {
            JavaType valueType = getValueType();
            deserializationContext.reportBadDefinition(valueType, String.format("Cannot create empty instance of %s, no default Creator", valueType));
        }
        try {
            return valueInstantiator.createUsingDefault(deserializationContext);
        } catch (IOException e) {
            return C5619Yr.copydefault(deserializationContext, e);
        }
    }

    @Deprecated
    public <BOGUS> BOGUS wrapAndThrow(Throwable th, Object obj, String str) throws IOException {
        return (BOGUS) wrapAndThrow(null, th, obj, str);
    }

    public <BOGUS> BOGUS wrapAndThrow(DeserializationContext deserializationContext, Throwable th, Object obj, String str) throws IOException {
        while ((th instanceof InvocationTargetException) && th.getCause() != null) {
            th = th.getCause();
        }
        C5619Yr.copydefault(th);
        if (deserializationContext != null && !deserializationContext.isEnabled(DeserializationFeature.WRAP_EXCEPTIONS)) {
            C5619Yr.AhwBna(th);
        }
        if ((th instanceof IOException) && !(th instanceof JsonMappingException)) {
            throw ((IOException) th);
        }
        throw JsonMappingException.wrapWithPath(th, obj, (String) C5619Yr.KWHzl(str, "N/A"));
    }
}
