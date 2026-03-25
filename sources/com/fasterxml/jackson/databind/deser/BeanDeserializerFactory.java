package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonIncludeProperties;
import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig;
import com.fasterxml.jackson.databind.deser.impl.FieldProperty;
import com.fasterxml.jackson.databind.deser.impl.MethodProperty;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReader;
import com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator;
import com.fasterxml.jackson.databind.deser.impl.SetterlessProperty;
import com.fasterxml.jackson.databind.deser.impl.UnsupportedTypeDeserializer;
import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import com.fasterxml.jackson.databind.introspect.AnnotatedField;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.util.IgnorePropertiesUtil;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import o.AbstractC5547Vx;
import o.AbstractC5548Vy;
import o.AbstractC5549Vz;
import o.AbstractC5550Wa;
import o.AbstractC5597Xv;
import o.C5561Wl;
import o.C5576Xa;
import o.C5614Ym;
import o.C5619Yr;
import o.InterfaceC5500Ud;
import o.InterfaceC5553Wd;
import o.VC;
import o.VO;
import o.VW;
import o.VX;
import o.WT;
import o.XL;
import o.YB;

/* JADX INFO: loaded from: classes21.dex */
public class BeanDeserializerFactory extends BasicDeserializerFactory implements Serializable {
    private static final Class<?>[] INIT_CAUSE_PARAMS = {Throwable.class};
    public static final BeanDeserializerFactory instance = new BeanDeserializerFactory(new DeserializerFactoryConfig());
    private static final long serialVersionUID = 1;

    public BeanDeserializerFactory(DeserializerFactoryConfig deserializerFactoryConfig) {
        super(deserializerFactoryConfig);
    }

    @Override // com.fasterxml.jackson.databind.deser.BasicDeserializerFactory
    public AbstractC5550Wa withConfig(DeserializerFactoryConfig deserializerFactoryConfig) {
        if (this._factoryConfig == deserializerFactoryConfig) {
            return this;
        }
        C5619Yr.AEQbTJ((Class<?>) BeanDeserializerFactory.class, this, "withConfig");
        return new BeanDeserializerFactory(deserializerFactoryConfig);
    }

    @Override // o.AbstractC5550Wa
    public AbstractC5548Vy<Object> createBeanDeserializer(DeserializationContext deserializationContext, JavaType javaType, AbstractC5549Vz abstractC5549Vz) throws JsonMappingException {
        JavaType javaTypeMaterializeAbstractType;
        DeserializationConfig config = deserializationContext.getConfig();
        AbstractC5548Vy<?> abstractC5548Vy_findCustomBeanDeserializer = _findCustomBeanDeserializer(javaType, config, abstractC5549Vz);
        if (abstractC5548Vy_findCustomBeanDeserializer != null) {
            if (this._factoryConfig.hasDeserializerModifiers()) {
                Iterator<VX> it = this._factoryConfig.deserializerModifiers().iterator();
                while (it.hasNext()) {
                    abstractC5548Vy_findCustomBeanDeserializer = it.next().copydefault(deserializationContext.getConfig(), abstractC5549Vz, abstractC5548Vy_findCustomBeanDeserializer);
                }
            }
            return abstractC5548Vy_findCustomBeanDeserializer;
        }
        if (javaType.isThrowable()) {
            return buildThrowableDeserializer(deserializationContext, javaType, abstractC5549Vz);
        }
        if (javaType.isAbstract() && !javaType.isPrimitive() && !javaType.isEnumType() && (javaTypeMaterializeAbstractType = materializeAbstractType(deserializationContext, javaType, abstractC5549Vz)) != null) {
            return buildBeanDeserializer(deserializationContext, javaTypeMaterializeAbstractType, config.introspect(javaTypeMaterializeAbstractType));
        }
        AbstractC5548Vy<?> abstractC5548VyFindStdDeserializer = findStdDeserializer(deserializationContext, javaType, abstractC5549Vz);
        if (abstractC5548VyFindStdDeserializer != null) {
            return abstractC5548VyFindStdDeserializer;
        }
        if (!isPotentialBeanType(javaType.getRawClass())) {
            return null;
        }
        _validateSubType(deserializationContext, javaType, abstractC5549Vz);
        AbstractC5548Vy<Object> abstractC5548Vy_findUnsupportedTypeDeserializer = _findUnsupportedTypeDeserializer(deserializationContext, javaType, abstractC5549Vz);
        return abstractC5548Vy_findUnsupportedTypeDeserializer != null ? abstractC5548Vy_findUnsupportedTypeDeserializer : buildBeanDeserializer(deserializationContext, javaType, abstractC5549Vz);
    }

    @Override // o.AbstractC5550Wa
    public AbstractC5548Vy<Object> createBuilderBasedDeserializer(DeserializationContext deserializationContext, JavaType javaType, AbstractC5549Vz abstractC5549Vz, Class<?> cls) throws JsonMappingException {
        JavaType javaTypeConstructType;
        if (deserializationContext.isEnabled(MapperFeature.INFER_BUILDER_TYPE_BINDINGS)) {
            javaTypeConstructType = deserializationContext.getTypeFactory().constructParametricType(cls, javaType.getBindings());
        } else {
            javaTypeConstructType = deserializationContext.constructType(cls);
        }
        return buildBuilderBasedDeserializer(deserializationContext, javaType, deserializationContext.getConfig().introspectForBuilder(javaTypeConstructType, abstractC5549Vz));
    }

    public AbstractC5548Vy<?> findStdDeserializer(DeserializationContext deserializationContext, JavaType javaType, AbstractC5549Vz abstractC5549Vz) throws JsonMappingException {
        AbstractC5548Vy<?> abstractC5548VyFindDefaultDeserializer = findDefaultDeserializer(deserializationContext, javaType, abstractC5549Vz);
        if (abstractC5548VyFindDefaultDeserializer != null && this._factoryConfig.hasDeserializerModifiers()) {
            Iterator<VX> it = this._factoryConfig.deserializerModifiers().iterator();
            while (it.hasNext()) {
                abstractC5548VyFindDefaultDeserializer = it.next().copydefault(deserializationContext.getConfig(), abstractC5549Vz, abstractC5548VyFindDefaultDeserializer);
            }
        }
        return abstractC5548VyFindDefaultDeserializer;
    }

    public AbstractC5548Vy<Object> _findUnsupportedTypeDeserializer(DeserializationContext deserializationContext, JavaType javaType, AbstractC5549Vz abstractC5549Vz) throws JsonMappingException {
        String strAEQbTJ = C5614Ym.AEQbTJ(javaType);
        if (strAEQbTJ == null || deserializationContext.getConfig().findMixInClassFor(javaType.getRawClass()) != null) {
            return null;
        }
        return new UnsupportedTypeDeserializer(javaType, strAEQbTJ);
    }

    public JavaType materializeAbstractType(DeserializationContext deserializationContext, JavaType javaType, AbstractC5549Vz abstractC5549Vz) throws JsonMappingException {
        Iterator<AbstractC5547Vx> it = this._factoryConfig.abstractTypeResolvers().iterator();
        while (it.hasNext()) {
            JavaType javaTypeResolveAbstractType = it.next().resolveAbstractType(deserializationContext.getConfig(), abstractC5549Vz);
            if (javaTypeResolveAbstractType != null) {
                return javaTypeResolveAbstractType;
            }
        }
        return null;
    }

    public AbstractC5548Vy<Object> buildBeanDeserializer(DeserializationContext deserializationContext, JavaType javaType, AbstractC5549Vz abstractC5549Vz) throws DatabindException {
        AbstractC5548Vy<?> abstractC5548VyOLrzqt;
        try {
            ValueInstantiator valueInstantiatorFindValueInstantiator = findValueInstantiator(deserializationContext, abstractC5549Vz);
            VW vwConstructBeanDeserializerBuilder = constructBeanDeserializerBuilder(deserializationContext, abstractC5549Vz);
            vwConstructBeanDeserializerBuilder.OLrzqt(valueInstantiatorFindValueInstantiator);
            addBeanProps(deserializationContext, abstractC5549Vz, vwConstructBeanDeserializerBuilder);
            addObjectIdReader(deserializationContext, abstractC5549Vz, vwConstructBeanDeserializerBuilder);
            addBackReferenceProperties(deserializationContext, abstractC5549Vz, vwConstructBeanDeserializerBuilder);
            addInjectables(deserializationContext, abstractC5549Vz, vwConstructBeanDeserializerBuilder);
            DeserializationConfig config = deserializationContext.getConfig();
            if (this._factoryConfig.hasDeserializerModifiers()) {
                Iterator<VX> it = this._factoryConfig.deserializerModifiers().iterator();
                while (it.hasNext()) {
                    vwConstructBeanDeserializerBuilder = it.next().EZpvd(config, abstractC5549Vz, vwConstructBeanDeserializerBuilder);
                }
            }
            if (javaType.isAbstract() && !valueInstantiatorFindValueInstantiator.canInstantiate()) {
                abstractC5548VyOLrzqt = vwConstructBeanDeserializerBuilder.AEQbTJ();
            } else {
                abstractC5548VyOLrzqt = vwConstructBeanDeserializerBuilder.OLrzqt();
            }
            if (this._factoryConfig.hasDeserializerModifiers()) {
                Iterator<VX> it2 = this._factoryConfig.deserializerModifiers().iterator();
                while (it2.hasNext()) {
                    abstractC5548VyOLrzqt = it2.next().copydefault(config, abstractC5549Vz, abstractC5548VyOLrzqt);
                }
            }
            return abstractC5548VyOLrzqt;
        } catch (IllegalArgumentException e) {
            throw InvalidDefinitionException.from(deserializationContext.getParser(), C5619Yr.EZpvd((Throwable) e), abstractC5549Vz, (WT) null).withCause(e);
        } catch (NoClassDefFoundError e2) {
            return new C5561Wl(e2);
        }
    }

    public AbstractC5548Vy<Object> buildBuilderBasedDeserializer(DeserializationContext deserializationContext, JavaType javaType, AbstractC5549Vz abstractC5549Vz) throws DatabindException {
        try {
            ValueInstantiator valueInstantiatorFindValueInstantiator = findValueInstantiator(deserializationContext, abstractC5549Vz);
            DeserializationConfig config = deserializationContext.getConfig();
            VW vwConstructBeanDeserializerBuilder = constructBeanDeserializerBuilder(deserializationContext, abstractC5549Vz);
            vwConstructBeanDeserializerBuilder.OLrzqt(valueInstantiatorFindValueInstantiator);
            addBeanProps(deserializationContext, abstractC5549Vz, vwConstructBeanDeserializerBuilder);
            addObjectIdReader(deserializationContext, abstractC5549Vz, vwConstructBeanDeserializerBuilder);
            addBackReferenceProperties(deserializationContext, abstractC5549Vz, vwConstructBeanDeserializerBuilder);
            addInjectables(deserializationContext, abstractC5549Vz, vwConstructBeanDeserializerBuilder);
            VO.StateListAnimator stateListAnimatorAkhnZx = abstractC5549Vz.AkhnZx();
            String str = stateListAnimatorAkhnZx == null ? "build" : stateListAnimatorAkhnZx.EZpvd;
            AnnotatedMethod annotatedMethodAEQbTJ = abstractC5549Vz.AEQbTJ(str, null);
            if (annotatedMethodAEQbTJ != null && config.canOverrideAccessModifiers()) {
                C5619Yr.EZpvd(annotatedMethodAEQbTJ.getMember(), config.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
            }
            vwConstructBeanDeserializerBuilder.copydefault(annotatedMethodAEQbTJ, stateListAnimatorAkhnZx);
            if (this._factoryConfig.hasDeserializerModifiers()) {
                Iterator<VX> it = this._factoryConfig.deserializerModifiers().iterator();
                while (it.hasNext()) {
                    vwConstructBeanDeserializerBuilder = it.next().EZpvd(config, abstractC5549Vz, vwConstructBeanDeserializerBuilder);
                }
            }
            AbstractC5548Vy<?> abstractC5548VyAEQbTJ = vwConstructBeanDeserializerBuilder.AEQbTJ(javaType, str);
            if (this._factoryConfig.hasDeserializerModifiers()) {
                Iterator<VX> it2 = this._factoryConfig.deserializerModifiers().iterator();
                while (it2.hasNext()) {
                    abstractC5548VyAEQbTJ = it2.next().copydefault(config, abstractC5549Vz, abstractC5548VyAEQbTJ);
                }
            }
            return abstractC5548VyAEQbTJ;
        } catch (IllegalArgumentException e) {
            throw InvalidDefinitionException.from(deserializationContext.getParser(), C5619Yr.EZpvd((Throwable) e), abstractC5549Vz, (WT) null);
        } catch (NoClassDefFoundError e2) {
            return new C5561Wl(e2);
        }
    }

    public void addObjectIdReader(DeserializationContext deserializationContext, AbstractC5549Vz abstractC5549Vz, VW vw) throws JsonMappingException {
        SettableBeanProperty settableBeanPropertyCopydefault;
        ObjectIdGenerator<?> objectIdGeneratorObjectIdGeneratorInstance;
        JavaType javaType;
        C5576Xa c5576XaIwGUEr = abstractC5549Vz.iwGUEr();
        if (c5576XaIwGUEr == null) {
            return;
        }
        Class<? extends ObjectIdGenerator<?>> clsEZpvd = c5576XaIwGUEr.EZpvd();
        InterfaceC5500Ud interfaceC5500UdObjectIdResolverInstance = deserializationContext.objectIdResolverInstance(abstractC5549Vz.AuCTel(), c5576XaIwGUEr);
        if (clsEZpvd == ObjectIdGenerators.PropertyGenerator.class) {
            PropertyName propertyNameAEQbTJ = c5576XaIwGUEr.AEQbTJ();
            settableBeanPropertyCopydefault = vw.copydefault(propertyNameAEQbTJ);
            if (settableBeanPropertyCopydefault == null) {
                throw new IllegalArgumentException(String.format("Invalid Object Id definition for %s: cannot find property with name %s", C5619Yr.copydefault(abstractC5549Vz.getNewProxyInstance()), C5619Yr.copydefault(propertyNameAEQbTJ)));
            }
            JavaType type = settableBeanPropertyCopydefault.getType();
            javaType = type;
            objectIdGeneratorObjectIdGeneratorInstance = new PropertyBasedObjectIdGenerator(c5576XaIwGUEr.AYXKKw());
        } else {
            JavaType javaType2 = deserializationContext.getTypeFactory().findTypeParameters(deserializationContext.constructType((Class<?>) clsEZpvd), ObjectIdGenerator.class)[0];
            settableBeanPropertyCopydefault = null;
            objectIdGeneratorObjectIdGeneratorInstance = deserializationContext.objectIdGeneratorInstance(abstractC5549Vz.AuCTel(), c5576XaIwGUEr);
            javaType = javaType2;
        }
        AbstractC5548Vy<Object> abstractC5548VyFindRootValueDeserializer = deserializationContext.findRootValueDeserializer(javaType);
        vw.KWHzl(ObjectIdReader.construct(javaType, c5576XaIwGUEr.AEQbTJ(), objectIdGeneratorObjectIdGeneratorInstance, abstractC5548VyFindRootValueDeserializer, settableBeanPropertyCopydefault, interfaceC5500UdObjectIdResolverInstance));
    }

    public AbstractC5548Vy<Object> buildThrowableDeserializer(DeserializationContext deserializationContext, JavaType javaType, AbstractC5549Vz abstractC5549Vz) throws DatabindException {
        DeserializationConfig config = deserializationContext.getConfig();
        VW vwConstructBeanDeserializerBuilder = constructBeanDeserializerBuilder(deserializationContext, abstractC5549Vz);
        vwConstructBeanDeserializerBuilder.OLrzqt(findValueInstantiator(deserializationContext, abstractC5549Vz));
        addBeanProps(deserializationContext, abstractC5549Vz, vwConstructBeanDeserializerBuilder);
        Iterator<SettableBeanProperty> itValueOf = vwConstructBeanDeserializerBuilder.valueOf();
        while (true) {
            if (!itValueOf.hasNext()) {
                break;
            }
            if ("setCause".equals(itValueOf.next().getMember().getName())) {
                itValueOf.remove();
                break;
            }
        }
        AnnotatedMethod annotatedMethodAEQbTJ = abstractC5549Vz.AEQbTJ("initCause", INIT_CAUSE_PARAMS);
        if (annotatedMethodAEQbTJ != null) {
            PropertyNamingStrategy propertyNamingStrategy = config.getPropertyNamingStrategy();
            SettableBeanProperty settableBeanPropertyConstructSettableProperty = constructSettableProperty(deserializationContext, abstractC5549Vz, YB.EZpvd(deserializationContext.getConfig(), annotatedMethodAEQbTJ, new PropertyName(propertyNamingStrategy != null ? propertyNamingStrategy.nameForSetterMethod(config, annotatedMethodAEQbTJ, "cause") : "cause")), annotatedMethodAEQbTJ.getParameterType(0));
            if (settableBeanPropertyConstructSettableProperty != null) {
                vwConstructBeanDeserializerBuilder.OLrzqt(settableBeanPropertyConstructSettableProperty, true);
            }
        }
        if (this._factoryConfig.hasDeserializerModifiers()) {
            Iterator<VX> it = this._factoryConfig.deserializerModifiers().iterator();
            while (it.hasNext()) {
                vwConstructBeanDeserializerBuilder = it.next().EZpvd(config, abstractC5549Vz, vwConstructBeanDeserializerBuilder);
            }
        }
        AbstractC5548Vy<?> abstractC5548VyOLrzqt = vwConstructBeanDeserializerBuilder.OLrzqt();
        if (abstractC5548VyOLrzqt instanceof BeanDeserializer) {
            abstractC5548VyOLrzqt = ThrowableDeserializer.construct(deserializationContext, (BeanDeserializer) abstractC5548VyOLrzqt);
        }
        if (this._factoryConfig.hasDeserializerModifiers()) {
            Iterator<VX> it2 = this._factoryConfig.deserializerModifiers().iterator();
            while (it2.hasNext()) {
                abstractC5548VyOLrzqt = it2.next().copydefault(config, abstractC5549Vz, abstractC5548VyOLrzqt);
            }
        }
        return abstractC5548VyOLrzqt;
    }

    public VW constructBeanDeserializerBuilder(DeserializationContext deserializationContext, AbstractC5549Vz abstractC5549Vz) {
        return new VW(abstractC5549Vz, deserializationContext);
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x016d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void addBeanProps(DeserializationContext deserializationContext, AbstractC5549Vz abstractC5549Vz, VW vw) throws JsonMappingException {
        Set<String> setEmptySet;
        Set<String> set;
        SettableBeanProperty settableBeanPropertyConstructSetterlessProperty;
        CreatorProperty creatorProperty;
        SettableBeanProperty[] fromObjectArguments = abstractC5549Vz.getNewProxyInstance().isAbstract() ^ true ? vw.AYXKKw().getFromObjectArguments(deserializationContext.getConfig()) : null;
        boolean z = fromObjectArguments != null;
        JsonIgnoreProperties.Value defaultPropertyIgnorals = deserializationContext.getConfig().getDefaultPropertyIgnorals(abstractC5549Vz.DbNXlk(), abstractC5549Vz.AuCTel());
        if (defaultPropertyIgnorals != null) {
            vw.EZpvd(defaultPropertyIgnorals.getIgnoreUnknown());
            setEmptySet = defaultPropertyIgnorals.findIgnoredForDeserialization();
            Iterator<String> it = setEmptySet.iterator();
            while (it.hasNext()) {
                vw.AEQbTJ(it.next());
            }
        } else {
            setEmptySet = Collections.emptySet();
        }
        Set<String> set2 = setEmptySet;
        JsonIncludeProperties.Value defaultPropertyInclusions = deserializationContext.getConfig().getDefaultPropertyInclusions(abstractC5549Vz.DbNXlk(), abstractC5549Vz.AuCTel());
        if (defaultPropertyInclusions != null) {
            Set<String> included = defaultPropertyInclusions.getIncluded();
            if (included != null) {
                Iterator<String> it2 = included.iterator();
                while (it2.hasNext()) {
                    vw.KWHzl(it2.next());
                }
            }
            set = included;
        } else {
            set = null;
        }
        AnnotatedMember annotatedMemberKWHzl = abstractC5549Vz.KWHzl();
        if (annotatedMemberKWHzl != null) {
            vw.copydefault(constructAnySetter(deserializationContext, abstractC5549Vz, annotatedMemberKWHzl));
        } else {
            Set<String> fieldNames = abstractC5549Vz.getFieldNames();
            if (fieldNames != null) {
                Iterator<String> it3 = fieldNames.iterator();
                while (it3.hasNext()) {
                    vw.AEQbTJ(it3.next());
                }
            }
        }
        boolean z2 = deserializationContext.isEnabled(MapperFeature.USE_GETTERS_AS_SETTERS) && deserializationContext.isEnabled(MapperFeature.AUTO_DETECT_GETTERS);
        List<WT> listFilterBeanProps = filterBeanProps(deserializationContext, abstractC5549Vz, vw, abstractC5549Vz.isConnected(), set2, set);
        if (this._factoryConfig.hasDeserializerModifiers()) {
            Iterator<VX> it4 = this._factoryConfig.deserializerModifiers().iterator();
            while (it4.hasNext()) {
                listFilterBeanProps = it4.next().EZpvd(deserializationContext.getConfig(), abstractC5549Vz, listFilterBeanProps);
            }
        }
        for (WT wt : listFilterBeanProps) {
            if (wt.iwGUEr()) {
                settableBeanPropertyConstructSetterlessProperty = constructSettableProperty(deserializationContext, abstractC5549Vz, wt, wt.fJNWhG().getParameterType(0));
            } else if (wt.hDKMBd()) {
                settableBeanPropertyConstructSetterlessProperty = constructSettableProperty(deserializationContext, abstractC5549Vz, wt, wt.values().getType());
            } else {
                AnnotatedMethod annotatedMethodFetchVPNInfo = wt.fetchVPNInfo();
                if (annotatedMethodFetchVPNInfo == null) {
                    settableBeanPropertyConstructSetterlessProperty = null;
                } else if (z2 && _isSetterlessType(annotatedMethodFetchVPNInfo.getRawType())) {
                    if (!vw.copydefault(wt.getName())) {
                        settableBeanPropertyConstructSetterlessProperty = constructSetterlessProperty(deserializationContext, abstractC5549Vz, wt);
                    }
                } else if (!wt.uzCIH() && wt.DbNXlk().getMergeInfo() != null) {
                    settableBeanPropertyConstructSetterlessProperty = constructSetterlessProperty(deserializationContext, abstractC5549Vz, wt);
                }
            }
            if (z && wt.uzCIH()) {
                String name = wt.getName();
                int length = fromObjectArguments.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        creatorProperty = null;
                        break;
                    }
                    SettableBeanProperty settableBeanProperty = fromObjectArguments[i];
                    if (name.equals(settableBeanProperty.getName()) && (settableBeanProperty instanceof CreatorProperty)) {
                        creatorProperty = (CreatorProperty) settableBeanProperty;
                        break;
                    }
                    i++;
                }
                if (creatorProperty == null) {
                    ArrayList arrayList = new ArrayList();
                    for (SettableBeanProperty settableBeanProperty2 : fromObjectArguments) {
                        arrayList.add(settableBeanProperty2.getName());
                    }
                    deserializationContext.reportBadPropertyDefinition(abstractC5549Vz, wt, "Could not find creator property with name %s (known Creator properties: %s)", C5619Yr.copydefault(name), arrayList);
                } else {
                    if (settableBeanPropertyConstructSetterlessProperty != null) {
                        creatorProperty.setFallbackSetter(settableBeanPropertyConstructSetterlessProperty);
                    }
                    Class<?>[] clsArrDjBIcL = wt.djBIcL();
                    if (clsArrDjBIcL == null) {
                        clsArrDjBIcL = abstractC5549Vz.OLrzqt();
                    }
                    creatorProperty.setViews(clsArrDjBIcL);
                    vw.KWHzl(creatorProperty);
                }
            } else if (settableBeanPropertyConstructSetterlessProperty != null) {
                Class<?>[] clsArrDjBIcL2 = wt.djBIcL();
                if (clsArrDjBIcL2 == null) {
                    clsArrDjBIcL2 = abstractC5549Vz.OLrzqt();
                }
                settableBeanPropertyConstructSetterlessProperty.setViews(clsArrDjBIcL2);
                vw.AEQbTJ(settableBeanPropertyConstructSetterlessProperty);
            }
        }
    }

    private boolean _isSetterlessType(Class<?> cls) {
        return Collection.class.isAssignableFrom(cls) || Map.class.isAssignableFrom(cls);
    }

    @Deprecated
    public List<WT> filterBeanProps(DeserializationContext deserializationContext, AbstractC5549Vz abstractC5549Vz, VW vw, List<WT> list, Set<String> set) throws JsonMappingException {
        return filterBeanProps(deserializationContext, abstractC5549Vz, vw, list, set, null);
    }

    public List<WT> filterBeanProps(DeserializationContext deserializationContext, AbstractC5549Vz abstractC5549Vz, VW vw, List<WT> list, Set<String> set, Set<String> set2) {
        Class<?> clsFIwbmz;
        ArrayList arrayList = new ArrayList(Math.max(4, list.size()));
        HashMap map = new HashMap();
        for (WT wt : list) {
            String name = wt.getName();
            if (!IgnorePropertiesUtil.KWHzl(name, set, set2)) {
                if (!wt.uzCIH() && (clsFIwbmz = wt.fIwbmz()) != null && isIgnorableType(deserializationContext.getConfig(), wt, clsFIwbmz, map)) {
                    vw.AEQbTJ(name);
                } else {
                    arrayList.add(wt);
                }
            }
        }
        return arrayList;
    }

    public void addBackReferenceProperties(DeserializationContext deserializationContext, AbstractC5549Vz abstractC5549Vz, VW vw) throws DatabindException {
        List<WT> listEZpvd = abstractC5549Vz.EZpvd();
        if (listEZpvd != null) {
            for (WT wt : listEZpvd) {
                vw.AEQbTJ(wt.AEQbTJ(), constructSettableProperty(deserializationContext, abstractC5549Vz, wt, wt.AuCTel()));
            }
        }
    }

    @Deprecated
    public void addReferenceProperties(DeserializationContext deserializationContext, AbstractC5549Vz abstractC5549Vz, VW vw) throws DatabindException {
        addBackReferenceProperties(deserializationContext, abstractC5549Vz, vw);
    }

    public void addInjectables(DeserializationContext deserializationContext, AbstractC5549Vz abstractC5549Vz, VW vw) throws DatabindException {
        Map<Object, AnnotatedMember> mapDjBIcL = abstractC5549Vz.djBIcL();
        if (mapDjBIcL != null) {
            for (Map.Entry<Object, AnnotatedMember> entry : mapDjBIcL.entrySet()) {
                AnnotatedMember value = entry.getValue();
                vw.OLrzqt(PropertyName.construct(value.getName()), value.getType(), abstractC5549Vz.fJNWhG(), value, entry.getKey());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v3, types: [o.VC] */
    public SettableAnyProperty constructAnySetter(DeserializationContext deserializationContext, AbstractC5549Vz abstractC5549Vz, AnnotatedMember annotatedMember) throws JsonMappingException {
        JavaType keyType;
        BeanProperty.Std std;
        JavaType javaTypeResolveMemberAndTypeAnnotations;
        boolean z = annotatedMember instanceof AnnotatedField;
        if (annotatedMember instanceof AnnotatedMethod) {
            AnnotatedMethod annotatedMethod = (AnnotatedMethod) annotatedMember;
            keyType = annotatedMethod.getParameterType(0);
            javaTypeResolveMemberAndTypeAnnotations = resolveMemberAndTypeAnnotations(deserializationContext, annotatedMember, annotatedMethod.getParameterType(1));
            std = new BeanProperty.Std(PropertyName.construct(annotatedMember.getName()), javaTypeResolveMemberAndTypeAnnotations, null, annotatedMember, PropertyMetadata.STD_OPTIONAL);
        } else if (z) {
            JavaType type = ((AnnotatedField) annotatedMember).getType();
            if (type.isMapLikeType()) {
                JavaType javaTypeResolveMemberAndTypeAnnotations2 = resolveMemberAndTypeAnnotations(deserializationContext, annotatedMember, type);
                keyType = javaTypeResolveMemberAndTypeAnnotations2.getKeyType();
                JavaType contentType = javaTypeResolveMemberAndTypeAnnotations2.getContentType();
                std = new BeanProperty.Std(PropertyName.construct(annotatedMember.getName()), javaTypeResolveMemberAndTypeAnnotations2, null, annotatedMember, PropertyMetadata.STD_OPTIONAL);
                javaTypeResolveMemberAndTypeAnnotations = contentType;
            } else {
                if (type.hasRawClass(JsonNode.class) || type.hasRawClass(ObjectNode.class)) {
                    JavaType javaTypeResolveMemberAndTypeAnnotations3 = resolveMemberAndTypeAnnotations(deserializationContext, annotatedMember, type);
                    JavaType javaTypeConstructType = deserializationContext.constructType(JsonNode.class);
                    return SettableAnyProperty.constructForJsonNodeField(deserializationContext, new BeanProperty.Std(PropertyName.construct(annotatedMember.getName()), javaTypeResolveMemberAndTypeAnnotations3, null, annotatedMember, PropertyMetadata.STD_OPTIONAL), annotatedMember, javaTypeConstructType, deserializationContext.findRootValueDeserializer(javaTypeConstructType));
                }
                return (SettableAnyProperty) deserializationContext.reportBadDefinition(abstractC5549Vz.getNewProxyInstance(), String.format("Unsupported type for any-setter: %s -- only support `Map`s, `JsonNode` and `ObjectNode` ", C5619Yr.copydefault(type)));
            }
        } else {
            return (SettableAnyProperty) deserializationContext.reportBadDefinition(abstractC5549Vz.getNewProxyInstance(), String.format("Unrecognized mutator type for any-setter: %s", C5619Yr.uzCIH(annotatedMember.getClass())));
        }
        Object objFindKeyDeserializerFromAnnotation = findKeyDeserializerFromAnnotation(deserializationContext, annotatedMember);
        if (objFindKeyDeserializerFromAnnotation == null) {
            objFindKeyDeserializerFromAnnotation = (VC) keyType.getValueHandler();
        }
        if (objFindKeyDeserializerFromAnnotation == null) {
            objFindKeyDeserializerFromAnnotation = deserializationContext.findKeyDeserializer(keyType, std);
        } else if (objFindKeyDeserializerFromAnnotation instanceof InterfaceC5553Wd) {
            objFindKeyDeserializerFromAnnotation = ((InterfaceC5553Wd) objFindKeyDeserializerFromAnnotation).AEQbTJ(deserializationContext, std);
        }
        ?? r5 = objFindKeyDeserializerFromAnnotation;
        AbstractC5548Vy<?> abstractC5548VyFindContentDeserializerFromAnnotation = findContentDeserializerFromAnnotation(deserializationContext, annotatedMember);
        if (abstractC5548VyFindContentDeserializerFromAnnotation == null) {
            abstractC5548VyFindContentDeserializerFromAnnotation = (AbstractC5548Vy) javaTypeResolveMemberAndTypeAnnotations.getValueHandler();
        }
        if (abstractC5548VyFindContentDeserializerFromAnnotation != null) {
            abstractC5548VyFindContentDeserializerFromAnnotation = deserializationContext.handlePrimaryContextualization(abstractC5548VyFindContentDeserializerFromAnnotation, std, javaTypeResolveMemberAndTypeAnnotations);
        }
        AbstractC5548Vy<?> abstractC5548Vy = abstractC5548VyFindContentDeserializerFromAnnotation;
        AbstractC5597Xv abstractC5597Xv = (AbstractC5597Xv) javaTypeResolveMemberAndTypeAnnotations.getTypeHandler();
        if (z) {
            return SettableAnyProperty.constructForMapField(deserializationContext, std, annotatedMember, javaTypeResolveMemberAndTypeAnnotations, r5, abstractC5548Vy, abstractC5597Xv);
        }
        return SettableAnyProperty.constructForMethod(deserializationContext, std, annotatedMember, javaTypeResolveMemberAndTypeAnnotations, r5, abstractC5548Vy, abstractC5597Xv);
    }

    public SettableBeanProperty constructSettableProperty(DeserializationContext deserializationContext, AbstractC5549Vz abstractC5549Vz, WT wt, JavaType javaType) throws JsonMappingException {
        SettableBeanProperty fieldProperty;
        AnnotatedMember annotatedMemberFARcdN = wt.fARcdN();
        if (annotatedMemberFARcdN == null) {
            deserializationContext.reportBadPropertyDefinition(abstractC5549Vz, wt, "No non-constructor mutator available", new Object[0]);
        }
        JavaType javaTypeResolveMemberAndTypeAnnotations = resolveMemberAndTypeAnnotations(deserializationContext, annotatedMemberFARcdN, javaType);
        AbstractC5597Xv abstractC5597Xv = (AbstractC5597Xv) javaTypeResolveMemberAndTypeAnnotations.getTypeHandler();
        if (annotatedMemberFARcdN instanceof AnnotatedMethod) {
            fieldProperty = new MethodProperty(wt, javaTypeResolveMemberAndTypeAnnotations, abstractC5597Xv, abstractC5549Vz.fJNWhG(), (AnnotatedMethod) annotatedMemberFARcdN);
        } else {
            fieldProperty = new FieldProperty(wt, javaTypeResolveMemberAndTypeAnnotations, abstractC5597Xv, abstractC5549Vz.fJNWhG(), (AnnotatedField) annotatedMemberFARcdN);
        }
        AbstractC5548Vy<?> abstractC5548VyFindDeserializerFromAnnotation = findDeserializerFromAnnotation(deserializationContext, annotatedMemberFARcdN);
        if (abstractC5548VyFindDeserializerFromAnnotation == null) {
            abstractC5548VyFindDeserializerFromAnnotation = (AbstractC5548Vy) javaTypeResolveMemberAndTypeAnnotations.getValueHandler();
        }
        if (abstractC5548VyFindDeserializerFromAnnotation != null) {
            fieldProperty = fieldProperty.withValueDeserializer(deserializationContext.handlePrimaryContextualization(abstractC5548VyFindDeserializerFromAnnotation, fieldProperty, javaTypeResolveMemberAndTypeAnnotations));
        }
        AnnotationIntrospector.ReferenceProperty referencePropertyAYXKKw = wt.AYXKKw();
        if (referencePropertyAYXKKw != null && referencePropertyAYXKKw.AEQbTJ()) {
            fieldProperty.setManagedReferenceName(referencePropertyAYXKKw.KWHzl());
        }
        C5576Xa c5576XaKWHzl = wt.KWHzl();
        if (c5576XaKWHzl != null) {
            fieldProperty.setObjectIdInfo(c5576XaKWHzl);
        }
        return fieldProperty;
    }

    public SettableBeanProperty constructSetterlessProperty(DeserializationContext deserializationContext, AbstractC5549Vz abstractC5549Vz, WT wt) throws JsonMappingException {
        AnnotatedMethod annotatedMethodFetchVPNInfo = wt.fetchVPNInfo();
        JavaType javaTypeResolveMemberAndTypeAnnotations = resolveMemberAndTypeAnnotations(deserializationContext, annotatedMethodFetchVPNInfo, annotatedMethodFetchVPNInfo.getType());
        SetterlessProperty setterlessProperty = new SetterlessProperty(wt, javaTypeResolveMemberAndTypeAnnotations, (AbstractC5597Xv) javaTypeResolveMemberAndTypeAnnotations.getTypeHandler(), abstractC5549Vz.fJNWhG(), annotatedMethodFetchVPNInfo);
        AbstractC5548Vy<?> abstractC5548VyFindDeserializerFromAnnotation = findDeserializerFromAnnotation(deserializationContext, annotatedMethodFetchVPNInfo);
        if (abstractC5548VyFindDeserializerFromAnnotation == null) {
            abstractC5548VyFindDeserializerFromAnnotation = (AbstractC5548Vy) javaTypeResolveMemberAndTypeAnnotations.getValueHandler();
        }
        return abstractC5548VyFindDeserializerFromAnnotation != null ? setterlessProperty.withValueDeserializer(deserializationContext.handlePrimaryContextualization(abstractC5548VyFindDeserializerFromAnnotation, setterlessProperty, javaTypeResolveMemberAndTypeAnnotations)) : setterlessProperty;
    }

    public boolean isPotentialBeanType(Class<?> cls) {
        String strAEQbTJ = C5619Yr.AEQbTJ(cls);
        if (strAEQbTJ != null) {
            throw new IllegalArgumentException("Cannot deserialize Class " + cls.getName() + " (of type " + strAEQbTJ + ") as a Bean");
        }
        if (C5619Yr.AuCTel(cls)) {
            throw new IllegalArgumentException("Cannot deserialize Proxy class " + cls.getName() + " as a Bean");
        }
        String strKWHzl = C5619Yr.KWHzl(cls, true);
        if (strKWHzl == null) {
            return true;
        }
        throw new IllegalArgumentException("Cannot deserialize Class " + cls.getName() + " (of type " + strKWHzl + ") as a Bean");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean isIgnorableType(DeserializationConfig deserializationConfig, WT wt, Class<?> cls, Map<Class<?>, Boolean> map) {
        Boolean isIgnoredType;
        Boolean bool = map.get(cls);
        if (bool != null) {
            return bool.booleanValue();
        }
        if (cls == String.class || cls.isPrimitive()) {
            isIgnoredType = Boolean.FALSE;
        } else {
            isIgnoredType = deserializationConfig.getConfigOverride(cls).getIsIgnoredType();
            if (isIgnoredType == null) {
                isIgnoredType = deserializationConfig.getAnnotationIntrospector().isIgnorableType(deserializationConfig.introspectClassAnnotations(cls).AuCTel());
                if (isIgnoredType == null) {
                }
            }
        }
        map.put(cls, isIgnoredType);
        return isIgnoredType.booleanValue();
    }

    public void _validateSubType(DeserializationContext deserializationContext, JavaType javaType, AbstractC5549Vz abstractC5549Vz) throws JsonMappingException {
        XL.EZpvd().copydefault(deserializationContext, javaType, abstractC5549Vz);
    }
}
