package com.fasterxml.jackson.databind.ser.std;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.DataInputModuleModel;
import java.io.IOException;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import o.InterfaceC5584Xi;
import o.VD;
import o.VI;
import o.VK;
import o.XT;

/* JADX INFO: loaded from: classes21.dex */
@VK
public class NumberSerializer extends StdScalarSerializer<Number> implements XT {
    protected static final int MAX_BIG_DECIMAL_SCALE = 9999;
    public static final NumberSerializer instance = new NumberSerializer(Number.class);
    protected final boolean _isInt;

    public NumberSerializer(Class<? extends Number> cls) {
        super(cls, false);
        this._isInt = cls == BigInteger.class;
    }

    @Override // o.XT
    public VD<?> createContextual(VI vi, BeanProperty beanProperty) throws JsonMappingException {
        JsonFormat.Value valueFindFormatOverrides = findFormatOverrides(vi, beanProperty, handledType());
        if (valueFindFormatOverrides == null || AnonymousClass2.KWHzl[valueFindFormatOverrides.getShape().ordinal()] != 1) {
            return this;
        }
        if (handledType() == BigDecimal.class) {
            return bigDecimalAsStringSerializer();
        }
        return ToStringSerializer.instance;
    }

    /* JADX INFO: renamed from: com.fasterxml.jackson.databind.ser.std.NumberSerializer$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {
        public static final /* synthetic */ int[] KWHzl;

        static {
            int[] iArr = new int[JsonFormat.Shape.values().length];
            KWHzl = iArr;
            try {
                iArr[JsonFormat.Shape.STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Ljava/lang/Object;Lcom/fasterxml/jackson/core/JsonGenerator;Lo/VI;)V */
    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, o.VD
    public void serialize(Number number, JsonGenerator jsonGenerator, VI vi) throws IOException {
        if (number instanceof BigDecimal) {
            jsonGenerator.OLrzqt((BigDecimal) number);
            return;
        }
        if (number instanceof BigInteger) {
            jsonGenerator.KWHzl((BigInteger) number);
            return;
        }
        if (number instanceof Long) {
            jsonGenerator.EZpvd(number.longValue());
            return;
        }
        if (number instanceof Double) {
            jsonGenerator.KWHzl(number.doubleValue());
            return;
        }
        if (number instanceof Float) {
            jsonGenerator.AEQbTJ(number.floatValue());
        } else if ((number instanceof Integer) || (number instanceof Byte) || (number instanceof Short)) {
            jsonGenerator.copydefault(number.intValue());
        } else {
            jsonGenerator.EZpvd(number.toString());
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdScalarSerializer, com.fasterxml.jackson.databind.ser.std.StdSerializer, o.InterfaceC5598Xw
    public JsonNode getSchema(VI vi, Type type) {
        return createSchemaNode(this._isInt ? TypedValues.Custom.S_INT : DataInputModuleModel.DataInputItem.INPUT_TYPE_NUMBER, true);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdScalarSerializer, com.fasterxml.jackson.databind.ser.std.StdSerializer, o.VD
    public void acceptJsonFormatVisitor(InterfaceC5584Xi interfaceC5584Xi, JavaType javaType) throws JsonMappingException {
        if (this._isInt) {
            visitIntFormat(interfaceC5584Xi, javaType, JsonParser.NumberType.BIG_INTEGER);
        } else if (handledType() == BigDecimal.class) {
            visitFloatFormat(interfaceC5584Xi, javaType, JsonParser.NumberType.BIG_DECIMAL);
        } else {
            interfaceC5584Xi.AYXKKw(javaType);
        }
    }

    public static VD<?> bigDecimalAsStringSerializer() {
        return BigDecimalAsStringSerializer.BD_INSTANCE;
    }

    public static final class BigDecimalAsStringSerializer extends ToStringSerializerBase {
        static final BigDecimalAsStringSerializer BD_INSTANCE = new BigDecimalAsStringSerializer();

        @Override // com.fasterxml.jackson.databind.ser.std.ToStringSerializerBase, o.VD
        public boolean isEmpty(VI vi, Object obj) {
            return false;
        }

        public BigDecimalAsStringSerializer() {
            super(BigDecimal.class);
        }

        @Override // com.fasterxml.jackson.databind.ser.std.ToStringSerializerBase, com.fasterxml.jackson.databind.ser.std.StdSerializer, o.VD
        public void serialize(Object obj, JsonGenerator jsonGenerator, VI vi) throws IOException {
            String string;
            if (jsonGenerator.OLrzqt(JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN)) {
                BigDecimal bigDecimal = (BigDecimal) obj;
                if (!_verifyBigDecimalRange(jsonGenerator, bigDecimal)) {
                    vi.reportMappingProblem(String.format("Attempt to write plain `java.math.BigDecimal` (see JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN) with illegal scale (%d): needs to be between [-%d, %d]", Integer.valueOf(bigDecimal.scale()), Integer.valueOf(NumberSerializer.MAX_BIG_DECIMAL_SCALE), Integer.valueOf(NumberSerializer.MAX_BIG_DECIMAL_SCALE)), new Object[0]);
                }
                string = bigDecimal.toPlainString();
            } else {
                string = obj.toString();
            }
            jsonGenerator.AhwBna(string);
        }

        @Override // com.fasterxml.jackson.databind.ser.std.ToStringSerializerBase
        public String valueToString(Object obj) {
            throw new IllegalStateException();
        }

        public boolean _verifyBigDecimalRange(JsonGenerator jsonGenerator, BigDecimal bigDecimal) throws IOException {
            int iScale = bigDecimal.scale();
            return iScale >= -9999 && iScale <= NumberSerializer.MAX_BIG_DECIMAL_SCALE;
        }
    }
}
