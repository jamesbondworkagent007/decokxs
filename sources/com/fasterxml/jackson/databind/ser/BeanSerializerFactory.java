package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonIncludeProperties;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.TokenStreamFactory;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig;
import com.fasterxml.jackson.databind.introspect.AnnotatedField;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.ser.impl.FilteredBeanPropertyWriter;
import com.fasterxml.jackson.databind.ser.impl.PropertyBasedObjectIdGenerator;
import com.fasterxml.jackson.databind.ser.impl.UnsupportedTypeSerializer;
import com.fasterxml.jackson.databind.ser.std.MapSerializer;
import com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer;
import com.fasterxml.jackson.databind.ser.std.ToEmptyObjectSerializer;
import com.fasterxml.jackson.databind.type.ReferenceType;
import com.fasterxml.jackson.databind.util.IgnorePropertiesUtil;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import o.AbstractC5549Vz;
import o.AbstractC5601Xz;
import o.C5576Xa;
import o.C5606Ye;
import o.C5614Ym;
import o.C5619Yr;
import o.C5622Yv;
import o.InterfaceC5599Xx;
import o.InterfaceC5605Yd;
import o.InterfaceC5621Yt;
import o.VA;
import o.VD;
import o.VI;
import o.WT;
import o.XN;
import o.XR;
import o.XU;
import o.XW;
import o.XY;
import o.XZ;

/* JADX INFO: loaded from: classes21.dex */
public class BeanSerializerFactory extends BasicSerializerFactory implements Serializable {
    public static final BeanSerializerFactory instance = new BeanSerializerFactory(null);
    private static final long serialVersionUID = 1;

    public BeanSerializerFactory(SerializerFactoryConfig serializerFactoryConfig) {
        super(serializerFactoryConfig);
    }

    @Override // com.fasterxml.jackson.databind.ser.BasicSerializerFactory
    public XY withConfig(SerializerFactoryConfig serializerFactoryConfig) {
        if (this._factoryConfig == serializerFactoryConfig) {
            return this;
        }
        if (getClass() != BeanSerializerFactory.class) {
            throw new IllegalStateException("Subtype of BeanSerializerFactory (" + getClass().getName() + ") has not properly overridden method 'withAdditionalSerializers': cannot instantiate subtype with additional serializer definitions");
        }
        return new BeanSerializerFactory(serializerFactoryConfig);
    }

    @Override // com.fasterxml.jackson.databind.ser.BasicSerializerFactory
    public Iterable<InterfaceC5605Yd> customSerializers() {
        return this._factoryConfig.serializers();
    }

    @Override // com.fasterxml.jackson.databind.ser.BasicSerializerFactory, o.XY
    public VD<Object> createSerializer(VI vi, JavaType javaType) throws JsonMappingException {
        JavaType javaTypeRefineSerializationType;
        SerializationConfig config = vi.getConfig();
        AbstractC5549Vz abstractC5549VzIntrospect = config.introspect(javaType);
        VD<?> vdFindSerializerFromAnnotation = findSerializerFromAnnotation(vi, abstractC5549VzIntrospect.AuCTel());
        if (vdFindSerializerFromAnnotation != null) {
            return vdFindSerializerFromAnnotation;
        }
        AnnotationIntrospector annotationIntrospector = config.getAnnotationIntrospector();
        boolean z = false;
        if (annotationIntrospector == null) {
            javaTypeRefineSerializationType = javaType;
        } else {
            try {
                javaTypeRefineSerializationType = annotationIntrospector.refineSerializationType(config, abstractC5549VzIntrospect.AuCTel(), javaType);
            } catch (JsonMappingException e) {
                return (VD) vi.reportBadTypeDefinition(abstractC5549VzIntrospect, e.getMessage(), new Object[0]);
            }
        }
        if (javaTypeRefineSerializationType != javaType) {
            if (!javaTypeRefineSerializationType.hasRawClass(javaType.getRawClass())) {
                abstractC5549VzIntrospect = config.introspect(javaTypeRefineSerializationType);
            }
            z = true;
        }
        InterfaceC5621Yt<Object, Object> interfaceC5621YtFetchVPNInfo = abstractC5549VzIntrospect.fetchVPNInfo();
        if (interfaceC5621YtFetchVPNInfo == null) {
            return _createSerializer2(vi, javaTypeRefineSerializationType, abstractC5549VzIntrospect, z);
        }
        JavaType javaTypeEZpvd = interfaceC5621YtFetchVPNInfo.EZpvd(vi.getTypeFactory());
        if (!javaTypeEZpvd.hasRawClass(javaTypeRefineSerializationType.getRawClass())) {
            abstractC5549VzIntrospect = config.introspect(javaTypeEZpvd);
            vdFindSerializerFromAnnotation = findSerializerFromAnnotation(vi, abstractC5549VzIntrospect.AuCTel());
        }
        if (vdFindSerializerFromAnnotation == null && !javaTypeEZpvd.isJavaLangObject()) {
            vdFindSerializerFromAnnotation = _createSerializer2(vi, javaTypeEZpvd, abstractC5549VzIntrospect, true);
        }
        return new StdDelegatingSerializer(interfaceC5621YtFetchVPNInfo, javaTypeEZpvd, vdFindSerializerFromAnnotation);
    }

    public VD<?> _createSerializer2(VI vi, JavaType javaType, AbstractC5549Vz abstractC5549Vz, boolean z) throws JsonMappingException {
        VD<?> vdFindSerializerByAnnotations;
        SerializationConfig config = vi.getConfig();
        VD<?> vdFindSerializer = null;
        if (javaType.isContainerType()) {
            if (!z) {
                z = usesStaticTyping(config, abstractC5549Vz, null);
            }
            vdFindSerializerByAnnotations = buildContainerSerializer(vi, javaType, abstractC5549Vz, z);
            if (vdFindSerializerByAnnotations != null) {
                return vdFindSerializerByAnnotations;
            }
        } else {
            if (javaType.isReferenceType()) {
                vdFindSerializerByAnnotations = findReferenceSerializer(vi, (ReferenceType) javaType, abstractC5549Vz, z);
            } else {
                Iterator<InterfaceC5605Yd> it = customSerializers().iterator();
                while (it.hasNext() && (vdFindSerializer = it.next().findSerializer(config, javaType, abstractC5549Vz)) == null) {
                }
                vdFindSerializerByAnnotations = vdFindSerializer;
            }
            if (vdFindSerializerByAnnotations == null) {
                vdFindSerializerByAnnotations = findSerializerByAnnotations(vi, javaType, abstractC5549Vz);
            }
        }
        if (vdFindSerializerByAnnotations == null && (vdFindSerializerByAnnotations = findSerializerByLookup(javaType, config, abstractC5549Vz, z)) == null && (vdFindSerializerByAnnotations = findSerializerByPrimaryType(vi, javaType, abstractC5549Vz, z)) == null && (vdFindSerializerByAnnotations = findBeanOrAddOnSerializer(vi, javaType, abstractC5549Vz, z)) == null) {
            vdFindSerializerByAnnotations = vi.getUnknownTypeSerializer(abstractC5549Vz.DbNXlk());
        }
        if (vdFindSerializerByAnnotations != null && this._factoryConfig.hasSerializerModifiers()) {
            Iterator<XR> it2 = this._factoryConfig.serializerModifiers().iterator();
            while (it2.hasNext()) {
                vdFindSerializerByAnnotations = it2.next().KWHzl(config, abstractC5549Vz, vdFindSerializerByAnnotations);
            }
        }
        return vdFindSerializerByAnnotations;
    }

    @Deprecated
    public VD<Object> findBeanSerializer(VI vi, JavaType javaType, AbstractC5549Vz abstractC5549Vz) throws JsonMappingException {
        return findBeanOrAddOnSerializer(vi, javaType, abstractC5549Vz, vi.isEnabled(MapperFeature.USE_STATIC_TYPING));
    }

    public VD<Object> findBeanOrAddOnSerializer(VI vi, JavaType javaType, AbstractC5549Vz abstractC5549Vz, boolean z) throws JsonMappingException {
        if (isPotentialBeanType(javaType.getRawClass()) || C5619Yr.AkhnZx(javaType.getRawClass())) {
            return constructBeanOrAddOnSerializer(vi, javaType, abstractC5549Vz, z);
        }
        return null;
    }

    public AbstractC5601Xz findPropertyTypeSerializer(JavaType javaType, SerializationConfig serializationConfig, AnnotatedMember annotatedMember) throws JsonMappingException {
        InterfaceC5599Xx<?> interfaceC5599XxFindPropertyTypeResolver = serializationConfig.getAnnotationIntrospector().findPropertyTypeResolver(serializationConfig, annotatedMember, javaType);
        if (interfaceC5599XxFindPropertyTypeResolver == null) {
            return createTypeSerializer(serializationConfig, javaType);
        }
        return interfaceC5599XxFindPropertyTypeResolver.buildTypeSerializer(serializationConfig, javaType, serializationConfig.getSubtypeResolver().collectAndResolveSubtypesByClass(serializationConfig, annotatedMember, javaType));
    }

    public AbstractC5601Xz findPropertyContentTypeSerializer(JavaType javaType, SerializationConfig serializationConfig, AnnotatedMember annotatedMember) throws JsonMappingException {
        JavaType contentType = javaType.getContentType();
        InterfaceC5599Xx<?> interfaceC5599XxFindPropertyContentTypeResolver = serializationConfig.getAnnotationIntrospector().findPropertyContentTypeResolver(serializationConfig, annotatedMember, javaType);
        if (interfaceC5599XxFindPropertyContentTypeResolver == null) {
            return createTypeSerializer(serializationConfig, contentType);
        }
        return interfaceC5599XxFindPropertyContentTypeResolver.buildTypeSerializer(serializationConfig, contentType, serializationConfig.getSubtypeResolver().collectAndResolveSubtypesByClass(serializationConfig, annotatedMember, contentType));
    }

    @Deprecated
    public VD<Object> constructBeanSerializer(VI vi, AbstractC5549Vz abstractC5549Vz) throws JsonMappingException {
        return constructBeanOrAddOnSerializer(vi, abstractC5549Vz.getNewProxyInstance(), abstractC5549Vz, vi.isEnabled(MapperFeature.USE_STATIC_TYPING));
    }

    public VD<Object> constructBeanOrAddOnSerializer(VI vi, JavaType javaType, AbstractC5549Vz abstractC5549Vz, boolean z) throws JsonMappingException {
        List<BeanPropertyWriter> listRemoveOverlappingTypeIds;
        if (abstractC5549Vz.DbNXlk() == Object.class) {
            return vi.getUnknownTypeSerializer(Object.class);
        }
        VD<?> vd_findUnsupportedTypeSerializer = _findUnsupportedTypeSerializer(vi, javaType, abstractC5549Vz);
        if (vd_findUnsupportedTypeSerializer != null) {
            return vd_findUnsupportedTypeSerializer;
        }
        if (_isUnserializableJacksonType(vi, javaType)) {
            return new ToEmptyObjectSerializer(javaType);
        }
        SerializationConfig config = vi.getConfig();
        XU xuConstructBeanSerializerBuilder = constructBeanSerializerBuilder(abstractC5549Vz);
        xuConstructBeanSerializerBuilder.AEQbTJ(config);
        List<BeanPropertyWriter> listFindBeanProperties = findBeanProperties(vi, abstractC5549Vz, xuConstructBeanSerializerBuilder);
        if (listFindBeanProperties == null) {
            listRemoveOverlappingTypeIds = new ArrayList<>();
        } else {
            listRemoveOverlappingTypeIds = removeOverlappingTypeIds(vi, abstractC5549Vz, xuConstructBeanSerializerBuilder, listFindBeanProperties);
        }
        vi.getAnnotationIntrospector().findAndAddVirtualProperties(config, abstractC5549Vz.AuCTel(), listRemoveOverlappingTypeIds);
        if (this._factoryConfig.hasSerializerModifiers()) {
            Iterator<XR> it = this._factoryConfig.serializerModifiers().iterator();
            while (it.hasNext()) {
                listRemoveOverlappingTypeIds = it.next().OLrzqt(config, abstractC5549Vz, listRemoveOverlappingTypeIds);
            }
        }
        List<BeanPropertyWriter> listFilterBeanProperties = filterBeanProperties(config, abstractC5549Vz, filterUnwantedJDKProperties(config, abstractC5549Vz, listRemoveOverlappingTypeIds));
        if (this._factoryConfig.hasSerializerModifiers()) {
            Iterator<XR> it2 = this._factoryConfig.serializerModifiers().iterator();
            while (it2.hasNext()) {
                listFilterBeanProperties = it2.next().EZpvd(config, abstractC5549Vz, listFilterBeanProperties);
            }
        }
        xuConstructBeanSerializerBuilder.copydefault(constructObjectIdHandler(vi, abstractC5549Vz, listFilterBeanProperties));
        xuConstructBeanSerializerBuilder.EZpvd(listFilterBeanProperties);
        xuConstructBeanSerializerBuilder.KWHzl(findFilterId(config, abstractC5549Vz));
        AnnotatedMember annotatedMemberCopydefault = abstractC5549Vz.copydefault();
        if (annotatedMemberCopydefault != null) {
            JavaType type = annotatedMemberCopydefault.getType();
            JavaType contentType = type.getContentType();
            AbstractC5601Xz abstractC5601XzCreateTypeSerializer = createTypeSerializer(config, contentType);
            VD<Object> vdFindSerializerFromAnnotation = findSerializerFromAnnotation(vi, annotatedMemberCopydefault);
            if (vdFindSerializerFromAnnotation == null) {
                vdFindSerializerFromAnnotation = MapSerializer.construct((Set<String>) null, type, config.isEnabled(MapperFeature.USE_STATIC_TYPING), abstractC5601XzCreateTypeSerializer, (VD<Object>) null, (VD<Object>) null, (Object) null);
            }
            xuConstructBeanSerializerBuilder.EZpvd(new XN(new BeanProperty.Std(PropertyName.construct(annotatedMemberCopydefault.getName()), contentType, null, annotatedMemberCopydefault, PropertyMetadata.STD_OPTIONAL), annotatedMemberCopydefault, vdFindSerializerFromAnnotation));
        }
        processViews(config, xuConstructBeanSerializerBuilder);
        if (this._factoryConfig.hasSerializerModifiers()) {
            Iterator<XR> it3 = this._factoryConfig.serializerModifiers().iterator();
            while (it3.hasNext()) {
                xuConstructBeanSerializerBuilder = it3.next().AEQbTJ(config, abstractC5549Vz, xuConstructBeanSerializerBuilder);
            }
        }
        try {
            VD<?> vdKWHzl = xuConstructBeanSerializerBuilder.KWHzl();
            if (vdKWHzl == null) {
                if (javaType.isRecordType() && !C5622Yv.copydefault(javaType.getRawClass())) {
                    return xuConstructBeanSerializerBuilder.EZpvd();
                }
                vdKWHzl = findSerializerByAddonType(config, javaType, abstractC5549Vz, z);
                if (vdKWHzl == null && abstractC5549Vz.uzCIH()) {
                    return xuConstructBeanSerializerBuilder.EZpvd();
                }
            }
            return vdKWHzl;
        } catch (RuntimeException e) {
            return (VD) vi.reportBadTypeDefinition(abstractC5549Vz, "Failed to construct BeanSerializer for %s: (%s) %s", abstractC5549Vz.getNewProxyInstance(), e.getClass().getName(), e.getMessage());
        }
    }

    public C5606Ye constructObjectIdHandler(VI vi, AbstractC5549Vz abstractC5549Vz, List<BeanPropertyWriter> list) throws JsonMappingException {
        C5576Xa c5576XaIwGUEr = abstractC5549Vz.iwGUEr();
        if (c5576XaIwGUEr == null) {
            return null;
        }
        Class<? extends ObjectIdGenerator<?>> clsEZpvd = c5576XaIwGUEr.EZpvd();
        if (clsEZpvd == ObjectIdGenerators.PropertyGenerator.class) {
            String simpleName = c5576XaIwGUEr.AEQbTJ().getSimpleName();
            int size = list.size();
            for (int i = 0; i != size; i++) {
                BeanPropertyWriter beanPropertyWriter = list.get(i);
                if (simpleName.equals(beanPropertyWriter.getName())) {
                    if (i > 0) {
                        list.remove(i);
                        list.add(0, beanPropertyWriter);
                    }
                    return C5606Ye.KWHzl(beanPropertyWriter.getType(), null, new PropertyBasedObjectIdGenerator(c5576XaIwGUEr, beanPropertyWriter), c5576XaIwGUEr.KWHzl());
                }
            }
            throw new IllegalArgumentException(String.format("Invalid Object Id definition for %s: cannot find property with name %s", C5619Yr.copydefault(abstractC5549Vz.getNewProxyInstance()), C5619Yr.copydefault(simpleName)));
        }
        return C5606Ye.KWHzl(vi.getTypeFactory().findTypeParameters(vi.constructType(clsEZpvd), ObjectIdGenerator.class)[0], c5576XaIwGUEr.AEQbTJ(), vi.objectIdGeneratorInstance(abstractC5549Vz.AuCTel(), c5576XaIwGUEr), c5576XaIwGUEr.KWHzl());
    }

    public BeanPropertyWriter constructFilteredBeanWriter(BeanPropertyWriter beanPropertyWriter, Class<?>[] clsArr) {
        return FilteredBeanPropertyWriter.OLrzqt(beanPropertyWriter, clsArr);
    }

    public XW constructPropertyBuilder(SerializationConfig serializationConfig, AbstractC5549Vz abstractC5549Vz) {
        return new XW(serializationConfig, abstractC5549Vz);
    }

    public XU constructBeanSerializerBuilder(AbstractC5549Vz abstractC5549Vz) {
        return new XU(abstractC5549Vz);
    }

    public boolean isPotentialBeanType(Class<?> cls) {
        return C5619Yr.AEQbTJ(cls) == null && !C5619Yr.AuCTel(cls);
    }

    public List<BeanPropertyWriter> findBeanProperties(VI vi, AbstractC5549Vz abstractC5549Vz, XU xu) throws JsonMappingException {
        List<WT> listIsConnected = abstractC5549Vz.isConnected();
        SerializationConfig config = vi.getConfig();
        removeIgnorableTypes(config, abstractC5549Vz, listIsConnected);
        if (config.isEnabled(MapperFeature.REQUIRE_SETTERS_FOR_GETTERS)) {
            removeSetterlessGetters(config, abstractC5549Vz, listIsConnected);
        }
        if (listIsConnected.isEmpty()) {
            return null;
        }
        boolean zUsesStaticTyping = usesStaticTyping(config, abstractC5549Vz, null);
        XW xwConstructPropertyBuilder = constructPropertyBuilder(config, abstractC5549Vz);
        ArrayList arrayList = new ArrayList(listIsConnected.size());
        for (WT wt : listIsConnected) {
            AnnotatedMember annotatedMemberGEmmrt = wt.gEmmrt();
            if (!wt.AuCTelauCTel()) {
                AnnotationIntrospector.ReferenceProperty referencePropertyAYXKKw = wt.AYXKKw();
                if (referencePropertyAYXKKw == null || !referencePropertyAYXKKw.copydefault()) {
                    if (annotatedMemberGEmmrt instanceof AnnotatedMethod) {
                        arrayList.add(_constructWriter(vi, wt, xwConstructPropertyBuilder, zUsesStaticTyping, (AnnotatedMethod) annotatedMemberGEmmrt));
                    } else {
                        arrayList.add(_constructWriter(vi, wt, xwConstructPropertyBuilder, zUsesStaticTyping, (AnnotatedField) annotatedMemberGEmmrt));
                    }
                }
            } else if (annotatedMemberGEmmrt != null) {
                xu.EZpvd(annotatedMemberGEmmrt);
            }
        }
        return arrayList;
    }

    public List<BeanPropertyWriter> filterBeanProperties(SerializationConfig serializationConfig, AbstractC5549Vz abstractC5549Vz, List<BeanPropertyWriter> list) {
        JsonIgnoreProperties.Value defaultPropertyIgnorals = serializationConfig.getDefaultPropertyIgnorals(abstractC5549Vz.DbNXlk(), abstractC5549Vz.AuCTel());
        Set<String> setFindIgnoredForSerialization = defaultPropertyIgnorals != null ? defaultPropertyIgnorals.findIgnoredForSerialization() : null;
        JsonIncludeProperties.Value defaultPropertyInclusions = serializationConfig.getDefaultPropertyInclusions(abstractC5549Vz.DbNXlk(), abstractC5549Vz.AuCTel());
        Set<String> included = defaultPropertyInclusions != null ? defaultPropertyInclusions.getIncluded() : null;
        if (included != null || (setFindIgnoredForSerialization != null && !setFindIgnoredForSerialization.isEmpty())) {
            Iterator<BeanPropertyWriter> it = list.iterator();
            while (it.hasNext()) {
                if (IgnorePropertiesUtil.KWHzl(it.next().getName(), setFindIgnoredForSerialization, included)) {
                    it.remove();
                }
            }
        }
        return list;
    }

    public List<BeanPropertyWriter> filterUnwantedJDKProperties(SerializationConfig serializationConfig, AbstractC5549Vz abstractC5549Vz, List<BeanPropertyWriter> list) {
        if (abstractC5549Vz.getNewProxyInstance().isTypeOrSubTypeOf(CharSequence.class) && list.size() == 1) {
            AnnotatedMember member = list.get(0).getMember();
            if ((member instanceof AnnotatedMethod) && "isEmpty".equals(member.getName()) && member.getDeclaringClass() == CharSequence.class) {
                list.remove(0);
            }
        }
        return list;
    }

    public void processViews(SerializationConfig serializationConfig, XU xu) {
        List<BeanPropertyWriter> listValueOf = xu.valueOf();
        boolean zIsEnabled = serializationConfig.isEnabled(MapperFeature.DEFAULT_VIEW_INCLUSION);
        int size = listValueOf.size();
        BeanPropertyWriter[] beanPropertyWriterArr = new BeanPropertyWriter[size];
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            BeanPropertyWriter beanPropertyWriter = listValueOf.get(i2);
            Class<?>[] views = beanPropertyWriter.getViews();
            if (views != null && views.length != 0) {
                i++;
                beanPropertyWriterArr[i2] = constructFilteredBeanWriter(beanPropertyWriter, views);
            } else if (zIsEnabled) {
                beanPropertyWriterArr[i2] = beanPropertyWriter;
            }
        }
        if (zIsEnabled && i == 0) {
            return;
        }
        xu.copydefault(beanPropertyWriterArr);
    }

    public void removeIgnorableTypes(SerializationConfig serializationConfig, AbstractC5549Vz abstractC5549Vz, List<WT> list) {
        AnnotationIntrospector annotationIntrospector = serializationConfig.getAnnotationIntrospector();
        HashMap map = new HashMap();
        Iterator<WT> it = list.iterator();
        while (it.hasNext()) {
            WT next = it.next();
            if (next.gEmmrt() == null) {
                it.remove();
            } else {
                Class<?> clsFIwbmz = next.fIwbmz();
                Boolean isIgnoredType = (Boolean) map.get(clsFIwbmz);
                if (isIgnoredType == null) {
                    isIgnoredType = serializationConfig.getConfigOverride(clsFIwbmz).getIsIgnoredType();
                    if (isIgnoredType == null && (isIgnoredType = annotationIntrospector.isIgnorableType(serializationConfig.introspectClassAnnotations(clsFIwbmz).AuCTel())) == null) {
                        isIgnoredType = Boolean.FALSE;
                    }
                    map.put(clsFIwbmz, isIgnoredType);
                }
                if (isIgnoredType.booleanValue()) {
                    it.remove();
                }
            }
        }
    }

    public void removeSetterlessGetters(SerializationConfig serializationConfig, AbstractC5549Vz abstractC5549Vz, List<WT> list) {
        Iterator<WT> it = list.iterator();
        while (it.hasNext()) {
            WT next = it.next();
            if (!next.OLrzqt() && !next.getFieldNames()) {
                it.remove();
            }
        }
    }

    public List<BeanPropertyWriter> removeOverlappingTypeIds(VI vi, AbstractC5549Vz abstractC5549Vz, XU xu, List<BeanPropertyWriter> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            BeanPropertyWriter beanPropertyWriter = list.get(i);
            AbstractC5601Xz typeSerializer = beanPropertyWriter.getTypeSerializer();
            if (typeSerializer != null && typeSerializer.AEQbTJ() == JsonTypeInfo.As.EXTERNAL_PROPERTY) {
                PropertyName propertyNameConstruct = PropertyName.construct(typeSerializer.EZpvd());
                Iterator<BeanPropertyWriter> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    BeanPropertyWriter next = it.next();
                    if (next != beanPropertyWriter && next.wouldConflictWithName(propertyNameConstruct)) {
                        beanPropertyWriter.assignTypeSerializer(null);
                        break;
                    }
                }
            }
        }
        return list;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r12v0, resolved type: o.VI */
    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: o.VD<java.lang.Object> */
    /* JADX WARN: Multi-variable type inference failed */
    public BeanPropertyWriter _constructWriter(VI vi, WT wt, XW xw, boolean z, AnnotatedMember annotatedMember) throws JsonMappingException {
        PropertyName propertyNameIsConnected = wt.isConnected();
        JavaType type = annotatedMember.getType();
        BeanProperty.Std std = new BeanProperty.Std(propertyNameIsConnected, type, wt.getNewProxyInstance(), annotatedMember, wt.DbNXlk());
        VD<Object> vdFindSerializerFromAnnotation = findSerializerFromAnnotation(vi, annotatedMember);
        if (vdFindSerializerFromAnnotation instanceof XZ) {
            ((XZ) vdFindSerializerFromAnnotation).resolve(vi);
        }
        return xw.EZpvd(vi, wt, type, vi.handlePrimaryContextualization(vdFindSerializerFromAnnotation, std), findPropertyTypeSerializer(type, vi.getConfig(), annotatedMember), (type.isContainerType() || type.isReferenceType()) ? findPropertyContentTypeSerializer(type, vi.getConfig(), annotatedMember) : null, annotatedMember, z);
    }

    public VD<?> _findUnsupportedTypeSerializer(VI vi, JavaType javaType, AbstractC5549Vz abstractC5549Vz) throws JsonMappingException {
        String strAEQbTJ = C5614Ym.AEQbTJ(javaType);
        if (strAEQbTJ == null || vi.getConfig().findMixInClassFor(javaType.getRawClass()) != null) {
            return null;
        }
        return new UnsupportedTypeSerializer(javaType, strAEQbTJ);
    }

    public boolean _isUnserializableJacksonType(VI vi, JavaType javaType) {
        Class<?> rawClass = javaType.getRawClass();
        return ObjectMapper.class.isAssignableFrom(rawClass) || ObjectReader.class.isAssignableFrom(rawClass) || ObjectWriter.class.isAssignableFrom(rawClass) || VA.class.isAssignableFrom(rawClass) || TokenStreamFactory.class.isAssignableFrom(rawClass) || JsonParser.class.isAssignableFrom(rawClass) || JsonGenerator.class.isAssignableFrom(rawClass);
    }
}
