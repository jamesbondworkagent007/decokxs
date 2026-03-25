package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.RuntimeJsonMappingException;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.type.ReferenceType;
import com.fasterxml.jackson.databind.util.NameTransformer;
import java.io.IOException;
import o.AbstractC5601Xz;
import o.AbstractC5604Yc;
import o.C5614Ym;
import o.C5617Yp;
import o.InterfaceC5584Xi;
import o.VD;
import o.VI;
import o.XT;

/* JADX INFO: loaded from: classes21.dex */
public abstract class ReferenceTypeSerializer<T> extends StdSerializer<T> implements XT {
    public static final Object MARKER_FOR_EMPTY = JsonInclude.Include.NON_EMPTY;
    private static final long serialVersionUID = 1;
    protected transient AbstractC5604Yc _dynamicSerializers;
    protected final BeanProperty _property;
    protected final JavaType _referredType;
    protected final boolean _suppressNulls;
    protected final Object _suppressableValue;
    protected final NameTransformer _unwrapper;
    protected final VD<Object> _valueSerializer;
    protected final AbstractC5601Xz _valueTypeSerializer;

    public abstract Object _getReferenced(T t);

    public abstract Object _getReferencedIfPresent(T t);

    public abstract boolean _isValuePresent(T t);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public JavaType getReferredType() {
        return this._referredType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.VD
    public boolean isUnwrappingSerializer() {
        return this._unwrapper != null;
    }

    public abstract ReferenceTypeSerializer<T> withContentInclusion(Object obj, boolean z);

    public abstract ReferenceTypeSerializer<T> withResolved(BeanProperty beanProperty, AbstractC5601Xz abstractC5601Xz, VD<?> vd, NameTransformer nameTransformer);

    public ReferenceTypeSerializer(ReferenceType referenceType, boolean z, AbstractC5601Xz abstractC5601Xz, VD<Object> vd) {
        super(referenceType);
        this._referredType = referenceType.getReferencedType();
        this._property = null;
        this._valueTypeSerializer = abstractC5601Xz;
        this._valueSerializer = vd;
        this._unwrapper = null;
        this._suppressableValue = null;
        this._suppressNulls = false;
        this._dynamicSerializers = AbstractC5604Yc.copydefault();
    }

    public ReferenceTypeSerializer(ReferenceTypeSerializer<?> referenceTypeSerializer, BeanProperty beanProperty, AbstractC5601Xz abstractC5601Xz, VD<?> vd, NameTransformer nameTransformer, Object obj, boolean z) {
        super(referenceTypeSerializer);
        this._referredType = referenceTypeSerializer._referredType;
        this._dynamicSerializers = AbstractC5604Yc.copydefault();
        this._property = beanProperty;
        this._valueTypeSerializer = abstractC5601Xz;
        this._valueSerializer = vd;
        this._unwrapper = nameTransformer;
        this._suppressableValue = obj;
        this._suppressNulls = z;
    }

    @Override // o.VD
    public VD<T> unwrappingSerializer(NameTransformer nameTransformer) {
        VD<?> vdUnwrappingSerializer = this._valueSerializer;
        if (vdUnwrappingSerializer != null && (vdUnwrappingSerializer = vdUnwrappingSerializer.unwrappingSerializer(nameTransformer)) == this._valueSerializer) {
            return this;
        }
        NameTransformer nameTransformer2 = this._unwrapper;
        if (nameTransformer2 != null) {
            nameTransformer = NameTransformer.chainedTransformer(nameTransformer, nameTransformer2);
        }
        return (this._valueSerializer == vdUnwrappingSerializer && this._unwrapper == nameTransformer) ? this : withResolved(this._property, this._valueTypeSerializer, vdUnwrappingSerializer, nameTransformer);
    }

    @Override // o.XT
    public VD<?> createContextual(VI vi, BeanProperty beanProperty) throws JsonMappingException {
        JsonInclude.Value valueFindPropertyInclusion;
        JsonInclude.Include contentInclusion;
        Object objOLrzqt;
        AbstractC5601Xz abstractC5601XzOLrzqt = this._valueTypeSerializer;
        if (abstractC5601XzOLrzqt != null) {
            abstractC5601XzOLrzqt = abstractC5601XzOLrzqt.OLrzqt(beanProperty);
        }
        VD<?> vdFindAnnotatedContentSerializer = findAnnotatedContentSerializer(vi, beanProperty);
        if (vdFindAnnotatedContentSerializer == null) {
            vdFindAnnotatedContentSerializer = this._valueSerializer;
            if (vdFindAnnotatedContentSerializer == null) {
                if (_useStatic(vi, beanProperty, this._referredType)) {
                    vdFindAnnotatedContentSerializer = _findSerializer(vi, this._referredType, beanProperty);
                }
            } else {
                vdFindAnnotatedContentSerializer = vi.handlePrimaryContextualization(vdFindAnnotatedContentSerializer, beanProperty);
            }
        }
        ReferenceTypeSerializer<T> referenceTypeSerializerWithResolved = (this._property == beanProperty && this._valueTypeSerializer == abstractC5601XzOLrzqt && this._valueSerializer == vdFindAnnotatedContentSerializer) ? this : withResolved(beanProperty, abstractC5601XzOLrzqt, vdFindAnnotatedContentSerializer, this._unwrapper);
        if (beanProperty == null || (valueFindPropertyInclusion = beanProperty.findPropertyInclusion(vi.getConfig(), handledType())) == null || (contentInclusion = valueFindPropertyInclusion.getContentInclusion()) == JsonInclude.Include.USE_DEFAULTS) {
            return referenceTypeSerializerWithResolved;
        }
        int i = AnonymousClass4.OLrzqt[contentInclusion.ordinal()];
        boolean zIncludeFilterSuppressNulls = true;
        if (i != 1) {
            objOLrzqt = null;
            if (i != 2) {
                if (i == 3) {
                    objOLrzqt = MARKER_FOR_EMPTY;
                } else if (i == 4) {
                    objOLrzqt = vi.includeFilterInstance(null, valueFindPropertyInclusion.getContentFilter());
                    if (objOLrzqt != null) {
                        zIncludeFilterSuppressNulls = vi.includeFilterSuppressNulls(objOLrzqt);
                    }
                } else if (i != 5) {
                    zIncludeFilterSuppressNulls = false;
                }
            } else if (this._referredType.isReferenceType()) {
                objOLrzqt = MARKER_FOR_EMPTY;
            }
        } else {
            objOLrzqt = C5614Ym.OLrzqt(this._referredType);
            if (objOLrzqt != null && objOLrzqt.getClass().isArray()) {
                objOLrzqt = C5617Yp.OLrzqt(objOLrzqt);
            }
        }
        return (this._suppressableValue == objOLrzqt && this._suppressNulls == zIncludeFilterSuppressNulls) ? referenceTypeSerializerWithResolved : referenceTypeSerializerWithResolved.withContentInclusion(objOLrzqt, zIncludeFilterSuppressNulls);
    }

    /* JADX INFO: renamed from: com.fasterxml.jackson.databind.ser.std.ReferenceTypeSerializer$4, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass4 {
        public static final /* synthetic */ int[] OLrzqt;

        static {
            int[] iArr = new int[JsonInclude.Include.values().length];
            OLrzqt = iArr;
            try {
                iArr[JsonInclude.Include.NON_DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                OLrzqt[JsonInclude.Include.NON_ABSENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                OLrzqt[JsonInclude.Include.NON_EMPTY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                OLrzqt[JsonInclude.Include.CUSTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                OLrzqt[JsonInclude.Include.NON_NULL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                OLrzqt[JsonInclude.Include.ALWAYS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public boolean _useStatic(VI vi, BeanProperty beanProperty, JavaType javaType) {
        if (javaType.isJavaLangObject()) {
            return false;
        }
        if (javaType.isFinal() || javaType.useStaticType()) {
            return true;
        }
        AnnotationIntrospector annotationIntrospector = vi.getAnnotationIntrospector();
        if (annotationIntrospector != null && beanProperty != null && beanProperty.getMember() != null) {
            JsonSerialize.Typing typingFindSerializationTyping = annotationIntrospector.findSerializationTyping(beanProperty.getMember());
            if (typingFindSerializationTyping == JsonSerialize.Typing.STATIC) {
                return true;
            }
            if (typingFindSerializationTyping == JsonSerialize.Typing.DYNAMIC) {
                return false;
            }
        }
        return vi.isEnabled(MapperFeature.USE_STATIC_TYPING);
    }

    @Override // o.VD
    public boolean isEmpty(VI vi, T t) {
        if (!_isValuePresent(t)) {
            return true;
        }
        Object obj_getReferenced = _getReferenced(t);
        if (obj_getReferenced == null) {
            return this._suppressNulls;
        }
        if (this._suppressableValue == null) {
            return false;
        }
        VD<Object> vd_findCachedSerializer = this._valueSerializer;
        if (vd_findCachedSerializer == null) {
            try {
                vd_findCachedSerializer = _findCachedSerializer(vi, obj_getReferenced.getClass());
            } catch (JsonMappingException e) {
                throw new RuntimeJsonMappingException(e);
            }
        }
        Object obj = this._suppressableValue;
        if (obj == MARKER_FOR_EMPTY) {
            return vd_findCachedSerializer.isEmpty(vi, obj_getReferenced);
        }
        return obj.equals(obj_getReferenced);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, o.VD
    public void serialize(T t, JsonGenerator jsonGenerator, VI vi) throws IOException {
        Object obj_getReferencedIfPresent = _getReferencedIfPresent(t);
        if (obj_getReferencedIfPresent == null) {
            if (this._unwrapper == null) {
                vi.defaultSerializeNull(jsonGenerator);
                return;
            }
            return;
        }
        VD<Object> vd_findCachedSerializer = this._valueSerializer;
        if (vd_findCachedSerializer == null) {
            vd_findCachedSerializer = _findCachedSerializer(vi, obj_getReferencedIfPresent.getClass());
        }
        AbstractC5601Xz abstractC5601Xz = this._valueTypeSerializer;
        if (abstractC5601Xz != null) {
            vd_findCachedSerializer.serializeWithType(obj_getReferencedIfPresent, jsonGenerator, vi, abstractC5601Xz);
        } else {
            vd_findCachedSerializer.serialize(obj_getReferencedIfPresent, jsonGenerator, vi);
        }
    }

    @Override // o.VD
    public void serializeWithType(T t, JsonGenerator jsonGenerator, VI vi, AbstractC5601Xz abstractC5601Xz) throws IOException {
        Object obj_getReferencedIfPresent = _getReferencedIfPresent(t);
        if (obj_getReferencedIfPresent == null) {
            if (this._unwrapper == null) {
                vi.defaultSerializeNull(jsonGenerator);
            }
        } else {
            VD<Object> vd_findCachedSerializer = this._valueSerializer;
            if (vd_findCachedSerializer == null) {
                vd_findCachedSerializer = _findCachedSerializer(vi, obj_getReferencedIfPresent.getClass());
            }
            vd_findCachedSerializer.serializeWithType(obj_getReferencedIfPresent, jsonGenerator, vi, abstractC5601Xz);
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, o.VD
    public void acceptJsonFormatVisitor(InterfaceC5584Xi interfaceC5584Xi, JavaType javaType) throws JsonMappingException {
        VD<Object> vd_findSerializer = this._valueSerializer;
        if (vd_findSerializer == null) {
            vd_findSerializer = _findSerializer(interfaceC5584Xi.AEQbTJ(), this._referredType, this._property);
            NameTransformer nameTransformer = this._unwrapper;
            if (nameTransformer != null) {
                vd_findSerializer = vd_findSerializer.unwrappingSerializer(nameTransformer);
            }
        }
        vd_findSerializer.acceptJsonFormatVisitor(interfaceC5584Xi, this._referredType);
    }

    private final VD<Object> _findCachedSerializer(VI vi, Class<?> cls) throws JsonMappingException {
        VD<Object> vdFindPrimaryPropertySerializer;
        VD<Object> vdAEQbTJ = this._dynamicSerializers.AEQbTJ(cls);
        if (vdAEQbTJ != null) {
            return vdAEQbTJ;
        }
        if (this._referredType.hasGenericTypes()) {
            vdFindPrimaryPropertySerializer = vi.findPrimaryPropertySerializer(vi.constructSpecializedType(this._referredType, cls), this._property);
        } else {
            vdFindPrimaryPropertySerializer = vi.findPrimaryPropertySerializer(cls, this._property);
        }
        NameTransformer nameTransformer = this._unwrapper;
        if (nameTransformer != null) {
            vdFindPrimaryPropertySerializer = vdFindPrimaryPropertySerializer.unwrappingSerializer(nameTransformer);
        }
        VD<Object> vd = vdFindPrimaryPropertySerializer;
        this._dynamicSerializers = this._dynamicSerializers.AEQbTJ(cls, vd);
        return vd;
    }

    private final VD<Object> _findSerializer(VI vi, JavaType javaType, BeanProperty beanProperty) throws JsonMappingException {
        return vi.findPrimaryPropertySerializer(javaType, beanProperty);
    }
}
