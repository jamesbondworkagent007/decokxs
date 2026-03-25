package com.okinc.tradingbot.impl.aiBot.ui.order;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.C48468uSn;
import o.C56033xvF;
import o.C56391yDq;
import o.C56442yFn;
import o.uEG;

/* JADX INFO: loaded from: classes11.dex */
public final class LlmInvestBottomSheet$initViewModel$2 extends SuspendLambda implements Function2<String, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ uEG this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LlmInvestBottomSheet$initViewModel$2(uEG ueg, Continuation<? super LlmInvestBottomSheet$initViewModel$2> continuation) {
        super(2, continuation);
        this.this$0 = ueg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        LlmInvestBottomSheet$initViewModel$2 llmInvestBottomSheet$initViewModel$2 = new LlmInvestBottomSheet$initViewModel$2(this.this$0, continuation);
        llmInvestBottomSheet$initViewModel$2.L$0 = obj;
        return llmInvestBottomSheet$initViewModel$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(String str, Continuation<? super Unit> continuation) {
        return ((LlmInvestBottomSheet$initViewModel$2) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            String strFmtBotValueBySymbol$default = C56033xvF.fmtBotValueBySymbol$default(this.this$0.AkhnZx().AEQbTJ().getValue().KWHzl(), (String) this.L$0, null, true, null, false, null, null, null, null, null, 2036, null);
            C48468uSn c48468uSn = this.this$0.isConnected;
            if (c48468uSn != null) {
                uEG ueg = this.this$0;
                c48468uSn.EZpvd.setFooterAvaValue(strFmtBotValueBySymbol$default);
                ueg.EZpvd(c48468uSn);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
