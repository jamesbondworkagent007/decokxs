package com.okinc.im.imui.messageV2.manager;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.C36558odI;
import o.C36593odr;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC37705oyq;
import o.oEY;

/* JADX INFO: loaded from: classes8.dex */
public final class MessageListModelManager$reloadMessageListModelForNavigation$result$1 extends SuspendLambda implements Function2<InterfaceC37705oyq, Continuation<? super C36558odI>, Object> {
    final /* synthetic */ C36558odI $model;
    final /* synthetic */ long $navigateMessageId;
    int label;
    final /* synthetic */ C36593odr this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageListModelManager$reloadMessageListModelForNavigation$result$1(C36593odr c36593odr, C36558odI c36558odI, long j, Continuation<? super MessageListModelManager$reloadMessageListModelForNavigation$result$1> continuation) {
        super(2, continuation);
        this.this$0 = c36593odr;
        this.$model = c36558odI;
        this.$navigateMessageId = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MessageListModelManager$reloadMessageListModelForNavigation$result$1(this.this$0, this.$model, this.$navigateMessageId, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC37705oyq interfaceC37705oyq, Continuation<? super C36558odI> continuation) {
        return ((MessageListModelManager$reloadMessageListModelForNavigation$result$1) create(interfaceC37705oyq, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            oEY oey = this.this$0.fARcdN;
            C36558odI c36558odI = this.$model;
            long j = this.$navigateMessageId;
            this.label = 1;
            obj = oey.EZpvd(c36558odI, j, this);
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
