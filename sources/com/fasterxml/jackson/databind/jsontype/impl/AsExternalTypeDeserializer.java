package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import o.AbstractC5597Xv;
import o.XB;

/* JADX INFO: loaded from: classes21.dex */
public class AsExternalTypeDeserializer extends AsArrayTypeDeserializer {
    private static final long serialVersionUID = 1;

    @Override // com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer
    public boolean _usesExternalId() {
        return true;
    }

    public AsExternalTypeDeserializer(JavaType javaType, XB xb, String str, boolean z, JavaType javaType2) {
        super(javaType, xb, str, z, javaType2);
    }

    public AsExternalTypeDeserializer(AsExternalTypeDeserializer asExternalTypeDeserializer, BeanProperty beanProperty) {
        super(asExternalTypeDeserializer, beanProperty);
    }

    @Override // com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer, com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase, o.AbstractC5597Xv
    public AbstractC5597Xv forProperty(BeanProperty beanProperty) {
        return beanProperty == this._property ? this : new AsExternalTypeDeserializer(this, beanProperty);
    }

    @Override // com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer, com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase, o.AbstractC5597Xv
    public JsonTypeInfo.As getTypeInclusion() {
        return JsonTypeInfo.As.EXTERNAL_PROPERTY;
    }
}
