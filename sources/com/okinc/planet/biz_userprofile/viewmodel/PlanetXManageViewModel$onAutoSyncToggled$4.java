package com.okinc.planet.biz_userprofile.viewmodel;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.C46215tMb;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes19.dex */
public final class PlanetXManageViewModel$onAutoSyncToggled$4 extends SuspendLambda implements Function2<Object, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $enabled;
    int label;
    final /* synthetic */ C46215tMb this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlanetXManageViewModel$onAutoSyncToggled$4(C46215tMb c46215tMb, boolean z, Continuation<? super PlanetXManageViewModel$onAutoSyncToggled$4> continuation) {
        super(2, continuation);
        this.this$0 = c46215tMb;
        this.$enabled = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PlanetXManageViewModel$onAutoSyncToggled$4(this.this$0, this.$enabled, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Continuation<? super Unit> continuation) {
        return ((PlanetXManageViewModel$onAutoSyncToggled$4) create(obj, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C46215tMb c46215tMb = this.this$0;
            C46215tMb.Application.ActionBar actionBar = C46215tMb.Application.ActionBar.KWHzl;
            this.label = 1;
            if (c46215tMb.EZpvd(actionBar, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        C46215tMb c46215tMb2 = this.this$0;
        C46215tMb.Application.TaskDescription taskDescription = new C46215tMb.Application.TaskDescription(this.$enabled);
        this.label = 2;
        if (c46215tMb2.EZpvd(taskDescription, this) == objCopydefault) {
            return objCopydefault;
        }
        return Unit.INSTANCE;
    }
}
