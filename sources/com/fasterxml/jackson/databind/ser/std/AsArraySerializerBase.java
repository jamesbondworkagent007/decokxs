package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Objects;
import o.AbstractC5601Xz;
import o.AbstractC5604Yc;
import o.C5594Xs;
import o.InterfaceC5584Xi;
import o.InterfaceC5586Xk;
import o.InterfaceC5598Xw;
import o.VD;
import o.VI;
import o.XT;

/* JADX INFO: loaded from: classes21.dex */
public abstract class AsArraySerializerBase<T> extends ContainerSerializer<T> implements XT {
    public AbstractC5604Yc _dynamicSerializers;
    public final VD<Object> _elementSerializer;
    public final JavaType _elementType;
    public final BeanProperty _property;
    protected final boolean _staticTyping;
    public final Boolean _unwrapSingle;
    public final AbstractC5601Xz _valueTypeSerializer;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
    public VD<?> getContentSerializer() {
        return this._elementSerializer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
    public JavaType getContentType() {
        return this._elementType;
    }

    public abstract void serializeContents(T t, JsonGenerator jsonGenerator, VI vi) throws IOException;

    public abstract AsArraySerializerBase<T> withResolved(BeanProperty beanProperty, AbstractC5601Xz abstractC5601Xz, VD<?> vd, Boolean bool);

    public AsArraySerializerBase(Class<?> cls, JavaType javaType, boolean z, AbstractC5601Xz abstractC5601Xz, VD<Object> vd) {
        this(cls, javaType, z, abstractC5601Xz, null, vd, null);
    }

    @Deprecated
    public AsArraySerializerBase(Class<?> cls, JavaType javaType, boolean z, AbstractC5601Xz abstractC5601Xz, BeanProperty beanProperty, VD<Object> vd) {
        this(cls, javaType, z, abstractC5601Xz, beanProperty, vd, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AsArraySerializerBase(Class<?> cls, JavaType javaType, boolean z, AbstractC5601Xz abstractC5601Xz, BeanProperty beanProperty, VD<?> vd, Boolean bool) {
        super(cls, false);
        boolean z2 = false;
        this._elementType = javaType;
        if (z || (javaType != null && javaType.isFinal())) {
            z2 = true;
        }
        this._staticTyping = z2;
        this._valueTypeSerializer = abstractC5601Xz;
        this._property = beanProperty;
        this._elementSerializer = vd;
        this._dynamicSerializers = AbstractC5604Yc.copydefault();
        this._unwrapSingle = bool;
    }

    public AsArraySerializerBase(AsArraySerializerBase<?> asArraySerializerBase, BeanProperty beanProperty, AbstractC5601Xz abstractC5601Xz, VD<?> vd, Boolean bool) {
        super(asArraySerializerBase);
        this._elementType = asArraySerializerBase._elementType;
        this._staticTyping = asArraySerializerBase._staticTyping;
        this._valueTypeSerializer = abstractC5601Xz;
        this._property = beanProperty;
        this._elementSerializer = vd;
        this._dynamicSerializers = AbstractC5604Yc.copydefault();
        this._unwrapSingle = bool;
    }

    @Deprecated
    public AsArraySerializerBase(AsArraySerializerBase<?> asArraySerializerBase, BeanProperty beanProperty, AbstractC5601Xz abstractC5601Xz, VD<?> vd) {
        this(asArraySerializerBase, beanProperty, abstractC5601Xz, vd, asArraySerializerBase._unwrapSingle);
    }

    @Deprecated
    public final AsArraySerializerBase<T> withResolved(BeanProperty beanProperty, AbstractC5601Xz abstractC5601Xz, VD<?> vd) {
        return withResolved(beanProperty, abstractC5601Xz, vd, this._unwrapSingle);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0020  */
    @Override // o.XT
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public VD<?> createContextual(VI vi, BeanProperty beanProperty) throws JsonMappingException {
        VD<Object> vdSerializerInstance;
        JavaType javaType;
        Object objFindContentSerializer;
        AbstractC5601Xz abstractC5601XzOLrzqt = this._valueTypeSerializer;
        if (abstractC5601XzOLrzqt != null) {
            abstractC5601XzOLrzqt = abstractC5601XzOLrzqt.OLrzqt(beanProperty);
        }
        if (beanProperty != null) {
            AnnotationIntrospector annotationIntrospector = vi.getAnnotationIntrospector();
            AnnotatedMember member = beanProperty.getMember();
            vdSerializerInstance = (member == null || (objFindContentSerializer = annotationIntrospector.findContentSerializer(member)) == null) ? null : vi.serializerInstance(member, objFindContentSerializer);
        }
        JsonFormat.Value valueFindFormatOverrides = findFormatOverrides(vi, beanProperty, handledType());
        Boolean feature = valueFindFormatOverrides != null ? valueFindFormatOverrides.getFeature(JsonFormat.Feature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED) : null;
        if (vdSerializerInstance == null) {
            vdSerializerInstance = this._elementSerializer;
        }
        VD<?> vdFindContextualConvertingSerializer = findContextualConvertingSerializer(vi, beanProperty, vdSerializerInstance);
        if (vdFindContextualConvertingSerializer == null && (javaType = this._elementType) != null && this._staticTyping && !javaType.isJavaLangObject()) {
            vdFindContextualConvertingSerializer = vi.findContentValueSerializer(this._elementType, beanProperty);
        }
        return (vdFindContextualConvertingSerializer == this._elementSerializer && beanProperty == this._property && this._valueTypeSerializer == abstractC5601XzOLrzqt && Objects.equals(this._unwrapSingle, feature)) ? this : withResolved(beanProperty, abstractC5601XzOLrzqt, vdFindContextualConvertingSerializer, feature);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, o.VD
    public void serialize(T t, JsonGenerator jsonGenerator, VI vi) throws IOException {
        if (vi.isEnabled(SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED) && hasSingleElement(t)) {
            serializeContents(t, jsonGenerator, vi);
            return;
        }
        jsonGenerator.gEmmrt(t);
        serializeContents(t, jsonGenerator, vi);
        jsonGenerator.fetchVPNInfo();
    }

    @Override // o.VD
    public void serializeWithType(T t, JsonGenerator jsonGenerator, VI vi, AbstractC5601Xz abstractC5601Xz) throws IOException {
        WritableTypeId writableTypeIdAEQbTJ = abstractC5601Xz.AEQbTJ(jsonGenerator, abstractC5601Xz.AEQbTJ(t, JsonToken.START_ARRAY));
        jsonGenerator.KWHzl(t);
        serializeContents(t, jsonGenerator, vi);
        abstractC5601Xz.copydefault(jsonGenerator, writableTypeIdAEQbTJ);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, o.InterfaceC5598Xw
    public JsonNode getSchema(VI vi, Type type) throws JsonMappingException {
        ObjectNode objectNodeCreateSchemaNode = createSchemaNode("array", true);
        InterfaceC5586Xk interfaceC5586Xk = this._elementSerializer;
        if (interfaceC5586Xk != null) {
            JsonNode schema = interfaceC5586Xk instanceof InterfaceC5598Xw ? ((InterfaceC5598Xw) interfaceC5586Xk).getSchema(vi, null) : null;
            if (schema == null) {
                schema = C5594Xs.OLrzqt();
            }
            objectNodeCreateSchemaNode.set("items", schema);
        }
        return objectNodeCreateSchemaNode;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, o.VD
    public void acceptJsonFormatVisitor(InterfaceC5584Xi interfaceC5584Xi, JavaType javaType) throws JsonMappingException {
        VD<Object> vdFindContentValueSerializer = this._elementSerializer;
        if (vdFindContentValueSerializer == null && this._elementType != null) {
            vdFindContentValueSerializer = interfaceC5584Xi.AEQbTJ().findContentValueSerializer(this._elementType, this._property);
        }
        visitArrayFormat(interfaceC5584Xi, javaType, vdFindContentValueSerializer, this._elementType);
    }

    public final VD<Object> _findAndAddDynamic(AbstractC5604Yc abstractC5604Yc, Class<?> cls, VI vi) throws JsonMappingException {
        AbstractC5604Yc.TaskDescription taskDescriptionOLrzqt = abstractC5604Yc.OLrzqt(cls, vi, this._property);
        AbstractC5604Yc abstractC5604Yc2 = taskDescriptionOLrzqt.EZpvd;
        if (abstractC5604Yc != abstractC5604Yc2) {
            this._dynamicSerializers = abstractC5604Yc2;
        }
        return taskDescriptionOLrzqt.KWHzl;
    }

    public final VD<Object> _findAndAddDynamic(AbstractC5604Yc abstractC5604Yc, JavaType javaType, VI vi) throws JsonMappingException {
        AbstractC5604Yc.TaskDescription taskDescriptionOLrzqt = abstractC5604Yc.OLrzqt(javaType, vi, this._property);
        AbstractC5604Yc abstractC5604Yc2 = taskDescriptionOLrzqt.EZpvd;
        if (abstractC5604Yc != abstractC5604Yc2) {
            this._dynamicSerializers = abstractC5604Yc2;
        }
        return taskDescriptionOLrzqt.KWHzl;
    }
}
