package com.okinc.business.defi.wallet.mine.walletmanage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import o.C17351fCc;
import o.C17413fEk;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes5.dex */
public final class WalletManageContentFragmentNew$refreshData$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Ref.IntRef $refreshCount;
    final /* synthetic */ long $startTimeMillis;
    int label;
    final /* synthetic */ C17351fCc this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletManageContentFragmentNew$refreshData$3(C17351fCc c17351fCc, Ref.IntRef intRef, long j, Continuation<? super WalletManageContentFragmentNew$refreshData$3> continuation) {
        super(2, continuation);
        this.this$0 = c17351fCc;
        this.$refreshCount = intRef;
        this.$startTimeMillis = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WalletManageContentFragmentNew$refreshData$3(this.this$0, this.$refreshCount, this.$startTimeMillis, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((WalletManageContentFragmentNew$refreshData$3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C17413fEk c17413fEkAkhnZx = this.this$0.AkhnZx();
            this.label = 1;
            if (c17413fEkAkhnZx.AEQbTJ(this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        Ref.IntRef intRef = this.$refreshCount;
        int i2 = intRef.element + 1;
        intRef.element = i2;
        C17351fCc.KWHzl(this.$startTimeMillis, this.this$0, i2);
        return Unit.INSTANCE;
    }
}
