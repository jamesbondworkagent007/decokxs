package com.okinc.im.usecase.relationlist;

import com.okinc.okimcore.model.remote.RelationInfo;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;
import o.C35874oGx;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC44177sGd;

/* JADX INFO: loaded from: classes23.dex */
public final class ObserveIMRelationListUseCase$execute$1 extends SuspendLambda implements Function2<FlowCollector<? super List<? extends RelationInfo>>, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C35874oGx this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ObserveIMRelationListUseCase$execute$1(C35874oGx c35874oGx, Continuation<? super ObserveIMRelationListUseCase$execute$1> continuation) {
        super(2, continuation);
        this.this$0 = c35874oGx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ObserveIMRelationListUseCase$execute$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(FlowCollector<? super List<? extends RelationInfo>> flowCollector, Continuation<? super Unit> continuation) {
        return invoke2((FlowCollector<? super List<RelationInfo>>) flowCollector, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(FlowCollector<? super List<RelationInfo>> flowCollector, Continuation<? super Unit> continuation) {
        return ((ObserveIMRelationListUseCase$execute$1) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC44177sGd interfaceC44177sGd = this.this$0.AEQbTJ;
            this.label = 1;
            if (interfaceC44177sGd.EZpvd(this) == objCopydefault) {
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
