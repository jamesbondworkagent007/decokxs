package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ser.impl.BeanAsArraySerializer;
import com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer;
import com.fasterxml.jackson.databind.ser.std.BeanSerializerBase;
import com.fasterxml.jackson.databind.util.NameTransformer;
import java.io.IOException;
import java.util.Set;
import o.C5606Ye;
import o.VD;
import o.VI;
import o.XU;

/* JADX INFO: loaded from: classes21.dex */
public class BeanSerializer extends BeanSerializerBase {
    private static final long serialVersionUID = 29;

    public BeanSerializer(JavaType javaType, XU xu, BeanPropertyWriter[] beanPropertyWriterArr, BeanPropertyWriter[] beanPropertyWriterArr2) {
        super(javaType, xu, beanPropertyWriterArr, beanPropertyWriterArr2);
    }

    public BeanSerializer(BeanSerializerBase beanSerializerBase) {
        super(beanSerializerBase);
    }

    public BeanSerializer(BeanSerializerBase beanSerializerBase, C5606Ye c5606Ye) {
        super(beanSerializerBase, c5606Ye);
    }

    public BeanSerializer(BeanSerializerBase beanSerializerBase, C5606Ye c5606Ye, Object obj) {
        super(beanSerializerBase, c5606Ye, obj);
    }

    public BeanSerializer(BeanSerializerBase beanSerializerBase, Set<String> set, Set<String> set2) {
        super(beanSerializerBase, set, set2);
    }

    public BeanSerializer(BeanSerializerBase beanSerializerBase, BeanPropertyWriter[] beanPropertyWriterArr, BeanPropertyWriter[] beanPropertyWriterArr2) {
        super(beanSerializerBase, beanPropertyWriterArr, beanPropertyWriterArr2);
    }

    @Deprecated
    public static BeanSerializer createDummy(JavaType javaType) {
        return new BeanSerializer(javaType, null, BeanSerializerBase.NO_PROPS, null);
    }

    public static BeanSerializer createDummy(JavaType javaType, XU xu) {
        return new BeanSerializer(javaType, xu, BeanSerializerBase.NO_PROPS, null);
    }

    @Override // o.VD
    public VD<Object> unwrappingSerializer(NameTransformer nameTransformer) {
        return new UnwrappingBeanSerializer(this, nameTransformer);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.BeanSerializerBase
    public BeanSerializerBase withObjectIdWriter(C5606Ye c5606Ye) {
        return new BeanSerializer(this, c5606Ye, this._propertyFilterId);
    }

    /* JADX DEBUG: Method merged with bridge method: withFilterId(Ljava/lang/Object;)Lo/VD; */
    @Override // com.fasterxml.jackson.databind.ser.std.BeanSerializerBase, o.VD
    public BeanSerializerBase withFilterId(Object obj) {
        return new BeanSerializer(this, this._objectIdWriter, obj);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.BeanSerializerBase
    public BeanSerializerBase withByNameInclusion(Set<String> set, Set<String> set2) {
        return new BeanSerializer(this, set, set2);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.BeanSerializerBase
    public BeanSerializerBase withProperties(BeanPropertyWriter[] beanPropertyWriterArr, BeanPropertyWriter[] beanPropertyWriterArr2) {
        return new BeanSerializer(this, beanPropertyWriterArr, beanPropertyWriterArr2);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.BeanSerializerBase
    public BeanSerializerBase asArraySerializer() {
        return (this._objectIdWriter == null && this._anyGetterWriter == null && this._propertyFilterId == null) ? new BeanAsArraySerializer(this) : this;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.BeanSerializerBase, com.fasterxml.jackson.databind.ser.std.StdSerializer, o.VD
    public final void serialize(Object obj, JsonGenerator jsonGenerator, VI vi) throws IOException {
        if (this._objectIdWriter != null) {
            jsonGenerator.KWHzl(obj);
            _serializeWithObjectId(obj, jsonGenerator, vi, true);
            return;
        }
        jsonGenerator.AYXKKw(obj);
        if (this._propertyFilterId != null) {
            serializeFieldsFiltered(obj, jsonGenerator, vi);
        } else {
            serializeFields(obj, jsonGenerator, vi);
        }
        jsonGenerator.DbNXlk();
    }

    public String toString() {
        return "BeanSerializer for " + handledType().getName();
    }
}
