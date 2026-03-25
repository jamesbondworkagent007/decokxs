package com.fasterxml.jackson.databind.ser.std;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.DataInputModuleModel;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.HashMap;
import o.AbstractC5601Xz;
import o.InterfaceC5584Xi;
import o.VD;
import o.VI;
import o.VK;

/* JADX INFO: loaded from: classes21.dex */
public class StdArraySerializers {
    public static final HashMap<String, VD<?>> EZpvd;

    static {
        HashMap<String, VD<?>> map = new HashMap<>();
        EZpvd = map;
        map.put(boolean[].class.getName(), new BooleanArraySerializer());
        map.put(byte[].class.getName(), new ByteArraySerializer());
        map.put(char[].class.getName(), new CharArraySerializer());
        map.put(short[].class.getName(), new ShortArraySerializer());
        map.put(int[].class.getName(), new IntArraySerializer());
        map.put(long[].class.getName(), new LongArraySerializer());
        map.put(float[].class.getName(), new FloatArraySerializer());
        map.put(double[].class.getName(), new DoubleArraySerializer());
    }

    public static VD<?> OLrzqt(Class<?> cls) {
        return EZpvd.get(cls.getName());
    }

    public static abstract class TypedPrimitiveArraySerializer<T> extends ArraySerializerBase<T> {
        @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
        public final ContainerSerializer<?> _withValueTypeSerializer(AbstractC5601Xz abstractC5601Xz) {
            return this;
        }

        public TypedPrimitiveArraySerializer(Class<T> cls) {
            super(cls);
        }

        public TypedPrimitiveArraySerializer(TypedPrimitiveArraySerializer<T> typedPrimitiveArraySerializer, BeanProperty beanProperty, Boolean bool) {
            super(typedPrimitiveArraySerializer, beanProperty, bool);
        }
    }

    @VK
    public static class BooleanArraySerializer extends ArraySerializerBase<boolean[]> {
        private static final JavaType VALUE_TYPE = TypeFactory.defaultInstance().uncheckedSimpleType(Boolean.class);

        @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
        public ContainerSerializer<?> _withValueTypeSerializer(AbstractC5601Xz abstractC5601Xz) {
            return this;
        }

        @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
        public VD<?> getContentSerializer() {
            return null;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
        public JavaType getContentType() {
            return VALUE_TYPE;
        }

        public BooleanArraySerializer() {
            super(boolean[].class);
        }

        public BooleanArraySerializer(BooleanArraySerializer booleanArraySerializer, BeanProperty beanProperty, Boolean bool) {
            super(booleanArraySerializer, beanProperty, bool);
        }

        @Override // com.fasterxml.jackson.databind.ser.std.ArraySerializerBase
        public VD<?> _withResolved(BeanProperty beanProperty, Boolean bool) {
            return new BooleanArraySerializer(this, beanProperty, bool);
        }

        /* JADX DEBUG: Method merged with bridge method: isEmpty(Lo/VI;Ljava/lang/Object;)Z */
        @Override // o.VD
        public boolean isEmpty(VI vi, boolean[] zArr) {
            return zArr.length == 0;
        }

        /* JADX DEBUG: Method merged with bridge method: hasSingleElement(Ljava/lang/Object;)Z */
        @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
        public boolean hasSingleElement(boolean[] zArr) {
            return zArr.length == 1;
        }

        /* JADX DEBUG: Method merged with bridge method: serialize(Ljava/lang/Object;Lcom/fasterxml/jackson/core/JsonGenerator;Lo/VI;)V */
        @Override // com.fasterxml.jackson.databind.ser.std.ArraySerializerBase, com.fasterxml.jackson.databind.ser.std.StdSerializer, o.VD
        public final void serialize(boolean[] zArr, JsonGenerator jsonGenerator, VI vi) throws IOException {
            int length = zArr.length;
            if (length == 1 && _shouldUnwrapSingle(vi)) {
                serializeContents(zArr, jsonGenerator, vi);
                return;
            }
            jsonGenerator.AEQbTJ(zArr, length);
            serializeContents(zArr, jsonGenerator, vi);
            jsonGenerator.fetchVPNInfo();
        }

        /* JADX DEBUG: Method merged with bridge method: serializeContents(Ljava/lang/Object;Lcom/fasterxml/jackson/core/JsonGenerator;Lo/VI;)V */
        @Override // com.fasterxml.jackson.databind.ser.std.ArraySerializerBase
        public void serializeContents(boolean[] zArr, JsonGenerator jsonGenerator, VI vi) throws IOException {
            for (boolean z : zArr) {
                jsonGenerator.OLrzqt(z);
            }
        }

        @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, o.InterfaceC5598Xw
        public JsonNode getSchema(VI vi, Type type) {
            ObjectNode objectNodeCreateSchemaNode = createSchemaNode("array", true);
            objectNodeCreateSchemaNode.set("items", createSchemaNode(TypedValues.Custom.S_BOOLEAN));
            return objectNodeCreateSchemaNode;
        }

        @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, o.VD
        public void acceptJsonFormatVisitor(InterfaceC5584Xi interfaceC5584Xi, JavaType javaType) throws JsonMappingException {
            visitArrayFormat(interfaceC5584Xi, javaType, JsonFormatTypes.BOOLEAN);
        }
    }

    @VK
    public static class ShortArraySerializer extends TypedPrimitiveArraySerializer<short[]> {
        private static final JavaType VALUE_TYPE = TypeFactory.defaultInstance().uncheckedSimpleType(Short.TYPE);

        @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
        public VD<?> getContentSerializer() {
            return null;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
        public JavaType getContentType() {
            return VALUE_TYPE;
        }

        public ShortArraySerializer() {
            super(short[].class);
        }

        public ShortArraySerializer(ShortArraySerializer shortArraySerializer, BeanProperty beanProperty, Boolean bool) {
            super(shortArraySerializer, beanProperty, bool);
        }

        @Override // com.fasterxml.jackson.databind.ser.std.ArraySerializerBase
        public VD<?> _withResolved(BeanProperty beanProperty, Boolean bool) {
            return new ShortArraySerializer(this, beanProperty, bool);
        }

        /* JADX DEBUG: Method merged with bridge method: isEmpty(Lo/VI;Ljava/lang/Object;)Z */
        @Override // o.VD
        public boolean isEmpty(VI vi, short[] sArr) {
            return sArr.length == 0;
        }

        /* JADX DEBUG: Method merged with bridge method: hasSingleElement(Ljava/lang/Object;)Z */
        @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
        public boolean hasSingleElement(short[] sArr) {
            return sArr.length == 1;
        }

        /* JADX DEBUG: Method merged with bridge method: serialize(Ljava/lang/Object;Lcom/fasterxml/jackson/core/JsonGenerator;Lo/VI;)V */
        @Override // com.fasterxml.jackson.databind.ser.std.ArraySerializerBase, com.fasterxml.jackson.databind.ser.std.StdSerializer, o.VD
        public final void serialize(short[] sArr, JsonGenerator jsonGenerator, VI vi) throws IOException {
            int length = sArr.length;
            if (length == 1 && _shouldUnwrapSingle(vi)) {
                serializeContents(sArr, jsonGenerator, vi);
                return;
            }
            jsonGenerator.AEQbTJ(sArr, length);
            serializeContents(sArr, jsonGenerator, vi);
            jsonGenerator.fetchVPNInfo();
        }

        /* JADX DEBUG: Method merged with bridge method: serializeContents(Ljava/lang/Object;Lcom/fasterxml/jackson/core/JsonGenerator;Lo/VI;)V */
        @Override // com.fasterxml.jackson.databind.ser.std.ArraySerializerBase
        public void serializeContents(short[] sArr, JsonGenerator jsonGenerator, VI vi) throws IOException {
            for (short s : sArr) {
                jsonGenerator.copydefault(s);
            }
        }

        @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, o.InterfaceC5598Xw
        public JsonNode getSchema(VI vi, Type type) {
            return createSchemaNode("array", true).set("items", createSchemaNode(TypedValues.Custom.S_INT));
        }

        @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, o.VD
        public void acceptJsonFormatVisitor(InterfaceC5584Xi interfaceC5584Xi, JavaType javaType) throws JsonMappingException {
            visitArrayFormat(interfaceC5584Xi, javaType, JsonFormatTypes.INTEGER);
        }
    }

    @VK
    public static class CharArraySerializer extends StdSerializer<char[]> {
        public CharArraySerializer() {
            super(char[].class);
        }

        /* JADX DEBUG: Method merged with bridge method: isEmpty(Lo/VI;Ljava/lang/Object;)Z */
        @Override // o.VD
        public boolean isEmpty(VI vi, char[] cArr) {
            return cArr.length == 0;
        }

        /* JADX DEBUG: Method merged with bridge method: serialize(Ljava/lang/Object;Lcom/fasterxml/jackson/core/JsonGenerator;Lo/VI;)V */
        @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, o.VD
        public void serialize(char[] cArr, JsonGenerator jsonGenerator, VI vi) throws IOException {
            if (vi.isEnabled(SerializationFeature.WRITE_CHAR_ARRAYS_AS_JSON_ARRAYS)) {
                jsonGenerator.AEQbTJ(cArr, cArr.length);
                _writeArrayContents(jsonGenerator, cArr);
                jsonGenerator.fetchVPNInfo();
                return;
            }
            jsonGenerator.KWHzl(cArr, 0, cArr.length);
        }

        /* JADX DEBUG: Method merged with bridge method: serializeWithType(Ljava/lang/Object;Lcom/fasterxml/jackson/core/JsonGenerator;Lo/VI;Lo/Xz;)V */
        @Override // o.VD
        public void serializeWithType(char[] cArr, JsonGenerator jsonGenerator, VI vi, AbstractC5601Xz abstractC5601Xz) throws IOException {
            WritableTypeId writableTypeIdAEQbTJ;
            if (vi.isEnabled(SerializationFeature.WRITE_CHAR_ARRAYS_AS_JSON_ARRAYS)) {
                writableTypeIdAEQbTJ = abstractC5601Xz.AEQbTJ(jsonGenerator, abstractC5601Xz.AEQbTJ(cArr, JsonToken.START_ARRAY));
                _writeArrayContents(jsonGenerator, cArr);
            } else {
                writableTypeIdAEQbTJ = abstractC5601Xz.AEQbTJ(jsonGenerator, abstractC5601Xz.AEQbTJ(cArr, JsonToken.VALUE_STRING));
                jsonGenerator.KWHzl(cArr, 0, cArr.length);
            }
            abstractC5601Xz.copydefault(jsonGenerator, writableTypeIdAEQbTJ);
        }

        private final void _writeArrayContents(JsonGenerator jsonGenerator, char[] cArr) throws IOException {
            int length = cArr.length;
            for (int i = 0; i < length; i++) {
                jsonGenerator.KWHzl(cArr, i, 1);
            }
        }

        @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, o.InterfaceC5598Xw
        public JsonNode getSchema(VI vi, Type type) {
            ObjectNode objectNodeCreateSchemaNode = createSchemaNode("array", true);
            ObjectNode objectNodeCreateSchemaNode2 = createSchemaNode("string");
            objectNodeCreateSchemaNode2.put("type", "string");
            return objectNodeCreateSchemaNode.set("items", objectNodeCreateSchemaNode2);
        }

        @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, o.VD
        public void acceptJsonFormatVisitor(InterfaceC5584Xi interfaceC5584Xi, JavaType javaType) throws JsonMappingException {
            visitArrayFormat(interfaceC5584Xi, javaType, JsonFormatTypes.STRING);
        }
    }

    @VK
    public static class IntArraySerializer extends ArraySerializerBase<int[]> {
        private static final JavaType VALUE_TYPE = TypeFactory.defaultInstance().uncheckedSimpleType(Integer.TYPE);

        @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
        public ContainerSerializer<?> _withValueTypeSerializer(AbstractC5601Xz abstractC5601Xz) {
            return this;
        }

        @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
        public VD<?> getContentSerializer() {
            return null;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
        public JavaType getContentType() {
            return VALUE_TYPE;
        }

        public IntArraySerializer() {
            super(int[].class);
        }

        public IntArraySerializer(IntArraySerializer intArraySerializer, BeanProperty beanProperty, Boolean bool) {
            super(intArraySerializer, beanProperty, bool);
        }

        @Override // com.fasterxml.jackson.databind.ser.std.ArraySerializerBase
        public VD<?> _withResolved(BeanProperty beanProperty, Boolean bool) {
            return new IntArraySerializer(this, beanProperty, bool);
        }

        /* JADX DEBUG: Method merged with bridge method: isEmpty(Lo/VI;Ljava/lang/Object;)Z */
        @Override // o.VD
        public boolean isEmpty(VI vi, int[] iArr) {
            return iArr.length == 0;
        }

        /* JADX DEBUG: Method merged with bridge method: hasSingleElement(Ljava/lang/Object;)Z */
        @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
        public boolean hasSingleElement(int[] iArr) {
            return iArr.length == 1;
        }

        /* JADX DEBUG: Method merged with bridge method: serialize(Ljava/lang/Object;Lcom/fasterxml/jackson/core/JsonGenerator;Lo/VI;)V */
        @Override // com.fasterxml.jackson.databind.ser.std.ArraySerializerBase, com.fasterxml.jackson.databind.ser.std.StdSerializer, o.VD
        public final void serialize(int[] iArr, JsonGenerator jsonGenerator, VI vi) throws IOException {
            if (iArr.length == 1 && _shouldUnwrapSingle(vi)) {
                serializeContents(iArr, jsonGenerator, vi);
            } else {
                jsonGenerator.KWHzl(iArr, 0, iArr.length);
            }
        }

        /* JADX DEBUG: Method merged with bridge method: serializeContents(Ljava/lang/Object;Lcom/fasterxml/jackson/core/JsonGenerator;Lo/VI;)V */
        @Override // com.fasterxml.jackson.databind.ser.std.ArraySerializerBase
        public void serializeContents(int[] iArr, JsonGenerator jsonGenerator, VI vi) throws IOException {
            for (int i : iArr) {
                jsonGenerator.copydefault(i);
            }
        }

        @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, o.InterfaceC5598Xw
        public JsonNode getSchema(VI vi, Type type) {
            return createSchemaNode("array", true).set("items", createSchemaNode(TypedValues.Custom.S_INT));
        }

        @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, o.VD
        public void acceptJsonFormatVisitor(InterfaceC5584Xi interfaceC5584Xi, JavaType javaType) throws JsonMappingException {
            visitArrayFormat(interfaceC5584Xi, javaType, JsonFormatTypes.INTEGER);
        }
    }

    @VK
    public static class LongArraySerializer extends TypedPrimitiveArraySerializer<long[]> {
        private static final JavaType VALUE_TYPE = TypeFactory.defaultInstance().uncheckedSimpleType(Long.TYPE);

        @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
        public VD<?> getContentSerializer() {
            return null;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
        public JavaType getContentType() {
            return VALUE_TYPE;
        }

        public LongArraySerializer() {
            super(long[].class);
        }

        public LongArraySerializer(LongArraySerializer longArraySerializer, BeanProperty beanProperty, Boolean bool) {
            super(longArraySerializer, beanProperty, bool);
        }

        @Override // com.fasterxml.jackson.databind.ser.std.ArraySerializerBase
        public VD<?> _withResolved(BeanProperty beanProperty, Boolean bool) {
            return new LongArraySerializer(this, beanProperty, bool);
        }

        /* JADX DEBUG: Method merged with bridge method: isEmpty(Lo/VI;Ljava/lang/Object;)Z */
        @Override // o.VD
        public boolean isEmpty(VI vi, long[] jArr) {
            return jArr.length == 0;
        }

        /* JADX DEBUG: Method merged with bridge method: hasSingleElement(Ljava/lang/Object;)Z */
        @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
        public boolean hasSingleElement(long[] jArr) {
            return jArr.length == 1;
        }

        /* JADX DEBUG: Method merged with bridge method: serialize(Ljava/lang/Object;Lcom/fasterxml/jackson/core/JsonGenerator;Lo/VI;)V */
        @Override // com.fasterxml.jackson.databind.ser.std.ArraySerializerBase, com.fasterxml.jackson.databind.ser.std.StdSerializer, o.VD
        public final void serialize(long[] jArr, JsonGenerator jsonGenerator, VI vi) throws IOException {
            if (jArr.length == 1 && _shouldUnwrapSingle(vi)) {
                serializeContents(jArr, jsonGenerator, vi);
            } else {
                jsonGenerator.OLrzqt(jArr, 0, jArr.length);
            }
        }

        /* JADX DEBUG: Method merged with bridge method: serializeContents(Ljava/lang/Object;Lcom/fasterxml/jackson/core/JsonGenerator;Lo/VI;)V */
        @Override // com.fasterxml.jackson.databind.ser.std.ArraySerializerBase
        public void serializeContents(long[] jArr, JsonGenerator jsonGenerator, VI vi) throws IOException {
            for (long j : jArr) {
                jsonGenerator.EZpvd(j);
            }
        }

        @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, o.InterfaceC5598Xw
        public JsonNode getSchema(VI vi, Type type) {
            return createSchemaNode("array", true).set("items", createSchemaNode(DataInputModuleModel.DataInputItem.INPUT_TYPE_NUMBER, true));
        }

        @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, o.VD
        public void acceptJsonFormatVisitor(InterfaceC5584Xi interfaceC5584Xi, JavaType javaType) throws JsonMappingException {
            visitArrayFormat(interfaceC5584Xi, javaType, JsonFormatTypes.NUMBER);
        }
    }

    @VK
    public static class FloatArraySerializer extends TypedPrimitiveArraySerializer<float[]> {
        private static final JavaType VALUE_TYPE = TypeFactory.defaultInstance().uncheckedSimpleType(Float.TYPE);

        @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
        public VD<?> getContentSerializer() {
            return null;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
        public JavaType getContentType() {
            return VALUE_TYPE;
        }

        public FloatArraySerializer() {
            super(float[].class);
        }

        public FloatArraySerializer(FloatArraySerializer floatArraySerializer, BeanProperty beanProperty, Boolean bool) {
            super(floatArraySerializer, beanProperty, bool);
        }

        @Override // com.fasterxml.jackson.databind.ser.std.ArraySerializerBase
        public VD<?> _withResolved(BeanProperty beanProperty, Boolean bool) {
            return new FloatArraySerializer(this, beanProperty, bool);
        }

        /* JADX DEBUG: Method merged with bridge method: isEmpty(Lo/VI;Ljava/lang/Object;)Z */
        @Override // o.VD
        public boolean isEmpty(VI vi, float[] fArr) {
            return fArr.length == 0;
        }

        /* JADX DEBUG: Method merged with bridge method: hasSingleElement(Ljava/lang/Object;)Z */
        @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
        public boolean hasSingleElement(float[] fArr) {
            return fArr.length == 1;
        }

        /* JADX DEBUG: Method merged with bridge method: serialize(Ljava/lang/Object;Lcom/fasterxml/jackson/core/JsonGenerator;Lo/VI;)V */
        @Override // com.fasterxml.jackson.databind.ser.std.ArraySerializerBase, com.fasterxml.jackson.databind.ser.std.StdSerializer, o.VD
        public final void serialize(float[] fArr, JsonGenerator jsonGenerator, VI vi) throws IOException {
            int length = fArr.length;
            if (length == 1 && _shouldUnwrapSingle(vi)) {
                serializeContents(fArr, jsonGenerator, vi);
                return;
            }
            jsonGenerator.AEQbTJ(fArr, length);
            serializeContents(fArr, jsonGenerator, vi);
            jsonGenerator.fetchVPNInfo();
        }

        /* JADX DEBUG: Method merged with bridge method: serializeContents(Ljava/lang/Object;Lcom/fasterxml/jackson/core/JsonGenerator;Lo/VI;)V */
        @Override // com.fasterxml.jackson.databind.ser.std.ArraySerializerBase
        public void serializeContents(float[] fArr, JsonGenerator jsonGenerator, VI vi) throws IOException {
            for (float f : fArr) {
                jsonGenerator.AEQbTJ(f);
            }
        }

        @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, o.InterfaceC5598Xw
        public JsonNode getSchema(VI vi, Type type) {
            return createSchemaNode("array", true).set("items", createSchemaNode(DataInputModuleModel.DataInputItem.INPUT_TYPE_NUMBER));
        }

        @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, o.VD
        public void acceptJsonFormatVisitor(InterfaceC5584Xi interfaceC5584Xi, JavaType javaType) throws JsonMappingException {
            visitArrayFormat(interfaceC5584Xi, javaType, JsonFormatTypes.NUMBER);
        }
    }

    @VK
    public static class DoubleArraySerializer extends ArraySerializerBase<double[]> {
        private static final JavaType VALUE_TYPE = TypeFactory.defaultInstance().uncheckedSimpleType(Double.TYPE);

        @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
        public ContainerSerializer<?> _withValueTypeSerializer(AbstractC5601Xz abstractC5601Xz) {
            return this;
        }

        @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
        public VD<?> getContentSerializer() {
            return null;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
        public JavaType getContentType() {
            return VALUE_TYPE;
        }

        public DoubleArraySerializer() {
            super(double[].class);
        }

        public DoubleArraySerializer(DoubleArraySerializer doubleArraySerializer, BeanProperty beanProperty, Boolean bool) {
            super(doubleArraySerializer, beanProperty, bool);
        }

        @Override // com.fasterxml.jackson.databind.ser.std.ArraySerializerBase
        public VD<?> _withResolved(BeanProperty beanProperty, Boolean bool) {
            return new DoubleArraySerializer(this, beanProperty, bool);
        }

        /* JADX DEBUG: Method merged with bridge method: isEmpty(Lo/VI;Ljava/lang/Object;)Z */
        @Override // o.VD
        public boolean isEmpty(VI vi, double[] dArr) {
            return dArr.length == 0;
        }

        /* JADX DEBUG: Method merged with bridge method: hasSingleElement(Ljava/lang/Object;)Z */
        @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
        public boolean hasSingleElement(double[] dArr) {
            return dArr.length == 1;
        }

        /* JADX DEBUG: Method merged with bridge method: serialize(Ljava/lang/Object;Lcom/fasterxml/jackson/core/JsonGenerator;Lo/VI;)V */
        @Override // com.fasterxml.jackson.databind.ser.std.ArraySerializerBase, com.fasterxml.jackson.databind.ser.std.StdSerializer, o.VD
        public final void serialize(double[] dArr, JsonGenerator jsonGenerator, VI vi) throws IOException {
            if (dArr.length == 1 && _shouldUnwrapSingle(vi)) {
                serializeContents(dArr, jsonGenerator, vi);
            } else {
                jsonGenerator.KWHzl(dArr, 0, dArr.length);
            }
        }

        /* JADX DEBUG: Method merged with bridge method: serializeContents(Ljava/lang/Object;Lcom/fasterxml/jackson/core/JsonGenerator;Lo/VI;)V */
        @Override // com.fasterxml.jackson.databind.ser.std.ArraySerializerBase
        public void serializeContents(double[] dArr, JsonGenerator jsonGenerator, VI vi) throws IOException {
            for (double d : dArr) {
                jsonGenerator.KWHzl(d);
            }
        }

        @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, o.InterfaceC5598Xw
        public JsonNode getSchema(VI vi, Type type) {
            return createSchemaNode("array", true).set("items", createSchemaNode(DataInputModuleModel.DataInputItem.INPUT_TYPE_NUMBER));
        }

        @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, o.VD
        public void acceptJsonFormatVisitor(InterfaceC5584Xi interfaceC5584Xi, JavaType javaType) throws JsonMappingException {
            visitArrayFormat(interfaceC5584Xi, javaType, JsonFormatTypes.NUMBER);
        }
    }
}
