package com.okinc.find_ui.features.opportunity.overall.data.repo;

import com.okinc.find_ui.features.opportunity.overall.data.datasource.IMarketOverallDataSource;
import com.okinc.find_ui.features.opportunity.overall.data.model.MarketDataPo;
import com.okinc.network.okg.response.ResponseData;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C34938nlr;
import o.C34940nlt;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: loaded from: classes8.dex */
public final class MarketOverallRepository$getMarketData$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends MarketDataPo>>, Object> {
    final /* synthetic */ IMarketOverallDataSource.PayloadPeriod $period;
    final /* synthetic */ int $size;
    final /* synthetic */ String $type;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C34938nlr this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketOverallRepository$getMarketData$2(C34938nlr c34938nlr, String str, int i, IMarketOverallDataSource.PayloadPeriod payloadPeriod, Continuation<? super MarketOverallRepository$getMarketData$2> continuation) {
        super(2, continuation);
        this.this$0 = c34938nlr;
        this.$type = str;
        this.$size = i;
        this.$period = payloadPeriod;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MarketOverallRepository$getMarketData$2 marketOverallRepository$getMarketData$2 = new MarketOverallRepository$getMarketData$2(this.this$0, this.$type, this.$size, this.$period, continuation);
        marketOverallRepository$getMarketData$2.L$0 = obj;
        return marketOverallRepository$getMarketData$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends MarketDataPo>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super List<MarketDataPo>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super List<MarketDataPo>> continuation) {
        return ((MarketOverallRepository$getMarketData$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                C34938nlr c34938nlr = this.this$0;
                String str = this.$type;
                int i2 = this.$size;
                IMarketOverallDataSource.PayloadPeriod payloadPeriod = this.$period;
                Result.Application application = Result.Companion;
                C34940nlt c34940nlt = c34938nlr.AEQbTJ;
                this.label = 1;
                obj = c34940nlt.EZpvd(str, i2, payloadPeriod, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            objM7377constructorimpl = Result.m7377constructorimpl((List) ((ResponseData) obj).getData());
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.copydefault("MarketOverallRepository", "getMarketData failed: " + thM7380exceptionOrNullimpl);
        }
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            return null;
        }
        return objM7377constructorimpl;
    }
}
