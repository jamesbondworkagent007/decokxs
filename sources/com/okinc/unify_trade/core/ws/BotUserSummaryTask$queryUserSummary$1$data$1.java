package com.okinc.unify_trade.core.ws;

import com.okinc.unify_trade.biz.BotUserSummaryReq;
import com.okinc.unify_trade.biz.subscribe.ExchangeRateResponse;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C54326xEg;
import o.C56391yDq;
import o.C56442yFn;
import o.xAF;
import o.xMK;

/* JADX INFO: loaded from: classes12.dex */
public final class BotUserSummaryTask$queryUserSummary$1$data$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ExchangeRateResponse>, Object> {
    int label;
    final /* synthetic */ C54326xEg this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BotUserSummaryTask$queryUserSummary$1$data$1(C54326xEg c54326xEg, Continuation<? super BotUserSummaryTask$queryUserSummary$1$data$1> continuation) {
        super(2, continuation);
        this.this$0 = c54326xEg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BotUserSummaryTask$queryUserSummary$1$data$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ExchangeRateResponse> continuation) {
        return ((BotUserSummaryTask$queryUserSummary$1$data$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        String preferUnit;
        BotUserSummaryReq botUserSummaryReqEZpvd;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            xMK xmk = xMK.EZpvd;
            xAF xaf = this.this$0.AYXKKw;
            if (xaf == null || (botUserSummaryReqEZpvd = xaf.EZpvd()) == null || (preferUnit = botUserSummaryReqEZpvd.getPreferUnit()) == null) {
                preferUnit = "USDT";
            }
            this.label = 1;
            obj = xmk.AEQbTJ("USDT", preferUnit, this);
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
