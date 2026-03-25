package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import java.io.IOException;
import java.util.Iterator;
import o.AbstractC5601Xz;
import o.VD;
import o.VI;
import o.VK;

/* JADX INFO: loaded from: classes21.dex */
@VK
public class IterableSerializer extends AsArraySerializerBase<Iterable<?>> {
    /* JADX DEBUG: Return type fixed from 'com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase' to match base method */
    @Override // com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase
    public /* bridge */ /* synthetic */ AsArraySerializerBase<Iterable<?>> withResolved(BeanProperty beanProperty, AbstractC5601Xz abstractC5601Xz, VD vd, Boolean bool) {
        return withResolved2(beanProperty, abstractC5601Xz, (VD<?>) vd, bool);
    }

    public IterableSerializer(JavaType javaType, boolean z, AbstractC5601Xz abstractC5601Xz) {
        super((Class<?>) Iterable.class, javaType, z, abstractC5601Xz, (VD<Object>) null);
    }

    public IterableSerializer(IterableSerializer iterableSerializer, BeanProperty beanProperty, AbstractC5601Xz abstractC5601Xz, VD<?> vd, Boolean bool) {
        super(iterableSerializer, beanProperty, abstractC5601Xz, vd, bool);
    }

    @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
    public ContainerSerializer<?> _withValueTypeSerializer(AbstractC5601Xz abstractC5601Xz) {
        return new IterableSerializer(this, this._property, abstractC5601Xz, this._elementSerializer, this._unwrapSingle);
    }

    /* JADX DEBUG: Return type fixed from 'com.fasterxml.jackson.databind.ser.std.IterableSerializer' to match base method */
    @Override // com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase
    /* JADX INFO: renamed from: withResolved, reason: avoid collision after fix types in other method */
    public AsArraySerializerBase<Iterable<?>> withResolved2(BeanProperty beanProperty, AbstractC5601Xz abstractC5601Xz, VD<?> vd, Boolean bool) {
        return new IterableSerializer(this, beanProperty, abstractC5601Xz, vd, bool);
    }

    /* JADX DEBUG: Method merged with bridge method: isEmpty(Lo/VI;Ljava/lang/Object;)Z */
    @Override // o.VD
    public boolean isEmpty(VI vi, Iterable<?> iterable) {
        return !iterable.iterator().hasNext();
    }

    /* JADX DEBUG: Method merged with bridge method: hasSingleElement(Ljava/lang/Object;)Z */
    @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
    public boolean hasSingleElement(Iterable<?> iterable) {
        if (iterable == null) {
            return false;
        }
        Iterator<?> it = iterable.iterator();
        if (!it.hasNext()) {
            return false;
        }
        it.next();
        return !it.hasNext();
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Ljava/lang/Object;Lcom/fasterxml/jackson/core/JsonGenerator;Lo/VI;)V */
    @Override // com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase, com.fasterxml.jackson.databind.ser.std.StdSerializer, o.VD
    public final void serialize(Iterable<?> iterable, JsonGenerator jsonGenerator, VI vi) throws IOException {
        if (((this._unwrapSingle == null && vi.isEnabled(SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED)) || this._unwrapSingle == Boolean.TRUE) && hasSingleElement(iterable)) {
            serializeContents(iterable, jsonGenerator, vi);
            return;
        }
        jsonGenerator.gEmmrt(iterable);
        serializeContents(iterable, jsonGenerator, vi);
        jsonGenerator.fetchVPNInfo();
    }

    /* JADX DEBUG: Method merged with bridge method: serializeContents(Ljava/lang/Object;Lcom/fasterxml/jackson/core/JsonGenerator;Lo/VI;)V */
    @Override // com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase
    public void serializeContents(Iterable<?> iterable, JsonGenerator jsonGenerator, VI vi) throws IOException {
        Iterator<?> it = iterable.iterator();
        if (it.hasNext()) {
            AbstractC5601Xz abstractC5601Xz = this._valueTypeSerializer;
            Class<?> cls = null;
            VD<Object> vdFindValueSerializer = null;
            do {
                Object next = it.next();
                if (next == null) {
                    vi.defaultSerializeNull(jsonGenerator);
                } else {
                    VD<Object> vd = this._elementSerializer;
                    if (vd == null) {
                        Class<?> cls2 = next.getClass();
                        if (cls2 != cls) {
                            vdFindValueSerializer = vi.findValueSerializer(cls2, this._property);
                            cls = cls2;
                        }
                        vd = vdFindValueSerializer;
                    }
                    if (abstractC5601Xz == null) {
                        vd.serialize(next, jsonGenerator, vi);
                    } else {
                        vd.serializeWithType(next, jsonGenerator, vi, abstractC5601Xz);
                    }
                }
            } while (it.hasNext());
        }
    }
}
