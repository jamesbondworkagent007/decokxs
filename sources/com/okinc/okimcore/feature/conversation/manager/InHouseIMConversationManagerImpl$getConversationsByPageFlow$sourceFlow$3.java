package com.okinc.okimcore.feature.conversation.manager;

import com.okinc.okimcore.model.room.inhouseim.InHouseIMConversationListData;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.flow.FlowCollector;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;
import o.yHO;

/* JADX INFO: loaded from: classes10.dex */
public final class InHouseIMConversationManagerImpl$getConversationsByPageFlow$sourceFlow$3 extends SuspendLambda implements yHO<FlowCollector<? super List<? extends InHouseIMConversationListData>>, Throwable, Continuation<? super Unit>, Object> {
    final /* synthetic */ Ref.LongRef $startTime;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InHouseIMConversationManagerImpl$getConversationsByPageFlow$sourceFlow$3(Ref.LongRef longRef, Continuation<? super InHouseIMConversationManagerImpl$getConversationsByPageFlow$sourceFlow$3> continuation) {
        super(3, continuation);
        this.$startTime = longRef;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
    @Override // o.yHO
    public /* bridge */ /* synthetic */ Object invoke(FlowCollector<? super List<? extends InHouseIMConversationListData>> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
        return invoke2((FlowCollector<? super List<InHouseIMConversationListData>>) flowCollector, th, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(FlowCollector<? super List<InHouseIMConversationListData>> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
        return new InHouseIMConversationManagerImpl$getConversationsByPageFlow$sourceFlow$3(this.$startTime, continuation).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            pUU.KWHzl("InHouseIMConversationManagerImpl", "getConversationsByPageFlow completes, execution time: " + (System.currentTimeMillis() - this.$startTime.element) + " ms");
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
