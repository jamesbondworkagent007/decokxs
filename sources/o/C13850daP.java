package o;

import android.view.View;
import androidx.lifecycle.LifecycleOwnerKt;
import com.okinc.business.defi.biz.impl.helpers.WalletCefiBindingServiceHelper$showNavigateToOKXAppDialog$1$1$1;
import com.okinc.business.defi.wallet.walletaddressbinding.WalletCefiBindingResultBottomSheet;
import com.okinc.rxutils.RxBus;
import com.okinc.wallet.api.WalletCefiBindingService;
import com.okinc.wallet.widget.dialog.DefiWalletVReminderDFragment;
import java.lang.ref.WeakReference;
import java.net.URLEncoder;
import kotlin.Result;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.daP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C13850daP {
    public static final C13850daP KWHzl = new C13850daP();

    private C13850daP() {
    }

    public final void KWHzl(@NotNull final pKD pkd, @NotNull final gJS gjs, @NotNull final AbstractActivityC33041mov abstractActivityC33041mov, @NotNull final WalletCefiBindingService.FragmentManager fragmentManager) {
        Intrinsics.checkNotNullParameter(pkd, "");
        Intrinsics.checkNotNullParameter(gjs, "");
        Intrinsics.checkNotNullParameter(abstractActivityC33041mov, "");
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(abstractActivityC33041mov);
        viewOnClickListenerC54939xaY.setCancelable(true);
        viewOnClickListenerC54939xaY.setCanceledOnTouchOutside(false);
        viewOnClickListenerC54939xaY.setTitle(abstractActivityC33041mov.getString(C13754dXa.FragmentManager.zuWLRA));
        viewOnClickListenerC54939xaY.EZpvd(abstractActivityC33041mov.getString(C13754dXa.FragmentManager.ffGIBT));
        viewOnClickListenerC54939xaY.EZpvd(C13754dXa.FragmentManager.DXXBbs, new View.OnClickListener() { // from class: o.daO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C13850daP.AEQbTJ(abstractActivityC33041mov, viewOnClickListenerC54939xaY, pkd, fragmentManager, gjs, view);
            }
        });
        viewOnClickListenerC54939xaY.OLrzqt(C13754dXa.FragmentManager.AxsJAYsNCnLh, new View.OnClickListener() { // from class: o.daN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C13850daP.AEQbTJ(viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.show();
    }

    public static final void AEQbTJ(AbstractActivityC33041mov abstractActivityC33041mov, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, pKD pkd, WalletCefiBindingService.FragmentManager fragmentManager, gJS gjs, android.view.View view) {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(abstractActivityC33041mov), null, null, new WalletCefiBindingServiceHelper$showNavigateToOKXAppDialog$1$1$1(pkd, abstractActivityC33041mov, fragmentManager, gjs, null), 3, null);
        viewOnClickListenerC54939xaY.dismiss();
    }

    public static final void AEQbTJ(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    public final void EZpvd(@NotNull AbstractActivityC33041mov abstractActivityC33041mov, @NotNull androidx.fragment.app.FragmentManager fragmentManager) {
        Intrinsics.checkNotNullParameter(abstractActivityC33041mov, "");
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        if (abstractActivityC33041mov.isFinishing() || abstractActivityC33041mov.isDestroyed()) {
            pUU.copydefault("WalletCefiBindingServiceHelper", "showRegionRestrictedDialog: activity is not valid");
            return;
        }
        if (fragmentManager.isStateSaved() || fragmentManager.isDestroyed()) {
            pUU.copydefault("WalletCefiBindingServiceHelper", "showRegionRestrictedDialog: fragmentManager state is not valid");
            return;
        }
        DefiWalletVReminderDFragment.ActionBar actionBar = DefiWalletVReminderDFragment.Companion;
        java.lang.String string = abstractActivityC33041mov.getString(C13754dXa.FragmentManager.HrFqwD);
        Intrinsics.checkNotNullExpressionValue(string, "");
        java.lang.String string2 = abstractActivityC33041mov.getString(C13754dXa.FragmentManager.geAOna);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        java.lang.String string3 = abstractActivityC33041mov.getString(C13754dXa.FragmentManager.HJWChPzRXNTw);
        Intrinsics.checkNotNullExpressionValue(string3, "");
        actionBar.EZpvd(new DefiWalletVReminderDFragment.ReminderDataBean(0, null, string, string2, string3, "", 3, null)).show(fragmentManager);
    }

    public final void KWHzl(@NotNull AbstractActivityC33041mov abstractActivityC33041mov, @NotNull WalletCefiBindingResultBottomSheet.CefiResultStatus cefiResultStatus) {
        Intrinsics.checkNotNullParameter(abstractActivityC33041mov, "");
        Intrinsics.checkNotNullParameter(cefiResultStatus, "");
        if (abstractActivityC33041mov.isFinishing() || abstractActivityC33041mov.isDestroyed()) {
            abstractActivityC33041mov = null;
        }
        if (abstractActivityC33041mov == null) {
            android.app.Activity activityAEQbTJ = C54819xWm.KWHzl().AEQbTJ();
            abstractActivityC33041mov = activityAEQbTJ instanceof AbstractActivityC33041mov ? (AbstractActivityC33041mov) activityAEQbTJ : null;
            if (abstractActivityC33041mov == null) {
                pUU.copydefault("WalletCefiBindingServiceHelper", "showCefiBindingResultPage: activity is not valid");
                return;
            }
        }
        androidx.fragment.app.FragmentManager supportFragmentManager = abstractActivityC33041mov.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        if (supportFragmentManager.isStateSaved() || supportFragmentManager.isDestroyed()) {
            pUU.copydefault("WalletCefiBindingServiceHelper", "showCefiBindingResultPage: fragmentManager state is not valid");
        } else {
            WalletCefiBindingResultBottomSheet.TaskDescription.newInstance$default(WalletCefiBindingResultBottomSheet.Companion, cefiResultStatus, null, 2, null).show(supportFragmentManager);
        }
    }

    public final void KWHzl(@NotNull java.lang.String str, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        RxBus.AEQbTJ(new WalletCefiBindingService.Activity(java.lang.Integer.valueOf(i), str));
        C7323ahf.KWHzl().AEQbTJ("OKCeDeFiBindingResultNotification", null, C56424yEw.gEmmrt(C56390yDp.OLrzqt("requestId", str), C56390yDp.OLrzqt("status", java.lang.Integer.valueOf(i))));
    }

    public final java.lang.String EZpvd(java.lang.String str, java.lang.String str2) {
        java.lang.Object objM7377constructorimpl;
        try {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(URLEncoder.encode(str2, com.google.android.exoplayer2.C.UTF8_NAME));
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            objM7377constructorimpl = null;
        }
        java.lang.String str3 = (java.lang.String) objM7377constructorimpl;
        return str3 != null ? dJJ.copydefault.copydefault(str, C56390yDp.OLrzqt("redirect", str3)) : str;
    }

    public final java.lang.String OLrzqt(java.lang.String str) {
        return (str == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str)) ? "okxwallet://web3/wallet/cefiWalletBinding/redirect" : dJJ.copydefault.copydefault("okxwallet://web3/wallet/cefiWalletBinding/redirect", C56390yDp.OLrzqt("requestId", str));
    }

    /* JADX INFO: renamed from: o.daP$Activity */
    /* JADX INFO: loaded from: classes14.dex */
    public static final class Activity implements WalletCefiBindingService.Application {
        public final WeakReference<AbstractActivityC33041mov> AEQbTJ;

        public Activity(@NotNull AbstractActivityC33041mov abstractActivityC33041mov) {
            Intrinsics.checkNotNullParameter(abstractActivityC33041mov, "");
            this.AEQbTJ = new WeakReference<>(abstractActivityC33041mov);
        }

        @Override // com.okinc.wallet.api.WalletCefiBindingService.Application
        public void copydefault() {
            AbstractActivityC33041mov abstractActivityC33041mov = this.AEQbTJ.get();
            if (abstractActivityC33041mov == null) {
                return;
            }
            if (abstractActivityC33041mov.isFinishing() || abstractActivityC33041mov.isDestroyed()) {
                pUU.copydefault("DefaultLoadingHandler", "Activity is not valid for showing loading");
            } else {
                abstractActivityC33041mov.showLoading();
            }
        }

        @Override // com.okinc.wallet.api.WalletCefiBindingService.Application
        public void OLrzqt() {
            AbstractActivityC33041mov abstractActivityC33041mov = this.AEQbTJ.get();
            if (abstractActivityC33041mov == null) {
                return;
            }
            if (abstractActivityC33041mov.isFinishing() || abstractActivityC33041mov.isDestroyed()) {
                pUU.copydefault("DefaultLoadingHandler", "Activity is not valid for dismiss loading");
            } else {
                abstractActivityC33041mov.dismissLoading();
            }
        }
    }
}
