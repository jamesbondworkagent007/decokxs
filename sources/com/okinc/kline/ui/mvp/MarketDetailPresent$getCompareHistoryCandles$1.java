package com.okinc.kline.ui.mvp;

import com.okinc.kline.api.bean.MarketCoinInfo;
import com.okinc.kline.data.CompareCandlesItem;
import com.okinc.kline.data.CompareCandlesReq;
import com.okinc.market.common.service.KlineBizMarketService;
import com.okinc.network.okg.response.ResponseData;
import java.util.ArrayList;
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
public final class MarketDetailPresent$getCompareHistoryCandles$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ArrayList<MarketCoinInfo> $coinInfoList;
    final /* synthetic */ List<CompareCandlesReq> $req;
    int label;
    final /* synthetic */ C39562pug this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketDetailPresent$getCompareHistoryCandles$1(List<CompareCandlesReq> list, C39562pug c39562pug, ArrayList<MarketCoinInfo> arrayList, Continuation<? super MarketDetailPresent$getCompareHistoryCandles$1> continuation) {
        super(2, continuation);
        this.$req = list;
        this.this$0 = c39562pug;
        this.$coinInfoList = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MarketDetailPresent$getCompareHistoryCandles$1(this.$req, this.this$0, this.$coinInfoList, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MarketDetailPresent$getCompareHistoryCandles$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                KlineBizMarketService klineBizMarketService = (KlineBizMarketService) C43393roT.httpService$default(C56524yIo.AEQbTJ(KlineBizMarketService.class), null, 1, null);
                List<CompareCandlesReq> list = this.$req;
                this.label = 1;
                obj = klineBizMarketService.getCompareHistoryCandles(list, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            ResponseData responseData = (ResponseData) obj;
            if (responseData.getCode() == 0 && responseData.getData() != null) {
                this.this$0.copydefault((ResponseData<ArrayList<CompareCandlesItem>>) responseData, (ArrayList<MarketCoinInfo>) this.$coinInfoList);
            } else {
                C36246oUr.copydefault().isConnected(false);
                pUU.KWHzl(this.this$0.OLrzqt, "getCompareHistoryCandles: onError:" + responseData.getMsg());
            }
        } catch (Exception e) {
            C36246oUr.copydefault().isConnected(false);
            pUU.KWHzl(this.this$0.OLrzqt, "getCompareHistoryCandles: onError:" + e.getMessage());
        }
        return Unit.INSTANCE;
    }
}
