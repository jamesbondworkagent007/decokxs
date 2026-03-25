package com.fasterxml.jackson.databind.ser.std;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.DataInputModuleModel;
import java.io.IOException;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.util.Map;
import o.AbstractC5601Xz;
import o.InterfaceC5584Xi;
import o.UB;
import o.VD;
import o.VI;
import o.VK;
import o.XT;

/* JADX INFO: loaded from: classes21.dex */
public class NumberSerializers {
    public static void KWHzl(Map<String, VD<?>> map) {
        map.put(Integer.class.getName(), new IntegerSerializer(Integer.class));
        Class cls = Integer.TYPE;
        map.put(cls.getName(), new IntegerSerializer(cls));
        map.put(Long.class.getName(), new LongSerializer(Long.class));
        Class cls2 = Long.TYPE;
        map.put(cls2.getName(), new LongSerializer(cls2));
        String name = Byte.class.getName();
        IntLikeSerializer intLikeSerializer = IntLikeSerializer.instance;
        map.put(name, intLikeSerializer);
        map.put(Byte.TYPE.getName(), intLikeSerializer);
        String name2 = Short.class.getName();
        ShortSerializer shortSerializer = ShortSerializer.instance;
        map.put(name2, shortSerializer);
        map.put(Short.TYPE.getName(), shortSerializer);
        map.put(Double.class.getName(), new DoubleSerializer(Double.class));
        Class cls3 = Double.TYPE;
        map.put(cls3.getName(), new DoubleSerializer(cls3));
        String name3 = Float.class.getName();
        FloatSerializer floatSerializer = FloatSerializer.instance;
        map.put(name3, floatSerializer);
        map.put(Float.TYPE.getName(), floatSerializer);
    }

    public static abstract class Base<T> extends StdScalarSerializer<T> implements XT {
        protected final boolean _isInt;
        protected final JsonParser.NumberType _numberType;
        protected final String _schemaType;

        public Base(Class<?> cls, JsonParser.NumberType numberType, String str) {
            super(cls, false);
            this._numberType = numberType;
            this._schemaType = str;
            this._isInt = numberType == JsonParser.NumberType.INT || numberType == JsonParser.NumberType.LONG || numberType == JsonParser.NumberType.BIG_INTEGER;
        }

        @Override // com.fasterxml.jackson.databind.ser.std.StdScalarSerializer, com.fasterxml.jackson.databind.ser.std.StdSerializer, o.InterfaceC5598Xw
        public JsonNode getSchema(VI vi, Type type) {
            return createSchemaNode(this._schemaType, true);
        }

        @Override // com.fasterxml.jackson.databind.ser.std.StdScalarSerializer, com.fasterxml.jackson.databind.ser.std.StdSerializer, o.VD
        public void acceptJsonFormatVisitor(InterfaceC5584Xi interfaceC5584Xi, JavaType javaType) throws JsonMappingException {
            if (this._isInt) {
                visitIntFormat(interfaceC5584Xi, javaType, this._numberType);
            } else {
                visitFloatFormat(interfaceC5584Xi, javaType, this._numberType);
            }
        }

        @Override // o.XT
        public VD<?> createContextual(VI vi, BeanProperty beanProperty) throws JsonMappingException {
            JsonFormat.Value valueFindFormatOverrides = findFormatOverrides(vi, beanProperty, handledType());
            if (valueFindFormatOverrides == null || AnonymousClass5.AEQbTJ[valueFindFormatOverrides.getShape().ordinal()] != 1) {
                return this;
            }
            if (handledType() == BigDecimal.class) {
                return NumberSerializer.bigDecimalAsStringSerializer();
            }
            return ToStringSerializer.instance;
        }
    }

    /* JADX INFO: renamed from: com.fasterxml.jackson.databind.ser.std.NumberSerializers$5, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass5 {
        public static final /* synthetic */ int[] AEQbTJ;

        static {
            int[] iArr = new int[JsonFormat.Shape.values().length];
            AEQbTJ = iArr;
            try {
                iArr[JsonFormat.Shape.STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    @VK
    public static class ShortSerializer extends Base<Object> {
        static final ShortSerializer instance = new ShortSerializer();

        public ShortSerializer() {
            super(Short.class, JsonParser.NumberType.INT, DataInputModuleModel.DataInputItem.INPUT_TYPE_NUMBER);
        }

        @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, o.VD
        public void serialize(Object obj, JsonGenerator jsonGenerator, VI vi) throws IOException {
            jsonGenerator.OLrzqt(((Short) obj).shortValue());
        }
    }

    @VK
    public static class IntegerSerializer extends Base<Object> {
        public IntegerSerializer(Class<?> cls) {
            super(cls, JsonParser.NumberType.INT, TypedValues.Custom.S_INT);
        }

        @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, o.VD
        public void serialize(Object obj, JsonGenerator jsonGenerator, VI vi) throws IOException {
            jsonGenerator.copydefault(((Integer) obj).intValue());
        }

        @Override // com.fasterxml.jackson.databind.ser.std.StdScalarSerializer, o.VD
        public void serializeWithType(Object obj, JsonGenerator jsonGenerator, VI vi, AbstractC5601Xz abstractC5601Xz) throws IOException {
            serialize(obj, jsonGenerator, vi);
        }
    }

    @VK
    public static class IntLikeSerializer extends Base<Object> {
        static final IntLikeSerializer instance = new IntLikeSerializer();

        public IntLikeSerializer() {
            super(Number.class, JsonParser.NumberType.INT, TypedValues.Custom.S_INT);
        }

        @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, o.VD
        public void serialize(Object obj, JsonGenerator jsonGenerator, VI vi) throws IOException {
            jsonGenerator.copydefault(((Number) obj).intValue());
        }
    }

    @VK
    public static class LongSerializer extends Base<Object> {
        public LongSerializer(Class<?> cls) {
            super(cls, JsonParser.NumberType.LONG, DataInputModuleModel.DataInputItem.INPUT_TYPE_NUMBER);
        }

        @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, o.VD
        public void serialize(Object obj, JsonGenerator jsonGenerator, VI vi) throws IOException {
            jsonGenerator.EZpvd(((Long) obj).longValue());
        }
    }

    @VK
    public static class FloatSerializer extends Base<Object> {
        static final FloatSerializer instance = new FloatSerializer();

        public FloatSerializer() {
            super(Float.class, JsonParser.NumberType.FLOAT, DataInputModuleModel.DataInputItem.INPUT_TYPE_NUMBER);
        }

        @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, o.VD
        public void serialize(Object obj, JsonGenerator jsonGenerator, VI vi) throws IOException {
            jsonGenerator.AEQbTJ(((Float) obj).floatValue());
        }
    }

    @VK
    public static class DoubleSerializer extends Base<Object> {
        public DoubleSerializer(Class<?> cls) {
            super(cls, JsonParser.NumberType.DOUBLE, DataInputModuleModel.DataInputItem.INPUT_TYPE_NUMBER);
        }

        @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, o.VD
        public void serialize(Object obj, JsonGenerator jsonGenerator, VI vi) throws IOException {
            jsonGenerator.KWHzl(((Double) obj).doubleValue());
        }

        @Override // com.fasterxml.jackson.databind.ser.std.StdScalarSerializer, o.VD
        public void serializeWithType(Object obj, JsonGenerator jsonGenerator, VI vi, AbstractC5601Xz abstractC5601Xz) throws IOException {
            Double d = (Double) obj;
            if (UB.KWHzl(d.doubleValue())) {
                WritableTypeId writableTypeIdAEQbTJ = abstractC5601Xz.AEQbTJ(jsonGenerator, abstractC5601Xz.AEQbTJ(obj, JsonToken.VALUE_NUMBER_FLOAT));
                jsonGenerator.KWHzl(d.doubleValue());
                abstractC5601Xz.copydefault(jsonGenerator, writableTypeIdAEQbTJ);
                return;
            }
            jsonGenerator.KWHzl(d.doubleValue());
        }

        @Deprecated
        public static boolean notFinite(double d) {
            return UB.KWHzl(d);
        }
    }
}
