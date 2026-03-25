package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer;
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.databind.type.CollectionLikeType;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.fasterxml.jackson.databind.type.MapType;
import com.fasterxml.jackson.databind.type.ReferenceType;
import com.fasterxml.jackson.databind.util.LRUMap;
import java.io.Serializable;
import java.util.HashMap;
import o.AbstractC5548Vy;
import o.AbstractC5549Vz;
import o.AbstractC5550Wa;
import o.C5619Yr;
import o.InterfaceC5557Wh;
import o.InterfaceC5621Yt;
import o.VC;
import o.WM;

/* JADX INFO: loaded from: classes21.dex */
public final class DeserializerCache implements Serializable {
    private static final long serialVersionUID = 1;
    protected final LRUMap<JavaType, AbstractC5548Vy<Object>> _cachedDeserializers;
    protected final HashMap<JavaType, AbstractC5548Vy<Object>> _incompleteDeserializers;

    public DeserializerCache() {
        this(2000);
    }

    public DeserializerCache(int i) {
        this._incompleteDeserializers = new HashMap<>(8);
        this._cachedDeserializers = new LRUMap<>(Math.min(64, i >> 2), i);
    }

    public Object writeReplace() {
        this._incompleteDeserializers.clear();
        return this;
    }

    public int cachedDeserializersCount() {
        return this._cachedDeserializers.size();
    }

    public void flushCachedDeserializers() {
        this._cachedDeserializers.clear();
    }

    public AbstractC5548Vy<Object> findValueDeserializer(DeserializationContext deserializationContext, AbstractC5550Wa abstractC5550Wa, JavaType javaType) throws JsonMappingException {
        AbstractC5548Vy<Object> abstractC5548Vy_findCachedDeserializer = _findCachedDeserializer(javaType);
        if (abstractC5548Vy_findCachedDeserializer != null) {
            return abstractC5548Vy_findCachedDeserializer;
        }
        AbstractC5548Vy<Object> abstractC5548Vy_createAndCacheValueDeserializer = _createAndCacheValueDeserializer(deserializationContext, abstractC5550Wa, javaType);
        return abstractC5548Vy_createAndCacheValueDeserializer == null ? _handleUnknownValueDeserializer(deserializationContext, javaType) : abstractC5548Vy_createAndCacheValueDeserializer;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: o.VC */
    /* JADX WARN: Multi-variable type inference failed */
    public VC findKeyDeserializer(DeserializationContext deserializationContext, AbstractC5550Wa abstractC5550Wa, JavaType javaType) throws JsonMappingException {
        VC vcCreateKeyDeserializer = abstractC5550Wa.createKeyDeserializer(deserializationContext, javaType);
        if (vcCreateKeyDeserializer == 0) {
            return _handleUnknownKeyDeserializer(deserializationContext, javaType);
        }
        if (vcCreateKeyDeserializer instanceof InterfaceC5557Wh) {
            ((InterfaceC5557Wh) vcCreateKeyDeserializer).resolve(deserializationContext);
        }
        return vcCreateKeyDeserializer;
    }

    public boolean hasValueDeserializerFor(DeserializationContext deserializationContext, AbstractC5550Wa abstractC5550Wa, JavaType javaType) throws JsonMappingException {
        AbstractC5548Vy<Object> abstractC5548Vy_findCachedDeserializer = _findCachedDeserializer(javaType);
        if (abstractC5548Vy_findCachedDeserializer == null) {
            abstractC5548Vy_findCachedDeserializer = _createAndCacheValueDeserializer(deserializationContext, abstractC5550Wa, javaType);
        }
        return abstractC5548Vy_findCachedDeserializer != null;
    }

    public AbstractC5548Vy<Object> _findCachedDeserializer(JavaType javaType) {
        if (javaType == null) {
            throw new IllegalArgumentException("Null JavaType passed");
        }
        if (_hasCustomHandlers(javaType)) {
            return null;
        }
        return this._cachedDeserializers.get(javaType);
    }

    public AbstractC5548Vy<Object> _createAndCacheValueDeserializer(DeserializationContext deserializationContext, AbstractC5550Wa abstractC5550Wa, JavaType javaType) throws JsonMappingException {
        AbstractC5548Vy<Object> abstractC5548Vy;
        synchronized (this._incompleteDeserializers) {
            AbstractC5548Vy<Object> abstractC5548Vy_findCachedDeserializer = _findCachedDeserializer(javaType);
            if (abstractC5548Vy_findCachedDeserializer != null) {
                return abstractC5548Vy_findCachedDeserializer;
            }
            int size = this._incompleteDeserializers.size();
            if (size > 0 && (abstractC5548Vy = this._incompleteDeserializers.get(javaType)) != null) {
                return abstractC5548Vy;
            }
            try {
                return _createAndCache2(deserializationContext, abstractC5550Wa, javaType);
            } finally {
                if (size == 0 && this._incompleteDeserializers.size() > 0) {
                    this._incompleteDeserializers.clear();
                }
            }
        }
    }

    public AbstractC5548Vy<Object> _createAndCache2(DeserializationContext deserializationContext, AbstractC5550Wa abstractC5550Wa, JavaType javaType) throws JsonMappingException {
        AbstractC5548Vy<Object> abstractC5548Vy_createDeserializer;
        try {
            abstractC5548Vy_createDeserializer = _createDeserializer(deserializationContext, abstractC5550Wa, javaType);
        } catch (IllegalArgumentException e) {
            deserializationContext.reportBadDefinition(javaType, C5619Yr.EZpvd((Throwable) e));
            abstractC5548Vy_createDeserializer = null;
        }
        if (abstractC5548Vy_createDeserializer == null) {
            return null;
        }
        boolean z = !_hasCustomHandlers(javaType) && abstractC5548Vy_createDeserializer.isCachable();
        if (abstractC5548Vy_createDeserializer instanceof InterfaceC5557Wh) {
            this._incompleteDeserializers.put(javaType, abstractC5548Vy_createDeserializer);
            ((InterfaceC5557Wh) abstractC5548Vy_createDeserializer).resolve(deserializationContext);
            this._incompleteDeserializers.remove(javaType);
        }
        if (z) {
            this._cachedDeserializers.put(javaType, abstractC5548Vy_createDeserializer);
        }
        return abstractC5548Vy_createDeserializer;
    }

    public AbstractC5548Vy<Object> _createDeserializer(DeserializationContext deserializationContext, AbstractC5550Wa abstractC5550Wa, JavaType javaType) throws JsonMappingException {
        DeserializationConfig config = deserializationContext.getConfig();
        if (javaType.isAbstract() || javaType.isMapLikeType() || javaType.isCollectionLikeType()) {
            javaType = abstractC5550Wa.mapAbstractType(config, javaType);
        }
        AbstractC5549Vz abstractC5549VzIntrospect = config.introspect(javaType);
        AbstractC5548Vy<Object> abstractC5548VyFindDeserializerFromAnnotation = findDeserializerFromAnnotation(deserializationContext, abstractC5549VzIntrospect.AuCTel());
        if (abstractC5548VyFindDeserializerFromAnnotation != null) {
            return abstractC5548VyFindDeserializerFromAnnotation;
        }
        JavaType javaTypeModifyTypeByAnnotation = modifyTypeByAnnotation(deserializationContext, abstractC5549VzIntrospect.AuCTel(), javaType);
        if (javaTypeModifyTypeByAnnotation != javaType) {
            abstractC5549VzIntrospect = config.introspect(javaTypeModifyTypeByAnnotation);
            javaType = javaTypeModifyTypeByAnnotation;
        }
        Class<?> clsValues = abstractC5549VzIntrospect.values();
        if (clsValues != null) {
            return abstractC5550Wa.createBuilderBasedDeserializer(deserializationContext, javaType, abstractC5549VzIntrospect, clsValues);
        }
        InterfaceC5621Yt<Object, Object> interfaceC5621YtAhwBna = abstractC5549VzIntrospect.AhwBna();
        if (interfaceC5621YtAhwBna == null) {
            return _createDeserializer2(deserializationContext, abstractC5550Wa, javaType, abstractC5549VzIntrospect);
        }
        JavaType javaTypeAEQbTJ = interfaceC5621YtAhwBna.AEQbTJ(deserializationContext.getTypeFactory());
        if (!javaTypeAEQbTJ.hasRawClass(javaType.getRawClass())) {
            abstractC5549VzIntrospect = config.introspect(javaTypeAEQbTJ);
        }
        return new StdDelegatingDeserializer(interfaceC5621YtAhwBna, javaTypeAEQbTJ, _createDeserializer2(deserializationContext, abstractC5550Wa, javaTypeAEQbTJ, abstractC5549VzIntrospect));
    }

    public AbstractC5548Vy<?> _createDeserializer2(DeserializationContext deserializationContext, AbstractC5550Wa abstractC5550Wa, JavaType javaType, AbstractC5549Vz abstractC5549Vz) throws JsonMappingException {
        DeserializationConfig config = deserializationContext.getConfig();
        if (javaType.isEnumType()) {
            return abstractC5550Wa.createEnumDeserializer(deserializationContext, javaType, abstractC5549Vz);
        }
        if (javaType.isContainerType()) {
            if (javaType.isArrayType()) {
                return abstractC5550Wa.createArrayDeserializer(deserializationContext, (ArrayType) javaType, abstractC5549Vz);
            }
            if (javaType.isMapLikeType() && abstractC5549Vz.OLrzqt(null).getShape() != JsonFormat.Shape.OBJECT) {
                MapLikeType mapLikeType = (MapLikeType) javaType;
                if (mapLikeType instanceof MapType) {
                    return abstractC5550Wa.createMapDeserializer(deserializationContext, (MapType) mapLikeType, abstractC5549Vz);
                }
                return abstractC5550Wa.createMapLikeDeserializer(deserializationContext, mapLikeType, abstractC5549Vz);
            }
            if (javaType.isCollectionLikeType() && abstractC5549Vz.OLrzqt(null).getShape() != JsonFormat.Shape.OBJECT) {
                CollectionLikeType collectionLikeType = (CollectionLikeType) javaType;
                if (collectionLikeType instanceof CollectionType) {
                    return abstractC5550Wa.createCollectionDeserializer(deserializationContext, (CollectionType) collectionLikeType, abstractC5549Vz);
                }
                return abstractC5550Wa.createCollectionLikeDeserializer(deserializationContext, collectionLikeType, abstractC5549Vz);
            }
        }
        if (javaType.isReferenceType()) {
            return abstractC5550Wa.createReferenceDeserializer(deserializationContext, (ReferenceType) javaType, abstractC5549Vz);
        }
        if (JsonNode.class.isAssignableFrom(javaType.getRawClass())) {
            return abstractC5550Wa.createTreeDeserializer(config, javaType, abstractC5549Vz);
        }
        return abstractC5550Wa.createBeanDeserializer(deserializationContext, javaType, abstractC5549Vz);
    }

    public AbstractC5548Vy<Object> findDeserializerFromAnnotation(DeserializationContext deserializationContext, WM wm) throws JsonMappingException {
        Object objFindDeserializer = deserializationContext.getAnnotationIntrospector().findDeserializer(wm);
        if (objFindDeserializer == null) {
            return null;
        }
        return findConvertingDeserializer(deserializationContext, wm, deserializationContext.deserializerInstance(wm, objFindDeserializer));
    }

    public AbstractC5548Vy<Object> findConvertingDeserializer(DeserializationContext deserializationContext, WM wm, AbstractC5548Vy<Object> abstractC5548Vy) throws JsonMappingException {
        InterfaceC5621Yt<Object, Object> interfaceC5621YtFindConverter = findConverter(deserializationContext, wm);
        return interfaceC5621YtFindConverter == null ? abstractC5548Vy : new StdDelegatingDeserializer(interfaceC5621YtFindConverter, interfaceC5621YtFindConverter.AEQbTJ(deserializationContext.getTypeFactory()), abstractC5548Vy);
    }

    public InterfaceC5621Yt<Object, Object> findConverter(DeserializationContext deserializationContext, WM wm) throws JsonMappingException {
        Object objFindDeserializationConverter = deserializationContext.getAnnotationIntrospector().findDeserializationConverter(wm);
        if (objFindDeserializationConverter == null) {
            return null;
        }
        return deserializationContext.converterInstance(wm, objFindDeserializationConverter);
    }

    private JavaType modifyTypeByAnnotation(DeserializationContext deserializationContext, WM wm, JavaType javaType) throws JsonMappingException {
        Object objFindContentDeserializer;
        AbstractC5548Vy<Object> abstractC5548VyDeserializerInstance;
        JavaType keyType;
        Object objFindKeyDeserializer;
        VC vcKeyDeserializerInstance;
        AnnotationIntrospector annotationIntrospector = deserializationContext.getAnnotationIntrospector();
        if (annotationIntrospector == null) {
            return javaType;
        }
        if (javaType.isMapLikeType() && (keyType = javaType.getKeyType()) != null && keyType.getValueHandler() == null && (objFindKeyDeserializer = annotationIntrospector.findKeyDeserializer(wm)) != null && (vcKeyDeserializerInstance = deserializationContext.keyDeserializerInstance(wm, objFindKeyDeserializer)) != null) {
            javaType = ((MapLikeType) javaType).withKeyValueHandler(vcKeyDeserializerInstance);
        }
        JavaType contentType = javaType.getContentType();
        if (contentType != null && contentType.getValueHandler() == null && (objFindContentDeserializer = annotationIntrospector.findContentDeserializer(wm)) != null) {
            if (objFindContentDeserializer instanceof AbstractC5548Vy) {
                abstractC5548VyDeserializerInstance = (AbstractC5548Vy) objFindContentDeserializer;
            } else {
                Class<?> cls_verifyAsClass = _verifyAsClass(objFindContentDeserializer, "findContentDeserializer", AbstractC5548Vy.Activity.class);
                abstractC5548VyDeserializerInstance = cls_verifyAsClass != null ? deserializationContext.deserializerInstance(wm, cls_verifyAsClass) : null;
            }
            if (abstractC5548VyDeserializerInstance != null) {
                javaType = javaType.withContentValueHandler(abstractC5548VyDeserializerInstance);
            }
        }
        return annotationIntrospector.refineDeserializationType(deserializationContext.getConfig(), wm, javaType);
    }

    private boolean _hasCustomHandlers(JavaType javaType) {
        if (!javaType.isContainerType()) {
            return false;
        }
        JavaType contentType = javaType.getContentType();
        if (contentType == null || (contentType.getValueHandler() == null && contentType.getTypeHandler() == null)) {
            return javaType.isMapLikeType() && javaType.getKeyType().getValueHandler() != null;
        }
        return true;
    }

    private Class<?> _verifyAsClass(Object obj, String str, Class<?> cls) {
        if (obj == null) {
            return null;
        }
        if (!(obj instanceof Class)) {
            throw new IllegalStateException("AnnotationIntrospector." + str + "() returned value of type " + obj.getClass().getName() + ": expected type JsonSerializer or Class<JsonSerializer> instead");
        }
        Class<?> cls2 = (Class) obj;
        if (cls2 == cls || C5619Yr.fetchVPNInfo(cls2)) {
            return null;
        }
        return cls2;
    }

    public AbstractC5548Vy<Object> _handleUnknownValueDeserializer(DeserializationContext deserializationContext, JavaType javaType) throws JsonMappingException {
        if (!C5619Yr.values(javaType.getRawClass())) {
            return (AbstractC5548Vy) deserializationContext.reportBadDefinition(javaType, "Cannot find a Value deserializer for abstract type " + javaType);
        }
        return (AbstractC5548Vy) deserializationContext.reportBadDefinition(javaType, "Cannot find a Value deserializer for type " + javaType);
    }

    public VC _handleUnknownKeyDeserializer(DeserializationContext deserializationContext, JavaType javaType) throws JsonMappingException {
        return (VC) deserializationContext.reportBadDefinition(javaType, "Cannot find a (Map) Key deserializer for type " + javaType);
    }
}
