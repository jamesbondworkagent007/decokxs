package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap;
import com.fasterxml.jackson.databind.deser.impl.InnerClassProperty;
import com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty;
import com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReader;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty;
import com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator;
import com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator;
import com.fasterxml.jackson.databind.deser.impl.SetterlessProperty;
import com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer;
import com.fasterxml.jackson.databind.deser.impl.ValueInjector;
import com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.exc.IgnoredPropertyException;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedWithParams;
import com.fasterxml.jackson.databind.type.ClassKey;
import com.fasterxml.jackson.databind.type.LogicalType;
import com.fasterxml.jackson.databind.util.AccessPattern;
import com.fasterxml.jackson.databind.util.IgnorePropertiesUtil;
import com.fasterxml.jackson.databind.util.NameTransformer;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import o.AbstractC5548Vy;
import o.AbstractC5549Vz;
import o.AbstractC5597Xv;
import o.C5563Wn;
import o.C5565Wp;
import o.C5567Wr;
import o.C5576Xa;
import o.C5619Yr;
import o.C5622Yv;
import o.InterfaceC5500Ud;
import o.InterfaceC5554We;
import o.InterfaceC5555Wf;
import o.InterfaceC5557Wh;
import o.InterfaceC5621Yt;
import o.VW;
import o.YA;

/* JADX INFO: loaded from: classes21.dex */
public abstract class BeanDeserializerBase extends StdDeserializer<Object> implements InterfaceC5554We, InterfaceC5557Wh, Serializable {
    protected static final PropertyName TEMP_PROPERTY_NAME = new PropertyName("#temporary-name");
    private static final long serialVersionUID = 1;
    public SettableAnyProperty _anySetter;
    protected AbstractC5548Vy<Object> _arrayDelegateDeserializer;
    protected final Map<String, SettableBeanProperty> _backRefs;
    public final BeanPropertyMap _beanProperties;
    public final JavaType _beanType;
    public AbstractC5548Vy<Object> _delegateDeserializer;
    protected C5563Wn _externalTypeIdHandler;
    public final Set<String> _ignorableProps;
    public final boolean _ignoreAllUnknown;
    protected final Set<String> _includableProps;
    public final ValueInjector[] _injectables;
    public final boolean _needViewProcesing;
    public boolean _nonStandardCreation;
    public final ObjectIdReader _objectIdReader;
    public PropertyBasedCreator _propertyBasedCreator;
    protected final JsonFormat.Shape _serializationShape;
    protected transient HashMap<ClassKey, AbstractC5548Vy<Object>> _subDeserializers;
    protected C5567Wr _unwrappedPropertyHandler;
    public final ValueInstantiator _valueInstantiator;
    public boolean _vanillaProcessing;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC5548Vy<Object> _delegateDeserializer() {
        AbstractC5548Vy<Object> abstractC5548Vy = this._delegateDeserializer;
        return abstractC5548Vy == null ? this._arrayDelegateDeserializer : abstractC5548Vy;
    }

    public abstract Object _deserializeUsingPropertyBased(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException;

    public abstract BeanDeserializerBase asArrayDeserializer();

    public abstract Object deserializeFromObject(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC5548Vy
    public ObjectIdReader getObjectIdReader() {
        return this._objectIdReader;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer
    public ValueInstantiator getValueInstantiator() {
        return this._valueInstantiator;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer
    public JavaType getValueType() {
        return this._beanType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean hasViews() {
        return this._needViewProcesing;
    }

    @Override // o.AbstractC5548Vy
    public boolean isCachable() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC5548Vy
    public Boolean supportsUpdate(DeserializationConfig deserializationConfig) {
        return Boolean.TRUE;
    }

    @Override // o.AbstractC5548Vy
    public abstract AbstractC5548Vy<Object> unwrappingDeserializer(NameTransformer nameTransformer);

    public abstract BeanDeserializerBase withByNameInclusion(Set<String> set, Set<String> set2);

    public abstract BeanDeserializerBase withIgnoreAllUnknown(boolean z);

    public abstract BeanDeserializerBase withObjectIdReader(ObjectIdReader objectIdReader);

    public BeanDeserializerBase(VW vw, AbstractC5549Vz abstractC5549Vz, BeanPropertyMap beanPropertyMap, Map<String, SettableBeanProperty> map, Set<String> set, boolean z, Set<String> set2, boolean z2) {
        super(abstractC5549Vz.getNewProxyInstance());
        this._beanType = abstractC5549Vz.getNewProxyInstance();
        ValueInstantiator valueInstantiatorAYXKKw = vw.AYXKKw();
        this._valueInstantiator = valueInstantiatorAYXKKw;
        this._delegateDeserializer = null;
        this._arrayDelegateDeserializer = null;
        this._propertyBasedCreator = null;
        this._beanProperties = beanPropertyMap;
        this._backRefs = map;
        this._ignorableProps = set;
        this._ignoreAllUnknown = z;
        this._includableProps = set2;
        this._anySetter = vw.EZpvd();
        List<ValueInjector> listAhwBna = vw.AhwBna();
        ValueInjector[] valueInjectorArr = (listAhwBna == null || listAhwBna.isEmpty()) ? null : (ValueInjector[]) listAhwBna.toArray(new ValueInjector[listAhwBna.size()]);
        this._injectables = valueInjectorArr;
        ObjectIdReader objectIdReaderGEmmrt = vw.gEmmrt();
        this._objectIdReader = objectIdReaderGEmmrt;
        this._nonStandardCreation = this._unwrappedPropertyHandler != null || valueInstantiatorAYXKKw.canCreateUsingDelegate() || valueInstantiatorAYXKKw.canCreateFromObjectWith() || !valueInstantiatorAYXKKw.canCreateUsingDefault();
        this._serializationShape = abstractC5549Vz.OLrzqt(null).getShape();
        this._needViewProcesing = z2;
        this._vanillaProcessing = !this._nonStandardCreation && valueInjectorArr == null && !z2 && objectIdReaderGEmmrt == null;
    }

    public BeanDeserializerBase(BeanDeserializerBase beanDeserializerBase) {
        this(beanDeserializerBase, beanDeserializerBase._ignoreAllUnknown);
    }

    public BeanDeserializerBase(BeanDeserializerBase beanDeserializerBase, boolean z) {
        super(beanDeserializerBase._beanType);
        this._beanType = beanDeserializerBase._beanType;
        this._valueInstantiator = beanDeserializerBase._valueInstantiator;
        this._delegateDeserializer = beanDeserializerBase._delegateDeserializer;
        this._arrayDelegateDeserializer = beanDeserializerBase._arrayDelegateDeserializer;
        this._propertyBasedCreator = beanDeserializerBase._propertyBasedCreator;
        this._beanProperties = beanDeserializerBase._beanProperties;
        this._backRefs = beanDeserializerBase._backRefs;
        this._ignorableProps = beanDeserializerBase._ignorableProps;
        this._ignoreAllUnknown = z;
        this._includableProps = beanDeserializerBase._includableProps;
        this._anySetter = beanDeserializerBase._anySetter;
        this._injectables = beanDeserializerBase._injectables;
        this._objectIdReader = beanDeserializerBase._objectIdReader;
        this._nonStandardCreation = beanDeserializerBase._nonStandardCreation;
        this._unwrappedPropertyHandler = beanDeserializerBase._unwrappedPropertyHandler;
        this._needViewProcesing = beanDeserializerBase._needViewProcesing;
        this._serializationShape = beanDeserializerBase._serializationShape;
        this._vanillaProcessing = beanDeserializerBase._vanillaProcessing;
    }

    public BeanDeserializerBase(BeanDeserializerBase beanDeserializerBase, NameTransformer nameTransformer) {
        super(beanDeserializerBase._beanType);
        this._beanType = beanDeserializerBase._beanType;
        this._valueInstantiator = beanDeserializerBase._valueInstantiator;
        this._delegateDeserializer = beanDeserializerBase._delegateDeserializer;
        this._arrayDelegateDeserializer = beanDeserializerBase._arrayDelegateDeserializer;
        this._propertyBasedCreator = beanDeserializerBase._propertyBasedCreator;
        this._backRefs = beanDeserializerBase._backRefs;
        this._ignorableProps = beanDeserializerBase._ignorableProps;
        this._ignoreAllUnknown = nameTransformer != null || beanDeserializerBase._ignoreAllUnknown;
        this._includableProps = beanDeserializerBase._includableProps;
        this._anySetter = beanDeserializerBase._anySetter;
        this._injectables = beanDeserializerBase._injectables;
        this._objectIdReader = beanDeserializerBase._objectIdReader;
        this._nonStandardCreation = beanDeserializerBase._nonStandardCreation;
        C5567Wr c5567WrOLrzqt = beanDeserializerBase._unwrappedPropertyHandler;
        if (nameTransformer != null) {
            c5567WrOLrzqt = c5567WrOLrzqt != null ? c5567WrOLrzqt.OLrzqt(nameTransformer) : c5567WrOLrzqt;
            this._beanProperties = beanDeserializerBase._beanProperties.renameAll(nameTransformer);
        } else {
            this._beanProperties = beanDeserializerBase._beanProperties;
        }
        this._unwrappedPropertyHandler = c5567WrOLrzqt;
        this._needViewProcesing = beanDeserializerBase._needViewProcesing;
        this._serializationShape = beanDeserializerBase._serializationShape;
        this._vanillaProcessing = false;
    }

    public BeanDeserializerBase(BeanDeserializerBase beanDeserializerBase, ObjectIdReader objectIdReader) {
        super(beanDeserializerBase._beanType);
        this._beanType = beanDeserializerBase._beanType;
        this._valueInstantiator = beanDeserializerBase._valueInstantiator;
        this._delegateDeserializer = beanDeserializerBase._delegateDeserializer;
        this._arrayDelegateDeserializer = beanDeserializerBase._arrayDelegateDeserializer;
        this._propertyBasedCreator = beanDeserializerBase._propertyBasedCreator;
        this._backRefs = beanDeserializerBase._backRefs;
        this._ignorableProps = beanDeserializerBase._ignorableProps;
        this._ignoreAllUnknown = beanDeserializerBase._ignoreAllUnknown;
        this._includableProps = beanDeserializerBase._includableProps;
        this._anySetter = beanDeserializerBase._anySetter;
        this._injectables = beanDeserializerBase._injectables;
        this._nonStandardCreation = beanDeserializerBase._nonStandardCreation;
        this._unwrappedPropertyHandler = beanDeserializerBase._unwrappedPropertyHandler;
        this._needViewProcesing = beanDeserializerBase._needViewProcesing;
        this._serializationShape = beanDeserializerBase._serializationShape;
        this._objectIdReader = objectIdReader;
        if (objectIdReader == null) {
            this._beanProperties = beanDeserializerBase._beanProperties;
            this._vanillaProcessing = beanDeserializerBase._vanillaProcessing;
        } else {
            this._beanProperties = beanDeserializerBase._beanProperties.withProperty(new ObjectIdValueProperty(objectIdReader, PropertyMetadata.STD_REQUIRED));
            this._vanillaProcessing = false;
        }
    }

    public BeanDeserializerBase(BeanDeserializerBase beanDeserializerBase, Set<String> set, Set<String> set2) {
        super(beanDeserializerBase._beanType);
        this._beanType = beanDeserializerBase._beanType;
        this._valueInstantiator = beanDeserializerBase._valueInstantiator;
        this._delegateDeserializer = beanDeserializerBase._delegateDeserializer;
        this._arrayDelegateDeserializer = beanDeserializerBase._arrayDelegateDeserializer;
        this._propertyBasedCreator = beanDeserializerBase._propertyBasedCreator;
        this._backRefs = beanDeserializerBase._backRefs;
        this._ignorableProps = set;
        this._ignoreAllUnknown = beanDeserializerBase._ignoreAllUnknown;
        this._includableProps = set2;
        this._anySetter = beanDeserializerBase._anySetter;
        this._injectables = beanDeserializerBase._injectables;
        this._nonStandardCreation = beanDeserializerBase._nonStandardCreation;
        this._unwrappedPropertyHandler = beanDeserializerBase._unwrappedPropertyHandler;
        this._needViewProcesing = beanDeserializerBase._needViewProcesing;
        this._serializationShape = beanDeserializerBase._serializationShape;
        this._vanillaProcessing = beanDeserializerBase._vanillaProcessing;
        this._objectIdReader = beanDeserializerBase._objectIdReader;
        this._beanProperties = beanDeserializerBase._beanProperties.withoutProperties(set, set2);
    }

    public BeanDeserializerBase(BeanDeserializerBase beanDeserializerBase, BeanPropertyMap beanPropertyMap) {
        super(beanDeserializerBase._beanType);
        this._beanType = beanDeserializerBase._beanType;
        this._valueInstantiator = beanDeserializerBase._valueInstantiator;
        this._delegateDeserializer = beanDeserializerBase._delegateDeserializer;
        this._arrayDelegateDeserializer = beanDeserializerBase._arrayDelegateDeserializer;
        this._propertyBasedCreator = beanDeserializerBase._propertyBasedCreator;
        this._beanProperties = beanPropertyMap;
        this._backRefs = beanDeserializerBase._backRefs;
        this._ignorableProps = beanDeserializerBase._ignorableProps;
        this._ignoreAllUnknown = beanDeserializerBase._ignoreAllUnknown;
        this._includableProps = beanDeserializerBase._includableProps;
        this._anySetter = beanDeserializerBase._anySetter;
        this._injectables = beanDeserializerBase._injectables;
        this._objectIdReader = beanDeserializerBase._objectIdReader;
        this._nonStandardCreation = beanDeserializerBase._nonStandardCreation;
        this._unwrappedPropertyHandler = beanDeserializerBase._unwrappedPropertyHandler;
        this._needViewProcesing = beanDeserializerBase._needViewProcesing;
        this._serializationShape = beanDeserializerBase._serializationShape;
        this._vanillaProcessing = beanDeserializerBase._vanillaProcessing;
    }

    @Deprecated
    public BeanDeserializerBase(BeanDeserializerBase beanDeserializerBase, Set<String> set) {
        this(beanDeserializerBase, set, beanDeserializerBase._includableProps);
    }

    public BeanDeserializerBase withBeanProperties(BeanPropertyMap beanPropertyMap) {
        throw new UnsupportedOperationException("Class " + getClass().getName() + " does not override `withBeanProperties()`, needs to");
    }

    @Deprecated
    public BeanDeserializerBase withIgnorableProperties(Set<String> set) {
        return withByNameInclusion(set, this._includableProps);
    }

    @Override // o.InterfaceC5557Wh
    public void resolve(DeserializationContext deserializationContext) throws JsonMappingException {
        SettableBeanProperty[] fromObjectArguments;
        AbstractC5548Vy<Object> valueDeserializer;
        AbstractC5548Vy<Object> abstractC5548VyUnwrappingDeserializer;
        boolean z = false;
        C5563Wn.TaskDescription taskDescriptionCopydefault = null;
        if (this._valueInstantiator.canCreateFromObjectWith()) {
            fromObjectArguments = this._valueInstantiator.getFromObjectArguments(deserializationContext.getConfig());
            if (this._ignorableProps != null || this._includableProps != null) {
                int length = fromObjectArguments.length;
                for (int i = 0; i < length; i++) {
                    if (IgnorePropertiesUtil.KWHzl(fromObjectArguments[i].getName(), this._ignorableProps, this._includableProps)) {
                        fromObjectArguments[i].markAsIgnorable();
                    }
                }
            }
        } else {
            fromObjectArguments = null;
        }
        for (SettableBeanProperty settableBeanProperty : this._beanProperties) {
            if (!settableBeanProperty.hasValueDeserializer()) {
                AbstractC5548Vy<Object> abstractC5548VyFindConvertingDeserializer = findConvertingDeserializer(deserializationContext, settableBeanProperty);
                if (abstractC5548VyFindConvertingDeserializer == null) {
                    abstractC5548VyFindConvertingDeserializer = deserializationContext.findNonContextualValueDeserializer(settableBeanProperty.getType());
                }
                _replaceProperty(this._beanProperties, fromObjectArguments, settableBeanProperty, settableBeanProperty.withValueDeserializer(abstractC5548VyFindConvertingDeserializer));
            }
        }
        C5567Wr c5567Wr = null;
        for (SettableBeanProperty settableBeanProperty2 : this._beanProperties) {
            SettableBeanProperty settableBeanProperty_resolveManagedReferenceProperty = _resolveManagedReferenceProperty(deserializationContext, settableBeanProperty2.withValueDeserializer(deserializationContext.handlePrimaryContextualization(settableBeanProperty2.getValueDeserializer(), settableBeanProperty2, settableBeanProperty2.getType())));
            if (!(settableBeanProperty_resolveManagedReferenceProperty instanceof ManagedReferenceProperty)) {
                settableBeanProperty_resolveManagedReferenceProperty = _resolvedObjectIdProperty(deserializationContext, settableBeanProperty_resolveManagedReferenceProperty);
            }
            NameTransformer nameTransformer_findPropertyUnwrapper = _findPropertyUnwrapper(deserializationContext, settableBeanProperty_resolveManagedReferenceProperty);
            if (nameTransformer_findPropertyUnwrapper != null && (abstractC5548VyUnwrappingDeserializer = (valueDeserializer = settableBeanProperty_resolveManagedReferenceProperty.getValueDeserializer()).unwrappingDeserializer(nameTransformer_findPropertyUnwrapper)) != valueDeserializer && abstractC5548VyUnwrappingDeserializer != null) {
                SettableBeanProperty settableBeanPropertyWithValueDeserializer = settableBeanProperty_resolveManagedReferenceProperty.withValueDeserializer(abstractC5548VyUnwrappingDeserializer);
                if (c5567Wr == null) {
                    c5567Wr = new C5567Wr();
                }
                c5567Wr.AEQbTJ(settableBeanPropertyWithValueDeserializer);
                this._beanProperties.remove(settableBeanPropertyWithValueDeserializer);
            } else {
                SettableBeanProperty settableBeanProperty_resolveInnerClassValuedProperty = _resolveInnerClassValuedProperty(deserializationContext, _resolveMergeAndNullSettings(deserializationContext, settableBeanProperty_resolveManagedReferenceProperty, settableBeanProperty_resolveManagedReferenceProperty.getMetadata()));
                if (settableBeanProperty_resolveInnerClassValuedProperty != settableBeanProperty2) {
                    _replaceProperty(this._beanProperties, fromObjectArguments, settableBeanProperty2, settableBeanProperty_resolveInnerClassValuedProperty);
                }
                if (settableBeanProperty_resolveInnerClassValuedProperty.hasValueTypeDeserializer()) {
                    AbstractC5597Xv valueTypeDeserializer = settableBeanProperty_resolveInnerClassValuedProperty.getValueTypeDeserializer();
                    if (valueTypeDeserializer.getTypeInclusion() == JsonTypeInfo.As.EXTERNAL_PROPERTY) {
                        if (taskDescriptionCopydefault == null) {
                            taskDescriptionCopydefault = C5563Wn.copydefault(this._beanType);
                        }
                        taskDescriptionCopydefault.copydefault(settableBeanProperty_resolveInnerClassValuedProperty, valueTypeDeserializer);
                        this._beanProperties.remove(settableBeanProperty_resolveInnerClassValuedProperty);
                    }
                }
            }
        }
        SettableAnyProperty settableAnyProperty = this._anySetter;
        if (settableAnyProperty != null && !settableAnyProperty.hasValueDeserializer()) {
            SettableAnyProperty settableAnyProperty2 = this._anySetter;
            this._anySetter = settableAnyProperty2.withValueDeserializer(findDeserializer(deserializationContext, settableAnyProperty2.getType(), this._anySetter.getProperty()));
        }
        if (this._valueInstantiator.canCreateUsingDelegate()) {
            JavaType delegateType = this._valueInstantiator.getDelegateType(deserializationContext.getConfig());
            if (delegateType == null) {
                JavaType javaType = this._beanType;
                deserializationContext.reportBadDefinition(javaType, String.format("Invalid delegate-creator definition for %s: value instantiator (%s) returned true for 'canCreateUsingDelegate()', but null for 'getDelegateType()'", C5619Yr.copydefault(javaType), C5619Yr.copydefault(this._valueInstantiator)));
            }
            this._delegateDeserializer = _findDelegateDeserializer(deserializationContext, delegateType, this._valueInstantiator.getDelegateCreator());
        }
        if (this._valueInstantiator.canCreateUsingArrayDelegate()) {
            JavaType arrayDelegateType = this._valueInstantiator.getArrayDelegateType(deserializationContext.getConfig());
            if (arrayDelegateType == null) {
                JavaType javaType2 = this._beanType;
                deserializationContext.reportBadDefinition(javaType2, String.format("Invalid delegate-creator definition for %s: value instantiator (%s) returned true for 'canCreateUsingArrayDelegate()', but null for 'getArrayDelegateType()'", C5619Yr.copydefault(javaType2), C5619Yr.copydefault(this._valueInstantiator)));
            }
            this._arrayDelegateDeserializer = _findDelegateDeserializer(deserializationContext, arrayDelegateType, this._valueInstantiator.getArrayDelegateCreator());
        }
        if (fromObjectArguments != null) {
            this._propertyBasedCreator = PropertyBasedCreator.OLrzqt(deserializationContext, this._valueInstantiator, fromObjectArguments, this._beanProperties);
        }
        if (taskDescriptionCopydefault != null) {
            this._externalTypeIdHandler = taskDescriptionCopydefault.AEQbTJ(this._beanProperties);
            this._nonStandardCreation = true;
        }
        this._unwrappedPropertyHandler = c5567Wr;
        if (c5567Wr != null) {
            this._nonStandardCreation = true;
        }
        if (this._vanillaProcessing && !this._nonStandardCreation) {
            z = true;
        }
        this._vanillaProcessing = z;
    }

    public void _replaceProperty(BeanPropertyMap beanPropertyMap, SettableBeanProperty[] settableBeanPropertyArr, SettableBeanProperty settableBeanProperty, SettableBeanProperty settableBeanProperty2) {
        beanPropertyMap.replace(settableBeanProperty, settableBeanProperty2);
        if (settableBeanPropertyArr != null) {
            int length = settableBeanPropertyArr.length;
            for (int i = 0; i < length; i++) {
                if (settableBeanPropertyArr[i] == settableBeanProperty) {
                    settableBeanPropertyArr[i] = settableBeanProperty2;
                    return;
                }
            }
        }
    }

    private AbstractC5548Vy<Object> _findDelegateDeserializer(DeserializationContext deserializationContext, JavaType javaType, AnnotatedWithParams annotatedWithParams) throws JsonMappingException {
        AbstractC5548Vy<?> abstractC5548VyHandleSecondaryContextualization;
        BeanProperty.Std std = new BeanProperty.Std(TEMP_PROPERTY_NAME, javaType, null, annotatedWithParams, PropertyMetadata.STD_OPTIONAL);
        AbstractC5597Xv abstractC5597XvFindTypeDeserializer = (AbstractC5597Xv) javaType.getTypeHandler();
        if (abstractC5597XvFindTypeDeserializer == null) {
            abstractC5597XvFindTypeDeserializer = deserializationContext.getConfig().findTypeDeserializer(javaType);
        }
        AbstractC5548Vy<?> abstractC5548Vy = (AbstractC5548Vy) javaType.getValueHandler();
        if (abstractC5548Vy == null) {
            abstractC5548VyHandleSecondaryContextualization = findDeserializer(deserializationContext, javaType, std);
        } else {
            abstractC5548VyHandleSecondaryContextualization = deserializationContext.handleSecondaryContextualization(abstractC5548Vy, std, javaType);
        }
        return abstractC5597XvFindTypeDeserializer != null ? new TypeWrappedDeserializer(abstractC5597XvFindTypeDeserializer.forProperty(std), abstractC5548VyHandleSecondaryContextualization) : abstractC5548VyHandleSecondaryContextualization;
    }

    public AbstractC5548Vy<Object> findConvertingDeserializer(DeserializationContext deserializationContext, SettableBeanProperty settableBeanProperty) throws JsonMappingException {
        Object objFindDeserializationConverter;
        AnnotationIntrospector annotationIntrospector = deserializationContext.getAnnotationIntrospector();
        if (annotationIntrospector == null || (objFindDeserializationConverter = annotationIntrospector.findDeserializationConverter(settableBeanProperty.getMember())) == null) {
            return null;
        }
        InterfaceC5621Yt<Object, Object> interfaceC5621YtConverterInstance = deserializationContext.converterInstance(settableBeanProperty.getMember(), objFindDeserializationConverter);
        JavaType javaTypeAEQbTJ = interfaceC5621YtConverterInstance.AEQbTJ(deserializationContext.getTypeFactory());
        return new StdDelegatingDeserializer(interfaceC5621YtConverterInstance, javaTypeAEQbTJ, deserializationContext.findNonContextualValueDeserializer(javaTypeAEQbTJ));
    }

    @Override // o.InterfaceC5554We
    public AbstractC5548Vy<?> createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) throws JsonMappingException {
        BeanPropertyMap beanPropertyMap;
        BeanPropertyMap beanPropertyMapWithCaseInsensitivity;
        C5576Xa c5576XaFindObjectIdInfo;
        JavaType type;
        SettableBeanProperty settableBeanProperty;
        ObjectIdGenerator<?> objectIdGeneratorObjectIdGeneratorInstance;
        ObjectIdReader objectIdReaderConstruct = this._objectIdReader;
        AnnotationIntrospector annotationIntrospector = deserializationContext.getAnnotationIntrospector();
        AnnotatedMember member = StdDeserializer._neitherNull(beanProperty, annotationIntrospector) ? beanProperty.getMember() : null;
        if (member != null && (c5576XaFindObjectIdInfo = annotationIntrospector.findObjectIdInfo(member)) != null) {
            C5576Xa c5576XaFindObjectReferenceInfo = annotationIntrospector.findObjectReferenceInfo(member, c5576XaFindObjectIdInfo);
            Class<? extends ObjectIdGenerator<?>> clsEZpvd = c5576XaFindObjectReferenceInfo.EZpvd();
            InterfaceC5500Ud interfaceC5500UdObjectIdResolverInstance = deserializationContext.objectIdResolverInstance(member, c5576XaFindObjectReferenceInfo);
            if (clsEZpvd == ObjectIdGenerators.PropertyGenerator.class) {
                PropertyName propertyNameAEQbTJ = c5576XaFindObjectReferenceInfo.AEQbTJ();
                SettableBeanProperty settableBeanPropertyFindProperty = findProperty(propertyNameAEQbTJ);
                if (settableBeanPropertyFindProperty == null) {
                    return (AbstractC5548Vy) deserializationContext.reportBadDefinition(this._beanType, String.format("Invalid Object Id definition for %s: cannot find property with name %s", C5619Yr.uzCIH(handledType()), C5619Yr.copydefault(propertyNameAEQbTJ)));
                }
                type = settableBeanPropertyFindProperty.getType();
                settableBeanProperty = settableBeanPropertyFindProperty;
                objectIdGeneratorObjectIdGeneratorInstance = new PropertyBasedObjectIdGenerator(c5576XaFindObjectReferenceInfo.AYXKKw());
            } else {
                type = deserializationContext.getTypeFactory().findTypeParameters(deserializationContext.constructType((Class<?>) clsEZpvd), ObjectIdGenerator.class)[0];
                settableBeanProperty = null;
                objectIdGeneratorObjectIdGeneratorInstance = deserializationContext.objectIdGeneratorInstance(member, c5576XaFindObjectReferenceInfo);
            }
            JavaType javaType = type;
            objectIdReaderConstruct = ObjectIdReader.construct(javaType, c5576XaFindObjectReferenceInfo.AEQbTJ(), objectIdGeneratorObjectIdGeneratorInstance, deserializationContext.findRootValueDeserializer(javaType), settableBeanProperty, interfaceC5500UdObjectIdResolverInstance);
        }
        BeanDeserializerBase beanDeserializerBaseWithObjectIdReader = (objectIdReaderConstruct == null || objectIdReaderConstruct == this._objectIdReader) ? this : withObjectIdReader(objectIdReaderConstruct);
        if (member != null) {
            beanDeserializerBaseWithObjectIdReader = _handleByNameInclusion(deserializationContext, annotationIntrospector, beanDeserializerBaseWithObjectIdReader, member);
        }
        JsonFormat.Value valueFindFormatOverrides = findFormatOverrides(deserializationContext, beanProperty, handledType());
        if (valueFindFormatOverrides != null) {
            shape = valueFindFormatOverrides.hasShape() ? valueFindFormatOverrides.getShape() : null;
            Boolean feature = valueFindFormatOverrides.getFeature(JsonFormat.Feature.ACCEPT_CASE_INSENSITIVE_PROPERTIES);
            if (feature != null && (beanPropertyMapWithCaseInsensitivity = (beanPropertyMap = this._beanProperties).withCaseInsensitivity(feature.booleanValue())) != beanPropertyMap) {
                beanDeserializerBaseWithObjectIdReader = beanDeserializerBaseWithObjectIdReader.withBeanProperties(beanPropertyMapWithCaseInsensitivity);
            }
        }
        if (shape == null) {
            shape = this._serializationShape;
        }
        return shape == JsonFormat.Shape.ARRAY ? beanDeserializerBaseWithObjectIdReader.asArrayDeserializer() : beanDeserializerBaseWithObjectIdReader;
    }

    public BeanDeserializerBase _handleByNameInclusion(DeserializationContext deserializationContext, AnnotationIntrospector annotationIntrospector, BeanDeserializerBase beanDeserializerBase, AnnotatedMember annotatedMember) throws JsonMappingException {
        DeserializationConfig config = deserializationContext.getConfig();
        JsonIgnoreProperties.Value valueFindPropertyIgnoralByName = annotationIntrospector.findPropertyIgnoralByName(config, annotatedMember);
        if (valueFindPropertyIgnoralByName.getIgnoreUnknown() && !this._ignoreAllUnknown) {
            beanDeserializerBase = beanDeserializerBase.withIgnoreAllUnknown(true);
        }
        Set<String> setFindIgnoredForDeserialization = valueFindPropertyIgnoralByName.findIgnoredForDeserialization();
        Set<String> set = beanDeserializerBase._ignorableProps;
        if (setFindIgnoredForDeserialization.isEmpty()) {
            setFindIgnoredForDeserialization = set;
        } else if (set != null && !set.isEmpty()) {
            HashSet hashSet = new HashSet(set);
            hashSet.addAll(setFindIgnoredForDeserialization);
            setFindIgnoredForDeserialization = hashSet;
        }
        Set<String> set2 = beanDeserializerBase._includableProps;
        Set<String> setKWHzl = IgnorePropertiesUtil.KWHzl(set2, annotationIntrospector.findPropertyInclusionByName(config, annotatedMember).getIncluded());
        return (setFindIgnoredForDeserialization == set && setKWHzl == set2) ? beanDeserializerBase : beanDeserializerBase.withByNameInclusion(setFindIgnoredForDeserialization, setKWHzl);
    }

    public SettableBeanProperty _resolveManagedReferenceProperty(DeserializationContext deserializationContext, SettableBeanProperty settableBeanProperty) throws JsonMappingException {
        String managedReferenceName = settableBeanProperty.getManagedReferenceName();
        if (managedReferenceName == null) {
            return settableBeanProperty;
        }
        SettableBeanProperty settableBeanPropertyFindBackReference = settableBeanProperty.getValueDeserializer().findBackReference(managedReferenceName);
        if (settableBeanPropertyFindBackReference == null) {
            return (SettableBeanProperty) deserializationContext.reportBadDefinition(this._beanType, String.format("Cannot handle managed/back reference %s: no back reference property found from type %s", C5619Yr.copydefault(managedReferenceName), C5619Yr.copydefault(settableBeanProperty.getType())));
        }
        JavaType javaType = this._beanType;
        JavaType type = settableBeanPropertyFindBackReference.getType();
        boolean zIsContainerType = settableBeanProperty.getType().isContainerType();
        if (!type.getRawClass().isAssignableFrom(javaType.getRawClass())) {
            deserializationContext.reportBadDefinition(this._beanType, String.format("Cannot handle managed/back reference %s: back reference type (%s) not compatible with managed type (%s)", C5619Yr.copydefault(managedReferenceName), C5619Yr.copydefault(type), javaType.getRawClass().getName()));
        }
        return new ManagedReferenceProperty(settableBeanProperty, managedReferenceName, settableBeanPropertyFindBackReference, zIsContainerType);
    }

    public SettableBeanProperty _resolvedObjectIdProperty(DeserializationContext deserializationContext, SettableBeanProperty settableBeanProperty) throws JsonMappingException {
        C5576Xa objectIdInfo = settableBeanProperty.getObjectIdInfo();
        AbstractC5548Vy<Object> valueDeserializer = settableBeanProperty.getValueDeserializer();
        return (objectIdInfo == null && (valueDeserializer == null ? null : valueDeserializer.getObjectIdReader()) == null) ? settableBeanProperty : new ObjectIdReferenceProperty(settableBeanProperty, objectIdInfo);
    }

    public NameTransformer _findPropertyUnwrapper(DeserializationContext deserializationContext, SettableBeanProperty settableBeanProperty) throws JsonMappingException {
        NameTransformer nameTransformerFindUnwrappingNameTransformer;
        AnnotatedMember member = settableBeanProperty.getMember();
        if (member == null || (nameTransformerFindUnwrappingNameTransformer = deserializationContext.getAnnotationIntrospector().findUnwrappingNameTransformer(member)) == null) {
            return null;
        }
        if (settableBeanProperty instanceof CreatorProperty) {
            deserializationContext.reportBadDefinition(getValueType(), String.format("Cannot define Creator property \"%s\" as `@JsonUnwrapped`: combination not yet supported", settableBeanProperty.getName()));
        }
        return nameTransformerFindUnwrappingNameTransformer;
    }

    public SettableBeanProperty _resolveInnerClassValuedProperty(DeserializationContext deserializationContext, SettableBeanProperty settableBeanProperty) {
        Class<?> rawClass;
        Class<?> clsIsConnected;
        AbstractC5548Vy<Object> valueDeserializer = settableBeanProperty.getValueDeserializer();
        if ((valueDeserializer instanceof BeanDeserializerBase) && !((BeanDeserializerBase) valueDeserializer).getValueInstantiator().canCreateUsingDefault() && (clsIsConnected = C5619Yr.isConnected((rawClass = settableBeanProperty.getType().getRawClass()))) != null && clsIsConnected == this._beanType.getRawClass()) {
            for (Constructor<?> constructor : rawClass.getConstructors()) {
                if (constructor.getParameterCount() == 1 && clsIsConnected.equals(constructor.getParameterTypes()[0])) {
                    if (deserializationContext.canOverrideAccessModifiers()) {
                        C5619Yr.EZpvd(constructor, deserializationContext.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
                    }
                    return new InnerClassProperty(settableBeanProperty, constructor);
                }
            }
        }
        return settableBeanProperty;
    }

    public SettableBeanProperty _resolveMergeAndNullSettings(DeserializationContext deserializationContext, SettableBeanProperty settableBeanProperty, PropertyMetadata propertyMetadata) throws JsonMappingException {
        PropertyMetadata.StateListAnimator mergeInfo = propertyMetadata.getMergeInfo();
        if (mergeInfo != null) {
            AbstractC5548Vy<Object> valueDeserializer = settableBeanProperty.getValueDeserializer();
            Boolean boolSupportsUpdate = valueDeserializer.supportsUpdate(deserializationContext.getConfig());
            if (boolSupportsUpdate == null) {
                if (mergeInfo.AEQbTJ) {
                    return settableBeanProperty;
                }
            } else if (!boolSupportsUpdate.booleanValue()) {
                if (!mergeInfo.AEQbTJ) {
                    deserializationContext.handleBadMerge(valueDeserializer);
                }
                return settableBeanProperty;
            }
            AnnotatedMember annotatedMember = mergeInfo.EZpvd;
            annotatedMember.fixAccess(deserializationContext.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
            if (!(settableBeanProperty instanceof SetterlessProperty)) {
                settableBeanProperty = MergingSettableBeanProperty.construct(settableBeanProperty, annotatedMember);
            }
        }
        InterfaceC5555Wf interfaceC5555WfFindValueNullProvider = findValueNullProvider(deserializationContext, settableBeanProperty, propertyMetadata);
        return interfaceC5555WfFindValueNullProvider != null ? settableBeanProperty.withNullProvider(interfaceC5555WfFindValueNullProvider) : settableBeanProperty;
    }

    @Override // o.AbstractC5548Vy
    public AccessPattern getNullAccessPattern() {
        return AccessPattern.ALWAYS_NULL;
    }

    @Override // o.AbstractC5548Vy
    public AccessPattern getEmptyAccessPattern() {
        return AccessPattern.DYNAMIC;
    }

    @Override // o.AbstractC5548Vy
    public Object getEmptyValue(DeserializationContext deserializationContext) throws JsonMappingException {
        try {
            return this._valueInstantiator.createUsingDefault(deserializationContext);
        } catch (IOException e) {
            return C5619Yr.copydefault(deserializationContext, e);
        }
    }

    public boolean isCaseInsensitive() {
        return this._beanProperties.isCaseInsensitive();
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer, o.AbstractC5548Vy
    public Class<?> handledType() {
        return this._beanType.getRawClass();
    }

    public boolean hasProperty(String str) {
        return this._beanProperties.find(str) != null;
    }

    public int getPropertyCount() {
        return this._beanProperties.size();
    }

    @Override // o.AbstractC5548Vy
    public Collection<Object> getKnownPropertyNames() {
        ArrayList arrayList = new ArrayList();
        Iterator<SettableBeanProperty> it = this._beanProperties.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getName());
        }
        return arrayList;
    }

    @Deprecated
    public final Class<?> getBeanClass() {
        return this._beanType.getRawClass();
    }

    @Override // o.AbstractC5548Vy
    public LogicalType logicalType() {
        return LogicalType.POJO;
    }

    public Iterator<SettableBeanProperty> properties() {
        BeanPropertyMap beanPropertyMap = this._beanProperties;
        if (beanPropertyMap == null) {
            throw new IllegalStateException("Can only call after BeanDeserializer has been resolved");
        }
        return beanPropertyMap.iterator();
    }

    public Iterator<SettableBeanProperty> creatorProperties() {
        PropertyBasedCreator propertyBasedCreator = this._propertyBasedCreator;
        if (propertyBasedCreator == null) {
            return Collections.emptyList().iterator();
        }
        return propertyBasedCreator.AEQbTJ().iterator();
    }

    public SettableBeanProperty findProperty(PropertyName propertyName) {
        return findProperty(propertyName.getSimpleName());
    }

    public SettableBeanProperty findProperty(String str) {
        PropertyBasedCreator propertyBasedCreator;
        BeanPropertyMap beanPropertyMap = this._beanProperties;
        SettableBeanProperty settableBeanPropertyFind = beanPropertyMap == null ? null : beanPropertyMap.find(str);
        return (settableBeanPropertyFind != null || (propertyBasedCreator = this._propertyBasedCreator) == null) ? settableBeanPropertyFind : propertyBasedCreator.KWHzl(str);
    }

    public SettableBeanProperty findProperty(int i) {
        PropertyBasedCreator propertyBasedCreator;
        BeanPropertyMap beanPropertyMap = this._beanProperties;
        SettableBeanProperty settableBeanPropertyFind = beanPropertyMap == null ? null : beanPropertyMap.find(i);
        return (settableBeanPropertyFind != null || (propertyBasedCreator = this._propertyBasedCreator) == null) ? settableBeanPropertyFind : propertyBasedCreator.copydefault(i);
    }

    @Override // o.AbstractC5548Vy
    public SettableBeanProperty findBackReference(String str) {
        Map<String, SettableBeanProperty> map = this._backRefs;
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    public void replaceProperty(SettableBeanProperty settableBeanProperty, SettableBeanProperty settableBeanProperty2) {
        this._beanProperties.replace(settableBeanProperty, settableBeanProperty2);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer, o.AbstractC5548Vy
    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, AbstractC5597Xv abstractC5597Xv) throws IOException {
        Object objAuCTelauCTel;
        if (this._objectIdReader != null) {
            if (jsonParser.EZpvd() && (objAuCTelauCTel = jsonParser.AuCTelauCTel()) != null) {
                return _handleTypedObjectId(jsonParser, deserializationContext, abstractC5597Xv.deserializeTypedFromObject(jsonParser, deserializationContext), objAuCTelauCTel);
            }
            JsonToken jsonTokenDjBIcL = jsonParser.djBIcL();
            if (jsonTokenDjBIcL != null) {
                if (jsonTokenDjBIcL.isScalarValue()) {
                    return deserializeFromObjectId(jsonParser, deserializationContext);
                }
                if (jsonTokenDjBIcL == JsonToken.START_OBJECT) {
                    jsonTokenDjBIcL = jsonParser.RcXXUw();
                }
                if (jsonTokenDjBIcL == JsonToken.FIELD_NAME && this._objectIdReader.maySerializeAsObject() && this._objectIdReader.isValidReferencePropertyName(jsonParser.KWHzl(), jsonParser)) {
                    return deserializeFromObjectId(jsonParser, deserializationContext);
                }
            }
        }
        return abstractC5597Xv.deserializeTypedFromObject(jsonParser, deserializationContext);
    }

    public Object _handleTypedObjectId(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj, Object obj2) throws IOException {
        AbstractC5548Vy<Object> deserializer = this._objectIdReader.getDeserializer();
        if (deserializer.handledType() != obj2.getClass()) {
            obj2 = _convertObjectId(jsonParser, deserializationContext, obj2, deserializer);
        }
        ObjectIdReader objectIdReader = this._objectIdReader;
        deserializationContext.findObjectId(obj2, objectIdReader.generator, objectIdReader.resolver).AEQbTJ(obj);
        SettableBeanProperty settableBeanProperty = this._objectIdReader.idProperty;
        return settableBeanProperty != null ? settableBeanProperty.setAndReturn(obj, obj2) : obj;
    }

    public Object _convertObjectId(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj, AbstractC5548Vy<Object> abstractC5548Vy) throws IOException {
        YA yaBufferForInputBuffering = deserializationContext.bufferForInputBuffering(jsonParser);
        if (obj instanceof String) {
            yaBufferForInputBuffering.AhwBna((String) obj);
        } else if (obj instanceof Long) {
            yaBufferForInputBuffering.EZpvd(((Long) obj).longValue());
        } else if (obj instanceof Integer) {
            yaBufferForInputBuffering.copydefault(((Integer) obj).intValue());
        } else {
            yaBufferForInputBuffering.EZpvd(obj);
        }
        JsonParser jsonParserFIwbmz = yaBufferForInputBuffering.fIwbmz();
        jsonParserFIwbmz.RcXXUw();
        return abstractC5548Vy.deserialize(jsonParserFIwbmz, deserializationContext);
    }

    public Object deserializeWithObjectId(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        return deserializeFromObject(jsonParser, deserializationContext);
    }

    public Object deserializeFromObjectId(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        Object objectReference = this._objectIdReader.readObjectReference(jsonParser, deserializationContext);
        ObjectIdReader objectIdReader = this._objectIdReader;
        C5565Wp c5565WpFindObjectId = deserializationContext.findObjectId(objectReference, objectIdReader.generator, objectIdReader.resolver);
        Object objOLrzqt = c5565WpFindObjectId.OLrzqt();
        if (objOLrzqt != null) {
            return objOLrzqt;
        }
        throw new UnresolvedForwardReference(jsonParser, "Could not resolve Object Id [" + objectReference + "] (for " + this._beanType + ").", jsonParser.fetchVPNInfo(), c5565WpFindObjectId);
    }

    public Object deserializeFromObjectUsingNonDefault(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        AbstractC5548Vy<Object> abstractC5548Vy_delegateDeserializer = _delegateDeserializer();
        if (abstractC5548Vy_delegateDeserializer != null) {
            Object objCreateUsingDelegate = this._valueInstantiator.createUsingDelegate(deserializationContext, abstractC5548Vy_delegateDeserializer.deserialize(jsonParser, deserializationContext));
            if (this._injectables != null) {
                injectValues(deserializationContext, objCreateUsingDelegate);
            }
            return objCreateUsingDelegate;
        }
        if (this._propertyBasedCreator != null) {
            return _deserializeUsingPropertyBased(jsonParser, deserializationContext);
        }
        Class<?> rawClass = this._beanType.getRawClass();
        if (C5619Yr.fIwbmz(rawClass)) {
            return deserializationContext.handleMissingInstantiator(rawClass, null, jsonParser, "non-static inner classes like this can only by instantiated using default, no-argument constructor", new Object[0]);
        }
        if (C5622Yv.copydefault(rawClass)) {
            return deserializationContext.handleMissingInstantiator(rawClass, null, jsonParser, "cannot deserialize from Object value (no delegate- or property-based Creator): this appears to be a native image, in which case you may need to configure reflection for the class that is to be deserialized", new Object[0]);
        }
        return deserializationContext.handleMissingInstantiator(rawClass, getValueInstantiator(), jsonParser, "cannot deserialize from Object value (no delegate- or property-based Creator)", new Object[0]);
    }

    public Object deserializeFromNumber(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        if (this._objectIdReader != null) {
            return deserializeFromObjectId(jsonParser, deserializationContext);
        }
        AbstractC5548Vy<Object> abstractC5548Vy_delegateDeserializer = _delegateDeserializer();
        JsonParser.NumberType numberTypeUzCIH = jsonParser.uzCIH();
        if (numberTypeUzCIH == JsonParser.NumberType.INT) {
            if (abstractC5548Vy_delegateDeserializer != null && !this._valueInstantiator.canCreateFromInt()) {
                Object objCreateUsingDelegate = this._valueInstantiator.createUsingDelegate(deserializationContext, abstractC5548Vy_delegateDeserializer.deserialize(jsonParser, deserializationContext));
                if (this._injectables != null) {
                    injectValues(deserializationContext, objCreateUsingDelegate);
                }
                return objCreateUsingDelegate;
            }
            return this._valueInstantiator.createFromInt(deserializationContext, jsonParser.getFieldNames());
        }
        if (numberTypeUzCIH == JsonParser.NumberType.LONG) {
            if (abstractC5548Vy_delegateDeserializer != null && !this._valueInstantiator.canCreateFromInt()) {
                Object objCreateUsingDelegate2 = this._valueInstantiator.createUsingDelegate(deserializationContext, abstractC5548Vy_delegateDeserializer.deserialize(jsonParser, deserializationContext));
                if (this._injectables != null) {
                    injectValues(deserializationContext, objCreateUsingDelegate2);
                }
                return objCreateUsingDelegate2;
            }
            return this._valueInstantiator.createFromLong(deserializationContext, jsonParser.getNewProxyInstance());
        }
        if (numberTypeUzCIH == JsonParser.NumberType.BIG_INTEGER) {
            if (abstractC5548Vy_delegateDeserializer != null && !this._valueInstantiator.canCreateFromBigInteger()) {
                Object objCreateUsingDelegate3 = this._valueInstantiator.createUsingDelegate(deserializationContext, abstractC5548Vy_delegateDeserializer.deserialize(jsonParser, deserializationContext));
                if (this._injectables != null) {
                    injectValues(deserializationContext, objCreateUsingDelegate3);
                }
                return objCreateUsingDelegate3;
            }
            return this._valueInstantiator.createFromBigInteger(deserializationContext, jsonParser.gEmmrt());
        }
        return deserializationContext.handleMissingInstantiator(handledType(), getValueInstantiator(), jsonParser, "no suitable creator method found to deserialize from Number value (%s)", jsonParser.hDKMBd());
    }

    public Object deserializeFromString(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        if (this._objectIdReader != null) {
            return deserializeFromObjectId(jsonParser, deserializationContext);
        }
        AbstractC5548Vy<Object> abstractC5548Vy_delegateDeserializer = _delegateDeserializer();
        if (abstractC5548Vy_delegateDeserializer != null && !this._valueInstantiator.canCreateFromString()) {
            Object objCreateUsingDelegate = this._valueInstantiator.createUsingDelegate(deserializationContext, abstractC5548Vy_delegateDeserializer.deserialize(jsonParser, deserializationContext));
            if (this._injectables != null) {
                injectValues(deserializationContext, objCreateUsingDelegate);
            }
            return objCreateUsingDelegate;
        }
        return _deserializeFromString(jsonParser, deserializationContext);
    }

    public Object deserializeFromDouble(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        JsonParser.NumberType numberTypeUzCIH = jsonParser.uzCIH();
        if (numberTypeUzCIH == JsonParser.NumberType.DOUBLE || numberTypeUzCIH == JsonParser.NumberType.FLOAT) {
            AbstractC5548Vy<Object> abstractC5548Vy_delegateDeserializer = _delegateDeserializer();
            if (abstractC5548Vy_delegateDeserializer != null && !this._valueInstantiator.canCreateFromDouble()) {
                Object objCreateUsingDelegate = this._valueInstantiator.createUsingDelegate(deserializationContext, abstractC5548Vy_delegateDeserializer.deserialize(jsonParser, deserializationContext));
                if (this._injectables != null) {
                    injectValues(deserializationContext, objCreateUsingDelegate);
                }
                return objCreateUsingDelegate;
            }
            return this._valueInstantiator.createFromDouble(deserializationContext, jsonParser.fARcdN());
        }
        if (numberTypeUzCIH == JsonParser.NumberType.BIG_DECIMAL) {
            AbstractC5548Vy<Object> abstractC5548Vy_delegateDeserializer2 = _delegateDeserializer();
            if (abstractC5548Vy_delegateDeserializer2 != null && !this._valueInstantiator.canCreateFromBigDecimal()) {
                Object objCreateUsingDelegate2 = this._valueInstantiator.createUsingDelegate(deserializationContext, abstractC5548Vy_delegateDeserializer2.deserialize(jsonParser, deserializationContext));
                if (this._injectables != null) {
                    injectValues(deserializationContext, objCreateUsingDelegate2);
                }
                return objCreateUsingDelegate2;
            }
            return this._valueInstantiator.createFromBigDecimal(deserializationContext, jsonParser.fJNWhG());
        }
        return deserializationContext.handleMissingInstantiator(handledType(), getValueInstantiator(), jsonParser, "no suitable creator method found to deserialize from Number value (%s)", jsonParser.hDKMBd());
    }

    public Object deserializeFromBoolean(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        AbstractC5548Vy<Object> abstractC5548Vy_delegateDeserializer = _delegateDeserializer();
        if (abstractC5548Vy_delegateDeserializer != null && !this._valueInstantiator.canCreateFromBoolean()) {
            Object objCreateUsingDelegate = this._valueInstantiator.createUsingDelegate(deserializationContext, abstractC5548Vy_delegateDeserializer.deserialize(jsonParser, deserializationContext));
            if (this._injectables != null) {
                injectValues(deserializationContext, objCreateUsingDelegate);
            }
            return objCreateUsingDelegate;
        }
        return this._valueInstantiator.createFromBoolean(deserializationContext, jsonParser.djBIcL() == JsonToken.VALUE_TRUE);
    }

    @Deprecated
    public Object deserializeFromArray(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        return _deserializeFromArray(jsonParser, deserializationContext);
    }

    public Object deserializeFromEmbedded(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        if (this._objectIdReader != null) {
            return deserializeFromObjectId(jsonParser, deserializationContext);
        }
        AbstractC5548Vy<Object> abstractC5548Vy_delegateDeserializer = _delegateDeserializer();
        if (abstractC5548Vy_delegateDeserializer != null && !this._valueInstantiator.canCreateFromString()) {
            Object objCreateUsingDelegate = this._valueInstantiator.createUsingDelegate(deserializationContext, abstractC5548Vy_delegateDeserializer.deserialize(jsonParser, deserializationContext));
            if (this._injectables != null) {
                injectValues(deserializationContext, objCreateUsingDelegate);
            }
            return objCreateUsingDelegate;
        }
        Object objAuCTel = jsonParser.AuCTel();
        return (objAuCTel == null || this._beanType.isTypeOrSuperTypeOf(objAuCTel.getClass())) ? objAuCTel : deserializationContext.handleWeirdNativeValue(this._beanType, objAuCTel, jsonParser);
    }

    public void injectValues(DeserializationContext deserializationContext, Object obj) throws IOException {
        for (ValueInjector valueInjector : this._injectables) {
            valueInjector.inject(deserializationContext, obj);
        }
    }

    public Object handleUnknownProperties(DeserializationContext deserializationContext, Object obj, YA ya) throws IOException {
        ya.DbNXlk();
        JsonParser jsonParserFIwbmz = ya.fIwbmz();
        while (jsonParserFIwbmz.RcXXUw() != JsonToken.END_OBJECT) {
            String strKWHzl = jsonParserFIwbmz.KWHzl();
            jsonParserFIwbmz.RcXXUw();
            handleUnknownProperty(jsonParserFIwbmz, deserializationContext, obj, strKWHzl);
        }
        return obj;
    }

    public void handleUnknownVanilla(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj, String str) throws IOException {
        if (IgnorePropertiesUtil.KWHzl(str, this._ignorableProps, this._includableProps)) {
            handleIgnoredProperty(jsonParser, deserializationContext, obj, str);
            return;
        }
        SettableAnyProperty settableAnyProperty = this._anySetter;
        if (settableAnyProperty != null) {
            try {
                settableAnyProperty.deserializeAndSet(jsonParser, deserializationContext, obj, str);
                return;
            } catch (Exception e) {
                wrapAndThrow(e, obj, str, deserializationContext);
                return;
            }
        }
        handleUnknownProperty(jsonParser, deserializationContext, obj, str);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer
    public void handleUnknownProperty(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj, String str) throws IOException {
        if (this._ignoreAllUnknown) {
            jsonParser.UeEOUB();
            return;
        }
        if (IgnorePropertiesUtil.KWHzl(str, this._ignorableProps, this._includableProps)) {
            handleIgnoredProperty(jsonParser, deserializationContext, obj, str);
        }
        super.handleUnknownProperty(jsonParser, deserializationContext, obj, str);
    }

    public void handleIgnoredProperty(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj, String str) throws IOException {
        if (deserializationContext.isEnabled(DeserializationFeature.FAIL_ON_IGNORED_PROPERTIES)) {
            throw IgnoredPropertyException.from(jsonParser, obj, str, getKnownPropertyNames());
        }
        jsonParser.UeEOUB();
    }

    public Object handlePolymorphic(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj, YA ya) throws IOException {
        AbstractC5548Vy<Object> abstractC5548Vy_findSubclassDeserializer = _findSubclassDeserializer(deserializationContext, obj, ya);
        if (abstractC5548Vy_findSubclassDeserializer == null) {
            if (ya != null) {
                obj = handleUnknownProperties(deserializationContext, obj, ya);
            }
            return jsonParser != null ? deserialize(jsonParser, deserializationContext, obj) : obj;
        }
        if (ya != null) {
            ya.DbNXlk();
            JsonParser jsonParserFIwbmz = ya.fIwbmz();
            jsonParserFIwbmz.RcXXUw();
            obj = abstractC5548Vy_findSubclassDeserializer.deserialize(jsonParserFIwbmz, deserializationContext, obj);
        }
        return jsonParser != null ? abstractC5548Vy_findSubclassDeserializer.deserialize(jsonParser, deserializationContext, obj) : obj;
    }

    public AbstractC5548Vy<Object> _findSubclassDeserializer(DeserializationContext deserializationContext, Object obj, YA ya) throws IOException {
        AbstractC5548Vy<Object> abstractC5548Vy;
        synchronized (this) {
            HashMap<ClassKey, AbstractC5548Vy<Object>> map = this._subDeserializers;
            abstractC5548Vy = map == null ? null : map.get(new ClassKey(obj.getClass()));
        }
        if (abstractC5548Vy != null) {
            return abstractC5548Vy;
        }
        AbstractC5548Vy<Object> abstractC5548VyFindRootValueDeserializer = deserializationContext.findRootValueDeserializer(deserializationContext.constructType(obj.getClass()));
        if (abstractC5548VyFindRootValueDeserializer != null) {
            synchronized (this) {
                if (this._subDeserializers == null) {
                    this._subDeserializers = new HashMap<>();
                }
                this._subDeserializers.put(new ClassKey(obj.getClass()), abstractC5548VyFindRootValueDeserializer);
            }
        }
        return abstractC5548VyFindRootValueDeserializer;
    }

    public void wrapAndThrow(Throwable th, Object obj, String str, DeserializationContext deserializationContext) throws IOException {
        throw JsonMappingException.wrapWithPath(throwOrReturnThrowable(th, deserializationContext), obj, str);
    }

    private Throwable throwOrReturnThrowable(Throwable th, DeserializationContext deserializationContext) throws IOException {
        while ((th instanceof InvocationTargetException) && th.getCause() != null) {
            th = th.getCause();
        }
        C5619Yr.copydefault(th);
        boolean z = deserializationContext == null || deserializationContext.isEnabled(DeserializationFeature.WRAP_EXCEPTIONS);
        if (th instanceof IOException) {
            if (!z || !(th instanceof JacksonException)) {
                throw ((IOException) th);
            }
        } else if (!z) {
            C5619Yr.AhwBna(th);
        }
        return th;
    }

    public Object wrapInstantiationProblem(Throwable th, DeserializationContext deserializationContext) throws IOException {
        while ((th instanceof InvocationTargetException) && th.getCause() != null) {
            th = th.getCause();
        }
        C5619Yr.copydefault(th);
        if (th instanceof IOException) {
            throw ((IOException) th);
        }
        if (deserializationContext == null) {
            throw new IllegalArgumentException(th.getMessage(), th);
        }
        if (!deserializationContext.isEnabled(DeserializationFeature.WRAP_EXCEPTIONS)) {
            C5619Yr.AhwBna(th);
        }
        return deserializationContext.handleInstantiationProblem(this._beanType.getRawClass(), null, th);
    }
}
