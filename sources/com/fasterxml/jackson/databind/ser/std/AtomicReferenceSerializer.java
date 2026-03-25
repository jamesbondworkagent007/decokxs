package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.type.ReferenceType;
import com.fasterxml.jackson.databind.util.NameTransformer;
import java.util.concurrent.atomic.AtomicReference;
import o.AbstractC5601Xz;
import o.VD;

/* JADX INFO: loaded from: classes21.dex */
public class AtomicReferenceSerializer extends ReferenceTypeSerializer<AtomicReference<?>> {
    private static final long serialVersionUID = 1;

    public AtomicReferenceSerializer(ReferenceType referenceType, boolean z, AbstractC5601Xz abstractC5601Xz, VD<Object> vd) {
        super(referenceType, z, abstractC5601Xz, vd);
    }

    public AtomicReferenceSerializer(AtomicReferenceSerializer atomicReferenceSerializer, BeanProperty beanProperty, AbstractC5601Xz abstractC5601Xz, VD<?> vd, NameTransformer nameTransformer, Object obj, boolean z) {
        super(atomicReferenceSerializer, beanProperty, abstractC5601Xz, vd, nameTransformer, obj, z);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.ReferenceTypeSerializer
    public ReferenceTypeSerializer<AtomicReference<?>> withResolved(BeanProperty beanProperty, AbstractC5601Xz abstractC5601Xz, VD<?> vd, NameTransformer nameTransformer) {
        return new AtomicReferenceSerializer(this, beanProperty, abstractC5601Xz, vd, nameTransformer, this._suppressableValue, this._suppressNulls);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.ReferenceTypeSerializer
    public ReferenceTypeSerializer<AtomicReference<?>> withContentInclusion(Object obj, boolean z) {
        return new AtomicReferenceSerializer(this, this._property, this._valueTypeSerializer, this._valueSerializer, this._unwrapper, obj, z);
    }

    /* JADX DEBUG: Method merged with bridge method: _isValuePresent(Ljava/lang/Object;)Z */
    @Override // com.fasterxml.jackson.databind.ser.std.ReferenceTypeSerializer
    public boolean _isValuePresent(AtomicReference<?> atomicReference) {
        return atomicReference.get() != null;
    }

    /* JADX DEBUG: Method merged with bridge method: _getReferenced(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // com.fasterxml.jackson.databind.ser.std.ReferenceTypeSerializer
    public Object _getReferenced(AtomicReference<?> atomicReference) {
        return atomicReference.get();
    }

    /* JADX DEBUG: Method merged with bridge method: _getReferencedIfPresent(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // com.fasterxml.jackson.databind.ser.std.ReferenceTypeSerializer
    public Object _getReferencedIfPresent(AtomicReference<?> atomicReference) {
        return atomicReference.get();
    }
}
