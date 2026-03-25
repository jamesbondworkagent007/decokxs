package com.okinc.find_ui.widgetprovider;

import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import o.ActivityC35107npA;
import o.C35118npL;
import o.C35119npM;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes18.dex */
public final class CryptoWidgetConfigureActivity$initRecyclerView$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ C35118npL $adapter;
    int label;
    final /* synthetic */ ActivityC35107npA this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CryptoWidgetConfigureActivity$initRecyclerView$1(ActivityC35107npA activityC35107npA, C35118npL c35118npL, Continuation<? super CryptoWidgetConfigureActivity$initRecyclerView$1> continuation) {
        super(2, continuation);
        this.this$0 = activityC35107npA;
        this.$adapter = c35118npL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CryptoWidgetConfigureActivity$initRecyclerView$1(this.this$0, this.$adapter, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CryptoWidgetConfigureActivity$initRecyclerView$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C35119npM c35119npMAEQbTJ = this.this$0.AEQbTJ();
            this.label = 1;
            obj = c35119npMAEQbTJ.KWHzl(this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                throw new KotlinNothingValueException();
            }
            C56391yDq.AEQbTJ(obj);
        }
        final ActivityC35107npA activityC35107npA = this.this$0;
        final C35118npL c35118npL = this.$adapter;
        FlowCollector flowCollector = new FlowCollector() { // from class: com.okinc.find_ui.widgetprovider.CryptoWidgetConfigureActivity$initRecyclerView$1.3
            /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
            public final Object emit(List<C35119npM.Application> list, Continuation<? super Unit> continuation) {
                if (list.isEmpty()) {
                    if (activityC35107npA.AEQbTJ().AEQbTJ()) {
                        activityC35107npA.valueOf();
                    } else {
                        activityC35107npA.AhwBna();
                    }
                } else {
                    activityC35107npA.AhwBna();
                    activityC35107npA.releaseLoading();
                    c35118npL.submitList(list);
                }
                return Unit.INSTANCE;
            }
        };
        this.label = 2;
        if (((StateFlow) obj).collect(flowCollector, this) == objCopydefault) {
            return objCopydefault;
        }
        throw new KotlinNothingValueException();
    }
}
