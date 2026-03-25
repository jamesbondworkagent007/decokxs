package o;

import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC9730bbB;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bbH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC9736bbH extends InterfaceC9730bbB {
    java.lang.String KWHzl(int i);

    java.lang.String copydefault(int i, boolean z);

    InterfaceC9730bbB.StateListAnimator copydefault(int i);

    void copydefault(int i, @NotNull java.lang.String str);

    int djBIcL();

    /* JADX INFO: renamed from: o.bbH$StateListAnimator */
    public static final class StateListAnimator {
        public static boolean EZpvd(@NotNull InterfaceC9736bbH interfaceC9736bbH) {
            return interfaceC9736bbH.w_();
        }

        public static boolean copydefault(@NotNull InterfaceC9736bbH interfaceC9736bbH) {
            return interfaceC9736bbH.w_();
        }

        public static java.lang.String KWHzl(@NotNull InterfaceC9736bbH interfaceC9736bbH, boolean z) {
            return interfaceC9736bbH.copydefault(0, z);
        }

        public static void OLrzqt(@NotNull InterfaceC9736bbH interfaceC9736bbH, @NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            interfaceC9736bbH.copydefault(0, str);
        }

        public static InterfaceC9730bbB.StateListAnimator AEQbTJ(@NotNull InterfaceC9736bbH interfaceC9736bbH) {
            return interfaceC9736bbH.copydefault(0);
        }

        public static java.lang.String OLrzqt(@NotNull InterfaceC9736bbH interfaceC9736bbH) {
            return interfaceC9736bbH.KWHzl(0);
        }

        public static /* synthetic */ java.lang.String getApproveAmount$default(InterfaceC9736bbH interfaceC9736bbH, int i, boolean z, int i2, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getApproveAmount");
            }
            if ((i2 & 2) != 0) {
                z = false;
            }
            return interfaceC9736bbH.copydefault(i, z);
        }
    }
}
