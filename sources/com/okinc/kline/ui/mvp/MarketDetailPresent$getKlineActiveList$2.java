package com.okinc.kline.ui.mvp;

import com.okinc.kline.news.data.KlineActiveListData;
import com.okinc.market.common.service.KlineBizMarketService;
import com.okinc.network.okg.response.ResponseData;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C39562pug;
import o.C43393roT;
import o.C56391yDq;
import o.C56442yFn;
import o.C56524yIo;
import o.pUU;

/* JADX INFO: loaded from: classes8.dex */
public final class MarketDetailPresent$getKlineActiveList$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super KlineActiveListData>, Object> {
    final /* synthetic */ String $bizType;
    final /* synthetic */ String $ccy;
    final /* synthetic */ String $instName;
    final /* synthetic */ String $locationCode;
    final /* synthetic */ Integer $pageNo;
    final /* synthetic */ Integer $pageSize;
    int label;
    final /* synthetic */ C39562pug this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketDetailPresent$getKlineActiveList$2(String str, String str2, String str3, String str4, Integer num, Integer num2, C39562pug c39562pug, Continuation<? super MarketDetailPresent$getKlineActiveList$2> continuation) {
        super(2, continuation);
        this.$ccy = str;
        this.$locationCode = str2;
        this.$instName = str3;
        this.$bizType = str4;
        this.$pageNo = num;
        this.$pageSize = num2;
        this.this$0 = c39562pug;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MarketDetailPresent$getKlineActiveList$2(this.$ccy, this.$locationCode, this.$instName, this.$bizType, this.$pageNo, this.$pageSize, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super KlineActiveListData> continuation) {
        return ((MarketDetailPresent$getKlineActiveList$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                String str = this.$ccy;
                String str2 = this.$locationCode;
                String str3 = this.$instName;
                String str4 = this.$bizType;
                Integer num = this.$pageNo;
                Integer num2 = this.$pageSize;
                Result.Application application = Result.Companion;
                KlineBizMarketService klineBizMarketService = (KlineBizMarketService) C43393roT.httpService$default(C56524yIo.AEQbTJ(KlineBizMarketService.class), null, 1, null);
                this.label = 1;
                obj = klineBizMarketService.getKlineActiveList(str, str2, str3, str4, num, num2, this);
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
            objM7377constructorimpl = Result.m7377constructorimpl((responseData.getCode() != 0 || responseData.getData() == null) ? null : (KlineActiveListData) responseData.getData());
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        C39562pug c39562pug = this.this$0;
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.copydefault(c39562pug.OLrzqt, "getKlineActiveList: onError:" + thM7380exceptionOrNullimpl.getMessage());
        }
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            return null;
        }
        return objM7377constructorimpl;
    }
}
