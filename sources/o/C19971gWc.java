package o;

import com.okinc.business.dex.trade.copytrading.strategyinfo.ui.StrategyBasicInfoFragment;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.InterfaceC19970gWb;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gWc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C19971gWc implements InterfaceC19969gWa {
    public final androidx.fragment.app.Fragment copydefault;

    public C19971gWc(@NotNull androidx.fragment.app.Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "");
        this.copydefault = fragment;
    }

    public final android.content.Context AEQbTJ() {
        android.content.Context contextRequireContext = this.copydefault.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        return contextRequireContext;
    }

    @Override // o.InterfaceC19969gWa
    public void EZpvd(@NotNull InterfaceC19970gWb interfaceC19970gWb) {
        Intrinsics.checkNotNullParameter(interfaceC19970gWb, "");
        if (interfaceC19970gWb instanceof InterfaceC19970gWb.TaskDescription) {
            return;
        }
        if (!(interfaceC19970gWb instanceof InterfaceC19970gWb.ActionBar)) {
            throw new NoWhenBranchMatchedException();
        }
        AEQbTJ(((InterfaceC19970gWb.ActionBar) interfaceC19970gWb).copydefault());
    }

    public final void AEQbTJ(java.lang.String str) {
        androidx.fragment.app.Fragment fragment = this.copydefault;
        if (fragment instanceof StrategyBasicInfoFragment) {
            ((StrategyBasicInfoFragment) fragment).djBIcL();
        }
        C25352ivB.copydefault(str);
        C25281itk.Companion.OLrzqt(C33070mpX.AYXKKw(C23274hvD.Fragment.playFromMediaId), str).AEQbTJ(AEQbTJ());
    }
}
