package o;

import androidx.activity.result.ActivityResultLauncher;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.okinc.account.api.model.wallet.BindWalletInput;
import com.okinc.account.api.model.wallet.BindWalletResult;
import com.okinc.business.defi.wallet.walletaddressbinding.WalletAddressBindViewModel;
import com.okinc.business.defi.wallet.walletaddressbinding.util.WalletBindUIStateHandler$handleJudgeForbiddenCheck$1;
import com.okinc.business.defi.wallet.walletaddressbinding.util.WalletBindUIStateHandler$showNeedSwitchMainAccountDialog$1$2;
import com.okinc.business.defi.wallet.walletaddressbinding.util.WalletBindUIStateHandler$toWalletCefiBindingResult$1;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.ok_kyc_core_api.ResultBackStatus;
import com.okinc.wallet.api.WalletCefiBindingService;
import com.okinc.wallet.api.bean.UnsupportedWalletType;
import com.okinc.wallet.widget.dialog.DefiWalletVReminderDFragment;
import com.okinc.web3.security.track.Web3SecurityTrackEvent;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C10604brb;
import o.C13754dXa;
import o.InterfaceC9739bbK;
import o.gJK;
import o.rTU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class gJY {
    public static final gJY OLrzqt = new gJY();

    private gJY() {
    }

    public final void OLrzqt(@NotNull androidx.fragment.app.Fragment fragment, @NotNull WalletAddressBindViewModel walletAddressBindViewModel, gJK gjk, ActivityResultLauncher<BindWalletInput> activityResultLauncher, ActivityResultLauncher<android.content.Context> activityResultLauncher2, gJR gjr, boolean z) {
        Intrinsics.checkNotNullParameter(fragment, "");
        Intrinsics.checkNotNullParameter(walletAddressBindViewModel, "");
        FragmentActivity activity = fragment.getActivity();
        AbstractActivityC33041mov abstractActivityC33041mov = activity instanceof AbstractActivityC33041mov ? (AbstractActivityC33041mov) activity : null;
        if (abstractActivityC33041mov == null) {
            return;
        }
        LifecycleOwner viewLifecycleOwner = fragment.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        if (Intrinsics.EZpvd(gjk, gJK.Activity.AEQbTJ)) {
            OLrzqt(fragment, activityResultLauncher2);
            return;
        }
        if (Intrinsics.EZpvd(gjk, gJK.ActionBar.AEQbTJ)) {
            copydefault(abstractActivityC33041mov);
            return;
        }
        if (Intrinsics.EZpvd(gjk, gJK.StateListAnimator.EZpvd)) {
            AEQbTJ(fragment);
            return;
        }
        if (Intrinsics.EZpvd(gjk, gJK.FragmentManager.copydefault)) {
            EZpvd(fragment, walletAddressBindViewModel, viewLifecycleOwner);
            return;
        }
        if (gjk instanceof gJK.LoaderManager) {
            OLrzqt(fragment, ((gJK.LoaderManager) gjk).EZpvd());
            return;
        }
        if (gjk instanceof gJK.Dialog) {
            OLrzqt(fragment, walletAddressBindViewModel, (gJK.Dialog) gjk, activityResultLauncher);
            return;
        }
        if (gjk instanceof gJK.PendingIntent) {
            if (gjr != null) {
                java.lang.String strAEQbTJ = walletAddressBindViewModel.AEQbTJ();
                if (strAEQbTJ == null) {
                    strAEQbTJ = "";
                }
                java.lang.String strOLrzqt = walletAddressBindViewModel.OLrzqt();
                gjr.OLrzqt(new WalletCefiBindingService.WalletCefiBindingResult.WalletAlreadyBound(strAEQbTJ, strOLrzqt != null ? strOLrzqt : ""));
                return;
            }
            return;
        }
        if (gjk instanceof gJK.Fragment) {
            if (activityResultLauncher != null) {
                activityResultLauncher.launch(new BindWalletInput(z ? ((gJK.Fragment) gjk).copydefault() : null, java.lang.Integer.valueOf(walletAddressBindViewModel.EZpvd()), null, null, BindWalletInput.EntryPoint.WALLET_DEFAULT, ((gJK.Fragment) gjk).copydefault(), 12, null));
                return;
            }
            return;
        }
        if (gjk instanceof gJK.Application) {
            gJK.Application application = (gJK.Application) gjk;
            pUU.copydefault("WalletBindUIStateObserver", "Error: " + application.KWHzl());
            java.lang.String strKWHzl = application.KWHzl();
            if (strKWHzl != null) {
                C55326xho.toastWithFailedIcon$default(strKWHzl, 0, 1, (java.lang.Object) null);
            }
        }
    }

    public final void OLrzqt(androidx.fragment.app.Fragment fragment, final ActivityResultLauncher<android.content.Context> activityResultLauncher) {
        C32866mlf.onEvent$default("LinkedAccount_CefiNotLogin_BottomSheet_View", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
        FragmentActivity activity = fragment.getActivity();
        final AbstractActivityC33041mov abstractActivityC33041mov = activity instanceof AbstractActivityC33041mov ? (AbstractActivityC33041mov) activity : null;
        if (abstractActivityC33041mov == null) {
            return;
        }
        java.lang.String string = abstractActivityC33041mov.getString(C13754dXa.FragmentManager.ilfrrN);
        Intrinsics.checkNotNullExpressionValue(string, "");
        java.lang.String string2 = abstractActivityC33041mov.getString(C13754dXa.FragmentManager.iRgjgR);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        java.lang.String string3 = abstractActivityC33041mov.getString(C13754dXa.FragmentManager.iZzfmt);
        Intrinsics.checkNotNullExpressionValue(string3, "");
        java.lang.String string4 = abstractActivityC33041mov.getString(C13754dXa.FragmentManager.RZMhtF);
        Intrinsics.checkNotNullExpressionValue(string4, "");
        EZpvd(fragment, new DefiWalletVReminderDFragment.ReminderDataBean(0, null, string, string2, string3, string4, 3, null), new Function0() { // from class: o.gKa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return gJY.AEQbTJ(activityResultLauncher, abstractActivityC33041mov);
            }
        }, new Function0() { // from class: o.gKc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return gJY.KWHzl();
            }
        }, new Function0() { // from class: o.gJZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return gJY.valueOf();
            }
        });
    }

    public static final Unit AEQbTJ(ActivityResultLauncher activityResultLauncher, AbstractActivityC33041mov abstractActivityC33041mov) {
        C32866mlf.onEvent$default("LinkedAccount_CefiNotLogin_BottomSheet_Click", (TrackChannel[]) null, new Function1() { // from class: o.gKp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return gJY.gEmmrt((EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        if (activityResultLauncher != null) {
            activityResultLauncher.launch(abstractActivityC33041mov);
        }
        return Unit.INSTANCE;
    }

    public static final Unit gEmmrt(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put(EopTrackEvent.KEY_BUTTON_NAME, "log_in", true);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl() {
        C32866mlf.onEvent$default("LinkedAccount_CefiNotLogin_BottomSheet_Click", (TrackChannel[]) null, new Function1() { // from class: o.gKn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return gJY.fetchVPNInfo((EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    public static final Unit fetchVPNInfo(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put(EopTrackEvent.KEY_BUTTON_NAME, "maybe_later", true);
        return Unit.INSTANCE;
    }

    public static final Unit valueOf() {
        C32866mlf.onEvent$default("LinkedAccount_CefiNotLogin_BottomSheet_Click", (TrackChannel[]) null, new Function1() { // from class: o.gKm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return gJY.isConnected((EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    public static final Unit isConnected(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put(EopTrackEvent.KEY_BUTTON_NAME, "exit_bottomsheet", true);
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(androidx.fragment.app.Fragment fragment) {
        android.content.Context context = fragment.getContext();
        if (context == null) {
            return;
        }
        java.lang.String string = context.getString(C13754dXa.FragmentManager.HrFqwD);
        Intrinsics.checkNotNullExpressionValue(string, "");
        java.lang.String string2 = context.getString(C13754dXa.FragmentManager.geAOna);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        java.lang.String string3 = context.getString(C13754dXa.FragmentManager.HJWChPzRXNTw);
        Intrinsics.checkNotNullExpressionValue(string3, "");
        showReminderDialog$default(this, fragment, new DefiWalletVReminderDFragment.ReminderDataBean(0, null, string, string2, string3, "", 3, null), null, null, null, 28, null);
    }

    public final void EZpvd(androidx.fragment.app.Fragment fragment, final WalletAddressBindViewModel walletAddressBindViewModel, final LifecycleOwner lifecycleOwner) {
        FragmentActivity activity = fragment.getActivity();
        final AbstractActivityC33041mov abstractActivityC33041mov = activity instanceof AbstractActivityC33041mov ? (AbstractActivityC33041mov) activity : null;
        if (abstractActivityC33041mov == null) {
            return;
        }
        java.lang.String string = abstractActivityC33041mov.getString(C13754dXa.FragmentManager.sanrWj);
        Intrinsics.checkNotNullExpressionValue(string, "");
        java.lang.String string2 = abstractActivityC33041mov.getString(C13754dXa.FragmentManager.hfeTOA);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        java.lang.String string3 = abstractActivityC33041mov.getString(C13754dXa.FragmentManager.gdwsGQ);
        Intrinsics.checkNotNullExpressionValue(string3, "");
        java.lang.String string4 = abstractActivityC33041mov.getString(C13754dXa.FragmentManager.RZMhtF);
        Intrinsics.checkNotNullExpressionValue(string4, "");
        EZpvd(fragment, new DefiWalletVReminderDFragment.ReminderDataBean(0, null, string, string2, string3, string4, 3, null), new Function0() { // from class: o.gKf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return gJY.copydefault(lifecycleOwner, abstractActivityC33041mov, walletAddressBindViewModel);
            }
        }, new Function0() { // from class: o.gKh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return gJY.djBIcL();
            }
        }, new Function0() { // from class: o.gKg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return gJY.gEmmrt();
            }
        });
    }

    public static final Unit copydefault(LifecycleOwner lifecycleOwner, AbstractActivityC33041mov abstractActivityC33041mov, WalletAddressBindViewModel walletAddressBindViewModel) {
        C32866mlf.onEvent$default("LinkedAccount_SubAccount_BottomSheet_Click", (TrackChannel[]) null, new Function1() { // from class: o.gJU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return gJY.values((EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(lifecycleOwner), null, null, new WalletBindUIStateHandler$showNeedSwitchMainAccountDialog$1$2(abstractActivityC33041mov, walletAddressBindViewModel, null), 3, null);
        return Unit.INSTANCE;
    }

    public static final Unit values(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put(EopTrackEvent.KEY_BUTTON_NAME, "switch_to_main_account", true);
        return Unit.INSTANCE;
    }

    public static final Unit djBIcL() {
        C32866mlf.onEvent$default("LinkedAccount_SubAccount_BottomSheet_Click", (TrackChannel[]) null, new Function1() { // from class: o.gJX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return gJY.AkhnZx((EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    public static final Unit AkhnZx(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put(EopTrackEvent.KEY_BUTTON_NAME, "maybe_later", true);
        return Unit.INSTANCE;
    }

    public static final Unit gEmmrt() {
        C32866mlf.onEvent$default("LinkedAccount_SubAccount_BottomSheet_Click", (TrackChannel[]) null, new Function1() { // from class: o.gKi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return gJY.DbNXlk((EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    public static final Unit DbNXlk(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put(EopTrackEvent.KEY_BUTTON_NAME, "exit_bottomsheet", true);
        return Unit.INSTANCE;
    }

    public final void OLrzqt(androidx.fragment.app.Fragment fragment, java.lang.String str) {
        C32866mlf.onEvent$default("LinkedAccount_Capacity_BottomSheet_View", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
        android.content.Context context = fragment.getContext();
        if (context == null) {
            return;
        }
        java.lang.String string = context.getString(C13754dXa.FragmentManager.onLocationChanged);
        Intrinsics.checkNotNullExpressionValue(string, "");
        java.lang.String strKWHzl = C33069mpW.KWHzl(context, C13754dXa.FragmentManager.sEAkxl, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("num", str)));
        java.lang.String string2 = context.getString(C13754dXa.FragmentManager.DCJXGO);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        showReminderDialog$default(this, fragment, new DefiWalletVReminderDFragment.ReminderDataBean(0, null, string, strKWHzl, string2, "", 3, null), null, null, null, 28, null);
    }

    public final void OLrzqt(final androidx.fragment.app.Fragment fragment, final WalletAddressBindViewModel walletAddressBindViewModel, gJK.Dialog dialog, final ActivityResultLauncher<BindWalletInput> activityResultLauncher) {
        FragmentActivity activity = fragment.getActivity();
        final AbstractActivityC33041mov abstractActivityC33041mov = activity instanceof AbstractActivityC33041mov ? (AbstractActivityC33041mov) activity : null;
        if (abstractActivityC33041mov == null) {
            return;
        }
        java.lang.String string = abstractActivityC33041mov.getString(C13754dXa.FragmentManager.nriSR);
        Intrinsics.checkNotNullExpressionValue(string, "");
        int i = C13754dXa.FragmentManager.OqCbbx;
        kotlin.Pair[] pairArr = new kotlin.Pair[2];
        C10854bwM c10854bwMCopydefault = C10954byG.EZpvd.valueOf().copydefault(C33129mqd.valueOf(walletAddressBindViewModel.OLrzqt()));
        java.lang.String strDjBIcL = c10854bwMCopydefault != null ? c10854bwMCopydefault.djBIcL() : null;
        if (strDjBIcL == null) {
            strDjBIcL = "";
        }
        pairArr[0] = C56390yDp.OLrzqt("chainName", strDjBIcL);
        pairArr[1] = C56390yDp.OLrzqt("addr", C14079deg.getAddressStr$default(C14079deg.EZpvd, walletAddressBindViewModel.AEQbTJ(), false, 2, null));
        java.lang.String strKWHzl = C33069mpW.KWHzl(abstractActivityC33041mov, i, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56424yEw.gEmmrt(pairArr));
        java.lang.String string2 = abstractActivityC33041mov.getString(C13754dXa.FragmentManager.DpxfQh);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        java.lang.String string3 = dialog.OLrzqt() ? abstractActivityC33041mov.getString(C13754dXa.FragmentManager.DGgkXd) : "";
        Intrinsics.copydefault((java.lang.Object) string3);
        showReminderDialog$default(this, fragment, new DefiWalletVReminderDFragment.ReminderDataBean(0, null, string, strKWHzl, string2, string3, 3, null), new Function0() { // from class: o.gKq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return gJY.AEQbTJ(abstractActivityC33041mov, fragment, walletAddressBindViewModel);
            }
        }, new Function0() { // from class: o.gKo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return gJY.copydefault(activityResultLauncher, walletAddressBindViewModel);
            }
        }, null, 16, null);
    }

    public static final Unit AEQbTJ(AbstractActivityC33041mov abstractActivityC33041mov, final androidx.fragment.app.Fragment fragment, final WalletAddressBindViewModel walletAddressBindViewModel) {
        C10604brb instance$default = C10604brb.Application.getInstance$default(C10604brb.Companion, null, 1, null);
        LifecycleOwner viewLifecycleOwner = fragment.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        instance$default.KWHzl(abstractActivityC33041mov, viewLifecycleOwner, new Function0() { // from class: o.gKb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return gJY.OLrzqt(fragment, walletAddressBindViewModel);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(final androidx.fragment.app.Fragment fragment, WalletAddressBindViewModel walletAddressBindViewModel) {
        C32866mlf.onEvent$default("LinkedAccount_AddWallet_BottomSheet_Click", (TrackChannel[]) null, new Function1() { // from class: o.gKe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return gJY.ejfBZ((EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        OLrzqt.copydefault(fragment, walletAddressBindViewModel, new Function0() { // from class: o.gKl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return gJY.OLrzqt(fragment);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit ejfBZ(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put(EopTrackEvent.KEY_BUTTON_NAME, Web3SecurityTrackEvent.VALUE_IMPORT, true);
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(androidx.fragment.app.Fragment fragment) {
        C14616don.Companion.KWHzl((226 & 1) != 0 ? 1 : 2, (226 & 2) != 0 ? false : false, (226 & 4) != 0 ? null : null, (226 & 8) != 0 ? yDY.AhwBna() : yDY.gEmmrt(UnsupportedWalletType.MPCWallet, UnsupportedWalletType.HardwareWallet), (226 & 16) == 0 ? false : false, (226 & 32) != 0 ? null : null, (226 & 64) != 0 ? new java.util.ArrayList() : null, (226 & 128) == 0 ? null : null).show(fragment.getChildFragmentManager(), "WalletBindUIStateObserver");
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(ActivityResultLauncher activityResultLauncher, WalletAddressBindViewModel walletAddressBindViewModel) {
        if (activityResultLauncher != null) {
            int iEZpvd = walletAddressBindViewModel.EZpvd();
            activityResultLauncher.launch(new BindWalletInput(null, java.lang.Integer.valueOf(iEZpvd), null, null, BindWalletInput.EntryPoint.WALLET_DEFAULT, null, 44, null));
        }
        return Unit.INSTANCE;
    }

    public final void copydefault(AbstractActivityC33041mov abstractActivityC33041mov) {
        C32866mlf.onEvent$default("LinkedAccount_NoKyc_KycVerify_View", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
        rTU.Application.checkAndRestrictsDistributary$default((rTU) C43251rlk.copydefault(rTU.class), abstractActivityC33041mov, null, null, new Function1() { // from class: o.gKj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return gJY.EZpvd(((java.lang.Integer) obj).intValue());
            }
        }, null, new Function1() { // from class: o.gKs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return gJY.AEQbTJ((ResultBackStatus) obj);
            }
        }, 22, null);
    }

    public static final Unit EZpvd(int i) {
        C32866mlf.onEvent$default("LinkedAccount_NoKyc_KycVerify_Click", (TrackChannel[]) null, new Function1() { // from class: o.gKk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return gJY.valueOf((EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    public static final Unit valueOf(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put(EopTrackEvent.KEY_BUTTON_NAME, "back", true);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(ResultBackStatus resultBackStatus) {
        final java.lang.String str = resultBackStatus == ResultBackStatus.Success ? "verify_now" : "back";
        C32866mlf.onEvent$default("LinkedAccount_NoKyc_KycVerify_Click", (TrackChannel[]) null, new Function1() { // from class: o.gKr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return gJY.EZpvd(str, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put(EopTrackEvent.KEY_BUTTON_NAME, str, true);
        return Unit.INSTANCE;
    }

    public final void copydefault(androidx.fragment.app.Fragment fragment, WalletAddressBindViewModel walletAddressBindViewModel, Function0<Unit> function0) {
        LifecycleOwner viewLifecycleOwner = fragment.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new WalletBindUIStateHandler$handleJudgeForbiddenCheck$1(fragment, walletAddressBindViewModel, function0, null), 3, null);
    }

    public final void AEQbTJ(androidx.fragment.app.Fragment fragment, WalletAddressBindViewModel walletAddressBindViewModel, final Function1<? super Unit, Unit> function1) {
        FragmentActivity activity = fragment.getActivity();
        final AbstractActivityC33041mov abstractActivityC33041mov = activity instanceof AbstractActivityC33041mov ? (AbstractActivityC33041mov) activity : null;
        if (abstractActivityC33041mov == null) {
            return;
        }
        if (walletAddressBindViewModel.KWHzl()) {
            function1.invoke(Unit.INSTANCE);
        } else {
            abstractActivityC33041mov.showLoading();
            C33527myD.subscribeOnIO$default(C58156yvv.OLrzqt(InterfaceC9739bbK.StateListAnimator.ensureInitialized$default(C10337bmZ.KWHzl, false, 1, null), fragment, Lifecycle.Event.ON_DESTROY), new Function1() { // from class: o.gJW
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return gJY.KWHzl(abstractActivityC33041mov, (java.lang.Throwable) obj);
                }
            }, new Function0() { // from class: o.gJV
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return gJY.OLrzqt(function1, abstractActivityC33041mov);
                }
            }, (Function1) null, 4, (java.lang.Object) null);
        }
    }

    public static final Unit KWHzl(AbstractActivityC33041mov abstractActivityC33041mov, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        pUU.copydefault("WalletBindUIStateObserver", "handleEnsureInitData ensureInitialized error message :" + th.getMessage());
        abstractActivityC33041mov.dismissLoading();
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(Function1 function1, AbstractActivityC33041mov abstractActivityC33041mov) {
        Unit unit = Unit.INSTANCE;
        function1.invoke(unit);
        abstractActivityC33041mov.dismissLoading();
        return unit;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: o.gJY */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void showReminderDialog$default(gJY gjy, androidx.fragment.app.Fragment fragment, DefiWalletVReminderDFragment.ReminderDataBean reminderDataBean, Function0 function0, Function0 function02, Function0 function03, int i, java.lang.Object obj) {
        gjy.EZpvd(fragment, reminderDataBean, (i & 4) != 0 ? null : function0, (i & 8) != 0 ? null : function02, (i & 16) != 0 ? null : function03);
    }

    public final void EZpvd(androidx.fragment.app.Fragment fragment, DefiWalletVReminderDFragment.ReminderDataBean reminderDataBean, final Function0<Unit> function0, final Function0<Unit> function02, final Function0<Unit> function03) {
        FragmentActivity activity = fragment.getActivity();
        AbstractActivityC33041mov abstractActivityC33041mov = activity instanceof AbstractActivityC33041mov ? (AbstractActivityC33041mov) activity : null;
        if (abstractActivityC33041mov == null || abstractActivityC33041mov.isFinishing() || abstractActivityC33041mov.isDestroyed() || fragment.getChildFragmentManager().isStateSaved() || fragment.getChildFragmentManager().isDestroyed()) {
            return;
        }
        DefiWalletVReminderDFragment defiWalletVReminderDFragmentEZpvd = DefiWalletVReminderDFragment.Companion.EZpvd(reminderDataBean);
        androidx.fragment.app.FragmentManager childFragmentManager = fragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        defiWalletVReminderDFragmentEZpvd.AEQbTJ(childFragmentManager, new Function1() { // from class: o.gKd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return gJY.OLrzqt(function0, function02, function03, (java.lang.Integer) obj);
            }
        });
    }

    public static final Unit OLrzqt(Function0 function0, Function0 function02, Function0 function03, java.lang.Integer num) {
        if (num != null && num.intValue() == 1) {
            if (function0 != null) {
                function0.invoke();
            }
        } else if (num != null && num.intValue() == 2) {
            if (function02 != null) {
                function02.invoke();
            }
        } else if (function03 != null) {
            function03.invoke();
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ java.lang.Object toWalletCefiBindingResult$default(gJY gjy, BindWalletResult bindWalletResult, java.lang.String str, WalletAddressBindViewModel walletAddressBindViewModel, boolean z, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return gjy.AEQbTJ(bindWalletResult, str, walletAddressBindViewModel, z, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x006c, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.EZpvd(r11, (java.lang.Object) r10) != false) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(@NotNull BindWalletResult bindWalletResult, @NotNull java.lang.String str, @NotNull WalletAddressBindViewModel walletAddressBindViewModel, boolean z, @NotNull Continuation<? super WalletCefiBindingService.WalletCefiBindingResult> continuation) throws java.lang.Throwable {
        WalletBindUIStateHandler$toWalletCefiBindingResult$1 walletBindUIStateHandler$toWalletCefiBindingResult$1;
        java.lang.Object objKWHzl;
        if (continuation instanceof WalletBindUIStateHandler$toWalletCefiBindingResult$1) {
            walletBindUIStateHandler$toWalletCefiBindingResult$1 = (WalletBindUIStateHandler$toWalletCefiBindingResult$1) continuation;
            int i = walletBindUIStateHandler$toWalletCefiBindingResult$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletBindUIStateHandler$toWalletCefiBindingResult$1.label = i - Integer.MIN_VALUE;
            } else {
                walletBindUIStateHandler$toWalletCefiBindingResult$1 = new WalletBindUIStateHandler$toWalletCefiBindingResult$1(this, continuation);
            }
        }
        java.lang.Object obj = walletBindUIStateHandler$toWalletCefiBindingResult$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = walletBindUIStateHandler$toWalletCefiBindingResult$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            if (bindWalletResult instanceof BindWalletResult.Success) {
                if (!z) {
                    java.lang.String accountId = ((BindWalletResult.Success) bindWalletResult).getBoundWalletAccount().getAccountId();
                    walletBindUIStateHandler$toWalletCefiBindingResult$1.L$0 = bindWalletResult;
                    walletBindUIStateHandler$toWalletCefiBindingResult$1.L$1 = str;
                    walletBindUIStateHandler$toWalletCefiBindingResult$1.label = 1;
                    objKWHzl = walletAddressBindViewModel.KWHzl(accountId, walletBindUIStateHandler$toWalletCefiBindingResult$1);
                    if (objKWHzl == objCopydefault) {
                        return objCopydefault;
                    }
                }
                BindWalletResult.Success success = (BindWalletResult.Success) bindWalletResult;
                return new WalletCefiBindingService.WalletCefiBindingResult.Success(new WalletCefiBindingService.WalletCefiBoundAccount(success.getBoundWalletAccount().getAccountId(), success.getBoundWalletAccount().getUserName(), success.getBoundWalletAccount().getWalletAccountName(), success.getBoundWalletAccount().getWalletIcon(), success.getBoundWalletAccount().getWalletAddress(), success.getBoundWalletAccount().getPayoutWalletAddress(), success.getBoundWalletAccount().isCurrentPayoutWallet()), success.isPayout());
            }
            return WalletCefiBindingService.WalletCefiBindingResult.Cancel.EZpvd;
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        str = (java.lang.String) walletBindUIStateHandler$toWalletCefiBindingResult$1.L$1;
        bindWalletResult = (BindWalletResult) walletBindUIStateHandler$toWalletCefiBindingResult$1.L$0;
        C56391yDq.AEQbTJ(obj);
        objKWHzl = ((Result) obj).m7386unboximpl();
        if (Result.m7383isFailureimpl(objKWHzl)) {
            objKWHzl = null;
        }
    }
}
