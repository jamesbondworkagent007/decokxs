package com.okinc.okex.lite.onboarding.repository;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.okex.lite.onboarding.bean.TradingModeRecommendationBean;
import com.okinc.okex.lite.onboarding.net.OnBoardingNetworkService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C45786sxe;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes24.dex */
public final class OnBoardingDataRepositoryImpl$getTradingModeRecommendation$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ResponseData<TradingModeRecommendationBean>>, Object> {
    final /* synthetic */ C45786sxe $this_runOrErrorResponse;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnBoardingDataRepositoryImpl$getTradingModeRecommendation$2$1(C45786sxe c45786sxe, Continuation<? super OnBoardingDataRepositoryImpl$getTradingModeRecommendation$2$1> continuation) {
        super(2, continuation);
        this.$this_runOrErrorResponse = c45786sxe;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OnBoardingDataRepositoryImpl$getTradingModeRecommendation$2$1(this.$this_runOrErrorResponse, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ResponseData<TradingModeRecommendationBean>> continuation) {
        return ((OnBoardingDataRepositoryImpl$getTradingModeRecommendation$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            OnBoardingNetworkService onBoardingNetworkService = this.$this_runOrErrorResponse.EZpvd;
            this.label = 1;
            obj = onBoardingNetworkService.getTradingModeRecommendation(this);
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
