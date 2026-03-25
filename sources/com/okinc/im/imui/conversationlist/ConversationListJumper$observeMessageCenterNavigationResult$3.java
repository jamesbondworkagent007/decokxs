package com.okinc.im.imui.conversationlist;

import com.okinc.okcomponents.feature.oknotificationcenter.api.business.notificationmessage.model.MessageCenterNavigation;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: loaded from: classes8.dex */
public final class ConversationListJumper$observeMessageCenterNavigationResult$3 extends SuspendLambda implements Function2<MessageCenterNavigation, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $allowRedirectToNotificationCenter;
    /* synthetic */ Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConversationListJumper$observeMessageCenterNavigationResult$3(boolean z, Continuation<? super ConversationListJumper$observeMessageCenterNavigationResult$3> continuation) {
        super(2, continuation);
        this.$allowRedirectToNotificationCenter = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ConversationListJumper$observeMessageCenterNavigationResult$3 conversationListJumper$observeMessageCenterNavigationResult$3 = new ConversationListJumper$observeMessageCenterNavigationResult$3(this.$allowRedirectToNotificationCenter, continuation);
        conversationListJumper$observeMessageCenterNavigationResult$3.L$0 = obj;
        return conversationListJumper$observeMessageCenterNavigationResult$3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(MessageCenterNavigation messageCenterNavigation, Continuation<? super Unit> continuation) {
        return ((ConversationListJumper$observeMessageCenterNavigationResult$3) create(messageCenterNavigation, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            MessageCenterNavigation messageCenterNavigation = (MessageCenterNavigation) this.L$0;
            pUU.KWHzl("ConversationListJumper", "observeMessageCenterNavigationResult: allowRedirectToNotificationCenter=" + this.$allowRedirectToNotificationCenter + ", navigationResult=" + messageCenterNavigation);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
