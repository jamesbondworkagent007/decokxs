package o;

import com.okinc.wallet.api.bean.CurrentWalletNotSupportedMode;
import com.okinc.wallet.api.bean.CurrentWalletSwitchConfig;
import com.okinc.wallet.api.bean.UnsupportedWalletType;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C17746fQt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fQa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C17727fQa extends AbstractC43215rlA implements xWX {
    @Override // o.xWX
    public void EZpvd(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull CurrentWalletSwitchConfig currentWalletSwitchConfig, Function2<? super InterfaceC9738bbJ, ? super java.lang.Long, java.lang.Boolean> function2, @NotNull java.util.List<? extends UnsupportedWalletType> list, @NotNull InterfaceC54855xXv interfaceC54855xXv) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(currentWalletSwitchConfig, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(interfaceC54855xXv, "");
        fQD fqdAEQbTJ = fQD.Companion.AEQbTJ(currentWalletSwitchConfig, list);
        if (function2 != null) {
            fqdAEQbTJ.KWHzl(function2);
        }
        fqdAEQbTJ.EZpvd(interfaceC54855xXv);
        fqdAEQbTJ.show(fragmentManager, fQI.class.getCanonicalName());
    }

    @Override // o.xWX
    public void OLrzqt(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull CurrentWalletNotSupportedMode currentWalletNotSupportedMode, @NotNull CurrentWalletSwitchConfig currentWalletSwitchConfig, Function2<? super InterfaceC9738bbJ, ? super java.lang.Long, java.lang.Boolean> function2, @NotNull java.util.List<? extends UnsupportedWalletType> list, @NotNull InterfaceC54855xXv interfaceC54855xXv) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(currentWalletNotSupportedMode, "");
        Intrinsics.checkNotNullParameter(currentWalletSwitchConfig, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(interfaceC54855xXv, "");
        C17746fQt.Companion.KWHzl(currentWalletNotSupportedMode, new StateListAnimator(currentWalletSwitchConfig, list, fragmentManager, function2, interfaceC54855xXv)).show(fragmentManager, C17746fQt.class.getCanonicalName());
    }

    /* JADX INFO: renamed from: o.fQa$StateListAnimator */
    public static final class StateListAnimator implements C17746fQt.StateListAnimator {
        public final /* synthetic */ CurrentWalletSwitchConfig AEQbTJ;
        public final /* synthetic */ Function2<InterfaceC9738bbJ, java.lang.Long, java.lang.Boolean> EZpvd;
        public final /* synthetic */ java.util.List<UnsupportedWalletType> KWHzl;
        public final /* synthetic */ InterfaceC54855xXv OLrzqt;
        public final /* synthetic */ androidx.fragment.app.FragmentManager copydefault;

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends com.okinc.wallet.api.bean.UnsupportedWalletType> */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function2<? super o.bbJ, ? super java.lang.Long, java.lang.Boolean> */
        /* JADX WARN: Multi-variable type inference failed */
        public StateListAnimator(CurrentWalletSwitchConfig currentWalletSwitchConfig, java.util.List<? extends UnsupportedWalletType> list, androidx.fragment.app.FragmentManager fragmentManager, Function2<? super InterfaceC9738bbJ, ? super java.lang.Long, java.lang.Boolean> function2, InterfaceC54855xXv interfaceC54855xXv) {
            this.AEQbTJ = currentWalletSwitchConfig;
            this.KWHzl = list;
            this.copydefault = fragmentManager;
            this.EZpvd = function2;
            this.OLrzqt = interfaceC54855xXv;
        }

        @Override // o.C17746fQt.StateListAnimator
        public void AEQbTJ() {
            fQD fqdAEQbTJ = fQD.Companion.AEQbTJ(this.AEQbTJ, this.KWHzl);
            Function2<InterfaceC9738bbJ, java.lang.Long, java.lang.Boolean> function2 = this.EZpvd;
            InterfaceC54855xXv interfaceC54855xXv = this.OLrzqt;
            if (function2 != null) {
                fqdAEQbTJ.KWHzl(function2);
            }
            fqdAEQbTJ.EZpvd(interfaceC54855xXv);
            fqdAEQbTJ.show(this.copydefault, fQI.class.getCanonicalName());
        }

        @Override // o.C17746fQt.StateListAnimator
        public void EZpvd() {
            this.OLrzqt.copydefault();
        }
    }

    @Override // o.xWX
    public void copydefault(@NotNull androidx.fragment.app.FragmentManager fragmentManager) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        androidx.fragment.app.Fragment fragmentFindFragmentByTag = fragmentManager.findFragmentByTag(fQD.class.getCanonicalName());
        fQD fqd = fragmentFindFragmentByTag instanceof fQD ? (fQD) fragmentFindFragmentByTag : null;
        if (fqd != null) {
            fqd.AEQbTJ();
        }
    }
}
