package com.okinc.im.imui.conversationlist;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.C33791nFz;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.pUU;

/* JADX INFO: loaded from: classes8.dex */
public final class ConversationListJumper$observeMessageCenterNavigationResult$2$sourceFlow$3 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
    /* synthetic */ boolean Z$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ConversationListJumper$observeMessageCenterNavigationResult$2$sourceFlow$3(Continuation<? super ConversationListJumper$observeMessageCenterNavigationResult$2$sourceFlow$3> continuation) {
        super(2, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ConversationListJumper$observeMessageCenterNavigationResult$2$sourceFlow$3 conversationListJumper$observeMessageCenterNavigationResult$2$sourceFlow$3 = new ConversationListJumper$observeMessageCenterNavigationResult$2$sourceFlow$3(continuation);
        conversationListJumper$observeMessageCenterNavigationResult$2$sourceFlow$3.Z$0 = ((Boolean) obj).booleanValue();
        return conversationListJumper$observeMessageCenterNavigationResult$2$sourceFlow$3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
        return invoke(bool.booleanValue(), continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
        return ((ConversationListJumper$observeMessageCenterNavigationResult$2$sourceFlow$3) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            boolean z = this.Z$0;
            C33791nFz.AEQbTJ.set(C56443yFo.KWHzl(z));
            pUU.EZpvd("ConversationListJumper", "observeMessageCenterNavigationResult: updated cached hasConversations=" + z);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
