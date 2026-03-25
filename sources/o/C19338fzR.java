package o;

import androidx.activity.result.ActivityResultLauncher;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.okinc.account.api.model.wallet.BindWalletInput;
import com.okinc.business.defi.wallet.mine.walletbind.utils.GlobalAppBindCeFiUtils$showNeedSwitchMainAccountDialog$1$2;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.ok_kyc_core_api.ResultBackStatus;
import com.okinc.wallet.widget.dialog.DefiWalletVReminderDFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C13754dXa;
import o.gJK;
import o.rTU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fzR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C19338fzR {
    public static final C19338fzR OLrzqt = new C19338fzR();

    private C19338fzR() {
    }

    public final void KWHzl(@NotNull AbstractActivityC33041mov abstractActivityC33041mov, gJK gjk, ActivityResultLauncher<BindWalletInput> activityResultLauncher, ActivityResultLauncher<android.content.Context> activityResultLauncher2, InterfaceC17318fAx interfaceC17318fAx, Function0<Unit> function0, boolean z) {
        Intrinsics.checkNotNullParameter(abstractActivityC33041mov, "");
        if (Intrinsics.EZpvd(gjk, gJK.Activity.AEQbTJ)) {
            copydefault(abstractActivityC33041mov, activityResultLauncher2);
        } else if (Intrinsics.EZpvd(gjk, gJK.ActionBar.AEQbTJ)) {
            EZpvd(abstractActivityC33041mov);
        } else if (Intrinsics.EZpvd(gjk, gJK.StateListAnimator.EZpvd)) {
            AEQbTJ(abstractActivityC33041mov);
        } else if (Intrinsics.EZpvd(gjk, gJK.FragmentManager.copydefault)) {
            OLrzqt(abstractActivityC33041mov, (LifecycleOwner) abstractActivityC33041mov, function0);
        } else if (gjk instanceof gJK.LoaderManager) {
            KWHzl(abstractActivityC33041mov, ((gJK.LoaderManager) gjk).EZpvd());
        } else if (!(gjk instanceof gJK.Dialog) && !(gjk instanceof gJK.PendingIntent)) {
            if (gjk instanceof gJK.Fragment) {
                if (activityResultLauncher != null) {
                    activityResultLauncher.launch(new BindWalletInput(z ? ((gJK.Fragment) gjk).copydefault() : null, null, null, null, BindWalletInput.EntryPoint.WALLET_DEFAULT, ((gJK.Fragment) gjk).copydefault(), 12, null));
                }
            } else if (gjk instanceof gJK.Application) {
                gJK.Application application = (gJK.Application) gjk;
                pUU.copydefault("WalletBindUIStateObserver", "Error: " + application.KWHzl());
                java.lang.String strKWHzl = application.KWHzl();
                if (strKWHzl != null) {
                    C55326xho.toastWithFailedIcon$default(strKWHzl, 0, 1, (java.lang.Object) null);
                }
            }
        }
        if (gjk == null || interfaceC17318fAx == null) {
            return;
        }
        interfaceC17318fAx.copydefault(gjk);
    }

    public final void copydefault(final AbstractActivityC33041mov abstractActivityC33041mov, final ActivityResultLauncher<android.content.Context> activityResultLauncher) {
        C32866mlf.onEvent$default("LinkedAccount_CefiNotLogin_BottomSheet_View", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
        java.lang.String string = abstractActivityC33041mov.getString(C13754dXa.FragmentManager.ilfrrN);
        Intrinsics.checkNotNullExpressionValue(string, "");
        java.lang.String string2 = abstractActivityC33041mov.getString(C13754dXa.FragmentManager.iRgjgR);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        java.lang.String string3 = abstractActivityC33041mov.getString(C13754dXa.FragmentManager.iZzfmt);
        Intrinsics.checkNotNullExpressionValue(string3, "");
        java.lang.String string4 = abstractActivityC33041mov.getString(C13754dXa.FragmentManager.RZMhtF);
        Intrinsics.checkNotNullExpressionValue(string4, "");
        EZpvd(abstractActivityC33041mov, new DefiWalletVReminderDFragment.ReminderDataBean(0, null, string, string2, string3, string4, 3, null), new Function0() { // from class: o.fzX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C19338fzR.copydefault(activityResultLauncher, abstractActivityC33041mov);
            }
        }, new Function0() { // from class: o.fzT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C19338fzR.AEQbTJ();
            }
        }, new Function0() { // from class: o.fzW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C19338fzR.AYXKKw();
            }
        });
    }

    public static final Unit copydefault(ActivityResultLauncher activityResultLauncher, AbstractActivityC33041mov abstractActivityC33041mov) {
        C32866mlf.onEvent$default("LinkedAccount_CefiNotLogin_BottomSheet_Click", (TrackChannel[]) null, new Function1() { // from class: o.fAe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C19338fzR.AYXKKw((EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        if (activityResultLauncher != null) {
            activityResultLauncher.launch(abstractActivityC33041mov);
        }
        return Unit.INSTANCE;
    }

    public static final Unit AYXKKw(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put(EopTrackEvent.KEY_BUTTON_NAME, "log_in", true);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ() {
        C32866mlf.onEvent$default("LinkedAccount_CefiNotLogin_BottomSheet_Click", (TrackChannel[]) null, new Function1() { // from class: o.fzV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C19338fzR.valueOf((EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    public static final Unit valueOf(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put(EopTrackEvent.KEY_BUTTON_NAME, "maybe_later", true);
        return Unit.INSTANCE;
    }

    public static final Unit AYXKKw() {
        C32866mlf.onEvent$default("LinkedAccount_CefiNotLogin_BottomSheet_Click", (TrackChannel[]) null, new Function1() { // from class: o.fAh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C19338fzR.values((EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    public static final Unit values(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put(EopTrackEvent.KEY_BUTTON_NAME, "exit_bottomsheet", true);
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(AbstractActivityC33041mov abstractActivityC33041mov) {
        java.lang.String string = abstractActivityC33041mov.getString(C13754dXa.FragmentManager.HrFqwD);
        Intrinsics.checkNotNullExpressionValue(string, "");
        java.lang.String string2 = abstractActivityC33041mov.getString(C13754dXa.FragmentManager.geAOna);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        java.lang.String string3 = abstractActivityC33041mov.getString(C13754dXa.FragmentManager.HJWChPzRXNTw);
        Intrinsics.checkNotNullExpressionValue(string3, "");
        showReminderDialog$default(this, abstractActivityC33041mov, new DefiWalletVReminderDFragment.ReminderDataBean(0, null, string, string2, string3, "", 3, null), null, null, null, 28, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.fzR */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void showNeedSwitchMainAccountDialog$default(C19338fzR c19338fzR, AbstractActivityC33041mov abstractActivityC33041mov, LifecycleOwner lifecycleOwner, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            function0 = null;
        }
        c19338fzR.OLrzqt(abstractActivityC33041mov, lifecycleOwner, (Function0<Unit>) function0);
    }

    public final void OLrzqt(final AbstractActivityC33041mov abstractActivityC33041mov, final LifecycleOwner lifecycleOwner, final Function0<Unit> function0) {
        java.lang.String string = abstractActivityC33041mov.getString(C13754dXa.FragmentManager.sanrWj);
        Intrinsics.checkNotNullExpressionValue(string, "");
        java.lang.String string2 = abstractActivityC33041mov.getString(C13754dXa.FragmentManager.hfeTOA);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        java.lang.String string3 = abstractActivityC33041mov.getString(C13754dXa.FragmentManager.gdwsGQ);
        Intrinsics.checkNotNullExpressionValue(string3, "");
        java.lang.String string4 = abstractActivityC33041mov.getString(C13754dXa.FragmentManager.RZMhtF);
        Intrinsics.checkNotNullExpressionValue(string4, "");
        EZpvd(abstractActivityC33041mov, new DefiWalletVReminderDFragment.ReminderDataBean(0, null, string, string2, string3, string4, 3, null), new Function0() { // from class: o.fAa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C19338fzR.copydefault(lifecycleOwner, abstractActivityC33041mov, function0);
            }
        }, new Function0() { // from class: o.fzZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C19338fzR.valueOf();
            }
        }, new Function0() { // from class: o.fzY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C19338fzR.gEmmrt();
            }
        });
    }

    public static final Unit copydefault(LifecycleOwner lifecycleOwner, AbstractActivityC33041mov abstractActivityC33041mov, Function0 function0) {
        C32866mlf.onEvent$default("LinkedAccount_SubAccount_BottomSheet_Click", (TrackChannel[]) null, new Function1() { // from class: o.fzO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C19338fzR.AkhnZx((EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(lifecycleOwner), null, null, new GlobalAppBindCeFiUtils$showNeedSwitchMainAccountDialog$1$2(abstractActivityC33041mov, function0, null), 3, null);
        return Unit.INSTANCE;
    }

    public static final Unit AkhnZx(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put(EopTrackEvent.KEY_BUTTON_NAME, "switch_to_main_account", true);
        return Unit.INSTANCE;
    }

    public static final Unit valueOf() {
        C32866mlf.onEvent$default("LinkedAccount_SubAccount_BottomSheet_Click", (TrackChannel[]) null, new Function1() { // from class: o.fAg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C19338fzR.DbNXlk((EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    public static final Unit DbNXlk(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put(EopTrackEvent.KEY_BUTTON_NAME, "maybe_later", true);
        return Unit.INSTANCE;
    }

    public static final Unit gEmmrt() {
        C32866mlf.onEvent$default("LinkedAccount_SubAccount_BottomSheet_Click", (TrackChannel[]) null, new Function1() { // from class: o.fAb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C19338fzR.isConnected((EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    public static final Unit isConnected(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put(EopTrackEvent.KEY_BUTTON_NAME, "exit_bottomsheet", true);
        return Unit.INSTANCE;
    }

    public final void KWHzl(AbstractActivityC33041mov abstractActivityC33041mov, java.lang.String str) {
        C32866mlf.onEvent$default("LinkedAccount_Capacity_BottomSheet_View", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
        java.lang.String string = abstractActivityC33041mov.getString(C13754dXa.FragmentManager.onLocationChanged);
        Intrinsics.checkNotNullExpressionValue(string, "");
        java.lang.String strKWHzl = C33069mpW.KWHzl(abstractActivityC33041mov, C13754dXa.FragmentManager.sEAkxl, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("num", str)));
        java.lang.String string2 = abstractActivityC33041mov.getString(C13754dXa.FragmentManager.DCJXGO);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        showReminderDialog$default(this, abstractActivityC33041mov, new DefiWalletVReminderDFragment.ReminderDataBean(0, null, string, strKWHzl, string2, "", 3, null), null, null, null, 28, null);
    }

    public final void EZpvd(AbstractActivityC33041mov abstractActivityC33041mov) {
        C32866mlf.onEvent$default("LinkedAccount_NoKyc_KycVerify_View", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
        rTU.Application.checkAndRestrictsDistributary$default((rTU) C43251rlk.copydefault(rTU.class), abstractActivityC33041mov, null, null, new Function1() { // from class: o.fAf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C19338fzR.AEQbTJ(((java.lang.Integer) obj).intValue());
            }
        }, null, new Function1() { // from class: o.fAd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C19338fzR.AEQbTJ((ResultBackStatus) obj);
            }
        }, 22, null);
    }

    public static final Unit AEQbTJ(int i) {
        C32866mlf.onEvent$default("LinkedAccount_NoKyc_KycVerify_Click", (TrackChannel[]) null, new Function1() { // from class: o.fzP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C19338fzR.djBIcL((EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    public static final Unit djBIcL(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put(EopTrackEvent.KEY_BUTTON_NAME, "back", true);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(ResultBackStatus resultBackStatus) {
        final java.lang.String str = resultBackStatus == ResultBackStatus.Success ? "verify_now" : "back";
        C32866mlf.onEvent$default("LinkedAccount_NoKyc_KycVerify_Click", (TrackChannel[]) null, new Function1() { // from class: o.fAc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C19338fzR.EZpvd(str, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put(EopTrackEvent.KEY_BUTTON_NAME, str, true);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: o.fzR */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void showReminderDialog$default(C19338fzR c19338fzR, AbstractActivityC33041mov abstractActivityC33041mov, DefiWalletVReminderDFragment.ReminderDataBean reminderDataBean, Function0 function0, Function0 function02, Function0 function03, int i, java.lang.Object obj) {
        c19338fzR.EZpvd(abstractActivityC33041mov, reminderDataBean, (i & 4) != 0 ? null : function0, (i & 8) != 0 ? null : function02, (i & 16) != 0 ? null : function03);
    }

    public final void EZpvd(AbstractActivityC33041mov abstractActivityC33041mov, DefiWalletVReminderDFragment.ReminderDataBean reminderDataBean, final Function0<Unit> function0, final Function0<Unit> function02, final Function0<Unit> function03) {
        if (abstractActivityC33041mov.isFinishing() || abstractActivityC33041mov.isDestroyed()) {
            return;
        }
        DefiWalletVReminderDFragment defiWalletVReminderDFragmentEZpvd = DefiWalletVReminderDFragment.Companion.EZpvd(reminderDataBean);
        androidx.fragment.app.FragmentManager supportFragmentManager = abstractActivityC33041mov.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        defiWalletVReminderDFragmentEZpvd.AEQbTJ(supportFragmentManager, new Function1() { // from class: o.fzU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C19338fzR.copydefault(function0, function02, function03, (java.lang.Integer) obj);
            }
        });
    }

    public static final Unit copydefault(Function0 function0, Function0 function02, Function0 function03, java.lang.Integer num) {
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
}
