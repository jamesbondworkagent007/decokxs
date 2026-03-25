package com.fasterxml.jackson.databind.ext;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.ser.std.CalendarSerializer;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import java.io.IOException;
import java.util.Calendar;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import o.AbstractC5549Vz;
import o.AbstractC5601Xz;
import o.InterfaceC5584Xi;
import o.InterfaceC5605Yd;
import o.VD;
import o.VI;
import o.XT;

/* JADX INFO: loaded from: classes21.dex */
public class CoreXMLSerializers extends InterfaceC5605Yd.StateListAnimator {
    @Override // o.InterfaceC5605Yd.StateListAnimator, o.InterfaceC5605Yd
    public VD<?> findSerializer(SerializationConfig serializationConfig, JavaType javaType, AbstractC5549Vz abstractC5549Vz) {
        Class<?> rawClass = javaType.getRawClass();
        if (Duration.class.isAssignableFrom(rawClass) || QName.class.isAssignableFrom(rawClass)) {
            return ToStringSerializer.instance;
        }
        if (XMLGregorianCalendar.class.isAssignableFrom(rawClass)) {
            return XMLGregorianCalendarSerializer.instance;
        }
        return null;
    }

    public static class XMLGregorianCalendarSerializer extends StdSerializer<XMLGregorianCalendar> implements XT {
        static final XMLGregorianCalendarSerializer instance = new XMLGregorianCalendarSerializer();
        final VD<Object> _delegate;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.VD
        public VD<?> getDelegatee() {
            return this._delegate;
        }

        public XMLGregorianCalendarSerializer() {
            this(CalendarSerializer.instance);
        }

        public XMLGregorianCalendarSerializer(VD<?> vd) {
            super(XMLGregorianCalendar.class);
            this._delegate = vd;
        }

        /* JADX DEBUG: Method merged with bridge method: isEmpty(Lo/VI;Ljava/lang/Object;)Z */
        @Override // o.VD
        public boolean isEmpty(VI vi, XMLGregorianCalendar xMLGregorianCalendar) {
            return this._delegate.isEmpty(vi, _convert(xMLGregorianCalendar));
        }

        /* JADX DEBUG: Method merged with bridge method: serialize(Ljava/lang/Object;Lcom/fasterxml/jackson/core/JsonGenerator;Lo/VI;)V */
        @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, o.VD
        public void serialize(XMLGregorianCalendar xMLGregorianCalendar, JsonGenerator jsonGenerator, VI vi) throws IOException {
            this._delegate.serialize(_convert(xMLGregorianCalendar), jsonGenerator, vi);
        }

        /* JADX DEBUG: Method merged with bridge method: serializeWithType(Ljava/lang/Object;Lcom/fasterxml/jackson/core/JsonGenerator;Lo/VI;Lo/Xz;)V */
        @Override // o.VD
        public void serializeWithType(XMLGregorianCalendar xMLGregorianCalendar, JsonGenerator jsonGenerator, VI vi, AbstractC5601Xz abstractC5601Xz) throws IOException {
            WritableTypeId writableTypeIdAEQbTJ = abstractC5601Xz.AEQbTJ(jsonGenerator, abstractC5601Xz.copydefault(xMLGregorianCalendar, XMLGregorianCalendar.class, JsonToken.VALUE_STRING));
            serialize(xMLGregorianCalendar, jsonGenerator, vi);
            abstractC5601Xz.copydefault(jsonGenerator, writableTypeIdAEQbTJ);
        }

        @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, o.VD
        public void acceptJsonFormatVisitor(InterfaceC5584Xi interfaceC5584Xi, JavaType javaType) throws JsonMappingException {
            this._delegate.acceptJsonFormatVisitor(interfaceC5584Xi, null);
        }

        @Override // o.XT
        public VD<?> createContextual(VI vi, BeanProperty beanProperty) throws JsonMappingException {
            VD<?> vdHandlePrimaryContextualization = vi.handlePrimaryContextualization(this._delegate, beanProperty);
            return vdHandlePrimaryContextualization != this._delegate ? new XMLGregorianCalendarSerializer(vdHandlePrimaryContextualization) : this;
        }

        public Calendar _convert(XMLGregorianCalendar xMLGregorianCalendar) {
            if (xMLGregorianCalendar == null) {
                return null;
            }
            return xMLGregorianCalendar.toGregorianCalendar();
        }
    }
}
