package com.okinc.im.imui.conversationlist;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: loaded from: classes8.dex */
public final class ConversationListJumper$observeMessageCenterNavigationResult$2$sourceFlow$1 extends SuspendLambda implements Function2<Integer, Continuation<? super Unit>, Object> {
    /* synthetic */ int I$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ConversationListJumper$observeMessageCenterNavigationResult$2$sourceFlow$1(Continuation<? super ConversationListJumper$observeMessageCenterNavigationResult$2$sourceFlow$1> continuation) {
        super(2, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ConversationListJumper$observeMessageCenterNavigationResult$2$sourceFlow$1 conversationListJumper$observeMessageCenterNavigationResult$2$sourceFlow$1 = new ConversationListJumper$observeMessageCenterNavigationResult$2$sourceFlow$1(continuation);
        conversationListJumper$observeMessageCenterNavigationResult$2$sourceFlow$1.I$0 = ((Number) obj).intValue();
        return conversationListJumper$observeMessageCenterNavigationResult$2$sourceFlow$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Object invoke(int i, Continuation<? super Unit> continuation) {
        return ((ConversationListJumper$observeMessageCenterNavigationResult$2$sourceFlow$1) create(Integer.valueOf(i), continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* synthetic */ Object invoke(Integer num, Continuation<? super Unit> continuation) {
        return invoke(num.intValue(), continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            pUU.EZpvd("ConversationListJumper", "observeMessageCenterNavigationResult: conversation count=" + this.I$0);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
