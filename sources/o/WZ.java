package o;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.AnnotatedConstructor;
import com.fasterxml.jackson.databind.introspect.AnnotatedField;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.util.Collections;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

/* JADX INFO: loaded from: classes21.dex */
public class WZ extends WT implements java.lang.Comparable<WZ> {
    public static final AnnotationIntrospector.ReferenceProperty KWHzl = AnnotationIntrospector.ReferenceProperty.KWHzl("");
    public final MapperConfig<?> AEQbTJ;
    public ActionBar<AnnotatedField> AYXKKw;
    public ActionBar<AnnotatedMethod> AhwBna;
    public final PropertyName AkhnZx;
    public ActionBar<AnnotatedMethod> DbNXlk;
    public ActionBar<AnnotatedParameter> OLrzqt;
    public final AnnotationIntrospector copydefault;
    public final boolean djBIcL;
    public final PropertyName gEmmrt;
    public transient AnnotationIntrospector.ReferenceProperty isConnected;
    public transient PropertyMetadata valueOf;

    public interface Activity<T> {
        T EZpvd(AnnotatedMember annotatedMember);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.WT
    public boolean OLrzqt() {
        return (this.OLrzqt == null && this.DbNXlk == null && this.AYXKKw == null) ? false : true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void OcIXYQ() {
        this.OLrzqt = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean QOLQEE() {
        return this.AhwBna != null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.WT
    public boolean copydefault() {
        return (this.AhwBna == null && this.AYXKKw == null) ? false : true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.WT
    public boolean hDKMBd() {
        return this.AYXKKw != null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.WT
    public PropertyName isConnected() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.WT
    public boolean iwGUEr() {
        return this.DbNXlk != null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.WT
    public boolean uzCIH() {
        return this.OLrzqt != null;
    }

    public WZ(MapperConfig<?> mapperConfig, AnnotationIntrospector annotationIntrospector, boolean z, PropertyName propertyName) {
        this(mapperConfig, annotationIntrospector, z, propertyName, propertyName);
    }

    public WZ(MapperConfig<?> mapperConfig, AnnotationIntrospector annotationIntrospector, boolean z, PropertyName propertyName, PropertyName propertyName2) {
        this.AEQbTJ = mapperConfig;
        this.copydefault = annotationIntrospector;
        this.gEmmrt = propertyName;
        this.AkhnZx = propertyName2;
        this.djBIcL = z;
    }

    public WZ(WZ wz, PropertyName propertyName) {
        this.AEQbTJ = wz.AEQbTJ;
        this.copydefault = wz.copydefault;
        this.gEmmrt = wz.gEmmrt;
        this.AkhnZx = propertyName;
        this.AYXKKw = wz.AYXKKw;
        this.OLrzqt = wz.OLrzqt;
        this.AhwBna = wz.AhwBna;
        this.DbNXlk = wz.DbNXlk;
        this.djBIcL = wz.djBIcL;
    }

    public WZ EZpvd(PropertyName propertyName) {
        return new WZ(this, propertyName);
    }

    public WZ EZpvd(java.lang.String str) {
        PropertyName propertyNameWithSimpleName = this.AkhnZx.withSimpleName(str);
        return propertyNameWithSimpleName == this.AkhnZx ? this : new WZ(this, propertyNameWithSimpleName);
    }

    /* JADX DEBUG: Method merged with bridge method: compareTo(Ljava/lang/Object;)I */
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public int compareTo(WZ wz) {
        if (this.OLrzqt != null) {
            if (wz.OLrzqt == null) {
                return -1;
            }
        } else if (wz.OLrzqt != null) {
            return 1;
        }
        return getName().compareTo(wz.getName());
    }

    @Override // o.WT, o.InterfaceC5623Yw
    public java.lang.String getName() {
        PropertyName propertyName = this.AkhnZx;
        if (propertyName == null) {
            return null;
        }
        return propertyName.getSimpleName();
    }

    @Override // o.WT
    public boolean copydefault(PropertyName propertyName) {
        return this.AkhnZx.equals(propertyName);
    }

    public java.lang.String AxsJAY() {
        return this.gEmmrt.getSimpleName();
    }

    @Override // o.WT
    public PropertyName getNewProxyInstance() {
        AnnotationIntrospector annotationIntrospector;
        AnnotatedMember annotatedMemberEjfBZ = ejfBZ();
        if (annotatedMemberEjfBZ == null || (annotationIntrospector = this.copydefault) == null) {
            return null;
        }
        return annotationIntrospector.findWrapperName(annotatedMemberEjfBZ);
    }

    @Override // o.WT
    public boolean getFieldNames() {
        return copydefault(this.AYXKKw) || copydefault(this.AhwBna) || copydefault(this.DbNXlk) || OLrzqt(this.OLrzqt);
    }

    @Override // o.WT
    public boolean wlaJM() {
        return OLrzqt(this.AYXKKw) || OLrzqt(this.AhwBna) || OLrzqt(this.DbNXlk) || OLrzqt(this.OLrzqt);
    }

    @Override // o.WT
    public PropertyMetadata DbNXlk() {
        if (this.valueOf == null) {
            AnnotatedMember annotatedMemberORxRYg = ORxRYg();
            if (annotatedMemberORxRYg == null) {
                this.valueOf = PropertyMetadata.STD_REQUIRED_OR_OPTIONAL;
            } else {
                java.lang.Boolean boolHasRequiredMarker = this.copydefault.hasRequiredMarker(annotatedMemberORxRYg);
                java.lang.String strFindPropertyDescription = this.copydefault.findPropertyDescription(annotatedMemberORxRYg);
                java.lang.Integer numFindPropertyIndex = this.copydefault.findPropertyIndex(annotatedMemberORxRYg);
                java.lang.String strFindPropertyDefaultValue = this.copydefault.findPropertyDefaultValue(annotatedMemberORxRYg);
                if (boolHasRequiredMarker == null && numFindPropertyIndex == null && strFindPropertyDefaultValue == null) {
                    PropertyMetadata propertyMetadataWithDescription = PropertyMetadata.STD_REQUIRED_OR_OPTIONAL;
                    if (strFindPropertyDescription != null) {
                        propertyMetadataWithDescription = propertyMetadataWithDescription.withDescription(strFindPropertyDescription);
                    }
                    this.valueOf = propertyMetadataWithDescription;
                } else {
                    this.valueOf = PropertyMetadata.construct(boolHasRequiredMarker, strFindPropertyDescription, numFindPropertyIndex, strFindPropertyDefaultValue);
                }
                if (!this.djBIcL) {
                    this.valueOf = KWHzl(this.valueOf, annotatedMemberORxRYg);
                }
            }
        }
        return this.valueOf;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0035 A[PHI: r1 r7
  0x0035: PHI (r1v3 boolean) = (r1v0 boolean), (r1v6 boolean) binds: [B:5:0x000b, B:14:0x002a] A[DONT_GENERATE, DONT_INLINE]
  0x0035: PHI (r7v5 com.fasterxml.jackson.databind.PropertyMetadata) = (r7v0 com.fasterxml.jackson.databind.PropertyMetadata), (r7v9 com.fasterxml.jackson.databind.PropertyMetadata) binds: [B:5:0x000b, B:14:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public PropertyMetadata KWHzl(PropertyMetadata propertyMetadata, AnnotatedMember annotatedMember) {
        Nulls nullsNonDefaultContentNulls;
        JsonSetter.Value setterInfo;
        java.lang.Boolean mergeable;
        java.lang.Boolean boolFindMergeInfo;
        AnnotatedMember annotatedMemberGEmmrt = gEmmrt();
        boolean z = true;
        Nulls nullsNonDefaultValueNulls = null;
        if (annotatedMember != null) {
            AnnotationIntrospector annotationIntrospector = this.copydefault;
            if (annotationIntrospector == null) {
                nullsNonDefaultContentNulls = null;
                if (!z || nullsNonDefaultValueNulls == null || nullsNonDefaultContentNulls == null) {
                    VU configOverride = this.AEQbTJ.getConfigOverride(KWHzl(annotatedMember));
                    setterInfo = configOverride.getSetterInfo();
                    if (setterInfo != null) {
                        if (nullsNonDefaultValueNulls == null) {
                            nullsNonDefaultValueNulls = setterInfo.nonDefaultValueNulls();
                        }
                        if (nullsNonDefaultContentNulls == null) {
                            nullsNonDefaultContentNulls = setterInfo.nonDefaultContentNulls();
                        }
                    }
                    if (z && annotatedMemberGEmmrt != null && (mergeable = configOverride.getMergeable()) != null) {
                        if (mergeable.booleanValue()) {
                            propertyMetadata = propertyMetadata.withMergeInfo(PropertyMetadata.StateListAnimator.KWHzl(annotatedMemberGEmmrt));
                        }
                        z = false;
                    }
                }
            } else {
                if (annotatedMemberGEmmrt != null && (boolFindMergeInfo = annotationIntrospector.findMergeInfo(annotatedMember)) != null) {
                    if (boolFindMergeInfo.booleanValue()) {
                        propertyMetadata = propertyMetadata.withMergeInfo(PropertyMetadata.StateListAnimator.OLrzqt(annotatedMemberGEmmrt));
                    }
                    z = false;
                }
                JsonSetter.Value valueFindSetterInfo = this.copydefault.findSetterInfo(annotatedMember);
                if (valueFindSetterInfo != null) {
                    nullsNonDefaultValueNulls = valueFindSetterInfo.nonDefaultValueNulls();
                    nullsNonDefaultContentNulls = valueFindSetterInfo.nonDefaultContentNulls();
                }
                if (!z) {
                    VU configOverride2 = this.AEQbTJ.getConfigOverride(KWHzl(annotatedMember));
                    setterInfo = configOverride2.getSetterInfo();
                    if (setterInfo != null) {
                    }
                    if (z) {
                        if (mergeable.booleanValue()) {
                        }
                        z = false;
                    }
                }
            }
        } else {
            nullsNonDefaultContentNulls = null;
        }
        if (z || nullsNonDefaultValueNulls == null || nullsNonDefaultContentNulls == null) {
            JsonSetter.Value defaultSetterInfo = this.AEQbTJ.getDefaultSetterInfo();
            if (nullsNonDefaultValueNulls == null) {
                nullsNonDefaultValueNulls = defaultSetterInfo.nonDefaultValueNulls();
            }
            if (nullsNonDefaultContentNulls == null) {
                nullsNonDefaultContentNulls = defaultSetterInfo.nonDefaultContentNulls();
            }
            if (z) {
                if (java.lang.Boolean.TRUE.equals(this.AEQbTJ.getDefaultMergeable()) && annotatedMemberGEmmrt != null) {
                    propertyMetadata = propertyMetadata.withMergeInfo(PropertyMetadata.StateListAnimator.AEQbTJ(annotatedMemberGEmmrt));
                }
            }
        }
        return (nullsNonDefaultValueNulls == null && nullsNonDefaultContentNulls == null) ? propertyMetadata : propertyMetadata.withNulls(nullsNonDefaultValueNulls, nullsNonDefaultContentNulls);
    }

    @Override // o.WT
    public JavaType AuCTel() {
        if (this.djBIcL) {
            WM wmFetchVPNInfo = fetchVPNInfo();
            if (wmFetchVPNInfo == null && (wmFetchVPNInfo = values()) == null) {
                return TypeFactory.unknownType();
            }
            return wmFetchVPNInfo.getType();
        }
        WM wmValueOf = valueOf();
        if (wmValueOf == null) {
            AnnotatedMethod annotatedMethodFJNWhG = fJNWhG();
            if (annotatedMethodFJNWhG != null) {
                return annotatedMethodFJNWhG.getParameterType(0);
            }
            wmValueOf = values();
        }
        if (wmValueOf == null && (wmValueOf = fetchVPNInfo()) == null) {
            return TypeFactory.unknownType();
        }
        return wmValueOf.getType();
    }

    @Override // o.WT
    public java.lang.Class<?> fIwbmz() {
        return AuCTel().getRawClass();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v14, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v8, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r2v3, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r3v3, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0045  */
    @Override // o.WT
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AnnotatedMethod fetchVPNInfo() {
        ActionBar actionBar = this.AhwBna;
        if (actionBar == null) {
            return null;
        }
        ActionBar actionBar2 = actionBar.EZpvd;
        if (actionBar2 == null) {
            return (AnnotatedMethod) actionBar.AYXKKw;
        }
        while (actionBar2 != null) {
            java.lang.Class<?> declaringClass = ((AnnotatedMethod) actionBar.AYXKKw).getDeclaringClass();
            java.lang.Class<?> declaringClass2 = ((AnnotatedMethod) actionBar2.AYXKKw).getDeclaringClass();
            if (declaringClass != declaringClass2) {
                if (!declaringClass.isAssignableFrom(declaringClass2)) {
                    if (declaringClass2.isAssignableFrom(declaringClass)) {
                        continue;
                    }
                }
            } else {
                int iOLrzqt = OLrzqt((AnnotatedMethod) actionBar2.AYXKKw);
                int iOLrzqt2 = OLrzqt((AnnotatedMethod) actionBar.AYXKKw);
                if (iOLrzqt == iOLrzqt2) {
                    throw new java.lang.IllegalArgumentException("Conflicting getter definitions for property \"" + getName() + "\": " + ((AnnotatedMethod) actionBar.AYXKKw).getFullName() + " vs " + ((AnnotatedMethod) actionBar2.AYXKKw).getFullName());
                }
                if (iOLrzqt < iOLrzqt2) {
                    actionBar = actionBar2;
                }
            }
            actionBar2 = actionBar2.EZpvd;
        }
        this.AhwBna = actionBar.AEQbTJ();
        return (AnnotatedMethod) actionBar.AYXKKw;
    }

    public AnnotatedMethod gHZMYf() {
        ActionBar<AnnotatedMethod> actionBar = this.AhwBna;
        if (actionBar == null) {
            return null;
        }
        return actionBar.AYXKKw;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v7, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: o.WZ */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.WT
    public AnnotatedMethod fJNWhG() {
        ActionBar actionBar = this.DbNXlk;
        if (actionBar == null) {
            return null;
        }
        ActionBar actionBar2 = actionBar.EZpvd;
        if (actionBar2 == null) {
            return (AnnotatedMethod) actionBar.AYXKKw;
        }
        while (actionBar2 != null) {
            AnnotatedMethod annotatedMethodCopydefault = copydefault((AnnotatedMethod) actionBar.AYXKKw, (AnnotatedMethod) actionBar2.AYXKKw);
            if (annotatedMethodCopydefault != actionBar.AYXKKw) {
                if (annotatedMethodCopydefault != actionBar2.AYXKKw) {
                    return OLrzqt((ActionBar<AnnotatedMethod>) actionBar, (ActionBar<AnnotatedMethod>) actionBar2);
                }
                actionBar = actionBar2;
            }
            actionBar2 = actionBar2.EZpvd;
        }
        this.DbNXlk = actionBar.AEQbTJ();
        return (AnnotatedMethod) actionBar.AYXKKw;
    }

    public AnnotatedMethod QKVWgx() {
        ActionBar<AnnotatedMethod> actionBar = this.DbNXlk;
        if (actionBar == null) {
            return null;
        }
        return actionBar.AYXKKw;
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:21:0x0030 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r4v8, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public AnnotatedMethod OLrzqt(ActionBar<AnnotatedMethod> actionBar, ActionBar<AnnotatedMethod> actionBar2) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(actionBar.AYXKKw);
        arrayList.add(actionBar2.AYXKKw);
        ActionBar actionBar3 = actionBar2.EZpvd;
        ActionBar actionBar4 = actionBar;
        while (actionBar3 != null) {
            AnnotatedMethod annotatedMethodCopydefault = copydefault((AnnotatedMethod) actionBar4.AYXKKw, (AnnotatedMethod) actionBar3.AYXKKw);
            if (annotatedMethodCopydefault != actionBar4.AYXKKw) {
                T t = actionBar3.AYXKKw;
                if (annotatedMethodCopydefault == t) {
                    arrayList.clear();
                    actionBar4 = actionBar3;
                } else {
                    arrayList.add(t);
                }
            }
            actionBar3 = actionBar3.EZpvd;
            actionBar4 = actionBar4;
        }
        if (arrayList.isEmpty()) {
            this.DbNXlk = actionBar4.AEQbTJ();
            return (AnnotatedMethod) actionBar4.AYXKKw;
        }
        throw new java.lang.IllegalArgumentException(java.lang.String.format("Conflicting setter definitions for property \"%s\": %s", getName(), (java.lang.String) arrayList.stream().map(new java.util.function.Function() { // from class: o.WY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return ((AnnotatedMethod) obj).getFullName();
            }
        }).collect(Collectors.joining(" vs "))));
    }

    public AnnotatedMethod copydefault(AnnotatedMethod annotatedMethod, AnnotatedMethod annotatedMethod2) {
        java.lang.Class<?> declaringClass = annotatedMethod.getDeclaringClass();
        java.lang.Class<?> declaringClass2 = annotatedMethod2.getDeclaringClass();
        if (declaringClass != declaringClass2) {
            if (declaringClass.isAssignableFrom(declaringClass2)) {
                return annotatedMethod2;
            }
            if (declaringClass2.isAssignableFrom(declaringClass)) {
                return annotatedMethod;
            }
        }
        int iAEQbTJ = AEQbTJ(annotatedMethod2);
        int iAEQbTJ2 = AEQbTJ(annotatedMethod);
        if (iAEQbTJ != iAEQbTJ2) {
            return iAEQbTJ < iAEQbTJ2 ? annotatedMethod2 : annotatedMethod;
        }
        AnnotationIntrospector annotationIntrospector = this.copydefault;
        if (annotationIntrospector == null) {
            return null;
        }
        return annotationIntrospector.resolveSetterConflict(this.AEQbTJ, annotatedMethod, annotatedMethod2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.WT
    public AnnotatedField values() {
        ActionBar<AnnotatedField> actionBar = this.AYXKKw;
        if (actionBar == null) {
            return null;
        }
        AnnotatedField annotatedField = actionBar.AYXKKw;
        for (ActionBar actionBar2 = actionBar.EZpvd; actionBar2 != null; actionBar2 = actionBar2.EZpvd) {
            AnnotatedField annotatedField2 = (AnnotatedField) actionBar2.AYXKKw;
            java.lang.Class<?> declaringClass = annotatedField.getDeclaringClass();
            java.lang.Class<?> declaringClass2 = annotatedField2.getDeclaringClass();
            if (declaringClass != declaringClass2) {
                if (declaringClass.isAssignableFrom(declaringClass2)) {
                    annotatedField = annotatedField2;
                } else if (declaringClass2.isAssignableFrom(declaringClass)) {
                }
            }
            throw new java.lang.IllegalArgumentException("Multiple fields representing property \"" + getName() + "\": " + annotatedField.getFullName() + " vs " + annotatedField2.getFullName());
        }
        return annotatedField;
    }

    public AnnotatedField AwvSrB() {
        ActionBar<AnnotatedField> actionBar = this.AYXKKw;
        if (actionBar == null) {
            return null;
        }
        return actionBar.AYXKKw;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.WT
    public AnnotatedParameter valueOf() {
        ActionBar actionBar = this.OLrzqt;
        if (actionBar == null) {
            return null;
        }
        while (!(((AnnotatedParameter) actionBar.AYXKKw).getOwner() instanceof AnnotatedConstructor)) {
            actionBar = actionBar.EZpvd;
            if (actionBar == null) {
                return this.OLrzqt.AYXKKw;
            }
        }
        return (AnnotatedParameter) actionBar.AYXKKw;
    }

    @Override // o.WT
    public java.util.Iterator<AnnotatedParameter> AhwBna() {
        ActionBar<AnnotatedParameter> actionBar = this.OLrzqt;
        if (actionBar == null) {
            return C5619Yr.KWHzl();
        }
        return new Application(actionBar);
    }

    @Override // o.WT
    public AnnotatedMember ejfBZ() {
        if (this.djBIcL) {
            return gEmmrt();
        }
        AnnotatedMember annotatedMemberAkhnZx = AkhnZx();
        return annotatedMemberAkhnZx == null ? gEmmrt() : annotatedMemberAkhnZx;
    }

    public AnnotatedMember ORxRYg() {
        if (this.djBIcL) {
            ActionBar<AnnotatedMethod> actionBar = this.AhwBna;
            if (actionBar != null) {
                return actionBar.AYXKKw;
            }
            ActionBar<AnnotatedField> actionBar2 = this.AYXKKw;
            if (actionBar2 != null) {
                return actionBar2.AYXKKw;
            }
            return null;
        }
        ActionBar<AnnotatedParameter> actionBar3 = this.OLrzqt;
        if (actionBar3 != null) {
            return actionBar3.AYXKKw;
        }
        ActionBar<AnnotatedMethod> actionBar4 = this.DbNXlk;
        if (actionBar4 != null) {
            return actionBar4.AYXKKw;
        }
        ActionBar<AnnotatedField> actionBar5 = this.AYXKKw;
        if (actionBar5 != null) {
            return actionBar5.AYXKKw;
        }
        ActionBar<AnnotatedMethod> actionBar6 = this.AhwBna;
        if (actionBar6 != null) {
            return actionBar6.AYXKKw;
        }
        return null;
    }

    public int OLrzqt(AnnotatedMethod annotatedMethod) {
        java.lang.String name = annotatedMethod.getName();
        if (!name.startsWith("get") || name.length() <= 3) {
            return (!name.startsWith("is") || name.length() <= 2) ? 3 : 2;
        }
        return 1;
    }

    public int AEQbTJ(AnnotatedMethod annotatedMethod) {
        java.lang.String name = annotatedMethod.getName();
        return (!name.startsWith("set") || name.length() <= 3) ? 2 : 1;
    }

    @Override // o.WT
    public java.lang.Class<?>[] djBIcL() {
        return (java.lang.Class[]) OLrzqt(new Activity<java.lang.Class<?>[]>() { // from class: o.WZ.4
            /* JADX DEBUG: Method merged with bridge method: EZpvd(Lcom/fasterxml/jackson/databind/introspect/AnnotatedMember;)Ljava/lang/Object; */
            @Override // o.WZ.Activity
            /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
            public java.lang.Class<?>[] EZpvd(AnnotatedMember annotatedMember) {
                return WZ.this.copydefault.findViews(annotatedMember);
            }
        });
    }

    @Override // o.WT
    public AnnotationIntrospector.ReferenceProperty AYXKKw() {
        AnnotationIntrospector.ReferenceProperty referenceProperty = this.isConnected;
        if (referenceProperty != null) {
            if (referenceProperty == KWHzl) {
                return null;
            }
            return referenceProperty;
        }
        AnnotationIntrospector.ReferenceProperty referenceProperty2 = (AnnotationIntrospector.ReferenceProperty) OLrzqt(new Activity<AnnotationIntrospector.ReferenceProperty>() { // from class: o.WZ.1
            /* JADX DEBUG: Method merged with bridge method: EZpvd(Lcom/fasterxml/jackson/databind/introspect/AnnotatedMember;)Ljava/lang/Object; */
            @Override // o.WZ.Activity
            /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
            public AnnotationIntrospector.ReferenceProperty EZpvd(AnnotatedMember annotatedMember) {
                return WZ.this.copydefault.findReferenceType(annotatedMember);
            }
        });
        this.isConnected = referenceProperty2 == null ? KWHzl : referenceProperty2;
        return referenceProperty2;
    }

    @Override // o.WT
    public boolean AuCTelauCTel() {
        java.lang.Boolean bool = (java.lang.Boolean) OLrzqt(new Activity<java.lang.Boolean>() { // from class: o.WZ.5
            /* JADX DEBUG: Method merged with bridge method: EZpvd(Lcom/fasterxml/jackson/databind/introspect/AnnotatedMember;)Ljava/lang/Object; */
            @Override // o.WZ.Activity
            /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
            public java.lang.Boolean EZpvd(AnnotatedMember annotatedMember) {
                return WZ.this.copydefault.isTypeId(annotatedMember);
            }
        });
        return bool != null && bool.booleanValue();
    }

    @Override // o.WT
    public C5576Xa KWHzl() {
        return (C5576Xa) OLrzqt(new Activity<C5576Xa>() { // from class: o.WZ.2
            /* JADX DEBUG: Method merged with bridge method: EZpvd(Lcom/fasterxml/jackson/databind/introspect/AnnotatedMember;)Ljava/lang/Object; */
            @Override // o.WZ.Activity
            /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
            public C5576Xa EZpvd(AnnotatedMember annotatedMember) {
                C5576Xa c5576XaFindObjectIdInfo = WZ.this.copydefault.findObjectIdInfo(annotatedMember);
                return c5576XaFindObjectIdInfo != null ? WZ.this.copydefault.findObjectReferenceInfo(annotatedMember, c5576XaFindObjectIdInfo) : c5576XaFindObjectIdInfo;
            }
        });
    }

    @Override // o.WT
    public JsonInclude.Value EZpvd() {
        AnnotatedMember annotatedMemberGEmmrt = gEmmrt();
        AnnotationIntrospector annotationIntrospector = this.copydefault;
        JsonInclude.Value valueFindPropertyInclusion = annotationIntrospector == null ? null : annotationIntrospector.findPropertyInclusion(annotatedMemberGEmmrt);
        return valueFindPropertyInclusion == null ? JsonInclude.Value.empty() : valueFindPropertyInclusion;
    }

    public JsonProperty.Access zuBGHE() {
        return (JsonProperty.Access) OLrzqt(new Activity<JsonProperty.Access>() { // from class: o.WZ.3
            /* JADX DEBUG: Method merged with bridge method: EZpvd(Lcom/fasterxml/jackson/databind/introspect/AnnotatedMember;)Ljava/lang/Object; */
            @Override // o.WZ.Activity
            /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
            public JsonProperty.Access EZpvd(AnnotatedMember annotatedMember) {
                return WZ.this.copydefault.findPropertyAccess(annotatedMember);
            }
        }, JsonProperty.Access.AUTO);
    }

    public void EZpvd(AnnotatedField annotatedField, PropertyName propertyName, boolean z, boolean z2, boolean z3) {
        this.AYXKKw = new ActionBar<>(annotatedField, this.AYXKKw, propertyName, z, z2, z3);
    }

    public void copydefault(AnnotatedParameter annotatedParameter, PropertyName propertyName, boolean z, boolean z2, boolean z3) {
        this.OLrzqt = new ActionBar<>(annotatedParameter, this.OLrzqt, propertyName, z, z2, z3);
    }

    public void EZpvd(AnnotatedMethod annotatedMethod, PropertyName propertyName, boolean z, boolean z2, boolean z3) {
        this.AhwBna = new ActionBar<>(annotatedMethod, this.AhwBna, propertyName, z, z2, z3);
    }

    public void OLrzqt(AnnotatedMethod annotatedMethod, PropertyName propertyName, boolean z, boolean z2, boolean z3) {
        this.DbNXlk = new ActionBar<>(annotatedMethod, this.DbNXlk, propertyName, z, z2, z3);
    }

    public void copydefault(WZ wz) {
        this.AYXKKw = AEQbTJ(this.AYXKKw, wz.AYXKKw);
        this.OLrzqt = AEQbTJ(this.OLrzqt, wz.OLrzqt);
        this.AhwBna = AEQbTJ(this.AhwBna, wz.AhwBna);
        this.DbNXlk = AEQbTJ(this.DbNXlk, wz.DbNXlk);
    }

    public static <T> ActionBar<T> AEQbTJ(ActionBar<T> actionBar, ActionBar<T> actionBar2) {
        return actionBar == null ? actionBar2 : actionBar2 == null ? actionBar : actionBar.OLrzqt(actionBar2);
    }

    public void DTwDnp() {
        this.AYXKKw = valueOf(this.AYXKKw);
        this.AhwBna = valueOf(this.AhwBna);
        this.DbNXlk = valueOf(this.DbNXlk);
        this.OLrzqt = valueOf(this.OLrzqt);
    }

    public JsonProperty.Access OLrzqt(boolean z, C5577Xb c5577Xb) {
        JsonProperty.Access accessZuBGHE = zuBGHE();
        if (accessZuBGHE == null) {
            accessZuBGHE = JsonProperty.Access.AUTO;
        }
        int i = AnonymousClass7.copydefault[accessZuBGHE.ordinal()];
        if (i == 1) {
            if (c5577Xb != null) {
                c5577Xb.OLrzqt(getName());
                java.util.Iterator<PropertyName> it = sSMYrx().iterator();
                while (it.hasNext()) {
                    c5577Xb.OLrzqt(it.next().getSimpleName());
                }
            }
            this.DbNXlk = null;
            this.OLrzqt = null;
            if (!this.djBIcL) {
                this.AYXKKw = null;
            }
        } else if (i != 2) {
            if (i != 3) {
                this.AhwBna = AhwBna(this.AhwBna);
                this.OLrzqt = AhwBna(this.OLrzqt);
                if (!z || this.AhwBna == null) {
                    this.AYXKKw = AhwBna(this.AYXKKw);
                    this.DbNXlk = AhwBna(this.DbNXlk);
                }
            } else {
                this.AhwBna = null;
                if (this.djBIcL) {
                    this.AYXKKw = null;
                }
            }
        }
        return accessZuBGHE;
    }

    /* JADX INFO: renamed from: o.WZ$7, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass7 {
        public static final /* synthetic */ int[] copydefault;

        static {
            int[] iArr = new int[JsonProperty.Access.values().length];
            copydefault = iArr;
            try {
                iArr[JsonProperty.Access.READ_ONLY.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                copydefault[JsonProperty.Access.READ_WRITE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                copydefault[JsonProperty.Access.WRITE_ONLY.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                copydefault[JsonProperty.Access.AUTO.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
        }
    }

    public void RJOkX() {
        this.AYXKKw = djBIcL(this.AYXKKw);
        this.AhwBna = djBIcL(this.AhwBna);
        this.DbNXlk = djBIcL(this.DbNXlk);
        this.OLrzqt = djBIcL(this.OLrzqt);
    }

    public void OLrzqt(boolean z) {
        if (z) {
            ActionBar<AnnotatedMethod> actionBar = this.AhwBna;
            if (actionBar != null) {
                this.AhwBna = EZpvd(this.AhwBna, copydefault(0, actionBar, this.AYXKKw, this.OLrzqt, this.DbNXlk));
                return;
            }
            ActionBar<AnnotatedField> actionBar2 = this.AYXKKw;
            if (actionBar2 != null) {
                this.AYXKKw = EZpvd(this.AYXKKw, copydefault(0, actionBar2, this.OLrzqt, this.DbNXlk));
                return;
            }
            return;
        }
        ActionBar<AnnotatedParameter> actionBar3 = this.OLrzqt;
        if (actionBar3 != null) {
            this.OLrzqt = EZpvd(this.OLrzqt, copydefault(0, actionBar3, this.DbNXlk, this.AYXKKw, this.AhwBna));
            return;
        }
        ActionBar<AnnotatedMethod> actionBar4 = this.DbNXlk;
        if (actionBar4 != null) {
            this.DbNXlk = EZpvd(this.DbNXlk, copydefault(0, actionBar4, this.AYXKKw, this.AhwBna));
            return;
        }
        ActionBar<AnnotatedField> actionBar5 = this.AYXKKw;
        if (actionBar5 != null) {
            this.AYXKKw = EZpvd(this.AYXKKw, copydefault(0, actionBar5, this.AhwBna));
        }
    }

    public final WQ copydefault(int i, ActionBar<? extends AnnotatedMember>... actionBarArr) {
        WQ wqAYXKKw = AYXKKw(actionBarArr[i]);
        do {
            i++;
            if (i >= actionBarArr.length) {
                return wqAYXKKw;
            }
        } while (actionBarArr[i] == null);
        return WQ.AEQbTJ(wqAYXKKw, copydefault(i, actionBarArr));
    }

    public final <T extends AnnotatedMember> WQ AYXKKw(ActionBar<T> actionBar) {
        WQ allAnnotations = actionBar.AYXKKw.getAllAnnotations();
        ActionBar<T> actionBar2 = actionBar.EZpvd;
        return actionBar2 != null ? WQ.AEQbTJ(allAnnotations, AYXKKw(actionBar2)) : allAnnotations;
    }

    public final <T extends AnnotatedMember> ActionBar<T> EZpvd(ActionBar<T> actionBar, WQ wq) {
        AnnotatedMember annotatedMember = (AnnotatedMember) actionBar.AYXKKw.withAnnotations(wq);
        ActionBar<T> actionBar2 = actionBar.EZpvd;
        ActionBar actionBarEZpvd = actionBar;
        if (actionBar2 != null) {
            actionBarEZpvd = actionBar.EZpvd(EZpvd(actionBar2, wq));
        }
        return actionBarEZpvd.AEQbTJ(annotatedMember);
    }

    public final <T> ActionBar<T> valueOf(ActionBar<T> actionBar) {
        return actionBar == null ? actionBar : actionBar.EZpvd();
    }

    public final <T> ActionBar<T> AhwBna(ActionBar<T> actionBar) {
        return actionBar == null ? actionBar : actionBar.OLrzqt();
    }

    public final <T> ActionBar<T> djBIcL(ActionBar<T> actionBar) {
        return actionBar == null ? actionBar : actionBar.KWHzl();
    }

    public final <T> boolean copydefault(ActionBar<T> actionBar) {
        while (actionBar != null) {
            PropertyName propertyName = actionBar.AEQbTJ;
            if (propertyName != null && propertyName.hasSimpleName()) {
                return true;
            }
            actionBar = actionBar.EZpvd;
        }
        return false;
    }

    public final <T> boolean OLrzqt(ActionBar<T> actionBar) {
        while (actionBar != null) {
            if (actionBar.AEQbTJ != null && actionBar.copydefault) {
                return true;
            }
            actionBar = actionBar.EZpvd;
        }
        return false;
    }

    public boolean zLjUOn() {
        return gEmmrt(this.AYXKKw) || gEmmrt(this.AhwBna) || gEmmrt(this.DbNXlk) || gEmmrt(this.OLrzqt);
    }

    public final <T> boolean gEmmrt(ActionBar<T> actionBar) {
        while (actionBar != null) {
            if (actionBar.KWHzl) {
                return true;
            }
            actionBar = actionBar.EZpvd;
        }
        return false;
    }

    public boolean AubY() {
        return EZpvd(this.AYXKKw) || EZpvd(this.AhwBna) || EZpvd(this.DbNXlk) || EZpvd(this.OLrzqt);
    }

    public final <T> boolean EZpvd(ActionBar<T> actionBar) {
        while (actionBar != null) {
            if (actionBar.OLrzqt) {
                return true;
            }
            actionBar = actionBar.EZpvd;
        }
        return false;
    }

    public boolean zsXlph() {
        return KWHzl(this.AYXKKw) || KWHzl(this.AhwBna) || KWHzl(this.DbNXlk) || AEQbTJ(this.OLrzqt);
    }

    public final <T> boolean KWHzl(ActionBar<T> actionBar) {
        PropertyName propertyName;
        while (actionBar != null) {
            if (!actionBar.OLrzqt && (propertyName = actionBar.AEQbTJ) != null && propertyName.hasSimpleName()) {
                return true;
            }
            actionBar = actionBar.EZpvd;
        }
        return false;
    }

    public final <T> boolean AEQbTJ(ActionBar<T> actionBar) {
        while (actionBar != null) {
            if (!actionBar.OLrzqt && actionBar.AEQbTJ != null && actionBar.copydefault) {
                return true;
            }
            actionBar = actionBar.EZpvd;
        }
        return false;
    }

    public java.util.Set<PropertyName> sSMYrx() {
        java.util.Set<PropertyName> setKWHzl = KWHzl(this.OLrzqt, KWHzl(this.DbNXlk, KWHzl(this.AhwBna, KWHzl(this.AYXKKw, (java.util.Set<PropertyName>) null))));
        return setKWHzl == null ? Collections.emptySet() : setKWHzl;
    }

    public java.util.Collection<WZ> OLrzqt(java.util.Collection<PropertyName> collection) {
        java.util.HashMap map = new java.util.HashMap();
        OLrzqt(collection, map, this.AYXKKw);
        OLrzqt(collection, map, this.AhwBna);
        OLrzqt(collection, map, this.DbNXlk);
        OLrzqt(collection, map, this.OLrzqt);
        return map.values();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r8v0 ??, still in use, count: 1, list:
          (r8v0 ?? I:java.lang.Object) from 0x0023: INVOKE (r11v0 ?? I:java.util.Map), (r7v0 ?? I:java.lang.Object), (r8v0 ?? I:java.lang.Object) INTERFACE call: java.util.Map.put(java.lang.Object, java.lang.Object):java.lang.Object A[MD:(K, V):V (c)] (LINE:1232)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    public final void OLrzqt(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r8v0 ??, still in use, count: 1, list:
          (r8v0 ?? I:java.lang.Object) from 0x0023: INVOKE (r11v0 ?? I:java.util.Map), (r7v0 ?? I:java.lang.Object), (r8v0 ?? I:java.lang.Object) INTERFACE call: java.util.Map.put(java.lang.Object, java.lang.Object):java.lang.Object A[MD:(K, V):V (c)] (LINE:1232)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r10v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:224)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:169)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:407)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:337)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:303)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
        */

    public final java.util.Set<PropertyName> KWHzl(ActionBar<? extends AnnotatedMember> actionBar, java.util.Set<PropertyName> set) {
        for (ActionBar actionBar2 = actionBar; actionBar2 != null; actionBar2 = actionBar2.EZpvd) {
            if (actionBar2.copydefault && actionBar2.AEQbTJ != null) {
                if (set == null) {
                    set = new java.util.HashSet<>();
                }
                set.add(actionBar2.AEQbTJ);
            }
        }
        return set;
    }

    public java.lang.String toString() {
        return "[Property '" + this.AkhnZx + "'; ctors: " + this.OLrzqt + ", field(s): " + this.AYXKKw + ", getter(s): " + this.AhwBna + ", setter(s): " + this.DbNXlk + "]";
    }

    public <T> T OLrzqt(Activity<T> activity) {
        ActionBar<AnnotatedMethod> actionBar;
        ActionBar<AnnotatedField> actionBar2;
        if (this.copydefault == null) {
            return null;
        }
        if (this.djBIcL) {
            ActionBar<AnnotatedMethod> actionBar3 = this.AhwBna;
            if (actionBar3 != null) {
                tEZpvd = activity.EZpvd(actionBar3.AYXKKw);
            }
        } else {
            ActionBar<AnnotatedParameter> actionBar4 = this.OLrzqt;
            tEZpvd = actionBar4 != null ? activity.EZpvd(actionBar4.AYXKKw) : null;
            if (tEZpvd == null && (actionBar = this.DbNXlk) != null) {
                tEZpvd = activity.EZpvd(actionBar.AYXKKw);
            }
        }
        return (tEZpvd != null || (actionBar2 = this.AYXKKw) == null) ? tEZpvd : activity.EZpvd(actionBar2.AYXKKw);
    }

    public <T> T OLrzqt(Activity<T> activity, T t) {
        T tEZpvd;
        T tEZpvd2;
        T tEZpvd3;
        T tEZpvd4;
        T tEZpvd5;
        T tEZpvd6;
        T tEZpvd7;
        T tEZpvd8;
        if (this.copydefault == null) {
            return null;
        }
        if (this.djBIcL) {
            ActionBar<AnnotatedMethod> actionBar = this.AhwBna;
            if (actionBar != null && (tEZpvd8 = activity.EZpvd(actionBar.AYXKKw)) != null && tEZpvd8 != t) {
                return tEZpvd8;
            }
            ActionBar<AnnotatedField> actionBar2 = this.AYXKKw;
            if (actionBar2 != null && (tEZpvd7 = activity.EZpvd(actionBar2.AYXKKw)) != null && tEZpvd7 != t) {
                return tEZpvd7;
            }
            ActionBar<AnnotatedParameter> actionBar3 = this.OLrzqt;
            if (actionBar3 != null && (tEZpvd6 = activity.EZpvd(actionBar3.AYXKKw)) != null && tEZpvd6 != t) {
                return tEZpvd6;
            }
            ActionBar<AnnotatedMethod> actionBar4 = this.DbNXlk;
            if (actionBar4 == null || (tEZpvd5 = activity.EZpvd(actionBar4.AYXKKw)) == null || tEZpvd5 == t) {
                return null;
            }
            return tEZpvd5;
        }
        ActionBar<AnnotatedParameter> actionBar5 = this.OLrzqt;
        if (actionBar5 != null && (tEZpvd4 = activity.EZpvd(actionBar5.AYXKKw)) != null && tEZpvd4 != t) {
            return tEZpvd4;
        }
        ActionBar<AnnotatedMethod> actionBar6 = this.DbNXlk;
        if (actionBar6 != null && (tEZpvd3 = activity.EZpvd(actionBar6.AYXKKw)) != null && tEZpvd3 != t) {
            return tEZpvd3;
        }
        ActionBar<AnnotatedField> actionBar7 = this.AYXKKw;
        if (actionBar7 != null && (tEZpvd2 = activity.EZpvd(actionBar7.AYXKKw)) != null && tEZpvd2 != t) {
            return tEZpvd2;
        }
        ActionBar<AnnotatedMethod> actionBar8 = this.AhwBna;
        if (actionBar8 == null || (tEZpvd = activity.EZpvd(actionBar8.AYXKKw)) == null || tEZpvd == t) {
            return null;
        }
        return tEZpvd;
    }

    public java.lang.Class<?> KWHzl(AnnotatedMember annotatedMember) {
        if (annotatedMember instanceof AnnotatedMethod) {
            AnnotatedMethod annotatedMethod = (AnnotatedMethod) annotatedMember;
            if (annotatedMethod.getParameterCount() > 0) {
                return annotatedMethod.getParameterType(0).getRawClass();
            }
        }
        return annotatedMember.getType().getRawClass();
    }

    public static class Application<T extends AnnotatedMember> implements java.util.Iterator<T> {
        public ActionBar<T> copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.copydefault != null;
        }

        public Application(ActionBar<T> actionBar) {
            this.copydefault = actionBar;
        }

        /* JADX DEBUG: Method merged with bridge method: next()Ljava/lang/Object; */
        @Override // java.util.Iterator
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public T next() {
            ActionBar<T> actionBar = this.copydefault;
            if (actionBar == null) {
                throw new NoSuchElementException();
            }
            T t = actionBar.AYXKKw;
            this.copydefault = actionBar.EZpvd;
            return t;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new java.lang.UnsupportedOperationException();
        }
    }

    public static final class ActionBar<T> {
        public final PropertyName AEQbTJ;
        public final T AYXKKw;
        public final ActionBar<T> EZpvd;
        public final boolean KWHzl;
        public final boolean OLrzqt;
        public final boolean copydefault;

        public ActionBar(T t, ActionBar<T> actionBar, PropertyName propertyName, boolean z, boolean z2, boolean z3) {
            this.AYXKKw = t;
            this.EZpvd = actionBar;
            PropertyName propertyName2 = (propertyName == null || propertyName.isEmpty()) ? null : propertyName;
            this.AEQbTJ = propertyName2;
            if (z) {
                if (propertyName2 == null) {
                    throw new java.lang.IllegalArgumentException("Cannot pass true for 'explName' if name is null/empty");
                }
                if (!propertyName.hasSimpleName()) {
                    z = false;
                }
            }
            this.copydefault = z;
            this.KWHzl = z2;
            this.OLrzqt = z3;
        }

        public ActionBar<T> AEQbTJ() {
            return this.EZpvd == null ? this : new ActionBar<>(this.AYXKKw, null, this.AEQbTJ, this.copydefault, this.KWHzl, this.OLrzqt);
        }

        public ActionBar<T> AEQbTJ(T t) {
            return t == this.AYXKKw ? this : new ActionBar<>(t, this.EZpvd, this.AEQbTJ, this.copydefault, this.KWHzl, this.OLrzqt);
        }

        public ActionBar<T> EZpvd(ActionBar<T> actionBar) {
            return actionBar == this.EZpvd ? this : new ActionBar<>(this.AYXKKw, actionBar, this.AEQbTJ, this.copydefault, this.KWHzl, this.OLrzqt);
        }

        public ActionBar<T> EZpvd() {
            ActionBar<T> actionBarEZpvd;
            if (!this.OLrzqt) {
                ActionBar<T> actionBar = this.EZpvd;
                return (actionBar == null || (actionBarEZpvd = actionBar.EZpvd()) == this.EZpvd) ? this : EZpvd(actionBarEZpvd);
            }
            ActionBar<T> actionBar2 = this.EZpvd;
            if (actionBar2 == null) {
                return null;
            }
            return actionBar2.EZpvd();
        }

        public ActionBar<T> OLrzqt() {
            ActionBar<T> actionBar = this.EZpvd;
            ActionBar<T> actionBarOLrzqt = actionBar == null ? null : actionBar.OLrzqt();
            return this.KWHzl ? EZpvd(actionBarOLrzqt) : actionBarOLrzqt;
        }

        public ActionBar<T> OLrzqt(ActionBar<T> actionBar) {
            ActionBar<T> actionBar2 = this.EZpvd;
            if (actionBar2 == null) {
                return EZpvd(actionBar);
            }
            return EZpvd(actionBar2.OLrzqt(actionBar));
        }

        public ActionBar<T> KWHzl() {
            ActionBar<T> actionBar = this.EZpvd;
            if (actionBar == null) {
                return this;
            }
            ActionBar<T> actionBarKWHzl = actionBar.KWHzl();
            if (this.AEQbTJ != null) {
                if (actionBarKWHzl.AEQbTJ == null) {
                    return EZpvd(null);
                }
                return EZpvd(actionBarKWHzl);
            }
            if (actionBarKWHzl.AEQbTJ != null) {
                return actionBarKWHzl;
            }
            boolean z = this.KWHzl;
            if (z == actionBarKWHzl.KWHzl) {
                return EZpvd(actionBarKWHzl);
            }
            return z ? EZpvd(null) : actionBarKWHzl;
        }

        public java.lang.String toString() {
            java.lang.String str = java.lang.String.format("%s[visible=%b,ignore=%b,explicitName=%b]", this.AYXKKw.toString(), java.lang.Boolean.valueOf(this.KWHzl), java.lang.Boolean.valueOf(this.OLrzqt), java.lang.Boolean.valueOf(this.copydefault));
            if (this.EZpvd == null) {
                return str;
            }
            return str + ", " + this.EZpvd.toString();
        }
    }
}
