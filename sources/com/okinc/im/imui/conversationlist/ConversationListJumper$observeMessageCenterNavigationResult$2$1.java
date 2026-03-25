package com.okinc.im.imui.conversationlist;

import com.okinc.okcomponents.feature.oknotificationcenter.api.business.notificationmessage.model.MessageCenterNavigation;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;
import o.sDN;

/* JADX INFO: loaded from: classes23.dex */
public final class ConversationListJumper$observeMessageCenterNavigationResult$2$1 extends SuspendLambda implements Function2<FlowCollector<? super MessageCenterNavigation>, Continuation<? super Unit>, Object> {
    final /* synthetic */ Flow<MessageCenterNavigation> $sourceFlow;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlinx.coroutines.flow.Flow<? extends com.okinc.okcomponents.feature.oknotificationcenter.api.business.notificationmessage.model.MessageCenterNavigation> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ConversationListJumper$observeMessageCenterNavigationResult$2$1(Flow<? extends MessageCenterNavigation> flow, Continuation<? super ConversationListJumper$observeMessageCenterNavigationResult$2$1> continuation) {
        super(2, continuation);
        this.$sourceFlow = flow;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ConversationListJumper$observeMessageCenterNavigationResult$2$1 conversationListJumper$observeMessageCenterNavigationResult$2$1 = new ConversationListJumper$observeMessageCenterNavigationResult$2$1(this.$sourceFlow, continuation);
        conversationListJumper$observeMessageCenterNavigationResult$2$1.L$0 = obj;
        return conversationListJumper$observeMessageCenterNavigationResult$2$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(FlowCollector<? super MessageCenterNavigation> flowCollector, Continuation<? super Unit> continuation) {
        return ((ConversationListJumper$observeMessageCenterNavigationResult$2$1) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x008d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009a A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        FlowCollector flowCollector;
        Flow<MessageCenterNavigation> flow;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            flowCollector = (FlowCollector) this.L$0;
            CoroutineDispatcher coroutineDispatcherCopydefault = sDN.copydefault.copydefault();
            ConversationListJumper$observeMessageCenterNavigationResult$2$1$cachedResult$1 conversationListJumper$observeMessageCenterNavigationResult$2$1$cachedResult$1 = new ConversationListJumper$observeMessageCenterNavigationResult$2$1$cachedResult$1(null);
            this.L$0 = flowCollector;
            this.label = 1;
            obj = BuildersKt.withContext(coroutineDispatcherCopydefault, conversationListJumper$observeMessageCenterNavigationResult$2$1$cachedResult$1, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    flowCollector = (FlowCollector) this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    this.L$0 = flowCollector;
                    this.label = 3;
                    if (DelayKt.delay(300L, this) == objCopydefault) {
                        return objCopydefault;
                    }
                    flow = this.$sourceFlow;
                    this.L$0 = null;
                    this.label = 4;
                    if (FlowKt.emitAll(flowCollector, flow, this) == objCopydefault) {
                    }
                    return Unit.INSTANCE;
                }
                if (i != 3) {
                    if (i != 4 && i != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    return Unit.INSTANCE;
                }
                flowCollector = (FlowCollector) this.L$0;
                C56391yDq.AEQbTJ(obj);
                flow = this.$sourceFlow;
                this.L$0 = null;
                this.label = 4;
                if (FlowKt.emitAll(flowCollector, flow, this) == objCopydefault) {
                    return objCopydefault;
                }
                return Unit.INSTANCE;
            }
            flowCollector = (FlowCollector) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        MessageCenterNavigation messageCenterNavigation = (MessageCenterNavigation) obj;
        if (messageCenterNavigation != null) {
            pUU.KWHzl("ConversationListJumper", "observeMessageCenterNavigationResult: using cached result as first emit=" + messageCenterNavigation);
            this.L$0 = flowCollector;
            this.label = 2;
            if (flowCollector.emit(messageCenterNavigation, this) == objCopydefault) {
                return objCopydefault;
            }
            this.L$0 = flowCollector;
            this.label = 3;
            if (DelayKt.delay(300L, this) == objCopydefault) {
            }
            flow = this.$sourceFlow;
            this.L$0 = null;
            this.label = 4;
            if (FlowKt.emitAll(flowCollector, flow, this) == objCopydefault) {
            }
            return Unit.INSTANCE;
        }
        pUU.KWHzl("ConversationListJumper", "observeMessageCenterNavigationResult: cache is empty, emitting directly from source flow");
        Flow<MessageCenterNavigation> flow2 = this.$sourceFlow;
        this.L$0 = null;
        this.label = 5;
        if (FlowKt.emitAll(flowCollector, flow2, this) == objCopydefault) {
            return objCopydefault;
        }
        return Unit.INSTANCE;
    }
}
