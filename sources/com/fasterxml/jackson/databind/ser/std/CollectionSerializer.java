package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import o.AbstractC5601Xz;
import o.AbstractC5604Yc;
import o.VD;
import o.VI;

/* JADX INFO: loaded from: classes21.dex */
public class CollectionSerializer extends AsArraySerializerBase<Collection<?>> {
    private static final long serialVersionUID = 1;

    /* JADX DEBUG: Return type fixed from 'com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase' to match base method */
    @Override // com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase
    public /* bridge */ /* synthetic */ AsArraySerializerBase<Collection<?>> withResolved(BeanProperty beanProperty, AbstractC5601Xz abstractC5601Xz, VD vd, Boolean bool) {
        return withResolved2(beanProperty, abstractC5601Xz, (VD<?>) vd, bool);
    }

    public CollectionSerializer(JavaType javaType, boolean z, AbstractC5601Xz abstractC5601Xz, VD<Object> vd) {
        super((Class<?>) Collection.class, javaType, z, abstractC5601Xz, vd);
    }

    @Deprecated
    public CollectionSerializer(JavaType javaType, boolean z, AbstractC5601Xz abstractC5601Xz, BeanProperty beanProperty, VD<Object> vd) {
        this(javaType, z, abstractC5601Xz, vd);
    }

    public CollectionSerializer(CollectionSerializer collectionSerializer, BeanProperty beanProperty, AbstractC5601Xz abstractC5601Xz, VD<?> vd, Boolean bool) {
        super(collectionSerializer, beanProperty, abstractC5601Xz, vd, bool);
    }

    @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
    public ContainerSerializer<?> _withValueTypeSerializer(AbstractC5601Xz abstractC5601Xz) {
        return new CollectionSerializer(this, this._property, abstractC5601Xz, (VD<?>) this._elementSerializer, this._unwrapSingle);
    }

    /* JADX DEBUG: Return type fixed from 'com.fasterxml.jackson.databind.ser.std.CollectionSerializer' to match base method */
    @Override // com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase
    /* JADX INFO: renamed from: withResolved, reason: avoid collision after fix types in other method */
    public AsArraySerializerBase<Collection<?>> withResolved2(BeanProperty beanProperty, AbstractC5601Xz abstractC5601Xz, VD<?> vd, Boolean bool) {
        return new CollectionSerializer(this, beanProperty, abstractC5601Xz, vd, bool);
    }

    /* JADX DEBUG: Method merged with bridge method: isEmpty(Lo/VI;Ljava/lang/Object;)Z */
    @Override // o.VD
    public boolean isEmpty(VI vi, Collection<?> collection) {
        return collection.isEmpty();
    }

    /* JADX DEBUG: Method merged with bridge method: hasSingleElement(Ljava/lang/Object;)Z */
    @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
    public boolean hasSingleElement(Collection<?> collection) {
        return collection.size() == 1;
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Ljava/lang/Object;Lcom/fasterxml/jackson/core/JsonGenerator;Lo/VI;)V */
    @Override // com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase, com.fasterxml.jackson.databind.ser.std.StdSerializer, o.VD
    public final void serialize(Collection<?> collection, JsonGenerator jsonGenerator, VI vi) throws IOException {
        int size = collection.size();
        if (size == 1 && ((this._unwrapSingle == null && vi.isEnabled(SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED)) || this._unwrapSingle == Boolean.TRUE)) {
            serializeContents(collection, jsonGenerator, vi);
            return;
        }
        jsonGenerator.AEQbTJ(collection, size);
        serializeContents(collection, jsonGenerator, vi);
        jsonGenerator.fetchVPNInfo();
    }

    /* JADX DEBUG: Method merged with bridge method: serializeContents(Ljava/lang/Object;Lcom/fasterxml/jackson/core/JsonGenerator;Lo/VI;)V */
    @Override // com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase
    public void serializeContents(Collection<?> collection, JsonGenerator jsonGenerator, VI vi) throws IOException {
        VD<Object> vd_findAndAddDynamic;
        jsonGenerator.KWHzl(collection);
        VD<Object> vd = this._elementSerializer;
        if (vd != null) {
            serializeContentsUsing(collection, jsonGenerator, vi, vd);
            return;
        }
        Iterator<?> it = collection.iterator();
        if (it.hasNext()) {
            AbstractC5604Yc abstractC5604Yc = this._dynamicSerializers;
            AbstractC5601Xz abstractC5601Xz = this._valueTypeSerializer;
            int i = 0;
            do {
                try {
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
                    i++;
                } catch (Exception e) {
                    wrapAndThrow(vi, e, collection, i);
                    return;
                }
            } while (it.hasNext());
        }
    }

    public void serializeContentsUsing(Collection<?> collection, JsonGenerator jsonGenerator, VI vi, VD<Object> vd) throws IOException {
        Iterator<?> it = collection.iterator();
        if (it.hasNext()) {
            AbstractC5601Xz abstractC5601Xz = this._valueTypeSerializer;
            int i = 0;
            do {
                Object next = it.next();
                if (next == null) {
                    try {
                        vi.defaultSerializeNull(jsonGenerator);
                    } catch (Exception e) {
                        wrapAndThrow(vi, e, collection, i);
                    }
                } else if (abstractC5601Xz == null) {
                    vd.serialize(next, jsonGenerator, vi);
                } else {
                    vd.serializeWithType(next, jsonGenerator, vi, abstractC5601Xz);
                }
                i++;
            } while (it.hasNext());
        }
    }
}
