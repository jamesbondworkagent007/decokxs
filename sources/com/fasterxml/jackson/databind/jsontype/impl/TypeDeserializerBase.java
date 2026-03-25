package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer;
import java.io.IOException;
import java.io.Serializable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.AbstractC5548Vy;
import o.AbstractC5597Xv;
import o.C5619Yr;
import o.XB;

/* JADX INFO: loaded from: classes21.dex */
public abstract class TypeDeserializerBase extends AbstractC5597Xv implements Serializable {
    private static final long serialVersionUID = 1;
    protected final JavaType _baseType;
    protected final JavaType _defaultImpl;
    protected AbstractC5548Vy<Object> _defaultImplDeserializer;
    protected final Map<String, AbstractC5548Vy<Object>> _deserializers;
    protected final XB _idResolver;
    protected final BeanProperty _property;
    protected final boolean _typeIdVisible;
    protected final String _typePropertyName;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public JavaType baseType() {
        return this._baseType;
    }

    @Override // o.AbstractC5597Xv
    public abstract AbstractC5597Xv forProperty(BeanProperty beanProperty);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC5597Xv
    public final String getPropertyName() {
        return this._typePropertyName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC5597Xv
    public XB getTypeIdResolver() {
        return this._idResolver;
    }

    @Override // o.AbstractC5597Xv
    public abstract JsonTypeInfo.As getTypeInclusion();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC5597Xv
    public boolean hasDefaultImpl() {
        return this._defaultImpl != null;
    }

    public TypeDeserializerBase(JavaType javaType, XB xb, String str, boolean z, JavaType javaType2) {
        this._baseType = javaType;
        this._idResolver = xb;
        this._typePropertyName = C5619Yr.KWHzl(str);
        this._typeIdVisible = z;
        this._deserializers = new ConcurrentHashMap(16, 0.75f, 2);
        this._defaultImpl = javaType2;
        this._property = null;
    }

    public TypeDeserializerBase(TypeDeserializerBase typeDeserializerBase, BeanProperty beanProperty) {
        this._baseType = typeDeserializerBase._baseType;
        this._idResolver = typeDeserializerBase._idResolver;
        this._typePropertyName = typeDeserializerBase._typePropertyName;
        this._typeIdVisible = typeDeserializerBase._typeIdVisible;
        this._deserializers = typeDeserializerBase._deserializers;
        this._defaultImpl = typeDeserializerBase._defaultImpl;
        this._defaultImplDeserializer = typeDeserializerBase._defaultImplDeserializer;
        this._property = beanProperty;
    }

    public String baseTypeName() {
        return this._baseType.getRawClass().getName();
    }

    @Override // o.AbstractC5597Xv
    public Class<?> getDefaultImpl() {
        return C5619Yr.EZpvd(this._defaultImpl);
    }

    public String toString() {
        return AbstractJsonLexerKt.BEGIN_LIST + getClass().getName() + "; base-type:" + this._baseType + "; id-resolver: " + this._idResolver + AbstractJsonLexerKt.END_LIST;
    }

    public final AbstractC5548Vy<Object> _findDeserializer(DeserializationContext deserializationContext, String str) throws IOException {
        AbstractC5548Vy<Object> abstractC5548VyFindContextualValueDeserializer;
        AbstractC5548Vy<Object> abstractC5548Vy_findDefaultImplDeserializer = this._deserializers.get(str);
        if (abstractC5548Vy_findDefaultImplDeserializer == null) {
            JavaType javaTypeKWHzl = this._idResolver.KWHzl(deserializationContext, str);
            if (javaTypeKWHzl == null) {
                abstractC5548Vy_findDefaultImplDeserializer = _findDefaultImplDeserializer(deserializationContext);
                if (abstractC5548Vy_findDefaultImplDeserializer == null) {
                    JavaType javaType_handleUnknownTypeId = _handleUnknownTypeId(deserializationContext, str);
                    if (javaType_handleUnknownTypeId == null) {
                        return NullifyingDeserializer.instance;
                    }
                    abstractC5548VyFindContextualValueDeserializer = deserializationContext.findContextualValueDeserializer(javaType_handleUnknownTypeId, this._property);
                }
                this._deserializers.put(str, abstractC5548Vy_findDefaultImplDeserializer);
            } else {
                JavaType javaType = this._baseType;
                if (javaType != null && javaType.getClass() == javaTypeKWHzl.getClass() && !javaTypeKWHzl.hasGenericTypes()) {
                    try {
                        javaTypeKWHzl = deserializationContext.constructSpecializedType(this._baseType, javaTypeKWHzl.getRawClass());
                    } catch (IllegalArgumentException e) {
                        throw deserializationContext.invalidTypeIdException(this._baseType, str, e.getMessage());
                    }
                }
                abstractC5548VyFindContextualValueDeserializer = deserializationContext.findContextualValueDeserializer(javaTypeKWHzl, this._property);
            }
            abstractC5548Vy_findDefaultImplDeserializer = abstractC5548VyFindContextualValueDeserializer;
            this._deserializers.put(str, abstractC5548Vy_findDefaultImplDeserializer);
        }
        return abstractC5548Vy_findDefaultImplDeserializer;
    }

    public final AbstractC5548Vy<Object> _findDefaultImplDeserializer(DeserializationContext deserializationContext) throws IOException {
        AbstractC5548Vy<Object> abstractC5548Vy;
        JavaType javaType = this._defaultImpl;
        if (javaType == null) {
            if (deserializationContext.isEnabled(DeserializationFeature.FAIL_ON_INVALID_SUBTYPE)) {
                return null;
            }
            return NullifyingDeserializer.instance;
        }
        if (C5619Yr.fetchVPNInfo(javaType.getRawClass())) {
            return NullifyingDeserializer.instance;
        }
        synchronized (this._defaultImpl) {
            if (this._defaultImplDeserializer == null) {
                this._defaultImplDeserializer = deserializationContext.findContextualValueDeserializer(this._defaultImpl, this._property);
            }
            abstractC5548Vy = this._defaultImplDeserializer;
        }
        return abstractC5548Vy;
    }

    @Deprecated
    public Object _deserializeWithNativeTypeId(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        return _deserializeWithNativeTypeId(jsonParser, deserializationContext, jsonParser.AxsJAY());
    }

    public Object _deserializeWithNativeTypeId(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        AbstractC5548Vy<Object> abstractC5548Vy_findDeserializer;
        if (obj == null) {
            abstractC5548Vy_findDeserializer = _findDefaultImplDeserializer(deserializationContext);
            if (abstractC5548Vy_findDeserializer == null) {
                return deserializationContext.reportInputMismatch(baseType(), "No (native) type id found when one was expected for polymorphic type handling", new Object[0]);
            }
        } else {
            abstractC5548Vy_findDeserializer = _findDeserializer(deserializationContext, obj instanceof String ? (String) obj : String.valueOf(obj));
        }
        return abstractC5548Vy_findDeserializer.deserialize(jsonParser, deserializationContext);
    }

    public JavaType _handleUnknownTypeId(DeserializationContext deserializationContext, String str) throws IOException {
        String str2;
        String strAEQbTJ = this._idResolver.AEQbTJ();
        if (strAEQbTJ == null) {
            str2 = "type ids are not statically known";
        } else {
            str2 = "known type ids = " + strAEQbTJ;
        }
        BeanProperty beanProperty = this._property;
        if (beanProperty != null) {
            str2 = String.format("%s (for POJO property '%s')", str2, beanProperty.getName());
        }
        return deserializationContext.handleUnknownTypeId(this._baseType, str, this._idResolver, str2);
    }

    public JavaType _handleMissingTypeId(DeserializationContext deserializationContext, String str) throws IOException {
        return deserializationContext.handleMissingTypeId(this._baseType, this._idResolver, str);
    }
}
