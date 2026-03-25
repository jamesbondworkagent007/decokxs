package o;

import androidx.activity.OnBackPressedCallback;
import androidx.lifecycle.LifecycleOwner;
import com.okinc.business.defi.dapp.base.FragmentNavigator;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dsv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C14836dsv {
    public final androidx.fragment.app.Fragment AEQbTJ;
    public final InterfaceC15111dyE OLrzqt;
    public final StateListAnimator copydefault;

    public C14836dsv(@NotNull androidx.fragment.app.Fragment fragment, @NotNull InterfaceC15111dyE interfaceC15111dyE) {
        Intrinsics.checkNotNullParameter(fragment, "");
        Intrinsics.checkNotNullParameter(interfaceC15111dyE, "");
        this.AEQbTJ = fragment;
        this.OLrzqt = interfaceC15111dyE;
        this.copydefault = new StateListAnimator();
    }

    /* JADX INFO: renamed from: o.dsv$StateListAnimator */
    public static final class StateListAnimator extends OnBackPressedCallback {
        public StateListAnimator() {
            super(true);
        }

        @Override // androidx.activity.OnBackPressedCallback
        public void handleOnBackPressed() {
            if (C14836dsv.this.OLrzqt.az_()) {
                return;
            }
            C14836dsv.this.copydefault();
        }
    }

    public final void copydefault() {
        androidx.fragment.app.FragmentManager parentFragmentManager = this.AEQbTJ.getParentFragmentManager();
        Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "");
        FragmentNavigator.StateListAnimator.from$default(FragmentNavigator.Companion, parentFragmentManager, null, 2, null).OLrzqt(this.AEQbTJ, (2 & 2) != 0 ? new FragmentNavigator.Application(C52761wXj.Application.DbNXlk, C52761wXj.Application.AuCTel, 0, 0, false, false, null, null, false, false, 1008, null) : null);
    }

    public final void OLrzqt(@NotNull LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        this.AEQbTJ.requireActivity().getOnBackPressedDispatcher().addCallback(lifecycleOwner, this.copydefault);
        this.copydefault.setEnabled(!this.AEQbTJ.isHidden());
    }

    public final void KWHzl(boolean z) {
        this.copydefault.setEnabled(!z);
    }

    public final void KWHzl() {
        this.copydefault.setEnabled(!this.AEQbTJ.isHidden());
    }

    public final void EZpvd() {
        this.copydefault.setEnabled(false);
    }

    public final void AEQbTJ() {
        this.copydefault.remove();
    }
}
