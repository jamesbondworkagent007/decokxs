package o;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC59524zif;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class GF {
    /* JADX INFO: renamed from: recordSeconds-dWUq8MI$default, reason: not valid java name */
    public static /* synthetic */ void m8550recordSecondsdWUq8MI$default(GB gb, long j, InterfaceC57843yq interfaceC57843yq, FW fw, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            interfaceC57843yq = C58108yv.copydefault();
        }
        if ((i & 4) != 0) {
            fw = null;
        }
        copydefault(gb, j, interfaceC57843yq, fw);
    }

    public static final void copydefault(@NotNull GB<java.lang.Double> gb, long j, @NotNull InterfaceC57843yq interfaceC57843yq, FW fw) {
        Intrinsics.checkNotNullParameter(gb, "");
        Intrinsics.checkNotNullParameter(interfaceC57843yq, "");
        gb.KWHzl(java.lang.Double.valueOf(C59462zhW.djBIcL(j) / ((double) 1000000000)), interfaceC57843yq, fw);
    }

    public static /* synthetic */ java.lang.Object measureSeconds$default(GB gb, InterfaceC57843yq interfaceC57843yq, FW fw, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            interfaceC57843yq = C58108yv.copydefault();
        }
        if ((i & 2) != 0) {
            fw = null;
        }
        Intrinsics.checkNotNullParameter(gb, "");
        Intrinsics.checkNotNullParameter(interfaceC57843yq, "");
        Intrinsics.checkNotNullParameter(function0, "");
        C59525zig c59525zig = new C59525zig(function0.invoke(), InterfaceC59524zif.StateListAnimator.Application.AEQbTJ(InterfaceC59524zif.StateListAnimator.AEQbTJ.EZpvd()), null);
        copydefault(gb, c59525zig.AEQbTJ(), interfaceC57843yq, fw);
        return c59525zig.KWHzl();
    }
}
