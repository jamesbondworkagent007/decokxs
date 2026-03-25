package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.ser.PropertyWriter;
import java.io.IOException;
import java.lang.annotation.Annotation;
import o.AbstractC5601Xz;
import o.InterfaceC5593Xr;
import o.VD;
import o.VI;

/* JADX INFO: loaded from: classes21.dex */
public class MapProperty extends PropertyWriter {
    private static final BeanProperty BOGUS_PROP = new BeanProperty.TaskDescription();
    private static final long serialVersionUID = 1;
    protected Object _key;
    protected VD<Object> _keySerializer;
    protected final BeanProperty _property;
    protected final AbstractC5601Xz _typeSerializer;
    protected Object _value;
    protected VD<Object> _valueSerializer;

    @Override // com.fasterxml.jackson.databind.ser.PropertyWriter
    @Deprecated
    public void depositSchemaProperty(ObjectNode objectNode, VI vi) throws JsonMappingException {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Object getValue() {
        return this._value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void reset(Object obj, Object obj2, VD<Object> vd, VD<Object> vd2) {
        this._key = obj;
        this._value = obj2;
        this._keySerializer = vd;
        this._valueSerializer = vd2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setValue(Object obj) {
        this._value = obj;
    }

    public MapProperty(AbstractC5601Xz abstractC5601Xz, BeanProperty beanProperty) {
        super(beanProperty == null ? PropertyMetadata.STD_REQUIRED_OR_OPTIONAL : beanProperty.getMetadata());
        this._typeSerializer = abstractC5601Xz;
        this._property = beanProperty == null ? BOGUS_PROP : beanProperty;
    }

    @Deprecated
    public void reset(Object obj, VD<Object> vd, VD<Object> vd2) {
        reset(obj, this._value, vd, vd2);
    }

    @Override // com.fasterxml.jackson.databind.ser.PropertyWriter, com.fasterxml.jackson.databind.BeanProperty, o.InterfaceC5623Yw
    public String getName() {
        Object obj = this._key;
        if (obj instanceof String) {
            return (String) obj;
        }
        return String.valueOf(obj);
    }

    @Override // com.fasterxml.jackson.databind.ser.PropertyWriter, com.fasterxml.jackson.databind.BeanProperty
    public PropertyName getFullName() {
        return new PropertyName(getName());
    }

    @Override // com.fasterxml.jackson.databind.ser.PropertyWriter, com.fasterxml.jackson.databind.BeanProperty
    public <A extends Annotation> A getAnnotation(Class<A> cls) {
        return (A) this._property.getAnnotation(cls);
    }

    @Override // com.fasterxml.jackson.databind.ser.PropertyWriter, com.fasterxml.jackson.databind.BeanProperty
    public <A extends Annotation> A getContextAnnotation(Class<A> cls) {
        return (A) this._property.getContextAnnotation(cls);
    }

    @Override // com.fasterxml.jackson.databind.ser.PropertyWriter
    public void serializeAsField(Object obj, JsonGenerator jsonGenerator, VI vi) throws IOException {
        this._keySerializer.serialize(this._key, jsonGenerator, vi);
        AbstractC5601Xz abstractC5601Xz = this._typeSerializer;
        if (abstractC5601Xz == null) {
            this._valueSerializer.serialize(this._value, jsonGenerator, vi);
        } else {
            this._valueSerializer.serializeWithType(this._value, jsonGenerator, vi, abstractC5601Xz);
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.PropertyWriter
    public void serializeAsOmittedField(Object obj, JsonGenerator jsonGenerator, VI vi) throws Exception {
        if (jsonGenerator.OLrzqt()) {
            return;
        }
        jsonGenerator.OLrzqt(getName());
    }

    @Override // com.fasterxml.jackson.databind.ser.PropertyWriter
    public void serializeAsElement(Object obj, JsonGenerator jsonGenerator, VI vi) throws Exception {
        AbstractC5601Xz abstractC5601Xz = this._typeSerializer;
        if (abstractC5601Xz == null) {
            this._valueSerializer.serialize(this._value, jsonGenerator, vi);
        } else {
            this._valueSerializer.serializeWithType(this._value, jsonGenerator, vi, abstractC5601Xz);
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.PropertyWriter
    public void serializeAsPlaceholder(Object obj, JsonGenerator jsonGenerator, VI vi) throws Exception {
        jsonGenerator.isConnected();
    }

    @Override // com.fasterxml.jackson.databind.ser.PropertyWriter, com.fasterxml.jackson.databind.BeanProperty
    public void depositSchemaProperty(InterfaceC5593Xr interfaceC5593Xr, VI vi) throws JsonMappingException {
        this._property.depositSchemaProperty(interfaceC5593Xr, vi);
    }

    @Override // com.fasterxml.jackson.databind.BeanProperty
    public JavaType getType() {
        return this._property.getType();
    }

    @Override // com.fasterxml.jackson.databind.BeanProperty
    public PropertyName getWrapperName() {
        return this._property.getWrapperName();
    }

    @Override // com.fasterxml.jackson.databind.BeanProperty
    public AnnotatedMember getMember() {
        return this._property.getMember();
    }
}
