package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.json.JsonReadFeature;
import com.fasterxml.jackson.databind.cfg.BaseSettings;
import com.fasterxml.jackson.databind.cfg.CoercionAction;
import com.fasterxml.jackson.databind.cfg.CoercionConfigs;
import com.fasterxml.jackson.databind.cfg.CoercionInputShape;
import com.fasterxml.jackson.databind.cfg.ConfigOverrides;
import com.fasterxml.jackson.databind.cfg.ConstructorDetector;
import com.fasterxml.jackson.databind.cfg.ContextAttributes;
import com.fasterxml.jackson.databind.cfg.DatatypeFeatures;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.cfg.MapperConfigBase;
import com.fasterxml.jackson.databind.introspect.SimpleMixInResolver;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.type.LogicalType;
import com.fasterxml.jackson.databind.util.RootNameLookup;
import java.io.Serializable;
import java.util.Collection;
import o.AbstractC5549Vz;
import o.AbstractC5552Wc;
import o.AbstractC5595Xt;
import o.AbstractC5597Xv;
import o.C5620Ys;
import o.InterfaceC5497Ua;
import o.InterfaceC5498Ub;
import o.InterfaceC5599Xx;
import o.VT;
import o.WJ;

/* JADX INFO: loaded from: classes21.dex */
public final class DeserializationConfig extends MapperConfigBase<DeserializationFeature, DeserializationConfig> implements Serializable {
    private static final int DESER_FEATURE_DEFAULTS = MapperConfig.collectFeatureDefaults(DeserializationFeature.class);
    private static final long serialVersionUID = 2;
    protected final CoercionConfigs _coercionConfigs;
    protected final ConstructorDetector _ctorDetector;
    protected final int _deserFeatures;
    protected final int _formatReadFeatures;
    protected final int _formatReadFeaturesToChange;
    protected final JsonNodeFactory _nodeFactory;
    protected final int _parserFeatures;
    protected final int _parserFeaturesToChange;
    protected final C5620Ys<AbstractC5552Wc> _problemHandlers;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public BaseSettings getBaseSettings() {
        return this._base;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getDeserializationFeatures() {
        return this._deserFeatures;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JsonNodeFactory getNodeFactory() {
        return this._nodeFactory;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C5620Ys<AbstractC5552Wc> getProblemHandlers() {
        return this._problemHandlers;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean hasDeserializationFeatures(int i) {
        return (this._deserFeatures & i) == i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean hasSomeOfFeatures(int i) {
        return (i & this._deserFeatures) != 0;
    }

    @Override // com.fasterxml.jackson.databind.cfg.MapperConfigBase
    public /* bridge */ /* synthetic */ MapperConfigBase withView(Class cls) {
        return withView((Class<?>) cls);
    }

    public DeserializationConfig(BaseSettings baseSettings, AbstractC5595Xt abstractC5595Xt, SimpleMixInResolver simpleMixInResolver, RootNameLookup rootNameLookup, ConfigOverrides configOverrides, CoercionConfigs coercionConfigs, DatatypeFeatures datatypeFeatures) {
        super(baseSettings, abstractC5595Xt, simpleMixInResolver, rootNameLookup, configOverrides, datatypeFeatures);
        this._deserFeatures = DESER_FEATURE_DEFAULTS;
        this._problemHandlers = null;
        this._nodeFactory = JsonNodeFactory.instance;
        this._ctorDetector = null;
        this._coercionConfigs = coercionConfigs;
        this._parserFeatures = 0;
        this._parserFeaturesToChange = 0;
        this._formatReadFeatures = 0;
        this._formatReadFeaturesToChange = 0;
    }

    public DeserializationConfig(DeserializationConfig deserializationConfig, AbstractC5595Xt abstractC5595Xt, SimpleMixInResolver simpleMixInResolver, RootNameLookup rootNameLookup, ConfigOverrides configOverrides, CoercionConfigs coercionConfigs) {
        super(deserializationConfig, abstractC5595Xt, simpleMixInResolver, rootNameLookup, configOverrides);
        this._deserFeatures = deserializationConfig._deserFeatures;
        this._problemHandlers = deserializationConfig._problemHandlers;
        this._nodeFactory = deserializationConfig._nodeFactory;
        this._ctorDetector = deserializationConfig._ctorDetector;
        this._coercionConfigs = coercionConfigs;
        this._parserFeatures = deserializationConfig._parserFeatures;
        this._parserFeaturesToChange = deserializationConfig._parserFeaturesToChange;
        this._formatReadFeatures = deserializationConfig._formatReadFeatures;
        this._formatReadFeaturesToChange = deserializationConfig._formatReadFeaturesToChange;
    }

    private DeserializationConfig(DeserializationConfig deserializationConfig, long j, int i, int i2, int i3, int i4, int i5) {
        super(deserializationConfig, j);
        this._deserFeatures = i;
        this._problemHandlers = deserializationConfig._problemHandlers;
        this._nodeFactory = deserializationConfig._nodeFactory;
        this._coercionConfigs = deserializationConfig._coercionConfigs;
        this._ctorDetector = deserializationConfig._ctorDetector;
        this._parserFeatures = i2;
        this._parserFeaturesToChange = i3;
        this._formatReadFeatures = i4;
        this._formatReadFeaturesToChange = i5;
    }

    private DeserializationConfig(DeserializationConfig deserializationConfig, AbstractC5595Xt abstractC5595Xt) {
        super(deserializationConfig, abstractC5595Xt);
        this._deserFeatures = deserializationConfig._deserFeatures;
        this._problemHandlers = deserializationConfig._problemHandlers;
        this._nodeFactory = deserializationConfig._nodeFactory;
        this._coercionConfigs = deserializationConfig._coercionConfigs;
        this._ctorDetector = deserializationConfig._ctorDetector;
        this._parserFeatures = deserializationConfig._parserFeatures;
        this._parserFeaturesToChange = deserializationConfig._parserFeaturesToChange;
        this._formatReadFeatures = deserializationConfig._formatReadFeatures;
        this._formatReadFeaturesToChange = deserializationConfig._formatReadFeaturesToChange;
    }

    private DeserializationConfig(DeserializationConfig deserializationConfig, BaseSettings baseSettings) {
        super(deserializationConfig, baseSettings);
        this._deserFeatures = deserializationConfig._deserFeatures;
        this._problemHandlers = deserializationConfig._problemHandlers;
        this._nodeFactory = deserializationConfig._nodeFactory;
        this._coercionConfigs = deserializationConfig._coercionConfigs;
        this._ctorDetector = deserializationConfig._ctorDetector;
        this._parserFeatures = deserializationConfig._parserFeatures;
        this._parserFeaturesToChange = deserializationConfig._parserFeaturesToChange;
        this._formatReadFeatures = deserializationConfig._formatReadFeatures;
        this._formatReadFeaturesToChange = deserializationConfig._formatReadFeaturesToChange;
    }

    private DeserializationConfig(DeserializationConfig deserializationConfig, JsonNodeFactory jsonNodeFactory) {
        super(deserializationConfig);
        this._deserFeatures = deserializationConfig._deserFeatures;
        this._problemHandlers = deserializationConfig._problemHandlers;
        this._nodeFactory = jsonNodeFactory;
        this._coercionConfigs = deserializationConfig._coercionConfigs;
        this._ctorDetector = deserializationConfig._ctorDetector;
        this._parserFeatures = deserializationConfig._parserFeatures;
        this._parserFeaturesToChange = deserializationConfig._parserFeaturesToChange;
        this._formatReadFeatures = deserializationConfig._formatReadFeatures;
        this._formatReadFeaturesToChange = deserializationConfig._formatReadFeaturesToChange;
    }

    private DeserializationConfig(DeserializationConfig deserializationConfig, ConstructorDetector constructorDetector) {
        super(deserializationConfig);
        this._deserFeatures = deserializationConfig._deserFeatures;
        this._problemHandlers = deserializationConfig._problemHandlers;
        this._nodeFactory = deserializationConfig._nodeFactory;
        this._coercionConfigs = deserializationConfig._coercionConfigs;
        this._ctorDetector = constructorDetector;
        this._parserFeatures = deserializationConfig._parserFeatures;
        this._parserFeaturesToChange = deserializationConfig._parserFeaturesToChange;
        this._formatReadFeatures = deserializationConfig._formatReadFeatures;
        this._formatReadFeaturesToChange = deserializationConfig._formatReadFeaturesToChange;
    }

    private DeserializationConfig(DeserializationConfig deserializationConfig, C5620Ys<AbstractC5552Wc> c5620Ys) {
        super(deserializationConfig);
        this._deserFeatures = deserializationConfig._deserFeatures;
        this._problemHandlers = c5620Ys;
        this._nodeFactory = deserializationConfig._nodeFactory;
        this._coercionConfigs = deserializationConfig._coercionConfigs;
        this._ctorDetector = deserializationConfig._ctorDetector;
        this._parserFeatures = deserializationConfig._parserFeatures;
        this._parserFeaturesToChange = deserializationConfig._parserFeaturesToChange;
        this._formatReadFeatures = deserializationConfig._formatReadFeatures;
        this._formatReadFeaturesToChange = deserializationConfig._formatReadFeaturesToChange;
    }

    private DeserializationConfig(DeserializationConfig deserializationConfig, PropertyName propertyName) {
        super(deserializationConfig, propertyName);
        this._deserFeatures = deserializationConfig._deserFeatures;
        this._problemHandlers = deserializationConfig._problemHandlers;
        this._nodeFactory = deserializationConfig._nodeFactory;
        this._coercionConfigs = deserializationConfig._coercionConfigs;
        this._ctorDetector = deserializationConfig._ctorDetector;
        this._parserFeatures = deserializationConfig._parserFeatures;
        this._parserFeaturesToChange = deserializationConfig._parserFeaturesToChange;
        this._formatReadFeatures = deserializationConfig._formatReadFeatures;
        this._formatReadFeaturesToChange = deserializationConfig._formatReadFeaturesToChange;
    }

    private DeserializationConfig(DeserializationConfig deserializationConfig, Class<?> cls) {
        super(deserializationConfig, cls);
        this._deserFeatures = deserializationConfig._deserFeatures;
        this._problemHandlers = deserializationConfig._problemHandlers;
        this._nodeFactory = deserializationConfig._nodeFactory;
        this._coercionConfigs = deserializationConfig._coercionConfigs;
        this._ctorDetector = deserializationConfig._ctorDetector;
        this._parserFeatures = deserializationConfig._parserFeatures;
        this._parserFeaturesToChange = deserializationConfig._parserFeaturesToChange;
        this._formatReadFeatures = deserializationConfig._formatReadFeatures;
        this._formatReadFeaturesToChange = deserializationConfig._formatReadFeaturesToChange;
    }

    public DeserializationConfig(DeserializationConfig deserializationConfig, ContextAttributes contextAttributes) {
        super(deserializationConfig, contextAttributes);
        this._deserFeatures = deserializationConfig._deserFeatures;
        this._problemHandlers = deserializationConfig._problemHandlers;
        this._nodeFactory = deserializationConfig._nodeFactory;
        this._coercionConfigs = deserializationConfig._coercionConfigs;
        this._ctorDetector = deserializationConfig._ctorDetector;
        this._parserFeatures = deserializationConfig._parserFeatures;
        this._parserFeaturesToChange = deserializationConfig._parserFeaturesToChange;
        this._formatReadFeatures = deserializationConfig._formatReadFeatures;
        this._formatReadFeaturesToChange = deserializationConfig._formatReadFeaturesToChange;
    }

    public DeserializationConfig(DeserializationConfig deserializationConfig, SimpleMixInResolver simpleMixInResolver) {
        super(deserializationConfig, simpleMixInResolver);
        this._deserFeatures = deserializationConfig._deserFeatures;
        this._problemHandlers = deserializationConfig._problemHandlers;
        this._nodeFactory = deserializationConfig._nodeFactory;
        this._coercionConfigs = deserializationConfig._coercionConfigs;
        this._ctorDetector = deserializationConfig._ctorDetector;
        this._parserFeatures = deserializationConfig._parserFeatures;
        this._parserFeaturesToChange = deserializationConfig._parserFeaturesToChange;
        this._formatReadFeatures = deserializationConfig._formatReadFeatures;
        this._formatReadFeaturesToChange = deserializationConfig._formatReadFeaturesToChange;
    }

    public DeserializationConfig(DeserializationConfig deserializationConfig, DatatypeFeatures datatypeFeatures) {
        super(deserializationConfig, datatypeFeatures);
        this._deserFeatures = deserializationConfig._deserFeatures;
        this._problemHandlers = deserializationConfig._problemHandlers;
        this._nodeFactory = deserializationConfig._nodeFactory;
        this._coercionConfigs = deserializationConfig._coercionConfigs;
        this._ctorDetector = deserializationConfig._ctorDetector;
        this._parserFeatures = deserializationConfig._parserFeatures;
        this._parserFeaturesToChange = deserializationConfig._parserFeaturesToChange;
        this._formatReadFeatures = deserializationConfig._formatReadFeatures;
        this._formatReadFeaturesToChange = deserializationConfig._formatReadFeaturesToChange;
    }

    /* JADX DEBUG: Method merged with bridge method: _withBase(Lcom/fasterxml/jackson/databind/cfg/BaseSettings;)Lcom/fasterxml/jackson/databind/cfg/MapperConfigBase; */
    @Override // com.fasterxml.jackson.databind.cfg.MapperConfigBase
    public final DeserializationConfig _withBase(BaseSettings baseSettings) {
        return this._base == baseSettings ? this : new DeserializationConfig(this, baseSettings);
    }

    /* JADX DEBUG: Method merged with bridge method: _withMapperFeatures(J)Lcom/fasterxml/jackson/databind/cfg/MapperConfigBase; */
    @Override // com.fasterxml.jackson.databind.cfg.MapperConfigBase
    public final DeserializationConfig _withMapperFeatures(long j) {
        return new DeserializationConfig(this, j, this._deserFeatures, this._parserFeatures, this._parserFeaturesToChange, this._formatReadFeatures, this._formatReadFeaturesToChange);
    }

    /* JADX DEBUG: Method merged with bridge method: _with(Lcom/fasterxml/jackson/databind/cfg/DatatypeFeatures;)Lcom/fasterxml/jackson/databind/cfg/MapperConfigBase; */
    @Override // com.fasterxml.jackson.databind.cfg.MapperConfigBase
    public final DeserializationConfig _with(DatatypeFeatures datatypeFeatures) {
        return new DeserializationConfig(this, datatypeFeatures);
    }

    /* JADX DEBUG: Method merged with bridge method: with(Lo/Xt;)Lcom/fasterxml/jackson/databind/cfg/MapperConfigBase; */
    @Override // com.fasterxml.jackson.databind.cfg.MapperConfigBase
    public DeserializationConfig with(AbstractC5595Xt abstractC5595Xt) {
        return this._subtypeResolver == abstractC5595Xt ? this : new DeserializationConfig(this, abstractC5595Xt);
    }

    /* JADX DEBUG: Method merged with bridge method: withRootName(Lcom/fasterxml/jackson/databind/PropertyName;)Lcom/fasterxml/jackson/databind/cfg/MapperConfigBase; */
    @Override // com.fasterxml.jackson.databind.cfg.MapperConfigBase
    public DeserializationConfig withRootName(PropertyName propertyName) {
        PropertyName propertyName2 = this._rootName;
        if (propertyName == null) {
            if (propertyName2 == null) {
                return this;
            }
        } else if (propertyName.equals(propertyName2)) {
            return this;
        }
        return new DeserializationConfig(this, propertyName);
    }

    @Override // com.fasterxml.jackson.databind.cfg.MapperConfigBase
    public DeserializationConfig withView(Class<?> cls) {
        return this._view == cls ? this : new DeserializationConfig(this, cls);
    }

    /* JADX DEBUG: Method merged with bridge method: with(Lcom/fasterxml/jackson/databind/cfg/ContextAttributes;)Lcom/fasterxml/jackson/databind/cfg/MapperConfigBase; */
    @Override // com.fasterxml.jackson.databind.cfg.MapperConfigBase
    public DeserializationConfig with(ContextAttributes contextAttributes) {
        return contextAttributes == this._attributes ? this : new DeserializationConfig(this, contextAttributes);
    }

    public DeserializationConfig with(DeserializationFeature deserializationFeature) {
        int mask = this._deserFeatures | deserializationFeature.getMask();
        return mask == this._deserFeatures ? this : new DeserializationConfig(this, this._mapperFeatures, mask, this._parserFeatures, this._parserFeaturesToChange, this._formatReadFeatures, this._formatReadFeaturesToChange);
    }

    public DeserializationConfig with(DeserializationFeature deserializationFeature, DeserializationFeature... deserializationFeatureArr) {
        int i = this._deserFeatures;
        int mask = deserializationFeature.getMask() | i;
        int mask2 = mask;
        for (DeserializationFeature deserializationFeature2 : deserializationFeatureArr) {
            mask2 |= deserializationFeature2.getMask();
        }
        return mask2 == this._deserFeatures ? this : new DeserializationConfig(this, this._mapperFeatures, mask2, this._parserFeatures, this._parserFeaturesToChange, this._formatReadFeatures, this._formatReadFeaturesToChange);
    }

    public DeserializationConfig withFeatures(DeserializationFeature... deserializationFeatureArr) {
        int mask = this._deserFeatures;
        for (DeserializationFeature deserializationFeature : deserializationFeatureArr) {
            mask |= deserializationFeature.getMask();
        }
        return mask == this._deserFeatures ? this : new DeserializationConfig(this, this._mapperFeatures, mask, this._parserFeatures, this._parserFeaturesToChange, this._formatReadFeatures, this._formatReadFeaturesToChange);
    }

    public DeserializationConfig without(DeserializationFeature deserializationFeature) {
        int i = this._deserFeatures & (~deserializationFeature.getMask());
        return i == this._deserFeatures ? this : new DeserializationConfig(this, this._mapperFeatures, i, this._parserFeatures, this._parserFeaturesToChange, this._formatReadFeatures, this._formatReadFeaturesToChange);
    }

    public DeserializationConfig without(DeserializationFeature deserializationFeature, DeserializationFeature... deserializationFeatureArr) {
        int i = (~deserializationFeature.getMask()) & this._deserFeatures;
        int i2 = i;
        for (DeserializationFeature deserializationFeature2 : deserializationFeatureArr) {
            i2 &= ~deserializationFeature2.getMask();
        }
        return i2 == this._deserFeatures ? this : new DeserializationConfig(this, this._mapperFeatures, i2, this._parserFeatures, this._parserFeaturesToChange, this._formatReadFeatures, this._formatReadFeaturesToChange);
    }

    public DeserializationConfig withoutFeatures(DeserializationFeature... deserializationFeatureArr) {
        int i = this._deserFeatures;
        for (DeserializationFeature deserializationFeature : deserializationFeatureArr) {
            i &= ~deserializationFeature.getMask();
        }
        return i == this._deserFeatures ? this : new DeserializationConfig(this, this._mapperFeatures, i, this._parserFeatures, this._parserFeaturesToChange, this._formatReadFeatures, this._formatReadFeaturesToChange);
    }

    public DeserializationConfig with(JsonParser.Feature feature) {
        int mask = this._parserFeatures | feature.getMask();
        int mask2 = this._parserFeaturesToChange | feature.getMask();
        return (this._parserFeatures == mask && this._parserFeaturesToChange == mask2) ? this : new DeserializationConfig(this, this._mapperFeatures, this._deserFeatures, mask, mask2, this._formatReadFeatures, this._formatReadFeaturesToChange);
    }

    public DeserializationConfig withFeatures(JsonParser.Feature... featureArr) {
        int i = this._parserFeatures;
        int i2 = i;
        int i3 = this._parserFeaturesToChange;
        for (JsonParser.Feature feature : featureArr) {
            int mask = feature.getMask();
            i2 |= mask;
            i3 |= mask;
        }
        return (this._parserFeatures == i2 && this._parserFeaturesToChange == i3) ? this : new DeserializationConfig(this, this._mapperFeatures, this._deserFeatures, i2, i3, this._formatReadFeatures, this._formatReadFeaturesToChange);
    }

    public DeserializationConfig without(JsonParser.Feature feature) {
        int i = this._parserFeatures & (~feature.getMask());
        int mask = this._parserFeaturesToChange | feature.getMask();
        return (this._parserFeatures == i && this._parserFeaturesToChange == mask) ? this : new DeserializationConfig(this, this._mapperFeatures, this._deserFeatures, i, mask, this._formatReadFeatures, this._formatReadFeaturesToChange);
    }

    public DeserializationConfig withoutFeatures(JsonParser.Feature... featureArr) {
        int i = this._parserFeatures;
        int i2 = i;
        int i3 = this._parserFeaturesToChange;
        for (JsonParser.Feature feature : featureArr) {
            int mask = feature.getMask();
            i2 &= ~mask;
            i3 |= mask;
        }
        return (this._parserFeatures == i2 && this._parserFeaturesToChange == i3) ? this : new DeserializationConfig(this, this._mapperFeatures, this._deserFeatures, i2, i3, this._formatReadFeatures, this._formatReadFeaturesToChange);
    }

    public DeserializationConfig with(InterfaceC5498Ub interfaceC5498Ub) {
        if (interfaceC5498Ub instanceof JsonReadFeature) {
            return _withJsonReadFeatures(interfaceC5498Ub);
        }
        int mask = this._formatReadFeatures | interfaceC5498Ub.getMask();
        int mask2 = this._formatReadFeaturesToChange | interfaceC5498Ub.getMask();
        return (this._formatReadFeatures == mask && this._formatReadFeaturesToChange == mask2) ? this : new DeserializationConfig(this, this._mapperFeatures, this._deserFeatures, this._parserFeatures, this._parserFeaturesToChange, mask, mask2);
    }

    public DeserializationConfig withFeatures(InterfaceC5498Ub... interfaceC5498UbArr) {
        if (interfaceC5498UbArr.length > 0 && (interfaceC5498UbArr[0] instanceof JsonReadFeature)) {
            return _withJsonReadFeatures(interfaceC5498UbArr);
        }
        int i = this._formatReadFeatures;
        int i2 = i;
        int i3 = this._formatReadFeaturesToChange;
        for (InterfaceC5498Ub interfaceC5498Ub : interfaceC5498UbArr) {
            int mask = interfaceC5498Ub.getMask();
            i2 |= mask;
            i3 |= mask;
        }
        return (this._formatReadFeatures == i2 && this._formatReadFeaturesToChange == i3) ? this : new DeserializationConfig(this, this._mapperFeatures, this._deserFeatures, this._parserFeatures, this._parserFeaturesToChange, i2, i3);
    }

    public DeserializationConfig without(InterfaceC5498Ub interfaceC5498Ub) {
        if (interfaceC5498Ub instanceof JsonReadFeature) {
            return _withoutJsonReadFeatures(interfaceC5498Ub);
        }
        int i = this._formatReadFeatures & (~interfaceC5498Ub.getMask());
        int mask = this._formatReadFeaturesToChange | interfaceC5498Ub.getMask();
        return (this._formatReadFeatures == i && this._formatReadFeaturesToChange == mask) ? this : new DeserializationConfig(this, this._mapperFeatures, this._deserFeatures, this._parserFeatures, this._parserFeaturesToChange, i, mask);
    }

    public DeserializationConfig withoutFeatures(InterfaceC5498Ub... interfaceC5498UbArr) {
        if (interfaceC5498UbArr.length > 0 && (interfaceC5498UbArr[0] instanceof JsonReadFeature)) {
            return _withoutJsonReadFeatures(interfaceC5498UbArr);
        }
        int i = this._formatReadFeatures;
        int i2 = i;
        int i3 = this._formatReadFeaturesToChange;
        for (InterfaceC5498Ub interfaceC5498Ub : interfaceC5498UbArr) {
            int mask = interfaceC5498Ub.getMask();
            i2 &= ~mask;
            i3 |= mask;
        }
        return (this._formatReadFeatures == i2 && this._formatReadFeaturesToChange == i3) ? this : new DeserializationConfig(this, this._mapperFeatures, this._deserFeatures, this._parserFeatures, this._parserFeaturesToChange, i2, i3);
    }

    private DeserializationConfig _withJsonReadFeatures(InterfaceC5498Ub... interfaceC5498UbArr) {
        JsonParser.Feature featureMappedFeature;
        int i = this._parserFeatures;
        int i2 = this._parserFeaturesToChange;
        int i3 = this._formatReadFeatures;
        int i4 = i2;
        int i5 = i3;
        int i6 = this._formatReadFeaturesToChange;
        int i7 = i;
        for (InterfaceC5498Ub interfaceC5498Ub : interfaceC5498UbArr) {
            int mask = interfaceC5498Ub.getMask();
            i5 |= mask;
            i6 |= mask;
            if ((interfaceC5498Ub instanceof JsonReadFeature) && (featureMappedFeature = ((JsonReadFeature) interfaceC5498Ub).mappedFeature()) != null) {
                int mask2 = featureMappedFeature.getMask();
                i7 |= mask2;
                i4 |= mask2;
            }
        }
        return (this._formatReadFeatures == i5 && this._formatReadFeaturesToChange == i6 && this._parserFeatures == i7 && this._parserFeaturesToChange == i4) ? this : new DeserializationConfig(this, this._mapperFeatures, this._deserFeatures, i7, i4, i5, i6);
    }

    private DeserializationConfig _withoutJsonReadFeatures(InterfaceC5498Ub... interfaceC5498UbArr) {
        JsonParser.Feature featureMappedFeature;
        int i = this._parserFeatures;
        int i2 = this._parserFeaturesToChange;
        int i3 = this._formatReadFeatures;
        int i4 = i2;
        int i5 = i3;
        int i6 = this._formatReadFeaturesToChange;
        int i7 = i;
        for (InterfaceC5498Ub interfaceC5498Ub : interfaceC5498UbArr) {
            int mask = interfaceC5498Ub.getMask();
            i5 &= ~mask;
            i6 |= mask;
            if ((interfaceC5498Ub instanceof JsonReadFeature) && (featureMappedFeature = ((JsonReadFeature) interfaceC5498Ub).mappedFeature()) != null) {
                int mask2 = featureMappedFeature.getMask();
                i7 &= ~mask2;
                i4 |= mask2;
            }
        }
        return (this._formatReadFeatures == i5 && this._formatReadFeaturesToChange == i6 && this._parserFeatures == i7 && this._parserFeaturesToChange == i4) ? this : new DeserializationConfig(this, this._mapperFeatures, this._deserFeatures, i7, i4, i5, i6);
    }

    public DeserializationConfig with(JsonNodeFactory jsonNodeFactory) {
        return this._nodeFactory == jsonNodeFactory ? this : new DeserializationConfig(this, jsonNodeFactory);
    }

    public DeserializationConfig with(ConstructorDetector constructorDetector) {
        return this._ctorDetector == constructorDetector ? this : new DeserializationConfig(this, constructorDetector);
    }

    public DeserializationConfig withHandler(AbstractC5552Wc abstractC5552Wc) {
        return C5620Ys.AEQbTJ(this._problemHandlers, abstractC5552Wc) ? this : new DeserializationConfig(this, (C5620Ys<AbstractC5552Wc>) new C5620Ys(abstractC5552Wc, this._problemHandlers));
    }

    public DeserializationConfig withNoProblemHandlers() {
        return this._problemHandlers == null ? this : new DeserializationConfig(this, (C5620Ys<AbstractC5552Wc>) null);
    }

    public JsonParser initialize(JsonParser jsonParser) {
        int i = this._parserFeaturesToChange;
        if (i != 0) {
            jsonParser.AEQbTJ(this._parserFeatures, i);
        }
        int i2 = this._formatReadFeaturesToChange;
        if (i2 != 0) {
            jsonParser.OLrzqt(this._formatReadFeatures, i2);
        }
        return jsonParser;
    }

    public JsonParser initialize(JsonParser jsonParser, InterfaceC5497Ua interfaceC5497Ua) {
        int i = this._parserFeaturesToChange;
        if (i != 0) {
            jsonParser.AEQbTJ(this._parserFeatures, i);
        }
        int i2 = this._formatReadFeaturesToChange;
        if (i2 != 0) {
            jsonParser.OLrzqt(this._formatReadFeatures, i2);
        }
        if (interfaceC5497Ua != null) {
            jsonParser.EZpvd(interfaceC5497Ua);
        }
        return jsonParser;
    }

    @Override // com.fasterxml.jackson.databind.cfg.MapperConfig
    public boolean useRootWrapping() {
        if (this._rootName != null) {
            return !r0.isEmpty();
        }
        return isEnabled(DeserializationFeature.UNWRAP_ROOT_VALUE);
    }

    public final boolean isEnabled(DeserializationFeature deserializationFeature) {
        return (deserializationFeature.getMask() & this._deserFeatures) != 0;
    }

    public final boolean isEnabled(JsonParser.Feature feature, JsonFactory jsonFactory) {
        if ((feature.getMask() & this._parserFeaturesToChange) != 0) {
            return (feature.getMask() & this._parserFeatures) != 0;
        }
        return jsonFactory.isEnabled(feature);
    }

    public final boolean requiresFullValue() {
        return DeserializationFeature.FAIL_ON_TRAILING_TOKENS.enabledIn(this._deserFeatures);
    }

    public final boolean isEnabled(VT vt) {
        return this._datatypeFeatures.isEnabled(vt);
    }

    public ConstructorDetector getConstructorDetector() {
        ConstructorDetector constructorDetector = this._ctorDetector;
        return constructorDetector == null ? ConstructorDetector.DEFAULT : constructorDetector;
    }

    public AbstractC5549Vz introspect(JavaType javaType) {
        return getClassIntrospector().forDeserialization(this, javaType, this);
    }

    public AbstractC5549Vz introspectForCreation(JavaType javaType) {
        return getClassIntrospector().forCreation(this, javaType, this);
    }

    public AbstractC5549Vz introspectForBuilder(JavaType javaType, AbstractC5549Vz abstractC5549Vz) {
        return getClassIntrospector().forDeserializationWithBuilder(this, javaType, this, abstractC5549Vz);
    }

    @Deprecated
    public AbstractC5549Vz introspectForBuilder(JavaType javaType) {
        return getClassIntrospector().forDeserializationWithBuilder(this, javaType, this);
    }

    public AbstractC5597Xv findTypeDeserializer(JavaType javaType) throws JsonMappingException {
        Collection<NamedType> collectionCollectAndResolveSubtypesByTypeId;
        WJ wjAuCTel = introspectClassAnnotations(javaType.getRawClass()).AuCTel();
        InterfaceC5599Xx<?> interfaceC5599XxFindTypeResolver = getAnnotationIntrospector().findTypeResolver(this, wjAuCTel, javaType);
        if (interfaceC5599XxFindTypeResolver == null) {
            interfaceC5599XxFindTypeResolver = getDefaultTyper(javaType);
            collectionCollectAndResolveSubtypesByTypeId = null;
            if (interfaceC5599XxFindTypeResolver == null) {
                return null;
            }
        } else {
            collectionCollectAndResolveSubtypesByTypeId = getSubtypeResolver().collectAndResolveSubtypesByTypeId(this, wjAuCTel);
        }
        return interfaceC5599XxFindTypeResolver.buildTypeDeserializer(this, javaType, collectionCollectAndResolveSubtypesByTypeId);
    }

    public CoercionAction findCoercionAction(LogicalType logicalType, Class<?> cls, CoercionInputShape coercionInputShape) {
        return this._coercionConfigs.findCoercion(this, logicalType, cls, coercionInputShape);
    }

    public CoercionAction findCoercionFromBlankString(LogicalType logicalType, Class<?> cls, CoercionAction coercionAction) {
        return this._coercionConfigs.findCoercionFromBlankString(this, logicalType, cls, coercionAction);
    }
}
