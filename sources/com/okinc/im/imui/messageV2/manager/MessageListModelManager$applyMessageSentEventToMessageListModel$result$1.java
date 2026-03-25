package com.okinc.im.imui.messageV2.manager;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.C36558odI;
import o.C36593odr;
import o.C44468sQy;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC37705oyq;
import o.oER;

/* JADX INFO: loaded from: classes8.dex */
public final class MessageListModelManager$applyMessageSentEventToMessageListModel$result$1 extends SuspendLambda implements Function2<InterfaceC37705oyq, Continuation<? super C36558odI>, Object> {
    final /* synthetic */ C44468sQy $event;
    final /* synthetic */ C36558odI $model;
    int label;
    final /* synthetic */ C36593odr this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageListModelManager$applyMessageSentEventToMessageListModel$result$1(C36593odr c36593odr, C36558odI c36558odI, C44468sQy c44468sQy, Continuation<? super MessageListModelManager$applyMessageSentEventToMessageListModel$result$1> continuation) {
        super(2, continuation);
        this.this$0 = c36593odr;
        this.$model = c36558odI;
        this.$event = c44468sQy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MessageListModelManager$applyMessageSentEventToMessageListModel$result$1(this.this$0, this.$model, this.$event, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC37705oyq interfaceC37705oyq, Continuation<? super C36558odI> continuation) {
        return ((MessageListModelManager$applyMessageSentEventToMessageListModel$result$1) create(interfaceC37705oyq, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            oER oer = this.this$0.djBIcL;
            C36558odI c36558odI = this.$model;
            oER.StateListAnimator.C0901StateListAnimator c0901StateListAnimator = new oER.StateListAnimator.C0901StateListAnimator(this.$event);
            this.label = 1;
            obj = oer.copydefault(c36558odI, c0901StateListAnimator, this);
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
