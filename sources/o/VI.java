package o;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.cfg.ContextAttributes;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import com.fasterxml.jackson.databind.exc.InvalidTypeIdException;
import com.fasterxml.jackson.databind.ser.impl.FailingSerializer;
import com.fasterxml.jackson.databind.ser.impl.UnknownSerializer;
import com.fasterxml.jackson.databind.ser.std.NullSerializer;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.util.Date;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes21.dex */
public abstract class VI extends VA {
    protected static final boolean CACHE_UNKNOWN_MAPPINGS = false;
    public static final VD<java.lang.Object> DEFAULT_NULL_KEY_SERIALIZER = new FailingSerializer("Null key for a Map not allowed in JSON (use a converting NullKeySerializer?)");
    protected static final VD<java.lang.Object> DEFAULT_UNKNOWN_SERIALIZER = new UnknownSerializer();
    protected transient ContextAttributes _attributes;
    public final SerializationConfig _config;
    protected java.text.DateFormat _dateFormat;
    protected VD<java.lang.Object> _keySerializer;
    protected final C5603Yb _knownSerializers;
    protected VD<java.lang.Object> _nullKeySerializer;
    protected VD<java.lang.Object> _nullValueSerializer;
    protected final java.lang.Class<?> _serializationView;
    public final C5602Ya _serializerCache;
    protected final XY _serializerFactory;
    protected final boolean _stdNullValueSerializer;
    protected VD<java.lang.Object> _unknownTypeSerializer;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public VD<java.lang.Object> findNullKeySerializer(JavaType javaType, BeanProperty beanProperty) throws JsonMappingException {
        return this._nullKeySerializer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public VD<java.lang.Object> findNullValueSerializer(BeanProperty beanProperty) throws JsonMappingException {
        return this._nullValueSerializer;
    }

    public abstract C5610Yi findObjectId(java.lang.Object obj, ObjectIdGenerator<?> objectIdGenerator);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.VA
    public final java.lang.Class<?> getActiveView() {
        return this._serializationView;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getConfig()Lcom/fasterxml/jackson/databind/cfg/MapperConfig; */
    @Override // o.VA
    public final SerializationConfig getConfig() {
        return this._config;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public VD<java.lang.Object> getDefaultNullKeySerializer() {
        return this._nullKeySerializer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public VD<java.lang.Object> getDefaultNullValueSerializer() {
        return this._nullValueSerializer;
    }

    public JsonGenerator getGenerator() {
        return null;
    }

    public abstract java.lang.Object includeFilterInstance(WT wt, java.lang.Class<?> cls) throws JsonMappingException;

    public abstract boolean includeFilterSuppressNulls(java.lang.Object obj) throws JsonMappingException;

    public abstract VD<java.lang.Object> serializerInstance(WM wm, java.lang.Object obj) throws JsonMappingException;

    public VI() {
        this._unknownTypeSerializer = DEFAULT_UNKNOWN_SERIALIZER;
        this._nullValueSerializer = NullSerializer.instance;
        this._nullKeySerializer = DEFAULT_NULL_KEY_SERIALIZER;
        this._config = null;
        this._serializerFactory = null;
        this._serializerCache = new C5602Ya();
        this._knownSerializers = null;
        this._serializationView = null;
        this._attributes = null;
        this._stdNullValueSerializer = true;
    }

    public VI(VI vi, SerializationConfig serializationConfig, XY xy) {
        this._unknownTypeSerializer = DEFAULT_UNKNOWN_SERIALIZER;
        this._nullValueSerializer = NullSerializer.instance;
        VD<java.lang.Object> vd = DEFAULT_NULL_KEY_SERIALIZER;
        this._nullKeySerializer = vd;
        this._serializerFactory = xy;
        this._config = serializationConfig;
        C5602Ya c5602Ya = vi._serializerCache;
        this._serializerCache = c5602Ya;
        this._unknownTypeSerializer = vi._unknownTypeSerializer;
        this._keySerializer = vi._keySerializer;
        VD<java.lang.Object> vd2 = vi._nullValueSerializer;
        this._nullValueSerializer = vd2;
        this._nullKeySerializer = vi._nullKeySerializer;
        this._stdNullValueSerializer = vd2 == vd;
        this._serializationView = serializationConfig.getActiveView();
        this._attributes = serializationConfig.getAttributes();
        this._knownSerializers = c5602Ya.OLrzqt();
    }

    public VI(VI vi) {
        this._unknownTypeSerializer = DEFAULT_UNKNOWN_SERIALIZER;
        this._nullValueSerializer = NullSerializer.instance;
        this._nullKeySerializer = DEFAULT_NULL_KEY_SERIALIZER;
        this._config = null;
        this._serializationView = null;
        this._serializerFactory = null;
        this._knownSerializers = null;
        this._serializerCache = new C5602Ya();
        this._unknownTypeSerializer = vi._unknownTypeSerializer;
        this._keySerializer = vi._keySerializer;
        this._nullValueSerializer = vi._nullValueSerializer;
        this._nullKeySerializer = vi._nullKeySerializer;
        this._stdNullValueSerializer = vi._stdNullValueSerializer;
    }

    public void setDefaultKeySerializer(VD<java.lang.Object> vd) {
        if (vd == null) {
            throw new java.lang.IllegalArgumentException("Cannot pass null JsonSerializer");
        }
        this._keySerializer = vd;
    }

    public void setNullValueSerializer(VD<java.lang.Object> vd) {
        if (vd == null) {
            throw new java.lang.IllegalArgumentException("Cannot pass null JsonSerializer");
        }
        this._nullValueSerializer = vd;
    }

    public void setNullKeySerializer(VD<java.lang.Object> vd) {
        if (vd == null) {
            throw new java.lang.IllegalArgumentException("Cannot pass null JsonSerializer");
        }
        this._nullKeySerializer = vd;
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
    public JavaType constructSpecializedType(JavaType javaType, java.lang.Class<?> cls) throws java.lang.IllegalArgumentException {
        return javaType.hasRawClass(cls) ? javaType : getConfig().getTypeFactory().constructSpecializedType(javaType, cls, true);
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
    public final JsonFormat.Value getDefaultPropertyFormat(java.lang.Class<?> cls) {
        return this._config.getDefaultPropertyFormat(cls);
    }

    public final JsonInclude.Value getDefaultPropertyInclusion(java.lang.Class<?> cls) {
        return this._config.getDefaultPropertyInclusion(cls);
    }

    @Override // o.VA
    public java.util.Locale getLocale() {
        return this._config.getLocale();
    }

    @Override // o.VA
    public TimeZone getTimeZone() {
        return this._config.getTimeZone();
    }

    @Override // o.VA
    public java.lang.Object getAttribute(java.lang.Object obj) {
        return this._attributes.getAttribute(obj);
    }

    /* JADX DEBUG: Method merged with bridge method: setAttribute(Ljava/lang/Object;Ljava/lang/Object;)Lo/VA; */
    @Override // o.VA
    public VI setAttribute(java.lang.Object obj, java.lang.Object obj2) {
        this._attributes = this._attributes.withPerCallAttribute(obj, obj2);
        return this;
    }

    public final boolean isEnabled(SerializationFeature serializationFeature) {
        return this._config.isEnabled(serializationFeature);
    }

    public final boolean hasSerializationFeatures(int i) {
        return this._config.hasSerializationFeatures(i);
    }

    public final XS getFilterProvider() {
        return this._config.getFilterProvider();
    }

    public YA bufferForValueConversion(AbstractC5505Ui abstractC5505Ui) {
        return new YA(abstractC5505Ui, false);
    }

    public final YA bufferForValueConversion() {
        return bufferForValueConversion(null);
    }

    public VD<java.lang.Object> findValueSerializer(java.lang.Class<?> cls, BeanProperty beanProperty) throws JsonMappingException {
        VD<java.lang.Object> vdOLrzqt = this._knownSerializers.OLrzqt(cls);
        if (vdOLrzqt == null && (vdOLrzqt = this._serializerCache.AEQbTJ(cls)) == null && (vdOLrzqt = this._serializerCache.AEQbTJ(this._config.constructType(cls))) == null && (vdOLrzqt = _createAndCacheUntypedSerializer(cls)) == null) {
            return getUnknownTypeSerializer(cls);
        }
        return handleSecondaryContextualization(vdOLrzqt, beanProperty);
    }

    public VD<java.lang.Object> findValueSerializer(JavaType javaType, BeanProperty beanProperty) throws JsonMappingException {
        if (javaType == null) {
            reportMappingProblem("Null passed for `valueType` of `findValueSerializer()`", new java.lang.Object[0]);
        }
        VD<java.lang.Object> vdKWHzl = this._knownSerializers.KWHzl(javaType);
        if (vdKWHzl == null && (vdKWHzl = this._serializerCache.AEQbTJ(javaType)) == null && (vdKWHzl = _createAndCacheUntypedSerializer(javaType)) == null) {
            return getUnknownTypeSerializer(javaType.getRawClass());
        }
        return handleSecondaryContextualization(vdKWHzl, beanProperty);
    }

    public VD<java.lang.Object> findValueSerializer(java.lang.Class<?> cls) throws JsonMappingException {
        VD<java.lang.Object> vdOLrzqt = this._knownSerializers.OLrzqt(cls);
        if (vdOLrzqt != null) {
            return vdOLrzqt;
        }
        VD<java.lang.Object> vdAEQbTJ = this._serializerCache.AEQbTJ(cls);
        if (vdAEQbTJ != null) {
            return vdAEQbTJ;
        }
        VD<java.lang.Object> vdAEQbTJ2 = this._serializerCache.AEQbTJ(this._config.constructType(cls));
        if (vdAEQbTJ2 != null) {
            return vdAEQbTJ2;
        }
        VD<java.lang.Object> vd_createAndCacheUntypedSerializer = _createAndCacheUntypedSerializer(cls);
        return vd_createAndCacheUntypedSerializer == null ? getUnknownTypeSerializer(cls) : vd_createAndCacheUntypedSerializer;
    }

    public VD<java.lang.Object> findValueSerializer(JavaType javaType) throws JsonMappingException {
        VD<java.lang.Object> vdKWHzl = this._knownSerializers.KWHzl(javaType);
        if (vdKWHzl != null) {
            return vdKWHzl;
        }
        VD<java.lang.Object> vdAEQbTJ = this._serializerCache.AEQbTJ(javaType);
        if (vdAEQbTJ != null) {
            return vdAEQbTJ;
        }
        VD<java.lang.Object> vd_createAndCacheUntypedSerializer = _createAndCacheUntypedSerializer(javaType);
        return vd_createAndCacheUntypedSerializer == null ? getUnknownTypeSerializer(javaType.getRawClass()) : vd_createAndCacheUntypedSerializer;
    }

    public VD<java.lang.Object> findPrimaryPropertySerializer(JavaType javaType, BeanProperty beanProperty) throws JsonMappingException {
        VD<java.lang.Object> vdKWHzl = this._knownSerializers.KWHzl(javaType);
        if (vdKWHzl == null && (vdKWHzl = this._serializerCache.AEQbTJ(javaType)) == null && (vdKWHzl = _createAndCacheUntypedSerializer(javaType)) == null) {
            return getUnknownTypeSerializer(javaType.getRawClass());
        }
        return handlePrimaryContextualization(vdKWHzl, beanProperty);
    }

    public VD<java.lang.Object> findPrimaryPropertySerializer(java.lang.Class<?> cls, BeanProperty beanProperty) throws JsonMappingException {
        VD<java.lang.Object> vdOLrzqt = this._knownSerializers.OLrzqt(cls);
        if (vdOLrzqt == null && (vdOLrzqt = this._serializerCache.AEQbTJ(cls)) == null && (vdOLrzqt = this._serializerCache.AEQbTJ(this._config.constructType(cls))) == null && (vdOLrzqt = _createAndCacheUntypedSerializer(cls)) == null) {
            return getUnknownTypeSerializer(cls);
        }
        return handlePrimaryContextualization(vdOLrzqt, beanProperty);
    }

    public VD<java.lang.Object> findContentValueSerializer(JavaType javaType, BeanProperty beanProperty) throws JsonMappingException {
        VD<java.lang.Object> vdKWHzl = this._knownSerializers.KWHzl(javaType);
        if (vdKWHzl == null && (vdKWHzl = this._serializerCache.AEQbTJ(javaType)) == null && (vdKWHzl = _createAndCacheUntypedSerializer(javaType)) == null) {
            return getUnknownTypeSerializer(javaType.getRawClass());
        }
        return handleSecondaryContextualization(vdKWHzl, beanProperty);
    }

    public VD<java.lang.Object> findContentValueSerializer(java.lang.Class<?> cls, BeanProperty beanProperty) throws JsonMappingException {
        VD<java.lang.Object> vdOLrzqt = this._knownSerializers.OLrzqt(cls);
        if (vdOLrzqt == null && (vdOLrzqt = this._serializerCache.AEQbTJ(cls)) == null && (vdOLrzqt = this._serializerCache.AEQbTJ(this._config.constructType(cls))) == null && (vdOLrzqt = _createAndCacheUntypedSerializer(cls)) == null) {
            return getUnknownTypeSerializer(cls);
        }
        return handleSecondaryContextualization(vdOLrzqt, beanProperty);
    }

    public VD<java.lang.Object> findTypedValueSerializer(java.lang.Class<?> cls, boolean z, BeanProperty beanProperty) throws JsonMappingException {
        VD<java.lang.Object> vdKWHzl = this._knownSerializers.KWHzl(cls);
        if (vdKWHzl != null) {
            return vdKWHzl;
        }
        VD<java.lang.Object> vdEZpvd = this._serializerCache.EZpvd(cls);
        if (vdEZpvd != null) {
            return vdEZpvd;
        }
        VD<java.lang.Object> vdFindValueSerializer = findValueSerializer(cls, beanProperty);
        XY xy = this._serializerFactory;
        SerializationConfig serializationConfig = this._config;
        AbstractC5601Xz abstractC5601XzCreateTypeSerializer = xy.createTypeSerializer(serializationConfig, serializationConfig.constructType(cls));
        if (abstractC5601XzCreateTypeSerializer != null) {
            vdFindValueSerializer = new C5608Yg(abstractC5601XzCreateTypeSerializer.OLrzqt(beanProperty), vdFindValueSerializer);
        }
        if (z) {
            this._serializerCache.KWHzl(cls, vdFindValueSerializer);
        }
        return vdFindValueSerializer;
    }

    public VD<java.lang.Object> findTypedValueSerializer(JavaType javaType, boolean z, BeanProperty beanProperty) throws JsonMappingException {
        VD<java.lang.Object> vdCopydefault = this._knownSerializers.copydefault(javaType);
        if (vdCopydefault != null) {
            return vdCopydefault;
        }
        VD<java.lang.Object> vdEZpvd = this._serializerCache.EZpvd(javaType);
        if (vdEZpvd != null) {
            return vdEZpvd;
        }
        VD<java.lang.Object> vdFindValueSerializer = findValueSerializer(javaType, beanProperty);
        AbstractC5601Xz abstractC5601XzCreateTypeSerializer = this._serializerFactory.createTypeSerializer(this._config, javaType);
        if (abstractC5601XzCreateTypeSerializer != null) {
            vdFindValueSerializer = new C5608Yg(abstractC5601XzCreateTypeSerializer.OLrzqt(beanProperty), vdFindValueSerializer);
        }
        if (z) {
            this._serializerCache.KWHzl(javaType, vdFindValueSerializer);
        }
        return vdFindValueSerializer;
    }

    public AbstractC5601Xz findTypeSerializer(JavaType javaType) throws JsonMappingException {
        return this._serializerFactory.createTypeSerializer(this._config, javaType);
    }

    public VD<java.lang.Object> findKeySerializer(JavaType javaType, BeanProperty beanProperty) throws JsonMappingException {
        return _handleContextualResolvable(this._serializerFactory.createKeySerializer(this, javaType, this._keySerializer), beanProperty);
    }

    public VD<java.lang.Object> findKeySerializer(java.lang.Class<?> cls, BeanProperty beanProperty) throws JsonMappingException {
        return findKeySerializer(this._config.constructType(cls), beanProperty);
    }

    public VD<java.lang.Object> getUnknownTypeSerializer(java.lang.Class<?> cls) {
        return cls == java.lang.Object.class ? this._unknownTypeSerializer : new UnknownSerializer(cls);
    }

    public boolean isUnknownTypeSerializer(VD<?> vd) {
        if (vd == this._unknownTypeSerializer || vd == null) {
            return true;
        }
        return isEnabled(SerializationFeature.FAIL_ON_EMPTY_BEANS) && vd.getClass() == UnknownSerializer.class;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: o.VD<?> */
    /* JADX WARN: Multi-variable type inference failed */
    public VD<?> handlePrimaryContextualization(VD<?> vd, BeanProperty beanProperty) throws JsonMappingException {
        return (vd == 0 || !(vd instanceof XT)) ? vd : ((XT) vd).createContextual(this, beanProperty);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: o.VD<?> */
    /* JADX WARN: Multi-variable type inference failed */
    public VD<?> handleSecondaryContextualization(VD<?> vd, BeanProperty beanProperty) throws JsonMappingException {
        return (vd == 0 || !(vd instanceof XT)) ? vd : ((XT) vd).createContextual(this, beanProperty);
    }

    public final void defaultSerializeValue(java.lang.Object obj, JsonGenerator jsonGenerator) throws java.io.IOException {
        if (obj != null) {
            findTypedValueSerializer(obj.getClass(), true, (BeanProperty) null).serialize(obj, jsonGenerator, this);
        } else if (this._stdNullValueSerializer) {
            jsonGenerator.isConnected();
        } else {
            this._nullValueSerializer.serialize(null, jsonGenerator, this);
        }
    }

    public final void defaultSerializeField(java.lang.String str, java.lang.Object obj, JsonGenerator jsonGenerator) throws java.io.IOException {
        jsonGenerator.KWHzl(str);
        if (obj != null) {
            findTypedValueSerializer(obj.getClass(), true, (BeanProperty) null).serialize(obj, jsonGenerator, this);
        } else if (this._stdNullValueSerializer) {
            jsonGenerator.isConnected();
        } else {
            this._nullValueSerializer.serialize(null, jsonGenerator, this);
        }
    }

    public final void defaultSerializeDateValue(long j, JsonGenerator jsonGenerator) throws java.io.IOException {
        if (isEnabled(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS)) {
            jsonGenerator.EZpvd(j);
        } else {
            jsonGenerator.AhwBna(_dateFormat().format(new Date(j)));
        }
    }

    public final void defaultSerializeDateValue(Date date, JsonGenerator jsonGenerator) throws java.io.IOException {
        if (isEnabled(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS)) {
            jsonGenerator.EZpvd(date.getTime());
        } else {
            jsonGenerator.AhwBna(_dateFormat().format(date));
        }
    }

    public void defaultSerializeDateKey(long j, JsonGenerator jsonGenerator) throws java.io.IOException {
        if (isEnabled(SerializationFeature.WRITE_DATE_KEYS_AS_TIMESTAMPS)) {
            jsonGenerator.KWHzl(java.lang.String.valueOf(j));
        } else {
            jsonGenerator.KWHzl(_dateFormat().format(new Date(j)));
        }
    }

    public void defaultSerializeDateKey(Date date, JsonGenerator jsonGenerator) throws java.io.IOException {
        if (isEnabled(SerializationFeature.WRITE_DATE_KEYS_AS_TIMESTAMPS)) {
            jsonGenerator.KWHzl(java.lang.String.valueOf(date.getTime()));
        } else {
            jsonGenerator.KWHzl(_dateFormat().format(date));
        }
    }

    public final void defaultSerializeNull(JsonGenerator jsonGenerator) throws java.io.IOException {
        if (this._stdNullValueSerializer) {
            jsonGenerator.isConnected();
        } else {
            this._nullValueSerializer.serialize(null, jsonGenerator, this);
        }
    }

    public void reportMappingProblem(java.lang.String str, java.lang.Object... objArr) throws JsonMappingException {
        throw mappingException(str, objArr);
    }

    public <T> T reportBadTypeDefinition(AbstractC5549Vz abstractC5549Vz, java.lang.String str, java.lang.Object... objArr) throws JsonMappingException {
        throw InvalidDefinitionException.from(getGenerator(), java.lang.String.format("Invalid type definition for type %s: %s", abstractC5549Vz != null ? C5619Yr.uzCIH(abstractC5549Vz.DbNXlk()) : "N/A", _format(str, objArr)), abstractC5549Vz, (WT) null);
    }

    public <T> T reportBadPropertyDefinition(AbstractC5549Vz abstractC5549Vz, WT wt, java.lang.String str, java.lang.Object... objArr) throws JsonMappingException {
        throw InvalidDefinitionException.from(getGenerator(), java.lang.String.format("Invalid definition for property %s (of type %s): %s", wt != null ? _quotedString(wt.getName()) : "N/A", abstractC5549Vz != null ? C5619Yr.uzCIH(abstractC5549Vz.DbNXlk()) : "N/A", _format(str, objArr)), abstractC5549Vz, wt);
    }

    @Override // o.VA
    public <T> T reportBadDefinition(JavaType javaType, java.lang.String str) throws JsonMappingException {
        throw InvalidDefinitionException.from(getGenerator(), str, javaType);
    }

    public <T> T reportBadDefinition(JavaType javaType, java.lang.String str, java.lang.Throwable th) throws JsonMappingException {
        throw InvalidDefinitionException.from(getGenerator(), str, javaType).withCause(th);
    }

    public <T> T reportBadDefinition(java.lang.Class<?> cls, java.lang.String str, java.lang.Throwable th) throws JsonMappingException {
        throw InvalidDefinitionException.from(getGenerator(), str, constructType(cls)).withCause(th);
    }

    public void reportMappingProblem(java.lang.Throwable th, java.lang.String str, java.lang.Object... objArr) throws JsonMappingException {
        throw JsonMappingException.from(getGenerator(), _format(str, objArr), th);
    }

    @Override // o.VA
    public JsonMappingException invalidTypeIdException(JavaType javaType, java.lang.String str, java.lang.String str2) {
        return InvalidTypeIdException.from(null, _colonConcat(java.lang.String.format("Could not resolve type id '%s' as a subtype of %s", str, C5619Yr.copydefault(javaType)), str2), javaType, str);
    }

    @java.lang.Deprecated
    public JsonMappingException mappingException(java.lang.String str, java.lang.Object... objArr) {
        return JsonMappingException.from(getGenerator(), _format(str, objArr));
    }

    @java.lang.Deprecated
    public JsonMappingException mappingException(java.lang.Throwable th, java.lang.String str, java.lang.Object... objArr) {
        return JsonMappingException.from(getGenerator(), _format(str, objArr), th);
    }

    public void _reportIncompatibleRootType(java.lang.Object obj, JavaType javaType) throws java.io.IOException {
        if (javaType.isPrimitive() && C5619Yr.getFieldNames(javaType.getRawClass()).isAssignableFrom(obj.getClass())) {
            return;
        }
        reportBadDefinition(javaType, java.lang.String.format("Incompatible types: declared root type (%s) vs %s", javaType, C5619Yr.copydefault(obj)));
    }

    public VD<java.lang.Object> _findExplicitUntypedSerializer(java.lang.Class<?> cls) throws JsonMappingException {
        VD<java.lang.Object> vdOLrzqt = this._knownSerializers.OLrzqt(cls);
        if (vdOLrzqt == null && (vdOLrzqt = this._serializerCache.AEQbTJ(cls)) == null) {
            vdOLrzqt = _createAndCacheUntypedSerializer(cls);
        }
        if (isUnknownTypeSerializer(vdOLrzqt)) {
            return null;
        }
        return vdOLrzqt;
    }

    public VD<java.lang.Object> _createAndCacheUntypedSerializer(java.lang.Class<?> cls) throws JsonMappingException {
        VD<java.lang.Object> vd_createUntypedSerializer;
        JavaType javaTypeConstructType = this._config.constructType(cls);
        try {
            vd_createUntypedSerializer = _createUntypedSerializer(javaTypeConstructType);
        } catch (java.lang.IllegalArgumentException e) {
            reportBadDefinition(javaTypeConstructType, C5619Yr.EZpvd((java.lang.Throwable) e));
            vd_createUntypedSerializer = null;
        }
        if (vd_createUntypedSerializer != null) {
            this._serializerCache.KWHzl(cls, javaTypeConstructType, vd_createUntypedSerializer, this);
        }
        return vd_createUntypedSerializer;
    }

    public VD<java.lang.Object> _createAndCacheUntypedSerializer(JavaType javaType) throws JsonMappingException {
        VD<java.lang.Object> vd_createUntypedSerializer;
        try {
            vd_createUntypedSerializer = _createUntypedSerializer(javaType);
        } catch (java.lang.IllegalArgumentException e) {
            reportMappingProblem(e, C5619Yr.EZpvd((java.lang.Throwable) e), new java.lang.Object[0]);
            vd_createUntypedSerializer = null;
        }
        if (vd_createUntypedSerializer != null) {
            this._serializerCache.OLrzqt(javaType, vd_createUntypedSerializer, this);
        }
        return vd_createUntypedSerializer;
    }

    public VD<java.lang.Object> _createUntypedSerializer(JavaType javaType) throws JsonMappingException {
        return this._serializerFactory.createSerializer(this, javaType);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: o.VD<?> */
    /* JADX WARN: Multi-variable type inference failed */
    public VD<java.lang.Object> _handleContextualResolvable(VD<?> vd, BeanProperty beanProperty) throws JsonMappingException {
        if (vd instanceof XZ) {
            ((XZ) vd).resolve(this);
        }
        return handleSecondaryContextualization(vd, beanProperty);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: o.VD<?> */
    /* JADX WARN: Multi-variable type inference failed */
    public VD<java.lang.Object> _handleResolvable(VD<?> vd) throws JsonMappingException {
        if (vd instanceof XZ) {
            ((XZ) vd).resolve(this);
        }
        return vd;
    }

    public final java.text.DateFormat _dateFormat() {
        java.text.DateFormat dateFormat = this._dateFormat;
        if (dateFormat != null) {
            return dateFormat;
        }
        java.text.DateFormat dateFormat2 = (java.text.DateFormat) this._config.getDateFormat().clone();
        this._dateFormat = dateFormat2;
        return dateFormat2;
    }
}
