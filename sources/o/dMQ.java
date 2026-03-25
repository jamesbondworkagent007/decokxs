package o;

import android.os.Build;
import androidx.fragment.app.FragmentResultListener;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.okinc.business.defi.api.bean.passkeywallet.cedefi.AccountType;
import com.okinc.business.defi.api.bean.passkeywallet.cedefi.BindEmailData;
import com.okinc.business.defi.api.bean.passkeywallet.cedefi.CeDeFiWalletInput;
import com.okinc.business.defi.api.bean.passkeywallet.cedefi.CeDeFiWalletResult;
import com.okinc.business.defi.api.bean.passkeywallet.cedefi.EmailSetResult;
import com.okinc.business.defi.api.bean.passkeywallet.cedefi.EmailStateInfo;
import com.okinc.business.defi.api.bean.passkeywallet.cedefi.PasskeyOperationError;
import com.okinc.business.defi.api.bean.passkeywallet.cedefi.PasskeyOperationInput;
import com.okinc.business.defi.api.bean.passkeywallet.cedefi.PasskeyOperationResult;
import com.okinc.business.defi.api.bean.passkeywallet.cedefi.UpdateEmailInput;
import com.okinc.business.defi.api.bean.passkeywallet.cedefi.UpdateInfoInput;
import com.okinc.business.defi.api.bean.passkeywallet.cedefi.UpdateInfoResult;
import com.okinc.business.defi.api.bean.passkeywallet.cedefi.WalletCreationError;
import com.okinc.business.defi.impl.CeDeFiWalletServiceImpl$validateEmail$1;
import com.okinc.business.defi.wallet.passkey.common.bean.InternalUpdateInfoResult;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC13426dKx;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class dMQ extends C13498dNo implements InterfaceC9916bec {
    @Override // o.InterfaceC9916bec
    public void copydefault(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull LifecycleOwner lifecycleOwner, @NotNull CeDeFiWalletInput ceDeFiWalletInput, @NotNull final Function1<? super CeDeFiWalletResult, Unit> function1) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        Intrinsics.checkNotNullParameter(ceDeFiWalletInput, "");
        Intrinsics.checkNotNullParameter(function1, "");
        try {
            if (KWHzl(fragmentManager) && KWHzl(lifecycleOwner)) {
                fragmentManager.setFragmentResultListener("create_passkey_wallet_request_key", lifecycleOwner, new FragmentResultListener() { // from class: o.dMR
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // androidx.fragment.app.FragmentResultListener
                    public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle) {
                        dMQ.KWHzl(function1, str, bundle);
                    }
                });
                androidx.fragment.app.FragmentTransaction fragmentTransactionBeginTransaction = fragmentManager.beginTransaction();
                Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction, "");
                androidx.fragment.app.Fragment fragmentFindFragmentByTag = fragmentManager.findFragmentByTag("CreatePasskeyWalletContainer");
                if (fragmentFindFragmentByTag != null) {
                    fragmentTransactionBeginTransaction.remove(fragmentFindFragmentByTag);
                }
                fragmentTransactionBeginTransaction.add(C17545fJh.Companion.AEQbTJ(), "CreatePasskeyWalletContainer");
                fragmentTransactionBeginTransaction.commitAllowingStateLoss();
                return;
            }
            function1.invoke(CeDeFiWalletResult.Cancelled.KWHzl);
        } catch (java.lang.Exception e) {
            java.lang.String message = e.getMessage();
            pUU.copydefault("createCeDeFiWallet", "exception = " + (message != null ? message : ""));
            function1.invoke(new CeDeFiWalletResult.Failed(new WalletCreationError.GeneralFailure(e)));
        }
    }

    @Override // o.InterfaceC9916bec
    public void AEQbTJ(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull LifecycleOwner lifecycleOwner, @NotNull PasskeyOperationInput passkeyOperationInput, @NotNull final Function1<? super PasskeyOperationResult, Unit> function1) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        Intrinsics.checkNotNullParameter(passkeyOperationInput, "");
        Intrinsics.checkNotNullParameter(function1, "");
        try {
            if (KWHzl(fragmentManager) && KWHzl(lifecycleOwner)) {
                fragmentManager.setFragmentResultListener("passkey_non_wallet_request_key", lifecycleOwner, new FragmentResultListener() { // from class: o.dMT
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // androidx.fragment.app.FragmentResultListener
                    public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle) {
                        dMQ.valueOf(function1, str, bundle);
                    }
                });
                androidx.fragment.app.FragmentTransaction fragmentTransactionBeginTransaction = fragmentManager.beginTransaction();
                Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction, "");
                androidx.fragment.app.Fragment fragmentFindFragmentByTag = fragmentManager.findFragmentByTag("PerformNonWalletPasskeyOpt");
                if (fragmentFindFragmentByTag != null) {
                    fragmentTransactionBeginTransaction.remove(fragmentFindFragmentByTag);
                }
                fragmentTransactionBeginTransaction.add(C17647fNb.Companion.KWHzl(passkeyOperationInput), "PerformNonWalletPasskeyOpt");
                fragmentTransactionBeginTransaction.commitAllowingStateLoss();
                return;
            }
            function1.invoke(PasskeyOperationResult.Cancelled.OLrzqt);
        } catch (java.lang.Exception e) {
            java.lang.String message = e.getMessage();
            pUU.copydefault("performNonWalletCreationPasskeyOperation", "exception = " + (message != null ? message : ""));
            function1.invoke(new PasskeyOperationResult.Failed(new PasskeyOperationError.GeneralFailure(e)));
        }
    }

    public final boolean KWHzl(androidx.fragment.app.FragmentManager fragmentManager) {
        return (fragmentManager.isStateSaved() || fragmentManager.isDestroyed()) ? false : true;
    }

    public final boolean KWHzl(LifecycleOwner lifecycleOwner) {
        return lifecycleOwner.getLifecycle().getCurrentState() != Lifecycle.State.DESTROYED;
    }

    @Override // o.InterfaceC9916bec
    public void KWHzl(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull LifecycleOwner lifecycleOwner, @NotNull UpdateEmailInput updateEmailInput, @NotNull final Function1<? super EmailSetResult, Unit> function1) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        Intrinsics.checkNotNullParameter(updateEmailInput, "");
        Intrinsics.checkNotNullParameter(function1, "");
        try {
            if (KWHzl(fragmentManager) && KWHzl(lifecycleOwner)) {
                fragmentManager.setFragmentResultListener("bind_email_request_key", lifecycleOwner, new FragmentResultListener() { // from class: o.dMU
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // androidx.fragment.app.FragmentResultListener
                    public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle) {
                        dMQ.AhwBna(function1, str, bundle);
                    }
                });
                androidx.fragment.app.FragmentTransaction fragmentTransactionBeginTransaction = fragmentManager.beginTransaction();
                Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction, "");
                androidx.fragment.app.Fragment fragmentFindFragmentByTag = fragmentManager.findFragmentByTag("UpdateEmailContainer");
                if (fragmentFindFragmentByTag != null) {
                    fragmentTransactionBeginTransaction.remove(fragmentFindFragmentByTag);
                }
                fragmentTransactionBeginTransaction.add(fJH.Companion.EZpvd(updateEmailInput), "UpdateEmailContainer");
                fragmentTransactionBeginTransaction.commitAllowingStateLoss();
                return;
            }
            function1.invoke(EmailSetResult.Cancelled.KWHzl);
        } catch (java.lang.Exception e) {
            java.lang.String message = e.getMessage();
            pUU.copydefault("createCeDeFiWallet", "exception = " + (message != null ? message : ""));
            function1.invoke(new EmailSetResult.Failed(e));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC9916bec
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object copydefault(@NotNull Continuation<? super Result<EmailStateInfo>> continuation) {
        CeDeFiWalletServiceImpl$validateEmail$1 ceDeFiWalletServiceImpl$validateEmail$1;
        java.lang.Object objM7377constructorimpl;
        java.lang.Object objEZpvd;
        java.lang.Throwable thM7380exceptionOrNullimpl;
        if (continuation instanceof CeDeFiWalletServiceImpl$validateEmail$1) {
            ceDeFiWalletServiceImpl$validateEmail$1 = (CeDeFiWalletServiceImpl$validateEmail$1) continuation;
            int i = ceDeFiWalletServiceImpl$validateEmail$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                ceDeFiWalletServiceImpl$validateEmail$1.label = i - Integer.MIN_VALUE;
            } else {
                ceDeFiWalletServiceImpl$validateEmail$1 = new CeDeFiWalletServiceImpl$validateEmail$1(this, continuation);
            }
        }
        java.lang.Object obj = ceDeFiWalletServiceImpl$validateEmail$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = ceDeFiWalletServiceImpl$validateEmail$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(obj);
                Result.Application application = Result.Companion;
                pUU.EZpvd("CeDeFiWalletServiceImpl", "Starting email validation for CeDeFi wallet");
                fJK fjk = new fJK(InterfaceC13426dKx.TaskDescription.getInstance$default(InterfaceC13426dKx.Companion, null, 1, null).DTwDnp());
                int value = AccountType.CeDeFi.getValue();
                ceDeFiWalletServiceImpl$validateEmail$1.label = 1;
                objEZpvd = fjk.EZpvd(value, ceDeFiWalletServiceImpl$validateEmail$1);
                if (objEZpvd == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                objEZpvd = ((Result) obj).m7386unboximpl();
            }
            thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objEZpvd);
        } catch (CancellationException e) {
            throw e;
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (thM7380exceptionOrNullimpl == null) {
            BindEmailData bindEmailData = (BindEmailData) objEZpvd;
            EmailStateInfo emailStateInfo = new EmailStateInfo(bindEmailData.isValidEmail(), bindEmailData.getNoEmail());
            pUU.EZpvd("CeDeFiWalletServiceImpl", "Email validation successful: " + emailStateInfo);
            objM7377constructorimpl = Result.m7377constructorimpl(emailStateInfo);
            java.lang.Throwable thM7380exceptionOrNullimpl2 = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
            if (thM7380exceptionOrNullimpl2 != null) {
                pUU.AEQbTJ("CeDeFiWalletServiceImpl", "Email validation failed with exception", thM7380exceptionOrNullimpl2);
            }
            return objM7377constructorimpl;
        }
        pUU.AEQbTJ("CeDeFiWalletServiceImpl", "Email validation failed", thM7380exceptionOrNullimpl);
        throw thM7380exceptionOrNullimpl;
    }

    @Override // o.InterfaceC9916bec
    public void AEQbTJ(@NotNull LifecycleOwner lifecycleOwner, @NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull UpdateInfoInput updateInfoInput, @NotNull final Function1<? super UpdateInfoResult, Unit> function1) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(updateInfoInput, "");
        Intrinsics.checkNotNullParameter(function1, "");
        if (fragmentManager.isStateSaved()) {
            pUU.copydefault("CeDeFiWalletServiceImpl", "updateInfo isStateSaved");
            function1.invoke(UpdateInfoResult.Cancelled.KWHzl);
            return;
        }
        fragmentManager.setFragmentResultListener("UpdateInfoFragmentRequestKey", lifecycleOwner, new FragmentResultListener() { // from class: o.dMS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle) {
                dMQ.AYXKKw(function1, str, bundle);
            }
        });
        androidx.fragment.app.FragmentTransaction fragmentTransactionBeginTransaction = fragmentManager.beginTransaction();
        Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction, "");
        androidx.fragment.app.Fragment fragmentFindFragmentByTag = fragmentManager.findFragmentByTag("UpdateInfoFragment");
        if (fragmentFindFragmentByTag != null) {
            fragmentTransactionBeginTransaction.remove(fragmentFindFragmentByTag);
        }
        fragmentTransactionBeginTransaction.add(fMR.Companion.AEQbTJ(updateInfoInput, true, true), "UpdateInfoFragment");
        fragmentTransactionBeginTransaction.commit();
    }

    public static final void KWHzl(Function1 function1, java.lang.String str, android.os.Bundle bundle) {
        android.os.Parcelable parcelable;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable = (android.os.Parcelable) bundle.getParcelable("create_passkey_wallet_result_key", CeDeFiWalletResult.class);
        } else {
            parcelable = bundle.getParcelable("create_passkey_wallet_result_key");
        }
        java.lang.Object obj = (CeDeFiWalletResult) parcelable;
        if (obj == null) {
            obj = CeDeFiWalletResult.Cancelled.KWHzl;
        }
        pUU.copydefault("zqh", "createCeDeFiWallet resultCreate = " + obj);
        function1.invoke(obj);
    }

    public static final void valueOf(Function1 function1, java.lang.String str, android.os.Bundle bundle) {
        android.os.Parcelable parcelable;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable = (android.os.Parcelable) bundle.getParcelable("passkey_non_wallet_result_key", PasskeyOperationResult.class);
        } else {
            parcelable = bundle.getParcelable("passkey_non_wallet_result_key");
        }
        java.lang.Object obj = (PasskeyOperationResult) parcelable;
        if (obj == null) {
            obj = PasskeyOperationResult.Cancelled.OLrzqt;
        }
        pUU.copydefault("zqh", "performNonWalletCreationPasskeyOperation resultOperation = " + obj);
        function1.invoke(obj);
    }

    public static final void AhwBna(Function1 function1, java.lang.String str, android.os.Bundle bundle) {
        android.os.Parcelable parcelable;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable = (android.os.Parcelable) bundle.getParcelable("bind_email_result_key", EmailSetResult.class);
        } else {
            parcelable = bundle.getParcelable("bind_email_result_key");
        }
        java.lang.Object obj = (EmailSetResult) parcelable;
        if (obj == null) {
            obj = EmailSetResult.Cancelled.KWHzl;
        }
        pUU.copydefault("zqh", "updateOrBindCeDeFiWalletEmail resultEmailOperation = " + obj);
        function1.invoke(obj);
    }

    public static final void AYXKKw(Function1 function1, java.lang.String str, android.os.Bundle bundle) {
        android.os.Parcelable parcelable;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable = (android.os.Parcelable) bundle.getParcelable("UpdateInfoFragmentResultKey", InternalUpdateInfoResult.class);
        } else {
            parcelable = bundle.getParcelable("UpdateInfoFragmentResultKey");
        }
        InternalUpdateInfoResult internalUpdateInfoResult = (InternalUpdateInfoResult) parcelable;
        if (internalUpdateInfoResult == null) {
            return;
        }
        if ((internalUpdateInfoResult instanceof InternalUpdateInfoResult.Success) || Intrinsics.EZpvd(internalUpdateInfoResult, InternalUpdateInfoResult.EmailRecovery.EZpvd)) {
            function1.invoke(UpdateInfoResult.Success.AEQbTJ);
        } else if (internalUpdateInfoResult instanceof InternalUpdateInfoResult.Failed) {
            function1.invoke(new UpdateInfoResult.Failed(((InternalUpdateInfoResult.Failed) internalUpdateInfoResult).EZpvd()));
        } else {
            if (!Intrinsics.EZpvd(internalUpdateInfoResult, InternalUpdateInfoResult.Cancelled.AEQbTJ)) {
                throw new NoWhenBranchMatchedException();
            }
            function1.invoke(UpdateInfoResult.Cancelled.KWHzl);
        }
    }
}
