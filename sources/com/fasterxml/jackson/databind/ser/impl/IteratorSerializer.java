package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase;
import java.io.IOException;
import java.util.Iterator;
import o.AbstractC5601Xz;
import o.AbstractC5604Yc;
import o.VD;
import o.VI;
import o.VK;

/* JADX INFO: loaded from: classes21.dex */
@VK
public class IteratorSerializer extends AsArraySerializerBase<Iterator<?>> {
    /* JADX DEBUG: Method merged with bridge method: hasSingleElement(Ljava/lang/Object;)Z */
    @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
    public boolean hasSingleElement(Iterator<?> it) {
        return false;
    }

    /* JADX DEBUG: Return type fixed from 'com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase' to match base method */
    @Override // com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase
    /* JADX INFO: renamed from: withResolved, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ AsArraySerializerBase<Iterator<?>> withResolved2(BeanProperty beanProperty, AbstractC5601Xz abstractC5601Xz, VD vd, Boolean bool) {
        return withResolved(beanProperty, abstractC5601Xz, (VD<?>) vd, bool);
    }

    public IteratorSerializer(JavaType javaType, boolean z, AbstractC5601Xz abstractC5601Xz) {
        super((Class<?>) Iterator.class, javaType, z, abstractC5601Xz, (VD<Object>) null);
    }

    public IteratorSerializer(IteratorSerializer iteratorSerializer, BeanProperty beanProperty, AbstractC5601Xz abstractC5601Xz, VD<?> vd, Boolean bool) {
        super(iteratorSerializer, beanProperty, abstractC5601Xz, vd, bool);
    }

    /* JADX DEBUG: Method merged with bridge method: isEmpty(Lo/VI;Ljava/lang/Object;)Z */
    @Override // o.VD
    public boolean isEmpty(VI vi, Iterator<?> it) {
        return !it.hasNext();
    }

    @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
    public ContainerSerializer<?> _withValueTypeSerializer(AbstractC5601Xz abstractC5601Xz) {
        return new IteratorSerializer(this, this._property, abstractC5601Xz, this._elementSerializer, this._unwrapSingle);
    }

    /* JADX DEBUG: Return type fixed from 'com.fasterxml.jackson.databind.ser.impl.IteratorSerializer' to match base method */
    @Override // com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase
    public AsArraySerializerBase<Iterator<?>> withResolved(BeanProperty beanProperty, AbstractC5601Xz abstractC5601Xz, VD<?> vd, Boolean bool) {
        return new IteratorSerializer(this, beanProperty, abstractC5601Xz, vd, bool);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Ljava/lang/Object;Lcom/fasterxml/jackson/core/JsonGenerator;Lo/VI;)V */
    @Override // com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase, com.fasterxml.jackson.databind.ser.std.StdSerializer, o.VD
    public final void serialize(Iterator<?> it, JsonGenerator jsonGenerator, VI vi) throws IOException {
        jsonGenerator.gEmmrt(it);
        serializeContents(it, jsonGenerator, vi);
        jsonGenerator.fetchVPNInfo();
    }

    /* JADX DEBUG: Method merged with bridge method: serializeContents(Ljava/lang/Object;Lcom/fasterxml/jackson/core/JsonGenerator;Lo/VI;)V */
    @Override // com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase
    public void serializeContents(Iterator<?> it, JsonGenerator jsonGenerator, VI vi) throws IOException {
        if (it.hasNext()) {
            VD<Object> vd = this._elementSerializer;
            if (vd == null) {
                _serializeDynamicContents(it, jsonGenerator, vi);
                return;
            }
            AbstractC5601Xz abstractC5601Xz = this._valueTypeSerializer;
            do {
                Object next = it.next();
                if (next == null) {
                    vi.defaultSerializeNull(jsonGenerator);
                } else if (abstractC5601Xz == null) {
                    vd.serialize(next, jsonGenerator, vi);
                } else {
                    vd.serializeWithType(next, jsonGenerator, vi, abstractC5601Xz);
                }
            } while (it.hasNext());
        }
    }

    public void _serializeDynamicContents(Iterator<?> it, JsonGenerator jsonGenerator, VI vi) throws IOException {
        VD<Object> vd_findAndAddDynamic;
        AbstractC5601Xz abstractC5601Xz = this._valueTypeSerializer;
        AbstractC5604Yc abstractC5604Yc = this._dynamicSerializers;
        do {
            Object next = it.next();
            if (next == null) {
                vi.defaultSerializeNull(jsonGenerator);
            } else {
                Class<?> cls = next.getClass();
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
                if (abstractC5601Xz == null) {
                    vdAEQbTJ.serialize(next, jsonGenerator, vi);
                } else {
                    vdAEQbTJ.serializeWithType(next, jsonGenerator, vi, abstractC5601Xz);
                }
            }
        } while (it.hasNext());
    }
}
