package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes;
import com.fasterxml.jackson.databind.ser.std.StaticListSerializerBase;
import java.io.IOException;
import java.util.Collection;
import o.AbstractC5601Xz;
import o.InterfaceC5583Xh;
import o.VD;
import o.VI;
import o.VK;

/* JADX INFO: loaded from: classes21.dex */
@VK
public class StringCollectionSerializer extends StaticListSerializerBase<Collection<String>> {
    public static final StringCollectionSerializer instance = new StringCollectionSerializer();

    public StringCollectionSerializer() {
        super(Collection.class);
    }

    public StringCollectionSerializer(StringCollectionSerializer stringCollectionSerializer, Boolean bool) {
        super(stringCollectionSerializer, bool);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StaticListSerializerBase
    public VD<?> _withResolved(BeanProperty beanProperty, Boolean bool) {
        return new StringCollectionSerializer(this, bool);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StaticListSerializerBase
    public JsonNode contentSchema() {
        return createSchemaNode("string", true);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StaticListSerializerBase
    public void acceptContentVisitor(InterfaceC5583Xh interfaceC5583Xh) throws JsonMappingException {
        interfaceC5583Xh.AEQbTJ(JsonFormatTypes.STRING);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Ljava/lang/Object;Lcom/fasterxml/jackson/core/JsonGenerator;Lo/VI;)V */
    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, o.VD
    public void serialize(Collection<String> collection, JsonGenerator jsonGenerator, VI vi) throws IOException {
        int size = collection.size();
        if (size == 1 && ((this._unwrapSingle == null && vi.isEnabled(SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED)) || this._unwrapSingle == Boolean.TRUE)) {
            serializeContents(collection, jsonGenerator, vi);
            return;
        }
        jsonGenerator.AEQbTJ(collection, size);
        serializeContents(collection, jsonGenerator, vi);
        jsonGenerator.fetchVPNInfo();
    }

    /* JADX DEBUG: Method merged with bridge method: serializeWithType(Ljava/lang/Object;Lcom/fasterxml/jackson/core/JsonGenerator;Lo/VI;Lo/Xz;)V */
    @Override // com.fasterxml.jackson.databind.ser.std.StaticListSerializerBase, o.VD
    public void serializeWithType(Collection<String> collection, JsonGenerator jsonGenerator, VI vi, AbstractC5601Xz abstractC5601Xz) throws IOException {
        WritableTypeId writableTypeIdAEQbTJ = abstractC5601Xz.AEQbTJ(jsonGenerator, abstractC5601Xz.AEQbTJ(collection, JsonToken.START_ARRAY));
        jsonGenerator.KWHzl(collection);
        serializeContents(collection, jsonGenerator, vi);
        abstractC5601Xz.copydefault(jsonGenerator, writableTypeIdAEQbTJ);
    }

    private final void serializeContents(Collection<String> collection, JsonGenerator jsonGenerator, VI vi) throws IOException {
        int i = 0;
        try {
            for (String str : collection) {
                if (str == null) {
                    vi.defaultSerializeNull(jsonGenerator);
                } else {
                    jsonGenerator.AhwBna(str);
                }
                i++;
            }
        } catch (Exception e) {
            wrapAndThrow(vi, e, collection, i);
        }
    }
}
