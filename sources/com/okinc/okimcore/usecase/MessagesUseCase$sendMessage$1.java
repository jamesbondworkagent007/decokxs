package com.okinc.okimcore.usecase;

import com.okinc.okimcore.model.im.OKMessage;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import o.C44502sSe;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes10.dex */
public final class MessagesUseCase$sendMessage$1 extends SuspendLambda implements Function2<C44502sSe.StateListAnimator.C0942StateListAnimator, Continuation<? super Flow<? extends C44502sSe.StateListAnimator>>, Object> {
    final /* synthetic */ OKMessage $message;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C44502sSe this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessagesUseCase$sendMessage$1(C44502sSe c44502sSe, OKMessage oKMessage, Continuation<? super MessagesUseCase$sendMessage$1> continuation) {
        super(2, continuation);
        this.this$0 = c44502sSe;
        this.$message = oKMessage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MessagesUseCase$sendMessage$1 messagesUseCase$sendMessage$1 = new MessagesUseCase$sendMessage$1(this.this$0, this.$message, continuation);
        messagesUseCase$sendMessage$1.L$0 = obj;
        return messagesUseCase$sendMessage$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C44502sSe.StateListAnimator.C0942StateListAnimator c0942StateListAnimator, Continuation<? super Flow<? extends C44502sSe.StateListAnimator>> continuation) {
        return ((MessagesUseCase$sendMessage$1) create(c0942StateListAnimator, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.okimcore.usecase.MessagesUseCase$sendMessage$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<FlowCollector<? super C44502sSe.StateListAnimator>, Continuation<? super Unit>, Object> {
        final /* synthetic */ C44502sSe.StateListAnimator.C0942StateListAnimator $it;
        final /* synthetic */ OKMessage $message;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ C44502sSe this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C44502sSe.StateListAnimator.C0942StateListAnimator c0942StateListAnimator, C44502sSe c44502sSe, OKMessage oKMessage, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$it = c0942StateListAnimator;
            this.this$0 = c44502sSe;
            this.$message = oKMessage;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$it, this.this$0, this.$message, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FlowCollector<? super C44502sSe.StateListAnimator> flowCollector, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            FlowCollector flowCollector;
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                flowCollector = (FlowCollector) this.L$0;
                C44502sSe.StateListAnimator.C0942StateListAnimator c0942StateListAnimator = this.$it;
                this.L$0 = flowCollector;
                this.label = 1;
                if (flowCollector.emit(c0942StateListAnimator, this) == objCopydefault) {
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
            Flow<C44502sSe.StateListAnimator> flowOLrzqt = this.this$0.OLrzqt(this.$it, this.$message);
            this.L$0 = null;
            this.label = 2;
            if (FlowKt.emitAll(flowCollector, flowOLrzqt, this) == objCopydefault) {
                return objCopydefault;
            }
            return Unit.INSTANCE;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            return FlowKt.flow(new AnonymousClass1((C44502sSe.StateListAnimator.C0942StateListAnimator) this.L$0, this.this$0, this.$message, null));
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
