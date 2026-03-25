package o;

import com.okinc.wallet.api.bean.CurrentWalletNotSupportedMode;
import com.okinc.wallet.api.bean.CurrentWalletSwitchConfig;
import com.okinc.wallet.api.bean.UnsupportedWalletType;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public interface xWX extends InterfaceC43217rlC {
    void EZpvd(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull CurrentWalletSwitchConfig currentWalletSwitchConfig, Function2<? super InterfaceC9738bbJ, ? super java.lang.Long, java.lang.Boolean> function2, @NotNull java.util.List<? extends UnsupportedWalletType> list, @NotNull InterfaceC54855xXv interfaceC54855xXv);

    void OLrzqt(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull CurrentWalletNotSupportedMode currentWalletNotSupportedMode, @NotNull CurrentWalletSwitchConfig currentWalletSwitchConfig, Function2<? super InterfaceC9738bbJ, ? super java.lang.Long, java.lang.Boolean> function2, @NotNull java.util.List<? extends UnsupportedWalletType> list, @NotNull InterfaceC54855xXv interfaceC54855xXv);

    void copydefault(@NotNull androidx.fragment.app.FragmentManager fragmentManager);

    public static final class TaskDescription {
        /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: o.xWX */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void showCurrentWalletSwitchScreen$default(xWX xwx, androidx.fragment.app.FragmentManager fragmentManager, CurrentWalletSwitchConfig currentWalletSwitchConfig, Function2 function2, java.util.List list, InterfaceC54855xXv interfaceC54855xXv, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showCurrentWalletSwitchScreen");
            }
            if ((i & 4) != 0) {
                function2 = null;
            }
            Function2 function22 = function2;
            if ((i & 8) != 0) {
                list = yDY.AhwBna();
            }
            xwx.EZpvd(fragmentManager, currentWalletSwitchConfig, function22, list, interfaceC54855xXv);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: o.xWX */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void showCurrentWalletNotSupportedScreen$default(xWX xwx, androidx.fragment.app.FragmentManager fragmentManager, CurrentWalletNotSupportedMode currentWalletNotSupportedMode, CurrentWalletSwitchConfig currentWalletSwitchConfig, Function2 function2, java.util.List list, InterfaceC54855xXv interfaceC54855xXv, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showCurrentWalletNotSupportedScreen");
            }
            if ((i & 8) != 0) {
                function2 = null;
            }
            Function2 function22 = function2;
            if ((i & 16) != 0) {
                list = yDY.AhwBna();
            }
            xwx.OLrzqt(fragmentManager, currentWalletNotSupportedMode, currentWalletSwitchConfig, function22, list, interfaceC54855xXv);
        }
    }
}
