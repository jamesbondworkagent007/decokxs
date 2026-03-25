package com.okinc.planet.biz_userprofile.viewmodel;

import com.okinc.planet.biz_userprofile.data.PlanetTwitterBindingInfo;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.AbstractC46197tLk;
import o.C46215tMb;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes19.dex */
public final class PlanetXManageViewModel$loadTwitterBindingInfo$3 extends SuspendLambda implements Function2<PlanetTwitterBindingInfo, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C46215tMb this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlanetXManageViewModel$loadTwitterBindingInfo$3(C46215tMb c46215tMb, Continuation<? super PlanetXManageViewModel$loadTwitterBindingInfo$3> continuation) {
        super(2, continuation);
        this.this$0 = c46215tMb;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PlanetXManageViewModel$loadTwitterBindingInfo$3 planetXManageViewModel$loadTwitterBindingInfo$3 = new PlanetXManageViewModel$loadTwitterBindingInfo$3(this.this$0, continuation);
        planetXManageViewModel$loadTwitterBindingInfo$3.L$0 = obj;
        return planetXManageViewModel$loadTwitterBindingInfo$3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(PlanetTwitterBindingInfo planetTwitterBindingInfo, Continuation<? super Unit> continuation) {
        return ((PlanetXManageViewModel$loadTwitterBindingInfo$3) create(planetTwitterBindingInfo, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            this.this$0.EZpvd.setValue(AbstractC46197tLk.Companion.KWHzl((PlanetTwitterBindingInfo) this.L$0));
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
