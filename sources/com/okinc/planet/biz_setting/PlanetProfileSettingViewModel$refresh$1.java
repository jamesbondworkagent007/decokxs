package com.okinc.planet.biz_setting;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;
import o.AbstractC46197tLk;
import o.C46126tIu;
import o.C56391yDq;
import o.C56442yFn;
import o.tHW;
import o.tIA;

/* JADX INFO: loaded from: classes10.dex */
public final class PlanetProfileSettingViewModel$refresh$1 extends SuspendLambda implements Function2<FlowCollector<? super AbstractC46197tLk<? extends C46126tIu>>, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ tHW this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlanetProfileSettingViewModel$refresh$1(tHW thw, Continuation<? super PlanetProfileSettingViewModel$refresh$1> continuation) {
        super(2, continuation);
        this.this$0 = thw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PlanetProfileSettingViewModel$refresh$1 planetProfileSettingViewModel$refresh$1 = new PlanetProfileSettingViewModel$refresh$1(this.this$0, continuation);
        planetProfileSettingViewModel$refresh$1.L$0 = obj;
        return planetProfileSettingViewModel$refresh$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(FlowCollector<? super AbstractC46197tLk<? extends C46126tIu>> flowCollector, Continuation<? super Unit> continuation) {
        return invoke2((FlowCollector<? super AbstractC46197tLk<C46126tIu>>) flowCollector, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(FlowCollector<? super AbstractC46197tLk<C46126tIu>> flowCollector, Continuation<? super Unit> continuation) {
        return ((PlanetProfileSettingViewModel$refresh$1) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC46197tLk.TaskDescription taskDescription;
        FlowCollector flowCollector;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            FlowCollector flowCollector2 = (FlowCollector) this.L$0;
            taskDescription = AbstractC46197tLk.Companion;
            tIA tia = this.this$0.AEQbTJ;
            tIA.Activity.TaskDescription taskDescription2 = tIA.Activity.TaskDescription.KWHzl;
            this.L$0 = flowCollector2;
            this.L$1 = taskDescription;
            this.label = 1;
            Object objKWHzl = tia.KWHzl(taskDescription2, this);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
            flowCollector = flowCollector2;
            obj = objKWHzl;
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            taskDescription = (AbstractC46197tLk.TaskDescription) this.L$1;
            flowCollector = (FlowCollector) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        AbstractC46197tLk abstractC46197tLkKWHzl = taskDescription.KWHzl(obj);
        this.L$0 = null;
        this.L$1 = null;
        this.label = 2;
        if (flowCollector.emit(abstractC46197tLkKWHzl, this) == objCopydefault) {
            return objCopydefault;
        }
        return Unit.INSTANCE;
    }
}
