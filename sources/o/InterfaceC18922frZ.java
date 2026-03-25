package o;

import com.okinc.business.defi.wallet.home.navigation.WalletNavigator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.frZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public interface InterfaceC18922frZ extends WalletNavigator {
    boolean AEQbTJ(boolean z);

    void OLrzqt(boolean z);

    /* JADX INFO: renamed from: o.frZ$StateListAnimator */
    public static final class StateListAnimator {
        public static void EZpvd(@NotNull InterfaceC18922frZ interfaceC18922frZ, @NotNull androidx.fragment.app.Fragment fragment, @NotNull java.lang.String str, @NotNull WalletNavigator.Application application) {
            Intrinsics.checkNotNullParameter(fragment, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(application, "");
            WalletNavigator.Activity.copydefault(interfaceC18922frZ, fragment, str, application);
        }

        public static boolean EZpvd(@NotNull InterfaceC18922frZ interfaceC18922frZ, boolean z) {
            return WalletNavigator.Activity.KWHzl(interfaceC18922frZ, z);
        }

        public static androidx.fragment.app.Fragment KWHzl(@NotNull InterfaceC18922frZ interfaceC18922frZ) {
            return WalletNavigator.Activity.KWHzl(interfaceC18922frZ);
        }

        public static void KWHzl(@NotNull InterfaceC18922frZ interfaceC18922frZ, @NotNull androidx.fragment.app.Fragment fragment, @NotNull java.lang.String str, @NotNull WalletNavigator.Application application) {
            Intrinsics.checkNotNullParameter(fragment, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(application, "");
            WalletNavigator.Activity.AEQbTJ(interfaceC18922frZ, fragment, str, application);
        }

        public static void copydefault(@NotNull InterfaceC18922frZ interfaceC18922frZ, @NotNull androidx.fragment.app.Fragment fragment, @NotNull java.lang.String str, @NotNull WalletNavigator.Application application) {
            Intrinsics.checkNotNullParameter(fragment, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(application, "");
            WalletNavigator.Activity.OLrzqt(interfaceC18922frZ, fragment, str, application);
        }

        public static boolean copydefault(@NotNull InterfaceC18922frZ interfaceC18922frZ, @NotNull java.lang.String str, boolean z, boolean z2) {
            Intrinsics.checkNotNullParameter(str, "");
            return WalletNavigator.Activity.KWHzl(interfaceC18922frZ, str, z, z2);
        }

        public static /* synthetic */ void dismissSearchContainer$default(InterfaceC18922frZ interfaceC18922frZ, boolean z, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: dismissSearchContainer");
            }
            if ((i & 1) != 0) {
                z = false;
            }
            interfaceC18922frZ.OLrzqt(z);
        }

        public static /* synthetic */ boolean popSearchContainerFragment$default(InterfaceC18922frZ interfaceC18922frZ, boolean z, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: popSearchContainerFragment");
            }
            if ((i & 1) != 0) {
                z = false;
            }
            return interfaceC18922frZ.AEQbTJ(z);
        }
    }
}
