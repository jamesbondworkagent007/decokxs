package com.okinc.planet.biz_userprofile.viewmodel;

import com.okinc.planet.biz_userprofile.data.PlanetXAsync;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;
import o.AbstractC43419rot;
import o.C46215tMb;
import o.C56391yDq;
import o.C56442yFn;
import o.tQV;

/* JADX INFO: loaded from: classes19.dex */
public final class PlanetXManageViewModel$onAutoSyncToggled$2 extends SuspendLambda implements Function2<FlowCollector<? super Object>, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $enabled;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C46215tMb this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlanetXManageViewModel$onAutoSyncToggled$2(C46215tMb c46215tMb, boolean z, Continuation<? super PlanetXManageViewModel$onAutoSyncToggled$2> continuation) {
        super(2, continuation);
        this.this$0 = c46215tMb;
        this.$enabled = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PlanetXManageViewModel$onAutoSyncToggled$2 planetXManageViewModel$onAutoSyncToggled$2 = new PlanetXManageViewModel$onAutoSyncToggled$2(this.this$0, this.$enabled, continuation);
        planetXManageViewModel$onAutoSyncToggled$2.L$0 = obj;
        return planetXManageViewModel$onAutoSyncToggled$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(FlowCollector<? super Object> flowCollector, Continuation<? super Unit> continuation) {
        return invoke2((FlowCollector<Object>) flowCollector, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(FlowCollector<Object> flowCollector, Continuation<? super Unit> continuation) {
        return ((PlanetXManageViewModel$onAutoSyncToggled$2) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        FlowCollector flowCollector;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            flowCollector = (FlowCollector) this.L$0;
            tQV tqv = this.this$0.OLrzqt;
            PlanetXAsync planetXAsync = new PlanetXAsync(this.$enabled);
            this.L$0 = flowCollector;
            this.label = 1;
            obj = tqv.AEQbTJ(planetXAsync, this);
            if (obj == objCopydefault) {
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
            flowCollector = (FlowCollector) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        Object objAEQbTJ = ((AbstractC43419rot) obj).AEQbTJ();
        this.L$0 = null;
        this.label = 2;
        if (flowCollector.emit(objAEQbTJ, this) == objCopydefault) {
            return objCopydefault;
        }
        return Unit.INSTANCE;
    }
}
