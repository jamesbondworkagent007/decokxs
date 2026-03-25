package com.okinc.im.imui.messageV2.view.messagelist;

import com.okinc.okimcore.feature.config.TypingIndicatorConfig;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;
import o.C56391yDq;
import o.C56442yFn;
import o.yDY;

/* JADX INFO: loaded from: classes16.dex */
public final class MessageListFragment$startTypingTickerIfNeeded$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ MessageListFragment this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageListFragment$startTypingTickerIfNeeded$1(MessageListFragment messageListFragment, Continuation<? super MessageListFragment$startTypingTickerIfNeeded$1> continuation) {
        super(2, continuation);
        this.this$0 = messageListFragment;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MessageListFragment$startTypingTickerIfNeeded$1 messageListFragment$startTypingTickerIfNeeded$1 = new MessageListFragment$startTypingTickerIfNeeded$1(this.this$0, continuation);
        messageListFragment$startTypingTickerIfNeeded$1.L$0 = obj;
        return messageListFragment$startTypingTickerIfNeeded$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MessageListFragment$startTypingTickerIfNeeded$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineScope coroutineScope;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            coroutineScope = (CoroutineScope) this.L$0;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            coroutineScope = (CoroutineScope) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        while (CoroutineScopeKt.isActive(coroutineScope)) {
            TypingIndicatorConfig value = this.this$0.getNewProxyInstance().uzCIH().getValue();
            if (value == null) {
                this.this$0.ejfBZ();
                this.this$0.EZpvd((List<String>) yDY.AhwBna());
                return Unit.INSTANCE;
            }
            this.this$0.EZpvd(this.this$0.AYXKKw().AEQbTJ(System.currentTimeMillis(), value.getExpiryMs()));
            this.L$0 = coroutineScope;
            this.label = 1;
            if (DelayKt.delay(1000L, this) == objCopydefault) {
                return objCopydefault;
            }
        }
        return Unit.INSTANCE;
    }
}
