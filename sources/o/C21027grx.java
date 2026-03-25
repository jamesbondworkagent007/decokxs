package o;

import androidx.activity.result.ActivityResultLauncher;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import com.okinc.assets.api.model.WithdrawDisabledReason;
import com.okinc.business.defi.wallet.transfer.manager.ExchangeFastTransferManager$judgeCanWalletWithdraw$1;
import com.okinc.business.defi.wallet.transfer.manager.ExchangeFastTransferManager$systemTestJudgeOrStartExchangeAssetsActivity$1;
import com.okinc.core.util.SPUtils;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C13754dXa;
import o.C14140dfo;
import o.C21034gsD;
import o.C21118gti;
import o.rTU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.grx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C21027grx {
    public static boolean KWHzl;
    public static final C21027grx copydefault = new C21027grx();
    public static final int EZpvd = 8;

    /* JADX INFO: renamed from: o.grx$Activity */
    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[WithdrawDisabledReason.values().length];
            try {
                iArr[WithdrawDisabledReason.DemoTrading.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[WithdrawDisabledReason.SubAccount.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[WithdrawDisabledReason.OneDayFreeze.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[WithdrawDisabledReason.MissingTwoFactorBinding.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[WithdrawDisabledReason.KycError.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            EZpvd = iArr;
        }
    }

    private C21027grx() {
    }

    public final void KWHzl(boolean z) {
        KWHzl = z;
        SPUtils.put("exchangeFastModeGlobalSwitchKey", java.lang.Boolean.valueOf(z), "exchangeFastModeFirstUseFile");
    }

    public final boolean AEQbTJ() {
        return SPUtils.getBoolean("exchangeFastModeGlobalSwitchKey", false, "exchangeFastModeFirstUseFile");
    }

    public final boolean copydefault() {
        return SPUtils.getBoolean("exchangeFastModeFirstUseKey", true, "exchangeFastModeFirstUseFile");
    }

    public final void copydefault(boolean z) {
        SPUtils.put("exchangeFastModeFirstUseKey", java.lang.Boolean.valueOf(z), "exchangeFastModeFirstUseFile");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.grx */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void exchangeFastModeFirstUseGuideLogic$default(C21027grx c21027grx, androidx.fragment.app.FragmentManager fragmentManager, boolean z, android.content.Context context, Function2 function2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        if ((i & 8) != 0) {
            function2 = null;
        }
        c21027grx.KWHzl(fragmentManager, z, context, function2);
    }

    public final void KWHzl(androidx.fragment.app.FragmentManager fragmentManager, boolean z, android.content.Context context, final Function2<? super java.lang.Integer, ? super java.lang.Boolean, Unit> function2) {
        if (!copydefault() || C14728dqt.KWHzl.KWHzl()) {
            if (function2 != null) {
                function2.invoke(3, java.lang.Boolean.FALSE);
            }
        } else {
            C21034gsD c21034gsDKWHzl = C21034gsD.Companion.KWHzl(z);
            java.lang.String simpleName = C21027grx.class.getSimpleName();
            Intrinsics.checkNotNullExpressionValue(simpleName, "");
            c21034gsDKWHzl.copydefault(fragmentManager, simpleName, new C21034gsD.Activity() { // from class: o.grF
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.C21034gsD.Activity
                public final void AEQbTJ(android.os.Bundle bundle) {
                    C21027grx.copydefault(function2, bundle);
                }
            });
        }
    }

    public static final void copydefault(Function2 function2, android.os.Bundle bundle) {
        int i = bundle != null ? bundle.getInt("click_type") : 0;
        if (function2 != null) {
            function2.invoke(java.lang.Integer.valueOf(i), java.lang.Boolean.TRUE);
        }
    }

    public static /* synthetic */ void exchangeTrackingWalletLogic$default(C21027grx c21027grx, androidx.fragment.app.FragmentManager fragmentManager, boolean z, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        c21027grx.KWHzl(fragmentManager, z, function1);
    }

    public final void KWHzl(@NotNull androidx.fragment.app.FragmentManager fragmentManager, boolean z, @NotNull final Function1<? super java.lang.Integer, Unit> function1) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(function1, "");
        if (z) {
            C14140dfo.TaskDescription.getInstance$default(C14140dfo.Companion, null, 1, null).copydefault(fragmentManager, C33070mpX.AYXKKw(C13754dXa.FragmentManager.AttrRes), C33070mpX.AYXKKw(C13754dXa.FragmentManager.ActivityResultContractsPickMultipleVisualMedia), C33070mpX.AYXKKw(C13754dXa.FragmentManager.ActivityResultContractsGetContent), C33070mpX.AYXKKw(C13754dXa.FragmentManager.ActivityResultContracts), new Function0() { // from class: o.grz
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C21027grx.EZpvd(function1);
                }
            });
        } else {
            function1.invoke(1);
        }
    }

    public static final Unit EZpvd(Function1 function1) {
        function1.invoke(1);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void exchangeFromAddressCopyAlert$default(C21027grx c21027grx, boolean z, androidx.fragment.app.FragmentManager fragmentManager, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        c21027grx.AEQbTJ(z, fragmentManager, function0);
    }

    public final void AEQbTJ(boolean z, @NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull final Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(function0, "");
        if (z) {
            C14140dfo.TaskDescription.getInstance$default(C14140dfo.Companion, null, 1, null).copydefault(fragmentManager, C33070mpX.AYXKKw(C13754dXa.FragmentManager.fromMediaItem), C33070mpX.AYXKKw(C13754dXa.FragmentManager.getStateLabel), C33070mpX.AYXKKw(C13754dXa.FragmentManager.MediaBrowserCompatMediaBrowserImplApi23), C33070mpX.AYXKKw(C13754dXa.FragmentManager.MediaBrowserCompatMediaBrowserImplApi211), new Function0() { // from class: o.grB
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C21027grx.AEQbTJ(function0);
                }
            });
        } else {
            function0.invoke();
        }
    }

    public static final Unit AEQbTJ(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: o.grx */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void showExchangeWithdrawalDisableDialog$default(C21027grx c21027grx, androidx.fragment.app.FragmentManager fragmentManager, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 16) != 0) {
            str4 = "";
        }
        java.lang.String str5 = str4;
        if ((i & 32) != 0) {
            function0 = null;
        }
        c21027grx.copydefault(fragmentManager, str, str2, str3, str5, function0);
    }

    public final void copydefault(androidx.fragment.app.FragmentManager fragmentManager, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, Function0<Unit> function0) {
        if (fragmentManager.isStateSaved()) {
            C6777aVl.Companion.EZpvd(new java.lang.Exception("java.lang.IllegalStateException: Can not perform this action after onSaveInstanceState"));
            pUU.copydefault("ExchangeFastTransferManager", "java.lang.IllegalStateException: Can not perform this action after onSaveInstanceState");
        } else {
            C14140dfo.TaskDescription.getInstance$default(C14140dfo.Companion, null, 1, null).copydefault(fragmentManager, str, str2, str3, str4, function0);
        }
    }

    public static final Unit copydefault(java.lang.Integer num) {
        return Unit.INSTANCE;
    }

    public final void OLrzqt(@NotNull androidx.fragment.app.FragmentManager fragmentManager) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        C20992grO.Companion.copydefault().OLrzqt(fragmentManager, new Function1() { // from class: o.grA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C21027grx.copydefault((java.lang.Integer) obj);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(@NotNull FragmentActivity fragmentActivity, @NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull Continuation<? super java.lang.Boolean> continuation) throws java.lang.Throwable {
        ExchangeFastTransferManager$judgeCanWalletWithdraw$1 exchangeFastTransferManager$judgeCanWalletWithdraw$1;
        final FragmentActivity fragmentActivity2;
        androidx.fragment.app.FragmentManager fragmentManager2;
        C21027grx c21027grx;
        if (continuation instanceof ExchangeFastTransferManager$judgeCanWalletWithdraw$1) {
            exchangeFastTransferManager$judgeCanWalletWithdraw$1 = (ExchangeFastTransferManager$judgeCanWalletWithdraw$1) continuation;
            int i = exchangeFastTransferManager$judgeCanWalletWithdraw$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                exchangeFastTransferManager$judgeCanWalletWithdraw$1.label = i - Integer.MIN_VALUE;
            } else {
                exchangeFastTransferManager$judgeCanWalletWithdraw$1 = new ExchangeFastTransferManager$judgeCanWalletWithdraw$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = exchangeFastTransferManager$judgeCanWalletWithdraw$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = exchangeFastTransferManager$judgeCanWalletWithdraw$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objCopydefault);
            InterfaceC8224ayh interfaceC8224ayh = (InterfaceC8224ayh) C43248rlh.KWHzl.AEQbTJ(InterfaceC8224ayh.class);
            exchangeFastTransferManager$judgeCanWalletWithdraw$1.L$0 = this;
            fragmentActivity2 = fragmentActivity;
            exchangeFastTransferManager$judgeCanWalletWithdraw$1.L$1 = fragmentActivity2;
            exchangeFastTransferManager$judgeCanWalletWithdraw$1.L$2 = fragmentManager;
            exchangeFastTransferManager$judgeCanWalletWithdraw$1.label = 1;
            objCopydefault = interfaceC8224ayh.copydefault(exchangeFastTransferManager$judgeCanWalletWithdraw$1);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
            fragmentManager2 = fragmentManager;
            c21027grx = this;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.fragment.app.FragmentManager fragmentManager3 = (androidx.fragment.app.FragmentManager) exchangeFastTransferManager$judgeCanWalletWithdraw$1.L$2;
            fragmentActivity2 = (FragmentActivity) exchangeFastTransferManager$judgeCanWalletWithdraw$1.L$1;
            C21027grx c21027grx2 = (C21027grx) exchangeFastTransferManager$judgeCanWalletWithdraw$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            c21027grx = c21027grx2;
            fragmentManager2 = fragmentManager3;
        }
        WithdrawDisabledReason withdrawDisabledReason = (WithdrawDisabledReason) objCopydefault;
        if (withdrawDisabledReason == null) {
            return C56443yFo.KWHzl(true);
        }
        int i3 = Activity.EZpvd[withdrawDisabledReason.ordinal()];
        if (i3 == 1) {
            showExchangeWithdrawalDisableDialog$default(c21027grx, fragmentManager2, C33070mpX.AYXKKw(C13754dXa.FragmentManager.ActivityResultContractsStartIntentSenderForResult), C33070mpX.AYXKKw(C13754dXa.FragmentManager.getGmsPickeractivity_release), C33070mpX.AYXKKw(C13754dXa.FragmentManager.ActivityResultContractsGetMultipleContents), null, null, 48, null);
        } else if (i3 == 2) {
            showExchangeWithdrawalDisableDialog$default(c21027grx, fragmentManager2, C33070mpX.AYXKKw(C13754dXa.FragmentManager.MediaBrowserCompatMediaBrowserServiceCallbackImpl), C33070mpX.AYXKKw(C13754dXa.FragmentManager.MediaBrowserCompatMediaBrowserImplBase1), C33070mpX.AYXKKw(C13754dXa.FragmentManager.getNotifyChildrenChangedOptions), null, null, 48, null);
        } else if (i3 == 3 || i3 == 4) {
            showExchangeWithdrawalDisableDialog$default(c21027grx, fragmentManager2, C33070mpX.AYXKKw(C13754dXa.FragmentManager.MediaBrowserCompatMediaBrowserImplBaseMediaServiceConnection2), C33070mpX.AYXKKw(C13754dXa.FragmentManager.MediaBrowserCompatMediaBrowserImplBase), C33070mpX.AYXKKw(C13754dXa.FragmentManager.getNotifyChildrenChangedOptions), null, null, 48, null);
        } else if (i3 == 5) {
            c21027grx.copydefault(fragmentManager2, C33070mpX.AYXKKw(C13754dXa.FragmentManager.izFvvl), C33070mpX.AYXKKw(C13754dXa.FragmentManager.iOIMNp), C33070mpX.AYXKKw(C13754dXa.FragmentManager.fvQaOB), C33070mpX.AYXKKw(C13754dXa.FragmentManager.dpErvT), new Function0() { // from class: o.gry
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C21027grx.OLrzqt(fragmentActivity2);
                }
            });
        } else {
            showExchangeWithdrawalDisableDialog$default(c21027grx, fragmentManager2, C33070mpX.AYXKKw(C13754dXa.FragmentManager.onInterceptTouchEvent), C33070mpX.AYXKKw(C13754dXa.FragmentManager.isOutOfBounds), C33070mpX.AYXKKw(C13754dXa.FragmentManager.getNotifyChildrenChangedOptions), null, null, 48, null);
        }
        return C56443yFo.KWHzl(false);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.rTU.Application.checkAndRestrictsDistributary$default(o.rTU, androidx.fragment.app.FragmentActivity, kotlin.jvm.functions.Function1, java.lang.Boolean, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, int, java.lang.Object):void */
    public static final Unit OLrzqt(FragmentActivity fragmentActivity) {
        rTU.Application.checkAndRestrictsDistributary$default((rTU) C43248rlh.KWHzl.AEQbTJ(rTU.class), fragmentActivity, null, null, null, null, null, 62, null);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void systemTestJudgeOrStartExchangeAssetsActivity$default(C21027grx c21027grx, androidx.fragment.app.FragmentManager fragmentManager, FragmentActivity fragmentActivity, ActivityResultLauncher activityResultLauncher, java.lang.String str, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 16) != 0) {
            z = true;
        }
        boolean z3 = z;
        if ((i & 32) != 0) {
            z2 = false;
        }
        c21027grx.EZpvd(fragmentManager, fragmentActivity, activityResultLauncher, str, z3, z2);
    }

    public final void EZpvd(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull FragmentActivity fragmentActivity, ActivityResultLauncher<C21118gti.Application> activityResultLauncher, @NotNull java.lang.String str, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        Intrinsics.checkNotNullParameter(str, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(fragmentActivity), null, null, new ExchangeFastTransferManager$systemTestJudgeOrStartExchangeAssetsActivity$1(fragmentActivity, fragmentManager, z2, activityResultLauncher, str, z, null), 3, null);
    }

    public final void OLrzqt(@NotNull final androidx.fragment.app.FragmentManager fragmentManager, @NotNull final FragmentActivity fragmentActivity, final ActivityResultLauncher<C21118gti.Application> activityResultLauncher, @NotNull final java.lang.String str, final boolean z, final boolean z2, final boolean z3, final boolean z4, final Function2<? super java.lang.Integer, ? super java.lang.Boolean, Unit> function2) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (AEQbTJ()) {
            KWHzl(fragmentManager, z, fragmentActivity, new Function2() { // from class: o.grD
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return C21027grx.OLrzqt(z, function2, fragmentManager, z2, z4, z3, fragmentActivity, activityResultLauncher, str, ((java.lang.Integer) obj).intValue(), ((java.lang.Boolean) obj2).booleanValue());
                }
            });
        } else if (function2 != null) {
            function2.invoke(3, java.lang.Boolean.FALSE);
        }
    }

    public static final Unit AEQbTJ(boolean z, Function2 function2, boolean z2, boolean z3, int i, boolean z4, androidx.fragment.app.FragmentManager fragmentManager, FragmentActivity fragmentActivity, ActivityResultLauncher activityResultLauncher, java.lang.String str, int i2) {
        boolean z5 = true;
        if (i2 == 1) {
            if (z) {
                if (function2 != null) {
                    function2.invoke(4, java.lang.Boolean.valueOf(z2));
                }
            } else if (dZP.OLrzqt.valueOf()) {
                if (!z3 && i == 3 && !z4) {
                    z5 = false;
                }
                copydefault.EZpvd(fragmentManager, fragmentActivity, activityResultLauncher, str, z5, z2);
            } else if (function2 != null) {
                function2.invoke(5, java.lang.Boolean.valueOf(z2));
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit OLrzqt(boolean z, final Function2 function2, final androidx.fragment.app.FragmentManager fragmentManager, final boolean z2, final boolean z3, final boolean z4, final FragmentActivity fragmentActivity, final ActivityResultLauncher activityResultLauncher, final java.lang.String str, final int i, final boolean z5) {
        if (i == 1) {
            if (z && i == 3) {
                if (function2 != null) {
                    function2.invoke(3, java.lang.Boolean.valueOf(z5));
                }
                return Unit.INSTANCE;
            }
            copydefault.KWHzl(fragmentManager, z2, new Function1() { // from class: o.grC
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C21027grx.AEQbTJ(z3, function2, z5, z4, i, z2, fragmentManager, fragmentActivity, activityResultLauncher, str, ((java.lang.Integer) obj).intValue());
                }
            });
        } else if (i != 2) {
            if (i == 3) {
            }
        } else if (function2 != null) {
            function2.invoke(2, java.lang.Boolean.valueOf(z5));
        }
        return Unit.INSTANCE;
    }
}
