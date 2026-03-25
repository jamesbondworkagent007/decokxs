package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Objects;
import o.AbstractC5601Xz;
import o.InterfaceC5583Xh;
import o.InterfaceC5584Xi;
import o.VD;
import o.VI;
import o.XT;

/* JADX INFO: loaded from: classes21.dex */
public abstract class StaticListSerializerBase<T extends Collection<?>> extends StdSerializer<T> implements XT {
    public final Boolean _unwrapSingle;

    public abstract VD<?> _withResolved(BeanProperty beanProperty, Boolean bool);

    public abstract void acceptContentVisitor(InterfaceC5583Xh interfaceC5583Xh) throws JsonMappingException;

    public abstract JsonNode contentSchema();

    /* JADX DEBUG: Method merged with bridge method: serializeWithType(Ljava/lang/Object;Lcom/fasterxml/jackson/core/JsonGenerator;Lo/VI;Lo/Xz;)V */
    @Override // o.VD
    public abstract void serializeWithType(T t, JsonGenerator jsonGenerator, VI vi, AbstractC5601Xz abstractC5601Xz) throws IOException;

    public StaticListSerializerBase(Class<?> cls) {
        super(cls, false);
        this._unwrapSingle = null;
    }

    public StaticListSerializerBase(StaticListSerializerBase<?> staticListSerializerBase, Boolean bool) {
        super(staticListSerializerBase);
        this._unwrapSingle = bool;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0018  */
    @Override // o.XT
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
        JsonFormat.Value valueFindFormatOverrides = findFormatOverrides(vi, beanProperty, handledType());
        Boolean feature = valueFindFormatOverrides != null ? valueFindFormatOverrides.getFeature(JsonFormat.Feature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED) : null;
        VD<?> vdFindContextualConvertingSerializer = findContextualConvertingSerializer(vi, beanProperty, vdSerializerInstance);
        if (vdFindContextualConvertingSerializer == null) {
            vdFindContextualConvertingSerializer = vi.findContentValueSerializer(String.class, beanProperty);
        }
        if (isDefaultSerializer(vdFindContextualConvertingSerializer)) {
            return Objects.equals(feature, this._unwrapSingle) ? this : _withResolved(beanProperty, feature);
        }
        return new CollectionSerializer(vi.constructType(String.class), true, null, vdFindContextualConvertingSerializer);
    }

    /* JADX DEBUG: Method merged with bridge method: isEmpty(Lo/VI;Ljava/lang/Object;)Z */
    @Override // o.VD
    public boolean isEmpty(VI vi, T t) {
        return t == null || t.isEmpty();
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, o.InterfaceC5598Xw
    public JsonNode getSchema(VI vi, Type type) {
        return createSchemaNode("array", true).set("items", contentSchema());
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, o.VD
    public void acceptJsonFormatVisitor(InterfaceC5584Xi interfaceC5584Xi, JavaType javaType) throws JsonMappingException {
        InterfaceC5583Xh interfaceC5583XhKWHzl = interfaceC5584Xi.KWHzl(javaType);
        if (interfaceC5583XhKWHzl != null) {
            acceptContentVisitor(interfaceC5583XhKWHzl);
        }
    }
}
