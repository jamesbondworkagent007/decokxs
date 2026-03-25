package com.okinc.kline.ui.mvp;

import com.okinc.kline.api.bean.MarketCoinInfo;
import com.okinc.market.common.service.KlineBizMarketService;
import com.okinc.network.okg.response.ResponseData;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C36246oUr;
import o.C39562pug;
import o.C43393roT;
import o.C56391yDq;
import o.C56442yFn;
import o.C56524yIo;
import o.pUU;

/* JADX INFO: loaded from: classes8.dex */
public final class MarketDetailPresent$getHistoryFormulaCandles$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $after;
    final /* synthetic */ String $bar;
    final /* synthetic */ String $calcExpression;
    final /* synthetic */ String $instIdArray;
    final /* synthetic */ String $limit;
    final /* synthetic */ MarketCoinInfo $marketCoinInfo;
    int label;
    final /* synthetic */ C39562pug this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketDetailPresent$getHistoryFormulaCandles$1$1(String str, String str2, String str3, String str4, String str5, C39562pug c39562pug, MarketCoinInfo marketCoinInfo, Continuation<? super MarketDetailPresent$getHistoryFormulaCandles$1$1> continuation) {
        super(2, continuation);
        this.$calcExpression = str;
        this.$instIdArray = str2;
        this.$bar = str3;
        this.$after = str4;
        this.$limit = str5;
        this.this$0 = c39562pug;
        this.$marketCoinInfo = marketCoinInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MarketDetailPresent$getHistoryFormulaCandles$1$1(this.$calcExpression, this.$instIdArray, this.$bar, this.$after, this.$limit, this.this$0, this.$marketCoinInfo, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MarketDetailPresent$getHistoryFormulaCandles$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                KlineBizMarketService klineBizMarketService = (KlineBizMarketService) C43393roT.httpService$default(C56524yIo.AEQbTJ(KlineBizMarketService.class), null, 1, null);
                String str = this.$calcExpression;
                String str2 = this.$instIdArray;
                String str3 = this.$bar;
                String str4 = this.$after;
                String str5 = this.$limit;
                this.label = 1;
                obj = klineBizMarketService.getHistoryFormulaCandles(str, str2, str3, null, str4, str5, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            this.this$0.OLrzqt((ResponseData<List<List<String>>>) obj, this.$marketCoinInfo.getInstrumentType());
        } catch (Exception e) {
            C36246oUr.copydefault().isConnected(false);
            pUU.KWHzl(this.this$0.OLrzqt, "getHistoryFormulaCandles: onError:" + e.getMessage());
        }
        return Unit.INSTANCE;
    }
}
