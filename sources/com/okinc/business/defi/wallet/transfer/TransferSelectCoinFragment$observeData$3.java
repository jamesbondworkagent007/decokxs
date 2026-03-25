package com.okinc.business.defi.wallet.transfer;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.C20634gkb;
import o.C33129mqd;
import o.C55326xho;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes5.dex */
public final class TransferSelectCoinFragment$observeData$3 extends SuspendLambda implements Function2<String, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C20634gkb this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransferSelectCoinFragment$observeData$3(C20634gkb c20634gkb, Continuation<? super TransferSelectCoinFragment$observeData$3> continuation) {
        super(2, continuation);
        this.this$0 = c20634gkb;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        TransferSelectCoinFragment$observeData$3 transferSelectCoinFragment$observeData$3 = new TransferSelectCoinFragment$observeData$3(this.this$0, continuation);
        transferSelectCoinFragment$observeData$3.L$0 = obj;
        return transferSelectCoinFragment$observeData$3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(String str, Continuation<? super Unit> continuation) {
        return ((TransferSelectCoinFragment$observeData$3) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            String str = (String) this.L$0;
            if (C33129mqd.OLrzqt((CharSequence) str)) {
                C55326xho.toastWithFailedIcon$default(str, 0, 1, (Object) null);
            }
            this.this$0.dismissLoading();
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
