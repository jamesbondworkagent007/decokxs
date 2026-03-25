package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import java.io.IOException;
import java.util.Objects;
import o.AbstractC5601Xz;
import o.AbstractC5604Yc;
import o.InterfaceC5583Xh;
import o.InterfaceC5584Xi;
import o.VD;
import o.VI;
import o.VK;
import o.XT;

/* JADX INFO: loaded from: classes21.dex */
@VK
public class ObjectArraySerializer extends ArraySerializerBase<Object[]> implements XT {
    protected AbstractC5604Yc _dynamicSerializers;
    protected VD<Object> _elementSerializer;
    protected final JavaType _elementType;
    protected final boolean _staticTyping;
    protected final AbstractC5601Xz _valueTypeSerializer;

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

    public ObjectArraySerializer(JavaType javaType, boolean z, AbstractC5601Xz abstractC5601Xz, VD<Object> vd) {
        super(Object[].class);
        this._elementType = javaType;
        this._staticTyping = z;
        this._valueTypeSerializer = abstractC5601Xz;
        this._dynamicSerializers = AbstractC5604Yc.copydefault();
        this._elementSerializer = vd;
    }

    public ObjectArraySerializer(ObjectArraySerializer objectArraySerializer, AbstractC5601Xz abstractC5601Xz) {
        super(objectArraySerializer);
        this._elementType = objectArraySerializer._elementType;
        this._valueTypeSerializer = abstractC5601Xz;
        this._staticTyping = objectArraySerializer._staticTyping;
        this._dynamicSerializers = objectArraySerializer._dynamicSerializers;
        this._elementSerializer = objectArraySerializer._elementSerializer;
    }

    public ObjectArraySerializer(ObjectArraySerializer objectArraySerializer, BeanProperty beanProperty, AbstractC5601Xz abstractC5601Xz, VD<?> vd, Boolean bool) {
        super(objectArraySerializer, beanProperty, bool);
        this._elementType = objectArraySerializer._elementType;
        this._valueTypeSerializer = abstractC5601Xz;
        this._staticTyping = objectArraySerializer._staticTyping;
        this._dynamicSerializers = AbstractC5604Yc.copydefault();
        this._elementSerializer = vd;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.ArraySerializerBase
    public VD<?> _withResolved(BeanProperty beanProperty, Boolean bool) {
        return new ObjectArraySerializer(this, beanProperty, this._valueTypeSerializer, this._elementSerializer, bool);
    }

    @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
    public ContainerSerializer<?> _withValueTypeSerializer(AbstractC5601Xz abstractC5601Xz) {
        return new ObjectArraySerializer(this._elementType, this._staticTyping, abstractC5601Xz, this._elementSerializer);
    }

    public ObjectArraySerializer withResolved(BeanProperty beanProperty, AbstractC5601Xz abstractC5601Xz, VD<?> vd, Boolean bool) {
        return (this._property == beanProperty && vd == this._elementSerializer && this._valueTypeSerializer == abstractC5601Xz && Objects.equals(this._unwrapSingle, bool)) ? this : new ObjectArraySerializer(this, beanProperty, abstractC5601Xz, vd, bool);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: com.fasterxml.jackson.databind.ser.std.ObjectArraySerializer */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0020  */
    @Override // com.fasterxml.jackson.databind.ser.std.ArraySerializerBase, o.XT
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
            AnnotatedMember member = beanProperty.getMember();
            vdSerializerInstance = (member == null || (objFindContentSerializer = vi.getAnnotationIntrospector().findContentSerializer(member)) == null) ? null : vi.serializerInstance(member, objFindContentSerializer);
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
        return withResolved(beanProperty, abstractC5601XzOLrzqt, vdFindContextualConvertingSerializer, feature);
    }

    /* JADX DEBUG: Method merged with bridge method: isEmpty(Lo/VI;Ljava/lang/Object;)Z */
    @Override // o.VD
    public boolean isEmpty(VI vi, Object[] objArr) {
        return objArr.length == 0;
    }

    /* JADX DEBUG: Method merged with bridge method: hasSingleElement(Ljava/lang/Object;)Z */
    @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
    public boolean hasSingleElement(Object[] objArr) {
        return objArr.length == 1;
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Ljava/lang/Object;Lcom/fasterxml/jackson/core/JsonGenerator;Lo/VI;)V */
    @Override // com.fasterxml.jackson.databind.ser.std.ArraySerializerBase, com.fasterxml.jackson.databind.ser.std.StdSerializer, o.VD
    public final void serialize(Object[] objArr, JsonGenerator jsonGenerator, VI vi) throws IOException {
        int length = objArr.length;
        if (length == 1 && ((this._unwrapSingle == null && vi.isEnabled(SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED)) || this._unwrapSingle == Boolean.TRUE)) {
            serializeContents(objArr, jsonGenerator, vi);
            return;
        }
        jsonGenerator.AEQbTJ(objArr, length);
        serializeContents(objArr, jsonGenerator, vi);
        jsonGenerator.fetchVPNInfo();
    }

    /* JADX DEBUG: Method merged with bridge method: serializeContents(Ljava/lang/Object;Lcom/fasterxml/jackson/core/JsonGenerator;Lo/VI;)V */
    @Override // com.fasterxml.jackson.databind.ser.std.ArraySerializerBase
    public void serializeContents(Object[] objArr, JsonGenerator jsonGenerator, VI vi) throws IOException {
        int length = objArr.length;
        if (length == 0) {
            return;
        }
        VD<Object> vd = this._elementSerializer;
        if (vd != null) {
            serializeContentsUsing(objArr, jsonGenerator, vi, vd);
            return;
        }
        if (this._valueTypeSerializer != null) {
            serializeTypedContents(objArr, jsonGenerator, vi);
            return;
        }
        Object obj = null;
        int i = 0;
        try {
            AbstractC5604Yc abstractC5604Yc = this._dynamicSerializers;
            while (i < length) {
                obj = objArr[i];
                if (obj == null) {
                    vi.defaultSerializeNull(jsonGenerator);
                } else {
                    Class<?> cls = obj.getClass();
                    VD<Object> vdAEQbTJ = abstractC5604Yc.AEQbTJ(cls);
                    if (vdAEQbTJ == null) {
                        if (this._elementType.hasGenericTypes()) {
                            vdAEQbTJ = _findAndAddDynamic(abstractC5604Yc, vi.constructSpecializedType(this._elementType, cls), vi);
                        } else {
                            vdAEQbTJ = _findAndAddDynamic(abstractC5604Yc, cls, vi);
                        }
                    }
                    vdAEQbTJ.serialize(obj, jsonGenerator, vi);
                }
                i++;
            }
        } catch (Exception e) {
            wrapAndThrow(vi, e, obj, i);
        }
    }

    public void serializeContentsUsing(Object[] objArr, JsonGenerator jsonGenerator, VI vi, VD<Object> vd) throws IOException {
        int length = objArr.length;
        AbstractC5601Xz abstractC5601Xz = this._valueTypeSerializer;
        Object obj = null;
        for (int i = 0; i < length; i++) {
            try {
                obj = objArr[i];
                if (obj == null) {
                    vi.defaultSerializeNull(jsonGenerator);
                } else if (abstractC5601Xz == null) {
                    vd.serialize(obj, jsonGenerator, vi);
                } else {
                    vd.serializeWithType(obj, jsonGenerator, vi, abstractC5601Xz);
                }
            } catch (Exception e) {
                wrapAndThrow(vi, e, obj, i);
                return;
            }
        }
    }

    public void serializeTypedContents(Object[] objArr, JsonGenerator jsonGenerator, VI vi) throws IOException {
        int length = objArr.length;
        AbstractC5601Xz abstractC5601Xz = this._valueTypeSerializer;
        int i = 0;
        Object obj = null;
        try {
            AbstractC5604Yc abstractC5604Yc = this._dynamicSerializers;
            while (i < length) {
                obj = objArr[i];
                if (obj == null) {
                    vi.defaultSerializeNull(jsonGenerator);
                } else {
                    Class<?> cls = obj.getClass();
                    VD<Object> vdAEQbTJ = abstractC5604Yc.AEQbTJ(cls);
                    if (vdAEQbTJ == null) {
                        vdAEQbTJ = _findAndAddDynamic(abstractC5604Yc, cls, vi);
                    }
                    vdAEQbTJ.serializeWithType(obj, jsonGenerator, vi, abstractC5601Xz);
                }
                i++;
            }
        } catch (Exception e) {
            wrapAndThrow(vi, e, obj, i);
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, o.VD
    public void acceptJsonFormatVisitor(InterfaceC5584Xi interfaceC5584Xi, JavaType javaType) throws JsonMappingException {
        InterfaceC5583Xh interfaceC5583XhKWHzl = interfaceC5584Xi.KWHzl(javaType);
        if (interfaceC5583XhKWHzl != null) {
            JavaType javaType2 = this._elementType;
            VD<Object> vdFindContentValueSerializer = this._elementSerializer;
            if (vdFindContentValueSerializer == null) {
                vdFindContentValueSerializer = interfaceC5584Xi.AEQbTJ().findContentValueSerializer(javaType2, this._property);
            }
            interfaceC5583XhKWHzl.AEQbTJ(vdFindContentValueSerializer, javaType2);
        }
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
