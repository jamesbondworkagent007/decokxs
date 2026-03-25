package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase;
import java.io.IOException;
import java.util.List;
import o.AbstractC5601Xz;
import o.AbstractC5604Yc;
import o.VD;
import o.VI;
import o.VK;

/* JADX INFO: loaded from: classes21.dex */
@VK
public final class IndexedListSerializer extends AsArraySerializerBase<List<?>> {
    private static final long serialVersionUID = 1;

    /* JADX DEBUG: Return type fixed from 'com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase' to match base method */
    @Override // com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase
    /* JADX INFO: renamed from: withResolved, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ AsArraySerializerBase<List<?>> withResolved2(BeanProperty beanProperty, AbstractC5601Xz abstractC5601Xz, VD vd, Boolean bool) {
        return withResolved(beanProperty, abstractC5601Xz, (VD<?>) vd, bool);
    }

    public IndexedListSerializer(JavaType javaType, boolean z, AbstractC5601Xz abstractC5601Xz, VD<Object> vd) {
        super((Class<?>) List.class, javaType, z, abstractC5601Xz, vd);
    }

    public IndexedListSerializer(IndexedListSerializer indexedListSerializer, BeanProperty beanProperty, AbstractC5601Xz abstractC5601Xz, VD<?> vd, Boolean bool) {
        super(indexedListSerializer, beanProperty, abstractC5601Xz, vd, bool);
    }

    /* JADX DEBUG: Return type fixed from 'com.fasterxml.jackson.databind.ser.impl.IndexedListSerializer' to match base method */
    @Override // com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase
    public AsArraySerializerBase<List<?>> withResolved(BeanProperty beanProperty, AbstractC5601Xz abstractC5601Xz, VD<?> vd, Boolean bool) {
        return new IndexedListSerializer(this, beanProperty, abstractC5601Xz, vd, bool);
    }

    /* JADX DEBUG: Method merged with bridge method: isEmpty(Lo/VI;Ljava/lang/Object;)Z */
    @Override // o.VD
    public boolean isEmpty(VI vi, List<?> list) {
        return list.isEmpty();
    }

    /* JADX DEBUG: Method merged with bridge method: hasSingleElement(Ljava/lang/Object;)Z */
    @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
    public boolean hasSingleElement(List<?> list) {
        return list.size() == 1;
    }

    @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
    public ContainerSerializer<?> _withValueTypeSerializer(AbstractC5601Xz abstractC5601Xz) {
        return new IndexedListSerializer(this, this._property, abstractC5601Xz, this._elementSerializer, this._unwrapSingle);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Ljava/lang/Object;Lcom/fasterxml/jackson/core/JsonGenerator;Lo/VI;)V */
    @Override // com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase, com.fasterxml.jackson.databind.ser.std.StdSerializer, o.VD
    public final void serialize(List<?> list, JsonGenerator jsonGenerator, VI vi) throws IOException {
        int size = list.size();
        if (size == 1 && ((this._unwrapSingle == null && vi.isEnabled(SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED)) || this._unwrapSingle == Boolean.TRUE)) {
            serializeContents(list, jsonGenerator, vi);
            return;
        }
        jsonGenerator.AEQbTJ(list, size);
        serializeContents(list, jsonGenerator, vi);
        jsonGenerator.fetchVPNInfo();
    }

    /* JADX DEBUG: Method merged with bridge method: serializeContents(Ljava/lang/Object;Lcom/fasterxml/jackson/core/JsonGenerator;Lo/VI;)V */
    @Override // com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase
    public void serializeContents(List<?> list, JsonGenerator jsonGenerator, VI vi) throws IOException {
        VD<Object> vd_findAndAddDynamic;
        VD<Object> vd = this._elementSerializer;
        if (vd != null) {
            serializeContentsUsing(list, jsonGenerator, vi, vd);
            return;
        }
        if (this._valueTypeSerializer != null) {
            serializeTypedContents(list, jsonGenerator, vi);
            return;
        }
        int size = list.size();
        if (size == 0) {
            return;
        }
        int i = 0;
        try {
            AbstractC5604Yc abstractC5604Yc = this._dynamicSerializers;
            while (i < size) {
                Object obj = list.get(i);
                if (obj == null) {
                    vi.defaultSerializeNull(jsonGenerator);
                } else {
                    Class<?> cls = obj.getClass();
                    VD<Object> vdAEQbTJ = abstractC5604Yc.AEQbTJ(cls);
                    if (vdAEQbTJ == null) {
                        if (this._elementType.hasGenericTypes()) {
                            vd_findAndAddDynamic = _findAndAddDynamic(abstractC5604Yc, vi.constructSpecializedType(this._elementType, cls), vi);
                        } else {
                            vd_findAndAddDynamic = _findAndAddDynamic(abstractC5604Yc, cls, vi);
                        }
                        vdAEQbTJ = vd_findAndAddDynamic;
                        abstractC5604Yc = this._dynamicSerializers;
                    }
                    vdAEQbTJ.serialize(obj, jsonGenerator, vi);
                }
                i++;
            }
        } catch (Exception e) {
            wrapAndThrow(vi, e, list, i);
        }
    }

    public void serializeContentsUsing(List<?> list, JsonGenerator jsonGenerator, VI vi, VD<Object> vd) throws IOException {
        int size = list.size();
        if (size == 0) {
            return;
        }
        AbstractC5601Xz abstractC5601Xz = this._valueTypeSerializer;
        for (int i = 0; i < size; i++) {
            Object obj = list.get(i);
            if (obj == null) {
                try {
                    vi.defaultSerializeNull(jsonGenerator);
                } catch (Exception e) {
                    wrapAndThrow(vi, e, list, i);
                }
            } else if (abstractC5601Xz == null) {
                vd.serialize(obj, jsonGenerator, vi);
            } else {
                vd.serializeWithType(obj, jsonGenerator, vi, abstractC5601Xz);
            }
        }
    }

    public void serializeTypedContents(List<?> list, JsonGenerator jsonGenerator, VI vi) throws IOException {
        VD<Object> vd_findAndAddDynamic;
        int size = list.size();
        if (size == 0) {
            return;
        }
        int i = 0;
        try {
            AbstractC5601Xz abstractC5601Xz = this._valueTypeSerializer;
            AbstractC5604Yc abstractC5604Yc = this._dynamicSerializers;
            while (i < size) {
                Object obj = list.get(i);
                if (obj == null) {
                    vi.defaultSerializeNull(jsonGenerator);
                } else {
                    Class<?> cls = obj.getClass();
                    VD<Object> vdAEQbTJ = abstractC5604Yc.AEQbTJ(cls);
                    if (vdAEQbTJ == null) {
                        if (this._elementType.hasGenericTypes()) {
                            vd_findAndAddDynamic = _findAndAddDynamic(abstractC5604Yc, vi.constructSpecializedType(this._elementType, cls), vi);
                        } else {
                            vd_findAndAddDynamic = _findAndAddDynamic(abstractC5604Yc, cls, vi);
                        }
                        vdAEQbTJ = vd_findAndAddDynamic;
                        abstractC5604Yc = this._dynamicSerializers;
                    }
                    vdAEQbTJ.serializeWithType(obj, jsonGenerator, vi, abstractC5601Xz);
                }
                i++;
            }
        } catch (Exception e) {
            wrapAndThrow(vi, e, list, i);
        }
    }
}
