package com.okinc.kline.ui.view.model;

import com.okinc.kline.news.data.KlineActiveListData;
import com.okinc.market.common.service.KlineBizMarketService;
import com.okinc.network.okg.response.ResponseData;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C43393roT;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.C56524yIo;
import o.pAN;
import o.pUU;

/* JADX INFO: loaded from: classes9.dex */
public final class KlineReferralViewModel$requestCampaign$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super KlineActiveListData>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ pAN this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KlineReferralViewModel$requestCampaign$2(pAN pan, Continuation<? super KlineReferralViewModel$requestCampaign$2> continuation) {
        super(2, continuation);
        this.this$0 = pan;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KlineReferralViewModel$requestCampaign$2(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super KlineActiveListData> continuation) {
        return ((KlineReferralViewModel$requestCampaign$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        pAN pan;
        KlineActiveListData klineActiveListData;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                pAN pan2 = this.this$0;
                Result.Application application = Result.Companion;
                KlineBizMarketService klineBizMarketService = (KlineBizMarketService) C43393roT.httpService$default(C56524yIo.AEQbTJ(KlineBizMarketService.class), null, 1, null);
                String strCopydefault = pan2.copydefault();
                String strEZpvd = pan2.EZpvd();
                String strKWHzl = pan2.KWHzl();
                Integer numAEQbTJ = C56443yFo.AEQbTJ(20);
                this.L$0 = pan2;
                this.label = 1;
                Object klineActiveList$default = KlineBizMarketService.StateListAnimator.getKlineActiveList$default(klineBizMarketService, strCopydefault, "over_view", strEZpvd, strKWHzl, null, numAEQbTJ, this, 16, null);
                if (klineActiveList$default == objCopydefault) {
                    return objCopydefault;
                }
                pan = pan2;
                obj = klineActiveList$default;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pan = (pAN) this.L$0;
                C56391yDq.AEQbTJ(obj);
            }
            ResponseData responseData = (ResponseData) obj;
            if (responseData.getCode() != 0 || responseData.getData() == null) {
                klineActiveListData = null;
            } else {
                pan.EZpvd((KlineActiveListData) responseData.getData());
                klineActiveListData = (KlineActiveListData) responseData.getData();
            }
            objM7377constructorimpl = Result.m7377constructorimpl(klineActiveListData);
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        pAN pan3 = this.this$0;
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.copydefault(pan3.copydefault, "getKlineActiveList: onError:" + thM7380exceptionOrNullimpl.getMessage());
        }
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            return null;
        }
        return objM7377constructorimpl;
    }
}
