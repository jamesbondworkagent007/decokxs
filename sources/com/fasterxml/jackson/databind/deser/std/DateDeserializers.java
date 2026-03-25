package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.cfg.CoercionAction;
import com.fasterxml.jackson.databind.type.LogicalType;
import com.fasterxml.jackson.databind.util.StdDateFormat;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.TimeZone;
import o.AbstractC5548Vy;
import o.C5619Yr;
import o.InterfaceC5554We;
import o.VK;

/* JADX INFO: loaded from: classes21.dex */
public class DateDeserializers {
    public static final HashSet<String> EZpvd;

    static {
        HashSet<String> hashSet = new HashSet<>();
        EZpvd = hashSet;
        hashSet.add("java.util.Calendar");
        hashSet.add("java.util.GregorianCalendar");
        hashSet.add("java.util.Date");
    }

    public static AbstractC5548Vy<?> copydefault(Class<?> cls, String str) {
        if (!EZpvd.contains(str)) {
            return null;
        }
        if (cls == Calendar.class) {
            return new CalendarDeserializer();
        }
        if (cls == Date.class) {
            return DateDeserializer.instance;
        }
        if (cls == GregorianCalendar.class) {
            return new CalendarDeserializer(GregorianCalendar.class);
        }
        return null;
    }

    public static boolean EZpvd(Class<?> cls) {
        return EZpvd.contains(cls.getName());
    }

    public static abstract class DateBasedDeserializer<T> extends StdScalarDeserializer<T> implements InterfaceC5554We {
        protected final DateFormat _customFormat;
        protected final String _formatString;

        /* JADX INFO: renamed from: withDateFormat */
        public abstract DateBasedDeserializer<T> withDateFormat2(DateFormat dateFormat, String str);

        public DateBasedDeserializer(Class<?> cls) {
            super(cls);
            this._customFormat = null;
            this._formatString = null;
        }

        public DateBasedDeserializer(DateBasedDeserializer<T> dateBasedDeserializer, DateFormat dateFormat, String str) {
            super(dateBasedDeserializer._valueClass);
            this._customFormat = dateFormat;
            this._formatString = str;
        }

        @Override // com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, o.AbstractC5548Vy
        public LogicalType logicalType() {
            return LogicalType.DateTime;
        }

        public AbstractC5548Vy<?> createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) throws JsonMappingException {
            DateFormat dateFormat;
            DateFormat dateFormatWithLenient;
            JsonFormat.Value valueFindFormatOverrides = findFormatOverrides(deserializationContext, beanProperty, handledType());
            if (valueFindFormatOverrides != null) {
                TimeZone timeZone = valueFindFormatOverrides.getTimeZone();
                Boolean lenient = valueFindFormatOverrides.getLenient();
                if (valueFindFormatOverrides.hasPattern()) {
                    String pattern = valueFindFormatOverrides.getPattern();
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern, valueFindFormatOverrides.hasLocale() ? valueFindFormatOverrides.getLocale() : deserializationContext.getLocale());
                    if (timeZone == null) {
                        timeZone = deserializationContext.getTimeZone();
                    }
                    simpleDateFormat.setTimeZone(timeZone);
                    if (lenient != null) {
                        simpleDateFormat.setLenient(lenient.booleanValue());
                    }
                    return withDateFormat2(simpleDateFormat, pattern);
                }
                if (timeZone != null) {
                    DateFormat dateFormat2 = deserializationContext.getConfig().getDateFormat();
                    if (dateFormat2.getClass() == StdDateFormat.class) {
                        StdDateFormat stdDateFormatWithLocale = ((StdDateFormat) dateFormat2).withTimeZone(timeZone).withLocale(valueFindFormatOverrides.hasLocale() ? valueFindFormatOverrides.getLocale() : deserializationContext.getLocale());
                        dateFormatWithLenient = stdDateFormatWithLocale;
                        if (lenient != null) {
                            dateFormatWithLenient = stdDateFormatWithLocale.withLenient(lenient);
                        }
                    } else {
                        DateFormat dateFormat3 = (DateFormat) dateFormat2.clone();
                        dateFormat3.setTimeZone(timeZone);
                        dateFormatWithLenient = dateFormat3;
                        if (lenient != null) {
                            dateFormat3.setLenient(lenient.booleanValue());
                            dateFormatWithLenient = dateFormat3;
                        }
                    }
                    return withDateFormat2(dateFormatWithLenient, this._formatString);
                }
                if (lenient != null) {
                    DateFormat dateFormat4 = deserializationContext.getConfig().getDateFormat();
                    String pattern2 = this._formatString;
                    if (dateFormat4.getClass() == StdDateFormat.class) {
                        StdDateFormat stdDateFormatWithLenient = ((StdDateFormat) dateFormat4).withLenient(lenient);
                        pattern2 = stdDateFormatWithLenient.toPattern();
                        dateFormat = stdDateFormatWithLenient;
                    } else {
                        DateFormat dateFormat5 = (DateFormat) dateFormat4.clone();
                        dateFormat5.setLenient(lenient.booleanValue());
                        boolean z = dateFormat5 instanceof SimpleDateFormat;
                        dateFormat = dateFormat5;
                        if (z) {
                            ((SimpleDateFormat) dateFormat5).toPattern();
                            dateFormat = dateFormat5;
                        }
                    }
                    if (pattern2 == null) {
                        pattern2 = "[unknown]";
                    }
                    return withDateFormat2(dateFormat, pattern2);
                }
            }
            return this;
        }

        @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer
        public Date _parseDate(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            Date date;
            if (this._customFormat != null && jsonParser.copydefault(JsonToken.VALUE_STRING)) {
                String strTrim = jsonParser.zLjUOn().trim();
                if (strTrim.isEmpty()) {
                    if (AnonymousClass5.copydefault[_checkFromStringCoercion(deserializationContext, strTrim).ordinal()] != 1) {
                        return null;
                    }
                    return new Date(0L);
                }
                synchronized (this._customFormat) {
                    try {
                        try {
                            date = this._customFormat.parse(strTrim);
                        } catch (ParseException unused) {
                            return (Date) deserializationContext.handleWeirdStringValue(handledType(), strTrim, "expected format \"%s\"", this._formatString);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return date;
            }
            return super._parseDate(jsonParser, deserializationContext);
        }
    }

    /* JADX INFO: renamed from: com.fasterxml.jackson.databind.deser.std.DateDeserializers$5, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass5 {
        public static final /* synthetic */ int[] copydefault;

        static {
            int[] iArr = new int[CoercionAction.values().length];
            copydefault = iArr;
            try {
                iArr[CoercionAction.AsEmpty.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                copydefault[CoercionAction.AsNull.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                copydefault[CoercionAction.TryConvert.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @VK
    public static class CalendarDeserializer extends DateBasedDeserializer<Calendar> {
        protected final Constructor<Calendar> _defaultCtor;

        @Override // com.fasterxml.jackson.databind.deser.std.DateDeserializers.DateBasedDeserializer, o.InterfaceC5554We
        public /* bridge */ /* synthetic */ AbstractC5548Vy createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) throws JsonMappingException {
            return super.createContextual(deserializationContext, beanProperty);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.DateDeserializers.DateBasedDeserializer, com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, o.AbstractC5548Vy
        public /* bridge */ /* synthetic */ LogicalType logicalType() {
            return super.logicalType();
        }

        public CalendarDeserializer() {
            super(Calendar.class);
            this._defaultCtor = null;
        }

        public CalendarDeserializer(Class<? extends Calendar> cls) {
            super(cls);
            this._defaultCtor = C5619Yr.OLrzqt(cls, false);
        }

        public CalendarDeserializer(CalendarDeserializer calendarDeserializer, DateFormat dateFormat, String str) {
            super(calendarDeserializer, dateFormat, str);
            this._defaultCtor = calendarDeserializer._defaultCtor;
        }

        /* JADX DEBUG: Method merged with bridge method: withDateFormat(Ljava/text/DateFormat;Ljava/lang/String;)Lcom/fasterxml/jackson/databind/deser/std/DateDeserializers$DateBasedDeserializer; */
        /* JADX DEBUG: Return type fixed from 'com.fasterxml.jackson.databind.deser.std.DateDeserializers$CalendarDeserializer' to match base method */
        @Override // com.fasterxml.jackson.databind.deser.std.DateDeserializers.DateBasedDeserializer
        /* JADX INFO: renamed from: withDateFormat, reason: merged with bridge method [inline-methods] */
        public DateBasedDeserializer<Calendar> withDateFormat2(DateFormat dateFormat, String str) {
            return new CalendarDeserializer(this, dateFormat, str);
        }

        @Override // o.AbstractC5548Vy
        public Object getEmptyValue(DeserializationContext deserializationContext) {
            GregorianCalendar gregorianCalendar = new GregorianCalendar();
            gregorianCalendar.setTimeInMillis(0L);
            return gregorianCalendar;
        }

        /* JADX DEBUG: Method merged with bridge method: deserialize(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;)Ljava/lang/Object; */
        @Override // o.AbstractC5548Vy
        public Calendar deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            Date date_parseDate = _parseDate(jsonParser, deserializationContext);
            if (date_parseDate == null) {
                return null;
            }
            Constructor<Calendar> constructor = this._defaultCtor;
            if (constructor == null) {
                return deserializationContext.constructCalendar(date_parseDate);
            }
            try {
                Calendar calendarNewInstance = constructor.newInstance(new Object[0]);
                calendarNewInstance.setTimeInMillis(date_parseDate.getTime());
                TimeZone timeZone = deserializationContext.getTimeZone();
                if (timeZone != null) {
                    calendarNewInstance.setTimeZone(timeZone);
                }
                return calendarNewInstance;
            } catch (Exception e) {
                return (Calendar) deserializationContext.handleInstantiationProblem(handledType(), date_parseDate, e);
            }
        }
    }

    @VK
    public static class DateDeserializer extends DateBasedDeserializer<Date> {
        public static final DateDeserializer instance = new DateDeserializer();

        @Override // com.fasterxml.jackson.databind.deser.std.DateDeserializers.DateBasedDeserializer, o.InterfaceC5554We
        public /* bridge */ /* synthetic */ AbstractC5548Vy createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) throws JsonMappingException {
            return super.createContextual(deserializationContext, beanProperty);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.DateDeserializers.DateBasedDeserializer, com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, o.AbstractC5548Vy
        public /* bridge */ /* synthetic */ LogicalType logicalType() {
            return super.logicalType();
        }

        public DateDeserializer() {
            super(Date.class);
        }

        public DateDeserializer(DateDeserializer dateDeserializer, DateFormat dateFormat, String str) {
            super(dateDeserializer, dateFormat, str);
        }

        /* JADX DEBUG: Method merged with bridge method: withDateFormat(Ljava/text/DateFormat;Ljava/lang/String;)Lcom/fasterxml/jackson/databind/deser/std/DateDeserializers$DateBasedDeserializer; */
        /* JADX DEBUG: Return type fixed from 'com.fasterxml.jackson.databind.deser.std.DateDeserializers$DateDeserializer' to match base method */
        @Override // com.fasterxml.jackson.databind.deser.std.DateDeserializers.DateBasedDeserializer
        /* JADX INFO: renamed from: withDateFormat, reason: avoid collision after fix types in other method */
        public DateBasedDeserializer<Date> withDateFormat2(DateFormat dateFormat, String str) {
            return new DateDeserializer(this, dateFormat, str);
        }

        @Override // o.AbstractC5548Vy
        public Object getEmptyValue(DeserializationContext deserializationContext) {
            return new Date(0L);
        }

        /* JADX DEBUG: Method merged with bridge method: deserialize(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;)Ljava/lang/Object; */
        @Override // o.AbstractC5548Vy
        public Date deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            return _parseDate(jsonParser, deserializationContext);
        }
    }

    public static class SqlDateDeserializer extends DateBasedDeserializer<java.sql.Date> {
        @Override // com.fasterxml.jackson.databind.deser.std.DateDeserializers.DateBasedDeserializer, o.InterfaceC5554We
        public /* bridge */ /* synthetic */ AbstractC5548Vy createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) throws JsonMappingException {
            return super.createContextual(deserializationContext, beanProperty);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.DateDeserializers.DateBasedDeserializer, com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, o.AbstractC5548Vy
        public /* bridge */ /* synthetic */ LogicalType logicalType() {
            return super.logicalType();
        }

        public SqlDateDeserializer() {
            super(java.sql.Date.class);
        }

        public SqlDateDeserializer(SqlDateDeserializer sqlDateDeserializer, DateFormat dateFormat, String str) {
            super(sqlDateDeserializer, dateFormat, str);
        }

        /* JADX DEBUG: Method merged with bridge method: withDateFormat(Ljava/text/DateFormat;Ljava/lang/String;)Lcom/fasterxml/jackson/databind/deser/std/DateDeserializers$DateBasedDeserializer; */
        /* JADX DEBUG: Return type fixed from 'com.fasterxml.jackson.databind.deser.std.DateDeserializers$SqlDateDeserializer' to match base method */
        @Override // com.fasterxml.jackson.databind.deser.std.DateDeserializers.DateBasedDeserializer
        /* JADX INFO: renamed from: withDateFormat, reason: avoid collision after fix types in other method */
        public DateBasedDeserializer<java.sql.Date> withDateFormat2(DateFormat dateFormat, String str) {
            return new SqlDateDeserializer(this, dateFormat, str);
        }

        @Override // o.AbstractC5548Vy
        public Object getEmptyValue(DeserializationContext deserializationContext) {
            return new java.sql.Date(0L);
        }

        /* JADX DEBUG: Method merged with bridge method: deserialize(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;)Ljava/lang/Object; */
        @Override // o.AbstractC5548Vy
        public java.sql.Date deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            Date date_parseDate = _parseDate(jsonParser, deserializationContext);
            if (date_parseDate == null) {
                return null;
            }
            return new java.sql.Date(date_parseDate.getTime());
        }
    }

    public static class TimestampDeserializer extends DateBasedDeserializer<Timestamp> {
        @Override // com.fasterxml.jackson.databind.deser.std.DateDeserializers.DateBasedDeserializer, o.InterfaceC5554We
        public /* bridge */ /* synthetic */ AbstractC5548Vy createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) throws JsonMappingException {
            return super.createContextual(deserializationContext, beanProperty);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.DateDeserializers.DateBasedDeserializer, com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, o.AbstractC5548Vy
        public /* bridge */ /* synthetic */ LogicalType logicalType() {
            return super.logicalType();
        }

        public TimestampDeserializer() {
            super(Timestamp.class);
        }

        public TimestampDeserializer(TimestampDeserializer timestampDeserializer, DateFormat dateFormat, String str) {
            super(timestampDeserializer, dateFormat, str);
        }

        /* JADX DEBUG: Method merged with bridge method: withDateFormat(Ljava/text/DateFormat;Ljava/lang/String;)Lcom/fasterxml/jackson/databind/deser/std/DateDeserializers$DateBasedDeserializer; */
        /* JADX DEBUG: Return type fixed from 'com.fasterxml.jackson.databind.deser.std.DateDeserializers$TimestampDeserializer' to match base method */
        @Override // com.fasterxml.jackson.databind.deser.std.DateDeserializers.DateBasedDeserializer
        /* JADX INFO: renamed from: withDateFormat, reason: avoid collision after fix types in other method */
        public DateBasedDeserializer<Timestamp> withDateFormat2(DateFormat dateFormat, String str) {
            return new TimestampDeserializer(this, dateFormat, str);
        }

        @Override // o.AbstractC5548Vy
        public Object getEmptyValue(DeserializationContext deserializationContext) {
            return new Timestamp(0L);
        }

        /* JADX DEBUG: Method merged with bridge method: deserialize(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;)Ljava/lang/Object; */
        @Override // o.AbstractC5548Vy
        public Timestamp deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            Date date_parseDate = _parseDate(jsonParser, deserializationContext);
            if (date_parseDate == null) {
                return null;
            }
            return new Timestamp(date_parseDate.getTime());
        }
    }
}
