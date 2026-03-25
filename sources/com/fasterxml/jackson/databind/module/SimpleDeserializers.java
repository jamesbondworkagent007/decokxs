package com.fasterxml.jackson.databind.module;

import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.databind.type.ClassKey;
import com.fasterxml.jackson.databind.type.CollectionLikeType;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.fasterxml.jackson.databind.type.MapType;
import com.fasterxml.jackson.databind.type.ReferenceType;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import o.AbstractC5548Vy;
import o.AbstractC5549Vz;
import o.AbstractC5597Xv;
import o.InterfaceC5559Wj;
import o.VC;

/* JADX INFO: loaded from: classes21.dex */
public class SimpleDeserializers extends InterfaceC5559Wj.ActionBar implements Serializable {
    private static final long serialVersionUID = 1;
    protected HashMap<ClassKey, AbstractC5548Vy<?>> _classMappings = null;
    protected boolean _hasEnumDeserializer = false;

    public SimpleDeserializers() {
    }

    public SimpleDeserializers(Map<Class<?>, AbstractC5548Vy<?>> map) {
        addDeserializers(map);
    }

    public <T> void addDeserializer(Class<T> cls, AbstractC5548Vy<? extends T> abstractC5548Vy) {
        ClassKey classKey = new ClassKey(cls);
        if (this._classMappings == null) {
            this._classMappings = new HashMap<>();
        }
        this._classMappings.put(classKey, abstractC5548Vy);
        if (cls == Enum.class) {
            this._hasEnumDeserializer = true;
        }
    }

    public void addDeserializers(Map<Class<?>, AbstractC5548Vy<?>> map) {
        for (Map.Entry<Class<?>, AbstractC5548Vy<?>> entry : map.entrySet()) {
            addDeserializer(entry.getKey(), entry.getValue());
        }
    }

    @Override // o.InterfaceC5559Wj.ActionBar, o.InterfaceC5559Wj
    public AbstractC5548Vy<?> findArrayDeserializer(ArrayType arrayType, DeserializationConfig deserializationConfig, AbstractC5549Vz abstractC5549Vz, AbstractC5597Xv abstractC5597Xv, AbstractC5548Vy<?> abstractC5548Vy) throws JsonMappingException {
        return _find(arrayType);
    }

    @Override // o.InterfaceC5559Wj.ActionBar, o.InterfaceC5559Wj
    public AbstractC5548Vy<?> findBeanDeserializer(JavaType javaType, DeserializationConfig deserializationConfig, AbstractC5549Vz abstractC5549Vz) throws JsonMappingException {
        return _find(javaType);
    }

    @Override // o.InterfaceC5559Wj.ActionBar, o.InterfaceC5559Wj
    public AbstractC5548Vy<?> findCollectionDeserializer(CollectionType collectionType, DeserializationConfig deserializationConfig, AbstractC5549Vz abstractC5549Vz, AbstractC5597Xv abstractC5597Xv, AbstractC5548Vy<?> abstractC5548Vy) throws JsonMappingException {
        return _find(collectionType);
    }

    @Override // o.InterfaceC5559Wj.ActionBar, o.InterfaceC5559Wj
    public AbstractC5548Vy<?> findCollectionLikeDeserializer(CollectionLikeType collectionLikeType, DeserializationConfig deserializationConfig, AbstractC5549Vz abstractC5549Vz, AbstractC5597Xv abstractC5597Xv, AbstractC5548Vy<?> abstractC5548Vy) throws JsonMappingException {
        return _find(collectionLikeType);
    }

    @Override // o.InterfaceC5559Wj.ActionBar, o.InterfaceC5559Wj
    public AbstractC5548Vy<?> findEnumDeserializer(Class<?> cls, DeserializationConfig deserializationConfig, AbstractC5549Vz abstractC5549Vz) throws JsonMappingException {
        HashMap<ClassKey, AbstractC5548Vy<?>> map = this._classMappings;
        if (map == null) {
            return null;
        }
        AbstractC5548Vy<?> abstractC5548Vy = map.get(new ClassKey(cls));
        return (abstractC5548Vy == null && this._hasEnumDeserializer && cls.isEnum()) ? this._classMappings.get(new ClassKey(Enum.class)) : abstractC5548Vy;
    }

    @Override // o.InterfaceC5559Wj.ActionBar, o.InterfaceC5559Wj
    public AbstractC5548Vy<?> findTreeNodeDeserializer(Class<? extends JsonNode> cls, DeserializationConfig deserializationConfig, AbstractC5549Vz abstractC5549Vz) throws JsonMappingException {
        HashMap<ClassKey, AbstractC5548Vy<?>> map = this._classMappings;
        if (map == null) {
            return null;
        }
        return map.get(new ClassKey(cls));
    }

    @Override // o.InterfaceC5559Wj.ActionBar, o.InterfaceC5559Wj
    public AbstractC5548Vy<?> findReferenceDeserializer(ReferenceType referenceType, DeserializationConfig deserializationConfig, AbstractC5549Vz abstractC5549Vz, AbstractC5597Xv abstractC5597Xv, AbstractC5548Vy<?> abstractC5548Vy) throws JsonMappingException {
        return _find(referenceType);
    }

    @Override // o.InterfaceC5559Wj.ActionBar, o.InterfaceC5559Wj
    public AbstractC5548Vy<?> findMapDeserializer(MapType mapType, DeserializationConfig deserializationConfig, AbstractC5549Vz abstractC5549Vz, VC vc, AbstractC5597Xv abstractC5597Xv, AbstractC5548Vy<?> abstractC5548Vy) throws JsonMappingException {
        return _find(mapType);
    }

    @Override // o.InterfaceC5559Wj.ActionBar, o.InterfaceC5559Wj
    public AbstractC5548Vy<?> findMapLikeDeserializer(MapLikeType mapLikeType, DeserializationConfig deserializationConfig, AbstractC5549Vz abstractC5549Vz, VC vc, AbstractC5597Xv abstractC5597Xv, AbstractC5548Vy<?> abstractC5548Vy) throws JsonMappingException {
        return _find(mapLikeType);
    }

    public boolean hasDeserializerFor(DeserializationConfig deserializationConfig, Class<?> cls) {
        HashMap<ClassKey, AbstractC5548Vy<?>> map = this._classMappings;
        return map != null && map.containsKey(new ClassKey(cls));
    }

    private final AbstractC5548Vy<?> _find(JavaType javaType) {
        HashMap<ClassKey, AbstractC5548Vy<?>> map = this._classMappings;
        if (map == null) {
            return null;
        }
        return map.get(new ClassKey(javaType.getRawClass()));
    }
}
