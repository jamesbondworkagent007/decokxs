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
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.databind.type.LogicalType;
import com.fasterxml.jackson.databind.util.AccessPattern;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Objects;
import o.AbstractC5548Vy;
import o.AbstractC5597Xv;
import o.C5626Yz;
import o.InterfaceC5554We;
import o.InterfaceC5555Wf;
import o.VK;

/* JADX INFO: loaded from: classes21.dex */
@VK
public class ObjectArrayDeserializer extends ContainerDeserializerBase<Object[]> implements InterfaceC5554We {
    private static final long serialVersionUID = 1;
    protected final Class<?> _elementClass;
    protected AbstractC5548Vy<Object> _elementDeserializer;
    protected final AbstractC5597Xv _elementTypeDeserializer;
    protected final Object[] _emptyValue;
    protected final boolean _untyped;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase
    public AbstractC5548Vy<Object> getContentDeserializer() {
        return this._elementDeserializer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase, o.AbstractC5548Vy
    public Object getEmptyValue(DeserializationContext deserializationContext) throws JsonMappingException {
        return this._emptyValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC5548Vy
    public boolean isCachable() {
        return this._elementDeserializer == null && this._elementTypeDeserializer == null;
    }

    public ObjectArrayDeserializer(JavaType javaType, AbstractC5548Vy<Object> abstractC5548Vy, AbstractC5597Xv abstractC5597Xv) {
        super(javaType, (InterfaceC5555Wf) null, (Boolean) null);
        ArrayType arrayType = (ArrayType) javaType;
        Class<?> rawClass = arrayType.getContentType().getRawClass();
        this._elementClass = rawClass;
        this._untyped = rawClass == Object.class;
        this._elementDeserializer = abstractC5548Vy;
        this._elementTypeDeserializer = abstractC5597Xv;
        this._emptyValue = arrayType.getEmptyArray();
    }

    public ObjectArrayDeserializer(ObjectArrayDeserializer objectArrayDeserializer, AbstractC5548Vy<Object> abstractC5548Vy, AbstractC5597Xv abstractC5597Xv, InterfaceC5555Wf interfaceC5555Wf, Boolean bool) {
        super(objectArrayDeserializer, interfaceC5555Wf, bool);
        this._elementClass = objectArrayDeserializer._elementClass;
        this._untyped = objectArrayDeserializer._untyped;
        this._emptyValue = objectArrayDeserializer._emptyValue;
        this._elementDeserializer = abstractC5548Vy;
        this._elementTypeDeserializer = abstractC5597Xv;
    }

    public ObjectArrayDeserializer withDeserializer(AbstractC5597Xv abstractC5597Xv, AbstractC5548Vy<?> abstractC5548Vy) {
        return withResolved(abstractC5597Xv, abstractC5548Vy, this._nullProvider, this._unwrapSingle);
    }

    public ObjectArrayDeserializer withResolved(AbstractC5597Xv abstractC5597Xv, AbstractC5548Vy<?> abstractC5548Vy, InterfaceC5555Wf interfaceC5555Wf, Boolean bool) {
        return (Objects.equals(bool, this._unwrapSingle) && interfaceC5555Wf == this._nullProvider && abstractC5548Vy == this._elementDeserializer && abstractC5597Xv == this._elementTypeDeserializer) ? this : new ObjectArrayDeserializer(this, abstractC5548Vy, abstractC5597Xv, interfaceC5555Wf, bool);
    }

    @Override // o.AbstractC5548Vy
    public LogicalType logicalType() {
        return LogicalType.Array;
    }

    @Override // o.InterfaceC5554We
    public AbstractC5548Vy<?> createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) throws JsonMappingException {
        AbstractC5548Vy<?> abstractC5548VyHandleSecondaryContextualization;
        AbstractC5548Vy<?> abstractC5548Vy = this._elementDeserializer;
        Boolean boolFindFormatFeature = findFormatFeature(deserializationContext, beanProperty, this._containerType.getRawClass(), JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
        AbstractC5548Vy<?> abstractC5548VyFindConvertingContentDeserializer = findConvertingContentDeserializer(deserializationContext, beanProperty, abstractC5548Vy);
        JavaType contentType = this._containerType.getContentType();
        if (abstractC5548VyFindConvertingContentDeserializer == null) {
            abstractC5548VyHandleSecondaryContextualization = deserializationContext.findContextualValueDeserializer(contentType, beanProperty);
        } else {
            abstractC5548VyHandleSecondaryContextualization = deserializationContext.handleSecondaryContextualization(abstractC5548VyFindConvertingContentDeserializer, beanProperty, contentType);
        }
        AbstractC5597Xv abstractC5597XvForProperty = this._elementTypeDeserializer;
        if (abstractC5597XvForProperty != null) {
            abstractC5597XvForProperty = abstractC5597XvForProperty.forProperty(beanProperty);
        }
        return withResolved(abstractC5597XvForProperty, abstractC5548VyHandleSecondaryContextualization, findContentNullProvider(deserializationContext, beanProperty, abstractC5548VyHandleSecondaryContextualization), boolFindFormatFeature);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase, o.AbstractC5548Vy
    public AccessPattern getEmptyAccessPattern() {
        return AccessPattern.CONSTANT;
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;)Ljava/lang/Object; */
    @Override // o.AbstractC5548Vy
    public Object[] deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        Object[] objArrOLrzqt;
        Object objDeserializeWithType;
        int i;
        if (!jsonParser.RJOkX()) {
            return handleNonArray(jsonParser, deserializationContext);
        }
        C5626Yz c5626YzLeaseObjectBuffer = deserializationContext.leaseObjectBuffer();
        Object[] objArrOLrzqt2 = c5626YzLeaseObjectBuffer.OLrzqt();
        AbstractC5597Xv abstractC5597Xv = this._elementTypeDeserializer;
        int i2 = 0;
        while (true) {
            try {
                JsonToken jsonTokenRcXXUw = jsonParser.RcXXUw();
                if (jsonTokenRcXXUw == JsonToken.END_ARRAY) {
                    break;
                }
                try {
                    if (jsonTokenRcXXUw == JsonToken.VALUE_NULL) {
                        if (!this._skipNullValues) {
                            objDeserializeWithType = this._nullProvider.getNullValue(deserializationContext);
                        }
                    } else if (abstractC5597Xv == null) {
                        objDeserializeWithType = this._elementDeserializer.deserialize(jsonParser, deserializationContext);
                    } else {
                        objDeserializeWithType = this._elementDeserializer.deserializeWithType(jsonParser, deserializationContext, abstractC5597Xv);
                    }
                    objArrOLrzqt2[i2] = objDeserializeWithType;
                    i2 = i;
                } catch (Exception e) {
                    e = e;
                    i2 = i;
                    throw JsonMappingException.wrapWithPath(e, objArrOLrzqt2, c5626YzLeaseObjectBuffer.AEQbTJ() + i2);
                }
                if (i2 >= objArrOLrzqt2.length) {
                    objArrOLrzqt2 = c5626YzLeaseObjectBuffer.AEQbTJ(objArrOLrzqt2);
                    i2 = 0;
                }
                i = i2 + 1;
            } catch (Exception e2) {
                e = e2;
            }
        }
        if (this._untyped) {
            objArrOLrzqt = c5626YzLeaseObjectBuffer.EZpvd(objArrOLrzqt2, i2);
        } else {
            objArrOLrzqt = c5626YzLeaseObjectBuffer.OLrzqt(objArrOLrzqt2, i2, this._elementClass);
        }
        deserializationContext.returnObjectBuffer(c5626YzLeaseObjectBuffer);
        return objArrOLrzqt;
    }

    /* JADX DEBUG: Method merged with bridge method: deserializeWithType(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;Lo/Xv;)Ljava/lang/Object; */
    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer, o.AbstractC5548Vy
    public Object[] deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, AbstractC5597Xv abstractC5597Xv) throws IOException {
        return (Object[]) abstractC5597Xv.deserializeTypedFromArray(jsonParser, deserializationContext);
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.AbstractC5548Vy
    public Object[] deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, Object[] objArr) throws IOException {
        Object[] objArrOLrzqt;
        Object objDeserializeWithType;
        int i;
        if (!jsonParser.RJOkX()) {
            Object[] objArrHandleNonArray = handleNonArray(jsonParser, deserializationContext);
            if (objArrHandleNonArray == null) {
                return objArr;
            }
            int length = objArr.length;
            Object[] objArr2 = new Object[objArrHandleNonArray.length + length];
            System.arraycopy(objArr, 0, objArr2, 0, length);
            System.arraycopy(objArrHandleNonArray, 0, objArr2, length, objArrHandleNonArray.length);
            return objArr2;
        }
        C5626Yz c5626YzLeaseObjectBuffer = deserializationContext.leaseObjectBuffer();
        int length2 = objArr.length;
        Object[] objArrAEQbTJ = c5626YzLeaseObjectBuffer.AEQbTJ(objArr, length2);
        AbstractC5597Xv abstractC5597Xv = this._elementTypeDeserializer;
        while (true) {
            try {
                JsonToken jsonTokenRcXXUw = jsonParser.RcXXUw();
                if (jsonTokenRcXXUw == JsonToken.END_ARRAY) {
                    break;
                }
                try {
                    if (jsonTokenRcXXUw == JsonToken.VALUE_NULL) {
                        if (!this._skipNullValues) {
                            objDeserializeWithType = this._nullProvider.getNullValue(deserializationContext);
                        }
                    } else if (abstractC5597Xv == null) {
                        objDeserializeWithType = this._elementDeserializer.deserialize(jsonParser, deserializationContext);
                    } else {
                        objDeserializeWithType = this._elementDeserializer.deserializeWithType(jsonParser, deserializationContext, abstractC5597Xv);
                    }
                    objArrAEQbTJ[length2] = objDeserializeWithType;
                    length2 = i;
                } catch (Exception e) {
                    e = e;
                    length2 = i;
                    throw JsonMappingException.wrapWithPath(e, objArrAEQbTJ, c5626YzLeaseObjectBuffer.AEQbTJ() + length2);
                }
                if (length2 >= objArrAEQbTJ.length) {
                    objArrAEQbTJ = c5626YzLeaseObjectBuffer.AEQbTJ(objArrAEQbTJ);
                    length2 = 0;
                }
                i = length2 + 1;
            } catch (Exception e2) {
                e = e2;
            }
        }
        if (this._untyped) {
            objArrOLrzqt = c5626YzLeaseObjectBuffer.EZpvd(objArrAEQbTJ, length2);
        } else {
            objArrOLrzqt = c5626YzLeaseObjectBuffer.OLrzqt(objArrAEQbTJ, length2, this._elementClass);
        }
        deserializationContext.returnObjectBuffer(c5626YzLeaseObjectBuffer);
        return objArrOLrzqt;
    }

    public Byte[] deserializeFromBase64(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        byte[] bArrCopydefault = jsonParser.copydefault(deserializationContext.getBase64Variant());
        Byte[] bArr = new Byte[bArrCopydefault.length];
        int length = bArrCopydefault.length;
        for (int i = 0; i < length; i++) {
            bArr[i] = Byte.valueOf(bArrCopydefault[i]);
        }
        return bArr;
    }

    public Object[] handleNonArray(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        Object objDeserializeWithType;
        Boolean bool = this._unwrapSingle;
        if (bool != Boolean.TRUE && (bool != null || !deserializationContext.isEnabled(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY))) {
            if (!jsonParser.copydefault(JsonToken.VALUE_STRING)) {
                return (Object[]) deserializationContext.handleUnexpectedToken(this._containerType, jsonParser);
            }
            if (this._elementClass == Byte.class) {
                return deserializeFromBase64(jsonParser, deserializationContext);
            }
            return _deserializeFromString(jsonParser, deserializationContext);
        }
        if (!jsonParser.copydefault(JsonToken.VALUE_NULL)) {
            if (jsonParser.copydefault(JsonToken.VALUE_STRING)) {
                String strZLjUOn = jsonParser.zLjUOn();
                if (strZLjUOn.isEmpty()) {
                    CoercionAction coercionActionFindCoercionAction = deserializationContext.findCoercionAction(logicalType(), handledType(), CoercionInputShape.EmptyString);
                    if (coercionActionFindCoercionAction != CoercionAction.Fail) {
                        return (Object[]) _deserializeFromEmptyString(jsonParser, deserializationContext, coercionActionFindCoercionAction, handledType(), "empty String (\"\")");
                    }
                } else if (StdDeserializer._isBlank(strZLjUOn)) {
                    LogicalType logicalType = logicalType();
                    Class<?> clsHandledType = handledType();
                    CoercionAction coercionAction = CoercionAction.Fail;
                    CoercionAction coercionActionFindCoercionFromBlankString = deserializationContext.findCoercionFromBlankString(logicalType, clsHandledType, coercionAction);
                    if (coercionActionFindCoercionFromBlankString != coercionAction) {
                        return (Object[]) _deserializeFromEmptyString(jsonParser, deserializationContext, coercionActionFindCoercionFromBlankString, handledType(), "blank String (all whitespace)");
                    }
                }
            }
            AbstractC5597Xv abstractC5597Xv = this._elementTypeDeserializer;
            if (abstractC5597Xv == null) {
                objDeserializeWithType = this._elementDeserializer.deserialize(jsonParser, deserializationContext);
            } else {
                objDeserializeWithType = this._elementDeserializer.deserializeWithType(jsonParser, deserializationContext, abstractC5597Xv);
            }
        } else {
            if (this._skipNullValues) {
                return this._emptyValue;
            }
            objDeserializeWithType = this._nullProvider.getNullValue(deserializationContext);
        }
        Object[] objArr = this._untyped ? new Object[1] : (Object[]) Array.newInstance(this._elementClass, 1);
        objArr[0] = objDeserializeWithType;
        return objArr;
    }
}
