package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.introspect.AnnotatedField;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import o.AbstractC5548Vy;
import o.AbstractC5597Xv;
import o.C5619Yr;
import o.InterfaceC5555Wf;
import o.InterfaceC5609Yh;
import o.WT;

/* JADX INFO: loaded from: classes21.dex */
public final class FieldProperty extends SettableBeanProperty {
    private static final long serialVersionUID = 1;
    protected final AnnotatedField _annotated;
    protected final transient Field _field;
    protected final boolean _skipNulls;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty, com.fasterxml.jackson.databind.BeanProperty
    public AnnotatedMember getMember() {
        return this._annotated;
    }

    public FieldProperty(WT wt, JavaType javaType, AbstractC5597Xv abstractC5597Xv, InterfaceC5609Yh interfaceC5609Yh, AnnotatedField annotatedField) {
        super(wt, javaType, abstractC5597Xv, interfaceC5609Yh);
        this._annotated = annotatedField;
        this._field = annotatedField.getAnnotated();
        this._skipNulls = NullsConstantProvider.isSkipper(this._nullProvider);
    }

    public FieldProperty(FieldProperty fieldProperty, AbstractC5548Vy<?> abstractC5548Vy, InterfaceC5555Wf interfaceC5555Wf) {
        super(fieldProperty, abstractC5548Vy, interfaceC5555Wf);
        this._annotated = fieldProperty._annotated;
        this._field = fieldProperty._field;
        this._skipNulls = NullsConstantProvider.isSkipper(interfaceC5555Wf);
    }

    public FieldProperty(FieldProperty fieldProperty, PropertyName propertyName) {
        super(fieldProperty, propertyName);
        this._annotated = fieldProperty._annotated;
        this._field = fieldProperty._field;
        this._skipNulls = fieldProperty._skipNulls;
    }

    public FieldProperty(FieldProperty fieldProperty) {
        super(fieldProperty);
        AnnotatedField annotatedField = fieldProperty._annotated;
        this._annotated = annotatedField;
        Field annotated = annotatedField.getAnnotated();
        if (annotated == null) {
            throw new IllegalArgumentException("Missing field (broken JDK (de)serialization?)");
        }
        this._field = annotated;
        this._skipNulls = fieldProperty._skipNulls;
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public SettableBeanProperty withName(PropertyName propertyName) {
        return new FieldProperty(this, propertyName);
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public SettableBeanProperty withValueDeserializer(AbstractC5548Vy<?> abstractC5548Vy) {
        AbstractC5548Vy<?> abstractC5548Vy2 = this._valueDeserializer;
        if (abstractC5548Vy2 == abstractC5548Vy) {
            return this;
        }
        InterfaceC5555Wf interfaceC5555Wf = this._nullProvider;
        if (abstractC5548Vy2 == interfaceC5555Wf) {
            interfaceC5555Wf = abstractC5548Vy;
        }
        return new FieldProperty(this, abstractC5548Vy, interfaceC5555Wf);
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public SettableBeanProperty withNullProvider(InterfaceC5555Wf interfaceC5555Wf) {
        return new FieldProperty(this, this._valueDeserializer, interfaceC5555Wf);
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public void fixAccess(DeserializationConfig deserializationConfig) {
        C5619Yr.EZpvd(this._field, deserializationConfig.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty, com.fasterxml.jackson.databind.BeanProperty
    public <A extends Annotation> A getAnnotation(Class<A> cls) {
        AnnotatedField annotatedField = this._annotated;
        if (annotatedField == null) {
            return null;
        }
        return (A) annotatedField.getAnnotation(cls);
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public void deserializeAndSet(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        Object objDeserializeWithType;
        if (!jsonParser.copydefault(JsonToken.VALUE_NULL)) {
            AbstractC5597Xv abstractC5597Xv = this._valueTypeDeserializer;
            if (abstractC5597Xv == null) {
                Object objDeserialize = this._valueDeserializer.deserialize(jsonParser, deserializationContext);
                if (objDeserialize != null) {
                    objDeserializeWithType = objDeserialize;
                } else if (this._skipNulls) {
                    return;
                } else {
                    objDeserializeWithType = this._nullProvider.getNullValue(deserializationContext);
                }
            } else {
                objDeserializeWithType = this._valueDeserializer.deserializeWithType(jsonParser, deserializationContext, abstractC5597Xv);
            }
        } else if (this._skipNulls) {
            return;
        } else {
            objDeserializeWithType = this._nullProvider.getNullValue(deserializationContext);
        }
        try {
            this._field.set(obj, objDeserializeWithType);
        } catch (Exception e) {
            _throwAsIOE(jsonParser, e, objDeserializeWithType);
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public Object deserializeSetAndReturn(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        Object objDeserializeWithType;
        if (!jsonParser.copydefault(JsonToken.VALUE_NULL)) {
            AbstractC5597Xv abstractC5597Xv = this._valueTypeDeserializer;
            if (abstractC5597Xv == null) {
                Object objDeserialize = this._valueDeserializer.deserialize(jsonParser, deserializationContext);
                if (objDeserialize != null) {
                    objDeserializeWithType = objDeserialize;
                } else {
                    if (this._skipNulls) {
                        return obj;
                    }
                    objDeserializeWithType = this._nullProvider.getNullValue(deserializationContext);
                }
            } else {
                objDeserializeWithType = this._valueDeserializer.deserializeWithType(jsonParser, deserializationContext, abstractC5597Xv);
            }
        } else {
            if (this._skipNulls) {
                return obj;
            }
            objDeserializeWithType = this._nullProvider.getNullValue(deserializationContext);
        }
        try {
            this._field.set(obj, objDeserializeWithType);
        } catch (Exception e) {
            _throwAsIOE(jsonParser, e, objDeserializeWithType);
        }
        return obj;
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public void set(Object obj, Object obj2) throws IOException {
        try {
            this._field.set(obj, obj2);
        } catch (Exception e) {
            _throwAsIOE(e, obj2);
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public Object setAndReturn(Object obj, Object obj2) throws IOException {
        try {
            this._field.set(obj, obj2);
        } catch (Exception e) {
            _throwAsIOE(e, obj2);
        }
        return obj;
    }

    public Object readResolve() {
        return new FieldProperty(this);
    }
}
