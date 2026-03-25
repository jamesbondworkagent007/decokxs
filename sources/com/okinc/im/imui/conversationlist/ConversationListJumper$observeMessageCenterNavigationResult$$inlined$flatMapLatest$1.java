package com.okinc.im.imui.conversationlist;

import com.okinc.okcomponents.feature.oknotificationcenter.api.business.notificationmessage.model.MessageCenterNavigation;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import o.C33791nFz;
import o.C56391yDq;
import o.C56442yFn;
import o.sDN;
import o.sDZ;
import o.yHO;

/* JADX INFO: loaded from: classes8.dex */
public final class ConversationListJumper$observeMessageCenterNavigationResult$$inlined$flatMapLatest$1 extends SuspendLambda implements yHO<FlowCollector<? super MessageCenterNavigation>, Unit, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $allowRedirectToNotificationCenter$inlined;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConversationListJumper$observeMessageCenterNavigationResult$$inlined$flatMapLatest$1(Continuation continuation, boolean z) {
        super(3, continuation);
        this.$allowRedirectToNotificationCenter$inlined = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.yHO
    public final Object invoke(FlowCollector<? super MessageCenterNavigation> flowCollector, Unit unit, Continuation<? super Unit> continuation) {
        ConversationListJumper$observeMessageCenterNavigationResult$$inlined$flatMapLatest$1 conversationListJumper$observeMessageCenterNavigationResult$$inlined$flatMapLatest$1 = new ConversationListJumper$observeMessageCenterNavigationResult$$inlined$flatMapLatest$1(continuation, this.$allowRedirectToNotificationCenter$inlined);
        conversationListJumper$observeMessageCenterNavigationResult$$inlined$flatMapLatest$1.L$0 = flowCollector;
        conversationListJumper$observeMessageCenterNavigationResult$$inlined$flatMapLatest$1.L$1 = unit;
        return conversationListJumper$observeMessageCenterNavigationResult$$inlined$flatMapLatest$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            C33791nFz.TaskDescription taskDescription = new C33791nFz.TaskDescription(FlowKt.onEach(FlowKt.distinctUntilChanged(new C33791nFz.Application(FlowKt.onEach(sDZ.AEQbTJ.AYXKKw().AEQbTJ(), new ConversationListJumper$observeMessageCenterNavigationResult$2$sourceFlow$1(null)))), new ConversationListJumper$observeMessageCenterNavigationResult$2$sourceFlow$3(null)), this.$allowRedirectToNotificationCenter$inlined);
            sDN sdn = sDN.copydefault;
            Flow flowFlowOn = FlowKt.flowOn(FlowKt.flow(new ConversationListJumper$observeMessageCenterNavigationResult$2$1(FlowKt.flowOn(taskDescription, sdn.copydefault()), null)), sdn.copydefault());
            this.label = 1;
            if (FlowKt.emitAll(flowCollector, flowFlowOn, this) == objCopydefault) {
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
