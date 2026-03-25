package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.SerializationFeature;
import java.io.IOException;
import java.util.EnumSet;
import o.AbstractC5601Xz;
import o.VD;
import o.VI;

/* JADX INFO: loaded from: classes21.dex */
public class EnumSetSerializer extends AsArraySerializerBase<EnumSet<? extends Enum<?>>> {
    /* JADX DEBUG: Method merged with bridge method: _withValueTypeSerializer(Lo/Xz;)Lcom/fasterxml/jackson/databind/ser/ContainerSerializer; */
    @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
    public EnumSetSerializer _withValueTypeSerializer(AbstractC5601Xz abstractC5601Xz) {
        return this;
    }

    /* JADX DEBUG: Return type fixed from 'com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase' to match base method */
    @Override // com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase
    public /* bridge */ /* synthetic */ AsArraySerializerBase<EnumSet<? extends Enum<?>>> withResolved(BeanProperty beanProperty, AbstractC5601Xz abstractC5601Xz, VD vd, Boolean bool) {
        return withResolved2(beanProperty, abstractC5601Xz, (VD<?>) vd, bool);
    }

    public EnumSetSerializer(JavaType javaType) {
        super((Class<?>) EnumSet.class, javaType, true, (AbstractC5601Xz) null, (VD<Object>) null);
    }

    public EnumSetSerializer(EnumSetSerializer enumSetSerializer, BeanProperty beanProperty, AbstractC5601Xz abstractC5601Xz, VD<?> vd, Boolean bool) {
        super(enumSetSerializer, beanProperty, abstractC5601Xz, vd, bool);
    }

    /* JADX DEBUG: Return type fixed from 'com.fasterxml.jackson.databind.ser.std.EnumSetSerializer' to match base method */
    @Override // com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase
    /* JADX INFO: renamed from: withResolved, reason: avoid collision after fix types in other method */
    public AsArraySerializerBase<EnumSet<? extends Enum<?>>> withResolved2(BeanProperty beanProperty, AbstractC5601Xz abstractC5601Xz, VD<?> vd, Boolean bool) {
        return new EnumSetSerializer(this, beanProperty, abstractC5601Xz, vd, bool);
    }

    /* JADX DEBUG: Method merged with bridge method: isEmpty(Lo/VI;Ljava/lang/Object;)Z */
    @Override // o.VD
    public boolean isEmpty(VI vi, EnumSet<? extends Enum<?>> enumSet) {
        return enumSet.isEmpty();
    }

    /* JADX DEBUG: Method merged with bridge method: hasSingleElement(Ljava/lang/Object;)Z */
    @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
    public boolean hasSingleElement(EnumSet<? extends Enum<?>> enumSet) {
        return enumSet.size() == 1;
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Ljava/lang/Object;Lcom/fasterxml/jackson/core/JsonGenerator;Lo/VI;)V */
    @Override // com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase, com.fasterxml.jackson.databind.ser.std.StdSerializer, o.VD
    public final void serialize(EnumSet<? extends Enum<?>> enumSet, JsonGenerator jsonGenerator, VI vi) throws IOException {
        int size = enumSet.size();
        if (size == 1 && ((this._unwrapSingle == null && vi.isEnabled(SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED)) || this._unwrapSingle == Boolean.TRUE)) {
            serializeContents(enumSet, jsonGenerator, vi);
            return;
        }
        jsonGenerator.AEQbTJ(enumSet, size);
        serializeContents(enumSet, jsonGenerator, vi);
        jsonGenerator.fetchVPNInfo();
    }

    /* JADX DEBUG: Method merged with bridge method: serializeContents(Ljava/lang/Object;Lcom/fasterxml/jackson/core/JsonGenerator;Lo/VI;)V */
    @Override // com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase
    public void serializeContents(EnumSet<? extends Enum<?>> enumSet, JsonGenerator jsonGenerator, VI vi) throws IOException {
        VD<Object> vdFindContentValueSerializer = this._elementSerializer;
        for (Enum<?> r1 : enumSet) {
            if (vdFindContentValueSerializer == null) {
                vdFindContentValueSerializer = vi.findContentValueSerializer(r1.getDeclaringClass(), this._property);
            }
            vdFindContentValueSerializer.serialize(r1, jsonGenerator, vi);
        }
    }
}
