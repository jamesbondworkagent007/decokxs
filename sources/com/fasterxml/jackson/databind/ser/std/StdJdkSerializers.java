package com.fasterxml.jackson.databind.ser.std;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Type;
import java.net.URI;
import java.net.URL;
import java.util.Collection;
import java.util.Currency;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;
import o.InterfaceC5584Xi;
import o.VI;

/* JADX INFO: loaded from: classes21.dex */
public class StdJdkSerializers {
    public static Collection<Map.Entry<Class<?>, Object>> OLrzqt() {
        HashMap map = new HashMap();
        map.put(URL.class, new ToStringSerializer(URL.class));
        map.put(URI.class, new ToStringSerializer(URI.class));
        map.put(Currency.class, new ToStringSerializer(Currency.class));
        map.put(UUID.class, new UUIDSerializer());
        map.put(Pattern.class, new ToStringSerializer(Pattern.class));
        map.put(Locale.class, new ToStringSerializer(Locale.class));
        map.put(AtomicBoolean.class, AtomicBooleanSerializer.class);
        map.put(AtomicInteger.class, AtomicIntegerSerializer.class);
        map.put(AtomicLong.class, AtomicLongSerializer.class);
        map.put(File.class, FileSerializer.class);
        map.put(Class.class, ClassSerializer.class);
        NullSerializer nullSerializer = NullSerializer.instance;
        map.put(Void.class, nullSerializer);
        map.put(Void.TYPE, nullSerializer);
        return map.entrySet();
    }

    public static class AtomicBooleanSerializer extends StdScalarSerializer<AtomicBoolean> {
        public AtomicBooleanSerializer() {
            super(AtomicBoolean.class, false);
        }

        /* JADX DEBUG: Method merged with bridge method: serialize(Ljava/lang/Object;Lcom/fasterxml/jackson/core/JsonGenerator;Lo/VI;)V */
        @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, o.VD
        public void serialize(AtomicBoolean atomicBoolean, JsonGenerator jsonGenerator, VI vi) throws IOException {
            jsonGenerator.OLrzqt(atomicBoolean.get());
        }

        @Override // com.fasterxml.jackson.databind.ser.std.StdScalarSerializer, com.fasterxml.jackson.databind.ser.std.StdSerializer, o.InterfaceC5598Xw
        public JsonNode getSchema(VI vi, Type type) {
            return createSchemaNode(TypedValues.Custom.S_BOOLEAN, true);
        }

        @Override // com.fasterxml.jackson.databind.ser.std.StdScalarSerializer, com.fasterxml.jackson.databind.ser.std.StdSerializer, o.VD
        public void acceptJsonFormatVisitor(InterfaceC5584Xi interfaceC5584Xi, JavaType javaType) throws JsonMappingException {
            interfaceC5584Xi.OLrzqt(javaType);
        }
    }

    public static class AtomicIntegerSerializer extends StdScalarSerializer<AtomicInteger> {
        public AtomicIntegerSerializer() {
            super(AtomicInteger.class, false);
        }

        /* JADX DEBUG: Method merged with bridge method: serialize(Ljava/lang/Object;Lcom/fasterxml/jackson/core/JsonGenerator;Lo/VI;)V */
        @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, o.VD
        public void serialize(AtomicInteger atomicInteger, JsonGenerator jsonGenerator, VI vi) throws IOException {
            jsonGenerator.copydefault(atomicInteger.get());
        }

        @Override // com.fasterxml.jackson.databind.ser.std.StdScalarSerializer, com.fasterxml.jackson.databind.ser.std.StdSerializer, o.InterfaceC5598Xw
        public JsonNode getSchema(VI vi, Type type) {
            return createSchemaNode(TypedValues.Custom.S_INT, true);
        }

        @Override // com.fasterxml.jackson.databind.ser.std.StdScalarSerializer, com.fasterxml.jackson.databind.ser.std.StdSerializer, o.VD
        public void acceptJsonFormatVisitor(InterfaceC5584Xi interfaceC5584Xi, JavaType javaType) throws JsonMappingException {
            visitIntFormat(interfaceC5584Xi, javaType, JsonParser.NumberType.INT);
        }
    }

    public static class AtomicLongSerializer extends StdScalarSerializer<AtomicLong> {
        public AtomicLongSerializer() {
            super(AtomicLong.class, false);
        }

        /* JADX DEBUG: Method merged with bridge method: serialize(Ljava/lang/Object;Lcom/fasterxml/jackson/core/JsonGenerator;Lo/VI;)V */
        @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, o.VD
        public void serialize(AtomicLong atomicLong, JsonGenerator jsonGenerator, VI vi) throws IOException {
            jsonGenerator.EZpvd(atomicLong.get());
        }

        @Override // com.fasterxml.jackson.databind.ser.std.StdScalarSerializer, com.fasterxml.jackson.databind.ser.std.StdSerializer, o.InterfaceC5598Xw
        public JsonNode getSchema(VI vi, Type type) {
            return createSchemaNode(TypedValues.Custom.S_INT, true);
        }

        @Override // com.fasterxml.jackson.databind.ser.std.StdScalarSerializer, com.fasterxml.jackson.databind.ser.std.StdSerializer, o.VD
        public void acceptJsonFormatVisitor(InterfaceC5584Xi interfaceC5584Xi, JavaType javaType) throws JsonMappingException {
            visitIntFormat(interfaceC5584Xi, javaType, JsonParser.NumberType.LONG);
        }
    }
}
