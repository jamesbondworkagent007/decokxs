package o;

import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import o.AbstractC59287zeG;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class yYE {
    public static final yYE AEQbTJ = new yYE();

    public static final boolean EZpvd(InterfaceC56665yNu interfaceC56665yNu, InterfaceC56665yNu interfaceC56665yNu2) {
        return false;
    }

    public static final boolean copydefault(InterfaceC56665yNu interfaceC56665yNu, InterfaceC56665yNu interfaceC56665yNu2) {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd(@NotNull InterfaceC56691yOt interfaceC56691yOt, @NotNull InterfaceC56691yOt interfaceC56691yOt2, boolean z) {
        Intrinsics.checkNotNullParameter(interfaceC56691yOt, "");
        Intrinsics.checkNotNullParameter(interfaceC56691yOt2, "");
        return areTypeParametersEquivalent$default(this, interfaceC56691yOt, interfaceC56691yOt2, z, null, 8, null);
    }

    private yYE() {
    }

    public static /* synthetic */ boolean areEquivalent$default(yYE yye, InterfaceC56665yNu interfaceC56665yNu, InterfaceC56665yNu interfaceC56665yNu2, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            z2 = true;
        }
        return yye.OLrzqt(interfaceC56665yNu, interfaceC56665yNu2, z, z2);
    }

    public final boolean OLrzqt(InterfaceC56665yNu interfaceC56665yNu, InterfaceC56665yNu interfaceC56665yNu2, boolean z, boolean z2) {
        if ((interfaceC56665yNu instanceof InterfaceC56658yNn) && (interfaceC56665yNu2 instanceof InterfaceC56658yNn)) {
            return OLrzqt((InterfaceC56658yNn) interfaceC56665yNu, (InterfaceC56658yNn) interfaceC56665yNu2);
        }
        if ((interfaceC56665yNu instanceof InterfaceC56691yOt) && (interfaceC56665yNu2 instanceof InterfaceC56691yOt)) {
            return areTypeParametersEquivalent$default(this, (InterfaceC56691yOt) interfaceC56665yNu, (InterfaceC56691yOt) interfaceC56665yNu2, z, null, 8, null);
        }
        if ((interfaceC56665yNu instanceof InterfaceC56657yNm) && (interfaceC56665yNu2 instanceof InterfaceC56657yNm)) {
            return areCallableDescriptorsEquivalent$default(this, (InterfaceC56657yNm) interfaceC56665yNu, (InterfaceC56657yNm) interfaceC56665yNu2, z, z2, false, AbstractC59287zeG.TaskDescription.KWHzl, 16, null);
        }
        return ((interfaceC56665yNu instanceof yNW) && (interfaceC56665yNu2 instanceof yNW)) ? Intrinsics.EZpvd(((yNW) interfaceC56665yNu).KWHzl(), ((yNW) interfaceC56665yNu2).KWHzl()) : Intrinsics.EZpvd(interfaceC56665yNu, interfaceC56665yNu2);
    }

    public final boolean OLrzqt(InterfaceC56658yNn interfaceC56658yNn, InterfaceC56658yNn interfaceC56658yNn2) {
        return Intrinsics.EZpvd(interfaceC56658yNn.fJNWhG(), interfaceC56658yNn2.fJNWhG());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.yYE */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ boolean areTypeParametersEquivalent$default(yYE yye, InterfaceC56691yOt interfaceC56691yOt, InterfaceC56691yOt interfaceC56691yOt2, boolean z, Function2 function2, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            function2 = yYB.OLrzqt;
        }
        return yye.copydefault(interfaceC56691yOt, interfaceC56691yOt2, z, (Function2<? super InterfaceC56665yNu, ? super InterfaceC56665yNu, java.lang.Boolean>) function2);
    }

    public final boolean copydefault(@NotNull InterfaceC56691yOt interfaceC56691yOt, @NotNull InterfaceC56691yOt interfaceC56691yOt2, boolean z, @NotNull Function2<? super InterfaceC56665yNu, ? super InterfaceC56665yNu, java.lang.Boolean> function2) {
        Intrinsics.checkNotNullParameter(interfaceC56691yOt, "");
        Intrinsics.checkNotNullParameter(interfaceC56691yOt2, "");
        Intrinsics.checkNotNullParameter(function2, "");
        if (Intrinsics.EZpvd(interfaceC56691yOt, interfaceC56691yOt2)) {
            return true;
        }
        return !Intrinsics.EZpvd(interfaceC56691yOt.AYXKKw(), interfaceC56691yOt2.AYXKKw()) && OLrzqt(interfaceC56691yOt, interfaceC56691yOt2, function2, z) && interfaceC56691yOt.AEQbTJ() == interfaceC56691yOt2.AEQbTJ();
    }

    public final InterfaceC56686yOo AEQbTJ(InterfaceC56657yNm interfaceC56657yNm) {
        while (interfaceC56657yNm instanceof CallableMemberDescriptor) {
            CallableMemberDescriptor callableMemberDescriptor = (CallableMemberDescriptor) interfaceC56657yNm;
            if (callableMemberDescriptor.bW_() != CallableMemberDescriptor.Kind.FAKE_OVERRIDE) {
                break;
            }
            java.util.Collection<? extends CallableMemberDescriptor> collectionValueOf = callableMemberDescriptor.valueOf();
            Intrinsics.checkNotNullExpressionValue(collectionValueOf, "");
            interfaceC56657yNm = (CallableMemberDescriptor) CollectionsKt___CollectionsKt.iRxXKY(collectionValueOf);
            if (interfaceC56657yNm == null) {
                return null;
            }
        }
        return interfaceC56657yNm.fARcdN();
    }

    public static /* synthetic */ boolean areCallableDescriptorsEquivalent$default(yYE yye, InterfaceC56657yNm interfaceC56657yNm, InterfaceC56657yNm interfaceC56657yNm2, boolean z, boolean z2, boolean z3, AbstractC59287zeG abstractC59287zeG, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            z2 = true;
        }
        boolean z4 = z2;
        if ((i & 16) != 0) {
            z3 = false;
        }
        return yye.KWHzl(interfaceC56657yNm, interfaceC56657yNm2, z, z4, z3, abstractC59287zeG);
    }

    public final boolean KWHzl(@NotNull InterfaceC56657yNm interfaceC56657yNm, @NotNull InterfaceC56657yNm interfaceC56657yNm2, boolean z, boolean z2, boolean z3, @NotNull AbstractC59287zeG abstractC59287zeG) {
        Intrinsics.checkNotNullParameter(interfaceC56657yNm, "");
        Intrinsics.checkNotNullParameter(interfaceC56657yNm2, "");
        Intrinsics.checkNotNullParameter(abstractC59287zeG, "");
        if (Intrinsics.EZpvd(interfaceC56657yNm, interfaceC56657yNm2)) {
            return true;
        }
        if (!Intrinsics.EZpvd(interfaceC56657yNm.bR_(), interfaceC56657yNm2.bR_())) {
            return false;
        }
        if (z2 && (interfaceC56657yNm instanceof yNJ) && (interfaceC56657yNm2 instanceof yNJ) && ((yNJ) interfaceC56657yNm).zLjUOn() != ((yNJ) interfaceC56657yNm2).zLjUOn()) {
            return false;
        }
        if ((Intrinsics.EZpvd(interfaceC56657yNm.AYXKKw(), interfaceC56657yNm2.AYXKKw()) && (!z || !Intrinsics.EZpvd(AEQbTJ(interfaceC56657yNm), AEQbTJ(interfaceC56657yNm2)))) || yYH.fIwbmz(interfaceC56657yNm) || yYH.fIwbmz(interfaceC56657yNm2) || !OLrzqt(interfaceC56657yNm, interfaceC56657yNm2, yYF.KWHzl, z)) {
            return false;
        }
        OverridingUtil overridingUtilAEQbTJ = OverridingUtil.AEQbTJ(abstractC59287zeG, new yYC(z, interfaceC56657yNm, interfaceC56657yNm2));
        Intrinsics.checkNotNullExpressionValue(overridingUtilAEQbTJ, "");
        boolean z4 = !z3;
        OverridingUtil.OverrideCompatibilityInfo.Result resultKWHzl = overridingUtilAEQbTJ.OLrzqt(interfaceC56657yNm, interfaceC56657yNm2, null, z4).KWHzl();
        OverridingUtil.OverrideCompatibilityInfo.Result result = OverridingUtil.OverrideCompatibilityInfo.Result.OVERRIDABLE;
        return resultKWHzl == result && overridingUtilAEQbTJ.OLrzqt(interfaceC56657yNm2, interfaceC56657yNm, null, z4).KWHzl() == result;
    }

    public static final boolean OLrzqt(boolean z, InterfaceC56657yNm interfaceC56657yNm, InterfaceC56657yNm interfaceC56657yNm2, InterfaceC59315zei interfaceC59315zei, InterfaceC59315zei interfaceC59315zei2) {
        Intrinsics.checkNotNullParameter(interfaceC59315zei, "");
        Intrinsics.checkNotNullParameter(interfaceC59315zei2, "");
        if (Intrinsics.EZpvd(interfaceC59315zei, interfaceC59315zei2)) {
            return true;
        }
        InterfaceC56663yNs interfaceC56663yNsKWHzl = interfaceC59315zei.KWHzl();
        InterfaceC56663yNs interfaceC56663yNsKWHzl2 = interfaceC59315zei2.KWHzl();
        if ((interfaceC56663yNsKWHzl instanceof InterfaceC56691yOt) && (interfaceC56663yNsKWHzl2 instanceof InterfaceC56691yOt)) {
            return AEQbTJ.copydefault((InterfaceC56691yOt) interfaceC56663yNsKWHzl, (InterfaceC56691yOt) interfaceC56663yNsKWHzl2, z, new yYD(interfaceC56657yNm, interfaceC56657yNm2));
        }
        return false;
    }

    public static final boolean copydefault(InterfaceC56657yNm interfaceC56657yNm, InterfaceC56657yNm interfaceC56657yNm2, InterfaceC56665yNu interfaceC56665yNu, InterfaceC56665yNu interfaceC56665yNu2) {
        return Intrinsics.EZpvd(interfaceC56665yNu, interfaceC56657yNm) && Intrinsics.EZpvd(interfaceC56665yNu2, interfaceC56657yNm2);
    }

    public final boolean OLrzqt(InterfaceC56665yNu interfaceC56665yNu, InterfaceC56665yNu interfaceC56665yNu2, Function2<? super InterfaceC56665yNu, ? super InterfaceC56665yNu, java.lang.Boolean> function2, boolean z) {
        InterfaceC56665yNu interfaceC56665yNuAYXKKw = interfaceC56665yNu.AYXKKw();
        InterfaceC56665yNu interfaceC56665yNuAYXKKw2 = interfaceC56665yNu2.AYXKKw();
        if ((interfaceC56665yNuAYXKKw instanceof CallableMemberDescriptor) || (interfaceC56665yNuAYXKKw2 instanceof CallableMemberDescriptor)) {
            return function2.invoke(interfaceC56665yNuAYXKKw, interfaceC56665yNuAYXKKw2).booleanValue();
        }
        return areEquivalent$default(this, interfaceC56665yNuAYXKKw, interfaceC56665yNuAYXKKw2, z, false, 8, null);
    }
}
