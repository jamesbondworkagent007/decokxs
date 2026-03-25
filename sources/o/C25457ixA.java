package o;

import com.okinc.business.invest_biz.ui.screens.defi_dashboard.DashboardFragment;
import com.okinc.business.invest_biz.ui.screens.home.container.InvestHomeContainerFragment;
import com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import o.C25493ixk;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ixA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C25457ixA extends AbstractC43215rlA implements InterfaceC9774bbt {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC9774bbt
    public int KWHzl() {
        return C25493ixk.FragmentManager.DcMfJKfbSiEC;
    }

    @Override // o.InterfaceC9774bbt
    public androidx.fragment.app.Fragment OLrzqt() {
        return InvestHomeContainerFragment.ActionBar.newInstance$default(InvestHomeContainerFragment.Companion, false, 1, null);
    }

    @Override // o.InterfaceC9774bbt
    public androidx.fragment.app.Fragment KWHzl(java.lang.String str, java.lang.Long l) {
        return DashboardFragment.TaskDescription.newInstance$default(DashboardFragment.Companion, str, l, null, null, 12, null);
    }

    @Override // o.InterfaceC9774bbt
    public androidx.fragment.app.Fragment AEQbTJ(java.lang.String str, java.lang.Long l, androidx.fragment.app.FragmentManager fragmentManager, java.lang.Integer num) {
        return DashboardFragment.Companion.copydefault(str, l, fragmentManager, num);
    }

    @Override // o.InterfaceC9774bbt
    public void AEQbTJ(@NotNull android.content.Context context, java.lang.Long l, java.lang.Long l2) {
        Intrinsics.checkNotNullParameter(context, "");
        C27508jwX.AEQbTJ.copydefault(context);
    }

    @Override // o.InterfaceC9774bbt
    public java.lang.Object EZpvd(@NotNull android.content.Context context, @NotNull Continuation<? super java.lang.Boolean> continuation) {
        return C56443yFo.KWHzl(C25596izh.OLrzqt(context).KWHzl(context, new iBC(0, 0, 0, null, null, 31, null)));
    }

    @Override // o.InterfaceC9774bbt
    public java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull android.content.Context context, @NotNull Continuation<? super java.lang.Boolean> continuation) {
        return C56443yFo.KWHzl(C25596izh.OLrzqt(context).OLrzqt(context, str));
    }

    @Override // o.InterfaceC9774bbt
    public boolean AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C59449zhJ.startsWith$default(str, "metaX/invest/home", false, 2, null) || C59449zhJ.startsWith$default(str, "wallet/invest/home", false, 2, null);
    }

    @Override // o.InterfaceC9774bbt
    public void OLrzqt(boolean z) {
        C24200iYp.OLrzqt.AEQbTJ(z);
    }

    @Override // o.InterfaceC9774bbt
    public java.lang.Object KWHzl(@NotNull Continuation<? super java.lang.Boolean> continuation) {
        return C56443yFo.KWHzl(((InterfaceC23916iOb) C43251rlk.copydefault(InterfaceC23916iOb.class)).AEQbTJ(OKComplianceRestrictionService.Feature.WEB3DEFI));
    }
}
