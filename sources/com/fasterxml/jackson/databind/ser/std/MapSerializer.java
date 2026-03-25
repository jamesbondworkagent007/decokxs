package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.IgnorePropertiesUtil;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import o.AbstractC5601Xz;
import o.AbstractC5604Yc;
import o.C5614Ym;
import o.C5617Yp;
import o.C5619Yr;
import o.InterfaceC5584Xi;
import o.InterfaceC5587Xl;
import o.VD;
import o.VI;
import o.VK;
import o.XT;
import o.XX;

/* JADX INFO: loaded from: classes21.dex */
@VK
public class MapSerializer extends ContainerSerializer<Map<?, ?>> implements XT {
    private static final long serialVersionUID = 1;
    protected AbstractC5604Yc _dynamicValueSerializers;
    protected final Object _filterId;
    protected final Set<String> _ignoredEntries;
    protected final Set<String> _includedEntries;
    protected final IgnorePropertiesUtil.Checker _inclusionChecker;
    protected VD<Object> _keySerializer;
    protected final JavaType _keyType;
    protected final BeanProperty _property;
    protected final boolean _sortKeys;
    protected final boolean _suppressNulls;
    protected final Object _suppressableValue;
    protected VD<Object> _valueSerializer;
    protected final JavaType _valueType;
    protected final boolean _valueTypeIsStatic;
    protected final AbstractC5601Xz _valueTypeSerializer;
    protected static final JavaType UNSPECIFIED_TYPE = TypeFactory.unknownType();
    public static final Object MARKER_FOR_EMPTY = JsonInclude.Include.NON_EMPTY;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
    public VD<?> getContentSerializer() {
        return this._valueSerializer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
    public JavaType getContentType() {
        return this._valueType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public VD<?> getKeySerializer() {
        return this._keySerializer;
    }

    public MapSerializer(Set<String> set, Set<String> set2, JavaType javaType, JavaType javaType2, boolean z, AbstractC5601Xz abstractC5601Xz, VD<?> vd, VD<?> vd2) {
        super(Map.class, false);
        set = (set == null || set.isEmpty()) ? null : set;
        this._ignoredEntries = set;
        this._includedEntries = set2;
        this._keyType = javaType;
        this._valueType = javaType2;
        this._valueTypeIsStatic = z;
        this._valueTypeSerializer = abstractC5601Xz;
        this._keySerializer = vd;
        this._valueSerializer = vd2;
        this._dynamicValueSerializers = AbstractC5604Yc.copydefault();
        this._property = null;
        this._filterId = null;
        this._sortKeys = false;
        this._suppressableValue = null;
        this._suppressNulls = false;
        this._inclusionChecker = IgnorePropertiesUtil.copydefault(set, set2);
    }

    @Deprecated
    public MapSerializer(Set<String> set, JavaType javaType, JavaType javaType2, boolean z, AbstractC5601Xz abstractC5601Xz, VD<?> vd, VD<?> vd2) {
        this(set, null, javaType, javaType2, z, abstractC5601Xz, vd, vd2);
    }

    public MapSerializer(MapSerializer mapSerializer, BeanProperty beanProperty, VD<?> vd, VD<?> vd2, Set<String> set, Set<String> set2) {
        super(Map.class, false);
        set = (set == null || set.isEmpty()) ? null : set;
        this._ignoredEntries = set;
        this._includedEntries = set2;
        this._keyType = mapSerializer._keyType;
        this._valueType = mapSerializer._valueType;
        this._valueTypeIsStatic = mapSerializer._valueTypeIsStatic;
        this._valueTypeSerializer = mapSerializer._valueTypeSerializer;
        this._keySerializer = vd;
        this._valueSerializer = vd2;
        this._dynamicValueSerializers = AbstractC5604Yc.copydefault();
        this._property = beanProperty;
        this._filterId = mapSerializer._filterId;
        this._sortKeys = mapSerializer._sortKeys;
        this._suppressableValue = mapSerializer._suppressableValue;
        this._suppressNulls = mapSerializer._suppressNulls;
        this._inclusionChecker = IgnorePropertiesUtil.copydefault(set, set2);
    }

    @Deprecated
    public MapSerializer(MapSerializer mapSerializer, BeanProperty beanProperty, VD<?> vd, VD<?> vd2, Set<String> set) {
        this(mapSerializer, beanProperty, vd, vd2, set, null);
    }

    public MapSerializer(MapSerializer mapSerializer, AbstractC5601Xz abstractC5601Xz, Object obj, boolean z) {
        super(Map.class, false);
        this._ignoredEntries = mapSerializer._ignoredEntries;
        this._includedEntries = mapSerializer._includedEntries;
        this._keyType = mapSerializer._keyType;
        this._valueType = mapSerializer._valueType;
        this._valueTypeIsStatic = mapSerializer._valueTypeIsStatic;
        this._valueTypeSerializer = abstractC5601Xz;
        this._keySerializer = mapSerializer._keySerializer;
        this._valueSerializer = mapSerializer._valueSerializer;
        this._dynamicValueSerializers = mapSerializer._dynamicValueSerializers;
        this._property = mapSerializer._property;
        this._filterId = mapSerializer._filterId;
        this._sortKeys = mapSerializer._sortKeys;
        this._suppressableValue = obj;
        this._suppressNulls = z;
        this._inclusionChecker = mapSerializer._inclusionChecker;
    }

    public MapSerializer(MapSerializer mapSerializer, Object obj, boolean z) {
        super(Map.class, false);
        this._ignoredEntries = mapSerializer._ignoredEntries;
        this._includedEntries = mapSerializer._includedEntries;
        this._keyType = mapSerializer._keyType;
        this._valueType = mapSerializer._valueType;
        this._valueTypeIsStatic = mapSerializer._valueTypeIsStatic;
        this._valueTypeSerializer = mapSerializer._valueTypeSerializer;
        this._keySerializer = mapSerializer._keySerializer;
        this._valueSerializer = mapSerializer._valueSerializer;
        this._dynamicValueSerializers = AbstractC5604Yc.copydefault();
        this._property = mapSerializer._property;
        this._filterId = obj;
        this._sortKeys = z;
        this._suppressableValue = mapSerializer._suppressableValue;
        this._suppressNulls = mapSerializer._suppressNulls;
        this._inclusionChecker = mapSerializer._inclusionChecker;
    }

    /* JADX DEBUG: Method merged with bridge method: _withValueTypeSerializer(Lo/Xz;)Lcom/fasterxml/jackson/databind/ser/ContainerSerializer; */
    @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
    public MapSerializer _withValueTypeSerializer(AbstractC5601Xz abstractC5601Xz) {
        if (this._valueTypeSerializer == abstractC5601Xz) {
            return this;
        }
        _ensureOverride("_withValueTypeSerializer");
        return new MapSerializer(this, abstractC5601Xz, this._suppressableValue, this._suppressNulls);
    }

    public MapSerializer withResolved(BeanProperty beanProperty, VD<?> vd, VD<?> vd2, Set<String> set, Set<String> set2, boolean z) {
        _ensureOverride("withResolved");
        MapSerializer mapSerializer = new MapSerializer(this, beanProperty, vd, vd2, set, set2);
        return z != mapSerializer._sortKeys ? new MapSerializer(mapSerializer, this._filterId, z) : mapSerializer;
    }

    public MapSerializer withResolved(BeanProperty beanProperty, VD<?> vd, VD<?> vd2, Set<String> set, boolean z) {
        return withResolved(beanProperty, vd, vd2, set, null, z);
    }

    /* JADX DEBUG: Method merged with bridge method: withFilterId(Ljava/lang/Object;)Lo/VD; */
    @Override // o.VD
    public MapSerializer withFilterId(Object obj) {
        if (this._filterId == obj) {
            return this;
        }
        _ensureOverride("withFilterId");
        return new MapSerializer(this, obj, this._sortKeys);
    }

    public MapSerializer withContentInclusion(Object obj, boolean z) {
        if (obj == this._suppressableValue && z == this._suppressNulls) {
            return this;
        }
        _ensureOverride("withContentInclusion");
        return new MapSerializer(this, this._valueTypeSerializer, obj, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static MapSerializer construct(Set<String> set, Set<String> set2, JavaType javaType, boolean z, AbstractC5601Xz abstractC5601Xz, VD<Object> vd, VD<Object> vd2, Object obj) {
        JavaType contentType;
        JavaType javaType2;
        JavaType javaType3;
        boolean z2;
        boolean z3;
        if (javaType == null) {
            javaType3 = UNSPECIFIED_TYPE;
            javaType2 = javaType3;
        } else {
            JavaType keyType = javaType.getKeyType();
            if (javaType.hasRawClass(Properties.class)) {
                contentType = TypeFactory.unknownType();
            } else {
                contentType = javaType.getContentType();
            }
            javaType2 = contentType;
            javaType3 = keyType;
        }
        if (!z) {
            if (javaType2 != null && javaType2.isFinal()) {
                z3 = true;
            }
            z2 = z3;
            MapSerializer mapSerializer = new MapSerializer(set, set2, javaType3, javaType2, z2, abstractC5601Xz, vd, vd2);
            return obj != null ? mapSerializer.withFilterId(obj) : mapSerializer;
        }
        if (javaType2.getRawClass() != Object.class) {
            z2 = z;
            MapSerializer mapSerializer2 = new MapSerializer(set, set2, javaType3, javaType2, z2, abstractC5601Xz, vd, vd2);
            if (obj != null) {
            }
        }
        z3 = false;
        z2 = z3;
        MapSerializer mapSerializer22 = new MapSerializer(set, set2, javaType3, javaType2, z2, abstractC5601Xz, vd, vd2);
        if (obj != null) {
        }
    }

    public static MapSerializer construct(Set<String> set, JavaType javaType, boolean z, AbstractC5601Xz abstractC5601Xz, VD<Object> vd, VD<Object> vd2, Object obj) {
        return construct(set, null, javaType, z, abstractC5601Xz, vd, vd2, obj);
    }

    public void _ensureOverride(String str) {
        C5619Yr.AEQbTJ((Class<?>) MapSerializer.class, this, str);
    }

    @Deprecated
    public void _ensureOverride() {
        _ensureOverride("N/A");
    }

    @Deprecated
    public MapSerializer(MapSerializer mapSerializer, AbstractC5601Xz abstractC5601Xz, Object obj) {
        this(mapSerializer, abstractC5601Xz, obj, false);
    }

    @Deprecated
    public MapSerializer withContentInclusion(Object obj) {
        return new MapSerializer(this, this._valueTypeSerializer, obj, this._suppressNulls);
    }

    @Deprecated
    public static MapSerializer construct(String[] strArr, JavaType javaType, boolean z, AbstractC5601Xz abstractC5601Xz, VD<Object> vd, VD<Object> vd2, Object obj) {
        return construct(C5617Yp.AEQbTJ(strArr), javaType, z, abstractC5601Xz, vd, vd2, obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:94:0x015e A[PHI: r1
  0x015e: PHI (r1v3 java.lang.Object) = (r1v1 java.lang.Object), (r1v0 java.lang.Object), (r1v4 java.lang.Object), (r1v0 java.lang.Object) binds: [B:93:0x015d, B:86:0x0142, B:81:0x0131, B:78:0x0126] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // o.XT
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public VD<?> createContextual(VI vi, BeanProperty beanProperty) throws JsonMappingException {
        VD<?> vdSerializerInstance;
        VD<Object> vdSerializerInstance2;
        VD<?> vdHandleSecondaryContextualization;
        Set<String> set;
        Set<String> set2;
        boolean zEquals;
        JsonInclude.Include contentInclusion;
        Object objOLrzqt;
        Object objFindFilterId;
        Boolean feature;
        AnnotationIntrospector annotationIntrospector = vi.getAnnotationIntrospector();
        Object objIncludeFilterInstance = null;
        AnnotatedMember member = beanProperty == null ? null : beanProperty.getMember();
        if (StdSerializer._neitherNull(member, annotationIntrospector)) {
            Object objFindKeySerializer = annotationIntrospector.findKeySerializer(member);
            vdSerializerInstance = objFindKeySerializer != null ? vi.serializerInstance(member, objFindKeySerializer) : null;
            Object objFindContentSerializer = annotationIntrospector.findContentSerializer(member);
            vdSerializerInstance2 = objFindContentSerializer != null ? vi.serializerInstance(member, objFindContentSerializer) : null;
        } else {
            vdSerializerInstance = null;
            vdSerializerInstance2 = null;
        }
        if (vdSerializerInstance2 == null) {
            vdSerializerInstance2 = this._valueSerializer;
        }
        VD<?> vdFindContextualConvertingSerializer = findContextualConvertingSerializer(vi, beanProperty, vdSerializerInstance2);
        if (vdFindContextualConvertingSerializer == null && this._valueTypeIsStatic && !this._valueType.isJavaLangObject()) {
            vdFindContextualConvertingSerializer = vi.findContentValueSerializer(this._valueType, beanProperty);
        }
        VD<?> vd = vdFindContextualConvertingSerializer;
        if (vdSerializerInstance == null) {
            vdSerializerInstance = this._keySerializer;
        }
        if (vdSerializerInstance == null) {
            vdHandleSecondaryContextualization = vi.findKeySerializer(this._keyType, beanProperty);
        } else {
            vdHandleSecondaryContextualization = vi.handleSecondaryContextualization(vdSerializerInstance, beanProperty);
        }
        VD<?> vd2 = vdHandleSecondaryContextualization;
        Set<String> hashSet = this._ignoredEntries;
        Set<String> hashSet2 = this._includedEntries;
        boolean zIncludeFilterSuppressNulls = false;
        if (StdSerializer._neitherNull(member, annotationIntrospector)) {
            SerializationConfig config = vi.getConfig();
            Set<String> setFindIgnoredForSerialization = annotationIntrospector.findPropertyIgnoralByName(config, member).findIgnoredForSerialization();
            if (StdSerializer._nonEmpty(setFindIgnoredForSerialization)) {
                hashSet = hashSet == null ? new HashSet<>() : new HashSet(hashSet);
                Iterator<String> it = setFindIgnoredForSerialization.iterator();
                while (it.hasNext()) {
                    hashSet.add(it.next());
                }
            }
            Set<String> included = annotationIntrospector.findPropertyInclusionByName(config, member).getIncluded();
            if (included != null) {
                hashSet2 = hashSet2 == null ? new HashSet<>() : new HashSet(hashSet2);
                Iterator<String> it2 = included.iterator();
                while (it2.hasNext()) {
                    hashSet2.add(it2.next());
                }
            }
            zEquals = Boolean.TRUE.equals(annotationIntrospector.findSerializationSortAlphabetically(member));
            set = hashSet;
            set2 = hashSet2;
        } else {
            set = hashSet;
            set2 = hashSet2;
            zEquals = false;
        }
        JsonFormat.Value valueFindFormatOverrides = findFormatOverrides(vi, beanProperty, Map.class);
        MapSerializer mapSerializerWithResolved = withResolved(beanProperty, vd2, vd, set, set2, (valueFindFormatOverrides == null || (feature = valueFindFormatOverrides.getFeature(JsonFormat.Feature.WRITE_SORTED_MAP_ENTRIES)) == null) ? zEquals : feature.booleanValue());
        if (member != null && (objFindFilterId = annotationIntrospector.findFilterId(member)) != null) {
            mapSerializerWithResolved = mapSerializerWithResolved.withFilterId(objFindFilterId);
        }
        JsonInclude.Value valueFindIncludeOverrides = findIncludeOverrides(vi, beanProperty, Map.class);
        if (valueFindIncludeOverrides == null || (contentInclusion = valueFindIncludeOverrides.getContentInclusion()) == JsonInclude.Include.USE_DEFAULTS) {
            return mapSerializerWithResolved;
        }
        int i = AnonymousClass1.KWHzl[contentInclusion.ordinal()];
        if (i == 1) {
            objOLrzqt = C5614Ym.OLrzqt(this._valueType);
            if (objOLrzqt != null && objOLrzqt.getClass().isArray()) {
                objOLrzqt = C5617Yp.OLrzqt(objOLrzqt);
            }
        } else {
            if (i == 2) {
                if (this._valueType.isReferenceType()) {
                    objOLrzqt = MARKER_FOR_EMPTY;
                }
                zIncludeFilterSuppressNulls = true;
            } else if (i == 3) {
                objOLrzqt = MARKER_FOR_EMPTY;
            } else if (i == 4) {
                objIncludeFilterInstance = vi.includeFilterInstance(null, valueFindIncludeOverrides.getContentFilter());
                if (objIncludeFilterInstance != null) {
                    zIncludeFilterSuppressNulls = vi.includeFilterSuppressNulls(objIncludeFilterInstance);
                }
            } else if (i == 5) {
                zIncludeFilterSuppressNulls = true;
            }
            return mapSerializerWithResolved.withContentInclusion(objIncludeFilterInstance, zIncludeFilterSuppressNulls);
        }
        objIncludeFilterInstance = objOLrzqt;
        zIncludeFilterSuppressNulls = true;
        return mapSerializerWithResolved.withContentInclusion(objIncludeFilterInstance, zIncludeFilterSuppressNulls);
    }

    /* JADX INFO: renamed from: com.fasterxml.jackson.databind.ser.std.MapSerializer$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] KWHzl;

        static {
            int[] iArr = new int[JsonInclude.Include.values().length];
            KWHzl = iArr;
            try {
                iArr[JsonInclude.Include.NON_DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                KWHzl[JsonInclude.Include.NON_ABSENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                KWHzl[JsonInclude.Include.NON_EMPTY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                KWHzl[JsonInclude.Include.CUSTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                KWHzl[JsonInclude.Include.NON_NULL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                KWHzl[JsonInclude.Include.ALWAYS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* JADX DEBUG: Method merged with bridge method: isEmpty(Lo/VI;Ljava/lang/Object;)Z */
    @Override // o.VD
    public boolean isEmpty(VI vi, Map<?, ?> map) {
        VD<Object> vd_findSerializer;
        if (map.isEmpty()) {
            return true;
        }
        Object obj = this._suppressableValue;
        if (obj == null && !this._suppressNulls) {
            return false;
        }
        VD<Object> vd = this._valueSerializer;
        boolean z = MARKER_FOR_EMPTY == obj;
        if (vd != null) {
            for (Object obj2 : map.values()) {
                if (obj2 == null) {
                    if (!this._suppressNulls) {
                        return false;
                    }
                } else if (z) {
                    if (!vd.isEmpty(vi, obj2)) {
                        return false;
                    }
                } else if (obj == null || !obj.equals(map)) {
                    return false;
                }
            }
            return true;
        }
        for (Object obj3 : map.values()) {
            if (obj3 != null) {
                try {
                    vd_findSerializer = _findSerializer(vi, obj3);
                } catch (DatabindException unused) {
                }
                if (z) {
                    if (!vd_findSerializer.isEmpty(vi, obj3)) {
                        return false;
                    }
                } else if (obj == null || !obj.equals(map)) {
                    return false;
                }
            } else if (!this._suppressNulls) {
                return false;
            }
        }
        return true;
    }

    /* JADX DEBUG: Method merged with bridge method: hasSingleElement(Ljava/lang/Object;)Z */
    @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
    public boolean hasSingleElement(Map<?, ?> map) {
        return map.size() == 1;
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Ljava/lang/Object;Lcom/fasterxml/jackson/core/JsonGenerator;Lo/VI;)V */
    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, o.VD
    public void serialize(Map<?, ?> map, JsonGenerator jsonGenerator, VI vi) throws IOException {
        jsonGenerator.AYXKKw(map);
        serializeWithoutTypeInfo(map, jsonGenerator, vi);
        jsonGenerator.DbNXlk();
    }

    /* JADX DEBUG: Method merged with bridge method: serializeWithType(Ljava/lang/Object;Lcom/fasterxml/jackson/core/JsonGenerator;Lo/VI;Lo/Xz;)V */
    @Override // o.VD
    public void serializeWithType(Map<?, ?> map, JsonGenerator jsonGenerator, VI vi, AbstractC5601Xz abstractC5601Xz) throws IOException {
        jsonGenerator.KWHzl(map);
        WritableTypeId writableTypeIdAEQbTJ = abstractC5601Xz.AEQbTJ(jsonGenerator, abstractC5601Xz.AEQbTJ(map, JsonToken.START_OBJECT));
        serializeWithoutTypeInfo(map, jsonGenerator, vi);
        abstractC5601Xz.copydefault(jsonGenerator, writableTypeIdAEQbTJ);
    }

    public void serializeWithoutTypeInfo(Map<?, ?> map, JsonGenerator jsonGenerator, VI vi) throws IOException {
        XX xxFindPropertyFilter;
        if (map.isEmpty()) {
            return;
        }
        if (this._sortKeys || vi.isEnabled(SerializationFeature.ORDER_MAP_ENTRIES_BY_KEYS)) {
            map = _orderEntries(map, jsonGenerator, vi);
        }
        Map<?, ?> map2 = map;
        Object obj = this._filterId;
        if (obj != null && (xxFindPropertyFilter = findPropertyFilter(vi, obj, map2)) != null) {
            serializeFilteredFields(map2, jsonGenerator, vi, xxFindPropertyFilter, this._suppressableValue);
            return;
        }
        Object obj2 = this._suppressableValue;
        if (obj2 != null || this._suppressNulls) {
            serializeOptionalFields(map2, jsonGenerator, vi, obj2);
            return;
        }
        VD<Object> vd = this._valueSerializer;
        if (vd != null) {
            serializeFieldsUsing(map2, jsonGenerator, vi, vd);
        } else {
            serializeFields(map2, jsonGenerator, vi);
        }
    }

    public void serializeFields(Map<?, ?> map, JsonGenerator jsonGenerator, VI vi) throws IOException {
        Object obj = null;
        if (this._valueTypeSerializer != null) {
            serializeTypedFields(map, jsonGenerator, vi, null);
            return;
        }
        VD<Object> vd = this._keySerializer;
        try {
            Object key = null;
            for (Map.Entry<?, ?> entry : map.entrySet()) {
                try {
                    Object value = entry.getValue();
                    key = entry.getKey();
                    if (key == null) {
                        vi.findNullKeySerializer(this._keyType, this._property).serialize(null, jsonGenerator, vi);
                    } else {
                        IgnorePropertiesUtil.Checker checker = this._inclusionChecker;
                        if (checker == null || !checker.shouldIgnore(key)) {
                            vd.serialize(key, jsonGenerator, vi);
                        }
                    }
                    if (value == null) {
                        vi.defaultSerializeNull(jsonGenerator);
                    } else {
                        VD<Object> vd_findSerializer = this._valueSerializer;
                        if (vd_findSerializer == null) {
                            vd_findSerializer = _findSerializer(vi, value);
                        }
                        vd_findSerializer.serialize(value, jsonGenerator, vi);
                    }
                } catch (Exception e) {
                    e = e;
                    obj = key;
                    wrapAndThrow(vi, e, map, String.valueOf(obj));
                    return;
                }
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0069 A[EXC_TOP_SPLITTER, PHI: r5
  0x0069: PHI (r5v3 o.VD<java.lang.Object>) = 
  (r5v2 o.VD<java.lang.Object>)
  (r5v5 o.VD<java.lang.Object>)
  (r5v5 o.VD<java.lang.Object>)
  (r5v5 o.VD<java.lang.Object>)
 binds: [B:27:0x004a, B:33:0x005d, B:35:0x0060, B:37:0x0066] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void serializeOptionalFields(Map<?, ?> map, JsonGenerator jsonGenerator, VI vi, Object obj) throws IOException {
        VD<Object> vdFindNullKeySerializer;
        VD<Object> defaultNullValueSerializer;
        if (this._valueTypeSerializer != null) {
            serializeTypedFields(map, jsonGenerator, vi, obj);
            return;
        }
        boolean z = MARKER_FOR_EMPTY == obj;
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            Object key = entry.getKey();
            if (key == null) {
                vdFindNullKeySerializer = vi.findNullKeySerializer(this._keyType, this._property);
            } else {
                IgnorePropertiesUtil.Checker checker = this._inclusionChecker;
                if (checker == null || !checker.shouldIgnore(key)) {
                    vdFindNullKeySerializer = this._keySerializer;
                }
            }
            Object value = entry.getValue();
            if (value != null) {
                defaultNullValueSerializer = this._valueSerializer;
                if (defaultNullValueSerializer == null) {
                    defaultNullValueSerializer = _findSerializer(vi, value);
                }
                if (z) {
                    if (!defaultNullValueSerializer.isEmpty(vi, value)) {
                        vdFindNullKeySerializer.serialize(key, jsonGenerator, vi);
                        defaultNullValueSerializer.serialize(value, jsonGenerator, vi);
                    }
                } else if (obj == null || !obj.equals(value)) {
                }
            } else if (!this._suppressNulls) {
                defaultNullValueSerializer = vi.getDefaultNullValueSerializer();
                try {
                    vdFindNullKeySerializer.serialize(key, jsonGenerator, vi);
                    defaultNullValueSerializer.serialize(value, jsonGenerator, vi);
                } catch (Exception e) {
                    wrapAndThrow(vi, e, map, String.valueOf(key));
                }
            }
        }
    }

    public void serializeFieldsUsing(Map<?, ?> map, JsonGenerator jsonGenerator, VI vi, VD<Object> vd) throws IOException {
        VD<Object> vd2 = this._keySerializer;
        AbstractC5601Xz abstractC5601Xz = this._valueTypeSerializer;
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            Object key = entry.getKey();
            IgnorePropertiesUtil.Checker checker = this._inclusionChecker;
            if (checker == null || !checker.shouldIgnore(key)) {
                if (key == null) {
                    vi.findNullKeySerializer(this._keyType, this._property).serialize(null, jsonGenerator, vi);
                } else {
                    vd2.serialize(key, jsonGenerator, vi);
                }
                Object value = entry.getValue();
                if (value == null) {
                    vi.defaultSerializeNull(jsonGenerator);
                } else if (abstractC5601Xz == null) {
                    try {
                        vd.serialize(value, jsonGenerator, vi);
                    } catch (Exception e) {
                        wrapAndThrow(vi, e, map, String.valueOf(key));
                    }
                } else {
                    vd.serializeWithType(value, jsonGenerator, vi, abstractC5601Xz);
                }
            }
        }
    }

    public void serializeFilteredFields(Map<?, ?> map, JsonGenerator jsonGenerator, VI vi, XX xx, Object obj) throws IOException {
        VD<Object> defaultNullValueSerializer;
        MapProperty mapProperty = new MapProperty(this._valueTypeSerializer, this._property);
        boolean z = MARKER_FOR_EMPTY == obj;
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            Object key = entry.getKey();
            IgnorePropertiesUtil.Checker checker = this._inclusionChecker;
            if (checker == null || !checker.shouldIgnore(key)) {
                VD<Object> vdFindNullKeySerializer = key == null ? vi.findNullKeySerializer(this._keyType, this._property) : this._keySerializer;
                Object value = entry.getValue();
                if (value != null) {
                    defaultNullValueSerializer = this._valueSerializer;
                    if (defaultNullValueSerializer == null) {
                        defaultNullValueSerializer = _findSerializer(vi, value);
                    }
                    if (z) {
                        if (!defaultNullValueSerializer.isEmpty(vi, value)) {
                            mapProperty.reset(key, value, vdFindNullKeySerializer, defaultNullValueSerializer);
                            xx.serializeAsField(map, jsonGenerator, vi, mapProperty);
                        }
                    } else if (obj == null || !obj.equals(value)) {
                        mapProperty.reset(key, value, vdFindNullKeySerializer, defaultNullValueSerializer);
                        xx.serializeAsField(map, jsonGenerator, vi, mapProperty);
                    }
                } else if (!this._suppressNulls) {
                    defaultNullValueSerializer = vi.getDefaultNullValueSerializer();
                    mapProperty.reset(key, value, vdFindNullKeySerializer, defaultNullValueSerializer);
                    try {
                        xx.serializeAsField(map, jsonGenerator, vi, mapProperty);
                    } catch (Exception e) {
                        wrapAndThrow(vi, e, map, String.valueOf(key));
                    }
                }
            }
        }
    }

    public void serializeTypedFields(Map<?, ?> map, JsonGenerator jsonGenerator, VI vi, Object obj) throws IOException {
        VD<Object> vdFindNullKeySerializer;
        VD<Object> defaultNullValueSerializer;
        boolean z = MARKER_FOR_EMPTY == obj;
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            Object key = entry.getKey();
            if (key == null) {
                vdFindNullKeySerializer = vi.findNullKeySerializer(this._keyType, this._property);
            } else {
                IgnorePropertiesUtil.Checker checker = this._inclusionChecker;
                if (checker == null || !checker.shouldIgnore(key)) {
                    vdFindNullKeySerializer = this._keySerializer;
                }
            }
            Object value = entry.getValue();
            if (value != null) {
                defaultNullValueSerializer = this._valueSerializer;
                if (defaultNullValueSerializer == null) {
                    defaultNullValueSerializer = _findSerializer(vi, value);
                }
                if (z) {
                    if (!defaultNullValueSerializer.isEmpty(vi, value)) {
                        vdFindNullKeySerializer.serialize(key, jsonGenerator, vi);
                        defaultNullValueSerializer.serializeWithType(value, jsonGenerator, vi, this._valueTypeSerializer);
                    }
                } else if (obj == null || !obj.equals(value)) {
                    vdFindNullKeySerializer.serialize(key, jsonGenerator, vi);
                    defaultNullValueSerializer.serializeWithType(value, jsonGenerator, vi, this._valueTypeSerializer);
                }
            } else if (!this._suppressNulls) {
                defaultNullValueSerializer = vi.getDefaultNullValueSerializer();
                vdFindNullKeySerializer.serialize(key, jsonGenerator, vi);
                try {
                    defaultNullValueSerializer.serializeWithType(value, jsonGenerator, vi, this._valueTypeSerializer);
                } catch (Exception e) {
                    wrapAndThrow(vi, e, map, String.valueOf(key));
                }
            }
        }
    }

    public void serializeFilteredAnyProperties(VI vi, JsonGenerator jsonGenerator, Object obj, Map<?, ?> map, XX xx, Object obj2) throws IOException {
        VD<Object> defaultNullValueSerializer;
        MapProperty mapProperty = new MapProperty(this._valueTypeSerializer, this._property);
        boolean z = MARKER_FOR_EMPTY == obj2;
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            Object key = entry.getKey();
            IgnorePropertiesUtil.Checker checker = this._inclusionChecker;
            if (checker == null || !checker.shouldIgnore(key)) {
                VD<Object> vdFindNullKeySerializer = key == null ? vi.findNullKeySerializer(this._keyType, this._property) : this._keySerializer;
                Object value = entry.getValue();
                if (value != null) {
                    defaultNullValueSerializer = this._valueSerializer;
                    if (defaultNullValueSerializer == null) {
                        defaultNullValueSerializer = _findSerializer(vi, value);
                    }
                    if (z) {
                        if (!defaultNullValueSerializer.isEmpty(vi, value)) {
                            mapProperty.reset(key, value, vdFindNullKeySerializer, defaultNullValueSerializer);
                            xx.serializeAsField(obj, jsonGenerator, vi, mapProperty);
                        }
                    } else if (obj2 == null || !obj2.equals(value)) {
                        mapProperty.reset(key, value, vdFindNullKeySerializer, defaultNullValueSerializer);
                        xx.serializeAsField(obj, jsonGenerator, vi, mapProperty);
                    }
                } else if (!this._suppressNulls) {
                    defaultNullValueSerializer = vi.getDefaultNullValueSerializer();
                    mapProperty.reset(key, value, vdFindNullKeySerializer, defaultNullValueSerializer);
                    try {
                        xx.serializeAsField(obj, jsonGenerator, vi, mapProperty);
                    } catch (Exception e) {
                        wrapAndThrow(vi, e, map, String.valueOf(key));
                    }
                }
            }
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, o.InterfaceC5598Xw
    public JsonNode getSchema(VI vi, Type type) {
        return createSchemaNode("object", true);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, o.VD
    public void acceptJsonFormatVisitor(InterfaceC5584Xi interfaceC5584Xi, JavaType javaType) throws JsonMappingException {
        InterfaceC5587Xl interfaceC5587XlCopydefault = interfaceC5584Xi.copydefault(javaType);
        if (interfaceC5587XlCopydefault != null) {
            interfaceC5587XlCopydefault.EZpvd(this._keySerializer, this._keyType);
            VD<Object> vd_findAndAddDynamic = this._valueSerializer;
            if (vd_findAndAddDynamic == null) {
                vd_findAndAddDynamic = _findAndAddDynamic(this._dynamicValueSerializers, this._valueType, interfaceC5584Xi.AEQbTJ());
            }
            interfaceC5587XlCopydefault.copydefault(vd_findAndAddDynamic, this._valueType);
        }
    }

    public final VD<Object> _findAndAddDynamic(AbstractC5604Yc abstractC5604Yc, Class<?> cls, VI vi) throws JsonMappingException {
        AbstractC5604Yc.TaskDescription taskDescriptionOLrzqt = abstractC5604Yc.OLrzqt(cls, vi, this._property);
        AbstractC5604Yc abstractC5604Yc2 = taskDescriptionOLrzqt.EZpvd;
        if (abstractC5604Yc != abstractC5604Yc2) {
            this._dynamicValueSerializers = abstractC5604Yc2;
        }
        return taskDescriptionOLrzqt.KWHzl;
    }

    public final VD<Object> _findAndAddDynamic(AbstractC5604Yc abstractC5604Yc, JavaType javaType, VI vi) throws JsonMappingException {
        AbstractC5604Yc.TaskDescription taskDescriptionOLrzqt = abstractC5604Yc.OLrzqt(javaType, vi, this._property);
        AbstractC5604Yc abstractC5604Yc2 = taskDescriptionOLrzqt.EZpvd;
        if (abstractC5604Yc != abstractC5604Yc2) {
            this._dynamicValueSerializers = abstractC5604Yc2;
        }
        return taskDescriptionOLrzqt.KWHzl;
    }

    public Map<?, ?> _orderEntries(Map<?, ?> map, JsonGenerator jsonGenerator, VI vi) throws IOException {
        if (map instanceof SortedMap) {
            return map;
        }
        if (_hasNullKey(map)) {
            TreeMap treeMap = new TreeMap();
            for (Map.Entry<?, ?> entry : map.entrySet()) {
                Object key = entry.getKey();
                if (key == null) {
                    _writeNullKeyedEntry(jsonGenerator, vi, entry.getValue());
                } else {
                    treeMap.put(key, entry.getValue());
                }
            }
            return treeMap;
        }
        return new TreeMap(map);
    }

    public boolean _hasNullKey(Map<?, ?> map) {
        return (map instanceof HashMap) && map.containsKey(null);
    }

    public void _writeNullKeyedEntry(JsonGenerator jsonGenerator, VI vi, Object obj) throws IOException {
        VD<Object> vd_findSerializer;
        VD<Object> vdFindNullKeySerializer = vi.findNullKeySerializer(this._keyType, this._property);
        if (obj != null) {
            vd_findSerializer = this._valueSerializer;
            if (vd_findSerializer == null) {
                vd_findSerializer = _findSerializer(vi, obj);
            }
            Object obj2 = this._suppressableValue;
            if (obj2 == MARKER_FOR_EMPTY) {
                if (vd_findSerializer.isEmpty(vi, obj)) {
                    return;
                }
            } else if (obj2 != null && obj2.equals(obj)) {
                return;
            }
        } else if (this._suppressNulls) {
            return;
        } else {
            vd_findSerializer = vi.getDefaultNullValueSerializer();
        }
        try {
            vdFindNullKeySerializer.serialize(null, jsonGenerator, vi);
            vd_findSerializer.serialize(obj, jsonGenerator, vi);
        } catch (Exception e) {
            wrapAndThrow(vi, e, obj, "");
        }
    }

    private final VD<Object> _findSerializer(VI vi, Object obj) throws JsonMappingException {
        Class<?> cls = obj.getClass();
        VD<Object> vdAEQbTJ = this._dynamicValueSerializers.AEQbTJ(cls);
        if (vdAEQbTJ != null) {
            return vdAEQbTJ;
        }
        if (this._valueType.hasGenericTypes()) {
            return _findAndAddDynamic(this._dynamicValueSerializers, vi.constructSpecializedType(this._valueType, cls), vi);
        }
        return _findAndAddDynamic(this._dynamicValueSerializers, cls, vi);
    }
}
