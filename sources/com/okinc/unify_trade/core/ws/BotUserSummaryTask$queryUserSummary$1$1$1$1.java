package com.okinc.unify_trade.core.ws;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.BotUserSummaryReq;
import com.okinc.unify_trade.biz.StrategyUserSummaryData;
import com.okinc.unify_trade.biz.subscribe.ExchangeRateResponse;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import o.C54326xEg;
import o.C55942xtU;
import o.C56390yDp;
import o.C56391yDq;
import o.C56442yFn;
import o.xAF;

/* JADX INFO: loaded from: classes12.dex */
public final class BotUserSummaryTask$queryUserSummary$1$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Deferred<ExchangeRateResponse> $data;
    final /* synthetic */ ResponseData<List<StrategyUserSummaryData>> $it;
    int label;
    final /* synthetic */ C54326xEg this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BotUserSummaryTask$queryUserSummary$1$1$1$1(ResponseData<List<StrategyUserSummaryData>> responseData, Deferred<ExchangeRateResponse> deferred, C54326xEg c54326xEg, Continuation<? super BotUserSummaryTask$queryUserSummary$1$1$1$1> continuation) {
        super(2, continuation);
        this.$it = responseData;
        this.$data = deferred;
        this.this$0 = c54326xEg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BotUserSummaryTask$queryUserSummary$1$1$1$1(this.$it, this.$data, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BotUserSummaryTask$queryUserSummary$1$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0088  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        ExchangeRateResponse exchangeRateResponse;
        BotUserSummaryReq botUserSummaryReqEZpvd;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            ResponseData<List<StrategyUserSummaryData>> responseData = this.$it;
            if (responseData.getCode() != 0 || responseData.getData() == null) {
                xAF xaf = this.this$0.AYXKKw;
                if (xaf != null) {
                    xaf.copydefault(this.$it.getMsg());
                }
            } else {
                Deferred<ExchangeRateResponse> deferred = this.$data;
                this.label = 1;
                obj = deferred.await(this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
                exchangeRateResponse = (ExchangeRateResponse) obj;
                if (exchangeRateResponse == null) {
                }
            }
        } else if (i == 1) {
            C56391yDq.AEQbTJ(obj);
            exchangeRateResponse = (ExchangeRateResponse) obj;
            if (exchangeRateResponse == null) {
                this.this$0.djBIcL().AEQbTJ(exchangeRateResponse.getSourceCcyToThisRate());
                xAF xaf2 = this.this$0.AYXKKw;
                if (xaf2 != null) {
                    C55942xtU c55942xtUDjBIcL = this.this$0.djBIcL();
                    List<StrategyUserSummaryData> data = this.$it.getData();
                    Intrinsics.copydefault(data);
                    xaf2.KWHzl(c55942xtUDjBIcL.KWHzl2(C56390yDp.OLrzqt(data, exchangeRateResponse)));
                }
                xAF xaf3 = this.this$0.AYXKKw;
                if (xaf3 != null && (botUserSummaryReqEZpvd = xaf3.EZpvd()) != null && botUserSummaryReqEZpvd.isNeedWs()) {
                    this.this$0.gEmmrt();
                }
            } else {
                C54326xEg c54326xEg = this.this$0;
                List<StrategyUserSummaryData> data2 = this.$it.getData();
                Intrinsics.copydefault(data2);
                this.label = 2;
                if (c54326xEg.KWHzl(data2, this) == objCopydefault) {
                    return objCopydefault;
                }
            }
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }
}
