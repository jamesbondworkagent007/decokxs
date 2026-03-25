package com.okinc.tradingbot.impl.signalClone.ui;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.C56391yDq;
import o.C56442yFn;
import o.uSN;

/* JADX INFO: loaded from: classes16.dex */
public final class SignalCloneBottomSheet$onCreateContent$1$6 extends SuspendLambda implements Function2<String, Continuation<? super Unit>, Object> {
    final /* synthetic */ uSN $this_apply;
    /* synthetic */ Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignalCloneBottomSheet$onCreateContent$1$6(uSN usn, Continuation<? super SignalCloneBottomSheet$onCreateContent$1$6> continuation) {
        super(2, continuation);
        this.$this_apply = usn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SignalCloneBottomSheet$onCreateContent$1$6 signalCloneBottomSheet$onCreateContent$1$6 = new SignalCloneBottomSheet$onCreateContent$1$6(this.$this_apply, continuation);
        signalCloneBottomSheet$onCreateContent$1$6.L$0 = obj;
        return signalCloneBottomSheet$onCreateContent$1$6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(String str, Continuation<? super Unit> continuation) {
        return ((SignalCloneBottomSheet$onCreateContent$1$6) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            String str = (String) this.L$0;
            if (str == null) {
                return Unit.INSTANCE;
            }
            this.$this_apply.AEQbTJ.setTransferCoin(str);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
