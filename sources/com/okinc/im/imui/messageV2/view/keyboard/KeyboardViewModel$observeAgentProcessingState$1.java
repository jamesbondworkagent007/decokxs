package com.okinc.im.imui.messageV2.view.keyboard;

import com.okinc.okimcore.model.im.OKConversation;
import com.okinc.okimcore.model.room.inhouseim.GroupTagType;
import com.okinc.okimcore.usecase.ObserveShowAgentProcessingFlow;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes18.dex */
public final class KeyboardViewModel$observeAgentProcessingState$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $channelId;
    int label;
    final /* synthetic */ KeyboardViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KeyboardViewModel$observeAgentProcessingState$1(String str, KeyboardViewModel keyboardViewModel, Continuation<? super KeyboardViewModel$observeAgentProcessingState$1> continuation) {
        super(2, continuation);
        this.$channelId = str;
        this.this$0 = keyboardViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KeyboardViewModel$observeAgentProcessingState$1(this.$channelId, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((KeyboardViewModel$observeAgentProcessingState$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            String str = this.$channelId;
            if (str == null || StringsKt__StringsKt.fARcdN((CharSequence) str)) {
                this.this$0.AhwBna.setValue(ObserveShowAgentProcessingFlow.AgentProcessingState.IDLE);
            } else {
                Flow<OKConversation> flowKWHzl = this.this$0.zuBGHE.KWHzl(this.$channelId);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$channelId, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowKWHzl, anonymousClass1, this) == objCopydefault) {
                    return objCopydefault;
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.okinc.im.imui.messageV2.view.keyboard.KeyboardViewModel$observeAgentProcessingState$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<OKConversation, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $channelId;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ KeyboardViewModel this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(KeyboardViewModel keyboardViewModel, String str, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = keyboardViewModel;
            this.$channelId = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$channelId, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(OKConversation oKConversation, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(oKConversation, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                OKConversation oKConversation = (OKConversation) this.L$0;
                if ((oKConversation != null ? oKConversation.getGroupType() : null) != GroupTagType.OTC_AGENT) {
                    this.this$0.AhwBna.setValue(ObserveShowAgentProcessingFlow.AgentProcessingState.IDLE);
                } else {
                    Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(this.this$0.sSMYrx.AEQbTJ(this.$channelId));
                    C04561 c04561 = new C04561(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowDistinctUntilChanged, c04561, this) == objCopydefault) {
                        return objCopydefault;
                    }
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: com.okinc.im.imui.messageV2.view.keyboard.KeyboardViewModel$observeAgentProcessingState$1$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C04561 extends SuspendLambda implements Function2<ObserveShowAgentProcessingFlow.AgentProcessingState, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ KeyboardViewModel this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C04561(KeyboardViewModel keyboardViewModel, Continuation<? super C04561> continuation) {
                super(2, continuation);
                this.this$0 = keyboardViewModel;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C04561 c04561 = new C04561(this.this$0, continuation);
                c04561.L$0 = obj;
                return c04561;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(ObserveShowAgentProcessingFlow.AgentProcessingState agentProcessingState, Continuation<? super Unit> continuation) {
                return ((C04561) create(agentProcessingState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                C56442yFn.copydefault();
                if (this.label == 0) {
                    C56391yDq.AEQbTJ(obj);
                    this.this$0.AhwBna.setValue((ObserveShowAgentProcessingFlow.AgentProcessingState) this.L$0);
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }
}
