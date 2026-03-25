package o;

import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier;
import kotlin.reflect.jvm.internal.impl.types.model.TypeVariance;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yUt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public abstract class AbstractC56853yUt<TAnnotation> {
    public abstract C56774yRv AEQbTJ();

    public abstract C56858yUy AEQbTJ(C56858yUy c56858yUy, C56766yRn c56766yRn);

    public abstract C56930yXp AEQbTJ(@NotNull InterfaceC59382zfw interfaceC59382zfw);

    public abstract boolean AEQbTJ(@NotNull InterfaceC59382zfw interfaceC59382zfw, @NotNull InterfaceC59382zfw interfaceC59382zfw2);

    public abstract boolean AEQbTJ(@NotNull InterfaceC59383zfx interfaceC59383zfx);

    public boolean AYXKKw() {
        return false;
    }

    public abstract boolean AhwBna();

    public abstract AbstractC56753yRa<TAnnotation> EZpvd();

    public abstract java.lang.Iterable<TAnnotation> KWHzl();

    public abstract java.lang.Iterable<TAnnotation> KWHzl(@NotNull InterfaceC59382zfw interfaceC59382zfw);

    public abstract boolean KWHzl(@NotNull TAnnotation tannotation, InterfaceC59382zfw interfaceC59382zfw);

    public abstract AnnotationQualifierApplicabilityType OLrzqt();

    public abstract InterfaceC59382zfw OLrzqt(@NotNull InterfaceC59382zfw interfaceC59382zfw);

    public abstract boolean copydefault();

    public abstract boolean djBIcL();

    public abstract boolean gEmmrt();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean gEmmrt(@NotNull InterfaceC59382zfw interfaceC59382zfw) {
        Intrinsics.checkNotNullParameter(interfaceC59382zfw, "");
        return false;
    }

    public abstract InterfaceC59384zfy valueOf();

    public abstract boolean valueOf(@NotNull InterfaceC59382zfw interfaceC59382zfw);

    public final NullabilityQualifier copydefault(InterfaceC59382zfw interfaceC59382zfw) {
        InterfaceC59384zfy interfaceC59384zfyValueOf = valueOf();
        if (interfaceC59384zfyValueOf.values((InterfaceC59382zfw) interfaceC59384zfyValueOf.fJNWhG(interfaceC59382zfw))) {
            return NullabilityQualifier.NULLABLE;
        }
        if (interfaceC59384zfyValueOf.values((InterfaceC59382zfw) interfaceC59384zfyValueOf.getNewProxyInstance(interfaceC59382zfw))) {
            return null;
        }
        return NullabilityQualifier.NOT_NULL;
    }

    public final C56857yUx EZpvd(InterfaceC59382zfw interfaceC59382zfw) {
        NullabilityQualifier nullabilityQualifierCopydefault;
        NullabilityQualifier nullabilityQualifierCopydefault2 = copydefault(interfaceC59382zfw);
        MutabilityQualifier mutabilityQualifier = null;
        if (nullabilityQualifierCopydefault2 == null) {
            InterfaceC59382zfw interfaceC59382zfwOLrzqt = OLrzqt(interfaceC59382zfw);
            nullabilityQualifierCopydefault = interfaceC59382zfwOLrzqt != null ? copydefault(interfaceC59382zfwOLrzqt) : null;
        } else {
            nullabilityQualifierCopydefault = nullabilityQualifierCopydefault2;
        }
        InterfaceC59384zfy interfaceC59384zfyValueOf = valueOf();
        yML yml = yML.OLrzqt;
        if (yml.OLrzqt(AEQbTJ(interfaceC59384zfyValueOf.fJNWhG(interfaceC59382zfw)))) {
            mutabilityQualifier = MutabilityQualifier.READ_ONLY;
        } else if (yml.copydefault(AEQbTJ(interfaceC59384zfyValueOf.getNewProxyInstance(interfaceC59382zfw)))) {
            mutabilityQualifier = MutabilityQualifier.MUTABLE;
        }
        return new C56857yUx(nullabilityQualifierCopydefault, mutabilityQualifier, valueOf().AhwBna(interfaceC59382zfw) || gEmmrt(interfaceC59382zfw), nullabilityQualifierCopydefault != nullabilityQualifierCopydefault2);
    }

    public final C56857yUx AEQbTJ(Application application) {
        java.lang.Iterable<? extends TAnnotation> iterableAhwBna;
        AnnotationQualifierApplicabilityType annotationQualifierApplicabilityTypeOLrzqt;
        C56858yUy c56858yUyEZpvd;
        InterfaceC59382zfw interfaceC59382zfwOLrzqt;
        InterfaceC59385zfz interfaceC59385zfzIwGUEr;
        if (application.OLrzqt() == null) {
            InterfaceC59384zfy interfaceC59384zfyValueOf = valueOf();
            InterfaceC59383zfx interfaceC59383zfxKWHzl = application.KWHzl();
            if ((interfaceC59383zfxKWHzl != null ? interfaceC59384zfyValueOf.AEQbTJ(interfaceC59383zfxKWHzl) : null) == TypeVariance.IN) {
                return C56857yUx.copydefault.EZpvd();
            }
        }
        boolean z = false;
        boolean z2 = application.KWHzl() == null;
        InterfaceC59382zfw interfaceC59382zfwOLrzqt2 = application.OLrzqt();
        if (interfaceC59382zfwOLrzqt2 == null || (iterableAhwBna = KWHzl(interfaceC59382zfwOLrzqt2)) == null) {
            iterableAhwBna = yDY.AhwBna();
        }
        InterfaceC59384zfy interfaceC59384zfyValueOf2 = valueOf();
        InterfaceC59382zfw interfaceC59382zfwOLrzqt3 = application.OLrzqt();
        InterfaceC59383zfx interfaceC59383zfxCopydefault = (interfaceC59382zfwOLrzqt3 == null || (interfaceC59385zfzIwGUEr = interfaceC59384zfyValueOf2.iwGUEr(interfaceC59382zfwOLrzqt3)) == null) ? null : interfaceC59384zfyValueOf2.copydefault(interfaceC59385zfzIwGUEr);
        boolean z3 = OLrzqt() == AnnotationQualifierApplicabilityType.TYPE_PARAMETER_BOUNDS;
        if (z2) {
            if (!z3 && AhwBna() && (interfaceC59382zfwOLrzqt = application.OLrzqt()) != null && valueOf(interfaceC59382zfwOLrzqt)) {
                java.lang.Iterable<TAnnotation> iterableKWHzl = KWHzl();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (TAnnotation tannotation : iterableKWHzl) {
                    if (!EZpvd().gEmmrt(tannotation)) {
                        arrayList.add(tannotation);
                    }
                }
                iterableAhwBna = CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) arrayList, (java.lang.Iterable) iterableAhwBna);
            } else {
                iterableAhwBna = CollectionsKt___CollectionsKt.valueOf(KWHzl(), iterableAhwBna);
            }
        }
        MutabilityQualifier mutabilityQualifierKWHzl = EZpvd().KWHzl((java.lang.Iterable) iterableAhwBna);
        C56858yUy c56858yUyEZpvd2 = EZpvd().EZpvd(iterableAhwBna, new C56850yUq(this, application));
        if (c56858yUyEZpvd2 != null) {
            NullabilityQualifier nullabilityQualifierOLrzqt = c56858yUyEZpvd2.OLrzqt();
            if (c56858yUyEZpvd2.OLrzqt() == NullabilityQualifier.NOT_NULL && interfaceC59383zfxCopydefault != null) {
                z = true;
            }
            return new C56857yUx(nullabilityQualifierOLrzqt, mutabilityQualifierKWHzl, z, c56858yUyEZpvd2.copydefault());
        }
        if (z2 || z3) {
            annotationQualifierApplicabilityTypeOLrzqt = OLrzqt();
        } else {
            annotationQualifierApplicabilityTypeOLrzqt = AnnotationQualifierApplicabilityType.TYPE_USE;
        }
        C56774yRv c56774yRvAEQbTJ = application.AEQbTJ();
        C56766yRn c56766yRnAEQbTJ = c56774yRvAEQbTJ != null ? c56774yRvAEQbTJ.AEQbTJ(annotationQualifierApplicabilityTypeOLrzqt) : null;
        C56858yUy c56858yUyEZpvd3 = interfaceC59383zfxCopydefault != null ? EZpvd(interfaceC59383zfxCopydefault) : null;
        C56858yUy c56858yUyAEQbTJ = AEQbTJ(c56858yUyEZpvd3, c56766yRnAEQbTJ);
        boolean z4 = (c56858yUyEZpvd3 != null ? c56858yUyEZpvd3.OLrzqt() : null) == NullabilityQualifier.NOT_NULL || !(interfaceC59383zfxCopydefault == null || c56766yRnAEQbTJ == null || !c56766yRnAEQbTJ.AEQbTJ());
        InterfaceC59383zfx interfaceC59383zfxKWHzl2 = application.KWHzl();
        if (interfaceC59383zfxKWHzl2 == null || (c56858yUyEZpvd = EZpvd(interfaceC59383zfxKWHzl2)) == null) {
            c56858yUyEZpvd = null;
        } else if (c56858yUyEZpvd.OLrzqt() == NullabilityQualifier.NULLABLE) {
            c56858yUyEZpvd = C56858yUy.copy$default(c56858yUyEZpvd, NullabilityQualifier.FORCE_FLEXIBILITY, false, 2, null);
        }
        C56858yUy c56858yUyCopydefault = copydefault(c56858yUyEZpvd, c56858yUyAEQbTJ);
        NullabilityQualifier nullabilityQualifierOLrzqt2 = c56858yUyCopydefault != null ? c56858yUyCopydefault.OLrzqt() : null;
        if (c56858yUyCopydefault != null && c56858yUyCopydefault.copydefault()) {
            z = true;
        }
        return new C56857yUx(nullabilityQualifierOLrzqt2, mutabilityQualifierKWHzl, z4, z);
    }

    public static final boolean AEQbTJ(AbstractC56853yUt abstractC56853yUt, Application application, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return abstractC56853yUt.KWHzl(obj, application.OLrzqt());
    }

    public final C56858yUy copydefault(C56858yUy c56858yUy, C56858yUy c56858yUy2) {
        return c56858yUy == null ? c56858yUy2 : c56858yUy2 == null ? c56858yUy : (!c56858yUy.copydefault() || c56858yUy2.copydefault()) ? (c56858yUy.copydefault() || !c56858yUy2.copydefault()) ? (c56858yUy.OLrzqt().compareTo(c56858yUy2.OLrzqt()) >= 0 && c56858yUy.OLrzqt().compareTo(c56858yUy2.OLrzqt()) > 0) ? c56858yUy : c56858yUy2 : c56858yUy : c56858yUy2;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C56858yUy EZpvd(InterfaceC59383zfx interfaceC59383zfx) {
        java.util.List<InterfaceC59382zfw> arrayList;
        NullabilityQualifier nullabilityQualifier;
        java.util.Iterator<T> it;
        InterfaceC59384zfy interfaceC59384zfyValueOf = valueOf();
        if (!AEQbTJ(interfaceC59383zfx)) {
            return null;
        }
        java.util.List<InterfaceC59382zfw> listCopydefault = interfaceC59384zfyValueOf.copydefault(interfaceC59383zfx);
        boolean z = listCopydefault instanceof java.util.Collection;
        if (z && listCopydefault.isEmpty()) {
            return null;
        }
        java.util.Iterator<T> it2 = listCopydefault.iterator();
        while (it2.hasNext()) {
            if (!interfaceC59384zfyValueOf.isConnected((InterfaceC59382zfw) it2.next())) {
                if (!z || !listCopydefault.isEmpty()) {
                    java.util.Iterator<T> it3 = listCopydefault.iterator();
                    while (it3.hasNext()) {
                        if (copydefault((InterfaceC59382zfw) it3.next()) != null) {
                            arrayList = listCopydefault;
                            break;
                        }
                    }
                    if (!z && listCopydefault.isEmpty()) {
                        return null;
                    }
                    it = listCopydefault.iterator();
                    while (it.hasNext()) {
                        if (OLrzqt((InterfaceC59382zfw) it.next()) != null) {
                            arrayList = new java.util.ArrayList<>();
                            java.util.Iterator<T> it4 = listCopydefault.iterator();
                            while (it4.hasNext()) {
                                InterfaceC59382zfw interfaceC59382zfwOLrzqt = OLrzqt((InterfaceC59382zfw) it4.next());
                                if (interfaceC59382zfwOLrzqt != null) {
                                    arrayList.add(interfaceC59382zfwOLrzqt);
                                }
                            }
                        }
                    }
                    return null;
                }
                if (!z) {
                }
                it = listCopydefault.iterator();
                while (it.hasNext()) {
                }
                return null;
                if ((arrayList instanceof java.util.Collection) && arrayList.isEmpty()) {
                    nullabilityQualifier = NullabilityQualifier.NULLABLE;
                } else {
                    java.util.Iterator<T> it5 = arrayList.iterator();
                    while (it5.hasNext()) {
                        if (!interfaceC59384zfyValueOf.fIwbmz((InterfaceC59382zfw) it5.next())) {
                            nullabilityQualifier = NullabilityQualifier.NOT_NULL;
                            break;
                        }
                    }
                    nullabilityQualifier = NullabilityQualifier.NULLABLE;
                }
                return new C56858yUy(nullabilityQualifier, arrayList != listCopydefault);
            }
        }
        return null;
    }

    public final Function1<java.lang.Integer, C56857yUx> OLrzqt(@NotNull InterfaceC59382zfw interfaceC59382zfw, @NotNull java.lang.Iterable<? extends InterfaceC59382zfw> iterable, yVF yvf, boolean z) {
        int size;
        InterfaceC59382zfw interfaceC59382zfwOLrzqt;
        Intrinsics.checkNotNullParameter(interfaceC59382zfw, "");
        Intrinsics.checkNotNullParameter(iterable, "");
        java.util.List<Application> listDjBIcL = djBIcL(interfaceC59382zfw);
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(iterable, 10));
        java.util.Iterator<? extends InterfaceC59382zfw> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(djBIcL(it.next()));
        }
        if (AYXKKw()) {
            size = 1;
            break;
        }
        if (djBIcL() && (!(iterable instanceof java.util.Collection) || !((java.util.Collection) iterable).isEmpty())) {
            java.util.Iterator<? extends InterfaceC59382zfw> it2 = iterable.iterator();
            while (it2.hasNext()) {
                if (!AEQbTJ(interfaceC59382zfw, it2.next())) {
                    size = 1;
                    break;
                }
            }
        }
        size = listDjBIcL.size();
        C56857yUx[] c56857yUxArr = new C56857yUx[size];
        int i = 0;
        while (i < size) {
            C56857yUx c56857yUxAEQbTJ = AEQbTJ(listDjBIcL.get(i));
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                Application application = (Application) CollectionsKt___CollectionsKt.AkhnZx((java.util.List) it3.next(), i);
                C56857yUx c56857yUxEZpvd = (application == null || (interfaceC59382zfwOLrzqt = application.OLrzqt()) == null) ? null : EZpvd(interfaceC59382zfwOLrzqt);
                if (c56857yUxEZpvd != null) {
                    arrayList2.add(c56857yUxEZpvd);
                }
            }
            c56857yUxArr[i] = yVE.EZpvd(c56857yUxAEQbTJ, arrayList2, i == 0 && djBIcL(), i == 0 && copydefault(), z);
            i++;
        }
        return new C56852yUs(yvf, c56857yUxArr);
    }

    public static final C56857yUx OLrzqt(yVF yvf, C56857yUx[] c56857yUxArr, int i) {
        java.util.Map<java.lang.Integer, C56857yUx> mapAEQbTJ;
        C56857yUx c56857yUx;
        return (yvf == null || (mapAEQbTJ = yvf.AEQbTJ()) == null || (c56857yUx = mapAEQbTJ.get(java.lang.Integer.valueOf(i))) == null) ? (i < 0 || i >= c56857yUxArr.length) ? C56857yUx.copydefault.EZpvd() : c56857yUxArr[i] : c56857yUx;
    }

    public final <T> void KWHzl(T t, java.util.List<T> list, Function1<? super T, ? extends java.lang.Iterable<? extends T>> function1) {
        list.add(t);
        java.lang.Iterable<? extends T> iterableInvoke = function1.invoke(t);
        if (iterableInvoke != null) {
            java.util.Iterator<? extends T> it = iterableInvoke.iterator();
            while (it.hasNext()) {
                KWHzl(it.next(), list, function1);
            }
        }
    }

    public final <T> java.util.List<T> KWHzl(T t, Function1<? super T, ? extends java.lang.Iterable<? extends T>> function1) {
        java.util.ArrayList arrayList = new java.util.ArrayList(1);
        KWHzl(t, arrayList, function1);
        return arrayList;
    }

    public final C56774yRv AEQbTJ(InterfaceC59382zfw interfaceC59382zfw, C56774yRv c56774yRv) {
        return EZpvd().AEQbTJ(c56774yRv, KWHzl(interfaceC59382zfw));
    }

    /* JADX DEBUG: Type inference failed for r5v2. Raw type applied. Possible types: java.util.List<T>, java.util.List<o.yUt$Application> */
    public final java.util.List<Application> djBIcL(InterfaceC59382zfw interfaceC59382zfw) {
        return KWHzl(new Application(interfaceC59382zfw, AEQbTJ(interfaceC59382zfw, AEQbTJ()), null), new C56851yUr(this, valueOf()));
    }

    public static final java.lang.Iterable AEQbTJ(AbstractC56853yUt abstractC56853yUt, InterfaceC59384zfy interfaceC59384zfy, Application application) {
        InterfaceC59382zfw interfaceC59382zfwOLrzqt;
        InterfaceC59385zfz interfaceC59385zfzIwGUEr;
        java.util.List<InterfaceC59383zfx> listEZpvd;
        Application application2;
        InterfaceC59382zfw interfaceC59382zfwOLrzqt2;
        Intrinsics.checkNotNullParameter(application, "");
        if ((abstractC56853yUt.gEmmrt() && (interfaceC59382zfwOLrzqt2 = application.OLrzqt()) != null && interfaceC59384zfy.ejfBZ(interfaceC59382zfwOLrzqt2)) || (interfaceC59382zfwOLrzqt = application.OLrzqt()) == null || (interfaceC59385zfzIwGUEr = interfaceC59384zfy.iwGUEr(interfaceC59382zfwOLrzqt)) == null || (listEZpvd = interfaceC59384zfy.EZpvd(interfaceC59385zfzIwGUEr)) == null) {
            return null;
        }
        java.util.List<InterfaceC59334zfA> listAYXKKw = interfaceC59384zfy.AYXKKw(application.OLrzqt());
        java.util.Iterator<T> it = listEZpvd.iterator();
        java.util.Iterator<T> it2 = listAYXKKw.iterator();
        java.util.ArrayList arrayList = new java.util.ArrayList(java.lang.Math.min(C56403yEb.AYXKKw(listEZpvd, 10), C56403yEb.AYXKKw(listAYXKKw, 10)));
        while (it.hasNext() && it2.hasNext()) {
            InterfaceC59383zfx interfaceC59383zfx = (InterfaceC59383zfx) it.next();
            InterfaceC59382zfw interfaceC59382zfwOLrzqt3 = interfaceC59384zfy.OLrzqt((InterfaceC59334zfA) it2.next());
            if (interfaceC59382zfwOLrzqt3 == null) {
                application2 = new Application(null, application.AEQbTJ(), interfaceC59383zfx);
            } else {
                application2 = new Application(interfaceC59382zfwOLrzqt3, abstractC56853yUt.AEQbTJ(interfaceC59382zfwOLrzqt3, application.AEQbTJ()), interfaceC59383zfx);
            }
            arrayList.add(application2);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: o.yUt$Application */
    public static final class Application {
        public final C56774yRv AEQbTJ;
        public final InterfaceC59382zfw EZpvd;
        public final InterfaceC59383zfx KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C56774yRv AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final InterfaceC59383zfx KWHzl() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final InterfaceC59382zfw OLrzqt() {
            return this.EZpvd;
        }

        public Application(InterfaceC59382zfw interfaceC59382zfw, C56774yRv c56774yRv, InterfaceC59383zfx interfaceC59383zfx) {
            this.EZpvd = interfaceC59382zfw;
            this.AEQbTJ = c56774yRv;
            this.KWHzl = interfaceC59383zfx;
        }
    }
}
