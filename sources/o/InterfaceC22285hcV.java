package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hcV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public interface InterfaceC22285hcV extends InterfaceC22278hcO {
    InterfaceC22278hcO OLrzqt();

    /* JADX INFO: renamed from: o.hcV$StateListAnimator */
    public static final class StateListAnimator {
        public static void copydefault(@NotNull InterfaceC22285hcV interfaceC22285hcV, @NotNull InterfaceC22283hcT interfaceC22283hcT) {
            Intrinsics.checkNotNullParameter(interfaceC22283hcT, "");
            interfaceC22285hcV.OLrzqt().setStickScrollChangeListener(interfaceC22283hcT);
        }

        public static void OLrzqt(@NotNull InterfaceC22285hcV interfaceC22285hcV, @NotNull Function0<Unit> function0) {
            Intrinsics.checkNotNullParameter(function0, "");
            interfaceC22285hcV.OLrzqt().setRefreshListener(function0);
        }

        public static void AEQbTJ(@NotNull InterfaceC22285hcV interfaceC22285hcV) {
            interfaceC22285hcV.OLrzqt().EZpvd();
        }

        public static void AEQbTJ(@NotNull InterfaceC22285hcV interfaceC22285hcV, boolean z) {
            interfaceC22285hcV.OLrzqt().AEQbTJ(z);
        }

        public static void AEQbTJ(@NotNull InterfaceC22285hcV interfaceC22285hcV, Function0<Unit> function0) {
            interfaceC22285hcV.OLrzqt().EZpvd(function0);
        }

        public static void copydefault(@NotNull InterfaceC22285hcV interfaceC22285hcV, boolean z, @NotNull Function0<Unit> function0) {
            Intrinsics.checkNotNullParameter(function0, "");
            interfaceC22285hcV.OLrzqt().OLrzqt(z, function0);
        }

        public static void KWHzl(@NotNull InterfaceC22285hcV interfaceC22285hcV) {
            interfaceC22285hcV.OLrzqt().copydefault();
        }

        public static void copydefault(@NotNull InterfaceC22285hcV interfaceC22285hcV, boolean z) {
            interfaceC22285hcV.OLrzqt().OLrzqt(z);
        }

        public static boolean OLrzqt(@NotNull InterfaceC22285hcV interfaceC22285hcV) {
            return interfaceC22285hcV.OLrzqt().AEQbTJ();
        }
    }
}
