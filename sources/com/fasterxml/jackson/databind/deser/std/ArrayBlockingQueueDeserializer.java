package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.ArrayBlockingQueue;
import o.AbstractC5548Vy;
import o.AbstractC5597Xv;
import o.InterfaceC5555Wf;

/* JADX INFO: loaded from: classes21.dex */
public class ArrayBlockingQueueDeserializer extends CollectionDeserializer {
    private static final long serialVersionUID = 1;

    @Override // com.fasterxml.jackson.databind.deser.std.CollectionDeserializer
    public Collection<Object> createDefaultInstance(DeserializationContext deserializationContext) throws IOException {
        return null;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.CollectionDeserializer
    public /* bridge */ /* synthetic */ CollectionDeserializer withResolved(AbstractC5548Vy abstractC5548Vy, AbstractC5548Vy abstractC5548Vy2, AbstractC5597Xv abstractC5597Xv, InterfaceC5555Wf interfaceC5555Wf, Boolean bool) {
        return withResolved((AbstractC5548Vy<?>) abstractC5548Vy, (AbstractC5548Vy<?>) abstractC5548Vy2, abstractC5597Xv, interfaceC5555Wf, bool);
    }

    public ArrayBlockingQueueDeserializer(JavaType javaType, AbstractC5548Vy<Object> abstractC5548Vy, AbstractC5597Xv abstractC5597Xv, ValueInstantiator valueInstantiator) {
        super(javaType, abstractC5548Vy, abstractC5597Xv, valueInstantiator);
    }

    public ArrayBlockingQueueDeserializer(JavaType javaType, AbstractC5548Vy<Object> abstractC5548Vy, AbstractC5597Xv abstractC5597Xv, ValueInstantiator valueInstantiator, AbstractC5548Vy<Object> abstractC5548Vy2, InterfaceC5555Wf interfaceC5555Wf, Boolean bool) {
        super(javaType, abstractC5548Vy, abstractC5597Xv, valueInstantiator, abstractC5548Vy2, interfaceC5555Wf, bool);
    }

    public ArrayBlockingQueueDeserializer(ArrayBlockingQueueDeserializer arrayBlockingQueueDeserializer) {
        super(arrayBlockingQueueDeserializer);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.CollectionDeserializer
    public ArrayBlockingQueueDeserializer withResolved(AbstractC5548Vy<?> abstractC5548Vy, AbstractC5548Vy<?> abstractC5548Vy2, AbstractC5597Xv abstractC5597Xv, InterfaceC5555Wf interfaceC5555Wf, Boolean bool) {
        return new ArrayBlockingQueueDeserializer(this._containerType, abstractC5548Vy2, abstractC5597Xv, this._valueInstantiator, abstractC5548Vy, interfaceC5555Wf, bool);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.CollectionDeserializer
    public Collection<Object> _deserializeFromArray(JsonParser jsonParser, DeserializationContext deserializationContext, Collection<Object> collection) throws IOException {
        if (collection == null) {
            collection = new ArrayList<>();
        }
        Collection<Object> collection_deserializeFromArray = super._deserializeFromArray(jsonParser, deserializationContext, collection);
        if (collection_deserializeFromArray.isEmpty()) {
            return new ArrayBlockingQueue(1, false);
        }
        return new ArrayBlockingQueue(collection_deserializeFromArray.size(), false, collection_deserializeFromArray);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.CollectionDeserializer, com.fasterxml.jackson.databind.deser.std.StdDeserializer, o.AbstractC5548Vy
    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, AbstractC5597Xv abstractC5597Xv) throws IOException {
        return abstractC5597Xv.deserializeTypedFromArray(jsonParser, deserializationContext);
    }
}
