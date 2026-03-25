package o;

import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeComponentPosition;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class yVD {
    public static final yOL AEQbTJ;
    public static final C56855yUv KWHzl;

    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[NullabilityQualifier.values().length];
            try {
                iArr[NullabilityQualifier.NULLABLE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[NullabilityQualifier.NOT_NULL.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            AEQbTJ = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final yOL EZpvd() {
        return AEQbTJ;
    }

    public static final boolean EZpvd(@NotNull AbstractC59233zdF abstractC59233zdF) {
        Intrinsics.checkNotNullParameter(abstractC59233zdF, "");
        return yVE.EZpvd(C59295zeO.copydefault, abstractC59233zdF);
    }

    public static final yOL copydefault(java.util.List<? extends yOL> list) {
        int size = list.size();
        if (size == 0) {
            throw new java.lang.IllegalStateException("At least one Annotations object expected".toString());
        }
        if (size == 1) {
            return (yOL) CollectionsKt___CollectionsKt.gHZMYf(list);
        }
        return new yOT((java.util.List<? extends yOL>) CollectionsKt___CollectionsKt.AxsJAYsNCnLh(list));
    }

    public static final InterfaceC56663yNs KWHzl(InterfaceC56663yNs interfaceC56663yNs, C56857yUx c56857yUx, TypeComponentPosition typeComponentPosition) {
        yMP ymp = yMP.copydefault;
        if (C56885yVy.KWHzl(typeComponentPosition) && (interfaceC56663yNs instanceof InterfaceC56658yNn)) {
            if (c56857yUx.KWHzl() == MutabilityQualifier.READ_ONLY && typeComponentPosition == TypeComponentPosition.FLEXIBLE_LOWER) {
                InterfaceC56658yNn interfaceC56658yNn = (InterfaceC56658yNn) interfaceC56663yNs;
                if (ymp.AEQbTJ(interfaceC56658yNn)) {
                    return ymp.EZpvd(interfaceC56658yNn);
                }
            }
            if (c56857yUx.KWHzl() == MutabilityQualifier.MUTABLE && typeComponentPosition == TypeComponentPosition.FLEXIBLE_UPPER) {
                InterfaceC56658yNn interfaceC56658yNn2 = (InterfaceC56658yNn) interfaceC56663yNs;
                if (ymp.copydefault(interfaceC56658yNn2)) {
                    return ymp.OLrzqt(interfaceC56658yNn2);
                }
            }
        }
        return null;
    }

    public static final java.lang.Boolean KWHzl(C56857yUx c56857yUx, TypeComponentPosition typeComponentPosition) {
        if (!C56885yVy.KWHzl(typeComponentPosition)) {
            return null;
        }
        NullabilityQualifier nullabilityQualifierOLrzqt = c56857yUx.OLrzqt();
        int i = nullabilityQualifierOLrzqt == null ? -1 : Application.AEQbTJ[nullabilityQualifierOLrzqt.ordinal()];
        if (i == 1) {
            return java.lang.Boolean.TRUE;
        }
        if (i != 2) {
            return null;
        }
        return java.lang.Boolean.FALSE;
    }

    static {
        C56933yXs c56933yXs = yRE.djBIcL;
        Intrinsics.checkNotNullExpressionValue(c56933yXs, "");
        AEQbTJ = new C56855yUv(c56933yXs);
        C56933yXs c56933yXs2 = yRE.KWHzl;
        Intrinsics.checkNotNullExpressionValue(c56933yXs2, "");
        KWHzl = new C56855yUv(c56933yXs2);
    }
}
