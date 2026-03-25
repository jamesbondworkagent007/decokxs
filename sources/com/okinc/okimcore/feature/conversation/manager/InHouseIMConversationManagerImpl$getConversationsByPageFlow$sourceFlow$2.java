package com.okinc.okimcore.feature.conversation.manager;

import com.okinc.okimcore.model.room.inhouseim.InHouseIMConversationListData;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: loaded from: classes10.dex */
public final class InHouseIMConversationManagerImpl$getConversationsByPageFlow$sourceFlow$2 extends SuspendLambda implements Function2<List<? extends InHouseIMConversationListData>, Continuation<? super Unit>, Object> {
    final /* synthetic */ Ref.LongRef $startTime;
    /* synthetic */ Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InHouseIMConversationManagerImpl$getConversationsByPageFlow$sourceFlow$2(Ref.LongRef longRef, Continuation<? super InHouseIMConversationManagerImpl$getConversationsByPageFlow$sourceFlow$2> continuation) {
        super(2, continuation);
        this.$startTime = longRef;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        InHouseIMConversationManagerImpl$getConversationsByPageFlow$sourceFlow$2 inHouseIMConversationManagerImpl$getConversationsByPageFlow$sourceFlow$2 = new InHouseIMConversationManagerImpl$getConversationsByPageFlow$sourceFlow$2(this.$startTime, continuation);
        inHouseIMConversationManagerImpl$getConversationsByPageFlow$sourceFlow$2.L$0 = obj;
        return inHouseIMConversationManagerImpl$getConversationsByPageFlow$sourceFlow$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(List<? extends InHouseIMConversationListData> list, Continuation<? super Unit> continuation) {
        return invoke2((List<InHouseIMConversationListData>) list, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(List<InHouseIMConversationListData> list, Continuation<? super Unit> continuation) {
        return ((InHouseIMConversationManagerImpl$getConversationsByPageFlow$sourceFlow$2) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            List list = (List) this.L$0;
            long jCurrentTimeMillis = System.currentTimeMillis();
            pUU.KWHzl("InHouseIMConversationManagerImpl", "getConversationsByPageFlow update, size: " + list.size() + ", execution time: " + (jCurrentTimeMillis - this.$startTime.element) + " ms");
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
