package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.DefaultAccessorNamingStrategy;
import com.fasterxml.jackson.databind.type.SimpleType;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import o.AbstractC5549Vz;
import o.C5577Xb;
import o.C5619Yr;
import o.WJ;
import o.WN;
import o.WW;
import o.WX;

/* JADX INFO: loaded from: classes21.dex */
public class BasicClassIntrospector extends WX implements Serializable {
    protected static final WW BOOLEAN_DESC;
    protected static final WW INT_DESC;
    protected static final WW LONG_DESC;
    protected static final WW OBJECT_DESC;
    private static final long serialVersionUID = 2;
    private static final Class<?> CLS_OBJECT = Object.class;
    private static final Class<?> CLS_STRING = String.class;
    private static final Class<?> CLS_JSON_NODE = JsonNode.class;
    protected static final WW STRING_DESC = WW.EZpvd(null, SimpleType.constructUnsafe(String.class), WN.EZpvd(String.class));

    @Override // o.WX
    public /* bridge */ /* synthetic */ AbstractC5549Vz forClassAnnotations(MapperConfig mapperConfig, JavaType javaType, WX.TaskDescription taskDescription) {
        return forClassAnnotations((MapperConfig<?>) mapperConfig, javaType, taskDescription);
    }

    @Override // o.WX
    public /* bridge */ /* synthetic */ AbstractC5549Vz forDirectClassAnnotations(MapperConfig mapperConfig, JavaType javaType, WX.TaskDescription taskDescription) {
        return forDirectClassAnnotations((MapperConfig<?>) mapperConfig, javaType, taskDescription);
    }

    static {
        Class cls = Boolean.TYPE;
        BOOLEAN_DESC = WW.EZpvd(null, SimpleType.constructUnsafe(cls), WN.EZpvd(cls));
        Class cls2 = Integer.TYPE;
        INT_DESC = WW.EZpvd(null, SimpleType.constructUnsafe(cls2), WN.EZpvd(cls2));
        Class cls3 = Long.TYPE;
        LONG_DESC = WW.EZpvd(null, SimpleType.constructUnsafe(cls3), WN.EZpvd(cls3));
        OBJECT_DESC = WW.EZpvd(null, SimpleType.constructUnsafe(Object.class), WN.EZpvd(Object.class));
    }

    @Override // o.WX
    public WX copy() {
        return new BasicClassIntrospector();
    }

    /* JADX DEBUG: Method merged with bridge method: forSerialization(Lcom/fasterxml/jackson/databind/SerializationConfig;Lcom/fasterxml/jackson/databind/JavaType;Lo/WX$TaskDescription;)Lo/Vz; */
    @Override // o.WX
    public WW forSerialization(SerializationConfig serializationConfig, JavaType javaType, WX.TaskDescription taskDescription) {
        WW ww_findStdTypeDesc = _findStdTypeDesc(serializationConfig, javaType);
        if (ww_findStdTypeDesc != null) {
            return ww_findStdTypeDesc;
        }
        WW ww_findStdJdkCollectionDesc = _findStdJdkCollectionDesc(serializationConfig, javaType);
        return ww_findStdJdkCollectionDesc == null ? WW.AEQbTJ(collectProperties(serializationConfig, javaType, taskDescription, true)) : ww_findStdJdkCollectionDesc;
    }

    /* JADX DEBUG: Method merged with bridge method: forDeserialization(Lcom/fasterxml/jackson/databind/DeserializationConfig;Lcom/fasterxml/jackson/databind/JavaType;Lo/WX$TaskDescription;)Lo/Vz; */
    @Override // o.WX
    public WW forDeserialization(DeserializationConfig deserializationConfig, JavaType javaType, WX.TaskDescription taskDescription) {
        WW ww_findStdTypeDesc = _findStdTypeDesc(deserializationConfig, javaType);
        if (ww_findStdTypeDesc != null) {
            return ww_findStdTypeDesc;
        }
        WW ww_findStdJdkCollectionDesc = _findStdJdkCollectionDesc(deserializationConfig, javaType);
        return ww_findStdJdkCollectionDesc == null ? WW.copydefault(collectProperties(deserializationConfig, javaType, taskDescription, false)) : ww_findStdJdkCollectionDesc;
    }

    /* JADX DEBUG: Method merged with bridge method: forDeserializationWithBuilder(Lcom/fasterxml/jackson/databind/DeserializationConfig;Lcom/fasterxml/jackson/databind/JavaType;Lo/WX$TaskDescription;Lo/Vz;)Lo/Vz; */
    @Override // o.WX
    public WW forDeserializationWithBuilder(DeserializationConfig deserializationConfig, JavaType javaType, WX.TaskDescription taskDescription, AbstractC5549Vz abstractC5549Vz) {
        return WW.copydefault(collectPropertiesWithBuilder(deserializationConfig, javaType, taskDescription, abstractC5549Vz, false));
    }

    /* JADX DEBUG: Method merged with bridge method: forDeserializationWithBuilder(Lcom/fasterxml/jackson/databind/DeserializationConfig;Lcom/fasterxml/jackson/databind/JavaType;Lo/WX$TaskDescription;)Lo/Vz; */
    @Override // o.WX
    @Deprecated
    public WW forDeserializationWithBuilder(DeserializationConfig deserializationConfig, JavaType javaType, WX.TaskDescription taskDescription) {
        return WW.copydefault(collectPropertiesWithBuilder(deserializationConfig, javaType, taskDescription, null, false));
    }

    /* JADX DEBUG: Method merged with bridge method: forCreation(Lcom/fasterxml/jackson/databind/DeserializationConfig;Lcom/fasterxml/jackson/databind/JavaType;Lo/WX$TaskDescription;)Lo/Vz; */
    @Override // o.WX
    public WW forCreation(DeserializationConfig deserializationConfig, JavaType javaType, WX.TaskDescription taskDescription) {
        WW ww_findStdTypeDesc = _findStdTypeDesc(deserializationConfig, javaType);
        if (ww_findStdTypeDesc != null) {
            return ww_findStdTypeDesc;
        }
        WW ww_findStdJdkCollectionDesc = _findStdJdkCollectionDesc(deserializationConfig, javaType);
        return ww_findStdJdkCollectionDesc == null ? WW.copydefault(collectProperties(deserializationConfig, javaType, taskDescription, false)) : ww_findStdJdkCollectionDesc;
    }

    @Override // o.WX
    public WW forClassAnnotations(MapperConfig<?> mapperConfig, JavaType javaType, WX.TaskDescription taskDescription) {
        WW ww_findStdTypeDesc = _findStdTypeDesc(mapperConfig, javaType);
        return ww_findStdTypeDesc == null ? WW.EZpvd(mapperConfig, javaType, _resolveAnnotatedClass(mapperConfig, javaType, taskDescription)) : ww_findStdTypeDesc;
    }

    @Override // o.WX
    public WW forDirectClassAnnotations(MapperConfig<?> mapperConfig, JavaType javaType, WX.TaskDescription taskDescription) {
        WW ww_findStdTypeDesc = _findStdTypeDesc(mapperConfig, javaType);
        return ww_findStdTypeDesc == null ? WW.EZpvd(mapperConfig, javaType, _resolveAnnotatedWithoutSuperTypes(mapperConfig, javaType, taskDescription)) : ww_findStdTypeDesc;
    }

    public C5577Xb collectProperties(MapperConfig<?> mapperConfig, JavaType javaType, WX.TaskDescription taskDescription, boolean z) {
        AccessorNamingStrategy accessorNamingStrategyForPOJO;
        WJ wj_resolveAnnotatedClass = _resolveAnnotatedClass(mapperConfig, javaType, taskDescription);
        if (javaType.isRecordType()) {
            accessorNamingStrategyForPOJO = mapperConfig.getAccessorNaming().forRecord(mapperConfig, wj_resolveAnnotatedClass);
        } else {
            accessorNamingStrategyForPOJO = mapperConfig.getAccessorNaming().forPOJO(mapperConfig, wj_resolveAnnotatedClass);
        }
        return constructPropertyCollector(mapperConfig, wj_resolveAnnotatedClass, javaType, z, accessorNamingStrategyForPOJO);
    }

    @Deprecated
    public C5577Xb collectProperties(MapperConfig<?> mapperConfig, JavaType javaType, WX.TaskDescription taskDescription, boolean z, String str) {
        WJ wj_resolveAnnotatedClass = _resolveAnnotatedClass(mapperConfig, javaType, taskDescription);
        return constructPropertyCollector(mapperConfig, wj_resolveAnnotatedClass, javaType, z, new DefaultAccessorNamingStrategy.Provider().withSetterPrefix(str).forPOJO(mapperConfig, wj_resolveAnnotatedClass));
    }

    public C5577Xb collectPropertiesWithBuilder(MapperConfig<?> mapperConfig, JavaType javaType, WX.TaskDescription taskDescription, AbstractC5549Vz abstractC5549Vz, boolean z) {
        WJ wj_resolveAnnotatedClass = _resolveAnnotatedClass(mapperConfig, javaType, taskDescription);
        return constructPropertyCollector(mapperConfig, wj_resolveAnnotatedClass, javaType, z, mapperConfig.getAccessorNaming().forBuilder(mapperConfig, wj_resolveAnnotatedClass, abstractC5549Vz));
    }

    @Deprecated
    public C5577Xb collectPropertiesWithBuilder(MapperConfig<?> mapperConfig, JavaType javaType, WX.TaskDescription taskDescription, boolean z) {
        return collectPropertiesWithBuilder(mapperConfig, javaType, taskDescription, null, z);
    }

    public C5577Xb constructPropertyCollector(MapperConfig<?> mapperConfig, WJ wj, JavaType javaType, boolean z, AccessorNamingStrategy accessorNamingStrategy) {
        return new C5577Xb(mapperConfig, z, javaType, wj, accessorNamingStrategy);
    }

    @Deprecated
    public C5577Xb constructPropertyCollector(MapperConfig<?> mapperConfig, WJ wj, JavaType javaType, boolean z, String str) {
        return new C5577Xb(mapperConfig, z, javaType, wj, str);
    }

    public WW _findStdTypeDesc(MapperConfig<?> mapperConfig, JavaType javaType) {
        Class<?> rawClass = javaType.getRawClass();
        if (rawClass.isPrimitive()) {
            if (rawClass == Integer.TYPE) {
                return INT_DESC;
            }
            if (rawClass == Long.TYPE) {
                return LONG_DESC;
            }
            if (rawClass == Boolean.TYPE) {
                return BOOLEAN_DESC;
            }
            return null;
        }
        if (!C5619Yr.fARcdN(rawClass)) {
            if (CLS_JSON_NODE.isAssignableFrom(rawClass)) {
                return WW.EZpvd(mapperConfig, javaType, WN.EZpvd(rawClass));
            }
            return null;
        }
        if (rawClass == CLS_OBJECT) {
            return OBJECT_DESC;
        }
        if (rawClass == CLS_STRING) {
            return STRING_DESC;
        }
        if (rawClass == Integer.class) {
            return INT_DESC;
        }
        if (rawClass == Long.class) {
            return LONG_DESC;
        }
        if (rawClass == Boolean.class) {
            return BOOLEAN_DESC;
        }
        return null;
    }

    public boolean _isStdJDKCollection(JavaType javaType) {
        if (!javaType.isContainerType() || javaType.isArrayType()) {
            return false;
        }
        Class<?> rawClass = javaType.getRawClass();
        if (C5619Yr.fARcdN(rawClass)) {
            return Collection.class.isAssignableFrom(rawClass) || Map.class.isAssignableFrom(rawClass);
        }
        return false;
    }

    public WW _findStdJdkCollectionDesc(MapperConfig<?> mapperConfig, JavaType javaType) {
        if (_isStdJDKCollection(javaType)) {
            return WW.EZpvd(mapperConfig, javaType, _resolveAnnotatedClass(mapperConfig, javaType, mapperConfig));
        }
        return null;
    }

    public WJ _resolveAnnotatedClass(MapperConfig<?> mapperConfig, JavaType javaType, WX.TaskDescription taskDescription) {
        return WN.KWHzl(mapperConfig, javaType, taskDescription);
    }

    public WJ _resolveAnnotatedWithoutSuperTypes(MapperConfig<?> mapperConfig, JavaType javaType, WX.TaskDescription taskDescription) {
        return WN.OLrzqt(mapperConfig, javaType, taskDescription);
    }
}
