package com.okinc.okimcore.channel.inhouse.impl;

import com.okinc.okimcore.model.im.OKConversation;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowCollector;
import o.C56391yDq;
import o.C56442yFn;
import o.yHO;

/* JADX INFO: loaded from: classes10.dex */
public final class InHouseIMQueryImpl$getOrInitConversationByUserIdFlow$1 extends SuspendLambda implements yHO<FlowCollector<? super Result<? extends OKConversation>>, Throwable, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InHouseIMQueryImpl$getOrInitConversationByUserIdFlow$1(Continuation<? super InHouseIMQueryImpl$getOrInitConversationByUserIdFlow$1> continuation) {
        super(3, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
    @Override // o.yHO
    public /* bridge */ /* synthetic */ Object invoke(FlowCollector<? super Result<? extends OKConversation>> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
        return invoke2((FlowCollector<? super Result<OKConversation>>) flowCollector, th, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(FlowCollector<? super Result<OKConversation>> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
        InHouseIMQueryImpl$getOrInitConversationByUserIdFlow$1 inHouseIMQueryImpl$getOrInitConversationByUserIdFlow$1 = new InHouseIMQueryImpl$getOrInitConversationByUserIdFlow$1(continuation);
        inHouseIMQueryImpl$getOrInitConversationByUserIdFlow$1.L$0 = flowCollector;
        inHouseIMQueryImpl$getOrInitConversationByUserIdFlow$1.L$1 = th;
        return inHouseIMQueryImpl$getOrInitConversationByUserIdFlow$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            Throwable th = (Throwable) this.L$1;
            Result.Application application = Result.Companion;
            Result resultM7376boximpl = Result.m7376boximpl(Result.m7377constructorimpl(C56391yDq.EZpvd(th)));
            this.L$0 = null;
            this.label = 1;
            if (flowCollector.emit(resultM7376boximpl, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }
}
