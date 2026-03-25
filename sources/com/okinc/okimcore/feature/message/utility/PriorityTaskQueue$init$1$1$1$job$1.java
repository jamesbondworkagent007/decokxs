package com.okinc.okimcore.feature.message.utility;

import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.sDN;
import o.sMQ;
import o.sMV;

/* JADX INFO: loaded from: classes10.dex */
public final class PriorityTaskQueue$init$1$1$1$job$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ sMQ $task;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ sMV this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PriorityTaskQueue$init$1$1$1$job$1(sMV smv, sMQ smq, Continuation<? super PriorityTaskQueue$init$1$1$1$job$1> continuation) {
        super(2, continuation);
        this.this$0 = smv;
        this.$task = smq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PriorityTaskQueue$init$1$1$1$job$1 priorityTaskQueue$init$1$1$1$job$1 = new PriorityTaskQueue$init$1$1$1$job$1(this.this$0, this.$task, continuation);
        priorityTaskQueue$init$1$1$1$job$1.L$0 = obj;
        return priorityTaskQueue$init$1$1$1$job$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PriorityTaskQueue$init$1$1$1$job$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Unit unit;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        Unit unit2 = null;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                sMV smv = this.this$0;
                sMQ smq = this.$task;
                Result.Application application = Result.Companion;
                if (smv.OLrzqt) {
                    CoroutineDispatcher coroutineDispatcherOLrzqt = sDN.copydefault.OLrzqt();
                    PriorityTaskQueue$init$1$1$1$job$1$1$1 priorityTaskQueue$init$1$1$1$job$1$1$1 = new PriorityTaskQueue$init$1$1$1$job$1$1$1(smq, null);
                    this.L$0 = coroutineScope;
                    this.label = 1;
                    if (BuildersKt.withContext(coroutineDispatcherOLrzqt, priorityTaskQueue$init$1$1$1$job$1$1$1, this) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    Function2<CoroutineScope, Continuation<? super Unit>, Object> function2KWHzl = smq.KWHzl();
                    this.L$0 = coroutineScope;
                    this.label = 2;
                    if (function2KWHzl.invoke(coroutineScope, this) == objCopydefault) {
                        return objCopydefault;
                    }
                }
            } else {
                if (i != 1 && i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Object obj2 = this.L$0;
                C56391yDq.AEQbTJ(obj);
            }
            objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        sMQ smq2 = this.$task;
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            try {
                Result.Application application3 = Result.Companion;
                Continuation<Unit> continuationAEQbTJ = smq2.AEQbTJ();
                if (continuationAEQbTJ != null) {
                    continuationAEQbTJ.resumeWith(Result.m7377constructorimpl(C56391yDq.EZpvd(thM7380exceptionOrNullimpl)));
                    unit = Unit.INSTANCE;
                } else {
                    unit = null;
                }
                Result.m7377constructorimpl(unit);
            } catch (Throwable th2) {
                Result.Application application4 = Result.Companion;
                Result.m7377constructorimpl(C56391yDq.EZpvd(th2));
            }
        }
        sMQ smq3 = this.$task;
        if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
            try {
                Result.Application application5 = Result.Companion;
                Continuation<Unit> continuationAEQbTJ2 = smq3.AEQbTJ();
                if (continuationAEQbTJ2 != null) {
                    unit2 = Unit.INSTANCE;
                    continuationAEQbTJ2.resumeWith(Result.m7377constructorimpl(unit2));
                }
                Result.m7377constructorimpl(unit2);
            } catch (Throwable th3) {
                Result.Application application6 = Result.Companion;
                Result.m7377constructorimpl(C56391yDq.EZpvd(th3));
            }
        }
        return Unit.INSTANCE;
    }
}
