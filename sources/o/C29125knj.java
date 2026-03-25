package o;

import com.okinc.business.market.features.position.ui.widget.BalanceInfoBottomSheet;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.InterfaceC29126knk;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.knj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C29125knj implements InterfaceC29127knl {
    public final androidx.fragment.app.Fragment KWHzl;

    public C29125knj(@NotNull androidx.fragment.app.Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "");
        this.KWHzl = fragment;
    }

    @Override // o.InterfaceC29127knl
    public void copydefault(@NotNull InterfaceC29126knk interfaceC29126knk) {
        Intrinsics.checkNotNullParameter(interfaceC29126knk, "");
        if (interfaceC29126knk instanceof InterfaceC29126knk.TaskDescription) {
            AEQbTJ((InterfaceC29126knk.TaskDescription) interfaceC29126knk);
            return;
        }
        if (interfaceC29126knk instanceof InterfaceC29126knk.Activity) {
            KWHzl(((InterfaceC29126knk.Activity) interfaceC29126knk).AEQbTJ());
        } else if (interfaceC29126knk instanceof InterfaceC29126knk.Application) {
            copydefault((InterfaceC29126knk.Application) interfaceC29126knk);
        } else if (interfaceC29126knk instanceof InterfaceC29126knk.ActionBar) {
            AEQbTJ(((InterfaceC29126knk.ActionBar) interfaceC29126knk).AEQbTJ());
        }
    }

    public final void AEQbTJ(InterfaceC29126knk.TaskDescription taskDescription) {
        android.content.Context contextRequireContext = this.KWHzl.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        C25352ivB.OLrzqt(contextRequireContext, taskDescription.AEQbTJ(), taskDescription.copydefault(), C23274hvD.Fragment.buildRccMetadata);
    }

    private final void KWHzl(java.lang.String str) {
        C25352ivB.KWHzl(this.KWHzl.requireContext(), str);
    }

    public final void copydefault(InterfaceC29126knk.Application application) {
        C25392ivp.copydefault(this.KWHzl, application.KWHzl(), application.copydefault());
    }

    public final void AEQbTJ(java.util.List<BalanceInfoBottomSheet.Companion.PositionContent> list) {
        BalanceInfoBottomSheet balanceInfoBottomSheetKWHzl = BalanceInfoBottomSheet.Companion.KWHzl(list);
        androidx.fragment.app.FragmentManager childFragmentManager = this.KWHzl.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        balanceInfoBottomSheetKWHzl.show(childFragmentManager);
    }
}
