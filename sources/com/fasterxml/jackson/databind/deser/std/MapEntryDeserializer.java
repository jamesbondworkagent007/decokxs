package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.type.LogicalType;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.Map;
import o.AbstractC5548Vy;
import o.AbstractC5597Xv;
import o.InterfaceC5553Wd;
import o.InterfaceC5554We;
import o.VC;
import o.VK;

/* JADX INFO: loaded from: classes21.dex */
@VK
public class MapEntryDeserializer extends ContainerDeserializerBase<Map.Entry<Object, Object>> implements InterfaceC5554We {
    private static final long serialVersionUID = 1;
    protected final VC _keyDeserializer;
    protected final AbstractC5548Vy<Object> _valueDeserializer;
    protected final AbstractC5597Xv _valueTypeDeserializer;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase
    public AbstractC5548Vy<Object> getContentDeserializer() {
        return this._valueDeserializer;
    }

    public MapEntryDeserializer(JavaType javaType, VC vc, AbstractC5548Vy<Object> abstractC5548Vy, AbstractC5597Xv abstractC5597Xv) {
        super(javaType);
        if (javaType.containedTypeCount() == 2) {
            this._keyDeserializer = vc;
            this._valueDeserializer = abstractC5548Vy;
            this._valueTypeDeserializer = abstractC5597Xv;
        } else {
            throw new IllegalArgumentException("Missing generic type information for " + javaType);
        }
    }

    public MapEntryDeserializer(MapEntryDeserializer mapEntryDeserializer) {
        super(mapEntryDeserializer);
        this._keyDeserializer = mapEntryDeserializer._keyDeserializer;
        this._valueDeserializer = mapEntryDeserializer._valueDeserializer;
        this._valueTypeDeserializer = mapEntryDeserializer._valueTypeDeserializer;
    }

    public MapEntryDeserializer(MapEntryDeserializer mapEntryDeserializer, VC vc, AbstractC5548Vy<Object> abstractC5548Vy, AbstractC5597Xv abstractC5597Xv) {
        super(mapEntryDeserializer);
        this._keyDeserializer = vc;
        this._valueDeserializer = abstractC5548Vy;
        this._valueTypeDeserializer = abstractC5597Xv;
    }

    public MapEntryDeserializer withResolved(VC vc, AbstractC5597Xv abstractC5597Xv, AbstractC5548Vy<?> abstractC5548Vy) {
        return (this._keyDeserializer == vc && this._valueDeserializer == abstractC5548Vy && this._valueTypeDeserializer == abstractC5597Xv) ? this : new MapEntryDeserializer(this, vc, abstractC5548Vy, abstractC5597Xv);
    }

    @Override // o.AbstractC5548Vy
    public LogicalType logicalType() {
        return LogicalType.Map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [o.VC] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r4v0, types: [com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase, com.fasterxml.jackson.databind.deser.std.MapEntryDeserializer, com.fasterxml.jackson.databind.deser.std.StdDeserializer] */
    @Override // o.InterfaceC5554We
    public AbstractC5548Vy<?> createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) throws JsonMappingException {
        ?? AEQbTJ;
        AbstractC5548Vy<?> abstractC5548VyHandleSecondaryContextualization;
        Object obj = this._keyDeserializer;
        if (obj == null) {
            AEQbTJ = deserializationContext.findKeyDeserializer(this._containerType.containedType(0), beanProperty);
        } else {
            boolean z = obj instanceof InterfaceC5553Wd;
            AEQbTJ = obj;
            if (z) {
                AEQbTJ = ((InterfaceC5553Wd) obj).AEQbTJ(deserializationContext, beanProperty);
            }
        }
        AbstractC5548Vy<?> abstractC5548VyFindConvertingContentDeserializer = findConvertingContentDeserializer(deserializationContext, beanProperty, this._valueDeserializer);
        JavaType javaTypeContainedType = this._containerType.containedType(1);
        if (abstractC5548VyFindConvertingContentDeserializer == null) {
            abstractC5548VyHandleSecondaryContextualization = deserializationContext.findContextualValueDeserializer(javaTypeContainedType, beanProperty);
        } else {
            abstractC5548VyHandleSecondaryContextualization = deserializationContext.handleSecondaryContextualization(abstractC5548VyFindConvertingContentDeserializer, beanProperty, javaTypeContainedType);
        }
        AbstractC5597Xv abstractC5597XvForProperty = this._valueTypeDeserializer;
        if (abstractC5597XvForProperty != null) {
            abstractC5597XvForProperty = abstractC5597XvForProperty.forProperty(beanProperty);
        }
        return withResolved(AEQbTJ, abstractC5597XvForProperty, abstractC5548VyHandleSecondaryContextualization);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase
    public JavaType getContentType() {
        return this._containerType.containedType(1);
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;)Ljava/lang/Object; */
    @Override // o.AbstractC5548Vy
    public Map.Entry<Object, Object> deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        Object objDeserializeWithType;
        JsonToken jsonTokenDjBIcL = jsonParser.djBIcL();
        if (jsonTokenDjBIcL == JsonToken.START_OBJECT) {
            jsonTokenDjBIcL = jsonParser.RcXXUw();
        } else if (jsonTokenDjBIcL != JsonToken.FIELD_NAME && jsonTokenDjBIcL != JsonToken.END_OBJECT) {
            if (jsonTokenDjBIcL == JsonToken.START_ARRAY) {
                return _deserializeFromArray(jsonParser, deserializationContext);
            }
            return (Map.Entry) deserializationContext.handleUnexpectedToken(getValueType(deserializationContext), jsonParser);
        }
        if (jsonTokenDjBIcL != JsonToken.FIELD_NAME) {
            if (jsonTokenDjBIcL == JsonToken.END_OBJECT) {
                return (Map.Entry) deserializationContext.reportInputMismatch(this, "Cannot deserialize a Map.Entry out of empty JSON Object", new Object[0]);
            }
            return (Map.Entry) deserializationContext.handleUnexpectedToken(handledType(), jsonParser);
        }
        VC vc = this._keyDeserializer;
        AbstractC5548Vy<Object> abstractC5548Vy = this._valueDeserializer;
        AbstractC5597Xv abstractC5597Xv = this._valueTypeDeserializer;
        String strKWHzl = jsonParser.KWHzl();
        Object objDeserializeKey = vc.deserializeKey(strKWHzl, deserializationContext);
        try {
            if (jsonParser.RcXXUw() == JsonToken.VALUE_NULL) {
                objDeserializeWithType = abstractC5548Vy.getNullValue(deserializationContext);
            } else if (abstractC5597Xv == null) {
                objDeserializeWithType = abstractC5548Vy.deserialize(jsonParser, deserializationContext);
            } else {
                objDeserializeWithType = abstractC5548Vy.deserializeWithType(jsonParser, deserializationContext, abstractC5597Xv);
            }
        } catch (Exception e) {
            wrapAndThrow(deserializationContext, e, Map.Entry.class, strKWHzl);
            objDeserializeWithType = null;
        }
        JsonToken jsonTokenRcXXUw = jsonParser.RcXXUw();
        if (jsonTokenRcXXUw != JsonToken.END_OBJECT) {
            if (jsonTokenRcXXUw == JsonToken.FIELD_NAME) {
                deserializationContext.reportInputMismatch(this, "Problem binding JSON into Map.Entry: more than one entry in JSON (second field: '%s')", jsonParser.KWHzl());
            } else {
                deserializationContext.reportInputMismatch(this, "Problem binding JSON into Map.Entry: unexpected content after JSON Object entry: " + jsonTokenRcXXUw, new Object[0]);
            }
            return null;
        }
        return new AbstractMap.SimpleEntry(objDeserializeKey, objDeserializeWithType);
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.AbstractC5548Vy
    public Map.Entry<Object, Object> deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, Map.Entry<Object, Object> entry) throws IOException {
        throw new IllegalStateException("Cannot update Map.Entry values");
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer, o.AbstractC5548Vy
    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, AbstractC5597Xv abstractC5597Xv) throws IOException {
        return abstractC5597Xv.deserializeTypedFromObject(jsonParser, deserializationContext);
    }
}
