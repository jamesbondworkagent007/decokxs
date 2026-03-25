package o;

import java.util.LinkedHashSet;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zfC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C59336zfC {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final boolean EZpvd(@NotNull InterfaceC56691yOt interfaceC56691yOt) {
        Intrinsics.checkNotNullParameter(interfaceC56691yOt, "");
        return hasTypeParameterRecursiveBounds$default(interfaceC56691yOt, null, null, 6, null);
    }

    public static final AbstractC56640yMw copydefault(@NotNull AbstractC59233zdF abstractC59233zdF) {
        Intrinsics.checkNotNullParameter(abstractC59233zdF, "");
        AbstractC56640yMw abstractC56640yMwBU_ = abstractC59233zdF.djBIcL().bU_();
        Intrinsics.checkNotNullExpressionValue(abstractC56640yMwBU_, "");
        return abstractC56640yMwBU_;
    }

    public static final AbstractC59233zdF AkhnZx(@NotNull AbstractC59233zdF abstractC59233zdF) {
        Intrinsics.checkNotNullParameter(abstractC59233zdF, "");
        AbstractC59233zdF abstractC59233zdFDjBIcL = C59322zep.djBIcL(abstractC59233zdF);
        Intrinsics.checkNotNullExpressionValue(abstractC59233zdFDjBIcL, "");
        return abstractC59233zdFDjBIcL;
    }

    public static final AbstractC59233zdF DbNXlk(@NotNull AbstractC59233zdF abstractC59233zdF) {
        Intrinsics.checkNotNullParameter(abstractC59233zdF, "");
        AbstractC59233zdF abstractC59233zdFAhwBna = C59322zep.AhwBna(abstractC59233zdF);
        Intrinsics.checkNotNullExpressionValue(abstractC59233zdFAhwBna, "");
        return abstractC59233zdFAhwBna;
    }

    public static final boolean AhwBna(@NotNull AbstractC59233zdF abstractC59233zdF) {
        Intrinsics.checkNotNullParameter(abstractC59233zdF, "");
        return AbstractC56640yMw.valueOf(abstractC59233zdF);
    }

    public static final boolean AEQbTJ(@NotNull AbstractC59233zdF abstractC59233zdF) {
        Intrinsics.checkNotNullParameter(abstractC59233zdF, "");
        return AbstractC56640yMw.copydefault(abstractC59233zdF);
    }

    public static final boolean valueOf(@NotNull AbstractC59233zdF abstractC59233zdF) {
        Intrinsics.checkNotNullParameter(abstractC59233zdF, "");
        return C59322zep.AYXKKw(abstractC59233zdF);
    }

    public static final java.lang.Boolean AEQbTJ(AbstractC59331zey abstractC59331zey) {
        return java.lang.Boolean.valueOf(C59322zep.AYXKKw(abstractC59331zey));
    }

    public static final boolean OLrzqt(@NotNull AbstractC59233zdF abstractC59233zdF) {
        Intrinsics.checkNotNullParameter(abstractC59233zdF, "");
        return C59322zep.OLrzqt(abstractC59233zdF, C59341zfH.copydefault);
    }

    public static final boolean copydefault(@NotNull AbstractC59233zdF abstractC59233zdF, @NotNull AbstractC59233zdF abstractC59233zdF2) {
        Intrinsics.checkNotNullParameter(abstractC59233zdF, "");
        Intrinsics.checkNotNullParameter(abstractC59233zdF2, "");
        return InterfaceC59284zeD.OLrzqt.copydefault(abstractC59233zdF, abstractC59233zdF2);
    }

    public static final AbstractC59233zdF copydefault(@NotNull AbstractC59233zdF abstractC59233zdF, @NotNull yOL yol) {
        Intrinsics.checkNotNullParameter(abstractC59233zdF, "");
        Intrinsics.checkNotNullParameter(yol, "");
        return (abstractC59233zdF.copydefault().AEQbTJ() && yol.AEQbTJ()) ? abstractC59233zdF : abstractC59233zdF.AkhnZx().AEQbTJ(C59314zeh.EZpvd(abstractC59233zdF.bX_(), yol));
    }

    public static final InterfaceC59317zek OLrzqt(@NotNull AbstractC59233zdF abstractC59233zdF, @NotNull Variance variance, InterfaceC56691yOt interfaceC56691yOt) {
        Intrinsics.checkNotNullParameter(abstractC59233zdF, "");
        Intrinsics.checkNotNullParameter(variance, "");
        if ((interfaceC56691yOt != null ? interfaceC56691yOt.values() : null) == variance) {
            variance = Variance.INVARIANT;
        }
        return new C59323zeq(variance, abstractC59233zdF);
    }

    public static final InterfaceC59317zek EZpvd(@NotNull AbstractC59233zdF abstractC59233zdF) {
        Intrinsics.checkNotNullParameter(abstractC59233zdF, "");
        return new C59323zeq(abstractC59233zdF);
    }

    public static final boolean copydefault(@NotNull AbstractC59233zdF abstractC59233zdF, @NotNull Function1<? super AbstractC59331zey, java.lang.Boolean> function1) {
        Intrinsics.checkNotNullParameter(abstractC59233zdF, "");
        Intrinsics.checkNotNullParameter(function1, "");
        return C59322zep.OLrzqt(abstractC59233zdF, function1);
    }

    public static final java.util.Set<InterfaceC56691yOt> OLrzqt(@NotNull AbstractC59233zdF abstractC59233zdF, java.util.Set<? extends InterfaceC56691yOt> set) {
        Intrinsics.checkNotNullParameter(abstractC59233zdF, "");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        OLrzqt(abstractC59233zdF, abstractC59233zdF, linkedHashSet, set);
        return linkedHashSet;
    }

    public static final void OLrzqt(AbstractC59233zdF abstractC59233zdF, AbstractC59233zdF abstractC59233zdF2, java.util.Set<InterfaceC56691yOt> set, java.util.Set<? extends InterfaceC56691yOt> set2) {
        InterfaceC56663yNs interfaceC56663yNsKWHzl = abstractC59233zdF.djBIcL().OLrzqt();
        if (interfaceC56663yNsKWHzl instanceof InterfaceC56691yOt) {
            if (!Intrinsics.EZpvd(abstractC59233zdF.djBIcL(), abstractC59233zdF2.djBIcL())) {
                set.add(interfaceC56663yNsKWHzl);
                return;
            }
            for (AbstractC59233zdF abstractC59233zdF3 : ((InterfaceC56691yOt) interfaceC56663yNsKWHzl).djBIcL()) {
                Intrinsics.copydefault(abstractC59233zdF3);
                OLrzqt(abstractC59233zdF3, abstractC59233zdF2, set, set2);
            }
            return;
        }
        InterfaceC56663yNs interfaceC56663yNsKWHzl2 = abstractC59233zdF.djBIcL().OLrzqt();
        InterfaceC56659yNo interfaceC56659yNo = interfaceC56663yNsKWHzl2 instanceof InterfaceC56659yNo ? (InterfaceC56659yNo) interfaceC56663yNsKWHzl2 : null;
        java.util.List<InterfaceC56691yOt> listAkhnZx = interfaceC56659yNo != null ? interfaceC56659yNo.AkhnZx() : null;
        int i = 0;
        for (InterfaceC59317zek interfaceC59317zek : abstractC59233zdF.bY_()) {
            InterfaceC56691yOt interfaceC56691yOt = listAkhnZx != null ? (InterfaceC56691yOt) CollectionsKt___CollectionsKt.AkhnZx(listAkhnZx, i) : null;
            if ((interfaceC56691yOt == null || set2 == null || !set2.contains(interfaceC56691yOt)) && !interfaceC59317zek.AEQbTJ()) {
                if (!CollectionsKt___CollectionsKt.KWHzl((java.lang.Iterable<? extends InterfaceC56663yNs>) ((java.lang.Iterable<? extends java.lang.Object>) set), interfaceC59317zek.OLrzqt().djBIcL().OLrzqt()) && !Intrinsics.EZpvd(interfaceC59317zek.OLrzqt().djBIcL(), abstractC59233zdF2.djBIcL())) {
                    AbstractC59233zdF abstractC59233zdFOLrzqt = interfaceC59317zek.OLrzqt();
                    Intrinsics.checkNotNullExpressionValue(abstractC59233zdFOLrzqt, "");
                    OLrzqt(abstractC59233zdFOLrzqt, abstractC59233zdF2, set, set2);
                }
            }
            i++;
        }
    }

    public static /* synthetic */ boolean hasTypeParameterRecursiveBounds$default(InterfaceC56691yOt interfaceC56691yOt, InterfaceC59315zei interfaceC59315zei, java.util.Set set, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            interfaceC59315zei = null;
        }
        if ((i & 4) != 0) {
            set = null;
        }
        return copydefault(interfaceC56691yOt, interfaceC59315zei, (java.util.Set<? extends InterfaceC56691yOt>) set);
    }

    public static final boolean copydefault(@NotNull InterfaceC56691yOt interfaceC56691yOt, InterfaceC59315zei interfaceC59315zei, java.util.Set<? extends InterfaceC56691yOt> set) {
        Intrinsics.checkNotNullParameter(interfaceC56691yOt, "");
        java.util.List<AbstractC59233zdF> listDjBIcL = interfaceC56691yOt.djBIcL();
        Intrinsics.checkNotNullExpressionValue(listDjBIcL, "");
        if (!(listDjBIcL instanceof java.util.Collection) || !listDjBIcL.isEmpty()) {
            for (AbstractC59233zdF abstractC59233zdF : listDjBIcL) {
                Intrinsics.copydefault(abstractC59233zdF);
                if (copydefault(abstractC59233zdF, interfaceC56691yOt.bQ_().djBIcL(), set) && (interfaceC59315zei == null || Intrinsics.EZpvd(abstractC59233zdF.djBIcL(), interfaceC59315zei))) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean copydefault(AbstractC59233zdF abstractC59233zdF, InterfaceC59315zei interfaceC59315zei, java.util.Set<? extends InterfaceC56691yOt> set) {
        if (Intrinsics.EZpvd(abstractC59233zdF.djBIcL(), interfaceC59315zei)) {
            return true;
        }
        InterfaceC56663yNs interfaceC56663yNsKWHzl = abstractC59233zdF.djBIcL().OLrzqt();
        InterfaceC56659yNo interfaceC56659yNo = interfaceC56663yNsKWHzl instanceof InterfaceC56659yNo ? (InterfaceC56659yNo) interfaceC56663yNsKWHzl : null;
        java.util.List<InterfaceC56691yOt> listAkhnZx = interfaceC56659yNo != null ? interfaceC56659yNo.AkhnZx() : null;
        java.lang.Iterable<IndexedValue> iterableDCJXGO = CollectionsKt___CollectionsKt.DCJXGO(abstractC59233zdF.bY_());
        if (!(iterableDCJXGO instanceof java.util.Collection) || !((java.util.Collection) iterableDCJXGO).isEmpty()) {
            for (IndexedValue indexedValue : iterableDCJXGO) {
                int iKWHzl = indexedValue.KWHzl();
                InterfaceC59317zek interfaceC59317zek = (InterfaceC59317zek) indexedValue.EZpvd();
                InterfaceC56691yOt interfaceC56691yOt = listAkhnZx != null ? (InterfaceC56691yOt) CollectionsKt___CollectionsKt.AkhnZx(listAkhnZx, iKWHzl) : null;
                if (interfaceC56691yOt == null || set == null || !set.contains(interfaceC56691yOt)) {
                    if (interfaceC59317zek.AEQbTJ()) {
                        continue;
                    } else {
                        AbstractC59233zdF abstractC59233zdFOLrzqt = interfaceC59317zek.OLrzqt();
                        Intrinsics.checkNotNullExpressionValue(abstractC59233zdFOLrzqt, "");
                        if (copydefault(abstractC59233zdFOLrzqt, interfaceC59315zei, set)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static final boolean KWHzl(@NotNull AbstractC59233zdF abstractC59233zdF) {
        Intrinsics.checkNotNullParameter(abstractC59233zdF, "");
        return copydefault(abstractC59233zdF, C59342zfI.EZpvd);
    }

    public static final boolean EZpvd(AbstractC59331zey abstractC59331zey) {
        Intrinsics.checkNotNullParameter(abstractC59331zey, "");
        InterfaceC56663yNs interfaceC56663yNsKWHzl = abstractC59331zey.djBIcL().OLrzqt();
        if (interfaceC56663yNsKWHzl != null) {
            return KWHzl(interfaceC56663yNsKWHzl);
        }
        return false;
    }

    public static final boolean KWHzl(@NotNull InterfaceC56663yNs interfaceC56663yNs) {
        Intrinsics.checkNotNullParameter(interfaceC56663yNs, "");
        return (interfaceC56663yNs instanceof InterfaceC56691yOt) && (((InterfaceC56691yOt) interfaceC56663yNs).AuCTel() instanceof InterfaceC56690yOs);
    }

    public static final boolean values(@NotNull AbstractC59233zdF abstractC59233zdF) {
        Intrinsics.checkNotNullParameter(abstractC59233zdF, "");
        return copydefault(abstractC59233zdF, C59343zfJ.OLrzqt);
    }

    public static final boolean valueOf(AbstractC59331zey abstractC59331zey) {
        Intrinsics.checkNotNullParameter(abstractC59331zey, "");
        InterfaceC56663yNs interfaceC56663yNsKWHzl = abstractC59331zey.djBIcL().OLrzqt();
        return interfaceC56663yNsKWHzl != null && ((interfaceC56663yNsKWHzl instanceof InterfaceC56690yOs) || (interfaceC56663yNsKWHzl instanceof InterfaceC56691yOt));
    }

    public static final AbstractC59233zdF AEQbTJ(@NotNull InterfaceC56691yOt interfaceC56691yOt) {
        java.lang.Object obj;
        Intrinsics.checkNotNullParameter(interfaceC56691yOt, "");
        java.util.List<AbstractC59233zdF> listDjBIcL = interfaceC56691yOt.djBIcL();
        Intrinsics.checkNotNullExpressionValue(listDjBIcL, "");
        listDjBIcL.isEmpty();
        java.util.List<AbstractC59233zdF> listDjBIcL2 = interfaceC56691yOt.djBIcL();
        Intrinsics.checkNotNullExpressionValue(listDjBIcL2, "");
        java.util.Iterator<T> it = listDjBIcL2.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            InterfaceC56663yNs interfaceC56663yNsKWHzl = ((AbstractC59233zdF) next).djBIcL().OLrzqt();
            InterfaceC56658yNn interfaceC56658yNn = interfaceC56663yNsKWHzl instanceof InterfaceC56658yNn ? (InterfaceC56658yNn) interfaceC56663yNsKWHzl : null;
            if (interfaceC56658yNn != null && interfaceC56658yNn.DbNXlk() != ClassKind.INTERFACE && interfaceC56658yNn.DbNXlk() != ClassKind.ANNOTATION_CLASS) {
                obj = next;
                break;
            }
        }
        AbstractC59233zdF abstractC59233zdF = (AbstractC59233zdF) obj;
        if (abstractC59233zdF != null) {
            return abstractC59233zdF;
        }
        java.util.List<AbstractC59233zdF> listDjBIcL3 = interfaceC56691yOt.djBIcL();
        Intrinsics.checkNotNullExpressionValue(listDjBIcL3, "");
        java.lang.Object objAuCTelauCTel = CollectionsKt___CollectionsKt.AuCTelauCTel(listDjBIcL3);
        Intrinsics.checkNotNullExpressionValue(objAuCTelauCTel, "");
        return (AbstractC59233zdF) objAuCTelauCTel;
    }

    public static final boolean djBIcL(@NotNull AbstractC59233zdF abstractC59233zdF) {
        Intrinsics.checkNotNullParameter(abstractC59233zdF, "");
        return (abstractC59233zdF instanceof AbstractC59191zcQ) || ((abstractC59233zdF instanceof C59265zdl) && (((C59265zdl) abstractC59233zdF).AhwBna() instanceof AbstractC59191zcQ));
    }

    public static final boolean gEmmrt(@NotNull AbstractC59233zdF abstractC59233zdF) {
        Intrinsics.checkNotNullParameter(abstractC59233zdF, "");
        return (abstractC59233zdF instanceof C59249zdV) || ((abstractC59233zdF instanceof C59265zdl) && (((C59265zdl) abstractC59233zdF).AhwBna() instanceof C59249zdV));
    }

    public static final boolean AYXKKw(@NotNull AbstractC59233zdF abstractC59233zdF) {
        Intrinsics.checkNotNullParameter(abstractC59233zdF, "");
        return (abstractC59233zdF instanceof C59366zfg) && ((C59366zfg) abstractC59233zdF).gEmmrt().isUnresolved();
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.zet.replace$default(o.zdO, java.util.List, o.zeb, int, java.lang.Object):o.zdO */
    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [431=6] */
    public static final AbstractC59233zdF isConnected(@NotNull AbstractC59233zdF abstractC59233zdF) {
        AbstractC59331zey abstractC59331zeyReplace$default;
        Intrinsics.checkNotNullParameter(abstractC59233zdF, "");
        AbstractC59331zey abstractC59331zeyAkhnZx = abstractC59233zdF.AkhnZx();
        if (abstractC59331zeyAkhnZx instanceof AbstractC59272zds) {
            AbstractC59272zds abstractC59272zds = (AbstractC59272zds) abstractC59331zeyAkhnZx;
            AbstractC59242zdO abstractC59242zdOValueOf = abstractC59272zds.valueOf();
            if (!abstractC59242zdOValueOf.djBIcL().copydefault().isEmpty() && abstractC59242zdOValueOf.djBIcL().OLrzqt() != null) {
                java.util.List<InterfaceC56691yOt> listCopydefault = abstractC59242zdOValueOf.djBIcL().copydefault();
                Intrinsics.checkNotNullExpressionValue(listCopydefault, "");
                java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listCopydefault, 10));
                java.util.Iterator<T> it = listCopydefault.iterator();
                while (it.hasNext()) {
                    arrayList.add(new C59250zdW((InterfaceC56691yOt) it.next()));
                }
                abstractC59242zdOValueOf = C59326zet.replace$default(abstractC59242zdOValueOf, arrayList, null, 2, null);
            }
            AbstractC59242zdO abstractC59242zdOAYXKKw = abstractC59272zds.AYXKKw();
            if (!abstractC59242zdOAYXKKw.djBIcL().copydefault().isEmpty() && abstractC59242zdOAYXKKw.djBIcL().OLrzqt() != null) {
                java.util.List<InterfaceC56691yOt> listCopydefault2 = abstractC59242zdOAYXKKw.djBIcL().copydefault();
                Intrinsics.checkNotNullExpressionValue(listCopydefault2, "");
                java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(listCopydefault2, 10));
                java.util.Iterator<T> it2 = listCopydefault2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(new C59250zdW((InterfaceC56691yOt) it2.next()));
                }
                abstractC59242zdOAYXKKw = C59326zet.replace$default(abstractC59242zdOAYXKKw, arrayList2, null, 2, null);
            }
            abstractC59331zeyReplace$default = C59231zdD.copydefault(abstractC59242zdOValueOf, abstractC59242zdOAYXKKw);
        } else {
            if (!(abstractC59331zeyAkhnZx instanceof AbstractC59242zdO)) {
                throw new NoWhenBranchMatchedException();
            }
            AbstractC59242zdO abstractC59242zdO = (AbstractC59242zdO) abstractC59331zeyAkhnZx;
            if (abstractC59242zdO.djBIcL().copydefault().isEmpty() || abstractC59242zdO.djBIcL().OLrzqt() == null) {
                abstractC59331zeyReplace$default = abstractC59242zdO;
            } else {
                java.util.List<InterfaceC56691yOt> listCopydefault3 = abstractC59242zdO.djBIcL().copydefault();
                Intrinsics.checkNotNullExpressionValue(listCopydefault3, "");
                java.util.ArrayList arrayList3 = new java.util.ArrayList(C56403yEb.AYXKKw(listCopydefault3, 10));
                java.util.Iterator<T> it3 = listCopydefault3.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(new C59250zdW((InterfaceC56691yOt) it3.next()));
                }
                abstractC59331zeyReplace$default = C59326zet.replace$default(abstractC59242zdO, arrayList3, null, 2, null);
            }
        }
        return C59327zeu.copydefault(abstractC59331zeyReplace$default, abstractC59331zeyAkhnZx);
    }
}
