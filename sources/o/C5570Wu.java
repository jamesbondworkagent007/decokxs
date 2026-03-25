package o;

import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.std.AtomicBooleanDeserializer;
import com.fasterxml.jackson.databind.deser.std.AtomicIntegerDeserializer;
import com.fasterxml.jackson.databind.deser.std.AtomicLongDeserializer;
import com.fasterxml.jackson.databind.deser.std.ByteBufferDeserializer;
import com.fasterxml.jackson.databind.deser.std.FromStringDeserializer;
import com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer;
import com.fasterxml.jackson.databind.deser.std.StackTraceElementDeserializer;
import com.fasterxml.jackson.databind.deser.std.UUIDDeserializer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: o.Wu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C5570Wu {
    public static final java.util.HashSet<java.lang.String> EZpvd = new java.util.HashSet<>();

    static {
        java.lang.Class[] clsArr = {UUID.class, AtomicBoolean.class, AtomicInteger.class, AtomicLong.class, java.lang.StackTraceElement.class, java.nio.ByteBuffer.class, java.lang.Void.class};
        for (int i = 0; i < 7; i++) {
            EZpvd.add(clsArr[i].getName());
        }
        for (java.lang.Class<?> cls : FromStringDeserializer.types()) {
            EZpvd.add(cls.getName());
        }
    }

    public static AbstractC5548Vy<?> copydefault(DeserializationContext deserializationContext, java.lang.Class<?> cls, java.lang.String str) throws JsonMappingException {
        if (!EZpvd.contains(str)) {
            return null;
        }
        FromStringDeserializer<?> fromStringDeserializerFindDeserializer = FromStringDeserializer.findDeserializer(cls);
        if (fromStringDeserializerFindDeserializer != null) {
            return fromStringDeserializerFindDeserializer;
        }
        if (cls == UUID.class) {
            return new UUIDDeserializer();
        }
        if (cls == java.lang.StackTraceElement.class) {
            return StackTraceElementDeserializer.construct(deserializationContext);
        }
        if (cls == AtomicBoolean.class) {
            return new AtomicBooleanDeserializer();
        }
        if (cls == AtomicInteger.class) {
            return new AtomicIntegerDeserializer();
        }
        if (cls == AtomicLong.class) {
            return new AtomicLongDeserializer();
        }
        if (cls == java.nio.ByteBuffer.class) {
            return new ByteBufferDeserializer();
        }
        if (cls == java.lang.Void.class) {
            return NullifyingDeserializer.instance;
        }
        return null;
    }

    public static boolean copydefault(java.lang.Class<?> cls) {
        return EZpvd.contains(cls.getName());
    }
}
