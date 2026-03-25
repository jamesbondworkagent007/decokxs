package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonIncludeProperties;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig;
import com.fasterxml.jackson.databind.ext.OptionalHandlerFactory;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.ser.impl.IndexedListSerializer;
import com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer;
import com.fasterxml.jackson.databind.ser.impl.IteratorSerializer;
import com.fasterxml.jackson.databind.ser.impl.MapEntrySerializer;
import com.fasterxml.jackson.databind.ser.impl.StringArraySerializer;
import com.fasterxml.jackson.databind.ser.impl.StringCollectionSerializer;
import com.fasterxml.jackson.databind.ser.std.AtomicReferenceSerializer;
import com.fasterxml.jackson.databind.ser.std.BooleanSerializer;
import com.fasterxml.jackson.databind.ser.std.ByteBufferSerializer;
import com.fasterxml.jackson.databind.ser.std.CalendarSerializer;
import com.fasterxml.jackson.databind.ser.std.CollectionSerializer;
import com.fasterxml.jackson.databind.ser.std.DateSerializer;
import com.fasterxml.jackson.databind.ser.std.EnumSerializer;
import com.fasterxml.jackson.databind.ser.std.EnumSetSerializer;
import com.fasterxml.jackson.databind.ser.std.InetAddressSerializer;
import com.fasterxml.jackson.databind.ser.std.InetSocketAddressSerializer;
import com.fasterxml.jackson.databind.ser.std.IterableSerializer;
import com.fasterxml.jackson.databind.ser.std.JsonValueSerializer;
import com.fasterxml.jackson.databind.ser.std.MapSerializer;
import com.fasterxml.jackson.databind.ser.std.NumberSerializer;
import com.fasterxml.jackson.databind.ser.std.NumberSerializers;
import com.fasterxml.jackson.databind.ser.std.ObjectArraySerializer;
import com.fasterxml.jackson.databind.ser.std.SerializableSerializer;
import com.fasterxml.jackson.databind.ser.std.StdArraySerializers;
import com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer;
import com.fasterxml.jackson.databind.ser.std.StdJdkSerializers;
import com.fasterxml.jackson.databind.ser.std.StdKeySerializers;
import com.fasterxml.jackson.databind.ser.std.StringSerializer;
import com.fasterxml.jackson.databind.ser.std.TimeZoneSerializer;
import com.fasterxml.jackson.databind.ser.std.ToEmptyObjectSerializer;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer;
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.databind.type.CollectionLikeType;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.fasterxml.jackson.databind.type.MapType;
import com.fasterxml.jackson.databind.type.ReferenceType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;
import o.AbstractC5549Vz;
import o.AbstractC5601Xz;
import o.C5614Ym;
import o.C5617Yp;
import o.C5619Yr;
import o.InterfaceC5599Xx;
import o.InterfaceC5605Yd;
import o.InterfaceC5621Yt;
import o.VD;
import o.VF;
import o.VI;
import o.WJ;
import o.WM;
import o.WW;
import o.XR;
import o.XY;
import o.YA;

/* JADX INFO: loaded from: classes21.dex */
public abstract class BasicSerializerFactory extends XY implements Serializable {
    protected static final HashMap<String, VD<?>> _concrete;
    protected static final HashMap<String, Class<? extends VD<?>>> _concreteLazy;
    protected final SerializerFactoryConfig _factoryConfig;

    @Override // o.XY
    public abstract VD<Object> createSerializer(VI vi, JavaType javaType) throws JsonMappingException;

    public abstract Iterable<InterfaceC5605Yd> customSerializers();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SerializerFactoryConfig getFactoryConfig() {
        return this._factoryConfig;
    }

    public abstract XY withConfig(SerializerFactoryConfig serializerFactoryConfig);

    static {
        HashMap<String, Class<? extends VD<?>>> map = new HashMap<>();
        HashMap<String, VD<?>> map2 = new HashMap<>();
        map2.put(String.class.getName(), new StringSerializer());
        ToStringSerializer toStringSerializer = ToStringSerializer.instance;
        map2.put(StringBuffer.class.getName(), toStringSerializer);
        map2.put(StringBuilder.class.getName(), toStringSerializer);
        map2.put(Character.class.getName(), toStringSerializer);
        map2.put(Character.TYPE.getName(), toStringSerializer);
        NumberSerializers.KWHzl(map2);
        map2.put(Boolean.TYPE.getName(), new BooleanSerializer(true));
        map2.put(Boolean.class.getName(), new BooleanSerializer(false));
        map2.put(BigInteger.class.getName(), new NumberSerializer(BigInteger.class));
        map2.put(BigDecimal.class.getName(), new NumberSerializer(BigDecimal.class));
        map2.put(Calendar.class.getName(), CalendarSerializer.instance);
        map2.put(Date.class.getName(), DateSerializer.instance);
        for (Map.Entry<Class<?>, Object> entry : StdJdkSerializers.OLrzqt()) {
            Object value = entry.getValue();
            if (value instanceof VD) {
                map2.put(entry.getKey().getName(), (VD) value);
            } else {
                map.put(entry.getKey().getName(), (Class) value);
            }
        }
        map.put(YA.class.getName(), TokenBufferSerializer.class);
        _concrete = map2;
        _concreteLazy = map;
    }

    public BasicSerializerFactory(SerializerFactoryConfig serializerFactoryConfig) {
        this._factoryConfig = serializerFactoryConfig == null ? new SerializerFactoryConfig() : serializerFactoryConfig;
    }

    @Override // o.XY
    public final XY withAdditionalSerializers(InterfaceC5605Yd interfaceC5605Yd) {
        return withConfig(this._factoryConfig.withAdditionalSerializers(interfaceC5605Yd));
    }

    @Override // o.XY
    public final XY withAdditionalKeySerializers(InterfaceC5605Yd interfaceC5605Yd) {
        return withConfig(this._factoryConfig.withAdditionalKeySerializers(interfaceC5605Yd));
    }

    @Override // o.XY
    public final XY withSerializerModifier(XR xr) {
        return withConfig(this._factoryConfig.withSerializerModifier(xr));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v4, resolved type: o.XR */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007f A[PHI: r2
  0x007f: PHI (r2v7 o.VD<java.lang.Object>) = (r2v6 o.VD<java.lang.Object>), (r2v9 o.VD<java.lang.Object>) binds: [B:13:0x003a, B:16:0x0047] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // o.XY
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public VD<Object> createKeySerializer(VI vi, JavaType javaType, VD<Object> vd) throws JsonMappingException {
        VD<?> vdFindSerializer;
        SerializationConfig config = vi.getConfig();
        AbstractC5549Vz abstractC5549VzIntrospect = config.introspect(javaType);
        if (this._factoryConfig.hasKeySerializers()) {
            Iterator<InterfaceC5605Yd> it = this._factoryConfig.keySerializers().iterator();
            vdFindSerializer = null;
            while (it.hasNext() && (vdFindSerializer = it.next().findSerializer(config, javaType, abstractC5549VzIntrospect)) == null) {
            }
        } else {
            vdFindSerializer = null;
        }
        if (vdFindSerializer == null) {
            VD<Object> vd_findKeySerializer = _findKeySerializer(vi, abstractC5549VzIntrospect.AuCTel());
            if (vd_findKeySerializer != null) {
                vd = vd_findKeySerializer;
            } else if (vd == null) {
                vd_findKeySerializer = StdKeySerializers.EZpvd(config, javaType.getRawClass(), false);
                if (vd_findKeySerializer == null) {
                    AnnotatedMember annotatedMemberGEmmrt = abstractC5549VzIntrospect.gEmmrt();
                    if (annotatedMemberGEmmrt == null) {
                        annotatedMemberGEmmrt = abstractC5549VzIntrospect.valueOf();
                    }
                    if (annotatedMemberGEmmrt != null) {
                        VD<Object> vdCreateKeySerializer = createKeySerializer(vi, annotatedMemberGEmmrt.getType(), vd);
                        if (config.canOverrideAccessModifiers()) {
                            C5619Yr.EZpvd(annotatedMemberGEmmrt.getMember(), config.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
                        }
                        vd = new JsonValueSerializer(annotatedMemberGEmmrt, null, vdCreateKeySerializer);
                    } else {
                        vd = StdKeySerializers.copydefault(config, javaType.getRawClass());
                    }
                }
            }
        } else {
            vd = vdFindSerializer;
        }
        if (this._factoryConfig.hasSerializerModifiers()) {
            Iterator<XR> it2 = this._factoryConfig.serializerModifiers().iterator();
            while (it2.hasNext()) {
                vd = it2.next().KWHzl(config, javaType, abstractC5549VzIntrospect, (VD<?>) vd);
            }
        }
        return vd;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v4, resolved type: o.XR */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.XY
    @Deprecated
    public VD<Object> createKeySerializer(SerializationConfig serializationConfig, JavaType javaType, VD<Object> vd) {
        AbstractC5549Vz abstractC5549VzIntrospect = serializationConfig.introspect(javaType);
        VD<?> vdFindSerializer = null;
        if (this._factoryConfig.hasKeySerializers()) {
            Iterator<InterfaceC5605Yd> it = this._factoryConfig.keySerializers().iterator();
            while (it.hasNext() && (vdFindSerializer = it.next().findSerializer(serializationConfig, javaType, abstractC5549VzIntrospect)) == null) {
            }
        }
        if (vdFindSerializer != null) {
            vd = vdFindSerializer;
        } else if (vd == null && (vd = StdKeySerializers.EZpvd(serializationConfig, javaType.getRawClass(), false)) == null) {
            vd = StdKeySerializers.copydefault(serializationConfig, javaType.getRawClass());
        }
        if (this._factoryConfig.hasSerializerModifiers()) {
            Iterator<XR> it2 = this._factoryConfig.serializerModifiers().iterator();
            while (it2.hasNext()) {
                vd = it2.next().KWHzl(serializationConfig, javaType, abstractC5549VzIntrospect, (VD<?>) vd);
            }
        }
        return vd;
    }

    @Override // o.XY
    public AbstractC5601Xz createTypeSerializer(SerializationConfig serializationConfig, JavaType javaType) {
        Collection<NamedType> collectionCollectAndResolveSubtypesByClass;
        WJ wjAuCTel = serializationConfig.introspectClassAnnotations(javaType.getRawClass()).AuCTel();
        InterfaceC5599Xx<?> interfaceC5599XxFindTypeResolver = serializationConfig.getAnnotationIntrospector().findTypeResolver(serializationConfig, wjAuCTel, javaType);
        if (interfaceC5599XxFindTypeResolver == null) {
            interfaceC5599XxFindTypeResolver = serializationConfig.getDefaultTyper(javaType);
            collectionCollectAndResolveSubtypesByClass = null;
        } else {
            collectionCollectAndResolveSubtypesByClass = serializationConfig.getSubtypeResolver().collectAndResolveSubtypesByClass(serializationConfig, wjAuCTel);
        }
        if (interfaceC5599XxFindTypeResolver == null) {
            return null;
        }
        return interfaceC5599XxFindTypeResolver.buildTypeSerializer(serializationConfig, javaType, collectionCollectAndResolveSubtypesByClass);
    }

    public final VD<?> findSerializerByLookup(JavaType javaType, SerializationConfig serializationConfig, AbstractC5549Vz abstractC5549Vz, boolean z) {
        Class<? extends VD<?>> cls;
        String name = javaType.getRawClass().getName();
        VD<?> vd = _concrete.get(name);
        return (vd != null || (cls = _concreteLazy.get(name)) == null) ? vd : (VD) C5619Yr.EZpvd((Class) cls, false);
    }

    public final VD<?> findSerializerByAnnotations(VI vi, JavaType javaType, AbstractC5549Vz abstractC5549Vz) throws JsonMappingException {
        if (VF.class.isAssignableFrom(javaType.getRawClass())) {
            return SerializableSerializer.instance;
        }
        AnnotatedMember annotatedMemberValueOf = abstractC5549Vz.valueOf();
        if (annotatedMemberValueOf == null) {
            return null;
        }
        if (vi.canOverrideAccessModifiers()) {
            C5619Yr.EZpvd(annotatedMemberValueOf.getMember(), vi.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
        }
        JavaType type = annotatedMemberValueOf.getType();
        VD<Object> vdFindSerializerFromAnnotation = findSerializerFromAnnotation(vi, annotatedMemberValueOf);
        if (vdFindSerializerFromAnnotation == null) {
            vdFindSerializerFromAnnotation = (VD) type.getValueHandler();
        }
        AbstractC5601Xz abstractC5601XzCreateTypeSerializer = (AbstractC5601Xz) type.getTypeHandler();
        if (abstractC5601XzCreateTypeSerializer == null) {
            abstractC5601XzCreateTypeSerializer = createTypeSerializer(vi.getConfig(), type);
        }
        return new JsonValueSerializer(annotatedMemberValueOf, abstractC5601XzCreateTypeSerializer, vdFindSerializerFromAnnotation);
    }

    public final VD<?> findSerializerByPrimaryType(VI vi, JavaType javaType, AbstractC5549Vz abstractC5549Vz, boolean z) throws JsonMappingException {
        if (javaType.isEnumType()) {
            return buildEnumSerializer(vi.getConfig(), javaType, abstractC5549Vz);
        }
        Class<?> rawClass = javaType.getRawClass();
        VD<?> vdFindOptionalStdSerializer = findOptionalStdSerializer(vi, javaType, abstractC5549Vz, z);
        if (vdFindOptionalStdSerializer != null) {
            return vdFindOptionalStdSerializer;
        }
        if (Calendar.class.isAssignableFrom(rawClass)) {
            return CalendarSerializer.instance;
        }
        if (Date.class.isAssignableFrom(rawClass)) {
            return DateSerializer.instance;
        }
        if (Map.Entry.class.isAssignableFrom(rawClass)) {
            JavaType javaTypeFindSuperType = javaType.findSuperType(Map.Entry.class);
            return buildMapEntrySerializer(vi, javaType, abstractC5549Vz, z, javaTypeFindSuperType.containedTypeOrUnknown(0), javaTypeFindSuperType.containedTypeOrUnknown(1));
        }
        if (ByteBuffer.class.isAssignableFrom(rawClass)) {
            return new ByteBufferSerializer();
        }
        if (InetAddress.class.isAssignableFrom(rawClass)) {
            return new InetAddressSerializer();
        }
        if (InetSocketAddress.class.isAssignableFrom(rawClass)) {
            return new InetSocketAddressSerializer();
        }
        if (TimeZone.class.isAssignableFrom(rawClass)) {
            return new TimeZoneSerializer();
        }
        if (Charset.class.isAssignableFrom(rawClass)) {
            return ToStringSerializer.instance;
        }
        if (Number.class.isAssignableFrom(rawClass)) {
            int i = AnonymousClass4.KWHzl[abstractC5549Vz.OLrzqt(null).getShape().ordinal()];
            if (i == 1) {
                return ToStringSerializer.instance;
            }
            if (i == 2 || i == 3) {
                return null;
            }
            return NumberSerializer.instance;
        }
        if (ClassLoader.class.isAssignableFrom(rawClass)) {
            return new ToEmptyObjectSerializer(javaType);
        }
        return null;
    }

    public VD<?> findOptionalStdSerializer(VI vi, JavaType javaType, AbstractC5549Vz abstractC5549Vz, boolean z) throws JsonMappingException {
        return OptionalHandlerFactory.instance.findSerializer(vi.getConfig(), javaType, abstractC5549Vz);
    }

    public final VD<?> findSerializerByAddonType(SerializationConfig serializationConfig, JavaType javaType, AbstractC5549Vz abstractC5549Vz, boolean z) throws JsonMappingException {
        Class<?> rawClass = javaType.getRawClass();
        if (Iterator.class.isAssignableFrom(rawClass)) {
            JavaType[] javaTypeArrFindTypeParameters = serializationConfig.getTypeFactory().findTypeParameters(javaType, Iterator.class);
            return buildIteratorSerializer(serializationConfig, javaType, abstractC5549Vz, z, (javaTypeArrFindTypeParameters == null || javaTypeArrFindTypeParameters.length != 1) ? TypeFactory.unknownType() : javaTypeArrFindTypeParameters[0]);
        }
        if (Iterable.class.isAssignableFrom(rawClass)) {
            JavaType[] javaTypeArrFindTypeParameters2 = serializationConfig.getTypeFactory().findTypeParameters(javaType, Iterable.class);
            return buildIterableSerializer(serializationConfig, javaType, abstractC5549Vz, z, (javaTypeArrFindTypeParameters2 == null || javaTypeArrFindTypeParameters2.length != 1) ? TypeFactory.unknownType() : javaTypeArrFindTypeParameters2[0]);
        }
        if (CharSequence.class.isAssignableFrom(rawClass)) {
            return ToStringSerializer.instance;
        }
        return null;
    }

    public VD<Object> findSerializerFromAnnotation(VI vi, WM wm) throws JsonMappingException {
        Object objFindSerializer = vi.getAnnotationIntrospector().findSerializer(wm);
        if (objFindSerializer == null) {
            return null;
        }
        return findConvertingSerializer(vi, wm, vi.serializerInstance(wm, objFindSerializer));
    }

    public VD<?> findConvertingSerializer(VI vi, WM wm, VD<?> vd) throws JsonMappingException {
        InterfaceC5621Yt<Object, Object> interfaceC5621YtFindConverter = findConverter(vi, wm);
        return interfaceC5621YtFindConverter == null ? vd : new StdDelegatingSerializer(interfaceC5621YtFindConverter, interfaceC5621YtFindConverter.EZpvd(vi.getTypeFactory()), vd);
    }

    public InterfaceC5621Yt<Object, Object> findConverter(VI vi, WM wm) throws JsonMappingException {
        Object objFindSerializationConverter = vi.getAnnotationIntrospector().findSerializationConverter(wm);
        if (objFindSerializationConverter == null) {
            return null;
        }
        return vi.converterInstance(wm, objFindSerializationConverter);
    }

    public VD<?> buildContainerSerializer(VI vi, JavaType javaType, AbstractC5549Vz abstractC5549Vz, boolean z) throws JsonMappingException {
        AbstractC5549Vz abstractC5549Vz2;
        AbstractC5549Vz abstractC5549Vz3 = abstractC5549Vz;
        SerializationConfig config = vi.getConfig();
        boolean z2 = (z || !javaType.useStaticType() || (javaType.isContainerType() && javaType.getContentType().isJavaLangObject())) ? z : true;
        AbstractC5601Xz abstractC5601XzCreateTypeSerializer = createTypeSerializer(config, javaType.getContentType());
        if (abstractC5601XzCreateTypeSerializer != null) {
            z2 = false;
        }
        boolean z3 = z2;
        VD<Object> vd_findContentSerializer = _findContentSerializer(vi, abstractC5549Vz.AuCTel());
        VD<?> vdEZpvd = null;
        if (javaType.isMapLikeType()) {
            MapLikeType mapLikeType = (MapLikeType) javaType;
            VD<Object> vd_findKeySerializer = _findKeySerializer(vi, abstractC5549Vz.AuCTel());
            if (mapLikeType instanceof MapType) {
                return buildMapSerializer(vi, (MapType) mapLikeType, abstractC5549Vz, z3, vd_findKeySerializer, abstractC5601XzCreateTypeSerializer, vd_findContentSerializer);
            }
            Iterator<InterfaceC5605Yd> it = customSerializers().iterator();
            while (it.hasNext() && (vdEZpvd = it.next().findMapLikeSerializer(config, mapLikeType, abstractC5549Vz, vd_findKeySerializer, abstractC5601XzCreateTypeSerializer, vd_findContentSerializer)) == null) {
            }
            if (vdEZpvd == null) {
                vdEZpvd = findSerializerByAnnotations(vi, javaType, abstractC5549Vz);
            }
            if (vdEZpvd != null && this._factoryConfig.hasSerializerModifiers()) {
                Iterator<XR> it2 = this._factoryConfig.serializerModifiers().iterator();
                while (it2.hasNext()) {
                    vdEZpvd = it2.next().EZpvd(config, mapLikeType, abstractC5549Vz3, vdEZpvd);
                }
            }
            return vdEZpvd;
        }
        if (javaType.isCollectionLikeType()) {
            CollectionLikeType collectionLikeType = (CollectionLikeType) javaType;
            if (collectionLikeType instanceof CollectionType) {
                return buildCollectionSerializer(vi, (CollectionType) collectionLikeType, abstractC5549Vz, z3, abstractC5601XzCreateTypeSerializer, vd_findContentSerializer);
            }
            Iterator<InterfaceC5605Yd> it3 = customSerializers().iterator();
            while (true) {
                if (!it3.hasNext()) {
                    abstractC5549Vz2 = abstractC5549Vz3;
                    break;
                }
                abstractC5549Vz2 = abstractC5549Vz3;
                vdEZpvd = it3.next().findCollectionLikeSerializer(config, collectionLikeType, abstractC5549Vz, abstractC5601XzCreateTypeSerializer, vd_findContentSerializer);
                if (vdEZpvd != null) {
                    break;
                }
                abstractC5549Vz3 = abstractC5549Vz2;
            }
            if (vdEZpvd == null) {
                vdEZpvd = findSerializerByAnnotations(vi, javaType, abstractC5549Vz);
            }
            if (vdEZpvd != null && this._factoryConfig.hasSerializerModifiers()) {
                Iterator<XR> it4 = this._factoryConfig.serializerModifiers().iterator();
                while (it4.hasNext()) {
                    vdEZpvd = it4.next().EZpvd(config, collectionLikeType, abstractC5549Vz2, vdEZpvd);
                }
            }
            return vdEZpvd;
        }
        if (javaType.isArrayType()) {
            return buildArraySerializer(vi, (ArrayType) javaType, abstractC5549Vz, z3, abstractC5601XzCreateTypeSerializer, vd_findContentSerializer);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public VD<?> buildCollectionSerializer(VI vi, CollectionType collectionType, AbstractC5549Vz abstractC5549Vz, boolean z, AbstractC5601Xz abstractC5601Xz, VD<Object> vd) throws JsonMappingException {
        VD<?> vdBuildIndexedListSerializer;
        SerializationConfig config = vi.getConfig();
        Iterator<InterfaceC5605Yd> it = customSerializers().iterator();
        VD<?> vdAEQbTJ = null;
        while (it.hasNext() && (vdAEQbTJ = it.next().findCollectionSerializer(config, collectionType, abstractC5549Vz, abstractC5601Xz, vd)) == null) {
        }
        if (vdAEQbTJ == null && (vdAEQbTJ = findSerializerByAnnotations(vi, collectionType, abstractC5549Vz)) == null) {
            if (abstractC5549Vz.OLrzqt(null).getShape() == JsonFormat.Shape.OBJECT) {
                return null;
            }
            Class<?> rawClass = collectionType.getRawClass();
            if (EnumSet.class.isAssignableFrom(rawClass)) {
                JavaType contentType = collectionType.getContentType();
                vdAEQbTJ = buildEnumSetSerializer(contentType.isEnumImplType() ? contentType : null);
            } else {
                Class<?> rawClass2 = collectionType.getContentType().getRawClass();
                if (isIndexedList(rawClass)) {
                    if (rawClass2 == String.class) {
                        if (C5619Yr.AEQbTJ(vd)) {
                            vdBuildIndexedListSerializer = IndexedStringListSerializer.instance;
                        }
                        if (vdAEQbTJ == null) {
                            vdAEQbTJ = buildCollectionSerializer(collectionType.getContentType(), z, abstractC5601Xz, vd);
                        }
                    } else {
                        vdBuildIndexedListSerializer = buildIndexedListSerializer(collectionType.getContentType(), z, abstractC5601Xz, vd);
                    }
                    vdAEQbTJ = vdBuildIndexedListSerializer;
                    if (vdAEQbTJ == null) {
                    }
                } else {
                    if (rawClass2 == String.class && C5619Yr.AEQbTJ(vd)) {
                        vdBuildIndexedListSerializer = StringCollectionSerializer.instance;
                        vdAEQbTJ = vdBuildIndexedListSerializer;
                    }
                    if (vdAEQbTJ == null) {
                    }
                }
            }
        }
        if (this._factoryConfig.hasSerializerModifiers()) {
            Iterator<XR> it2 = this._factoryConfig.serializerModifiers().iterator();
            while (it2.hasNext()) {
                vdAEQbTJ = it2.next().AEQbTJ(config, collectionType, abstractC5549Vz, vdAEQbTJ);
            }
        }
        return vdAEQbTJ;
    }

    public boolean isIndexedList(Class<?> cls) {
        return RandomAccess.class.isAssignableFrom(cls);
    }

    public ContainerSerializer<?> buildIndexedListSerializer(JavaType javaType, boolean z, AbstractC5601Xz abstractC5601Xz, VD<Object> vd) {
        return new IndexedListSerializer(javaType, z, abstractC5601Xz, vd);
    }

    public ContainerSerializer<?> buildCollectionSerializer(JavaType javaType, boolean z, AbstractC5601Xz abstractC5601Xz, VD<Object> vd) {
        return new CollectionSerializer(javaType, z, abstractC5601Xz, vd);
    }

    public VD<?> buildEnumSetSerializer(JavaType javaType) {
        return new EnumSetSerializer(javaType);
    }

    public VD<?> buildMapSerializer(VI vi, MapType mapType, AbstractC5549Vz abstractC5549Vz, boolean z, VD<Object> vd, AbstractC5601Xz abstractC5601Xz, VD<Object> vd2) throws JsonMappingException {
        if (abstractC5549Vz.OLrzqt(null).getShape() == JsonFormat.Shape.OBJECT) {
            return null;
        }
        SerializationConfig config = vi.getConfig();
        Iterator<InterfaceC5605Yd> it = customSerializers().iterator();
        VD<?> vdEZpvd = null;
        while (it.hasNext() && (vdEZpvd = it.next().findMapSerializer(config, mapType, abstractC5549Vz, vd, abstractC5601Xz, vd2)) == null) {
        }
        if (vdEZpvd == null && (vdEZpvd = findSerializerByAnnotations(vi, mapType, abstractC5549Vz)) == null) {
            Object objFindFilterId = findFilterId(config, abstractC5549Vz);
            JsonIgnoreProperties.Value defaultPropertyIgnorals = config.getDefaultPropertyIgnorals(Map.class, abstractC5549Vz.AuCTel());
            Set<String> setFindIgnoredForSerialization = defaultPropertyIgnorals == null ? null : defaultPropertyIgnorals.findIgnoredForSerialization();
            JsonIncludeProperties.Value defaultPropertyInclusions = config.getDefaultPropertyInclusions(Map.class, abstractC5549Vz.AuCTel());
            vdEZpvd = _checkMapContentInclusion(vi, abstractC5549Vz, MapSerializer.construct(setFindIgnoredForSerialization, defaultPropertyInclusions != null ? defaultPropertyInclusions.getIncluded() : null, mapType, z, abstractC5601Xz, vd, vd2, objFindFilterId));
        }
        if (this._factoryConfig.hasSerializerModifiers()) {
            Iterator<XR> it2 = this._factoryConfig.serializerModifiers().iterator();
            while (it2.hasNext()) {
                vdEZpvd = it2.next().EZpvd(config, mapType, abstractC5549Vz, vdEZpvd);
            }
        }
        return vdEZpvd;
    }

    public MapSerializer _checkMapContentInclusion(VI vi, AbstractC5549Vz abstractC5549Vz, MapSerializer mapSerializer) throws JsonMappingException {
        JavaType contentType = mapSerializer.getContentType();
        JsonInclude.Value value_findInclusionWithContent = _findInclusionWithContent(vi, abstractC5549Vz, contentType, Map.class);
        JsonInclude.Include contentInclusion = value_findInclusionWithContent == null ? JsonInclude.Include.USE_DEFAULTS : value_findInclusionWithContent.getContentInclusion();
        boolean zIncludeFilterSuppressNulls = true;
        Object objOLrzqt = null;
        if (contentInclusion == JsonInclude.Include.USE_DEFAULTS || contentInclusion == JsonInclude.Include.ALWAYS) {
            return !vi.isEnabled(SerializationFeature.WRITE_NULL_MAP_VALUES) ? mapSerializer.withContentInclusion(null, true) : mapSerializer;
        }
        int i = AnonymousClass4.AEQbTJ[contentInclusion.ordinal()];
        if (i == 1) {
            objOLrzqt = C5614Ym.OLrzqt(contentType);
            if (objOLrzqt != null && objOLrzqt.getClass().isArray()) {
                objOLrzqt = C5617Yp.OLrzqt(objOLrzqt);
            }
        } else if (i != 2) {
            if (i == 3) {
                objOLrzqt = MapSerializer.MARKER_FOR_EMPTY;
            } else if (i == 4 && (objOLrzqt = vi.includeFilterInstance(null, value_findInclusionWithContent.getContentFilter())) != null) {
                zIncludeFilterSuppressNulls = vi.includeFilterSuppressNulls(objOLrzqt);
            }
        } else if (contentType.isReferenceType()) {
            objOLrzqt = MapSerializer.MARKER_FOR_EMPTY;
        }
        return mapSerializer.withContentInclusion(objOLrzqt, zIncludeFilterSuppressNulls);
    }

    /* JADX INFO: renamed from: com.fasterxml.jackson.databind.ser.BasicSerializerFactory$4, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass4 {
        public static final /* synthetic */ int[] AEQbTJ;
        public static final /* synthetic */ int[] KWHzl;

        static {
            int[] iArr = new int[JsonInclude.Include.values().length];
            AEQbTJ = iArr;
            try {
                iArr[JsonInclude.Include.NON_DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                AEQbTJ[JsonInclude.Include.NON_ABSENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AEQbTJ[JsonInclude.Include.NON_EMPTY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AEQbTJ[JsonInclude.Include.CUSTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AEQbTJ[JsonInclude.Include.NON_NULL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                AEQbTJ[JsonInclude.Include.USE_DEFAULTS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr2 = new int[JsonFormat.Shape.values().length];
            KWHzl = iArr2;
            try {
                iArr2[JsonFormat.Shape.STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                KWHzl[JsonFormat.Shape.OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                KWHzl[JsonFormat.Shape.ARRAY.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public VD<?> buildMapEntrySerializer(VI vi, JavaType javaType, AbstractC5549Vz abstractC5549Vz, boolean z, JavaType javaType2, JavaType javaType3) throws JsonMappingException {
        Object objOLrzqt = null;
        if (JsonFormat.Value.merge(abstractC5549Vz.OLrzqt(null), vi.getDefaultPropertyFormat(Map.Entry.class)).getShape() == JsonFormat.Shape.OBJECT) {
            return null;
        }
        MapEntrySerializer mapEntrySerializer = new MapEntrySerializer(javaType3, javaType2, javaType3, z, createTypeSerializer(vi.getConfig(), javaType3), null);
        JavaType contentType = mapEntrySerializer.getContentType();
        JsonInclude.Value value_findInclusionWithContent = _findInclusionWithContent(vi, abstractC5549Vz, contentType, Map.Entry.class);
        JsonInclude.Include contentInclusion = value_findInclusionWithContent == null ? JsonInclude.Include.USE_DEFAULTS : value_findInclusionWithContent.getContentInclusion();
        if (contentInclusion == JsonInclude.Include.USE_DEFAULTS || contentInclusion == JsonInclude.Include.ALWAYS) {
            return mapEntrySerializer;
        }
        int i = AnonymousClass4.AEQbTJ[contentInclusion.ordinal()];
        boolean zIncludeFilterSuppressNulls = true;
        if (i == 1) {
            objOLrzqt = C5614Ym.OLrzqt(contentType);
            if (objOLrzqt != null && objOLrzqt.getClass().isArray()) {
                objOLrzqt = C5617Yp.OLrzqt(objOLrzqt);
            }
        } else if (i != 2) {
            if (i == 3) {
                objOLrzqt = MapSerializer.MARKER_FOR_EMPTY;
            } else if (i == 4 && (objOLrzqt = vi.includeFilterInstance(null, value_findInclusionWithContent.getContentFilter())) != null) {
                zIncludeFilterSuppressNulls = vi.includeFilterSuppressNulls(objOLrzqt);
            }
        } else if (contentType.isReferenceType()) {
            objOLrzqt = MapSerializer.MARKER_FOR_EMPTY;
        }
        return mapEntrySerializer.withContentInclusion(objOLrzqt, zIncludeFilterSuppressNulls);
    }

    public JsonInclude.Value _findInclusionWithContent(VI vi, AbstractC5549Vz abstractC5549Vz, JavaType javaType, Class<?> cls) throws JsonMappingException {
        SerializationConfig config = vi.getConfig();
        JsonInclude.Value defaultPropertyInclusion = config.getDefaultPropertyInclusion(cls, abstractC5549Vz.KWHzl(config.getDefaultPropertyInclusion()));
        JsonInclude.Value defaultPropertyInclusion2 = config.getDefaultPropertyInclusion(javaType.getRawClass(), null);
        if (defaultPropertyInclusion2 == null) {
            return defaultPropertyInclusion;
        }
        int i = AnonymousClass4.AEQbTJ[defaultPropertyInclusion2.getValueInclusion().ordinal()];
        if (i != 4) {
            return i != 6 ? defaultPropertyInclusion.withContentInclusion(defaultPropertyInclusion2.getValueInclusion()) : defaultPropertyInclusion;
        }
        return defaultPropertyInclusion.withContentFilter(defaultPropertyInclusion2.getContentFilter());
    }

    public VD<?> buildArraySerializer(VI vi, ArrayType arrayType, AbstractC5549Vz abstractC5549Vz, boolean z, AbstractC5601Xz abstractC5601Xz, VD<Object> vd) throws JsonMappingException {
        SerializationConfig config = vi.getConfig();
        Iterator<InterfaceC5605Yd> it = customSerializers().iterator();
        VD<?> vdKWHzl = null;
        while (it.hasNext() && (vdKWHzl = it.next().findArraySerializer(config, arrayType, abstractC5549Vz, abstractC5601Xz, vd)) == null) {
        }
        if (vdKWHzl == null) {
            Class<?> rawClass = arrayType.getRawClass();
            if (vd == null || C5619Yr.AEQbTJ(vd)) {
                if (String[].class == rawClass) {
                    vdKWHzl = StringArraySerializer.instance;
                } else {
                    vdKWHzl = StdArraySerializers.OLrzqt(rawClass);
                }
            }
            if (vdKWHzl == null) {
                vdKWHzl = new ObjectArraySerializer(arrayType.getContentType(), z, abstractC5601Xz, vd);
            }
        }
        if (this._factoryConfig.hasSerializerModifiers()) {
            Iterator<XR> it2 = this._factoryConfig.serializerModifiers().iterator();
            while (it2.hasNext()) {
                vdKWHzl = it2.next().KWHzl(config, arrayType, abstractC5549Vz, vdKWHzl);
            }
        }
        return vdKWHzl;
    }

    public VD<?> findReferenceSerializer(VI vi, ReferenceType referenceType, AbstractC5549Vz abstractC5549Vz, boolean z) throws JsonMappingException {
        JavaType contentType = referenceType.getContentType();
        AbstractC5601Xz abstractC5601XzCreateTypeSerializer = (AbstractC5601Xz) contentType.getTypeHandler();
        SerializationConfig config = vi.getConfig();
        if (abstractC5601XzCreateTypeSerializer == null) {
            abstractC5601XzCreateTypeSerializer = createTypeSerializer(config, contentType);
        }
        AbstractC5601Xz abstractC5601Xz = abstractC5601XzCreateTypeSerializer;
        VD<Object> vd = (VD) contentType.getValueHandler();
        Iterator<InterfaceC5605Yd> it = customSerializers().iterator();
        while (it.hasNext()) {
            VD<?> vdFindReferenceSerializer = it.next().findReferenceSerializer(config, referenceType, abstractC5549Vz, abstractC5601Xz, vd);
            if (vdFindReferenceSerializer != null) {
                return vdFindReferenceSerializer;
            }
        }
        if (referenceType.isTypeOrSubTypeOf(AtomicReference.class)) {
            return buildAtomicReferenceSerializer(vi, referenceType, abstractC5549Vz, z, abstractC5601Xz, vd);
        }
        return null;
    }

    public VD<?> buildAtomicReferenceSerializer(VI vi, ReferenceType referenceType, AbstractC5549Vz abstractC5549Vz, boolean z, AbstractC5601Xz abstractC5601Xz, VD<Object> vd) throws JsonMappingException {
        boolean zIncludeFilterSuppressNulls;
        JavaType referencedType = referenceType.getReferencedType();
        JsonInclude.Value value_findInclusionWithContent = _findInclusionWithContent(vi, abstractC5549Vz, referencedType, AtomicReference.class);
        JsonInclude.Include contentInclusion = value_findInclusionWithContent == null ? JsonInclude.Include.USE_DEFAULTS : value_findInclusionWithContent.getContentInclusion();
        Object objOLrzqt = null;
        if (contentInclusion == JsonInclude.Include.USE_DEFAULTS || contentInclusion == JsonInclude.Include.ALWAYS) {
            zIncludeFilterSuppressNulls = false;
        } else {
            int i = AnonymousClass4.AEQbTJ[contentInclusion.ordinal()];
            zIncludeFilterSuppressNulls = true;
            if (i == 1) {
                objOLrzqt = C5614Ym.OLrzqt(referencedType);
                if (objOLrzqt != null && objOLrzqt.getClass().isArray()) {
                    objOLrzqt = C5617Yp.OLrzqt(objOLrzqt);
                }
            } else if (i != 2) {
                if (i == 3) {
                    objOLrzqt = MapSerializer.MARKER_FOR_EMPTY;
                } else if (i == 4 && (objOLrzqt = vi.includeFilterInstance(null, value_findInclusionWithContent.getContentFilter())) != null) {
                    zIncludeFilterSuppressNulls = vi.includeFilterSuppressNulls(objOLrzqt);
                }
            } else if (referencedType.isReferenceType()) {
                objOLrzqt = MapSerializer.MARKER_FOR_EMPTY;
            }
        }
        return new AtomicReferenceSerializer(referenceType, z, abstractC5601Xz, vd).withContentInclusion(objOLrzqt, zIncludeFilterSuppressNulls);
    }

    public VD<?> buildIteratorSerializer(SerializationConfig serializationConfig, JavaType javaType, AbstractC5549Vz abstractC5549Vz, boolean z, JavaType javaType2) throws JsonMappingException {
        return new IteratorSerializer(javaType2, z, createTypeSerializer(serializationConfig, javaType2));
    }

    public VD<?> buildIterableSerializer(SerializationConfig serializationConfig, JavaType javaType, AbstractC5549Vz abstractC5549Vz, boolean z, JavaType javaType2) throws JsonMappingException {
        return new IterableSerializer(javaType2, z, createTypeSerializer(serializationConfig, javaType2));
    }

    public VD<?> buildEnumSerializer(SerializationConfig serializationConfig, JavaType javaType, AbstractC5549Vz abstractC5549Vz) throws JsonMappingException {
        JsonFormat.Value valueOLrzqt = abstractC5549Vz.OLrzqt(null);
        if (valueOLrzqt.getShape() == JsonFormat.Shape.OBJECT) {
            ((WW) abstractC5549Vz).KWHzl("declaringClass");
            return null;
        }
        VD<?> vdConstruct = EnumSerializer.construct(javaType.getRawClass(), serializationConfig, abstractC5549Vz, valueOLrzqt);
        if (this._factoryConfig.hasSerializerModifiers()) {
            Iterator<XR> it = this._factoryConfig.serializerModifiers().iterator();
            while (it.hasNext()) {
                vdConstruct = it.next().EZpvd(serializationConfig, javaType, abstractC5549Vz, vdConstruct);
            }
        }
        return vdConstruct;
    }

    public VD<Object> _findKeySerializer(VI vi, WM wm) throws JsonMappingException {
        Object objFindKeySerializer = vi.getAnnotationIntrospector().findKeySerializer(wm);
        if (objFindKeySerializer != null) {
            return vi.serializerInstance(wm, objFindKeySerializer);
        }
        return null;
    }

    public VD<Object> _findContentSerializer(VI vi, WM wm) throws JsonMappingException {
        Object objFindContentSerializer = vi.getAnnotationIntrospector().findContentSerializer(wm);
        if (objFindContentSerializer != null) {
            return vi.serializerInstance(wm, objFindContentSerializer);
        }
        return null;
    }

    public Object findFilterId(SerializationConfig serializationConfig, AbstractC5549Vz abstractC5549Vz) {
        return serializationConfig.getAnnotationIntrospector().findFilterId(abstractC5549Vz.AuCTel());
    }

    public boolean usesStaticTyping(SerializationConfig serializationConfig, AbstractC5549Vz abstractC5549Vz, AbstractC5601Xz abstractC5601Xz) {
        if (abstractC5601Xz != null) {
            return false;
        }
        JsonSerialize.Typing typingFindSerializationTyping = serializationConfig.getAnnotationIntrospector().findSerializationTyping(abstractC5549Vz.AuCTel());
        if (typingFindSerializationTyping == null || typingFindSerializationTyping == JsonSerialize.Typing.DEFAULT_TYPING) {
            return serializationConfig.isEnabled(MapperFeature.USE_STATIC_TYPING);
        }
        return typingFindSerializationTyping == JsonSerialize.Typing.STATIC;
    }
}
