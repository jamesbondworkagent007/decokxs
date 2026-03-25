package com.okinc.okimcore.feature.conversation.manager;

import com.okinc.okimcore.model.room.inhouseim.InHouseIMConversationListData;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.flow.FlowCollector;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes10.dex */
public final class InHouseIMConversationManagerImpl$getConversationsByPageFlow$sourceFlow$1 extends SuspendLambda implements Function2<FlowCollector<? super List<? extends InHouseIMConversationListData>>, Continuation<? super Unit>, Object> {
    final /* synthetic */ Ref.LongRef $startTime;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InHouseIMConversationManagerImpl$getConversationsByPageFlow$sourceFlow$1(Ref.LongRef longRef, Continuation<? super InHouseIMConversationManagerImpl$getConversationsByPageFlow$sourceFlow$1> continuation) {
        super(2, continuation);
        this.$startTime = longRef;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InHouseIMConversationManagerImpl$getConversationsByPageFlow$sourceFlow$1(this.$startTime, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(FlowCollector<? super List<? extends InHouseIMConversationListData>> flowCollector, Continuation<? super Unit> continuation) {
        return invoke2((FlowCollector<? super List<InHouseIMConversationListData>>) flowCollector, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(FlowCollector<? super List<InHouseIMConversationListData>> flowCollector, Continuation<? super Unit> continuation) {
        return ((InHouseIMConversationManagerImpl$getConversationsByPageFlow$sourceFlow$1) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            this.$startTime.element = System.currentTimeMillis();
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
