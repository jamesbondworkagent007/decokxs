package com.fasterxml.jackson.databind.cfg;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.introspect.AccessorNamingStrategy;
import com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair;
import com.fasterxml.jackson.databind.introspect.DefaultAccessorNamingStrategy;
import com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.StdDateFormat;
import java.io.Serializable;
import java.text.DateFormat;
import java.util.Locale;
import java.util.TimeZone;
import o.InterfaceC5599Xx;
import o.VQ;
import o.WX;
import o.yCN;

/* JADX INFO: loaded from: classes21.dex */
public final class BaseSettings implements Serializable {
    private static final TimeZone DEFAULT_TIMEZONE = yCN.OLrzqt("UTC");
    private static final long serialVersionUID = 1;
    protected final AccessorNamingStrategy.Provider _accessorNaming;
    protected final AnnotationIntrospector _annotationIntrospector;
    protected final WX _classIntrospector;
    protected final DateFormat _dateFormat;
    protected final Base64Variant _defaultBase64;
    protected final VQ _handlerInstantiator;
    protected final Locale _locale;
    protected final PropertyNamingStrategy _propertyNamingStrategy;
    protected final TimeZone _timeZone;
    protected final TypeFactory _typeFactory;
    protected final InterfaceC5599Xx<?> _typeResolverBuilder;
    protected final PolymorphicTypeValidator _typeValidator;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AccessorNamingStrategy.Provider getAccessorNaming() {
        return this._accessorNaming;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AnnotationIntrospector getAnnotationIntrospector() {
        return this._annotationIntrospector;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Base64Variant getBase64Variant() {
        return this._defaultBase64;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public WX getClassIntrospector() {
        return this._classIntrospector;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DateFormat getDateFormat() {
        return this._dateFormat;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public VQ getHandlerInstantiator() {
        return this._handlerInstantiator;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Locale getLocale() {
        return this._locale;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public PolymorphicTypeValidator getPolymorphicTypeValidator() {
        return this._typeValidator;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public PropertyNamingStrategy getPropertyNamingStrategy() {
        return this._propertyNamingStrategy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TimeZone getTimeZone() {
        TimeZone timeZone = this._timeZone;
        return timeZone == null ? DEFAULT_TIMEZONE : timeZone;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TypeFactory getTypeFactory() {
        return this._typeFactory;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InterfaceC5599Xx<?> getTypeResolverBuilder() {
        return this._typeResolverBuilder;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean hasExplicitTimeZone() {
        return this._timeZone != null;
    }

    public BaseSettings(WX wx, AnnotationIntrospector annotationIntrospector, PropertyNamingStrategy propertyNamingStrategy, TypeFactory typeFactory, InterfaceC5599Xx<?> interfaceC5599Xx, DateFormat dateFormat, VQ vq, Locale locale, TimeZone timeZone, Base64Variant base64Variant, PolymorphicTypeValidator polymorphicTypeValidator, AccessorNamingStrategy.Provider provider) {
        this._classIntrospector = wx;
        this._annotationIntrospector = annotationIntrospector;
        this._propertyNamingStrategy = propertyNamingStrategy;
        this._typeFactory = typeFactory;
        this._typeResolverBuilder = interfaceC5599Xx;
        this._dateFormat = dateFormat;
        this._handlerInstantiator = vq;
        this._locale = locale;
        this._timeZone = timeZone;
        this._defaultBase64 = base64Variant;
        this._typeValidator = polymorphicTypeValidator;
        this._accessorNaming = provider;
    }

    @Deprecated
    public BaseSettings(WX wx, AnnotationIntrospector annotationIntrospector, PropertyNamingStrategy propertyNamingStrategy, TypeFactory typeFactory, InterfaceC5599Xx<?> interfaceC5599Xx, DateFormat dateFormat, VQ vq, Locale locale, TimeZone timeZone, Base64Variant base64Variant, PolymorphicTypeValidator polymorphicTypeValidator) {
        this(wx, annotationIntrospector, propertyNamingStrategy, typeFactory, interfaceC5599Xx, dateFormat, vq, locale, timeZone, base64Variant, polymorphicTypeValidator, new DefaultAccessorNamingStrategy.Provider());
    }

    public BaseSettings copy() {
        return new BaseSettings(this._classIntrospector.copy(), this._annotationIntrospector, this._propertyNamingStrategy, this._typeFactory, this._typeResolverBuilder, this._dateFormat, this._handlerInstantiator, this._locale, this._timeZone, this._defaultBase64, this._typeValidator, this._accessorNaming);
    }

    public BaseSettings withClassIntrospector(WX wx) {
        return this._classIntrospector == wx ? this : new BaseSettings(wx, this._annotationIntrospector, this._propertyNamingStrategy, this._typeFactory, this._typeResolverBuilder, this._dateFormat, this._handlerInstantiator, this._locale, this._timeZone, this._defaultBase64, this._typeValidator, this._accessorNaming);
    }

    public BaseSettings withAnnotationIntrospector(AnnotationIntrospector annotationIntrospector) {
        return this._annotationIntrospector == annotationIntrospector ? this : new BaseSettings(this._classIntrospector, annotationIntrospector, this._propertyNamingStrategy, this._typeFactory, this._typeResolverBuilder, this._dateFormat, this._handlerInstantiator, this._locale, this._timeZone, this._defaultBase64, this._typeValidator, this._accessorNaming);
    }

    public BaseSettings withInsertedAnnotationIntrospector(AnnotationIntrospector annotationIntrospector) {
        return withAnnotationIntrospector(AnnotationIntrospectorPair.create(annotationIntrospector, this._annotationIntrospector));
    }

    public BaseSettings withAppendedAnnotationIntrospector(AnnotationIntrospector annotationIntrospector) {
        return withAnnotationIntrospector(AnnotationIntrospectorPair.create(this._annotationIntrospector, annotationIntrospector));
    }

    public BaseSettings withPropertyNamingStrategy(PropertyNamingStrategy propertyNamingStrategy) {
        return this._propertyNamingStrategy == propertyNamingStrategy ? this : new BaseSettings(this._classIntrospector, this._annotationIntrospector, propertyNamingStrategy, this._typeFactory, this._typeResolverBuilder, this._dateFormat, this._handlerInstantiator, this._locale, this._timeZone, this._defaultBase64, this._typeValidator, this._accessorNaming);
    }

    public BaseSettings withAccessorNaming(AccessorNamingStrategy.Provider provider) {
        return this._accessorNaming == provider ? this : new BaseSettings(this._classIntrospector, this._annotationIntrospector, this._propertyNamingStrategy, this._typeFactory, this._typeResolverBuilder, this._dateFormat, this._handlerInstantiator, this._locale, this._timeZone, this._defaultBase64, this._typeValidator, provider);
    }

    public BaseSettings withTypeFactory(TypeFactory typeFactory) {
        return this._typeFactory == typeFactory ? this : new BaseSettings(this._classIntrospector, this._annotationIntrospector, this._propertyNamingStrategy, typeFactory, this._typeResolverBuilder, this._dateFormat, this._handlerInstantiator, this._locale, this._timeZone, this._defaultBase64, this._typeValidator, this._accessorNaming);
    }

    public BaseSettings withTypeResolverBuilder(InterfaceC5599Xx<?> interfaceC5599Xx) {
        return this._typeResolverBuilder == interfaceC5599Xx ? this : new BaseSettings(this._classIntrospector, this._annotationIntrospector, this._propertyNamingStrategy, this._typeFactory, interfaceC5599Xx, this._dateFormat, this._handlerInstantiator, this._locale, this._timeZone, this._defaultBase64, this._typeValidator, this._accessorNaming);
    }

    public BaseSettings withDateFormat(DateFormat dateFormat) {
        if (this._dateFormat == dateFormat) {
            return this;
        }
        if (dateFormat != null && hasExplicitTimeZone()) {
            dateFormat = _force(dateFormat, this._timeZone);
        }
        return new BaseSettings(this._classIntrospector, this._annotationIntrospector, this._propertyNamingStrategy, this._typeFactory, this._typeResolverBuilder, dateFormat, this._handlerInstantiator, this._locale, this._timeZone, this._defaultBase64, this._typeValidator, this._accessorNaming);
    }

    public BaseSettings withHandlerInstantiator(VQ vq) {
        return this._handlerInstantiator == vq ? this : new BaseSettings(this._classIntrospector, this._annotationIntrospector, this._propertyNamingStrategy, this._typeFactory, this._typeResolverBuilder, this._dateFormat, vq, this._locale, this._timeZone, this._defaultBase64, this._typeValidator, this._accessorNaming);
    }

    public BaseSettings with(Locale locale) {
        return this._locale == locale ? this : new BaseSettings(this._classIntrospector, this._annotationIntrospector, this._propertyNamingStrategy, this._typeFactory, this._typeResolverBuilder, this._dateFormat, this._handlerInstantiator, locale, this._timeZone, this._defaultBase64, this._typeValidator, this._accessorNaming);
    }

    public BaseSettings with(TimeZone timeZone) {
        if (timeZone == this._timeZone) {
            return this;
        }
        return new BaseSettings(this._classIntrospector, this._annotationIntrospector, this._propertyNamingStrategy, this._typeFactory, this._typeResolverBuilder, _force(this._dateFormat, timeZone == null ? DEFAULT_TIMEZONE : timeZone), this._handlerInstantiator, this._locale, timeZone, this._defaultBase64, this._typeValidator, this._accessorNaming);
    }

    public BaseSettings with(Base64Variant base64Variant) {
        return base64Variant == this._defaultBase64 ? this : new BaseSettings(this._classIntrospector, this._annotationIntrospector, this._propertyNamingStrategy, this._typeFactory, this._typeResolverBuilder, this._dateFormat, this._handlerInstantiator, this._locale, this._timeZone, base64Variant, this._typeValidator, this._accessorNaming);
    }

    public BaseSettings with(PolymorphicTypeValidator polymorphicTypeValidator) {
        return polymorphicTypeValidator == this._typeValidator ? this : new BaseSettings(this._classIntrospector, this._annotationIntrospector, this._propertyNamingStrategy, this._typeFactory, this._typeResolverBuilder, this._dateFormat, this._handlerInstantiator, this._locale, this._timeZone, this._defaultBase64, polymorphicTypeValidator, this._accessorNaming);
    }

    private DateFormat _force(DateFormat dateFormat, TimeZone timeZone) {
        if (dateFormat instanceof StdDateFormat) {
            return ((StdDateFormat) dateFormat).withTimeZone(timeZone);
        }
        DateFormat dateFormat2 = (DateFormat) dateFormat.clone();
        dateFormat2.setTimeZone(timeZone);
        return dateFormat2;
    }
}
