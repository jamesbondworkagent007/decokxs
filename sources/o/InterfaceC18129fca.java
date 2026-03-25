package o;

import com.okinc.business.defi.wallet.home.navigation.WalletNavigator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fca, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public interface InterfaceC18129fca extends WalletNavigator {

    /* JADX INFO: renamed from: o.fca$TaskDescription */
    public static final class TaskDescription {
        public static void EZpvd(@NotNull InterfaceC18129fca interfaceC18129fca, @NotNull androidx.fragment.app.Fragment fragment, @NotNull java.lang.String str, @NotNull WalletNavigator.Application application) {
            Intrinsics.checkNotNullParameter(fragment, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(application, "");
            WalletNavigator.Activity.copydefault(interfaceC18129fca, fragment, str, application);
        }

        public static boolean EZpvd(@NotNull InterfaceC18129fca interfaceC18129fca, boolean z) {
            return WalletNavigator.Activity.KWHzl(interfaceC18129fca, z);
        }

        public static androidx.fragment.app.Fragment KWHzl(@NotNull InterfaceC18129fca interfaceC18129fca) {
            return WalletNavigator.Activity.KWHzl(interfaceC18129fca);
        }

        public static void KWHzl(@NotNull InterfaceC18129fca interfaceC18129fca, @NotNull androidx.fragment.app.Fragment fragment, @NotNull java.lang.String str, @NotNull WalletNavigator.Application application) {
            Intrinsics.checkNotNullParameter(fragment, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(application, "");
            WalletNavigator.Activity.OLrzqt(interfaceC18129fca, fragment, str, application);
        }

        public static void OLrzqt(@NotNull InterfaceC18129fca interfaceC18129fca, @NotNull androidx.fragment.app.Fragment fragment, @NotNull java.lang.String str, @NotNull WalletNavigator.Application application) {
            Intrinsics.checkNotNullParameter(fragment, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(application, "");
            WalletNavigator.Activity.AEQbTJ(interfaceC18129fca, fragment, str, application);
        }

        public static boolean copydefault(@NotNull InterfaceC18129fca interfaceC18129fca, @NotNull java.lang.String str, boolean z, boolean z2) {
            Intrinsics.checkNotNullParameter(str, "");
            return WalletNavigator.Activity.KWHzl(interfaceC18129fca, str, z, z2);
        }
    }
}
