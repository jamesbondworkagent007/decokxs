package com.okinc.im.usecase.pageconfig;

import com.okinc.im.config.page.IMPageType;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.oFT;

/* JADX INFO: loaded from: classes8.dex */
public final class ObserveVoiceRecordingEnabledUseCase$invoke$1 extends SuspendLambda implements Function2<FlowCollector<? super Boolean>, Continuation<? super Unit>, Object> {
    final /* synthetic */ IMPageType $pageType;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ oFT this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ObserveVoiceRecordingEnabledUseCase$invoke$1(oFT oft, IMPageType iMPageType, Continuation<? super ObserveVoiceRecordingEnabledUseCase$invoke$1> continuation) {
        super(2, continuation);
        this.this$0 = oft;
        this.$pageType = iMPageType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ObserveVoiceRecordingEnabledUseCase$invoke$1 observeVoiceRecordingEnabledUseCase$invoke$1 = new ObserveVoiceRecordingEnabledUseCase$invoke$1(this.this$0, this.$pageType, continuation);
        observeVoiceRecordingEnabledUseCase$invoke$1.L$0 = obj;
        return observeVoiceRecordingEnabledUseCase$invoke$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(FlowCollector<? super Boolean> flowCollector, Continuation<? super Unit> continuation) {
        return ((ObserveVoiceRecordingEnabledUseCase$invoke$1) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            Boolean boolKWHzl = C56443yFo.KWHzl(this.this$0.AEQbTJ.KWHzl(this.$pageType).copydefault());
            this.label = 1;
            if (flowCollector.emit(boolKWHzl, this) == objCopydefault) {
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
