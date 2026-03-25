package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.util.EnumValues;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;
import o.AbstractC5604Yc;
import o.C5619Yr;
import o.InterfaceC5584Xi;
import o.VD;
import o.VI;

/* JADX INFO: loaded from: classes21.dex */
public abstract class StdKeySerializers {
    public static final VD<Object> AEQbTJ = new StdKeySerializer();
    public static final VD<Object> KWHzl = new StringKeySerializer();

    public static VD<Object> EZpvd(SerializationConfig serializationConfig, Class<?> cls, boolean z) {
        if (cls == null || cls == Object.class) {
            return new Dynamic();
        }
        if (cls == String.class) {
            return KWHzl;
        }
        if (cls.isPrimitive()) {
            cls = C5619Yr.getFieldNames(cls);
        }
        if (cls == Integer.class) {
            return new Default(5, cls);
        }
        if (cls == Long.class) {
            return new Default(6, cls);
        }
        if (cls.isPrimitive() || Number.class.isAssignableFrom(cls)) {
            return new Default(8, cls);
        }
        if (cls == Class.class) {
            return new Default(3, cls);
        }
        if (Date.class.isAssignableFrom(cls)) {
            return new Default(1, cls);
        }
        if (Calendar.class.isAssignableFrom(cls)) {
            return new Default(2, cls);
        }
        if (cls == UUID.class) {
            return new Default(8, cls);
        }
        if (cls == byte[].class) {
            return new Default(7, cls);
        }
        if (z) {
            return new Default(8, cls);
        }
        return null;
    }

    public static VD<Object> copydefault(SerializationConfig serializationConfig, Class<?> cls) {
        if (cls != null) {
            if (cls == Enum.class) {
                return new Dynamic();
            }
            if (C5619Yr.AkhnZx(cls)) {
                return EnumKeySerializer.construct(cls, EnumValues.constructFromName(serializationConfig, cls));
            }
        }
        return new Default(8, cls);
    }

    public static class Default extends StdSerializer<Object> {
        static final int TYPE_BYTE_ARRAY = 7;
        static final int TYPE_CALENDAR = 2;
        static final int TYPE_CLASS = 3;
        static final int TYPE_DATE = 1;
        static final int TYPE_ENUM = 4;
        static final int TYPE_INTEGER = 5;
        static final int TYPE_LONG = 6;
        static final int TYPE_TO_STRING = 8;
        protected final int _typeId;

        public Default(int i, Class<?> cls) {
            super(cls, false);
            this._typeId = i;
        }

        @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, o.VD
        public void serialize(Object obj, JsonGenerator jsonGenerator, VI vi) throws IOException {
            String strName;
            switch (this._typeId) {
                case 1:
                    vi.defaultSerializeDateKey((Date) obj, jsonGenerator);
                    break;
                case 2:
                    vi.defaultSerializeDateKey(((Calendar) obj).getTimeInMillis(), jsonGenerator);
                    break;
                case 3:
                    jsonGenerator.KWHzl(((Class) obj).getName());
                    break;
                case 4:
                    if (vi.isEnabled(SerializationFeature.WRITE_ENUMS_USING_TO_STRING)) {
                        strName = obj.toString();
                    } else {
                        Enum r3 = (Enum) obj;
                        if (vi.isEnabled(SerializationFeature.WRITE_ENUM_KEYS_USING_INDEX)) {
                            strName = String.valueOf(r3.ordinal());
                        } else {
                            strName = r3.name();
                        }
                    }
                    jsonGenerator.KWHzl(strName);
                    break;
                case 5:
                case 6:
                    jsonGenerator.AEQbTJ(((Number) obj).longValue());
                    break;
                case 7:
                    jsonGenerator.KWHzl(vi.getConfig().getBase64Variant().encode((byte[]) obj));
                    break;
                default:
                    jsonGenerator.KWHzl(obj.toString());
                    break;
            }
        }
    }

    public static class Dynamic extends StdSerializer<Object> {
        protected transient AbstractC5604Yc _dynamicSerializers;

        public Dynamic() {
            super(String.class, false);
            this._dynamicSerializers = AbstractC5604Yc.copydefault();
        }

        public Object readResolve() {
            this._dynamicSerializers = AbstractC5604Yc.copydefault();
            return this;
        }

        @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, o.VD
        public void serialize(Object obj, JsonGenerator jsonGenerator, VI vi) throws IOException {
            Class<?> cls = obj.getClass();
            AbstractC5604Yc abstractC5604Yc = this._dynamicSerializers;
            VD<Object> vdAEQbTJ = abstractC5604Yc.AEQbTJ(cls);
            if (vdAEQbTJ == null) {
                vdAEQbTJ = _findAndAddDynamic(abstractC5604Yc, cls, vi);
            }
            vdAEQbTJ.serialize(obj, jsonGenerator, vi);
        }

        @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, o.VD
        public void acceptJsonFormatVisitor(InterfaceC5584Xi interfaceC5584Xi, JavaType javaType) throws JsonMappingException {
            visitStringFormat(interfaceC5584Xi, javaType);
        }

        public VD<Object> _findAndAddDynamic(AbstractC5604Yc abstractC5604Yc, Class<?> cls, VI vi) throws JsonMappingException {
            if (cls == Object.class) {
                Default r4 = new Default(8, cls);
                this._dynamicSerializers = abstractC5604Yc.AEQbTJ(cls, r4);
                return r4;
            }
            AbstractC5604Yc.TaskDescription taskDescriptionCopydefault = abstractC5604Yc.copydefault(cls, vi, null);
            AbstractC5604Yc abstractC5604Yc2 = taskDescriptionCopydefault.EZpvd;
            if (abstractC5604Yc != abstractC5604Yc2) {
                this._dynamicSerializers = abstractC5604Yc2;
            }
            return taskDescriptionCopydefault.KWHzl;
        }
    }

    public static class StringKeySerializer extends StdSerializer<Object> {
        public StringKeySerializer() {
            super(String.class, false);
        }

        @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, o.VD
        public void serialize(Object obj, JsonGenerator jsonGenerator, VI vi) throws IOException {
            jsonGenerator.KWHzl((String) obj);
        }
    }

    public static class EnumKeySerializer extends StdSerializer<Object> {
        protected final EnumValues _values;

        public EnumKeySerializer(Class<?> cls, EnumValues enumValues) {
            super(cls, false);
            this._values = enumValues;
        }

        public static EnumKeySerializer construct(Class<?> cls, EnumValues enumValues) {
            return new EnumKeySerializer(cls, enumValues);
        }

        @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, o.VD
        public void serialize(Object obj, JsonGenerator jsonGenerator, VI vi) throws IOException {
            if (vi.isEnabled(SerializationFeature.WRITE_ENUMS_USING_TO_STRING)) {
                jsonGenerator.KWHzl(obj.toString());
                return;
            }
            Enum<?> r2 = (Enum) obj;
            if (vi.isEnabled(SerializationFeature.WRITE_ENUM_KEYS_USING_INDEX)) {
                jsonGenerator.KWHzl(String.valueOf(r2.ordinal()));
            } else {
                jsonGenerator.copydefault(this._values.serializedValueFor(r2));
            }
        }
    }
}
