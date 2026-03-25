package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.json.JsonWriteFeature;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.cfg.BaseSettings;
import com.fasterxml.jackson.databind.cfg.ConfigOverrides;
import com.fasterxml.jackson.databind.cfg.ContextAttributes;
import com.fasterxml.jackson.databind.cfg.DatatypeFeatures;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.cfg.MapperConfigBase;
import com.fasterxml.jackson.databind.introspect.SimpleMixInResolver;
import com.fasterxml.jackson.databind.util.RootNameLookup;
import java.io.Serializable;
import java.text.DateFormat;
import o.AbstractC5549Vz;
import o.AbstractC5595Xt;
import o.InterfaceC5498Ub;
import o.InterfaceC5504Uh;
import o.InterfaceC5539Vp;
import o.VT;
import o.XS;

/* JADX INFO: loaded from: classes21.dex */
public final class SerializationConfig extends MapperConfigBase<SerializationFeature, SerializationConfig> implements Serializable {
    protected static final InterfaceC5504Uh DEFAULT_PRETTY_PRINTER = new DefaultPrettyPrinter();
    private static final int SER_FEATURE_DEFAULTS = MapperConfig.collectFeatureDefaults(SerializationFeature.class);
    private static final long serialVersionUID = 1;
    protected final InterfaceC5504Uh _defaultPrettyPrinter;
    protected final XS _filterProvider;
    protected final int _formatWriteFeatures;
    protected final int _formatWriteFeaturesToChange;
    protected final int _generatorFeatures;
    protected final int _generatorFeaturesToChange;
    protected final int _serFeatures;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InterfaceC5504Uh getDefaultPrettyPrinter() {
        return this._defaultPrettyPrinter;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public XS getFilterProvider() {
        return this._filterProvider;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getSerializationFeatures() {
        return this._serFeatures;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean hasSerializationFeatures(int i) {
        return (this._serFeatures & i) == i;
    }

    @Override // com.fasterxml.jackson.databind.cfg.MapperConfigBase
    public /* bridge */ /* synthetic */ MapperConfigBase withView(Class cls) {
        return withView((Class<?>) cls);
    }

    public SerializationConfig(BaseSettings baseSettings, AbstractC5595Xt abstractC5595Xt, SimpleMixInResolver simpleMixInResolver, RootNameLookup rootNameLookup, ConfigOverrides configOverrides, DatatypeFeatures datatypeFeatures) {
        super(baseSettings, abstractC5595Xt, simpleMixInResolver, rootNameLookup, configOverrides, datatypeFeatures);
        this._serFeatures = SER_FEATURE_DEFAULTS;
        this._filterProvider = null;
        this._defaultPrettyPrinter = DEFAULT_PRETTY_PRINTER;
        this._generatorFeatures = 0;
        this._generatorFeaturesToChange = 0;
        this._formatWriteFeatures = 0;
        this._formatWriteFeaturesToChange = 0;
    }

    @Deprecated
    public SerializationConfig(BaseSettings baseSettings, AbstractC5595Xt abstractC5595Xt, SimpleMixInResolver simpleMixInResolver, RootNameLookup rootNameLookup, ConfigOverrides configOverrides) {
        this(baseSettings, abstractC5595Xt, simpleMixInResolver, rootNameLookup, configOverrides, DatatypeFeatures.defaultFeatures());
    }

    public SerializationConfig(SerializationConfig serializationConfig, AbstractC5595Xt abstractC5595Xt, SimpleMixInResolver simpleMixInResolver, RootNameLookup rootNameLookup, ConfigOverrides configOverrides) {
        super(serializationConfig, abstractC5595Xt, simpleMixInResolver, rootNameLookup, configOverrides);
        this._serFeatures = serializationConfig._serFeatures;
        this._filterProvider = serializationConfig._filterProvider;
        this._defaultPrettyPrinter = serializationConfig._defaultPrettyPrinter;
        this._generatorFeatures = serializationConfig._generatorFeatures;
        this._generatorFeaturesToChange = serializationConfig._generatorFeaturesToChange;
        this._formatWriteFeatures = serializationConfig._formatWriteFeatures;
        this._formatWriteFeaturesToChange = serializationConfig._formatWriteFeaturesToChange;
    }

    private SerializationConfig(SerializationConfig serializationConfig, AbstractC5595Xt abstractC5595Xt) {
        super(serializationConfig, abstractC5595Xt);
        this._serFeatures = serializationConfig._serFeatures;
        this._filterProvider = serializationConfig._filterProvider;
        this._defaultPrettyPrinter = serializationConfig._defaultPrettyPrinter;
        this._generatorFeatures = serializationConfig._generatorFeatures;
        this._generatorFeaturesToChange = serializationConfig._generatorFeaturesToChange;
        this._formatWriteFeatures = serializationConfig._formatWriteFeatures;
        this._formatWriteFeaturesToChange = serializationConfig._formatWriteFeaturesToChange;
    }

    private SerializationConfig(SerializationConfig serializationConfig, long j, int i, int i2, int i3, int i4, int i5) {
        super(serializationConfig, j);
        this._serFeatures = i;
        this._filterProvider = serializationConfig._filterProvider;
        this._defaultPrettyPrinter = serializationConfig._defaultPrettyPrinter;
        this._generatorFeatures = i2;
        this._generatorFeaturesToChange = i3;
        this._formatWriteFeatures = i4;
        this._formatWriteFeaturesToChange = i5;
    }

    private SerializationConfig(SerializationConfig serializationConfig, BaseSettings baseSettings) {
        super(serializationConfig, baseSettings);
        this._serFeatures = serializationConfig._serFeatures;
        this._filterProvider = serializationConfig._filterProvider;
        this._defaultPrettyPrinter = serializationConfig._defaultPrettyPrinter;
        this._generatorFeatures = serializationConfig._generatorFeatures;
        this._generatorFeaturesToChange = serializationConfig._generatorFeaturesToChange;
        this._formatWriteFeatures = serializationConfig._formatWriteFeatures;
        this._formatWriteFeaturesToChange = serializationConfig._formatWriteFeaturesToChange;
    }

    private SerializationConfig(SerializationConfig serializationConfig, XS xs) {
        super(serializationConfig);
        this._serFeatures = serializationConfig._serFeatures;
        this._filterProvider = xs;
        this._defaultPrettyPrinter = serializationConfig._defaultPrettyPrinter;
        this._generatorFeatures = serializationConfig._generatorFeatures;
        this._generatorFeaturesToChange = serializationConfig._generatorFeaturesToChange;
        this._formatWriteFeatures = serializationConfig._formatWriteFeatures;
        this._formatWriteFeaturesToChange = serializationConfig._formatWriteFeaturesToChange;
    }

    private SerializationConfig(SerializationConfig serializationConfig, Class<?> cls) {
        super(serializationConfig, cls);
        this._serFeatures = serializationConfig._serFeatures;
        this._filterProvider = serializationConfig._filterProvider;
        this._defaultPrettyPrinter = serializationConfig._defaultPrettyPrinter;
        this._generatorFeatures = serializationConfig._generatorFeatures;
        this._generatorFeaturesToChange = serializationConfig._generatorFeaturesToChange;
        this._formatWriteFeatures = serializationConfig._formatWriteFeatures;
        this._formatWriteFeaturesToChange = serializationConfig._formatWriteFeaturesToChange;
    }

    private SerializationConfig(SerializationConfig serializationConfig, PropertyName propertyName) {
        super(serializationConfig, propertyName);
        this._serFeatures = serializationConfig._serFeatures;
        this._filterProvider = serializationConfig._filterProvider;
        this._defaultPrettyPrinter = serializationConfig._defaultPrettyPrinter;
        this._generatorFeatures = serializationConfig._generatorFeatures;
        this._generatorFeaturesToChange = serializationConfig._generatorFeaturesToChange;
        this._formatWriteFeatures = serializationConfig._formatWriteFeatures;
        this._formatWriteFeaturesToChange = serializationConfig._formatWriteFeaturesToChange;
    }

    public SerializationConfig(SerializationConfig serializationConfig, ContextAttributes contextAttributes) {
        super(serializationConfig, contextAttributes);
        this._serFeatures = serializationConfig._serFeatures;
        this._filterProvider = serializationConfig._filterProvider;
        this._defaultPrettyPrinter = serializationConfig._defaultPrettyPrinter;
        this._generatorFeatures = serializationConfig._generatorFeatures;
        this._generatorFeaturesToChange = serializationConfig._generatorFeaturesToChange;
        this._formatWriteFeatures = serializationConfig._formatWriteFeatures;
        this._formatWriteFeaturesToChange = serializationConfig._formatWriteFeaturesToChange;
    }

    public SerializationConfig(SerializationConfig serializationConfig, SimpleMixInResolver simpleMixInResolver) {
        super(serializationConfig, simpleMixInResolver);
        this._serFeatures = serializationConfig._serFeatures;
        this._filterProvider = serializationConfig._filterProvider;
        this._defaultPrettyPrinter = serializationConfig._defaultPrettyPrinter;
        this._generatorFeatures = serializationConfig._generatorFeatures;
        this._generatorFeaturesToChange = serializationConfig._generatorFeaturesToChange;
        this._formatWriteFeatures = serializationConfig._formatWriteFeatures;
        this._formatWriteFeaturesToChange = serializationConfig._formatWriteFeaturesToChange;
    }

    public SerializationConfig(SerializationConfig serializationConfig, InterfaceC5504Uh interfaceC5504Uh) {
        super(serializationConfig);
        this._serFeatures = serializationConfig._serFeatures;
        this._filterProvider = serializationConfig._filterProvider;
        this._defaultPrettyPrinter = interfaceC5504Uh;
        this._generatorFeatures = serializationConfig._generatorFeatures;
        this._generatorFeaturesToChange = serializationConfig._generatorFeaturesToChange;
        this._formatWriteFeatures = serializationConfig._formatWriteFeatures;
        this._formatWriteFeaturesToChange = serializationConfig._formatWriteFeaturesToChange;
    }

    public SerializationConfig(SerializationConfig serializationConfig, DatatypeFeatures datatypeFeatures) {
        super(serializationConfig, datatypeFeatures);
        this._serFeatures = serializationConfig._serFeatures;
        this._filterProvider = serializationConfig._filterProvider;
        this._defaultPrettyPrinter = serializationConfig._defaultPrettyPrinter;
        this._generatorFeatures = serializationConfig._generatorFeatures;
        this._generatorFeaturesToChange = serializationConfig._generatorFeaturesToChange;
        this._formatWriteFeatures = serializationConfig._formatWriteFeatures;
        this._formatWriteFeaturesToChange = serializationConfig._formatWriteFeaturesToChange;
    }

    /* JADX DEBUG: Method merged with bridge method: _withBase(Lcom/fasterxml/jackson/databind/cfg/BaseSettings;)Lcom/fasterxml/jackson/databind/cfg/MapperConfigBase; */
    @Override // com.fasterxml.jackson.databind.cfg.MapperConfigBase
    public final SerializationConfig _withBase(BaseSettings baseSettings) {
        return this._base == baseSettings ? this : new SerializationConfig(this, baseSettings);
    }

    /* JADX DEBUG: Method merged with bridge method: _withMapperFeatures(J)Lcom/fasterxml/jackson/databind/cfg/MapperConfigBase; */
    @Override // com.fasterxml.jackson.databind.cfg.MapperConfigBase
    public final SerializationConfig _withMapperFeatures(long j) {
        return new SerializationConfig(this, j, this._serFeatures, this._generatorFeatures, this._generatorFeaturesToChange, this._formatWriteFeatures, this._formatWriteFeaturesToChange);
    }

    /* JADX DEBUG: Method merged with bridge method: _with(Lcom/fasterxml/jackson/databind/cfg/DatatypeFeatures;)Lcom/fasterxml/jackson/databind/cfg/MapperConfigBase; */
    @Override // com.fasterxml.jackson.databind.cfg.MapperConfigBase
    public final SerializationConfig _with(DatatypeFeatures datatypeFeatures) {
        return new SerializationConfig(this, datatypeFeatures);
    }

    /* JADX DEBUG: Method merged with bridge method: withRootName(Lcom/fasterxml/jackson/databind/PropertyName;)Lcom/fasterxml/jackson/databind/cfg/MapperConfigBase; */
    @Override // com.fasterxml.jackson.databind.cfg.MapperConfigBase
    public SerializationConfig withRootName(PropertyName propertyName) {
        PropertyName propertyName2 = this._rootName;
        if (propertyName == null) {
            if (propertyName2 == null) {
                return this;
            }
        } else if (propertyName.equals(propertyName2)) {
            return this;
        }
        return new SerializationConfig(this, propertyName);
    }

    /* JADX DEBUG: Method merged with bridge method: with(Lo/Xt;)Lcom/fasterxml/jackson/databind/cfg/MapperConfigBase; */
    @Override // com.fasterxml.jackson.databind.cfg.MapperConfigBase
    public SerializationConfig with(AbstractC5595Xt abstractC5595Xt) {
        return abstractC5595Xt == this._subtypeResolver ? this : new SerializationConfig(this, abstractC5595Xt);
    }

    @Override // com.fasterxml.jackson.databind.cfg.MapperConfigBase
    public SerializationConfig withView(Class<?> cls) {
        return this._view == cls ? this : new SerializationConfig(this, cls);
    }

    /* JADX DEBUG: Method merged with bridge method: with(Lcom/fasterxml/jackson/databind/cfg/ContextAttributes;)Lcom/fasterxml/jackson/databind/cfg/MapperConfigBase; */
    @Override // com.fasterxml.jackson.databind.cfg.MapperConfigBase
    public SerializationConfig with(ContextAttributes contextAttributes) {
        return contextAttributes == this._attributes ? this : new SerializationConfig(this, contextAttributes);
    }

    /* JADX DEBUG: Method merged with bridge method: with(Ljava/text/DateFormat;)Lcom/fasterxml/jackson/databind/cfg/MapperConfigBase; */
    @Override // com.fasterxml.jackson.databind.cfg.MapperConfigBase
    public SerializationConfig with(DateFormat dateFormat) {
        SerializationConfig serializationConfig = (SerializationConfig) super.with(dateFormat);
        if (dateFormat == null) {
            return serializationConfig.with(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
        }
        return serializationConfig.without(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
    }

    public SerializationConfig with(SerializationFeature serializationFeature) {
        int mask = this._serFeatures | serializationFeature.getMask();
        return mask == this._serFeatures ? this : new SerializationConfig(this, this._mapperFeatures, mask, this._generatorFeatures, this._generatorFeaturesToChange, this._formatWriteFeatures, this._formatWriteFeaturesToChange);
    }

    public SerializationConfig with(SerializationFeature serializationFeature, SerializationFeature... serializationFeatureArr) {
        int i = this._serFeatures;
        int mask = serializationFeature.getMask() | i;
        int mask2 = mask;
        for (SerializationFeature serializationFeature2 : serializationFeatureArr) {
            mask2 |= serializationFeature2.getMask();
        }
        return mask2 == this._serFeatures ? this : new SerializationConfig(this, this._mapperFeatures, mask2, this._generatorFeatures, this._generatorFeaturesToChange, this._formatWriteFeatures, this._formatWriteFeaturesToChange);
    }

    public SerializationConfig withFeatures(SerializationFeature... serializationFeatureArr) {
        int mask = this._serFeatures;
        for (SerializationFeature serializationFeature : serializationFeatureArr) {
            mask |= serializationFeature.getMask();
        }
        return mask == this._serFeatures ? this : new SerializationConfig(this, this._mapperFeatures, mask, this._generatorFeatures, this._generatorFeaturesToChange, this._formatWriteFeatures, this._formatWriteFeaturesToChange);
    }

    public SerializationConfig without(SerializationFeature serializationFeature) {
        int i = this._serFeatures & (~serializationFeature.getMask());
        return i == this._serFeatures ? this : new SerializationConfig(this, this._mapperFeatures, i, this._generatorFeatures, this._generatorFeaturesToChange, this._formatWriteFeatures, this._formatWriteFeaturesToChange);
    }

    public SerializationConfig without(SerializationFeature serializationFeature, SerializationFeature... serializationFeatureArr) {
        int i = (~serializationFeature.getMask()) & this._serFeatures;
        int i2 = i;
        for (SerializationFeature serializationFeature2 : serializationFeatureArr) {
            i2 &= ~serializationFeature2.getMask();
        }
        return i2 == this._serFeatures ? this : new SerializationConfig(this, this._mapperFeatures, i2, this._generatorFeatures, this._generatorFeaturesToChange, this._formatWriteFeatures, this._formatWriteFeaturesToChange);
    }

    public SerializationConfig withoutFeatures(SerializationFeature... serializationFeatureArr) {
        int i = this._serFeatures;
        for (SerializationFeature serializationFeature : serializationFeatureArr) {
            i &= ~serializationFeature.getMask();
        }
        return i == this._serFeatures ? this : new SerializationConfig(this, this._mapperFeatures, i, this._generatorFeatures, this._generatorFeaturesToChange, this._formatWriteFeatures, this._formatWriteFeaturesToChange);
    }

    public SerializationConfig with(JsonGenerator.Feature feature) {
        int mask = this._generatorFeatures | feature.getMask();
        int mask2 = this._generatorFeaturesToChange | feature.getMask();
        return (this._generatorFeatures == mask && this._generatorFeaturesToChange == mask2) ? this : new SerializationConfig(this, this._mapperFeatures, this._serFeatures, mask, mask2, this._formatWriteFeatures, this._formatWriteFeaturesToChange);
    }

    public SerializationConfig withFeatures(JsonGenerator.Feature... featureArr) {
        int i = this._generatorFeatures;
        int i2 = i;
        int i3 = this._generatorFeaturesToChange;
        for (JsonGenerator.Feature feature : featureArr) {
            int mask = feature.getMask();
            i2 |= mask;
            i3 |= mask;
        }
        return (this._generatorFeatures == i2 && this._generatorFeaturesToChange == i3) ? this : new SerializationConfig(this, this._mapperFeatures, this._serFeatures, i2, i3, this._formatWriteFeatures, this._formatWriteFeaturesToChange);
    }

    public SerializationConfig without(JsonGenerator.Feature feature) {
        int i = this._generatorFeatures & (~feature.getMask());
        int mask = this._generatorFeaturesToChange | feature.getMask();
        return (this._generatorFeatures == i && this._generatorFeaturesToChange == mask) ? this : new SerializationConfig(this, this._mapperFeatures, this._serFeatures, i, mask, this._formatWriteFeatures, this._formatWriteFeaturesToChange);
    }

    public SerializationConfig withoutFeatures(JsonGenerator.Feature... featureArr) {
        int i = this._generatorFeatures;
        int i2 = i;
        int i3 = this._generatorFeaturesToChange;
        for (JsonGenerator.Feature feature : featureArr) {
            int mask = feature.getMask();
            i2 &= ~mask;
            i3 |= mask;
        }
        return (this._generatorFeatures == i2 && this._generatorFeaturesToChange == i3) ? this : new SerializationConfig(this, this._mapperFeatures, this._serFeatures, i2, i3, this._formatWriteFeatures, this._formatWriteFeaturesToChange);
    }

    public SerializationConfig with(InterfaceC5498Ub interfaceC5498Ub) {
        if (interfaceC5498Ub instanceof JsonWriteFeature) {
            return _withJsonWriteFeatures(interfaceC5498Ub);
        }
        int mask = this._formatWriteFeatures | interfaceC5498Ub.getMask();
        int mask2 = this._formatWriteFeaturesToChange | interfaceC5498Ub.getMask();
        return (this._formatWriteFeatures == mask && this._formatWriteFeaturesToChange == mask2) ? this : new SerializationConfig(this, this._mapperFeatures, this._serFeatures, this._generatorFeatures, this._generatorFeaturesToChange, mask, mask2);
    }

    public SerializationConfig withFeatures(InterfaceC5498Ub... interfaceC5498UbArr) {
        if (interfaceC5498UbArr.length > 0 && (interfaceC5498UbArr[0] instanceof JsonWriteFeature)) {
            return _withJsonWriteFeatures(interfaceC5498UbArr);
        }
        int i = this._formatWriteFeatures;
        int i2 = i;
        int i3 = this._formatWriteFeaturesToChange;
        for (InterfaceC5498Ub interfaceC5498Ub : interfaceC5498UbArr) {
            int mask = interfaceC5498Ub.getMask();
            i2 |= mask;
            i3 |= mask;
        }
        return (this._formatWriteFeatures == i2 && this._formatWriteFeaturesToChange == i3) ? this : new SerializationConfig(this, this._mapperFeatures, this._serFeatures, this._generatorFeatures, this._generatorFeaturesToChange, i2, i3);
    }

    public SerializationConfig without(InterfaceC5498Ub interfaceC5498Ub) {
        if (interfaceC5498Ub instanceof JsonWriteFeature) {
            return _withoutJsonWriteFeatures(interfaceC5498Ub);
        }
        int i = this._formatWriteFeatures & (~interfaceC5498Ub.getMask());
        int mask = this._formatWriteFeaturesToChange | interfaceC5498Ub.getMask();
        return (this._formatWriteFeatures == i && this._formatWriteFeaturesToChange == mask) ? this : new SerializationConfig(this, this._mapperFeatures, this._serFeatures, this._generatorFeatures, this._generatorFeaturesToChange, i, mask);
    }

    public SerializationConfig withoutFeatures(InterfaceC5498Ub... interfaceC5498UbArr) {
        if (interfaceC5498UbArr.length > 0 && (interfaceC5498UbArr[0] instanceof JsonWriteFeature)) {
            return _withoutJsonWriteFeatures(interfaceC5498UbArr);
        }
        int i = this._formatWriteFeatures;
        int i2 = i;
        int i3 = this._formatWriteFeaturesToChange;
        for (InterfaceC5498Ub interfaceC5498Ub : interfaceC5498UbArr) {
            int mask = interfaceC5498Ub.getMask();
            i2 &= ~mask;
            i3 |= mask;
        }
        return (this._formatWriteFeatures == i2 && this._formatWriteFeaturesToChange == i3) ? this : new SerializationConfig(this, this._mapperFeatures, this._serFeatures, this._generatorFeatures, this._generatorFeaturesToChange, i2, i3);
    }

    private SerializationConfig _withJsonWriteFeatures(InterfaceC5498Ub... interfaceC5498UbArr) {
        JsonGenerator.Feature featureMappedFeature;
        int i = this._generatorFeatures;
        int i2 = this._generatorFeaturesToChange;
        int i3 = this._formatWriteFeatures;
        int i4 = i2;
        int i5 = i3;
        int i6 = this._formatWriteFeaturesToChange;
        int i7 = i;
        for (InterfaceC5498Ub interfaceC5498Ub : interfaceC5498UbArr) {
            int mask = interfaceC5498Ub.getMask();
            i5 |= mask;
            i6 |= mask;
            if ((interfaceC5498Ub instanceof JsonWriteFeature) && (featureMappedFeature = ((JsonWriteFeature) interfaceC5498Ub).mappedFeature()) != null) {
                int mask2 = featureMappedFeature.getMask();
                i7 |= mask2;
                i4 |= mask2;
            }
        }
        return (this._formatWriteFeatures == i5 && this._formatWriteFeaturesToChange == i6 && this._generatorFeatures == i7 && this._generatorFeaturesToChange == i4) ? this : new SerializationConfig(this, this._mapperFeatures, this._serFeatures, i7, i4, i5, i6);
    }

    private SerializationConfig _withoutJsonWriteFeatures(InterfaceC5498Ub... interfaceC5498UbArr) {
        JsonGenerator.Feature featureMappedFeature;
        int i = this._generatorFeatures;
        int i2 = this._generatorFeaturesToChange;
        int i3 = this._formatWriteFeatures;
        int i4 = i2;
        int i5 = i3;
        int i6 = this._formatWriteFeaturesToChange;
        int i7 = i;
        for (InterfaceC5498Ub interfaceC5498Ub : interfaceC5498UbArr) {
            int mask = interfaceC5498Ub.getMask();
            i5 &= ~mask;
            i6 |= mask;
            if ((interfaceC5498Ub instanceof JsonWriteFeature) && (featureMappedFeature = ((JsonWriteFeature) interfaceC5498Ub).mappedFeature()) != null) {
                int mask2 = featureMappedFeature.getMask();
                i7 &= ~mask2;
                i4 |= mask2;
            }
        }
        return (this._formatWriteFeatures == i5 && this._formatWriteFeaturesToChange == i6 && this._generatorFeatures == i7 && this._generatorFeaturesToChange == i4) ? this : new SerializationConfig(this, this._mapperFeatures, this._serFeatures, i7, i4, i5, i6);
    }

    public SerializationConfig withFilters(XS xs) {
        return xs == this._filterProvider ? this : new SerializationConfig(this, xs);
    }

    @Deprecated
    public SerializationConfig withPropertyInclusion(JsonInclude.Value value) {
        this._configOverrides.setDefaultInclusion(value);
        return this;
    }

    public SerializationConfig withDefaultPrettyPrinter(InterfaceC5504Uh interfaceC5504Uh) {
        return this._defaultPrettyPrinter == interfaceC5504Uh ? this : new SerializationConfig(this, interfaceC5504Uh);
    }

    public InterfaceC5504Uh constructDefaultPrettyPrinter() {
        InterfaceC5504Uh interfaceC5504Uh = this._defaultPrettyPrinter;
        return interfaceC5504Uh instanceof InterfaceC5539Vp ? (InterfaceC5504Uh) ((InterfaceC5539Vp) interfaceC5504Uh).createInstance() : interfaceC5504Uh;
    }

    public void initialize(JsonGenerator jsonGenerator) {
        InterfaceC5504Uh interfaceC5504UhConstructDefaultPrettyPrinter;
        if (SerializationFeature.INDENT_OUTPUT.enabledIn(this._serFeatures) && jsonGenerator.djBIcL() == null && (interfaceC5504UhConstructDefaultPrettyPrinter = constructDefaultPrettyPrinter()) != null) {
            jsonGenerator.EZpvd(interfaceC5504UhConstructDefaultPrettyPrinter);
        }
        boolean zEnabledIn = SerializationFeature.WRITE_BIGDECIMAL_AS_PLAIN.enabledIn(this._serFeatures);
        int i = this._generatorFeaturesToChange;
        if (i != 0 || zEnabledIn) {
            int i2 = this._generatorFeatures;
            if (zEnabledIn) {
                int mask = JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN.getMask();
                i2 |= mask;
                i |= mask;
            }
            jsonGenerator.AEQbTJ(i2, i);
        }
        int i3 = this._formatWriteFeaturesToChange;
        if (i3 != 0) {
            jsonGenerator.copydefault(this._formatWriteFeatures, i3);
        }
    }

    @Deprecated
    public JsonInclude.Include getSerializationInclusion() {
        JsonInclude.Include valueInclusion = getDefaultPropertyInclusion().getValueInclusion();
        return valueInclusion == JsonInclude.Include.USE_DEFAULTS ? JsonInclude.Include.ALWAYS : valueInclusion;
    }

    @Override // com.fasterxml.jackson.databind.cfg.MapperConfig
    public boolean useRootWrapping() {
        if (this._rootName != null) {
            return !r0.isEmpty();
        }
        return isEnabled(SerializationFeature.WRAP_ROOT_VALUE);
    }

    public final boolean isEnabled(SerializationFeature serializationFeature) {
        return (serializationFeature.getMask() & this._serFeatures) != 0;
    }

    public final boolean isEnabled(JsonGenerator.Feature feature, JsonFactory jsonFactory) {
        if ((feature.getMask() & this._generatorFeaturesToChange) != 0) {
            return (feature.getMask() & this._generatorFeatures) != 0;
        }
        return jsonFactory.isEnabled(feature);
    }

    public final boolean isEnabled(VT vt) {
        return this._datatypeFeatures.isEnabled(vt);
    }

    public AbstractC5549Vz introspect(JavaType javaType) {
        return getClassIntrospector().forSerialization(this, javaType, this);
    }
}
