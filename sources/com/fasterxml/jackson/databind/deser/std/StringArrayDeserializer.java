package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.cfg.CoercionAction;
import com.fasterxml.jackson.databind.cfg.CoercionInputShape;
import com.fasterxml.jackson.databind.deser.impl.NullsConstantProvider;
import com.fasterxml.jackson.databind.type.LogicalType;
import com.fasterxml.jackson.databind.util.AccessPattern;
import java.io.IOException;
import java.util.Objects;
import o.AbstractC5548Vy;
import o.AbstractC5597Xv;
import o.C5626Yz;
import o.InterfaceC5554We;
import o.InterfaceC5555Wf;
import o.VK;

/* JADX INFO: loaded from: classes21.dex */
@VK
public final class StringArrayDeserializer extends StdDeserializer<String[]> implements InterfaceC5554We {
    private static final String[] NO_STRINGS = new String[0];
    public static final StringArrayDeserializer instance = new StringArrayDeserializer();
    private static final long serialVersionUID = 2;
    protected AbstractC5548Vy<String> _elementDeserializer;
    protected final InterfaceC5555Wf _nullProvider;
    protected final boolean _skipNullValues;
    protected final Boolean _unwrapSingle;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC5548Vy
    public Object getEmptyValue(DeserializationContext deserializationContext) throws JsonMappingException {
        return NO_STRINGS;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC5548Vy
    public Boolean supportsUpdate(DeserializationConfig deserializationConfig) {
        return Boolean.TRUE;
    }

    public StringArrayDeserializer() {
        this(null, null, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: o.Vy<?> */
    /* JADX WARN: Multi-variable type inference failed */
    public StringArrayDeserializer(AbstractC5548Vy<?> abstractC5548Vy, InterfaceC5555Wf interfaceC5555Wf, Boolean bool) {
        super((Class<?>) String[].class);
        this._elementDeserializer = abstractC5548Vy;
        this._nullProvider = interfaceC5555Wf;
        this._unwrapSingle = bool;
        this._skipNullValues = NullsConstantProvider.isSkipper(interfaceC5555Wf);
    }

    @Override // o.AbstractC5548Vy
    public LogicalType logicalType() {
        return LogicalType.Array;
    }

    @Override // o.AbstractC5548Vy
    public AccessPattern getEmptyAccessPattern() {
        return AccessPattern.CONSTANT;
    }

    @Override // o.InterfaceC5554We
    public AbstractC5548Vy<?> createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) throws JsonMappingException {
        AbstractC5548Vy<?> abstractC5548VyHandleSecondaryContextualization;
        AbstractC5548Vy<?> abstractC5548VyFindConvertingContentDeserializer = findConvertingContentDeserializer(deserializationContext, beanProperty, this._elementDeserializer);
        JavaType javaTypeConstructType = deserializationContext.constructType(String.class);
        if (abstractC5548VyFindConvertingContentDeserializer == null) {
            abstractC5548VyHandleSecondaryContextualization = deserializationContext.findContextualValueDeserializer(javaTypeConstructType, beanProperty);
        } else {
            abstractC5548VyHandleSecondaryContextualization = deserializationContext.handleSecondaryContextualization(abstractC5548VyFindConvertingContentDeserializer, beanProperty, javaTypeConstructType);
        }
        Boolean boolFindFormatFeature = findFormatFeature(deserializationContext, beanProperty, String[].class, JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
        InterfaceC5555Wf interfaceC5555WfFindContentNullProvider = findContentNullProvider(deserializationContext, beanProperty, abstractC5548VyHandleSecondaryContextualization);
        if (abstractC5548VyHandleSecondaryContextualization != null && isDefaultDeserializer(abstractC5548VyHandleSecondaryContextualization)) {
            abstractC5548VyHandleSecondaryContextualization = null;
        }
        return (this._elementDeserializer == abstractC5548VyHandleSecondaryContextualization && Objects.equals(this._unwrapSingle, boolFindFormatFeature) && this._nullProvider == interfaceC5555WfFindContentNullProvider) ? this : new StringArrayDeserializer(abstractC5548VyHandleSecondaryContextualization, interfaceC5555WfFindContentNullProvider, boolFindFormatFeature);
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;)Ljava/lang/Object; */
    @Override // o.AbstractC5548Vy
    public String[] deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        String strDNCPSb;
        int i;
        if (!jsonParser.RJOkX()) {
            return handleNonArray(jsonParser, deserializationContext);
        }
        if (this._elementDeserializer != null) {
            return _deserializeCustom(jsonParser, deserializationContext, null);
        }
        C5626Yz c5626YzLeaseObjectBuffer = deserializationContext.leaseObjectBuffer();
        Object[] objArrOLrzqt = c5626YzLeaseObjectBuffer.OLrzqt();
        int i2 = 0;
        while (true) {
            try {
                strDNCPSb = jsonParser.dNCPSb();
            } catch (Exception e) {
                e = e;
            }
            try {
                if (strDNCPSb == null) {
                    JsonToken jsonTokenDjBIcL = jsonParser.djBIcL();
                    if (jsonTokenDjBIcL != JsonToken.END_ARRAY) {
                        if (jsonTokenDjBIcL != JsonToken.VALUE_NULL) {
                            strDNCPSb = _parseString(jsonParser, deserializationContext, this._nullProvider);
                        } else if (!this._skipNullValues) {
                            strDNCPSb = (String) this._nullProvider.getNullValue(deserializationContext);
                        }
                    } else {
                        String[] strArr = (String[]) c5626YzLeaseObjectBuffer.OLrzqt(objArrOLrzqt, i2, String.class);
                        deserializationContext.returnObjectBuffer(c5626YzLeaseObjectBuffer);
                        return strArr;
                    }
                }
                objArrOLrzqt[i2] = strDNCPSb;
                i2 = i;
            } catch (Exception e2) {
                e = e2;
                i2 = i;
                throw JsonMappingException.wrapWithPath(e, objArrOLrzqt, c5626YzLeaseObjectBuffer.AEQbTJ() + i2);
            }
            if (i2 >= objArrOLrzqt.length) {
                objArrOLrzqt = c5626YzLeaseObjectBuffer.AEQbTJ(objArrOLrzqt);
                i2 = 0;
            }
            i = i2 + 1;
        }
    }

    public final String[] _deserializeCustom(JsonParser jsonParser, DeserializationContext deserializationContext, String[] strArr) throws IOException {
        int length;
        Object[] objArrAEQbTJ;
        String strDeserialize;
        int i;
        C5626Yz c5626YzLeaseObjectBuffer = deserializationContext.leaseObjectBuffer();
        if (strArr == null) {
            objArrAEQbTJ = c5626YzLeaseObjectBuffer.OLrzqt();
            length = 0;
        } else {
            length = strArr.length;
            objArrAEQbTJ = c5626YzLeaseObjectBuffer.AEQbTJ(strArr, length);
        }
        AbstractC5548Vy<String> abstractC5548Vy = this._elementDeserializer;
        while (true) {
            try {
                try {
                    if (jsonParser.dNCPSb() == null) {
                        JsonToken jsonTokenDjBIcL = jsonParser.djBIcL();
                        if (jsonTokenDjBIcL != JsonToken.END_ARRAY) {
                            if (jsonTokenDjBIcL != JsonToken.VALUE_NULL) {
                                strDeserialize = abstractC5548Vy.deserialize(jsonParser, deserializationContext);
                            } else if (!this._skipNullValues) {
                                strDeserialize = (String) this._nullProvider.getNullValue(deserializationContext);
                            }
                        } else {
                            String[] strArr2 = (String[]) c5626YzLeaseObjectBuffer.OLrzqt(objArrAEQbTJ, length, String.class);
                            deserializationContext.returnObjectBuffer(c5626YzLeaseObjectBuffer);
                            return strArr2;
                        }
                    } else {
                        strDeserialize = abstractC5548Vy.deserialize(jsonParser, deserializationContext);
                    }
                    objArrAEQbTJ[length] = strDeserialize;
                    length = i;
                } catch (Exception e) {
                    e = e;
                    length = i;
                    throw JsonMappingException.wrapWithPath(e, String.class, length);
                }
                if (length >= objArrAEQbTJ.length) {
                    objArrAEQbTJ = c5626YzLeaseObjectBuffer.AEQbTJ(objArrAEQbTJ);
                    length = 0;
                }
                i = length + 1;
            } catch (Exception e2) {
                e = e2;
            }
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer, o.AbstractC5548Vy
    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, AbstractC5597Xv abstractC5597Xv) throws IOException {
        return abstractC5597Xv.deserializeTypedFromArray(jsonParser, deserializationContext);
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.AbstractC5548Vy
    public String[] deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, String[] strArr) throws IOException {
        String strDNCPSb;
        if (!jsonParser.RJOkX()) {
            String[] strArrHandleNonArray = handleNonArray(jsonParser, deserializationContext);
            if (strArrHandleNonArray == null) {
                return strArr;
            }
            int length = strArr.length;
            String[] strArr2 = new String[strArrHandleNonArray.length + length];
            System.arraycopy(strArr, 0, strArr2, 0, length);
            System.arraycopy(strArrHandleNonArray, 0, strArr2, length, strArrHandleNonArray.length);
            return strArr2;
        }
        if (this._elementDeserializer != null) {
            return _deserializeCustom(jsonParser, deserializationContext, strArr);
        }
        C5626Yz c5626YzLeaseObjectBuffer = deserializationContext.leaseObjectBuffer();
        int length2 = strArr.length;
        Object[] objArrAEQbTJ = c5626YzLeaseObjectBuffer.AEQbTJ(strArr, length2);
        while (true) {
            try {
                strDNCPSb = jsonParser.dNCPSb();
            } catch (Exception e) {
                e = e;
            }
            if (strDNCPSb == null) {
                JsonToken jsonTokenDjBIcL = jsonParser.djBIcL();
                if (jsonTokenDjBIcL != JsonToken.END_ARRAY) {
                    if (jsonTokenDjBIcL != JsonToken.VALUE_NULL) {
                        strDNCPSb = _parseString(jsonParser, deserializationContext, this._nullProvider);
                    } else {
                        if (this._skipNullValues) {
                            return NO_STRINGS;
                        }
                        strDNCPSb = (String) this._nullProvider.getNullValue(deserializationContext);
                    }
                } else {
                    String[] strArr3 = (String[]) c5626YzLeaseObjectBuffer.OLrzqt(objArrAEQbTJ, length2, String.class);
                    deserializationContext.returnObjectBuffer(c5626YzLeaseObjectBuffer);
                    return strArr3;
                }
                throw JsonMappingException.wrapWithPath(e, objArrAEQbTJ, c5626YzLeaseObjectBuffer.AEQbTJ() + length2);
            }
            if (length2 >= objArrAEQbTJ.length) {
                objArrAEQbTJ = c5626YzLeaseObjectBuffer.AEQbTJ(objArrAEQbTJ);
                length2 = 0;
            }
            int i = length2 + 1;
            try {
                objArrAEQbTJ[length2] = strDNCPSb;
                length2 = i;
            } catch (Exception e2) {
                e = e2;
                length2 = i;
            }
        }
    }

    private final String[] handleNonArray(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        String str_parseString;
        Boolean bool = this._unwrapSingle;
        if (bool == Boolean.TRUE || (bool == null && deserializationContext.isEnabled(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY))) {
            if (jsonParser.copydefault(JsonToken.VALUE_NULL)) {
                str_parseString = (String) this._nullProvider.getNullValue(deserializationContext);
            } else {
                if (jsonParser.copydefault(JsonToken.VALUE_STRING)) {
                    String strZLjUOn = jsonParser.zLjUOn();
                    if (strZLjUOn.isEmpty()) {
                        CoercionAction coercionActionFindCoercionAction = deserializationContext.findCoercionAction(logicalType(), handledType(), CoercionInputShape.EmptyString);
                        if (coercionActionFindCoercionAction != CoercionAction.Fail) {
                            return (String[]) _deserializeFromEmptyString(jsonParser, deserializationContext, coercionActionFindCoercionAction, handledType(), "empty String (\"\")");
                        }
                    } else if (StdDeserializer._isBlank(strZLjUOn)) {
                        LogicalType logicalType = logicalType();
                        Class<?> clsHandledType = handledType();
                        CoercionAction coercionAction = CoercionAction.Fail;
                        CoercionAction coercionActionFindCoercionFromBlankString = deserializationContext.findCoercionFromBlankString(logicalType, clsHandledType, coercionAction);
                        if (coercionActionFindCoercionFromBlankString != coercionAction) {
                            return (String[]) _deserializeFromEmptyString(jsonParser, deserializationContext, coercionActionFindCoercionFromBlankString, handledType(), "blank String (all whitespace)");
                        }
                    }
                }
                str_parseString = _parseString(jsonParser, deserializationContext, this._nullProvider);
            }
            return new String[]{str_parseString};
        }
        if (jsonParser.copydefault(JsonToken.VALUE_STRING)) {
            return _deserializeFromString(jsonParser, deserializationContext);
        }
        return (String[]) deserializationContext.handleUnexpectedToken(this._valueClass, jsonParser);
    }
}
