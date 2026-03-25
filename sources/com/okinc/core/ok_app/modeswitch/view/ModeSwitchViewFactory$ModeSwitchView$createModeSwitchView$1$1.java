package com.okinc.core.ok_app.modeswitch.view;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes8.dex */
public final class ModeSwitchViewFactory$ModeSwitchView$createModeSwitchView$1$1 extends SuspendLambda implements Function2<FlowCollector<? super Unit>, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ModeSwitchViewFactory$ModeSwitchView$createModeSwitchView$1$1(Continuation<? super ModeSwitchViewFactory$ModeSwitchView$createModeSwitchView$1$1> continuation) {
        super(2, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ModeSwitchViewFactory$ModeSwitchView$createModeSwitchView$1$1 modeSwitchViewFactory$ModeSwitchView$createModeSwitchView$1$1 = new ModeSwitchViewFactory$ModeSwitchView$createModeSwitchView$1$1(continuation);
        modeSwitchViewFactory$ModeSwitchView$createModeSwitchView$1$1.L$0 = obj;
        return modeSwitchViewFactory$ModeSwitchView$createModeSwitchView$1$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(FlowCollector<? super Unit> flowCollector, Continuation<? super Unit> continuation) {
        return ((ModeSwitchViewFactory$ModeSwitchView$createModeSwitchView$1$1) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            Unit unit = Unit.INSTANCE;
            this.label = 1;
            if (flowCollector.emit(unit, this) == objCopydefault) {
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
