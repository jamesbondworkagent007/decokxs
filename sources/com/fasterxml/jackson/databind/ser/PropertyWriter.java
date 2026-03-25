package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase;
import com.fasterxml.jackson.databind.node.ObjectNode;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import o.InterfaceC5593Xr;
import o.VI;
import o.WT;

/* JADX INFO: loaded from: classes21.dex */
public abstract class PropertyWriter extends ConcreteBeanPropertyBase implements Serializable {
    private static final long serialVersionUID = 1;

    @Deprecated
    public abstract void depositSchemaProperty(ObjectNode objectNode, VI vi) throws JsonMappingException;

    @Override // com.fasterxml.jackson.databind.BeanProperty
    public abstract void depositSchemaProperty(InterfaceC5593Xr interfaceC5593Xr, VI vi) throws JsonMappingException;

    @Override // com.fasterxml.jackson.databind.BeanProperty
    public abstract <A extends Annotation> A getAnnotation(Class<A> cls);

    @Override // com.fasterxml.jackson.databind.BeanProperty
    public abstract <A extends Annotation> A getContextAnnotation(Class<A> cls);

    @Override // com.fasterxml.jackson.databind.BeanProperty
    public abstract PropertyName getFullName();

    @Override // com.fasterxml.jackson.databind.BeanProperty, o.InterfaceC5623Yw
    public abstract String getName();

    public abstract void serializeAsElement(Object obj, JsonGenerator jsonGenerator, VI vi) throws Exception;

    public abstract void serializeAsField(Object obj, JsonGenerator jsonGenerator, VI vi) throws Exception;

    public abstract void serializeAsOmittedField(Object obj, JsonGenerator jsonGenerator, VI vi) throws Exception;

    public abstract void serializeAsPlaceholder(Object obj, JsonGenerator jsonGenerator, VI vi) throws Exception;

    public PropertyWriter(PropertyMetadata propertyMetadata) {
        super(propertyMetadata);
    }

    public PropertyWriter(WT wt) {
        super(wt.DbNXlk());
    }

    public PropertyWriter(PropertyWriter propertyWriter) {
        super(propertyWriter);
    }

    public <A extends Annotation> A findAnnotation(Class<A> cls) {
        A a2 = (A) getAnnotation(cls);
        return a2 == null ? (A) getContextAnnotation(cls) : a2;
    }
}
