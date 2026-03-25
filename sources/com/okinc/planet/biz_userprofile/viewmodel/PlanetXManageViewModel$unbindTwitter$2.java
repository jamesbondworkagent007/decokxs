package com.okinc.planet.biz_userprofile.viewmodel;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowCollector;
import o.C46215tMb;
import o.C56391yDq;
import o.C56442yFn;
import o.yHO;

/* JADX INFO: loaded from: classes19.dex */
public final class PlanetXManageViewModel$unbindTwitter$2 extends SuspendLambda implements yHO<FlowCollector<? super Object>, Throwable, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C46215tMb this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlanetXManageViewModel$unbindTwitter$2(C46215tMb c46215tMb, Continuation<? super PlanetXManageViewModel$unbindTwitter$2> continuation) {
        super(3, continuation);
        this.this$0 = c46215tMb;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
    @Override // o.yHO
    public /* bridge */ /* synthetic */ Object invoke(FlowCollector<? super Object> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
        return invoke2((FlowCollector<Object>) flowCollector, th, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(FlowCollector<Object> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
        PlanetXManageViewModel$unbindTwitter$2 planetXManageViewModel$unbindTwitter$2 = new PlanetXManageViewModel$unbindTwitter$2(this.this$0, continuation);
        planetXManageViewModel$unbindTwitter$2.L$0 = th;
        return planetXManageViewModel$unbindTwitter$2.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Throwable th = (Throwable) this.L$0;
            C46215tMb c46215tMb = this.this$0;
            String message = th.getMessage();
            if (message == null) {
                message = "Unknown error";
            }
            C46215tMb.Application.Dialog dialog = new C46215tMb.Application.Dialog(message);
            this.label = 1;
            if (c46215tMb.EZpvd(dialog, this) == objCopydefault) {
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
