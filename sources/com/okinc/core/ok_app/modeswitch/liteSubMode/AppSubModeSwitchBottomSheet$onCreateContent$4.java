package com.okinc.core.ok_app.modeswitch.liteSubMode;

import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import o.AbstractC33249msr;
import o.C33371mvG;
import o.C43251rlk;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC33237msf;

/* JADX INFO: loaded from: classes8.dex */
public final class AppSubModeSwitchBottomSheet$onCreateContent$4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C33371mvG this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppSubModeSwitchBottomSheet$onCreateContent$4(C33371mvG c33371mvG, Continuation<? super AppSubModeSwitchBottomSheet$onCreateContent$4> continuation) {
        super(2, continuation);
        this.this$0 = c33371mvG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AppSubModeSwitchBottomSheet$onCreateContent$4(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AppSubModeSwitchBottomSheet$onCreateContent$4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            StateFlow<AbstractC33249msr> stateFlowOLrzqt = ((InterfaceC33237msf) C43251rlk.copydefault(InterfaceC33237msf.class)).OLrzqt();
            final C33371mvG c33371mvG = this.this$0;
            FlowCollector<? super AbstractC33249msr> flowCollector = new FlowCollector() { // from class: com.okinc.core.ok_app.modeswitch.liteSubMode.AppSubModeSwitchBottomSheet$onCreateContent$4.3
                /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
                public final Object emit(AbstractC33249msr abstractC33249msr, Continuation<? super Unit> continuation) {
                    c33371mvG.EZpvd(abstractC33249msr);
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (stateFlowOLrzqt.collect(flowCollector, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        throw new KotlinNothingValueException();
    }
}
