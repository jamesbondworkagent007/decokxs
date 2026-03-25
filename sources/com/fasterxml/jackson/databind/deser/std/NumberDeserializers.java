package com.fasterxml.jackson.databind.deser.std;

import androidx.camera.video.AudioStats;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.StreamReadFeature;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.cfg.CoercionAction;
import com.fasterxml.jackson.databind.cfg.CoercionInputShape;
import com.fasterxml.jackson.databind.type.LogicalType;
import com.fasterxml.jackson.databind.util.AccessPattern;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.HashSet;
import o.AbstractC5548Vy;
import o.AbstractC5597Xv;
import o.C5522Uy;
import o.C5619Yr;
import o.VK;

/* JADX INFO: loaded from: classes21.dex */
public class NumberDeserializers {
    public static final HashSet<String> KWHzl = new HashSet<>();

    static {
        Class[] clsArr = {Boolean.class, Byte.class, Short.class, Character.class, Integer.class, Long.class, Float.class, Double.class, Number.class, BigDecimal.class, BigInteger.class};
        for (int i = 0; i < 11; i++) {
            KWHzl.add(clsArr[i].getName());
        }
    }

    public static AbstractC5548Vy<?> KWHzl(Class<?> cls, String str) {
        if (cls.isPrimitive()) {
            if (cls == Integer.TYPE) {
                return IntegerDeserializer.primitiveInstance;
            }
            if (cls == Boolean.TYPE) {
                return BooleanDeserializer.primitiveInstance;
            }
            if (cls == Long.TYPE) {
                return LongDeserializer.primitiveInstance;
            }
            if (cls == Double.TYPE) {
                return DoubleDeserializer.primitiveInstance;
            }
            if (cls == Character.TYPE) {
                return CharacterDeserializer.primitiveInstance;
            }
            if (cls == Byte.TYPE) {
                return ByteDeserializer.primitiveInstance;
            }
            if (cls == Short.TYPE) {
                return ShortDeserializer.primitiveInstance;
            }
            if (cls == Float.TYPE) {
                return FloatDeserializer.primitiveInstance;
            }
            if (cls == Void.TYPE) {
                return NullifyingDeserializer.instance;
            }
        } else {
            if (!KWHzl.contains(str)) {
                return null;
            }
            if (cls == Integer.class) {
                return IntegerDeserializer.wrapperInstance;
            }
            if (cls == Boolean.class) {
                return BooleanDeserializer.wrapperInstance;
            }
            if (cls == Long.class) {
                return LongDeserializer.wrapperInstance;
            }
            if (cls == Double.class) {
                return DoubleDeserializer.wrapperInstance;
            }
            if (cls == Character.class) {
                return CharacterDeserializer.wrapperInstance;
            }
            if (cls == Byte.class) {
                return ByteDeserializer.wrapperInstance;
            }
            if (cls == Short.class) {
                return ShortDeserializer.wrapperInstance;
            }
            if (cls == Float.class) {
                return FloatDeserializer.wrapperInstance;
            }
            if (cls == Number.class) {
                return NumberDeserializer.instance;
            }
            if (cls == BigDecimal.class) {
                return BigDecimalDeserializer.instance;
            }
            if (cls == BigInteger.class) {
                return BigIntegerDeserializer.instance;
            }
        }
        throw new IllegalArgumentException("Internal error: can't find deserializer for " + cls.getName());
    }

    public static abstract class PrimitiveOrWrapperDeserializer<T> extends StdScalarDeserializer<T> {
        private static final long serialVersionUID = 1;
        protected final T _emptyValue;
        protected final LogicalType _logicalType;
        protected final T _nullValue;
        protected final boolean _primitive;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC5548Vy
        public Object getEmptyValue(DeserializationContext deserializationContext) throws JsonMappingException {
            return this._emptyValue;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, o.AbstractC5548Vy
        public final LogicalType logicalType() {
            return this._logicalType;
        }

        public PrimitiveOrWrapperDeserializer(Class<T> cls, LogicalType logicalType, T t, T t2) {
            super((Class<?>) cls);
            this._logicalType = logicalType;
            this._nullValue = t;
            this._emptyValue = t2;
            this._primitive = cls.isPrimitive();
        }

        @Deprecated
        public PrimitiveOrWrapperDeserializer(Class<T> cls, T t, T t2) {
            this(cls, LogicalType.OtherScalar, t, t2);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, o.AbstractC5548Vy
        public AccessPattern getNullAccessPattern() {
            if (this._primitive) {
                return AccessPattern.DYNAMIC;
            }
            if (this._nullValue == null) {
                return AccessPattern.ALWAYS_NULL;
            }
            return AccessPattern.CONSTANT;
        }

        @Override // o.AbstractC5548Vy, o.InterfaceC5555Wf
        public final T getNullValue(DeserializationContext deserializationContext) throws JsonMappingException {
            if (this._primitive && deserializationContext.isEnabled(DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES)) {
                deserializationContext.reportInputMismatch(this, "Cannot map `null` into type %s (set DeserializationConfig.DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES to 'false' to allow)", C5619Yr.copydefault((Object) handledType()));
            }
            return this._nullValue;
        }
    }

    @VK
    public static final class BooleanDeserializer extends PrimitiveOrWrapperDeserializer<Boolean> {
        private static final long serialVersionUID = 1;
        static final BooleanDeserializer primitiveInstance = new BooleanDeserializer(Boolean.TYPE, Boolean.FALSE);
        static final BooleanDeserializer wrapperInstance = new BooleanDeserializer(Boolean.class, null);

        @Override // com.fasterxml.jackson.databind.deser.std.NumberDeserializers.PrimitiveOrWrapperDeserializer, o.AbstractC5548Vy
        public /* bridge */ /* synthetic */ Object getEmptyValue(DeserializationContext deserializationContext) throws JsonMappingException {
            return super.getEmptyValue(deserializationContext);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.NumberDeserializers.PrimitiveOrWrapperDeserializer, com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, o.AbstractC5548Vy
        public /* bridge */ /* synthetic */ AccessPattern getNullAccessPattern() {
            return super.getNullAccessPattern();
        }

        public BooleanDeserializer(Class<Boolean> cls, Boolean bool) {
            super(cls, LogicalType.Boolean, bool, Boolean.FALSE);
        }

        /* JADX DEBUG: Method merged with bridge method: deserialize(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;)Ljava/lang/Object; */
        @Override // o.AbstractC5548Vy
        public Boolean deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            JsonToken jsonTokenDjBIcL = jsonParser.djBIcL();
            if (jsonTokenDjBIcL == JsonToken.VALUE_TRUE) {
                return Boolean.TRUE;
            }
            if (jsonTokenDjBIcL == JsonToken.VALUE_FALSE) {
                return Boolean.FALSE;
            }
            if (this._primitive) {
                return Boolean.valueOf(_parseBooleanPrimitive(jsonParser, deserializationContext));
            }
            return _parseBoolean(jsonParser, deserializationContext, this._valueClass);
        }

        /* JADX DEBUG: Method merged with bridge method: deserializeWithType(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;Lo/Xv;)Ljava/lang/Object; */
        @Override // com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, com.fasterxml.jackson.databind.deser.std.StdDeserializer, o.AbstractC5548Vy
        public Boolean deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, AbstractC5597Xv abstractC5597Xv) throws IOException {
            JsonToken jsonTokenDjBIcL = jsonParser.djBIcL();
            if (jsonTokenDjBIcL == JsonToken.VALUE_TRUE) {
                return Boolean.TRUE;
            }
            if (jsonTokenDjBIcL == JsonToken.VALUE_FALSE) {
                return Boolean.FALSE;
            }
            if (this._primitive) {
                return Boolean.valueOf(_parseBooleanPrimitive(jsonParser, deserializationContext));
            }
            return _parseBoolean(jsonParser, deserializationContext, this._valueClass);
        }
    }

    @VK
    public static class ByteDeserializer extends PrimitiveOrWrapperDeserializer<Byte> {
        private static final long serialVersionUID = 1;
        static final ByteDeserializer primitiveInstance = new ByteDeserializer(Byte.TYPE, (byte) 0);
        static final ByteDeserializer wrapperInstance = new ByteDeserializer(Byte.class, null);

        @Override // com.fasterxml.jackson.databind.deser.std.NumberDeserializers.PrimitiveOrWrapperDeserializer, o.AbstractC5548Vy
        public /* bridge */ /* synthetic */ Object getEmptyValue(DeserializationContext deserializationContext) throws JsonMappingException {
            return super.getEmptyValue(deserializationContext);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.NumberDeserializers.PrimitiveOrWrapperDeserializer, com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, o.AbstractC5548Vy
        public /* bridge */ /* synthetic */ AccessPattern getNullAccessPattern() {
            return super.getNullAccessPattern();
        }

        public ByteDeserializer(Class<Byte> cls, Byte b) {
            super(cls, LogicalType.Integer, b, (byte) 0);
        }

        /* JADX DEBUG: Method merged with bridge method: deserialize(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;)Ljava/lang/Object; */
        @Override // o.AbstractC5548Vy
        public Byte deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            if (jsonParser.QUSxYX()) {
                return Byte.valueOf(jsonParser.AkhnZx());
            }
            if (this._primitive) {
                return Byte.valueOf(_parseBytePrimitive(jsonParser, deserializationContext));
            }
            return _parseByte(jsonParser, deserializationContext);
        }

        public Byte _parseByte(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            String strExtractScalarFromObject;
            int iValueOf = jsonParser.valueOf();
            if (iValueOf == 1) {
                strExtractScalarFromObject = deserializationContext.extractScalarFromObject(jsonParser, this, this._valueClass);
            } else {
                if (iValueOf == 3) {
                    return _deserializeFromArray(jsonParser, deserializationContext);
                }
                if (iValueOf == 11) {
                    return getNullValue(deserializationContext);
                }
                if (iValueOf != 6) {
                    if (iValueOf == 7) {
                        return Byte.valueOf(jsonParser.AkhnZx());
                    }
                    if (iValueOf == 8) {
                        CoercionAction coercionAction_checkFloatToIntCoercion = _checkFloatToIntCoercion(jsonParser, deserializationContext, this._valueClass);
                        if (coercionAction_checkFloatToIntCoercion == CoercionAction.AsNull) {
                            return getNullValue(deserializationContext);
                        }
                        if (coercionAction_checkFloatToIntCoercion == CoercionAction.AsEmpty) {
                            return (Byte) getEmptyValue(deserializationContext);
                        }
                        return Byte.valueOf(jsonParser.AkhnZx());
                    }
                    return (Byte) deserializationContext.handleUnexpectedToken(getValueType(deserializationContext), jsonParser);
                }
                strExtractScalarFromObject = jsonParser.zLjUOn();
            }
            CoercionAction coercionAction_checkFromStringCoercion = _checkFromStringCoercion(deserializationContext, strExtractScalarFromObject);
            if (coercionAction_checkFromStringCoercion == CoercionAction.AsNull) {
                return getNullValue(deserializationContext);
            }
            if (coercionAction_checkFromStringCoercion == CoercionAction.AsEmpty) {
                return (Byte) getEmptyValue(deserializationContext);
            }
            String strTrim = strExtractScalarFromObject.trim();
            if (_checkTextualNull(deserializationContext, strTrim)) {
                return getNullValue(deserializationContext);
            }
            try {
                int iEZpvd = C5522Uy.EZpvd(strTrim);
                if (_byteOverflow(iEZpvd)) {
                    return (Byte) deserializationContext.handleWeirdStringValue(this._valueClass, strTrim, "overflow, value cannot be represented as 8-bit value", new Object[0]);
                }
                return Byte.valueOf((byte) iEZpvd);
            } catch (IllegalArgumentException unused) {
                return (Byte) deserializationContext.handleWeirdStringValue(this._valueClass, strTrim, "not a valid Byte value", new Object[0]);
            }
        }
    }

    @VK
    public static class ShortDeserializer extends PrimitiveOrWrapperDeserializer<Short> {
        private static final long serialVersionUID = 1;
        static final ShortDeserializer primitiveInstance = new ShortDeserializer(Short.TYPE, 0);
        static final ShortDeserializer wrapperInstance = new ShortDeserializer(Short.class, null);

        @Override // com.fasterxml.jackson.databind.deser.std.NumberDeserializers.PrimitiveOrWrapperDeserializer, o.AbstractC5548Vy
        public /* bridge */ /* synthetic */ Object getEmptyValue(DeserializationContext deserializationContext) throws JsonMappingException {
            return super.getEmptyValue(deserializationContext);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.NumberDeserializers.PrimitiveOrWrapperDeserializer, com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, o.AbstractC5548Vy
        public /* bridge */ /* synthetic */ AccessPattern getNullAccessPattern() {
            return super.getNullAccessPattern();
        }

        public ShortDeserializer(Class<Short> cls, Short sh) {
            super(cls, LogicalType.Integer, sh, (short) 0);
        }

        /* JADX DEBUG: Method merged with bridge method: deserialize(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;)Ljava/lang/Object; */
        @Override // o.AbstractC5548Vy
        public Short deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            if (jsonParser.QUSxYX()) {
                return Short.valueOf(jsonParser.zsXlph());
            }
            if (this._primitive) {
                return Short.valueOf(_parseShortPrimitive(jsonParser, deserializationContext));
            }
            return _parseShort(jsonParser, deserializationContext);
        }

        public Short _parseShort(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            String strExtractScalarFromObject;
            int iValueOf = jsonParser.valueOf();
            if (iValueOf == 1) {
                strExtractScalarFromObject = deserializationContext.extractScalarFromObject(jsonParser, this, this._valueClass);
            } else {
                if (iValueOf == 3) {
                    return _deserializeFromArray(jsonParser, deserializationContext);
                }
                if (iValueOf == 11) {
                    return getNullValue(deserializationContext);
                }
                if (iValueOf != 6) {
                    if (iValueOf == 7) {
                        return Short.valueOf(jsonParser.zsXlph());
                    }
                    if (iValueOf == 8) {
                        CoercionAction coercionAction_checkFloatToIntCoercion = _checkFloatToIntCoercion(jsonParser, deserializationContext, this._valueClass);
                        if (coercionAction_checkFloatToIntCoercion == CoercionAction.AsNull) {
                            return getNullValue(deserializationContext);
                        }
                        if (coercionAction_checkFloatToIntCoercion == CoercionAction.AsEmpty) {
                            return (Short) getEmptyValue(deserializationContext);
                        }
                        return Short.valueOf(jsonParser.zsXlph());
                    }
                    return (Short) deserializationContext.handleUnexpectedToken(getValueType(deserializationContext), jsonParser);
                }
                strExtractScalarFromObject = jsonParser.zLjUOn();
            }
            CoercionAction coercionAction_checkFromStringCoercion = _checkFromStringCoercion(deserializationContext, strExtractScalarFromObject);
            if (coercionAction_checkFromStringCoercion == CoercionAction.AsNull) {
                return getNullValue(deserializationContext);
            }
            if (coercionAction_checkFromStringCoercion == CoercionAction.AsEmpty) {
                return (Short) getEmptyValue(deserializationContext);
            }
            String strTrim = strExtractScalarFromObject.trim();
            if (_checkTextualNull(deserializationContext, strTrim)) {
                return getNullValue(deserializationContext);
            }
            try {
                int iEZpvd = C5522Uy.EZpvd(strTrim);
                if (_shortOverflow(iEZpvd)) {
                    return (Short) deserializationContext.handleWeirdStringValue(this._valueClass, strTrim, "overflow, value cannot be represented as 16-bit value", new Object[0]);
                }
                return Short.valueOf((short) iEZpvd);
            } catch (IllegalArgumentException unused) {
                return (Short) deserializationContext.handleWeirdStringValue(this._valueClass, strTrim, "not a valid Short value", new Object[0]);
            }
        }
    }

    @VK
    public static class CharacterDeserializer extends PrimitiveOrWrapperDeserializer<Character> {
        private static final long serialVersionUID = 1;
        static final CharacterDeserializer primitiveInstance = new CharacterDeserializer(Character.TYPE, 0);
        static final CharacterDeserializer wrapperInstance = new CharacterDeserializer(Character.class, null);

        @Override // com.fasterxml.jackson.databind.deser.std.NumberDeserializers.PrimitiveOrWrapperDeserializer, o.AbstractC5548Vy
        public /* bridge */ /* synthetic */ Object getEmptyValue(DeserializationContext deserializationContext) throws JsonMappingException {
            return super.getEmptyValue(deserializationContext);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.NumberDeserializers.PrimitiveOrWrapperDeserializer, com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, o.AbstractC5548Vy
        public /* bridge */ /* synthetic */ AccessPattern getNullAccessPattern() {
            return super.getNullAccessPattern();
        }

        public CharacterDeserializer(Class<Character> cls, Character ch) {
            super(cls, LogicalType.Integer, ch, (char) 0);
        }

        /* JADX DEBUG: Method merged with bridge method: deserialize(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;)Ljava/lang/Object; */
        @Override // o.AbstractC5548Vy
        public Character deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            String strExtractScalarFromObject;
            int iValueOf = jsonParser.valueOf();
            if (iValueOf == 1) {
                strExtractScalarFromObject = deserializationContext.extractScalarFromObject(jsonParser, this, this._valueClass);
            } else {
                if (iValueOf == 3) {
                    return _deserializeFromArray(jsonParser, deserializationContext);
                }
                if (iValueOf == 11) {
                    if (this._primitive) {
                        _verifyNullForPrimitive(deserializationContext);
                    }
                    return getNullValue(deserializationContext);
                }
                if (iValueOf != 6) {
                    if (iValueOf == 7) {
                        CoercionAction coercionActionFindCoercionAction = deserializationContext.findCoercionAction(logicalType(), this._valueClass, CoercionInputShape.Integer);
                        int i = AnonymousClass1.AEQbTJ[coercionActionFindCoercionAction.ordinal()];
                        if (i == 1) {
                            _checkCoercionFail(deserializationContext, coercionActionFindCoercionAction, this._valueClass, jsonParser.hDKMBd(), "Integer value (" + jsonParser.zLjUOn() + ")");
                        } else if (i != 2) {
                            if (i == 3) {
                                return (Character) getEmptyValue(deserializationContext);
                            }
                            int fieldNames = jsonParser.getFieldNames();
                            if (fieldNames >= 0 && fieldNames <= 65535) {
                                return Character.valueOf((char) fieldNames);
                            }
                            return (Character) deserializationContext.handleWeirdNumberValue(handledType(), Integer.valueOf(fieldNames), "value outside valid Character range (0x0000 - 0xFFFF)", new Object[0]);
                        }
                        return getNullValue(deserializationContext);
                    }
                    return (Character) deserializationContext.handleUnexpectedToken(getValueType(deserializationContext), jsonParser);
                }
                strExtractScalarFromObject = jsonParser.zLjUOn();
            }
            if (strExtractScalarFromObject.length() == 1) {
                return Character.valueOf(strExtractScalarFromObject.charAt(0));
            }
            CoercionAction coercionAction_checkFromStringCoercion = _checkFromStringCoercion(deserializationContext, strExtractScalarFromObject);
            if (coercionAction_checkFromStringCoercion == CoercionAction.AsNull) {
                return getNullValue(deserializationContext);
            }
            if (coercionAction_checkFromStringCoercion == CoercionAction.AsEmpty) {
                return (Character) getEmptyValue(deserializationContext);
            }
            String strTrim = strExtractScalarFromObject.trim();
            if (_checkTextualNull(deserializationContext, strTrim)) {
                return getNullValue(deserializationContext);
            }
            return (Character) deserializationContext.handleWeirdStringValue(handledType(), strTrim, "Expected either Integer value code or 1-character String", new Object[0]);
        }
    }

    /* JADX INFO: renamed from: com.fasterxml.jackson.databind.deser.std.NumberDeserializers$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] AEQbTJ;

        static {
            int[] iArr = new int[CoercionAction.values().length];
            AEQbTJ = iArr;
            try {
                iArr[CoercionAction.Fail.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                AEQbTJ[CoercionAction.AsNull.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AEQbTJ[CoercionAction.AsEmpty.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @VK
    public static final class IntegerDeserializer extends PrimitiveOrWrapperDeserializer<Integer> {
        private static final long serialVersionUID = 1;
        static final IntegerDeserializer primitiveInstance = new IntegerDeserializer(Integer.TYPE, 0);
        static final IntegerDeserializer wrapperInstance = new IntegerDeserializer(Integer.class, null);

        @Override // o.AbstractC5548Vy
        public boolean isCachable() {
            return true;
        }

        @Override // com.fasterxml.jackson.databind.deser.std.NumberDeserializers.PrimitiveOrWrapperDeserializer, o.AbstractC5548Vy
        public /* bridge */ /* synthetic */ Object getEmptyValue(DeserializationContext deserializationContext) throws JsonMappingException {
            return super.getEmptyValue(deserializationContext);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.NumberDeserializers.PrimitiveOrWrapperDeserializer, com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, o.AbstractC5548Vy
        public /* bridge */ /* synthetic */ AccessPattern getNullAccessPattern() {
            return super.getNullAccessPattern();
        }

        public IntegerDeserializer(Class<Integer> cls, Integer num) {
            super(cls, LogicalType.Integer, num, 0);
        }

        /* JADX DEBUG: Method merged with bridge method: deserialize(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;)Ljava/lang/Object; */
        @Override // o.AbstractC5548Vy
        public Integer deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            if (jsonParser.QUSxYX()) {
                return Integer.valueOf(jsonParser.getFieldNames());
            }
            if (this._primitive) {
                return Integer.valueOf(_parseIntPrimitive(jsonParser, deserializationContext));
            }
            return _parseInteger(jsonParser, deserializationContext, Integer.class);
        }

        /* JADX DEBUG: Method merged with bridge method: deserializeWithType(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;Lo/Xv;)Ljava/lang/Object; */
        @Override // com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, com.fasterxml.jackson.databind.deser.std.StdDeserializer, o.AbstractC5548Vy
        public Integer deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, AbstractC5597Xv abstractC5597Xv) throws IOException {
            if (jsonParser.QUSxYX()) {
                return Integer.valueOf(jsonParser.getFieldNames());
            }
            if (this._primitive) {
                return Integer.valueOf(_parseIntPrimitive(jsonParser, deserializationContext));
            }
            return _parseInteger(jsonParser, deserializationContext, Integer.class);
        }
    }

    @VK
    public static final class LongDeserializer extends PrimitiveOrWrapperDeserializer<Long> {
        private static final long serialVersionUID = 1;
        static final LongDeserializer primitiveInstance = new LongDeserializer(Long.TYPE, 0L);
        static final LongDeserializer wrapperInstance = new LongDeserializer(Long.class, null);

        @Override // o.AbstractC5548Vy
        public boolean isCachable() {
            return true;
        }

        @Override // com.fasterxml.jackson.databind.deser.std.NumberDeserializers.PrimitiveOrWrapperDeserializer, o.AbstractC5548Vy
        public /* bridge */ /* synthetic */ Object getEmptyValue(DeserializationContext deserializationContext) throws JsonMappingException {
            return super.getEmptyValue(deserializationContext);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.NumberDeserializers.PrimitiveOrWrapperDeserializer, com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, o.AbstractC5548Vy
        public /* bridge */ /* synthetic */ AccessPattern getNullAccessPattern() {
            return super.getNullAccessPattern();
        }

        public LongDeserializer(Class<Long> cls, Long l) {
            super(cls, LogicalType.Integer, l, 0L);
        }

        /* JADX DEBUG: Method merged with bridge method: deserialize(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;)Ljava/lang/Object; */
        @Override // o.AbstractC5548Vy
        public Long deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            if (jsonParser.QUSxYX()) {
                return Long.valueOf(jsonParser.getNewProxyInstance());
            }
            if (this._primitive) {
                return Long.valueOf(_parseLongPrimitive(jsonParser, deserializationContext));
            }
            return _parseLong(jsonParser, deserializationContext, Long.class);
        }
    }

    @VK
    public static class FloatDeserializer extends PrimitiveOrWrapperDeserializer<Float> {
        private static final long serialVersionUID = 1;
        static final FloatDeserializer primitiveInstance = new FloatDeserializer(Float.TYPE, Float.valueOf(0.0f));
        static final FloatDeserializer wrapperInstance = new FloatDeserializer(Float.class, null);

        @Override // com.fasterxml.jackson.databind.deser.std.NumberDeserializers.PrimitiveOrWrapperDeserializer, o.AbstractC5548Vy
        public /* bridge */ /* synthetic */ Object getEmptyValue(DeserializationContext deserializationContext) throws JsonMappingException {
            return super.getEmptyValue(deserializationContext);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.NumberDeserializers.PrimitiveOrWrapperDeserializer, com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, o.AbstractC5548Vy
        public /* bridge */ /* synthetic */ AccessPattern getNullAccessPattern() {
            return super.getNullAccessPattern();
        }

        public FloatDeserializer(Class<Float> cls, Float f) {
            super(cls, LogicalType.Float, f, Float.valueOf(0.0f));
        }

        /* JADX DEBUG: Method merged with bridge method: deserialize(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;)Ljava/lang/Object; */
        @Override // o.AbstractC5548Vy
        public Float deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            if (jsonParser.copydefault(JsonToken.VALUE_NUMBER_FLOAT)) {
                return Float.valueOf(jsonParser.ejfBZ());
            }
            if (this._primitive) {
                return Float.valueOf(_parseFloatPrimitive(jsonParser, deserializationContext));
            }
            return _parseFloat(jsonParser, deserializationContext);
        }

        public final Float _parseFloat(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            String strExtractScalarFromObject;
            int iValueOf = jsonParser.valueOf();
            if (iValueOf == 1) {
                strExtractScalarFromObject = deserializationContext.extractScalarFromObject(jsonParser, this, this._valueClass);
            } else {
                if (iValueOf == 3) {
                    return _deserializeFromArray(jsonParser, deserializationContext);
                }
                if (iValueOf == 11) {
                    return getNullValue(deserializationContext);
                }
                if (iValueOf == 6) {
                    strExtractScalarFromObject = jsonParser.zLjUOn();
                } else {
                    if (iValueOf == 7) {
                        CoercionAction coercionAction_checkIntToFloatCoercion = _checkIntToFloatCoercion(jsonParser, deserializationContext, this._valueClass);
                        if (coercionAction_checkIntToFloatCoercion == CoercionAction.AsNull) {
                            return getNullValue(deserializationContext);
                        }
                        if (coercionAction_checkIntToFloatCoercion == CoercionAction.AsEmpty) {
                            return (Float) getEmptyValue(deserializationContext);
                        }
                    } else if (iValueOf != 8) {
                        return (Float) deserializationContext.handleUnexpectedToken(getValueType(deserializationContext), jsonParser);
                    }
                    return Float.valueOf(jsonParser.ejfBZ());
                }
            }
            Float f_checkFloatSpecialValue = _checkFloatSpecialValue(strExtractScalarFromObject);
            if (f_checkFloatSpecialValue != null) {
                return f_checkFloatSpecialValue;
            }
            CoercionAction coercionAction_checkFromStringCoercion = _checkFromStringCoercion(deserializationContext, strExtractScalarFromObject);
            if (coercionAction_checkFromStringCoercion == CoercionAction.AsNull) {
                return getNullValue(deserializationContext);
            }
            if (coercionAction_checkFromStringCoercion == CoercionAction.AsEmpty) {
                return (Float) getEmptyValue(deserializationContext);
            }
            String strTrim = strExtractScalarFromObject.trim();
            if (_checkTextualNull(deserializationContext, strTrim)) {
                return getNullValue(deserializationContext);
            }
            try {
                return Float.valueOf(C5522Uy.OLrzqt(strTrim, jsonParser.KWHzl(StreamReadFeature.USE_FAST_DOUBLE_PARSER)));
            } catch (IllegalArgumentException unused) {
                return (Float) deserializationContext.handleWeirdStringValue(this._valueClass, strTrim, "not a valid `Float` value", new Object[0]);
            }
        }
    }

    @VK
    public static class DoubleDeserializer extends PrimitiveOrWrapperDeserializer<Double> {
        private static final long serialVersionUID = 1;
        static final DoubleDeserializer primitiveInstance = new DoubleDeserializer(Double.TYPE, Double.valueOf(AudioStats.AUDIO_AMPLITUDE_NONE));
        static final DoubleDeserializer wrapperInstance = new DoubleDeserializer(Double.class, null);

        @Override // com.fasterxml.jackson.databind.deser.std.NumberDeserializers.PrimitiveOrWrapperDeserializer, o.AbstractC5548Vy
        public /* bridge */ /* synthetic */ Object getEmptyValue(DeserializationContext deserializationContext) throws JsonMappingException {
            return super.getEmptyValue(deserializationContext);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.NumberDeserializers.PrimitiveOrWrapperDeserializer, com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, o.AbstractC5548Vy
        public /* bridge */ /* synthetic */ AccessPattern getNullAccessPattern() {
            return super.getNullAccessPattern();
        }

        public DoubleDeserializer(Class<Double> cls, Double d) {
            super(cls, LogicalType.Float, d, Double.valueOf(AudioStats.AUDIO_AMPLITUDE_NONE));
        }

        /* JADX DEBUG: Method merged with bridge method: deserialize(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;)Ljava/lang/Object; */
        @Override // o.AbstractC5548Vy
        public Double deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            if (jsonParser.copydefault(JsonToken.VALUE_NUMBER_FLOAT)) {
                return Double.valueOf(jsonParser.fARcdN());
            }
            if (this._primitive) {
                return Double.valueOf(_parseDoublePrimitive(jsonParser, deserializationContext));
            }
            return _parseDouble(jsonParser, deserializationContext);
        }

        /* JADX DEBUG: Method merged with bridge method: deserializeWithType(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;Lo/Xv;)Ljava/lang/Object; */
        @Override // com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, com.fasterxml.jackson.databind.deser.std.StdDeserializer, o.AbstractC5548Vy
        public Double deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, AbstractC5597Xv abstractC5597Xv) throws IOException {
            if (jsonParser.copydefault(JsonToken.VALUE_NUMBER_FLOAT)) {
                return Double.valueOf(jsonParser.fARcdN());
            }
            if (this._primitive) {
                return Double.valueOf(_parseDoublePrimitive(jsonParser, deserializationContext));
            }
            return _parseDouble(jsonParser, deserializationContext);
        }

        public final Double _parseDouble(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            String strExtractScalarFromObject;
            int iValueOf = jsonParser.valueOf();
            if (iValueOf == 1) {
                strExtractScalarFromObject = deserializationContext.extractScalarFromObject(jsonParser, this, this._valueClass);
            } else {
                if (iValueOf == 3) {
                    return _deserializeFromArray(jsonParser, deserializationContext);
                }
                if (iValueOf == 11) {
                    return getNullValue(deserializationContext);
                }
                if (iValueOf == 6) {
                    strExtractScalarFromObject = jsonParser.zLjUOn();
                } else {
                    if (iValueOf == 7) {
                        CoercionAction coercionAction_checkIntToFloatCoercion = _checkIntToFloatCoercion(jsonParser, deserializationContext, this._valueClass);
                        if (coercionAction_checkIntToFloatCoercion == CoercionAction.AsNull) {
                            return getNullValue(deserializationContext);
                        }
                        if (coercionAction_checkIntToFloatCoercion == CoercionAction.AsEmpty) {
                            return (Double) getEmptyValue(deserializationContext);
                        }
                    } else if (iValueOf != 8) {
                        return (Double) deserializationContext.handleUnexpectedToken(getValueType(deserializationContext), jsonParser);
                    }
                    return Double.valueOf(jsonParser.fARcdN());
                }
            }
            Double d_checkDoubleSpecialValue = _checkDoubleSpecialValue(strExtractScalarFromObject);
            if (d_checkDoubleSpecialValue != null) {
                return d_checkDoubleSpecialValue;
            }
            CoercionAction coercionAction_checkFromStringCoercion = _checkFromStringCoercion(deserializationContext, strExtractScalarFromObject);
            if (coercionAction_checkFromStringCoercion == CoercionAction.AsNull) {
                return getNullValue(deserializationContext);
            }
            if (coercionAction_checkFromStringCoercion == CoercionAction.AsEmpty) {
                return (Double) getEmptyValue(deserializationContext);
            }
            String strTrim = strExtractScalarFromObject.trim();
            if (_checkTextualNull(deserializationContext, strTrim)) {
                return getNullValue(deserializationContext);
            }
            try {
                return Double.valueOf(StdDeserializer._parseDouble(strTrim, jsonParser.KWHzl(StreamReadFeature.USE_FAST_DOUBLE_PARSER)));
            } catch (IllegalArgumentException unused) {
                return (Double) deserializationContext.handleWeirdStringValue(this._valueClass, strTrim, "not a valid `Double` value", new Object[0]);
            }
        }
    }

    @VK
    public static class NumberDeserializer extends StdScalarDeserializer<Object> {
        public static final NumberDeserializer instance = new NumberDeserializer();

        public NumberDeserializer() {
            super((Class<?>) Number.class);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, o.AbstractC5548Vy
        public final LogicalType logicalType() {
            return LogicalType.Integer;
        }

        @Override // o.AbstractC5548Vy
        public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            String strExtractScalarFromObject;
            int iValueOf = jsonParser.valueOf();
            if (iValueOf == 1) {
                strExtractScalarFromObject = deserializationContext.extractScalarFromObject(jsonParser, this, this._valueClass);
            } else {
                if (iValueOf == 3) {
                    return _deserializeFromArray(jsonParser, deserializationContext);
                }
                if (iValueOf != 6) {
                    if (iValueOf == 7) {
                        if (deserializationContext.hasSomeOfFeatures(StdDeserializer.F_MASK_INT_COERCIONS)) {
                            return _coerceIntegral(jsonParser, deserializationContext);
                        }
                        return jsonParser.hDKMBd();
                    }
                    if (iValueOf == 8) {
                        if (deserializationContext.isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS) && !jsonParser.QfsBiF()) {
                            return jsonParser.fJNWhG();
                        }
                        return jsonParser.hDKMBd();
                    }
                    return deserializationContext.handleUnexpectedToken(getValueType(deserializationContext), jsonParser);
                }
                strExtractScalarFromObject = jsonParser.zLjUOn();
            }
            CoercionAction coercionAction_checkFromStringCoercion = _checkFromStringCoercion(deserializationContext, strExtractScalarFromObject);
            if (coercionAction_checkFromStringCoercion == CoercionAction.AsNull) {
                return getNullValue(deserializationContext);
            }
            if (coercionAction_checkFromStringCoercion == CoercionAction.AsEmpty) {
                return getEmptyValue(deserializationContext);
            }
            String strTrim = strExtractScalarFromObject.trim();
            if (_hasTextualNull(strTrim)) {
                return getNullValue(deserializationContext);
            }
            if (_isPosInf(strTrim)) {
                return Double.valueOf(Double.POSITIVE_INFINITY);
            }
            if (_isNegInf(strTrim)) {
                return Double.valueOf(Double.NEGATIVE_INFINITY);
            }
            if (_isNaN(strTrim)) {
                return Double.valueOf(Double.NaN);
            }
            try {
                if (!_isIntNumber(strTrim)) {
                    if (deserializationContext.isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS)) {
                        return C5522Uy.OLrzqt(strTrim);
                    }
                    return Double.valueOf(C5522Uy.KWHzl(strTrim, jsonParser.KWHzl(StreamReadFeature.USE_FAST_DOUBLE_PARSER)));
                }
                if (deserializationContext.isEnabled(DeserializationFeature.USE_BIG_INTEGER_FOR_INTS)) {
                    return C5522Uy.KWHzl(strTrim);
                }
                long jAYXKKw = C5522Uy.AYXKKw(strTrim);
                if (!deserializationContext.isEnabled(DeserializationFeature.USE_LONG_FOR_INTS) && jAYXKKw <= 2147483647L && jAYXKKw >= -2147483648L) {
                    return Integer.valueOf((int) jAYXKKw);
                }
                return Long.valueOf(jAYXKKw);
            } catch (IllegalArgumentException unused) {
                return deserializationContext.handleWeirdStringValue(this._valueClass, strTrim, "not a valid number", new Object[0]);
            }
        }

        @Override // com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, com.fasterxml.jackson.databind.deser.std.StdDeserializer, o.AbstractC5548Vy
        public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, AbstractC5597Xv abstractC5597Xv) throws IOException {
            int iValueOf = jsonParser.valueOf();
            if (iValueOf == 6 || iValueOf == 7 || iValueOf == 8) {
                return deserialize(jsonParser, deserializationContext);
            }
            return abstractC5597Xv.deserializeTypedFromScalar(jsonParser, deserializationContext);
        }
    }

    @VK
    public static class BigIntegerDeserializer extends StdScalarDeserializer<BigInteger> {
        public static final BigIntegerDeserializer instance = new BigIntegerDeserializer();

        public BigIntegerDeserializer() {
            super((Class<?>) BigInteger.class);
        }

        @Override // o.AbstractC5548Vy
        public Object getEmptyValue(DeserializationContext deserializationContext) {
            return BigInteger.ZERO;
        }

        @Override // com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, o.AbstractC5548Vy
        public final LogicalType logicalType() {
            return LogicalType.Integer;
        }

        /* JADX DEBUG: Method merged with bridge method: deserialize(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;)Ljava/lang/Object; */
        @Override // o.AbstractC5548Vy
        public BigInteger deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            String strExtractScalarFromObject;
            if (jsonParser.QUSxYX()) {
                return jsonParser.gEmmrt();
            }
            int iValueOf = jsonParser.valueOf();
            if (iValueOf == 1) {
                strExtractScalarFromObject = deserializationContext.extractScalarFromObject(jsonParser, this, this._valueClass);
            } else {
                if (iValueOf == 3) {
                    return _deserializeFromArray(jsonParser, deserializationContext);
                }
                if (iValueOf != 6) {
                    if (iValueOf == 8) {
                        CoercionAction coercionAction_checkFloatToIntCoercion = _checkFloatToIntCoercion(jsonParser, deserializationContext, this._valueClass);
                        if (coercionAction_checkFloatToIntCoercion == CoercionAction.AsNull) {
                            return getNullValue(deserializationContext);
                        }
                        if (coercionAction_checkFloatToIntCoercion == CoercionAction.AsEmpty) {
                            return (BigInteger) getEmptyValue(deserializationContext);
                        }
                        return jsonParser.fJNWhG().toBigInteger();
                    }
                    return (BigInteger) deserializationContext.handleUnexpectedToken(getValueType(deserializationContext), jsonParser);
                }
                strExtractScalarFromObject = jsonParser.zLjUOn();
            }
            CoercionAction coercionAction_checkFromStringCoercion = _checkFromStringCoercion(deserializationContext, strExtractScalarFromObject);
            if (coercionAction_checkFromStringCoercion == CoercionAction.AsNull) {
                return getNullValue(deserializationContext);
            }
            if (coercionAction_checkFromStringCoercion == CoercionAction.AsEmpty) {
                return (BigInteger) getEmptyValue(deserializationContext);
            }
            String strTrim = strExtractScalarFromObject.trim();
            if (_hasTextualNull(strTrim)) {
                return getNullValue(deserializationContext);
            }
            try {
                return C5522Uy.KWHzl(strTrim);
            } catch (IllegalArgumentException unused) {
                return (BigInteger) deserializationContext.handleWeirdStringValue(this._valueClass, strTrim, "not a valid representation", new Object[0]);
            }
        }
    }

    @VK
    public static class BigDecimalDeserializer extends StdScalarDeserializer<BigDecimal> {
        public static final BigDecimalDeserializer instance = new BigDecimalDeserializer();

        public BigDecimalDeserializer() {
            super((Class<?>) BigDecimal.class);
        }

        @Override // o.AbstractC5548Vy
        public Object getEmptyValue(DeserializationContext deserializationContext) {
            return BigDecimal.ZERO;
        }

        @Override // com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, o.AbstractC5548Vy
        public final LogicalType logicalType() {
            return LogicalType.Float;
        }

        /* JADX DEBUG: Method merged with bridge method: deserialize(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;)Ljava/lang/Object; */
        @Override // o.AbstractC5548Vy
        public BigDecimal deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            String strExtractScalarFromObject;
            int iValueOf = jsonParser.valueOf();
            if (iValueOf == 1) {
                strExtractScalarFromObject = deserializationContext.extractScalarFromObject(jsonParser, this, this._valueClass);
            } else {
                if (iValueOf == 3) {
                    return _deserializeFromArray(jsonParser, deserializationContext);
                }
                if (iValueOf != 6) {
                    if (iValueOf == 7) {
                        CoercionAction coercionAction_checkIntToFloatCoercion = _checkIntToFloatCoercion(jsonParser, deserializationContext, this._valueClass);
                        if (coercionAction_checkIntToFloatCoercion == CoercionAction.AsNull) {
                            return getNullValue(deserializationContext);
                        }
                        if (coercionAction_checkIntToFloatCoercion == CoercionAction.AsEmpty) {
                            return (BigDecimal) getEmptyValue(deserializationContext);
                        }
                    } else if (iValueOf != 8) {
                        return (BigDecimal) deserializationContext.handleUnexpectedToken(getValueType(deserializationContext), jsonParser);
                    }
                    return jsonParser.fJNWhG();
                }
                strExtractScalarFromObject = jsonParser.zLjUOn();
            }
            CoercionAction coercionAction_checkFromStringCoercion = _checkFromStringCoercion(deserializationContext, strExtractScalarFromObject);
            if (coercionAction_checkFromStringCoercion == CoercionAction.AsNull) {
                return getNullValue(deserializationContext);
            }
            if (coercionAction_checkFromStringCoercion == CoercionAction.AsEmpty) {
                return (BigDecimal) getEmptyValue(deserializationContext);
            }
            String strTrim = strExtractScalarFromObject.trim();
            if (_hasTextualNull(strTrim)) {
                return getNullValue(deserializationContext);
            }
            try {
                return C5522Uy.OLrzqt(strTrim);
            } catch (IllegalArgumentException unused) {
                return (BigDecimal) deserializationContext.handleWeirdStringValue(this._valueClass, strTrim, "not a valid representation", new Object[0]);
            }
        }
    }
}
