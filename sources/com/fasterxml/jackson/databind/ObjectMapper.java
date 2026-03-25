package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.StreamReadFeature;
import com.fasterxml.jackson.core.StreamWriteFeature;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.core.io.CharacterEscapes;
import com.fasterxml.jackson.databind.cfg.BaseSettings;
import com.fasterxml.jackson.databind.cfg.CoercionConfigs;
import com.fasterxml.jackson.databind.cfg.ConfigOverrides;
import com.fasterxml.jackson.databind.cfg.ConstructorDetector;
import com.fasterxml.jackson.databind.cfg.ContextAttributes;
import com.fasterxml.jackson.databind.cfg.DatatypeFeatures;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.cfg.MutableCoercionConfig;
import com.fasterxml.jackson.databind.cfg.MutableConfigOverride;
import com.fasterxml.jackson.databind.deser.BeanDeserializerFactory;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import com.fasterxml.jackson.databind.introspect.AccessorNamingStrategy;
import com.fasterxml.jackson.databind.introspect.BasicClassIntrospector;
import com.fasterxml.jackson.databind.introspect.DefaultAccessorNamingStrategy;
import com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector;
import com.fasterxml.jackson.databind.introspect.SimpleMixInResolver;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator;
import com.fasterxml.jackson.databind.jsontype.impl.LaissezFaireSubTypeValidator;
import com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.node.POJONode;
import com.fasterxml.jackson.databind.ser.BeanSerializerFactory;
import com.fasterxml.jackson.databind.ser.DefaultSerializerProvider;
import com.fasterxml.jackson.databind.type.LogicalType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.RootNameLookup;
import com.fasterxml.jackson.databind.util.StdDateFormat;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.io.Closeable;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Serializable;
import java.io.Writer;
import java.lang.reflect.Type;
import java.net.URL;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.ServiceLoader;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import o.AbstractC5505Ui;
import o.AbstractC5531Vh;
import o.AbstractC5533Vj;
import o.AbstractC5547Vx;
import o.AbstractC5548Vy;
import o.AbstractC5550Wa;
import o.AbstractC5552Wc;
import o.AbstractC5595Xt;
import o.AbstractC5597Xv;
import o.AbstractC5601Xz;
import o.C5537Vn;
import o.C5594Xs;
import o.C5619Yr;
import o.InterfaceC5497Ua;
import o.InterfaceC5504Uh;
import o.InterfaceC5509Um;
import o.InterfaceC5556Wg;
import o.InterfaceC5559Wj;
import o.InterfaceC5562Wm;
import o.InterfaceC5584Xi;
import o.InterfaceC5599Xx;
import o.InterfaceC5605Yd;
import o.TZ;
import o.UC;
import o.VB;
import o.VE;
import o.VI;
import o.VQ;
import o.VT;
import o.VV;
import o.VX;
import o.WX;
import o.XJ;
import o.XQ;
import o.XR;
import o.XS;
import o.XY;
import o.YA;

/* JADX INFO: loaded from: classes21.dex */
public class ObjectMapper extends AbstractC5505Ui implements Serializable {
    protected static final AnnotationIntrospector DEFAULT_ANNOTATION_INTROSPECTOR;
    protected static final BaseSettings DEFAULT_BASE;
    private static final long serialVersionUID = 2;
    protected final CoercionConfigs _coercionConfigs;
    protected final ConfigOverrides _configOverrides;
    protected DeserializationConfig _deserializationConfig;
    protected DefaultDeserializationContext _deserializationContext;
    protected InjectableValues _injectableValues;
    public final JsonFactory _jsonFactory;
    protected SimpleMixInResolver _mixIns;
    protected Set<Object> _registeredModuleTypes;
    protected final ConcurrentHashMap<JavaType, AbstractC5548Vy<Object>> _rootDeserializers;
    protected SerializationConfig _serializationConfig;
    protected XY _serializerFactory;
    protected DefaultSerializerProvider _serializerProvider;
    protected AbstractC5595Xt _subtypeResolver;
    protected TypeFactory _typeFactory;

    public enum DefaultTyping {
        JAVA_LANG_OBJECT,
        OBJECT_AND_NON_CONCRETE,
        NON_CONCRETE_AND_ARRAYS,
        NON_FINAL,
        EVERYTHING
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DeserializationConfig getDeserializationConfig() {
        return this._deserializationConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DeserializationContext getDeserializationContext() {
        return this._deserializationContext;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC5505Ui
    public JsonFactory getFactory() {
        return this._jsonFactory;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InjectableValues getInjectableValues() {
        return this._injectableValues;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SerializationConfig getSerializationConfig() {
        return this._serializationConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public XY getSerializerFactory() {
        return this._serializerFactory;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public VI getSerializerProvider() {
        return this._serializerProvider;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AbstractC5595Xt getSubtypeResolver() {
        return this._subtypeResolver;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TypeFactory getTypeFactory() {
        return this._typeFactory;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ObjectMapper setInjectableValues(InjectableValues injectableValues) {
        this._injectableValues = injectableValues;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ObjectMapper setSerializerFactory(XY xy) {
        this._serializerFactory = xy;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ObjectMapper setSerializerProvider(DefaultSerializerProvider defaultSerializerProvider) {
        this._serializerProvider = defaultSerializerProvider;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public JsonFactory tokenStreamFactory() {
        return this._jsonFactory;
    }

    public static class DefaultTypeResolverBuilder extends XJ implements Serializable {
        private static final long serialVersionUID = 1;
        protected final DefaultTyping _appliesFor;
        protected final PolymorphicTypeValidator _subtypeValidator;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.XJ
        public PolymorphicTypeValidator subTypeValidator(MapperConfig<?> mapperConfig) {
            return this._subtypeValidator;
        }

        @Override // o.XJ, o.InterfaceC5599Xx
        public /* bridge */ /* synthetic */ XJ withDefaultImpl(Class cls) {
            return withDefaultImpl((Class<?>) cls);
        }

        @Override // o.XJ, o.InterfaceC5599Xx
        public /* bridge */ /* synthetic */ InterfaceC5599Xx withDefaultImpl(Class cls) {
            return withDefaultImpl((Class<?>) cls);
        }

        @Deprecated
        public DefaultTypeResolverBuilder(DefaultTyping defaultTyping) {
            this(defaultTyping, LaissezFaireSubTypeValidator.instance);
        }

        public DefaultTypeResolverBuilder(DefaultTyping defaultTyping, PolymorphicTypeValidator polymorphicTypeValidator) {
            this._appliesFor = (DefaultTyping) _requireNonNull(defaultTyping, "Can not pass `null` DefaultTyping");
            this._subtypeValidator = (PolymorphicTypeValidator) _requireNonNull(polymorphicTypeValidator, "Can not pass `null` PolymorphicTypeValidator");
        }

        public DefaultTypeResolverBuilder(DefaultTypeResolverBuilder defaultTypeResolverBuilder, Class<?> cls) {
            super(defaultTypeResolverBuilder, cls);
            this._appliesFor = defaultTypeResolverBuilder._appliesFor;
            this._subtypeValidator = defaultTypeResolverBuilder._subtypeValidator;
        }

        private static <T> T _requireNonNull(T t, String str) {
            if (t != null) {
                return t;
            }
            throw new NullPointerException(str);
        }

        public static DefaultTypeResolverBuilder construct(DefaultTyping defaultTyping, PolymorphicTypeValidator polymorphicTypeValidator) {
            return new DefaultTypeResolverBuilder(defaultTyping, polymorphicTypeValidator);
        }

        @Override // o.XJ, o.InterfaceC5599Xx
        public DefaultTypeResolverBuilder withDefaultImpl(Class<?> cls) {
            if (this._defaultImpl == cls) {
                return this;
            }
            C5619Yr.AEQbTJ((Class<?>) DefaultTypeResolverBuilder.class, this, "withDefaultImpl");
            return new DefaultTypeResolverBuilder(this, cls);
        }

        @Override // o.XJ, o.InterfaceC5599Xx
        public AbstractC5597Xv buildTypeDeserializer(DeserializationConfig deserializationConfig, JavaType javaType, Collection<NamedType> collection) {
            if (useForType(javaType)) {
                return super.buildTypeDeserializer(deserializationConfig, javaType, collection);
            }
            return null;
        }

        @Override // o.XJ, o.InterfaceC5599Xx
        public AbstractC5601Xz buildTypeSerializer(SerializationConfig serializationConfig, JavaType javaType, Collection<NamedType> collection) {
            if (useForType(javaType)) {
                return super.buildTypeSerializer(serializationConfig, javaType, collection);
            }
            return null;
        }

        public boolean useForType(JavaType javaType) {
            if (javaType.isPrimitive()) {
                return false;
            }
            int i = AnonymousClass5.copydefault[this._appliesFor.ordinal()];
            if (i == 1) {
                while (javaType.isArrayType()) {
                    javaType = javaType.getContentType();
                }
            } else if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return javaType.isJavaLangObject();
                    }
                    return true;
                }
                while (javaType.isArrayType()) {
                    javaType = javaType.getContentType();
                }
                while (javaType.isReferenceType()) {
                    javaType = javaType.getReferencedType();
                }
                return (javaType.isFinal() || InterfaceC5509Um.class.isAssignableFrom(javaType.getRawClass())) ? false : true;
            }
            while (javaType.isReferenceType()) {
                javaType = javaType.getReferencedType();
            }
            return javaType.isJavaLangObject() || !(javaType.isConcrete() || InterfaceC5509Um.class.isAssignableFrom(javaType.getRawClass()));
        }
    }

    /* JADX INFO: renamed from: com.fasterxml.jackson.databind.ObjectMapper$5, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass5 {
        public static final /* synthetic */ int[] copydefault;

        static {
            int[] iArr = new int[DefaultTyping.values().length];
            copydefault = iArr;
            try {
                iArr[DefaultTyping.NON_CONCRETE_AND_ARRAYS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                copydefault[DefaultTyping.OBJECT_AND_NON_CONCRETE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                copydefault[DefaultTyping.NON_FINAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                copydefault[DefaultTyping.EVERYTHING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                copydefault[DefaultTyping.JAVA_LANG_OBJECT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    static {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = new JacksonAnnotationIntrospector();
        DEFAULT_ANNOTATION_INTROSPECTOR = jacksonAnnotationIntrospector;
        DEFAULT_BASE = new BaseSettings(null, jacksonAnnotationIntrospector, null, TypeFactory.defaultInstance(), null, StdDateFormat.instance, null, Locale.getDefault(), null, TZ.AEQbTJ(), LaissezFaireSubTypeValidator.instance, new DefaultAccessorNamingStrategy.Provider());
    }

    public ObjectMapper() {
        this(null, null, null);
    }

    public ObjectMapper(JsonFactory jsonFactory) {
        this(jsonFactory, null, null);
    }

    public ObjectMapper(ObjectMapper objectMapper) {
        this(objectMapper, null);
    }

    public ObjectMapper(ObjectMapper objectMapper, JsonFactory jsonFactory) {
        this._rootDeserializers = new ConcurrentHashMap<>(64, 0.6f, 2);
        jsonFactory = jsonFactory == null ? objectMapper._jsonFactory.copy() : jsonFactory;
        this._jsonFactory = jsonFactory;
        jsonFactory.setCodec(this);
        this._subtypeResolver = objectMapper._subtypeResolver.copy();
        this._typeFactory = objectMapper._typeFactory;
        this._injectableValues = objectMapper._injectableValues;
        ConfigOverrides configOverridesCopy = objectMapper._configOverrides.copy();
        this._configOverrides = configOverridesCopy;
        CoercionConfigs coercionConfigsCopy = objectMapper._coercionConfigs.copy();
        this._coercionConfigs = coercionConfigsCopy;
        this._mixIns = objectMapper._mixIns.copy();
        RootNameLookup rootNameLookup = new RootNameLookup();
        this._serializationConfig = new SerializationConfig(objectMapper._serializationConfig, this._subtypeResolver, this._mixIns, rootNameLookup, configOverridesCopy);
        this._deserializationConfig = new DeserializationConfig(objectMapper._deserializationConfig, this._subtypeResolver, this._mixIns, rootNameLookup, configOverridesCopy, coercionConfigsCopy);
        this._serializerProvider = objectMapper._serializerProvider.copy();
        this._deserializationContext = objectMapper._deserializationContext.copy();
        this._serializerFactory = objectMapper._serializerFactory;
        Set<Object> set = objectMapper._registeredModuleTypes;
        if (set == null) {
            this._registeredModuleTypes = null;
        } else {
            this._registeredModuleTypes = new LinkedHashSet(set);
        }
    }

    public ObjectMapper(JsonFactory jsonFactory, DefaultSerializerProvider defaultSerializerProvider, DefaultDeserializationContext defaultDeserializationContext) {
        this._rootDeserializers = new ConcurrentHashMap<>(64, 0.6f, 2);
        if (jsonFactory == null) {
            this._jsonFactory = new MappingJsonFactory(this);
        } else {
            this._jsonFactory = jsonFactory;
            if (jsonFactory.getCodec() == null) {
                jsonFactory.setCodec(this);
            }
        }
        this._subtypeResolver = new StdSubtypeResolver();
        RootNameLookup rootNameLookup = new RootNameLookup();
        this._typeFactory = TypeFactory.defaultInstance();
        SimpleMixInResolver simpleMixInResolver = new SimpleMixInResolver(null);
        this._mixIns = simpleMixInResolver;
        BaseSettings baseSettingsWithClassIntrospector = DEFAULT_BASE.withClassIntrospector(defaultClassIntrospector());
        ConfigOverrides configOverrides = new ConfigOverrides();
        this._configOverrides = configOverrides;
        CoercionConfigs coercionConfigs = new CoercionConfigs();
        this._coercionConfigs = coercionConfigs;
        this._serializationConfig = new SerializationConfig(baseSettingsWithClassIntrospector, this._subtypeResolver, simpleMixInResolver, rootNameLookup, configOverrides, DatatypeFeatures.defaultFeatures());
        this._deserializationConfig = new DeserializationConfig(baseSettingsWithClassIntrospector, this._subtypeResolver, simpleMixInResolver, rootNameLookup, configOverrides, coercionConfigs, DatatypeFeatures.defaultFeatures());
        boolean zRequiresPropertyOrdering = this._jsonFactory.requiresPropertyOrdering();
        SerializationConfig serializationConfig = this._serializationConfig;
        MapperFeature mapperFeature = MapperFeature.SORT_PROPERTIES_ALPHABETICALLY;
        if (serializationConfig.isEnabled(mapperFeature) ^ zRequiresPropertyOrdering) {
            configure(mapperFeature, zRequiresPropertyOrdering);
        }
        this._serializerProvider = defaultSerializerProvider == null ? new DefaultSerializerProvider.Impl() : defaultSerializerProvider;
        this._deserializationContext = defaultDeserializationContext == null ? new DefaultDeserializationContext.Impl(BeanDeserializerFactory.instance) : defaultDeserializationContext;
        this._serializerFactory = BeanSerializerFactory.instance;
    }

    public WX defaultClassIntrospector() {
        return new BasicClassIntrospector();
    }

    public ObjectMapper copy() {
        _checkInvalidCopy(ObjectMapper.class);
        return new ObjectMapper(this);
    }

    public ObjectMapper copyWith(JsonFactory jsonFactory) {
        _checkInvalidCopy(ObjectMapper.class);
        return new ObjectMapper(this, jsonFactory);
    }

    public void _checkInvalidCopy(Class<?> cls) {
        if (getClass() == cls) {
            return;
        }
        throw new IllegalStateException("Failed copy()/copyWith(): " + getClass().getName() + " (version: " + version() + ") does not override copy()/copyWith(); it has to");
    }

    public ObjectReader _newReader(DeserializationConfig deserializationConfig) {
        return new ObjectReader(this, deserializationConfig);
    }

    public ObjectReader _newReader(DeserializationConfig deserializationConfig, JavaType javaType, Object obj, InterfaceC5497Ua interfaceC5497Ua, InjectableValues injectableValues) {
        return new ObjectReader(this, deserializationConfig, javaType, obj, interfaceC5497Ua, injectableValues);
    }

    public ObjectWriter _newWriter(SerializationConfig serializationConfig) {
        return new ObjectWriter(this, serializationConfig);
    }

    public ObjectWriter _newWriter(SerializationConfig serializationConfig, InterfaceC5497Ua interfaceC5497Ua) {
        return new ObjectWriter(this, serializationConfig, interfaceC5497Ua);
    }

    public ObjectWriter _newWriter(SerializationConfig serializationConfig, JavaType javaType, InterfaceC5504Uh interfaceC5504Uh) {
        return new ObjectWriter(this, serializationConfig, javaType, interfaceC5504Uh);
    }

    @Override // o.AbstractC5505Ui
    public Version version() {
        return VV.KWHzl;
    }

    public ObjectMapper registerModule(VE ve) {
        Object typeId;
        _assertNotNull("module", ve);
        if (ve.getModuleName() == null) {
            throw new IllegalArgumentException("Module without defined name");
        }
        if (ve.version() == null) {
            throw new IllegalArgumentException("Module without defined version");
        }
        Iterator<? extends VE> it = ve.getDependencies().iterator();
        while (it.hasNext()) {
            registerModule(it.next());
        }
        if (isEnabled(MapperFeature.IGNORE_DUPLICATE_MODULE_REGISTRATIONS) && (typeId = ve.getTypeId()) != null) {
            if (this._registeredModuleTypes == null) {
                this._registeredModuleTypes = new LinkedHashSet();
            }
            if (!this._registeredModuleTypes.add(typeId)) {
                return this;
            }
        }
        ve.setupModule(new VE.ActionBar() { // from class: com.fasterxml.jackson.databind.ObjectMapper.1
            @Override // o.VE.ActionBar
            public void EZpvd(InterfaceC5559Wj interfaceC5559Wj) {
                AbstractC5550Wa abstractC5550WaWithAdditionalDeserializers = ObjectMapper.this._deserializationContext._factory.withAdditionalDeserializers(interfaceC5559Wj);
                ObjectMapper objectMapper = ObjectMapper.this;
                objectMapper._deserializationContext = objectMapper._deserializationContext.with(abstractC5550WaWithAdditionalDeserializers);
            }

            @Override // o.VE.ActionBar
            public void KWHzl(InterfaceC5556Wg interfaceC5556Wg) {
                AbstractC5550Wa abstractC5550WaWithAdditionalKeyDeserializers = ObjectMapper.this._deserializationContext._factory.withAdditionalKeyDeserializers(interfaceC5556Wg);
                ObjectMapper objectMapper = ObjectMapper.this;
                objectMapper._deserializationContext = objectMapper._deserializationContext.with(abstractC5550WaWithAdditionalKeyDeserializers);
            }

            @Override // o.VE.ActionBar
            public void AEQbTJ(VX vx) {
                AbstractC5550Wa abstractC5550WaWithDeserializerModifier = ObjectMapper.this._deserializationContext._factory.withDeserializerModifier(vx);
                ObjectMapper objectMapper = ObjectMapper.this;
                objectMapper._deserializationContext = objectMapper._deserializationContext.with(abstractC5550WaWithDeserializerModifier);
            }

            @Override // o.VE.ActionBar
            public void EZpvd(InterfaceC5605Yd interfaceC5605Yd) {
                ObjectMapper objectMapper = ObjectMapper.this;
                objectMapper._serializerFactory = objectMapper._serializerFactory.withAdditionalSerializers(interfaceC5605Yd);
            }

            @Override // o.VE.ActionBar
            public void copydefault(InterfaceC5605Yd interfaceC5605Yd) {
                ObjectMapper objectMapper = ObjectMapper.this;
                objectMapper._serializerFactory = objectMapper._serializerFactory.withAdditionalKeySerializers(interfaceC5605Yd);
            }

            @Override // o.VE.ActionBar
            public void AEQbTJ(XR xr) {
                ObjectMapper objectMapper = ObjectMapper.this;
                objectMapper._serializerFactory = objectMapper._serializerFactory.withSerializerModifier(xr);
            }

            @Override // o.VE.ActionBar
            public void KWHzl(AbstractC5547Vx abstractC5547Vx) {
                AbstractC5550Wa abstractC5550WaWithAbstractTypeResolver = ObjectMapper.this._deserializationContext._factory.withAbstractTypeResolver(abstractC5547Vx);
                ObjectMapper objectMapper = ObjectMapper.this;
                objectMapper._deserializationContext = objectMapper._deserializationContext.with(abstractC5550WaWithAbstractTypeResolver);
            }

            @Override // o.VE.ActionBar
            public void OLrzqt(InterfaceC5562Wm interfaceC5562Wm) {
                AbstractC5550Wa abstractC5550WaWithValueInstantiators = ObjectMapper.this._deserializationContext._factory.withValueInstantiators(interfaceC5562Wm);
                ObjectMapper objectMapper = ObjectMapper.this;
                objectMapper._deserializationContext = objectMapper._deserializationContext.with(abstractC5550WaWithValueInstantiators);
            }

            @Override // o.VE.ActionBar
            public void EZpvd(NamedType... namedTypeArr) {
                ObjectMapper.this.registerSubtypes(namedTypeArr);
            }

            @Override // o.VE.ActionBar
            public void EZpvd(Class<?> cls, Class<?> cls2) {
                ObjectMapper.this.addMixIn(cls, cls2);
            }

            @Override // o.VE.ActionBar
            public void EZpvd(PropertyNamingStrategy propertyNamingStrategy) {
                ObjectMapper.this.setPropertyNamingStrategy(propertyNamingStrategy);
            }
        });
        return this;
    }

    public ObjectMapper registerModules(VE... veArr) {
        for (VE ve : veArr) {
            registerModule(ve);
        }
        return this;
    }

    public ObjectMapper registerModules(Iterable<? extends VE> iterable) {
        _assertNotNull("modules", iterable);
        Iterator<? extends VE> it = iterable.iterator();
        while (it.hasNext()) {
            registerModule(it.next());
        }
        return this;
    }

    public Set<Object> getRegisteredModuleIds() {
        Set<Object> set = this._registeredModuleTypes;
        return set == null ? Collections.emptySet() : Collections.unmodifiableSet(set);
    }

    public static List<VE> findModules() {
        return findModules(null);
    }

    public static List<VE> findModules(ClassLoader classLoader) {
        ArrayList arrayList = new ArrayList();
        Iterator it = secureGetServiceLoader(VE.class, classLoader).iterator();
        while (it.hasNext()) {
            arrayList.add((VE) it.next());
        }
        return arrayList;
    }

    private static <T> ServiceLoader<T> secureGetServiceLoader(final Class<T> cls, final ClassLoader classLoader) {
        if (System.getSecurityManager() == null) {
            return classLoader == null ? ServiceLoader.load(cls) : ServiceLoader.load(cls, classLoader);
        }
        return (ServiceLoader) AccessController.doPrivileged(new PrivilegedAction<ServiceLoader<T>>() { // from class: com.fasterxml.jackson.databind.ObjectMapper.4
            /* JADX DEBUG: Method merged with bridge method: run()Ljava/lang/Object; */
            @Override // java.security.PrivilegedAction
            /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
            public ServiceLoader<T> run() {
                ClassLoader classLoader2 = classLoader;
                return classLoader2 == null ? ServiceLoader.load(cls) : ServiceLoader.load(cls, classLoader2);
            }
        });
    }

    public ObjectMapper findAndRegisterModules() {
        return registerModules(findModules());
    }

    public JsonGenerator createGenerator(OutputStream outputStream) throws IOException {
        _assertNotNull("out", outputStream);
        JsonGenerator jsonGeneratorCreateGenerator = this._jsonFactory.createGenerator(outputStream, JsonEncoding.UTF8);
        this._serializationConfig.initialize(jsonGeneratorCreateGenerator);
        return jsonGeneratorCreateGenerator;
    }

    public JsonGenerator createGenerator(OutputStream outputStream, JsonEncoding jsonEncoding) throws IOException {
        _assertNotNull("out", outputStream);
        JsonGenerator jsonGeneratorCreateGenerator = this._jsonFactory.createGenerator(outputStream, jsonEncoding);
        this._serializationConfig.initialize(jsonGeneratorCreateGenerator);
        return jsonGeneratorCreateGenerator;
    }

    public JsonGenerator createGenerator(Writer writer) throws IOException {
        _assertNotNull("w", writer);
        JsonGenerator jsonGeneratorCreateGenerator = this._jsonFactory.createGenerator(writer);
        this._serializationConfig.initialize(jsonGeneratorCreateGenerator);
        return jsonGeneratorCreateGenerator;
    }

    public JsonGenerator createGenerator(File file, JsonEncoding jsonEncoding) throws IOException {
        _assertNotNull("outputFile", file);
        JsonGenerator jsonGeneratorCreateGenerator = this._jsonFactory.createGenerator(file, jsonEncoding);
        this._serializationConfig.initialize(jsonGeneratorCreateGenerator);
        return jsonGeneratorCreateGenerator;
    }

    public JsonGenerator createGenerator(DataOutput dataOutput) throws IOException {
        _assertNotNull("out", dataOutput);
        JsonGenerator jsonGeneratorCreateGenerator = this._jsonFactory.createGenerator(dataOutput);
        this._serializationConfig.initialize(jsonGeneratorCreateGenerator);
        return jsonGeneratorCreateGenerator;
    }

    public JsonParser createParser(File file) throws IOException {
        _assertNotNull("src", file);
        return this._deserializationConfig.initialize(this._jsonFactory.createParser(file));
    }

    public JsonParser createParser(URL url) throws IOException {
        _assertNotNull("src", url);
        return this._deserializationConfig.initialize(this._jsonFactory.createParser(url));
    }

    public JsonParser createParser(InputStream inputStream) throws IOException {
        _assertNotNull("in", inputStream);
        return this._deserializationConfig.initialize(this._jsonFactory.createParser(inputStream));
    }

    public JsonParser createParser(Reader reader) throws IOException {
        _assertNotNull("r", reader);
        return this._deserializationConfig.initialize(this._jsonFactory.createParser(reader));
    }

    public JsonParser createParser(byte[] bArr) throws IOException {
        _assertNotNull("content", bArr);
        return this._deserializationConfig.initialize(this._jsonFactory.createParser(bArr));
    }

    public JsonParser createParser(byte[] bArr, int i, int i2) throws IOException {
        _assertNotNull("content", bArr);
        return this._deserializationConfig.initialize(this._jsonFactory.createParser(bArr, i, i2));
    }

    public JsonParser createParser(String str) throws IOException {
        _assertNotNull("content", str);
        return this._deserializationConfig.initialize(this._jsonFactory.createParser(str));
    }

    public JsonParser createParser(char[] cArr) throws IOException {
        _assertNotNull("content", cArr);
        return this._deserializationConfig.initialize(this._jsonFactory.createParser(cArr));
    }

    public JsonParser createParser(char[] cArr, int i, int i2) throws IOException {
        _assertNotNull("content", cArr);
        return this._deserializationConfig.initialize(this._jsonFactory.createParser(cArr, i, i2));
    }

    public JsonParser createParser(DataInput dataInput) throws IOException {
        _assertNotNull("content", dataInput);
        return this._deserializationConfig.initialize(this._jsonFactory.createParser(dataInput));
    }

    public JsonParser createNonBlockingByteArrayParser() throws IOException {
        return this._deserializationConfig.initialize(this._jsonFactory.createNonBlockingByteArrayParser());
    }

    public VI getSerializerProviderInstance() {
        return _serializerProvider(this._serializationConfig);
    }

    public ObjectMapper setMixIns(Map<Class<?>, Class<?>> map) {
        this._mixIns.setLocalDefinitions(map);
        return this;
    }

    public ObjectMapper addMixIn(Class<?> cls, Class<?> cls2) {
        this._mixIns.addLocalDefinition(cls, cls2);
        return this;
    }

    public ObjectMapper setMixInResolver(WX.TaskDescription taskDescription) {
        SimpleMixInResolver simpleMixInResolverWithOverrides = this._mixIns.withOverrides(taskDescription);
        if (simpleMixInResolverWithOverrides != this._mixIns) {
            this._mixIns = simpleMixInResolverWithOverrides;
            this._deserializationConfig = new DeserializationConfig(this._deserializationConfig, simpleMixInResolverWithOverrides);
            this._serializationConfig = new SerializationConfig(this._serializationConfig, simpleMixInResolverWithOverrides);
        }
        return this;
    }

    public Class<?> findMixInClassFor(Class<?> cls) {
        return this._mixIns.findMixInClassFor(cls);
    }

    public int mixInCount() {
        return this._mixIns.localSize();
    }

    @Deprecated
    public void setMixInAnnotations(Map<Class<?>, Class<?>> map) {
        setMixIns(map);
    }

    @Deprecated
    public final void addMixInAnnotations(Class<?> cls, Class<?> cls2) {
        addMixIn(cls, cls2);
    }

    public VisibilityChecker<?> getVisibilityChecker() {
        return this._serializationConfig.getDefaultVisibilityChecker();
    }

    public ObjectMapper setVisibility(VisibilityChecker<?> visibilityChecker) {
        this._configOverrides.setDefaultVisibility(visibilityChecker);
        return this;
    }

    public ObjectMapper setVisibility(PropertyAccessor propertyAccessor, JsonAutoDetect.Visibility visibility) {
        this._configOverrides.setDefaultVisibility(this._configOverrides.getDefaultVisibility().withVisibility(propertyAccessor, visibility));
        return this;
    }

    public ObjectMapper setSubtypeResolver(AbstractC5595Xt abstractC5595Xt) {
        this._subtypeResolver = abstractC5595Xt;
        this._deserializationConfig = this._deserializationConfig.with(abstractC5595Xt);
        this._serializationConfig = this._serializationConfig.with(abstractC5595Xt);
        return this;
    }

    public ObjectMapper setAnnotationIntrospector(AnnotationIntrospector annotationIntrospector) {
        this._serializationConfig = this._serializationConfig.with(annotationIntrospector);
        this._deserializationConfig = this._deserializationConfig.with(annotationIntrospector);
        return this;
    }

    public ObjectMapper setAnnotationIntrospectors(AnnotationIntrospector annotationIntrospector, AnnotationIntrospector annotationIntrospector2) {
        this._serializationConfig = this._serializationConfig.with(annotationIntrospector);
        this._deserializationConfig = this._deserializationConfig.with(annotationIntrospector2);
        return this;
    }

    public ObjectMapper setPropertyNamingStrategy(PropertyNamingStrategy propertyNamingStrategy) {
        this._serializationConfig = this._serializationConfig.with(propertyNamingStrategy);
        this._deserializationConfig = this._deserializationConfig.with(propertyNamingStrategy);
        return this;
    }

    public PropertyNamingStrategy getPropertyNamingStrategy() {
        return this._serializationConfig.getPropertyNamingStrategy();
    }

    public ObjectMapper setAccessorNaming(AccessorNamingStrategy.Provider provider) {
        this._serializationConfig = this._serializationConfig.with(provider);
        this._deserializationConfig = this._deserializationConfig.with(provider);
        return this;
    }

    public ObjectMapper setDefaultPrettyPrinter(InterfaceC5504Uh interfaceC5504Uh) {
        this._serializationConfig = this._serializationConfig.withDefaultPrettyPrinter(interfaceC5504Uh);
        return this;
    }

    @Deprecated
    public void setVisibilityChecker(VisibilityChecker<?> visibilityChecker) {
        setVisibility(visibilityChecker);
    }

    public ObjectMapper setPolymorphicTypeValidator(PolymorphicTypeValidator polymorphicTypeValidator) {
        this._deserializationConfig = this._deserializationConfig._withBase(this._deserializationConfig.getBaseSettings().with(polymorphicTypeValidator));
        return this;
    }

    public PolymorphicTypeValidator getPolymorphicTypeValidator() {
        return this._deserializationConfig.getBaseSettings().getPolymorphicTypeValidator();
    }

    public ObjectMapper setSerializationInclusion(JsonInclude.Include include) {
        setPropertyInclusion(JsonInclude.Value.construct(include, include));
        return this;
    }

    @Deprecated
    public ObjectMapper setPropertyInclusion(JsonInclude.Value value) {
        return setDefaultPropertyInclusion(value);
    }

    public ObjectMapper setDefaultPropertyInclusion(JsonInclude.Value value) {
        this._configOverrides.setDefaultInclusion(value);
        return this;
    }

    public ObjectMapper setDefaultPropertyInclusion(JsonInclude.Include include) {
        this._configOverrides.setDefaultInclusion(JsonInclude.Value.construct(include, include));
        return this;
    }

    public ObjectMapper setDefaultSetterInfo(JsonSetter.Value value) {
        this._configOverrides.setDefaultSetterInfo(value);
        return this;
    }

    public ObjectMapper setDefaultVisibility(JsonAutoDetect.Value value) {
        this._configOverrides.setDefaultVisibility(VisibilityChecker.Std.construct(value));
        return this;
    }

    public ObjectMapper setDefaultMergeable(Boolean bool) {
        this._configOverrides.setDefaultMergeable(bool);
        return this;
    }

    public ObjectMapper setDefaultLeniency(Boolean bool) {
        this._configOverrides.setDefaultLeniency(bool);
        return this;
    }

    public void registerSubtypes(Class<?>... clsArr) {
        getSubtypeResolver().registerSubtypes(clsArr);
    }

    public void registerSubtypes(NamedType... namedTypeArr) {
        getSubtypeResolver().registerSubtypes(namedTypeArr);
    }

    public void registerSubtypes(Collection<Class<?>> collection) {
        getSubtypeResolver().registerSubtypes(collection);
    }

    public ObjectMapper activateDefaultTyping(PolymorphicTypeValidator polymorphicTypeValidator) {
        return activateDefaultTyping(polymorphicTypeValidator, DefaultTyping.OBJECT_AND_NON_CONCRETE);
    }

    public ObjectMapper activateDefaultTyping(PolymorphicTypeValidator polymorphicTypeValidator, DefaultTyping defaultTyping) {
        return activateDefaultTyping(polymorphicTypeValidator, defaultTyping, JsonTypeInfo.As.WRAPPER_ARRAY);
    }

    public ObjectMapper activateDefaultTyping(PolymorphicTypeValidator polymorphicTypeValidator, DefaultTyping defaultTyping, JsonTypeInfo.As as) {
        if (as == JsonTypeInfo.As.EXTERNAL_PROPERTY) {
            throw new IllegalArgumentException("Cannot use includeAs of " + as);
        }
        return setDefaultTyping(_constructDefaultTypeResolverBuilder(defaultTyping, polymorphicTypeValidator).init(JsonTypeInfo.Id.CLASS, null).inclusion(as));
    }

    public ObjectMapper activateDefaultTypingAsProperty(PolymorphicTypeValidator polymorphicTypeValidator, DefaultTyping defaultTyping, String str) {
        return setDefaultTyping(_constructDefaultTypeResolverBuilder(defaultTyping, polymorphicTypeValidator).init(JsonTypeInfo.Id.CLASS, null).inclusion(JsonTypeInfo.As.PROPERTY).typeProperty(str));
    }

    public ObjectMapper deactivateDefaultTyping() {
        return setDefaultTyping(null);
    }

    public ObjectMapper setDefaultTyping(InterfaceC5599Xx<?> interfaceC5599Xx) {
        this._deserializationConfig = this._deserializationConfig.with(interfaceC5599Xx);
        this._serializationConfig = this._serializationConfig.with(interfaceC5599Xx);
        return this;
    }

    @Deprecated
    public ObjectMapper enableDefaultTyping() {
        return activateDefaultTyping(getPolymorphicTypeValidator());
    }

    @Deprecated
    public ObjectMapper enableDefaultTyping(DefaultTyping defaultTyping) {
        return enableDefaultTyping(defaultTyping, JsonTypeInfo.As.WRAPPER_ARRAY);
    }

    @Deprecated
    public ObjectMapper enableDefaultTyping(DefaultTyping defaultTyping, JsonTypeInfo.As as) {
        return activateDefaultTyping(getPolymorphicTypeValidator(), defaultTyping, as);
    }

    @Deprecated
    public ObjectMapper enableDefaultTypingAsProperty(DefaultTyping defaultTyping, String str) {
        return activateDefaultTypingAsProperty(getPolymorphicTypeValidator(), defaultTyping, str);
    }

    @Deprecated
    public ObjectMapper disableDefaultTyping() {
        return setDefaultTyping(null);
    }

    public MutableConfigOverride configOverride(Class<?> cls) {
        return this._configOverrides.findOrCreateOverride(cls);
    }

    public MutableCoercionConfig coercionConfigDefaults() {
        return this._coercionConfigs.defaultCoercions();
    }

    public MutableCoercionConfig coercionConfigFor(LogicalType logicalType) {
        return this._coercionConfigs.findOrCreateCoercion(logicalType);
    }

    public MutableCoercionConfig coercionConfigFor(Class<?> cls) {
        return this._coercionConfigs.findOrCreateCoercion(cls);
    }

    public ObjectMapper setTypeFactory(TypeFactory typeFactory) {
        this._typeFactory = typeFactory;
        this._deserializationConfig = this._deserializationConfig.with(typeFactory);
        this._serializationConfig = this._serializationConfig.with(typeFactory);
        return this;
    }

    public JavaType constructType(Type type) {
        _assertNotNull("t", type);
        return this._typeFactory.constructType(type);
    }

    public JavaType constructType(AbstractC5533Vj<?> abstractC5533Vj) {
        _assertNotNull("typeRef", abstractC5533Vj);
        return this._typeFactory.constructType(abstractC5533Vj);
    }

    public JsonNodeFactory getNodeFactory() {
        return this._deserializationConfig.getNodeFactory();
    }

    public ObjectMapper setNodeFactory(JsonNodeFactory jsonNodeFactory) {
        this._deserializationConfig = this._deserializationConfig.with(jsonNodeFactory);
        return this;
    }

    public ObjectMapper setConstructorDetector(ConstructorDetector constructorDetector) {
        this._deserializationConfig = this._deserializationConfig.with(constructorDetector);
        return this;
    }

    public ObjectMapper addHandler(AbstractC5552Wc abstractC5552Wc) {
        this._deserializationConfig = this._deserializationConfig.withHandler(abstractC5552Wc);
        return this;
    }

    public ObjectMapper clearProblemHandlers() {
        this._deserializationConfig = this._deserializationConfig.withNoProblemHandlers();
        return this;
    }

    public ObjectMapper setConfig(DeserializationConfig deserializationConfig) {
        _assertNotNull("config", deserializationConfig);
        this._deserializationConfig = deserializationConfig;
        return this;
    }

    @Deprecated
    public void setFilters(XS xs) {
        this._serializationConfig = this._serializationConfig.withFilters(xs);
    }

    public ObjectMapper setFilterProvider(XS xs) {
        this._serializationConfig = this._serializationConfig.withFilters(xs);
        return this;
    }

    public ObjectMapper setBase64Variant(Base64Variant base64Variant) {
        this._serializationConfig = this._serializationConfig.with(base64Variant);
        this._deserializationConfig = this._deserializationConfig.with(base64Variant);
        return this;
    }

    public ObjectMapper setConfig(SerializationConfig serializationConfig) {
        _assertNotNull("config", serializationConfig);
        this._serializationConfig = serializationConfig;
        return this;
    }

    public ObjectMapper setDateFormat(DateFormat dateFormat) {
        this._deserializationConfig = this._deserializationConfig.with(dateFormat);
        this._serializationConfig = this._serializationConfig.with(dateFormat);
        return this;
    }

    public DateFormat getDateFormat() {
        return this._serializationConfig.getDateFormat();
    }

    public Object setHandlerInstantiator(VQ vq) {
        this._deserializationConfig = this._deserializationConfig.with(vq);
        this._serializationConfig = this._serializationConfig.with(vq);
        return this;
    }

    public ObjectMapper setLocale(Locale locale) {
        this._deserializationConfig = this._deserializationConfig.with(locale);
        this._serializationConfig = this._serializationConfig.with(locale);
        return this;
    }

    public ObjectMapper setTimeZone(TimeZone timeZone) {
        this._deserializationConfig = this._deserializationConfig.with(timeZone);
        this._serializationConfig = this._serializationConfig.with(timeZone);
        return this;
    }

    public ObjectMapper setDefaultAttributes(ContextAttributes contextAttributes) {
        this._deserializationConfig = this._deserializationConfig.with(contextAttributes);
        this._serializationConfig = this._serializationConfig.with(contextAttributes);
        return this;
    }

    public boolean isEnabled(MapperFeature mapperFeature) {
        return this._serializationConfig.isEnabled(mapperFeature);
    }

    @Deprecated
    public ObjectMapper configure(MapperFeature mapperFeature, boolean z) {
        this._serializationConfig = z ? this._serializationConfig.with(mapperFeature) : this._serializationConfig.without(mapperFeature);
        this._deserializationConfig = z ? this._deserializationConfig.with(mapperFeature) : this._deserializationConfig.without(mapperFeature);
        return this;
    }

    @Deprecated
    public ObjectMapper enable(MapperFeature... mapperFeatureArr) {
        this._deserializationConfig = this._deserializationConfig.with(mapperFeatureArr);
        this._serializationConfig = this._serializationConfig.with(mapperFeatureArr);
        return this;
    }

    @Deprecated
    public ObjectMapper disable(MapperFeature... mapperFeatureArr) {
        this._deserializationConfig = this._deserializationConfig.without(mapperFeatureArr);
        this._serializationConfig = this._serializationConfig.without(mapperFeatureArr);
        return this;
    }

    public boolean isEnabled(SerializationFeature serializationFeature) {
        return this._serializationConfig.isEnabled(serializationFeature);
    }

    public ObjectMapper configure(SerializationFeature serializationFeature, boolean z) {
        this._serializationConfig = z ? this._serializationConfig.with(serializationFeature) : this._serializationConfig.without(serializationFeature);
        return this;
    }

    public ObjectMapper enable(SerializationFeature serializationFeature) {
        this._serializationConfig = this._serializationConfig.with(serializationFeature);
        return this;
    }

    public ObjectMapper enable(SerializationFeature serializationFeature, SerializationFeature... serializationFeatureArr) {
        this._serializationConfig = this._serializationConfig.with(serializationFeature, serializationFeatureArr);
        return this;
    }

    public ObjectMapper disable(SerializationFeature serializationFeature) {
        this._serializationConfig = this._serializationConfig.without(serializationFeature);
        return this;
    }

    public ObjectMapper disable(SerializationFeature serializationFeature, SerializationFeature... serializationFeatureArr) {
        this._serializationConfig = this._serializationConfig.without(serializationFeature, serializationFeatureArr);
        return this;
    }

    public boolean isEnabled(DeserializationFeature deserializationFeature) {
        return this._deserializationConfig.isEnabled(deserializationFeature);
    }

    public ObjectMapper configure(DeserializationFeature deserializationFeature, boolean z) {
        this._deserializationConfig = z ? this._deserializationConfig.with(deserializationFeature) : this._deserializationConfig.without(deserializationFeature);
        return this;
    }

    public ObjectMapper enable(DeserializationFeature deserializationFeature) {
        this._deserializationConfig = this._deserializationConfig.with(deserializationFeature);
        return this;
    }

    public ObjectMapper enable(DeserializationFeature deserializationFeature, DeserializationFeature... deserializationFeatureArr) {
        this._deserializationConfig = this._deserializationConfig.with(deserializationFeature, deserializationFeatureArr);
        return this;
    }

    public ObjectMapper disable(DeserializationFeature deserializationFeature) {
        this._deserializationConfig = this._deserializationConfig.without(deserializationFeature);
        return this;
    }

    public ObjectMapper disable(DeserializationFeature deserializationFeature, DeserializationFeature... deserializationFeatureArr) {
        this._deserializationConfig = this._deserializationConfig.without(deserializationFeature, deserializationFeatureArr);
        return this;
    }

    public ObjectMapper configure(VT vt, boolean z) {
        if (z) {
            this._deserializationConfig = this._deserializationConfig.with(vt);
            this._serializationConfig = this._serializationConfig.with(vt);
        } else {
            this._deserializationConfig = this._deserializationConfig.without(vt);
            this._serializationConfig = this._serializationConfig.without(vt);
        }
        return this;
    }

    public boolean isEnabled(JsonParser.Feature feature) {
        return this._deserializationConfig.isEnabled(feature, this._jsonFactory);
    }

    public ObjectMapper configure(JsonParser.Feature feature, boolean z) {
        this._jsonFactory.configure(feature, z);
        return this;
    }

    public ObjectMapper enable(JsonParser.Feature... featureArr) {
        for (JsonParser.Feature feature : featureArr) {
            this._jsonFactory.enable(feature);
        }
        return this;
    }

    public ObjectMapper disable(JsonParser.Feature... featureArr) {
        for (JsonParser.Feature feature : featureArr) {
            this._jsonFactory.disable(feature);
        }
        return this;
    }

    public boolean isEnabled(JsonGenerator.Feature feature) {
        return this._serializationConfig.isEnabled(feature, this._jsonFactory);
    }

    public ObjectMapper configure(JsonGenerator.Feature feature, boolean z) {
        this._jsonFactory.configure(feature, z);
        return this;
    }

    public ObjectMapper enable(JsonGenerator.Feature... featureArr) {
        for (JsonGenerator.Feature feature : featureArr) {
            this._jsonFactory.enable(feature);
        }
        return this;
    }

    public ObjectMapper disable(JsonGenerator.Feature... featureArr) {
        for (JsonGenerator.Feature feature : featureArr) {
            this._jsonFactory.disable(feature);
        }
        return this;
    }

    public boolean isEnabled(JsonFactory.Feature feature) {
        return this._jsonFactory.isEnabled(feature);
    }

    public boolean isEnabled(StreamReadFeature streamReadFeature) {
        return isEnabled(streamReadFeature.mappedFeature());
    }

    public boolean isEnabled(StreamWriteFeature streamWriteFeature) {
        return isEnabled(streamWriteFeature.mappedFeature());
    }

    @Override // o.AbstractC5505Ui
    public <T> T readValue(JsonParser jsonParser, Class<T> cls) throws IOException {
        _assertNotNull(TtmlNode.TAG_P, jsonParser);
        return (T) _readValue(getDeserializationConfig(), jsonParser, this._typeFactory.constructType(cls));
    }

    @Override // o.AbstractC5505Ui
    public <T> T readValue(JsonParser jsonParser, AbstractC5533Vj<T> abstractC5533Vj) throws IOException {
        _assertNotNull(TtmlNode.TAG_P, jsonParser);
        return (T) _readValue(getDeserializationConfig(), jsonParser, this._typeFactory.constructType((AbstractC5533Vj<?>) abstractC5533Vj));
    }

    @Override // o.AbstractC5505Ui
    public final <T> T readValue(JsonParser jsonParser, AbstractC5531Vh abstractC5531Vh) throws IOException {
        _assertNotNull(TtmlNode.TAG_P, jsonParser);
        return (T) _readValue(getDeserializationConfig(), jsonParser, (JavaType) abstractC5531Vh);
    }

    public <T> T readValue(JsonParser jsonParser, JavaType javaType) throws IOException {
        _assertNotNull(TtmlNode.TAG_P, jsonParser);
        return (T) _readValue(getDeserializationConfig(), jsonParser, javaType);
    }

    @Override // o.AbstractC5505Ui, o.AbstractC5506Uj
    public <T extends InterfaceC5509Um> T readTree(JsonParser jsonParser) throws IOException {
        _assertNotNull(TtmlNode.TAG_P, jsonParser);
        DeserializationConfig deserializationConfig = getDeserializationConfig();
        if (jsonParser.djBIcL() == null && jsonParser.RcXXUw() == null) {
            return null;
        }
        JsonNode jsonNode = (JsonNode) _readValue(deserializationConfig, jsonParser, constructType(JsonNode.class));
        return jsonNode == null ? getNodeFactory().m6141nullNode() : jsonNode;
    }

    /* JADX DEBUG: Method merged with bridge method: readValues(Lcom/fasterxml/jackson/core/JsonParser;Lo/Vh;)Ljava/util/Iterator; */
    @Override // o.AbstractC5505Ui
    public <T> VB<T> readValues(JsonParser jsonParser, AbstractC5531Vh abstractC5531Vh) throws IOException {
        return readValues(jsonParser, (JavaType) abstractC5531Vh);
    }

    public <T> VB<T> readValues(JsonParser jsonParser, JavaType javaType) throws IOException {
        _assertNotNull(TtmlNode.TAG_P, jsonParser);
        DefaultDeserializationContext defaultDeserializationContextCreateDeserializationContext = createDeserializationContext(jsonParser, getDeserializationConfig());
        return new VB<>(javaType, jsonParser, defaultDeserializationContextCreateDeserializationContext, _findRootDeserializer(defaultDeserializationContextCreateDeserializationContext, javaType), false, null);
    }

    /* JADX DEBUG: Method merged with bridge method: readValues(Lcom/fasterxml/jackson/core/JsonParser;Ljava/lang/Class;)Ljava/util/Iterator; */
    @Override // o.AbstractC5505Ui
    public <T> VB<T> readValues(JsonParser jsonParser, Class<T> cls) throws IOException {
        return readValues(jsonParser, this._typeFactory.constructType(cls));
    }

    /* JADX DEBUG: Method merged with bridge method: readValues(Lcom/fasterxml/jackson/core/JsonParser;Lo/Vj;)Ljava/util/Iterator; */
    @Override // o.AbstractC5505Ui
    public <T> VB<T> readValues(JsonParser jsonParser, AbstractC5533Vj<T> abstractC5533Vj) throws IOException {
        return readValues(jsonParser, this._typeFactory.constructType((AbstractC5533Vj<?>) abstractC5533Vj));
    }

    public JsonNode readTree(InputStream inputStream) throws IOException {
        _assertNotNull("in", inputStream);
        return _readTreeAndClose(this._jsonFactory.createParser(inputStream));
    }

    public JsonNode readTree(Reader reader) throws IOException {
        _assertNotNull("r", reader);
        return _readTreeAndClose(this._jsonFactory.createParser(reader));
    }

    public JsonNode readTree(String str) throws JsonProcessingException {
        _assertNotNull("content", str);
        try {
            return _readTreeAndClose(this._jsonFactory.createParser(str));
        } catch (JsonProcessingException e) {
            throw e;
        } catch (IOException e2) {
            throw JsonMappingException.fromUnexpectedIOE(e2);
        }
    }

    public JsonNode readTree(byte[] bArr) throws IOException {
        _assertNotNull("content", bArr);
        return _readTreeAndClose(this._jsonFactory.createParser(bArr));
    }

    public JsonNode readTree(byte[] bArr, int i, int i2) throws IOException {
        _assertNotNull("content", bArr);
        return _readTreeAndClose(this._jsonFactory.createParser(bArr, i, i2));
    }

    public JsonNode readTree(File file) throws IOException {
        _assertNotNull("file", file);
        return _readTreeAndClose(this._jsonFactory.createParser(file));
    }

    public JsonNode readTree(URL url) throws IOException {
        _assertNotNull("source", url);
        return _readTreeAndClose(this._jsonFactory.createParser(url));
    }

    @Override // o.AbstractC5505Ui
    public void writeValue(JsonGenerator jsonGenerator, Object obj) throws IOException {
        _assertNotNull("g", jsonGenerator);
        SerializationConfig serializationConfig = getSerializationConfig();
        if (serializationConfig.isEnabled(SerializationFeature.INDENT_OUTPUT) && jsonGenerator.djBIcL() == null) {
            jsonGenerator.EZpvd(serializationConfig.constructDefaultPrettyPrinter());
        }
        if (serializationConfig.isEnabled(SerializationFeature.CLOSE_CLOSEABLE) && (obj instanceof Closeable)) {
            _writeCloseableValue(jsonGenerator, obj, serializationConfig);
            return;
        }
        _serializerProvider(serializationConfig).serializeValue(jsonGenerator, obj);
        if (serializationConfig.isEnabled(SerializationFeature.FLUSH_AFTER_WRITE_VALUE)) {
            jsonGenerator.flush();
        }
    }

    @Override // o.AbstractC5505Ui, o.AbstractC5506Uj
    public void writeTree(JsonGenerator jsonGenerator, InterfaceC5509Um interfaceC5509Um) throws IOException {
        _assertNotNull("g", jsonGenerator);
        SerializationConfig serializationConfig = getSerializationConfig();
        _serializerProvider(serializationConfig).serializeValue(jsonGenerator, interfaceC5509Um);
        if (serializationConfig.isEnabled(SerializationFeature.FLUSH_AFTER_WRITE_VALUE)) {
            jsonGenerator.flush();
        }
    }

    public void writeTree(JsonGenerator jsonGenerator, JsonNode jsonNode) throws IOException {
        _assertNotNull("g", jsonGenerator);
        SerializationConfig serializationConfig = getSerializationConfig();
        _serializerProvider(serializationConfig).serializeValue(jsonGenerator, jsonNode);
        if (serializationConfig.isEnabled(SerializationFeature.FLUSH_AFTER_WRITE_VALUE)) {
            jsonGenerator.flush();
        }
    }

    /* JADX DEBUG: Method merged with bridge method: createObjectNode()Lo/Um; */
    @Override // o.AbstractC5505Ui, o.AbstractC5506Uj
    public ObjectNode createObjectNode() {
        return this._deserializationConfig.getNodeFactory().objectNode();
    }

    /* JADX DEBUG: Method merged with bridge method: createArrayNode()Lo/Um; */
    @Override // o.AbstractC5505Ui, o.AbstractC5506Uj
    public ArrayNode createArrayNode() {
        return this._deserializationConfig.getNodeFactory().arrayNode();
    }

    /* JADX DEBUG: Method merged with bridge method: missingNode()Lo/Um; */
    @Override // o.AbstractC5506Uj
    public JsonNode missingNode() {
        return this._deserializationConfig.getNodeFactory().missingNode();
    }

    /* JADX DEBUG: Method merged with bridge method: nullNode()Lo/Um; */
    @Override // o.AbstractC5506Uj
    public JsonNode nullNode() {
        return this._deserializationConfig.getNodeFactory().m6141nullNode();
    }

    @Override // o.AbstractC5505Ui, o.AbstractC5506Uj
    public JsonParser treeAsTokens(InterfaceC5509Um interfaceC5509Um) {
        _assertNotNull("n", interfaceC5509Um);
        return new XQ((JsonNode) interfaceC5509Um, this);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: o.Um */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC5505Ui
    public <T> T treeToValue(InterfaceC5509Um interfaceC5509Um, Class<T> cls) throws JsonProcessingException, IllegalArgumentException {
        T t;
        if (interfaceC5509Um == 0) {
            return null;
        }
        try {
            return (InterfaceC5509Um.class.isAssignableFrom(cls) && cls.isAssignableFrom(interfaceC5509Um.getClass())) ? interfaceC5509Um : (interfaceC5509Um.asToken() == JsonToken.VALUE_EMBEDDED_OBJECT && (interfaceC5509Um instanceof POJONode) && ((t = (T) ((POJONode) interfaceC5509Um).getPojo()) == null || cls.isInstance(t))) ? t : (T) readValue(treeAsTokens(interfaceC5509Um), cls);
        } catch (JsonProcessingException e) {
            throw e;
        } catch (IOException e2) {
            throw new IllegalArgumentException(e2.getMessage(), e2);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: o.Um */
    /* JADX WARN: Multi-variable type inference failed */
    public <T> T treeToValue(InterfaceC5509Um interfaceC5509Um, JavaType javaType) throws JsonProcessingException, IllegalArgumentException {
        T t;
        if (interfaceC5509Um == 0) {
            return null;
        }
        try {
            return (javaType.isTypeOrSubTypeOf(InterfaceC5509Um.class) && javaType.isTypeOrSuperTypeOf(interfaceC5509Um.getClass())) ? interfaceC5509Um : (interfaceC5509Um.asToken() == JsonToken.VALUE_EMBEDDED_OBJECT && (interfaceC5509Um instanceof POJONode) && ((t = (T) ((POJONode) interfaceC5509Um).getPojo()) == null || javaType.isTypeOrSuperTypeOf(t.getClass()))) ? t : (T) readValue(treeAsTokens(interfaceC5509Um), javaType);
        } catch (JsonProcessingException e) {
            throw e;
        } catch (IOException e2) {
            throw new IllegalArgumentException(e2.getMessage(), e2);
        }
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, THROW, THROW, INVOKE, MOVE_EXCEPTION, INVOKE, MOVE_EXCEPTION, IF, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    public <T extends JsonNode> T valueToTree(Object obj) throws IllegalArgumentException {
        if (obj == null) {
            return getNodeFactory().m6141nullNode();
        }
        DefaultSerializerProvider defaultSerializerProvider_serializerProvider = _serializerProvider(getSerializationConfig().without(SerializationFeature.WRAP_ROOT_VALUE));
        YA yaBufferForValueConversion = defaultSerializerProvider_serializerProvider.bufferForValueConversion(this);
        if (isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS)) {
            yaBufferForValueConversion = yaBufferForValueConversion.EZpvd(true);
        }
        try {
            defaultSerializerProvider_serializerProvider.serializeValue(yaBufferForValueConversion, obj);
            JsonParser jsonParserFIwbmz = yaBufferForValueConversion.fIwbmz();
            try {
                T t = (T) readTree(jsonParserFIwbmz);
                if (jsonParserFIwbmz != null) {
                    jsonParserFIwbmz.close();
                }
                return t;
            } finally {
            }
        } catch (IOException e) {
            throw new IllegalArgumentException(e.getMessage(), e);
        }
    }

    public boolean canSerialize(Class<?> cls) {
        return _serializerProvider(getSerializationConfig()).hasSerializerFor(cls, null);
    }

    public boolean canSerialize(Class<?> cls, AtomicReference<Throwable> atomicReference) {
        return _serializerProvider(getSerializationConfig()).hasSerializerFor(cls, atomicReference);
    }

    public boolean canDeserialize(JavaType javaType) {
        return createDeserializationContext(null, getDeserializationConfig()).hasValueDeserializerFor(javaType, null);
    }

    public boolean canDeserialize(JavaType javaType, AtomicReference<Throwable> atomicReference) {
        return createDeserializationContext(null, getDeserializationConfig()).hasValueDeserializerFor(javaType, atomicReference);
    }

    public <T> T readValue(File file, Class<T> cls) throws IOException {
        _assertNotNull("src", file);
        return (T) _readMapAndClose(this._jsonFactory.createParser(file), this._typeFactory.constructType(cls));
    }

    public <T> T readValue(File file, AbstractC5533Vj<T> abstractC5533Vj) throws IOException {
        _assertNotNull("src", file);
        return (T) _readMapAndClose(this._jsonFactory.createParser(file), this._typeFactory.constructType((AbstractC5533Vj<?>) abstractC5533Vj));
    }

    public <T> T readValue(File file, JavaType javaType) throws IOException {
        _assertNotNull("src", file);
        return (T) _readMapAndClose(this._jsonFactory.createParser(file), javaType);
    }

    public <T> T readValue(URL url, Class<T> cls) throws IOException {
        _assertNotNull("src", url);
        return (T) _readMapAndClose(this._jsonFactory.createParser(url), this._typeFactory.constructType(cls));
    }

    public <T> T readValue(URL url, AbstractC5533Vj<T> abstractC5533Vj) throws IOException {
        _assertNotNull("src", url);
        return (T) _readMapAndClose(this._jsonFactory.createParser(url), this._typeFactory.constructType((AbstractC5533Vj<?>) abstractC5533Vj));
    }

    public <T> T readValue(URL url, JavaType javaType) throws IOException {
        _assertNotNull("src", url);
        return (T) _readMapAndClose(this._jsonFactory.createParser(url), javaType);
    }

    public <T> T readValue(String str, Class<T> cls) throws JsonProcessingException {
        _assertNotNull("content", str);
        return (T) readValue(str, this._typeFactory.constructType(cls));
    }

    public <T> T readValue(String str, AbstractC5533Vj<T> abstractC5533Vj) throws JsonProcessingException {
        _assertNotNull("content", str);
        return (T) readValue(str, this._typeFactory.constructType((AbstractC5533Vj<?>) abstractC5533Vj));
    }

    public <T> T readValue(String str, JavaType javaType) throws JsonProcessingException {
        _assertNotNull("content", str);
        try {
            return (T) _readMapAndClose(this._jsonFactory.createParser(str), javaType);
        } catch (JsonProcessingException e) {
            throw e;
        } catch (IOException e2) {
            throw JsonMappingException.fromUnexpectedIOE(e2);
        }
    }

    public <T> T readValue(Reader reader, Class<T> cls) throws IOException {
        _assertNotNull("src", reader);
        return (T) _readMapAndClose(this._jsonFactory.createParser(reader), this._typeFactory.constructType(cls));
    }

    public <T> T readValue(Reader reader, AbstractC5533Vj<T> abstractC5533Vj) throws IOException {
        _assertNotNull("src", reader);
        return (T) _readMapAndClose(this._jsonFactory.createParser(reader), this._typeFactory.constructType((AbstractC5533Vj<?>) abstractC5533Vj));
    }

    public <T> T readValue(Reader reader, JavaType javaType) throws IOException {
        _assertNotNull("src", reader);
        return (T) _readMapAndClose(this._jsonFactory.createParser(reader), javaType);
    }

    public <T> T readValue(InputStream inputStream, Class<T> cls) throws IOException {
        _assertNotNull("src", inputStream);
        return (T) _readMapAndClose(this._jsonFactory.createParser(inputStream), this._typeFactory.constructType(cls));
    }

    public <T> T readValue(InputStream inputStream, AbstractC5533Vj<T> abstractC5533Vj) throws IOException {
        _assertNotNull("src", inputStream);
        return (T) _readMapAndClose(this._jsonFactory.createParser(inputStream), this._typeFactory.constructType((AbstractC5533Vj<?>) abstractC5533Vj));
    }

    public <T> T readValue(InputStream inputStream, JavaType javaType) throws IOException {
        _assertNotNull("src", inputStream);
        return (T) _readMapAndClose(this._jsonFactory.createParser(inputStream), javaType);
    }

    public <T> T readValue(byte[] bArr, Class<T> cls) throws IOException {
        _assertNotNull("src", bArr);
        return (T) _readMapAndClose(this._jsonFactory.createParser(bArr), this._typeFactory.constructType(cls));
    }

    public <T> T readValue(byte[] bArr, int i, int i2, Class<T> cls) throws IOException {
        _assertNotNull("src", bArr);
        return (T) _readMapAndClose(this._jsonFactory.createParser(bArr, i, i2), this._typeFactory.constructType(cls));
    }

    public <T> T readValue(byte[] bArr, AbstractC5533Vj<T> abstractC5533Vj) throws IOException {
        _assertNotNull("src", bArr);
        return (T) _readMapAndClose(this._jsonFactory.createParser(bArr), this._typeFactory.constructType((AbstractC5533Vj<?>) abstractC5533Vj));
    }

    public <T> T readValue(byte[] bArr, int i, int i2, AbstractC5533Vj<T> abstractC5533Vj) throws IOException {
        _assertNotNull("src", bArr);
        return (T) _readMapAndClose(this._jsonFactory.createParser(bArr, i, i2), this._typeFactory.constructType((AbstractC5533Vj<?>) abstractC5533Vj));
    }

    public <T> T readValue(byte[] bArr, JavaType javaType) throws IOException {
        _assertNotNull("src", bArr);
        return (T) _readMapAndClose(this._jsonFactory.createParser(bArr), javaType);
    }

    public <T> T readValue(byte[] bArr, int i, int i2, JavaType javaType) throws IOException {
        _assertNotNull("src", bArr);
        return (T) _readMapAndClose(this._jsonFactory.createParser(bArr, i, i2), javaType);
    }

    public <T> T readValue(DataInput dataInput, Class<T> cls) throws IOException {
        _assertNotNull("src", dataInput);
        return (T) _readMapAndClose(this._jsonFactory.createParser(dataInput), this._typeFactory.constructType(cls));
    }

    public <T> T readValue(DataInput dataInput, JavaType javaType) throws IOException {
        _assertNotNull("src", dataInput);
        return (T) _readMapAndClose(this._jsonFactory.createParser(dataInput), javaType);
    }

    public void writeValue(File file, Object obj) throws IOException {
        _writeValueAndClose(createGenerator(file, JsonEncoding.UTF8), obj);
    }

    public void writeValue(OutputStream outputStream, Object obj) throws IOException {
        _writeValueAndClose(createGenerator(outputStream, JsonEncoding.UTF8), obj);
    }

    public void writeValue(DataOutput dataOutput, Object obj) throws IOException {
        _writeValueAndClose(createGenerator(dataOutput), obj);
    }

    public void writeValue(Writer writer, Object obj) throws IOException {
        _writeValueAndClose(createGenerator(writer), obj);
    }

    public String writeValueAsString(Object obj) throws JsonProcessingException {
        UC uc = new UC(this._jsonFactory._getBufferRecycler());
        try {
            _writeValueAndClose(createGenerator(uc), obj);
            return uc.OLrzqt();
        } catch (JsonProcessingException e) {
            throw e;
        } catch (IOException e2) {
            throw JsonMappingException.fromUnexpectedIOE(e2);
        }
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[INVOKE] complete} */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    public byte[] writeValueAsBytes(Object obj) throws JsonProcessingException {
        try {
            C5537Vn c5537Vn = new C5537Vn(this._jsonFactory._getBufferRecycler());
            try {
                _writeValueAndClose(createGenerator(c5537Vn, JsonEncoding.UTF8), obj);
                byte[] bArrAYXKKw = c5537Vn.AYXKKw();
                c5537Vn.OLrzqt();
                c5537Vn.close();
                return bArrAYXKKw;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    try {
                        c5537Vn.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
        } catch (JsonProcessingException e) {
            throw e;
        } catch (IOException e2) {
            throw JsonMappingException.fromUnexpectedIOE(e2);
        }
    }

    public ObjectWriter writer() {
        return _newWriter(getSerializationConfig());
    }

    public ObjectWriter writer(SerializationFeature serializationFeature) {
        return _newWriter(getSerializationConfig().with(serializationFeature));
    }

    public ObjectWriter writer(SerializationFeature serializationFeature, SerializationFeature... serializationFeatureArr) {
        return _newWriter(getSerializationConfig().with(serializationFeature, serializationFeatureArr));
    }

    public ObjectWriter writer(DateFormat dateFormat) {
        return _newWriter(getSerializationConfig().with(dateFormat));
    }

    public ObjectWriter writerWithView(Class<?> cls) {
        return _newWriter(getSerializationConfig().withView(cls));
    }

    public ObjectWriter writerFor(Class<?> cls) {
        return _newWriter(getSerializationConfig(), cls == null ? null : this._typeFactory.constructType(cls), null);
    }

    public ObjectWriter writerFor(AbstractC5533Vj<?> abstractC5533Vj) {
        return _newWriter(getSerializationConfig(), abstractC5533Vj == null ? null : this._typeFactory.constructType(abstractC5533Vj), null);
    }

    public ObjectWriter writerFor(JavaType javaType) {
        return _newWriter(getSerializationConfig(), javaType, null);
    }

    public ObjectWriter writer(InterfaceC5504Uh interfaceC5504Uh) {
        if (interfaceC5504Uh == null) {
            interfaceC5504Uh = ObjectWriter.NULL_PRETTY_PRINTER;
        }
        return _newWriter(getSerializationConfig(), null, interfaceC5504Uh);
    }

    public ObjectWriter writerWithDefaultPrettyPrinter() {
        SerializationConfig serializationConfig = getSerializationConfig();
        return _newWriter(serializationConfig, null, serializationConfig.getDefaultPrettyPrinter());
    }

    public ObjectWriter writer(XS xs) {
        return _newWriter(getSerializationConfig().withFilters(xs));
    }

    public ObjectWriter writer(InterfaceC5497Ua interfaceC5497Ua) {
        _verifySchemaType(interfaceC5497Ua);
        return _newWriter(getSerializationConfig(), interfaceC5497Ua);
    }

    public ObjectWriter writer(Base64Variant base64Variant) {
        return _newWriter(getSerializationConfig().with(base64Variant));
    }

    public ObjectWriter writer(CharacterEscapes characterEscapes) {
        return _newWriter(getSerializationConfig()).with(characterEscapes);
    }

    public ObjectWriter writer(ContextAttributes contextAttributes) {
        return _newWriter(getSerializationConfig().with(contextAttributes));
    }

    @Deprecated
    public ObjectWriter writerWithType(Class<?> cls) {
        return _newWriter(getSerializationConfig(), cls == null ? null : this._typeFactory.constructType(cls), null);
    }

    @Deprecated
    public ObjectWriter writerWithType(AbstractC5533Vj<?> abstractC5533Vj) {
        return _newWriter(getSerializationConfig(), abstractC5533Vj == null ? null : this._typeFactory.constructType(abstractC5533Vj), null);
    }

    @Deprecated
    public ObjectWriter writerWithType(JavaType javaType) {
        return _newWriter(getSerializationConfig(), javaType, null);
    }

    public ObjectReader reader() {
        return _newReader(getDeserializationConfig()).with(this._injectableValues);
    }

    public ObjectReader reader(DeserializationFeature deserializationFeature) {
        return _newReader(getDeserializationConfig().with(deserializationFeature));
    }

    public ObjectReader reader(DeserializationFeature deserializationFeature, DeserializationFeature... deserializationFeatureArr) {
        return _newReader(getDeserializationConfig().with(deserializationFeature, deserializationFeatureArr));
    }

    public ObjectReader readerForUpdating(Object obj) {
        return _newReader(getDeserializationConfig(), obj == null ? null : this._typeFactory.constructType(obj.getClass()), obj, null, this._injectableValues);
    }

    public ObjectReader readerFor(JavaType javaType) {
        return _newReader(getDeserializationConfig(), javaType, null, null, this._injectableValues);
    }

    public ObjectReader readerFor(Class<?> cls) {
        return _newReader(getDeserializationConfig(), cls == null ? null : this._typeFactory.constructType(cls), null, null, this._injectableValues);
    }

    public ObjectReader readerFor(AbstractC5533Vj<?> abstractC5533Vj) {
        _assertNotNull("type", abstractC5533Vj);
        return _newReader(getDeserializationConfig(), this._typeFactory.constructType(abstractC5533Vj), null, null, this._injectableValues);
    }

    public ObjectReader readerForArrayOf(Class<?> cls) {
        _assertNotNull("type", cls);
        return _newReader(getDeserializationConfig(), this._typeFactory.constructArrayType(cls), null, null, this._injectableValues);
    }

    public ObjectReader readerForListOf(Class<?> cls) {
        _assertNotNull("type", cls);
        return _newReader(getDeserializationConfig(), this._typeFactory.constructCollectionType(List.class, cls), null, null, this._injectableValues);
    }

    public ObjectReader readerForMapOf(Class<?> cls) {
        _assertNotNull("type", cls);
        return _newReader(getDeserializationConfig(), this._typeFactory.constructMapType(Map.class, String.class, cls), null, null, this._injectableValues);
    }

    public ObjectReader reader(JsonNodeFactory jsonNodeFactory) {
        _assertNotNull("nodeFactory", jsonNodeFactory);
        return _newReader(getDeserializationConfig()).with(jsonNodeFactory);
    }

    public ObjectReader reader(InterfaceC5497Ua interfaceC5497Ua) {
        _verifySchemaType(interfaceC5497Ua);
        return _newReader(getDeserializationConfig(), null, null, interfaceC5497Ua, this._injectableValues);
    }

    public ObjectReader reader(InjectableValues injectableValues) {
        return _newReader(getDeserializationConfig(), null, null, null, injectableValues);
    }

    public ObjectReader readerWithView(Class<?> cls) {
        return _newReader(getDeserializationConfig().withView(cls));
    }

    public ObjectReader reader(Base64Variant base64Variant) {
        return _newReader(getDeserializationConfig().with(base64Variant));
    }

    public ObjectReader reader(ContextAttributes contextAttributes) {
        return _newReader(getDeserializationConfig().with(contextAttributes));
    }

    @Deprecated
    public ObjectReader reader(JavaType javaType) {
        return _newReader(getDeserializationConfig(), javaType, null, null, this._injectableValues);
    }

    @Deprecated
    public ObjectReader reader(Class<?> cls) {
        return _newReader(getDeserializationConfig(), this._typeFactory.constructType(cls), null, null, this._injectableValues);
    }

    @Deprecated
    public ObjectReader reader(AbstractC5533Vj<?> abstractC5533Vj) {
        return _newReader(getDeserializationConfig(), this._typeFactory.constructType(abstractC5533Vj), null, null, this._injectableValues);
    }

    public <T> T convertValue(Object obj, Class<T> cls) throws IllegalArgumentException {
        return (T) _convert(obj, this._typeFactory.constructType(cls));
    }

    public <T> T convertValue(Object obj, AbstractC5533Vj<T> abstractC5533Vj) throws IllegalArgumentException {
        return (T) _convert(obj, this._typeFactory.constructType((AbstractC5533Vj<?>) abstractC5533Vj));
    }

    public <T> T convertValue(Object obj, JavaType javaType) throws IllegalArgumentException {
        return (T) _convert(obj, javaType);
    }

    public Object _convert(Object obj, JavaType javaType) throws IllegalArgumentException {
        Object objDeserialize;
        DefaultSerializerProvider defaultSerializerProvider_serializerProvider = _serializerProvider(getSerializationConfig().without(SerializationFeature.WRAP_ROOT_VALUE));
        YA yaBufferForValueConversion = defaultSerializerProvider_serializerProvider.bufferForValueConversion(this);
        if (isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS)) {
            yaBufferForValueConversion = yaBufferForValueConversion.EZpvd(true);
        }
        try {
            defaultSerializerProvider_serializerProvider.serializeValue(yaBufferForValueConversion, obj);
            JsonParser jsonParserFIwbmz = yaBufferForValueConversion.fIwbmz();
            DeserializationConfig deserializationConfig = getDeserializationConfig();
            JsonToken jsonToken_initForReading = _initForReading(jsonParserFIwbmz, javaType);
            if (jsonToken_initForReading == JsonToken.VALUE_NULL) {
                DefaultDeserializationContext defaultDeserializationContextCreateDeserializationContext = createDeserializationContext(jsonParserFIwbmz, deserializationConfig);
                objDeserialize = _findRootDeserializer(defaultDeserializationContextCreateDeserializationContext, javaType).getNullValue(defaultDeserializationContextCreateDeserializationContext);
            } else if (jsonToken_initForReading == JsonToken.END_ARRAY || jsonToken_initForReading == JsonToken.END_OBJECT) {
                objDeserialize = null;
            } else {
                DefaultDeserializationContext defaultDeserializationContextCreateDeserializationContext2 = createDeserializationContext(jsonParserFIwbmz, deserializationConfig);
                objDeserialize = _findRootDeserializer(defaultDeserializationContextCreateDeserializationContext2, javaType).deserialize(jsonParserFIwbmz, defaultDeserializationContextCreateDeserializationContext2);
            }
            jsonParserFIwbmz.close();
            return objDeserialize;
        } catch (IOException e) {
            throw new IllegalArgumentException(e.getMessage(), e);
        }
    }

    public <T> T updateValue(T t, Object obj) throws JsonMappingException {
        if (t == null || obj == null) {
            return t;
        }
        DefaultSerializerProvider defaultSerializerProvider_serializerProvider = _serializerProvider(getSerializationConfig().without(SerializationFeature.WRAP_ROOT_VALUE));
        YA yaBufferForValueConversion = defaultSerializerProvider_serializerProvider.bufferForValueConversion(this);
        if (isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS)) {
            yaBufferForValueConversion = yaBufferForValueConversion.EZpvd(true);
        }
        try {
            defaultSerializerProvider_serializerProvider.serializeValue(yaBufferForValueConversion, obj);
            JsonParser jsonParserFIwbmz = yaBufferForValueConversion.fIwbmz();
            T t2 = (T) readerForUpdating(t).readValue(jsonParserFIwbmz);
            jsonParserFIwbmz.close();
            return t2;
        } catch (IOException e) {
            if (e instanceof JsonMappingException) {
                throw ((JsonMappingException) e);
            }
            throw JsonMappingException.fromUnexpectedIOE(e);
        }
    }

    @Deprecated
    public C5594Xs generateJsonSchema(Class<?> cls) throws JsonMappingException {
        return _serializerProvider(getSerializationConfig()).generateJsonSchema(cls);
    }

    public void acceptJsonFormatVisitor(Class<?> cls, InterfaceC5584Xi interfaceC5584Xi) throws JsonMappingException {
        acceptJsonFormatVisitor(this._typeFactory.constructType(cls), interfaceC5584Xi);
    }

    public void acceptJsonFormatVisitor(JavaType javaType, InterfaceC5584Xi interfaceC5584Xi) throws JsonMappingException {
        if (javaType == null) {
            throw new IllegalArgumentException("type must be provided");
        }
        _serializerProvider(getSerializationConfig()).acceptJsonFormatVisitor(javaType, interfaceC5584Xi);
    }

    public InterfaceC5599Xx<?> _constructDefaultTypeResolverBuilder(DefaultTyping defaultTyping, PolymorphicTypeValidator polymorphicTypeValidator) {
        return DefaultTypeResolverBuilder.construct(defaultTyping, polymorphicTypeValidator);
    }

    public DefaultSerializerProvider _serializerProvider(SerializationConfig serializationConfig) {
        return this._serializerProvider.createInstance(serializationConfig, this._serializerFactory);
    }

    public final void _writeValueAndClose(JsonGenerator jsonGenerator, Object obj) throws IOException {
        SerializationConfig serializationConfig = getSerializationConfig();
        if (serializationConfig.isEnabled(SerializationFeature.CLOSE_CLOSEABLE) && (obj instanceof Closeable)) {
            _writeCloseable(jsonGenerator, obj, serializationConfig);
            return;
        }
        try {
            _serializerProvider(serializationConfig).serializeValue(jsonGenerator, obj);
            jsonGenerator.close();
        } catch (Exception e) {
            C5619Yr.copydefault(jsonGenerator, e);
        }
    }

    private final void _writeCloseable(JsonGenerator jsonGenerator, Object obj, SerializationConfig serializationConfig) throws IOException {
        Closeable closeable = (Closeable) obj;
        try {
            _serializerProvider(serializationConfig).serializeValue(jsonGenerator, obj);
            try {
                closeable.close();
                jsonGenerator.close();
            } catch (Exception e) {
                e = e;
                closeable = null;
                C5619Yr.OLrzqt(jsonGenerator, closeable, e);
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    private final void _writeCloseableValue(JsonGenerator jsonGenerator, Object obj, SerializationConfig serializationConfig) throws IOException {
        Closeable closeable = (Closeable) obj;
        try {
            _serializerProvider(serializationConfig).serializeValue(jsonGenerator, obj);
            if (serializationConfig.isEnabled(SerializationFeature.FLUSH_AFTER_WRITE_VALUE)) {
                jsonGenerator.flush();
            }
            closeable.close();
        } catch (Exception e) {
            C5619Yr.OLrzqt((JsonGenerator) null, closeable, e);
        }
    }

    @Deprecated
    public final void _configAndWriteValue(JsonGenerator jsonGenerator, Object obj) throws IOException {
        getSerializationConfig().initialize(jsonGenerator);
        _writeValueAndClose(jsonGenerator, obj);
    }

    public Object _readValue(DeserializationConfig deserializationConfig, JsonParser jsonParser, JavaType javaType) throws IOException {
        Object rootValue;
        JsonToken jsonToken_initForReading = _initForReading(jsonParser, javaType);
        DefaultDeserializationContext defaultDeserializationContextCreateDeserializationContext = createDeserializationContext(jsonParser, deserializationConfig);
        if (jsonToken_initForReading == JsonToken.VALUE_NULL) {
            rootValue = _findRootDeserializer(defaultDeserializationContextCreateDeserializationContext, javaType).getNullValue(defaultDeserializationContextCreateDeserializationContext);
        } else {
            rootValue = (jsonToken_initForReading == JsonToken.END_ARRAY || jsonToken_initForReading == JsonToken.END_OBJECT) ? null : defaultDeserializationContextCreateDeserializationContext.readRootValue(jsonParser, javaType, _findRootDeserializer(defaultDeserializationContextCreateDeserializationContext, javaType), null);
        }
        jsonParser.OLrzqt();
        if (deserializationConfig.isEnabled(DeserializationFeature.FAIL_ON_TRAILING_TOKENS)) {
            _verifyNoTrailingTokens(jsonParser, defaultDeserializationContextCreateDeserializationContext, javaType);
        }
        return rootValue;
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    public Object _readMapAndClose(JsonParser jsonParser, JavaType javaType) throws IOException {
        Object rootValue;
        try {
            DeserializationConfig deserializationConfig = getDeserializationConfig();
            DefaultDeserializationContext defaultDeserializationContextCreateDeserializationContext = createDeserializationContext(jsonParser, deserializationConfig);
            JsonToken jsonToken_initForReading = _initForReading(jsonParser, javaType);
            if (jsonToken_initForReading == JsonToken.VALUE_NULL) {
                rootValue = _findRootDeserializer(defaultDeserializationContextCreateDeserializationContext, javaType).getNullValue(defaultDeserializationContextCreateDeserializationContext);
            } else if (jsonToken_initForReading == JsonToken.END_ARRAY || jsonToken_initForReading == JsonToken.END_OBJECT) {
                rootValue = null;
            } else {
                rootValue = defaultDeserializationContextCreateDeserializationContext.readRootValue(jsonParser, javaType, _findRootDeserializer(defaultDeserializationContextCreateDeserializationContext, javaType), null);
                defaultDeserializationContextCreateDeserializationContext.checkUnresolvedObjectId();
            }
            if (deserializationConfig.isEnabled(DeserializationFeature.FAIL_ON_TRAILING_TOKENS)) {
                _verifyNoTrailingTokens(jsonParser, defaultDeserializationContextCreateDeserializationContext, javaType);
            }
            if (jsonParser != null) {
                jsonParser.close();
            }
            return rootValue;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (jsonParser != null) {
                    try {
                        jsonParser.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    public JsonNode _readTreeAndClose(JsonParser jsonParser) throws IOException {
        JsonNode jsonNodeNullNode;
        try {
            JavaType javaTypeConstructType = constructType(JsonNode.class);
            DeserializationConfig deserializationConfig = getDeserializationConfig();
            deserializationConfig.initialize(jsonParser);
            JsonToken jsonTokenDjBIcL = jsonParser.djBIcL();
            if (jsonTokenDjBIcL == null && (jsonTokenDjBIcL = jsonParser.RcXXUw()) == null) {
                JsonNode jsonNodeMissingNode = deserializationConfig.getNodeFactory().missingNode();
                jsonParser.close();
                return jsonNodeMissingNode;
            }
            DefaultDeserializationContext defaultDeserializationContextCreateDeserializationContext = createDeserializationContext(jsonParser, deserializationConfig);
            if (jsonTokenDjBIcL == JsonToken.VALUE_NULL) {
                jsonNodeNullNode = deserializationConfig.getNodeFactory().m6141nullNode();
            } else {
                jsonNodeNullNode = (JsonNode) defaultDeserializationContextCreateDeserializationContext.readRootValue(jsonParser, javaTypeConstructType, _findRootDeserializer(defaultDeserializationContextCreateDeserializationContext, javaTypeConstructType), null);
            }
            if (deserializationConfig.isEnabled(DeserializationFeature.FAIL_ON_TRAILING_TOKENS)) {
                _verifyNoTrailingTokens(jsonParser, defaultDeserializationContextCreateDeserializationContext, javaTypeConstructType);
            }
            jsonParser.close();
            return jsonNodeNullNode;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (jsonParser != null) {
                    try {
                        jsonParser.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
    }

    public DefaultDeserializationContext createDeserializationContext(JsonParser jsonParser, DeserializationConfig deserializationConfig) {
        return this._deserializationContext.createInstance(deserializationConfig, jsonParser, this._injectableValues);
    }

    public JsonToken _initForReading(JsonParser jsonParser, JavaType javaType) throws IOException {
        this._deserializationConfig.initialize(jsonParser);
        JsonToken jsonTokenDjBIcL = jsonParser.djBIcL();
        if (jsonTokenDjBIcL == null && (jsonTokenDjBIcL = jsonParser.RcXXUw()) == null) {
            throw MismatchedInputException.from(jsonParser, javaType, "No content to map due to end-of-input");
        }
        return jsonTokenDjBIcL;
    }

    public final void _verifyNoTrailingTokens(JsonParser jsonParser, DeserializationContext deserializationContext, JavaType javaType) throws IOException {
        JsonToken jsonTokenRcXXUw = jsonParser.RcXXUw();
        if (jsonTokenRcXXUw != null) {
            deserializationContext.reportTrailingTokens(C5619Yr.EZpvd(javaType), jsonParser, jsonTokenRcXXUw);
        }
    }

    public AbstractC5548Vy<Object> _findRootDeserializer(DeserializationContext deserializationContext, JavaType javaType) throws DatabindException {
        AbstractC5548Vy<Object> abstractC5548Vy = this._rootDeserializers.get(javaType);
        if (abstractC5548Vy != null) {
            return abstractC5548Vy;
        }
        AbstractC5548Vy<Object> abstractC5548VyFindRootValueDeserializer = deserializationContext.findRootValueDeserializer(javaType);
        if (abstractC5548VyFindRootValueDeserializer == null) {
            return (AbstractC5548Vy) deserializationContext.reportBadDefinition(javaType, "Cannot find a deserializer for type " + javaType);
        }
        this._rootDeserializers.put(javaType, abstractC5548VyFindRootValueDeserializer);
        return abstractC5548VyFindRootValueDeserializer;
    }

    public void _verifySchemaType(InterfaceC5497Ua interfaceC5497Ua) {
        if (interfaceC5497Ua == null || this._jsonFactory.canUseSchema(interfaceC5497Ua)) {
            return;
        }
        throw new IllegalArgumentException("Cannot use FormatSchema of type " + interfaceC5497Ua.getClass().getName() + " for format " + this._jsonFactory.getFormatName());
    }

    public final void _assertNotNull(String str, Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException(String.format("argument \"%s\" is null", str));
        }
    }
}
