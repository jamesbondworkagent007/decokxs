package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.deser.impl.NullsConstantProvider;
import com.fasterxml.jackson.databind.deser.impl.NullsFailProvider;
import com.fasterxml.jackson.databind.exc.InvalidNullException;
import com.fasterxml.jackson.databind.type.LogicalType;
import com.fasterxml.jackson.databind.util.AccessPattern;
import com.squareup.moshi.Json;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Objects;
import o.AbstractC5548Vy;
import o.AbstractC5597Xv;
import o.C5617Yp;
import o.InterfaceC5554We;
import o.InterfaceC5555Wf;
import o.TZ;
import o.VK;

/* JADX INFO: loaded from: classes21.dex */
public abstract class PrimitiveArrayDeserializers<T> extends StdDeserializer<T> implements InterfaceC5554We {
    private transient Object _emptyValue;
    protected final InterfaceC5555Wf _nuller;
    protected final Boolean _unwrapSingle;

    public abstract T _concat(T t, T t2);

    public abstract T _constructEmpty();

    public abstract T handleSingleElementUnwrapped(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC5548Vy
    public Boolean supportsUpdate(DeserializationConfig deserializationConfig) {
        return Boolean.TRUE;
    }

    public abstract PrimitiveArrayDeserializers<?> withResolved(InterfaceC5555Wf interfaceC5555Wf, Boolean bool);

    public PrimitiveArrayDeserializers(Class<T> cls) {
        super((Class<?>) cls);
        this._unwrapSingle = null;
        this._nuller = null;
    }

    public PrimitiveArrayDeserializers(PrimitiveArrayDeserializers<?> primitiveArrayDeserializers, InterfaceC5555Wf interfaceC5555Wf, Boolean bool) {
        super(primitiveArrayDeserializers._valueClass);
        this._unwrapSingle = bool;
        this._nuller = interfaceC5555Wf;
    }

    public static AbstractC5548Vy<?> forType(Class<?> cls) {
        if (cls == Integer.TYPE) {
            return IntDeser.instance;
        }
        if (cls == Long.TYPE) {
            return LongDeser.instance;
        }
        if (cls == Byte.TYPE) {
            return new ByteDeser();
        }
        if (cls == Short.TYPE) {
            return new ShortDeser();
        }
        if (cls == Float.TYPE) {
            return new FloatDeser();
        }
        if (cls == Double.TYPE) {
            return new DoubleDeser();
        }
        if (cls == Boolean.TYPE) {
            return new BooleanDeser();
        }
        if (cls == Character.TYPE) {
            return new CharDeser();
        }
        throw new IllegalStateException();
    }

    @Override // o.InterfaceC5554We
    public AbstractC5548Vy<?> createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) throws JsonMappingException {
        InterfaceC5555Wf interfaceC5555WfConstructForProperty;
        Boolean boolFindFormatFeature = findFormatFeature(deserializationContext, beanProperty, this._valueClass, JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
        Nulls nullsFindContentNullStyle = findContentNullStyle(deserializationContext, beanProperty);
        if (nullsFindContentNullStyle == Nulls.SKIP) {
            interfaceC5555WfConstructForProperty = NullsConstantProvider.skipper();
        } else if (nullsFindContentNullStyle != Nulls.FAIL) {
            interfaceC5555WfConstructForProperty = null;
        } else if (beanProperty == null) {
            interfaceC5555WfConstructForProperty = NullsFailProvider.constructForRootValue(deserializationContext.constructType(this._valueClass.getComponentType()));
        } else {
            interfaceC5555WfConstructForProperty = NullsFailProvider.constructForProperty(beanProperty, beanProperty.getType().getContentType());
        }
        return (Objects.equals(boolFindFormatFeature, this._unwrapSingle) && interfaceC5555WfConstructForProperty == this._nuller) ? this : withResolved(interfaceC5555WfConstructForProperty, boolFindFormatFeature);
    }

    @Override // o.AbstractC5548Vy
    public LogicalType logicalType() {
        return LogicalType.Array;
    }

    @Override // o.AbstractC5548Vy
    public AccessPattern getEmptyAccessPattern() {
        return AccessPattern.CONSTANT;
    }

    @Override // o.AbstractC5548Vy
    public Object getEmptyValue(DeserializationContext deserializationContext) throws JsonMappingException {
        Object obj = this._emptyValue;
        if (obj != null) {
            return obj;
        }
        T t_constructEmpty = _constructEmpty();
        this._emptyValue = t_constructEmpty;
        return t_constructEmpty;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer, o.AbstractC5548Vy
    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, AbstractC5597Xv abstractC5597Xv) throws IOException {
        return abstractC5597Xv.deserializeTypedFromArray(jsonParser, deserializationContext);
    }

    @Override // o.AbstractC5548Vy
    public T deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, T t) throws IOException {
        T tDeserialize = deserialize(jsonParser, deserializationContext);
        return (t == null || Array.getLength(t) == 0) ? tDeserialize : _concat(t, tDeserialize);
    }

    public T handleNonArray(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        if (jsonParser.copydefault(JsonToken.VALUE_STRING)) {
            return _deserializeFromString(jsonParser, deserializationContext);
        }
        Boolean bool = this._unwrapSingle;
        if (bool == Boolean.TRUE || (bool == null && deserializationContext.isEnabled(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY))) {
            return handleSingleElementUnwrapped(jsonParser, deserializationContext);
        }
        return (T) deserializationContext.handleUnexpectedToken(this._valueClass, jsonParser);
    }

    public void _failOnNull(DeserializationContext deserializationContext) throws IOException {
        throw InvalidNullException.from(deserializationContext, (PropertyName) null, deserializationContext.constructType(this._valueClass));
    }

    @VK
    public static final class CharDeser extends PrimitiveArrayDeserializers<char[]> {
        private static final long serialVersionUID = 1;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: _constructEmpty()Ljava/lang/Object; */
        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public char[] _constructEmpty() {
            return new char[0];
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public PrimitiveArrayDeserializers<?> withResolved(InterfaceC5555Wf interfaceC5555Wf, Boolean bool) {
            return this;
        }

        public CharDeser() {
            super(char[].class);
        }

        public CharDeser(CharDeser charDeser, InterfaceC5555Wf interfaceC5555Wf, Boolean bool) {
            super(charDeser, interfaceC5555Wf, bool);
        }

        /* JADX DEBUG: Method merged with bridge method: deserialize(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;)Ljava/lang/Object; */
        @Override // o.AbstractC5548Vy
        public char[] deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            String strZLjUOn;
            if (jsonParser.copydefault(JsonToken.VALUE_STRING)) {
                char[] cArrSSMYrx = jsonParser.sSMYrx();
                int iZuBGHE = jsonParser.zuBGHE();
                int iAwvSrB = jsonParser.AwvSrB();
                char[] cArr = new char[iAwvSrB];
                System.arraycopy(cArrSSMYrx, iZuBGHE, cArr, 0, iAwvSrB);
                return cArr;
            }
            if (jsonParser.RJOkX()) {
                StringBuilder sb = new StringBuilder(64);
                while (true) {
                    JsonToken jsonTokenRcXXUw = jsonParser.RcXXUw();
                    if (jsonTokenRcXXUw != JsonToken.END_ARRAY) {
                        if (jsonTokenRcXXUw == JsonToken.VALUE_STRING) {
                            strZLjUOn = jsonParser.zLjUOn();
                        } else if (jsonTokenRcXXUw == JsonToken.VALUE_NULL) {
                            InterfaceC5555Wf interfaceC5555Wf = this._nuller;
                            if (interfaceC5555Wf != null) {
                                interfaceC5555Wf.getNullValue(deserializationContext);
                            } else {
                                _verifyNullForPrimitive(deserializationContext);
                                strZLjUOn = Json.UNSET_NAME;
                            }
                        } else {
                            strZLjUOn = ((CharSequence) deserializationContext.handleUnexpectedToken(Character.TYPE, jsonParser)).toString();
                        }
                        if (strZLjUOn.length() != 1) {
                            deserializationContext.reportInputMismatch(this, "Cannot convert a JSON String of length %d into a char element of char array", Integer.valueOf(strZLjUOn.length()));
                        }
                        sb.append(strZLjUOn.charAt(0));
                    } else {
                        return sb.toString().toCharArray();
                    }
                }
            } else {
                if (jsonParser.copydefault(JsonToken.VALUE_EMBEDDED_OBJECT)) {
                    Object objAuCTel = jsonParser.AuCTel();
                    if (objAuCTel == null) {
                        return null;
                    }
                    if (objAuCTel instanceof char[]) {
                        return (char[]) objAuCTel;
                    }
                    if (objAuCTel instanceof String) {
                        return ((String) objAuCTel).toCharArray();
                    }
                    if (objAuCTel instanceof byte[]) {
                        return TZ.AEQbTJ().encode((byte[]) objAuCTel, false).toCharArray();
                    }
                }
                return (char[]) deserializationContext.handleUnexpectedToken(this._valueClass, jsonParser);
            }
        }

        /* JADX DEBUG: Method merged with bridge method: handleSingleElementUnwrapped(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;)Ljava/lang/Object; */
        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public char[] handleSingleElementUnwrapped(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            return (char[]) deserializationContext.handleUnexpectedToken(this._valueClass, jsonParser);
        }

        /* JADX DEBUG: Method merged with bridge method: _concat(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public char[] _concat(char[] cArr, char[] cArr2) {
            int length = cArr.length;
            int length2 = cArr2.length;
            char[] cArrCopyOf = Arrays.copyOf(cArr, length + length2);
            System.arraycopy(cArr2, 0, cArrCopyOf, length, length2);
            return cArrCopyOf;
        }
    }

    @VK
    public static final class BooleanDeser extends PrimitiveArrayDeserializers<boolean[]> {
        private static final long serialVersionUID = 1;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: _constructEmpty()Ljava/lang/Object; */
        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public boolean[] _constructEmpty() {
            return new boolean[0];
        }

        public BooleanDeser() {
            super(boolean[].class);
        }

        public BooleanDeser(BooleanDeser booleanDeser, InterfaceC5555Wf interfaceC5555Wf, Boolean bool) {
            super(booleanDeser, interfaceC5555Wf, bool);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public PrimitiveArrayDeserializers<?> withResolved(InterfaceC5555Wf interfaceC5555Wf, Boolean bool) {
            return new BooleanDeser(this, interfaceC5555Wf, bool);
        }

        /* JADX DEBUG: Method merged with bridge method: deserialize(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;)Ljava/lang/Object; */
        @Override // o.AbstractC5548Vy
        public boolean[] deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            boolean z_parseBooleanPrimitive;
            int i;
            if (!jsonParser.RJOkX()) {
                return handleNonArray(jsonParser, deserializationContext);
            }
            C5617Yp.ActionBar actionBarAEQbTJ = deserializationContext.getArrayBuilders().AEQbTJ();
            boolean[] zArrOLrzqt = actionBarAEQbTJ.OLrzqt();
            int i2 = 0;
            while (true) {
                try {
                    JsonToken jsonTokenRcXXUw = jsonParser.RcXXUw();
                    if (jsonTokenRcXXUw != JsonToken.END_ARRAY) {
                        try {
                            if (jsonTokenRcXXUw == JsonToken.VALUE_TRUE) {
                                z_parseBooleanPrimitive = true;
                            } else {
                                if (jsonTokenRcXXUw != JsonToken.VALUE_FALSE) {
                                    if (jsonTokenRcXXUw == JsonToken.VALUE_NULL) {
                                        InterfaceC5555Wf interfaceC5555Wf = this._nuller;
                                        if (interfaceC5555Wf != null) {
                                            interfaceC5555Wf.getNullValue(deserializationContext);
                                        } else {
                                            _verifyNullForPrimitive(deserializationContext);
                                        }
                                    } else {
                                        z_parseBooleanPrimitive = _parseBooleanPrimitive(jsonParser, deserializationContext);
                                    }
                                }
                                z_parseBooleanPrimitive = false;
                            }
                            zArrOLrzqt[i2] = z_parseBooleanPrimitive;
                            i2 = i;
                        } catch (Exception e) {
                            e = e;
                            i2 = i;
                            throw JsonMappingException.wrapWithPath(e, zArrOLrzqt, actionBarAEQbTJ.EZpvd() + i2);
                        }
                        if (i2 >= zArrOLrzqt.length) {
                            boolean[] zArrAEQbTJ = actionBarAEQbTJ.AEQbTJ(zArrOLrzqt, i2);
                            i2 = 0;
                            zArrOLrzqt = zArrAEQbTJ;
                        }
                        i = i2 + 1;
                    } else {
                        return actionBarAEQbTJ.EZpvd(zArrOLrzqt, i2);
                    }
                } catch (Exception e2) {
                    e = e2;
                }
            }
        }

        /* JADX DEBUG: Method merged with bridge method: handleSingleElementUnwrapped(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;)Ljava/lang/Object; */
        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public boolean[] handleSingleElementUnwrapped(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            return new boolean[]{_parseBooleanPrimitive(jsonParser, deserializationContext)};
        }

        /* JADX DEBUG: Method merged with bridge method: _concat(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public boolean[] _concat(boolean[] zArr, boolean[] zArr2) {
            int length = zArr.length;
            int length2 = zArr2.length;
            boolean[] zArrCopyOf = Arrays.copyOf(zArr, length + length2);
            System.arraycopy(zArr2, 0, zArrCopyOf, length, length2);
            return zArrCopyOf;
        }
    }

    @VK
    public static final class ByteDeser extends PrimitiveArrayDeserializers<byte[]> {
        private static final long serialVersionUID = 1;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: _constructEmpty()Ljava/lang/Object; */
        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public byte[] _constructEmpty() {
            return new byte[0];
        }

        public ByteDeser() {
            super(byte[].class);
        }

        public ByteDeser(ByteDeser byteDeser, InterfaceC5555Wf interfaceC5555Wf, Boolean bool) {
            super(byteDeser, interfaceC5555Wf, bool);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public PrimitiveArrayDeserializers<?> withResolved(InterfaceC5555Wf interfaceC5555Wf, Boolean bool) {
            return new ByteDeser(this, interfaceC5555Wf, bool);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers, o.AbstractC5548Vy
        public LogicalType logicalType() {
            return LogicalType.Binary;
        }

        /* JADX DEBUG: Method merged with bridge method: deserialize(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;)Ljava/lang/Object; */
        @Override // o.AbstractC5548Vy
        public byte[] deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            byte bAkhnZx;
            int i;
            JsonToken jsonTokenDjBIcL = jsonParser.djBIcL();
            if (jsonTokenDjBIcL == JsonToken.VALUE_STRING) {
                try {
                    return jsonParser.copydefault(deserializationContext.getBase64Variant());
                } catch (StreamReadException e) {
                    String originalMessage = e.getOriginalMessage();
                    if (originalMessage.contains("base64")) {
                        return (byte[]) deserializationContext.handleWeirdStringValue(byte[].class, jsonParser.zLjUOn(), originalMessage, new Object[0]);
                    }
                }
            }
            if (jsonTokenDjBIcL == JsonToken.VALUE_EMBEDDED_OBJECT) {
                Object objAuCTel = jsonParser.AuCTel();
                if (objAuCTel == null) {
                    return null;
                }
                if (objAuCTel instanceof byte[]) {
                    return (byte[]) objAuCTel;
                }
            }
            if (!jsonParser.RJOkX()) {
                return handleNonArray(jsonParser, deserializationContext);
            }
            C5617Yp.StateListAnimator stateListAnimatorKWHzl = deserializationContext.getArrayBuilders().KWHzl();
            byte[] bArrOLrzqt = stateListAnimatorKWHzl.OLrzqt();
            int i2 = 0;
            while (true) {
                try {
                    JsonToken jsonTokenRcXXUw = jsonParser.RcXXUw();
                    if (jsonTokenRcXXUw != JsonToken.END_ARRAY) {
                        try {
                            if (jsonTokenRcXXUw == JsonToken.VALUE_NUMBER_INT) {
                                bAkhnZx = jsonParser.AkhnZx();
                            } else if (jsonTokenRcXXUw == JsonToken.VALUE_NULL) {
                                InterfaceC5555Wf interfaceC5555Wf = this._nuller;
                                if (interfaceC5555Wf != null) {
                                    interfaceC5555Wf.getNullValue(deserializationContext);
                                } else {
                                    _verifyNullForPrimitive(deserializationContext);
                                    bAkhnZx = 0;
                                }
                            } else {
                                bAkhnZx = _parseBytePrimitive(jsonParser, deserializationContext);
                            }
                            bArrOLrzqt[i2] = bAkhnZx;
                            i2 = i;
                        } catch (Exception e2) {
                            e = e2;
                            i2 = i;
                            throw JsonMappingException.wrapWithPath(e, bArrOLrzqt, stateListAnimatorKWHzl.EZpvd() + i2);
                        }
                        if (i2 >= bArrOLrzqt.length) {
                            byte[] bArrAEQbTJ = stateListAnimatorKWHzl.AEQbTJ(bArrOLrzqt, i2);
                            i2 = 0;
                            bArrOLrzqt = bArrAEQbTJ;
                        }
                        i = i2 + 1;
                    } else {
                        return stateListAnimatorKWHzl.EZpvd(bArrOLrzqt, i2);
                    }
                } catch (Exception e3) {
                    e = e3;
                }
            }
        }

        /* JADX DEBUG: Method merged with bridge method: handleSingleElementUnwrapped(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;)Ljava/lang/Object; */
        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public byte[] handleSingleElementUnwrapped(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            byte bByteValue;
            JsonToken jsonTokenDjBIcL = jsonParser.djBIcL();
            if (jsonTokenDjBIcL == JsonToken.VALUE_NUMBER_INT) {
                bByteValue = jsonParser.AkhnZx();
            } else {
                if (jsonTokenDjBIcL == JsonToken.VALUE_NULL) {
                    InterfaceC5555Wf interfaceC5555Wf = this._nuller;
                    if (interfaceC5555Wf != null) {
                        interfaceC5555Wf.getNullValue(deserializationContext);
                        return (byte[]) getEmptyValue(deserializationContext);
                    }
                    _verifyNullForPrimitive(deserializationContext);
                    return null;
                }
                bByteValue = ((Number) deserializationContext.handleUnexpectedToken(this._valueClass.getComponentType(), jsonParser)).byteValue();
            }
            return new byte[]{bByteValue};
        }

        /* JADX DEBUG: Method merged with bridge method: _concat(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public byte[] _concat(byte[] bArr, byte[] bArr2) {
            int length = bArr.length;
            int length2 = bArr2.length;
            byte[] bArrCopyOf = Arrays.copyOf(bArr, length + length2);
            System.arraycopy(bArr2, 0, bArrCopyOf, length, length2);
            return bArrCopyOf;
        }
    }

    @VK
    public static final class ShortDeser extends PrimitiveArrayDeserializers<short[]> {
        private static final long serialVersionUID = 1;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: _constructEmpty()Ljava/lang/Object; */
        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public short[] _constructEmpty() {
            return new short[0];
        }

        public ShortDeser() {
            super(short[].class);
        }

        public ShortDeser(ShortDeser shortDeser, InterfaceC5555Wf interfaceC5555Wf, Boolean bool) {
            super(shortDeser, interfaceC5555Wf, bool);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public PrimitiveArrayDeserializers<?> withResolved(InterfaceC5555Wf interfaceC5555Wf, Boolean bool) {
            return new ShortDeser(this, interfaceC5555Wf, bool);
        }

        /* JADX DEBUG: Method merged with bridge method: deserialize(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;)Ljava/lang/Object; */
        @Override // o.AbstractC5548Vy
        public short[] deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            short s_parseShortPrimitive;
            int i;
            if (!jsonParser.RJOkX()) {
                return handleNonArray(jsonParser, deserializationContext);
            }
            C5617Yp.LoaderManager loaderManagerAhwBna = deserializationContext.getArrayBuilders().AhwBna();
            short[] sArrOLrzqt = loaderManagerAhwBna.OLrzqt();
            int i2 = 0;
            while (true) {
                try {
                    JsonToken jsonTokenRcXXUw = jsonParser.RcXXUw();
                    if (jsonTokenRcXXUw != JsonToken.END_ARRAY) {
                        try {
                            if (jsonTokenRcXXUw == JsonToken.VALUE_NULL) {
                                InterfaceC5555Wf interfaceC5555Wf = this._nuller;
                                if (interfaceC5555Wf != null) {
                                    interfaceC5555Wf.getNullValue(deserializationContext);
                                } else {
                                    _verifyNullForPrimitive(deserializationContext);
                                    s_parseShortPrimitive = 0;
                                }
                            } else {
                                s_parseShortPrimitive = _parseShortPrimitive(jsonParser, deserializationContext);
                            }
                            sArrOLrzqt[i2] = s_parseShortPrimitive;
                            i2 = i;
                        } catch (Exception e) {
                            e = e;
                            i2 = i;
                            throw JsonMappingException.wrapWithPath(e, sArrOLrzqt, loaderManagerAhwBna.EZpvd() + i2);
                        }
                        if (i2 >= sArrOLrzqt.length) {
                            short[] sArrAEQbTJ = loaderManagerAhwBna.AEQbTJ(sArrOLrzqt, i2);
                            i2 = 0;
                            sArrOLrzqt = sArrAEQbTJ;
                        }
                        i = i2 + 1;
                    } else {
                        return loaderManagerAhwBna.EZpvd(sArrOLrzqt, i2);
                    }
                } catch (Exception e2) {
                    e = e2;
                }
            }
        }

        /* JADX DEBUG: Method merged with bridge method: handleSingleElementUnwrapped(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;)Ljava/lang/Object; */
        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public short[] handleSingleElementUnwrapped(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            return new short[]{_parseShortPrimitive(jsonParser, deserializationContext)};
        }

        /* JADX DEBUG: Method merged with bridge method: _concat(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public short[] _concat(short[] sArr, short[] sArr2) {
            int length = sArr.length;
            int length2 = sArr2.length;
            short[] sArrCopyOf = Arrays.copyOf(sArr, length + length2);
            System.arraycopy(sArr2, 0, sArrCopyOf, length, length2);
            return sArrCopyOf;
        }
    }

    @VK
    public static final class IntDeser extends PrimitiveArrayDeserializers<int[]> {
        public static final IntDeser instance = new IntDeser();
        private static final long serialVersionUID = 1;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: _constructEmpty()Ljava/lang/Object; */
        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public int[] _constructEmpty() {
            return new int[0];
        }

        public IntDeser() {
            super(int[].class);
        }

        public IntDeser(IntDeser intDeser, InterfaceC5555Wf interfaceC5555Wf, Boolean bool) {
            super(intDeser, interfaceC5555Wf, bool);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public PrimitiveArrayDeserializers<?> withResolved(InterfaceC5555Wf interfaceC5555Wf, Boolean bool) {
            return new IntDeser(this, interfaceC5555Wf, bool);
        }

        /* JADX DEBUG: Method merged with bridge method: deserialize(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;)Ljava/lang/Object; */
        @Override // o.AbstractC5548Vy
        public int[] deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            int fieldNames;
            int i;
            if (!jsonParser.RJOkX()) {
                return handleNonArray(jsonParser, deserializationContext);
            }
            C5617Yp.Activity activityEZpvd = deserializationContext.getArrayBuilders().EZpvd();
            int[] iArr = (int[]) activityEZpvd.OLrzqt();
            int i2 = 0;
            while (true) {
                try {
                    JsonToken jsonTokenRcXXUw = jsonParser.RcXXUw();
                    if (jsonTokenRcXXUw != JsonToken.END_ARRAY) {
                        try {
                            if (jsonTokenRcXXUw == JsonToken.VALUE_NUMBER_INT) {
                                fieldNames = jsonParser.getFieldNames();
                            } else if (jsonTokenRcXXUw == JsonToken.VALUE_NULL) {
                                InterfaceC5555Wf interfaceC5555Wf = this._nuller;
                                if (interfaceC5555Wf != null) {
                                    interfaceC5555Wf.getNullValue(deserializationContext);
                                } else {
                                    _verifyNullForPrimitive(deserializationContext);
                                    fieldNames = 0;
                                }
                            } else {
                                fieldNames = _parseIntPrimitive(jsonParser, deserializationContext);
                            }
                            iArr[i2] = fieldNames;
                            i2 = i;
                        } catch (Exception e) {
                            e = e;
                            i2 = i;
                            throw JsonMappingException.wrapWithPath(e, iArr, activityEZpvd.EZpvd() + i2);
                        }
                        if (i2 >= iArr.length) {
                            int[] iArr2 = (int[]) activityEZpvd.AEQbTJ(iArr, i2);
                            i2 = 0;
                            iArr = iArr2;
                        }
                        i = i2 + 1;
                    } else {
                        return (int[]) activityEZpvd.EZpvd(iArr, i2);
                    }
                } catch (Exception e2) {
                    e = e2;
                }
            }
        }

        /* JADX DEBUG: Method merged with bridge method: handleSingleElementUnwrapped(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;)Ljava/lang/Object; */
        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public int[] handleSingleElementUnwrapped(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            return new int[]{_parseIntPrimitive(jsonParser, deserializationContext)};
        }

        /* JADX DEBUG: Method merged with bridge method: _concat(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public int[] _concat(int[] iArr, int[] iArr2) {
            int length = iArr.length;
            int length2 = iArr2.length;
            int[] iArrCopyOf = Arrays.copyOf(iArr, length + length2);
            System.arraycopy(iArr2, 0, iArrCopyOf, length, length2);
            return iArrCopyOf;
        }
    }

    @VK
    public static final class LongDeser extends PrimitiveArrayDeserializers<long[]> {
        public static final LongDeser instance = new LongDeser();
        private static final long serialVersionUID = 1;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: _constructEmpty()Ljava/lang/Object; */
        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public long[] _constructEmpty() {
            return new long[0];
        }

        public LongDeser() {
            super(long[].class);
        }

        public LongDeser(LongDeser longDeser, InterfaceC5555Wf interfaceC5555Wf, Boolean bool) {
            super(longDeser, interfaceC5555Wf, bool);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public PrimitiveArrayDeserializers<?> withResolved(InterfaceC5555Wf interfaceC5555Wf, Boolean bool) {
            return new LongDeser(this, interfaceC5555Wf, bool);
        }

        /* JADX DEBUG: Method merged with bridge method: deserialize(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;)Ljava/lang/Object; */
        @Override // o.AbstractC5548Vy
        public long[] deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            long newProxyInstance;
            int i;
            if (!jsonParser.RJOkX()) {
                return handleNonArray(jsonParser, deserializationContext);
            }
            C5617Yp.PendingIntent pendingIntentDjBIcL = deserializationContext.getArrayBuilders().djBIcL();
            long[] jArr = (long[]) pendingIntentDjBIcL.OLrzqt();
            int i2 = 0;
            while (true) {
                try {
                    JsonToken jsonTokenRcXXUw = jsonParser.RcXXUw();
                    if (jsonTokenRcXXUw != JsonToken.END_ARRAY) {
                        try {
                            if (jsonTokenRcXXUw == JsonToken.VALUE_NUMBER_INT) {
                                newProxyInstance = jsonParser.getNewProxyInstance();
                            } else if (jsonTokenRcXXUw == JsonToken.VALUE_NULL) {
                                InterfaceC5555Wf interfaceC5555Wf = this._nuller;
                                if (interfaceC5555Wf != null) {
                                    interfaceC5555Wf.getNullValue(deserializationContext);
                                } else {
                                    _verifyNullForPrimitive(deserializationContext);
                                    newProxyInstance = 0;
                                }
                            } else {
                                newProxyInstance = _parseLongPrimitive(jsonParser, deserializationContext);
                            }
                            jArr[i2] = newProxyInstance;
                            i2 = i;
                        } catch (Exception e) {
                            e = e;
                            i2 = i;
                            throw JsonMappingException.wrapWithPath(e, jArr, pendingIntentDjBIcL.EZpvd() + i2);
                        }
                        if (i2 >= jArr.length) {
                            long[] jArr2 = (long[]) pendingIntentDjBIcL.AEQbTJ(jArr, i2);
                            i2 = 0;
                            jArr = jArr2;
                        }
                        i = i2 + 1;
                    } else {
                        return (long[]) pendingIntentDjBIcL.EZpvd(jArr, i2);
                    }
                } catch (Exception e2) {
                    e = e2;
                }
            }
        }

        /* JADX DEBUG: Method merged with bridge method: handleSingleElementUnwrapped(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;)Ljava/lang/Object; */
        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public long[] handleSingleElementUnwrapped(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            return new long[]{_parseLongPrimitive(jsonParser, deserializationContext)};
        }

        /* JADX DEBUG: Method merged with bridge method: _concat(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public long[] _concat(long[] jArr, long[] jArr2) {
            int length = jArr.length;
            int length2 = jArr2.length;
            long[] jArrCopyOf = Arrays.copyOf(jArr, length + length2);
            System.arraycopy(jArr2, 0, jArrCopyOf, length, length2);
            return jArrCopyOf;
        }
    }

    @VK
    public static final class FloatDeser extends PrimitiveArrayDeserializers<float[]> {
        private static final long serialVersionUID = 1;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: _constructEmpty()Ljava/lang/Object; */
        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public float[] _constructEmpty() {
            return new float[0];
        }

        public FloatDeser() {
            super(float[].class);
        }

        public FloatDeser(FloatDeser floatDeser, InterfaceC5555Wf interfaceC5555Wf, Boolean bool) {
            super(floatDeser, interfaceC5555Wf, bool);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public PrimitiveArrayDeserializers<?> withResolved(InterfaceC5555Wf interfaceC5555Wf, Boolean bool) {
            return new FloatDeser(this, interfaceC5555Wf, bool);
        }

        /* JADX DEBUG: Method merged with bridge method: deserialize(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;)Ljava/lang/Object; */
        @Override // o.AbstractC5548Vy
        public float[] deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            InterfaceC5555Wf interfaceC5555Wf;
            if (!jsonParser.RJOkX()) {
                return handleNonArray(jsonParser, deserializationContext);
            }
            C5617Yp.Application applicationOLrzqt = deserializationContext.getArrayBuilders().OLrzqt();
            float[] fArr = (float[]) applicationOLrzqt.OLrzqt();
            int i = 0;
            while (true) {
                try {
                    JsonToken jsonTokenRcXXUw = jsonParser.RcXXUw();
                    if (jsonTokenRcXXUw != JsonToken.END_ARRAY) {
                        if (jsonTokenRcXXUw == JsonToken.VALUE_NULL && (interfaceC5555Wf = this._nuller) != null) {
                            interfaceC5555Wf.getNullValue(deserializationContext);
                        } else {
                            float f_parseFloatPrimitive = _parseFloatPrimitive(jsonParser, deserializationContext);
                            if (i >= fArr.length) {
                                float[] fArr2 = (float[]) applicationOLrzqt.AEQbTJ(fArr, i);
                                i = 0;
                                fArr = fArr2;
                            }
                            int i2 = i + 1;
                            try {
                                fArr[i] = f_parseFloatPrimitive;
                                i = i2;
                            } catch (Exception e) {
                                e = e;
                                i = i2;
                                throw JsonMappingException.wrapWithPath(e, fArr, applicationOLrzqt.EZpvd() + i);
                            }
                        }
                    } else {
                        return (float[]) applicationOLrzqt.EZpvd(fArr, i);
                    }
                } catch (Exception e2) {
                    e = e2;
                }
            }
        }

        /* JADX DEBUG: Method merged with bridge method: handleSingleElementUnwrapped(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;)Ljava/lang/Object; */
        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public float[] handleSingleElementUnwrapped(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            return new float[]{_parseFloatPrimitive(jsonParser, deserializationContext)};
        }

        /* JADX DEBUG: Method merged with bridge method: _concat(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public float[] _concat(float[] fArr, float[] fArr2) {
            int length = fArr.length;
            int length2 = fArr2.length;
            float[] fArrCopyOf = Arrays.copyOf(fArr, length + length2);
            System.arraycopy(fArr2, 0, fArrCopyOf, length, length2);
            return fArrCopyOf;
        }
    }

    @VK
    public static final class DoubleDeser extends PrimitiveArrayDeserializers<double[]> {
        private static final long serialVersionUID = 1;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: _constructEmpty()Ljava/lang/Object; */
        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public double[] _constructEmpty() {
            return new double[0];
        }

        public DoubleDeser() {
            super(double[].class);
        }

        public DoubleDeser(DoubleDeser doubleDeser, InterfaceC5555Wf interfaceC5555Wf, Boolean bool) {
            super(doubleDeser, interfaceC5555Wf, bool);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public PrimitiveArrayDeserializers<?> withResolved(InterfaceC5555Wf interfaceC5555Wf, Boolean bool) {
            return new DoubleDeser(this, interfaceC5555Wf, bool);
        }

        /* JADX DEBUG: Method merged with bridge method: deserialize(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;)Ljava/lang/Object; */
        @Override // o.AbstractC5548Vy
        public double[] deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            InterfaceC5555Wf interfaceC5555Wf;
            if (!jsonParser.RJOkX()) {
                return handleNonArray(jsonParser, deserializationContext);
            }
            C5617Yp.TaskDescription taskDescriptionCopydefault = deserializationContext.getArrayBuilders().copydefault();
            double[] dArr = (double[]) taskDescriptionCopydefault.OLrzqt();
            int i = 0;
            while (true) {
                try {
                    JsonToken jsonTokenRcXXUw = jsonParser.RcXXUw();
                    if (jsonTokenRcXXUw != JsonToken.END_ARRAY) {
                        if (jsonTokenRcXXUw == JsonToken.VALUE_NULL && (interfaceC5555Wf = this._nuller) != null) {
                            interfaceC5555Wf.getNullValue(deserializationContext);
                        } else {
                            double d_parseDoublePrimitive = _parseDoublePrimitive(jsonParser, deserializationContext);
                            if (i >= dArr.length) {
                                double[] dArr2 = (double[]) taskDescriptionCopydefault.AEQbTJ(dArr, i);
                                i = 0;
                                dArr = dArr2;
                            }
                            int i2 = i + 1;
                            try {
                                dArr[i] = d_parseDoublePrimitive;
                                i = i2;
                            } catch (Exception e) {
                                e = e;
                                i = i2;
                                throw JsonMappingException.wrapWithPath(e, dArr, taskDescriptionCopydefault.EZpvd() + i);
                            }
                        }
                    } else {
                        return (double[]) taskDescriptionCopydefault.EZpvd(dArr, i);
                    }
                } catch (Exception e2) {
                    e = e2;
                }
            }
        }

        /* JADX DEBUG: Method merged with bridge method: handleSingleElementUnwrapped(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;)Ljava/lang/Object; */
        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public double[] handleSingleElementUnwrapped(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            return new double[]{_parseDoublePrimitive(jsonParser, deserializationContext)};
        }

        /* JADX DEBUG: Method merged with bridge method: _concat(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public double[] _concat(double[] dArr, double[] dArr2) {
            int length = dArr.length;
            int length2 = dArr2.length;
            double[] dArrCopyOf = Arrays.copyOf(dArr, length + length2);
            System.arraycopy(dArr2, 0, dArrCopyOf, length, length2);
            return dArrCopyOf;
        }
    }
}
