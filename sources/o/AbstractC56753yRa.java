package o;

import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import java.util.EnumMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType;
import kotlin.reflect.jvm.internal.impl.load.java.ReportLevel;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier;
import o.yMB;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yRa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public abstract class AbstractC56753yRa<TAnnotation> {
    public static final java.util.Map<java.lang.String, AnnotationQualifierApplicabilityType> EZpvd;
    public static final StateListAnimator copydefault = new StateListAnimator(null);
    public final ConcurrentHashMap<java.lang.Object, TAnnotation> AEQbTJ;
    public final C56778yRz KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final boolean EZpvd(java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return false;
    }

    public abstract java.lang.Object AEQbTJ(@NotNull TAnnotation tannotation);

    public abstract java.lang.Iterable<java.lang.String> KWHzl(@NotNull TAnnotation tannotation, boolean z);

    public abstract boolean KWHzl();

    public abstract C56933yXs OLrzqt(@NotNull TAnnotation tannotation);

    public abstract java.lang.Iterable<TAnnotation> valueOf(@NotNull TAnnotation tannotation);

    public AbstractC56753yRa(@NotNull C56778yRz c56778yRz) {
        Intrinsics.checkNotNullParameter(c56778yRz, "");
        this.KWHzl = c56778yRz;
        this.AEQbTJ = new ConcurrentHashMap<>();
    }

    public final TAnnotation AEQbTJ(TAnnotation tannotation, C56933yXs c56933yXs) {
        for (TAnnotation tannotation2 : valueOf(tannotation)) {
            if (Intrinsics.EZpvd(OLrzqt(tannotation2), c56933yXs)) {
                return tannotation2;
            }
        }
        return null;
    }

    public final boolean OLrzqt(TAnnotation tannotation, C56933yXs c56933yXs) {
        java.lang.Iterable<TAnnotation> iterableValueOf = valueOf(tannotation);
        if (!(iterableValueOf instanceof java.util.Collection) || !((java.util.Collection) iterableValueOf).isEmpty()) {
            java.util.Iterator<TAnnotation> it = iterableValueOf.iterator();
            while (it.hasNext()) {
                if (Intrinsics.EZpvd(OLrzqt(it.next()), c56933yXs)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final TAnnotation AkhnZx(@NotNull TAnnotation tannotation) {
        TAnnotation tannotationAkhnZx;
        Intrinsics.checkNotNullParameter(tannotation, "");
        if (this.KWHzl.copydefault().KWHzl()) {
            return null;
        }
        if (CollectionsKt___CollectionsKt.KWHzl((java.lang.Iterable<? extends C56933yXs>) ((java.lang.Iterable<? extends java.lang.Object>) yRC.KWHzl()), OLrzqt(tannotation)) || OLrzqt(tannotation, yRC.AYXKKw())) {
            return tannotation;
        }
        if (!OLrzqt(tannotation, yRC.gEmmrt())) {
            return null;
        }
        ConcurrentHashMap<java.lang.Object, TAnnotation> concurrentHashMap = this.AEQbTJ;
        java.lang.Object objAEQbTJ = AEQbTJ(tannotation);
        TAnnotation tannotation2 = concurrentHashMap.get(objAEQbTJ);
        if (tannotation2 != null) {
            return tannotation2;
        }
        java.util.Iterator<TAnnotation> it = valueOf(tannotation).iterator();
        while (true) {
            if (!it.hasNext()) {
                tannotationAkhnZx = null;
                break;
            }
            tannotationAkhnZx = AkhnZx(it.next());
            if (tannotationAkhnZx != null) {
                break;
            }
        }
        if (tannotationAkhnZx == null) {
            return null;
        }
        TAnnotation tannotationPutIfAbsent = concurrentHashMap.putIfAbsent(objAEQbTJ, tannotationAkhnZx);
        return tannotationPutIfAbsent == null ? tannotationAkhnZx : tannotationPutIfAbsent;
    }

    public final C56766yRn DbNXlk(TAnnotation tannotation) {
        C56766yRn c56766yRn;
        if (this.KWHzl.OLrzqt() || (c56766yRn = C56772yRt.AEQbTJ().get(OLrzqt(tannotation))) == null) {
            return null;
        }
        ReportLevel reportLevelAhwBna = AhwBna(tannotation);
        if (reportLevelAhwBna == ReportLevel.IGNORE) {
            reportLevelAhwBna = null;
        }
        if (reportLevelAhwBna == null) {
            return null;
        }
        return C56766yRn.copy$default(c56766yRn, C56858yUy.copy$default(c56766yRn.OLrzqt(), null, reportLevelAhwBna.isWarning(), 1, null), null, false, 6, null);
    }

    public final ReportLevel AhwBna(TAnnotation tannotation) {
        C56933yXs c56933yXsOLrzqt = OLrzqt(tannotation);
        if (c56933yXsOLrzqt != null && C56772yRt.OLrzqt().containsKey(c56933yXsOLrzqt)) {
            return this.KWHzl.AEQbTJ().invoke(c56933yXsOLrzqt);
        }
        return djBIcL(tannotation);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.Set<? extends kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType> */
    /* JADX WARN: Multi-variable type inference failed */
    public final java.util.Set<AnnotationQualifierApplicabilityType> EZpvd(java.util.Set<? extends AnnotationQualifierApplicabilityType> set) {
        if (!set.contains(AnnotationQualifierApplicabilityType.TYPE_USE)) {
            return set;
        }
        return yEJ.KWHzl(yEJ.EZpvd((java.util.Set<? extends AnnotationQualifierApplicabilityType>) ((java.util.Set<? extends java.lang.Object>) yDV.QOLQEE(AnnotationQualifierApplicabilityType.values())), AnnotationQualifierApplicabilityType.TYPE_PARAMETER_BOUNDS), set);
    }

    public final kotlin.Pair<TAnnotation, java.util.Set<AnnotationQualifierApplicabilityType>> isConnected(TAnnotation tannotation) {
        TAnnotation tannotationAEQbTJ;
        TAnnotation next;
        if (this.KWHzl.copydefault().KWHzl() || (tannotationAEQbTJ = AEQbTJ(tannotation, yRC.AhwBna())) == null) {
            return null;
        }
        java.util.Iterator<TAnnotation> it = valueOf(tannotation).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (AkhnZx(next) != null) {
                break;
            }
        }
        if (next == null) {
            return null;
        }
        java.lang.Iterable<java.lang.String> iterableKWHzl = KWHzl(tannotationAEQbTJ, true);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        java.util.Iterator<java.lang.String> it2 = iterableKWHzl.iterator();
        while (it2.hasNext()) {
            AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType = EZpvd.get(it2.next());
            if (annotationQualifierApplicabilityType != null) {
                linkedHashSet.add(annotationQualifierApplicabilityType);
            }
        }
        return new kotlin.Pair<>(next, EZpvd((java.util.Set<? extends AnnotationQualifierApplicabilityType>) linkedHashSet));
    }

    public final boolean gEmmrt(@NotNull TAnnotation tannotation) {
        Intrinsics.checkNotNullParameter(tannotation, "");
        TAnnotation tannotationAEQbTJ = AEQbTJ(tannotation, yMB.Application.zuWLRA);
        if (tannotationAEQbTJ == null) {
            return false;
        }
        java.lang.Iterable<java.lang.String> iterableKWHzl = KWHzl(tannotationAEQbTJ, false);
        if ((iterableKWHzl instanceof java.util.Collection) && ((java.util.Collection) iterableKWHzl).isEmpty()) {
            return false;
        }
        java.util.Iterator<java.lang.String> it = iterableKWHzl.iterator();
        while (it.hasNext()) {
            if (Intrinsics.EZpvd((java.lang.Object) it.next(), (java.lang.Object) CredentialProviderBaseController.TYPE_TAG)) {
                return true;
            }
        }
        return false;
    }

    public final ReportLevel djBIcL(TAnnotation tannotation) {
        ReportLevel reportLevelAYXKKw = AYXKKw(tannotation);
        return reportLevelAYXKKw != null ? reportLevelAYXKKw : this.KWHzl.copydefault().EZpvd();
    }

    public final ReportLevel AYXKKw(TAnnotation tannotation) {
        java.lang.Iterable<java.lang.String> iterableKWHzl;
        java.lang.String str;
        ReportLevel reportLevel = this.KWHzl.copydefault().OLrzqt().get(OLrzqt(tannotation));
        if (reportLevel != null) {
            return reportLevel;
        }
        TAnnotation tannotationAEQbTJ = AEQbTJ(tannotation, yRC.fJNWhG());
        if (tannotationAEQbTJ != null && (iterableKWHzl = KWHzl(tannotationAEQbTJ, false)) != null && (str = (java.lang.String) CollectionsKt___CollectionsKt.RcXXUw(iterableKWHzl)) != null) {
            ReportLevel reportLevelCopydefault = this.KWHzl.copydefault().copydefault();
            if (reportLevelCopydefault != null) {
                return reportLevelCopydefault;
            }
            int iHashCode = str.hashCode();
            if (iHashCode != -2137067054) {
                if (iHashCode != -1838656823) {
                    if (iHashCode == 2656902 && str.equals("WARN")) {
                        return ReportLevel.WARN;
                    }
                } else if (str.equals("STRICT")) {
                    return ReportLevel.STRICT;
                }
            } else if (str.equals("IGNORE")) {
                return ReportLevel.IGNORE;
            }
        }
        return null;
    }

    public final C56858yUy copydefault(TAnnotation tannotation, Function1<? super TAnnotation, java.lang.Boolean> function1) {
        C56858yUy c56858yUyAEQbTJ;
        C56858yUy c56858yUyAEQbTJ2 = AEQbTJ(tannotation, function1.invoke(tannotation).booleanValue());
        if (c56858yUyAEQbTJ2 != null) {
            return c56858yUyAEQbTJ2;
        }
        TAnnotation tannotationAkhnZx = AkhnZx(tannotation);
        if (tannotationAkhnZx == null) {
            return null;
        }
        ReportLevel reportLevelDjBIcL = djBIcL(tannotation);
        if (reportLevelDjBIcL.isIgnore() || (c56858yUyAEQbTJ = AEQbTJ(tannotationAkhnZx, function1.invoke(tannotationAkhnZx).booleanValue())) == null) {
            return null;
        }
        return C56858yUy.copy$default(c56858yUyAEQbTJ, null, reportLevelDjBIcL.isWarning(), 1, null);
    }

    public final C56766yRn copydefault(TAnnotation tannotation) {
        C56858yUy c56858yUyCopydefault;
        C56766yRn c56766yRnDbNXlk = DbNXlk(tannotation);
        if (c56766yRnDbNXlk != null) {
            return c56766yRnDbNXlk;
        }
        kotlin.Pair<TAnnotation, java.util.Set<AnnotationQualifierApplicabilityType>> pairIsConnected = isConnected(tannotation);
        if (pairIsConnected == null) {
            return null;
        }
        TAnnotation tannotationComponent1 = pairIsConnected.component1();
        java.util.Set<AnnotationQualifierApplicabilityType> setComponent2 = pairIsConnected.component2();
        ReportLevel reportLevelAYXKKw = AYXKKw(tannotation);
        if (reportLevelAYXKKw == null) {
            reportLevelAYXKKw = djBIcL(tannotationComponent1);
        }
        if (reportLevelAYXKKw.isIgnore() || (c56858yUyCopydefault = copydefault(tannotationComponent1, yQZ.OLrzqt)) == null) {
            return null;
        }
        return new C56766yRn(C56858yUy.copy$default(c56858yUyCopydefault, null, reportLevelAYXKKw.isWarning(), 1, null), setComponent2, false, 4, null);
    }

    public final C56774yRv AEQbTJ(C56774yRv c56774yRv, @NotNull java.lang.Iterable<? extends TAnnotation> iterable) {
        EnumMap<AnnotationQualifierApplicabilityType, C56766yRn> enumMapKWHzl;
        Intrinsics.checkNotNullParameter(iterable, "");
        if (this.KWHzl.OLrzqt()) {
            return c56774yRv;
        }
        java.util.ArrayList<C56766yRn> arrayList = new java.util.ArrayList();
        java.util.Iterator<? extends TAnnotation> it = iterable.iterator();
        while (it.hasNext()) {
            C56766yRn c56766yRnCopydefault = copydefault(it.next());
            if (c56766yRnCopydefault != null) {
                arrayList.add(c56766yRnCopydefault);
            }
        }
        if (arrayList.isEmpty()) {
            return c56774yRv;
        }
        EnumMap enumMap = new EnumMap(AnnotationQualifierApplicabilityType.class);
        for (C56766yRn c56766yRn : arrayList) {
            for (AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType : c56766yRn.EZpvd()) {
                if (!enumMap.containsKey(annotationQualifierApplicabilityType) || !KWHzl()) {
                    enumMap.put(annotationQualifierApplicabilityType, c56766yRn);
                } else {
                    C56766yRn c56766yRn2 = (C56766yRn) enumMap.get(annotationQualifierApplicabilityType);
                    if (c56766yRn2 != null) {
                        C56858yUy c56858yUyOLrzqt = c56766yRn2.OLrzqt();
                        C56858yUy c56858yUyOLrzqt2 = c56766yRn.OLrzqt();
                        if (!Intrinsics.EZpvd(c56858yUyOLrzqt2, c56858yUyOLrzqt) && (!c56858yUyOLrzqt2.copydefault() || c56858yUyOLrzqt.copydefault())) {
                            c56766yRn2 = (c56858yUyOLrzqt2.copydefault() || !c56858yUyOLrzqt.copydefault()) ? null : c56766yRn;
                        }
                        enumMap.put(annotationQualifierApplicabilityType, c56766yRn2);
                    }
                }
            }
        }
        EnumMap enumMap2 = (c56774yRv == null || (enumMapKWHzl = c56774yRv.KWHzl()) == null) ? new EnumMap(AnnotationQualifierApplicabilityType.class) : new EnumMap((EnumMap) enumMapKWHzl);
        boolean z = false;
        for (Map.Entry entry : enumMap.entrySet()) {
            AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType2 = (AnnotationQualifierApplicabilityType) entry.getKey();
            C56766yRn c56766yRn3 = (C56766yRn) entry.getValue();
            if (c56766yRn3 != null) {
                enumMap2.put(annotationQualifierApplicabilityType2, c56766yRn3);
                z = true;
            }
        }
        return !z ? c56774yRv : new C56774yRv(enumMap2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0068, code lost:
    
        if (r6.equals("ALWAYS") != false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007d, code lost:
    
        if (r6.equals("NEVER") == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0086, code lost:
    
        if (r6.equals("MAYBE") == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0089, code lost:
    
        r6 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NULLABLE;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C56858yUy AEQbTJ(TAnnotation tannotation, boolean z) {
        NullabilityQualifier nullabilityQualifier;
        C56933yXs c56933yXsOLrzqt = OLrzqt(tannotation);
        if (c56933yXsOLrzqt == null) {
            return null;
        }
        ReportLevel reportLevelInvoke = this.KWHzl.AEQbTJ().invoke(c56933yXsOLrzqt);
        if (reportLevelInvoke.isIgnore()) {
            return null;
        }
        if (yRC.fetchVPNInfo().contains(c56933yXsOLrzqt)) {
            nullabilityQualifier = NullabilityQualifier.NOT_NULL;
        } else if (yRC.isConnected().contains(c56933yXsOLrzqt)) {
            nullabilityQualifier = NullabilityQualifier.NULLABLE;
        } else if (yRC.AEQbTJ().contains(c56933yXsOLrzqt)) {
            nullabilityQualifier = NullabilityQualifier.FORCE_FLEXIBILITY;
        } else {
            if (!Intrinsics.EZpvd(c56933yXsOLrzqt, yRC.EZpvd())) {
                return null;
            }
            java.lang.String str = (java.lang.String) CollectionsKt___CollectionsKt.RcXXUw(KWHzl(tannotation, false));
            if (str != null) {
                switch (str.hashCode()) {
                    case 73135176:
                        break;
                    case 74175084:
                        break;
                    case 433141802:
                        if (str.equals("UNKNOWN")) {
                            nullabilityQualifier = NullabilityQualifier.FORCE_FLEXIBILITY;
                        }
                        break;
                    case 1933739535:
                        break;
                }
                return null;
            }
            nullabilityQualifier = NullabilityQualifier.NOT_NULL;
        }
        return new C56858yUy(nullabilityQualifier, reportLevelInvoke.isWarning() || z);
    }

    /* JADX INFO: renamed from: o.yRa$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.yRa.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType : AnnotationQualifierApplicabilityType.values()) {
            java.lang.String javaTarget = annotationQualifierApplicabilityType.getJavaTarget();
            if (linkedHashMap.get(javaTarget) == null) {
                linkedHashMap.put(javaTarget, annotationQualifierApplicabilityType);
            }
        }
        EZpvd = linkedHashMap;
    }

    public final C56858yUy EZpvd(@NotNull java.lang.Iterable<? extends TAnnotation> iterable, @NotNull Function1<? super TAnnotation, java.lang.Boolean> function1) {
        Intrinsics.checkNotNullParameter(iterable, "");
        Intrinsics.checkNotNullParameter(function1, "");
        java.util.Iterator<? extends TAnnotation> it = iterable.iterator();
        C56858yUy c56858yUy = null;
        while (it.hasNext()) {
            C56858yUy c56858yUyCopydefault = copydefault(it.next(), function1);
            if (c56858yUy != null) {
                if (c56858yUyCopydefault != null && !Intrinsics.EZpvd(c56858yUyCopydefault, c56858yUy) && (!c56858yUyCopydefault.copydefault() || c56858yUy.copydefault())) {
                    if (c56858yUyCopydefault.copydefault() || !c56858yUy.copydefault()) {
                        return null;
                    }
                }
            }
            c56858yUy = c56858yUyCopydefault;
        }
        return c56858yUy;
    }

    public final MutabilityQualifier KWHzl(@NotNull java.lang.Iterable<? extends TAnnotation> iterable) {
        MutabilityQualifier mutabilityQualifier;
        Intrinsics.checkNotNullParameter(iterable, "");
        java.util.Iterator<? extends TAnnotation> it = iterable.iterator();
        MutabilityQualifier mutabilityQualifier2 = null;
        while (it.hasNext()) {
            C56933yXs c56933yXsOLrzqt = OLrzqt(it.next());
            if (CollectionsKt___CollectionsKt.KWHzl((java.lang.Iterable<? extends C56933yXs>) ((java.lang.Iterable<? extends java.lang.Object>) yRC.AkhnZx()), c56933yXsOLrzqt)) {
                mutabilityQualifier = MutabilityQualifier.READ_ONLY;
            } else if (CollectionsKt___CollectionsKt.KWHzl((java.lang.Iterable<? extends C56933yXs>) ((java.lang.Iterable<? extends java.lang.Object>) yRC.values()), c56933yXsOLrzqt)) {
                mutabilityQualifier = MutabilityQualifier.MUTABLE;
            } else {
                continue;
            }
            if (mutabilityQualifier2 != null && mutabilityQualifier2 != mutabilityQualifier) {
                return null;
            }
            mutabilityQualifier2 = mutabilityQualifier;
        }
        return mutabilityQualifier2;
    }
}
