package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import o.AbstractC5601Xz;
import o.VD;
import o.VI;

/* JADX INFO: loaded from: classes21.dex */
public abstract class ContainerSerializer<T> extends StdSerializer<T> {
    public abstract ContainerSerializer<?> _withValueTypeSerializer(AbstractC5601Xz abstractC5601Xz);

    public abstract VD<?> getContentSerializer();

    public abstract JavaType getContentType();

    @Deprecated
    public boolean hasContentTypeAnnotation(VI vi, BeanProperty beanProperty) {
        return false;
    }

    public abstract boolean hasSingleElement(T t);

    public ContainerSerializer(Class<T> cls) {
        super(cls);
    }

    public ContainerSerializer(JavaType javaType) {
        super(javaType);
    }

    public ContainerSerializer(Class<?> cls, boolean z) {
        super(cls, z);
    }

    public ContainerSerializer(ContainerSerializer<?> containerSerializer) {
        super(containerSerializer._handledType, false);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.fasterxml.jackson.databind.ser.ContainerSerializer<T> */
    /* JADX WARN: Multi-variable type inference failed */
    public ContainerSerializer<?> withValueTypeSerializer(AbstractC5601Xz abstractC5601Xz) {
        return abstractC5601Xz == null ? this : _withValueTypeSerializer(abstractC5601Xz);
    }
}
