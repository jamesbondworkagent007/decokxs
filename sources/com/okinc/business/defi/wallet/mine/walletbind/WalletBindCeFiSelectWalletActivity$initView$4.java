package com.okinc.business.defi.wallet.mine.walletbind;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.ActivityC19292fyY;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes5.dex */
public final class WalletBindCeFiSelectWalletActivity$initView$4 extends SuspendLambda implements Function2<String, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ActivityC19292fyY this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletBindCeFiSelectWalletActivity$initView$4(ActivityC19292fyY activityC19292fyY, Continuation<? super WalletBindCeFiSelectWalletActivity$initView$4> continuation) {
        super(2, continuation);
        this.this$0 = activityC19292fyY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        WalletBindCeFiSelectWalletActivity$initView$4 walletBindCeFiSelectWalletActivity$initView$4 = new WalletBindCeFiSelectWalletActivity$initView$4(this.this$0, continuation);
        walletBindCeFiSelectWalletActivity$initView$4.L$0 = obj;
        return walletBindCeFiSelectWalletActivity$initView$4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(String str, Continuation<? super Unit> continuation) {
        return ((WalletBindCeFiSelectWalletActivity$initView$4) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            this.this$0.djBIcL = (String) this.L$0;
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
