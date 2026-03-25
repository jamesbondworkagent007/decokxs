package o;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.deser.AbstractDeserializer;
import com.fasterxml.jackson.databind.deser.BeanDeserializer;
import com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer;
import com.fasterxml.jackson.databind.deser.SettableAnyProperty;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReader;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty;
import com.fasterxml.jackson.databind.deser.impl.ValueInjector;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.util.IgnorePropertiesUtil;
import java.util.Collections;
import java.util.LinkedHashMap;
import o.VO;

/* JADX INFO: loaded from: classes21.dex */
public class VW {
    public VO.StateListAnimator AEQbTJ;
    public final DeserializationContext AYXKKw;
    public boolean AhwBna;
    public ObjectIdReader AkhnZx;
    public java.util.List<ValueInjector> DbNXlk;
    public java.util.HashMap<java.lang.String, SettableBeanProperty> EZpvd;
    public AnnotatedMethod KWHzl;
    public final AbstractC5549Vz OLrzqt;
    public SettableAnyProperty copydefault;
    public java.util.HashSet<java.lang.String> djBIcL;
    public final java.util.Map<java.lang.String, SettableBeanProperty> fetchVPNInfo = new LinkedHashMap();
    public java.util.HashSet<java.lang.String> gEmmrt;
    public final DeserializationConfig valueOf;
    public ValueInstantiator values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ValueInstantiator AYXKKw() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.util.List<ValueInjector> AhwBna() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SettableAnyProperty EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void EZpvd(boolean z) {
        this.AhwBna = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void KWHzl(ObjectIdReader objectIdReader) {
        this.AkhnZx = objectIdReader;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void OLrzqt(ValueInstantiator valueInstantiator) {
        this.values = valueInstantiator;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AnnotatedMethod copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void copydefault(AnnotatedMethod annotatedMethod, VO.StateListAnimator stateListAnimator) {
        this.KWHzl = annotatedMethod;
        this.AEQbTJ = stateListAnimator;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ObjectIdReader gEmmrt() {
        return this.AkhnZx;
    }

    public VW(AbstractC5549Vz abstractC5549Vz, DeserializationContext deserializationContext) {
        this.OLrzqt = abstractC5549Vz;
        this.AYXKKw = deserializationContext;
        this.valueOf = deserializationContext.getConfig();
    }

    public void OLrzqt(SettableBeanProperty settableBeanProperty, boolean z) {
        this.fetchVPNInfo.put(settableBeanProperty.getName(), settableBeanProperty);
    }

    public void AEQbTJ(SettableBeanProperty settableBeanProperty) {
        SettableBeanProperty settableBeanPropertyPut = this.fetchVPNInfo.put(settableBeanProperty.getName(), settableBeanProperty);
        if (settableBeanPropertyPut == null || settableBeanPropertyPut == settableBeanProperty) {
            return;
        }
        throw new java.lang.IllegalArgumentException("Duplicate property '" + settableBeanProperty.getName() + "' for " + this.OLrzqt.getNewProxyInstance());
    }

    public void AEQbTJ(java.lang.String str, SettableBeanProperty settableBeanProperty) throws DatabindException {
        if (this.EZpvd == null) {
            this.EZpvd = new java.util.HashMap<>(4);
        }
        if (this.valueOf.canOverrideAccessModifiers()) {
            try {
                settableBeanProperty.fixAccess(this.valueOf);
            } catch (java.lang.IllegalArgumentException e) {
                copydefault(e);
            }
        }
        this.EZpvd.put(str, settableBeanProperty);
    }

    public void OLrzqt(PropertyName propertyName, JavaType javaType, InterfaceC5609Yh interfaceC5609Yh, AnnotatedMember annotatedMember, java.lang.Object obj) throws DatabindException {
        if (this.DbNXlk == null) {
            this.DbNXlk = new java.util.ArrayList();
        }
        if (this.valueOf.canOverrideAccessModifiers()) {
            try {
                annotatedMember.fixAccess(this.valueOf.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
            } catch (java.lang.IllegalArgumentException e) {
                copydefault(e);
            }
        }
        this.DbNXlk.add(new ValueInjector(propertyName, javaType, annotatedMember, obj));
    }

    public void AEQbTJ(java.lang.String str) {
        if (this.gEmmrt == null) {
            this.gEmmrt = new java.util.HashSet<>();
        }
        this.gEmmrt.add(str);
    }

    public void KWHzl(java.lang.String str) {
        if (this.djBIcL == null) {
            this.djBIcL = new java.util.HashSet<>();
        }
        this.djBIcL.add(str);
    }

    public void KWHzl(SettableBeanProperty settableBeanProperty) {
        AEQbTJ(settableBeanProperty);
    }

    public void copydefault(SettableAnyProperty settableAnyProperty) {
        if (this.copydefault != null && settableAnyProperty != null) {
            throw new java.lang.IllegalStateException("_anySetter already set to non-null");
        }
        this.copydefault = settableAnyProperty;
    }

    public java.util.Iterator<SettableBeanProperty> valueOf() {
        return this.fetchVPNInfo.values().iterator();
    }

    public SettableBeanProperty copydefault(PropertyName propertyName) {
        return this.fetchVPNInfo.get(propertyName.getSimpleName());
    }

    public boolean copydefault(java.lang.String str) {
        return IgnorePropertiesUtil.KWHzl(str, this.gEmmrt, this.djBIcL);
    }

    public AbstractC5548Vy<?> OLrzqt() throws DatabindException {
        boolean z;
        java.util.Collection<SettableBeanProperty> collectionValues = this.fetchVPNInfo.values();
        copydefault(collectionValues);
        BeanPropertyMap beanPropertyMapConstruct = BeanPropertyMap.construct(this.valueOf, collectionValues, OLrzqt(collectionValues), KWHzl());
        beanPropertyMapConstruct.assignIndexes();
        boolean z2 = !this.valueOf.isEnabled(MapperFeature.DEFAULT_VIEW_INCLUSION);
        if (z2) {
            z = z2;
        } else {
            java.util.Iterator<SettableBeanProperty> it = collectionValues.iterator();
            while (it.hasNext()) {
                if (it.next().hasViews()) {
                    z = true;
                    break;
                }
            }
            z = z2;
        }
        if (this.AkhnZx != null) {
            beanPropertyMapConstruct = beanPropertyMapConstruct.withProperty(new ObjectIdValueProperty(this.AkhnZx, PropertyMetadata.STD_REQUIRED));
        }
        return new BeanDeserializer(this, this.OLrzqt, beanPropertyMapConstruct, this.EZpvd, this.gEmmrt, this.AhwBna, this.djBIcL, z);
    }

    public AbstractDeserializer AEQbTJ() {
        return new AbstractDeserializer(this, this.OLrzqt, this.EZpvd, this.fetchVPNInfo);
    }

    public AbstractC5548Vy<?> AEQbTJ(JavaType javaType, java.lang.String str) throws DatabindException {
        AnnotatedMethod annotatedMethod = this.KWHzl;
        if (annotatedMethod == null) {
            if (!str.isEmpty()) {
                this.AYXKKw.reportBadDefinition(this.OLrzqt.getNewProxyInstance(), java.lang.String.format("Builder class %s does not have build method (name: '%s')", C5619Yr.copydefault(this.OLrzqt.getNewProxyInstance()), str));
            }
        } else {
            java.lang.Class<?> rawReturnType = annotatedMethod.getRawReturnType();
            java.lang.Class<?> rawClass = javaType.getRawClass();
            if (rawReturnType != rawClass && !rawReturnType.isAssignableFrom(rawClass) && !rawClass.isAssignableFrom(rawReturnType)) {
                this.AYXKKw.reportBadDefinition(this.OLrzqt.getNewProxyInstance(), java.lang.String.format("Build method `%s` has wrong return type (%s), not compatible with POJO type (%s)", this.KWHzl.getFullName(), C5619Yr.KWHzl((java.lang.Object) rawReturnType), C5619Yr.copydefault(javaType)));
            }
        }
        java.util.Collection<SettableBeanProperty> collectionValues = this.fetchVPNInfo.values();
        copydefault(collectionValues);
        BeanPropertyMap beanPropertyMapConstruct = BeanPropertyMap.construct(this.valueOf, collectionValues, OLrzqt(collectionValues), KWHzl());
        beanPropertyMapConstruct.assignIndexes();
        boolean z = true;
        boolean z2 = !this.valueOf.isEnabled(MapperFeature.DEFAULT_VIEW_INCLUSION);
        if (z2) {
            z = z2;
        } else {
            java.util.Iterator<SettableBeanProperty> it = collectionValues.iterator();
            while (it.hasNext()) {
                if (it.next().hasViews()) {
                    break;
                }
            }
            z = z2;
        }
        if (this.AkhnZx != null) {
            beanPropertyMapConstruct = beanPropertyMapConstruct.withProperty(new ObjectIdValueProperty(this.AkhnZx, PropertyMetadata.STD_REQUIRED));
        }
        return AEQbTJ(javaType, beanPropertyMapConstruct, z);
    }

    public AbstractC5548Vy<?> AEQbTJ(JavaType javaType, BeanPropertyMap beanPropertyMap, boolean z) {
        return new BuilderBasedDeserializer(this, this.OLrzqt, javaType, beanPropertyMap, this.EZpvd, this.gEmmrt, this.AhwBna, this.djBIcL, z);
    }

    public void copydefault(java.util.Collection<SettableBeanProperty> collection) throws DatabindException {
        if (this.valueOf.canOverrideAccessModifiers()) {
            java.util.Iterator<SettableBeanProperty> it = collection.iterator();
            while (it.hasNext()) {
                try {
                    it.next().fixAccess(this.valueOf);
                } catch (java.lang.IllegalArgumentException e) {
                    copydefault(e);
                }
            }
        }
        SettableAnyProperty settableAnyProperty = this.copydefault;
        if (settableAnyProperty != null) {
            try {
                settableAnyProperty.fixAccess(this.valueOf);
            } catch (java.lang.IllegalArgumentException e2) {
                copydefault(e2);
            }
        }
        AnnotatedMethod annotatedMethod = this.KWHzl;
        if (annotatedMethod != null) {
            try {
                annotatedMethod.fixAccess(this.valueOf.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
            } catch (java.lang.IllegalArgumentException e3) {
                copydefault(e3);
            }
        }
    }

    public java.util.Map<java.lang.String, java.util.List<PropertyName>> OLrzqt(java.util.Collection<SettableBeanProperty> collection) {
        AnnotationIntrospector annotationIntrospector = this.valueOf.getAnnotationIntrospector();
        java.util.HashMap map = null;
        if (annotationIntrospector != null) {
            for (SettableBeanProperty settableBeanProperty : collection) {
                java.util.List<PropertyName> listFindPropertyAliases = annotationIntrospector.findPropertyAliases(settableBeanProperty.getMember());
                if (listFindPropertyAliases != null && !listFindPropertyAliases.isEmpty()) {
                    if (map == null) {
                        map = new java.util.HashMap();
                    }
                    map.put(settableBeanProperty.getName(), listFindPropertyAliases);
                }
            }
        }
        return map == null ? Collections.emptyMap() : map;
    }

    public boolean KWHzl() {
        java.lang.Boolean feature = this.OLrzqt.OLrzqt(null).getFeature(JsonFormat.Feature.ACCEPT_CASE_INSENSITIVE_PROPERTIES);
        if (feature == null) {
            return this.valueOf.isEnabled(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES);
        }
        return feature.booleanValue();
    }

    public void copydefault(java.lang.IllegalArgumentException illegalArgumentException) throws DatabindException {
        try {
            this.AYXKKw.reportBadTypeDefinition(this.OLrzqt, illegalArgumentException.getMessage(), new java.lang.Object[0]);
        } catch (DatabindException e) {
            if (e.getCause() == null) {
                e.initCause(illegalArgumentException);
            }
            throw e;
        }
    }
}
