package com.fasterxml.jackson.databind.ext;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.std.FromStringDeserializer;
import java.io.IOException;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import o.AbstractC5548Vy;
import o.AbstractC5549Vz;
import o.InterfaceC5559Wj;

/* JADX INFO: loaded from: classes21.dex */
public class CoreXMLDeserializers extends InterfaceC5559Wj.ActionBar {
    public static final DatatypeFactory AEQbTJ;

    static {
        try {
            AEQbTJ = DatatypeFactory.newInstance();
        } catch (DatatypeConfigurationException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // o.InterfaceC5559Wj.ActionBar, o.InterfaceC5559Wj
    public AbstractC5548Vy<?> findBeanDeserializer(JavaType javaType, DeserializationConfig deserializationConfig, AbstractC5549Vz abstractC5549Vz) {
        Class<?> rawClass = javaType.getRawClass();
        if (rawClass == QName.class) {
            return new Std(rawClass, 3);
        }
        if (rawClass == XMLGregorianCalendar.class) {
            return new Std(rawClass, 2);
        }
        if (rawClass == Duration.class) {
            return new Std(rawClass, 1);
        }
        return null;
    }

    public static class Std extends FromStringDeserializer<Object> {
        private static final long serialVersionUID = 1;
        protected final int _kind;

        public Std(Class<?> cls, int i) {
            super(cls);
            this._kind = i;
        }

        @Override // com.fasterxml.jackson.databind.deser.std.FromStringDeserializer, o.AbstractC5548Vy
        public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            if (this._kind == 2 && jsonParser.copydefault(JsonToken.VALUE_NUMBER_INT)) {
                return _gregorianFromDate(deserializationContext, _parseDate(jsonParser, deserializationContext));
            }
            return super.deserialize(jsonParser, deserializationContext);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.FromStringDeserializer
        public Object _deserialize(String str, DeserializationContext deserializationContext) throws IOException {
            int i = this._kind;
            if (i == 1) {
                return CoreXMLDeserializers.AEQbTJ.newDuration(str);
            }
            if (i == 2) {
                try {
                    return _gregorianFromDate(deserializationContext, _parseDate(str, deserializationContext));
                } catch (JsonMappingException unused) {
                    return CoreXMLDeserializers.AEQbTJ.newXMLGregorianCalendar(str);
                }
            }
            if (i == 3) {
                return QName.valueOf(str);
            }
            throw new IllegalStateException();
        }

        public XMLGregorianCalendar _gregorianFromDate(DeserializationContext deserializationContext, Date date) {
            if (date == null) {
                return null;
            }
            GregorianCalendar gregorianCalendar = new GregorianCalendar();
            gregorianCalendar.setTime(date);
            TimeZone timeZone = deserializationContext.getTimeZone();
            if (timeZone != null) {
                gregorianCalendar.setTimeZone(timeZone);
            }
            return CoreXMLDeserializers.AEQbTJ.newXMLGregorianCalendar(gregorianCalendar);
        }
    }
}
