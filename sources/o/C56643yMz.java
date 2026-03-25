package o;

import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o.yMB;
import o.yMM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yMz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C56643yMz {
    public static final yMM KWHzl(@NotNull AbstractC59233zdF abstractC59233zdF) {
        Intrinsics.checkNotNullParameter(abstractC59233zdF, "");
        InterfaceC56663yNs interfaceC56663yNsOLrzqt = abstractC59233zdF.djBIcL().OLrzqt();
        if (interfaceC56663yNsOLrzqt != null) {
            return OLrzqt(interfaceC56663yNsOLrzqt);
        }
        return null;
    }

    public static final boolean AYXKKw(@NotNull AbstractC59233zdF abstractC59233zdF) {
        Intrinsics.checkNotNullParameter(abstractC59233zdF, "");
        return Intrinsics.EZpvd(KWHzl(abstractC59233zdF), yMM.TaskDescription.copydefault);
    }

    public static final boolean isConnected(@NotNull AbstractC59233zdF abstractC59233zdF) {
        Intrinsics.checkNotNullParameter(abstractC59233zdF, "");
        return Intrinsics.EZpvd(KWHzl(abstractC59233zdF), yMM.Activity.copydefault);
    }

    public static final boolean djBIcL(@NotNull AbstractC59233zdF abstractC59233zdF) {
        Intrinsics.checkNotNullParameter(abstractC59233zdF, "");
        InterfaceC56663yNs interfaceC56663yNsOLrzqt = abstractC59233zdF.djBIcL().OLrzqt();
        return interfaceC56663yNsOLrzqt != null && copydefault(interfaceC56663yNsOLrzqt);
    }

    public static final boolean copydefault(@NotNull InterfaceC56665yNu interfaceC56665yNu) {
        Intrinsics.checkNotNullParameter(interfaceC56665yNu, "");
        yMM ymmOLrzqt = OLrzqt(interfaceC56665yNu);
        return Intrinsics.EZpvd(ymmOLrzqt, yMM.TaskDescription.copydefault) || Intrinsics.EZpvd(ymmOLrzqt, yMM.Activity.copydefault);
    }

    public static final boolean gEmmrt(@NotNull AbstractC59233zdF abstractC59233zdF) {
        Intrinsics.checkNotNullParameter(abstractC59233zdF, "");
        return djBIcL(abstractC59233zdF) && values(abstractC59233zdF);
    }

    public static final boolean values(AbstractC59233zdF abstractC59233zdF) {
        return abstractC59233zdF.copydefault().EZpvd(yMB.Application.zLjUOn) != null;
    }

    public static final yMM OLrzqt(@NotNull InterfaceC56665yNu interfaceC56665yNu) {
        Intrinsics.checkNotNullParameter(interfaceC56665yNu, "");
        if ((interfaceC56665yNu instanceof InterfaceC56658yNn) && AbstractC56640yMw.KWHzl(interfaceC56665yNu)) {
            return AEQbTJ(yZE.valueOf(interfaceC56665yNu));
        }
        return null;
    }

    public static final yMM AEQbTJ(C56930yXp c56930yXp) {
        if (!c56930yXp.copydefault() || c56930yXp.OLrzqt()) {
            return null;
        }
        yMO ymoAEQbTJ = yMO.OLrzqt.AEQbTJ();
        C56933yXs c56933yXsEZpvd = c56930yXp.djBIcL().EZpvd();
        java.lang.String strAEQbTJ = c56930yXp.valueOf().AEQbTJ();
        Intrinsics.checkNotNullExpressionValue(strAEQbTJ, "");
        return ymoAEQbTJ.KWHzl(c56933yXsEZpvd, strAEQbTJ);
    }

    public static final int copydefault(@NotNull AbstractC59233zdF abstractC59233zdF) {
        Intrinsics.checkNotNullParameter(abstractC59233zdF, "");
        yOJ yojEZpvd = abstractC59233zdF.copydefault().EZpvd(yMB.Application.getFieldNames);
        if (yojEZpvd == null) {
            return 0;
        }
        AbstractC56975yZg abstractC56975yZg = (AbstractC56975yZg) C56424yEw.EZpvd((java.util.Map<C56935yXu, ? extends V>) ((java.util.Map<java.lang.Object, ? extends V>) yojEZpvd.OLrzqt()), yMB.AhwBna);
        Intrinsics.copydefault(abstractC56975yZg, "");
        return ((C56983yZo) abstractC56975yZg).KWHzl().intValue();
    }

    public static final AbstractC59233zdF AEQbTJ(@NotNull AbstractC59233zdF abstractC59233zdF) {
        Intrinsics.checkNotNullParameter(abstractC59233zdF, "");
        djBIcL(abstractC59233zdF);
        if (!values(abstractC59233zdF)) {
            return null;
        }
        return abstractC59233zdF.bY_().get(copydefault(abstractC59233zdF)).OLrzqt();
    }

    public static final java.util.List<AbstractC59233zdF> EZpvd(@NotNull AbstractC59233zdF abstractC59233zdF) {
        Intrinsics.checkNotNullParameter(abstractC59233zdF, "");
        djBIcL(abstractC59233zdF);
        int iCopydefault = copydefault(abstractC59233zdF);
        if (iCopydefault == 0) {
            return yDY.AhwBna();
        }
        java.util.List<InterfaceC59317zek> listSubList = abstractC59233zdF.bY_().subList(0, iCopydefault);
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listSubList, 10));
        java.util.Iterator<T> it = listSubList.iterator();
        while (it.hasNext()) {
            arrayList.add(((InterfaceC59317zek) it.next()).OLrzqt());
        }
        return arrayList;
    }

    public static final AbstractC59233zdF valueOf(@NotNull AbstractC59233zdF abstractC59233zdF) {
        Intrinsics.checkNotNullParameter(abstractC59233zdF, "");
        djBIcL(abstractC59233zdF);
        AbstractC59233zdF abstractC59233zdFOLrzqt = ((InterfaceC59317zek) CollectionsKt___CollectionsKt.AubY(abstractC59233zdF.bY_())).OLrzqt();
        Intrinsics.checkNotNullExpressionValue(abstractC59233zdFOLrzqt, "");
        return abstractC59233zdFOLrzqt;
    }

    public static final java.util.List<InterfaceC59317zek> AhwBna(@NotNull AbstractC59233zdF abstractC59233zdF) {
        Intrinsics.checkNotNullParameter(abstractC59233zdF, "");
        djBIcL(abstractC59233zdF);
        return abstractC59233zdF.bY_().subList(copydefault(abstractC59233zdF) + (gEmmrt(abstractC59233zdF) ? 1 : 0), r0.size() - 1);
    }

    public static final C56935yXu OLrzqt(@NotNull AbstractC59233zdF abstractC59233zdF) {
        java.lang.String strKWHzl;
        Intrinsics.checkNotNullParameter(abstractC59233zdF, "");
        yOJ yojEZpvd = abstractC59233zdF.copydefault().EZpvd(yMB.Application.AxsJAYaxsJAY);
        if (yojEZpvd == null) {
            return null;
        }
        java.lang.Object objIRxXKY = CollectionsKt___CollectionsKt.iRxXKY(yojEZpvd.OLrzqt().values());
        C56993yZy c56993yZy = objIRxXKY instanceof C56993yZy ? (C56993yZy) objIRxXKY : null;
        if (c56993yZy != null && (strKWHzl = c56993yZy.KWHzl()) != null) {
            if (!C56935yXu.EZpvd(strKWHzl)) {
                strKWHzl = null;
            }
            if (strKWHzl != null) {
                return C56935yXu.AEQbTJ(strKWHzl);
            }
        }
        return null;
    }

    public static final java.util.List<InterfaceC59317zek> KWHzl(AbstractC59233zdF abstractC59233zdF, @NotNull java.util.List<? extends AbstractC59233zdF> list, @NotNull java.util.List<? extends AbstractC59233zdF> list2, java.util.List<C56935yXu> list3, @NotNull AbstractC59233zdF abstractC59233zdF2, @NotNull AbstractC56640yMw abstractC56640yMw) {
        C56935yXu c56935yXu;
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(abstractC59233zdF2, "");
        Intrinsics.checkNotNullParameter(abstractC56640yMw, "");
        java.util.ArrayList arrayList = new java.util.ArrayList(list2.size() + list.size() + (abstractC59233zdF != null ? 1 : 0) + 1);
        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList2.add(C59336zfC.EZpvd((AbstractC59233zdF) it.next()));
        }
        arrayList.addAll(arrayList2);
        C59433zgu.EZpvd(arrayList, abstractC59233zdF != null ? C59336zfC.EZpvd(abstractC59233zdF) : null);
        int i = 0;
        for (java.lang.Object obj : list2) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            AbstractC59233zdF abstractC59233zdFCopydefault = (AbstractC59233zdF) obj;
            if (list3 == null || (c56935yXu = list3.get(i)) == null || c56935yXu.OLrzqt()) {
                c56935yXu = null;
            }
            if (c56935yXu != null) {
                C56933yXs c56933yXs = yMB.Application.AxsJAYaxsJAY;
                C56935yXu c56935yXu2 = yMB.AubY;
                java.lang.String strAEQbTJ = c56935yXu.AEQbTJ();
                Intrinsics.checkNotNullExpressionValue(strAEQbTJ, "");
                abstractC59233zdFCopydefault = C59336zfC.copydefault(abstractC59233zdFCopydefault, yOL.KWHzl.EZpvd(CollectionsKt___CollectionsKt.djBIcL((java.lang.Iterable<? extends yOM>) ((java.lang.Iterable<? extends java.lang.Object>) abstractC59233zdFCopydefault.copydefault()), new yOM(abstractC56640yMw, c56933yXs, C56423yEv.EZpvd(C56390yDp.OLrzqt(c56935yXu2, new C56993yZy(strAEQbTJ))), false, 8, null))));
            }
            arrayList.add(C59336zfC.EZpvd(abstractC59233zdFCopydefault));
            i++;
        }
        arrayList.add(C59336zfC.EZpvd(abstractC59233zdF2));
        return arrayList;
    }

    public static final AbstractC59242zdO OLrzqt(@NotNull AbstractC56640yMw abstractC56640yMw, @NotNull yOL yol, AbstractC59233zdF abstractC59233zdF, @NotNull java.util.List<? extends AbstractC59233zdF> list, @NotNull java.util.List<? extends AbstractC59233zdF> list2, java.util.List<C56935yXu> list3, @NotNull AbstractC59233zdF abstractC59233zdF2, boolean z) {
        Intrinsics.checkNotNullParameter(abstractC56640yMw, "");
        Intrinsics.checkNotNullParameter(yol, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(abstractC59233zdF2, "");
        java.util.List<InterfaceC59317zek> listKWHzl = KWHzl(abstractC59233zdF, list, list2, list3, abstractC59233zdF2, abstractC56640yMw);
        InterfaceC56658yNn interfaceC56658yNnKWHzl = KWHzl(abstractC56640yMw, list2.size() + list.size() + (abstractC59233zdF == null ? 0 : 1), z);
        if (abstractC59233zdF != null) {
            yol = AEQbTJ(yol, abstractC56640yMw);
        }
        if (!list.isEmpty()) {
            yol = EZpvd(yol, abstractC56640yMw, list.size());
        }
        return C59231zdD.KWHzl(C59314zeh.AEQbTJ(yol), interfaceC56658yNnKWHzl, listKWHzl);
    }

    public static final yOL AEQbTJ(@NotNull yOL yol, @NotNull AbstractC56640yMw abstractC56640yMw) {
        Intrinsics.checkNotNullParameter(yol, "");
        Intrinsics.checkNotNullParameter(abstractC56640yMw, "");
        C56933yXs c56933yXs = yMB.Application.zLjUOn;
        return yol.copydefault(c56933yXs) ? yol : yOL.KWHzl.EZpvd(CollectionsKt___CollectionsKt.djBIcL((java.lang.Iterable<? extends yOM>) ((java.lang.Iterable<? extends java.lang.Object>) yol), new yOM(abstractC56640yMw, c56933yXs, C56424yEw.KWHzl(), false, 8, null)));
    }

    public static final yOL EZpvd(@NotNull yOL yol, @NotNull AbstractC56640yMw abstractC56640yMw, int i) {
        Intrinsics.checkNotNullParameter(yol, "");
        Intrinsics.checkNotNullParameter(abstractC56640yMw, "");
        C56933yXs c56933yXs = yMB.Application.getFieldNames;
        return yol.copydefault(c56933yXs) ? yol : yOL.KWHzl.EZpvd(CollectionsKt___CollectionsKt.djBIcL((java.lang.Iterable<? extends yOM>) ((java.lang.Iterable<? extends java.lang.Object>) yol), new yOM(abstractC56640yMw, c56933yXs, C56423yEv.EZpvd(C56390yDp.OLrzqt(yMB.AhwBna, new C56983yZo(i))), false, 8, null)));
    }

    public static final InterfaceC56658yNn KWHzl(@NotNull AbstractC56640yMw abstractC56640yMw, int i, boolean z) {
        Intrinsics.checkNotNullParameter(abstractC56640yMw, "");
        InterfaceC56658yNn interfaceC56658yNnCopydefault = z ? abstractC56640yMw.copydefault(i) : abstractC56640yMw.OLrzqt(i);
        Intrinsics.copydefault(interfaceC56658yNnCopydefault);
        return interfaceC56658yNnCopydefault;
    }
}
