package o;

import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class yVE {
    public static final <T> T KWHzl(java.util.Set<? extends T> set, T t, T t2, T t3, boolean z) {
        java.util.Set<? extends T> setOqFWZa;
        if (z) {
            T t4 = set.contains(t) ? t : set.contains(t2) ? t2 : null;
            if (Intrinsics.EZpvd(t4, t) && Intrinsics.EZpvd(t3, t2)) {
                return null;
            }
            return t3 == null ? t4 : t3;
        }
        if (t3 != null && (setOqFWZa = CollectionsKt___CollectionsKt.OqFWZa(yEJ.OLrzqt(set, t3))) != null) {
            set = setOqFWZa;
        }
        return (T) CollectionsKt___CollectionsKt.iRxXKY(set);
    }

    public static final NullabilityQualifier EZpvd(java.util.Set<? extends NullabilityQualifier> set, NullabilityQualifier nullabilityQualifier, boolean z) {
        NullabilityQualifier nullabilityQualifier2 = NullabilityQualifier.FORCE_FLEXIBILITY;
        return nullabilityQualifier == nullabilityQualifier2 ? nullabilityQualifier2 : (NullabilityQualifier) KWHzl(set, NullabilityQualifier.NOT_NULL, NullabilityQualifier.NULLABLE, nullabilityQualifier, z);
    }

    public static final NullabilityQualifier KWHzl(C56857yUx c56857yUx) {
        if (c56857yUx.copydefault()) {
            return null;
        }
        return c56857yUx.OLrzqt();
    }

    public static final C56857yUx EZpvd(@NotNull C56857yUx c56857yUx, @NotNull java.util.Collection<C56857yUx> collection, boolean z, boolean z2, boolean z3) {
        NullabilityQualifier nullabilityQualifierEZpvd;
        boolean z4;
        Intrinsics.checkNotNullParameter(c56857yUx, "");
        Intrinsics.checkNotNullParameter(collection, "");
        java.util.Collection<C56857yUx> collection2 = collection;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            NullabilityQualifier nullabilityQualifierKWHzl = KWHzl((C56857yUx) it.next());
            if (nullabilityQualifierKWHzl != null) {
                arrayList.add(nullabilityQualifierKWHzl);
            }
        }
        NullabilityQualifier nullabilityQualifierEZpvd2 = EZpvd(CollectionsKt___CollectionsKt.OqFWZa(arrayList), KWHzl(c56857yUx), z);
        if (nullabilityQualifierEZpvd2 == null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.Iterator<T> it2 = collection2.iterator();
            while (it2.hasNext()) {
                NullabilityQualifier nullabilityQualifierOLrzqt = ((C56857yUx) it2.next()).OLrzqt();
                if (nullabilityQualifierOLrzqt != null) {
                    arrayList2.add(nullabilityQualifierOLrzqt);
                }
            }
            nullabilityQualifierEZpvd = EZpvd(CollectionsKt___CollectionsKt.OqFWZa(arrayList2), c56857yUx.OLrzqt(), z);
        } else {
            nullabilityQualifierEZpvd = nullabilityQualifierEZpvd2;
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.util.Iterator<T> it3 = collection2.iterator();
        while (it3.hasNext()) {
            MutabilityQualifier mutabilityQualifierKWHzl = ((C56857yUx) it3.next()).KWHzl();
            if (mutabilityQualifierKWHzl != null) {
                arrayList3.add(mutabilityQualifierKWHzl);
            }
        }
        MutabilityQualifier mutabilityQualifier = (MutabilityQualifier) KWHzl(CollectionsKt___CollectionsKt.OqFWZa(arrayList3), MutabilityQualifier.MUTABLE, MutabilityQualifier.READ_ONLY, c56857yUx.KWHzl(), z);
        NullabilityQualifier nullabilityQualifier = (nullabilityQualifierEZpvd == null || z3 || (z2 && nullabilityQualifierEZpvd == NullabilityQualifier.NULLABLE)) ? null : nullabilityQualifierEZpvd;
        if (nullabilityQualifier == NullabilityQualifier.NOT_NULL) {
            if (!c56857yUx.AEQbTJ()) {
                if (!collection2.isEmpty()) {
                    java.util.Iterator<T> it4 = collection2.iterator();
                    while (it4.hasNext()) {
                        if (((C56857yUx) it4.next()).AEQbTJ()) {
                        }
                    }
                }
                z4 = false;
            }
            z4 = true;
            break;
        }
        z4 = false;
        return new C56857yUx(nullabilityQualifier, mutabilityQualifier, z4, (nullabilityQualifier == null || nullabilityQualifierEZpvd2 == nullabilityQualifierEZpvd) ? false : true);
    }

    public static final boolean EZpvd(@NotNull InterfaceC59324zer interfaceC59324zer, @NotNull InterfaceC59382zfw interfaceC59382zfw) {
        Intrinsics.checkNotNullParameter(interfaceC59324zer, "");
        Intrinsics.checkNotNullParameter(interfaceC59382zfw, "");
        C56933yXs c56933yXs = yRE.djBIcL;
        Intrinsics.checkNotNullExpressionValue(c56933yXs, "");
        return interfaceC59324zer.OLrzqt(interfaceC59382zfw, c56933yXs);
    }
}
