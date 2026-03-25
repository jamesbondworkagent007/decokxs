package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.cfg.CoercionAction;
import com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer;
import com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReader;
import com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.util.IgnorePropertiesUtil;
import com.fasterxml.jackson.databind.util.NameTransformer;
import java.io.IOException;
import java.util.Map;
import java.util.Set;
import o.AbstractC5548Vy;
import o.AbstractC5549Vz;
import o.C5563Wn;
import o.C5569Wt;
import o.VW;
import o.YA;

/* JADX INFO: loaded from: classes21.dex */
public class BuilderBasedDeserializer extends BeanDeserializerBase {
    private static final long serialVersionUID = 1;
    protected final AnnotatedMethod _buildMethod;
    protected final JavaType _targetType;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase, o.AbstractC5548Vy
    public Boolean supportsUpdate(DeserializationConfig deserializationConfig) {
        return Boolean.FALSE;
    }

    public BuilderBasedDeserializer(VW vw, AbstractC5549Vz abstractC5549Vz, JavaType javaType, BeanPropertyMap beanPropertyMap, Map<String, SettableBeanProperty> map, Set<String> set, boolean z, boolean z2) {
        this(vw, abstractC5549Vz, javaType, beanPropertyMap, map, set, z, null, z2);
    }

    public BuilderBasedDeserializer(VW vw, AbstractC5549Vz abstractC5549Vz, JavaType javaType, BeanPropertyMap beanPropertyMap, Map<String, SettableBeanProperty> map, Set<String> set, boolean z, Set<String> set2, boolean z2) {
        super(vw, abstractC5549Vz, beanPropertyMap, map, set, z, set2, z2);
        this._targetType = javaType;
        this._buildMethod = vw.copydefault();
        if (this._objectIdReader == null) {
            return;
        }
        throw new IllegalArgumentException("Cannot use Object Id with Builder-based deserialization (type " + abstractC5549Vz.getNewProxyInstance() + ")");
    }

    @Deprecated
    public BuilderBasedDeserializer(VW vw, AbstractC5549Vz abstractC5549Vz, BeanPropertyMap beanPropertyMap, Map<String, SettableBeanProperty> map, Set<String> set, boolean z, boolean z2) {
        this(vw, abstractC5549Vz, abstractC5549Vz.getNewProxyInstance(), beanPropertyMap, map, set, z, z2);
    }

    public BuilderBasedDeserializer(BuilderBasedDeserializer builderBasedDeserializer) {
        this(builderBasedDeserializer, builderBasedDeserializer._ignoreAllUnknown);
    }

    public BuilderBasedDeserializer(BuilderBasedDeserializer builderBasedDeserializer, boolean z) {
        super(builderBasedDeserializer, z);
        this._buildMethod = builderBasedDeserializer._buildMethod;
        this._targetType = builderBasedDeserializer._targetType;
    }

    public BuilderBasedDeserializer(BuilderBasedDeserializer builderBasedDeserializer, NameTransformer nameTransformer) {
        super(builderBasedDeserializer, nameTransformer);
        this._buildMethod = builderBasedDeserializer._buildMethod;
        this._targetType = builderBasedDeserializer._targetType;
    }

    public BuilderBasedDeserializer(BuilderBasedDeserializer builderBasedDeserializer, ObjectIdReader objectIdReader) {
        super(builderBasedDeserializer, objectIdReader);
        this._buildMethod = builderBasedDeserializer._buildMethod;
        this._targetType = builderBasedDeserializer._targetType;
    }

    public BuilderBasedDeserializer(BuilderBasedDeserializer builderBasedDeserializer, Set<String> set) {
        this(builderBasedDeserializer, set, builderBasedDeserializer._includableProps);
    }

    public BuilderBasedDeserializer(BuilderBasedDeserializer builderBasedDeserializer, Set<String> set, Set<String> set2) {
        super(builderBasedDeserializer, set, set2);
        this._buildMethod = builderBasedDeserializer._buildMethod;
        this._targetType = builderBasedDeserializer._targetType;
    }

    public BuilderBasedDeserializer(BuilderBasedDeserializer builderBasedDeserializer, BeanPropertyMap beanPropertyMap) {
        super(builderBasedDeserializer, beanPropertyMap);
        this._buildMethod = builderBasedDeserializer._buildMethod;
        this._targetType = builderBasedDeserializer._targetType;
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase, o.AbstractC5548Vy
    public AbstractC5548Vy<Object> unwrappingDeserializer(NameTransformer nameTransformer) {
        return new BuilderBasedDeserializer(this, nameTransformer);
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase
    public BeanDeserializerBase withObjectIdReader(ObjectIdReader objectIdReader) {
        return new BuilderBasedDeserializer(this, objectIdReader);
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase
    public BeanDeserializerBase withByNameInclusion(Set<String> set, Set<String> set2) {
        return new BuilderBasedDeserializer(this, set, set2);
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase
    public BeanDeserializerBase withIgnoreAllUnknown(boolean z) {
        return new BuilderBasedDeserializer(this, z);
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase
    public BeanDeserializerBase withBeanProperties(BeanPropertyMap beanPropertyMap) {
        return new BuilderBasedDeserializer(this, beanPropertyMap);
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase
    public BeanDeserializerBase asArrayDeserializer() {
        return new BeanAsArrayBuilderDeserializer(this, this._targetType, this._beanProperties.getPropertiesInInsertionOrder(), this._buildMethod);
    }

    public Object finishBuild(DeserializationContext deserializationContext, Object obj) throws IOException {
        AnnotatedMethod annotatedMethod = this._buildMethod;
        if (annotatedMethod == null) {
            return obj;
        }
        try {
            return annotatedMethod.getMember().invoke(obj, null);
        } catch (Exception e) {
            return wrapInstantiationProblem(e, deserializationContext);
        }
    }

    @Override // o.AbstractC5548Vy
    public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        if (jsonParser.QVAiDq()) {
            JsonToken jsonTokenRcXXUw = jsonParser.RcXXUw();
            if (this._vanillaProcessing) {
                return finishBuild(deserializationContext, vanillaDeserialize(jsonParser, deserializationContext, jsonTokenRcXXUw));
            }
            return finishBuild(deserializationContext, deserializeFromObject(jsonParser, deserializationContext));
        }
        switch (jsonParser.valueOf()) {
            case 2:
            case 5:
                return finishBuild(deserializationContext, deserializeFromObject(jsonParser, deserializationContext));
            case 3:
                return _deserializeFromArray(jsonParser, deserializationContext);
            case 4:
            case 11:
            default:
                return deserializationContext.handleUnexpectedToken(getValueType(deserializationContext), jsonParser);
            case 6:
                return finishBuild(deserializationContext, deserializeFromString(jsonParser, deserializationContext));
            case 7:
                return finishBuild(deserializationContext, deserializeFromNumber(jsonParser, deserializationContext));
            case 8:
                return finishBuild(deserializationContext, deserializeFromDouble(jsonParser, deserializationContext));
            case 9:
            case 10:
                return finishBuild(deserializationContext, deserializeFromBoolean(jsonParser, deserializationContext));
            case 12:
                return jsonParser.AuCTel();
        }
    }

    @Override // o.AbstractC5548Vy
    public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        JavaType javaType = this._targetType;
        Class<?> clsHandledType = handledType();
        Class<?> cls = obj.getClass();
        if (clsHandledType.isAssignableFrom(cls)) {
            return deserializationContext.reportBadDefinition(javaType, String.format("Deserialization of %s by passing existing Builder (%s) instance not supported", javaType, clsHandledType.getName()));
        }
        return deserializationContext.reportBadDefinition(javaType, String.format("Deserialization of %s by passing existing instance (of %s) not supported", javaType, cls.getName()));
    }

    private final Object vanillaDeserialize(JsonParser jsonParser, DeserializationContext deserializationContext, JsonToken jsonToken) throws IOException {
        Object objCreateUsingDefault = this._valueInstantiator.createUsingDefault(deserializationContext);
        while (jsonParser.djBIcL() == JsonToken.FIELD_NAME) {
            String strKWHzl = jsonParser.KWHzl();
            jsonParser.RcXXUw();
            SettableBeanProperty settableBeanPropertyFind = this._beanProperties.find(strKWHzl);
            if (settableBeanPropertyFind != null) {
                try {
                    objCreateUsingDefault = settableBeanPropertyFind.deserializeSetAndReturn(jsonParser, deserializationContext, objCreateUsingDefault);
                } catch (Exception e) {
                    wrapAndThrow(e, objCreateUsingDefault, strKWHzl, deserializationContext);
                }
            } else {
                handleUnknownVanilla(jsonParser, deserializationContext, objCreateUsingDefault, strKWHzl);
            }
            jsonParser.RcXXUw();
        }
        return objCreateUsingDefault;
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase
    public Object deserializeFromObject(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        Class<?> activeView;
        if (this._nonStandardCreation) {
            if (this._unwrappedPropertyHandler != null) {
                return deserializeWithUnwrapped(jsonParser, deserializationContext);
            }
            if (this._externalTypeIdHandler != null) {
                return deserializeWithExternalTypeId(jsonParser, deserializationContext);
            }
            return deserializeFromObjectUsingNonDefault(jsonParser, deserializationContext);
        }
        Object objCreateUsingDefault = this._valueInstantiator.createUsingDefault(deserializationContext);
        if (this._injectables != null) {
            injectValues(deserializationContext, objCreateUsingDefault);
        }
        if (this._needViewProcesing && (activeView = deserializationContext.getActiveView()) != null) {
            return deserializeWithView(jsonParser, deserializationContext, objCreateUsingDefault, activeView);
        }
        while (jsonParser.djBIcL() == JsonToken.FIELD_NAME) {
            String strKWHzl = jsonParser.KWHzl();
            jsonParser.RcXXUw();
            SettableBeanProperty settableBeanPropertyFind = this._beanProperties.find(strKWHzl);
            if (settableBeanPropertyFind != null) {
                try {
                    objCreateUsingDefault = settableBeanPropertyFind.deserializeSetAndReturn(jsonParser, deserializationContext, objCreateUsingDefault);
                } catch (Exception e) {
                    wrapAndThrow(e, objCreateUsingDefault, strKWHzl, deserializationContext);
                }
            } else {
                handleUnknownVanilla(jsonParser, deserializationContext, objCreateUsingDefault, strKWHzl);
            }
            jsonParser.RcXXUw();
        }
        return objCreateUsingDefault;
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase
    public Object _deserializeUsingPropertyBased(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        Object objWrapInstantiationProblem;
        PropertyBasedCreator propertyBasedCreator = this._propertyBasedCreator;
        C5569Wt c5569WtOLrzqt = propertyBasedCreator.OLrzqt(jsonParser, deserializationContext, this._objectIdReader);
        Class<?> activeView = this._needViewProcesing ? deserializationContext.getActiveView() : null;
        JsonToken jsonTokenDjBIcL = jsonParser.djBIcL();
        YA yaBufferForInputBuffering = null;
        while (jsonTokenDjBIcL == JsonToken.FIELD_NAME) {
            String strKWHzl = jsonParser.KWHzl();
            jsonParser.RcXXUw();
            SettableBeanProperty settableBeanPropertyKWHzl = propertyBasedCreator.KWHzl(strKWHzl);
            if (!c5569WtOLrzqt.AEQbTJ(strKWHzl) || settableBeanPropertyKWHzl != null) {
                if (settableBeanPropertyKWHzl != null) {
                    if (activeView != null && !settableBeanPropertyKWHzl.visibleInView(activeView)) {
                        jsonParser.UeEOUB();
                    } else if (c5569WtOLrzqt.EZpvd(settableBeanPropertyKWHzl, settableBeanPropertyKWHzl.deserialize(jsonParser, deserializationContext))) {
                        jsonParser.RcXXUw();
                        try {
                            Object objEZpvd = propertyBasedCreator.EZpvd(deserializationContext, c5569WtOLrzqt);
                            if (objEZpvd.getClass() != this._beanType.getRawClass()) {
                                return handlePolymorphic(jsonParser, deserializationContext, objEZpvd, yaBufferForInputBuffering);
                            }
                            if (yaBufferForInputBuffering != null) {
                                objEZpvd = handleUnknownProperties(deserializationContext, objEZpvd, yaBufferForInputBuffering);
                            }
                            return _deserialize(jsonParser, deserializationContext, objEZpvd);
                        } catch (Exception e) {
                            wrapAndThrow(e, this._beanType.getRawClass(), strKWHzl, deserializationContext);
                        }
                    } else {
                        continue;
                    }
                } else {
                    SettableBeanProperty settableBeanPropertyFind = this._beanProperties.find(strKWHzl);
                    if (settableBeanPropertyFind != null) {
                        c5569WtOLrzqt.OLrzqt(settableBeanPropertyFind, settableBeanPropertyFind.deserialize(jsonParser, deserializationContext));
                    } else if (IgnorePropertiesUtil.KWHzl(strKWHzl, this._ignorableProps, this._includableProps)) {
                        handleIgnoredProperty(jsonParser, deserializationContext, handledType(), strKWHzl);
                    } else {
                        SettableAnyProperty settableAnyProperty = this._anySetter;
                        if (settableAnyProperty != null) {
                            c5569WtOLrzqt.AEQbTJ(settableAnyProperty, strKWHzl, settableAnyProperty.deserialize(jsonParser, deserializationContext));
                        } else {
                            if (yaBufferForInputBuffering == null) {
                                yaBufferForInputBuffering = deserializationContext.bufferForInputBuffering(jsonParser);
                            }
                            yaBufferForInputBuffering.KWHzl(strKWHzl);
                            yaBufferForInputBuffering.EZpvd(jsonParser);
                        }
                    }
                }
            }
            jsonTokenDjBIcL = jsonParser.RcXXUw();
        }
        try {
            objWrapInstantiationProblem = propertyBasedCreator.EZpvd(deserializationContext, c5569WtOLrzqt);
        } catch (Exception e2) {
            objWrapInstantiationProblem = wrapInstantiationProblem(e2, deserializationContext);
        }
        if (yaBufferForInputBuffering == null) {
            return objWrapInstantiationProblem;
        }
        if (objWrapInstantiationProblem.getClass() != this._beanType.getRawClass()) {
            return handlePolymorphic(null, deserializationContext, objWrapInstantiationProblem, yaBufferForInputBuffering);
        }
        return handleUnknownProperties(deserializationContext, objWrapInstantiationProblem, yaBufferForInputBuffering);
    }

    public final Object _deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        Class<?> activeView;
        if (this._injectables != null) {
            injectValues(deserializationContext, obj);
        }
        if (this._unwrappedPropertyHandler != null) {
            if (jsonParser.copydefault(JsonToken.START_OBJECT)) {
                jsonParser.RcXXUw();
            }
            YA yaBufferForInputBuffering = deserializationContext.bufferForInputBuffering(jsonParser);
            yaBufferForInputBuffering.AkhnZx();
            return deserializeWithUnwrapped(jsonParser, deserializationContext, obj, yaBufferForInputBuffering);
        }
        if (this._externalTypeIdHandler != null) {
            return deserializeWithExternalTypeId(jsonParser, deserializationContext, obj);
        }
        if (this._needViewProcesing && (activeView = deserializationContext.getActiveView()) != null) {
            return deserializeWithView(jsonParser, deserializationContext, obj, activeView);
        }
        JsonToken jsonTokenDjBIcL = jsonParser.djBIcL();
        if (jsonTokenDjBIcL == JsonToken.START_OBJECT) {
            jsonTokenDjBIcL = jsonParser.RcXXUw();
        }
        while (jsonTokenDjBIcL == JsonToken.FIELD_NAME) {
            String strKWHzl = jsonParser.KWHzl();
            jsonParser.RcXXUw();
            SettableBeanProperty settableBeanPropertyFind = this._beanProperties.find(strKWHzl);
            if (settableBeanPropertyFind != null) {
                try {
                    obj = settableBeanPropertyFind.deserializeSetAndReturn(jsonParser, deserializationContext, obj);
                } catch (Exception e) {
                    wrapAndThrow(e, obj, strKWHzl, deserializationContext);
                }
            } else {
                handleUnknownVanilla(jsonParser, deserializationContext, obj, strKWHzl);
            }
            jsonTokenDjBIcL = jsonParser.RcXXUw();
        }
        return obj;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer
    public Object _deserializeFromArray(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        AbstractC5548Vy<Object> abstractC5548Vy = this._arrayDelegateDeserializer;
        if (abstractC5548Vy != null || (abstractC5548Vy = this._delegateDeserializer) != null) {
            Object objCreateUsingArrayDelegate = this._valueInstantiator.createUsingArrayDelegate(deserializationContext, abstractC5548Vy.deserialize(jsonParser, deserializationContext));
            if (this._injectables != null) {
                injectValues(deserializationContext, objCreateUsingArrayDelegate);
            }
            return finishBuild(deserializationContext, objCreateUsingArrayDelegate);
        }
        CoercionAction coercionAction_findCoercionFromEmptyArray = _findCoercionFromEmptyArray(deserializationContext);
        boolean zIsEnabled = deserializationContext.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS);
        if (zIsEnabled || coercionAction_findCoercionFromEmptyArray != CoercionAction.Fail) {
            JsonToken jsonTokenRcXXUw = jsonParser.RcXXUw();
            JsonToken jsonToken = JsonToken.END_ARRAY;
            if (jsonTokenRcXXUw == jsonToken) {
                int i = AnonymousClass4.KWHzl[coercionAction_findCoercionFromEmptyArray.ordinal()];
                if (i == 1) {
                    return getEmptyValue(deserializationContext);
                }
                if (i == 2 || i == 3) {
                    return getNullValue(deserializationContext);
                }
                return deserializationContext.handleUnexpectedToken(getValueType(deserializationContext), JsonToken.START_ARRAY, jsonParser, (String) null, new Object[0]);
            }
            if (zIsEnabled) {
                Object objDeserialize = deserialize(jsonParser, deserializationContext);
                if (jsonParser.RcXXUw() != jsonToken) {
                    handleMissingEndArrayForSingle(jsonParser, deserializationContext);
                }
                return objDeserialize;
            }
        }
        return deserializationContext.handleUnexpectedToken(getValueType(deserializationContext), jsonParser);
    }

    /* JADX INFO: renamed from: com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer$4, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass4 {
        public static final /* synthetic */ int[] KWHzl;

        static {
            int[] iArr = new int[CoercionAction.values().length];
            KWHzl = iArr;
            try {
                iArr[CoercionAction.AsEmpty.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                KWHzl[CoercionAction.AsNull.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                KWHzl[CoercionAction.TryConvert.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public final Object deserializeWithView(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj, Class<?> cls) throws IOException {
        JsonToken jsonTokenDjBIcL = jsonParser.djBIcL();
        while (jsonTokenDjBIcL == JsonToken.FIELD_NAME) {
            String strKWHzl = jsonParser.KWHzl();
            jsonParser.RcXXUw();
            SettableBeanProperty settableBeanPropertyFind = this._beanProperties.find(strKWHzl);
            if (settableBeanPropertyFind != null) {
                if (!settableBeanPropertyFind.visibleInView(cls)) {
                    jsonParser.UeEOUB();
                } else {
                    try {
                        obj = settableBeanPropertyFind.deserializeSetAndReturn(jsonParser, deserializationContext, obj);
                    } catch (Exception e) {
                        wrapAndThrow(e, obj, strKWHzl, deserializationContext);
                    }
                }
            } else {
                handleUnknownVanilla(jsonParser, deserializationContext, obj, strKWHzl);
            }
            jsonTokenDjBIcL = jsonParser.RcXXUw();
        }
        return obj;
    }

    public Object deserializeWithUnwrapped(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        AbstractC5548Vy<Object> abstractC5548Vy = this._delegateDeserializer;
        if (abstractC5548Vy != null) {
            return this._valueInstantiator.createUsingDelegate(deserializationContext, abstractC5548Vy.deserialize(jsonParser, deserializationContext));
        }
        if (this._propertyBasedCreator != null) {
            return deserializeUsingPropertyBasedWithUnwrapped(jsonParser, deserializationContext);
        }
        YA yaBufferForInputBuffering = deserializationContext.bufferForInputBuffering(jsonParser);
        yaBufferForInputBuffering.AkhnZx();
        Object objCreateUsingDefault = this._valueInstantiator.createUsingDefault(deserializationContext);
        if (this._injectables != null) {
            injectValues(deserializationContext, objCreateUsingDefault);
        }
        Class<?> activeView = this._needViewProcesing ? deserializationContext.getActiveView() : null;
        while (jsonParser.djBIcL() == JsonToken.FIELD_NAME) {
            String strKWHzl = jsonParser.KWHzl();
            jsonParser.RcXXUw();
            SettableBeanProperty settableBeanPropertyFind = this._beanProperties.find(strKWHzl);
            if (settableBeanPropertyFind != null) {
                if (activeView != null && !settableBeanPropertyFind.visibleInView(activeView)) {
                    jsonParser.UeEOUB();
                } else {
                    try {
                        objCreateUsingDefault = settableBeanPropertyFind.deserializeSetAndReturn(jsonParser, deserializationContext, objCreateUsingDefault);
                    } catch (Exception e) {
                        wrapAndThrow(e, objCreateUsingDefault, strKWHzl, deserializationContext);
                    }
                }
            } else if (IgnorePropertiesUtil.KWHzl(strKWHzl, this._ignorableProps, this._includableProps)) {
                handleIgnoredProperty(jsonParser, deserializationContext, objCreateUsingDefault, strKWHzl);
            } else {
                yaBufferForInputBuffering.KWHzl(strKWHzl);
                yaBufferForInputBuffering.EZpvd(jsonParser);
                SettableAnyProperty settableAnyProperty = this._anySetter;
                if (settableAnyProperty != null) {
                    try {
                        settableAnyProperty.deserializeAndSet(jsonParser, deserializationContext, objCreateUsingDefault, strKWHzl);
                    } catch (Exception e2) {
                        wrapAndThrow(e2, objCreateUsingDefault, strKWHzl, deserializationContext);
                    }
                }
            }
            jsonParser.RcXXUw();
        }
        yaBufferForInputBuffering.DbNXlk();
        return this._unwrappedPropertyHandler.KWHzl(jsonParser, deserializationContext, objCreateUsingDefault, yaBufferForInputBuffering);
    }

    public Object deserializeUsingPropertyBasedWithUnwrapped(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        PropertyBasedCreator propertyBasedCreator = this._propertyBasedCreator;
        C5569Wt c5569WtOLrzqt = propertyBasedCreator.OLrzqt(jsonParser, deserializationContext, this._objectIdReader);
        YA yaBufferForInputBuffering = deserializationContext.bufferForInputBuffering(jsonParser);
        yaBufferForInputBuffering.AkhnZx();
        JsonToken jsonTokenDjBIcL = jsonParser.djBIcL();
        while (jsonTokenDjBIcL == JsonToken.FIELD_NAME) {
            String strKWHzl = jsonParser.KWHzl();
            jsonParser.RcXXUw();
            SettableBeanProperty settableBeanPropertyKWHzl = propertyBasedCreator.KWHzl(strKWHzl);
            if (!c5569WtOLrzqt.AEQbTJ(strKWHzl) || settableBeanPropertyKWHzl != null) {
                if (settableBeanPropertyKWHzl != null) {
                    if (c5569WtOLrzqt.EZpvd(settableBeanPropertyKWHzl, settableBeanPropertyKWHzl.deserialize(jsonParser, deserializationContext))) {
                        jsonParser.RcXXUw();
                        try {
                            Object objEZpvd = propertyBasedCreator.EZpvd(deserializationContext, c5569WtOLrzqt);
                            if (objEZpvd.getClass() != this._beanType.getRawClass()) {
                                return handlePolymorphic(jsonParser, deserializationContext, objEZpvd, yaBufferForInputBuffering);
                            }
                            return deserializeWithUnwrapped(jsonParser, deserializationContext, objEZpvd, yaBufferForInputBuffering);
                        } catch (Exception e) {
                            wrapAndThrow(e, this._beanType.getRawClass(), strKWHzl, deserializationContext);
                        }
                    } else {
                        continue;
                    }
                } else {
                    SettableBeanProperty settableBeanPropertyFind = this._beanProperties.find(strKWHzl);
                    if (settableBeanPropertyFind != null) {
                        c5569WtOLrzqt.OLrzqt(settableBeanPropertyFind, settableBeanPropertyFind.deserialize(jsonParser, deserializationContext));
                    } else if (IgnorePropertiesUtil.KWHzl(strKWHzl, this._ignorableProps, this._includableProps)) {
                        handleIgnoredProperty(jsonParser, deserializationContext, handledType(), strKWHzl);
                    } else {
                        yaBufferForInputBuffering.KWHzl(strKWHzl);
                        yaBufferForInputBuffering.EZpvd(jsonParser);
                        SettableAnyProperty settableAnyProperty = this._anySetter;
                        if (settableAnyProperty != null) {
                            c5569WtOLrzqt.AEQbTJ(settableAnyProperty, strKWHzl, settableAnyProperty.deserialize(jsonParser, deserializationContext));
                        }
                    }
                }
            }
            jsonTokenDjBIcL = jsonParser.RcXXUw();
        }
        yaBufferForInputBuffering.DbNXlk();
        try {
            return this._unwrappedPropertyHandler.KWHzl(jsonParser, deserializationContext, propertyBasedCreator.EZpvd(deserializationContext, c5569WtOLrzqt), yaBufferForInputBuffering);
        } catch (Exception e2) {
            return wrapInstantiationProblem(e2, deserializationContext);
        }
    }

    public Object deserializeWithUnwrapped(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj, YA ya) throws IOException {
        Class<?> activeView = this._needViewProcesing ? deserializationContext.getActiveView() : null;
        JsonToken jsonTokenDjBIcL = jsonParser.djBIcL();
        while (jsonTokenDjBIcL == JsonToken.FIELD_NAME) {
            String strKWHzl = jsonParser.KWHzl();
            SettableBeanProperty settableBeanPropertyFind = this._beanProperties.find(strKWHzl);
            jsonParser.RcXXUw();
            if (settableBeanPropertyFind != null) {
                if (activeView != null && !settableBeanPropertyFind.visibleInView(activeView)) {
                    jsonParser.UeEOUB();
                } else {
                    try {
                        obj = settableBeanPropertyFind.deserializeSetAndReturn(jsonParser, deserializationContext, obj);
                    } catch (Exception e) {
                        wrapAndThrow(e, obj, strKWHzl, deserializationContext);
                    }
                }
            } else if (IgnorePropertiesUtil.KWHzl(strKWHzl, this._ignorableProps, this._includableProps)) {
                handleIgnoredProperty(jsonParser, deserializationContext, obj, strKWHzl);
            } else {
                ya.KWHzl(strKWHzl);
                ya.EZpvd(jsonParser);
                SettableAnyProperty settableAnyProperty = this._anySetter;
                if (settableAnyProperty != null) {
                    settableAnyProperty.deserializeAndSet(jsonParser, deserializationContext, obj, strKWHzl);
                }
            }
            jsonTokenDjBIcL = jsonParser.RcXXUw();
        }
        ya.DbNXlk();
        return this._unwrappedPropertyHandler.KWHzl(jsonParser, deserializationContext, obj, ya);
    }

    public Object deserializeWithExternalTypeId(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        if (this._propertyBasedCreator != null) {
            return deserializeUsingPropertyBasedWithExternalTypeId(jsonParser, deserializationContext);
        }
        return deserializeWithExternalTypeId(jsonParser, deserializationContext, this._valueInstantiator.createUsingDefault(deserializationContext));
    }

    public Object deserializeWithExternalTypeId(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        Class<?> activeView = this._needViewProcesing ? deserializationContext.getActiveView() : null;
        C5563Wn c5563WnAEQbTJ = this._externalTypeIdHandler.AEQbTJ();
        JsonToken jsonTokenDjBIcL = jsonParser.djBIcL();
        while (jsonTokenDjBIcL == JsonToken.FIELD_NAME) {
            String strKWHzl = jsonParser.KWHzl();
            JsonToken jsonTokenRcXXUw = jsonParser.RcXXUw();
            SettableBeanProperty settableBeanPropertyFind = this._beanProperties.find(strKWHzl);
            if (settableBeanPropertyFind != null) {
                if (jsonTokenRcXXUw.isScalarValue()) {
                    c5563WnAEQbTJ.AEQbTJ(jsonParser, deserializationContext, strKWHzl, obj);
                }
                if (activeView != null && !settableBeanPropertyFind.visibleInView(activeView)) {
                    jsonParser.UeEOUB();
                } else {
                    try {
                        obj = settableBeanPropertyFind.deserializeSetAndReturn(jsonParser, deserializationContext, obj);
                    } catch (Exception e) {
                        wrapAndThrow(e, obj, strKWHzl, deserializationContext);
                    }
                }
            } else if (IgnorePropertiesUtil.KWHzl(strKWHzl, this._ignorableProps, this._includableProps)) {
                handleIgnoredProperty(jsonParser, deserializationContext, obj, strKWHzl);
            } else if (!c5563WnAEQbTJ.EZpvd(jsonParser, deserializationContext, strKWHzl, obj)) {
                SettableAnyProperty settableAnyProperty = this._anySetter;
                if (settableAnyProperty != null) {
                    try {
                        settableAnyProperty.deserializeAndSet(jsonParser, deserializationContext, obj, strKWHzl);
                    } catch (Exception e2) {
                        wrapAndThrow(e2, obj, strKWHzl, deserializationContext);
                    }
                } else {
                    handleUnknownProperty(jsonParser, deserializationContext, obj, strKWHzl);
                }
            }
            jsonTokenDjBIcL = jsonParser.RcXXUw();
        }
        return c5563WnAEQbTJ.EZpvd(jsonParser, deserializationContext, obj);
    }

    public Object deserializeUsingPropertyBasedWithExternalTypeId(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        JavaType javaType = this._targetType;
        return deserializationContext.reportBadDefinition(javaType, String.format("Deserialization (of %s) with Builder, External type id, @JsonCreator not yet implemented", javaType));
    }
}
