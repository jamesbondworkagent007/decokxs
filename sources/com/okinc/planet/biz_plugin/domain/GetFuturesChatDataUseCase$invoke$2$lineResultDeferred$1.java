package com.okinc.planet.biz_plugin.domain;

import com.okinc.planet.biz_plugin.ChartTimeframeConfig;
import com.okinc.tradeshare.api.TradeKLineBar;
import com.okinc.tradeshare.api.TradeTickerChartEntry;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC49513upv;

/* JADX INFO: loaded from: classes19.dex */
public final class GetFuturesChatDataUseCase$invoke$2$lineResultDeferred$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends List<? extends TradeTickerChartEntry>>>, Object> {
    final /* synthetic */ ChartTimeframeConfig $chartTimeframeConfig;
    final /* synthetic */ String $instId;
    final /* synthetic */ String $instType;
    final /* synthetic */ InterfaceC49513upv $tradeShareService;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetFuturesChatDataUseCase$invoke$2$lineResultDeferred$1(InterfaceC49513upv interfaceC49513upv, String str, String str2, ChartTimeframeConfig chartTimeframeConfig, Continuation<? super GetFuturesChatDataUseCase$invoke$2$lineResultDeferred$1> continuation) {
        super(2, continuation);
        this.$tradeShareService = interfaceC49513upv;
        this.$instId = str;
        this.$instType = str2;
        this.$chartTimeframeConfig = chartTimeframeConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GetFuturesChatDataUseCase$invoke$2$lineResultDeferred$1(this.$tradeShareService, this.$instId, this.$instType, this.$chartTimeframeConfig, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends List<? extends TradeTickerChartEntry>>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Result<? extends List<TradeTickerChartEntry>>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Result<? extends List<TradeTickerChartEntry>>> continuation) {
        return ((GetFuturesChatDataUseCase$invoke$2$lineResultDeferred$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objEZpvd;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC49513upv interfaceC49513upv = this.$tradeShareService;
            String str = this.$instId;
            String str2 = this.$instType;
            int approximateDataPoints = this.$chartTimeframeConfig.getApproximateDataPoints();
            TradeKLineBar intervalMinutes = this.$chartTimeframeConfig.getIntervalMinutes();
            this.label = 1;
            objEZpvd = interfaceC49513upv.EZpvd(str, str2, approximateDataPoints, intervalMinutes, this);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objEZpvd = ((Result) obj).m7386unboximpl();
        }
        return Result.m7376boximpl(objEZpvd);
    }
}
