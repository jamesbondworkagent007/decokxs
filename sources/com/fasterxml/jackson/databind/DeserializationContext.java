package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.StreamReadCapability;
import com.fasterxml.jackson.databind.cfg.CoercionAction;
import com.fasterxml.jackson.databind.cfg.CoercionInputShape;
import com.fasterxml.jackson.databind.cfg.ContextAttributes;
import com.fasterxml.jackson.databind.deser.DeserializerCache;
import com.fasterxml.jackson.databind.deser.UnresolvedForwardReference;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReader;
import com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import com.fasterxml.jackson.databind.exc.InvalidTypeIdException;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import com.fasterxml.jackson.databind.exc.UnrecognizedPropertyException;
import com.fasterxml.jackson.databind.exc.ValueInstantiationException;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.type.LogicalType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.io.IOException;
import java.io.Serializable;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;
import o.AbstractC5548Vy;
import o.AbstractC5549Vz;
import o.AbstractC5550Wa;
import o.AbstractC5552Wc;
import o.AbstractC5597Xv;
import o.C5541Vr;
import o.C5565Wp;
import o.C5617Yp;
import o.C5619Yr;
import o.C5620Ys;
import o.C5626Yz;
import o.InterfaceC5500Ud;
import o.InterfaceC5553Wd;
import o.InterfaceC5554We;
import o.InterfaceC5623Yw;
import o.VA;
import o.VC;
import o.VT;
import o.WM;
import o.WT;
import o.XB;
import o.XQ;
import o.YA;

/* JADX INFO: loaded from: classes21.dex */
public abstract class DeserializationContext extends VA implements Serializable {
    private static final long serialVersionUID = 1;
    protected transient C5617Yp _arrayBuilders;
    protected transient ContextAttributes _attributes;
    protected final DeserializerCache _cache;
    public final DeserializationConfig _config;
    protected C5620Ys<JavaType> _currentType;
    protected transient DateFormat _dateFormat;
    protected final AbstractC5550Wa _factory;
    protected final int _featureFlags;
    protected final InjectableValues _injectableValues;
    protected transient C5626Yz _objectBuffer;
    protected transient JsonParser _parser;
    protected final C5541Vr<StreamReadCapability> _readCapabilities;
    protected final Class<?> _view;

    public abstract void checkUnresolvedObjectId() throws UnresolvedForwardReference;

    public abstract AbstractC5548Vy<Object> deserializerInstance(WM wm, Object obj) throws JsonMappingException;

    public abstract C5565Wp findObjectId(Object obj, ObjectIdGenerator<?> objectIdGenerator, InterfaceC5500Ud interfaceC5500Ud);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.VA
    public final Class<?> getActiveView() {
        return this._view;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getConfig()Lcom/fasterxml/jackson/databind/cfg/MapperConfig; */
    @Override // o.VA
    public DeserializationConfig getConfig() {
        return this._config;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getDeserializationFeatures() {
        return this._featureFlags;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AbstractC5550Wa getFactory() {
        return this._factory;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JsonParser getParser() {
        return this._parser;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean hasDeserializationFeatures(int i) {
        return (this._featureFlags & i) == i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean hasSomeOfFeatures(int i) {
        return (i & this._featureFlags) != 0;
    }

    public abstract VC keyDeserializerInstance(WM wm, Object obj) throws JsonMappingException;

    public DeserializationContext(AbstractC5550Wa abstractC5550Wa) {
        this(abstractC5550Wa, (DeserializerCache) null);
    }

    public DeserializationContext(AbstractC5550Wa abstractC5550Wa, DeserializerCache deserializerCache) {
        if (abstractC5550Wa == null) {
            throw new NullPointerException("Cannot pass null DeserializerFactory");
        }
        this._factory = abstractC5550Wa;
        this._cache = deserializerCache == null ? new DeserializerCache() : deserializerCache;
        this._featureFlags = 0;
        this._readCapabilities = null;
        this._config = null;
        this._injectableValues = null;
        this._view = null;
        this._attributes = null;
    }

    public DeserializationContext(DeserializationContext deserializationContext, AbstractC5550Wa abstractC5550Wa) {
        this._cache = deserializationContext._cache;
        this._factory = abstractC5550Wa;
        this._config = deserializationContext._config;
        this._featureFlags = deserializationContext._featureFlags;
        this._readCapabilities = deserializationContext._readCapabilities;
        this._view = deserializationContext._view;
        this._parser = deserializationContext._parser;
        this._injectableValues = deserializationContext._injectableValues;
        this._attributes = deserializationContext._attributes;
    }

    public DeserializationContext(DeserializationContext deserializationContext, DeserializationConfig deserializationConfig, JsonParser jsonParser, InjectableValues injectableValues) {
        this._cache = deserializationContext._cache;
        this._factory = deserializationContext._factory;
        this._readCapabilities = jsonParser == null ? null : jsonParser.AubY();
        this._config = deserializationConfig;
        this._featureFlags = deserializationConfig.getDeserializationFeatures();
        this._view = deserializationConfig.getActiveView();
        this._parser = jsonParser;
        this._injectableValues = injectableValues;
        this._attributes = deserializationConfig.getAttributes();
    }

    public DeserializationContext(DeserializationContext deserializationContext, DeserializationConfig deserializationConfig) {
        this._cache = deserializationContext._cache;
        this._factory = deserializationContext._factory;
        this._readCapabilities = null;
        this._config = deserializationConfig;
        this._featureFlags = deserializationConfig.getDeserializationFeatures();
        this._view = null;
        this._parser = null;
        this._injectableValues = null;
        this._attributes = null;
    }

    public DeserializationContext(DeserializationContext deserializationContext) {
        this._cache = new DeserializerCache();
        this._factory = deserializationContext._factory;
        this._config = deserializationContext._config;
        this._featureFlags = deserializationContext._featureFlags;
        this._readCapabilities = deserializationContext._readCapabilities;
        this._view = deserializationContext._view;
        this._injectableValues = null;
    }

    @Override // o.VA
    public final boolean canOverrideAccessModifiers() {
        return this._config.canOverrideAccessModifiers();
    }

    @Override // o.VA
    public final boolean isEnabled(MapperFeature mapperFeature) {
        return this._config.isEnabled(mapperFeature);
    }

    @Override // o.VA
    public final boolean isEnabled(VT vt) {
        return this._config.isEnabled(vt);
    }

    @Override // o.VA
    public final JsonFormat.Value getDefaultPropertyFormat(Class<?> cls) {
        return this._config.getDefaultPropertyFormat(cls);
    }

    @Override // o.VA
    public final AnnotationIntrospector getAnnotationIntrospector() {
        return this._config.getAnnotationIntrospector();
    }

    @Override // o.VA
    public final TypeFactory getTypeFactory() {
        return this._config.getTypeFactory();
    }

    @Override // o.VA
    public JavaType constructSpecializedType(JavaType javaType, Class<?> cls) throws IllegalArgumentException {
        return javaType.hasRawClass(cls) ? javaType : getConfig().getTypeFactory().constructSpecializedType(javaType, cls, false);
    }

    @Override // o.VA
    public Locale getLocale() {
        return this._config.getLocale();
    }

    @Override // o.VA
    public TimeZone getTimeZone() {
        return this._config.getTimeZone();
    }

    @Override // o.VA
    public Object getAttribute(Object obj) {
        return this._attributes.getAttribute(obj);
    }

    /* JADX DEBUG: Method merged with bridge method: setAttribute(Ljava/lang/Object;Ljava/lang/Object;)Lo/VA; */
    @Override // o.VA
    public DeserializationContext setAttribute(Object obj, Object obj2) {
        this._attributes = this._attributes.withPerCallAttribute(obj, obj2);
        return this;
    }

    public JavaType getContextualType() {
        C5620Ys<JavaType> c5620Ys = this._currentType;
        if (c5620Ys == null) {
            return null;
        }
        return c5620Ys.KWHzl();
    }

    public final boolean isEnabled(DeserializationFeature deserializationFeature) {
        return (deserializationFeature.getMask() & this._featureFlags) != 0;
    }

    public final boolean isEnabled(StreamReadCapability streamReadCapability) {
        return this._readCapabilities.KWHzl(streamReadCapability);
    }

    public final Object findInjectableValue(Object obj, BeanProperty beanProperty, Object obj2) throws JsonMappingException {
        InjectableValues injectableValues = this._injectableValues;
        if (injectableValues == null) {
            return reportBadDefinition(C5619Yr.OLrzqt(obj), String.format("No 'injectableValues' configured, cannot inject value with id [%s]", obj));
        }
        return injectableValues.findInjectableValue(obj, this, beanProperty, obj2);
    }

    public final Base64Variant getBase64Variant() {
        return this._config.getBase64Variant();
    }

    public final JsonNodeFactory getNodeFactory() {
        return this._config.getNodeFactory();
    }

    public CoercionAction findCoercionAction(LogicalType logicalType, Class<?> cls, CoercionInputShape coercionInputShape) {
        return this._config.findCoercionAction(logicalType, cls, coercionInputShape);
    }

    public CoercionAction findCoercionFromBlankString(LogicalType logicalType, Class<?> cls, CoercionAction coercionAction) {
        return this._config.findCoercionFromBlankString(logicalType, cls, coercionAction);
    }

    public YA bufferForInputBuffering(JsonParser jsonParser) {
        return new YA(jsonParser, this);
    }

    public final YA bufferForInputBuffering() {
        return bufferForInputBuffering(getParser());
    }

    public YA bufferAsCopyOfValue(JsonParser jsonParser) throws IOException {
        YA yaBufferForInputBuffering = bufferForInputBuffering(jsonParser);
        yaBufferForInputBuffering.EZpvd(jsonParser);
        return yaBufferForInputBuffering;
    }

    public boolean hasValueDeserializerFor(JavaType javaType, AtomicReference<Throwable> atomicReference) {
        try {
            return this._cache.hasValueDeserializerFor(this, this._factory, javaType);
        } catch (DatabindException e) {
            if (atomicReference == null) {
                return false;
            }
            atomicReference.set(e);
            return false;
        } catch (RuntimeException e2) {
            if (atomicReference == null) {
                throw e2;
            }
            atomicReference.set(e2);
            return false;
        }
    }

    public final AbstractC5548Vy<Object> findContextualValueDeserializer(JavaType javaType, BeanProperty beanProperty) throws JsonMappingException {
        AbstractC5548Vy<Object> abstractC5548VyFindValueDeserializer = this._cache.findValueDeserializer(this, this._factory, javaType);
        return abstractC5548VyFindValueDeserializer != null ? handleSecondaryContextualization(abstractC5548VyFindValueDeserializer, beanProperty, javaType) : abstractC5548VyFindValueDeserializer;
    }

    public final AbstractC5548Vy<Object> findNonContextualValueDeserializer(JavaType javaType) throws JsonMappingException {
        return this._cache.findValueDeserializer(this, this._factory, javaType);
    }

    public final AbstractC5548Vy<Object> findRootValueDeserializer(JavaType javaType) throws JsonMappingException {
        AbstractC5548Vy<Object> abstractC5548VyFindValueDeserializer = this._cache.findValueDeserializer(this, this._factory, javaType);
        if (abstractC5548VyFindValueDeserializer == null) {
            return null;
        }
        AbstractC5548Vy<?> abstractC5548VyHandleSecondaryContextualization = handleSecondaryContextualization(abstractC5548VyFindValueDeserializer, null, javaType);
        AbstractC5597Xv abstractC5597XvFindTypeDeserializer = this._factory.findTypeDeserializer(this._config, javaType);
        return abstractC5597XvFindTypeDeserializer != null ? new TypeWrappedDeserializer(abstractC5597XvFindTypeDeserializer.forProperty(null), abstractC5548VyHandleSecondaryContextualization) : abstractC5548VyHandleSecondaryContextualization;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v2, resolved type: o.VC */
    /* JADX DEBUG: Multi-variable search result rejected for r3v3, resolved type: o.VC */
    /* JADX DEBUG: Multi-variable search result rejected for r3v7, resolved type: o.VC */
    /* JADX WARN: Multi-variable type inference failed */
    public final VC findKeyDeserializer(JavaType javaType, BeanProperty beanProperty) throws JsonMappingException {
        VC vcFindKeyDeserializer;
        try {
            vcFindKeyDeserializer = this._cache.findKeyDeserializer(this, this._factory, javaType);
        } catch (IllegalArgumentException e) {
            reportBadDefinition(javaType, C5619Yr.EZpvd((Throwable) e));
            vcFindKeyDeserializer = 0;
        }
        return vcFindKeyDeserializer instanceof InterfaceC5553Wd ? ((InterfaceC5553Wd) vcFindKeyDeserializer).AEQbTJ(this, beanProperty) : vcFindKeyDeserializer;
    }

    public final JavaType constructType(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        return this._config.constructType(cls);
    }

    public Class<?> findClass(String str) throws ClassNotFoundException {
        return getTypeFactory().findClass(str);
    }

    public final C5626Yz leaseObjectBuffer() {
        C5626Yz c5626Yz = this._objectBuffer;
        if (c5626Yz == null) {
            return new C5626Yz();
        }
        this._objectBuffer = null;
        return c5626Yz;
    }

    public final void returnObjectBuffer(C5626Yz c5626Yz) {
        if (this._objectBuffer == null || c5626Yz.KWHzl() >= this._objectBuffer.KWHzl()) {
            this._objectBuffer = c5626Yz;
        }
    }

    public final C5617Yp getArrayBuilders() {
        if (this._arrayBuilders == null) {
            this._arrayBuilders = new C5617Yp();
        }
        return this._arrayBuilders;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: o.Vy<?> */
    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC5548Vy<?> handlePrimaryContextualization(AbstractC5548Vy<?> abstractC5548Vy, BeanProperty beanProperty, JavaType javaType) throws JsonMappingException {
        boolean z = abstractC5548Vy instanceof InterfaceC5554We;
        AbstractC5548Vy<?> abstractC5548Vy2 = abstractC5548Vy;
        if (z) {
            this._currentType = new C5620Ys<>(javaType, this._currentType);
            try {
                AbstractC5548Vy<?> abstractC5548VyCreateContextual = ((InterfaceC5554We) abstractC5548Vy).createContextual(this, beanProperty);
            } finally {
                this._currentType = this._currentType.copydefault();
            }
        }
        return abstractC5548Vy2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: o.Vy<?> */
    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC5548Vy<?> handleSecondaryContextualization(AbstractC5548Vy<?> abstractC5548Vy, BeanProperty beanProperty, JavaType javaType) throws JsonMappingException {
        boolean z = abstractC5548Vy instanceof InterfaceC5554We;
        AbstractC5548Vy<?> abstractC5548Vy2 = abstractC5548Vy;
        if (z) {
            this._currentType = new C5620Ys<>(javaType, this._currentType);
            try {
                AbstractC5548Vy<?> abstractC5548VyCreateContextual = ((InterfaceC5554We) abstractC5548Vy).createContextual(this, beanProperty);
            } finally {
                this._currentType = this._currentType.copydefault();
            }
        }
        return abstractC5548Vy2;
    }

    public Date parseDate(String str) throws IllegalArgumentException {
        try {
            return _getDateFormat().parse(str);
        } catch (ParseException e) {
            throw new IllegalArgumentException(String.format("Failed to parse Date value '%s': %s", str, C5619Yr.EZpvd((Throwable) e)));
        }
    }

    public Calendar constructCalendar(Date date) {
        Calendar calendar = Calendar.getInstance(getTimeZone());
        calendar.setTime(date);
        return calendar;
    }

    public String extractScalarFromObject(JsonParser jsonParser, AbstractC5548Vy<?> abstractC5548Vy, Class<?> cls) throws IOException {
        return (String) handleUnexpectedToken(cls, jsonParser);
    }

    public <T> T readValue(JsonParser jsonParser, Class<T> cls) throws IOException {
        return (T) readValue(jsonParser, getTypeFactory().constructType(cls));
    }

    public <T> T readValue(JsonParser jsonParser, JavaType javaType) throws IOException {
        AbstractC5548Vy<Object> abstractC5548VyFindRootValueDeserializer = findRootValueDeserializer(javaType);
        if (abstractC5548VyFindRootValueDeserializer == null) {
            return (T) reportBadDefinition(javaType, "Could not find JsonDeserializer for type " + C5619Yr.copydefault(javaType));
        }
        return (T) abstractC5548VyFindRootValueDeserializer.deserialize(jsonParser, this);
    }

    public <T> T readPropertyValue(JsonParser jsonParser, BeanProperty beanProperty, Class<T> cls) throws IOException {
        return (T) readPropertyValue(jsonParser, beanProperty, getTypeFactory().constructType(cls));
    }

    public <T> T readPropertyValue(JsonParser jsonParser, BeanProperty beanProperty, JavaType javaType) throws IOException {
        AbstractC5548Vy<Object> abstractC5548VyFindContextualValueDeserializer = findContextualValueDeserializer(javaType, beanProperty);
        if (abstractC5548VyFindContextualValueDeserializer == null) {
            return (T) reportBadDefinition(javaType, String.format("Could not find JsonDeserializer for type %s (via property %s)", C5619Yr.copydefault(javaType), C5619Yr.KWHzl((InterfaceC5623Yw) beanProperty)));
        }
        return (T) abstractC5548VyFindContextualValueDeserializer.deserialize(jsonParser, this);
    }

    public JsonNode readTree(JsonParser jsonParser) throws IOException {
        JsonToken jsonTokenDjBIcL = jsonParser.djBIcL();
        if (jsonTokenDjBIcL == null && (jsonTokenDjBIcL = jsonParser.RcXXUw()) == null) {
            return getNodeFactory().missingNode();
        }
        if (jsonTokenDjBIcL == JsonToken.VALUE_NULL) {
            return getNodeFactory().m6141nullNode();
        }
        return (JsonNode) findRootValueDeserializer(this._config.constructType(JsonNode.class)).deserialize(jsonParser, this);
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    public <T> T readTreeAsValue(JsonNode jsonNode, Class<T> cls) throws IOException {
        if (jsonNode == null) {
            return null;
        }
        XQ xq_treeAsTokens = _treeAsTokens(jsonNode);
        try {
            T t = (T) readValue(xq_treeAsTokens, cls);
            if (xq_treeAsTokens != null) {
                xq_treeAsTokens.close();
            }
            return t;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (xq_treeAsTokens != null) {
                    try {
                        xq_treeAsTokens.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    public <T> T readTreeAsValue(JsonNode jsonNode, JavaType javaType) throws IOException {
        if (jsonNode == null) {
            return null;
        }
        XQ xq_treeAsTokens = _treeAsTokens(jsonNode);
        try {
            T t = (T) readValue(xq_treeAsTokens, javaType);
            if (xq_treeAsTokens != null) {
                xq_treeAsTokens.close();
            }
            return t;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (xq_treeAsTokens != null) {
                    try {
                        xq_treeAsTokens.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
    }

    private XQ _treeAsTokens(JsonNode jsonNode) throws IOException {
        JsonParser jsonParser = this._parser;
        XQ xq = new XQ(jsonNode, jsonParser == null ? null : jsonParser.values());
        xq.RcXXUw();
        return xq;
    }

    public boolean handleUnknownProperty(JsonParser jsonParser, AbstractC5548Vy<?> abstractC5548Vy, Object obj, String str) throws IOException {
        for (C5620Ys<AbstractC5552Wc> problemHandlers = this._config.getProblemHandlers(); problemHandlers != null; problemHandlers = problemHandlers.copydefault()) {
            if (problemHandlers.KWHzl().KWHzl(this, jsonParser, abstractC5548Vy, obj, str)) {
                return true;
            }
        }
        if (!isEnabled(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES)) {
            jsonParser.UeEOUB();
            return true;
        }
        throw UnrecognizedPropertyException.from(this._parser, obj, str, abstractC5548Vy == null ? null : abstractC5548Vy.getKnownPropertyNames());
    }

    public Object handleWeirdKey(Class<?> cls, String str, String str2, Object... objArr) throws IOException {
        String str_format = _format(str2, objArr);
        for (C5620Ys<AbstractC5552Wc> problemHandlers = this._config.getProblemHandlers(); problemHandlers != null; problemHandlers = problemHandlers.copydefault()) {
            Object objCopydefault = problemHandlers.KWHzl().copydefault(this, cls, str, str_format);
            if (objCopydefault != AbstractC5552Wc.OLrzqt) {
                if (objCopydefault == null || cls.isInstance(objCopydefault)) {
                    return objCopydefault;
                }
                throw weirdStringException(str, cls, String.format("DeserializationProblemHandler.handleWeirdStringValue() for type %s returned value of type %s", C5619Yr.KWHzl((Object) cls), C5619Yr.KWHzl(objCopydefault)));
            }
        }
        throw weirdKeyException(cls, str, str_format);
    }

    public Object handleWeirdStringValue(Class<?> cls, String str, String str2, Object... objArr) throws IOException {
        String str_format = _format(str2, objArr);
        for (C5620Ys<AbstractC5552Wc> problemHandlers = this._config.getProblemHandlers(); problemHandlers != null; problemHandlers = problemHandlers.copydefault()) {
            Object objKWHzl = problemHandlers.KWHzl().KWHzl(this, cls, str, str_format);
            if (objKWHzl != AbstractC5552Wc.OLrzqt) {
                if (_isCompatible(cls, objKWHzl)) {
                    return objKWHzl;
                }
                throw weirdStringException(str, cls, String.format("DeserializationProblemHandler.handleWeirdStringValue() for type %s returned value of type %s", C5619Yr.KWHzl((Object) cls), C5619Yr.KWHzl(objKWHzl)));
            }
        }
        throw weirdStringException(str, cls, str_format);
    }

    public Object handleWeirdNumberValue(Class<?> cls, Number number, String str, Object... objArr) throws IOException {
        String str_format = _format(str, objArr);
        for (C5620Ys<AbstractC5552Wc> problemHandlers = this._config.getProblemHandlers(); problemHandlers != null; problemHandlers = problemHandlers.copydefault()) {
            Object objEZpvd = problemHandlers.KWHzl().EZpvd(this, cls, number, str_format);
            if (objEZpvd != AbstractC5552Wc.OLrzqt) {
                if (_isCompatible(cls, objEZpvd)) {
                    return objEZpvd;
                }
                throw weirdNumberException(number, cls, _format("DeserializationProblemHandler.handleWeirdNumberValue() for type %s returned value of type %s", C5619Yr.KWHzl((Object) cls), C5619Yr.KWHzl(objEZpvd)));
            }
        }
        throw weirdNumberException(number, cls, str_format);
    }

    public Object handleWeirdNativeValue(JavaType javaType, Object obj, JsonParser jsonParser) throws IOException {
        Class<?> rawClass = javaType.getRawClass();
        for (C5620Ys<AbstractC5552Wc> problemHandlers = this._config.getProblemHandlers(); problemHandlers != null; problemHandlers = problemHandlers.copydefault()) {
            Object objAEQbTJ = problemHandlers.KWHzl().AEQbTJ(this, javaType, obj, jsonParser);
            if (objAEQbTJ != AbstractC5552Wc.OLrzqt) {
                if (objAEQbTJ == null || rawClass.isInstance(objAEQbTJ)) {
                    return objAEQbTJ;
                }
                throw JsonMappingException.from(jsonParser, _format("DeserializationProblemHandler.handleWeirdNativeValue() for type %s returned value of type %s", C5619Yr.KWHzl(javaType), C5619Yr.KWHzl(objAEQbTJ)));
            }
        }
        throw weirdNativeValueException(obj, rawClass);
    }

    public Object handleMissingInstantiator(Class<?> cls, ValueInstantiator valueInstantiator, JsonParser jsonParser, String str, Object... objArr) throws IOException {
        if (jsonParser == null) {
            jsonParser = getParser();
        }
        String str_format = _format(str, objArr);
        for (C5620Ys<AbstractC5552Wc> problemHandlers = this._config.getProblemHandlers(); problemHandlers != null; problemHandlers = problemHandlers.copydefault()) {
            Object objKWHzl = problemHandlers.KWHzl().KWHzl(this, cls, valueInstantiator, jsonParser, str_format);
            if (objKWHzl != AbstractC5552Wc.OLrzqt) {
                if (_isCompatible(cls, objKWHzl)) {
                    return objKWHzl;
                }
                reportBadDefinition(constructType(cls), String.format("DeserializationProblemHandler.handleMissingInstantiator() for type %s returned value of type %s", C5619Yr.KWHzl((Object) cls), C5619Yr.KWHzl(objKWHzl)));
            }
        }
        if (valueInstantiator == null) {
            return reportBadDefinition(cls, String.format("Cannot construct instance of %s: %s", C5619Yr.uzCIH(cls), str_format));
        }
        if (!valueInstantiator.canInstantiate()) {
            return reportBadDefinition(cls, String.format("Cannot construct instance of %s (no Creators, like default constructor, exist): %s", C5619Yr.uzCIH(cls), str_format));
        }
        return reportInputMismatch(cls, String.format("Cannot construct instance of %s (although at least one Creator exists): %s", C5619Yr.uzCIH(cls), str_format), new Object[0]);
    }

    public Object handleInstantiationProblem(Class<?> cls, Object obj, Throwable th) throws IOException {
        for (C5620Ys<AbstractC5552Wc> problemHandlers = this._config.getProblemHandlers(); problemHandlers != null; problemHandlers = problemHandlers.copydefault()) {
            Object objKWHzl = problemHandlers.KWHzl().KWHzl(this, cls, obj, th);
            if (objKWHzl != AbstractC5552Wc.OLrzqt) {
                if (_isCompatible(cls, objKWHzl)) {
                    return objKWHzl;
                }
                reportBadDefinition(constructType(cls), String.format("DeserializationProblemHandler.handleInstantiationProblem() for type %s returned value of type %s", C5619Yr.KWHzl((Object) cls), C5619Yr.copydefault(objKWHzl)));
            }
        }
        C5619Yr.KWHzl(th);
        if (!isEnabled(DeserializationFeature.WRAP_EXCEPTIONS)) {
            C5619Yr.AhwBna(th);
        }
        throw instantiationException(cls, th);
    }

    public Object handleUnexpectedToken(Class<?> cls, JsonParser jsonParser) throws IOException {
        return handleUnexpectedToken(constructType(cls), jsonParser.djBIcL(), jsonParser, (String) null, new Object[0]);
    }

    public Object handleUnexpectedToken(Class<?> cls, JsonToken jsonToken, JsonParser jsonParser, String str, Object... objArr) throws IOException {
        return handleUnexpectedToken(constructType(cls), jsonToken, jsonParser, str, objArr);
    }

    public Object handleUnexpectedToken(JavaType javaType, JsonParser jsonParser) throws IOException {
        return handleUnexpectedToken(javaType, jsonParser.djBIcL(), jsonParser, (String) null, new Object[0]);
    }

    public Object handleUnexpectedToken(JavaType javaType, JsonToken jsonToken, JsonParser jsonParser, String str, Object... objArr) throws IOException {
        String str_format = _format(str, objArr);
        for (C5620Ys<AbstractC5552Wc> problemHandlers = this._config.getProblemHandlers(); problemHandlers != null; problemHandlers = problemHandlers.copydefault()) {
            Object objAEQbTJ = problemHandlers.KWHzl().AEQbTJ(this, javaType, jsonToken, jsonParser, str_format);
            if (objAEQbTJ != AbstractC5552Wc.OLrzqt) {
                if (_isCompatible(javaType.getRawClass(), objAEQbTJ)) {
                    return objAEQbTJ;
                }
                reportBadDefinition(javaType, String.format("DeserializationProblemHandler.handleUnexpectedToken() for type %s returned value of type %s", C5619Yr.copydefault(javaType), C5619Yr.copydefault(objAEQbTJ)));
            }
        }
        if (str_format == null) {
            String strCopydefault = C5619Yr.copydefault(javaType);
            if (jsonToken == null) {
                str_format = String.format("Unexpected end-of-input when trying read value of type %s", strCopydefault);
            } else {
                str_format = String.format("Cannot deserialize value of type %s from %s (token `JsonToken.%s`)", strCopydefault, _shapeForToken(jsonToken), jsonToken);
            }
        }
        if (jsonToken != null && jsonToken.isScalarValue()) {
            jsonParser.zLjUOn();
        }
        reportInputMismatch(javaType, str_format, new Object[0]);
        return null;
    }

    public JavaType handleUnknownTypeId(JavaType javaType, String str, XB xb, String str2) throws IOException {
        for (C5620Ys<AbstractC5552Wc> problemHandlers = this._config.getProblemHandlers(); problemHandlers != null; problemHandlers = problemHandlers.copydefault()) {
            JavaType javaTypeOLrzqt = problemHandlers.KWHzl().OLrzqt(this, javaType, str, xb, str2);
            if (javaTypeOLrzqt != null) {
                if (javaTypeOLrzqt.hasRawClass(Void.class)) {
                    return null;
                }
                if (javaTypeOLrzqt.isTypeOrSubTypeOf(javaType.getRawClass())) {
                    return javaTypeOLrzqt;
                }
                throw invalidTypeIdException(javaType, str, "problem handler tried to resolve into non-subtype: " + C5619Yr.copydefault(javaTypeOLrzqt));
            }
        }
        if (isEnabled(DeserializationFeature.FAIL_ON_INVALID_SUBTYPE)) {
            throw invalidTypeIdException(javaType, str, str2);
        }
        return null;
    }

    public JavaType handleMissingTypeId(JavaType javaType, XB xb, String str) throws IOException {
        for (C5620Ys<AbstractC5552Wc> problemHandlers = this._config.getProblemHandlers(); problemHandlers != null; problemHandlers = problemHandlers.copydefault()) {
            JavaType javaTypeCopydefault = problemHandlers.KWHzl().copydefault(this, javaType, xb, str);
            if (javaTypeCopydefault != null) {
                if (javaTypeCopydefault.hasRawClass(Void.class)) {
                    return null;
                }
                if (javaTypeCopydefault.isTypeOrSubTypeOf(javaType.getRawClass())) {
                    return javaTypeCopydefault;
                }
                throw invalidTypeIdException(javaType, null, "problem handler tried to resolve into non-subtype: " + C5619Yr.copydefault(javaTypeCopydefault));
            }
        }
        throw missingTypeIdException(javaType, str);
    }

    public void handleBadMerge(AbstractC5548Vy<?> abstractC5548Vy) throws JsonMappingException {
        if (isEnabled(MapperFeature.IGNORE_MERGE_FOR_UNMERGEABLE)) {
            return;
        }
        JavaType javaTypeConstructType = constructType(abstractC5548Vy.handledType());
        throw InvalidDefinitionException.from(getParser(), String.format("Invalid configuration: values of type %s cannot be merged", C5619Yr.copydefault(javaTypeConstructType)), javaTypeConstructType);
    }

    public boolean _isCompatible(Class<?> cls, Object obj) {
        return obj == null || cls.isInstance(obj) || (cls.isPrimitive() && C5619Yr.getFieldNames(cls).isInstance(obj));
    }

    public void reportWrongTokenException(AbstractC5548Vy<?> abstractC5548Vy, JsonToken jsonToken, String str, Object... objArr) throws JsonMappingException {
        throw wrongTokenException(getParser(), abstractC5548Vy.handledType(), jsonToken, _format(str, objArr));
    }

    public void reportWrongTokenException(JavaType javaType, JsonToken jsonToken, String str, Object... objArr) throws JsonMappingException {
        throw wrongTokenException(getParser(), javaType, jsonToken, _format(str, objArr));
    }

    public void reportWrongTokenException(Class<?> cls, JsonToken jsonToken, String str, Object... objArr) throws JsonMappingException {
        throw wrongTokenException(getParser(), cls, jsonToken, _format(str, objArr));
    }

    public <T> T reportUnresolvedObjectId(ObjectIdReader objectIdReader, Object obj) throws JsonMappingException {
        return (T) reportInputMismatch(objectIdReader.idProperty, String.format("No Object Id found for an instance of %s, to assign to property '%s'", C5619Yr.copydefault(obj), objectIdReader.propertyName), new Object[0]);
    }

    public <T> T reportInputMismatch(AbstractC5548Vy<?> abstractC5548Vy, String str, Object... objArr) throws JsonMappingException {
        throw MismatchedInputException.from(getParser(), abstractC5548Vy.handledType(), _format(str, objArr));
    }

    public <T> T reportInputMismatch(Class<?> cls, String str, Object... objArr) throws JsonMappingException {
        throw MismatchedInputException.from(getParser(), cls, _format(str, objArr));
    }

    public <T> T reportInputMismatch(JavaType javaType, String str, Object... objArr) throws JsonMappingException {
        throw MismatchedInputException.from(getParser(), javaType, _format(str, objArr));
    }

    public <T> T reportInputMismatch(BeanProperty beanProperty, String str, Object... objArr) throws JsonMappingException {
        AnnotatedMember member;
        MismatchedInputException mismatchedInputExceptionFrom = MismatchedInputException.from(getParser(), beanProperty == null ? null : beanProperty.getType(), _format(str, objArr));
        if (beanProperty != null && (member = beanProperty.getMember()) != null) {
            mismatchedInputExceptionFrom.prependPath(member.getDeclaringClass(), beanProperty.getName());
            throw mismatchedInputExceptionFrom;
        }
        throw mismatchedInputExceptionFrom;
    }

    public <T> T reportPropertyInputMismatch(Class<?> cls, String str, String str2, Object... objArr) throws JsonMappingException {
        MismatchedInputException mismatchedInputExceptionFrom = MismatchedInputException.from(getParser(), cls, _format(str2, objArr));
        if (str != null) {
            mismatchedInputExceptionFrom.prependPath(cls, str);
            throw mismatchedInputExceptionFrom;
        }
        throw mismatchedInputExceptionFrom;
    }

    public <T> T reportPropertyInputMismatch(JavaType javaType, String str, String str2, Object... objArr) throws JsonMappingException {
        return (T) reportPropertyInputMismatch(javaType.getRawClass(), str, str2, objArr);
    }

    public <T> T reportBadCoercion(AbstractC5548Vy<?> abstractC5548Vy, Class<?> cls, Object obj, String str, Object... objArr) throws JsonMappingException {
        throw InvalidFormatException.from(getParser(), _format(str, objArr), obj, cls);
    }

    public <T> T reportTrailingTokens(Class<?> cls, JsonParser jsonParser, JsonToken jsonToken) throws JsonMappingException {
        throw MismatchedInputException.from(jsonParser, cls, String.format("Trailing token (of type %s) found after value (bound as %s): not allowed as per `DeserializationFeature.FAIL_ON_TRAILING_TOKENS`", jsonToken, C5619Yr.uzCIH(cls)));
    }

    @Deprecated
    public void reportWrongTokenException(JsonParser jsonParser, JsonToken jsonToken, String str, Object... objArr) throws JsonMappingException {
        throw wrongTokenException(jsonParser, jsonToken, _format(str, objArr));
    }

    @Deprecated
    public void reportUnknownProperty(Object obj, String str, AbstractC5548Vy<?> abstractC5548Vy) throws JsonMappingException {
        if (isEnabled(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES)) {
            throw UnrecognizedPropertyException.from(this._parser, obj, str, abstractC5548Vy == null ? null : abstractC5548Vy.getKnownPropertyNames());
        }
    }

    @Deprecated
    public void reportMissingContent(String str, Object... objArr) throws JsonMappingException {
        throw MismatchedInputException.from(getParser(), (JavaType) null, "No content to map due to end-of-input");
    }

    public <T> T reportBadTypeDefinition(AbstractC5549Vz abstractC5549Vz, String str, Object... objArr) throws JsonMappingException {
        throw InvalidDefinitionException.from(this._parser, String.format("Invalid type definition for type %s: %s", C5619Yr.uzCIH(abstractC5549Vz.DbNXlk()), _format(str, objArr)), abstractC5549Vz, (WT) null);
    }

    public <T> T reportBadPropertyDefinition(AbstractC5549Vz abstractC5549Vz, WT wt, String str, Object... objArr) throws JsonMappingException {
        throw InvalidDefinitionException.from(this._parser, String.format("Invalid definition for property %s (of type %s): %s", C5619Yr.KWHzl((InterfaceC5623Yw) wt), C5619Yr.uzCIH(abstractC5549Vz.DbNXlk()), _format(str, objArr)), abstractC5549Vz, wt);
    }

    @Override // o.VA
    public <T> T reportBadDefinition(JavaType javaType, String str) throws JsonMappingException {
        throw InvalidDefinitionException.from(this._parser, str, javaType);
    }

    @Deprecated
    public <T> T reportBadMerge(AbstractC5548Vy<?> abstractC5548Vy) throws JsonMappingException {
        handleBadMerge(abstractC5548Vy);
        return null;
    }

    public JsonMappingException wrongTokenException(JsonParser jsonParser, JavaType javaType, JsonToken jsonToken, String str) {
        return MismatchedInputException.from(jsonParser, javaType, _colonConcat(String.format("Unexpected token (%s), expected %s", jsonParser.djBIcL(), jsonToken), str));
    }

    public JsonMappingException wrongTokenException(JsonParser jsonParser, Class<?> cls, JsonToken jsonToken, String str) {
        return MismatchedInputException.from(jsonParser, cls, _colonConcat(String.format("Unexpected token (%s), expected %s", jsonParser.djBIcL(), jsonToken), str));
    }

    @Deprecated
    public JsonMappingException wrongTokenException(JsonParser jsonParser, JsonToken jsonToken, String str) {
        return wrongTokenException(jsonParser, (JavaType) null, jsonToken, str);
    }

    public JsonMappingException weirdKeyException(Class<?> cls, String str, String str2) {
        return InvalidFormatException.from(this._parser, String.format("Cannot deserialize Map key of type %s from String %s: %s", C5619Yr.uzCIH(cls), _quotedString(str), str2), str, cls);
    }

    public JsonMappingException weirdStringException(String str, Class<?> cls, String str2) {
        return InvalidFormatException.from(this._parser, String.format("Cannot deserialize value of type %s from String %s: %s", C5619Yr.uzCIH(cls), _quotedString(str), str2), str, cls);
    }

    public JsonMappingException weirdNumberException(Number number, Class<?> cls, String str) {
        return InvalidFormatException.from(this._parser, String.format("Cannot deserialize value of type %s from number %s: %s", C5619Yr.uzCIH(cls), String.valueOf(number), str), number, cls);
    }

    public JsonMappingException weirdNativeValueException(Object obj, Class<?> cls) {
        return InvalidFormatException.from(this._parser, String.format("Cannot deserialize value of type %s from native value (`JsonToken.VALUE_EMBEDDED_OBJECT`) of type %s: incompatible types", C5619Yr.uzCIH(cls), C5619Yr.copydefault(obj)), obj, cls);
    }

    public JsonMappingException instantiationException(Class<?> cls, Throwable th) {
        String strEZpvd;
        if (th == null) {
            strEZpvd = "N/A";
        } else {
            strEZpvd = C5619Yr.EZpvd(th);
            if (strEZpvd == null) {
                strEZpvd = C5619Yr.uzCIH(th.getClass());
            }
        }
        return ValueInstantiationException.from(this._parser, String.format("Cannot construct instance of %s, problem: %s", C5619Yr.uzCIH(cls), strEZpvd), constructType(cls), th);
    }

    public JsonMappingException instantiationException(Class<?> cls, String str) {
        return ValueInstantiationException.from(this._parser, String.format("Cannot construct instance of %s: %s", C5619Yr.uzCIH(cls), str), constructType(cls));
    }

    @Override // o.VA
    public JsonMappingException invalidTypeIdException(JavaType javaType, String str, String str2) {
        return InvalidTypeIdException.from(this._parser, _colonConcat(String.format("Could not resolve type id '%s' as a subtype of %s", str, C5619Yr.copydefault(javaType)), str2), javaType, str);
    }

    public JsonMappingException missingTypeIdException(JavaType javaType, String str) {
        return InvalidTypeIdException.from(this._parser, _colonConcat(String.format("Could not resolve subtype of %s", javaType), str), javaType, null);
    }

    @Deprecated
    public JsonMappingException unknownTypeException(JavaType javaType, String str, String str2) {
        return MismatchedInputException.from(this._parser, javaType, _colonConcat(String.format("Could not resolve type id '%s' into a subtype of %s", str, C5619Yr.copydefault(javaType)), str2));
    }

    @Deprecated
    public JsonMappingException endOfInputException(Class<?> cls) {
        return MismatchedInputException.from(this._parser, cls, "Unexpected end-of-input when trying to deserialize a " + cls.getName());
    }

    @Deprecated
    public void reportMappingException(String str, Object... objArr) throws JsonMappingException {
        throw JsonMappingException.from(getParser(), _format(str, objArr));
    }

    @Deprecated
    public JsonMappingException mappingException(String str) {
        return JsonMappingException.from(getParser(), str);
    }

    @Deprecated
    public JsonMappingException mappingException(String str, Object... objArr) {
        return JsonMappingException.from(getParser(), _format(str, objArr));
    }

    @Deprecated
    public JsonMappingException mappingException(Class<?> cls) {
        return mappingException(cls, this._parser.djBIcL());
    }

    @Deprecated
    public JsonMappingException mappingException(Class<?> cls, JsonToken jsonToken) {
        return JsonMappingException.from(this._parser, String.format("Cannot deserialize instance of %s out of %s token", C5619Yr.uzCIH(cls), jsonToken));
    }

    @Deprecated
    public DateFormat getDateFormat() {
        return _getDateFormat();
    }

    public DateFormat _getDateFormat() {
        DateFormat dateFormat = this._dateFormat;
        if (dateFormat != null) {
            return dateFormat;
        }
        DateFormat dateFormat2 = (DateFormat) this._config.getDateFormat().clone();
        this._dateFormat = dateFormat2;
        return dateFormat2;
    }

    /* JADX INFO: renamed from: com.fasterxml.jackson.databind.DeserializationContext$5, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass5 {
        public static final /* synthetic */ int[] copydefault;

        static {
            int[] iArr = new int[JsonToken.values().length];
            copydefault = iArr;
            try {
                iArr[JsonToken.START_OBJECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                copydefault[JsonToken.END_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                copydefault[JsonToken.FIELD_NAME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                copydefault[JsonToken.START_ARRAY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                copydefault[JsonToken.END_ARRAY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                copydefault[JsonToken.VALUE_FALSE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                copydefault[JsonToken.VALUE_TRUE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                copydefault[JsonToken.VALUE_EMBEDDED_OBJECT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                copydefault[JsonToken.VALUE_NUMBER_FLOAT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                copydefault[JsonToken.VALUE_NUMBER_INT.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                copydefault[JsonToken.VALUE_STRING.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                copydefault[JsonToken.VALUE_NULL.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                copydefault[JsonToken.NOT_AVAILABLE.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    public String _shapeForToken(JsonToken jsonToken) {
        if (jsonToken == null) {
            return "<end of input>";
        }
        switch (AnonymousClass5.copydefault[jsonToken.ordinal()]) {
            case 1:
            case 2:
            case 3:
                return "Object value";
            case 4:
            case 5:
                return "Array value";
            case 6:
            case 7:
                return "Boolean value";
            case 8:
                return "Embedded Object";
            case 9:
                return "Floating-point value";
            case 10:
                return "Integer value";
            case 11:
                return "String value";
            case 12:
                return "Null value";
            default:
                return "[Unavailable value]";
        }
    }
}
