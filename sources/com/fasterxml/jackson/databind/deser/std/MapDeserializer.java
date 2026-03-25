package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonIncludeProperties;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.StreamReadCapability;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.UnresolvedForwardReference;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.type.LogicalType;
import com.fasterxml.jackson.databind.util.IgnorePropertiesUtil;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import o.AbstractC5548Vy;
import o.AbstractC5597Xv;
import o.C5565Wp;
import o.C5569Wt;
import o.C5617Yp;
import o.InterfaceC5553Wd;
import o.InterfaceC5554We;
import o.InterfaceC5555Wf;
import o.InterfaceC5557Wh;
import o.VC;
import o.VK;

/* JADX INFO: loaded from: classes21.dex */
@VK
public class MapDeserializer extends ContainerDeserializerBase<Map<Object, Object>> implements InterfaceC5554We, InterfaceC5557Wh {
    private static final long serialVersionUID = 1;
    protected boolean _checkDupSquash;
    protected AbstractC5548Vy<Object> _delegateDeserializer;
    protected final boolean _hasDefaultCreator;
    protected Set<String> _ignorableProperties;
    protected Set<String> _includableProperties;
    protected IgnorePropertiesUtil.Checker _inclusionChecker;
    protected final VC _keyDeserializer;
    protected PropertyBasedCreator _propertyBasedCreator;
    protected boolean _standardStringKey;
    protected final AbstractC5548Vy<Object> _valueDeserializer;
    protected final ValueInstantiator _valueInstantiator;
    protected final AbstractC5597Xv _valueTypeDeserializer;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase
    public AbstractC5548Vy<Object> getContentDeserializer() {
        return this._valueDeserializer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer
    public ValueInstantiator getValueInstantiator() {
        return this._valueInstantiator;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase, com.fasterxml.jackson.databind.deser.std.StdDeserializer
    public JavaType getValueType() {
        return this._containerType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC5548Vy
    public boolean isCachable() {
        return this._valueDeserializer == null && this._keyDeserializer == null && this._valueTypeDeserializer == null && this._ignorableProperties == null && this._includableProperties == null;
    }

    public MapDeserializer(JavaType javaType, ValueInstantiator valueInstantiator, VC vc, AbstractC5548Vy<Object> abstractC5548Vy, AbstractC5597Xv abstractC5597Xv) {
        super(javaType, (InterfaceC5555Wf) null, (Boolean) null);
        this._keyDeserializer = vc;
        this._valueDeserializer = abstractC5548Vy;
        this._valueTypeDeserializer = abstractC5597Xv;
        this._valueInstantiator = valueInstantiator;
        this._hasDefaultCreator = valueInstantiator.canCreateUsingDefault();
        this._delegateDeserializer = null;
        this._propertyBasedCreator = null;
        this._standardStringKey = _isStdKeyDeser(javaType, vc);
        this._inclusionChecker = null;
        this._checkDupSquash = javaType.getContentType().hasRawClass(Object.class);
    }

    public MapDeserializer(MapDeserializer mapDeserializer) {
        super(mapDeserializer);
        this._keyDeserializer = mapDeserializer._keyDeserializer;
        this._valueDeserializer = mapDeserializer._valueDeserializer;
        this._valueTypeDeserializer = mapDeserializer._valueTypeDeserializer;
        this._valueInstantiator = mapDeserializer._valueInstantiator;
        this._propertyBasedCreator = mapDeserializer._propertyBasedCreator;
        this._delegateDeserializer = mapDeserializer._delegateDeserializer;
        this._hasDefaultCreator = mapDeserializer._hasDefaultCreator;
        this._ignorableProperties = mapDeserializer._ignorableProperties;
        this._includableProperties = mapDeserializer._includableProperties;
        this._inclusionChecker = mapDeserializer._inclusionChecker;
        this._standardStringKey = mapDeserializer._standardStringKey;
        this._checkDupSquash = mapDeserializer._checkDupSquash;
    }

    public MapDeserializer(MapDeserializer mapDeserializer, VC vc, AbstractC5548Vy<Object> abstractC5548Vy, AbstractC5597Xv abstractC5597Xv, InterfaceC5555Wf interfaceC5555Wf, Set<String> set) {
        this(mapDeserializer, vc, abstractC5548Vy, abstractC5597Xv, interfaceC5555Wf, set, null);
    }

    public MapDeserializer(MapDeserializer mapDeserializer, VC vc, AbstractC5548Vy<Object> abstractC5548Vy, AbstractC5597Xv abstractC5597Xv, InterfaceC5555Wf interfaceC5555Wf, Set<String> set, Set<String> set2) {
        super(mapDeserializer, interfaceC5555Wf, mapDeserializer._unwrapSingle);
        this._keyDeserializer = vc;
        this._valueDeserializer = abstractC5548Vy;
        this._valueTypeDeserializer = abstractC5597Xv;
        this._valueInstantiator = mapDeserializer._valueInstantiator;
        this._propertyBasedCreator = mapDeserializer._propertyBasedCreator;
        this._delegateDeserializer = mapDeserializer._delegateDeserializer;
        this._hasDefaultCreator = mapDeserializer._hasDefaultCreator;
        this._ignorableProperties = set;
        this._includableProperties = set2;
        this._inclusionChecker = IgnorePropertiesUtil.copydefault(set, set2);
        this._standardStringKey = _isStdKeyDeser(this._containerType, vc);
        this._checkDupSquash = mapDeserializer._checkDupSquash;
    }

    public MapDeserializer withResolved(VC vc, AbstractC5597Xv abstractC5597Xv, AbstractC5548Vy<?> abstractC5548Vy, InterfaceC5555Wf interfaceC5555Wf, Set<String> set) {
        return withResolved(vc, abstractC5597Xv, abstractC5548Vy, interfaceC5555Wf, set, this._includableProperties);
    }

    public MapDeserializer withResolved(VC vc, AbstractC5597Xv abstractC5597Xv, AbstractC5548Vy<?> abstractC5548Vy, InterfaceC5555Wf interfaceC5555Wf, Set<String> set, Set<String> set2) {
        return (this._keyDeserializer == vc && this._valueDeserializer == abstractC5548Vy && this._valueTypeDeserializer == abstractC5597Xv && this._nullProvider == interfaceC5555Wf && this._ignorableProperties == set && this._includableProperties == set2) ? this : new MapDeserializer(this, vc, abstractC5548Vy, abstractC5597Xv, interfaceC5555Wf, set, set2);
    }

    public final boolean _isStdKeyDeser(JavaType javaType, VC vc) {
        JavaType keyType;
        if (vc == null || (keyType = javaType.getKeyType()) == null) {
            return true;
        }
        Class<?> rawClass = keyType.getRawClass();
        return (rawClass == String.class || rawClass == Object.class) && isDefaultKeyDeserializer(vc);
    }

    @Deprecated
    public void setIgnorableProperties(String[] strArr) {
        HashSet hashSetAEQbTJ = (strArr == null || strArr.length == 0) ? null : C5617Yp.AEQbTJ(strArr);
        this._ignorableProperties = hashSetAEQbTJ;
        this._inclusionChecker = IgnorePropertiesUtil.copydefault(hashSetAEQbTJ, this._includableProperties);
    }

    public void setIgnorableProperties(Set<String> set) {
        if (set == null || set.isEmpty()) {
            set = null;
        }
        this._ignorableProperties = set;
        this._inclusionChecker = IgnorePropertiesUtil.copydefault(set, this._includableProperties);
    }

    public void setIncludableProperties(Set<String> set) {
        this._includableProperties = set;
        this._inclusionChecker = IgnorePropertiesUtil.copydefault(this._ignorableProperties, set);
    }

    @Override // o.InterfaceC5557Wh
    public void resolve(DeserializationContext deserializationContext) throws JsonMappingException {
        if (this._valueInstantiator.canCreateUsingDelegate()) {
            JavaType delegateType = this._valueInstantiator.getDelegateType(deserializationContext.getConfig());
            if (delegateType == null) {
                JavaType javaType = this._containerType;
                deserializationContext.reportBadDefinition(javaType, String.format("Invalid delegate-creator definition for %s: value instantiator (%s) returned true for 'canCreateUsingDelegate()', but null for 'getDelegateType()'", javaType, this._valueInstantiator.getClass().getName()));
            }
            this._delegateDeserializer = findDeserializer(deserializationContext, delegateType, null);
        } else if (this._valueInstantiator.canCreateUsingArrayDelegate()) {
            JavaType arrayDelegateType = this._valueInstantiator.getArrayDelegateType(deserializationContext.getConfig());
            if (arrayDelegateType == null) {
                JavaType javaType2 = this._containerType;
                deserializationContext.reportBadDefinition(javaType2, String.format("Invalid delegate-creator definition for %s: value instantiator (%s) returned true for 'canCreateUsingArrayDelegate()', but null for 'getArrayDelegateType()'", javaType2, this._valueInstantiator.getClass().getName()));
            }
            this._delegateDeserializer = findDeserializer(deserializationContext, arrayDelegateType, null);
        }
        if (this._valueInstantiator.canCreateFromObjectWith()) {
            this._propertyBasedCreator = PropertyBasedCreator.OLrzqt(deserializationContext, this._valueInstantiator, this._valueInstantiator.getFromObjectArguments(deserializationContext.getConfig()), deserializationContext.isEnabled(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES));
        }
        this._standardStringKey = _isStdKeyDeser(this._containerType, this._keyDeserializer);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00bd A[PHI: r0
  0x00bd: PHI (r0v11 java.util.Set<java.lang.String>) = 
  (r0v10 java.util.Set<java.lang.String>)
  (r0v10 java.util.Set<java.lang.String>)
  (r0v12 java.util.Set<java.lang.String>)
  (r0v12 java.util.Set<java.lang.String>)
 binds: [B:19:0x0049, B:21:0x004f, B:34:0x008b, B:36:0x0091] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r10v0, types: [com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase, com.fasterxml.jackson.databind.deser.std.MapDeserializer, com.fasterxml.jackson.databind.deser.std.StdDeserializer] */
    /* JADX WARN: Type inference failed for: r2v0, types: [o.VC] */
    @Override // o.InterfaceC5554We
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AbstractC5548Vy<?> createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) throws JsonMappingException {
        AbstractC5548Vy<?> abstractC5548VyHandleSecondaryContextualization;
        Set<String> set;
        Set<String> set2;
        AnnotatedMember member;
        Set<String> included;
        Object objAEQbTJ = this._keyDeserializer;
        if (objAEQbTJ == null) {
            objAEQbTJ = deserializationContext.findKeyDeserializer(this._containerType.getKeyType(), beanProperty);
        } else if (objAEQbTJ instanceof InterfaceC5553Wd) {
            objAEQbTJ = ((InterfaceC5553Wd) objAEQbTJ).AEQbTJ(deserializationContext, beanProperty);
        }
        ?? r2 = objAEQbTJ;
        AbstractC5548Vy<?> abstractC5548VyFindConvertingContentDeserializer = this._valueDeserializer;
        if (beanProperty != null) {
            abstractC5548VyFindConvertingContentDeserializer = findConvertingContentDeserializer(deserializationContext, beanProperty, abstractC5548VyFindConvertingContentDeserializer);
        }
        JavaType contentType = this._containerType.getContentType();
        if (abstractC5548VyFindConvertingContentDeserializer == null) {
            abstractC5548VyHandleSecondaryContextualization = deserializationContext.findContextualValueDeserializer(contentType, beanProperty);
        } else {
            abstractC5548VyHandleSecondaryContextualization = deserializationContext.handleSecondaryContextualization(abstractC5548VyFindConvertingContentDeserializer, beanProperty, contentType);
        }
        AbstractC5548Vy<?> abstractC5548Vy = abstractC5548VyHandleSecondaryContextualization;
        AbstractC5597Xv abstractC5597XvForProperty = this._valueTypeDeserializer;
        if (abstractC5597XvForProperty != null) {
            abstractC5597XvForProperty = abstractC5597XvForProperty.forProperty(beanProperty);
        }
        AbstractC5597Xv abstractC5597Xv = abstractC5597XvForProperty;
        Set<String> hashSet = this._ignorableProperties;
        Set<String> set3 = this._includableProperties;
        AnnotationIntrospector annotationIntrospector = deserializationContext.getAnnotationIntrospector();
        if (!StdDeserializer._neitherNull(annotationIntrospector, beanProperty) || (member = beanProperty.getMember()) == null) {
            set = hashSet;
            set2 = set3;
        } else {
            DeserializationConfig config = deserializationContext.getConfig();
            JsonIgnoreProperties.Value valueFindPropertyIgnoralByName = annotationIntrospector.findPropertyIgnoralByName(config, member);
            if (valueFindPropertyIgnoralByName != null) {
                Set<String> setFindIgnoredForDeserialization = valueFindPropertyIgnoralByName.findIgnoredForDeserialization();
                if (!setFindIgnoredForDeserialization.isEmpty()) {
                    hashSet = hashSet == null ? new HashSet<>() : new HashSet(hashSet);
                    Iterator<String> it = setFindIgnoredForDeserialization.iterator();
                    while (it.hasNext()) {
                        hashSet.add(it.next());
                    }
                }
            }
            JsonIncludeProperties.Value valueFindPropertyInclusionByName = annotationIntrospector.findPropertyInclusionByName(config, member);
            if (valueFindPropertyInclusionByName != null && (included = valueFindPropertyInclusionByName.getIncluded()) != null) {
                HashSet hashSet2 = new HashSet();
                if (set3 == null) {
                    hashSet2 = new HashSet(included);
                } else {
                    for (String str : included) {
                        if (set3.contains(str)) {
                            hashSet2.add(str);
                        }
                    }
                }
                set2 = hashSet2;
                set = hashSet;
            }
        }
        return withResolved(r2, abstractC5597Xv, abstractC5548Vy, findContentNullProvider(deserializationContext, beanProperty, abstractC5548Vy), set, set2);
    }

    @Override // o.AbstractC5548Vy
    public LogicalType logicalType() {
        return LogicalType.Map;
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;)Ljava/lang/Object; */
    @Override // o.AbstractC5548Vy
    public Map<Object, Object> deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        if (this._propertyBasedCreator != null) {
            return _deserializeUsingCreator(jsonParser, deserializationContext);
        }
        AbstractC5548Vy<Object> abstractC5548Vy = this._delegateDeserializer;
        if (abstractC5548Vy != null) {
            return (Map) this._valueInstantiator.createUsingDelegate(deserializationContext, abstractC5548Vy.deserialize(jsonParser, deserializationContext));
        }
        if (!this._hasDefaultCreator) {
            return (Map) deserializationContext.handleMissingInstantiator(getMapClass(), getValueInstantiator(), jsonParser, "no default constructor found", new Object[0]);
        }
        int iValueOf = jsonParser.valueOf();
        if (iValueOf != 1 && iValueOf != 2) {
            if (iValueOf == 3) {
                return _deserializeFromArray(jsonParser, deserializationContext);
            }
            if (iValueOf != 5) {
                if (iValueOf == 6) {
                    return _deserializeFromString(jsonParser, deserializationContext);
                }
                return (Map) deserializationContext.handleUnexpectedToken(getValueType(deserializationContext), jsonParser);
            }
        }
        Map<Object, Object> map = (Map) this._valueInstantiator.createUsingDefault(deserializationContext);
        if (this._standardStringKey) {
            return _readAndBindStringKeyMap(jsonParser, deserializationContext, map);
        }
        return _readAndBind(jsonParser, deserializationContext, map);
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.AbstractC5548Vy
    public Map<Object, Object> deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, Map<Object, Object> map) throws IOException {
        jsonParser.KWHzl(map);
        JsonToken jsonTokenDjBIcL = jsonParser.djBIcL();
        if (jsonTokenDjBIcL != JsonToken.START_OBJECT && jsonTokenDjBIcL != JsonToken.FIELD_NAME) {
            return (Map) deserializationContext.handleUnexpectedToken(getMapClass(), jsonParser);
        }
        if (this._standardStringKey) {
            _readAndUpdateStringKeyMap(jsonParser, deserializationContext, map);
            return map;
        }
        _readAndUpdate(jsonParser, deserializationContext, map);
        return map;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer, o.AbstractC5548Vy
    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, AbstractC5597Xv abstractC5597Xv) throws IOException {
        return abstractC5597Xv.deserializeTypedFromObject(jsonParser, deserializationContext);
    }

    public final Class<?> getMapClass() {
        return this._containerType.getRawClass();
    }

    public final Map<Object, Object> _readAndBind(JsonParser jsonParser, DeserializationContext deserializationContext, Map<Object, Object> map) throws IOException {
        String strKWHzl;
        VC vc;
        String str;
        Object obj;
        Object objDeserializeWithType;
        JsonParser jsonParser2 = jsonParser;
        VC vc2 = this._keyDeserializer;
        AbstractC5548Vy<Object> abstractC5548Vy = this._valueDeserializer;
        AbstractC5597Xv abstractC5597Xv = this._valueTypeDeserializer;
        boolean z = abstractC5548Vy.getObjectIdReader() != null;
        ActionBar actionBar = z ? new ActionBar(this._containerType.getContentType().getRawClass(), map) : null;
        if (jsonParser.QVAiDq()) {
            strKWHzl = jsonParser.QbewEr();
        } else {
            JsonToken jsonTokenDjBIcL = jsonParser.djBIcL();
            JsonToken jsonToken = JsonToken.FIELD_NAME;
            if (jsonTokenDjBIcL != jsonToken) {
                if (jsonTokenDjBIcL == JsonToken.END_OBJECT) {
                    return map;
                }
                deserializationContext.reportWrongTokenException(this, jsonToken, (String) null, new Object[0]);
            }
            strKWHzl = jsonParser.KWHzl();
        }
        String strQbewEr = strKWHzl;
        while (strQbewEr != null) {
            Object objDeserializeKey = vc2.deserializeKey(strQbewEr, deserializationContext);
            JsonToken jsonTokenRcXXUw = jsonParser.RcXXUw();
            IgnorePropertiesUtil.Checker checker = this._inclusionChecker;
            if (checker != null && checker.shouldIgnore(strQbewEr)) {
                jsonParser.UeEOUB();
            } else {
                try {
                    if (jsonTokenRcXXUw == JsonToken.VALUE_NULL) {
                        if (!this._skipNullValues) {
                            objDeserializeWithType = this._nullProvider.getNullValue(deserializationContext);
                        }
                    } else if (abstractC5597Xv == null) {
                        objDeserializeWithType = abstractC5548Vy.deserialize(jsonParser2, deserializationContext);
                    } else {
                        objDeserializeWithType = abstractC5548Vy.deserializeWithType(jsonParser2, deserializationContext, abstractC5597Xv);
                    }
                } catch (UnresolvedForwardReference e) {
                    e = e;
                    obj = objDeserializeKey;
                    vc = vc2;
                } catch (Exception e2) {
                    e = e2;
                    vc = vc2;
                    str = strQbewEr;
                }
                if (z) {
                    actionBar.copydefault(objDeserializeKey, objDeserializeWithType);
                } else {
                    Object objPut = map.put(objDeserializeKey, objDeserializeWithType);
                    if (objPut != null) {
                        obj = objDeserializeKey;
                        vc = vc2;
                        str = strQbewEr;
                        try {
                            _squashDups(deserializationContext, map, objDeserializeKey, objPut, objDeserializeWithType);
                        } catch (UnresolvedForwardReference e3) {
                            e = e3;
                            handleUnresolvedReference(deserializationContext, actionBar, obj, e);
                        } catch (Exception e4) {
                            e = e4;
                            wrapAndThrow(deserializationContext, e, map, str);
                        }
                    }
                    strQbewEr = jsonParser.QbewEr();
                    jsonParser2 = jsonParser;
                    vc2 = vc;
                }
            }
            vc = vc2;
            strQbewEr = jsonParser.QbewEr();
            jsonParser2 = jsonParser;
            vc2 = vc;
        }
        return map;
    }

    public final Map<Object, Object> _readAndBindStringKeyMap(JsonParser jsonParser, DeserializationContext deserializationContext, Map<Object, Object> map) throws IOException {
        String strKWHzl;
        Object objDeserializeWithType;
        AbstractC5548Vy<Object> abstractC5548Vy = this._valueDeserializer;
        AbstractC5597Xv abstractC5597Xv = this._valueTypeDeserializer;
        boolean z = abstractC5548Vy.getObjectIdReader() != null;
        ActionBar actionBar = z ? new ActionBar(this._containerType.getContentType().getRawClass(), map) : null;
        if (jsonParser.QVAiDq()) {
            strKWHzl = jsonParser.QbewEr();
        } else {
            JsonToken jsonTokenDjBIcL = jsonParser.djBIcL();
            if (jsonTokenDjBIcL == JsonToken.END_OBJECT) {
                return map;
            }
            JsonToken jsonToken = JsonToken.FIELD_NAME;
            if (jsonTokenDjBIcL != jsonToken) {
                deserializationContext.reportWrongTokenException(this, jsonToken, (String) null, new Object[0]);
            }
            strKWHzl = jsonParser.KWHzl();
        }
        while (strKWHzl != null) {
            JsonToken jsonTokenRcXXUw = jsonParser.RcXXUw();
            IgnorePropertiesUtil.Checker checker = this._inclusionChecker;
            if (checker != null && checker.shouldIgnore(strKWHzl)) {
                jsonParser.UeEOUB();
            } else {
                try {
                    if (jsonTokenRcXXUw == JsonToken.VALUE_NULL) {
                        if (!this._skipNullValues) {
                            objDeserializeWithType = this._nullProvider.getNullValue(deserializationContext);
                        }
                    } else if (abstractC5597Xv == null) {
                        objDeserializeWithType = abstractC5548Vy.deserialize(jsonParser, deserializationContext);
                    } else {
                        objDeserializeWithType = abstractC5548Vy.deserializeWithType(jsonParser, deserializationContext, abstractC5597Xv);
                    }
                    Object obj = objDeserializeWithType;
                    if (z) {
                        actionBar.copydefault(strKWHzl, obj);
                    } else {
                        Object objPut = map.put(strKWHzl, obj);
                        if (objPut != null) {
                            _squashDups(deserializationContext, map, strKWHzl, objPut, obj);
                        }
                    }
                } catch (UnresolvedForwardReference e) {
                    handleUnresolvedReference(deserializationContext, actionBar, strKWHzl, e);
                } catch (Exception e2) {
                    wrapAndThrow(deserializationContext, e2, map, strKWHzl);
                }
            }
            strKWHzl = jsonParser.QbewEr();
        }
        return map;
    }

    public Map<Object, Object> _deserializeUsingCreator(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        String strKWHzl;
        Object objDeserializeWithType;
        PropertyBasedCreator propertyBasedCreator = this._propertyBasedCreator;
        C5569Wt c5569WtOLrzqt = propertyBasedCreator.OLrzqt(jsonParser, deserializationContext, null);
        AbstractC5548Vy<Object> abstractC5548Vy = this._valueDeserializer;
        AbstractC5597Xv abstractC5597Xv = this._valueTypeDeserializer;
        if (jsonParser.QVAiDq()) {
            strKWHzl = jsonParser.QbewEr();
        } else {
            strKWHzl = jsonParser.copydefault(JsonToken.FIELD_NAME) ? jsonParser.KWHzl() : null;
        }
        while (strKWHzl != null) {
            JsonToken jsonTokenRcXXUw = jsonParser.RcXXUw();
            IgnorePropertiesUtil.Checker checker = this._inclusionChecker;
            if (checker != null && checker.shouldIgnore(strKWHzl)) {
                jsonParser.UeEOUB();
            } else {
                SettableBeanProperty settableBeanPropertyKWHzl = propertyBasedCreator.KWHzl(strKWHzl);
                if (settableBeanPropertyKWHzl != null) {
                    if (c5569WtOLrzqt.EZpvd(settableBeanPropertyKWHzl, settableBeanPropertyKWHzl.deserialize(jsonParser, deserializationContext))) {
                        jsonParser.RcXXUw();
                        try {
                            return _readAndBind(jsonParser, deserializationContext, (Map) propertyBasedCreator.EZpvd(deserializationContext, c5569WtOLrzqt));
                        } catch (Exception e) {
                            return (Map) wrapAndThrow(deserializationContext, e, this._containerType.getRawClass(), strKWHzl);
                        }
                    }
                } else {
                    Object objDeserializeKey = this._keyDeserializer.deserializeKey(strKWHzl, deserializationContext);
                    try {
                        if (jsonTokenRcXXUw == JsonToken.VALUE_NULL) {
                            if (!this._skipNullValues) {
                                objDeserializeWithType = this._nullProvider.getNullValue(deserializationContext);
                            }
                        } else if (abstractC5597Xv == null) {
                            objDeserializeWithType = abstractC5548Vy.deserialize(jsonParser, deserializationContext);
                        } else {
                            objDeserializeWithType = abstractC5548Vy.deserializeWithType(jsonParser, deserializationContext, abstractC5597Xv);
                        }
                        c5569WtOLrzqt.KWHzl(objDeserializeKey, objDeserializeWithType);
                    } catch (Exception e2) {
                        wrapAndThrow(deserializationContext, e2, this._containerType.getRawClass(), strKWHzl);
                        return null;
                    }
                }
            }
            strKWHzl = jsonParser.QbewEr();
        }
        try {
            return (Map) propertyBasedCreator.EZpvd(deserializationContext, c5569WtOLrzqt);
        } catch (Exception e3) {
            wrapAndThrow(deserializationContext, e3, this._containerType.getRawClass(), strKWHzl);
            return null;
        }
    }

    public final void _readAndUpdate(JsonParser jsonParser, DeserializationContext deserializationContext, Map<Object, Object> map) throws IOException {
        String strKWHzl;
        Object objDeserializeWithType;
        VC vc = this._keyDeserializer;
        AbstractC5548Vy<Object> abstractC5548Vy = this._valueDeserializer;
        AbstractC5597Xv abstractC5597Xv = this._valueTypeDeserializer;
        if (jsonParser.QVAiDq()) {
            strKWHzl = jsonParser.QbewEr();
        } else {
            JsonToken jsonTokenDjBIcL = jsonParser.djBIcL();
            if (jsonTokenDjBIcL == JsonToken.END_OBJECT) {
                return;
            }
            JsonToken jsonToken = JsonToken.FIELD_NAME;
            if (jsonTokenDjBIcL != jsonToken) {
                deserializationContext.reportWrongTokenException(this, jsonToken, (String) null, new Object[0]);
            }
            strKWHzl = jsonParser.KWHzl();
        }
        while (strKWHzl != null) {
            Object objDeserializeKey = vc.deserializeKey(strKWHzl, deserializationContext);
            JsonToken jsonTokenRcXXUw = jsonParser.RcXXUw();
            IgnorePropertiesUtil.Checker checker = this._inclusionChecker;
            if (checker != null && checker.shouldIgnore(strKWHzl)) {
                jsonParser.UeEOUB();
            } else {
                try {
                    if (jsonTokenRcXXUw != JsonToken.VALUE_NULL) {
                        Object obj = map.get(objDeserializeKey);
                        if (obj != null) {
                            if (abstractC5597Xv == null) {
                                objDeserializeWithType = abstractC5548Vy.deserialize(jsonParser, deserializationContext, obj);
                            } else {
                                objDeserializeWithType = abstractC5548Vy.deserializeWithType(jsonParser, deserializationContext, abstractC5597Xv, obj);
                            }
                        } else if (abstractC5597Xv == null) {
                            objDeserializeWithType = abstractC5548Vy.deserialize(jsonParser, deserializationContext);
                        } else {
                            objDeserializeWithType = abstractC5548Vy.deserializeWithType(jsonParser, deserializationContext, abstractC5597Xv);
                        }
                        if (objDeserializeWithType != obj) {
                            map.put(objDeserializeKey, objDeserializeWithType);
                        }
                    } else if (!this._skipNullValues) {
                        map.put(objDeserializeKey, this._nullProvider.getNullValue(deserializationContext));
                    }
                } catch (Exception e) {
                    wrapAndThrow(deserializationContext, e, map, strKWHzl);
                }
            }
            strKWHzl = jsonParser.QbewEr();
        }
    }

    public final void _readAndUpdateStringKeyMap(JsonParser jsonParser, DeserializationContext deserializationContext, Map<Object, Object> map) throws IOException {
        String strKWHzl;
        Object objDeserializeWithType;
        AbstractC5548Vy<Object> abstractC5548Vy = this._valueDeserializer;
        AbstractC5597Xv abstractC5597Xv = this._valueTypeDeserializer;
        if (jsonParser.QVAiDq()) {
            strKWHzl = jsonParser.QbewEr();
        } else {
            JsonToken jsonTokenDjBIcL = jsonParser.djBIcL();
            if (jsonTokenDjBIcL == JsonToken.END_OBJECT) {
                return;
            }
            JsonToken jsonToken = JsonToken.FIELD_NAME;
            if (jsonTokenDjBIcL != jsonToken) {
                deserializationContext.reportWrongTokenException(this, jsonToken, (String) null, new Object[0]);
            }
            strKWHzl = jsonParser.KWHzl();
        }
        while (strKWHzl != null) {
            JsonToken jsonTokenRcXXUw = jsonParser.RcXXUw();
            IgnorePropertiesUtil.Checker checker = this._inclusionChecker;
            if (checker != null && checker.shouldIgnore(strKWHzl)) {
                jsonParser.UeEOUB();
            } else {
                try {
                    if (jsonTokenRcXXUw != JsonToken.VALUE_NULL) {
                        Object obj = map.get(strKWHzl);
                        if (obj != null) {
                            if (abstractC5597Xv == null) {
                                objDeserializeWithType = abstractC5548Vy.deserialize(jsonParser, deserializationContext, obj);
                            } else {
                                objDeserializeWithType = abstractC5548Vy.deserializeWithType(jsonParser, deserializationContext, abstractC5597Xv, obj);
                            }
                        } else if (abstractC5597Xv == null) {
                            objDeserializeWithType = abstractC5548Vy.deserialize(jsonParser, deserializationContext);
                        } else {
                            objDeserializeWithType = abstractC5548Vy.deserializeWithType(jsonParser, deserializationContext, abstractC5597Xv);
                        }
                        if (objDeserializeWithType != obj) {
                            map.put(strKWHzl, objDeserializeWithType);
                        }
                    } else if (!this._skipNullValues) {
                        map.put(strKWHzl, this._nullProvider.getNullValue(deserializationContext));
                    }
                } catch (Exception e) {
                    wrapAndThrow(deserializationContext, e, map, strKWHzl);
                }
            }
            strKWHzl = jsonParser.QbewEr();
        }
    }

    public void _squashDups(DeserializationContext deserializationContext, Map<Object, Object> map, Object obj, Object obj2, Object obj3) {
        if (this._checkDupSquash && deserializationContext.isEnabled(StreamReadCapability.DUPLICATE_PROPERTIES)) {
            if (obj2 instanceof List) {
                ((List) obj2).add(obj3);
                map.put(obj, obj2);
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(obj2);
                arrayList.add(obj3);
                map.put(obj, arrayList);
            }
        }
    }

    private void handleUnresolvedReference(DeserializationContext deserializationContext, ActionBar actionBar, Object obj, UnresolvedForwardReference unresolvedForwardReference) throws JsonMappingException {
        if (actionBar == null) {
            deserializationContext.reportInputMismatch(this, "Unresolved forward reference but no identity info: " + unresolvedForwardReference, new Object[0]);
        }
        unresolvedForwardReference.getRoid().AEQbTJ(actionBar.copydefault(unresolvedForwardReference, obj));
    }

    public static final class ActionBar {
        public List<StateListAnimator> AEQbTJ = new ArrayList();
        public final Class<?> KWHzl;
        public Map<Object, Object> OLrzqt;

        public ActionBar(Class<?> cls, Map<Object, Object> map) {
            this.KWHzl = cls;
            this.OLrzqt = map;
        }

        public void copydefault(Object obj, Object obj2) {
            if (this.AEQbTJ.isEmpty()) {
                this.OLrzqt.put(obj, obj2);
            } else {
                this.AEQbTJ.get(r0.size() - 1).copydefault.put(obj, obj2);
            }
        }

        public C5565Wp.Activity copydefault(UnresolvedForwardReference unresolvedForwardReference, Object obj) {
            StateListAnimator stateListAnimator = new StateListAnimator(this, unresolvedForwardReference, this.KWHzl, obj);
            this.AEQbTJ.add(stateListAnimator);
            return stateListAnimator;
        }

        public void EZpvd(Object obj, Object obj2) throws IOException {
            Iterator<StateListAnimator> it = this.AEQbTJ.iterator();
            Map<Object, Object> map = this.OLrzqt;
            while (it.hasNext()) {
                StateListAnimator next = it.next();
                if (next.EZpvd(obj)) {
                    it.remove();
                    map.put(next.EZpvd, obj2);
                    map.putAll(next.copydefault);
                    return;
                }
                map = next.copydefault;
            }
            throw new IllegalArgumentException("Trying to resolve a forward reference with id [" + obj + "] that wasn't previously seen as unresolved.");
        }
    }

    public static class StateListAnimator extends C5565Wp.Activity {
        public final Object EZpvd;
        public final ActionBar OLrzqt;
        public final Map<Object, Object> copydefault;

        public StateListAnimator(ActionBar actionBar, UnresolvedForwardReference unresolvedForwardReference, Class<?> cls, Object obj) {
            super(unresolvedForwardReference, cls);
            this.copydefault = new LinkedHashMap();
            this.OLrzqt = actionBar;
            this.EZpvd = obj;
        }

        @Override // o.C5565Wp.Activity
        public void copydefault(Object obj, Object obj2) throws IOException {
            this.OLrzqt.EZpvd(obj, obj2);
        }
    }
}
