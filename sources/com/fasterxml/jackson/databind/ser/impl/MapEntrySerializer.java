package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import java.io.IOException;
import java.util.Map;
import o.AbstractC5601Xz;
import o.AbstractC5604Yc;
import o.C5614Ym;
import o.C5617Yp;
import o.VD;
import o.VI;
import o.VK;
import o.XT;

/* JADX INFO: loaded from: classes21.dex */
@VK
public class MapEntrySerializer extends ContainerSerializer<Map.Entry<?, ?>> implements XT {
    public static final Object MARKER_FOR_EMPTY = JsonInclude.Include.NON_EMPTY;
    protected AbstractC5604Yc _dynamicValueSerializers;
    protected final JavaType _entryType;
    protected VD<Object> _keySerializer;
    protected final JavaType _keyType;
    protected final BeanProperty _property;
    protected final boolean _suppressNulls;
    protected final Object _suppressableValue;
    protected VD<Object> _valueSerializer;
    protected final JavaType _valueType;
    protected final boolean _valueTypeIsStatic;
    protected final AbstractC5601Xz _valueTypeSerializer;

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

    /* JADX DEBUG: Method merged with bridge method: hasSingleElement(Ljava/lang/Object;)Z */
    @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
    public boolean hasSingleElement(Map.Entry<?, ?> entry) {
        return true;
    }

    public MapEntrySerializer(JavaType javaType, JavaType javaType2, JavaType javaType3, boolean z, AbstractC5601Xz abstractC5601Xz, BeanProperty beanProperty) {
        super(javaType);
        this._entryType = javaType;
        this._keyType = javaType2;
        this._valueType = javaType3;
        this._valueTypeIsStatic = z;
        this._valueTypeSerializer = abstractC5601Xz;
        this._property = beanProperty;
        this._dynamicValueSerializers = AbstractC5604Yc.copydefault();
        this._suppressableValue = null;
        this._suppressNulls = false;
    }

    @Deprecated
    public MapEntrySerializer(MapEntrySerializer mapEntrySerializer, BeanProperty beanProperty, AbstractC5601Xz abstractC5601Xz, VD<?> vd, VD<?> vd2) {
        this(mapEntrySerializer, beanProperty, abstractC5601Xz, vd, vd2, mapEntrySerializer._suppressableValue, mapEntrySerializer._suppressNulls);
    }

    public MapEntrySerializer(MapEntrySerializer mapEntrySerializer, BeanProperty beanProperty, AbstractC5601Xz abstractC5601Xz, VD<?> vd, VD<?> vd2, Object obj, boolean z) {
        super(Map.class, false);
        this._entryType = mapEntrySerializer._entryType;
        this._keyType = mapEntrySerializer._keyType;
        this._valueType = mapEntrySerializer._valueType;
        this._valueTypeIsStatic = mapEntrySerializer._valueTypeIsStatic;
        this._valueTypeSerializer = mapEntrySerializer._valueTypeSerializer;
        this._keySerializer = vd;
        this._valueSerializer = vd2;
        this._dynamicValueSerializers = AbstractC5604Yc.copydefault();
        this._property = mapEntrySerializer._property;
        this._suppressableValue = obj;
        this._suppressNulls = z;
    }

    @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
    public ContainerSerializer<?> _withValueTypeSerializer(AbstractC5601Xz abstractC5601Xz) {
        return new MapEntrySerializer(this, this._property, abstractC5601Xz, this._keySerializer, this._valueSerializer, this._suppressableValue, this._suppressNulls);
    }

    public MapEntrySerializer withResolved(BeanProperty beanProperty, VD<?> vd, VD<?> vd2, Object obj, boolean z) {
        return new MapEntrySerializer(this, beanProperty, this._valueTypeSerializer, vd, vd2, obj, z);
    }

    public MapEntrySerializer withContentInclusion(Object obj, boolean z) {
        return (this._suppressableValue == obj && this._suppressNulls == z) ? this : new MapEntrySerializer(this, this._property, this._valueTypeSerializer, this._keySerializer, this._valueSerializer, obj, z);
    }

    @Override // o.XT
    public VD<?> createContextual(VI vi, BeanProperty beanProperty) throws JsonMappingException {
        VD<Object> vdSerializerInstance;
        VD<?> vdSerializerInstance2;
        VD<?> vdHandleSecondaryContextualization;
        Object obj;
        boolean z;
        JsonInclude.Value valueFindPropertyInclusion;
        JsonInclude.Include contentInclusion;
        boolean zIncludeFilterSuppressNulls;
        AnnotationIntrospector annotationIntrospector = vi.getAnnotationIntrospector();
        Object objOLrzqt = null;
        AnnotatedMember member = beanProperty == null ? null : beanProperty.getMember();
        if (member == null || annotationIntrospector == null) {
            vdSerializerInstance = null;
            vdSerializerInstance2 = null;
        } else {
            Object objFindKeySerializer = annotationIntrospector.findKeySerializer(member);
            vdSerializerInstance2 = objFindKeySerializer != null ? vi.serializerInstance(member, objFindKeySerializer) : null;
            Object objFindContentSerializer = annotationIntrospector.findContentSerializer(member);
            vdSerializerInstance = objFindContentSerializer != null ? vi.serializerInstance(member, objFindContentSerializer) : null;
        }
        if (vdSerializerInstance == null) {
            vdSerializerInstance = this._valueSerializer;
        }
        VD<?> vdFindContextualConvertingSerializer = findContextualConvertingSerializer(vi, beanProperty, vdSerializerInstance);
        if (vdFindContextualConvertingSerializer == null && this._valueTypeIsStatic && !this._valueType.isJavaLangObject()) {
            vdFindContextualConvertingSerializer = vi.findContentValueSerializer(this._valueType, beanProperty);
        }
        VD<?> vd = vdFindContextualConvertingSerializer;
        if (vdSerializerInstance2 == null) {
            vdSerializerInstance2 = this._keySerializer;
        }
        if (vdSerializerInstance2 == null) {
            vdHandleSecondaryContextualization = vi.findKeySerializer(this._keyType, beanProperty);
        } else {
            vdHandleSecondaryContextualization = vi.handleSecondaryContextualization(vdSerializerInstance2, beanProperty);
        }
        VD<?> vd2 = vdHandleSecondaryContextualization;
        Object obj2 = this._suppressableValue;
        boolean z2 = this._suppressNulls;
        if (beanProperty == null || (valueFindPropertyInclusion = beanProperty.findPropertyInclusion(vi.getConfig(), null)) == null || (contentInclusion = valueFindPropertyInclusion.getContentInclusion()) == JsonInclude.Include.USE_DEFAULTS) {
            objOLrzqt = obj2;
        } else {
            int i = AnonymousClass1.AEQbTJ[contentInclusion.ordinal()];
            z2 = true;
            if (i == 1) {
                objOLrzqt = C5614Ym.OLrzqt(this._valueType);
                if (objOLrzqt != null && objOLrzqt.getClass().isArray()) {
                    objOLrzqt = C5617Yp.OLrzqt(objOLrzqt);
                }
            } else if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        objOLrzqt = vi.includeFilterInstance(null, valueFindPropertyInclusion.getContentFilter());
                        if (objOLrzqt != null) {
                            zIncludeFilterSuppressNulls = vi.includeFilterSuppressNulls(objOLrzqt);
                            z = zIncludeFilterSuppressNulls;
                            obj = objOLrzqt;
                        }
                    } else if (i != 5) {
                        zIncludeFilterSuppressNulls = false;
                        z = zIncludeFilterSuppressNulls;
                        obj = objOLrzqt;
                    }
                    return withResolved(beanProperty, vd2, vd, obj, z);
                }
                objOLrzqt = MARKER_FOR_EMPTY;
            } else if (this._valueType.isReferenceType()) {
                objOLrzqt = MARKER_FOR_EMPTY;
            }
        }
        obj = objOLrzqt;
        z = z2;
        return withResolved(beanProperty, vd2, vd, obj, z);
    }

    /* JADX INFO: renamed from: com.fasterxml.jackson.databind.ser.impl.MapEntrySerializer$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] AEQbTJ;

        static {
            int[] iArr = new int[JsonInclude.Include.values().length];
            AEQbTJ = iArr;
            try {
                iArr[JsonInclude.Include.NON_DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                AEQbTJ[JsonInclude.Include.NON_ABSENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AEQbTJ[JsonInclude.Include.NON_EMPTY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AEQbTJ[JsonInclude.Include.CUSTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AEQbTJ[JsonInclude.Include.NON_NULL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                AEQbTJ[JsonInclude.Include.ALWAYS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* JADX DEBUG: Method merged with bridge method: isEmpty(Lo/VI;Ljava/lang/Object;)Z */
    @Override // o.VD
    public boolean isEmpty(VI vi, Map.Entry<?, ?> entry) {
        Object value = entry.getValue();
        if (value == null) {
            return this._suppressNulls;
        }
        if (this._suppressableValue == null) {
            return false;
        }
        VD<Object> vd_findAndAddDynamic = this._valueSerializer;
        if (vd_findAndAddDynamic == null) {
            Class<?> cls = value.getClass();
            VD<Object> vdAEQbTJ = this._dynamicValueSerializers.AEQbTJ(cls);
            if (vdAEQbTJ == null) {
                try {
                    vd_findAndAddDynamic = _findAndAddDynamic(this._dynamicValueSerializers, cls, vi);
                } catch (JsonMappingException unused) {
                    return false;
                }
            } else {
                vd_findAndAddDynamic = vdAEQbTJ;
            }
        }
        Object obj = this._suppressableValue;
        if (obj == MARKER_FOR_EMPTY) {
            return vd_findAndAddDynamic.isEmpty(vi, value);
        }
        return obj.equals(value);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Ljava/lang/Object;Lcom/fasterxml/jackson/core/JsonGenerator;Lo/VI;)V */
    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, o.VD
    public void serialize(Map.Entry<?, ?> entry, JsonGenerator jsonGenerator, VI vi) throws IOException {
        jsonGenerator.AYXKKw(entry);
        serializeDynamic(entry, jsonGenerator, vi);
        jsonGenerator.DbNXlk();
    }

    /* JADX DEBUG: Method merged with bridge method: serializeWithType(Ljava/lang/Object;Lcom/fasterxml/jackson/core/JsonGenerator;Lo/VI;Lo/Xz;)V */
    @Override // o.VD
    public void serializeWithType(Map.Entry<?, ?> entry, JsonGenerator jsonGenerator, VI vi, AbstractC5601Xz abstractC5601Xz) throws IOException {
        jsonGenerator.KWHzl(entry);
        WritableTypeId writableTypeIdAEQbTJ = abstractC5601Xz.AEQbTJ(jsonGenerator, abstractC5601Xz.AEQbTJ(entry, JsonToken.START_OBJECT));
        serializeDynamic(entry, jsonGenerator, vi);
        abstractC5601Xz.copydefault(jsonGenerator, writableTypeIdAEQbTJ);
    }

    public void serializeDynamic(Map.Entry<?, ?> entry, JsonGenerator jsonGenerator, VI vi) throws IOException {
        VD<Object> vd_findAndAddDynamic;
        AbstractC5601Xz abstractC5601Xz = this._valueTypeSerializer;
        Object key = entry.getKey();
        VD<Object> vdFindNullKeySerializer = key == null ? vi.findNullKeySerializer(this._keyType, this._property) : this._keySerializer;
        Object value = entry.getValue();
        if (value != null) {
            vd_findAndAddDynamic = this._valueSerializer;
            if (vd_findAndAddDynamic == null) {
                Class<?> cls = value.getClass();
                VD<Object> vdAEQbTJ = this._dynamicValueSerializers.AEQbTJ(cls);
                if (vdAEQbTJ != null) {
                    vd_findAndAddDynamic = vdAEQbTJ;
                } else if (this._valueType.hasGenericTypes()) {
                    vd_findAndAddDynamic = _findAndAddDynamic(this._dynamicValueSerializers, vi.constructSpecializedType(this._valueType, cls), vi);
                } else {
                    vd_findAndAddDynamic = _findAndAddDynamic(this._dynamicValueSerializers, cls, vi);
                }
            }
            Object obj = this._suppressableValue;
            if (obj != null && ((obj == MARKER_FOR_EMPTY && vd_findAndAddDynamic.isEmpty(vi, value)) || this._suppressableValue.equals(value))) {
                return;
            }
        } else if (this._suppressNulls) {
            return;
        } else {
            vd_findAndAddDynamic = vi.getDefaultNullValueSerializer();
        }
        vdFindNullKeySerializer.serialize(key, jsonGenerator, vi);
        try {
            if (abstractC5601Xz == null) {
                vd_findAndAddDynamic.serialize(value, jsonGenerator, vi);
            } else {
                vd_findAndAddDynamic.serializeWithType(value, jsonGenerator, vi, abstractC5601Xz);
            }
        } catch (Exception e) {
            wrapAndThrow(vi, e, entry, "" + key);
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
}
