package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.node.ObjectNode;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import o.AbstractC5601Xz;
import o.C5594Xs;
import o.C5610Yi;
import o.C5619Yr;
import o.InterfaceC5584Xi;
import o.InterfaceC5586Xk;
import o.InterfaceC5598Xw;
import o.VD;
import o.VI;
import o.VQ;
import o.WM;
import o.WT;
import o.XY;

/* JADX INFO: loaded from: classes21.dex */
public abstract class DefaultSerializerProvider extends VI implements Serializable {
    private static final long serialVersionUID = 1;
    protected transient JsonGenerator _generator;
    protected transient ArrayList<ObjectIdGenerator<?>> _objectIdGenerators;
    protected transient Map<Object, C5610Yi> _seenObjectIds;

    public abstract DefaultSerializerProvider createInstance(SerializationConfig serializationConfig, XY xy);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.VI
    public JsonGenerator getGenerator() {
        return this._generator;
    }

    public DefaultSerializerProvider() {
    }

    public DefaultSerializerProvider(VI vi, SerializationConfig serializationConfig, XY xy) {
        super(vi, serializationConfig, xy);
    }

    public DefaultSerializerProvider(DefaultSerializerProvider defaultSerializerProvider) {
        super(defaultSerializerProvider);
    }

    public DefaultSerializerProvider copy() {
        throw new IllegalStateException("DefaultSerializerProvider sub-class not overriding copy()");
    }

    @Override // o.VI
    public VD<Object> serializerInstance(WM wm, Object obj) throws JsonMappingException {
        VD<?> vd;
        if (obj == null) {
            return null;
        }
        if (obj instanceof VD) {
            vd = (VD) obj;
        } else {
            if (!(obj instanceof Class)) {
                reportBadDefinition(wm.getType(), "AnnotationIntrospector returned serializer definition of type " + obj.getClass().getName() + "; expected type JsonSerializer or Class<JsonSerializer> instead");
            }
            Class<?> cls = (Class) obj;
            if (cls == VD.ActionBar.class || C5619Yr.fetchVPNInfo(cls)) {
                return null;
            }
            if (!VD.class.isAssignableFrom(cls)) {
                reportBadDefinition(wm.getType(), "AnnotationIntrospector returned Class " + cls.getName() + "; expected Class<JsonSerializer>");
            }
            VQ handlerInstantiator = this._config.getHandlerInstantiator();
            VD<?> vdCopydefault = handlerInstantiator != null ? handlerInstantiator.copydefault(this._config, wm, cls) : null;
            vd = vdCopydefault == null ? (VD) C5619Yr.EZpvd(cls, this._config.canOverrideAccessModifiers()) : vdCopydefault;
        }
        return _handleResolvable(vd);
    }

    @Override // o.VI
    public Object includeFilterInstance(WT wt, Class<?> cls) {
        if (cls == null) {
            return null;
        }
        VQ handlerInstantiator = this._config.getHandlerInstantiator();
        Object objCopydefault = handlerInstantiator != null ? handlerInstantiator.copydefault(this._config, wt, cls) : null;
        return objCopydefault == null ? C5619Yr.EZpvd(cls, this._config.canOverrideAccessModifiers()) : objCopydefault;
    }

    @Override // o.VI
    public boolean includeFilterSuppressNulls(Object obj) throws JsonMappingException {
        if (obj == null) {
            return true;
        }
        try {
            return obj.equals(null);
        } catch (Exception e) {
            reportBadDefinition(obj.getClass(), String.format("Problem determining whether filter of type '%s' should filter out `null` values: (%s) %s", obj.getClass().getName(), e.getClass().getName(), C5619Yr.EZpvd((Throwable) e)), e);
            return false;
        }
    }

    @Override // o.VI
    public C5610Yi findObjectId(Object obj, ObjectIdGenerator<?> objectIdGenerator) {
        ObjectIdGenerator<?> objectIdGeneratorNewForSerialization;
        Map<Object, C5610Yi> map = this._seenObjectIds;
        if (map == null) {
            this._seenObjectIds = _createObjectIdMap();
        } else {
            C5610Yi c5610Yi = map.get(obj);
            if (c5610Yi != null) {
                return c5610Yi;
            }
        }
        ArrayList<ObjectIdGenerator<?>> arrayList = this._objectIdGenerators;
        if (arrayList == null) {
            this._objectIdGenerators = new ArrayList<>(8);
        } else {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                objectIdGeneratorNewForSerialization = this._objectIdGenerators.get(i);
                if (objectIdGeneratorNewForSerialization.canUseFor(objectIdGenerator)) {
                    break;
                }
            }
        }
        objectIdGeneratorNewForSerialization = null;
        if (objectIdGeneratorNewForSerialization == null) {
            objectIdGeneratorNewForSerialization = objectIdGenerator.newForSerialization(this);
            this._objectIdGenerators.add(objectIdGeneratorNewForSerialization);
        }
        C5610Yi c5610Yi2 = new C5610Yi(objectIdGeneratorNewForSerialization);
        this._seenObjectIds.put(obj, c5610Yi2);
        return c5610Yi2;
    }

    public Map<Object, C5610Yi> _createObjectIdMap() {
        if (isEnabled(SerializationFeature.USE_EQUALITY_FOR_OBJECT_ID)) {
            return new HashMap();
        }
        return new IdentityHashMap();
    }

    public boolean hasSerializerFor(Class<?> cls, AtomicReference<Throwable> atomicReference) {
        if (cls == Object.class && !this._config.isEnabled(SerializationFeature.FAIL_ON_EMPTY_BEANS)) {
            return true;
        }
        try {
            return _findExplicitUntypedSerializer(cls) != null;
        } catch (JsonMappingException e) {
            if (atomicReference != null) {
                atomicReference.set(e);
            }
            return false;
        } catch (RuntimeException e2) {
            if (atomicReference == null) {
                throw e2;
            }
            atomicReference.set(e2);
            return false;
        }
    }

    public void serializeValue(JsonGenerator jsonGenerator, Object obj) throws IOException {
        this._generator = jsonGenerator;
        if (obj == null) {
            _serializeNull(jsonGenerator);
            return;
        }
        Class<?> cls = obj.getClass();
        VD<Object> vdFindTypedValueSerializer = findTypedValueSerializer(cls, true, (BeanProperty) null);
        PropertyName fullRootName = this._config.getFullRootName();
        if (fullRootName == null) {
            if (this._config.isEnabled(SerializationFeature.WRAP_ROOT_VALUE)) {
                _serialize(jsonGenerator, obj, vdFindTypedValueSerializer, this._config.findRootName(cls));
                return;
            }
        } else if (!fullRootName.isEmpty()) {
            _serialize(jsonGenerator, obj, vdFindTypedValueSerializer, fullRootName);
            return;
        }
        _serialize(jsonGenerator, obj, vdFindTypedValueSerializer);
    }

    public void serializeValue(JsonGenerator jsonGenerator, Object obj, JavaType javaType) throws IOException {
        this._generator = jsonGenerator;
        if (obj == null) {
            _serializeNull(jsonGenerator);
            return;
        }
        if (!javaType.getRawClass().isAssignableFrom(obj.getClass())) {
            _reportIncompatibleRootType(obj, javaType);
        }
        VD<Object> vdFindTypedValueSerializer = findTypedValueSerializer(javaType, true, (BeanProperty) null);
        PropertyName fullRootName = this._config.getFullRootName();
        if (fullRootName == null) {
            if (this._config.isEnabled(SerializationFeature.WRAP_ROOT_VALUE)) {
                _serialize(jsonGenerator, obj, vdFindTypedValueSerializer, this._config.findRootName(javaType));
                return;
            }
        } else if (!fullRootName.isEmpty()) {
            _serialize(jsonGenerator, obj, vdFindTypedValueSerializer, fullRootName);
            return;
        }
        _serialize(jsonGenerator, obj, vdFindTypedValueSerializer);
    }

    public void serializeValue(JsonGenerator jsonGenerator, Object obj, JavaType javaType, VD<Object> vd) throws IOException {
        PropertyName propertyNameFindRootName;
        this._generator = jsonGenerator;
        if (obj == null) {
            _serializeNull(jsonGenerator);
            return;
        }
        if (javaType != null && !javaType.getRawClass().isAssignableFrom(obj.getClass())) {
            _reportIncompatibleRootType(obj, javaType);
        }
        if (vd == null) {
            vd = findTypedValueSerializer(javaType, true, (BeanProperty) null);
        }
        PropertyName fullRootName = this._config.getFullRootName();
        if (fullRootName == null) {
            if (this._config.isEnabled(SerializationFeature.WRAP_ROOT_VALUE)) {
                if (javaType == null) {
                    propertyNameFindRootName = this._config.findRootName(obj.getClass());
                } else {
                    propertyNameFindRootName = this._config.findRootName(javaType);
                }
                _serialize(jsonGenerator, obj, vd, propertyNameFindRootName);
                return;
            }
        } else if (!fullRootName.isEmpty()) {
            _serialize(jsonGenerator, obj, vd, fullRootName);
            return;
        }
        _serialize(jsonGenerator, obj, vd);
    }

    public void serializePolymorphic(JsonGenerator jsonGenerator, Object obj, JavaType javaType, VD<Object> vd, AbstractC5601Xz abstractC5601Xz) throws IOException {
        boolean zIsEnabled;
        this._generator = jsonGenerator;
        if (obj == null) {
            _serializeNull(jsonGenerator);
            return;
        }
        if (javaType != null && !javaType.getRawClass().isAssignableFrom(obj.getClass())) {
            _reportIncompatibleRootType(obj, javaType);
        }
        if (vd == null) {
            if (javaType != null && javaType.isContainerType()) {
                vd = findValueSerializer(javaType, (BeanProperty) null);
            } else {
                vd = findValueSerializer(obj.getClass(), (BeanProperty) null);
            }
        }
        PropertyName fullRootName = this._config.getFullRootName();
        if (fullRootName == null) {
            zIsEnabled = this._config.isEnabled(SerializationFeature.WRAP_ROOT_VALUE);
            if (zIsEnabled) {
                jsonGenerator.AkhnZx();
                jsonGenerator.copydefault(this._config.findRootName(obj.getClass()).simpleAsEncoded(this._config));
            }
        } else if (fullRootName.isEmpty()) {
            zIsEnabled = false;
        } else {
            jsonGenerator.AkhnZx();
            jsonGenerator.KWHzl(fullRootName.getSimpleName());
            zIsEnabled = true;
        }
        try {
            vd.serializeWithType(obj, jsonGenerator, this, abstractC5601Xz);
            if (zIsEnabled) {
                jsonGenerator.DbNXlk();
            }
        } catch (Exception e) {
            throw _wrapAsIOE(jsonGenerator, e);
        }
    }

    private final void _serialize(JsonGenerator jsonGenerator, Object obj, VD<Object> vd, PropertyName propertyName) throws IOException {
        try {
            jsonGenerator.AkhnZx();
            jsonGenerator.copydefault(propertyName.simpleAsEncoded(this._config));
            vd.serialize(obj, jsonGenerator, this);
            jsonGenerator.DbNXlk();
        } catch (Exception e) {
            throw _wrapAsIOE(jsonGenerator, e);
        }
    }

    private final void _serialize(JsonGenerator jsonGenerator, Object obj, VD<Object> vd) throws IOException {
        try {
            vd.serialize(obj, jsonGenerator, this);
        } catch (Exception e) {
            throw _wrapAsIOE(jsonGenerator, e);
        }
    }

    public void _serializeNull(JsonGenerator jsonGenerator) throws IOException {
        try {
            getDefaultNullValueSerializer().serialize(null, jsonGenerator, this);
        } catch (Exception e) {
            throw _wrapAsIOE(jsonGenerator, e);
        }
    }

    private IOException _wrapAsIOE(JsonGenerator jsonGenerator, Exception exc) {
        if (exc instanceof IOException) {
            return (IOException) exc;
        }
        String strEZpvd = C5619Yr.EZpvd((Throwable) exc);
        if (strEZpvd == null) {
            strEZpvd = "[no message for " + exc.getClass().getName() + "]";
        }
        return new JsonMappingException(jsonGenerator, strEZpvd, exc);
    }

    public int cachedSerializersCount() {
        return this._serializerCache.EZpvd();
    }

    public void flushCachedSerializers() {
        this._serializerCache.KWHzl();
    }

    public void acceptJsonFormatVisitor(JavaType javaType, InterfaceC5584Xi interfaceC5584Xi) throws JsonMappingException {
        if (javaType == null) {
            throw new IllegalArgumentException("A class must be provided");
        }
        interfaceC5584Xi.AEQbTJ(this);
        findValueSerializer(javaType, (BeanProperty) null).acceptJsonFormatVisitor(interfaceC5584Xi, javaType);
    }

    @Deprecated
    public C5594Xs generateJsonSchema(Class<?> cls) throws JsonMappingException {
        InterfaceC5586Xk interfaceC5586XkFindValueSerializer = findValueSerializer(cls, (BeanProperty) null);
        JsonNode schema = interfaceC5586XkFindValueSerializer instanceof InterfaceC5598Xw ? ((InterfaceC5598Xw) interfaceC5586XkFindValueSerializer).getSchema(this, null) : C5594Xs.OLrzqt();
        if (!(schema instanceof ObjectNode)) {
            throw new IllegalArgumentException("Class " + cls.getName() + " would not be serialized as a JSON object and therefore has no schema");
        }
        return new C5594Xs((ObjectNode) schema);
    }

    public static final class Impl extends DefaultSerializerProvider {
        private static final long serialVersionUID = 1;

        public Impl() {
        }

        public Impl(Impl impl) {
            super(impl);
        }

        public Impl(VI vi, SerializationConfig serializationConfig, XY xy) {
            super(vi, serializationConfig, xy);
        }

        @Override // com.fasterxml.jackson.databind.ser.DefaultSerializerProvider
        public DefaultSerializerProvider copy() {
            return new Impl(this);
        }

        /* JADX DEBUG: Method merged with bridge method: createInstance(Lcom/fasterxml/jackson/databind/SerializationConfig;Lo/XY;)Lcom/fasterxml/jackson/databind/ser/DefaultSerializerProvider; */
        @Override // com.fasterxml.jackson.databind.ser.DefaultSerializerProvider
        public Impl createInstance(SerializationConfig serializationConfig, XY xy) {
            return new Impl(this, serializationConfig, xy);
        }
    }
}
