package o;

import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ySf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C56785ySf {
    public static final java.util.List<InterfaceC56695yOx> EZpvd(@NotNull java.util.Collection<? extends AbstractC59233zdF> collection, @NotNull java.util.Collection<? extends InterfaceC56695yOx> collection2, @NotNull InterfaceC56657yNm interfaceC56657yNm) {
        Intrinsics.checkNotNullParameter(collection, "");
        Intrinsics.checkNotNullParameter(collection2, "");
        Intrinsics.checkNotNullParameter(interfaceC56657yNm, "");
        collection.size();
        collection2.size();
        java.util.List listValues = CollectionsKt___CollectionsKt.values(collection, collection2);
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listValues, 10));
        for (java.util.Iterator it = listValues.iterator(); it.hasNext(); it = it) {
            kotlin.Pair pair = (kotlin.Pair) it.next();
            AbstractC59233zdF abstractC59233zdF = (AbstractC59233zdF) pair.component1();
            InterfaceC56695yOx interfaceC56695yOx = (InterfaceC56695yOx) pair.component2();
            int iIsConnected = interfaceC56695yOx.isConnected();
            yOL yolCopydefault = interfaceC56695yOx.copydefault();
            C56935yXu c56935yXuBR_ = interfaceC56695yOx.bR_();
            Intrinsics.checkNotNullExpressionValue(c56935yXuBR_, "");
            boolean zEZpvd = interfaceC56695yOx.EZpvd();
            boolean zFIwbmz = interfaceC56695yOx.fIwbmz();
            boolean zAuCTel = interfaceC56695yOx.AuCTel();
            AbstractC59233zdF abstractC59233zdFEjfBZ = interfaceC56695yOx.ejfBZ() != null ? yZE.AhwBna(interfaceC56657yNm).AEQbTJ().ejfBZ(abstractC59233zdF) : null;
            InterfaceC56686yOo interfaceC56686yOoFARcdN = interfaceC56695yOx.fARcdN();
            Intrinsics.checkNotNullExpressionValue(interfaceC56686yOoFARcdN, "");
            arrayList.add(new yPP(interfaceC56657yNm, null, iIsConnected, yolCopydefault, c56935yXuBR_, abstractC59233zdF, zEZpvd, zFIwbmz, zAuCTel, abstractC59233zdFEjfBZ, interfaceC56686yOoFARcdN));
        }
        return arrayList;
    }

    public static final C56826yTt KWHzl(@NotNull InterfaceC56658yNn interfaceC56658yNn) {
        Intrinsics.checkNotNullParameter(interfaceC56658yNn, "");
        InterfaceC56658yNn interfaceC56658yNnCopydefault = yZE.copydefault(interfaceC56658yNn);
        if (interfaceC56658yNnCopydefault == null) {
            return null;
        }
        InterfaceC59098zad interfaceC59098zadEjfBZ = interfaceC56658yNnCopydefault.ejfBZ();
        C56826yTt c56826yTt = interfaceC59098zadEjfBZ instanceof C56826yTt ? (C56826yTt) interfaceC59098zadEjfBZ : null;
        return c56826yTt == null ? KWHzl(interfaceC56658yNnCopydefault) : c56826yTt;
    }
}
