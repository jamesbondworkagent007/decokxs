package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import com.fasterxml.jackson.databind.ser.std.ArraySerializerBase;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Objects;
import o.AbstractC5601Xz;
import o.InterfaceC5584Xi;
import o.VD;
import o.VI;
import o.VK;
import o.XT;

/* JADX INFO: loaded from: classes21.dex */
@VK
public class StringArraySerializer extends ArraySerializerBase<String[]> implements XT {
    private static final JavaType VALUE_TYPE = TypeFactory.defaultInstance().uncheckedSimpleType(String.class);
    public static final StringArraySerializer instance = new StringArraySerializer();
    protected final VD<Object> _elementSerializer;

    @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
    public ContainerSerializer<?> _withValueTypeSerializer(AbstractC5601Xz abstractC5601Xz) {
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
    public VD<?> getContentSerializer() {
        return this._elementSerializer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
    public JavaType getContentType() {
        return VALUE_TYPE;
    }

    public StringArraySerializer() {
        super(String[].class);
        this._elementSerializer = null;
    }

    public StringArraySerializer(StringArraySerializer stringArraySerializer, BeanProperty beanProperty, VD<?> vd, Boolean bool) {
        super(stringArraySerializer, beanProperty, bool);
        this._elementSerializer = vd;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.ArraySerializerBase
    public VD<?> _withResolved(BeanProperty beanProperty, Boolean bool) {
        return new StringArraySerializer(this, beanProperty, this._elementSerializer, bool);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0018  */
    @Override // com.fasterxml.jackson.databind.ser.std.ArraySerializerBase, o.XT
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public VD<?> createContextual(VI vi, BeanProperty beanProperty) throws JsonMappingException {
        VD<Object> vdSerializerInstance;
        Object objFindContentSerializer;
        if (beanProperty != null) {
            AnnotationIntrospector annotationIntrospector = vi.getAnnotationIntrospector();
            AnnotatedMember member = beanProperty.getMember();
            vdSerializerInstance = (member == null || (objFindContentSerializer = annotationIntrospector.findContentSerializer(member)) == null) ? null : vi.serializerInstance(member, objFindContentSerializer);
        }
        Boolean boolFindFormatFeature = findFormatFeature(vi, beanProperty, String[].class, JsonFormat.Feature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED);
        if (vdSerializerInstance == null) {
            vdSerializerInstance = this._elementSerializer;
        }
        VD<?> vdFindContextualConvertingSerializer = findContextualConvertingSerializer(vi, beanProperty, vdSerializerInstance);
        if (vdFindContextualConvertingSerializer == null) {
            vdFindContextualConvertingSerializer = vi.findContentValueSerializer(String.class, beanProperty);
        }
        VD<?> vd = isDefaultSerializer(vdFindContextualConvertingSerializer) ? null : vdFindContextualConvertingSerializer;
        return (vd == this._elementSerializer && Objects.equals(boolFindFormatFeature, this._unwrapSingle)) ? this : new StringArraySerializer(this, beanProperty, vd, boolFindFormatFeature);
    }

    /* JADX DEBUG: Method merged with bridge method: isEmpty(Lo/VI;Ljava/lang/Object;)Z */
    @Override // o.VD
    public boolean isEmpty(VI vi, String[] strArr) {
        return strArr.length == 0;
    }

    /* JADX DEBUG: Method merged with bridge method: hasSingleElement(Ljava/lang/Object;)Z */
    @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
    public boolean hasSingleElement(String[] strArr) {
        return strArr.length == 1;
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Ljava/lang/Object;Lcom/fasterxml/jackson/core/JsonGenerator;Lo/VI;)V */
    @Override // com.fasterxml.jackson.databind.ser.std.ArraySerializerBase, com.fasterxml.jackson.databind.ser.std.StdSerializer, o.VD
    public final void serialize(String[] strArr, JsonGenerator jsonGenerator, VI vi) throws IOException {
        int length = strArr.length;
        if (length == 1 && ((this._unwrapSingle == null && vi.isEnabled(SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED)) || this._unwrapSingle == Boolean.TRUE)) {
            serializeContents(strArr, jsonGenerator, vi);
            return;
        }
        jsonGenerator.AEQbTJ(strArr, length);
        serializeContents(strArr, jsonGenerator, vi);
        jsonGenerator.fetchVPNInfo();
    }

    /* JADX DEBUG: Method merged with bridge method: serializeContents(Ljava/lang/Object;Lcom/fasterxml/jackson/core/JsonGenerator;Lo/VI;)V */
    @Override // com.fasterxml.jackson.databind.ser.std.ArraySerializerBase
    public void serializeContents(String[] strArr, JsonGenerator jsonGenerator, VI vi) throws IOException {
        if (strArr.length == 0) {
            return;
        }
        VD<Object> vd = this._elementSerializer;
        if (vd != null) {
            serializeContentsSlow(strArr, jsonGenerator, vi, vd);
            return;
        }
        for (String str : strArr) {
            if (str == null) {
                jsonGenerator.isConnected();
            } else {
                jsonGenerator.AhwBna(str);
            }
        }
    }

    private void serializeContentsSlow(String[] strArr, JsonGenerator jsonGenerator, VI vi, VD<Object> vd) throws IOException {
        for (String str : strArr) {
            if (str == null) {
                vi.defaultSerializeNull(jsonGenerator);
            } else {
                vd.serialize(str, jsonGenerator, vi);
            }
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, o.InterfaceC5598Xw
    public JsonNode getSchema(VI vi, Type type) {
        return createSchemaNode("array", true).set("items", createSchemaNode("string"));
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, o.VD
    public void acceptJsonFormatVisitor(InterfaceC5584Xi interfaceC5584Xi, JavaType javaType) throws JsonMappingException {
        visitArrayFormat(interfaceC5584Xi, javaType, JsonFormatTypes.STRING);
    }
}
