package com.okinc.business.defi.wallet.mine.walletbind.viewmodel;

import com.okinc.business.defi.wallet.mine.walletbind.datasource.ValidateNonceResponseBody;
import com.okinc.wallet.api.bean.WalletInfo;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.yHT;

/* JADX INFO: loaded from: classes5.dex */
public final class WalletBindCeFiSelectViewModel$isContinueButtonEnabled$1 extends SuspendLambda implements yHT<WalletInfo, Boolean, ValidateNonceResponseBody, Continuation<? super Boolean>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ boolean Z$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public WalletBindCeFiSelectViewModel$isContinueButtonEnabled$1(Continuation<? super WalletBindCeFiSelectViewModel$isContinueButtonEnabled$1> continuation) {
        super(4, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Object invoke(WalletInfo walletInfo, boolean z, ValidateNonceResponseBody validateNonceResponseBody, Continuation<? super Boolean> continuation) {
        WalletBindCeFiSelectViewModel$isContinueButtonEnabled$1 walletBindCeFiSelectViewModel$isContinueButtonEnabled$1 = new WalletBindCeFiSelectViewModel$isContinueButtonEnabled$1(continuation);
        walletBindCeFiSelectViewModel$isContinueButtonEnabled$1.L$0 = walletInfo;
        walletBindCeFiSelectViewModel$isContinueButtonEnabled$1.Z$0 = z;
        walletBindCeFiSelectViewModel$isContinueButtonEnabled$1.L$1 = validateNonceResponseBody;
        return walletBindCeFiSelectViewModel$isContinueButtonEnabled$1.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
    @Override // o.yHT
    public /* synthetic */ Object invoke(WalletInfo walletInfo, Boolean bool, ValidateNonceResponseBody validateNonceResponseBody, Continuation<? super Boolean> continuation) {
        return invoke(walletInfo, bool.booleanValue(), validateNonceResponseBody, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            return C56443yFo.KWHzl((((WalletInfo) this.L$0) == null || !this.Z$0 || ((ValidateNonceResponseBody) this.L$1) == null) ? false : true);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
