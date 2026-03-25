package com.okinc.im.imui.broadcastmessages.main;

import com.okinc.okimcore.model.im.OKMessage;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import o.AbstractC35761oCs;
import o.C56391yDq;
import o.C56402yEa;
import o.C56442yFn;

/* JADX INFO: loaded from: classes23.dex */
public final class BroadcastMessagesMainFragmentViewModel$resendMessage$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ OKMessage $message;
    int label;
    final /* synthetic */ BroadcastMessagesMainFragmentViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BroadcastMessagesMainFragmentViewModel$resendMessage$1(BroadcastMessagesMainFragmentViewModel broadcastMessagesMainFragmentViewModel, OKMessage oKMessage, Continuation<? super BroadcastMessagesMainFragmentViewModel$resendMessage$1> continuation) {
        super(2, continuation);
        this.this$0 = broadcastMessagesMainFragmentViewModel;
        this.$message = oKMessage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BroadcastMessagesMainFragmentViewModel$resendMessage$1(this.this$0, this.$message, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BroadcastMessagesMainFragmentViewModel$resendMessage$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            BroadcastMessagesMainFragmentViewModel broadcastMessagesMainFragmentViewModel = this.this$0;
            Flow flowOnEach = FlowKt.onEach(broadcastMessagesMainFragmentViewModel.fetchVPNInfo.copydefault(this.$message), new AnonymousClass1(this.this$0, null));
            this.label = 1;
            obj = broadcastMessagesMainFragmentViewModel.AEQbTJ((Flow<?>) flowOnEach, (Continuation<? super Flow<? extends Object>>) this);
            if (obj == objCopydefault) {
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
            C56391yDq.AEQbTJ(obj);
        }
        this.label = 2;
        if (FlowKt.collect((Flow) obj, this) == objCopydefault) {
            return objCopydefault;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.okinc.im.imui.broadcastmessages.main.BroadcastMessagesMainFragmentViewModel$resendMessage$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<AbstractC35761oCs, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ BroadcastMessagesMainFragmentViewModel this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(BroadcastMessagesMainFragmentViewModel broadcastMessagesMainFragmentViewModel, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = broadcastMessagesMainFragmentViewModel;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AbstractC35761oCs abstractC35761oCs, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(abstractC35761oCs, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                AbstractC35761oCs abstractC35761oCs = (AbstractC35761oCs) this.L$0;
                BroadcastMessagesMainFragmentViewModel broadcastMessagesMainFragmentViewModel = this.this$0;
                List listOLrzqt = broadcastMessagesMainFragmentViewModel.OLrzqt((List<? extends AbstractC35761oCs>) broadcastMessagesMainFragmentViewModel.copydefault((List<? extends AbstractC35761oCs>) broadcastMessagesMainFragmentViewModel.AEQbTJ((List<? extends AbstractC35761oCs>) C56402yEa.EZpvd(abstractC35761oCs), true), true), true);
                this.label = 1;
                if (broadcastMessagesMainFragmentViewModel.copydefault((List<? extends AbstractC35761oCs>) listOLrzqt, (Continuation<? super List<? extends AbstractC35761oCs>>) this) == objCopydefault) {
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
}
