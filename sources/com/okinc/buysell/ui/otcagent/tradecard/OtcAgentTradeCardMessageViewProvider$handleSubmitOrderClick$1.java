package com.okinc.buysell.ui.otcagent.tradecard;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C35254nrp;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes7.dex */
public final class OtcAgentTradeCardMessageViewProvider$handleSubmitOrderClick$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ OtcAgentTradeCardMessageData $cardData;
    final /* synthetic */ C35254nrp $message;
    int label;
    final /* synthetic */ OtcAgentTradeCardMessageViewProvider this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OtcAgentTradeCardMessageViewProvider$handleSubmitOrderClick$1(OtcAgentTradeCardMessageViewProvider otcAgentTradeCardMessageViewProvider, OtcAgentTradeCardMessageData otcAgentTradeCardMessageData, C35254nrp c35254nrp, Continuation<? super OtcAgentTradeCardMessageViewProvider$handleSubmitOrderClick$1> continuation) {
        super(2, continuation);
        this.this$0 = otcAgentTradeCardMessageViewProvider;
        this.$cardData = otcAgentTradeCardMessageData;
        this.$message = c35254nrp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OtcAgentTradeCardMessageViewProvider$handleSubmitOrderClick$1(this.this$0, this.$cardData, this.$message, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OtcAgentTradeCardMessageViewProvider$handleSubmitOrderClick$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            OtcAgentTradeCardMessageViewProvider otcAgentTradeCardMessageViewProvider = this.this$0;
            OtcAgentTradeCardMessageData otcAgentTradeCardMessageData = this.$cardData;
            this.label = 1;
            if (otcAgentTradeCardMessageViewProvider.OLrzqt(otcAgentTradeCardMessageData, (Continuation<? super Unit>) this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        this.this$0.AEQbTJ(this.$cardData, this.$message);
        return Unit.INSTANCE;
    }
}
