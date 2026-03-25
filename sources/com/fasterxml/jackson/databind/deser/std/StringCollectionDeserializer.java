package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.cfg.CoercionAction;
import com.fasterxml.jackson.databind.cfg.CoercionInputShape;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.type.LogicalType;
import java.io.IOException;
import java.util.Collection;
import java.util.Objects;
import o.AbstractC5548Vy;
import o.AbstractC5597Xv;
import o.InterfaceC5554We;
import o.InterfaceC5555Wf;
import o.VK;

/* JADX INFO: loaded from: classes21.dex */
@VK
public final class StringCollectionDeserializer extends ContainerDeserializerBase<Collection<String>> implements InterfaceC5554We {
    private static final long serialVersionUID = 1;
    protected final AbstractC5548Vy<Object> _delegateDeserializer;
    protected final AbstractC5548Vy<String> _valueDeserializer;
    protected final ValueInstantiator _valueInstantiator;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase
    public AbstractC5548Vy<Object> getContentDeserializer() {
        return this._valueDeserializer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer
    public ValueInstantiator getValueInstantiator() {
        return this._valueInstantiator;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC5548Vy
    public boolean isCachable() {
        return this._valueDeserializer == null && this._delegateDeserializer == null;
    }

    public StringCollectionDeserializer(JavaType javaType, AbstractC5548Vy<?> abstractC5548Vy, ValueInstantiator valueInstantiator) {
        this(javaType, valueInstantiator, null, abstractC5548Vy, abstractC5548Vy, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: o.Vy<?> */
    /* JADX WARN: Multi-variable type inference failed */
    public StringCollectionDeserializer(JavaType javaType, ValueInstantiator valueInstantiator, AbstractC5548Vy<?> abstractC5548Vy, AbstractC5548Vy<?> abstractC5548Vy2, InterfaceC5555Wf interfaceC5555Wf, Boolean bool) {
        super(javaType, interfaceC5555Wf, bool);
        this._valueDeserializer = abstractC5548Vy2;
        this._valueInstantiator = valueInstantiator;
        this._delegateDeserializer = abstractC5548Vy;
    }

    public StringCollectionDeserializer withResolved(AbstractC5548Vy<?> abstractC5548Vy, AbstractC5548Vy<?> abstractC5548Vy2, InterfaceC5555Wf interfaceC5555Wf, Boolean bool) {
        return (Objects.equals(this._unwrapSingle, bool) && this._nullProvider == interfaceC5555Wf && this._valueDeserializer == abstractC5548Vy2 && this._delegateDeserializer == abstractC5548Vy) ? this : new StringCollectionDeserializer(this._containerType, this._valueInstantiator, abstractC5548Vy, abstractC5548Vy2, interfaceC5555Wf, bool);
    }

    @Override // o.AbstractC5548Vy
    public LogicalType logicalType() {
        return LogicalType.Collection;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0031  */
    @Override // o.InterfaceC5554We
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AbstractC5548Vy<?> createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) throws JsonMappingException {
        AbstractC5548Vy<?> abstractC5548VyFindDeserializer;
        AbstractC5548Vy<?> abstractC5548VyHandleSecondaryContextualization;
        ValueInstantiator valueInstantiator = this._valueInstantiator;
        if (valueInstantiator == null) {
            abstractC5548VyFindDeserializer = null;
        } else if (valueInstantiator.getArrayDelegateCreator() != null) {
            abstractC5548VyFindDeserializer = findDeserializer(deserializationContext, this._valueInstantiator.getArrayDelegateType(deserializationContext.getConfig()), beanProperty);
        } else if (this._valueInstantiator.getDelegateCreator() != null) {
            abstractC5548VyFindDeserializer = findDeserializer(deserializationContext, this._valueInstantiator.getDelegateType(deserializationContext.getConfig()), beanProperty);
        }
        AbstractC5548Vy<String> abstractC5548Vy = this._valueDeserializer;
        JavaType contentType = this._containerType.getContentType();
        if (abstractC5548Vy == null) {
            abstractC5548VyHandleSecondaryContextualization = findConvertingContentDeserializer(deserializationContext, beanProperty, abstractC5548Vy);
            if (abstractC5548VyHandleSecondaryContextualization == null) {
                abstractC5548VyHandleSecondaryContextualization = deserializationContext.findContextualValueDeserializer(contentType, beanProperty);
            }
        } else {
            abstractC5548VyHandleSecondaryContextualization = deserializationContext.handleSecondaryContextualization(abstractC5548Vy, beanProperty, contentType);
        }
        return withResolved(abstractC5548VyFindDeserializer, isDefaultDeserializer(abstractC5548VyHandleSecondaryContextualization) ? null : abstractC5548VyHandleSecondaryContextualization, findContentNullProvider(deserializationContext, beanProperty, abstractC5548VyHandleSecondaryContextualization), findFormatFeature(deserializationContext, beanProperty, Collection.class, JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY));
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;)Ljava/lang/Object; */
    @Override // o.AbstractC5548Vy
    public Collection<String> deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        AbstractC5548Vy<Object> abstractC5548Vy = this._delegateDeserializer;
        if (abstractC5548Vy != null) {
            return (Collection) this._valueInstantiator.createUsingDelegate(deserializationContext, abstractC5548Vy.deserialize(jsonParser, deserializationContext));
        }
        return deserialize(jsonParser, deserializationContext, (Collection<String>) this._valueInstantiator.createUsingDefault(deserializationContext));
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.AbstractC5548Vy
    public Collection<String> deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, Collection<String> collection) throws IOException {
        String str_parseString;
        if (!jsonParser.RJOkX()) {
            return handleNonArray(jsonParser, deserializationContext, collection);
        }
        AbstractC5548Vy<String> abstractC5548Vy = this._valueDeserializer;
        if (abstractC5548Vy != null) {
            return deserializeUsingCustom(jsonParser, deserializationContext, collection, abstractC5548Vy);
        }
        while (true) {
            try {
                String strDNCPSb = jsonParser.dNCPSb();
                if (strDNCPSb != null) {
                    collection.add(strDNCPSb);
                } else {
                    JsonToken jsonTokenDjBIcL = jsonParser.djBIcL();
                    if (jsonTokenDjBIcL == JsonToken.END_ARRAY) {
                        return collection;
                    }
                    if (jsonTokenDjBIcL != JsonToken.VALUE_NULL) {
                        str_parseString = _parseString(jsonParser, deserializationContext, this._nullProvider);
                    } else if (!this._skipNullValues) {
                        str_parseString = (String) this._nullProvider.getNullValue(deserializationContext);
                    }
                    collection.add(str_parseString);
                }
            } catch (Exception e) {
                throw JsonMappingException.wrapWithPath(e, collection, collection.size());
            }
        }
    }

    private Collection<String> deserializeUsingCustom(JsonParser jsonParser, DeserializationContext deserializationContext, Collection<String> collection, AbstractC5548Vy<String> abstractC5548Vy) throws IOException {
        String strDeserialize;
        while (true) {
            try {
                if (jsonParser.dNCPSb() == null) {
                    JsonToken jsonTokenDjBIcL = jsonParser.djBIcL();
                    if (jsonTokenDjBIcL == JsonToken.END_ARRAY) {
                        return collection;
                    }
                    if (jsonTokenDjBIcL != JsonToken.VALUE_NULL) {
                        strDeserialize = abstractC5548Vy.deserialize(jsonParser, deserializationContext);
                    } else if (!this._skipNullValues) {
                        strDeserialize = (String) this._nullProvider.getNullValue(deserializationContext);
                    }
                } else {
                    strDeserialize = abstractC5548Vy.deserialize(jsonParser, deserializationContext);
                }
                collection.add(strDeserialize);
            } catch (Exception e) {
                throw JsonMappingException.wrapWithPath(e, collection, collection.size());
            }
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer, o.AbstractC5548Vy
    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, AbstractC5597Xv abstractC5597Xv) throws IOException {
        return abstractC5597Xv.deserializeTypedFromArray(jsonParser, deserializationContext);
    }

    private final Collection<String> handleNonArray(JsonParser jsonParser, DeserializationContext deserializationContext, Collection<String> collection) throws IOException {
        String str_parseString;
        Boolean bool = this._unwrapSingle;
        if (bool != Boolean.TRUE && (bool != null || !deserializationContext.isEnabled(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY))) {
            if (jsonParser.copydefault(JsonToken.VALUE_STRING)) {
                return _deserializeFromString(jsonParser, deserializationContext);
            }
            return (Collection) deserializationContext.handleUnexpectedToken(this._containerType, jsonParser);
        }
        AbstractC5548Vy<String> abstractC5548Vy = this._valueDeserializer;
        if (jsonParser.djBIcL() != JsonToken.VALUE_NULL) {
            if (jsonParser.copydefault(JsonToken.VALUE_STRING)) {
                String strZLjUOn = jsonParser.zLjUOn();
                if (strZLjUOn.isEmpty()) {
                    CoercionAction coercionActionFindCoercionAction = deserializationContext.findCoercionAction(logicalType(), handledType(), CoercionInputShape.EmptyString);
                    if (coercionActionFindCoercionAction != CoercionAction.Fail) {
                        return (Collection) _deserializeFromEmptyString(jsonParser, deserializationContext, coercionActionFindCoercionAction, handledType(), "empty String (\"\")");
                    }
                } else if (StdDeserializer._isBlank(strZLjUOn)) {
                    LogicalType logicalType = logicalType();
                    Class<?> clsHandledType = handledType();
                    CoercionAction coercionAction = CoercionAction.Fail;
                    CoercionAction coercionActionFindCoercionFromBlankString = deserializationContext.findCoercionFromBlankString(logicalType, clsHandledType, coercionAction);
                    if (coercionActionFindCoercionFromBlankString != coercionAction) {
                        return (Collection) _deserializeFromEmptyString(jsonParser, deserializationContext, coercionActionFindCoercionFromBlankString, handledType(), "blank String (all whitespace)");
                    }
                }
            }
            try {
                str_parseString = abstractC5548Vy == null ? _parseString(jsonParser, deserializationContext, this._nullProvider) : abstractC5548Vy.deserialize(jsonParser, deserializationContext);
            } catch (Exception e) {
                throw JsonMappingException.wrapWithPath(e, collection, collection.size());
            }
        } else {
            if (this._skipNullValues) {
                return collection;
            }
            str_parseString = (String) this._nullProvider.getNullValue(deserializationContext);
        }
        collection.add(str_parseString);
        return collection;
    }
}
