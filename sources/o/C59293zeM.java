package o;

import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus;
import o.AbstractC59281zeA;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zeM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C59293zeM {
    public static final AbstractC59242zdO AEQbTJ(@NotNull AbstractC59242zdO abstractC59242zdO, @NotNull CaptureStatus captureStatus) {
        Intrinsics.checkNotNullParameter(abstractC59242zdO, "");
        Intrinsics.checkNotNullParameter(captureStatus, "");
        java.util.List<InterfaceC59317zek> listOLrzqt = OLrzqt(abstractC59242zdO, captureStatus);
        if (listOLrzqt != null) {
            return AEQbTJ(abstractC59242zdO, listOLrzqt);
        }
        return null;
    }

    public static final AbstractC59242zdO AEQbTJ(AbstractC59331zey abstractC59331zey, java.util.List<? extends InterfaceC59317zek> list) {
        return C59231zdD.simpleType$default(abstractC59331zey.bX_(), abstractC59331zey.djBIcL(), list, abstractC59331zey.AEQbTJ(), (AbstractC59287zeG) null, 16, (java.lang.Object) null);
    }

    public static final java.util.List<InterfaceC59317zek> OLrzqt(AbstractC59331zey abstractC59331zey, CaptureStatus captureStatus) {
        if (abstractC59331zey.bY_().size() != abstractC59331zey.djBIcL().copydefault().size()) {
            return null;
        }
        java.util.List<InterfaceC59317zek> listBY_ = abstractC59331zey.bY_();
        if (!(listBY_ instanceof java.util.Collection) || !listBY_.isEmpty()) {
            java.util.Iterator<T> it = listBY_.iterator();
            while (it.hasNext()) {
                if (((InterfaceC59317zek) it.next()).EZpvd() != Variance.INVARIANT) {
                    java.util.List<InterfaceC56691yOt> listCopydefault = abstractC59331zey.djBIcL().copydefault();
                    Intrinsics.checkNotNullExpressionValue(listCopydefault, "");
                    java.util.List<kotlin.Pair> listValues = CollectionsKt___CollectionsKt.values(listBY_, listCopydefault);
                    java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listValues, 10));
                    for (kotlin.Pair pair : listValues) {
                        InterfaceC59317zek interfaceC59317zekEZpvd = (InterfaceC59317zek) pair.component1();
                        InterfaceC56691yOt interfaceC56691yOt = (InterfaceC56691yOt) pair.component2();
                        if (interfaceC59317zekEZpvd.EZpvd() != Variance.INVARIANT) {
                            AbstractC59331zey abstractC59331zeyAkhnZx = (interfaceC59317zekEZpvd.AEQbTJ() || interfaceC59317zekEZpvd.EZpvd() != Variance.IN_VARIANCE) ? null : interfaceC59317zekEZpvd.OLrzqt().AkhnZx();
                            Intrinsics.copydefault(interfaceC56691yOt);
                            interfaceC59317zekEZpvd = C59336zfC.EZpvd((AbstractC59233zdF) new C59288zeH(captureStatus, abstractC59331zeyAkhnZx, interfaceC59317zekEZpvd, interfaceC56691yOt));
                        }
                        arrayList.add(interfaceC59317zekEZpvd);
                    }
                    TypeSubstitutor typeSubstitutorValueOf = AbstractC59316zej.AEQbTJ.copydefault(abstractC59331zey.djBIcL(), arrayList).valueOf();
                    int size = listBY_.size();
                    for (int i = 0; i < size; i++) {
                        InterfaceC59317zek interfaceC59317zek = listBY_.get(i);
                        InterfaceC59317zek interfaceC59317zek2 = (InterfaceC59317zek) arrayList.get(i);
                        if (interfaceC59317zek.EZpvd() != Variance.INVARIANT) {
                            java.util.List<AbstractC59233zdF> listDjBIcL = abstractC59331zey.djBIcL().copydefault().get(i).djBIcL();
                            Intrinsics.checkNotNullExpressionValue(listDjBIcL, "");
                            java.util.ArrayList arrayList2 = new java.util.ArrayList();
                            java.util.Iterator<T> it2 = listDjBIcL.iterator();
                            while (it2.hasNext()) {
                                arrayList2.add(AbstractC59281zeA.Application.copydefault.KWHzl(typeSubstitutorValueOf.AEQbTJ((AbstractC59233zdF) it2.next(), Variance.INVARIANT).AkhnZx()));
                            }
                            if (!interfaceC59317zek.AEQbTJ() && interfaceC59317zek.EZpvd() == Variance.OUT_VARIANCE) {
                                arrayList2.add(AbstractC59281zeA.Application.copydefault.KWHzl(interfaceC59317zek.OLrzqt().AkhnZx()));
                            }
                            AbstractC59233zdF abstractC59233zdFOLrzqt = interfaceC59317zek2.OLrzqt();
                            Intrinsics.copydefault(abstractC59233zdFOLrzqt, "");
                            ((C59288zeH) abstractC59233zdFOLrzqt).djBIcL().OLrzqt(arrayList2);
                        }
                    }
                    return arrayList;
                }
            }
        }
        return null;
    }
}
