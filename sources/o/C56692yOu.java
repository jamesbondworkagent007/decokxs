package o;

import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yOu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C56692yOu {
    public static final java.util.List<InterfaceC56691yOt> copydefault(@NotNull InterfaceC56659yNo interfaceC56659yNo) {
        java.util.List<InterfaceC56691yOt> listAhwBna;
        InterfaceC56665yNu next;
        InterfaceC59315zei interfaceC59315zeiFJNWhG;
        Intrinsics.checkNotNullParameter(interfaceC56659yNo, "");
        java.util.List<InterfaceC56691yOt> listAkhnZx = interfaceC56659yNo.AkhnZx();
        Intrinsics.checkNotNullExpressionValue(listAkhnZx, "");
        if (!interfaceC56659yNo.gHZMYf() && !(interfaceC56659yNo.AYXKKw() instanceof InterfaceC56657yNm)) {
            return listAkhnZx;
        }
        java.util.List listZuBGHE = C59467zhb.zuBGHE(C59467zhb.isConnected(C59467zhb.DbNXlk(C59467zhb.AuCTel(yZE.AYXKKw(interfaceC56659yNo), C56689yOr.copydefault), C56693yOv.copydefault), C56696yOy.EZpvd));
        java.util.Iterator<InterfaceC56665yNu> it = yZE.AYXKKw(interfaceC56659yNo).iterator();
        while (true) {
            listAhwBna = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (next instanceof InterfaceC56658yNn) {
                break;
            }
        }
        InterfaceC56658yNn interfaceC56658yNn = (InterfaceC56658yNn) next;
        if (interfaceC56658yNn != null && (interfaceC59315zeiFJNWhG = interfaceC56658yNn.fJNWhG()) != null) {
            listAhwBna = interfaceC59315zeiFJNWhG.copydefault();
        }
        if (listAhwBna == null) {
            listAhwBna = yDY.AhwBna();
        }
        if (listZuBGHE.isEmpty() && listAhwBna.isEmpty()) {
            java.util.List<InterfaceC56691yOt> listAkhnZx2 = interfaceC56659yNo.AkhnZx();
            Intrinsics.checkNotNullExpressionValue(listAkhnZx2, "");
            return listAkhnZx2;
        }
        java.util.List<InterfaceC56691yOt> listDjBIcL = CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) listZuBGHE, (java.lang.Iterable) listAhwBna);
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listDjBIcL, 10));
        for (InterfaceC56691yOt interfaceC56691yOt : listDjBIcL) {
            Intrinsics.copydefault(interfaceC56691yOt);
            arrayList.add(copydefault(interfaceC56691yOt, interfaceC56659yNo, listAkhnZx.size()));
        }
        return CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) listAkhnZx, (java.lang.Iterable) arrayList);
    }

    public static final boolean OLrzqt(InterfaceC56665yNu interfaceC56665yNu) {
        Intrinsics.checkNotNullParameter(interfaceC56665yNu, "");
        return interfaceC56665yNu instanceof InterfaceC56657yNm;
    }

    public static final boolean AEQbTJ(InterfaceC56665yNu interfaceC56665yNu) {
        Intrinsics.checkNotNullParameter(interfaceC56665yNu, "");
        return !(interfaceC56665yNu instanceof InterfaceC56660yNp);
    }

    public static final Sequence AYXKKw(InterfaceC56665yNu interfaceC56665yNu) {
        Intrinsics.checkNotNullParameter(interfaceC56665yNu, "");
        java.util.List<InterfaceC56691yOt> listAkhnZx = ((InterfaceC56657yNm) interfaceC56665yNu).AkhnZx();
        Intrinsics.checkNotNullExpressionValue(listAkhnZx, "");
        return CollectionsKt___CollectionsKt.QVAiDq(listAkhnZx);
    }

    public static final C56655yNk copydefault(InterfaceC56691yOt interfaceC56691yOt, InterfaceC56665yNu interfaceC56665yNu, int i) {
        return new C56655yNk(interfaceC56691yOt, interfaceC56665yNu, i);
    }

    public static final C56674yOc OLrzqt(@NotNull AbstractC59233zdF abstractC59233zdF) {
        Intrinsics.checkNotNullParameter(abstractC59233zdF, "");
        InterfaceC56663yNs interfaceC56663yNsKWHzl = abstractC59233zdF.djBIcL().KWHzl();
        return OLrzqt(abstractC59233zdF, interfaceC56663yNsKWHzl instanceof InterfaceC56659yNo ? (InterfaceC56659yNo) interfaceC56663yNsKWHzl : null, 0);
    }

    public static final C56674yOc OLrzqt(AbstractC59233zdF abstractC59233zdF, InterfaceC56659yNo interfaceC56659yNo, int i) {
        if (interfaceC56659yNo == null || C59370zfk.KWHzl(interfaceC56659yNo)) {
            return null;
        }
        int size = interfaceC56659yNo.AkhnZx().size() + i;
        if (!interfaceC56659yNo.gHZMYf()) {
            if (size != abstractC59233zdF.bY_().size()) {
                yYH.fIwbmz(interfaceC56659yNo);
            }
            return new C56674yOc(interfaceC56659yNo, abstractC59233zdF.bY_().subList(i, abstractC59233zdF.bY_().size()), null);
        }
        java.util.List<InterfaceC59317zek> listSubList = abstractC59233zdF.bY_().subList(i, size);
        InterfaceC56665yNu interfaceC56665yNuAYXKKw = interfaceC56659yNo.AYXKKw();
        return new C56674yOc(interfaceC56659yNo, listSubList, OLrzqt(abstractC59233zdF, interfaceC56665yNuAYXKKw instanceof InterfaceC56659yNo ? (InterfaceC56659yNo) interfaceC56665yNuAYXKKw : null, size));
    }
}
