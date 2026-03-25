package com.okinc.business.defi.wallet.mine.walletbind.utils;

import android.content.Context;
import android.content.Intent;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.ActivityC20522giV;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes5.dex */
public final class IndependentWalletBindCeFiUtils$goToWithdraw$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ String $walletId;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IndependentWalletBindCeFiUtils$goToWithdraw$1$1$1(Context context, String str, Continuation<? super IndependentWalletBindCeFiUtils$goToWithdraw$1$1$1> continuation) {
        super(2, continuation);
        this.$context = context;
        this.$walletId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new IndependentWalletBindCeFiUtils$goToWithdraw$1$1$1(this.$context, this.$walletId, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((IndependentWalletBindCeFiUtils$goToWithdraw$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            Intent intentKWHzl = ActivityC20522giV.Companion.KWHzl(this.$context, "from_receive", this.$walletId, (WalletImportError.ERROR_CODE_AA_EXIST & 8) != 0 ? null : null, (WalletImportError.ERROR_CODE_AA_EXIST & 16) != 0 ? false : false, (WalletImportError.ERROR_CODE_AA_EXIST & 32) != 0 ? null : null, (WalletImportError.ERROR_CODE_AA_EXIST & 64) != 0 ? null : null);
            intentKWHzl.addFlags(536870912);
            this.$context.startActivity(intentKWHzl);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
