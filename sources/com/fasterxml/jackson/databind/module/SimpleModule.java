package com.fasterxml.jackson.databind.module;

import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import o.AbstractC5548Vy;
import o.VC;
import o.VD;
import o.VE;
import o.VX;
import o.XR;

/* JADX INFO: loaded from: classes21.dex */
public class SimpleModule extends VE implements Serializable {
    private static final AtomicInteger MODULE_ID_SEQ = new AtomicInteger(1);
    private static final long serialVersionUID = 1;
    protected SimpleAbstractTypeResolver _abstractTypes;
    protected VX _deserializerModifier;
    protected SimpleDeserializers _deserializers;
    protected final boolean _hasExplicitName;
    protected SimpleKeyDeserializers _keyDeserializers;
    protected SimpleSerializers _keySerializers;
    protected HashMap<Class<?>, Class<?>> _mixins;
    protected final String _name;
    protected PropertyNamingStrategy _namingStrategy;
    protected XR _serializerModifier;
    protected SimpleSerializers _serializers;
    protected LinkedHashSet<NamedType> _subtypes;
    protected SimpleValueInstantiators _valueInstantiators;
    protected final Version _version;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.VE
    public String getModuleName() {
        return this._name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setAbstractTypes(SimpleAbstractTypeResolver simpleAbstractTypeResolver) {
        this._abstractTypes = simpleAbstractTypeResolver;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SimpleModule setDeserializerModifier(VX vx) {
        this._deserializerModifier = vx;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setDeserializers(SimpleDeserializers simpleDeserializers) {
        this._deserializers = simpleDeserializers;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setKeyDeserializers(SimpleKeyDeserializers simpleKeyDeserializers) {
        this._keyDeserializers = simpleKeyDeserializers;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setKeySerializers(SimpleSerializers simpleSerializers) {
        this._keySerializers = simpleSerializers;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SimpleModule setNamingStrategy(PropertyNamingStrategy propertyNamingStrategy) {
        this._namingStrategy = propertyNamingStrategy;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SimpleModule setSerializerModifier(XR xr) {
        this._serializerModifier = xr;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setSerializers(SimpleSerializers simpleSerializers) {
        this._serializers = simpleSerializers;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setValueInstantiators(SimpleValueInstantiators simpleValueInstantiators) {
        this._valueInstantiators = simpleValueInstantiators;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.VE
    public Version version() {
        return this._version;
    }

    public SimpleModule() {
        String name;
        this._serializers = null;
        this._deserializers = null;
        this._keySerializers = null;
        this._keyDeserializers = null;
        this._abstractTypes = null;
        this._valueInstantiators = null;
        this._deserializerModifier = null;
        this._serializerModifier = null;
        this._mixins = null;
        this._subtypes = null;
        this._namingStrategy = null;
        if (getClass() == SimpleModule.class) {
            name = "SimpleModule-" + MODULE_ID_SEQ.getAndIncrement();
        } else {
            name = getClass().getName();
        }
        this._name = name;
        this._version = Version.unknownVersion();
        this._hasExplicitName = false;
    }

    public SimpleModule(String str) {
        this(str, Version.unknownVersion());
    }

    public SimpleModule(Version version) {
        this(version.getArtifactId(), version);
    }

    public SimpleModule(String str, Version version) {
        this._serializers = null;
        this._deserializers = null;
        this._keySerializers = null;
        this._keyDeserializers = null;
        this._abstractTypes = null;
        this._valueInstantiators = null;
        this._deserializerModifier = null;
        this._serializerModifier = null;
        this._mixins = null;
        this._subtypes = null;
        this._namingStrategy = null;
        this._name = str;
        this._version = version;
        this._hasExplicitName = true;
    }

    public SimpleModule(String str, Version version, Map<Class<?>, AbstractC5548Vy<?>> map) {
        this(str, version, map, null);
    }

    public SimpleModule(String str, Version version, List<VD<?>> list) {
        this(str, version, null, list);
    }

    public SimpleModule(String str, Version version, Map<Class<?>, AbstractC5548Vy<?>> map, List<VD<?>> list) {
        this._serializers = null;
        this._deserializers = null;
        this._keySerializers = null;
        this._keyDeserializers = null;
        this._abstractTypes = null;
        this._valueInstantiators = null;
        this._deserializerModifier = null;
        this._serializerModifier = null;
        this._mixins = null;
        this._subtypes = null;
        this._namingStrategy = null;
        this._name = str;
        this._hasExplicitName = true;
        this._version = version;
        if (map != null) {
            this._deserializers = new SimpleDeserializers(map);
        }
        if (list != null) {
            this._serializers = new SimpleSerializers(list);
        }
    }

    @Override // o.VE
    public Object getTypeId() {
        if (!this._hasExplicitName && getClass() != SimpleModule.class) {
            return super.getTypeId();
        }
        return this._name;
    }

    public SimpleModule addSerializer(VD<?> vd) {
        _checkNotNull(vd, "serializer");
        if (this._serializers == null) {
            this._serializers = new SimpleSerializers();
        }
        this._serializers.addSerializer(vd);
        return this;
    }

    public <T> SimpleModule addSerializer(Class<? extends T> cls, VD<T> vd) {
        _checkNotNull(cls, "type to register serializer for");
        _checkNotNull(vd, "serializer");
        if (this._serializers == null) {
            this._serializers = new SimpleSerializers();
        }
        this._serializers.addSerializer(cls, vd);
        return this;
    }

    public <T> SimpleModule addKeySerializer(Class<? extends T> cls, VD<T> vd) {
        _checkNotNull(cls, "type to register key serializer for");
        _checkNotNull(vd, "key serializer");
        if (this._keySerializers == null) {
            this._keySerializers = new SimpleSerializers();
        }
        this._keySerializers.addSerializer(cls, vd);
        return this;
    }

    public <T> SimpleModule addDeserializer(Class<T> cls, AbstractC5548Vy<? extends T> abstractC5548Vy) {
        _checkNotNull(cls, "type to register deserializer for");
        _checkNotNull(abstractC5548Vy, "deserializer");
        if (this._deserializers == null) {
            this._deserializers = new SimpleDeserializers();
        }
        this._deserializers.addDeserializer(cls, abstractC5548Vy);
        return this;
    }

    public SimpleModule addKeyDeserializer(Class<?> cls, VC vc) {
        _checkNotNull(cls, "type to register key deserializer for");
        _checkNotNull(vc, "key deserializer");
        if (this._keyDeserializers == null) {
            this._keyDeserializers = new SimpleKeyDeserializers();
        }
        this._keyDeserializers.addDeserializer(cls, vc);
        return this;
    }

    public <T> SimpleModule addAbstractTypeMapping(Class<T> cls, Class<? extends T> cls2) {
        _checkNotNull(cls, "abstract type to map");
        _checkNotNull(cls2, "concrete type to map to");
        if (this._abstractTypes == null) {
            this._abstractTypes = new SimpleAbstractTypeResolver();
        }
        this._abstractTypes = this._abstractTypes.addMapping(cls, cls2);
        return this;
    }

    public SimpleModule registerSubtypes(Class<?>... clsArr) {
        if (this._subtypes == null) {
            this._subtypes = new LinkedHashSet<>();
        }
        for (Class<?> cls : clsArr) {
            _checkNotNull(cls, "subtype to register");
            this._subtypes.add(new NamedType(cls));
        }
        return this;
    }

    public SimpleModule registerSubtypes(NamedType... namedTypeArr) {
        if (this._subtypes == null) {
            this._subtypes = new LinkedHashSet<>();
        }
        for (NamedType namedType : namedTypeArr) {
            _checkNotNull(namedType, "subtype to register");
            this._subtypes.add(namedType);
        }
        return this;
    }

    public SimpleModule registerSubtypes(Collection<Class<?>> collection) {
        if (this._subtypes == null) {
            this._subtypes = new LinkedHashSet<>();
        }
        for (Class<?> cls : collection) {
            _checkNotNull(cls, "subtype to register");
            this._subtypes.add(new NamedType(cls));
        }
        return this;
    }

    public SimpleModule addValueInstantiator(Class<?> cls, ValueInstantiator valueInstantiator) {
        _checkNotNull(cls, "class to register value instantiator for");
        _checkNotNull(valueInstantiator, "value instantiator");
        if (this._valueInstantiators == null) {
            this._valueInstantiators = new SimpleValueInstantiators();
        }
        this._valueInstantiators = this._valueInstantiators.addValueInstantiator(cls, valueInstantiator);
        return this;
    }

    public SimpleModule setMixInAnnotation(Class<?> cls, Class<?> cls2) {
        _checkNotNull(cls, "target type");
        _checkNotNull(cls2, "mixin class");
        if (this._mixins == null) {
            this._mixins = new HashMap<>();
        }
        this._mixins.put(cls, cls2);
        return this;
    }

    @Override // o.VE
    public void setupModule(VE.ActionBar actionBar) {
        SimpleSerializers simpleSerializers = this._serializers;
        if (simpleSerializers != null) {
            actionBar.EZpvd(simpleSerializers);
        }
        SimpleDeserializers simpleDeserializers = this._deserializers;
        if (simpleDeserializers != null) {
            actionBar.EZpvd(simpleDeserializers);
        }
        SimpleSerializers simpleSerializers2 = this._keySerializers;
        if (simpleSerializers2 != null) {
            actionBar.copydefault(simpleSerializers2);
        }
        SimpleKeyDeserializers simpleKeyDeserializers = this._keyDeserializers;
        if (simpleKeyDeserializers != null) {
            actionBar.KWHzl(simpleKeyDeserializers);
        }
        SimpleAbstractTypeResolver simpleAbstractTypeResolver = this._abstractTypes;
        if (simpleAbstractTypeResolver != null) {
            actionBar.KWHzl(simpleAbstractTypeResolver);
        }
        SimpleValueInstantiators simpleValueInstantiators = this._valueInstantiators;
        if (simpleValueInstantiators != null) {
            actionBar.OLrzqt(simpleValueInstantiators);
        }
        VX vx = this._deserializerModifier;
        if (vx != null) {
            actionBar.AEQbTJ(vx);
        }
        XR xr = this._serializerModifier;
        if (xr != null) {
            actionBar.AEQbTJ(xr);
        }
        LinkedHashSet<NamedType> linkedHashSet = this._subtypes;
        if (linkedHashSet != null && linkedHashSet.size() > 0) {
            LinkedHashSet<NamedType> linkedHashSet2 = this._subtypes;
            actionBar.EZpvd((NamedType[]) linkedHashSet2.toArray(new NamedType[linkedHashSet2.size()]));
        }
        PropertyNamingStrategy propertyNamingStrategy = this._namingStrategy;
        if (propertyNamingStrategy != null) {
            actionBar.EZpvd(propertyNamingStrategy);
        }
        HashMap<Class<?>, Class<?>> map = this._mixins;
        if (map != null) {
            for (Map.Entry<Class<?>, Class<?>> entry : map.entrySet()) {
                actionBar.EZpvd(entry.getKey(), entry.getValue());
            }
        }
    }

    public void _checkNotNull(Object obj, String str) {
        if (obj == null) {
            throw new IllegalArgumentException(String.format("Cannot pass `null` as %s", str));
        }
    }
}
