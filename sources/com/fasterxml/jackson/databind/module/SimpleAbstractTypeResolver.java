package com.fasterxml.jackson.databind.module;

import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.ClassKey;
import java.io.Serializable;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import o.AbstractC5547Vx;
import o.AbstractC5549Vz;

/* JADX INFO: loaded from: classes21.dex */
public class SimpleAbstractTypeResolver extends AbstractC5547Vx implements Serializable {
    private static final long serialVersionUID = 1;
    protected final HashMap<ClassKey, Class<?>> _mappings = new HashMap<>();

    @Override // o.AbstractC5547Vx
    @Deprecated
    public JavaType resolveAbstractType(DeserializationConfig deserializationConfig, JavaType javaType) {
        return null;
    }

    @Override // o.AbstractC5547Vx
    public JavaType resolveAbstractType(DeserializationConfig deserializationConfig, AbstractC5549Vz abstractC5549Vz) {
        return null;
    }

    public <T> SimpleAbstractTypeResolver addMapping(Class<T> cls, Class<? extends T> cls2) {
        if (cls == cls2) {
            throw new IllegalArgumentException("Cannot add mapping from class to itself");
        }
        if (!cls.isAssignableFrom(cls2)) {
            throw new IllegalArgumentException("Cannot add mapping from class " + cls.getName() + " to " + cls2.getName() + ", as latter is not a subtype of former");
        }
        if (!Modifier.isAbstract(cls.getModifiers())) {
            throw new IllegalArgumentException("Cannot add mapping from class " + cls.getName() + " since it is not abstract");
        }
        this._mappings.put(new ClassKey(cls), cls2);
        return this;
    }

    @Override // o.AbstractC5547Vx
    public JavaType findTypeMapping(DeserializationConfig deserializationConfig, JavaType javaType) {
        Class<?> cls = this._mappings.get(new ClassKey(javaType.getRawClass()));
        if (cls == null) {
            return null;
        }
        return deserializationConfig.getTypeFactory().constructSpecializedType(javaType, cls);
    }
}
