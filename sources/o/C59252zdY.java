package o;

import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zdY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C59252zdY {

    /* JADX INFO: renamed from: o.zdY$Application */
    public static final class Application extends AbstractC59316zej {
        public final /* synthetic */ java.util.List<InterfaceC59315zei> copydefault;

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.util.List<? extends o.zei> */
        /* JADX WARN: Multi-variable type inference failed */
        public Application(java.util.List<? extends InterfaceC59315zei> list) {
            this.copydefault = list;
        }

        @Override // o.AbstractC59316zej
        public InterfaceC59317zek AEQbTJ(InterfaceC59315zei interfaceC59315zei) {
            Intrinsics.checkNotNullParameter(interfaceC59315zei, "");
            if (!this.copydefault.contains(interfaceC59315zei)) {
                return null;
            }
            InterfaceC56663yNs interfaceC56663yNsKWHzl = interfaceC59315zei.OLrzqt();
            Intrinsics.copydefault(interfaceC56663yNsKWHzl, "");
            return C59322zep.EZpvd((InterfaceC56691yOt) interfaceC56663yNsKWHzl);
        }
    }

    public static final AbstractC59233zdF KWHzl(java.util.List<? extends InterfaceC59315zei> list, java.util.List<? extends AbstractC59233zdF> list2, AbstractC56640yMw abstractC56640yMw) {
        AbstractC59233zdF abstractC59233zdFOLrzqt = TypeSubstitutor.EZpvd(new Application(list)).OLrzqt((AbstractC59233zdF) CollectionsKt___CollectionsKt.AuCTelauCTel(list2), Variance.OUT_VARIANCE);
        if (abstractC59233zdFOLrzqt != null) {
            return abstractC59233zdFOLrzqt;
        }
        AbstractC59242zdO abstractC59242zdOAuCTel = abstractC56640yMw.AuCTel();
        Intrinsics.checkNotNullExpressionValue(abstractC59242zdOAuCTel, "");
        return abstractC59242zdOAuCTel;
    }

    public static final AbstractC59233zdF EZpvd(@NotNull InterfaceC56691yOt interfaceC56691yOt) {
        Intrinsics.checkNotNullParameter(interfaceC56691yOt, "");
        InterfaceC56665yNu interfaceC56665yNuAYXKKw = interfaceC56691yOt.AuCTel();
        Intrinsics.checkNotNullExpressionValue(interfaceC56665yNuAYXKKw, "");
        if (interfaceC56665yNuAYXKKw instanceof InterfaceC56659yNo) {
            java.util.List<InterfaceC56691yOt> listCopydefault = ((InterfaceC56659yNo) interfaceC56665yNuAYXKKw).fJNWhG().copydefault();
            Intrinsics.checkNotNullExpressionValue(listCopydefault, "");
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listCopydefault, 10));
            java.util.Iterator<T> it = listCopydefault.iterator();
            while (it.hasNext()) {
                InterfaceC59315zei interfaceC59315zeiFJNWhG = ((InterfaceC56691yOt) it.next()).fJNWhG();
                Intrinsics.checkNotNullExpressionValue(interfaceC59315zeiFJNWhG, "");
                arrayList.add(interfaceC59315zeiFJNWhG);
            }
            java.util.List<AbstractC59233zdF> listDjBIcL = interfaceC56691yOt.djBIcL();
            Intrinsics.checkNotNullExpressionValue(listDjBIcL, "");
            return KWHzl(arrayList, listDjBIcL, yZE.AEQbTJ(interfaceC56691yOt));
        }
        if (interfaceC56665yNuAYXKKw instanceof yNG) {
            java.util.List<InterfaceC56691yOt> listAkhnZx = ((yNG) interfaceC56665yNuAYXKKw).AkhnZx();
            Intrinsics.checkNotNullExpressionValue(listAkhnZx, "");
            java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(listAkhnZx, 10));
            java.util.Iterator<T> it2 = listAkhnZx.iterator();
            while (it2.hasNext()) {
                InterfaceC59315zei interfaceC59315zeiFJNWhG2 = ((InterfaceC56691yOt) it2.next()).fJNWhG();
                Intrinsics.checkNotNullExpressionValue(interfaceC59315zeiFJNWhG2, "");
                arrayList2.add(interfaceC59315zeiFJNWhG2);
            }
            java.util.List<AbstractC59233zdF> listDjBIcL2 = interfaceC56691yOt.djBIcL();
            Intrinsics.checkNotNullExpressionValue(listDjBIcL2, "");
            return KWHzl(arrayList2, listDjBIcL2, yZE.AEQbTJ(interfaceC56691yOt));
        }
        throw new java.lang.IllegalArgumentException("Unsupported descriptor type to build star projection type based on type parameters of it");
    }
}
