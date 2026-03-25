package com.okinc.business.defi.impl;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentResultListener;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.okinc.auth.api.passkey.PasskeyAuthenticateRequest;
import com.okinc.business.defi.api.bean.passkeywallet.cedefi.TransactionInput;
import com.okinc.business.defi.api.bean.passkeywallet.cedefi.TransactionResult;
import com.okinc.business.defi.impl.PasskeyWalletServiceImpl$signDexTransaction$1;
import com.okinc.business.defi.wallet.passkey.common.bean.InternalTransactionInput;
import com.okinc.business.defi.wallet.passkey.common.bean.InternalTransactionResult;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import o.C13754dXa;
import o.C17561fJx;
import o.C33070mpX;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: loaded from: classes23.dex */
public final class PasskeyWalletServiceImpl$signDexTransaction$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ FragmentManager $fm;
    final /* synthetic */ LifecycleOwner $lifecycleOwner;
    final /* synthetic */ TransactionInput $transactionInput;
    final /* synthetic */ Function1<TransactionResult, Unit> $transactionResultCallback;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.business.defi.api.bean.passkeywallet.cedefi.TransactionResult, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PasskeyWalletServiceImpl$signDexTransaction$1(FragmentManager fragmentManager, Function1<? super TransactionResult, Unit> function1, LifecycleOwner lifecycleOwner, TransactionInput transactionInput, Continuation<? super PasskeyWalletServiceImpl$signDexTransaction$1> continuation) {
        super(2, continuation);
        this.$fm = fragmentManager;
        this.$transactionResultCallback = function1;
        this.$lifecycleOwner = lifecycleOwner;
        this.$transactionInput = transactionInput;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PasskeyWalletServiceImpl$signDexTransaction$1(this.$fm, this.$transactionResultCallback, this.$lifecycleOwner, this.$transactionInput, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PasskeyWalletServiceImpl$signDexTransaction$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            PasskeyWalletServiceImpl$signDexTransaction$1$serverOption$1 passkeyWalletServiceImpl$signDexTransaction$1$serverOption$1 = new PasskeyWalletServiceImpl$signDexTransaction$1$serverOption$1(this.$transactionInput, null);
            this.label = 1;
            obj = BuildersKt.withContext(io2, passkeyWalletServiceImpl$signDexTransaction$1$serverOption$1, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        Object objM7386unboximpl = ((Result) obj).m7386unboximpl();
        Function1<TransactionResult, Unit> function1 = this.$transactionResultCallback;
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7386unboximpl);
        if (thM7380exceptionOrNullimpl != null) {
            function1.invoke(new TransactionResult.Failed(C33070mpX.AYXKKw(C13754dXa.FragmentManager.isTimeProfileEmpty)));
            pUU.AEQbTJ("PasskeyWalletServiceImpl", "signTransaction1 error: ", thM7380exceptionOrNullimpl);
            return Unit.INSTANCE;
        }
        C56391yDq.AEQbTJ(objM7386unboximpl);
        PasskeyAuthenticateRequest passkeyAuthenticateRequest = (PasskeyAuthenticateRequest) objM7386unboximpl;
        if (this.$fm.isStateSaved()) {
            pUU.copydefault("PasskeyWalletServiceImpl", "signTransaction isStateSaved");
            this.$transactionResultCallback.invoke(TransactionResult.Cancelled.copydefault);
            return Unit.INSTANCE;
        }
        FragmentManager fragmentManager = this.$fm;
        final LifecycleOwner lifecycleOwner = this.$lifecycleOwner;
        final Function1<TransactionResult, Unit> function12 = this.$transactionResultCallback;
        fragmentManager.setFragmentResultListener("request_key_cedefi_sign_dex_transaction", lifecycleOwner, new FragmentResultListener() { // from class: o.dNr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle) {
                PasskeyWalletServiceImpl$signDexTransaction$1.invokeSuspend$lambda$1(lifecycleOwner, function12, str, bundle);
            }
        });
        FragmentManager fragmentManager2 = this.$fm;
        TransactionInput transactionInput = this.$transactionInput;
        FragmentTransaction fragmentTransactionBeginTransaction = fragmentManager2.beginTransaction();
        Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction, "");
        Fragment fragmentFindFragmentByTag = fragmentManager2.findFragmentByTag("cedefi_sign_dex_transaction_fragment");
        if (fragmentFindFragmentByTag != null) {
            fragmentTransactionBeginTransaction.remove(fragmentFindFragmentByTag);
        }
        fragmentTransactionBeginTransaction.add(C17561fJx.Companion.KWHzl(new InternalTransactionInput(passkeyAuthenticateRequest, transactionInput.EZpvd())), "cedefi_sign_dex_transaction_fragment");
        fragmentTransactionBeginTransaction.commit();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$1(LifecycleOwner lifecycleOwner, Function1 function1, String str, Bundle bundle) {
        Parcelable parcelable;
        Intrinsics.copydefault(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable = (Parcelable) bundle.getParcelable("result_data_cedefi_sign_dex_transaction", InternalTransactionResult.class);
        } else {
            parcelable = bundle.getParcelable("result_data_cedefi_sign_dex_transaction");
        }
        InternalTransactionResult internalTransactionResult = (InternalTransactionResult) parcelable;
        if (internalTransactionResult == null) {
            internalTransactionResult = InternalTransactionResult.Cancelled.EZpvd;
        }
        if (internalTransactionResult instanceof InternalTransactionResult.Success) {
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(lifecycleOwner), null, null, new PasskeyWalletServiceImpl$signDexTransaction$1$1$1(internalTransactionResult, function1, null), 3, null);
        } else if (internalTransactionResult instanceof InternalTransactionResult.Failed) {
            function1.invoke(new TransactionResult.Failed(((InternalTransactionResult.Failed) internalTransactionResult).OLrzqt()));
        } else {
            if (!Intrinsics.EZpvd(internalTransactionResult, InternalTransactionResult.Cancelled.EZpvd)) {
                throw new NoWhenBranchMatchedException();
            }
            function1.invoke(TransactionResult.Cancelled.copydefault);
        }
    }
}
