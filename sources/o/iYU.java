package o;

import androidx.fragment.app.FragmentActivity;
import com.okinc.business.invest_biz.data.bean.UnifiedRewardInfoByInvestment;
import com.okinc.business.invest_biz.ui.screens.defi_dashboard.unified_rewards.DeFiUnifiedRewardsBottomSheet;
import com.okinc.business.invest_biz.ui.screens.defi_dashboard.unified_rewards.DeFiUnifiedRewardsParams;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC27286jsN;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class iYU implements InterfaceC27287jsO {
    public final java.lang.Integer AEQbTJ;
    public final androidx.fragment.app.Fragment EZpvd;
    public final androidx.fragment.app.FragmentManager KWHzl;

    public iYU(@NotNull androidx.fragment.app.Fragment fragment, androidx.fragment.app.FragmentManager fragmentManager, java.lang.Integer num) {
        Intrinsics.checkNotNullParameter(fragment, "");
        this.EZpvd = fragment;
        this.KWHzl = fragmentManager;
        this.AEQbTJ = num;
    }

    private final FragmentActivity copydefault() {
        FragmentActivity fragmentActivityRequireActivity = this.EZpvd.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        return fragmentActivityRequireActivity;
    }

    @Override // o.InterfaceC27287jsO
    public void OLrzqt(@NotNull InterfaceC27286jsN interfaceC27286jsN) {
        Intrinsics.checkNotNullParameter(interfaceC27286jsN, "");
        if (interfaceC27286jsN instanceof InterfaceC27286jsN.TaskDescription) {
            AEQbTJ(((InterfaceC27286jsN.TaskDescription) interfaceC27286jsN).OLrzqt(), this.KWHzl, this.AEQbTJ);
            return;
        }
        if (interfaceC27286jsN instanceof InterfaceC27286jsN.ActionBar) {
            KWHzl((InterfaceC27286jsN.ActionBar) interfaceC27286jsN);
            return;
        }
        if (interfaceC27286jsN instanceof InterfaceC27286jsN.Activity) {
            EZpvd();
        } else if (interfaceC27286jsN instanceof InterfaceC27286jsN.Dialog) {
            InterfaceC27286jsN.Dialog dialog = (InterfaceC27286jsN.Dialog) interfaceC27286jsN;
            OLrzqt(dialog.AEQbTJ(), dialog.OLrzqt());
        }
    }

    public final void OLrzqt(long j, java.util.List<UnifiedRewardInfoByInvestment> list) {
        DeFiUnifiedRewardsBottomSheet deFiUnifiedRewardsBottomSheetOLrzqt = DeFiUnifiedRewardsBottomSheet.Companion.OLrzqt(new DeFiUnifiedRewardsParams(j, list));
        androidx.fragment.app.FragmentManager parentFragmentManager = this.EZpvd.getParentFragmentManager();
        Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "");
        deFiUnifiedRewardsBottomSheetOLrzqt.show(parentFragmentManager);
    }

    public static /* synthetic */ void openDApp$default(iYU iyu, java.lang.String str, androidx.fragment.app.FragmentManager fragmentManager, java.lang.Integer num, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            fragmentManager = null;
        }
        if ((i & 4) != 0) {
            num = null;
        }
        iyu.AEQbTJ(str, fragmentManager, num);
    }

    public final void AEQbTJ(java.lang.String str, androidx.fragment.app.FragmentManager fragmentManager, java.lang.Integer num) {
        C27508jwX.AEQbTJ.KWHzl(copydefault(), str, fragmentManager, num);
    }

    public final void KWHzl(InterfaceC27286jsN.ActionBar actionBar) {
        C27542jxE.copydefault.OLrzqt(copydefault(), java.lang.Long.valueOf(actionBar.copydefault()), (32 & 4) != 0 ? null : actionBar.KWHzl(), (32 & 8) != 0 ? null : actionBar.OLrzqt(), (32 & 16) != 0 ? null : actionBar.EZpvd(), (32 & 32) != 0 ? false : false);
    }

    public final void EZpvd() {
        C27508jwX.toInvestHomepage$default(C27508jwX.AEQbTJ, copydefault(), null, 1, null);
    }
}
