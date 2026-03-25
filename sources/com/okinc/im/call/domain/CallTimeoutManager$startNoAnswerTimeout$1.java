package com.okinc.im.call.domain;

import com.okinc.im.call.model.CallStateV2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import o.C35222nrJ;
import o.C56391yDq;
import o.C56442yFn;
import o.C56524yIo;

/* JADX INFO: loaded from: classes8.dex */
public final class CallTimeoutManager$startNoAnswerTimeout$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C35222nrJ this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CallTimeoutManager$startNoAnswerTimeout$1(C35222nrJ c35222nrJ, Continuation<? super CallTimeoutManager$startNoAnswerTimeout$1> continuation) {
        super(2, continuation);
        this.this$0 = c35222nrJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CallTimeoutManager$startNoAnswerTimeout$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CallTimeoutManager$startNoAnswerTimeout$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            this.label = 1;
            if (DelayKt.delay(30000L, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        Function0 function0 = this.this$0.OLrzqt;
        C35222nrJ.Activity activity = null;
        if (function0 == null) {
            Intrinsics.gEmmrt("");
            function0 = null;
        }
        CallStateV2 callStateV2 = (CallStateV2) function0.invoke();
        if (callStateV2 instanceof CallStateV2.Ringing) {
            this.this$0.KWHzl("No answer timeout triggered after 30000ms");
            C35222nrJ.Activity activity2 = this.this$0.EZpvd;
            if (activity2 == null) {
                Intrinsics.gEmmrt("");
            } else {
                activity = activity2;
            }
            activity.AhwBna();
        } else {
            this.this$0.KWHzl("Timeout elapsed but state changed to " + C56524yIo.AEQbTJ(callStateV2.getClass()).valueOf() + ", ignoring");
        }
        return Unit.INSTANCE;
    }
}
