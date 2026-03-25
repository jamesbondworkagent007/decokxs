package com.okinc.tradingbot.impl.aiBot.ui.order;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.C33069mpW;
import o.C48033uCm;
import o.C52794wYp;
import o.C56390yDp;
import o.C56391yDq;
import o.C56423yEv;
import o.C56442yFn;
import o.uFI;

/* JADX INFO: loaded from: classes16.dex */
public final class LlmSelectCryptoBottomSheet$initViewModel$2 extends SuspendLambda implements Function2<Integer, Continuation<? super Unit>, Object> {
    /* synthetic */ int I$0;
    int label;
    final /* synthetic */ uFI this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LlmSelectCryptoBottomSheet$initViewModel$2(uFI ufi, Continuation<? super LlmSelectCryptoBottomSheet$initViewModel$2> continuation) {
        super(2, continuation);
        this.this$0 = ufi;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        LlmSelectCryptoBottomSheet$initViewModel$2 llmSelectCryptoBottomSheet$initViewModel$2 = new LlmSelectCryptoBottomSheet$initViewModel$2(this.this$0, continuation);
        llmSelectCryptoBottomSheet$initViewModel$2.I$0 = ((Number) obj).intValue();
        return llmSelectCryptoBottomSheet$initViewModel$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Object invoke(int i, Continuation<? super Unit> continuation) {
        return ((LlmSelectCryptoBottomSheet$initViewModel$2) create(Integer.valueOf(i), continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* synthetic */ Object invoke(Integer num, Continuation<? super Unit> continuation) {
        return invoke(num.intValue(), continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            int i = this.I$0;
            C52794wYp c52794wYp = this.this$0.AhwBna;
            if (c52794wYp != null) {
                c52794wYp.setText(C33069mpW.copydefault(C48033uCm.Fragment.dPnHjp, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", this.this$0.EZpvd(i)))));
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
