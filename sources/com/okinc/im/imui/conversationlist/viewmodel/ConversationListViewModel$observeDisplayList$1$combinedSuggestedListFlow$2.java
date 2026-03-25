package com.okinc.im.imui.conversationlist.viewmodel;

import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;
import o.C56391yDq;
import o.C56442yFn;
import o.yDY;

/* JADX INFO: loaded from: classes18.dex */
public final class ConversationListViewModel$observeDisplayList$1$combinedSuggestedListFlow$2 extends SuspendLambda implements Function2<FlowCollector<? super List<? extends Object>>, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ConversationListViewModel$observeDisplayList$1$combinedSuggestedListFlow$2(Continuation<? super ConversationListViewModel$observeDisplayList$1$combinedSuggestedListFlow$2> continuation) {
        super(2, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ConversationListViewModel$observeDisplayList$1$combinedSuggestedListFlow$2 conversationListViewModel$observeDisplayList$1$combinedSuggestedListFlow$2 = new ConversationListViewModel$observeDisplayList$1$combinedSuggestedListFlow$2(continuation);
        conversationListViewModel$observeDisplayList$1$combinedSuggestedListFlow$2.L$0 = obj;
        return conversationListViewModel$observeDisplayList$1$combinedSuggestedListFlow$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(FlowCollector<? super List<? extends Object>> flowCollector, Continuation<? super Unit> continuation) {
        return ((ConversationListViewModel$observeDisplayList$1$combinedSuggestedListFlow$2) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            List listAhwBna = yDY.AhwBna();
            this.label = 1;
            if (flowCollector.emit(listAhwBna, this) == objCopydefault) {
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
