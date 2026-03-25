package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.InjectableValues;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import o.AbstractC5548Vy;
import o.AbstractC5550Wa;
import o.C5565Wp;
import o.C5619Yr;
import o.InterfaceC5500Ud;
import o.InterfaceC5557Wh;
import o.VC;
import o.VQ;
import o.WM;

/* JADX INFO: loaded from: classes21.dex */
public abstract class DefaultDeserializationContext extends DeserializationContext implements Serializable {
    private static final long serialVersionUID = 1;
    private List<InterfaceC5500Ud> _objectIdResolvers;
    protected transient LinkedHashMap<ObjectIdGenerator.IdKey, C5565Wp> _objectIds;

    public abstract DefaultDeserializationContext createDummyInstance(DeserializationConfig deserializationConfig);

    public abstract DefaultDeserializationContext createInstance(DeserializationConfig deserializationConfig, JsonParser jsonParser, InjectableValues injectableValues);

    public abstract DefaultDeserializationContext with(AbstractC5550Wa abstractC5550Wa);

    public DefaultDeserializationContext(AbstractC5550Wa abstractC5550Wa, DeserializerCache deserializerCache) {
        super(abstractC5550Wa, deserializerCache);
    }

    public DefaultDeserializationContext(DefaultDeserializationContext defaultDeserializationContext, DeserializationConfig deserializationConfig, JsonParser jsonParser, InjectableValues injectableValues) {
        super(defaultDeserializationContext, deserializationConfig, jsonParser, injectableValues);
    }

    public DefaultDeserializationContext(DefaultDeserializationContext defaultDeserializationContext, DeserializationConfig deserializationConfig) {
        super(defaultDeserializationContext, deserializationConfig);
    }

    public DefaultDeserializationContext(DefaultDeserializationContext defaultDeserializationContext, AbstractC5550Wa abstractC5550Wa) {
        super(defaultDeserializationContext, abstractC5550Wa);
    }

    public DefaultDeserializationContext(DefaultDeserializationContext defaultDeserializationContext) {
        super(defaultDeserializationContext);
    }

    public DefaultDeserializationContext copy() {
        throw new IllegalStateException("DefaultDeserializationContext sub-class not overriding copy()");
    }

    @Override // com.fasterxml.jackson.databind.DeserializationContext
    public C5565Wp findObjectId(Object obj, ObjectIdGenerator<?> objectIdGenerator, InterfaceC5500Ud interfaceC5500Ud) {
        InterfaceC5500Ud interfaceC5500UdAEQbTJ = null;
        if (obj == null) {
            return null;
        }
        ObjectIdGenerator.IdKey idKeyKey = objectIdGenerator.key(obj);
        LinkedHashMap<ObjectIdGenerator.IdKey, C5565Wp> linkedHashMap = this._objectIds;
        if (linkedHashMap == null) {
            this._objectIds = new LinkedHashMap<>();
        } else {
            C5565Wp c5565Wp = linkedHashMap.get(idKeyKey);
            if (c5565Wp != null) {
                return c5565Wp;
            }
        }
        List<InterfaceC5500Ud> list = this._objectIdResolvers;
        if (list == null) {
            this._objectIdResolvers = new ArrayList(8);
        } else {
            Iterator<InterfaceC5500Ud> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                InterfaceC5500Ud next = it.next();
                if (next.copydefault(interfaceC5500Ud)) {
                    interfaceC5500UdAEQbTJ = next;
                    break;
                }
            }
        }
        if (interfaceC5500UdAEQbTJ == null) {
            interfaceC5500UdAEQbTJ = interfaceC5500Ud.AEQbTJ(this);
            this._objectIdResolvers.add(interfaceC5500UdAEQbTJ);
        }
        C5565Wp c5565WpCreateReadableObjectId = createReadableObjectId(idKeyKey);
        c5565WpCreateReadableObjectId.AEQbTJ(interfaceC5500UdAEQbTJ);
        this._objectIds.put(idKeyKey, c5565WpCreateReadableObjectId);
        return c5565WpCreateReadableObjectId;
    }

    public C5565Wp createReadableObjectId(ObjectIdGenerator.IdKey idKey) {
        return new C5565Wp(idKey);
    }

    @Override // com.fasterxml.jackson.databind.DeserializationContext
    public void checkUnresolvedObjectId() throws UnresolvedForwardReference {
        if (this._objectIds != null && isEnabled(DeserializationFeature.FAIL_ON_UNRESOLVED_OBJECT_IDS)) {
            Iterator<Map.Entry<ObjectIdGenerator.IdKey, C5565Wp>> it = this._objectIds.entrySet().iterator();
            UnresolvedForwardReference unresolvedForwardReferenceWithStackTrace = null;
            while (it.hasNext()) {
                C5565Wp value = it.next().getValue();
                if (value.KWHzl() && !tryToResolveUnresolvedObjectId(value)) {
                    if (unresolvedForwardReferenceWithStackTrace == null) {
                        unresolvedForwardReferenceWithStackTrace = new UnresolvedForwardReference(getParser(), "Unresolved forward references for: ").withStackTrace();
                    }
                    Object obj = value.EZpvd().key;
                    Iterator<C5565Wp.Activity> itCopydefault = value.copydefault();
                    while (itCopydefault.hasNext()) {
                        C5565Wp.Activity next = itCopydefault.next();
                        unresolvedForwardReferenceWithStackTrace.addUnresolvedId(obj, next.KWHzl(), next.AEQbTJ());
                    }
                }
            }
            if (unresolvedForwardReferenceWithStackTrace != null) {
                throw unresolvedForwardReferenceWithStackTrace;
            }
        }
    }

    public boolean tryToResolveUnresolvedObjectId(C5565Wp c5565Wp) {
        return c5565Wp.copydefault(this);
    }

    @Override // com.fasterxml.jackson.databind.DeserializationContext
    public AbstractC5548Vy<Object> deserializerInstance(WM wm, Object obj) throws JsonMappingException {
        AbstractC5548Vy<?> abstractC5548Vy;
        if (obj == null) {
            return null;
        }
        if (obj instanceof AbstractC5548Vy) {
            abstractC5548Vy = (AbstractC5548Vy) obj;
        } else {
            if (!(obj instanceof Class)) {
                throw new IllegalStateException("AnnotationIntrospector returned deserializer definition of type " + obj.getClass().getName() + "; expected type JsonDeserializer or Class<JsonDeserializer> instead");
            }
            Class<?> cls = (Class) obj;
            if (cls == AbstractC5548Vy.Activity.class || C5619Yr.fetchVPNInfo(cls)) {
                return null;
            }
            if (!AbstractC5548Vy.class.isAssignableFrom(cls)) {
                throw new IllegalStateException("AnnotationIntrospector returned Class " + cls.getName() + "; expected Class<JsonDeserializer>");
            }
            VQ handlerInstantiator = this._config.getHandlerInstantiator();
            AbstractC5548Vy<?> abstractC5548VyEZpvd = handlerInstantiator != null ? handlerInstantiator.EZpvd(this._config, wm, cls) : null;
            abstractC5548Vy = abstractC5548VyEZpvd == null ? (AbstractC5548Vy) C5619Yr.EZpvd(cls, this._config.canOverrideAccessModifiers()) : abstractC5548VyEZpvd;
        }
        if (abstractC5548Vy instanceof InterfaceC5557Wh) {
            ((InterfaceC5557Wh) abstractC5548Vy).resolve(this);
        }
        return abstractC5548Vy;
    }

    @Override // com.fasterxml.jackson.databind.DeserializationContext
    public final VC keyDeserializerInstance(WM wm, Object obj) throws JsonMappingException {
        VC vc;
        if (obj == null) {
            return null;
        }
        if (obj instanceof VC) {
            vc = (VC) obj;
        } else {
            if (!(obj instanceof Class)) {
                throw new IllegalStateException("AnnotationIntrospector returned key deserializer definition of type " + obj.getClass().getName() + "; expected type KeyDeserializer or Class<KeyDeserializer> instead");
            }
            Class<?> cls = (Class) obj;
            if (cls == VC.ActionBar.class || C5619Yr.fetchVPNInfo(cls)) {
                return null;
            }
            if (!VC.class.isAssignableFrom(cls)) {
                throw new IllegalStateException("AnnotationIntrospector returned Class " + cls.getName() + "; expected Class<KeyDeserializer>");
            }
            VQ handlerInstantiator = this._config.getHandlerInstantiator();
            VC vcOLrzqt = handlerInstantiator != null ? handlerInstantiator.OLrzqt(this._config, wm, cls) : null;
            vc = vcOLrzqt == null ? (VC) C5619Yr.EZpvd(cls, this._config.canOverrideAccessModifiers()) : vcOLrzqt;
        }
        if (vc instanceof InterfaceC5557Wh) {
            ((InterfaceC5557Wh) vc).resolve(this);
        }
        return vc;
    }

    public Object readRootValue(JsonParser jsonParser, JavaType javaType, AbstractC5548Vy<Object> abstractC5548Vy, Object obj) throws IOException {
        if (this._config.useRootWrapping()) {
            return _unwrapAndDeserialize(jsonParser, javaType, abstractC5548Vy, obj);
        }
        if (obj == null) {
            return abstractC5548Vy.deserialize(jsonParser, this);
        }
        return abstractC5548Vy.deserialize(jsonParser, this, obj);
    }

    public Object _unwrapAndDeserialize(JsonParser jsonParser, JavaType javaType, AbstractC5548Vy<Object> abstractC5548Vy, Object obj) throws IOException {
        Object objDeserialize;
        String simpleName = this._config.findRootName(javaType).getSimpleName();
        JsonToken jsonTokenDjBIcL = jsonParser.djBIcL();
        JsonToken jsonToken = JsonToken.START_OBJECT;
        if (jsonTokenDjBIcL != jsonToken) {
            reportWrongTokenException(javaType, jsonToken, "Current token not START_OBJECT (needed to unwrap root name %s), but %s", C5619Yr.copydefault(simpleName), jsonParser.djBIcL());
        }
        JsonToken jsonTokenRcXXUw = jsonParser.RcXXUw();
        JsonToken jsonToken2 = JsonToken.FIELD_NAME;
        if (jsonTokenRcXXUw != jsonToken2) {
            reportWrongTokenException(javaType, jsonToken2, "Current token not FIELD_NAME (to contain expected root name %s), but %s", C5619Yr.copydefault(simpleName), jsonParser.djBIcL());
        }
        String strKWHzl = jsonParser.KWHzl();
        if (!simpleName.equals(strKWHzl)) {
            reportPropertyInputMismatch(javaType, strKWHzl, "Root name (%s) does not match expected (%s) for type %s", C5619Yr.copydefault(strKWHzl), C5619Yr.copydefault(simpleName), C5619Yr.copydefault(javaType));
        }
        jsonParser.RcXXUw();
        if (obj == null) {
            objDeserialize = abstractC5548Vy.deserialize(jsonParser, this);
        } else {
            objDeserialize = abstractC5548Vy.deserialize(jsonParser, this, obj);
        }
        JsonToken jsonTokenRcXXUw2 = jsonParser.RcXXUw();
        JsonToken jsonToken3 = JsonToken.END_OBJECT;
        if (jsonTokenRcXXUw2 != jsonToken3) {
            reportWrongTokenException(javaType, jsonToken3, "Current token not END_OBJECT (to match wrapper object with root name %s), but %s", C5619Yr.copydefault(simpleName), jsonParser.djBIcL());
        }
        return objDeserialize;
    }

    public static final class Impl extends DefaultDeserializationContext {
        private static final long serialVersionUID = 1;

        public Impl(AbstractC5550Wa abstractC5550Wa) {
            super(abstractC5550Wa, (DeserializerCache) null);
        }

        private Impl(Impl impl, DeserializationConfig deserializationConfig, JsonParser jsonParser, InjectableValues injectableValues) {
            super(impl, deserializationConfig, jsonParser, injectableValues);
        }

        private Impl(Impl impl) {
            super(impl);
        }

        private Impl(Impl impl, AbstractC5550Wa abstractC5550Wa) {
            super(impl, abstractC5550Wa);
        }

        private Impl(Impl impl, DeserializationConfig deserializationConfig) {
            super(impl, deserializationConfig);
        }

        @Override // com.fasterxml.jackson.databind.deser.DefaultDeserializationContext
        public DefaultDeserializationContext copy() {
            C5619Yr.AEQbTJ((Class<?>) Impl.class, this, "copy");
            return new Impl(this);
        }

        @Override // com.fasterxml.jackson.databind.deser.DefaultDeserializationContext
        public DefaultDeserializationContext createInstance(DeserializationConfig deserializationConfig, JsonParser jsonParser, InjectableValues injectableValues) {
            return new Impl(this, deserializationConfig, jsonParser, injectableValues);
        }

        @Override // com.fasterxml.jackson.databind.deser.DefaultDeserializationContext
        public DefaultDeserializationContext createDummyInstance(DeserializationConfig deserializationConfig) {
            return new Impl(this, deserializationConfig);
        }

        @Override // com.fasterxml.jackson.databind.deser.DefaultDeserializationContext
        public DefaultDeserializationContext with(AbstractC5550Wa abstractC5550Wa) {
            return new Impl(this, abstractC5550Wa);
        }
    }
}
