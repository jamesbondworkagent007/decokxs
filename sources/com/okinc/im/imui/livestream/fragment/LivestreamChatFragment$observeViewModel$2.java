package com.okinc.im.imui.livestream.fragment;

import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC36555odF;
import o.C36536ocn;
import o.C55326xho;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;
import o.yHO;

/* JADX INFO: loaded from: classes16.dex */
public final class LivestreamChatFragment$observeViewModel$2 extends SuspendLambda implements yHO<CoroutineScope, AbstractC36555odF, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C36536ocn this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LivestreamChatFragment$observeViewModel$2(C36536ocn c36536ocn, Continuation<? super LivestreamChatFragment$observeViewModel$2> continuation) {
        super(3, continuation);
        this.this$0 = c36536ocn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.yHO
    public final Object invoke(CoroutineScope coroutineScope, AbstractC36555odF abstractC36555odF, Continuation<? super Unit> continuation) {
        LivestreamChatFragment$observeViewModel$2 livestreamChatFragment$observeViewModel$2 = new LivestreamChatFragment$observeViewModel$2(this.this$0, continuation);
        livestreamChatFragment$observeViewModel$2.L$0 = abstractC36555odF;
        return livestreamChatFragment$observeViewModel$2.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            AbstractC36555odF abstractC36555odF = (AbstractC36555odF) this.L$0;
            if (abstractC36555odF instanceof AbstractC36555odF.StateListAnimator) {
                pUU.EZpvd(this.this$0.getTAG(), "Conversation initialized successfully");
            } else {
                if (!(abstractC36555odF instanceof AbstractC36555odF.TaskDescription)) {
                    throw new NoWhenBranchMatchedException();
                }
                AbstractC36555odF.TaskDescription taskDescription = (AbstractC36555odF.TaskDescription) abstractC36555odF;
                pUU.copydefault(this.this$0.getTAG(), "Failed to initialize conversation: " + taskDescription.EZpvd());
                C55326xho.toastWithFailedIcon$default(taskDescription.EZpvd(), 0, 1, (Object) null);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
