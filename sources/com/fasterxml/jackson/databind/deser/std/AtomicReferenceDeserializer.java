package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import java.util.concurrent.atomic.AtomicReference;
import o.AbstractC5548Vy;
import o.AbstractC5597Xv;

/* JADX INFO: loaded from: classes21.dex */
public class AtomicReferenceDeserializer extends ReferenceTypeDeserializer<AtomicReference<Object>> {
    private static final long serialVersionUID = 1;

    @Override // o.AbstractC5548Vy, o.InterfaceC5555Wf
    public Object getAbsentValue(DeserializationContext deserializationContext) throws JsonMappingException {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.fasterxml.jackson.databind.deser.std.ReferenceTypeDeserializer, o.AbstractC5548Vy
    public Boolean supportsUpdate(DeserializationConfig deserializationConfig) {
        return Boolean.TRUE;
    }

    /* JADX DEBUG: Return type fixed from 'com.fasterxml.jackson.databind.deser.std.ReferenceTypeDeserializer' to match base method */
    @Override // com.fasterxml.jackson.databind.deser.std.ReferenceTypeDeserializer
    /* JADX INFO: renamed from: withResolved, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ ReferenceTypeDeserializer<AtomicReference<Object>> withResolved2(AbstractC5597Xv abstractC5597Xv, AbstractC5548Vy abstractC5548Vy) {
        return withResolved(abstractC5597Xv, (AbstractC5548Vy<?>) abstractC5548Vy);
    }

    public AtomicReferenceDeserializer(JavaType javaType, ValueInstantiator valueInstantiator, AbstractC5597Xv abstractC5597Xv, AbstractC5548Vy<?> abstractC5548Vy) {
        super(javaType, valueInstantiator, abstractC5597Xv, abstractC5548Vy);
    }

    /* JADX DEBUG: Return type fixed from 'com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer' to match base method */
    @Override // com.fasterxml.jackson.databind.deser.std.ReferenceTypeDeserializer
    public ReferenceTypeDeserializer<AtomicReference<Object>> withResolved(AbstractC5597Xv abstractC5597Xv, AbstractC5548Vy<?> abstractC5548Vy) {
        return new AtomicReferenceDeserializer(this._fullType, this._valueInstantiator, abstractC5597Xv, abstractC5548Vy);
    }

    /* JADX DEBUG: Method merged with bridge method: getNullValue(Lcom/fasterxml/jackson/databind/DeserializationContext;)Ljava/lang/Object; */
    @Override // com.fasterxml.jackson.databind.deser.std.ReferenceTypeDeserializer, o.AbstractC5548Vy, o.InterfaceC5555Wf
    public AtomicReference<Object> getNullValue(DeserializationContext deserializationContext) throws JsonMappingException {
        return new AtomicReference<>(this._valueDeserializer.getNullValue(deserializationContext));
    }

    @Override // com.fasterxml.jackson.databind.deser.std.ReferenceTypeDeserializer, o.AbstractC5548Vy
    public Object getEmptyValue(DeserializationContext deserializationContext) throws JsonMappingException {
        return getNullValue(deserializationContext);
    }

    /* JADX DEBUG: Method merged with bridge method: referenceValue(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // com.fasterxml.jackson.databind.deser.std.ReferenceTypeDeserializer
    public AtomicReference<Object> referenceValue(Object obj) {
        return new AtomicReference<>(obj);
    }

    /* JADX DEBUG: Method merged with bridge method: getReferenced(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // com.fasterxml.jackson.databind.deser.std.ReferenceTypeDeserializer
    public Object getReferenced(AtomicReference<Object> atomicReference) {
        return atomicReference.get();
    }

    /* JADX DEBUG: Method merged with bridge method: updateReference(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // com.fasterxml.jackson.databind.deser.std.ReferenceTypeDeserializer
    public AtomicReference<Object> updateReference(AtomicReference<Object> atomicReference, Object obj) {
        atomicReference.set(obj);
        return atomicReference;
    }
}
