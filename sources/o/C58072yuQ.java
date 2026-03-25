package o;

import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC58028ytZ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yuQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C58072yuQ {
    public static final boolean KWHzl(@NotNull InterfaceC58028ytZ.StateListAnimator stateListAnimator, @NotNull InterfaceC58028ytZ.StateListAnimator stateListAnimator2) {
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        Intrinsics.checkNotNullParameter(stateListAnimator2, "");
        return Intrinsics.EZpvd(stateListAnimator, stateListAnimator2) || (EZpvd(stateListAnimator) && EZpvd(stateListAnimator2));
    }

    public static final boolean EZpvd(InterfaceC58028ytZ.StateListAnimator stateListAnimator) {
        return stateListAnimator instanceof InterfaceC58028ytZ.StateListAnimator.AbstractC1012StateListAnimator;
    }

    public static final boolean copydefault(InterfaceC58028ytZ.StateListAnimator stateListAnimator) {
        return Intrinsics.EZpvd(stateListAnimator, InterfaceC58028ytZ.StateListAnimator.AbstractC1012StateListAnimator.TaskDescription.EZpvd);
    }

    public static final InterfaceC58028ytZ.StateListAnimator EZpvd(@NotNull java.util.List<yBO<InterfaceC58028ytZ.StateListAnimator>> list) {
        Intrinsics.checkNotNullParameter(list, "");
        boolean z = list instanceof java.util.Collection;
        if (!z || !list.isEmpty()) {
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                java.lang.Object objAEQbTJ = ((yBO) it.next()).AEQbTJ();
                Intrinsics.checkNotNullExpressionValue(objAEQbTJ, "");
                if (copydefault((InterfaceC58028ytZ.StateListAnimator) objAEQbTJ)) {
                    return InterfaceC58028ytZ.StateListAnimator.AbstractC1012StateListAnimator.TaskDescription.EZpvd;
                }
            }
        }
        if (!z || !list.isEmpty()) {
            java.util.Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                java.lang.Object objAEQbTJ2 = ((yBO) it2.next()).AEQbTJ();
                Intrinsics.checkNotNullExpressionValue(objAEQbTJ2, "");
                if (EZpvd((InterfaceC58028ytZ.StateListAnimator) objAEQbTJ2)) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    for (java.lang.Object obj : list) {
                        java.lang.Object objAEQbTJ3 = ((yBO) obj).AEQbTJ();
                        Intrinsics.checkNotNullExpressionValue(objAEQbTJ3, "");
                        if (EZpvd((InterfaceC58028ytZ.StateListAnimator) objAEQbTJ3)) {
                            arrayList.add(obj);
                        }
                    }
                    java.lang.Object objAEQbTJ4 = ((yBO) CollectionsKt___CollectionsKt.AuCTelauCTel(CollectionsKt___CollectionsKt.EZpvd(arrayList, new StateListAnimator()))).AEQbTJ();
                    Intrinsics.checkNotNullExpressionValue(objAEQbTJ4, "");
                    return (InterfaceC58028ytZ.StateListAnimator) objAEQbTJ4;
                }
            }
        }
        return InterfaceC58028ytZ.StateListAnimator.Activity.EZpvd;
    }

    /* JADX INFO: renamed from: o.yuQ$StateListAnimator */
    public static final class StateListAnimator<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(java.lang.Long.valueOf(((yBO) t).KWHzl()), java.lang.Long.valueOf(((yBO) t2).KWHzl()));
        }
    }
}
