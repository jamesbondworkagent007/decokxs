package com.okinc.okimcore.usecase;

import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.room.inhouseim.InHouseIMMessageEntity;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C44502sSe;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes10.dex */
public final class MessagesUseCase$submitMessage$1$3$sendFailedResult$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super C44502sSe.StateListAnimator.TaskDescription>, Object> {
    final /* synthetic */ Throwable $error;
    final /* synthetic */ OKMessage $okMessage;
    final /* synthetic */ C44502sSe.StateListAnimator.C0942StateListAnimator $sendingResult;
    int label;
    final /* synthetic */ C44502sSe this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessagesUseCase$submitMessage$1$3$sendFailedResult$1(C44502sSe c44502sSe, C44502sSe.StateListAnimator.C0942StateListAnimator c0942StateListAnimator, Throwable th, OKMessage oKMessage, Continuation<? super MessagesUseCase$submitMessage$1$3$sendFailedResult$1> continuation) {
        super(2, continuation);
        this.this$0 = c44502sSe;
        this.$sendingResult = c0942StateListAnimator;
        this.$error = th;
        this.$okMessage = oKMessage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MessagesUseCase$submitMessage$1$3$sendFailedResult$1(this.this$0, this.$sendingResult, this.$error, this.$okMessage, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super C44502sSe.StateListAnimator.TaskDescription> continuation) {
        return ((MessagesUseCase$submitMessage$1$3$sendFailedResult$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C44502sSe c44502sSe = this.this$0;
            InHouseIMMessageEntity inHouseIMMessageEntityOLrzqt = this.$sendingResult.OLrzqt();
            Throwable th = this.$error;
            OKMessage oKMessage = this.$okMessage;
            this.label = 1;
            obj = c44502sSe.EZpvd(inHouseIMMessageEntityOLrzqt, th, oKMessage, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return obj;
    }
}
