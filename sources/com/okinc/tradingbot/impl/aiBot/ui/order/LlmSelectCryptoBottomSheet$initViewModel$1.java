package com.okinc.tradingbot.impl.aiBot.ui.order;

import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.C33064mpR;
import o.C56391yDq;
import o.C56442yFn;
import o.uFI;

/* JADX INFO: loaded from: classes16.dex */
public final class LlmSelectCryptoBottomSheet$initViewModel$1 extends SuspendLambda implements Function2<List<? extends Object>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ uFI this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LlmSelectCryptoBottomSheet$initViewModel$1(uFI ufi, Continuation<? super LlmSelectCryptoBottomSheet$initViewModel$1> continuation) {
        super(2, continuation);
        this.this$0 = ufi;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        LlmSelectCryptoBottomSheet$initViewModel$1 llmSelectCryptoBottomSheet$initViewModel$1 = new LlmSelectCryptoBottomSheet$initViewModel$1(this.this$0, continuation);
        llmSelectCryptoBottomSheet$initViewModel$1.L$0 = obj;
        return llmSelectCryptoBottomSheet$initViewModel$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(List<? extends Object> list, Continuation<? super Unit> continuation) {
        return ((LlmSelectCryptoBottomSheet$initViewModel$1) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            C33064mpR.OLrzqt(this.this$0.isConnected(), (List<? extends Object>) this.L$0);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
