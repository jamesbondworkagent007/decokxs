package com.fasterxml.jackson.databind.ser.std;

import androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormat;
import com.fasterxml.jackson.databind.util.StdDateFormat;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.DataInputModuleModel;
import java.io.IOException;
import java.lang.reflect.Type;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;
import o.InterfaceC5584Xi;
import o.VD;
import o.VI;
import o.XT;

/* JADX INFO: loaded from: classes21.dex */
public abstract class DateTimeSerializerBase<T> extends StdScalarSerializer<T> implements XT {
    protected final DateFormat _customFormat;
    protected final AtomicReference<DateFormat> _reusedCustomFormat;
    protected final Boolean _useTimestamp;

    public abstract long _timestamp(T t);

    @Override // o.VD
    public boolean isEmpty(VI vi, T t) {
        return false;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, o.VD
    public abstract void serialize(T t, JsonGenerator jsonGenerator, VI vi) throws IOException;

    public abstract DateTimeSerializerBase<T> withFormat(Boolean bool, DateFormat dateFormat);

    public DateTimeSerializerBase(Class<T> cls, Boolean bool, DateFormat dateFormat) {
        super(cls);
        this._useTimestamp = bool;
        this._customFormat = dateFormat;
        this._reusedCustomFormat = dateFormat == null ? null : new AtomicReference<>();
    }

    @Override // o.XT
    public VD<?> createContextual(VI vi, BeanProperty beanProperty) throws JsonMappingException {
        SimpleDateFormat simpleDateFormat;
        Locale locale;
        JsonFormat.Value valueFindFormatOverrides = findFormatOverrides(vi, beanProperty, handledType());
        if (valueFindFormatOverrides == null) {
            return this;
        }
        JsonFormat.Shape shape = valueFindFormatOverrides.getShape();
        if (shape.isNumeric()) {
            return withFormat(Boolean.TRUE, null);
        }
        if (valueFindFormatOverrides.hasPattern()) {
            if (valueFindFormatOverrides.hasLocale()) {
                locale = valueFindFormatOverrides.getLocale();
            } else {
                locale = vi.getLocale();
            }
            SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat(valueFindFormatOverrides.getPattern(), locale);
            simpleDateFormat2.setTimeZone(valueFindFormatOverrides.hasTimeZone() ? valueFindFormatOverrides.getTimeZone() : vi.getTimeZone());
            return withFormat(Boolean.FALSE, simpleDateFormat2);
        }
        boolean zHasLocale = valueFindFormatOverrides.hasLocale();
        boolean zHasTimeZone = valueFindFormatOverrides.hasTimeZone();
        boolean z = shape == JsonFormat.Shape.STRING;
        if (!zHasLocale && !zHasTimeZone && !z) {
            return this;
        }
        DateFormat dateFormat = vi.getConfig().getDateFormat();
        if (dateFormat instanceof StdDateFormat) {
            StdDateFormat stdDateFormatWithTimeZone = (StdDateFormat) dateFormat;
            if (valueFindFormatOverrides.hasLocale()) {
                stdDateFormatWithTimeZone = stdDateFormatWithTimeZone.withLocale(valueFindFormatOverrides.getLocale());
            }
            if (valueFindFormatOverrides.hasTimeZone()) {
                stdDateFormatWithTimeZone = stdDateFormatWithTimeZone.withTimeZone(valueFindFormatOverrides.getTimeZone());
            }
            return withFormat(Boolean.FALSE, stdDateFormatWithTimeZone);
        }
        if (!(dateFormat instanceof SimpleDateFormat)) {
            vi.reportBadDefinition((Class<?>) handledType(), String.format("Configured `DateFormat` (%s) not a `SimpleDateFormat`; cannot configure `Locale` or `TimeZone`", dateFormat.getClass().getName()));
        }
        SimpleDateFormat simpleDateFormat3 = (SimpleDateFormat) dateFormat;
        if (zHasLocale) {
            simpleDateFormat = new SimpleDateFormat(simpleDateFormat3.toPattern(), valueFindFormatOverrides.getLocale());
        } else {
            simpleDateFormat = (SimpleDateFormat) simpleDateFormat3.clone();
        }
        TimeZone timeZone = valueFindFormatOverrides.getTimeZone();
        if (timeZone != null && !timeZone.equals(simpleDateFormat.getTimeZone())) {
            simpleDateFormat.setTimeZone(timeZone);
        }
        return withFormat(Boolean.FALSE, simpleDateFormat);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdScalarSerializer, com.fasterxml.jackson.databind.ser.std.StdSerializer, o.InterfaceC5598Xw
    public JsonNode getSchema(VI vi, Type type) {
        return createSchemaNode(_asTimestamp(vi) ? DataInputModuleModel.DataInputItem.INPUT_TYPE_NUMBER : "string", true);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdScalarSerializer, com.fasterxml.jackson.databind.ser.std.StdSerializer, o.VD
    public void acceptJsonFormatVisitor(InterfaceC5584Xi interfaceC5584Xi, JavaType javaType) throws JsonMappingException {
        _acceptJsonFormatVisitor(interfaceC5584Xi, javaType, _asTimestamp(interfaceC5584Xi.AEQbTJ()));
    }

    public boolean _asTimestamp(VI vi) {
        Boolean bool = this._useTimestamp;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (this._customFormat != null) {
            return false;
        }
        if (vi != null) {
            return vi.isEnabled(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
        }
        throw new IllegalArgumentException("Null SerializerProvider passed for " + handledType().getName());
    }

    public void _acceptJsonFormatVisitor(InterfaceC5584Xi interfaceC5584Xi, JavaType javaType, boolean z) throws JsonMappingException {
        if (z) {
            visitIntFormat(interfaceC5584Xi, javaType, JsonParser.NumberType.LONG, JsonValueFormat.UTC_MILLISEC);
        } else {
            visitStringFormat(interfaceC5584Xi, javaType, JsonValueFormat.DATE_TIME);
        }
    }

    public void _serializeAsString(Date date, JsonGenerator jsonGenerator, VI vi) throws IOException {
        if (this._customFormat == null) {
            vi.defaultSerializeDateValue(date, jsonGenerator);
            return;
        }
        DateFormat andSet = this._reusedCustomFormat.getAndSet(null);
        if (andSet == null) {
            andSet = (DateFormat) this._customFormat.clone();
        }
        jsonGenerator.AhwBna(andSet.format(date));
        PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this._reusedCustomFormat, null, andSet);
    }
}
