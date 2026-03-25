package o;

import com.okinc.wallet.api.bean.SupportedNetworkType;
import com.okinc.wallet.api.bean.UnsupportedWalletType;
import com.okinc.wallet.api.bean.Web3ReferralCodeInfo;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import o.xWO;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public interface xWO extends InterfaceC43217rlC {
    public static final Application Companion = Application.AEQbTJ;

    void AEQbTJ(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull InterfaceC54859xXz interfaceC54859xXz, InterfaceC54856xXw interfaceC54856xXw);

    int EZpvd(long j, @NotNull java.lang.String str);

    android.view.View EZpvd(@NotNull AbstractActivityC33041mov abstractActivityC33041mov);

    java.lang.Object EZpvd(@NotNull Continuation<? super Web3ReferralCodeInfo> continuation);

    void EZpvd(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull android.content.Context context, @NotNull Function1<? super java.lang.Boolean, Unit> function1);

    void EZpvd(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull InterfaceC54859xXz interfaceC54859xXz, java.util.List<SupportedNetworkType> list, @NotNull java.util.List<? extends UnsupportedWalletType> list2, InterfaceC54856xXw interfaceC54856xXw);

    void EZpvd(@NotNull java.lang.String str);

    void EZpvd(@NotNull java.lang.String str, @NotNull Function1<? super java.lang.String, Unit> function1);

    int OLrzqt(int i);

    AbstractC58260yxt<java.lang.Boolean> aJ_();

    int aK_();

    int aL_();

    java.util.Map<java.lang.String, java.lang.String> aM_();

    AbstractC58260yxt<java.lang.Boolean> aN_();

    AbstractC58260yxt<java.lang.Boolean> aO_();

    void copydefault(@NotNull android.content.Context context);

    void copydefault(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull C54836xXc c54836xXc, @NotNull InterfaceC54859xXz interfaceC54859xXz, InterfaceC54856xXw interfaceC54856xXw, InterfaceC54852xXs interfaceC54852xXs);

    java.lang.String f_(java.lang.String str);

    AbstractC58185ywX<java.lang.String> g_(@NotNull java.lang.String str);

    public static final class Application {
        public static final /* synthetic */ Application AEQbTJ = new Application();

        private Application() {
        }
    }

    public static final class ActionBar {
        public static /* synthetic */ void showConnectWalletDialog$default(xWO xwo, androidx.fragment.app.FragmentManager fragmentManager, java.lang.String str, java.lang.String str2, InterfaceC54859xXz interfaceC54859xXz, InterfaceC54856xXw interfaceC54856xXw, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showConnectWalletDialog");
            }
            if ((i & 16) != 0) {
                interfaceC54856xXw = null;
            }
            xwo.AEQbTJ(fragmentManager, str, str2, interfaceC54859xXz, interfaceC54856xXw);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: o.xWO */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void showConnectWalletDialog$default(xWO xwo, androidx.fragment.app.FragmentManager fragmentManager, InterfaceC54859xXz interfaceC54859xXz, java.util.List list, java.util.List list2, InterfaceC54856xXw interfaceC54856xXw, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showConnectWalletDialog");
            }
            java.util.List list3 = (i & 4) != 0 ? null : list;
            if ((i & 8) != 0) {
                list2 = yDY.AhwBna();
            }
            xwo.EZpvd(fragmentManager, interfaceC54859xXz, list3, list2, (i & 16) != 0 ? null : interfaceC54856xXw);
        }

        public static Unit OLrzqt(boolean z) {
            return Unit.INSTANCE;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.xWO */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void tryCreateWalletWithCompletion$default(xWO xwo, androidx.fragment.app.FragmentManager fragmentManager, android.content.Context context, Function1 function1, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tryCreateWalletWithCompletion");
            }
            if ((i & 4) != 0) {
                function1 = new Function1() { // from class: o.xWU
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return xWO.ActionBar.OLrzqt(((java.lang.Boolean) obj2).booleanValue());
                    }
                };
            }
            xwo.EZpvd(fragmentManager, context, function1);
        }

        public static /* synthetic */ void showCustomConnectWalletDialog$default(xWO xwo, androidx.fragment.app.FragmentManager fragmentManager, C54836xXc c54836xXc, InterfaceC54859xXz interfaceC54859xXz, InterfaceC54856xXw interfaceC54856xXw, InterfaceC54852xXs interfaceC54852xXs, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showCustomConnectWalletDialog");
            }
            xwo.copydefault(fragmentManager, c54836xXc, interfaceC54859xXz, (i & 8) != 0 ? null : interfaceC54856xXw, (i & 16) != 0 ? null : interfaceC54852xXs);
        }
    }
}
