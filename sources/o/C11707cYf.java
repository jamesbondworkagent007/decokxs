package o;

import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.lifecycle.LifecycleOwnerKt;
import com.okinc.account.api.model.wallet.BoundWalletAccountsResult;
import com.okinc.business.defi.biz.impl.WalletCefiBindingServiceImpl$startCefiBindingProcess$1;
import com.okinc.business.defi.biz.impl.WalletCefiBindingServiceImpl$startCefiBindingProcess$4;
import com.okinc.business.defi.biz.impl.WalletCefiBindingServiceImpl$startCefiBindingProcess$5$1;
import com.okinc.business.defi.biz.impl.WalletCefiBindingServiceImpl$syncWalletBindingResult$1;
import com.okinc.business.defi.wallet.walletaddressbinding.WalletCefiBindingResultBottomSheet;
import com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService;
import com.okinc.wallet.api.WalletCefiBindingService;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import o.ActivityC19643gJz;
import o.C13850daP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.cYf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C11707cYf extends AbstractC43215rlA implements WalletCefiBindingService {
    public final java.lang.String AEQbTJ;
    public final gJS AhwBna;
    public final InterfaceC8107awW EZpvd;
    public final pKD KWHzl;
    public ActivityResultLauncher<ActivityC19643gJz.StateListAnimator> OLrzqt;
    public final CoroutineDispatcher copydefault;

    public C11707cYf(@NotNull CoroutineDispatcher coroutineDispatcher, InterfaceC8107awW interfaceC8107awW, @NotNull gJS gjs, @NotNull pKD pkd) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(gjs, "");
        Intrinsics.checkNotNullParameter(pkd, "");
        this.copydefault = coroutineDispatcher;
        this.EZpvd = interfaceC8107awW;
        this.AhwBna = gjs;
        this.KWHzl = pkd;
        this.AEQbTJ = "WalletCefiBindingServiceImpl";
    }

    @Override // com.okinc.wallet.api.WalletCefiBindingService
    public java.lang.Object EZpvd(@NotNull Continuation<? super java.lang.Boolean> continuation) {
        if (C34703nhO.copydefault()) {
            OKComplianceRestrictionService oKComplianceRestrictionService = (OKComplianceRestrictionService) C43251rlk.OLrzqt(OKComplianceRestrictionService.class);
            if (oKComplianceRestrictionService != null && !oKComplianceRestrictionService.AEQbTJ(OKComplianceRestrictionService.Feature.EASY_CONNECT)) {
                z = true;
            }
            return C56443yFo.KWHzl(z);
        }
        InterfaceC8107awW interfaceC8107awW = (InterfaceC8107awW) C43251rlk.OLrzqt(InterfaceC8107awW.class);
        return C56443yFo.KWHzl(interfaceC8107awW != null ? interfaceC8107awW.OLrzqt() : false);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.okinc.wallet.api.WalletCefiBindingService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object copydefault(@NotNull final AbstractActivityC33041mov abstractActivityC33041mov, @NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull final WalletCefiBindingService.FragmentManager fragmentManager2, WalletCefiBindingService.Application application, final WalletCefiBindingService.StateListAnimator stateListAnimator, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        WalletCefiBindingServiceImpl$startCefiBindingProcess$1 walletCefiBindingServiceImpl$startCefiBindingProcess$1;
        ActivityResultLauncher<ActivityC19643gJz.StateListAnimator> activityResultLauncherRegister;
        C11707cYf c11707cYf;
        if (continuation instanceof WalletCefiBindingServiceImpl$startCefiBindingProcess$1) {
            walletCefiBindingServiceImpl$startCefiBindingProcess$1 = (WalletCefiBindingServiceImpl$startCefiBindingProcess$1) continuation;
            int i = walletCefiBindingServiceImpl$startCefiBindingProcess$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletCefiBindingServiceImpl$startCefiBindingProcess$1.label = i - Integer.MIN_VALUE;
            } else {
                walletCefiBindingServiceImpl$startCefiBindingProcess$1 = new WalletCefiBindingServiceImpl$startCefiBindingProcess$1(this, continuation);
            }
        }
        WalletCefiBindingServiceImpl$startCefiBindingProcess$1 walletCefiBindingServiceImpl$startCefiBindingProcess$12 = walletCefiBindingServiceImpl$startCefiBindingProcess$1;
        java.lang.Object obj = walletCefiBindingServiceImpl$startCefiBindingProcess$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = walletCefiBindingServiceImpl$startCefiBindingProcess$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) fragmentManager2.KWHzl()) || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) fragmentManager2.EZpvd())) {
                pUU.copydefault(this.AEQbTJ, "startCefiBindingProcess: missing parameters");
                return Unit.INSTANCE;
            }
            if (abstractActivityC33041mov.isFinishing() || abstractActivityC33041mov.isDestroyed()) {
                pUU.copydefault(this.AEQbTJ, "startCefiBindingProcess: activity is not valid");
                return Unit.INSTANCE;
            }
            if (C14728dqt.KWHzl.KWHzl()) {
                C13850daP.KWHzl.KWHzl(this.KWHzl, this.AhwBna, abstractActivityC33041mov, fragmentManager2);
                return Unit.INSTANCE;
            }
            InterfaceC8107awW interfaceC8107awW = this.EZpvd;
            if (interfaceC8107awW == null || !interfaceC8107awW.OLrzqt()) {
                C13850daP.KWHzl.EZpvd(abstractActivityC33041mov, fragmentManager);
                return Unit.INSTANCE;
            }
            ActivityResultLauncher<ActivityC19643gJz.StateListAnimator> activityResultLauncher = this.OLrzqt;
            if (activityResultLauncher != null) {
                activityResultLauncher.unregister();
            }
            activityResultLauncherRegister = abstractActivityC33041mov.getActivityResultRegistry().register(UUID.randomUUID().toString(), new ActivityC19643gJz.ActionBar(), new ActivityResultCallback() { // from class: o.cYg
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // androidx.activity.result.ActivityResultCallback
                public final void onActivityResult(java.lang.Object obj2) {
                    C11707cYf.OLrzqt(stateListAnimator, this, abstractActivityC33041mov, fragmentManager2, (ActivityC19643gJz.Activity) obj2);
                }
            });
            Intrinsics.copydefault(activityResultLauncherRegister);
            java.lang.String strKWHzl = fragmentManager2.KWHzl();
            java.lang.String strEZpvd = fragmentManager2.EZpvd();
            WalletCefiBindingService.Source sourceOLrzqt = fragmentManager2.OLrzqt();
            walletCefiBindingServiceImpl$startCefiBindingProcess$12.L$0 = activityResultLauncherRegister;
            walletCefiBindingServiceImpl$startCefiBindingProcess$12.L$1 = this;
            walletCefiBindingServiceImpl$startCefiBindingProcess$12.label = 1;
            if (EZpvd(abstractActivityC33041mov, activityResultLauncherRegister, strKWHzl, strEZpvd, sourceOLrzqt, application, walletCefiBindingServiceImpl$startCefiBindingProcess$12) == objCopydefault) {
                return objCopydefault;
            }
            c11707cYf = this;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c11707cYf = (C11707cYf) walletCefiBindingServiceImpl$startCefiBindingProcess$12.L$1;
            activityResultLauncherRegister = (ActivityResultLauncher) walletCefiBindingServiceImpl$startCefiBindingProcess$12.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        c11707cYf.OLrzqt = activityResultLauncherRegister;
        return Unit.INSTANCE;
    }

    public static final void OLrzqt(WalletCefiBindingService.StateListAnimator stateListAnimator, C11707cYf c11707cYf, AbstractActivityC33041mov abstractActivityC33041mov, WalletCefiBindingService.FragmentManager fragmentManager, ActivityC19643gJz.Activity activity) {
        WalletCefiBindingService.WalletCefiBindingResult walletCefiBindingResultCopydefault;
        if (activity == null || (walletCefiBindingResultCopydefault = activity.copydefault()) == null) {
            return;
        }
        if (stateListAnimator != null) {
            stateListAnimator.KWHzl(walletCefiBindingResultCopydefault);
        }
        c11707cYf.EZpvd(abstractActivityC33041mov, fragmentManager, walletCefiBindingResultCopydefault);
    }

    public final void EZpvd(AbstractActivityC33041mov abstractActivityC33041mov, WalletCefiBindingService.FragmentManager fragmentManager, WalletCefiBindingService.WalletCefiBindingResult walletCefiBindingResult) {
        java.lang.String strCopydefault = fragmentManager.copydefault();
        if (fragmentManager.OLrzqt() == WalletCefiBindingService.Source.PLUGIN) {
            AEQbTJ(abstractActivityC33041mov, fragmentManager, walletCefiBindingResult);
            if (walletCefiBindingResult instanceof WalletCefiBindingService.WalletCefiBindingResult.WalletAlreadyBound) {
                C13850daP.KWHzl.KWHzl(abstractActivityC33041mov, WalletCefiBindingResultBottomSheet.CefiResultStatus.ALREADY_BOUND);
                return;
            }
            return;
        }
        EZpvd(walletCefiBindingResult, strCopydefault, abstractActivityC33041mov, fragmentManager);
    }

    public final void EZpvd(WalletCefiBindingService.WalletCefiBindingResult walletCefiBindingResult, java.lang.String str, AbstractActivityC33041mov abstractActivityC33041mov, WalletCefiBindingService.FragmentManager fragmentManager) {
        WalletCefiBindingService.WalletCefiBindingStatus walletCefiBindingStatus;
        WalletCefiBindingResultBottomSheet.CefiResultStatus cefiResultStatus;
        boolean z = walletCefiBindingResult instanceof WalletCefiBindingService.WalletCefiBindingResult.WalletAlreadyBound;
        if (z) {
            walletCefiBindingStatus = WalletCefiBindingService.WalletCefiBindingStatus.ALREADY_BOUND;
        } else if (walletCefiBindingResult instanceof WalletCefiBindingService.WalletCefiBindingResult.Success) {
            walletCefiBindingStatus = WalletCefiBindingService.WalletCefiBindingStatus.SUCCESS;
        } else {
            walletCefiBindingStatus = WalletCefiBindingService.WalletCefiBindingStatus.CANCEL;
        }
        int statusValue = walletCefiBindingStatus.getStatusValue();
        if (str != null) {
            ((pKD) C43251rlk.copydefault(pKD.class)).AEQbTJ(abstractActivityC33041mov, dJJ.copydefault.copydefault(str, C56390yDp.OLrzqt("status", java.lang.Integer.valueOf(statusValue)), C56390yDp.OLrzqt("requestId", fragmentManager.AEQbTJ())));
            return;
        }
        C13850daP c13850daP = C13850daP.KWHzl;
        c13850daP.KWHzl(fragmentManager.AEQbTJ(), statusValue);
        if (z) {
            cefiResultStatus = WalletCefiBindingResultBottomSheet.CefiResultStatus.ALREADY_BOUND;
        } else if (walletCefiBindingResult instanceof WalletCefiBindingService.WalletCefiBindingResult.Success) {
            cefiResultStatus = WalletCefiBindingResultBottomSheet.CefiResultStatus.SUCCESS;
        } else {
            cefiResultStatus = WalletCefiBindingResultBottomSheet.CefiResultStatus.CANCEL;
        }
        c13850daP.KWHzl(abstractActivityC33041mov, cefiResultStatus);
    }

    public final void AEQbTJ(AbstractActivityC33041mov abstractActivityC33041mov, WalletCefiBindingService.FragmentManager fragmentManager, WalletCefiBindingService.WalletCefiBindingResult walletCefiBindingResult) {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(abstractActivityC33041mov), null, null, new WalletCefiBindingServiceImpl$syncWalletBindingResult$1(walletCefiBindingResult, fragmentManager, this, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(AbstractActivityC33041mov abstractActivityC33041mov, ActivityResultLauncher<ActivityC19643gJz.StateListAnimator> activityResultLauncher, java.lang.String str, java.lang.String str2, WalletCefiBindingService.Source source, WalletCefiBindingService.Application application, Continuation<? super Unit> continuation) throws java.lang.Throwable {
        WalletCefiBindingServiceImpl$startCefiBindingProcess$4 walletCefiBindingServiceImpl$startCefiBindingProcess$4;
        java.lang.Throwable th;
        WalletCefiBindingService.Application application2;
        C11707cYf c11707cYf;
        if (continuation instanceof WalletCefiBindingServiceImpl$startCefiBindingProcess$4) {
            walletCefiBindingServiceImpl$startCefiBindingProcess$4 = (WalletCefiBindingServiceImpl$startCefiBindingProcess$4) continuation;
            int i = walletCefiBindingServiceImpl$startCefiBindingProcess$4.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletCefiBindingServiceImpl$startCefiBindingProcess$4.label = i - Integer.MIN_VALUE;
            } else {
                walletCefiBindingServiceImpl$startCefiBindingProcess$4 = new WalletCefiBindingServiceImpl$startCefiBindingProcess$4(this, continuation);
            }
        }
        java.lang.Object objWithContext = walletCefiBindingServiceImpl$startCefiBindingProcess$4.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = walletCefiBindingServiceImpl$startCefiBindingProcess$4.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objWithContext);
                if (application == null) {
                    application = new C13850daP.Activity(abstractActivityC33041mov);
                }
                application.copydefault();
                try {
                    Result.Application application3 = Result.Companion;
                    InterfaceC8107awW interfaceC8107awW = this.EZpvd;
                    if (interfaceC8107awW == null) {
                        return Unit.INSTANCE;
                    }
                    CoroutineDispatcher coroutineDispatcher = this.copydefault;
                    WalletCefiBindingServiceImpl$startCefiBindingProcess$5$1 walletCefiBindingServiceImpl$startCefiBindingProcess$5$1 = new WalletCefiBindingServiceImpl$startCefiBindingProcess$5$1(interfaceC8107awW, null);
                    walletCefiBindingServiceImpl$startCefiBindingProcess$4.L$0 = this;
                    walletCefiBindingServiceImpl$startCefiBindingProcess$4.L$1 = activityResultLauncher;
                    walletCefiBindingServiceImpl$startCefiBindingProcess$4.L$2 = str;
                    walletCefiBindingServiceImpl$startCefiBindingProcess$4.L$3 = str2;
                    walletCefiBindingServiceImpl$startCefiBindingProcess$4.L$4 = source;
                    walletCefiBindingServiceImpl$startCefiBindingProcess$4.L$5 = application;
                    walletCefiBindingServiceImpl$startCefiBindingProcess$4.label = 1;
                    objWithContext = BuildersKt.withContext(coroutineDispatcher, walletCefiBindingServiceImpl$startCefiBindingProcess$5$1, walletCefiBindingServiceImpl$startCefiBindingProcess$4);
                    if (objWithContext == objCopydefault) {
                        return objCopydefault;
                    }
                    application2 = application;
                    c11707cYf = this;
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    Result.Application application4 = Result.Companion;
                    Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                    application2 = application;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                application2 = (WalletCefiBindingService.Application) walletCefiBindingServiceImpl$startCefiBindingProcess$4.L$5;
                source = (WalletCefiBindingService.Source) walletCefiBindingServiceImpl$startCefiBindingProcess$4.L$4;
                str2 = (java.lang.String) walletCefiBindingServiceImpl$startCefiBindingProcess$4.L$3;
                str = (java.lang.String) walletCefiBindingServiceImpl$startCefiBindingProcess$4.L$2;
                activityResultLauncher = (ActivityResultLauncher) walletCefiBindingServiceImpl$startCefiBindingProcess$4.L$1;
                c11707cYf = (C11707cYf) walletCefiBindingServiceImpl$startCefiBindingProcess$4.L$0;
                try {
                    C56391yDq.AEQbTJ(objWithContext);
                } catch (java.lang.Throwable th3) {
                    th = th3;
                    application = application2;
                    Result.Application application42 = Result.Companion;
                    Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                    application2 = application;
                }
            }
            java.lang.Object objM7386unboximpl = ((Result) objWithContext).m7386unboximpl();
            pUU.EZpvd(c11707cYf.AEQbTJ, "getBoundWalletAccounts result: " + Result.m7385toStringimpl(objM7386unboximpl));
            java.lang.Object objM7386unboximpl2 = ((Result) objWithContext).m7386unboximpl();
            if (Result.m7384isSuccessimpl(objM7386unboximpl2)) {
                activityResultLauncher.launch(new ActivityC19643gJz.StateListAnimator(str, str2, ((BoundWalletAccountsResult) objM7386unboximpl2).getWithdrawLimit(), source));
            }
            java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7386unboximpl2);
            if (thM7380exceptionOrNullimpl != null) {
                pUU.copydefault(c11707cYf.AEQbTJ, "CeFi wallet binding error: " + thM7380exceptionOrNullimpl.getMessage());
            }
            Result.m7377constructorimpl(Result.m7376boximpl(objM7386unboximpl2));
            application2.OLrzqt();
            return Unit.INSTANCE;
        } catch (CancellationException e) {
            throw e;
        }
    }

    @Override // com.okinc.wallet.api.WalletCefiBindingService
    public java.lang.String copydefault() {
        return C33129mqd.gEmmrt(UUID.randomUUID());
    }
}
