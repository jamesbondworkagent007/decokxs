package o;

import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC59316zej;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yNf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C56650yNf {
    public static final AbstractC59316zej EZpvd(@NotNull InterfaceC56658yNn interfaceC56658yNn, @NotNull InterfaceC56658yNn interfaceC56658yNn2) {
        Intrinsics.checkNotNullParameter(interfaceC56658yNn, "");
        Intrinsics.checkNotNullParameter(interfaceC56658yNn2, "");
        interfaceC56658yNn.AkhnZx().size();
        interfaceC56658yNn2.AkhnZx().size();
        AbstractC59316zej.Activity activity = AbstractC59316zej.AEQbTJ;
        java.util.List<InterfaceC56691yOt> listAkhnZx = interfaceC56658yNn.AkhnZx();
        Intrinsics.checkNotNullExpressionValue(listAkhnZx, "");
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listAkhnZx, 10));
        java.util.Iterator<T> it = listAkhnZx.iterator();
        while (it.hasNext()) {
            arrayList.add(((InterfaceC56691yOt) it.next()).fJNWhG());
        }
        java.util.List<InterfaceC56691yOt> listAkhnZx2 = interfaceC56658yNn2.AkhnZx();
        Intrinsics.checkNotNullExpressionValue(listAkhnZx2, "");
        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(listAkhnZx2, 10));
        java.util.Iterator<T> it2 = listAkhnZx2.iterator();
        while (it2.hasNext()) {
            AbstractC59242zdO abstractC59242zdOBQ_ = ((InterfaceC56691yOt) it2.next()).bQ_();
            Intrinsics.checkNotNullExpressionValue(abstractC59242zdOBQ_, "");
            arrayList2.add(C59336zfC.EZpvd((AbstractC59233zdF) abstractC59242zdOBQ_));
        }
        return AbstractC59316zej.Activity.createByConstructorsMap$default(activity, C56424yEw.copydefault(CollectionsKt___CollectionsKt.values(arrayList, arrayList2)), false, 2, null);
    }
}
