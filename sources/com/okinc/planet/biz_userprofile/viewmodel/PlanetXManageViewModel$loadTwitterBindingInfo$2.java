package com.okinc.planet.biz_userprofile.viewmodel;

import com.okinc.planet.biz_userprofile.data.PlanetTwitterBindingInfo;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowCollector;
import o.AbstractC46197tLk;
import o.C46215tMb;
import o.C56391yDq;
import o.C56442yFn;
import o.yHO;

/* JADX INFO: loaded from: classes19.dex */
public final class PlanetXManageViewModel$loadTwitterBindingInfo$2 extends SuspendLambda implements yHO<FlowCollector<? super PlanetTwitterBindingInfo>, Throwable, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C46215tMb this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlanetXManageViewModel$loadTwitterBindingInfo$2(C46215tMb c46215tMb, Continuation<? super PlanetXManageViewModel$loadTwitterBindingInfo$2> continuation) {
        super(3, continuation);
        this.this$0 = c46215tMb;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.yHO
    public final Object invoke(FlowCollector<? super PlanetTwitterBindingInfo> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
        PlanetXManageViewModel$loadTwitterBindingInfo$2 planetXManageViewModel$loadTwitterBindingInfo$2 = new PlanetXManageViewModel$loadTwitterBindingInfo$2(this.this$0, continuation);
        planetXManageViewModel$loadTwitterBindingInfo$2.L$0 = th;
        return planetXManageViewModel$loadTwitterBindingInfo$2.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            this.this$0.EZpvd.setValue(AbstractC46197tLk.Companion.OLrzqt((Throwable) this.L$0));
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
