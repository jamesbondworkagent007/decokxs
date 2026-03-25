package o;

import com.okinc.business.defi.wallet.home.DefiHomeContainerFragment;
import com.okinc.business.defi.wallet.home.navigation.WalletNavigator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.InterfaceC18129fca;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class eUD extends AbstractC32998moE implements InterfaceC18129fca {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int KWHzl = 8;
    public final int AEQbTJ = C13754dXa.TaskDescription.OxVOHk;
    public final InterfaceC56387yDm copydefault = C56392yDr.copydefault(new Function0() { // from class: o.eUC
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return java.lang.Boolean.valueOf(eUD.copydefault(this.copydefault));
        }
    });

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.defi.wallet.home.navigation.WalletNavigator
    public int OLrzqt() {
        return C13754dXa.ActionBar.XW;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.AEQbTJ;
    }

    @Override // com.okinc.business.defi.wallet.home.navigation.WalletNavigator
    public androidx.fragment.app.Fragment KWHzl() {
        return InterfaceC18129fca.TaskDescription.KWHzl(this);
    }

    @Override // com.okinc.business.defi.wallet.home.navigation.WalletNavigator
    public void KWHzl(@NotNull androidx.fragment.app.Fragment fragment, @NotNull java.lang.String str, @NotNull WalletNavigator.Application application) {
        InterfaceC18129fca.TaskDescription.OLrzqt(this, fragment, str, application);
    }

    @Override // com.okinc.business.defi.wallet.home.navigation.WalletNavigator
    public void OLrzqt(@NotNull androidx.fragment.app.Fragment fragment, @NotNull java.lang.String str, @NotNull WalletNavigator.Application application) {
        InterfaceC18129fca.TaskDescription.KWHzl(this, fragment, str, application);
    }

    @Override // com.okinc.business.defi.wallet.home.navigation.WalletNavigator
    public boolean OLrzqt(@NotNull java.lang.String str, boolean z, boolean z2) {
        return InterfaceC18129fca.TaskDescription.copydefault(this, str, z, z2);
    }

    @Override // com.okinc.business.defi.wallet.home.navigation.WalletNavigator
    public void copydefault(@NotNull androidx.fragment.app.Fragment fragment, @NotNull java.lang.String str, @NotNull WalletNavigator.Application application) {
        InterfaceC18129fca.TaskDescription.EZpvd(this, fragment, str, application);
    }

    @Override // com.okinc.business.defi.wallet.home.navigation.WalletNavigator
    public boolean copydefault(boolean z) {
        return InterfaceC18129fca.TaskDescription.EZpvd(this, z);
    }

    @Override // com.okinc.business.defi.wallet.home.navigation.WalletNavigator
    public androidx.fragment.app.FragmentManager EZpvd() {
        androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        return childFragmentManager;
    }

    public final boolean AEQbTJ() {
        return ((java.lang.Boolean) this.copydefault.getValue()).booleanValue();
    }

    public static final boolean copydefault(eUD eud) {
        android.os.Bundle arguments = eud.getArguments();
        if (arguments != null) {
            return arguments.getBoolean("show_lottie_loading", false);
        }
        return false;
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.eUD.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public static /* synthetic */ eUD newInstance$default(ActionBar actionBar, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = false;
            }
            return actionBar.copydefault(z);
        }

        public final eUD copydefault(boolean z) {
            eUD eud = new eUD();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putBoolean("show_lottie_loading", z);
            eud.setArguments(bundle);
            return eud;
        }
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        if (bundle == null) {
            DefiHomeContainerFragment defiHomeContainerFragmentKWHzl = DefiHomeContainerFragment.Companion.KWHzl(AEQbTJ());
            androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            androidx.fragment.app.FragmentTransaction fragmentTransactionBeginTransaction = childFragmentManager.beginTransaction();
            Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction, "");
            fragmentTransactionBeginTransaction.replace(C13754dXa.ActionBar.XW, defiHomeContainerFragmentKWHzl, "DefiHomeContainerFragment");
            fragmentTransactionBeginTransaction.setPrimaryNavigationFragment(defiHomeContainerFragmentKWHzl);
            fragmentTransactionBeginTransaction.commit();
        }
        view.post(new java.lang.Runnable() { // from class: o.eUF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                eUD.AEQbTJ(this.AEQbTJ);
            }
        });
    }

    public static final void AEQbTJ(eUD eud) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) eud, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    @Override // o.AbstractC32998moE
    public void onVisible() {
        pUU.EZpvd(getTAG(), "onVisible");
    }

    @Override // o.AbstractC32998moE
    public void onInvisible() {
        pUU.EZpvd(getTAG(), "onInvisible");
    }
}
