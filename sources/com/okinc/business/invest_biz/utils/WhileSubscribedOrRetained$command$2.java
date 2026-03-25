package com.okinc.business.invest_biz.utils;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.SharingCommand;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;

/* JADX INFO: loaded from: classes6.dex */
public final class WhileSubscribedOrRetained$command$2 extends SuspendLambda implements Function2<SharingCommand, Continuation<? super Boolean>, Object> {
    /* synthetic */ Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public WhileSubscribedOrRetained$command$2(Continuation<? super WhileSubscribedOrRetained$command$2> continuation) {
        super(2, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        WhileSubscribedOrRetained$command$2 whileSubscribedOrRetained$command$2 = new WhileSubscribedOrRetained$command$2(continuation);
        whileSubscribedOrRetained$command$2.L$0 = obj;
        return whileSubscribedOrRetained$command$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(SharingCommand sharingCommand, Continuation<? super Boolean> continuation) {
        return ((WhileSubscribedOrRetained$command$2) create(sharingCommand, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C56391yDq.AEQbTJ(obj);
        return C56443yFo.KWHzl(((SharingCommand) this.L$0) != SharingCommand.START);
    }
}
