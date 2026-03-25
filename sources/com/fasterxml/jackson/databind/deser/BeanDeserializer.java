package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.cfg.CoercionAction;
import com.fasterxml.jackson.databind.deser.impl.BeanAsArrayDeserializer;
import com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReader;
import com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator;
import com.fasterxml.jackson.databind.util.IgnorePropertiesUtil;
import com.fasterxml.jackson.databind.util.NameTransformer;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import o.AbstractC5548Vy;
import o.AbstractC5549Vz;
import o.C5563Wn;
import o.C5565Wp;
import o.C5569Wt;
import o.C5619Yr;
import o.VW;
import o.YA;

/* JADX INFO: loaded from: classes21.dex */
public class BeanDeserializer extends BeanDeserializerBase implements Serializable {
    private static final long serialVersionUID = 1;
    private volatile transient NameTransformer _currentlyTransforming;
    protected transient Exception _nullFromCreator;

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase
    public /* bridge */ /* synthetic */ BeanDeserializerBase withByNameInclusion(Set set, Set set2) {
        return withByNameInclusion((Set<String>) set, (Set<String>) set2);
    }

    @Deprecated
    public BeanDeserializer(VW vw, AbstractC5549Vz abstractC5549Vz, BeanPropertyMap beanPropertyMap, Map<String, SettableBeanProperty> map, HashSet<String> hashSet, boolean z, boolean z2) {
        super(vw, abstractC5549Vz, beanPropertyMap, map, hashSet, z, null, z2);
    }

    public BeanDeserializer(VW vw, AbstractC5549Vz abstractC5549Vz, BeanPropertyMap beanPropertyMap, Map<String, SettableBeanProperty> map, HashSet<String> hashSet, boolean z, Set<String> set, boolean z2) {
        super(vw, abstractC5549Vz, beanPropertyMap, map, hashSet, z, set, z2);
    }

    public BeanDeserializer(BeanDeserializerBase beanDeserializerBase) {
        super(beanDeserializerBase, beanDeserializerBase._ignoreAllUnknown);
    }

    public BeanDeserializer(BeanDeserializerBase beanDeserializerBase, boolean z) {
        super(beanDeserializerBase, z);
    }

    public BeanDeserializer(BeanDeserializerBase beanDeserializerBase, NameTransformer nameTransformer) {
        super(beanDeserializerBase, nameTransformer);
    }

    public BeanDeserializer(BeanDeserializerBase beanDeserializerBase, ObjectIdReader objectIdReader) {
        super(beanDeserializerBase, objectIdReader);
    }

    @Deprecated
    public BeanDeserializer(BeanDeserializerBase beanDeserializerBase, Set<String> set) {
        super(beanDeserializerBase, set);
    }

    public BeanDeserializer(BeanDeserializerBase beanDeserializerBase, Set<String> set, Set<String> set2) {
        super(beanDeserializerBase, set, set2);
    }

    public BeanDeserializer(BeanDeserializerBase beanDeserializerBase, BeanPropertyMap beanPropertyMap) {
        super(beanDeserializerBase, beanPropertyMap);
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase, o.AbstractC5548Vy
    public AbstractC5548Vy<Object> unwrappingDeserializer(NameTransformer nameTransformer) {
        if (getClass() != BeanDeserializer.class || this._currentlyTransforming == nameTransformer) {
            return this;
        }
        this._currentlyTransforming = nameTransformer;
        try {
            return new BeanDeserializer(this, nameTransformer);
        } finally {
            this._currentlyTransforming = null;
        }
    }

    /* JADX DEBUG: Method merged with bridge method: withObjectIdReader(Lcom/fasterxml/jackson/databind/deser/impl/ObjectIdReader;)Lcom/fasterxml/jackson/databind/deser/BeanDeserializerBase; */
    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase
    public BeanDeserializer withObjectIdReader(ObjectIdReader objectIdReader) {
        return new BeanDeserializer(this, objectIdReader);
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase
    public BeanDeserializer withByNameInclusion(Set<String> set, Set<String> set2) {
        return new BeanDeserializer(this, set, set2);
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase
    public BeanDeserializerBase withIgnoreAllUnknown(boolean z) {
        return new BeanDeserializer(this, z);
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase
    public BeanDeserializerBase withBeanProperties(BeanPropertyMap beanPropertyMap) {
        return new BeanDeserializer(this, beanPropertyMap);
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase
    public BeanDeserializerBase asArrayDeserializer() {
        return new BeanAsArrayDeserializer(this, this._beanProperties.getPropertiesInInsertionOrder());
    }

    @Override // o.AbstractC5548Vy
    public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        if (!jsonParser.QVAiDq()) {
            return _deserializeOther(jsonParser, deserializationContext, jsonParser.djBIcL());
        }
        if (this._vanillaProcessing) {
            return vanillaDeserialize(jsonParser, deserializationContext, jsonParser.RcXXUw());
        }
        jsonParser.RcXXUw();
        if (this._objectIdReader != null) {
            return deserializeWithObjectId(jsonParser, deserializationContext);
        }
        return deserializeFromObject(jsonParser, deserializationContext);
    }

    public final Object _deserializeOther(JsonParser jsonParser, DeserializationContext deserializationContext, JsonToken jsonToken) throws IOException {
        if (jsonToken != null) {
            switch (AnonymousClass3.OLrzqt[jsonToken.ordinal()]) {
                case 1:
                    return deserializeFromString(jsonParser, deserializationContext);
                case 2:
                    return deserializeFromNumber(jsonParser, deserializationContext);
                case 3:
                    return deserializeFromDouble(jsonParser, deserializationContext);
                case 4:
                    return deserializeFromEmbedded(jsonParser, deserializationContext);
                case 5:
                case 6:
                    return deserializeFromBoolean(jsonParser, deserializationContext);
                case 7:
                    return deserializeFromNull(jsonParser, deserializationContext);
                case 8:
                    return _deserializeFromArray(jsonParser, deserializationContext);
                case 9:
                case 10:
                    if (this._vanillaProcessing) {
                        return vanillaDeserialize(jsonParser, deserializationContext, jsonToken);
                    }
                    if (this._objectIdReader != null) {
                        return deserializeWithObjectId(jsonParser, deserializationContext);
                    }
                    return deserializeFromObject(jsonParser, deserializationContext);
            }
        }
        return deserializationContext.handleUnexpectedToken(getValueType(deserializationContext), jsonParser);
    }

    @Deprecated
    public Object _missingToken(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        throw deserializationContext.endOfInputException(handledType());
    }

    @Override // o.AbstractC5548Vy
    public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        String strKWHzl;
        Class<?> activeView;
        jsonParser.KWHzl(obj);
        if (this._injectables != null) {
            injectValues(deserializationContext, obj);
        }
        if (this._unwrappedPropertyHandler != null) {
            return deserializeWithUnwrapped(jsonParser, deserializationContext, obj);
        }
        if (this._externalTypeIdHandler != null) {
            return deserializeWithExternalTypeId(jsonParser, deserializationContext, obj);
        }
        if (jsonParser.QVAiDq()) {
            strKWHzl = jsonParser.QbewEr();
            if (strKWHzl == null) {
                return obj;
            }
        } else {
            if (jsonParser.OLrzqt(5)) {
                strKWHzl = jsonParser.KWHzl();
            }
            return obj;
        }
        if (this._needViewProcesing && (activeView = deserializationContext.getActiveView()) != null) {
            return deserializeWithView(jsonParser, deserializationContext, obj, activeView);
        }
        do {
            jsonParser.RcXXUw();
            SettableBeanProperty settableBeanPropertyFind = this._beanProperties.find(strKWHzl);
            if (settableBeanPropertyFind != null) {
                try {
                    settableBeanPropertyFind.deserializeAndSet(jsonParser, deserializationContext, obj);
                } catch (Exception e) {
                    wrapAndThrow(e, obj, strKWHzl, deserializationContext);
                }
            } else {
                handleUnknownVanilla(jsonParser, deserializationContext, obj, strKWHzl);
            }
            strKWHzl = jsonParser.QbewEr();
        } while (strKWHzl != null);
        return obj;
    }

    private final Object vanillaDeserialize(JsonParser jsonParser, DeserializationContext deserializationContext, JsonToken jsonToken) throws IOException {
        Object objCreateUsingDefault = this._valueInstantiator.createUsingDefault(deserializationContext);
        jsonParser.KWHzl(objCreateUsingDefault);
        if (jsonParser.OLrzqt(5)) {
            String strKWHzl = jsonParser.KWHzl();
            do {
                jsonParser.RcXXUw();
                SettableBeanProperty settableBeanPropertyFind = this._beanProperties.find(strKWHzl);
                if (settableBeanPropertyFind != null) {
                    try {
                        settableBeanPropertyFind.deserializeAndSet(jsonParser, deserializationContext, objCreateUsingDefault);
                    } catch (Exception e) {
                        wrapAndThrow(e, objCreateUsingDefault, strKWHzl, deserializationContext);
                    }
                } else {
                    handleUnknownVanilla(jsonParser, deserializationContext, objCreateUsingDefault, strKWHzl);
                }
                strKWHzl = jsonParser.QbewEr();
            } while (strKWHzl != null);
        }
        return objCreateUsingDefault;
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase
    public Object deserializeFromObject(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        Class<?> activeView;
        Object objAuCTelauCTel;
        ObjectIdReader objectIdReader = this._objectIdReader;
        if (objectIdReader != null && objectIdReader.maySerializeAsObject() && jsonParser.OLrzqt(5) && this._objectIdReader.isValidReferencePropertyName(jsonParser.KWHzl(), jsonParser)) {
            return deserializeFromObjectId(jsonParser, deserializationContext);
        }
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
        jsonParser.KWHzl(objCreateUsingDefault);
        if (jsonParser.EZpvd() && (objAuCTelauCTel = jsonParser.AuCTelauCTel()) != null) {
            _handleTypedObjectId(jsonParser, deserializationContext, objCreateUsingDefault, objAuCTelauCTel);
        }
        if (this._injectables != null) {
            injectValues(deserializationContext, objCreateUsingDefault);
        }
        if (this._needViewProcesing && (activeView = deserializationContext.getActiveView()) != null) {
            return deserializeWithView(jsonParser, deserializationContext, objCreateUsingDefault, activeView);
        }
        if (jsonParser.OLrzqt(5)) {
            String strKWHzl = jsonParser.KWHzl();
            do {
                jsonParser.RcXXUw();
                SettableBeanProperty settableBeanPropertyFind = this._beanProperties.find(strKWHzl);
                if (settableBeanPropertyFind != null) {
                    try {
                        settableBeanPropertyFind.deserializeAndSet(jsonParser, deserializationContext, objCreateUsingDefault);
                    } catch (Exception e) {
                        wrapAndThrow(e, objCreateUsingDefault, strKWHzl, deserializationContext);
                    }
                } else {
                    handleUnknownVanilla(jsonParser, deserializationContext, objCreateUsingDefault, strKWHzl);
                }
                strKWHzl = jsonParser.QbewEr();
            } while (strKWHzl != null);
        }
        return objCreateUsingDefault;
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase
    public Object _deserializeUsingPropertyBased(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        Object objEZpvd;
        Object objWrapInstantiationProblem;
        PropertyBasedCreator propertyBasedCreator = this._propertyBasedCreator;
        C5569Wt c5569WtOLrzqt = propertyBasedCreator.OLrzqt(jsonParser, deserializationContext, this._objectIdReader);
        Class<?> activeView = this._needViewProcesing ? deserializationContext.getActiveView() : null;
        JsonToken jsonTokenDjBIcL = jsonParser.djBIcL();
        YA yaBufferForInputBuffering = null;
        ArrayList arrayList = null;
        while (jsonTokenDjBIcL == JsonToken.FIELD_NAME) {
            String strKWHzl = jsonParser.KWHzl();
            jsonParser.RcXXUw();
            SettableBeanProperty settableBeanPropertyKWHzl = propertyBasedCreator.KWHzl(strKWHzl);
            if (!c5569WtOLrzqt.AEQbTJ(strKWHzl) || settableBeanPropertyKWHzl != null) {
                if (settableBeanPropertyKWHzl != null) {
                    if (activeView != null && !settableBeanPropertyKWHzl.visibleInView(activeView)) {
                        jsonParser.UeEOUB();
                    } else if (c5569WtOLrzqt.EZpvd(settableBeanPropertyKWHzl, _deserializeWithErrorWrapping(jsonParser, deserializationContext, settableBeanPropertyKWHzl))) {
                        jsonParser.RcXXUw();
                        try {
                            objWrapInstantiationProblem = propertyBasedCreator.EZpvd(deserializationContext, c5569WtOLrzqt);
                        } catch (Exception e) {
                            objWrapInstantiationProblem = wrapInstantiationProblem(e, deserializationContext);
                        }
                        if (objWrapInstantiationProblem == null) {
                            return deserializationContext.handleInstantiationProblem(handledType(), null, _creatorReturnedNullException());
                        }
                        jsonParser.KWHzl(objWrapInstantiationProblem);
                        if (objWrapInstantiationProblem.getClass() != this._beanType.getRawClass()) {
                            return handlePolymorphic(jsonParser, deserializationContext, objWrapInstantiationProblem, yaBufferForInputBuffering);
                        }
                        if (yaBufferForInputBuffering != null) {
                            objWrapInstantiationProblem = handleUnknownProperties(deserializationContext, objWrapInstantiationProblem, yaBufferForInputBuffering);
                        }
                        return deserialize(jsonParser, deserializationContext, objWrapInstantiationProblem);
                    }
                } else {
                    SettableBeanProperty settableBeanPropertyFind = this._beanProperties.find(strKWHzl);
                    if (settableBeanPropertyFind != null) {
                        try {
                            c5569WtOLrzqt.OLrzqt(settableBeanPropertyFind, _deserializeWithErrorWrapping(jsonParser, deserializationContext, settableBeanPropertyFind));
                        } catch (UnresolvedForwardReference e2) {
                            ActionBar actionBarHandleUnresolvedReference = handleUnresolvedReference(deserializationContext, settableBeanPropertyFind, c5569WtOLrzqt, e2);
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(actionBarHandleUnresolvedReference);
                        }
                    } else if (IgnorePropertiesUtil.KWHzl(strKWHzl, this._ignorableProps, this._includableProps)) {
                        handleIgnoredProperty(jsonParser, deserializationContext, handledType(), strKWHzl);
                    } else {
                        SettableAnyProperty settableAnyProperty = this._anySetter;
                        if (settableAnyProperty != null) {
                            try {
                                c5569WtOLrzqt.AEQbTJ(settableAnyProperty, strKWHzl, settableAnyProperty.deserialize(jsonParser, deserializationContext));
                            } catch (Exception e3) {
                                wrapAndThrow(e3, this._beanType.getRawClass(), strKWHzl, deserializationContext);
                            }
                        } else if (this._ignoreAllUnknown) {
                            jsonParser.UeEOUB();
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
            objEZpvd = propertyBasedCreator.EZpvd(deserializationContext, c5569WtOLrzqt);
        } catch (Exception e4) {
            wrapInstantiationProblem(e4, deserializationContext);
            objEZpvd = null;
        }
        if (this._injectables != null) {
            injectValues(deserializationContext, objEZpvd);
        }
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((ActionBar) it.next()).AEQbTJ(objEZpvd);
            }
        }
        if (yaBufferForInputBuffering == null) {
            return objEZpvd;
        }
        if (objEZpvd.getClass() != this._beanType.getRawClass()) {
            return handlePolymorphic(null, deserializationContext, objEZpvd, yaBufferForInputBuffering);
        }
        return handleUnknownProperties(deserializationContext, objEZpvd, yaBufferForInputBuffering);
    }

    private ActionBar handleUnresolvedReference(DeserializationContext deserializationContext, SettableBeanProperty settableBeanProperty, C5569Wt c5569Wt, UnresolvedForwardReference unresolvedForwardReference) throws JsonMappingException {
        ActionBar actionBar = new ActionBar(deserializationContext, unresolvedForwardReference, settableBeanProperty.getType(), c5569Wt, settableBeanProperty);
        unresolvedForwardReference.getRoid().AEQbTJ((C5565Wp.Activity) actionBar);
        return actionBar;
    }

    public final Object _deserializeWithErrorWrapping(JsonParser jsonParser, DeserializationContext deserializationContext, SettableBeanProperty settableBeanProperty) throws IOException {
        try {
            return settableBeanProperty.deserialize(jsonParser, deserializationContext);
        } catch (Exception e) {
            wrapAndThrow(e, this._beanType.getRawClass(), settableBeanProperty.getName(), deserializationContext);
            return null;
        }
    }

    public Object deserializeFromNull(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        Object objDeserializeFromObject;
        if (jsonParser.aKErDB()) {
            YA yaBufferForInputBuffering = deserializationContext.bufferForInputBuffering(jsonParser);
            yaBufferForInputBuffering.DbNXlk();
            JsonParser jsonParserGEmmrt = yaBufferForInputBuffering.gEmmrt(jsonParser);
            jsonParserGEmmrt.RcXXUw();
            if (this._vanillaProcessing) {
                objDeserializeFromObject = vanillaDeserialize(jsonParserGEmmrt, deserializationContext, JsonToken.END_OBJECT);
            } else {
                objDeserializeFromObject = deserializeFromObject(jsonParserGEmmrt, deserializationContext);
            }
            jsonParserGEmmrt.close();
            return objDeserializeFromObject;
        }
        return deserializationContext.handleUnexpectedToken(getValueType(deserializationContext), jsonParser);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer
    public Object _deserializeFromArray(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        AbstractC5548Vy<Object> abstractC5548Vy = this._arrayDelegateDeserializer;
        if (abstractC5548Vy != null || (abstractC5548Vy = this._delegateDeserializer) != null) {
            Object objCreateUsingArrayDelegate = this._valueInstantiator.createUsingArrayDelegate(deserializationContext, abstractC5548Vy.deserialize(jsonParser, deserializationContext));
            if (this._injectables != null) {
                injectValues(deserializationContext, objCreateUsingArrayDelegate);
            }
            return objCreateUsingArrayDelegate;
        }
        CoercionAction coercionAction_findCoercionFromEmptyArray = _findCoercionFromEmptyArray(deserializationContext);
        boolean zIsEnabled = deserializationContext.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS);
        if (zIsEnabled || coercionAction_findCoercionFromEmptyArray != CoercionAction.Fail) {
            JsonToken jsonTokenRcXXUw = jsonParser.RcXXUw();
            JsonToken jsonToken = JsonToken.END_ARRAY;
            if (jsonTokenRcXXUw == jsonToken) {
                int i = AnonymousClass3.KWHzl[coercionAction_findCoercionFromEmptyArray.ordinal()];
                if (i == 1) {
                    return getEmptyValue(deserializationContext);
                }
                if (i == 2 || i == 3) {
                    return getNullValue(deserializationContext);
                }
                return deserializationContext.handleUnexpectedToken(getValueType(deserializationContext), JsonToken.START_ARRAY, jsonParser, (String) null, new Object[0]);
            }
            if (zIsEnabled) {
                JsonToken jsonToken2 = JsonToken.START_ARRAY;
                if (jsonTokenRcXXUw == jsonToken2) {
                    JavaType valueType = getValueType(deserializationContext);
                    return deserializationContext.handleUnexpectedToken(valueType, jsonToken2, jsonParser, "Cannot deserialize value of type %s from deeply-nested Array: only single wrapper allowed with `%s`", C5619Yr.copydefault(valueType), "DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS");
                }
                Object objDeserialize = deserialize(jsonParser, deserializationContext);
                if (jsonParser.RcXXUw() != jsonToken) {
                    handleMissingEndArrayForSingle(jsonParser, deserializationContext);
                }
                return objDeserialize;
            }
        }
        return deserializationContext.handleUnexpectedToken(getValueType(deserializationContext), jsonParser);
    }

    /* JADX INFO: renamed from: com.fasterxml.jackson.databind.deser.BeanDeserializer$3, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass3 {
        public static final /* synthetic */ int[] KWHzl;
        public static final /* synthetic */ int[] OLrzqt;

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
            int[] iArr2 = new int[JsonToken.values().length];
            OLrzqt = iArr2;
            try {
                iArr2[JsonToken.VALUE_STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                OLrzqt[JsonToken.VALUE_NUMBER_INT.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                OLrzqt[JsonToken.VALUE_NUMBER_FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                OLrzqt[JsonToken.VALUE_EMBEDDED_OBJECT.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                OLrzqt[JsonToken.VALUE_TRUE.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                OLrzqt[JsonToken.VALUE_FALSE.ordinal()] = 6;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                OLrzqt[JsonToken.VALUE_NULL.ordinal()] = 7;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                OLrzqt[JsonToken.START_ARRAY.ordinal()] = 8;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                OLrzqt[JsonToken.FIELD_NAME.ordinal()] = 9;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                OLrzqt[JsonToken.END_OBJECT.ordinal()] = 10;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    public final Object deserializeWithView(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj, Class<?> cls) throws IOException {
        if (jsonParser.OLrzqt(5)) {
            String strKWHzl = jsonParser.KWHzl();
            do {
                jsonParser.RcXXUw();
                SettableBeanProperty settableBeanPropertyFind = this._beanProperties.find(strKWHzl);
                if (settableBeanPropertyFind != null) {
                    if (!settableBeanPropertyFind.visibleInView(cls)) {
                        jsonParser.UeEOUB();
                    } else {
                        try {
                            settableBeanPropertyFind.deserializeAndSet(jsonParser, deserializationContext, obj);
                        } catch (Exception e) {
                            wrapAndThrow(e, obj, strKWHzl, deserializationContext);
                        }
                    }
                } else {
                    handleUnknownVanilla(jsonParser, deserializationContext, obj, strKWHzl);
                }
                strKWHzl = jsonParser.QbewEr();
            } while (strKWHzl != null);
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
        jsonParser.KWHzl(objCreateUsingDefault);
        if (this._injectables != null) {
            injectValues(deserializationContext, objCreateUsingDefault);
        }
        Class<?> activeView = this._needViewProcesing ? deserializationContext.getActiveView() : null;
        String strKWHzl = jsonParser.OLrzqt(5) ? jsonParser.KWHzl() : null;
        while (strKWHzl != null) {
            jsonParser.RcXXUw();
            SettableBeanProperty settableBeanPropertyFind = this._beanProperties.find(strKWHzl);
            if (settableBeanPropertyFind != null) {
                if (activeView != null && !settableBeanPropertyFind.visibleInView(activeView)) {
                    jsonParser.UeEOUB();
                } else {
                    try {
                        settableBeanPropertyFind.deserializeAndSet(jsonParser, deserializationContext, objCreateUsingDefault);
                    } catch (Exception e) {
                        wrapAndThrow(e, objCreateUsingDefault, strKWHzl, deserializationContext);
                    }
                }
            } else if (IgnorePropertiesUtil.KWHzl(strKWHzl, this._ignorableProps, this._includableProps)) {
                handleIgnoredProperty(jsonParser, deserializationContext, objCreateUsingDefault, strKWHzl);
            } else if (this._anySetter == null) {
                yaBufferForInputBuffering.KWHzl(strKWHzl);
                yaBufferForInputBuffering.EZpvd(jsonParser);
            } else {
                YA yaBufferAsCopyOfValue = deserializationContext.bufferAsCopyOfValue(jsonParser);
                yaBufferForInputBuffering.KWHzl(strKWHzl);
                yaBufferForInputBuffering.AEQbTJ(yaBufferAsCopyOfValue);
                try {
                    this._anySetter.deserializeAndSet(yaBufferAsCopyOfValue.fARcdN(), deserializationContext, objCreateUsingDefault, strKWHzl);
                } catch (Exception e2) {
                    wrapAndThrow(e2, objCreateUsingDefault, strKWHzl, deserializationContext);
                }
            }
            strKWHzl = jsonParser.QbewEr();
        }
        yaBufferForInputBuffering.DbNXlk();
        this._unwrappedPropertyHandler.KWHzl(jsonParser, deserializationContext, objCreateUsingDefault, yaBufferForInputBuffering);
        return objCreateUsingDefault;
    }

    public Object deserializeWithUnwrapped(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        JsonToken jsonTokenDjBIcL = jsonParser.djBIcL();
        if (jsonTokenDjBIcL == JsonToken.START_OBJECT) {
            jsonTokenDjBIcL = jsonParser.RcXXUw();
        }
        YA yaBufferForInputBuffering = deserializationContext.bufferForInputBuffering(jsonParser);
        yaBufferForInputBuffering.AkhnZx();
        Class<?> activeView = this._needViewProcesing ? deserializationContext.getActiveView() : null;
        while (jsonTokenDjBIcL == JsonToken.FIELD_NAME) {
            String strKWHzl = jsonParser.KWHzl();
            SettableBeanProperty settableBeanPropertyFind = this._beanProperties.find(strKWHzl);
            jsonParser.RcXXUw();
            if (settableBeanPropertyFind != null) {
                if (activeView != null && !settableBeanPropertyFind.visibleInView(activeView)) {
                    jsonParser.UeEOUB();
                } else {
                    try {
                        settableBeanPropertyFind.deserializeAndSet(jsonParser, deserializationContext, obj);
                    } catch (Exception e) {
                        wrapAndThrow(e, obj, strKWHzl, deserializationContext);
                    }
                }
            } else if (IgnorePropertiesUtil.KWHzl(strKWHzl, this._ignorableProps, this._includableProps)) {
                handleIgnoredProperty(jsonParser, deserializationContext, obj, strKWHzl);
            } else if (this._anySetter == null) {
                yaBufferForInputBuffering.KWHzl(strKWHzl);
                yaBufferForInputBuffering.EZpvd(jsonParser);
            } else {
                YA yaBufferAsCopyOfValue = deserializationContext.bufferAsCopyOfValue(jsonParser);
                yaBufferForInputBuffering.KWHzl(strKWHzl);
                yaBufferForInputBuffering.AEQbTJ(yaBufferAsCopyOfValue);
                try {
                    this._anySetter.deserializeAndSet(yaBufferAsCopyOfValue.fARcdN(), deserializationContext, obj, strKWHzl);
                } catch (Exception e2) {
                    wrapAndThrow(e2, obj, strKWHzl, deserializationContext);
                }
            }
            jsonTokenDjBIcL = jsonParser.RcXXUw();
        }
        yaBufferForInputBuffering.DbNXlk();
        this._unwrappedPropertyHandler.KWHzl(jsonParser, deserializationContext, obj, yaBufferForInputBuffering);
        return obj;
    }

    public Object deserializeUsingPropertyBasedWithUnwrapped(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        Object objWrapInstantiationProblem;
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
                    if (c5569WtOLrzqt.EZpvd(settableBeanPropertyKWHzl, _deserializeWithErrorWrapping(jsonParser, deserializationContext, settableBeanPropertyKWHzl))) {
                        JsonToken jsonTokenRcXXUw = jsonParser.RcXXUw();
                        try {
                            objWrapInstantiationProblem = propertyBasedCreator.EZpvd(deserializationContext, c5569WtOLrzqt);
                        } catch (Exception e) {
                            objWrapInstantiationProblem = wrapInstantiationProblem(e, deserializationContext);
                        }
                        jsonParser.KWHzl(objWrapInstantiationProblem);
                        while (jsonTokenRcXXUw == JsonToken.FIELD_NAME) {
                            yaBufferForInputBuffering.EZpvd(jsonParser);
                            jsonTokenRcXXUw = jsonParser.RcXXUw();
                        }
                        JsonToken jsonToken = JsonToken.END_OBJECT;
                        if (jsonTokenRcXXUw != jsonToken) {
                            deserializationContext.reportWrongTokenException(this, jsonToken, "Attempted to unwrap '%s' value", handledType().getName());
                        }
                        yaBufferForInputBuffering.DbNXlk();
                        if (objWrapInstantiationProblem.getClass() != this._beanType.getRawClass()) {
                            deserializationContext.reportInputMismatch(settableBeanPropertyKWHzl, "Cannot create polymorphic instances with unwrapped values", new Object[0]);
                            return null;
                        }
                        return this._unwrappedPropertyHandler.KWHzl(jsonParser, deserializationContext, objWrapInstantiationProblem, yaBufferForInputBuffering);
                    }
                } else {
                    SettableBeanProperty settableBeanPropertyFind = this._beanProperties.find(strKWHzl);
                    if (settableBeanPropertyFind != null) {
                        c5569WtOLrzqt.OLrzqt(settableBeanPropertyFind, _deserializeWithErrorWrapping(jsonParser, deserializationContext, settableBeanPropertyFind));
                    } else if (IgnorePropertiesUtil.KWHzl(strKWHzl, this._ignorableProps, this._includableProps)) {
                        handleIgnoredProperty(jsonParser, deserializationContext, handledType(), strKWHzl);
                    } else if (this._anySetter == null) {
                        yaBufferForInputBuffering.KWHzl(strKWHzl);
                        yaBufferForInputBuffering.EZpvd(jsonParser);
                    } else {
                        YA yaBufferAsCopyOfValue = deserializationContext.bufferAsCopyOfValue(jsonParser);
                        yaBufferForInputBuffering.KWHzl(strKWHzl);
                        yaBufferForInputBuffering.AEQbTJ(yaBufferAsCopyOfValue);
                        try {
                            SettableAnyProperty settableAnyProperty = this._anySetter;
                            c5569WtOLrzqt.AEQbTJ(settableAnyProperty, strKWHzl, settableAnyProperty.deserialize(yaBufferAsCopyOfValue.fARcdN(), deserializationContext));
                        } catch (Exception e2) {
                            wrapAndThrow(e2, this._beanType.getRawClass(), strKWHzl, deserializationContext);
                        }
                    }
                }
            }
            jsonTokenDjBIcL = jsonParser.RcXXUw();
        }
        try {
            return this._unwrappedPropertyHandler.KWHzl(jsonParser, deserializationContext, propertyBasedCreator.EZpvd(deserializationContext, c5569WtOLrzqt), yaBufferForInputBuffering);
        } catch (Exception e3) {
            wrapInstantiationProblem(e3, deserializationContext);
            return null;
        }
    }

    public Object deserializeWithExternalTypeId(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        if (this._propertyBasedCreator != null) {
            return deserializeUsingPropertyBasedWithExternalTypeId(jsonParser, deserializationContext);
        }
        AbstractC5548Vy<Object> abstractC5548Vy = this._delegateDeserializer;
        if (abstractC5548Vy != null) {
            return this._valueInstantiator.createUsingDelegate(deserializationContext, abstractC5548Vy.deserialize(jsonParser, deserializationContext));
        }
        return deserializeWithExternalTypeId(jsonParser, deserializationContext, this._valueInstantiator.createUsingDefault(deserializationContext));
    }

    public Object deserializeWithExternalTypeId(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        return _deserializeWithExternalTypeId(jsonParser, deserializationContext, obj, this._externalTypeIdHandler.AEQbTJ());
    }

    public Object _deserializeWithExternalTypeId(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj, C5563Wn c5563Wn) throws IOException {
        Class<?> activeView = this._needViewProcesing ? deserializationContext.getActiveView() : null;
        JsonToken jsonTokenDjBIcL = jsonParser.djBIcL();
        while (jsonTokenDjBIcL == JsonToken.FIELD_NAME) {
            String strKWHzl = jsonParser.KWHzl();
            JsonToken jsonTokenRcXXUw = jsonParser.RcXXUw();
            SettableBeanProperty settableBeanPropertyFind = this._beanProperties.find(strKWHzl);
            if (settableBeanPropertyFind != null) {
                if (jsonTokenRcXXUw.isScalarValue()) {
                    c5563Wn.AEQbTJ(jsonParser, deserializationContext, strKWHzl, obj);
                }
                if (activeView != null && !settableBeanPropertyFind.visibleInView(activeView)) {
                    jsonParser.UeEOUB();
                } else {
                    try {
                        settableBeanPropertyFind.deserializeAndSet(jsonParser, deserializationContext, obj);
                    } catch (Exception e) {
                        wrapAndThrow(e, obj, strKWHzl, deserializationContext);
                    }
                }
            } else if (IgnorePropertiesUtil.KWHzl(strKWHzl, this._ignorableProps, this._includableProps)) {
                handleIgnoredProperty(jsonParser, deserializationContext, obj, strKWHzl);
            } else if (!c5563Wn.EZpvd(jsonParser, deserializationContext, strKWHzl, obj)) {
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
        return c5563Wn.EZpvd(jsonParser, deserializationContext, obj);
    }

    public Object deserializeUsingPropertyBasedWithExternalTypeId(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        C5563Wn c5563WnAEQbTJ = this._externalTypeIdHandler.AEQbTJ();
        PropertyBasedCreator propertyBasedCreator = this._propertyBasedCreator;
        C5569Wt c5569WtOLrzqt = propertyBasedCreator.OLrzqt(jsonParser, deserializationContext, this._objectIdReader);
        Class<?> activeView = this._needViewProcesing ? deserializationContext.getActiveView() : null;
        JsonToken jsonTokenDjBIcL = jsonParser.djBIcL();
        while (jsonTokenDjBIcL == JsonToken.FIELD_NAME) {
            String strKWHzl = jsonParser.KWHzl();
            JsonToken jsonTokenRcXXUw = jsonParser.RcXXUw();
            SettableBeanProperty settableBeanPropertyKWHzl = propertyBasedCreator.KWHzl(strKWHzl);
            if (!c5569WtOLrzqt.AEQbTJ(strKWHzl) || settableBeanPropertyKWHzl != null) {
                if (settableBeanPropertyKWHzl != null) {
                    if (!c5563WnAEQbTJ.EZpvd(jsonParser, deserializationContext, strKWHzl, null) && c5569WtOLrzqt.EZpvd(settableBeanPropertyKWHzl, _deserializeWithErrorWrapping(jsonParser, deserializationContext, settableBeanPropertyKWHzl))) {
                        jsonParser.RcXXUw();
                        try {
                            Object objEZpvd = propertyBasedCreator.EZpvd(deserializationContext, c5569WtOLrzqt);
                            if (objEZpvd.getClass() != this._beanType.getRawClass()) {
                                JavaType javaType = this._beanType;
                                return deserializationContext.reportBadDefinition(javaType, String.format("Cannot create polymorphic instances with external type ids (%s -> %s)", javaType, objEZpvd.getClass()));
                            }
                            return _deserializeWithExternalTypeId(jsonParser, deserializationContext, objEZpvd, c5563WnAEQbTJ);
                        } catch (Exception e) {
                            wrapAndThrow(e, this._beanType.getRawClass(), strKWHzl, deserializationContext);
                        }
                    }
                } else {
                    SettableBeanProperty settableBeanPropertyFind = this._beanProperties.find(strKWHzl);
                    if (settableBeanPropertyFind != null) {
                        if (jsonTokenRcXXUw.isScalarValue()) {
                            c5563WnAEQbTJ.AEQbTJ(jsonParser, deserializationContext, strKWHzl, (Object) null);
                        }
                        if (activeView != null && !settableBeanPropertyFind.visibleInView(activeView)) {
                            jsonParser.UeEOUB();
                        } else {
                            c5569WtOLrzqt.OLrzqt(settableBeanPropertyFind, settableBeanPropertyFind.deserialize(jsonParser, deserializationContext));
                        }
                    } else if (!c5563WnAEQbTJ.EZpvd(jsonParser, deserializationContext, strKWHzl, null)) {
                        if (IgnorePropertiesUtil.KWHzl(strKWHzl, this._ignorableProps, this._includableProps)) {
                            handleIgnoredProperty(jsonParser, deserializationContext, handledType(), strKWHzl);
                        } else {
                            SettableAnyProperty settableAnyProperty = this._anySetter;
                            if (settableAnyProperty != null) {
                                c5569WtOLrzqt.AEQbTJ(settableAnyProperty, strKWHzl, settableAnyProperty.deserialize(jsonParser, deserializationContext));
                            } else {
                                handleUnknownProperty(jsonParser, deserializationContext, this._valueClass, strKWHzl);
                            }
                        }
                    }
                }
            }
            jsonTokenDjBIcL = jsonParser.RcXXUw();
        }
        try {
            return c5563WnAEQbTJ.copydefault(jsonParser, deserializationContext, c5569WtOLrzqt, propertyBasedCreator);
        } catch (Exception e2) {
            return wrapInstantiationProblem(e2, deserializationContext);
        }
    }

    public Exception _creatorReturnedNullException() {
        if (this._nullFromCreator == null) {
            this._nullFromCreator = new NullPointerException("JSON Creator returned null");
        }
        return this._nullFromCreator;
    }

    public static class ActionBar extends C5565Wp.Activity {
        public final DeserializationContext AEQbTJ;
        public final SettableBeanProperty OLrzqt;
        public Object copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public void AEQbTJ(Object obj) {
            this.copydefault = obj;
        }

        public ActionBar(DeserializationContext deserializationContext, UnresolvedForwardReference unresolvedForwardReference, JavaType javaType, C5569Wt c5569Wt, SettableBeanProperty settableBeanProperty) {
            super(unresolvedForwardReference, javaType);
            this.AEQbTJ = deserializationContext;
            this.OLrzqt = settableBeanProperty;
        }

        @Override // o.C5565Wp.Activity
        public void copydefault(Object obj, Object obj2) throws IOException {
            if (this.copydefault == null) {
                DeserializationContext deserializationContext = this.AEQbTJ;
                SettableBeanProperty settableBeanProperty = this.OLrzqt;
                deserializationContext.reportInputMismatch(settableBeanProperty, "Cannot resolve ObjectId forward reference using property '%s' (of type %s): Bean not yet resolved", settableBeanProperty.getName(), this.OLrzqt.getDeclaringClass().getName());
            }
            this.OLrzqt.set(this.copydefault, obj2);
        }
    }
}
