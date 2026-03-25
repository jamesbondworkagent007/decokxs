package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.annotation.JacksonInject;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonIncludeProperties;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.cfg.ConstructorDetector;
import com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig;
import com.fasterxml.jackson.databind.deser.impl.JDKValueInstantiators;
import com.fasterxml.jackson.databind.deser.std.ArrayBlockingQueueDeserializer;
import com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer;
import com.fasterxml.jackson.databind.deser.std.CollectionDeserializer;
import com.fasterxml.jackson.databind.deser.std.DateDeserializers;
import com.fasterxml.jackson.databind.deser.std.EnumDeserializer;
import com.fasterxml.jackson.databind.deser.std.EnumMapDeserializer;
import com.fasterxml.jackson.databind.deser.std.EnumSetDeserializer;
import com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer;
import com.fasterxml.jackson.databind.deser.std.MapDeserializer;
import com.fasterxml.jackson.databind.deser.std.MapEntryDeserializer;
import com.fasterxml.jackson.databind.deser.std.NumberDeserializers;
import com.fasterxml.jackson.databind.deser.std.ObjectArrayDeserializer;
import com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers;
import com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers;
import com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer;
import com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer;
import com.fasterxml.jackson.databind.deser.std.StringDeserializer;
import com.fasterxml.jackson.databind.deser.std.TokenBufferDeserializer;
import com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import com.fasterxml.jackson.databind.ext.OptionalHandlerFactory;
import com.fasterxml.jackson.databind.introspect.AnnotatedConstructor;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import com.fasterxml.jackson.databind.introspect.AnnotatedWithParams;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.databind.type.CollectionLikeType;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.fasterxml.jackson.databind.type.MapType;
import com.fasterxml.jackson.databind.type.ReferenceType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.EnumResolver;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.AbstractList;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Deque;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.atomic.AtomicReference;
import o.AbstractC5547Vx;
import o.AbstractC5548Vy;
import o.AbstractC5549Vz;
import o.AbstractC5550Wa;
import o.AbstractC5568Ws;
import o.AbstractC5597Xv;
import o.C5560Wk;
import o.C5564Wo;
import o.C5570Wu;
import o.C5582Xg;
import o.C5619Yr;
import o.InterfaceC5556Wg;
import o.InterfaceC5559Wj;
import o.InterfaceC5562Wm;
import o.InterfaceC5599Xx;
import o.VC;
import o.VQ;
import o.VX;
import o.WJ;
import o.WM;
import o.WT;
import o.WW;
import o.WZ;
import o.YA;
import o.YB;

/* JADX INFO: loaded from: classes21.dex */
public abstract class BasicDeserializerFactory extends AbstractC5550Wa implements Serializable {
    protected final DeserializerFactoryConfig _factoryConfig;
    private static final Class<?> CLASS_OBJECT = Object.class;
    private static final Class<?> CLASS_STRING = String.class;
    private static final Class<?> CLASS_CHAR_SEQUENCE = CharSequence.class;
    private static final Class<?> CLASS_ITERABLE = Iterable.class;
    private static final Class<?> CLASS_MAP_ENTRY = Map.Entry.class;
    private static final Class<?> CLASS_SERIALIZABLE = Serializable.class;
    protected static final PropertyName UNWRAPPED_CREATOR_PARAM_NAME = new PropertyName("@JsonUnwrapped");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DeserializerFactoryConfig getFactoryConfig() {
        return this._factoryConfig;
    }

    public abstract AbstractC5550Wa withConfig(DeserializerFactoryConfig deserializerFactoryConfig);

    public BasicDeserializerFactory(DeserializerFactoryConfig deserializerFactoryConfig) {
        this._factoryConfig = deserializerFactoryConfig;
    }

    @Override // o.AbstractC5550Wa
    public final AbstractC5550Wa withAdditionalDeserializers(InterfaceC5559Wj interfaceC5559Wj) {
        return withConfig(this._factoryConfig.withAdditionalDeserializers(interfaceC5559Wj));
    }

    @Override // o.AbstractC5550Wa
    public final AbstractC5550Wa withAdditionalKeyDeserializers(InterfaceC5556Wg interfaceC5556Wg) {
        return withConfig(this._factoryConfig.withAdditionalKeyDeserializers(interfaceC5556Wg));
    }

    @Override // o.AbstractC5550Wa
    public final AbstractC5550Wa withDeserializerModifier(VX vx) {
        return withConfig(this._factoryConfig.withDeserializerModifier(vx));
    }

    @Override // o.AbstractC5550Wa
    public final AbstractC5550Wa withAbstractTypeResolver(AbstractC5547Vx abstractC5547Vx) {
        return withConfig(this._factoryConfig.withAbstractTypeResolver(abstractC5547Vx));
    }

    @Override // o.AbstractC5550Wa
    public final AbstractC5550Wa withValueInstantiators(InterfaceC5562Wm interfaceC5562Wm) {
        return withConfig(this._factoryConfig.withValueInstantiators(interfaceC5562Wm));
    }

    @Override // o.AbstractC5550Wa
    public JavaType mapAbstractType(DeserializationConfig deserializationConfig, JavaType javaType) throws JsonMappingException {
        JavaType javaType_mapAbstractType2;
        while (true) {
            javaType_mapAbstractType2 = _mapAbstractType2(deserializationConfig, javaType);
            if (javaType_mapAbstractType2 == null) {
                return javaType;
            }
            Class<?> rawClass = javaType.getRawClass();
            Class<?> rawClass2 = javaType_mapAbstractType2.getRawClass();
            if (rawClass == rawClass2 || !rawClass.isAssignableFrom(rawClass2)) {
                break;
            }
            javaType = javaType_mapAbstractType2;
        }
        throw new IllegalArgumentException("Invalid abstract type resolution from " + javaType + " to " + javaType_mapAbstractType2 + ": latter is not a subtype of former");
    }

    private JavaType _mapAbstractType2(DeserializationConfig deserializationConfig, JavaType javaType) throws JsonMappingException {
        Class<?> rawClass = javaType.getRawClass();
        if (!this._factoryConfig.hasAbstractTypeResolvers()) {
            return null;
        }
        Iterator<AbstractC5547Vx> it = this._factoryConfig.abstractTypeResolvers().iterator();
        while (it.hasNext()) {
            JavaType javaTypeFindTypeMapping = it.next().findTypeMapping(deserializationConfig, javaType);
            if (javaTypeFindTypeMapping != null && !javaTypeFindTypeMapping.hasRawClass(rawClass)) {
                return javaTypeFindTypeMapping;
            }
        }
        return null;
    }

    @Override // o.AbstractC5550Wa
    public ValueInstantiator findValueInstantiator(DeserializationContext deserializationContext, AbstractC5549Vz abstractC5549Vz) throws JsonMappingException {
        DeserializationConfig config = deserializationContext.getConfig();
        WJ wjAuCTel = abstractC5549Vz.AuCTel();
        Object objFindValueInstantiator = deserializationContext.getAnnotationIntrospector().findValueInstantiator(wjAuCTel);
        ValueInstantiator valueInstantiator_valueInstantiatorInstance = objFindValueInstantiator != null ? _valueInstantiatorInstance(config, wjAuCTel, objFindValueInstantiator) : null;
        if (valueInstantiator_valueInstantiatorInstance == null && (valueInstantiator_valueInstantiatorInstance = JDKValueInstantiators.KWHzl(config, abstractC5549Vz.DbNXlk())) == null) {
            valueInstantiator_valueInstantiatorInstance = _constructDefaultValueInstantiator(deserializationContext, abstractC5549Vz);
        }
        if (this._factoryConfig.hasValueInstantiators()) {
            for (InterfaceC5562Wm interfaceC5562Wm : this._factoryConfig.valueInstantiators()) {
                valueInstantiator_valueInstantiatorInstance = interfaceC5562Wm.findValueInstantiator(config, abstractC5549Vz, valueInstantiator_valueInstantiatorInstance);
                if (valueInstantiator_valueInstantiatorInstance == null) {
                    deserializationContext.reportBadTypeDefinition(abstractC5549Vz, "Broken registered ValueInstantiators (of type %s): returned null ValueInstantiator", interfaceC5562Wm.getClass().getName());
                }
            }
        }
        return valueInstantiator_valueInstantiatorInstance != null ? valueInstantiator_valueInstantiatorInstance.createContextual(deserializationContext, abstractC5549Vz) : valueInstantiator_valueInstantiatorInstance;
    }

    public ValueInstantiator _constructDefaultValueInstantiator(DeserializationContext deserializationContext, AbstractC5549Vz abstractC5549Vz) throws JsonMappingException {
        ArrayList arrayList;
        AnnotatedConstructor annotatedConstructorAEQbTJ;
        DeserializationConfig config = deserializationContext.getConfig();
        VisibilityChecker<?> defaultVisibilityChecker = config.getDefaultVisibilityChecker(abstractC5549Vz.DbNXlk(), abstractC5549Vz.AuCTel());
        ConstructorDetector constructorDetector = config.getConstructorDetector();
        Application application = new Application(deserializationContext, abstractC5549Vz, defaultVisibilityChecker, new C5560Wk(abstractC5549Vz, config), _findCreatorsFromProperties(deserializationContext, abstractC5549Vz));
        _addExplicitFactoryCreators(deserializationContext, application, !constructorDetector.requireCtorAnnotation());
        if (abstractC5549Vz.getNewProxyInstance().isConcrete()) {
            if (abstractC5549Vz.getNewProxyInstance().isRecordType() && (annotatedConstructorAEQbTJ = C5582Xg.AEQbTJ(deserializationContext, abstractC5549Vz, (arrayList = new ArrayList()))) != null) {
                _addRecordConstructor(deserializationContext, application, annotatedConstructorAEQbTJ, arrayList);
                return application.AYXKKw.EZpvd(deserializationContext);
            }
            if (!abstractC5549Vz.zsXlph()) {
                _addExplicitConstructorCreators(deserializationContext, application, constructorDetector.shouldIntrospectorImplicitConstructors(abstractC5549Vz.DbNXlk()));
                if (application.EZpvd() && !application.OLrzqt()) {
                    _addImplicitConstructorCreators(deserializationContext, application, application.valueOf());
                }
            }
        }
        if (application.KWHzl() && !application.copydefault() && !application.OLrzqt()) {
            _addImplicitFactoryCreators(deserializationContext, application, application.AhwBna());
        }
        return application.AYXKKw.EZpvd(deserializationContext);
    }

    public Map<AnnotatedWithParams, WT[]> _findCreatorsFromProperties(DeserializationContext deserializationContext, AbstractC5549Vz abstractC5549Vz) throws JsonMappingException {
        Map<AnnotatedWithParams, WT[]> mapEmptyMap = Collections.emptyMap();
        for (WT wt : abstractC5549Vz.isConnected()) {
            Iterator<AnnotatedParameter> itAhwBna = wt.AhwBna();
            while (itAhwBna.hasNext()) {
                AnnotatedParameter next = itAhwBna.next();
                AnnotatedWithParams owner = next.getOwner();
                WT[] wtArr = mapEmptyMap.get(owner);
                int index = next.getIndex();
                if (wtArr == null) {
                    if (mapEmptyMap.isEmpty()) {
                        mapEmptyMap = new LinkedHashMap<>();
                    }
                    wtArr = new WT[owner.getParameterCount()];
                    mapEmptyMap.put(owner, wtArr);
                } else {
                    WT wt2 = wtArr[index];
                    if (wt2 != null) {
                        deserializationContext.reportBadTypeDefinition(abstractC5549Vz, "Conflict: parameter #%d of %s bound to more than one property; %s vs %s", Integer.valueOf(index), owner, wt2, wt);
                    }
                }
                wtArr[index] = wt;
            }
        }
        return mapEmptyMap;
    }

    public ValueInstantiator _valueInstantiatorInstance(DeserializationConfig deserializationConfig, WM wm, Object obj) throws JsonMappingException {
        ValueInstantiator valueInstantiatorDjBIcL;
        if (obj == null) {
            return null;
        }
        if (obj instanceof ValueInstantiator) {
            return (ValueInstantiator) obj;
        }
        if (!(obj instanceof Class)) {
            throw new IllegalStateException("AnnotationIntrospector returned key deserializer definition of type " + obj.getClass().getName() + "; expected type KeyDeserializer or Class<KeyDeserializer> instead");
        }
        Class<?> cls = (Class) obj;
        if (C5619Yr.fetchVPNInfo(cls)) {
            return null;
        }
        if (!ValueInstantiator.class.isAssignableFrom(cls)) {
            throw new IllegalStateException("AnnotationIntrospector returned Class " + cls.getName() + "; expected Class<ValueInstantiator>");
        }
        VQ handlerInstantiator = deserializationConfig.getHandlerInstantiator();
        return (handlerInstantiator == null || (valueInstantiatorDjBIcL = handlerInstantiator.djBIcL(deserializationConfig, wm, cls)) == null) ? (ValueInstantiator) C5619Yr.EZpvd(cls, deserializationConfig.canOverrideAccessModifiers()) : valueInstantiatorDjBIcL;
    }

    public void _addRecordConstructor(DeserializationContext deserializationContext, Application application, AnnotatedConstructor annotatedConstructor, List<String> list) throws JsonMappingException {
        int parameterCount = annotatedConstructor.getParameterCount();
        AnnotationIntrospector annotationIntrospector = deserializationContext.getAnnotationIntrospector();
        SettableBeanProperty[] settableBeanPropertyArr = new SettableBeanProperty[parameterCount];
        for (int i = 0; i < parameterCount; i++) {
            AnnotatedParameter parameter = annotatedConstructor.getParameter(i);
            JacksonInject.Value valueFindInjectableValue = annotationIntrospector.findInjectableValue(parameter);
            PropertyName propertyNameFindNameForDeserialization = annotationIntrospector.findNameForDeserialization(parameter);
            if (propertyNameFindNameForDeserialization == null || propertyNameFindNameForDeserialization.isEmpty()) {
                propertyNameFindNameForDeserialization = PropertyName.construct(list.get(i));
            }
            settableBeanPropertyArr[i] = constructCreatorProperty(deserializationContext, application.EZpvd, propertyNameFindNameForDeserialization, i, parameter, valueFindInjectableValue);
        }
        application.AYXKKw.AEQbTJ(annotatedConstructor, false, settableBeanPropertyArr);
    }

    public void _addExplicitConstructorCreators(DeserializationContext deserializationContext, Application application, boolean z) throws JsonMappingException {
        AbstractC5549Vz abstractC5549Vz = application.EZpvd;
        C5560Wk c5560Wk = application.AYXKKw;
        AnnotationIntrospector annotationIntrospectorAEQbTJ = application.AEQbTJ();
        VisibilityChecker<?> visibilityChecker = application.AhwBna;
        Map<AnnotatedWithParams, WT[]> map = application.djBIcL;
        AnnotatedConstructor annotatedConstructorAEQbTJ = abstractC5549Vz.AEQbTJ();
        if (annotatedConstructorAEQbTJ != null && (!c5560Wk.KWHzl() || _hasCreatorAnnotation(deserializationContext, annotatedConstructorAEQbTJ))) {
            c5560Wk.OLrzqt(annotatedConstructorAEQbTJ);
        }
        for (AnnotatedConstructor annotatedConstructor : abstractC5549Vz.fARcdN()) {
            JsonCreator.Mode modeFindCreatorAnnotation = annotationIntrospectorAEQbTJ.findCreatorAnnotation(deserializationContext.getConfig(), annotatedConstructor);
            if (JsonCreator.Mode.DISABLED != modeFindCreatorAnnotation) {
                if (modeFindCreatorAnnotation == null) {
                    if (z && visibilityChecker.isCreatorVisible(annotatedConstructor)) {
                        application.EZpvd(C5564Wo.copydefault(annotationIntrospectorAEQbTJ, annotatedConstructor, map.get(annotatedConstructor)));
                    }
                } else {
                    int i = AnonymousClass3.OLrzqt[modeFindCreatorAnnotation.ordinal()];
                    if (i == 1) {
                        _addExplicitDelegatingCreator(deserializationContext, abstractC5549Vz, c5560Wk, C5564Wo.copydefault(annotationIntrospectorAEQbTJ, annotatedConstructor, null));
                    } else if (i == 2) {
                        _addExplicitPropertyCreator(deserializationContext, abstractC5549Vz, c5560Wk, C5564Wo.copydefault(annotationIntrospectorAEQbTJ, annotatedConstructor, map.get(annotatedConstructor)));
                    } else {
                        _addExplicitAnyCreator(deserializationContext, abstractC5549Vz, c5560Wk, C5564Wo.copydefault(annotationIntrospectorAEQbTJ, annotatedConstructor, map.get(annotatedConstructor)), deserializationContext.getConfig().getConstructorDetector());
                    }
                    application.gEmmrt();
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0187 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void _addImplicitConstructorCreators(DeserializationContext deserializationContext, Application application, List<C5564Wo> list) throws JsonMappingException {
        VisibilityChecker<?> visibilityChecker;
        boolean z;
        Iterator<C5564Wo> it;
        int i;
        int i2;
        C5564Wo c5564Wo;
        VisibilityChecker<?> visibilityChecker2;
        boolean z2;
        Iterator<C5564Wo> it2;
        SettableBeanProperty[] settableBeanPropertyArr;
        AnnotatedWithParams annotatedWithParams;
        int i3;
        DeserializationConfig config = deserializationContext.getConfig();
        AbstractC5549Vz abstractC5549Vz = application.EZpvd;
        C5560Wk c5560Wk = application.AYXKKw;
        AnnotationIntrospector annotationIntrospectorAEQbTJ = application.AEQbTJ();
        VisibilityChecker<?> visibilityChecker3 = application.AhwBna;
        boolean zSingleArgCreatorDefaultsToProperties = config.getConstructorDetector().singleArgCreatorDefaultsToProperties();
        Iterator<C5564Wo> it3 = list.iterator();
        LinkedList linkedList = null;
        while (it3.hasNext()) {
            C5564Wo next = it3.next();
            int iAEQbTJ = next.AEQbTJ();
            AnnotatedWithParams annotatedWithParamsOLrzqt = next.OLrzqt();
            if (iAEQbTJ == 1) {
                WT wtValueOf = next.valueOf(0);
                if (zSingleArgCreatorDefaultsToProperties || _checkIfCreatorPropertyBased(annotationIntrospectorAEQbTJ, annotatedWithParamsOLrzqt, wtValueOf)) {
                    SettableBeanProperty[] settableBeanPropertyArr2 = new SettableBeanProperty[1];
                    JacksonInject.Value valueOLrzqt = next.OLrzqt(0);
                    PropertyName propertyNameKWHzl = next.KWHzl(0);
                    if (propertyNameKWHzl != null || (propertyNameKWHzl = next.AEQbTJ(0)) != null || valueOLrzqt != null) {
                        settableBeanPropertyArr2[0] = constructCreatorProperty(deserializationContext, abstractC5549Vz, propertyNameKWHzl, 0, next.EZpvd(0), valueOLrzqt);
                        c5560Wk.AEQbTJ(annotatedWithParamsOLrzqt, false, settableBeanPropertyArr2);
                    }
                } else {
                    _handleSingleArgumentCreator(c5560Wk, annotatedWithParamsOLrzqt, false, visibilityChecker3.isCreatorVisible(annotatedWithParamsOLrzqt));
                    if (wtValueOf != null) {
                        ((WZ) wtValueOf).OcIXYQ();
                    }
                }
                visibilityChecker = visibilityChecker3;
                z = zSingleArgCreatorDefaultsToProperties;
                it = it3;
            } else {
                SettableBeanProperty[] settableBeanPropertyArr3 = new SettableBeanProperty[iAEQbTJ];
                int i4 = -1;
                int i5 = 0;
                int i6 = 0;
                int i7 = 0;
                while (i5 < iAEQbTJ) {
                    AnnotatedParameter parameter = annotatedWithParamsOLrzqt.getParameter(i5);
                    WT wtValueOf2 = next.valueOf(i5);
                    JacksonInject.Value valueFindInjectableValue = annotationIntrospectorAEQbTJ.findInjectableValue(parameter);
                    PropertyName propertyNameIsConnected = wtValueOf2 == null ? null : wtValueOf2.isConnected();
                    if (wtValueOf2 == null || !wtValueOf2.wlaJM()) {
                        i = i5;
                        i2 = i4;
                        c5564Wo = next;
                        visibilityChecker2 = visibilityChecker3;
                        z2 = zSingleArgCreatorDefaultsToProperties;
                        it2 = it3;
                        settableBeanPropertyArr = settableBeanPropertyArr3;
                        annotatedWithParams = annotatedWithParamsOLrzqt;
                        i3 = iAEQbTJ;
                        if (valueFindInjectableValue != null) {
                            i7++;
                            settableBeanPropertyArr[i] = constructCreatorProperty(deserializationContext, abstractC5549Vz, propertyNameIsConnected, i, parameter, valueFindInjectableValue);
                        } else if (annotationIntrospectorAEQbTJ.findUnwrappingNameTransformer(parameter) != null) {
                            _reportUnwrappedCreatorProperty(deserializationContext, abstractC5549Vz, parameter);
                        } else {
                            if (i2 < 0) {
                                i4 = i;
                            }
                            i5 = i + 1;
                            iAEQbTJ = i3;
                            settableBeanPropertyArr3 = settableBeanPropertyArr;
                            annotatedWithParamsOLrzqt = annotatedWithParams;
                            zSingleArgCreatorDefaultsToProperties = z2;
                            it3 = it2;
                            visibilityChecker3 = visibilityChecker2;
                            next = c5564Wo;
                        }
                    } else {
                        i6++;
                        i = i5;
                        i2 = i4;
                        z2 = zSingleArgCreatorDefaultsToProperties;
                        settableBeanPropertyArr = settableBeanPropertyArr3;
                        it2 = it3;
                        annotatedWithParams = annotatedWithParamsOLrzqt;
                        visibilityChecker2 = visibilityChecker3;
                        i3 = iAEQbTJ;
                        c5564Wo = next;
                        settableBeanPropertyArr[i] = constructCreatorProperty(deserializationContext, abstractC5549Vz, propertyNameIsConnected, i, parameter, valueFindInjectableValue);
                    }
                    i4 = i2;
                    i5 = i + 1;
                    iAEQbTJ = i3;
                    settableBeanPropertyArr3 = settableBeanPropertyArr;
                    annotatedWithParamsOLrzqt = annotatedWithParams;
                    zSingleArgCreatorDefaultsToProperties = z2;
                    it3 = it2;
                    visibilityChecker3 = visibilityChecker2;
                    next = c5564Wo;
                }
                int i8 = i4;
                C5564Wo c5564Wo2 = next;
                visibilityChecker = visibilityChecker3;
                z = zSingleArgCreatorDefaultsToProperties;
                it = it3;
                SettableBeanProperty[] settableBeanPropertyArr4 = settableBeanPropertyArr3;
                AnnotatedWithParams annotatedWithParams2 = annotatedWithParamsOLrzqt;
                int i9 = iAEQbTJ;
                if (i6 > 0 || i7 > 0) {
                    if (i6 + i7 == i9) {
                        c5560Wk.AEQbTJ(annotatedWithParams2, false, settableBeanPropertyArr4);
                    } else if (i6 == 0 && i7 + 1 == i9) {
                        c5560Wk.OLrzqt(annotatedWithParams2, false, settableBeanPropertyArr4, 0);
                    } else {
                        PropertyName propertyNameAEQbTJ = c5564Wo2.AEQbTJ(i8);
                        if (propertyNameAEQbTJ == null || propertyNameAEQbTJ.isEmpty()) {
                            deserializationContext.reportBadTypeDefinition(abstractC5549Vz, "Argument #%d of constructor %s has no property name annotation; must have name when multiple-parameter constructor annotated as Creator", Integer.valueOf(i8), annotatedWithParams2);
                        }
                        if (!c5560Wk.KWHzl()) {
                            LinkedList linkedList2 = linkedList == null ? new LinkedList() : linkedList;
                            linkedList2.add(annotatedWithParams2);
                            linkedList = linkedList2;
                        }
                    }
                } else if (!c5560Wk.KWHzl()) {
                }
            }
            zSingleArgCreatorDefaultsToProperties = z;
            it3 = it;
            visibilityChecker3 = visibilityChecker;
        }
        VisibilityChecker<?> visibilityChecker4 = visibilityChecker3;
        if (linkedList == null || c5560Wk.AEQbTJ() || c5560Wk.EZpvd()) {
            return;
        }
        _checkImplicitlyNamedConstructors(deserializationContext, abstractC5549Vz, visibilityChecker4, annotationIntrospectorAEQbTJ, c5560Wk, linkedList);
    }

    public void _addExplicitFactoryCreators(DeserializationContext deserializationContext, Application application, boolean z) throws JsonMappingException {
        AbstractC5549Vz abstractC5549Vz = application.EZpvd;
        C5560Wk c5560Wk = application.AYXKKw;
        AnnotationIntrospector annotationIntrospectorAEQbTJ = application.AEQbTJ();
        VisibilityChecker<?> visibilityChecker = application.AhwBna;
        Map<AnnotatedWithParams, WT[]> map = application.djBIcL;
        for (AnnotatedMethod annotatedMethod : abstractC5549Vz.ejfBZ()) {
            JsonCreator.Mode modeFindCreatorAnnotation = annotationIntrospectorAEQbTJ.findCreatorAnnotation(deserializationContext.getConfig(), annotatedMethod);
            int parameterCount = annotatedMethod.getParameterCount();
            if (modeFindCreatorAnnotation == null) {
                if (z && parameterCount == 1 && visibilityChecker.isCreatorVisible(annotatedMethod)) {
                    application.AEQbTJ(C5564Wo.copydefault(annotationIntrospectorAEQbTJ, annotatedMethod, null));
                }
            } else if (modeFindCreatorAnnotation != JsonCreator.Mode.DISABLED) {
                if (parameterCount == 0) {
                    c5560Wk.OLrzqt(annotatedMethod);
                } else {
                    int i = AnonymousClass3.OLrzqt[modeFindCreatorAnnotation.ordinal()];
                    if (i == 1) {
                        _addExplicitDelegatingCreator(deserializationContext, abstractC5549Vz, c5560Wk, C5564Wo.copydefault(annotationIntrospectorAEQbTJ, annotatedMethod, null));
                    } else if (i == 2) {
                        _addExplicitPropertyCreator(deserializationContext, abstractC5549Vz, c5560Wk, C5564Wo.copydefault(annotationIntrospectorAEQbTJ, annotatedMethod, map.get(annotatedMethod)));
                    } else {
                        _addExplicitAnyCreator(deserializationContext, abstractC5549Vz, c5560Wk, C5564Wo.copydefault(annotationIntrospectorAEQbTJ, annotatedMethod, map.get(annotatedMethod)), ConstructorDetector.DEFAULT);
                    }
                    application.djBIcL();
                }
            }
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public void _addImplicitFactoryCreators(DeserializationContext deserializationContext, Application application, List<C5564Wo> list) throws JsonMappingException {
        int i;
        boolean z;
        VisibilityChecker<?> visibilityChecker;
        Map<AnnotatedWithParams, WT[]> map;
        Iterator<C5564Wo> it;
        SettableBeanProperty[] settableBeanPropertyArr;
        boolean z2;
        AnnotatedWithParams annotatedWithParams;
        AbstractC5549Vz abstractC5549Vz = application.EZpvd;
        C5560Wk c5560Wk = application.AYXKKw;
        AnnotationIntrospector annotationIntrospectorAEQbTJ = application.AEQbTJ();
        VisibilityChecker<?> visibilityChecker2 = application.AhwBna;
        Map<AnnotatedWithParams, WT[]> map2 = application.djBIcL;
        Iterator<C5564Wo> it2 = list.iterator();
        while (it2.hasNext()) {
            C5564Wo next = it2.next();
            int iAEQbTJ = next.AEQbTJ();
            AnnotatedWithParams annotatedWithParamsOLrzqt = next.OLrzqt();
            WT[] wtArr = map2.get(annotatedWithParamsOLrzqt);
            boolean z3 = true;
            if (iAEQbTJ == 1) {
                boolean z4 = false;
                WT wtValueOf = next.valueOf(0);
                if (!_checkIfCreatorPropertyBased(annotationIntrospectorAEQbTJ, annotatedWithParamsOLrzqt, wtValueOf)) {
                    _handleSingleArgumentCreator(c5560Wk, annotatedWithParamsOLrzqt, false, visibilityChecker2.isCreatorVisible(annotatedWithParamsOLrzqt));
                    if (wtValueOf != null) {
                        ((WZ) wtValueOf).OcIXYQ();
                    }
                } else {
                    SettableBeanProperty[] settableBeanPropertyArr2 = new SettableBeanProperty[iAEQbTJ];
                    int i2 = 0;
                    int i3 = 0;
                    int i4 = 0;
                    AnnotatedParameter annotatedParameter = null;
                    while (i2 < iAEQbTJ) {
                        AnnotatedParameter parameter = annotatedWithParamsOLrzqt.getParameter(i2);
                        WT wt = wtArr == null ? null : wtArr[i2];
                        JacksonInject.Value valueFindInjectableValue = annotationIntrospectorAEQbTJ.findInjectableValue(parameter);
                        PropertyName propertyNameIsConnected = wt == null ? null : wt.isConnected();
                        if (wt == null || !wt.wlaJM()) {
                            i = i2;
                            z = z3;
                            visibilityChecker = visibilityChecker2;
                            map = map2;
                            it = it2;
                            settableBeanPropertyArr = settableBeanPropertyArr2;
                            z2 = z4;
                            annotatedWithParams = annotatedWithParamsOLrzqt;
                            if (valueFindInjectableValue != null) {
                                i4++;
                                settableBeanPropertyArr[i] = constructCreatorProperty(deserializationContext, abstractC5549Vz, propertyNameIsConnected, i, parameter, valueFindInjectableValue);
                            } else if (annotationIntrospectorAEQbTJ.findUnwrappingNameTransformer(parameter) != null) {
                                _reportUnwrappedCreatorProperty(deserializationContext, abstractC5549Vz, parameter);
                            } else if (annotatedParameter == null) {
                                annotatedParameter = parameter;
                            }
                        } else {
                            i3++;
                            i = i2;
                            visibilityChecker = visibilityChecker2;
                            settableBeanPropertyArr = settableBeanPropertyArr2;
                            map = map2;
                            z2 = z4;
                            z = z3;
                            it = it2;
                            annotatedWithParams = annotatedWithParamsOLrzqt;
                            settableBeanPropertyArr[i] = constructCreatorProperty(deserializationContext, abstractC5549Vz, propertyNameIsConnected, i, parameter, valueFindInjectableValue);
                        }
                        i2 = i + 1;
                        settableBeanPropertyArr2 = settableBeanPropertyArr;
                        z4 = z2;
                        annotatedWithParamsOLrzqt = annotatedWithParams;
                        visibilityChecker2 = visibilityChecker;
                        map2 = map;
                        z3 = z;
                        it2 = it;
                    }
                    boolean z5 = z3;
                    VisibilityChecker<?> visibilityChecker3 = visibilityChecker2;
                    Map<AnnotatedWithParams, WT[]> map3 = map2;
                    Iterator<C5564Wo> it3 = it2;
                    SettableBeanProperty[] settableBeanPropertyArr3 = settableBeanPropertyArr2;
                    boolean z6 = z4;
                    AnnotatedWithParams annotatedWithParams2 = annotatedWithParamsOLrzqt;
                    if (i3 > 0 || i4 > 0) {
                        if (i3 + i4 == iAEQbTJ) {
                            c5560Wk.AEQbTJ(annotatedWithParams2, z6, settableBeanPropertyArr3);
                        } else if (i3 == 0 && i4 + 1 == iAEQbTJ) {
                            c5560Wk.OLrzqt(annotatedWithParams2, z6, settableBeanPropertyArr3, z6 ? 1 : 0);
                        } else {
                            Object[] objArr = new Object[2];
                            objArr[z6 ? 1 : 0] = Integer.valueOf(annotatedParameter == null ? -1 : annotatedParameter.getIndex());
                            objArr[z5 ? 1 : 0] = annotatedWithParams2;
                            deserializationContext.reportBadTypeDefinition(abstractC5549Vz, "Argument #%d of factory method %s has no property name annotation; must have name when multiple-parameter constructor annotated as Creator", objArr);
                        }
                    }
                    it2 = it3;
                    visibilityChecker2 = visibilityChecker3;
                    map2 = map3;
                }
            }
        }
    }

    public void _addExplicitDelegatingCreator(DeserializationContext deserializationContext, AbstractC5549Vz abstractC5549Vz, C5560Wk c5560Wk, C5564Wo c5564Wo) throws JsonMappingException {
        int iAEQbTJ = c5564Wo.AEQbTJ();
        SettableBeanProperty[] settableBeanPropertyArr = new SettableBeanProperty[iAEQbTJ];
        int i = -1;
        for (int i2 = 0; i2 < iAEQbTJ; i2++) {
            AnnotatedParameter annotatedParameterEZpvd = c5564Wo.EZpvd(i2);
            JacksonInject.Value valueOLrzqt = c5564Wo.OLrzqt(i2);
            if (valueOLrzqt != null) {
                settableBeanPropertyArr[i2] = constructCreatorProperty(deserializationContext, abstractC5549Vz, null, i2, annotatedParameterEZpvd, valueOLrzqt);
            } else if (i < 0) {
                i = i2;
            } else {
                deserializationContext.reportBadTypeDefinition(abstractC5549Vz, "More than one argument (#%d and #%d) left as delegating for Creator %s: only one allowed", Integer.valueOf(i), Integer.valueOf(i2), c5564Wo);
            }
        }
        if (i < 0) {
            deserializationContext.reportBadTypeDefinition(abstractC5549Vz, "No argument left as delegating for Creator %s: exactly one required", c5564Wo);
        }
        if (iAEQbTJ == 1) {
            _handleSingleArgumentCreator(c5560Wk, c5564Wo.OLrzqt(), true, true);
            WT wtValueOf = c5564Wo.valueOf(0);
            if (wtValueOf != null) {
                ((WZ) wtValueOf).OcIXYQ();
                return;
            }
            return;
        }
        c5560Wk.OLrzqt(c5564Wo.OLrzqt(), true, settableBeanPropertyArr, i);
    }

    public void _addExplicitPropertyCreator(DeserializationContext deserializationContext, AbstractC5549Vz abstractC5549Vz, C5560Wk c5560Wk, C5564Wo c5564Wo) throws JsonMappingException {
        int iAEQbTJ = c5564Wo.AEQbTJ();
        SettableBeanProperty[] settableBeanPropertyArr = new SettableBeanProperty[iAEQbTJ];
        int i = 0;
        while (i < iAEQbTJ) {
            JacksonInject.Value valueOLrzqt = c5564Wo.OLrzqt(i);
            AnnotatedParameter annotatedParameterEZpvd = c5564Wo.EZpvd(i);
            PropertyName propertyNameKWHzl = c5564Wo.KWHzl(i);
            if (propertyNameKWHzl == null) {
                if (deserializationContext.getAnnotationIntrospector().findUnwrappingNameTransformer(annotatedParameterEZpvd) != null) {
                    _reportUnwrappedCreatorProperty(deserializationContext, abstractC5549Vz, annotatedParameterEZpvd);
                }
                PropertyName propertyNameAEQbTJ = c5564Wo.AEQbTJ(i);
                _validateNamedPropertyParameter(deserializationContext, abstractC5549Vz, c5564Wo, i, propertyNameAEQbTJ, valueOLrzqt);
                propertyNameKWHzl = propertyNameAEQbTJ;
            }
            int i2 = i;
            settableBeanPropertyArr[i2] = constructCreatorProperty(deserializationContext, abstractC5549Vz, propertyNameKWHzl, i, annotatedParameterEZpvd, valueOLrzqt);
            i = i2 + 1;
        }
        c5560Wk.AEQbTJ(c5564Wo.OLrzqt(), true, settableBeanPropertyArr);
    }

    @Deprecated
    public void _addExplicitAnyCreator(DeserializationContext deserializationContext, AbstractC5549Vz abstractC5549Vz, C5560Wk c5560Wk, C5564Wo c5564Wo) throws JsonMappingException {
        _addExplicitAnyCreator(deserializationContext, abstractC5549Vz, c5560Wk, c5564Wo, deserializationContext.getConfig().getConstructorDetector());
    }

    public void _addExplicitAnyCreator(DeserializationContext deserializationContext, AbstractC5549Vz abstractC5549Vz, C5560Wk c5560Wk, C5564Wo c5564Wo, ConstructorDetector constructorDetector) throws JsonMappingException {
        PropertyName propertyName;
        boolean z;
        int iKWHzl;
        if (1 != c5564Wo.AEQbTJ()) {
            if (!constructorDetector.singleArgCreatorDefaultsToProperties() && (iKWHzl = c5564Wo.KWHzl()) >= 0 && (constructorDetector.singleArgCreatorDefaultsToDelegating() || c5564Wo.KWHzl(iKWHzl) == null)) {
                _addExplicitDelegatingCreator(deserializationContext, abstractC5549Vz, c5560Wk, c5564Wo);
                return;
            } else {
                _addExplicitPropertyCreator(deserializationContext, abstractC5549Vz, c5560Wk, c5564Wo);
                return;
            }
        }
        AnnotatedParameter annotatedParameterEZpvd = c5564Wo.EZpvd(0);
        JacksonInject.Value valueOLrzqt = c5564Wo.OLrzqt(0);
        int i = AnonymousClass3.AEQbTJ[constructorDetector.singleArgMode().ordinal()];
        if (i == 1) {
            propertyName = null;
            z = false;
        } else if (i == 2) {
            PropertyName propertyNameKWHzl = c5564Wo.KWHzl(0);
            if (propertyNameKWHzl == null) {
                _validateNamedPropertyParameter(deserializationContext, abstractC5549Vz, c5564Wo, 0, propertyNameKWHzl, valueOLrzqt);
            }
            z = true;
            propertyName = propertyNameKWHzl;
        } else {
            if (i == 3) {
                deserializationContext.reportBadTypeDefinition(abstractC5549Vz, "Single-argument constructor (%s) is annotated but no 'mode' defined; `CreatorDetector`configured with `SingleArgConstructor.REQUIRE_MODE`", c5564Wo.OLrzqt());
                return;
            }
            WT wtValueOf = c5564Wo.valueOf(0);
            PropertyName propertyNameCopydefault = c5564Wo.copydefault(0);
            z = (propertyNameCopydefault == null && valueOLrzqt == null) ? false : true;
            if (!z && wtValueOf != null) {
                propertyNameCopydefault = c5564Wo.KWHzl(0);
                z = propertyNameCopydefault != null && wtValueOf.copydefault();
            }
            propertyName = propertyNameCopydefault;
        }
        if (z) {
            c5560Wk.AEQbTJ(c5564Wo.OLrzqt(), true, new SettableBeanProperty[]{constructCreatorProperty(deserializationContext, abstractC5549Vz, propertyName, 0, annotatedParameterEZpvd, valueOLrzqt)});
            return;
        }
        _handleSingleArgumentCreator(c5560Wk, c5564Wo.OLrzqt(), true, true);
        WT wtValueOf2 = c5564Wo.valueOf(0);
        if (wtValueOf2 != null) {
            ((WZ) wtValueOf2).OcIXYQ();
        }
    }

    /* JADX INFO: renamed from: com.fasterxml.jackson.databind.deser.BasicDeserializerFactory$3, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass3 {
        public static final /* synthetic */ int[] AEQbTJ;
        public static final /* synthetic */ int[] OLrzqt;

        static {
            int[] iArr = new int[ConstructorDetector.SingleArgConstructor.values().length];
            AEQbTJ = iArr;
            try {
                iArr[ConstructorDetector.SingleArgConstructor.DELEGATING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                AEQbTJ[ConstructorDetector.SingleArgConstructor.PROPERTIES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AEQbTJ[ConstructorDetector.SingleArgConstructor.REQUIRE_MODE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AEQbTJ[ConstructorDetector.SingleArgConstructor.HEURISTIC.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[JsonCreator.Mode.values().length];
            OLrzqt = iArr2;
            try {
                iArr2[JsonCreator.Mode.DELEGATING.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                OLrzqt[JsonCreator.Mode.PROPERTIES.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                OLrzqt[JsonCreator.Mode.DEFAULT.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    private boolean _checkIfCreatorPropertyBased(AnnotationIntrospector annotationIntrospector, AnnotatedWithParams annotatedWithParams, WT wt) {
        String name;
        if ((wt == null || !wt.wlaJM()) && annotationIntrospector.findInjectableValue(annotatedWithParams.getParameter(0)) == null) {
            return (wt == null || (name = wt.getName()) == null || name.isEmpty() || !wt.copydefault()) ? false : true;
        }
        return true;
    }

    private void _checkImplicitlyNamedConstructors(DeserializationContext deserializationContext, AbstractC5549Vz abstractC5549Vz, VisibilityChecker<?> visibilityChecker, AnnotationIntrospector annotationIntrospector, C5560Wk c5560Wk, List<AnnotatedWithParams> list) throws JsonMappingException {
        int i;
        Iterator<AnnotatedWithParams> it = list.iterator();
        AnnotatedWithParams annotatedWithParams = null;
        AnnotatedWithParams annotatedWithParams2 = null;
        SettableBeanProperty[] settableBeanPropertyArr = null;
        while (true) {
            if (!it.hasNext()) {
                annotatedWithParams = annotatedWithParams2;
                break;
            }
            AnnotatedWithParams next = it.next();
            if (visibilityChecker.isCreatorVisible(next)) {
                int parameterCount = next.getParameterCount();
                SettableBeanProperty[] settableBeanPropertyArr2 = new SettableBeanProperty[parameterCount];
                int i2 = 0;
                while (true) {
                    if (i2 < parameterCount) {
                        AnnotatedParameter parameter = next.getParameter(i2);
                        PropertyName propertyName_findParamName = _findParamName(parameter, annotationIntrospector);
                        if (propertyName_findParamName == null || propertyName_findParamName.isEmpty()) {
                            break;
                        }
                        settableBeanPropertyArr2[i2] = constructCreatorProperty(deserializationContext, abstractC5549Vz, propertyName_findParamName, parameter.getIndex(), parameter, null);
                        i2++;
                    } else {
                        if (annotatedWithParams2 != null) {
                            break;
                        }
                        annotatedWithParams2 = next;
                        settableBeanPropertyArr = settableBeanPropertyArr2;
                    }
                }
            }
        }
        if (annotatedWithParams != null) {
            c5560Wk.AEQbTJ(annotatedWithParams, false, settableBeanPropertyArr);
            WW ww = (WW) abstractC5549Vz;
            for (SettableBeanProperty settableBeanProperty : settableBeanPropertyArr) {
                PropertyName fullName = settableBeanProperty.getFullName();
                if (!ww.OLrzqt(fullName)) {
                    ww.copydefault(YB.EZpvd(deserializationContext.getConfig(), settableBeanProperty.getMember(), fullName));
                }
            }
        }
    }

    public boolean _handleSingleArgumentCreator(C5560Wk c5560Wk, AnnotatedWithParams annotatedWithParams, boolean z, boolean z2) {
        Class<?> rawParameterType = annotatedWithParams.getRawParameterType(0);
        if (rawParameterType == String.class || rawParameterType == CLASS_CHAR_SEQUENCE) {
            if (z || z2) {
                c5560Wk.AYXKKw(annotatedWithParams, z);
            }
            return true;
        }
        if (rawParameterType == Integer.TYPE || rawParameterType == Integer.class) {
            if (z || z2) {
                c5560Wk.OLrzqt(annotatedWithParams, z);
            }
            return true;
        }
        if (rawParameterType == Long.TYPE || rawParameterType == Long.class) {
            if (z || z2) {
                c5560Wk.gEmmrt(annotatedWithParams, z);
            }
            return true;
        }
        if (rawParameterType == Double.TYPE || rawParameterType == Double.class) {
            if (z || z2) {
                c5560Wk.EZpvd(annotatedWithParams, z);
            }
            return true;
        }
        if (rawParameterType == Boolean.TYPE || rawParameterType == Boolean.class) {
            if (z || z2) {
                c5560Wk.copydefault(annotatedWithParams, z);
            }
            return true;
        }
        if (rawParameterType == BigInteger.class && (z || z2)) {
            c5560Wk.AEQbTJ(annotatedWithParams, z);
        }
        if (rawParameterType == BigDecimal.class && (z || z2)) {
            c5560Wk.KWHzl(annotatedWithParams, z);
        }
        if (!z) {
            return false;
        }
        c5560Wk.OLrzqt(annotatedWithParams, z, null, 0);
        return true;
    }

    public void _validateNamedPropertyParameter(DeserializationContext deserializationContext, AbstractC5549Vz abstractC5549Vz, C5564Wo c5564Wo, int i, PropertyName propertyName, JacksonInject.Value value) throws JsonMappingException {
        if (propertyName == null && value == null) {
            deserializationContext.reportBadTypeDefinition(abstractC5549Vz, "Argument #%d of constructor %s has no property name (and is not Injectable): can not use as property-based Creator", Integer.valueOf(i), c5564Wo);
        }
    }

    public void _reportUnwrappedCreatorProperty(DeserializationContext deserializationContext, AbstractC5549Vz abstractC5549Vz, AnnotatedParameter annotatedParameter) throws JsonMappingException {
        deserializationContext.reportBadTypeDefinition(abstractC5549Vz, "Cannot define Creator parameter %d as `@JsonUnwrapped`: combination not yet supported", Integer.valueOf(annotatedParameter.getIndex()));
    }

    public SettableBeanProperty constructCreatorProperty(DeserializationContext deserializationContext, AbstractC5549Vz abstractC5549Vz, PropertyName propertyName, int i, AnnotatedParameter annotatedParameter, JacksonInject.Value value) throws JsonMappingException {
        PropertyName propertyNameFindWrapperName;
        PropertyMetadata propertyMetadata;
        DeserializationConfig config = deserializationContext.getConfig();
        AnnotationIntrospector annotationIntrospector = deserializationContext.getAnnotationIntrospector();
        if (annotationIntrospector == null) {
            propertyMetadata = PropertyMetadata.STD_REQUIRED_OR_OPTIONAL;
            propertyNameFindWrapperName = null;
        } else {
            PropertyMetadata propertyMetadataConstruct = PropertyMetadata.construct(annotationIntrospector.hasRequiredMarker(annotatedParameter), annotationIntrospector.findPropertyDescription(annotatedParameter), annotationIntrospector.findPropertyIndex(annotatedParameter), annotationIntrospector.findPropertyDefaultValue(annotatedParameter));
            propertyNameFindWrapperName = annotationIntrospector.findWrapperName(annotatedParameter);
            propertyMetadata = propertyMetadataConstruct;
        }
        JavaType javaTypeResolveMemberAndTypeAnnotations = resolveMemberAndTypeAnnotations(deserializationContext, annotatedParameter, annotatedParameter.getType());
        BeanProperty.Std std = new BeanProperty.Std(propertyName, javaTypeResolveMemberAndTypeAnnotations, propertyNameFindWrapperName, annotatedParameter, propertyMetadata);
        AbstractC5597Xv abstractC5597XvFindTypeDeserializer = (AbstractC5597Xv) javaTypeResolveMemberAndTypeAnnotations.getTypeHandler();
        if (abstractC5597XvFindTypeDeserializer == null) {
            abstractC5597XvFindTypeDeserializer = findTypeDeserializer(config, javaTypeResolveMemberAndTypeAnnotations);
        }
        CreatorProperty creatorPropertyConstruct = CreatorProperty.construct(propertyName, javaTypeResolveMemberAndTypeAnnotations, std.getWrapperName(), abstractC5597XvFindTypeDeserializer, abstractC5549Vz.fJNWhG(), annotatedParameter, i, value, _getSetterInfo(deserializationContext, std, propertyMetadata));
        AbstractC5548Vy<?> abstractC5548VyFindDeserializerFromAnnotation = findDeserializerFromAnnotation(deserializationContext, annotatedParameter);
        if (abstractC5548VyFindDeserializerFromAnnotation == null) {
            abstractC5548VyFindDeserializerFromAnnotation = (AbstractC5548Vy) javaTypeResolveMemberAndTypeAnnotations.getValueHandler();
        }
        return abstractC5548VyFindDeserializerFromAnnotation != null ? creatorPropertyConstruct.withValueDeserializer(deserializationContext.handlePrimaryContextualization(abstractC5548VyFindDeserializerFromAnnotation, creatorPropertyConstruct, javaTypeResolveMemberAndTypeAnnotations)) : creatorPropertyConstruct;
    }

    private PropertyName _findParamName(AnnotatedParameter annotatedParameter, AnnotationIntrospector annotationIntrospector) {
        if (annotationIntrospector == null) {
            return null;
        }
        PropertyName propertyNameFindNameForDeserialization = annotationIntrospector.findNameForDeserialization(annotatedParameter);
        if (propertyNameFindNameForDeserialization != null && !propertyNameFindNameForDeserialization.isEmpty()) {
            return propertyNameFindNameForDeserialization;
        }
        String strFindImplicitPropertyName = annotationIntrospector.findImplicitPropertyName(annotatedParameter);
        if (strFindImplicitPropertyName == null || strFindImplicitPropertyName.isEmpty()) {
            return null;
        }
        return PropertyName.construct(strFindImplicitPropertyName);
    }

    public PropertyMetadata _getSetterInfo(DeserializationContext deserializationContext, BeanProperty beanProperty, PropertyMetadata propertyMetadata) {
        Nulls nullsNonDefaultContentNulls;
        Nulls nullsNonDefaultValueNulls;
        JsonSetter.Value valueFindSetterInfo;
        AnnotationIntrospector annotationIntrospector = deserializationContext.getAnnotationIntrospector();
        DeserializationConfig config = deserializationContext.getConfig();
        AnnotatedMember member = beanProperty.getMember();
        Nulls nullsNonDefaultValueNulls2 = null;
        if (member != null) {
            if (annotationIntrospector == null || (valueFindSetterInfo = annotationIntrospector.findSetterInfo(member)) == null) {
                nullsNonDefaultValueNulls = null;
            } else {
                nullsNonDefaultValueNulls = valueFindSetterInfo.nonDefaultValueNulls();
                nullsNonDefaultValueNulls2 = valueFindSetterInfo.nonDefaultContentNulls();
            }
            JsonSetter.Value setterInfo = config.getConfigOverride(beanProperty.getType().getRawClass()).getSetterInfo();
            if (setterInfo != null) {
                Nulls nullsNonDefaultValueNulls3 = nullsNonDefaultValueNulls == null ? setterInfo.nonDefaultValueNulls() : nullsNonDefaultValueNulls;
                if (nullsNonDefaultValueNulls2 == null) {
                    nullsNonDefaultValueNulls2 = setterInfo.nonDefaultContentNulls();
                }
                nullsNonDefaultContentNulls = nullsNonDefaultValueNulls2;
                nullsNonDefaultValueNulls2 = nullsNonDefaultValueNulls3;
            } else {
                nullsNonDefaultContentNulls = nullsNonDefaultValueNulls2;
                nullsNonDefaultValueNulls2 = nullsNonDefaultValueNulls;
            }
        } else {
            nullsNonDefaultContentNulls = null;
        }
        JsonSetter.Value defaultSetterInfo = config.getDefaultSetterInfo();
        if (nullsNonDefaultValueNulls2 == null) {
            nullsNonDefaultValueNulls2 = defaultSetterInfo.nonDefaultValueNulls();
        }
        if (nullsNonDefaultContentNulls == null) {
            nullsNonDefaultContentNulls = defaultSetterInfo.nonDefaultContentNulls();
        }
        return (nullsNonDefaultValueNulls2 == null && nullsNonDefaultContentNulls == null) ? propertyMetadata : propertyMetadata.withNulls(nullsNonDefaultValueNulls2, nullsNonDefaultContentNulls);
    }

    @Override // o.AbstractC5550Wa
    public AbstractC5548Vy<?> createArrayDeserializer(DeserializationContext deserializationContext, ArrayType arrayType, AbstractC5549Vz abstractC5549Vz) throws JsonMappingException {
        DeserializationConfig config = deserializationContext.getConfig();
        JavaType contentType = arrayType.getContentType();
        AbstractC5548Vy<?> abstractC5548Vy = (AbstractC5548Vy) contentType.getValueHandler();
        AbstractC5597Xv abstractC5597XvFindTypeDeserializer = (AbstractC5597Xv) contentType.getTypeHandler();
        if (abstractC5597XvFindTypeDeserializer == null) {
            abstractC5597XvFindTypeDeserializer = findTypeDeserializer(config, contentType);
        }
        AbstractC5597Xv abstractC5597Xv = abstractC5597XvFindTypeDeserializer;
        AbstractC5548Vy<?> abstractC5548Vy_findCustomArrayDeserializer = _findCustomArrayDeserializer(arrayType, config, abstractC5549Vz, abstractC5597Xv, abstractC5548Vy);
        if (abstractC5548Vy_findCustomArrayDeserializer == null) {
            if (abstractC5548Vy == null) {
                Class<?> rawClass = contentType.getRawClass();
                if (contentType.isPrimitive()) {
                    return PrimitiveArrayDeserializers.forType(rawClass);
                }
                if (rawClass == String.class) {
                    return StringArrayDeserializer.instance;
                }
            }
            abstractC5548Vy_findCustomArrayDeserializer = new ObjectArrayDeserializer(arrayType, abstractC5548Vy, abstractC5597Xv);
        }
        if (this._factoryConfig.hasDeserializerModifiers()) {
            Iterator<VX> it = this._factoryConfig.deserializerModifiers().iterator();
            while (it.hasNext()) {
                abstractC5548Vy_findCustomArrayDeserializer = it.next().AEQbTJ(config, arrayType, abstractC5549Vz, abstractC5548Vy_findCustomArrayDeserializer);
            }
        }
        return abstractC5548Vy_findCustomArrayDeserializer;
    }

    @Override // o.AbstractC5550Wa
    public AbstractC5548Vy<?> createCollectionDeserializer(DeserializationContext deserializationContext, CollectionType collectionType, AbstractC5549Vz abstractC5549Vz) throws JsonMappingException {
        AbstractC5548Vy<?> collectionDeserializer;
        JavaType contentType = collectionType.getContentType();
        AbstractC5548Vy<?> abstractC5548Vy = (AbstractC5548Vy) contentType.getValueHandler();
        DeserializationConfig config = deserializationContext.getConfig();
        AbstractC5597Xv abstractC5597XvFindTypeDeserializer = (AbstractC5597Xv) contentType.getTypeHandler();
        if (abstractC5597XvFindTypeDeserializer == null) {
            abstractC5597XvFindTypeDeserializer = findTypeDeserializer(config, contentType);
        }
        AbstractC5597Xv abstractC5597Xv = abstractC5597XvFindTypeDeserializer;
        AbstractC5548Vy<?> abstractC5548Vy_findCustomCollectionDeserializer = _findCustomCollectionDeserializer(collectionType, config, abstractC5549Vz, abstractC5597Xv, abstractC5548Vy);
        if (abstractC5548Vy_findCustomCollectionDeserializer == null) {
            Class<?> rawClass = collectionType.getRawClass();
            if (abstractC5548Vy == null && EnumSet.class.isAssignableFrom(rawClass)) {
                abstractC5548Vy_findCustomCollectionDeserializer = new EnumSetDeserializer(contentType, null);
            }
        }
        if (abstractC5548Vy_findCustomCollectionDeserializer == null) {
            if (collectionType.isInterface() || collectionType.isAbstract()) {
                CollectionType collectionType_mapAbstractCollectionType = _mapAbstractCollectionType(collectionType, config);
                if (collectionType_mapAbstractCollectionType == null) {
                    if (collectionType.getTypeHandler() == null) {
                        throw new IllegalArgumentException("Cannot find a deserializer for non-concrete Collection type " + collectionType);
                    }
                    abstractC5548Vy_findCustomCollectionDeserializer = AbstractDeserializer.constructForNonPOJO(abstractC5549Vz);
                } else {
                    abstractC5549Vz = config.introspectForCreation(collectionType_mapAbstractCollectionType);
                    collectionType = collectionType_mapAbstractCollectionType;
                }
            }
            if (abstractC5548Vy_findCustomCollectionDeserializer == null) {
                ValueInstantiator valueInstantiatorFindValueInstantiator = findValueInstantiator(deserializationContext, abstractC5549Vz);
                if (!valueInstantiatorFindValueInstantiator.canCreateUsingDefault()) {
                    if (collectionType.hasRawClass(ArrayBlockingQueue.class)) {
                        return new ArrayBlockingQueueDeserializer(collectionType, abstractC5548Vy, abstractC5597Xv, valueInstantiatorFindValueInstantiator);
                    }
                    AbstractC5548Vy<?> abstractC5548VyAEQbTJ = AbstractC5568Ws.AEQbTJ(deserializationContext, collectionType);
                    if (abstractC5548VyAEQbTJ != null) {
                        return abstractC5548VyAEQbTJ;
                    }
                }
                if (contentType.hasRawClass(String.class)) {
                    collectionDeserializer = new StringCollectionDeserializer(collectionType, abstractC5548Vy, valueInstantiatorFindValueInstantiator);
                } else {
                    collectionDeserializer = new CollectionDeserializer(collectionType, abstractC5548Vy, abstractC5597Xv, valueInstantiatorFindValueInstantiator);
                }
                abstractC5548Vy_findCustomCollectionDeserializer = collectionDeserializer;
            }
        }
        if (this._factoryConfig.hasDeserializerModifiers()) {
            Iterator<VX> it = this._factoryConfig.deserializerModifiers().iterator();
            while (it.hasNext()) {
                abstractC5548Vy_findCustomCollectionDeserializer = it.next().EZpvd(config, collectionType, abstractC5549Vz, abstractC5548Vy_findCustomCollectionDeserializer);
            }
        }
        return abstractC5548Vy_findCustomCollectionDeserializer;
    }

    public CollectionType _mapAbstractCollectionType(JavaType javaType, DeserializationConfig deserializationConfig) {
        Class<?> clsKWHzl = StateListAnimator.KWHzl(javaType);
        if (clsKWHzl != null) {
            return (CollectionType) deserializationConfig.getTypeFactory().constructSpecializedType(javaType, clsKWHzl, true);
        }
        return null;
    }

    @Override // o.AbstractC5550Wa
    public AbstractC5548Vy<?> createCollectionLikeDeserializer(DeserializationContext deserializationContext, CollectionLikeType collectionLikeType, AbstractC5549Vz abstractC5549Vz) throws JsonMappingException {
        JavaType contentType = collectionLikeType.getContentType();
        AbstractC5548Vy<?> abstractC5548Vy = (AbstractC5548Vy) contentType.getValueHandler();
        DeserializationConfig config = deserializationContext.getConfig();
        AbstractC5597Xv abstractC5597Xv = (AbstractC5597Xv) contentType.getTypeHandler();
        AbstractC5548Vy<?> abstractC5548Vy_findCustomCollectionLikeDeserializer = _findCustomCollectionLikeDeserializer(collectionLikeType, config, abstractC5549Vz, abstractC5597Xv == null ? findTypeDeserializer(config, contentType) : abstractC5597Xv, abstractC5548Vy);
        if (abstractC5548Vy_findCustomCollectionLikeDeserializer != null && this._factoryConfig.hasDeserializerModifiers()) {
            Iterator<VX> it = this._factoryConfig.deserializerModifiers().iterator();
            while (it.hasNext()) {
                abstractC5548Vy_findCustomCollectionLikeDeserializer = it.next().copydefault(config, collectionLikeType, abstractC5549Vz, abstractC5548Vy_findCustomCollectionLikeDeserializer);
            }
        }
        return abstractC5548Vy_findCustomCollectionLikeDeserializer;
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:60:0x012f */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0114  */
    @Override // o.AbstractC5550Wa
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AbstractC5548Vy<?> createMapDeserializer(DeserializationContext deserializationContext, MapType mapType, AbstractC5549Vz abstractC5549Vz) throws JsonMappingException {
        AbstractC5549Vz abstractC5549VzIntrospectForCreation;
        AbstractC5548Vy<?> abstractC5548VyAEQbTJ;
        MapType mapType_mapAbstractMapType;
        AbstractC5548Vy<?> abstractC5548Vy;
        ValueInstantiator valueInstantiatorFindValueInstantiator;
        DeserializationConfig config = deserializationContext.getConfig();
        JavaType keyType = mapType.getKeyType();
        JavaType contentType = mapType.getContentType();
        AbstractC5548Vy<?> abstractC5548Vy2 = (AbstractC5548Vy) contentType.getValueHandler();
        VC vc = (VC) keyType.getValueHandler();
        AbstractC5597Xv abstractC5597Xv = (AbstractC5597Xv) contentType.getTypeHandler();
        AbstractC5597Xv abstractC5597XvFindTypeDeserializer = abstractC5597Xv == null ? findTypeDeserializer(config, contentType) : abstractC5597Xv;
        AbstractC5548Vy<?> abstractC5548Vy_findCustomMapDeserializer = _findCustomMapDeserializer(mapType, config, abstractC5549Vz, vc, abstractC5597XvFindTypeDeserializer, abstractC5548Vy2);
        if (abstractC5548Vy_findCustomMapDeserializer == null) {
            Class<?> rawClass = mapType.getRawClass();
            if (EnumMap.class.isAssignableFrom(rawClass)) {
                if (rawClass == EnumMap.class) {
                    abstractC5549VzIntrospectForCreation = abstractC5549Vz;
                    valueInstantiatorFindValueInstantiator = null;
                } else {
                    abstractC5549VzIntrospectForCreation = abstractC5549Vz;
                    valueInstantiatorFindValueInstantiator = findValueInstantiator(deserializationContext, abstractC5549VzIntrospectForCreation);
                }
                if (!keyType.isEnumImplType()) {
                    throw new IllegalArgumentException("Cannot construct EnumMap; generic (key) type not available");
                }
                abstractC5548Vy_findCustomMapDeserializer = new EnumMapDeserializer(mapType, valueInstantiatorFindValueInstantiator, null, abstractC5548Vy2, abstractC5597XvFindTypeDeserializer, null);
            } else {
                abstractC5549VzIntrospectForCreation = abstractC5549Vz;
            }
            if (abstractC5548Vy_findCustomMapDeserializer == null) {
                if (mapType.isInterface() || mapType.isAbstract()) {
                    mapType_mapAbstractMapType = _mapAbstractMapType(mapType, config);
                    if (mapType_mapAbstractMapType != null) {
                        mapType_mapAbstractMapType.getRawClass();
                        abstractC5549VzIntrospectForCreation = config.introspectForCreation(mapType_mapAbstractMapType);
                    } else {
                        if (mapType.getTypeHandler() == null) {
                            throw new IllegalArgumentException("Cannot find a deserializer for non-concrete Map type " + mapType);
                        }
                        abstractC5548Vy_findCustomMapDeserializer = AbstractDeserializer.constructForNonPOJO(abstractC5549Vz);
                        mapType_mapAbstractMapType = mapType;
                    }
                    abstractC5548Vy = abstractC5548Vy_findCustomMapDeserializer;
                } else {
                    AbstractC5548Vy<?> abstractC5548VyCopydefault = AbstractC5568Ws.copydefault(deserializationContext, mapType);
                    if (abstractC5548VyCopydefault != null) {
                        return abstractC5548VyCopydefault;
                    }
                    abstractC5548Vy = abstractC5548VyCopydefault;
                    mapType_mapAbstractMapType = mapType;
                }
                AbstractC5549Vz abstractC5549Vz2 = abstractC5549VzIntrospectForCreation;
                AbstractC5548Vy<?> abstractC5548Vy3 = abstractC5548Vy;
                if (abstractC5548Vy == null) {
                    MapDeserializer mapDeserializer = new MapDeserializer(mapType_mapAbstractMapType, findValueInstantiator(deserializationContext, abstractC5549Vz2), vc, abstractC5548Vy2, abstractC5597XvFindTypeDeserializer);
                    JsonIgnoreProperties.Value defaultPropertyIgnorals = config.getDefaultPropertyIgnorals(Map.class, abstractC5549Vz2.AuCTel());
                    mapDeserializer.setIgnorableProperties(defaultPropertyIgnorals == null ? null : defaultPropertyIgnorals.findIgnoredForDeserialization());
                    JsonIncludeProperties.Value defaultPropertyInclusions = config.getDefaultPropertyInclusions(Map.class, abstractC5549Vz2.AuCTel());
                    mapDeserializer.setIncludableProperties(defaultPropertyInclusions != null ? defaultPropertyInclusions.getIncluded() : null);
                    abstractC5548Vy3 = mapDeserializer;
                }
                abstractC5549VzIntrospectForCreation = abstractC5549Vz2;
                abstractC5548VyAEQbTJ = abstractC5548Vy3;
            }
            if (this._factoryConfig.hasDeserializerModifiers()) {
                Iterator<VX> it = this._factoryConfig.deserializerModifiers().iterator();
                abstractC5548VyAEQbTJ = abstractC5548VyAEQbTJ;
                while (it.hasNext()) {
                    abstractC5548VyAEQbTJ = it.next().AEQbTJ(config, mapType_mapAbstractMapType, abstractC5549VzIntrospectForCreation, abstractC5548VyAEQbTJ);
                }
            }
            return abstractC5548VyAEQbTJ;
        }
        abstractC5549VzIntrospectForCreation = abstractC5549Vz;
        abstractC5548VyAEQbTJ = abstractC5548Vy_findCustomMapDeserializer;
        mapType_mapAbstractMapType = mapType;
        if (this._factoryConfig.hasDeserializerModifiers()) {
        }
        return abstractC5548VyAEQbTJ;
    }

    public MapType _mapAbstractMapType(JavaType javaType, DeserializationConfig deserializationConfig) {
        Class<?> clsAEQbTJ = StateListAnimator.AEQbTJ(javaType);
        if (clsAEQbTJ != null) {
            return (MapType) deserializationConfig.getTypeFactory().constructSpecializedType(javaType, clsAEQbTJ, true);
        }
        return null;
    }

    @Override // o.AbstractC5550Wa
    public AbstractC5548Vy<?> createMapLikeDeserializer(DeserializationContext deserializationContext, MapLikeType mapLikeType, AbstractC5549Vz abstractC5549Vz) throws JsonMappingException {
        JavaType keyType = mapLikeType.getKeyType();
        JavaType contentType = mapLikeType.getContentType();
        DeserializationConfig config = deserializationContext.getConfig();
        AbstractC5548Vy<?> abstractC5548Vy = (AbstractC5548Vy) contentType.getValueHandler();
        VC vc = (VC) keyType.getValueHandler();
        AbstractC5597Xv abstractC5597XvFindTypeDeserializer = (AbstractC5597Xv) contentType.getTypeHandler();
        if (abstractC5597XvFindTypeDeserializer == null) {
            abstractC5597XvFindTypeDeserializer = findTypeDeserializer(config, contentType);
        }
        AbstractC5548Vy<?> abstractC5548Vy_findCustomMapLikeDeserializer = _findCustomMapLikeDeserializer(mapLikeType, config, abstractC5549Vz, vc, abstractC5597XvFindTypeDeserializer, abstractC5548Vy);
        if (abstractC5548Vy_findCustomMapLikeDeserializer != null && this._factoryConfig.hasDeserializerModifiers()) {
            Iterator<VX> it = this._factoryConfig.deserializerModifiers().iterator();
            while (it.hasNext()) {
                abstractC5548Vy_findCustomMapLikeDeserializer = it.next().KWHzl(config, mapLikeType, abstractC5549Vz, abstractC5548Vy_findCustomMapLikeDeserializer);
            }
        }
        return abstractC5548Vy_findCustomMapLikeDeserializer;
    }

    @Override // o.AbstractC5550Wa
    public AbstractC5548Vy<?> createEnumDeserializer(DeserializationContext deserializationContext, JavaType javaType, AbstractC5549Vz abstractC5549Vz) throws JsonMappingException {
        AbstractC5548Vy<?> abstractC5548VyDeserializerForCreator;
        DeserializationConfig config = deserializationContext.getConfig();
        Class<?> rawClass = javaType.getRawClass();
        AbstractC5548Vy<?> abstractC5548Vy_findCustomEnumDeserializer = _findCustomEnumDeserializer(rawClass, config, abstractC5549Vz);
        if (abstractC5548Vy_findCustomEnumDeserializer == null) {
            if (rawClass == Enum.class) {
                return AbstractDeserializer.constructForNonPOJO(abstractC5549Vz);
            }
            ValueInstantiator valueInstantiator_constructDefaultValueInstantiator = _constructDefaultValueInstantiator(deserializationContext, abstractC5549Vz);
            SettableBeanProperty[] fromObjectArguments = valueInstantiator_constructDefaultValueInstantiator == null ? null : valueInstantiator_constructDefaultValueInstantiator.getFromObjectArguments(deserializationContext.getConfig());
            Iterator<AnnotatedMethod> it = abstractC5549Vz.ejfBZ().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                AnnotatedMethod next = it.next();
                if (_hasCreatorAnnotation(deserializationContext, next)) {
                    if (next.getParameterCount() == 0) {
                        abstractC5548VyDeserializerForCreator = EnumDeserializer.deserializerForNoArgsCreator(config, rawClass, next);
                    } else {
                        if (!next.getRawReturnType().isAssignableFrom(rawClass)) {
                            deserializationContext.reportBadDefinition(javaType, String.format("Invalid `@JsonCreator` annotated Enum factory method [%s]: needs to return compatible type", next.toString()));
                        }
                        abstractC5548VyDeserializerForCreator = EnumDeserializer.deserializerForCreator(config, rawClass, next, valueInstantiator_constructDefaultValueInstantiator, fromObjectArguments);
                    }
                    abstractC5548Vy_findCustomEnumDeserializer = abstractC5548VyDeserializerForCreator;
                }
            }
            if (abstractC5548Vy_findCustomEnumDeserializer == null) {
                abstractC5548Vy_findCustomEnumDeserializer = new EnumDeserializer(constructEnumResolver(rawClass, config, abstractC5549Vz.valueOf()), Boolean.valueOf(config.isEnabled(MapperFeature.ACCEPT_CASE_INSENSITIVE_ENUMS)));
            }
        }
        if (this._factoryConfig.hasDeserializerModifiers()) {
            Iterator<VX> it2 = this._factoryConfig.deserializerModifiers().iterator();
            while (it2.hasNext()) {
                abstractC5548Vy_findCustomEnumDeserializer = it2.next().copydefault(config, javaType, abstractC5549Vz, abstractC5548Vy_findCustomEnumDeserializer);
            }
        }
        return abstractC5548Vy_findCustomEnumDeserializer;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.fasterxml.jackson.databind.deser.BasicDeserializerFactory */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC5550Wa
    public AbstractC5548Vy<?> createTreeDeserializer(DeserializationConfig deserializationConfig, JavaType javaType, AbstractC5549Vz abstractC5549Vz) throws JsonMappingException {
        Class<?> rawClass = javaType.getRawClass();
        AbstractC5548Vy<?> abstractC5548Vy_findCustomTreeNodeDeserializer = _findCustomTreeNodeDeserializer(rawClass, deserializationConfig, abstractC5549Vz);
        return abstractC5548Vy_findCustomTreeNodeDeserializer != null ? abstractC5548Vy_findCustomTreeNodeDeserializer : JsonNodeDeserializer.getDeserializer(rawClass);
    }

    @Override // o.AbstractC5550Wa
    public AbstractC5548Vy<?> createReferenceDeserializer(DeserializationContext deserializationContext, ReferenceType referenceType, AbstractC5549Vz abstractC5549Vz) throws JsonMappingException {
        JavaType contentType = referenceType.getContentType();
        AbstractC5548Vy<?> abstractC5548Vy = (AbstractC5548Vy) contentType.getValueHandler();
        DeserializationConfig config = deserializationContext.getConfig();
        AbstractC5597Xv abstractC5597XvFindTypeDeserializer = (AbstractC5597Xv) contentType.getTypeHandler();
        if (abstractC5597XvFindTypeDeserializer == null) {
            abstractC5597XvFindTypeDeserializer = findTypeDeserializer(config, contentType);
        }
        AbstractC5597Xv abstractC5597Xv = abstractC5597XvFindTypeDeserializer;
        AbstractC5548Vy<?> abstractC5548Vy_findCustomReferenceDeserializer = _findCustomReferenceDeserializer(referenceType, config, abstractC5549Vz, abstractC5597Xv, abstractC5548Vy);
        if (abstractC5548Vy_findCustomReferenceDeserializer == null && referenceType.isTypeOrSubTypeOf(AtomicReference.class)) {
            return new AtomicReferenceDeserializer(referenceType, referenceType.getRawClass() == AtomicReference.class ? null : findValueInstantiator(deserializationContext, abstractC5549Vz), abstractC5597Xv, abstractC5548Vy);
        }
        if (abstractC5548Vy_findCustomReferenceDeserializer != null && this._factoryConfig.hasDeserializerModifiers()) {
            Iterator<VX> it = this._factoryConfig.deserializerModifiers().iterator();
            while (it.hasNext()) {
                abstractC5548Vy_findCustomReferenceDeserializer = it.next().AEQbTJ(config, referenceType, abstractC5549Vz, abstractC5548Vy_findCustomReferenceDeserializer);
            }
        }
        return abstractC5548Vy_findCustomReferenceDeserializer;
    }

    @Override // o.AbstractC5550Wa
    public AbstractC5597Xv findTypeDeserializer(DeserializationConfig deserializationConfig, JavaType javaType) throws JsonMappingException {
        JavaType javaTypeMapAbstractType;
        WJ wjAuCTel = deserializationConfig.introspectClassAnnotations(javaType.getRawClass()).AuCTel();
        InterfaceC5599Xx<?> interfaceC5599XxFindTypeResolver = deserializationConfig.getAnnotationIntrospector().findTypeResolver(deserializationConfig, wjAuCTel, javaType);
        if (interfaceC5599XxFindTypeResolver == null && (interfaceC5599XxFindTypeResolver = deserializationConfig.getDefaultTyper(javaType)) == null) {
            return null;
        }
        Collection<NamedType> collectionCollectAndResolveSubtypesByTypeId = deserializationConfig.getSubtypeResolver().collectAndResolveSubtypesByTypeId(deserializationConfig, wjAuCTel);
        if (interfaceC5599XxFindTypeResolver.getDefaultImpl() == null && javaType.isAbstract() && (javaTypeMapAbstractType = mapAbstractType(deserializationConfig, javaType)) != null && !javaTypeMapAbstractType.hasRawClass(javaType.getRawClass())) {
            interfaceC5599XxFindTypeResolver = interfaceC5599XxFindTypeResolver.withDefaultImpl(javaTypeMapAbstractType.getRawClass());
        }
        try {
            return interfaceC5599XxFindTypeResolver.buildTypeDeserializer(deserializationConfig, javaType, collectionCollectAndResolveSubtypesByTypeId);
        } catch (IllegalArgumentException | IllegalStateException e) {
            throw InvalidDefinitionException.from((JsonParser) null, C5619Yr.EZpvd(e), javaType).withCause(e);
        }
    }

    public AbstractC5548Vy<?> findOptionalStdDeserializer(DeserializationContext deserializationContext, JavaType javaType, AbstractC5549Vz abstractC5549Vz) throws JsonMappingException {
        return OptionalHandlerFactory.instance.findDeserializer(javaType, deserializationContext.getConfig(), abstractC5549Vz);
    }

    @Override // o.AbstractC5550Wa
    public VC createKeyDeserializer(DeserializationContext deserializationContext, JavaType javaType) throws JsonMappingException {
        AbstractC5549Vz abstractC5549VzIntrospectClassAnnotations;
        DeserializationConfig config = deserializationContext.getConfig();
        VC vcCopydefault = null;
        if (this._factoryConfig.hasKeyDeserializers()) {
            abstractC5549VzIntrospectClassAnnotations = config.introspectClassAnnotations(javaType);
            Iterator<InterfaceC5556Wg> it = this._factoryConfig.keyDeserializers().iterator();
            while (it.hasNext() && (vcCopydefault = it.next().findKeyDeserializer(javaType, config, abstractC5549VzIntrospectClassAnnotations)) == null) {
            }
        } else {
            abstractC5549VzIntrospectClassAnnotations = null;
        }
        if (vcCopydefault == null) {
            if (abstractC5549VzIntrospectClassAnnotations == null) {
                abstractC5549VzIntrospectClassAnnotations = config.introspectClassAnnotations(javaType.getRawClass());
            }
            vcCopydefault = findKeyDeserializerFromAnnotation(deserializationContext, abstractC5549VzIntrospectClassAnnotations.AuCTel());
            if (vcCopydefault == null) {
                if (javaType.isEnumType()) {
                    vcCopydefault = _createEnumKeyDeserializer(deserializationContext, javaType);
                } else {
                    vcCopydefault = StdKeyDeserializers.findStringBasedKeyDeserializer(config, javaType);
                }
            }
        }
        if (vcCopydefault != null && this._factoryConfig.hasDeserializerModifiers()) {
            Iterator<VX> it2 = this._factoryConfig.deserializerModifiers().iterator();
            while (it2.hasNext()) {
                vcCopydefault = it2.next().copydefault(config, javaType, vcCopydefault);
            }
        }
        return vcCopydefault;
    }

    private VC _createEnumKeyDeserializer(DeserializationContext deserializationContext, JavaType javaType) throws JsonMappingException {
        DeserializationConfig config = deserializationContext.getConfig();
        Class<?> rawClass = javaType.getRawClass();
        AbstractC5549Vz abstractC5549VzIntrospect = config.introspect(javaType);
        VC vcFindKeyDeserializerFromAnnotation = findKeyDeserializerFromAnnotation(deserializationContext, abstractC5549VzIntrospect.AuCTel());
        if (vcFindKeyDeserializerFromAnnotation != null) {
            return vcFindKeyDeserializerFromAnnotation;
        }
        AbstractC5548Vy<?> abstractC5548Vy_findCustomEnumDeserializer = _findCustomEnumDeserializer(rawClass, config, abstractC5549VzIntrospect);
        if (abstractC5548Vy_findCustomEnumDeserializer != null) {
            return StdKeyDeserializers.constructDelegatingKeyDeserializer(config, javaType, abstractC5548Vy_findCustomEnumDeserializer);
        }
        AbstractC5548Vy<Object> abstractC5548VyFindDeserializerFromAnnotation = findDeserializerFromAnnotation(deserializationContext, abstractC5549VzIntrospect.AuCTel());
        if (abstractC5548VyFindDeserializerFromAnnotation != null) {
            return StdKeyDeserializers.constructDelegatingKeyDeserializer(config, javaType, abstractC5548VyFindDeserializerFromAnnotation);
        }
        EnumResolver enumResolverConstructEnumResolver = constructEnumResolver(rawClass, config, abstractC5549VzIntrospect.valueOf());
        for (AnnotatedMethod annotatedMethod : abstractC5549VzIntrospect.ejfBZ()) {
            if (_hasCreatorAnnotation(deserializationContext, annotatedMethod)) {
                if (annotatedMethod.getParameterCount() != 1 || !annotatedMethod.getRawReturnType().isAssignableFrom(rawClass)) {
                    throw new IllegalArgumentException("Unsuitable method (" + annotatedMethod + ") decorated with @JsonCreator (for Enum type " + rawClass.getName() + ")");
                }
                if (annotatedMethod.getRawParameterType(0) == String.class) {
                    if (config.canOverrideAccessModifiers()) {
                        C5619Yr.EZpvd(annotatedMethod.getMember(), deserializationContext.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
                    }
                    return StdKeyDeserializers.constructEnumKeyDeserializer(enumResolverConstructEnumResolver, annotatedMethod);
                }
            }
        }
        return StdKeyDeserializers.constructEnumKeyDeserializer(enumResolverConstructEnumResolver);
    }

    @Override // o.AbstractC5550Wa
    public boolean hasExplicitDeserializerFor(DeserializationConfig deserializationConfig, Class<?> cls) {
        while (cls.isArray()) {
            cls = cls.getComponentType();
        }
        if (Enum.class.isAssignableFrom(cls)) {
            return true;
        }
        String name = cls.getName();
        if (name.startsWith("java.")) {
            if (Collection.class.isAssignableFrom(cls) || Map.class.isAssignableFrom(cls)) {
                return true;
            }
            return Number.class.isAssignableFrom(cls) ? NumberDeserializers.KWHzl(cls, name) != null : C5570Wu.copydefault(cls) || cls == CLASS_STRING || cls == Boolean.class || cls == EnumMap.class || cls == AtomicReference.class || DateDeserializers.EZpvd(cls);
        }
        if (name.startsWith("com.fasterxml.")) {
            return JsonNode.class.isAssignableFrom(cls) || cls == YA.class;
        }
        return OptionalHandlerFactory.instance.hasDeserializerFor(cls);
    }

    public AbstractC5597Xv findPropertyTypeDeserializer(DeserializationConfig deserializationConfig, JavaType javaType, AnnotatedMember annotatedMember) throws JsonMappingException {
        InterfaceC5599Xx<?> interfaceC5599XxFindPropertyTypeResolver = deserializationConfig.getAnnotationIntrospector().findPropertyTypeResolver(deserializationConfig, annotatedMember, javaType);
        if (interfaceC5599XxFindPropertyTypeResolver == null) {
            return findTypeDeserializer(deserializationConfig, javaType);
        }
        try {
            return interfaceC5599XxFindPropertyTypeResolver.buildTypeDeserializer(deserializationConfig, javaType, deserializationConfig.getSubtypeResolver().collectAndResolveSubtypesByTypeId(deserializationConfig, annotatedMember, javaType));
        } catch (IllegalArgumentException | IllegalStateException e) {
            throw InvalidDefinitionException.from((JsonParser) null, C5619Yr.EZpvd(e), javaType).withCause(e);
        }
    }

    public AbstractC5597Xv findPropertyContentTypeDeserializer(DeserializationConfig deserializationConfig, JavaType javaType, AnnotatedMember annotatedMember) throws JsonMappingException {
        InterfaceC5599Xx<?> interfaceC5599XxFindPropertyContentTypeResolver = deserializationConfig.getAnnotationIntrospector().findPropertyContentTypeResolver(deserializationConfig, annotatedMember, javaType);
        JavaType contentType = javaType.getContentType();
        if (interfaceC5599XxFindPropertyContentTypeResolver == null) {
            return findTypeDeserializer(deserializationConfig, contentType);
        }
        return interfaceC5599XxFindPropertyContentTypeResolver.buildTypeDeserializer(deserializationConfig, contentType, deserializationConfig.getSubtypeResolver().collectAndResolveSubtypesByTypeId(deserializationConfig, annotatedMember, contentType));
    }

    public AbstractC5548Vy<?> findDefaultDeserializer(DeserializationContext deserializationContext, JavaType javaType, AbstractC5549Vz abstractC5549Vz) throws JsonMappingException {
        JavaType javaType_findRemappedType;
        JavaType javaType_findRemappedType2;
        Class<?> rawClass = javaType.getRawClass();
        if (rawClass == CLASS_OBJECT || rawClass == CLASS_SERIALIZABLE) {
            DeserializationConfig config = deserializationContext.getConfig();
            if (this._factoryConfig.hasAbstractTypeResolvers()) {
                javaType_findRemappedType = _findRemappedType(config, List.class);
                javaType_findRemappedType2 = _findRemappedType(config, Map.class);
            } else {
                javaType_findRemappedType = null;
                javaType_findRemappedType2 = null;
            }
            return new UntypedObjectDeserializer(javaType_findRemappedType, javaType_findRemappedType2);
        }
        if (rawClass == CLASS_STRING || rawClass == CLASS_CHAR_SEQUENCE) {
            return StringDeserializer.instance;
        }
        Class<?> cls = CLASS_ITERABLE;
        if (rawClass == cls) {
            TypeFactory typeFactory = deserializationContext.getTypeFactory();
            JavaType[] javaTypeArrFindTypeParameters = typeFactory.findTypeParameters(javaType, cls);
            return createCollectionDeserializer(deserializationContext, typeFactory.constructCollectionType(Collection.class, (javaTypeArrFindTypeParameters == null || javaTypeArrFindTypeParameters.length != 1) ? TypeFactory.unknownType() : javaTypeArrFindTypeParameters[0]), abstractC5549Vz);
        }
        if (rawClass == CLASS_MAP_ENTRY) {
            JavaType javaTypeContainedTypeOrUnknown = javaType.containedTypeOrUnknown(0);
            JavaType javaTypeContainedTypeOrUnknown2 = javaType.containedTypeOrUnknown(1);
            AbstractC5597Xv abstractC5597XvFindTypeDeserializer = (AbstractC5597Xv) javaTypeContainedTypeOrUnknown2.getTypeHandler();
            if (abstractC5597XvFindTypeDeserializer == null) {
                abstractC5597XvFindTypeDeserializer = findTypeDeserializer(deserializationContext.getConfig(), javaTypeContainedTypeOrUnknown2);
            }
            return new MapEntryDeserializer(javaType, (VC) javaTypeContainedTypeOrUnknown.getValueHandler(), (AbstractC5548Vy<Object>) javaTypeContainedTypeOrUnknown2.getValueHandler(), abstractC5597XvFindTypeDeserializer);
        }
        String name = rawClass.getName();
        if (rawClass.isPrimitive() || name.startsWith("java.")) {
            AbstractC5548Vy<?> abstractC5548VyKWHzl = NumberDeserializers.KWHzl(rawClass, name);
            if (abstractC5548VyKWHzl == null) {
                abstractC5548VyKWHzl = DateDeserializers.copydefault(rawClass, name);
            }
            if (abstractC5548VyKWHzl != null) {
                return abstractC5548VyKWHzl;
            }
        }
        if (rawClass == YA.class) {
            return new TokenBufferDeserializer();
        }
        AbstractC5548Vy<?> abstractC5548VyFindOptionalStdDeserializer = findOptionalStdDeserializer(deserializationContext, javaType, abstractC5549Vz);
        return abstractC5548VyFindOptionalStdDeserializer != null ? abstractC5548VyFindOptionalStdDeserializer : C5570Wu.copydefault(deserializationContext, rawClass, name);
    }

    public JavaType _findRemappedType(DeserializationConfig deserializationConfig, Class<?> cls) throws JsonMappingException {
        JavaType javaTypeMapAbstractType = mapAbstractType(deserializationConfig, deserializationConfig.constructType(cls));
        if (javaTypeMapAbstractType == null || javaTypeMapAbstractType.hasRawClass(cls)) {
            return null;
        }
        return javaTypeMapAbstractType;
    }

    public AbstractC5548Vy<?> _findCustomTreeNodeDeserializer(Class<? extends JsonNode> cls, DeserializationConfig deserializationConfig, AbstractC5549Vz abstractC5549Vz) throws JsonMappingException {
        Iterator<InterfaceC5559Wj> it = this._factoryConfig.deserializers().iterator();
        while (it.hasNext()) {
            AbstractC5548Vy<?> abstractC5548VyFindTreeNodeDeserializer = it.next().findTreeNodeDeserializer(cls, deserializationConfig, abstractC5549Vz);
            if (abstractC5548VyFindTreeNodeDeserializer != null) {
                return abstractC5548VyFindTreeNodeDeserializer;
            }
        }
        return null;
    }

    public AbstractC5548Vy<?> _findCustomReferenceDeserializer(ReferenceType referenceType, DeserializationConfig deserializationConfig, AbstractC5549Vz abstractC5549Vz, AbstractC5597Xv abstractC5597Xv, AbstractC5548Vy<?> abstractC5548Vy) throws JsonMappingException {
        Iterator<InterfaceC5559Wj> it = this._factoryConfig.deserializers().iterator();
        while (it.hasNext()) {
            AbstractC5548Vy<?> abstractC5548VyFindReferenceDeserializer = it.next().findReferenceDeserializer(referenceType, deserializationConfig, abstractC5549Vz, abstractC5597Xv, abstractC5548Vy);
            if (abstractC5548VyFindReferenceDeserializer != null) {
                return abstractC5548VyFindReferenceDeserializer;
            }
        }
        return null;
    }

    public AbstractC5548Vy<Object> _findCustomBeanDeserializer(JavaType javaType, DeserializationConfig deserializationConfig, AbstractC5549Vz abstractC5549Vz) throws JsonMappingException {
        Iterator<InterfaceC5559Wj> it = this._factoryConfig.deserializers().iterator();
        while (it.hasNext()) {
            AbstractC5548Vy<?> abstractC5548VyFindBeanDeserializer = it.next().findBeanDeserializer(javaType, deserializationConfig, abstractC5549Vz);
            if (abstractC5548VyFindBeanDeserializer != null) {
                return abstractC5548VyFindBeanDeserializer;
            }
        }
        return null;
    }

    public AbstractC5548Vy<?> _findCustomArrayDeserializer(ArrayType arrayType, DeserializationConfig deserializationConfig, AbstractC5549Vz abstractC5549Vz, AbstractC5597Xv abstractC5597Xv, AbstractC5548Vy<?> abstractC5548Vy) throws JsonMappingException {
        Iterator<InterfaceC5559Wj> it = this._factoryConfig.deserializers().iterator();
        while (it.hasNext()) {
            AbstractC5548Vy<?> abstractC5548VyFindArrayDeserializer = it.next().findArrayDeserializer(arrayType, deserializationConfig, abstractC5549Vz, abstractC5597Xv, abstractC5548Vy);
            if (abstractC5548VyFindArrayDeserializer != null) {
                return abstractC5548VyFindArrayDeserializer;
            }
        }
        return null;
    }

    public AbstractC5548Vy<?> _findCustomCollectionDeserializer(CollectionType collectionType, DeserializationConfig deserializationConfig, AbstractC5549Vz abstractC5549Vz, AbstractC5597Xv abstractC5597Xv, AbstractC5548Vy<?> abstractC5548Vy) throws JsonMappingException {
        Iterator<InterfaceC5559Wj> it = this._factoryConfig.deserializers().iterator();
        while (it.hasNext()) {
            AbstractC5548Vy<?> abstractC5548VyFindCollectionDeserializer = it.next().findCollectionDeserializer(collectionType, deserializationConfig, abstractC5549Vz, abstractC5597Xv, abstractC5548Vy);
            if (abstractC5548VyFindCollectionDeserializer != null) {
                return abstractC5548VyFindCollectionDeserializer;
            }
        }
        return null;
    }

    public AbstractC5548Vy<?> _findCustomCollectionLikeDeserializer(CollectionLikeType collectionLikeType, DeserializationConfig deserializationConfig, AbstractC5549Vz abstractC5549Vz, AbstractC5597Xv abstractC5597Xv, AbstractC5548Vy<?> abstractC5548Vy) throws JsonMappingException {
        Iterator<InterfaceC5559Wj> it = this._factoryConfig.deserializers().iterator();
        while (it.hasNext()) {
            AbstractC5548Vy<?> abstractC5548VyFindCollectionLikeDeserializer = it.next().findCollectionLikeDeserializer(collectionLikeType, deserializationConfig, abstractC5549Vz, abstractC5597Xv, abstractC5548Vy);
            if (abstractC5548VyFindCollectionLikeDeserializer != null) {
                return abstractC5548VyFindCollectionLikeDeserializer;
            }
        }
        return null;
    }

    public AbstractC5548Vy<?> _findCustomEnumDeserializer(Class<?> cls, DeserializationConfig deserializationConfig, AbstractC5549Vz abstractC5549Vz) throws JsonMappingException {
        Iterator<InterfaceC5559Wj> it = this._factoryConfig.deserializers().iterator();
        while (it.hasNext()) {
            AbstractC5548Vy<?> abstractC5548VyFindEnumDeserializer = it.next().findEnumDeserializer(cls, deserializationConfig, abstractC5549Vz);
            if (abstractC5548VyFindEnumDeserializer != null) {
                return abstractC5548VyFindEnumDeserializer;
            }
        }
        return null;
    }

    public AbstractC5548Vy<?> _findCustomMapDeserializer(MapType mapType, DeserializationConfig deserializationConfig, AbstractC5549Vz abstractC5549Vz, VC vc, AbstractC5597Xv abstractC5597Xv, AbstractC5548Vy<?> abstractC5548Vy) throws JsonMappingException {
        Iterator<InterfaceC5559Wj> it = this._factoryConfig.deserializers().iterator();
        while (it.hasNext()) {
            AbstractC5548Vy<?> abstractC5548VyFindMapDeserializer = it.next().findMapDeserializer(mapType, deserializationConfig, abstractC5549Vz, vc, abstractC5597Xv, abstractC5548Vy);
            if (abstractC5548VyFindMapDeserializer != null) {
                return abstractC5548VyFindMapDeserializer;
            }
        }
        return null;
    }

    public AbstractC5548Vy<?> _findCustomMapLikeDeserializer(MapLikeType mapLikeType, DeserializationConfig deserializationConfig, AbstractC5549Vz abstractC5549Vz, VC vc, AbstractC5597Xv abstractC5597Xv, AbstractC5548Vy<?> abstractC5548Vy) throws JsonMappingException {
        Iterator<InterfaceC5559Wj> it = this._factoryConfig.deserializers().iterator();
        while (it.hasNext()) {
            AbstractC5548Vy<?> abstractC5548VyFindMapLikeDeserializer = it.next().findMapLikeDeserializer(mapLikeType, deserializationConfig, abstractC5549Vz, vc, abstractC5597Xv, abstractC5548Vy);
            if (abstractC5548VyFindMapLikeDeserializer != null) {
                return abstractC5548VyFindMapLikeDeserializer;
            }
        }
        return null;
    }

    public AbstractC5548Vy<Object> findDeserializerFromAnnotation(DeserializationContext deserializationContext, WM wm) throws JsonMappingException {
        Object objFindDeserializer;
        AnnotationIntrospector annotationIntrospector = deserializationContext.getAnnotationIntrospector();
        if (annotationIntrospector == null || (objFindDeserializer = annotationIntrospector.findDeserializer(wm)) == null) {
            return null;
        }
        return deserializationContext.deserializerInstance(wm, objFindDeserializer);
    }

    public VC findKeyDeserializerFromAnnotation(DeserializationContext deserializationContext, WM wm) throws JsonMappingException {
        Object objFindKeyDeserializer;
        AnnotationIntrospector annotationIntrospector = deserializationContext.getAnnotationIntrospector();
        if (annotationIntrospector == null || (objFindKeyDeserializer = annotationIntrospector.findKeyDeserializer(wm)) == null) {
            return null;
        }
        return deserializationContext.keyDeserializerInstance(wm, objFindKeyDeserializer);
    }

    public AbstractC5548Vy<Object> findContentDeserializerFromAnnotation(DeserializationContext deserializationContext, WM wm) throws JsonMappingException {
        Object objFindContentDeserializer;
        AnnotationIntrospector annotationIntrospector = deserializationContext.getAnnotationIntrospector();
        if (annotationIntrospector == null || (objFindContentDeserializer = annotationIntrospector.findContentDeserializer(wm)) == null) {
            return null;
        }
        return deserializationContext.deserializerInstance(wm, objFindContentDeserializer);
    }

    public JavaType resolveMemberAndTypeAnnotations(DeserializationContext deserializationContext, AnnotatedMember annotatedMember, JavaType javaType) throws JsonMappingException {
        VC vcKeyDeserializerInstance;
        AnnotationIntrospector annotationIntrospector = deserializationContext.getAnnotationIntrospector();
        if (annotationIntrospector == null) {
            return javaType;
        }
        if (javaType.isMapLikeType() && javaType.getKeyType() != null && (vcKeyDeserializerInstance = deserializationContext.keyDeserializerInstance(annotatedMember, annotationIntrospector.findKeyDeserializer(annotatedMember))) != null) {
            javaType = ((MapLikeType) javaType).withKeyValueHandler(vcKeyDeserializerInstance);
            javaType.getKeyType();
        }
        if (javaType.hasContentType()) {
            AbstractC5548Vy<Object> abstractC5548VyDeserializerInstance = deserializationContext.deserializerInstance(annotatedMember, annotationIntrospector.findContentDeserializer(annotatedMember));
            if (abstractC5548VyDeserializerInstance != null) {
                javaType = javaType.withContentValueHandler(abstractC5548VyDeserializerInstance);
            }
            AbstractC5597Xv abstractC5597XvFindPropertyContentTypeDeserializer = findPropertyContentTypeDeserializer(deserializationContext.getConfig(), javaType, annotatedMember);
            if (abstractC5597XvFindPropertyContentTypeDeserializer != null) {
                javaType = javaType.withContentTypeHandler(abstractC5597XvFindPropertyContentTypeDeserializer);
            }
        }
        AbstractC5597Xv abstractC5597XvFindPropertyTypeDeserializer = findPropertyTypeDeserializer(deserializationContext.getConfig(), javaType, annotatedMember);
        if (abstractC5597XvFindPropertyTypeDeserializer != null) {
            javaType = javaType.withTypeHandler(abstractC5597XvFindPropertyTypeDeserializer);
        }
        return annotationIntrospector.refineDeserializationType(deserializationContext.getConfig(), annotatedMember, javaType);
    }

    public EnumResolver constructEnumResolver(Class<?> cls, DeserializationConfig deserializationConfig, AnnotatedMember annotatedMember) {
        if (annotatedMember != null) {
            if (deserializationConfig.canOverrideAccessModifiers()) {
                C5619Yr.EZpvd(annotatedMember.getMember(), deserializationConfig.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
            }
            return EnumResolver.constructUsingMethod(deserializationConfig, cls, annotatedMember);
        }
        return EnumResolver.constructFor(deserializationConfig, cls);
    }

    public boolean _hasCreatorAnnotation(DeserializationContext deserializationContext, WM wm) {
        JsonCreator.Mode modeFindCreatorAnnotation;
        AnnotationIntrospector annotationIntrospector = deserializationContext.getAnnotationIntrospector();
        return (annotationIntrospector == null || (modeFindCreatorAnnotation = annotationIntrospector.findCreatorAnnotation(deserializationContext.getConfig(), wm)) == null || modeFindCreatorAnnotation == JsonCreator.Mode.DISABLED) ? false : true;
    }

    @Deprecated
    public JavaType modifyTypeByAnnotation(DeserializationContext deserializationContext, WM wm, JavaType javaType) throws JsonMappingException {
        AnnotationIntrospector annotationIntrospector = deserializationContext.getAnnotationIntrospector();
        return annotationIntrospector == null ? javaType : annotationIntrospector.refineDeserializationType(deserializationContext.getConfig(), wm, javaType);
    }

    @Deprecated
    public JavaType resolveType(DeserializationContext deserializationContext, AbstractC5549Vz abstractC5549Vz, JavaType javaType, AnnotatedMember annotatedMember) throws JsonMappingException {
        return resolveMemberAndTypeAnnotations(deserializationContext, annotatedMember, javaType);
    }

    @Deprecated
    public AnnotatedMethod _findJsonValueFor(DeserializationConfig deserializationConfig, JavaType javaType) {
        if (javaType == null) {
            return null;
        }
        return deserializationConfig.introspect(javaType).AYXKKw();
    }

    public static class StateListAnimator {
        public static final HashMap<String, Class<? extends Map>> EZpvd;
        public static final HashMap<String, Class<? extends Collection>> KWHzl;

        static {
            HashMap<String, Class<? extends Collection>> map = new HashMap<>();
            map.put(Collection.class.getName(), ArrayList.class);
            map.put(List.class.getName(), ArrayList.class);
            map.put(Set.class.getName(), HashSet.class);
            map.put(SortedSet.class.getName(), TreeSet.class);
            map.put(Queue.class.getName(), LinkedList.class);
            map.put(AbstractList.class.getName(), ArrayList.class);
            map.put(AbstractSet.class.getName(), HashSet.class);
            map.put(Deque.class.getName(), LinkedList.class);
            map.put(NavigableSet.class.getName(), TreeSet.class);
            KWHzl = map;
            HashMap<String, Class<? extends Map>> map2 = new HashMap<>();
            map2.put(Map.class.getName(), LinkedHashMap.class);
            map2.put(AbstractMap.class.getName(), LinkedHashMap.class);
            map2.put(ConcurrentMap.class.getName(), ConcurrentHashMap.class);
            map2.put(SortedMap.class.getName(), TreeMap.class);
            map2.put(NavigableMap.class.getName(), TreeMap.class);
            map2.put(ConcurrentNavigableMap.class.getName(), ConcurrentSkipListMap.class);
            EZpvd = map2;
        }

        public static Class<?> KWHzl(JavaType javaType) {
            return KWHzl.get(javaType.getRawClass().getName());
        }

        public static Class<?> AEQbTJ(JavaType javaType) {
            return EZpvd.get(javaType.getRawClass().getName());
        }
    }

    public static class Application {
        public int AEQbTJ;
        public final C5560Wk AYXKKw;
        public final VisibilityChecker<?> AhwBna;
        public final AbstractC5549Vz EZpvd;
        public List<C5564Wo> KWHzl;
        public List<C5564Wo> OLrzqt;
        public int copydefault;
        public final Map<AnnotatedWithParams, WT[]> djBIcL;
        public final DeserializationContext valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public List<C5564Wo> AhwBna() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean EZpvd() {
            return this.KWHzl != null;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean KWHzl() {
            return this.OLrzqt != null;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean OLrzqt() {
            return this.AEQbTJ > 0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean copydefault() {
            return this.copydefault > 0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public void djBIcL() {
            this.copydefault++;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public void gEmmrt() {
            this.AEQbTJ++;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public List<C5564Wo> valueOf() {
            return this.KWHzl;
        }

        public Application(DeserializationContext deserializationContext, AbstractC5549Vz abstractC5549Vz, VisibilityChecker<?> visibilityChecker, C5560Wk c5560Wk, Map<AnnotatedWithParams, WT[]> map) {
            this.valueOf = deserializationContext;
            this.EZpvd = abstractC5549Vz;
            this.AhwBna = visibilityChecker;
            this.AYXKKw = c5560Wk;
            this.djBIcL = map;
        }

        public AnnotationIntrospector AEQbTJ() {
            return this.valueOf.getAnnotationIntrospector();
        }

        public void AEQbTJ(C5564Wo c5564Wo) {
            if (this.OLrzqt == null) {
                this.OLrzqt = new LinkedList();
            }
            this.OLrzqt.add(c5564Wo);
        }

        public void EZpvd(C5564Wo c5564Wo) {
            if (this.KWHzl == null) {
                this.KWHzl = new LinkedList();
            }
            this.KWHzl.add(c5564Wo);
        }
    }
}
