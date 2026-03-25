package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReader;
import com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.type.LogicalType;
import java.io.IOException;
import java.io.Serializable;
import java.util.Map;
import o.AbstractC5548Vy;
import o.AbstractC5549Vz;
import o.AbstractC5597Xv;
import o.C5565Wp;
import o.C5576Xa;
import o.C5619Yr;
import o.InterfaceC5500Ud;
import o.InterfaceC5554We;
import o.VW;

/* JADX INFO: loaded from: classes21.dex */
public class AbstractDeserializer extends AbstractC5548Vy<Object> implements InterfaceC5554We, Serializable {
    private static final long serialVersionUID = 1;
    protected final boolean _acceptBoolean;
    protected final boolean _acceptDouble;
    protected final boolean _acceptInt;
    protected final boolean _acceptString;
    protected final Map<String, SettableBeanProperty> _backRefProperties;
    protected final JavaType _baseType;
    protected final ObjectIdReader _objectIdReader;
    protected transient Map<String, SettableBeanProperty> _properties;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC5548Vy
    public ObjectIdReader getObjectIdReader() {
        return this._objectIdReader;
    }

    @Override // o.AbstractC5548Vy
    public boolean isCachable() {
        return true;
    }

    @Override // o.AbstractC5548Vy
    public Boolean supportsUpdate(DeserializationConfig deserializationConfig) {
        return null;
    }

    public AbstractDeserializer(VW vw, AbstractC5549Vz abstractC5549Vz, Map<String, SettableBeanProperty> map, Map<String, SettableBeanProperty> map2) {
        JavaType newProxyInstance = abstractC5549Vz.getNewProxyInstance();
        this._baseType = newProxyInstance;
        this._objectIdReader = vw.gEmmrt();
        this._backRefProperties = map;
        this._properties = map2;
        Class<?> rawClass = newProxyInstance.getRawClass();
        this._acceptString = rawClass.isAssignableFrom(String.class);
        boolean z = true;
        this._acceptBoolean = rawClass == Boolean.TYPE || rawClass.isAssignableFrom(Boolean.class);
        this._acceptInt = rawClass == Integer.TYPE || rawClass.isAssignableFrom(Integer.class);
        if (rawClass != Double.TYPE && !rawClass.isAssignableFrom(Double.class)) {
            z = false;
        }
        this._acceptDouble = z;
    }

    @Deprecated
    public AbstractDeserializer(VW vw, AbstractC5549Vz abstractC5549Vz, Map<String, SettableBeanProperty> map) {
        this(vw, abstractC5549Vz, map, null);
    }

    public AbstractDeserializer(AbstractC5549Vz abstractC5549Vz) {
        JavaType newProxyInstance = abstractC5549Vz.getNewProxyInstance();
        this._baseType = newProxyInstance;
        this._objectIdReader = null;
        this._backRefProperties = null;
        Class<?> rawClass = newProxyInstance.getRawClass();
        this._acceptString = rawClass.isAssignableFrom(String.class);
        boolean z = true;
        this._acceptBoolean = rawClass == Boolean.TYPE || rawClass.isAssignableFrom(Boolean.class);
        this._acceptInt = rawClass == Integer.TYPE || rawClass.isAssignableFrom(Integer.class);
        if (rawClass != Double.TYPE && !rawClass.isAssignableFrom(Double.class)) {
            z = false;
        }
        this._acceptDouble = z;
    }

    public AbstractDeserializer(AbstractDeserializer abstractDeserializer, ObjectIdReader objectIdReader, Map<String, SettableBeanProperty> map) {
        this._baseType = abstractDeserializer._baseType;
        this._backRefProperties = abstractDeserializer._backRefProperties;
        this._acceptString = abstractDeserializer._acceptString;
        this._acceptBoolean = abstractDeserializer._acceptBoolean;
        this._acceptInt = abstractDeserializer._acceptInt;
        this._acceptDouble = abstractDeserializer._acceptDouble;
        this._objectIdReader = objectIdReader;
        this._properties = map;
    }

    public static AbstractDeserializer constructForNonPOJO(AbstractC5549Vz abstractC5549Vz) {
        return new AbstractDeserializer(abstractC5549Vz);
    }

    @Override // o.InterfaceC5554We
    public AbstractC5548Vy<?> createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) throws JsonMappingException {
        AnnotatedMember member;
        C5576Xa c5576XaFindObjectIdInfo;
        ObjectIdGenerator<?> objectIdGeneratorObjectIdGeneratorInstance;
        SettableBeanProperty settableBeanProperty;
        JavaType javaType;
        AnnotationIntrospector annotationIntrospector = deserializationContext.getAnnotationIntrospector();
        if (beanProperty == null || annotationIntrospector == null || (member = beanProperty.getMember()) == null || (c5576XaFindObjectIdInfo = annotationIntrospector.findObjectIdInfo(member)) == null) {
            return this._properties == null ? this : new AbstractDeserializer(this, this._objectIdReader, (Map<String, SettableBeanProperty>) null);
        }
        InterfaceC5500Ud interfaceC5500UdObjectIdResolverInstance = deserializationContext.objectIdResolverInstance(member, c5576XaFindObjectIdInfo);
        C5576Xa c5576XaFindObjectReferenceInfo = annotationIntrospector.findObjectReferenceInfo(member, c5576XaFindObjectIdInfo);
        Class<? extends ObjectIdGenerator<?>> clsEZpvd = c5576XaFindObjectReferenceInfo.EZpvd();
        if (clsEZpvd == ObjectIdGenerators.PropertyGenerator.class) {
            PropertyName propertyNameAEQbTJ = c5576XaFindObjectReferenceInfo.AEQbTJ();
            Map<String, SettableBeanProperty> map = this._properties;
            SettableBeanProperty settableBeanProperty2 = map == null ? null : map.get(propertyNameAEQbTJ.getSimpleName());
            if (settableBeanProperty2 == null) {
                deserializationContext.reportBadDefinition(this._baseType, String.format("Invalid Object Id definition for %s: cannot find property with name %s", C5619Yr.uzCIH(handledType()), C5619Yr.copydefault(propertyNameAEQbTJ)));
            }
            JavaType type = settableBeanProperty2.getType();
            objectIdGeneratorObjectIdGeneratorInstance = new PropertyBasedObjectIdGenerator(c5576XaFindObjectReferenceInfo.AYXKKw());
            javaType = type;
            settableBeanProperty = settableBeanProperty2;
        } else {
            interfaceC5500UdObjectIdResolverInstance = deserializationContext.objectIdResolverInstance(member, c5576XaFindObjectReferenceInfo);
            JavaType javaType2 = deserializationContext.getTypeFactory().findTypeParameters(deserializationContext.constructType((Class<?>) clsEZpvd), ObjectIdGenerator.class)[0];
            objectIdGeneratorObjectIdGeneratorInstance = deserializationContext.objectIdGeneratorInstance(member, c5576XaFindObjectReferenceInfo);
            settableBeanProperty = null;
            javaType = javaType2;
        }
        return new AbstractDeserializer(this, ObjectIdReader.construct(javaType, c5576XaFindObjectReferenceInfo.AEQbTJ(), objectIdGeneratorObjectIdGeneratorInstance, deserializationContext.findRootValueDeserializer(javaType), settableBeanProperty, interfaceC5500UdObjectIdResolverInstance), (Map<String, SettableBeanProperty>) null);
    }

    @Override // o.AbstractC5548Vy
    public Class<?> handledType() {
        return this._baseType.getRawClass();
    }

    @Override // o.AbstractC5548Vy
    public LogicalType logicalType() {
        return LogicalType.POJO;
    }

    @Override // o.AbstractC5548Vy
    public SettableBeanProperty findBackReference(String str) {
        Map<String, SettableBeanProperty> map = this._backRefProperties;
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    @Override // o.AbstractC5548Vy
    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, AbstractC5597Xv abstractC5597Xv) throws IOException {
        JsonToken jsonTokenDjBIcL;
        if (this._objectIdReader != null && (jsonTokenDjBIcL = jsonParser.djBIcL()) != null) {
            if (jsonTokenDjBIcL.isScalarValue()) {
                return _deserializeFromObjectId(jsonParser, deserializationContext);
            }
            if (jsonTokenDjBIcL == JsonToken.START_OBJECT) {
                jsonTokenDjBIcL = jsonParser.RcXXUw();
            }
            if (jsonTokenDjBIcL == JsonToken.FIELD_NAME && this._objectIdReader.maySerializeAsObject() && this._objectIdReader.isValidReferencePropertyName(jsonParser.KWHzl(), jsonParser)) {
                return _deserializeFromObjectId(jsonParser, deserializationContext);
            }
        }
        Object obj_deserializeIfNatural = _deserializeIfNatural(jsonParser, deserializationContext);
        return obj_deserializeIfNatural != null ? obj_deserializeIfNatural : abstractC5597Xv.deserializeTypedFromObject(jsonParser, deserializationContext);
    }

    @Override // o.AbstractC5548Vy
    public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        return deserializationContext.handleMissingInstantiator(this._baseType.getRawClass(), new ValueInstantiator.Base(this._baseType), jsonParser, "abstract types either need to be mapped to concrete types, have custom deserializer, or contain additional type information", new Object[0]);
    }

    public Object _deserializeIfNatural(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        switch (jsonParser.valueOf()) {
            case 6:
                if (this._acceptString) {
                    return jsonParser.zLjUOn();
                }
                return null;
            case 7:
                if (this._acceptInt) {
                    return Integer.valueOf(jsonParser.getFieldNames());
                }
                return null;
            case 8:
                if (this._acceptDouble) {
                    return Double.valueOf(jsonParser.fARcdN());
                }
                return null;
            case 9:
                if (this._acceptBoolean) {
                    return Boolean.TRUE;
                }
                return null;
            case 10:
                if (this._acceptBoolean) {
                    return Boolean.FALSE;
                }
                return null;
            default:
                return null;
        }
    }

    public Object _deserializeFromObjectId(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        Object objectReference = this._objectIdReader.readObjectReference(jsonParser, deserializationContext);
        ObjectIdReader objectIdReader = this._objectIdReader;
        C5565Wp c5565WpFindObjectId = deserializationContext.findObjectId(objectReference, objectIdReader.generator, objectIdReader.resolver);
        Object objOLrzqt = c5565WpFindObjectId.OLrzqt();
        if (objOLrzqt != null) {
            return objOLrzqt;
        }
        throw new UnresolvedForwardReference(jsonParser, "Could not resolve Object Id [" + objectReference + "] -- unresolved forward-reference?", jsonParser.fetchVPNInfo(), c5565WpFindObjectId);
    }
}
