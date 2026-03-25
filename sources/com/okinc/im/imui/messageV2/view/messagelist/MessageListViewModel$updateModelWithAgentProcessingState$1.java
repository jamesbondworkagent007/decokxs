package com.okinc.im.imui.messageV2.view.messagelist;

import com.okinc.im.imui.messageV2.view.messagelist.MessageListViewModel;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import o.C36558odI;
import o.C36593odr;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.pUU;

/* JADX INFO: loaded from: classes8.dex */
public final class MessageListViewModel$updateModelWithAgentProcessingState$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $isProcessing;
    Object L$0;
    boolean Z$0;
    int label;
    final /* synthetic */ MessageListViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageListViewModel$updateModelWithAgentProcessingState$1(MessageListViewModel messageListViewModel, boolean z, Continuation<? super MessageListViewModel$updateModelWithAgentProcessingState$1> continuation) {
        super(1, continuation);
        this.this$0 = messageListViewModel;
        this.$isProcessing = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new MessageListViewModel$updateModelWithAgentProcessingState$1(this.this$0, this.$isProcessing, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super Unit> continuation) {
        return ((MessageListViewModel$updateModelWithAgentProcessingState$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        MessageListViewModel messageListViewModel;
        boolean z;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (Throwable th) {
            Result.Application application = Result.Companion;
            Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            MessageListViewModel.ActionBar actionBar = this.this$0.AkhnZx;
            if (actionBar != null) {
                MessageListViewModel messageListViewModel2 = this.this$0;
                boolean z2 = this.$isProcessing;
                Result.Application application2 = Result.Companion;
                pUU.EZpvd("MessageListViewModel", "updateModelWithAgentProcessingState - isProcessing: " + z2);
                C36593odr c36593odr = messageListViewModel2.QVAiDq;
                C36558odI c36558odIKWHzl = actionBar.KWHzl();
                this.L$0 = messageListViewModel2;
                this.Z$0 = z2;
                this.label = 1;
                obj = c36593odr.copydefault(c36558odIKWHzl, z2, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
                messageListViewModel = messageListViewModel2;
                z = z2;
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            Result.m7377constructorimpl(Unit.INSTANCE);
            return Unit.INSTANCE;
        }
        z = this.Z$0;
        messageListViewModel = (MessageListViewModel) this.L$0;
        C56391yDq.AEQbTJ(obj);
        MessageListViewModel.ActionBar actionBar2 = new MessageListViewModel.ActionBar((C36558odI) obj, z ? C56443yFo.AEQbTJ(6) : null);
        this.L$0 = null;
        this.label = 2;
        if (messageListViewModel.EZpvd(actionBar2, (Continuation<? super Unit>) this) == objCopydefault) {
            return objCopydefault;
        }
        Result.m7377constructorimpl(Unit.INSTANCE);
        return Unit.INSTANCE;
    }
}
