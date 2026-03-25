package com.okinc.im.usecase;

import com.okinc.im.usecase.ObserveKeyboardInputStateUseCase;
import com.okinc.okimcore.model.im.OKConversation;
import com.okinc.okimcore.model.other.GroupInfo;
import com.okinc.okimcore.model.remote.RelationInfo;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;
import o.yHT;

/* JADX INFO: loaded from: classes8.dex */
public final class ObserveKeyboardInputStateUseCase$execute$1 extends SuspendLambda implements Function2<FlowCollector<? super ObserveKeyboardInputStateUseCase.KeyboardInputState>, Continuation<? super Unit>, Object> {
    final /* synthetic */ Flow<OKConversation> $conversationFlow;
    final /* synthetic */ String $conversationId;
    final /* synthetic */ Flow<GroupInfo> $groupInfoFlow;
    final /* synthetic */ Flow<RelationInfo> $relationInfoFlow;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ObserveKeyboardInputStateUseCase this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ObserveKeyboardInputStateUseCase$execute$1(String str, Flow<OKConversation> flow, Flow<RelationInfo> flow2, Flow<GroupInfo> flow3, ObserveKeyboardInputStateUseCase observeKeyboardInputStateUseCase, Continuation<? super ObserveKeyboardInputStateUseCase$execute$1> continuation) {
        super(2, continuation);
        this.$conversationId = str;
        this.$conversationFlow = flow;
        this.$relationInfoFlow = flow2;
        this.$groupInfoFlow = flow3;
        this.this$0 = observeKeyboardInputStateUseCase;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ObserveKeyboardInputStateUseCase$execute$1 observeKeyboardInputStateUseCase$execute$1 = new ObserveKeyboardInputStateUseCase$execute$1(this.$conversationId, this.$conversationFlow, this.$relationInfoFlow, this.$groupInfoFlow, this.this$0, continuation);
        observeKeyboardInputStateUseCase$execute$1.L$0 = obj;
        return observeKeyboardInputStateUseCase$execute$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(FlowCollector<? super ObserveKeyboardInputStateUseCase.KeyboardInputState> flowCollector, Continuation<? super Unit> continuation) {
        return ((ObserveKeyboardInputStateUseCase$execute$1) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        FlowCollector flowCollector;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            flowCollector = (FlowCollector) this.L$0;
            ObserveKeyboardInputStateUseCase.KeyboardInputState keyboardInputState = ObserveKeyboardInputStateUseCase.KeyboardInputState.AllowInput;
            this.L$0 = flowCollector;
            this.label = 1;
            if (flowCollector.emit(keyboardInputState, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            flowCollector = (FlowCollector) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        pUU.KWHzl("ObserveKeyboardInputStateUseCase", "[" + this.$conversationId + "] KeyboardState update:AllowInput");
        Flow flowCombine = FlowKt.combine(this.$conversationFlow, this.$relationInfoFlow, this.$groupInfoFlow, new AnonymousClass1(this.this$0, this.$conversationId, null));
        this.L$0 = null;
        this.label = 2;
        if (FlowKt.emitAll(flowCollector, flowCombine, this) == objCopydefault) {
            return objCopydefault;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.okinc.im.usecase.ObserveKeyboardInputStateUseCase$execute$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements yHT<OKConversation, RelationInfo, GroupInfo, Continuation<? super ObserveKeyboardInputStateUseCase.KeyboardInputState>, Object> {
        final /* synthetic */ String $conversationId;
        /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        /* synthetic */ Object L$2;
        int label;
        final /* synthetic */ ObserveKeyboardInputStateUseCase this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ObserveKeyboardInputStateUseCase observeKeyboardInputStateUseCase, String str, Continuation<? super AnonymousClass1> continuation) {
            super(4, continuation);
            this.this$0 = observeKeyboardInputStateUseCase;
            this.$conversationId = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // o.yHT
        public final Object invoke(OKConversation oKConversation, RelationInfo relationInfo, GroupInfo groupInfo, Continuation<? super ObserveKeyboardInputStateUseCase.KeyboardInputState> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$conversationId, continuation);
            anonymousClass1.L$0 = oKConversation;
            anonymousClass1.L$1 = relationInfo;
            anonymousClass1.L$2 = groupInfo;
            return anonymousClass1.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                ObserveKeyboardInputStateUseCase.KeyboardInputState keyboardInputStateEZpvd = this.this$0.EZpvd((OKConversation) this.L$0, (RelationInfo) this.L$1, (GroupInfo) this.L$2);
                pUU.KWHzl("ObserveKeyboardInputStateUseCase", "[" + this.$conversationId + "] KeyboardState update:" + keyboardInputStateEZpvd);
                return keyboardInputStateEZpvd;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
