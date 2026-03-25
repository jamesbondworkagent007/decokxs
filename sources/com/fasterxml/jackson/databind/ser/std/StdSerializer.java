package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormat;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Map;
import o.C5619Yr;
import o.InterfaceC5583Xh;
import o.InterfaceC5584Xi;
import o.InterfaceC5585Xj;
import o.InterfaceC5586Xk;
import o.InterfaceC5591Xp;
import o.InterfaceC5592Xq;
import o.InterfaceC5598Xw;
import o.InterfaceC5621Yt;
import o.VD;
import o.VI;
import o.XS;
import o.XX;

/* JADX INFO: loaded from: classes21.dex */
public abstract class StdSerializer<T> extends VD<T> implements InterfaceC5586Xk, InterfaceC5598Xw, Serializable {
    private static final Object KEY_CONTENT_CONVERTER_LOCK = new Object();
    private static final long serialVersionUID = 1;
    public final Class<T> _handledType;

    public static final boolean _neitherNull(Object obj, Object obj2) {
        return (obj == null || obj2 == null) ? false : true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.VD
    public Class<T> handledType() {
        return this._handledType;
    }

    @Override // o.VD
    public abstract void serialize(T t, JsonGenerator jsonGenerator, VI vi) throws IOException;

    public StdSerializer(Class<T> cls) {
        this._handledType = cls;
    }

    public StdSerializer(JavaType javaType) {
        this._handledType = (Class<T>) javaType.getRawClass();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.lang.Class<?> */
    /* JADX WARN: Multi-variable type inference failed */
    public StdSerializer(Class<?> cls, boolean z) {
        this._handledType = cls;
    }

    public StdSerializer(StdSerializer<?> stdSerializer) {
        this._handledType = (Class<T>) stdSerializer._handledType;
    }

    @Override // o.VD
    public void acceptJsonFormatVisitor(InterfaceC5584Xi interfaceC5584Xi, JavaType javaType) throws JsonMappingException {
        interfaceC5584Xi.EZpvd(javaType);
    }

    public JsonNode getSchema(VI vi, Type type) throws JsonMappingException {
        return createSchemaNode("string");
    }

    public JsonNode getSchema(VI vi, Type type, boolean z) throws JsonMappingException {
        ObjectNode objectNode = (ObjectNode) getSchema(vi, type);
        if (!z) {
            objectNode.put("required", !z);
        }
        return objectNode;
    }

    public ObjectNode createSchemaNode(String str) {
        ObjectNode objectNode = JsonNodeFactory.instance.objectNode();
        objectNode.put("type", str);
        return objectNode;
    }

    public ObjectNode createSchemaNode(String str, boolean z) {
        ObjectNode objectNodeCreateSchemaNode = createSchemaNode(str);
        if (!z) {
            objectNodeCreateSchemaNode.put("required", !z);
        }
        return objectNodeCreateSchemaNode;
    }

    public void visitStringFormat(InterfaceC5584Xi interfaceC5584Xi, JavaType javaType) throws JsonMappingException {
        interfaceC5584Xi.valueOf(javaType);
    }

    public void visitStringFormat(InterfaceC5584Xi interfaceC5584Xi, JavaType javaType, JsonValueFormat jsonValueFormat) throws JsonMappingException {
        InterfaceC5591Xp interfaceC5591XpValueOf = interfaceC5584Xi.valueOf(javaType);
        if (interfaceC5591XpValueOf != null) {
            interfaceC5591XpValueOf.copydefault(jsonValueFormat);
        }
    }

    public void visitIntFormat(InterfaceC5584Xi interfaceC5584Xi, JavaType javaType, JsonParser.NumberType numberType) throws JsonMappingException {
        InterfaceC5585Xj interfaceC5585XjAEQbTJ = interfaceC5584Xi.AEQbTJ(javaType);
        if (_neitherNull(interfaceC5585XjAEQbTJ, numberType)) {
            interfaceC5585XjAEQbTJ.OLrzqt(numberType);
        }
    }

    public void visitIntFormat(InterfaceC5584Xi interfaceC5584Xi, JavaType javaType, JsonParser.NumberType numberType, JsonValueFormat jsonValueFormat) throws JsonMappingException {
        InterfaceC5585Xj interfaceC5585XjAEQbTJ = interfaceC5584Xi.AEQbTJ(javaType);
        if (interfaceC5585XjAEQbTJ != null) {
            if (numberType != null) {
                interfaceC5585XjAEQbTJ.OLrzqt(numberType);
            }
            if (jsonValueFormat != null) {
                interfaceC5585XjAEQbTJ.copydefault(jsonValueFormat);
            }
        }
    }

    public void visitFloatFormat(InterfaceC5584Xi interfaceC5584Xi, JavaType javaType, JsonParser.NumberType numberType) throws JsonMappingException {
        InterfaceC5592Xq interfaceC5592XqAYXKKw = interfaceC5584Xi.AYXKKw(javaType);
        if (interfaceC5592XqAYXKKw != null) {
            interfaceC5592XqAYXKKw.copydefault(numberType);
        }
    }

    public void visitArrayFormat(InterfaceC5584Xi interfaceC5584Xi, JavaType javaType, VD<?> vd, JavaType javaType2) throws JsonMappingException {
        InterfaceC5583Xh interfaceC5583XhKWHzl = interfaceC5584Xi.KWHzl(javaType);
        if (_neitherNull(interfaceC5583XhKWHzl, vd)) {
            interfaceC5583XhKWHzl.AEQbTJ(vd, javaType2);
        }
    }

    public void visitArrayFormat(InterfaceC5584Xi interfaceC5584Xi, JavaType javaType, JsonFormatTypes jsonFormatTypes) throws JsonMappingException {
        InterfaceC5583Xh interfaceC5583XhKWHzl = interfaceC5584Xi.KWHzl(javaType);
        if (interfaceC5583XhKWHzl != null) {
            interfaceC5583XhKWHzl.AEQbTJ(jsonFormatTypes);
        }
    }

    public void wrapAndThrow(VI vi, Throwable th, Object obj, String str) throws IOException {
        while ((th instanceof InvocationTargetException) && th.getCause() != null) {
            th = th.getCause();
        }
        C5619Yr.copydefault(th);
        boolean z = vi == null || vi.isEnabled(SerializationFeature.WRAP_EXCEPTIONS);
        if (th instanceof IOException) {
            if (!z || !(th instanceof JacksonException)) {
                throw ((IOException) th);
            }
        } else if (!z) {
            C5619Yr.AhwBna(th);
        }
        throw JsonMappingException.wrapWithPath(th, obj, str);
    }

    public void wrapAndThrow(VI vi, Throwable th, Object obj, int i) throws IOException {
        while ((th instanceof InvocationTargetException) && th.getCause() != null) {
            th = th.getCause();
        }
        C5619Yr.copydefault(th);
        boolean z = vi == null || vi.isEnabled(SerializationFeature.WRAP_EXCEPTIONS);
        if (th instanceof IOException) {
            if (!z || !(th instanceof JacksonException)) {
                throw ((IOException) th);
            }
        } else if (!z) {
            C5619Yr.AhwBna(th);
        }
        throw JsonMappingException.wrapWithPath(th, obj, i);
    }

    public VD<?> findContextualConvertingSerializer(VI vi, BeanProperty beanProperty, VD<?> vd) throws JsonMappingException {
        Object obj = KEY_CONTENT_CONVERTER_LOCK;
        Map identityHashMap = (Map) vi.getAttribute(obj);
        if (identityHashMap != null) {
            if (identityHashMap.get(beanProperty) != null) {
                return vd;
            }
        } else {
            identityHashMap = new IdentityHashMap();
            vi.setAttribute(obj, (Object) identityHashMap);
        }
        identityHashMap.put(beanProperty, Boolean.TRUE);
        try {
            VD<?> vdFindConvertingContentSerializer = findConvertingContentSerializer(vi, beanProperty, vd);
            return vdFindConvertingContentSerializer != null ? vi.handleSecondaryContextualization(vdFindConvertingContentSerializer, beanProperty) : vd;
        } finally {
            identityHashMap.remove(beanProperty);
        }
    }

    @Deprecated
    public VD<?> findConvertingContentSerializer(VI vi, BeanProperty beanProperty, VD<?> vd) throws JsonMappingException {
        AnnotatedMember member;
        Object objFindSerializationContentConverter;
        AnnotationIntrospector annotationIntrospector = vi.getAnnotationIntrospector();
        if (!_neitherNull(annotationIntrospector, beanProperty) || (member = beanProperty.getMember()) == null || (objFindSerializationContentConverter = annotationIntrospector.findSerializationContentConverter(member)) == null) {
            return vd;
        }
        InterfaceC5621Yt<Object, Object> interfaceC5621YtConverterInstance = vi.converterInstance(beanProperty.getMember(), objFindSerializationContentConverter);
        JavaType javaTypeEZpvd = interfaceC5621YtConverterInstance.EZpvd(vi.getTypeFactory());
        if (vd == null && !javaTypeEZpvd.isJavaLangObject()) {
            vd = vi.findValueSerializer(javaTypeEZpvd);
        }
        return new StdDelegatingSerializer(interfaceC5621YtConverterInstance, javaTypeEZpvd, vd);
    }

    public XX findPropertyFilter(VI vi, Object obj, Object obj2) throws JsonMappingException {
        XS filterProvider = vi.getFilterProvider();
        if (filterProvider == null) {
            return (XX) vi.reportBadDefinition((Class<?>) handledType(), "Cannot resolve PropertyFilter with id '" + obj + "'; no FilterProvider configured");
        }
        return filterProvider.findPropertyFilter(obj, obj2);
    }

    public JsonFormat.Value findFormatOverrides(VI vi, BeanProperty beanProperty, Class<?> cls) {
        if (beanProperty != null) {
            return beanProperty.findPropertyFormat(vi.getConfig(), cls);
        }
        return vi.getDefaultPropertyFormat(cls);
    }

    public Boolean findFormatFeature(VI vi, BeanProperty beanProperty, Class<?> cls, JsonFormat.Feature feature) {
        JsonFormat.Value valueFindFormatOverrides = findFormatOverrides(vi, beanProperty, cls);
        if (valueFindFormatOverrides != null) {
            return valueFindFormatOverrides.getFeature(feature);
        }
        return null;
    }

    public JsonInclude.Value findIncludeOverrides(VI vi, BeanProperty beanProperty, Class<?> cls) {
        if (beanProperty != null) {
            return beanProperty.findPropertyInclusion(vi.getConfig(), cls);
        }
        return vi.getDefaultPropertyInclusion(cls);
    }

    public VD<?> findAnnotatedContentSerializer(VI vi, BeanProperty beanProperty) throws JsonMappingException {
        Object objFindContentSerializer;
        if (beanProperty == null) {
            return null;
        }
        AnnotatedMember member = beanProperty.getMember();
        AnnotationIntrospector annotationIntrospector = vi.getAnnotationIntrospector();
        if (member == null || (objFindContentSerializer = annotationIntrospector.findContentSerializer(member)) == null) {
            return null;
        }
        return vi.serializerInstance(member, objFindContentSerializer);
    }

    public boolean isDefaultSerializer(VD<?> vd) {
        return C5619Yr.AEQbTJ(vd);
    }

    public static final boolean _nonEmpty(Collection<?> collection) {
        return (collection == null || collection.isEmpty()) ? false : true;
    }
}
