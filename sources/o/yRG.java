package o;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class yRG {
    public static final <T extends CallableMemberDescriptor> T gEmmrt(@NotNull T t) {
        Intrinsics.checkNotNullParameter(t, "");
        if (!SpecialGenericSignatures.OLrzqt.OLrzqt().contains(t.bR_()) && !C56756yRd.EZpvd.copydefault().contains(yZE.AEQbTJ((CallableMemberDescriptor) t).bR_())) {
            return null;
        }
        if ((t instanceof InterfaceC56676yOe) || (t instanceof InterfaceC56677yOf)) {
            return (T) yZE.firstOverridden$default(t, false, yRI.AEQbTJ, 1, null);
        }
        if (t instanceof InterfaceC56687yOp) {
            return (T) yZE.firstOverridden$default(t, false, yRH.AEQbTJ, 1, null);
        }
        return null;
    }

    public static final boolean djBIcL(CallableMemberDescriptor callableMemberDescriptor) {
        Intrinsics.checkNotNullParameter(callableMemberDescriptor, "");
        return C56761yRi.copydefault.KWHzl(yZE.AEQbTJ(callableMemberDescriptor));
    }

    public static final boolean valueOf(CallableMemberDescriptor callableMemberDescriptor) {
        Intrinsics.checkNotNullParameter(callableMemberDescriptor, "");
        return yQW.EZpvd.OLrzqt((InterfaceC56687yOp) callableMemberDescriptor);
    }

    public static final boolean KWHzl(@NotNull CallableMemberDescriptor callableMemberDescriptor) {
        Intrinsics.checkNotNullParameter(callableMemberDescriptor, "");
        return gEmmrt(callableMemberDescriptor) != null;
    }

    public static final <T extends CallableMemberDescriptor> T AYXKKw(@NotNull T t) {
        Intrinsics.checkNotNullParameter(t, "");
        T t2 = (T) gEmmrt(t);
        if (t2 != null) {
            return t2;
        }
        C56754yRb c56754yRb = C56754yRb.KWHzl;
        C56935yXu c56935yXuBR_ = t.bR_();
        Intrinsics.checkNotNullExpressionValue(c56935yXuBR_, "");
        if (c56754yRb.KWHzl(c56935yXuBR_)) {
            return (T) yZE.firstOverridden$default(t, false, yRF.copydefault, 1, null);
        }
        return null;
    }

    public static final boolean DbNXlk(CallableMemberDescriptor callableMemberDescriptor) {
        Intrinsics.checkNotNullParameter(callableMemberDescriptor, "");
        return AbstractC56640yMw.copydefault(callableMemberDescriptor) && C56754yRb.EZpvd(callableMemberDescriptor) != null;
    }

    public static final java.lang.String OLrzqt(@NotNull CallableMemberDescriptor callableMemberDescriptor) {
        CallableMemberDescriptor callableMemberDescriptorAEQbTJ;
        C56935yXu c56935yXuEZpvd;
        Intrinsics.checkNotNullParameter(callableMemberDescriptor, "");
        CallableMemberDescriptor callableMemberDescriptorAhwBna = AhwBna(callableMemberDescriptor);
        if (callableMemberDescriptorAhwBna != null && (callableMemberDescriptorAEQbTJ = yZE.AEQbTJ(callableMemberDescriptorAhwBna)) != null) {
            if (callableMemberDescriptorAEQbTJ instanceof InterfaceC56676yOe) {
                return C56761yRi.copydefault.EZpvd(callableMemberDescriptorAEQbTJ);
            }
            if ((callableMemberDescriptorAEQbTJ instanceof InterfaceC56687yOp) && (c56935yXuEZpvd = yQW.EZpvd.EZpvd((InterfaceC56687yOp) callableMemberDescriptorAEQbTJ)) != null) {
                return c56935yXuEZpvd.AEQbTJ();
            }
        }
        return null;
    }

    public static final CallableMemberDescriptor AhwBna(CallableMemberDescriptor callableMemberDescriptor) {
        if (AbstractC56640yMw.copydefault(callableMemberDescriptor)) {
            return gEmmrt(callableMemberDescriptor);
        }
        return null;
    }

    public static final boolean OLrzqt(@NotNull InterfaceC56658yNn interfaceC56658yNn, @NotNull InterfaceC56657yNm interfaceC56657yNm) {
        Intrinsics.checkNotNullParameter(interfaceC56658yNn, "");
        Intrinsics.checkNotNullParameter(interfaceC56657yNm, "");
        InterfaceC56665yNu interfaceC56665yNuAYXKKw = interfaceC56657yNm.AYXKKw();
        Intrinsics.copydefault(interfaceC56665yNuAYXKKw, "");
        AbstractC59242zdO abstractC59242zdOBQ_ = ((InterfaceC56658yNn) interfaceC56665yNuAYXKKw).bQ_();
        Intrinsics.checkNotNullExpressionValue(abstractC59242zdOBQ_, "");
        for (InterfaceC56658yNn interfaceC56658yNnEZpvd = yYH.EZpvd(interfaceC56658yNn); interfaceC56658yNnEZpvd != null; interfaceC56658yNnEZpvd = yYH.EZpvd(interfaceC56658yNnEZpvd)) {
            if (!(interfaceC56658yNnEZpvd instanceof InterfaceC56780ySa) && C59302zeV.copydefault(interfaceC56658yNnEZpvd.bQ_(), abstractC59242zdOBQ_) != null) {
                return !AbstractC56640yMw.copydefault((InterfaceC56665yNu) interfaceC56658yNnEZpvd);
            }
        }
        return false;
    }

    public static final boolean values(@NotNull CallableMemberDescriptor callableMemberDescriptor) {
        Intrinsics.checkNotNullParameter(callableMemberDescriptor, "");
        return yZE.AEQbTJ(callableMemberDescriptor).AYXKKw() instanceof InterfaceC56780ySa;
    }

    public static final boolean fetchVPNInfo(@NotNull CallableMemberDescriptor callableMemberDescriptor) {
        Intrinsics.checkNotNullParameter(callableMemberDescriptor, "");
        return values(callableMemberDescriptor) || AbstractC56640yMw.copydefault(callableMemberDescriptor);
    }
}
