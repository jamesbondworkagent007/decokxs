package o;

import com.fasterxml.jackson.annotation.JacksonInject;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.AccessorNamingStrategy;
import com.fasterxml.jackson.databind.introspect.AnnotatedConstructor;
import com.fasterxml.jackson.databind.introspect.AnnotatedField;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import com.fasterxml.jackson.databind.introspect.DefaultAccessorNamingStrategy;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker;
import java.lang.reflect.Modifier;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: renamed from: o.Xb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C5577Xb {
    public LinkedList<AnnotatedMember> AEQbTJ;
    public LinkedList<WZ> AYXKKw;
    public LinkedList<AnnotatedMethod> AhwBna;
    public java.util.HashSet<java.lang.String> AkhnZx;

    @java.lang.Deprecated
    public final boolean AuCTel;
    public LinkedHashMap<java.lang.Object, AnnotatedMember> DbNXlk;
    public LinkedList<AnnotatedMember> EZpvd;
    public final AnnotationIntrospector KWHzl;
    public final AccessorNamingStrategy OLrzqt;
    public LinkedList<AnnotatedMember> copydefault;
    public final WJ djBIcL;
    public LinkedHashMap<java.lang.String, WZ> ejfBZ;
    public final JavaType fARcdN;
    public LinkedList<AnnotatedMember> fIwbmz;

    @java.lang.Deprecated
    public java.lang.String fJNWhG;
    public java.util.Map<PropertyName, PropertyName> fetchVPNInfo;
    public final MapperConfig<?> gEmmrt;
    public final boolean isConnected;
    public final VisibilityChecker<?> iwGUEr;
    public final boolean uzCIH;
    public boolean valueOf;
    public LinkedList<AnnotatedMember> values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public MapperConfig<?> AhwBna() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public WJ djBIcL() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public JavaType fIwbmz() {
        return this.fARcdN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.util.Set<java.lang.String> valueOf() {
        return this.AkhnZx;
    }

    public C5577Xb(MapperConfig<?> mapperConfig, boolean z, JavaType javaType, WJ wj, AccessorNamingStrategy accessorNamingStrategy) {
        this.fJNWhG = "set";
        this.gEmmrt = mapperConfig;
        this.isConnected = z;
        this.fARcdN = javaType;
        this.djBIcL = wj;
        if (mapperConfig.isAnnotationProcessingEnabled()) {
            this.uzCIH = true;
            this.KWHzl = mapperConfig.getAnnotationIntrospector();
        } else {
            this.uzCIH = false;
            this.KWHzl = AnnotationIntrospector.nopInstance();
        }
        this.iwGUEr = mapperConfig.getDefaultVisibilityChecker(javaType.getRawClass(), wj);
        this.OLrzqt = accessorNamingStrategy;
        this.AuCTel = mapperConfig.isEnabled(MapperFeature.USE_STD_BEAN_NAMING);
    }

    @java.lang.Deprecated
    public C5577Xb(MapperConfig<?> mapperConfig, boolean z, JavaType javaType, WJ wj, java.lang.String str) {
        this(mapperConfig, z, javaType, wj, copydefault(mapperConfig, wj, str));
        this.fJNWhG = str;
    }

    public static AccessorNamingStrategy copydefault(MapperConfig<?> mapperConfig, WJ wj, java.lang.String str) {
        if (str == null) {
            str = "set";
        }
        return new DefaultAccessorNamingStrategy.Provider().withSetterPrefix(str).forPOJO(mapperConfig, wj);
    }

    public java.util.List<WT> values() {
        return new java.util.ArrayList(fARcdN().values());
    }

    public java.util.Map<java.lang.Object, AnnotatedMember> AYXKKw() {
        if (!this.valueOf) {
            OLrzqt();
        }
        return this.DbNXlk;
    }

    public AnnotatedMember fetchVPNInfo() {
        if (!this.valueOf) {
            OLrzqt();
        }
        LinkedList<AnnotatedMember> linkedList = this.values;
        if (linkedList == null) {
            return null;
        }
        if (linkedList.size() > 1 && !OLrzqt(this.values)) {
            OLrzqt("Multiple 'as-key' properties defined (%s vs %s)", this.values.get(0), this.values.get(1));
        }
        return this.values.get(0);
    }

    public AnnotatedMember DbNXlk() {
        if (!this.valueOf) {
            OLrzqt();
        }
        LinkedList<AnnotatedMember> linkedList = this.fIwbmz;
        if (linkedList == null) {
            return null;
        }
        if (linkedList.size() > 1 && !OLrzqt(this.fIwbmz)) {
            OLrzqt("Multiple 'as-value' properties defined (%s vs %s)", this.fIwbmz.get(0), this.fIwbmz.get(1));
        }
        return this.fIwbmz.get(0);
    }

    public AnnotatedMember KWHzl() {
        if (!this.valueOf) {
            OLrzqt();
        }
        LinkedList<AnnotatedMember> linkedList = this.copydefault;
        if (linkedList == null) {
            return null;
        }
        if (linkedList.size() > 1) {
            OLrzqt("Multiple 'any-getter' fields defined (%s vs %s)", this.copydefault.get(0), this.copydefault.get(1));
        }
        return this.copydefault.getFirst();
    }

    public AnnotatedMember EZpvd() {
        if (!this.valueOf) {
            OLrzqt();
        }
        LinkedList<AnnotatedMember> linkedList = this.EZpvd;
        if (linkedList == null) {
            return null;
        }
        if (linkedList.size() > 1) {
            OLrzqt("Multiple 'any-getter' methods defined (%s vs %s)", this.EZpvd.get(0), this.EZpvd.get(1));
        }
        return this.EZpvd.getFirst();
    }

    public AnnotatedMember AEQbTJ() {
        if (!this.valueOf) {
            OLrzqt();
        }
        LinkedList<AnnotatedMember> linkedList = this.AEQbTJ;
        if (linkedList == null) {
            return null;
        }
        if (linkedList.size() > 1) {
            OLrzqt("Multiple 'any-setter' fields defined (%s vs %s)", this.AEQbTJ.get(0), this.AEQbTJ.get(1));
        }
        return this.AEQbTJ.getFirst();
    }

    public AnnotatedMethod gEmmrt() {
        if (!this.valueOf) {
            OLrzqt();
        }
        LinkedList<AnnotatedMethod> linkedList = this.AhwBna;
        if (linkedList == null) {
            return null;
        }
        if (linkedList.size() > 1) {
            OLrzqt("Multiple 'any-setter' methods defined (%s vs %s)", this.AhwBna.get(0), this.AhwBna.get(1));
        }
        return this.AhwBna.getFirst();
    }

    public C5576Xa isConnected() {
        C5576Xa c5576XaFindObjectIdInfo = this.KWHzl.findObjectIdInfo(this.djBIcL);
        return c5576XaFindObjectIdInfo != null ? this.KWHzl.findObjectReferenceInfo(this.djBIcL, c5576XaFindObjectIdInfo) : c5576XaFindObjectIdInfo;
    }

    public java.util.Map<java.lang.String, WZ> fARcdN() {
        if (!this.valueOf) {
            OLrzqt();
        }
        return this.ejfBZ;
    }

    @java.lang.Deprecated
    public AnnotatedMethod AkhnZx() {
        AnnotatedMember annotatedMemberDbNXlk = DbNXlk();
        if (annotatedMemberDbNXlk instanceof AnnotatedMethod) {
            return (AnnotatedMethod) annotatedMemberDbNXlk;
        }
        return null;
    }

    public void OLrzqt() {
        LinkedHashMap<java.lang.String, WZ> linkedHashMap = new LinkedHashMap<>();
        AEQbTJ(linkedHashMap);
        KWHzl(linkedHashMap);
        if (!this.djBIcL.fetchVPNInfo()) {
            OLrzqt(linkedHashMap);
        }
        djBIcL(linkedHashMap);
        copydefault(linkedHashMap);
        valueOf(linkedHashMap);
        EZpvd(linkedHashMap);
        java.util.Iterator<WZ> it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            it.next().OLrzqt(this.isConnected);
        }
        PropertyNamingStrategy propertyNamingStrategyCopydefault = copydefault();
        if (propertyNamingStrategyCopydefault != null) {
            OLrzqt(linkedHashMap, propertyNamingStrategyCopydefault);
        }
        java.util.Iterator<WZ> it2 = linkedHashMap.values().iterator();
        while (it2.hasNext()) {
            it2.next().RJOkX();
        }
        if (this.gEmmrt.isEnabled(MapperFeature.USE_WRAPPER_NAME_AS_PROPERTY_NAME)) {
            AYXKKw(linkedHashMap);
        }
        AhwBna(linkedHashMap);
        this.ejfBZ = linkedHashMap;
        this.valueOf = true;
    }

    public void AEQbTJ(java.util.Map<java.lang.String, WZ> map) {
        PropertyName propertyNameFindNameForDeserialization;
        PropertyName propertyNameAEQbTJ;
        boolean z;
        boolean z2;
        boolean z3;
        AnnotationIntrospector annotationIntrospector = this.KWHzl;
        boolean z4 = (this.isConnected || this.gEmmrt.isEnabled(MapperFeature.ALLOW_FINAL_FIELDS_AS_MUTATORS)) ? false : true;
        boolean zIsEnabled = this.gEmmrt.isEnabled(MapperFeature.PROPAGATE_TRANSIENT_MARKER);
        for (AnnotatedField annotatedField : this.djBIcL.copydefault()) {
            java.lang.Boolean bool = java.lang.Boolean.TRUE;
            if (bool.equals(annotationIntrospector.hasAsKey(this.gEmmrt, annotatedField))) {
                if (this.values == null) {
                    this.values = new LinkedList<>();
                }
                this.values.add(annotatedField);
            }
            if (bool.equals(annotationIntrospector.hasAsValue(annotatedField))) {
                if (this.fIwbmz == null) {
                    this.fIwbmz = new LinkedList<>();
                }
                this.fIwbmz.add(annotatedField);
            } else {
                boolean zEquals = bool.equals(annotationIntrospector.hasAnyGetter(annotatedField));
                boolean zEquals2 = bool.equals(annotationIntrospector.hasAnySetter(annotatedField));
                if (zEquals || zEquals2) {
                    if (zEquals) {
                        if (this.copydefault == null) {
                            this.copydefault = new LinkedList<>();
                        }
                        this.copydefault.add(annotatedField);
                    }
                    if (zEquals2) {
                        if (this.AEQbTJ == null) {
                            this.AEQbTJ = new LinkedList<>();
                        }
                        this.AEQbTJ.add(annotatedField);
                    }
                } else {
                    java.lang.String strFindImplicitPropertyName = annotationIntrospector.findImplicitPropertyName(annotatedField);
                    if (strFindImplicitPropertyName == null) {
                        strFindImplicitPropertyName = annotatedField.getName();
                    }
                    java.lang.String strModifyFieldName = this.OLrzqt.modifyFieldName(annotatedField, strFindImplicitPropertyName);
                    if (strModifyFieldName != null) {
                        PropertyName propertyNameAEQbTJ2 = AEQbTJ(strModifyFieldName);
                        PropertyName propertyNameFindRenameByField = annotationIntrospector.findRenameByField(this.gEmmrt, annotatedField, propertyNameAEQbTJ2);
                        if (propertyNameFindRenameByField != null && !propertyNameFindRenameByField.equals(propertyNameAEQbTJ2)) {
                            if (this.fetchVPNInfo == null) {
                                this.fetchVPNInfo = new java.util.HashMap();
                            }
                            this.fetchVPNInfo.put(propertyNameFindRenameByField, propertyNameAEQbTJ2);
                        }
                        if (this.isConnected) {
                            propertyNameFindNameForDeserialization = annotationIntrospector.findNameForSerialization(annotatedField);
                        } else {
                            propertyNameFindNameForDeserialization = annotationIntrospector.findNameForDeserialization(annotatedField);
                        }
                        boolean z5 = propertyNameFindNameForDeserialization != null;
                        if (z5 && propertyNameFindNameForDeserialization.isEmpty()) {
                            z = false;
                            propertyNameAEQbTJ = AEQbTJ(strModifyFieldName);
                        } else {
                            propertyNameAEQbTJ = propertyNameFindNameForDeserialization;
                            z = z5;
                        }
                        boolean zIsFieldVisible = propertyNameAEQbTJ != null;
                        if (!zIsFieldVisible) {
                            zIsFieldVisible = this.iwGUEr.isFieldVisible(annotatedField);
                        }
                        boolean zHasIgnoreMarker = annotationIntrospector.hasIgnoreMarker(annotatedField);
                        if (!annotatedField.isTransient() || z5) {
                            z2 = zHasIgnoreMarker;
                            z3 = zIsFieldVisible;
                        } else {
                            if (zIsEnabled) {
                                zHasIgnoreMarker = true;
                            }
                            z2 = zHasIgnoreMarker;
                            z3 = false;
                        }
                        if (!z4 || propertyNameAEQbTJ != null || z2 || !Modifier.isFinal(annotatedField.getModifiers())) {
                            copydefault(map, strModifyFieldName).EZpvd(annotatedField, propertyNameAEQbTJ, z, z3, z2);
                        }
                    }
                }
            }
        }
    }

    public void OLrzqt(java.util.Map<java.lang.String, WZ> map) {
        if (this.uzCIH) {
            java.util.Iterator<AnnotatedConstructor> it = this.djBIcL.AYXKKw().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                AnnotatedConstructor next = it.next();
                if (this.AYXKKw == null) {
                    this.AYXKKw = new LinkedList<>();
                }
                int parameterCount = next.getParameterCount();
                for (int i = 0; i < parameterCount; i++) {
                    EZpvd(map, next.getParameter(i));
                }
            }
            for (AnnotatedMethod annotatedMethod : this.djBIcL.gEmmrt()) {
                if (this.AYXKKw == null) {
                    this.AYXKKw = new LinkedList<>();
                }
                int parameterCount2 = annotatedMethod.getParameterCount();
                for (int i2 = 0; i2 < parameterCount2; i2++) {
                    EZpvd(map, annotatedMethod.getParameter(i2));
                }
            }
        }
    }

    public void EZpvd(java.util.Map<java.lang.String, WZ> map, AnnotatedParameter annotatedParameter) {
        JsonCreator.Mode modeFindCreatorAnnotation;
        java.lang.String strFindImplicitPropertyName = this.KWHzl.findImplicitPropertyName(annotatedParameter);
        if (strFindImplicitPropertyName == null) {
            strFindImplicitPropertyName = "";
        }
        PropertyName propertyNameFindNameForDeserialization = this.KWHzl.findNameForDeserialization(annotatedParameter);
        boolean z = (propertyNameFindNameForDeserialization == null || propertyNameFindNameForDeserialization.isEmpty()) ? false : true;
        if (!z) {
            if (strFindImplicitPropertyName.isEmpty() || (modeFindCreatorAnnotation = this.KWHzl.findCreatorAnnotation(this.gEmmrt, annotatedParameter.getOwner())) == null || modeFindCreatorAnnotation == JsonCreator.Mode.DISABLED) {
                return;
            } else {
                propertyNameFindNameForDeserialization = PropertyName.construct(strFindImplicitPropertyName);
            }
        }
        PropertyName propertyName = propertyNameFindNameForDeserialization;
        java.lang.String strCopydefault = copydefault(strFindImplicitPropertyName);
        WZ wzAEQbTJ = (z && strCopydefault.isEmpty()) ? AEQbTJ(map, propertyName) : copydefault(map, strCopydefault);
        wzAEQbTJ.copydefault(annotatedParameter, propertyName, z, true, false);
        this.AYXKKw.add(wzAEQbTJ);
    }

    public void KWHzl(java.util.Map<java.lang.String, WZ> map) {
        for (AnnotatedMethod annotatedMethod : this.djBIcL.DbNXlk()) {
            int parameterCount = annotatedMethod.getParameterCount();
            if (parameterCount == 0) {
                copydefault(map, annotatedMethod, this.KWHzl);
            } else if (parameterCount == 1) {
                KWHzl(map, annotatedMethod, this.KWHzl);
            } else if (parameterCount == 2 && java.lang.Boolean.TRUE.equals(this.KWHzl.hasAnySetter(annotatedMethod))) {
                if (this.AhwBna == null) {
                    this.AhwBna = new LinkedList<>();
                }
                this.AhwBna.add(annotatedMethod);
            }
        }
    }

    public void copydefault(java.util.Map<java.lang.String, WZ> map, AnnotatedMethod annotatedMethod, AnnotationIntrospector annotationIntrospector) {
        PropertyName propertyName;
        boolean z;
        boolean z2;
        java.lang.String strFindImplicitPropertyName;
        boolean zIsGetterVisible;
        java.lang.Class<?> rawReturnType = annotatedMethod.getRawReturnType();
        if (rawReturnType != java.lang.Void.TYPE) {
            if (rawReturnType != java.lang.Void.class || this.gEmmrt.isEnabled(MapperFeature.ALLOW_VOID_VALUED_PROPERTIES)) {
                java.lang.Boolean bool = java.lang.Boolean.TRUE;
                if (bool.equals(annotationIntrospector.hasAnyGetter(annotatedMethod))) {
                    if (this.EZpvd == null) {
                        this.EZpvd = new LinkedList<>();
                    }
                    this.EZpvd.add(annotatedMethod);
                    return;
                }
                if (bool.equals(annotationIntrospector.hasAsKey(this.gEmmrt, annotatedMethod))) {
                    if (this.values == null) {
                        this.values = new LinkedList<>();
                    }
                    this.values.add(annotatedMethod);
                    return;
                }
                if (bool.equals(annotationIntrospector.hasAsValue(annotatedMethod))) {
                    if (this.fIwbmz == null) {
                        this.fIwbmz = new LinkedList<>();
                    }
                    this.fIwbmz.add(annotatedMethod);
                    return;
                }
                PropertyName propertyNameFindNameForSerialization = annotationIntrospector.findNameForSerialization(annotatedMethod);
                boolean z3 = false;
                boolean z4 = propertyNameFindNameForSerialization != null;
                if (!z4) {
                    strFindImplicitPropertyName = annotationIntrospector.findImplicitPropertyName(annotatedMethod);
                    if (strFindImplicitPropertyName == null) {
                        strFindImplicitPropertyName = this.OLrzqt.findNameForRegularGetter(annotatedMethod, annotatedMethod.getName());
                    }
                    if (strFindImplicitPropertyName == null) {
                        strFindImplicitPropertyName = this.OLrzqt.findNameForIsGetter(annotatedMethod, annotatedMethod.getName());
                        if (strFindImplicitPropertyName == null) {
                            return;
                        } else {
                            zIsGetterVisible = this.iwGUEr.isIsGetterVisible(annotatedMethod);
                        }
                    } else {
                        zIsGetterVisible = this.iwGUEr.isGetterVisible(annotatedMethod);
                    }
                    propertyName = propertyNameFindNameForSerialization;
                    z = zIsGetterVisible;
                    z2 = z4;
                } else {
                    java.lang.String strFindImplicitPropertyName2 = annotationIntrospector.findImplicitPropertyName(annotatedMethod);
                    if (strFindImplicitPropertyName2 == null && (strFindImplicitPropertyName2 = this.OLrzqt.findNameForRegularGetter(annotatedMethod, annotatedMethod.getName())) == null) {
                        strFindImplicitPropertyName2 = this.OLrzqt.findNameForIsGetter(annotatedMethod, annotatedMethod.getName());
                    }
                    if (strFindImplicitPropertyName2 == null) {
                        strFindImplicitPropertyName2 = annotatedMethod.getName();
                    }
                    if (propertyNameFindNameForSerialization.isEmpty()) {
                        propertyNameFindNameForSerialization = AEQbTJ(strFindImplicitPropertyName2);
                    } else {
                        z3 = z4;
                    }
                    propertyName = propertyNameFindNameForSerialization;
                    z = true;
                    z2 = z3;
                    strFindImplicitPropertyName = strFindImplicitPropertyName2;
                }
                copydefault(map, copydefault(strFindImplicitPropertyName)).EZpvd(annotatedMethod, propertyName, z2, z, annotationIntrospector.hasIgnoreMarker(annotatedMethod));
            }
        }
    }

    public void KWHzl(java.util.Map<java.lang.String, WZ> map, AnnotatedMethod annotatedMethod, AnnotationIntrospector annotationIntrospector) {
        PropertyName propertyName;
        boolean zIsSetterVisible;
        boolean z;
        java.lang.String strFindImplicitPropertyName;
        PropertyName propertyNameFindNameForDeserialization = annotationIntrospector.findNameForDeserialization(annotatedMethod);
        boolean z2 = false;
        boolean z3 = propertyNameFindNameForDeserialization != null;
        if (!z3) {
            strFindImplicitPropertyName = annotationIntrospector.findImplicitPropertyName(annotatedMethod);
            if (strFindImplicitPropertyName == null) {
                strFindImplicitPropertyName = this.OLrzqt.findNameForMutator(annotatedMethod, annotatedMethod.getName());
            }
            if (strFindImplicitPropertyName == null) {
                return;
            }
            propertyName = propertyNameFindNameForDeserialization;
            zIsSetterVisible = this.iwGUEr.isSetterVisible(annotatedMethod);
            z = z3;
        } else {
            java.lang.String strFindImplicitPropertyName2 = annotationIntrospector.findImplicitPropertyName(annotatedMethod);
            if (strFindImplicitPropertyName2 == null) {
                strFindImplicitPropertyName2 = this.OLrzqt.findNameForMutator(annotatedMethod, annotatedMethod.getName());
            }
            if (strFindImplicitPropertyName2 == null) {
                strFindImplicitPropertyName2 = annotatedMethod.getName();
            }
            if (propertyNameFindNameForDeserialization.isEmpty()) {
                propertyNameFindNameForDeserialization = AEQbTJ(strFindImplicitPropertyName2);
            } else {
                z2 = z3;
            }
            propertyName = propertyNameFindNameForDeserialization;
            zIsSetterVisible = true;
            z = z2;
            strFindImplicitPropertyName = strFindImplicitPropertyName2;
        }
        copydefault(map, copydefault(strFindImplicitPropertyName)).OLrzqt(annotatedMethod, propertyName, z, zIsSetterVisible, annotationIntrospector.hasIgnoreMarker(annotatedMethod));
    }

    public void EZpvd(java.util.Map<java.lang.String, WZ> map) {
        for (AnnotatedMember annotatedMember : this.djBIcL.copydefault()) {
            EZpvd(this.KWHzl.findInjectableValue(annotatedMember), annotatedMember);
        }
        for (AnnotatedMethod annotatedMethod : this.djBIcL.DbNXlk()) {
            if (annotatedMethod.getParameterCount() == 1) {
                EZpvd(this.KWHzl.findInjectableValue(annotatedMethod), annotatedMethod);
            }
        }
    }

    public void EZpvd(JacksonInject.Value value, AnnotatedMember annotatedMember) {
        if (value == null) {
            return;
        }
        java.lang.Object id = value.getId();
        if (this.DbNXlk == null) {
            this.DbNXlk = new LinkedHashMap<>();
        }
        AnnotatedMember annotatedMemberPut = this.DbNXlk.put(id, annotatedMember);
        if (annotatedMemberPut == null || annotatedMemberPut.getClass() != annotatedMember.getClass()) {
            return;
        }
        throw new java.lang.IllegalArgumentException("Duplicate injectable value with id '" + id + "' (of type " + id.getClass().getName() + ")");
    }

    public final PropertyName AEQbTJ(java.lang.String str) {
        return PropertyName.construct(str, null);
    }

    public final java.lang.String copydefault(java.lang.String str) {
        PropertyName propertyName;
        java.util.Map<PropertyName, PropertyName> map = this.fetchVPNInfo;
        return (map == null || (propertyName = map.get(AEQbTJ(str))) == null) ? str : propertyName.getSimpleName();
    }

    public void djBIcL(java.util.Map<java.lang.String, WZ> map) {
        java.util.Iterator<WZ> it = map.values().iterator();
        while (it.hasNext()) {
            WZ next = it.next();
            if (!next.zLjUOn()) {
                it.remove();
            } else if (next.AubY()) {
                if (!next.zsXlph()) {
                    it.remove();
                    OLrzqt(next.getName());
                } else {
                    next.DTwDnp();
                    if (!next.OLrzqt()) {
                        OLrzqt(next.getName());
                    }
                }
            }
        }
    }

    public void copydefault(java.util.Map<java.lang.String, WZ> map) {
        boolean zIsEnabled = this.gEmmrt.isEnabled(MapperFeature.INFER_PROPERTY_MUTATORS);
        java.util.Iterator<WZ> it = map.values().iterator();
        while (it.hasNext()) {
            it.next().OLrzqt(zIsEnabled, this.isConnected ? null : this);
        }
    }

    public void OLrzqt(java.lang.String str) {
        if (this.isConnected || str == null) {
            return;
        }
        if (this.AkhnZx == null) {
            this.AkhnZx = new java.util.HashSet<>();
        }
        this.AkhnZx.add(str);
    }

    public void valueOf(java.util.Map<java.lang.String, WZ> map) {
        java.util.HashSet<java.lang.String> hashSet;
        java.util.Iterator<Map.Entry<java.lang.String, WZ>> it = map.entrySet().iterator();
        LinkedList<WZ> linkedList = null;
        while (it.hasNext()) {
            WZ value = it.next().getValue();
            java.util.Set<PropertyName> setSSMYrx = value.sSMYrx();
            if (!setSSMYrx.isEmpty()) {
                it.remove();
                if (linkedList == null) {
                    linkedList = new LinkedList();
                }
                if (setSSMYrx.size() == 1) {
                    linkedList.add(value.EZpvd(setSSMYrx.iterator().next()));
                } else {
                    linkedList.addAll(value.OLrzqt(setSSMYrx));
                }
            }
        }
        if (linkedList != null) {
            for (WZ wz : linkedList) {
                java.lang.String name = wz.getName();
                WZ wz2 = map.get(name);
                if (wz2 == null) {
                    map.put(name, wz);
                } else {
                    wz2.copydefault(wz);
                }
                if (copydefault(wz, this.AYXKKw) && (hashSet = this.AkhnZx) != null) {
                    hashSet.remove(name);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void OLrzqt(java.util.Map<java.lang.String, WZ> map, PropertyNamingStrategy propertyNamingStrategy) {
        java.lang.String strNameForGetterMethod;
        WZ[] wzArr = (WZ[]) map.values().toArray(new WZ[map.size()]);
        map.clear();
        for (WZ wzEZpvd : wzArr) {
            PropertyName propertyNameIsConnected = wzEZpvd.isConnected();
            if (!wzEZpvd.wlaJM() || this.gEmmrt.isEnabled(MapperFeature.ALLOW_EXPLICIT_PROPERTY_RENAMING)) {
                if (this.isConnected) {
                    if (wzEZpvd.QOLQEE()) {
                        strNameForGetterMethod = propertyNamingStrategy.nameForGetterMethod(this.gEmmrt, wzEZpvd.fetchVPNInfo(), propertyNameIsConnected.getSimpleName());
                    } else {
                        strNameForGetterMethod = wzEZpvd.hDKMBd() ? propertyNamingStrategy.nameForField(this.gEmmrt, wzEZpvd.values(), propertyNameIsConnected.getSimpleName()) : null;
                    }
                } else if (wzEZpvd.iwGUEr()) {
                    strNameForGetterMethod = propertyNamingStrategy.nameForSetterMethod(this.gEmmrt, wzEZpvd.QKVWgx(), propertyNameIsConnected.getSimpleName());
                } else if (wzEZpvd.uzCIH()) {
                    strNameForGetterMethod = propertyNamingStrategy.nameForConstructorParameter(this.gEmmrt, wzEZpvd.valueOf(), propertyNameIsConnected.getSimpleName());
                } else if (wzEZpvd.hDKMBd()) {
                    strNameForGetterMethod = propertyNamingStrategy.nameForField(this.gEmmrt, wzEZpvd.AwvSrB(), propertyNameIsConnected.getSimpleName());
                } else if (wzEZpvd.QOLQEE()) {
                    strNameForGetterMethod = propertyNamingStrategy.nameForGetterMethod(this.gEmmrt, wzEZpvd.gHZMYf(), propertyNameIsConnected.getSimpleName());
                }
            }
            if (strNameForGetterMethod != null && !propertyNameIsConnected.hasSimpleName(strNameForGetterMethod)) {
                wzEZpvd = wzEZpvd.EZpvd(strNameForGetterMethod);
            } else {
                strNameForGetterMethod = propertyNameIsConnected.getSimpleName();
            }
            WZ wz = map.get(strNameForGetterMethod);
            if (wz == null) {
                map.put(strNameForGetterMethod, wzEZpvd);
            } else {
                wz.copydefault(wzEZpvd);
            }
            copydefault(wzEZpvd, this.AYXKKw);
        }
    }

    public void AYXKKw(java.util.Map<java.lang.String, WZ> map) {
        PropertyName propertyNameFindWrapperName;
        java.util.Iterator<Map.Entry<java.lang.String, WZ>> it = map.entrySet().iterator();
        LinkedList<WZ> linkedList = null;
        while (it.hasNext()) {
            WZ value = it.next().getValue();
            AnnotatedMember annotatedMemberEjfBZ = value.ejfBZ();
            if (annotatedMemberEjfBZ != null && (propertyNameFindWrapperName = this.KWHzl.findWrapperName(annotatedMemberEjfBZ)) != null && propertyNameFindWrapperName.hasSimpleName() && !propertyNameFindWrapperName.equals(value.isConnected())) {
                if (linkedList == null) {
                    linkedList = new LinkedList();
                }
                linkedList.add(value.EZpvd(propertyNameFindWrapperName));
                it.remove();
            }
        }
        if (linkedList != null) {
            for (WZ wz : linkedList) {
                java.lang.String name = wz.getName();
                WZ wz2 = map.get(name);
                if (wz2 == null) {
                    map.put(name, wz);
                } else {
                    wz2.copydefault(wz);
                }
            }
        }
    }

    public void AhwBna(java.util.Map<java.lang.String, WZ> map) {
        boolean zBooleanValue;
        java.util.Map<? extends java.lang.Object, ? extends java.lang.Object> linkedHashMap;
        java.util.Collection<WZ> collectionValues;
        AnnotationIntrospector annotationIntrospector = this.KWHzl;
        java.lang.Boolean boolFindSerializationSortAlphabetically = annotationIntrospector.findSerializationSortAlphabetically(this.djBIcL);
        if (boolFindSerializationSortAlphabetically == null) {
            zBooleanValue = this.gEmmrt.shouldSortPropertiesAlphabetically();
        } else {
            zBooleanValue = boolFindSerializationSortAlphabetically.booleanValue();
        }
        boolean zEZpvd = EZpvd(map.values());
        java.lang.String[] strArrFindSerializationPropertyOrder = annotationIntrospector.findSerializationPropertyOrder(this.djBIcL);
        if (zBooleanValue || zEZpvd || this.AYXKKw != null || strArrFindSerializationPropertyOrder != null) {
            int size = map.size();
            if (zBooleanValue) {
                linkedHashMap = new TreeMap<>();
            } else {
                linkedHashMap = new LinkedHashMap<>(size + size);
            }
            for (WZ wz : map.values()) {
                linkedHashMap.put(wz.getName(), wz);
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(size + size);
            if (strArrFindSerializationPropertyOrder != null) {
                for (java.lang.String name : strArrFindSerializationPropertyOrder) {
                    WZ wz2 = (WZ) linkedHashMap.remove(name);
                    if (wz2 == null) {
                        java.util.Iterator<WZ> it = map.values().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            WZ next = it.next();
                            if (name.equals(next.AxsJAY())) {
                                name = next.getName();
                                wz2 = next;
                                break;
                            }
                        }
                    }
                    if (wz2 != null) {
                        linkedHashMap2.put(name, wz2);
                    }
                }
            }
            if (zEZpvd) {
                TreeMap treeMap = new TreeMap();
                java.util.Iterator<Map.Entry<? extends java.lang.Object, ? extends java.lang.Object>> it2 = linkedHashMap.entrySet().iterator();
                while (it2.hasNext()) {
                    WZ wz3 = (WZ) it2.next().getValue();
                    java.lang.Integer index = wz3.DbNXlk().getIndex();
                    if (index != null) {
                        treeMap.put(index, wz3);
                        it2.remove();
                    }
                }
                for (WZ wz4 : treeMap.values()) {
                    linkedHashMap2.put(wz4.getName(), wz4);
                }
            }
            if (this.AYXKKw != null && (!zBooleanValue || this.gEmmrt.isEnabled(MapperFeature.SORT_CREATOR_PROPERTIES_FIRST))) {
                if (zBooleanValue) {
                    TreeMap treeMap2 = new TreeMap();
                    for (WZ wz5 : this.AYXKKw) {
                        treeMap2.put(wz5.getName(), wz5);
                    }
                    collectionValues = treeMap2.values();
                } else {
                    collectionValues = this.AYXKKw;
                }
                for (WZ wz6 : collectionValues) {
                    java.lang.String name2 = wz6.getName();
                    if (linkedHashMap.containsKey(name2)) {
                        linkedHashMap2.put(name2, wz6);
                    }
                }
            }
            linkedHashMap2.putAll(linkedHashMap);
            map.clear();
            map.putAll(linkedHashMap2);
        }
    }

    public final boolean EZpvd(java.util.Collection<WZ> collection) {
        java.util.Iterator<WZ> it = collection.iterator();
        while (it.hasNext()) {
            if (it.next().DbNXlk().hasIndex()) {
                return true;
            }
        }
        return false;
    }

    public boolean OLrzqt(java.util.List<AnnotatedMember> list) {
        do {
            AnnotatedMember annotatedMember = list.get(0);
            AnnotatedMember annotatedMember2 = list.get(1);
            if (annotatedMember instanceof AnnotatedField) {
                if (!(annotatedMember2 instanceof AnnotatedMethod)) {
                    return false;
                }
                list.remove(0);
            } else {
                if (!(annotatedMember instanceof AnnotatedMethod) || !(annotatedMember2 instanceof AnnotatedField)) {
                    return false;
                }
                list.remove(1);
            }
        } while (list.size() > 1);
        return true;
    }

    public void OLrzqt(java.lang.String str, java.lang.Object... objArr) {
        if (objArr.length > 0) {
            str = java.lang.String.format(str, objArr);
        }
        throw new java.lang.IllegalArgumentException("Problem with definition of " + this.djBIcL + ": " + str);
    }

    public WZ AEQbTJ(java.util.Map<java.lang.String, WZ> map, PropertyName propertyName) {
        java.lang.String simpleName = propertyName.getSimpleName();
        WZ wz = map.get(simpleName);
        if (wz != null) {
            return wz;
        }
        WZ wz2 = new WZ(this.gEmmrt, this.KWHzl, this.isConnected, propertyName);
        map.put(simpleName, wz2);
        return wz2;
    }

    public WZ copydefault(java.util.Map<java.lang.String, WZ> map, java.lang.String str) {
        WZ wz = map.get(str);
        if (wz != null) {
            return wz;
        }
        WZ wz2 = new WZ(this.gEmmrt, this.KWHzl, this.isConnected, PropertyName.construct(str));
        map.put(str, wz2);
        return wz2;
    }

    public final PropertyNamingStrategy copydefault() {
        PropertyNamingStrategy propertyNamingStrategyKWHzl;
        java.lang.Object objFindNamingStrategy = this.KWHzl.findNamingStrategy(this.djBIcL);
        if (objFindNamingStrategy == null) {
            return this.gEmmrt.getPropertyNamingStrategy();
        }
        if (objFindNamingStrategy instanceof PropertyNamingStrategy) {
            return (PropertyNamingStrategy) objFindNamingStrategy;
        }
        if (!(objFindNamingStrategy instanceof java.lang.Class)) {
            throw new java.lang.IllegalStateException("AnnotationIntrospector returned PropertyNamingStrategy definition of type " + objFindNamingStrategy.getClass().getName() + "; expected type PropertyNamingStrategy or Class<PropertyNamingStrategy> instead");
        }
        java.lang.Class<?> cls = (java.lang.Class) objFindNamingStrategy;
        if (cls == PropertyNamingStrategy.class) {
            return null;
        }
        if (!PropertyNamingStrategy.class.isAssignableFrom(cls)) {
            throw new java.lang.IllegalStateException("AnnotationIntrospector returned Class " + cls.getName() + "; expected Class<PropertyNamingStrategy>");
        }
        VQ handlerInstantiator = this.gEmmrt.getHandlerInstantiator();
        return (handlerInstantiator == null || (propertyNamingStrategyKWHzl = handlerInstantiator.KWHzl(this.gEmmrt, this.djBIcL, cls)) == null) ? (PropertyNamingStrategy) C5619Yr.EZpvd(cls, this.gEmmrt.canOverrideAccessModifiers()) : propertyNamingStrategyKWHzl;
    }

    public boolean copydefault(WZ wz, java.util.List<WZ> list) {
        if (list != null) {
            java.lang.String strAxsJAY = wz.AxsJAY();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (list.get(i).AxsJAY().equals(strAxsJAY)) {
                    list.set(i, wz);
                    return true;
                }
            }
        }
        return false;
    }
}
