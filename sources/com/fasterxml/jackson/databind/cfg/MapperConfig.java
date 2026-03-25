package com.fasterxml.jackson.databind.cfg;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonIncludeProperties;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.io.SerializedString;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.AccessorNamingStrategy;
import com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker;
import com.fasterxml.jackson.databind.jsontype.DefaultBaseTypeLimitingValidator;
import com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator;
import com.fasterxml.jackson.databind.jsontype.impl.LaissezFaireSubTypeValidator;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.io.Serializable;
import java.text.DateFormat;
import java.util.Locale;
import java.util.TimeZone;
import o.AbstractC5533Vj;
import o.AbstractC5549Vz;
import o.AbstractC5595Xt;
import o.C5619Yr;
import o.InterfaceC5501Ue;
import o.InterfaceC5599Xx;
import o.VQ;
import o.VS;
import o.VU;
import o.WJ;
import o.WM;
import o.WX;
import o.XB;

/* JADX INFO: loaded from: classes21.dex */
public abstract class MapperConfig<T extends MapperConfig<T>> implements WX.TaskDescription, Serializable {
    private static final long serialVersionUID = 2;
    public final BaseSettings _base;
    public final long _mapperFeatures;
    protected static final JsonInclude.Value EMPTY_INCLUDE = JsonInclude.Value.empty();
    protected static final JsonFormat.Value EMPTY_FORMAT = JsonFormat.Value.empty();

    public abstract VU findConfigOverride(Class<?> cls);

    public abstract PropertyName findRootName(JavaType javaType);

    public abstract PropertyName findRootName(Class<?> cls);

    public abstract Class<?> getActiveView();

    public abstract ContextAttributes getAttributes();

    public abstract VU getConfigOverride(Class<?> cls);

    public abstract JsonInclude.Value getDefaultInclusion(Class<?> cls, Class<?> cls2);

    public abstract Boolean getDefaultMergeable();

    public abstract Boolean getDefaultMergeable(Class<?> cls);

    public abstract JsonFormat.Value getDefaultPropertyFormat(Class<?> cls);

    public abstract JsonIgnoreProperties.Value getDefaultPropertyIgnorals(Class<?> cls);

    public abstract JsonIgnoreProperties.Value getDefaultPropertyIgnorals(Class<?> cls, WJ wj);

    public abstract JsonInclude.Value getDefaultPropertyInclusion();

    public abstract JsonInclude.Value getDefaultPropertyInclusion(Class<?> cls);

    public abstract JsonIncludeProperties.Value getDefaultPropertyInclusions(Class<?> cls, WJ wj);

    public abstract JsonSetter.Value getDefaultSetterInfo();

    public abstract VisibilityChecker<?> getDefaultVisibilityChecker();

    public abstract VisibilityChecker<?> getDefaultVisibilityChecker(Class<?> cls, WJ wj);

    public abstract AbstractC5595Xt getSubtypeResolver();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Deprecated
    public final boolean hasMapperFeatures(int i) {
        long j = i;
        return (this._mapperFeatures & j) == j;
    }

    public abstract boolean useRootWrapping();

    public abstract T with(MapperFeature mapperFeature, boolean z);

    public abstract T with(MapperFeature... mapperFeatureArr);

    public abstract T without(MapperFeature... mapperFeatureArr);

    public MapperConfig(BaseSettings baseSettings, long j) {
        this._base = baseSettings;
        this._mapperFeatures = j;
    }

    public MapperConfig(MapperConfig<T> mapperConfig, long j) {
        this._base = mapperConfig._base;
        this._mapperFeatures = j;
    }

    public MapperConfig(MapperConfig<T> mapperConfig, BaseSettings baseSettings) {
        this._base = baseSettings;
        this._mapperFeatures = mapperConfig._mapperFeatures;
    }

    public MapperConfig(MapperConfig<T> mapperConfig) {
        this._base = mapperConfig._base;
        this._mapperFeatures = mapperConfig._mapperFeatures;
    }

    public static <F extends Enum<F> & VS> int collectFeatureDefaults(Class<F> cls) {
        int mask = 0;
        for (Object obj : (Enum[]) cls.getEnumConstants()) {
            VS vs = (VS) obj;
            if (vs.enabledByDefault()) {
                mask |= vs.getMask();
            }
        }
        return mask;
    }

    public final boolean isEnabled(MapperFeature mapperFeature) {
        return mapperFeature.enabledIn(this._mapperFeatures);
    }

    public final boolean isAnnotationProcessingEnabled() {
        return isEnabled(MapperFeature.USE_ANNOTATIONS);
    }

    public final boolean canOverrideAccessModifiers() {
        return isEnabled(MapperFeature.CAN_OVERRIDE_ACCESS_MODIFIERS);
    }

    public final boolean shouldSortPropertiesAlphabetically() {
        return isEnabled(MapperFeature.SORT_PROPERTIES_ALPHABETICALLY);
    }

    public InterfaceC5501Ue compileString(String str) {
        return new SerializedString(str);
    }

    public WX getClassIntrospector() {
        return this._base.getClassIntrospector();
    }

    public AnnotationIntrospector getAnnotationIntrospector() {
        if (isEnabled(MapperFeature.USE_ANNOTATIONS)) {
            return this._base.getAnnotationIntrospector();
        }
        return NopAnnotationIntrospector.instance;
    }

    public final PropertyNamingStrategy getPropertyNamingStrategy() {
        return this._base.getPropertyNamingStrategy();
    }

    public final AccessorNamingStrategy.Provider getAccessorNaming() {
        return this._base.getAccessorNaming();
    }

    public final VQ getHandlerInstantiator() {
        return this._base.getHandlerInstantiator();
    }

    public final InterfaceC5599Xx<?> getDefaultTyper(JavaType javaType) {
        return this._base.getTypeResolverBuilder();
    }

    public PolymorphicTypeValidator getPolymorphicTypeValidator() {
        PolymorphicTypeValidator polymorphicTypeValidator = this._base.getPolymorphicTypeValidator();
        return (polymorphicTypeValidator == LaissezFaireSubTypeValidator.instance && isEnabled(MapperFeature.BLOCK_UNSAFE_POLYMORPHIC_BASE_TYPES)) ? new DefaultBaseTypeLimitingValidator() : polymorphicTypeValidator;
    }

    public final TypeFactory getTypeFactory() {
        return this._base.getTypeFactory();
    }

    public final JavaType constructType(Class<?> cls) {
        return getTypeFactory().constructType(cls);
    }

    public final JavaType constructType(AbstractC5533Vj<?> abstractC5533Vj) {
        return getTypeFactory().constructType(abstractC5533Vj.AEQbTJ());
    }

    public JavaType constructSpecializedType(JavaType javaType, Class<?> cls) {
        return getTypeFactory().constructSpecializedType(javaType, cls, true);
    }

    public AbstractC5549Vz introspectClassAnnotations(Class<?> cls) {
        return introspectClassAnnotations(constructType(cls));
    }

    public AbstractC5549Vz introspectClassAnnotations(JavaType javaType) {
        return getClassIntrospector().forClassAnnotations(this, javaType, this);
    }

    public AbstractC5549Vz introspectDirectClassAnnotations(Class<?> cls) {
        return introspectDirectClassAnnotations(constructType(cls));
    }

    public final AbstractC5549Vz introspectDirectClassAnnotations(JavaType javaType) {
        return getClassIntrospector().forDirectClassAnnotations(this, javaType, this);
    }

    public JsonInclude.Value getDefaultPropertyInclusion(Class<?> cls, JsonInclude.Value value) {
        JsonInclude.Value include = getConfigOverride(cls).getInclude();
        return include != null ? include : value;
    }

    public JsonInclude.Value getDefaultInclusion(Class<?> cls, Class<?> cls2, JsonInclude.Value value) {
        return JsonInclude.Value.mergeAll(value, getConfigOverride(cls).getInclude(), getConfigOverride(cls2).getIncludeAsProperty());
    }

    public final DateFormat getDateFormat() {
        return this._base.getDateFormat();
    }

    public final Locale getLocale() {
        return this._base.getLocale();
    }

    public final TimeZone getTimeZone() {
        return this._base.getTimeZone();
    }

    public boolean hasExplicitTimeZone() {
        return this._base.hasExplicitTimeZone();
    }

    public Base64Variant getBase64Variant() {
        return this._base.getBase64Variant();
    }

    public InterfaceC5599Xx<?> typeResolverBuilderInstance(WM wm, Class<? extends InterfaceC5599Xx<?>> cls) {
        InterfaceC5599Xx<?> interfaceC5599XxAYXKKw;
        VQ handlerInstantiator = getHandlerInstantiator();
        return (handlerInstantiator == null || (interfaceC5599XxAYXKKw = handlerInstantiator.AYXKKw(this, wm, cls)) == null) ? (InterfaceC5599Xx) C5619Yr.EZpvd(cls, canOverrideAccessModifiers()) : interfaceC5599XxAYXKKw;
    }

    public XB typeIdResolverInstance(WM wm, Class<? extends XB> cls) {
        XB xbOLrzqt;
        VQ handlerInstantiator = getHandlerInstantiator();
        return (handlerInstantiator == null || (xbOLrzqt = handlerInstantiator.OLrzqt((MapperConfig<?>) this, wm, (Class<?>) cls)) == null) ? (XB) C5619Yr.EZpvd(cls, canOverrideAccessModifiers()) : xbOLrzqt;
    }
}
