package com.okinc.im.imui.messageV2.view.messagelist;

import java.io.IOException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C35254nrp;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: loaded from: classes16.dex */
public final class MessageListFragment$initMessageList$3$1$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $emoji;
    final /* synthetic */ C35254nrp $item;
    int label;
    final /* synthetic */ MessageListFragment this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageListFragment$initMessageList$3$1$2$1(MessageListFragment messageListFragment, String str, C35254nrp c35254nrp, Continuation<? super MessageListFragment$initMessageList$3$1$2$1> continuation) {
        super(2, continuation);
        this.this$0 = messageListFragment;
        this.$emoji = str;
        this.$item = c35254nrp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MessageListFragment$initMessageList$3$1$2$1(this.this$0, this.$emoji, this.$item, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MessageListFragment$initMessageList$3$1$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            try {
                this.this$0.AEQbTJ(this.$emoji, this.$item.OLrzqt().getTargetId(), this.$item.OLrzqt().getSeq(), this.$item.OLrzqt().getReactionDisplay());
            } catch (IOException e) {
                pUU.AEQbTJ(this.this$0.getTAG(), "Network error during emoji reaction", e);
            } catch (IllegalArgumentException e2) {
                pUU.AEQbTJ(this.this$0.getTAG(), "Invalid parameters for emoji reaction", e2);
            } catch (IllegalStateException e3) {
                pUU.AEQbTJ(this.this$0.getTAG(), "Activity is not in a valid state for emoji reaction", e3);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
