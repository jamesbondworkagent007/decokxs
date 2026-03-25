package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.ser.VirtualBeanPropertyWriter;
import o.InterfaceC5609Yh;
import o.VI;
import o.WJ;
import o.WT;

/* JADX INFO: loaded from: classes21.dex */
public class AttributePropertyWriter extends VirtualBeanPropertyWriter {
    private static final long serialVersionUID = 1;
    protected final String _attrName;

    public AttributePropertyWriter(String str, WT wt, InterfaceC5609Yh interfaceC5609Yh, JavaType javaType) {
        this(str, wt, interfaceC5609Yh, javaType, wt.EZpvd());
    }

    public AttributePropertyWriter(String str, WT wt, InterfaceC5609Yh interfaceC5609Yh, JavaType javaType, JsonInclude.Value value) {
        super(wt, interfaceC5609Yh, javaType, null, null, null, value, null);
        this._attrName = str;
    }

    public static AttributePropertyWriter construct(String str, WT wt, InterfaceC5609Yh interfaceC5609Yh, JavaType javaType) {
        return new AttributePropertyWriter(str, wt, interfaceC5609Yh, javaType);
    }

    public AttributePropertyWriter(AttributePropertyWriter attributePropertyWriter) {
        super(attributePropertyWriter);
        this._attrName = attributePropertyWriter._attrName;
    }

    @Override // com.fasterxml.jackson.databind.ser.VirtualBeanPropertyWriter
    public VirtualBeanPropertyWriter withConfig(MapperConfig<?> mapperConfig, WJ wj, WT wt, JavaType javaType) {
        throw new IllegalStateException("Should not be called on this type");
    }

    @Override // com.fasterxml.jackson.databind.ser.VirtualBeanPropertyWriter
    public Object value(Object obj, JsonGenerator jsonGenerator, VI vi) throws Exception {
        return vi.getAttribute(this._attrName);
    }
}
