package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.ser.BeanPropertyWriter;
import com.fasterxml.jackson.databind.ser.std.BeanSerializerBase;
import com.fasterxml.jackson.databind.util.NameTransformer;
import java.io.IOException;
import java.util.Set;
import o.AbstractC5601Xz;
import o.C5606Ye;
import o.VD;
import o.VI;

/* JADX INFO: loaded from: classes21.dex */
public class BeanAsArraySerializer extends BeanSerializerBase {
    private static final long serialVersionUID = 1;
    protected final BeanSerializerBase _defaultSerializer;

    @Override // com.fasterxml.jackson.databind.ser.std.BeanSerializerBase
    public BeanSerializerBase asArraySerializer() {
        return this;
    }

    @Override // o.VD
    public boolean isUnwrappingSerializer() {
        return false;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.BeanSerializerBase
    public BeanSerializerBase withProperties(BeanPropertyWriter[] beanPropertyWriterArr, BeanPropertyWriter[] beanPropertyWriterArr2) {
        return this;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.BeanSerializerBase
    public /* bridge */ /* synthetic */ BeanSerializerBase withByNameInclusion(Set set, Set set2) {
        return withByNameInclusion((Set<String>) set, (Set<String>) set2);
    }

    public BeanAsArraySerializer(BeanSerializerBase beanSerializerBase) {
        super(beanSerializerBase, (C5606Ye) null);
        this._defaultSerializer = beanSerializerBase;
    }

    public BeanAsArraySerializer(BeanSerializerBase beanSerializerBase, Set<String> set) {
        this(beanSerializerBase, set, (Set<String>) null);
    }

    public BeanAsArraySerializer(BeanSerializerBase beanSerializerBase, Set<String> set, Set<String> set2) {
        super(beanSerializerBase, set, set2);
        this._defaultSerializer = beanSerializerBase;
    }

    public BeanAsArraySerializer(BeanSerializerBase beanSerializerBase, C5606Ye c5606Ye, Object obj) {
        super(beanSerializerBase, c5606Ye, obj);
        this._defaultSerializer = beanSerializerBase;
    }

    @Override // o.VD
    public VD<Object> unwrappingSerializer(NameTransformer nameTransformer) {
        return this._defaultSerializer.unwrappingSerializer(nameTransformer);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.BeanSerializerBase
    public BeanSerializerBase withObjectIdWriter(C5606Ye c5606Ye) {
        return this._defaultSerializer.withObjectIdWriter(c5606Ye);
    }

    /* JADX DEBUG: Method merged with bridge method: withFilterId(Ljava/lang/Object;)Lo/VD; */
    @Override // com.fasterxml.jackson.databind.ser.std.BeanSerializerBase, o.VD
    public BeanSerializerBase withFilterId(Object obj) {
        return new BeanAsArraySerializer(this, this._objectIdWriter, obj);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.BeanSerializerBase
    public BeanAsArraySerializer withByNameInclusion(Set<String> set, Set<String> set2) {
        return new BeanAsArraySerializer(this, set, set2);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.BeanSerializerBase, o.VD
    public void serializeWithType(Object obj, JsonGenerator jsonGenerator, VI vi, AbstractC5601Xz abstractC5601Xz) throws IOException {
        if (this._objectIdWriter != null) {
            _serializeWithObjectId(obj, jsonGenerator, vi, abstractC5601Xz);
            return;
        }
        WritableTypeId writableTypeId_typeIdDef = _typeIdDef(abstractC5601Xz, obj, JsonToken.START_ARRAY);
        abstractC5601Xz.AEQbTJ(jsonGenerator, writableTypeId_typeIdDef);
        jsonGenerator.KWHzl(obj);
        serializeAsArray(obj, jsonGenerator, vi);
        abstractC5601Xz.copydefault(jsonGenerator, writableTypeId_typeIdDef);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.BeanSerializerBase, com.fasterxml.jackson.databind.ser.std.StdSerializer, o.VD
    public final void serialize(Object obj, JsonGenerator jsonGenerator, VI vi) throws IOException {
        if (vi.isEnabled(SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED) && hasSingleElement(vi)) {
            serializeAsArray(obj, jsonGenerator, vi);
            return;
        }
        jsonGenerator.gEmmrt(obj);
        serializeAsArray(obj, jsonGenerator, vi);
        jsonGenerator.fetchVPNInfo();
    }

    private boolean hasSingleElement(VI vi) {
        return ((this._filteredProps == null || vi.getActiveView() == null) ? this._props : this._filteredProps).length == 1;
    }

    public final void serializeAsArray(Object obj, JsonGenerator jsonGenerator, VI vi) throws IOException {
        BeanPropertyWriter[] beanPropertyWriterArr = (this._filteredProps == null || vi.getActiveView() == null) ? this._props : this._filteredProps;
        int i = 0;
        try {
            int length = beanPropertyWriterArr.length;
            while (i < length) {
                BeanPropertyWriter beanPropertyWriter = beanPropertyWriterArr[i];
                if (beanPropertyWriter == null) {
                    jsonGenerator.isConnected();
                } else {
                    beanPropertyWriter.serializeAsElement(obj, jsonGenerator, vi);
                }
                i++;
            }
        } catch (Exception e) {
            wrapAndThrow(vi, e, obj, beanPropertyWriterArr[i].getName());
        } catch (StackOverflowError e2) {
            JsonMappingException jsonMappingExceptionFrom = JsonMappingException.from(jsonGenerator, "Infinite recursion (StackOverflowError)", e2);
            jsonMappingExceptionFrom.prependPath(obj, beanPropertyWriterArr[i].getName());
            throw jsonMappingExceptionFrom;
        }
    }

    public String toString() {
        return "BeanAsArraySerializer for " + handledType().getName();
    }
}
