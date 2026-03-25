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
public final class PlanetXManageViewModel$onAutoSyncToggled$3 extends SuspendLambda implements yHO<FlowCollector<? super Object>, Throwable, Continuation<? super Unit>, Object> {
    final /* synthetic */ PlanetTwitterBindingInfo $currentData;
    final /* synthetic */ boolean $previousSyncState;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C46215tMb this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlanetXManageViewModel$onAutoSyncToggled$3(C46215tMb c46215tMb, PlanetTwitterBindingInfo planetTwitterBindingInfo, boolean z, Continuation<? super PlanetXManageViewModel$onAutoSyncToggled$3> continuation) {
        super(3, continuation);
        this.this$0 = c46215tMb;
        this.$currentData = planetTwitterBindingInfo;
        this.$previousSyncState = z;
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
        PlanetXManageViewModel$onAutoSyncToggled$3 planetXManageViewModel$onAutoSyncToggled$3 = new PlanetXManageViewModel$onAutoSyncToggled$3(this.this$0, this.$currentData, this.$previousSyncState, continuation);
        planetXManageViewModel$onAutoSyncToggled$3.L$0 = th;
        return planetXManageViewModel$onAutoSyncToggled$3.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Throwable th;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            th = (Throwable) this.L$0;
            C46215tMb c46215tMb = this.this$0;
            C46215tMb.Application.ActionBar actionBar = C46215tMb.Application.ActionBar.KWHzl;
            this.L$0 = th;
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
                this.this$0.EZpvd.setValue(AbstractC46197tLk.Companion.KWHzl(PlanetTwitterBindingInfo.copy$default(this.$currentData, null, this.$previousSyncState, 1, null)));
                return Unit.INSTANCE;
            }
            th = (Throwable) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        C46215tMb c46215tMb2 = this.this$0;
        String message = th.getMessage();
        if (message == null) {
            message = "Unknown error";
        }
        C46215tMb.Application.Activity activity = new C46215tMb.Application.Activity(message);
        this.L$0 = null;
        this.label = 2;
        if (c46215tMb2.EZpvd(activity, this) == objCopydefault) {
            return objCopydefault;
        }
        this.this$0.EZpvd.setValue(AbstractC46197tLk.Companion.KWHzl(PlanetTwitterBindingInfo.copy$default(this.$currentData, null, this.$previousSyncState, 1, null)));
        return Unit.INSTANCE;
    }
}
