package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator;
import com.fasterxml.jackson.databind.type.LogicalType;
import java.io.IOException;
import java.util.EnumMap;
import o.AbstractC5548Vy;
import o.AbstractC5597Xv;
import o.C5569Wt;
import o.C5619Yr;
import o.InterfaceC5554We;
import o.InterfaceC5555Wf;
import o.InterfaceC5557Wh;
import o.VC;

/* JADX INFO: loaded from: classes21.dex */
public class EnumMapDeserializer extends ContainerDeserializerBase<EnumMap<?, ?>> implements InterfaceC5554We, InterfaceC5557Wh {
    private static final long serialVersionUID = 1;
    protected AbstractC5548Vy<Object> _delegateDeserializer;
    protected final Class<?> _enumClass;
    protected VC _keyDeserializer;
    protected PropertyBasedCreator _propertyBasedCreator;
    protected AbstractC5548Vy<Object> _valueDeserializer;
    protected final ValueInstantiator _valueInstantiator;
    protected final AbstractC5597Xv _valueTypeDeserializer;

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
        return this._valueDeserializer == null && this._keyDeserializer == null && this._valueTypeDeserializer == null;
    }

    public EnumMapDeserializer(JavaType javaType, ValueInstantiator valueInstantiator, VC vc, AbstractC5548Vy<?> abstractC5548Vy, AbstractC5597Xv abstractC5597Xv, InterfaceC5555Wf interfaceC5555Wf) {
        super(javaType, interfaceC5555Wf, (Boolean) null);
        this._enumClass = javaType.getKeyType().getRawClass();
        this._keyDeserializer = vc;
        this._valueDeserializer = abstractC5548Vy;
        this._valueTypeDeserializer = abstractC5597Xv;
        this._valueInstantiator = valueInstantiator;
    }

    public EnumMapDeserializer(EnumMapDeserializer enumMapDeserializer, VC vc, AbstractC5548Vy<?> abstractC5548Vy, AbstractC5597Xv abstractC5597Xv, InterfaceC5555Wf interfaceC5555Wf) {
        super(enumMapDeserializer, interfaceC5555Wf, enumMapDeserializer._unwrapSingle);
        this._enumClass = enumMapDeserializer._enumClass;
        this._keyDeserializer = vc;
        this._valueDeserializer = abstractC5548Vy;
        this._valueTypeDeserializer = abstractC5597Xv;
        this._valueInstantiator = enumMapDeserializer._valueInstantiator;
        this._delegateDeserializer = enumMapDeserializer._delegateDeserializer;
        this._propertyBasedCreator = enumMapDeserializer._propertyBasedCreator;
    }

    @Deprecated
    public EnumMapDeserializer(JavaType javaType, VC vc, AbstractC5548Vy<?> abstractC5548Vy, AbstractC5597Xv abstractC5597Xv) {
        this(javaType, null, vc, abstractC5548Vy, abstractC5597Xv, null);
    }

    public EnumMapDeserializer withResolved(VC vc, AbstractC5548Vy<?> abstractC5548Vy, AbstractC5597Xv abstractC5597Xv, InterfaceC5555Wf interfaceC5555Wf) {
        return (vc == this._keyDeserializer && interfaceC5555Wf == this._nullProvider && abstractC5548Vy == this._valueDeserializer && abstractC5597Xv == this._valueTypeDeserializer) ? this : new EnumMapDeserializer(this, vc, abstractC5548Vy, abstractC5597Xv, interfaceC5555Wf);
    }

    @Override // o.InterfaceC5557Wh
    public void resolve(DeserializationContext deserializationContext) throws JsonMappingException {
        ValueInstantiator valueInstantiator = this._valueInstantiator;
        if (valueInstantiator != null) {
            if (valueInstantiator.canCreateUsingDelegate()) {
                JavaType delegateType = this._valueInstantiator.getDelegateType(deserializationContext.getConfig());
                if (delegateType == null) {
                    JavaType javaType = this._containerType;
                    deserializationContext.reportBadDefinition(javaType, String.format("Invalid delegate-creator definition for %s: value instantiator (%s) returned true for 'canCreateUsingDelegate()', but null for 'getDelegateType()'", javaType, this._valueInstantiator.getClass().getName()));
                }
                this._delegateDeserializer = findDeserializer(deserializationContext, delegateType, null);
                return;
            }
            if (this._valueInstantiator.canCreateUsingArrayDelegate()) {
                JavaType arrayDelegateType = this._valueInstantiator.getArrayDelegateType(deserializationContext.getConfig());
                if (arrayDelegateType == null) {
                    JavaType javaType2 = this._containerType;
                    deserializationContext.reportBadDefinition(javaType2, String.format("Invalid delegate-creator definition for %s: value instantiator (%s) returned true for 'canCreateUsingArrayDelegate()', but null for 'getArrayDelegateType()'", javaType2, this._valueInstantiator.getClass().getName()));
                }
                this._delegateDeserializer = findDeserializer(deserializationContext, arrayDelegateType, null);
                return;
            }
            if (this._valueInstantiator.canCreateFromObjectWith()) {
                this._propertyBasedCreator = PropertyBasedCreator.OLrzqt(deserializationContext, this._valueInstantiator, this._valueInstantiator.getFromObjectArguments(deserializationContext.getConfig()), deserializationContext.isEnabled(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES));
            }
        }
    }

    @Override // o.InterfaceC5554We
    public AbstractC5548Vy<?> createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) throws JsonMappingException {
        AbstractC5548Vy<?> abstractC5548VyHandleSecondaryContextualization;
        VC vcFindKeyDeserializer = this._keyDeserializer;
        if (vcFindKeyDeserializer == null) {
            vcFindKeyDeserializer = deserializationContext.findKeyDeserializer(this._containerType.getKeyType(), beanProperty);
        }
        AbstractC5548Vy<?> abstractC5548Vy = this._valueDeserializer;
        JavaType contentType = this._containerType.getContentType();
        if (abstractC5548Vy == null) {
            abstractC5548VyHandleSecondaryContextualization = deserializationContext.findContextualValueDeserializer(contentType, beanProperty);
        } else {
            abstractC5548VyHandleSecondaryContextualization = deserializationContext.handleSecondaryContextualization(abstractC5548Vy, beanProperty, contentType);
        }
        AbstractC5597Xv abstractC5597XvForProperty = this._valueTypeDeserializer;
        if (abstractC5597XvForProperty != null) {
            abstractC5597XvForProperty = abstractC5597XvForProperty.forProperty(beanProperty);
        }
        return withResolved(vcFindKeyDeserializer, abstractC5548VyHandleSecondaryContextualization, abstractC5597XvForProperty, findContentNullProvider(deserializationContext, beanProperty, abstractC5548VyHandleSecondaryContextualization));
    }

    @Override // o.AbstractC5548Vy
    public LogicalType logicalType() {
        return LogicalType.Map;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase, o.AbstractC5548Vy
    public Object getEmptyValue(DeserializationContext deserializationContext) throws JsonMappingException {
        return constructMap(deserializationContext);
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;)Ljava/lang/Object; */
    @Override // o.AbstractC5548Vy
    public EnumMap<?, ?> deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        if (this._propertyBasedCreator != null) {
            return _deserializeUsingProperties(jsonParser, deserializationContext);
        }
        AbstractC5548Vy<Object> abstractC5548Vy = this._delegateDeserializer;
        if (abstractC5548Vy != null) {
            return (EnumMap) this._valueInstantiator.createUsingDelegate(deserializationContext, abstractC5548Vy.deserialize(jsonParser, deserializationContext));
        }
        int iValueOf = jsonParser.valueOf();
        if (iValueOf != 1 && iValueOf != 2) {
            if (iValueOf == 3) {
                return _deserializeFromArray(jsonParser, deserializationContext);
            }
            if (iValueOf != 5) {
                if (iValueOf == 6) {
                    return _deserializeFromString(jsonParser, deserializationContext);
                }
                return (EnumMap) deserializationContext.handleUnexpectedToken(getValueType(deserializationContext), jsonParser);
            }
        }
        return deserialize(jsonParser, deserializationContext, (EnumMap) constructMap(deserializationContext));
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.AbstractC5548Vy
    public EnumMap<?, ?> deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, EnumMap enumMap) throws IOException {
        String strKWHzl;
        Object objDeserializeWithType;
        jsonParser.KWHzl(enumMap);
        AbstractC5548Vy<Object> abstractC5548Vy = this._valueDeserializer;
        AbstractC5597Xv abstractC5597Xv = this._valueTypeDeserializer;
        if (jsonParser.QVAiDq()) {
            strKWHzl = jsonParser.QbewEr();
        } else {
            JsonToken jsonTokenDjBIcL = jsonParser.djBIcL();
            JsonToken jsonToken = JsonToken.FIELD_NAME;
            if (jsonTokenDjBIcL != jsonToken) {
                if (jsonTokenDjBIcL == JsonToken.END_OBJECT) {
                    return enumMap;
                }
                deserializationContext.reportWrongTokenException(this, jsonToken, (String) null, new Object[0]);
            }
            strKWHzl = jsonParser.KWHzl();
        }
        while (strKWHzl != null) {
            Enum r3 = (Enum) this._keyDeserializer.deserializeKey(strKWHzl, deserializationContext);
            JsonToken jsonTokenRcXXUw = jsonParser.RcXXUw();
            if (r3 == null) {
                if (!deserializationContext.isEnabled(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL)) {
                    return (EnumMap) deserializationContext.handleWeirdStringValue(this._enumClass, strKWHzl, "value not one of declared Enum instance names for %s", this._containerType.getKeyType());
                }
                jsonParser.UeEOUB();
            } else {
                try {
                    if (jsonTokenRcXXUw == JsonToken.VALUE_NULL) {
                        if (!this._skipNullValues) {
                            objDeserializeWithType = this._nullProvider.getNullValue(deserializationContext);
                        }
                    } else if (abstractC5597Xv == null) {
                        objDeserializeWithType = abstractC5548Vy.deserialize(jsonParser, deserializationContext);
                    } else {
                        objDeserializeWithType = abstractC5548Vy.deserializeWithType(jsonParser, deserializationContext, abstractC5597Xv);
                    }
                    enumMap.put(r3, objDeserializeWithType);
                } catch (Exception e) {
                    return (EnumMap) wrapAndThrow(deserializationContext, e, enumMap, strKWHzl);
                }
            }
            strKWHzl = jsonParser.QbewEr();
        }
        return enumMap;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer, o.AbstractC5548Vy
    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, AbstractC5597Xv abstractC5597Xv) throws IOException {
        return abstractC5597Xv.deserializeTypedFromObject(jsonParser, deserializationContext);
    }

    public EnumMap<?, ?> constructMap(DeserializationContext deserializationContext) throws JsonMappingException {
        ValueInstantiator valueInstantiator = this._valueInstantiator;
        if (valueInstantiator == null) {
            return new EnumMap<>(this._enumClass);
        }
        try {
            if (!valueInstantiator.canCreateUsingDefault()) {
                return (EnumMap) deserializationContext.handleMissingInstantiator(handledType(), getValueInstantiator(), null, "no default constructor found", new Object[0]);
            }
            return (EnumMap) this._valueInstantiator.createUsingDefault(deserializationContext);
        } catch (IOException e) {
            return (EnumMap) C5619Yr.copydefault(deserializationContext, e);
        }
    }

    public EnumMap<?, ?> _deserializeUsingProperties(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        String strKWHzl;
        Object objDeserializeWithType;
        PropertyBasedCreator propertyBasedCreator = this._propertyBasedCreator;
        C5569Wt c5569WtOLrzqt = propertyBasedCreator.OLrzqt(jsonParser, deserializationContext, null);
        if (jsonParser.QVAiDq()) {
            strKWHzl = jsonParser.QbewEr();
        } else {
            strKWHzl = jsonParser.copydefault(JsonToken.FIELD_NAME) ? jsonParser.KWHzl() : null;
        }
        while (strKWHzl != null) {
            JsonToken jsonTokenRcXXUw = jsonParser.RcXXUw();
            SettableBeanProperty settableBeanPropertyKWHzl = propertyBasedCreator.KWHzl(strKWHzl);
            if (settableBeanPropertyKWHzl != null) {
                if (c5569WtOLrzqt.EZpvd(settableBeanPropertyKWHzl, settableBeanPropertyKWHzl.deserialize(jsonParser, deserializationContext))) {
                    jsonParser.RcXXUw();
                    try {
                        return deserialize(jsonParser, deserializationContext, (EnumMap) propertyBasedCreator.EZpvd(deserializationContext, c5569WtOLrzqt));
                    } catch (Exception e) {
                        return (EnumMap) wrapAndThrow(deserializationContext, e, this._containerType.getRawClass(), strKWHzl);
                    }
                }
            } else {
                Enum r5 = (Enum) this._keyDeserializer.deserializeKey(strKWHzl, deserializationContext);
                if (r5 == null) {
                    if (!deserializationContext.isEnabled(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL)) {
                        return (EnumMap) deserializationContext.handleWeirdStringValue(this._enumClass, strKWHzl, "value not one of declared Enum instance names for %s", this._containerType.getKeyType());
                    }
                    jsonParser.RcXXUw();
                    jsonParser.UeEOUB();
                } else {
                    try {
                        if (jsonTokenRcXXUw != JsonToken.VALUE_NULL) {
                            AbstractC5597Xv abstractC5597Xv = this._valueTypeDeserializer;
                            if (abstractC5597Xv == null) {
                                objDeserializeWithType = this._valueDeserializer.deserialize(jsonParser, deserializationContext);
                            } else {
                                objDeserializeWithType = this._valueDeserializer.deserializeWithType(jsonParser, deserializationContext, abstractC5597Xv);
                            }
                        } else if (!this._skipNullValues) {
                            objDeserializeWithType = this._nullProvider.getNullValue(deserializationContext);
                        }
                        c5569WtOLrzqt.KWHzl(r5, objDeserializeWithType);
                    } catch (Exception e2) {
                        wrapAndThrow(deserializationContext, e2, this._containerType.getRawClass(), strKWHzl);
                        return null;
                    }
                }
            }
            strKWHzl = jsonParser.QbewEr();
        }
        try {
            return (EnumMap) propertyBasedCreator.EZpvd(deserializationContext, c5569WtOLrzqt);
        } catch (Exception e3) {
            wrapAndThrow(deserializationContext, e3, this._containerType.getRawClass(), strKWHzl);
            return null;
        }
    }
}
