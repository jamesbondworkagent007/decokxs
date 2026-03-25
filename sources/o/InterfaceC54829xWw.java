package o;

import androidx.activity.result.ActivityResultLauncher;
import com.okinc.wallet.api.bean.EnterWalletMainBean;
import com.okinc.wallet.api.bean.WalletRechargeBean;
import com.okinc.wallet.api.bean.WalletRechargeResult;
import com.okinc.wallet.api.bean.WalletScanInformationBean;
import com.okinc.wallet.api.bean.WalletTxDetailBean;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xWw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public interface InterfaceC54829xWw extends InterfaceC43217rlC {
    void AEQbTJ(@NotNull android.app.Activity activity, android.os.Bundle bundle, boolean z, boolean z2, boolean z3);

    void AEQbTJ(@NotNull android.content.Context context, @NotNull ActivityResultLauncher<android.content.Intent> activityResultLauncher);

    void AEQbTJ(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull WalletTxDetailBean walletTxDetailBean, yHO<? super java.lang.Boolean, ? super java.lang.String, ? super java.lang.String, Unit> yho);

    void EZpvd(@NotNull android.app.Activity activity, android.os.Bundle bundle, boolean z, boolean z2, boolean z3);

    void EZpvd(@NotNull AbstractActivityC33041mov abstractActivityC33041mov, @NotNull WalletRechargeBean walletRechargeBean, int i, Function1<? super WalletRechargeResult, Unit> function1);

    void KWHzl(@NotNull android.app.Activity activity, android.os.Bundle bundle, boolean z, boolean z2, boolean z3);

    void KWHzl(@NotNull android.content.Context context, long j, @NotNull java.lang.String str, @NotNull androidx.fragment.app.FragmentManager fragmentManager, Function1<? super android.os.Bundle, Unit> function1);

    void KWHzl(@NotNull android.content.Context context, @NotNull android.os.Bundle bundle);

    void KWHzl(@NotNull android.content.Context context, @NotNull androidx.fragment.app.FragmentManager fragmentManager);

    void KWHzl(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull WalletTxDetailBean walletTxDetailBean, yHO<? super java.lang.Boolean, ? super java.lang.String, ? super java.lang.String, Unit> yho);

    void OLrzqt(@NotNull android.app.Activity activity, android.os.Bundle bundle, boolean z, boolean z2, boolean z3);

    void OLrzqt(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull C6810aWR c6810aWR, @NotNull InterfaceC54850xXq interfaceC54850xXq);

    void copydefault(long j, @NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull Function1<? super java.lang.Boolean, Unit> function1);

    void copydefault(@NotNull android.app.Activity activity, long j, @NotNull java.lang.String str);

    void copydefault(@NotNull android.app.Activity activity, @NotNull EnterWalletMainBean enterWalletMainBean);

    void copydefault(@NotNull android.content.Context context, @NotNull android.os.Bundle bundle);

    void copydefault(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull WalletTxDetailBean walletTxDetailBean, yHO<? super java.lang.Boolean, ? super java.lang.String, ? super java.lang.String, Unit> yho);

    void copydefault(@NotNull AbstractActivityC33041mov abstractActivityC33041mov, Function1<? super WalletRechargeResult, Unit> function1);

    WalletScanInformationBean h_(@NotNull java.lang.String str);

    /* JADX INFO: renamed from: o.xWw$ActionBar */
    public static final class ActionBar {
        public static /* synthetic */ void enterWallet$default(InterfaceC54829xWw interfaceC54829xWw, android.app.Activity activity, android.os.Bundle bundle, boolean z, boolean z2, boolean z3, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: enterWallet");
            }
            if ((i & 2) != 0) {
                bundle = null;
            }
            interfaceC54829xWw.OLrzqt(activity, bundle, (i & 4) != 0 ? true : z, (i & 8) != 0 ? true : z2, (i & 16) != 0 ? true : z3);
        }

        public static /* synthetic */ void enterWalletHistory$default(InterfaceC54829xWw interfaceC54829xWw, android.app.Activity activity, android.os.Bundle bundle, boolean z, boolean z2, boolean z3, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: enterWalletHistory");
            }
            if ((i & 2) != 0) {
                bundle = null;
            }
            interfaceC54829xWw.KWHzl(activity, bundle, (i & 4) != 0 ? true : z, (i & 8) != 0 ? true : z2, (i & 16) != 0 ? true : z3);
        }

        public static /* synthetic */ void enterWalletTxDetail$default(InterfaceC54829xWw interfaceC54829xWw, android.app.Activity activity, android.os.Bundle bundle, boolean z, boolean z2, boolean z3, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: enterWalletTxDetail");
            }
            if ((i & 2) != 0) {
                bundle = null;
            }
            interfaceC54829xWw.AEQbTJ(activity, bundle, (i & 4) != 0 ? true : z, (i & 8) != 0 ? true : z2, (i & 16) != 0 ? true : z3);
        }

        public static /* synthetic */ void transferToDifferentTypeTxDetail$default(InterfaceC54829xWw interfaceC54829xWw, android.app.Activity activity, android.os.Bundle bundle, boolean z, boolean z2, boolean z3, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: transferToDifferentTypeTxDetail");
            }
            if ((i & 2) != 0) {
                bundle = null;
            }
            interfaceC54829xWw.EZpvd(activity, bundle, (i & 4) != 0 ? true : z, (i & 8) != 0 ? true : z2, (i & 16) != 0 ? true : z3);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.xWw */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void startSpeedUpTx$default(InterfaceC54829xWw interfaceC54829xWw, androidx.fragment.app.FragmentManager fragmentManager, WalletTxDetailBean walletTxDetailBean, yHO yho, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startSpeedUpTx");
            }
            if ((i & 4) != 0) {
                yho = null;
            }
            interfaceC54829xWw.copydefault(fragmentManager, walletTxDetailBean, (yHO<? super java.lang.Boolean, ? super java.lang.String, ? super java.lang.String, Unit>) yho);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.xWw */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void startCancelTx$default(InterfaceC54829xWw interfaceC54829xWw, androidx.fragment.app.FragmentManager fragmentManager, WalletTxDetailBean walletTxDetailBean, yHO yho, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startCancelTx");
            }
            if ((i & 4) != 0) {
                yho = null;
            }
            interfaceC54829xWw.AEQbTJ(fragmentManager, walletTxDetailBean, yho);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.xWw */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void startSpeedUpCancelTx$default(InterfaceC54829xWw interfaceC54829xWw, androidx.fragment.app.FragmentManager fragmentManager, WalletTxDetailBean walletTxDetailBean, yHO yho, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startSpeedUpCancelTx");
            }
            if ((i & 4) != 0) {
                yho = null;
            }
            interfaceC54829xWw.KWHzl(fragmentManager, walletTxDetailBean, yho);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.xWw */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void showRechargeDialog$default(InterfaceC54829xWw interfaceC54829xWw, AbstractActivityC33041mov abstractActivityC33041mov, WalletRechargeBean walletRechargeBean, int i, Function1 function1, int i2, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showRechargeDialog");
            }
            if ((i2 & 4) != 0) {
                i = -1;
            }
            if ((i2 & 8) != 0) {
                function1 = null;
            }
            interfaceC54829xWw.EZpvd(abstractActivityC33041mov, walletRechargeBean, i, function1);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.xWw */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void showRechargeDialogNoParam$default(InterfaceC54829xWw interfaceC54829xWw, AbstractActivityC33041mov abstractActivityC33041mov, Function1 function1, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showRechargeDialogNoParam");
            }
            if ((i & 2) != 0) {
                function1 = null;
            }
            interfaceC54829xWw.copydefault(abstractActivityC33041mov, (Function1<? super WalletRechargeResult, Unit>) function1);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: o.xWw */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void showChainRegisterDialog$default(InterfaceC54829xWw interfaceC54829xWw, android.content.Context context, long j, java.lang.String str, androidx.fragment.app.FragmentManager fragmentManager, Function1 function1, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showChainRegisterDialog");
            }
            if ((i & 16) != 0) {
                function1 = null;
            }
            interfaceC54829xWw.KWHzl(context, j, str, fragmentManager, (Function1<? super android.os.Bundle, Unit>) function1);
        }
    }
}
