package com.fasterxml.jackson.databind.module;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.databind.type.ClassKey;
import com.fasterxml.jackson.databind.type.CollectionLikeType;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.fasterxml.jackson.databind.type.MapType;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import o.AbstractC5549Vz;
import o.AbstractC5601Xz;
import o.InterfaceC5605Yd;
import o.VD;

/* JADX INFO: loaded from: classes21.dex */
public class SimpleSerializers extends InterfaceC5605Yd.StateListAnimator implements Serializable {
    private static final long serialVersionUID = 3;
    protected HashMap<ClassKey, VD<?>> _classMappings = null;
    protected HashMap<ClassKey, VD<?>> _interfaceMappings = null;
    protected boolean _hasEnumSerializer = false;

    public SimpleSerializers() {
    }

    public SimpleSerializers(List<VD<?>> list) {
        addSerializers(list);
    }

    public void addSerializer(VD<?> vd) {
        Class<?> clsHandledType = vd.handledType();
        if (clsHandledType == null || clsHandledType == Object.class) {
            throw new IllegalArgumentException("JsonSerializer of type " + vd.getClass().getName() + " does not define valid handledType() -- must either register with method that takes type argument  or make serializer extend 'com.fasterxml.jackson.databind.ser.std.StdSerializer'");
        }
        _addSerializer(clsHandledType, vd);
    }

    public <T> void addSerializer(Class<? extends T> cls, VD<T> vd) {
        _addSerializer(cls, vd);
    }

    public void addSerializers(List<VD<?>> list) {
        Iterator<VD<?>> it = list.iterator();
        while (it.hasNext()) {
            addSerializer(it.next());
        }
    }

    @Override // o.InterfaceC5605Yd.StateListAnimator, o.InterfaceC5605Yd
    public VD<?> findSerializer(SerializationConfig serializationConfig, JavaType javaType, AbstractC5549Vz abstractC5549Vz) {
        VD<?> vd_findInterfaceMapping;
        VD<?> vd;
        Class<?> rawClass = javaType.getRawClass();
        ClassKey classKey = new ClassKey(rawClass);
        if (rawClass.isInterface()) {
            HashMap<ClassKey, VD<?>> map = this._interfaceMappings;
            if (map != null && (vd = map.get(classKey)) != null) {
                return vd;
            }
        } else {
            HashMap<ClassKey, VD<?>> map2 = this._classMappings;
            if (map2 != null) {
                VD<?> vd2 = map2.get(classKey);
                if (vd2 != null) {
                    return vd2;
                }
                if (this._hasEnumSerializer && javaType.isEnumType()) {
                    classKey.reset(Enum.class);
                    VD<?> vd3 = this._classMappings.get(classKey);
                    if (vd3 != null) {
                        return vd3;
                    }
                }
                for (Class<?> superclass = rawClass; superclass != null; superclass = superclass.getSuperclass()) {
                    classKey.reset(superclass);
                    VD<?> vd4 = this._classMappings.get(classKey);
                    if (vd4 != null) {
                        return vd4;
                    }
                }
            }
        }
        if (this._interfaceMappings == null) {
            return null;
        }
        VD<?> vd_findInterfaceMapping2 = _findInterfaceMapping(rawClass, classKey);
        if (vd_findInterfaceMapping2 != null) {
            return vd_findInterfaceMapping2;
        }
        if (rawClass.isInterface()) {
            return null;
        }
        do {
            rawClass = rawClass.getSuperclass();
            if (rawClass == null) {
                return null;
            }
            vd_findInterfaceMapping = _findInterfaceMapping(rawClass, classKey);
        } while (vd_findInterfaceMapping == null);
        return vd_findInterfaceMapping;
    }

    @Override // o.InterfaceC5605Yd.StateListAnimator, o.InterfaceC5605Yd
    public VD<?> findArraySerializer(SerializationConfig serializationConfig, ArrayType arrayType, AbstractC5549Vz abstractC5549Vz, AbstractC5601Xz abstractC5601Xz, VD<Object> vd) {
        return findSerializer(serializationConfig, arrayType, abstractC5549Vz);
    }

    @Override // o.InterfaceC5605Yd.StateListAnimator, o.InterfaceC5605Yd
    public VD<?> findCollectionSerializer(SerializationConfig serializationConfig, CollectionType collectionType, AbstractC5549Vz abstractC5549Vz, AbstractC5601Xz abstractC5601Xz, VD<Object> vd) {
        return findSerializer(serializationConfig, collectionType, abstractC5549Vz);
    }

    @Override // o.InterfaceC5605Yd.StateListAnimator, o.InterfaceC5605Yd
    public VD<?> findCollectionLikeSerializer(SerializationConfig serializationConfig, CollectionLikeType collectionLikeType, AbstractC5549Vz abstractC5549Vz, AbstractC5601Xz abstractC5601Xz, VD<Object> vd) {
        return findSerializer(serializationConfig, collectionLikeType, abstractC5549Vz);
    }

    @Override // o.InterfaceC5605Yd.StateListAnimator, o.InterfaceC5605Yd
    public VD<?> findMapSerializer(SerializationConfig serializationConfig, MapType mapType, AbstractC5549Vz abstractC5549Vz, VD<Object> vd, AbstractC5601Xz abstractC5601Xz, VD<Object> vd2) {
        return findSerializer(serializationConfig, mapType, abstractC5549Vz);
    }

    @Override // o.InterfaceC5605Yd.StateListAnimator, o.InterfaceC5605Yd
    public VD<?> findMapLikeSerializer(SerializationConfig serializationConfig, MapLikeType mapLikeType, AbstractC5549Vz abstractC5549Vz, VD<Object> vd, AbstractC5601Xz abstractC5601Xz, VD<Object> vd2) {
        return findSerializer(serializationConfig, mapLikeType, abstractC5549Vz);
    }

    public VD<?> _findInterfaceMapping(Class<?> cls, ClassKey classKey) {
        for (Class<?> cls2 : cls.getInterfaces()) {
            classKey.reset(cls2);
            VD<?> vd = this._interfaceMappings.get(classKey);
            if (vd != null) {
                return vd;
            }
            VD<?> vd_findInterfaceMapping = _findInterfaceMapping(cls2, classKey);
            if (vd_findInterfaceMapping != null) {
                return vd_findInterfaceMapping;
            }
        }
        return null;
    }

    public void _addSerializer(Class<?> cls, VD<?> vd) {
        ClassKey classKey = new ClassKey(cls);
        if (cls.isInterface()) {
            if (this._interfaceMappings == null) {
                this._interfaceMappings = new HashMap<>();
            }
            this._interfaceMappings.put(classKey, vd);
        } else {
            if (this._classMappings == null) {
                this._classMappings = new HashMap<>();
            }
            this._classMappings.put(classKey, vd);
            if (cls == Enum.class) {
                this._hasEnumSerializer = true;
            }
        }
    }
}
