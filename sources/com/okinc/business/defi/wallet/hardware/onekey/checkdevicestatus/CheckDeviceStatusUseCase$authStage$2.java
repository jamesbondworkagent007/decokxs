package com.okinc.business.defi.wallet.hardware.onekey.checkdevicestatus;

import com.okinc.wallet.hardware.api.onekey.OneKeyAuthStage;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes5.dex */
public final class CheckDeviceStatusUseCase$authStage$2 extends SuspendLambda implements Function2<FlowCollector<? super OneKeyAuthStage>, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CheckDeviceStatusUseCase$authStage$2(Continuation<? super CheckDeviceStatusUseCase$authStage$2> continuation) {
        super(2, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CheckDeviceStatusUseCase$authStage$2 checkDeviceStatusUseCase$authStage$2 = new CheckDeviceStatusUseCase$authStage$2(continuation);
        checkDeviceStatusUseCase$authStage$2.L$0 = obj;
        return checkDeviceStatusUseCase$authStage$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(FlowCollector<? super OneKeyAuthStage> flowCollector, Continuation<? super Unit> continuation) {
        return ((CheckDeviceStatusUseCase$authStage$2) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            OneKeyAuthStage oneKeyAuthStage = OneKeyAuthStage.CLOSE_WINDOW;
            this.label = 1;
            if (flowCollector.emit(oneKeyAuthStage, this) == objCopydefault) {
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
