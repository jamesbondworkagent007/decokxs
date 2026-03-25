package com.fasterxml.jackson.databind.cfg;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonIncludeProperties;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.cfg.MapperConfigBase;
import com.fasterxml.jackson.databind.introspect.AccessorNamingStrategy;
import com.fasterxml.jackson.databind.introspect.SimpleMixInResolver;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.RootNameLookup;
import java.io.Serializable;
import java.text.DateFormat;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import o.AbstractC5595Xt;
import o.C5619Yr;
import o.InterfaceC5599Xx;
import o.VQ;
import o.VS;
import o.VT;
import o.VU;
import o.WJ;
import o.WX;

/* JADX INFO: loaded from: classes21.dex */
public abstract class MapperConfigBase<CFG extends VS, T extends MapperConfigBase<CFG, T>> extends MapperConfig<T> implements Serializable {
    private static final long AUTO_DETECT_MASK;
    public final ContextAttributes _attributes;
    public final ConfigOverrides _configOverrides;
    public final DatatypeFeatures _datatypeFeatures;
    protected final SimpleMixInResolver _mixIns;
    public final PropertyName _rootName;
    protected final RootNameLookup _rootNames;
    public final AbstractC5595Xt _subtypeResolver;
    public final Class<?> _view;
    protected static final VU EMPTY_OVERRIDE = VU.empty();
    private static final long DEFAULT_MAPPER_FEATURES = MapperFeature.collectLongDefaults();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DatatypeFeatures _datatypeFeatures() {
        return this._datatypeFeatures;
    }

    public abstract T _with(DatatypeFeatures datatypeFeatures);

    public abstract T _withBase(BaseSettings baseSettings);

    public abstract T _withMapperFeatures(long j);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.fasterxml.jackson.databind.cfg.MapperConfig
    public final Class<?> getActiveView() {
        return this._view;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.fasterxml.jackson.databind.cfg.MapperConfig
    public final ContextAttributes getAttributes() {
        return this._attributes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PropertyName getFullRootName() {
        return this._rootName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.fasterxml.jackson.databind.cfg.MapperConfig
    public final AbstractC5595Xt getSubtypeResolver() {
        return this._subtypeResolver;
    }

    public abstract T with(ContextAttributes contextAttributes);

    public abstract T with(AbstractC5595Xt abstractC5595Xt);

    public abstract T withRootName(PropertyName propertyName);

    public abstract T withView(Class<?> cls);

    static {
        long longMask = MapperFeature.AUTO_DETECT_FIELDS.getLongMask();
        long longMask2 = MapperFeature.AUTO_DETECT_GETTERS.getLongMask();
        AUTO_DETECT_MASK = longMask | longMask2 | MapperFeature.AUTO_DETECT_IS_GETTERS.getLongMask() | MapperFeature.AUTO_DETECT_SETTERS.getLongMask() | MapperFeature.AUTO_DETECT_CREATORS.getLongMask();
    }

    public MapperConfigBase(BaseSettings baseSettings, AbstractC5595Xt abstractC5595Xt, SimpleMixInResolver simpleMixInResolver, RootNameLookup rootNameLookup, ConfigOverrides configOverrides, DatatypeFeatures datatypeFeatures) {
        super(baseSettings, DEFAULT_MAPPER_FEATURES);
        this._mixIns = simpleMixInResolver;
        this._subtypeResolver = abstractC5595Xt;
        this._rootNames = rootNameLookup;
        this._rootName = null;
        this._view = null;
        this._attributes = ContextAttributes.getEmpty();
        this._configOverrides = configOverrides;
        this._datatypeFeatures = datatypeFeatures;
    }

    public MapperConfigBase(MapperConfigBase<CFG, T> mapperConfigBase, AbstractC5595Xt abstractC5595Xt, SimpleMixInResolver simpleMixInResolver, RootNameLookup rootNameLookup, ConfigOverrides configOverrides) {
        super(mapperConfigBase, mapperConfigBase._base.copy());
        this._mixIns = simpleMixInResolver;
        this._subtypeResolver = abstractC5595Xt;
        this._rootNames = rootNameLookup;
        this._rootName = mapperConfigBase._rootName;
        this._view = mapperConfigBase._view;
        this._attributes = mapperConfigBase._attributes;
        this._configOverrides = configOverrides;
        this._datatypeFeatures = mapperConfigBase._datatypeFeatures;
    }

    public MapperConfigBase(MapperConfigBase<CFG, T> mapperConfigBase) {
        super(mapperConfigBase);
        this._mixIns = mapperConfigBase._mixIns;
        this._subtypeResolver = mapperConfigBase._subtypeResolver;
        this._rootNames = mapperConfigBase._rootNames;
        this._rootName = mapperConfigBase._rootName;
        this._view = mapperConfigBase._view;
        this._attributes = mapperConfigBase._attributes;
        this._configOverrides = mapperConfigBase._configOverrides;
        this._datatypeFeatures = mapperConfigBase._datatypeFeatures;
    }

    public MapperConfigBase(MapperConfigBase<CFG, T> mapperConfigBase, BaseSettings baseSettings) {
        super(mapperConfigBase, baseSettings);
        this._mixIns = mapperConfigBase._mixIns;
        this._subtypeResolver = mapperConfigBase._subtypeResolver;
        this._rootNames = mapperConfigBase._rootNames;
        this._rootName = mapperConfigBase._rootName;
        this._view = mapperConfigBase._view;
        this._attributes = mapperConfigBase._attributes;
        this._configOverrides = mapperConfigBase._configOverrides;
        this._datatypeFeatures = mapperConfigBase._datatypeFeatures;
    }

    public MapperConfigBase(MapperConfigBase<CFG, T> mapperConfigBase, long j) {
        super(mapperConfigBase, j);
        this._mixIns = mapperConfigBase._mixIns;
        this._subtypeResolver = mapperConfigBase._subtypeResolver;
        this._rootNames = mapperConfigBase._rootNames;
        this._rootName = mapperConfigBase._rootName;
        this._view = mapperConfigBase._view;
        this._attributes = mapperConfigBase._attributes;
        this._configOverrides = mapperConfigBase._configOverrides;
        this._datatypeFeatures = mapperConfigBase._datatypeFeatures;
    }

    public MapperConfigBase(MapperConfigBase<CFG, T> mapperConfigBase, AbstractC5595Xt abstractC5595Xt) {
        super(mapperConfigBase);
        this._mixIns = mapperConfigBase._mixIns;
        this._subtypeResolver = abstractC5595Xt;
        this._rootNames = mapperConfigBase._rootNames;
        this._rootName = mapperConfigBase._rootName;
        this._view = mapperConfigBase._view;
        this._attributes = mapperConfigBase._attributes;
        this._configOverrides = mapperConfigBase._configOverrides;
        this._datatypeFeatures = mapperConfigBase._datatypeFeatures;
    }

    public MapperConfigBase(MapperConfigBase<CFG, T> mapperConfigBase, PropertyName propertyName) {
        super(mapperConfigBase);
        this._mixIns = mapperConfigBase._mixIns;
        this._subtypeResolver = mapperConfigBase._subtypeResolver;
        this._rootNames = mapperConfigBase._rootNames;
        this._rootName = propertyName;
        this._view = mapperConfigBase._view;
        this._attributes = mapperConfigBase._attributes;
        this._configOverrides = mapperConfigBase._configOverrides;
        this._datatypeFeatures = mapperConfigBase._datatypeFeatures;
    }

    public MapperConfigBase(MapperConfigBase<CFG, T> mapperConfigBase, Class<?> cls) {
        super(mapperConfigBase);
        this._mixIns = mapperConfigBase._mixIns;
        this._subtypeResolver = mapperConfigBase._subtypeResolver;
        this._rootNames = mapperConfigBase._rootNames;
        this._rootName = mapperConfigBase._rootName;
        this._view = cls;
        this._attributes = mapperConfigBase._attributes;
        this._configOverrides = mapperConfigBase._configOverrides;
        this._datatypeFeatures = mapperConfigBase._datatypeFeatures;
    }

    public MapperConfigBase(MapperConfigBase<CFG, T> mapperConfigBase, SimpleMixInResolver simpleMixInResolver) {
        super(mapperConfigBase);
        this._mixIns = simpleMixInResolver;
        this._subtypeResolver = mapperConfigBase._subtypeResolver;
        this._rootNames = mapperConfigBase._rootNames;
        this._rootName = mapperConfigBase._rootName;
        this._view = mapperConfigBase._view;
        this._attributes = mapperConfigBase._attributes;
        this._configOverrides = mapperConfigBase._configOverrides;
        this._datatypeFeatures = mapperConfigBase._datatypeFeatures;
    }

    public MapperConfigBase(MapperConfigBase<CFG, T> mapperConfigBase, ContextAttributes contextAttributes) {
        super(mapperConfigBase);
        this._mixIns = mapperConfigBase._mixIns;
        this._subtypeResolver = mapperConfigBase._subtypeResolver;
        this._rootNames = mapperConfigBase._rootNames;
        this._rootName = mapperConfigBase._rootName;
        this._view = mapperConfigBase._view;
        this._attributes = contextAttributes;
        this._configOverrides = mapperConfigBase._configOverrides;
        this._datatypeFeatures = mapperConfigBase._datatypeFeatures;
    }

    public MapperConfigBase(MapperConfigBase<CFG, T> mapperConfigBase, DatatypeFeatures datatypeFeatures) {
        super(mapperConfigBase);
        this._mixIns = mapperConfigBase._mixIns;
        this._subtypeResolver = mapperConfigBase._subtypeResolver;
        this._rootNames = mapperConfigBase._rootNames;
        this._rootName = mapperConfigBase._rootName;
        this._view = mapperConfigBase._view;
        this._attributes = mapperConfigBase._attributes;
        this._configOverrides = mapperConfigBase._configOverrides;
        this._datatypeFeatures = datatypeFeatures;
    }

    /* JADX DEBUG: Method merged with bridge method: with([Lcom/fasterxml/jackson/databind/MapperFeature;)Lcom/fasterxml/jackson/databind/cfg/MapperConfig; */
    @Override // com.fasterxml.jackson.databind.cfg.MapperConfig
    public final T with(MapperFeature... mapperFeatureArr) {
        long longMask = this._mapperFeatures;
        for (MapperFeature mapperFeature : mapperFeatureArr) {
            longMask |= mapperFeature.getLongMask();
        }
        return longMask == this._mapperFeatures ? this : (T) _withMapperFeatures(longMask);
    }

    /* JADX DEBUG: Method merged with bridge method: without([Lcom/fasterxml/jackson/databind/MapperFeature;)Lcom/fasterxml/jackson/databind/cfg/MapperConfig; */
    @Override // com.fasterxml.jackson.databind.cfg.MapperConfig
    public final T without(MapperFeature... mapperFeatureArr) {
        long j = this._mapperFeatures;
        for (MapperFeature mapperFeature : mapperFeatureArr) {
            j &= ~mapperFeature.getLongMask();
        }
        return j == this._mapperFeatures ? this : (T) _withMapperFeatures(j);
    }

    /* JADX DEBUG: Method merged with bridge method: with(Lcom/fasterxml/jackson/databind/MapperFeature;Z)Lcom/fasterxml/jackson/databind/cfg/MapperConfig; */
    @Override // com.fasterxml.jackson.databind.cfg.MapperConfig
    public final T with(MapperFeature mapperFeature, boolean z) {
        long longMask;
        if (z) {
            longMask = mapperFeature.getLongMask() | this._mapperFeatures;
        } else {
            longMask = (~mapperFeature.getLongMask()) & this._mapperFeatures;
        }
        return longMask == this._mapperFeatures ? this : (T) _withMapperFeatures(longMask);
    }

    public final T with(VT vt) {
        return (T) _with(_datatypeFeatures().with(vt));
    }

    public final T withFeatures(VT... vtArr) {
        return (T) _with(_datatypeFeatures().withFeatures(vtArr));
    }

    public final T without(VT vt) {
        return (T) _with(_datatypeFeatures().without(vt));
    }

    public final T withoutFeatures(VT... vtArr) {
        return (T) _with(_datatypeFeatures().withoutFeatures(vtArr));
    }

    public final T with(VT vt, boolean z) {
        DatatypeFeatures datatypeFeatures_datatypeFeatures = _datatypeFeatures();
        return (T) _with(z ? datatypeFeatures_datatypeFeatures.with(vt) : datatypeFeatures_datatypeFeatures.without(vt));
    }

    public final T with(AnnotationIntrospector annotationIntrospector) {
        return (T) _withBase(this._base.withAnnotationIntrospector(annotationIntrospector));
    }

    public final T withAppendedAnnotationIntrospector(AnnotationIntrospector annotationIntrospector) {
        return (T) _withBase(this._base.withAppendedAnnotationIntrospector(annotationIntrospector));
    }

    public final T withInsertedAnnotationIntrospector(AnnotationIntrospector annotationIntrospector) {
        return (T) _withBase(this._base.withInsertedAnnotationIntrospector(annotationIntrospector));
    }

    public final T with(WX wx) {
        return (T) _withBase(this._base.withClassIntrospector(wx));
    }

    public T withAttributes(Map<?, ?> map) {
        return (T) with(getAttributes().withSharedAttributes(map));
    }

    public T withAttribute(Object obj, Object obj2) {
        return (T) with(getAttributes().withSharedAttribute(obj, obj2));
    }

    public T withoutAttribute(Object obj) {
        return (T) with(getAttributes().withoutSharedAttribute(obj));
    }

    public final T with(TypeFactory typeFactory) {
        return (T) _withBase(this._base.withTypeFactory(typeFactory));
    }

    public final T with(InterfaceC5599Xx<?> interfaceC5599Xx) {
        return (T) _withBase(this._base.withTypeResolverBuilder(interfaceC5599Xx));
    }

    public final T with(PropertyNamingStrategy propertyNamingStrategy) {
        return (T) _withBase(this._base.withPropertyNamingStrategy(propertyNamingStrategy));
    }

    public final T with(AccessorNamingStrategy.Provider provider) {
        return (T) _withBase(this._base.withAccessorNaming(provider));
    }

    public final T with(VQ vq) {
        return (T) _withBase(this._base.withHandlerInstantiator(vq));
    }

    public final T with(Base64Variant base64Variant) {
        return (T) _withBase(this._base.with(base64Variant));
    }

    public T with(DateFormat dateFormat) {
        return (T) _withBase(this._base.withDateFormat(dateFormat));
    }

    public final T with(Locale locale) {
        return (T) _withBase(this._base.with(locale));
    }

    public final T with(TimeZone timeZone) {
        return (T) _withBase(this._base.with(timeZone));
    }

    public T withRootName(String str) {
        if (str == null) {
            return (T) withRootName((PropertyName) null);
        }
        return (T) withRootName(PropertyName.construct(str));
    }

    @Deprecated
    public final String getRootName() {
        PropertyName propertyName = this._rootName;
        if (propertyName == null) {
            return null;
        }
        return propertyName.getSimpleName();
    }

    @Override // com.fasterxml.jackson.databind.cfg.MapperConfig
    public final VU getConfigOverride(Class<?> cls) {
        VU vuFindOverride = this._configOverrides.findOverride(cls);
        return vuFindOverride == null ? EMPTY_OVERRIDE : vuFindOverride;
    }

    @Override // com.fasterxml.jackson.databind.cfg.MapperConfig
    public final VU findConfigOverride(Class<?> cls) {
        return this._configOverrides.findOverride(cls);
    }

    @Override // com.fasterxml.jackson.databind.cfg.MapperConfig
    public final JsonInclude.Value getDefaultPropertyInclusion() {
        return this._configOverrides.getDefaultInclusion();
    }

    @Override // com.fasterxml.jackson.databind.cfg.MapperConfig
    public final JsonInclude.Value getDefaultPropertyInclusion(Class<?> cls) {
        JsonInclude.Value include = getConfigOverride(cls).getInclude();
        JsonInclude.Value defaultPropertyInclusion = getDefaultPropertyInclusion();
        return defaultPropertyInclusion == null ? include : defaultPropertyInclusion.withOverrides(include);
    }

    @Override // com.fasterxml.jackson.databind.cfg.MapperConfig
    public final JsonInclude.Value getDefaultInclusion(Class<?> cls, Class<?> cls2) {
        JsonInclude.Value includeAsProperty = getConfigOverride(cls2).getIncludeAsProperty();
        JsonInclude.Value defaultPropertyInclusion = getDefaultPropertyInclusion(cls);
        return defaultPropertyInclusion == null ? includeAsProperty : defaultPropertyInclusion.withOverrides(includeAsProperty);
    }

    @Override // com.fasterxml.jackson.databind.cfg.MapperConfig
    public final JsonFormat.Value getDefaultPropertyFormat(Class<?> cls) {
        return this._configOverrides.findFormatDefaults(cls);
    }

    @Override // com.fasterxml.jackson.databind.cfg.MapperConfig
    public final JsonIgnoreProperties.Value getDefaultPropertyIgnorals(Class<?> cls) {
        JsonIgnoreProperties.Value ignorals;
        VU vuFindOverride = this._configOverrides.findOverride(cls);
        if (vuFindOverride == null || (ignorals = vuFindOverride.getIgnorals()) == null) {
            return null;
        }
        return ignorals;
    }

    @Override // com.fasterxml.jackson.databind.cfg.MapperConfig
    public final JsonIgnoreProperties.Value getDefaultPropertyIgnorals(Class<?> cls, WJ wj) {
        AnnotationIntrospector annotationIntrospector = getAnnotationIntrospector();
        return JsonIgnoreProperties.Value.merge(annotationIntrospector == null ? null : annotationIntrospector.findPropertyIgnoralByName(this, wj), getDefaultPropertyIgnorals(cls));
    }

    @Override // com.fasterxml.jackson.databind.cfg.MapperConfig
    public final JsonIncludeProperties.Value getDefaultPropertyInclusions(Class<?> cls, WJ wj) {
        AnnotationIntrospector annotationIntrospector = getAnnotationIntrospector();
        if (annotationIntrospector == null) {
            return null;
        }
        return annotationIntrospector.findPropertyInclusionByName(this, wj);
    }

    @Override // com.fasterxml.jackson.databind.cfg.MapperConfig
    public final VisibilityChecker<?> getDefaultVisibilityChecker() {
        VisibilityChecker<?> defaultVisibility = this._configOverrides.getDefaultVisibility();
        long j = this._mapperFeatures;
        long j2 = AUTO_DETECT_MASK;
        if ((j & j2) == j2) {
            return defaultVisibility;
        }
        if (!isEnabled(MapperFeature.AUTO_DETECT_FIELDS)) {
            defaultVisibility = defaultVisibility.withFieldVisibility(JsonAutoDetect.Visibility.NONE);
        }
        if (!isEnabled(MapperFeature.AUTO_DETECT_GETTERS)) {
            defaultVisibility = defaultVisibility.withGetterVisibility(JsonAutoDetect.Visibility.NONE);
        }
        if (!isEnabled(MapperFeature.AUTO_DETECT_IS_GETTERS)) {
            defaultVisibility = defaultVisibility.withIsGetterVisibility(JsonAutoDetect.Visibility.NONE);
        }
        if (!isEnabled(MapperFeature.AUTO_DETECT_SETTERS)) {
            defaultVisibility = defaultVisibility.withSetterVisibility(JsonAutoDetect.Visibility.NONE);
        }
        return !isEnabled(MapperFeature.AUTO_DETECT_CREATORS) ? defaultVisibility.withCreatorVisibility(JsonAutoDetect.Visibility.NONE) : defaultVisibility;
    }

    @Override // com.fasterxml.jackson.databind.cfg.MapperConfig
    public final VisibilityChecker<?> getDefaultVisibilityChecker(Class<?> cls, WJ wj) {
        VisibilityChecker<?> defaultVisibilityChecker;
        if (C5619Yr.fARcdN(cls)) {
            defaultVisibilityChecker = VisibilityChecker.Std.allPublicInstance();
        } else {
            defaultVisibilityChecker = getDefaultVisibilityChecker();
        }
        AnnotationIntrospector annotationIntrospector = getAnnotationIntrospector();
        if (annotationIntrospector != null) {
            defaultVisibilityChecker = annotationIntrospector.findAutoDetectVisibility(wj, defaultVisibilityChecker);
        }
        VU vuFindOverride = this._configOverrides.findOverride(cls);
        return vuFindOverride != null ? defaultVisibilityChecker.withOverrides(vuFindOverride.getVisibility()) : defaultVisibilityChecker;
    }

    @Override // com.fasterxml.jackson.databind.cfg.MapperConfig
    public final JsonSetter.Value getDefaultSetterInfo() {
        return this._configOverrides.getDefaultSetterInfo();
    }

    @Override // com.fasterxml.jackson.databind.cfg.MapperConfig
    public Boolean getDefaultMergeable() {
        return this._configOverrides.getDefaultMergeable();
    }

    @Override // com.fasterxml.jackson.databind.cfg.MapperConfig
    public Boolean getDefaultMergeable(Class<?> cls) {
        Boolean mergeable;
        VU vuFindOverride = this._configOverrides.findOverride(cls);
        return (vuFindOverride == null || (mergeable = vuFindOverride.getMergeable()) == null) ? this._configOverrides.getDefaultMergeable() : mergeable;
    }

    @Override // com.fasterxml.jackson.databind.cfg.MapperConfig
    public PropertyName findRootName(JavaType javaType) {
        PropertyName propertyName = this._rootName;
        return propertyName != null ? propertyName : this._rootNames.findRootName(javaType, this);
    }

    @Override // com.fasterxml.jackson.databind.cfg.MapperConfig
    public PropertyName findRootName(Class<?> cls) {
        PropertyName propertyName = this._rootName;
        return propertyName != null ? propertyName : this._rootNames.findRootName(cls, this);
    }

    @Override // o.WX.TaskDescription
    public final Class<?> findMixInClassFor(Class<?> cls) {
        return this._mixIns.findMixInClassFor(cls);
    }

    @Override // o.WX.TaskDescription
    public WX.TaskDescription copy() {
        throw new UnsupportedOperationException();
    }

    public final int mixInCount() {
        return this._mixIns.localSize();
    }
}
