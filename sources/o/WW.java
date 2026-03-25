package o;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.AnnotatedConstructor;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import java.util.Collections;
import o.InterfaceC5621Yt;
import o.VO;

/* JADX INFO: loaded from: classes21.dex */
public class WW extends AbstractC5549Vz {
    public static final java.lang.Class<?>[] copydefault = new java.lang.Class[0];
    public final AnnotationIntrospector AEQbTJ;
    public C5576Xa AYXKKw;
    public java.lang.Class<?>[] AhwBna;
    public final MapperConfig<?> KWHzl;
    public final WJ OLrzqt;
    public java.util.List<WT> djBIcL;
    public boolean gEmmrt;
    public final C5577Xb valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC5549Vz
    public WJ AuCTel() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC5549Vz
    public C5576Xa iwGUEr() {
        return this.AYXKKw;
    }

    public WW(C5577Xb c5577Xb, JavaType javaType, WJ wj) {
        super(javaType);
        this.valueOf = c5577Xb;
        MapperConfig<?> mapperConfigAhwBna = c5577Xb.AhwBna();
        this.KWHzl = mapperConfigAhwBna;
        if (mapperConfigAhwBna == null) {
            this.AEQbTJ = null;
        } else {
            this.AEQbTJ = mapperConfigAhwBna.getAnnotationIntrospector();
        }
        this.OLrzqt = wj;
    }

    public WW(MapperConfig<?> mapperConfig, JavaType javaType, WJ wj, java.util.List<WT> list) {
        super(javaType);
        this.valueOf = null;
        this.KWHzl = mapperConfig;
        if (mapperConfig == null) {
            this.AEQbTJ = null;
        } else {
            this.AEQbTJ = mapperConfig.getAnnotationIntrospector();
        }
        this.OLrzqt = wj;
        this.djBIcL = list;
    }

    public WW(C5577Xb c5577Xb) {
        this(c5577Xb, c5577Xb.fIwbmz(), c5577Xb.djBIcL());
        this.AYXKKw = c5577Xb.isConnected();
    }

    public static WW copydefault(C5577Xb c5577Xb) {
        return new WW(c5577Xb);
    }

    public static WW AEQbTJ(C5577Xb c5577Xb) {
        return new WW(c5577Xb);
    }

    public static WW EZpvd(MapperConfig<?> mapperConfig, JavaType javaType, WJ wj) {
        return new WW(mapperConfig, javaType, wj, Collections.emptyList());
    }

    public java.util.List<WT> AubY() {
        if (this.djBIcL == null) {
            this.djBIcL = this.valueOf.values();
        }
        return this.djBIcL;
    }

    public boolean KWHzl(java.lang.String str) {
        java.util.Iterator<WT> it = AubY().iterator();
        while (it.hasNext()) {
            if (it.next().getName().equals(str)) {
                it.remove();
                return true;
            }
        }
        return false;
    }

    public boolean copydefault(WT wt) {
        if (OLrzqt(wt.isConnected())) {
            return false;
        }
        AubY().add(wt);
        return true;
    }

    public boolean OLrzqt(PropertyName propertyName) {
        return KWHzl(propertyName) != null;
    }

    public WT KWHzl(PropertyName propertyName) {
        for (WT wt : AubY()) {
            if (wt.copydefault(propertyName)) {
                return wt;
            }
        }
        return null;
    }

    @Override // o.AbstractC5549Vz
    public java.util.List<WT> isConnected() {
        return AubY();
    }

    @Override // o.AbstractC5549Vz
    public AnnotatedMember gEmmrt() {
        C5577Xb c5577Xb = this.valueOf;
        if (c5577Xb == null) {
            return null;
        }
        return c5577Xb.fetchVPNInfo();
    }

    @Override // o.AbstractC5549Vz
    @java.lang.Deprecated
    public AnnotatedMethod AYXKKw() {
        C5577Xb c5577Xb = this.valueOf;
        if (c5577Xb == null) {
            return null;
        }
        return c5577Xb.AkhnZx();
    }

    @Override // o.AbstractC5549Vz
    public AnnotatedMember valueOf() {
        C5577Xb c5577Xb = this.valueOf;
        if (c5577Xb == null) {
            return null;
        }
        return c5577Xb.DbNXlk();
    }

    @Override // o.AbstractC5549Vz
    public java.util.Set<java.lang.String> getFieldNames() {
        C5577Xb c5577Xb = this.valueOf;
        java.util.Set<java.lang.String> setValueOf = c5577Xb == null ? null : c5577Xb.valueOf();
        return setValueOf == null ? Collections.emptySet() : setValueOf;
    }

    @Override // o.AbstractC5549Vz
    public boolean uzCIH() {
        return this.OLrzqt.valueOf();
    }

    @Override // o.AbstractC5549Vz
    public InterfaceC5609Yh fJNWhG() {
        return this.OLrzqt.AhwBna();
    }

    @Override // o.AbstractC5549Vz
    public AnnotatedConstructor AEQbTJ() {
        return this.OLrzqt.djBIcL();
    }

    @Override // o.AbstractC5549Vz
    public AnnotatedMember KWHzl() throws java.lang.IllegalArgumentException {
        C5577Xb c5577Xb = this.valueOf;
        if (c5577Xb == null) {
            return null;
        }
        AnnotatedMethod annotatedMethodGEmmrt = c5577Xb.gEmmrt();
        if (annotatedMethodGEmmrt != null) {
            java.lang.Class<?> rawParameterType = annotatedMethodGEmmrt.getRawParameterType(0);
            if (rawParameterType == java.lang.String.class || rawParameterType == java.lang.Object.class) {
                return annotatedMethodGEmmrt;
            }
            throw new java.lang.IllegalArgumentException(java.lang.String.format("Invalid 'any-setter' annotation on method '%s()': first argument not of type String or Object, but %s", annotatedMethodGEmmrt.getName(), rawParameterType.getName()));
        }
        AnnotatedMember annotatedMemberAEQbTJ = this.valueOf.AEQbTJ();
        if (annotatedMemberAEQbTJ == null) {
            return null;
        }
        java.lang.Class<?> rawType = annotatedMemberAEQbTJ.getRawType();
        if (java.util.Map.class.isAssignableFrom(rawType) || JsonNode.class.isAssignableFrom(rawType)) {
            return annotatedMemberAEQbTJ;
        }
        throw new java.lang.IllegalArgumentException(java.lang.String.format("Invalid 'any-setter' annotation on field '%s': type is not instance of `java.util.Map` or `JsonNode`", annotatedMemberAEQbTJ.getName()));
    }

    @Override // o.AbstractC5549Vz
    public java.util.Map<java.lang.Object, AnnotatedMember> djBIcL() {
        C5577Xb c5577Xb = this.valueOf;
        if (c5577Xb != null) {
            return c5577Xb.AYXKKw();
        }
        return Collections.emptyMap();
    }

    @Override // o.AbstractC5549Vz
    public java.util.List<AnnotatedConstructor> fARcdN() {
        return this.OLrzqt.AYXKKw();
    }

    @Override // o.AbstractC5549Vz
    public java.util.List<WK<AnnotatedConstructor, JsonCreator.Mode>> fIwbmz() {
        java.util.List<AnnotatedConstructor> listAYXKKw = this.OLrzqt.AYXKKw();
        if (listAYXKKw.isEmpty()) {
            return Collections.emptyList();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (AnnotatedConstructor annotatedConstructor : listAYXKKw) {
            JsonCreator.Mode modeFindCreatorAnnotation = this.AEQbTJ.findCreatorAnnotation(this.KWHzl, annotatedConstructor);
            if (modeFindCreatorAnnotation != JsonCreator.Mode.DISABLED) {
                arrayList.add(WK.KWHzl(annotatedConstructor, modeFindCreatorAnnotation));
            }
        }
        return arrayList;
    }

    @Override // o.AbstractC5549Vz
    public java.lang.Object copydefault(boolean z) {
        AnnotatedConstructor annotatedConstructorDjBIcL = this.OLrzqt.djBIcL();
        if (annotatedConstructorDjBIcL == null) {
            return null;
        }
        if (z) {
            annotatedConstructorDjBIcL.fixAccess(this.KWHzl.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
        }
        try {
            return annotatedConstructorDjBIcL.call();
        } catch (java.lang.Exception e) {
            e = e;
            while (e.getCause() != null) {
                e = e.getCause();
            }
            C5619Yr.copydefault(e);
            C5619Yr.AhwBna(e);
            throw new java.lang.IllegalArgumentException("Failed to instantiate bean of type " + this.OLrzqt.getAnnotated().getName() + ": (" + e.getClass().getName() + ") " + C5619Yr.EZpvd(e), e);
        }
    }

    @Override // o.AbstractC5549Vz
    public AnnotatedMethod AEQbTJ(java.lang.String str, java.lang.Class<?>[] clsArr) {
        return this.OLrzqt.copydefault(str, clsArr);
    }

    @Override // o.AbstractC5549Vz
    public JsonFormat.Value OLrzqt(JsonFormat.Value value) {
        JsonFormat.Value valueFindFormat;
        AnnotationIntrospector annotationIntrospector = this.AEQbTJ;
        if (annotationIntrospector != null && (valueFindFormat = annotationIntrospector.findFormat(this.OLrzqt)) != null) {
            value = value == null ? valueFindFormat : value.withOverrides(valueFindFormat);
        }
        JsonFormat.Value defaultPropertyFormat = this.KWHzl.getDefaultPropertyFormat(this.OLrzqt.getRawType());
        return defaultPropertyFormat != null ? value == null ? defaultPropertyFormat : value.withOverrides(defaultPropertyFormat) : value;
    }

    @Override // o.AbstractC5549Vz
    public java.lang.Class<?>[] OLrzqt() {
        if (!this.gEmmrt) {
            this.gEmmrt = true;
            AnnotationIntrospector annotationIntrospector = this.AEQbTJ;
            java.lang.Class<?>[] clsArrFindViews = annotationIntrospector == null ? null : annotationIntrospector.findViews(this.OLrzqt);
            if (clsArrFindViews == null && !this.KWHzl.isEnabled(MapperFeature.DEFAULT_VIEW_INCLUSION)) {
                clsArrFindViews = copydefault;
            }
            this.AhwBna = clsArrFindViews;
        }
        return this.AhwBna;
    }

    @Override // o.AbstractC5549Vz
    public InterfaceC5621Yt<java.lang.Object, java.lang.Object> fetchVPNInfo() {
        AnnotationIntrospector annotationIntrospector = this.AEQbTJ;
        if (annotationIntrospector == null) {
            return null;
        }
        return AEQbTJ(annotationIntrospector.findSerializationConverter(this.OLrzqt));
    }

    @Override // o.AbstractC5549Vz
    public JsonInclude.Value KWHzl(JsonInclude.Value value) {
        JsonInclude.Value valueFindPropertyInclusion;
        AnnotationIntrospector annotationIntrospector = this.AEQbTJ;
        return (annotationIntrospector == null || (valueFindPropertyInclusion = annotationIntrospector.findPropertyInclusion(this.OLrzqt)) == null) ? value : value == null ? valueFindPropertyInclusion : value.withOverrides(valueFindPropertyInclusion);
    }

    @Override // o.AbstractC5549Vz
    public AnnotatedMember copydefault() throws java.lang.IllegalArgumentException {
        C5577Xb c5577Xb = this.valueOf;
        if (c5577Xb == null) {
            return null;
        }
        AnnotatedMember annotatedMemberEZpvd = c5577Xb.EZpvd();
        if (annotatedMemberEZpvd != null) {
            if (java.util.Map.class.isAssignableFrom(annotatedMemberEZpvd.getRawType())) {
                return annotatedMemberEZpvd;
            }
            throw new java.lang.IllegalArgumentException(java.lang.String.format("Invalid 'any-getter' annotation on method %s(): return type is not instance of java.util.Map", annotatedMemberEZpvd.getName()));
        }
        AnnotatedMember annotatedMemberKWHzl = this.valueOf.KWHzl();
        if (annotatedMemberKWHzl == null) {
            return null;
        }
        if (java.util.Map.class.isAssignableFrom(annotatedMemberKWHzl.getRawType())) {
            return annotatedMemberKWHzl;
        }
        throw new java.lang.IllegalArgumentException(java.lang.String.format("Invalid 'any-getter' annotation on field '%s': type is not instance of java.util.Map", annotatedMemberKWHzl.getName()));
    }

    @Override // o.AbstractC5549Vz
    public java.util.List<WT> EZpvd() {
        java.util.ArrayList arrayList = null;
        java.util.HashSet hashSet = null;
        for (WT wt : AubY()) {
            AnnotationIntrospector.ReferenceProperty referencePropertyAYXKKw = wt.AYXKKw();
            if (referencePropertyAYXKKw != null && referencePropertyAYXKKw.copydefault()) {
                java.lang.String strKWHzl = referencePropertyAYXKKw.KWHzl();
                if (arrayList == null) {
                    arrayList = new java.util.ArrayList();
                    hashSet = new java.util.HashSet();
                    hashSet.add(strKWHzl);
                } else if (!hashSet.add(strKWHzl)) {
                    throw new java.lang.IllegalArgumentException("Multiple back-reference properties with name " + C5619Yr.copydefault(strKWHzl));
                }
                arrayList.add(wt);
            }
        }
        return arrayList;
    }

    @Override // o.AbstractC5549Vz
    public java.util.List<AnnotatedMethod> ejfBZ() {
        java.util.List<AnnotatedMethod> listGEmmrt = this.OLrzqt.gEmmrt();
        if (listGEmmrt.isEmpty()) {
            return listGEmmrt;
        }
        java.util.ArrayList arrayList = null;
        for (AnnotatedMethod annotatedMethod : listGEmmrt) {
            if (OLrzqt(annotatedMethod)) {
                if (arrayList == null) {
                    arrayList = new java.util.ArrayList();
                }
                arrayList.add(annotatedMethod);
            }
        }
        return arrayList == null ? Collections.emptyList() : arrayList;
    }

    @Override // o.AbstractC5549Vz
    public java.util.List<WK<AnnotatedMethod, JsonCreator.Mode>> hDKMBd() {
        java.util.List<AnnotatedMethod> listGEmmrt = this.OLrzqt.gEmmrt();
        if (listGEmmrt.isEmpty()) {
            return Collections.emptyList();
        }
        java.util.Iterator<AnnotatedMethod> it = listGEmmrt.iterator();
        java.util.ArrayList arrayList = null;
        while (it.hasNext()) {
            WK<AnnotatedMethod, JsonCreator.Mode> wkAEQbTJ = AEQbTJ(it.next());
            if (wkAEQbTJ != null) {
                if (arrayList == null) {
                    arrayList = new java.util.ArrayList();
                }
                arrayList.add(wkAEQbTJ);
            }
        }
        return arrayList == null ? Collections.emptyList() : arrayList;
    }

    public boolean OLrzqt(AnnotatedMethod annotatedMethod) {
        java.lang.Class<?> rawParameterType;
        if (!DbNXlk().isAssignableFrom(annotatedMethod.getRawReturnType())) {
            return false;
        }
        JsonCreator.Mode modeFindCreatorAnnotation = this.AEQbTJ.findCreatorAnnotation(this.KWHzl, annotatedMethod);
        if (modeFindCreatorAnnotation != null && modeFindCreatorAnnotation != JsonCreator.Mode.DISABLED) {
            return true;
        }
        java.lang.String name = annotatedMethod.getName();
        if ("valueOf".equals(name) && annotatedMethod.getParameterCount() == 1) {
            return true;
        }
        return "fromString".equals(name) && annotatedMethod.getParameterCount() == 1 && ((rawParameterType = annotatedMethod.getRawParameterType(0)) == java.lang.String.class || java.lang.CharSequence.class.isAssignableFrom(rawParameterType));
    }

    public WK<AnnotatedMethod, JsonCreator.Mode> AEQbTJ(AnnotatedMethod annotatedMethod) {
        java.lang.Class<?> rawParameterType;
        if (!DbNXlk().isAssignableFrom(annotatedMethod.getRawReturnType())) {
            return null;
        }
        JsonCreator.Mode modeFindCreatorAnnotation = this.AEQbTJ.findCreatorAnnotation(this.KWHzl, annotatedMethod);
        if (modeFindCreatorAnnotation != null) {
            if (modeFindCreatorAnnotation == JsonCreator.Mode.DISABLED) {
                return null;
            }
            return WK.KWHzl(annotatedMethod, modeFindCreatorAnnotation);
        }
        java.lang.String name = annotatedMethod.getName();
        if ("valueOf".equals(name) && annotatedMethod.getParameterCount() == 1) {
            return WK.KWHzl(annotatedMethod, modeFindCreatorAnnotation);
        }
        if ("fromString".equals(name) && annotatedMethod.getParameterCount() == 1 && ((rawParameterType = annotatedMethod.getRawParameterType(0)) == java.lang.String.class || java.lang.CharSequence.class.isAssignableFrom(rawParameterType))) {
            return WK.KWHzl(annotatedMethod, modeFindCreatorAnnotation);
        }
        return null;
    }

    @Override // o.AbstractC5549Vz
    public java.lang.Class<?> values() {
        AnnotationIntrospector annotationIntrospector = this.AEQbTJ;
        if (annotationIntrospector == null) {
            return null;
        }
        return annotationIntrospector.findPOJOBuilder(this.OLrzqt);
    }

    @Override // o.AbstractC5549Vz
    public VO.StateListAnimator AkhnZx() {
        AnnotationIntrospector annotationIntrospector = this.AEQbTJ;
        if (annotationIntrospector == null) {
            return null;
        }
        return annotationIntrospector.findPOJOBuilderConfig(this.OLrzqt);
    }

    @Override // o.AbstractC5549Vz
    public InterfaceC5621Yt<java.lang.Object, java.lang.Object> AhwBna() {
        AnnotationIntrospector annotationIntrospector = this.AEQbTJ;
        if (annotationIntrospector == null) {
            return null;
        }
        return AEQbTJ(annotationIntrospector.findDeserializationConverter(this.OLrzqt));
    }

    public InterfaceC5621Yt<java.lang.Object, java.lang.Object> AEQbTJ(java.lang.Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof InterfaceC5621Yt) {
            return (InterfaceC5621Yt) obj;
        }
        if (!(obj instanceof java.lang.Class)) {
            throw new java.lang.IllegalStateException("AnnotationIntrospector returned Converter definition of type " + obj.getClass().getName() + "; expected type Converter or Class<Converter> instead");
        }
        java.lang.Class<?> cls = (java.lang.Class) obj;
        if (cls == InterfaceC5621Yt.StateListAnimator.class || C5619Yr.fetchVPNInfo(cls)) {
            return null;
        }
        if (!InterfaceC5621Yt.class.isAssignableFrom(cls)) {
            throw new java.lang.IllegalStateException("AnnotationIntrospector returned Class " + cls.getName() + "; expected Class<Converter>");
        }
        VQ handlerInstantiator = this.KWHzl.getHandlerInstantiator();
        InterfaceC5621Yt<?, ?> interfaceC5621YtCopydefault = handlerInstantiator != null ? handlerInstantiator.copydefault(this.KWHzl, this.OLrzqt, cls) : null;
        return interfaceC5621YtCopydefault == null ? (InterfaceC5621Yt) C5619Yr.EZpvd(cls, this.KWHzl.canOverrideAccessModifiers()) : interfaceC5621YtCopydefault;
    }
}
