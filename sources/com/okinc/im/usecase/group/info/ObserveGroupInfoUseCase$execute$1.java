package com.okinc.im.usecase.group.info;

import com.okinc.okimcore.model.other.GroupInfo;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import o.C56391yDq;
import o.C56442yFn;
import o.oDI;

/* JADX INFO: loaded from: classes8.dex */
public final class ObserveGroupInfoUseCase$execute$1 extends SuspendLambda implements Function2<FlowCollector<? super GroupInfo>, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $targetId;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ oDI this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ObserveGroupInfoUseCase$execute$1(String str, oDI odi, Continuation<? super ObserveGroupInfoUseCase$execute$1> continuation) {
        super(2, continuation);
        this.$targetId = str;
        this.this$0 = odi;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ObserveGroupInfoUseCase$execute$1 observeGroupInfoUseCase$execute$1 = new ObserveGroupInfoUseCase$execute$1(this.$targetId, this.this$0, continuation);
        observeGroupInfoUseCase$execute$1.L$0 = obj;
        return observeGroupInfoUseCase$execute$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(FlowCollector<? super GroupInfo> flowCollector, Continuation<? super Unit> continuation) {
        return ((ObserveGroupInfoUseCase$execute$1) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            String str = this.$targetId;
            if (str != null && !StringsKt__StringsKt.fARcdN((CharSequence) str)) {
                Flow<GroupInfo> flowOLrzqt = this.this$0.EZpvd.OLrzqt(this.$targetId);
                this.label = 2;
                if (FlowKt.emitAll(flowCollector, flowOLrzqt, this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                this.label = 1;
                if (flowCollector.emit(null, this) == objCopydefault) {
                    return objCopydefault;
                }
            }
        } else {
            if (i != 1 && i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }
}
