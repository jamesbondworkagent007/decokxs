package com.okinc.unify_trade.trade.source.task;

import android.os.SystemClock;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import o.C54747xTv;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.pUU;

/* JADX INFO: loaded from: classes19.dex */
public final class SpotDataTaskByRepo$refreshAllTickers$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ C54747xTv this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpotDataTaskByRepo$refreshAllTickers$1(C54747xTv c54747xTv, Continuation<? super SpotDataTaskByRepo$refreshAllTickers$1> continuation) {
        super(2, continuation);
        this.this$0 = c54747xTv;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SpotDataTaskByRepo$refreshAllTickers$1 spotDataTaskByRepo$refreshAllTickers$1 = new SpotDataTaskByRepo$refreshAllTickers$1(this.this$0, continuation);
        spotDataTaskByRepo$refreshAllTickers$1.L$0 = obj;
        return spotDataTaskByRepo$refreshAllTickers$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SpotDataTaskByRepo$refreshAllTickers$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C54747xTv c54747xTv;
        Job jobLaunch$default;
        C54747xTv c54747xTv2;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (Throwable th) {
            Result.Application application = Result.Companion;
            Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            c54747xTv = this.this$0;
            Result.Application application2 = Result.Companion;
            jobLaunch$default = BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new SpotDataTaskByRepo$refreshAllTickers$1$1$jon1$1(c54747xTv, null), 3, null);
            Job jobLaunch$default2 = BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new SpotDataTaskByRepo$refreshAllTickers$1$1$job2$1(c54747xTv, null), 3, null);
            this.L$0 = c54747xTv;
            this.L$1 = jobLaunch$default;
            this.label = 1;
            if (jobLaunch$default2.join(this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c54747xTv2 = (C54747xTv) this.L$0;
                C56391yDq.AEQbTJ(obj);
                c54747xTv2.EZpvd.setValue(C56443yFo.KWHzl(SystemClock.elapsedRealtime()));
                pUU.KWHzl("NavOptPhase1", c54747xTv2.OLrzqt + " -> SpotDataTaskByRepo refreshAllTickers done, " + c54747xTv2.EZpvd.getValue());
                Result.m7377constructorimpl(Unit.INSTANCE);
                return Unit.INSTANCE;
            }
            Job job = (Job) this.L$1;
            C54747xTv c54747xTv3 = (C54747xTv) this.L$0;
            C56391yDq.AEQbTJ(obj);
            jobLaunch$default = job;
            c54747xTv = c54747xTv3;
        }
        this.L$0 = c54747xTv;
        this.L$1 = null;
        this.label = 2;
        if (jobLaunch$default.join(this) == objCopydefault) {
            return objCopydefault;
        }
        c54747xTv2 = c54747xTv;
        c54747xTv2.EZpvd.setValue(C56443yFo.KWHzl(SystemClock.elapsedRealtime()));
        pUU.KWHzl("NavOptPhase1", c54747xTv2.OLrzqt + " -> SpotDataTaskByRepo refreshAllTickers done, " + c54747xTv2.EZpvd.getValue());
        Result.m7377constructorimpl(Unit.INSTANCE);
        return Unit.INSTANCE;
    }
}
