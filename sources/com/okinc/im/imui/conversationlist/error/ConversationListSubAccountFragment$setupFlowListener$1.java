package com.okinc.im.imui.conversationlist.error;

import androidx.fragment.app.Fragment;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.C33802nGj;
import o.C56391yDq;
import o.C56442yFn;
import o.nGF;
import o.pUU;
import o.rVN;

/* JADX INFO: loaded from: classes16.dex */
public final class ConversationListSubAccountFragment$setupFlowListener$1 extends SuspendLambda implements Function2<List<? extends nGF>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C33802nGj this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConversationListSubAccountFragment$setupFlowListener$1(C33802nGj c33802nGj, Continuation<? super ConversationListSubAccountFragment$setupFlowListener$1> continuation) {
        super(2, continuation);
        this.this$0 = c33802nGj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ConversationListSubAccountFragment$setupFlowListener$1 conversationListSubAccountFragment$setupFlowListener$1 = new ConversationListSubAccountFragment$setupFlowListener$1(this.this$0, continuation);
        conversationListSubAccountFragment$setupFlowListener$1.L$0 = obj;
        return conversationListSubAccountFragment$setupFlowListener$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(List<? extends nGF> list, Continuation<? super Unit> continuation) {
        return ((ConversationListSubAccountFragment$setupFlowListener$1) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            List<? extends Object> list = (List) this.L$0;
            pUU.EZpvd("ConversationListSubAccountFragment", "notification list: " + list);
            this.this$0.OLrzqt.AEQbTJ(list);
            rVN.reportFullyDrawn$default((Fragment) this.this$0, true, (String) null, 2, (Object) null);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
