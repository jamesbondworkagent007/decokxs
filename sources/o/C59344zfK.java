package o;

import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zfK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C59344zfK {

    /* JADX INFO: renamed from: o.zfK$ActionBar */
    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[Variance.values().length];
            try {
                iArr[Variance.INVARIANT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[Variance.IN_VARIANCE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[Variance.OUT_VARIANCE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            KWHzl = iArr;
        }
    }

    public static final InterfaceC59317zek KWHzl(C59349zfP c59349zfP) {
        c59349zfP.OLrzqt();
        if (!Intrinsics.EZpvd(c59349zfP.copydefault(), c59349zfP.KWHzl())) {
            Variance varianceValues = c59349zfP.AEQbTJ().values();
            Variance variance = Variance.IN_VARIANCE;
            if (varianceValues != variance) {
                if (!AbstractC56640yMw.valueOf(c59349zfP.copydefault()) || c59349zfP.AEQbTJ().values() == variance) {
                    return AbstractC56640yMw.djBIcL(c59349zfP.KWHzl()) ? new C59323zeq(KWHzl(c59349zfP, variance), c59349zfP.copydefault()) : new C59323zeq(KWHzl(c59349zfP, Variance.OUT_VARIANCE), c59349zfP.KWHzl());
                }
                return new C59323zeq(KWHzl(c59349zfP, Variance.OUT_VARIANCE), c59349zfP.KWHzl());
            }
        }
        return new C59323zeq(c59349zfP.copydefault());
    }

    public static final Variance KWHzl(C59349zfP c59349zfP, Variance variance) {
        return variance == c59349zfP.AEQbTJ().values() ? Variance.INVARIANT : variance;
    }

    public static final C59349zfP copydefault(InterfaceC59317zek interfaceC59317zek, InterfaceC56691yOt interfaceC56691yOt) {
        int i = ActionBar.KWHzl[TypeSubstitutor.KWHzl(interfaceC56691yOt.values(), interfaceC59317zek).ordinal()];
        if (i == 1) {
            AbstractC59233zdF abstractC59233zdFOLrzqt = interfaceC59317zek.OLrzqt();
            Intrinsics.checkNotNullExpressionValue(abstractC59233zdFOLrzqt, "");
            AbstractC59233zdF abstractC59233zdFOLrzqt2 = interfaceC59317zek.OLrzqt();
            Intrinsics.checkNotNullExpressionValue(abstractC59233zdFOLrzqt2, "");
            return new C59349zfP(interfaceC56691yOt, abstractC59233zdFOLrzqt, abstractC59233zdFOLrzqt2);
        }
        if (i == 2) {
            AbstractC59233zdF abstractC59233zdFOLrzqt3 = interfaceC59317zek.OLrzqt();
            Intrinsics.checkNotNullExpressionValue(abstractC59233zdFOLrzqt3, "");
            AbstractC59242zdO abstractC59242zdOIwGUEr = yZE.AEQbTJ(interfaceC56691yOt).iwGUEr();
            Intrinsics.checkNotNullExpressionValue(abstractC59242zdOIwGUEr, "");
            return new C59349zfP(interfaceC56691yOt, abstractC59233zdFOLrzqt3, abstractC59242zdOIwGUEr);
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        AbstractC59242zdO fieldNames = yZE.AEQbTJ(interfaceC56691yOt).getFieldNames();
        Intrinsics.checkNotNullExpressionValue(fieldNames, "");
        AbstractC59233zdF abstractC59233zdFOLrzqt4 = interfaceC59317zek.OLrzqt();
        Intrinsics.checkNotNullExpressionValue(abstractC59233zdFOLrzqt4, "");
        return new C59349zfP(interfaceC56691yOt, fieldNames, abstractC59233zdFOLrzqt4);
    }

    public static final InterfaceC59317zek OLrzqt(InterfaceC59317zek interfaceC59317zek, boolean z) {
        if (interfaceC59317zek == null) {
            return null;
        }
        if (interfaceC59317zek.AEQbTJ()) {
            return interfaceC59317zek;
        }
        AbstractC59233zdF abstractC59233zdFOLrzqt = interfaceC59317zek.OLrzqt();
        Intrinsics.checkNotNullExpressionValue(abstractC59233zdFOLrzqt, "");
        if (!C59322zep.OLrzqt(abstractC59233zdFOLrzqt, C59347zfN.AEQbTJ)) {
            return interfaceC59317zek;
        }
        Variance varianceEZpvd = interfaceC59317zek.EZpvd();
        Intrinsics.checkNotNullExpressionValue(varianceEZpvd, "");
        if (varianceEZpvd == Variance.OUT_VARIANCE) {
            return new C59323zeq(varianceEZpvd, copydefault(abstractC59233zdFOLrzqt).AEQbTJ());
        }
        if (z) {
            return new C59323zeq(varianceEZpvd, copydefault(abstractC59233zdFOLrzqt).copydefault());
        }
        return EZpvd(interfaceC59317zek);
    }

    public static final java.lang.Boolean EZpvd(AbstractC59331zey abstractC59331zey) {
        Intrinsics.copydefault(abstractC59331zey);
        return java.lang.Boolean.valueOf(yYX.OLrzqt(abstractC59331zey));
    }

    public static final InterfaceC59317zek EZpvd(InterfaceC59317zek interfaceC59317zek) {
        TypeSubstitutor typeSubstitutorEZpvd = TypeSubstitutor.EZpvd(new Activity());
        Intrinsics.checkNotNullExpressionValue(typeSubstitutorEZpvd, "");
        return typeSubstitutorEZpvd.AEQbTJ(interfaceC59317zek);
    }

    /* JADX INFO: renamed from: o.zfK$Activity */
    public static final class Activity extends AbstractC59316zej {
        @Override // o.AbstractC59316zej
        public InterfaceC59317zek AEQbTJ(InterfaceC59315zei interfaceC59315zei) {
            Intrinsics.checkNotNullParameter(interfaceC59315zei, "");
            yYZ yyz = interfaceC59315zei instanceof yYZ ? (yYZ) interfaceC59315zei : null;
            if (yyz == null) {
                return null;
            }
            if (yyz.AEQbTJ().AEQbTJ()) {
                return new C59323zeq(Variance.OUT_VARIANCE, yyz.AEQbTJ().OLrzqt());
            }
            return yyz.AEQbTJ();
        }
    }

    public static final C59345zfL<AbstractC59233zdF> copydefault(@NotNull AbstractC59233zdF abstractC59233zdF) {
        java.lang.Object objCopydefault;
        Intrinsics.checkNotNullParameter(abstractC59233zdF, "");
        if (C59278zdy.EZpvd(abstractC59233zdF)) {
            C59345zfL<AbstractC59233zdF> c59345zfLCopydefault = copydefault(C59278zdy.KWHzl(abstractC59233zdF));
            C59345zfL<AbstractC59233zdF> c59345zfLCopydefault2 = copydefault(C59278zdy.OLrzqt(abstractC59233zdF));
            return new C59345zfL<>(C59327zeu.copydefault(C59231zdD.copydefault(C59278zdy.KWHzl(c59345zfLCopydefault.copydefault()), C59278zdy.OLrzqt(c59345zfLCopydefault2.copydefault())), abstractC59233zdF), C59327zeu.copydefault(C59231zdD.copydefault(C59278zdy.KWHzl(c59345zfLCopydefault.AEQbTJ()), C59278zdy.OLrzqt(c59345zfLCopydefault2.AEQbTJ())), abstractC59233zdF));
        }
        InterfaceC59315zei interfaceC59315zeiDjBIcL = abstractC59233zdF.djBIcL();
        if (yYX.OLrzqt(abstractC59233zdF)) {
            Intrinsics.copydefault(interfaceC59315zeiDjBIcL, "");
            InterfaceC59317zek interfaceC59317zekAEQbTJ = ((yYZ) interfaceC59315zeiDjBIcL).AEQbTJ();
            AbstractC59233zdF abstractC59233zdFOLrzqt = interfaceC59317zekAEQbTJ.OLrzqt();
            Intrinsics.checkNotNullExpressionValue(abstractC59233zdFOLrzqt, "");
            AbstractC59233zdF abstractC59233zdFKWHzl = KWHzl(abstractC59233zdFOLrzqt, abstractC59233zdF);
            int i = ActionBar.KWHzl[interfaceC59317zekAEQbTJ.EZpvd().ordinal()];
            if (i == 2) {
                return new C59345zfL<>(abstractC59233zdFKWHzl, C59336zfC.copydefault(abstractC59233zdF).iwGUEr());
            }
            if (i == 3) {
                AbstractC59242zdO fieldNames = C59336zfC.copydefault(abstractC59233zdF).getFieldNames();
                Intrinsics.checkNotNullExpressionValue(fieldNames, "");
                return new C59345zfL<>(KWHzl(fieldNames, abstractC59233zdF), abstractC59233zdFKWHzl);
            }
            throw new java.lang.AssertionError("Only nontrivial projections should have been captured, not: " + interfaceC59317zekAEQbTJ);
        }
        if (abstractC59233zdF.bY_().isEmpty() || abstractC59233zdF.bY_().size() != interfaceC59315zeiDjBIcL.copydefault().size()) {
            return new C59345zfL<>(abstractC59233zdF, abstractC59233zdF);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.List<InterfaceC59317zek> listBY_ = abstractC59233zdF.bY_();
        java.util.List<InterfaceC56691yOt> listCopydefault = interfaceC59315zeiDjBIcL.copydefault();
        Intrinsics.checkNotNullExpressionValue(listCopydefault, "");
        for (kotlin.Pair pair : CollectionsKt___CollectionsKt.values(listBY_, listCopydefault)) {
            InterfaceC59317zek interfaceC59317zek = (InterfaceC59317zek) pair.component1();
            InterfaceC56691yOt interfaceC56691yOt = (InterfaceC56691yOt) pair.component2();
            Intrinsics.copydefault(interfaceC56691yOt);
            C59349zfP c59349zfPCopydefault = copydefault(interfaceC59317zek, interfaceC56691yOt);
            if (interfaceC59317zek.AEQbTJ()) {
                arrayList.add(c59349zfPCopydefault);
                arrayList2.add(c59349zfPCopydefault);
            } else {
                C59345zfL<C59349zfP> c59345zfLOLrzqt = OLrzqt(c59349zfPCopydefault);
                C59349zfP c59349zfPKWHzl = c59345zfLOLrzqt.KWHzl();
                C59349zfP c59349zfPEZpvd = c59345zfLOLrzqt.EZpvd();
                arrayList.add(c59349zfPKWHzl);
                arrayList2.add(c59349zfPEZpvd);
            }
        }
        if (arrayList.isEmpty()) {
            objCopydefault = copydefault(abstractC59233zdF, arrayList);
        } else {
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (!((C59349zfP) it.next()).OLrzqt()) {
                    objCopydefault = C59336zfC.copydefault(abstractC59233zdF).getFieldNames();
                    Intrinsics.checkNotNullExpressionValue(objCopydefault, "");
                    break;
                }
            }
            objCopydefault = copydefault(abstractC59233zdF, arrayList);
        }
        return new C59345zfL<>(objCopydefault, copydefault(abstractC59233zdF, arrayList2));
    }

    public static final AbstractC59233zdF KWHzl(AbstractC59233zdF abstractC59233zdF, AbstractC59233zdF abstractC59233zdF2) {
        AbstractC59233zdF abstractC59233zdFAEQbTJ = C59322zep.AEQbTJ(abstractC59233zdF, abstractC59233zdF2.AEQbTJ());
        Intrinsics.checkNotNullExpressionValue(abstractC59233zdFAEQbTJ, "");
        return abstractC59233zdFAEQbTJ;
    }

    public static final AbstractC59233zdF copydefault(AbstractC59233zdF abstractC59233zdF, java.util.List<C59349zfP> list) {
        abstractC59233zdF.bY_().size();
        list.size();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(KWHzl((C59349zfP) it.next()));
        }
        return C59326zet.replace$default(abstractC59233zdF, arrayList, null, null, 6, null);
    }

    public static final C59345zfL<C59349zfP> OLrzqt(C59349zfP c59349zfP) {
        C59345zfL<AbstractC59233zdF> c59345zfLCopydefault = copydefault(c59349zfP.copydefault());
        AbstractC59233zdF abstractC59233zdFKWHzl = c59345zfLCopydefault.KWHzl();
        AbstractC59233zdF abstractC59233zdFEZpvd = c59345zfLCopydefault.EZpvd();
        C59345zfL<AbstractC59233zdF> c59345zfLCopydefault2 = copydefault(c59349zfP.KWHzl());
        return new C59345zfL<>(new C59349zfP(c59349zfP.AEQbTJ(), abstractC59233zdFEZpvd, c59345zfLCopydefault2.KWHzl()), new C59349zfP(c59349zfP.AEQbTJ(), abstractC59233zdFKWHzl, c59345zfLCopydefault2.EZpvd()));
    }
}
