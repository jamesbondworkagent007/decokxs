package com.okinc.im.imui.impl;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowCollector;
import o.C35253nro;
import o.C44124sEe;
import o.C56391yDq;
import o.C56442yFn;
import o.yHO;

/* JADX INFO: loaded from: classes8.dex */
public final class OKIMServiceImpl$getTotalUnreadCountDisplayFlow$2 extends SuspendLambda implements yHO<FlowCollector<? super C35253nro>, Throwable, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public OKIMServiceImpl$getTotalUnreadCountDisplayFlow$2(Continuation<? super OKIMServiceImpl$getTotalUnreadCountDisplayFlow$2> continuation) {
        super(3, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.yHO
    public final Object invoke(FlowCollector<? super C35253nro> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
        OKIMServiceImpl$getTotalUnreadCountDisplayFlow$2 oKIMServiceImpl$getTotalUnreadCountDisplayFlow$2 = new OKIMServiceImpl$getTotalUnreadCountDisplayFlow$2(continuation);
        oKIMServiceImpl$getTotalUnreadCountDisplayFlow$2.L$0 = th;
        return oKIMServiceImpl$getTotalUnreadCountDisplayFlow$2.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            C44124sEe.imLogGetAllUnreadCountFlow$default("OKIMServiceImpl - getTotalUnreadCountStringFlow - error: " + ((Throwable) this.L$0).getMessage(), null, 2, null);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
