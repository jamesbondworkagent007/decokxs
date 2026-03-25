package o;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KTypeProjection;
import kotlin.reflect.KVariance;
import kotlin.reflect.jvm.internal.KotlinReflectionInternalError;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class yJI {

    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[KVariance.values().length];
            try {
                iArr[KVariance.INVARIANT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[KVariance.IN.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[KVariance.OUT.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            EZpvd = iArr;
        }
    }

    public static /* synthetic */ InterfaceC56559yJw createType$default(InterfaceC56553yJq interfaceC56553yJq, java.util.List list, boolean z, java.util.List list2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = yDY.AhwBna();
        }
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            list2 = yDY.AhwBna();
        }
        return EZpvd(interfaceC56553yJq, list, z, list2);
    }

    public static final InterfaceC56559yJw EZpvd(@NotNull InterfaceC56553yJq interfaceC56553yJq, @NotNull java.util.List<KTypeProjection> list, boolean z, @NotNull java.util.List<? extends java.lang.annotation.Annotation> list2) {
        InterfaceC56663yNs interfaceC56663yNsFJNWhG;
        Intrinsics.checkNotNullParameter(interfaceC56553yJq, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Function0 function0 = null;
        byte b = 0;
        yKQ ykq = interfaceC56553yJq instanceof yKQ ? (yKQ) interfaceC56553yJq : null;
        if (ykq == null || (interfaceC56663yNsFJNWhG = ykq.fJNWhG()) == null) {
            throw new KotlinReflectionInternalError("Cannot create type for an unsupported classifier: " + interfaceC56553yJq + " (" + interfaceC56553yJq.getClass() + ')');
        }
        InterfaceC59315zei interfaceC59315zeiFJNWhG = interfaceC56663yNsFJNWhG.fJNWhG();
        Intrinsics.checkNotNullExpressionValue(interfaceC59315zeiFJNWhG, "");
        java.util.List<InterfaceC56691yOt> listCopydefault = interfaceC59315zeiFJNWhG.copydefault();
        Intrinsics.checkNotNullExpressionValue(listCopydefault, "");
        if (listCopydefault.size() != list.size()) {
            throw new java.lang.IllegalArgumentException("Class declares " + listCopydefault.size() + " type parameters, but " + list.size() + " were provided.");
        }
        return new yLJ(OLrzqt(list2.isEmpty() ? C59308zeb.OLrzqt.copydefault() : C59308zeb.OLrzqt.copydefault(), interfaceC59315zeiFJNWhG, list, z), function0, 2, b == true ? 1 : 0);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.zdD.simpleType$default(o.zeb, o.zei, java.util.List, boolean, o.zeG, int, java.lang.Object):o.zdO */
    public static final AbstractC59242zdO OLrzqt(C59308zeb c59308zeb, InterfaceC59315zei interfaceC59315zei, java.util.List<KTypeProjection> list, boolean z) {
        AbstractC59318zel c59250zdW;
        java.util.List<InterfaceC56691yOt> listCopydefault = interfaceC59315zei.copydefault();
        Intrinsics.checkNotNullExpressionValue(listCopydefault, "");
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        int i = 0;
        for (java.lang.Object obj : list) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            KTypeProjection kTypeProjection = (KTypeProjection) obj;
            yLJ ylj = (yLJ) kTypeProjection.copydefault();
            AbstractC59233zdF abstractC59233zdFAEQbTJ = ylj != null ? ylj.AEQbTJ() : null;
            KVariance kVarianceOLrzqt = kTypeProjection.OLrzqt();
            int i2 = kVarianceOLrzqt == null ? -1 : ActionBar.EZpvd[kVarianceOLrzqt.ordinal()];
            if (i2 == -1) {
                InterfaceC56691yOt interfaceC56691yOt = listCopydefault.get(i);
                Intrinsics.checkNotNullExpressionValue(interfaceC56691yOt, "");
                c59250zdW = new C59250zdW(interfaceC56691yOt);
            } else if (i2 == 1) {
                Variance variance = Variance.INVARIANT;
                Intrinsics.copydefault(abstractC59233zdFAEQbTJ);
                c59250zdW = new C59323zeq(variance, abstractC59233zdFAEQbTJ);
            } else if (i2 == 2) {
                Variance variance2 = Variance.IN_VARIANCE;
                Intrinsics.copydefault(abstractC59233zdFAEQbTJ);
                c59250zdW = new C59323zeq(variance2, abstractC59233zdFAEQbTJ);
            } else {
                if (i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                Variance variance3 = Variance.OUT_VARIANCE;
                Intrinsics.copydefault(abstractC59233zdFAEQbTJ);
                c59250zdW = new C59323zeq(variance3, abstractC59233zdFAEQbTJ);
            }
            arrayList.add(c59250zdW);
            i++;
        }
        return C59231zdD.simpleType$default(c59308zeb, interfaceC59315zei, arrayList, z, (AbstractC59287zeG) null, 16, (java.lang.Object) null);
    }
}
