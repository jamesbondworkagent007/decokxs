package com.okinc.tradingbot.impl.planet.ui;

import androidx.compose.runtime.ProduceStateScope;
import com.okinc.tradingbot.impl.share.ShareChartDataPoint;
import com.okinc.unify_trade.biz.StrategyProfitResponse;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import o.C33129mqd;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.yDY;

/* JADX INFO: loaded from: classes11.dex */
public final class BotChartViewComposeKt$BotChartView$pnlChartData$1$1 extends SuspendLambda implements Function2<ProduceStateScope<List<? extends ShareChartDataPoint>>, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<StrategyProfitResponse> $chartData;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BotChartViewComposeKt$BotChartView$pnlChartData$1$1(List<StrategyProfitResponse> list, Continuation<? super BotChartViewComposeKt$BotChartView$pnlChartData$1$1> continuation) {
        super(2, continuation);
        this.$chartData = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        BotChartViewComposeKt$BotChartView$pnlChartData$1$1 botChartViewComposeKt$BotChartView$pnlChartData$1$1 = new BotChartViewComposeKt$BotChartView$pnlChartData$1$1(this.$chartData, continuation);
        botChartViewComposeKt$BotChartView$pnlChartData$1$1.L$0 = obj;
        return botChartViewComposeKt$BotChartView$pnlChartData$1$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(ProduceStateScope<List<ShareChartDataPoint>> produceStateScope, Continuation<? super Unit> continuation) {
        return ((BotChartViewComposeKt$BotChartView$pnlChartData$1$1) create(produceStateScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(ProduceStateScope<List<? extends ShareChartDataPoint>> produceStateScope, Continuation<? super Unit> continuation) {
        return invoke2((ProduceStateScope<List<ShareChartDataPoint>>) produceStateScope, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        ProduceStateScope produceStateScope;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            ProduceStateScope produceStateScope2 = (ProduceStateScope) this.L$0;
            if (this.$chartData.isEmpty()) {
                produceStateScope2.setValue(yDY.AhwBna());
                return Unit.INSTANCE;
            }
            CoroutineDispatcher coroutineDispatcher = Dispatchers.getDefault();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$chartData, null);
            this.L$0 = produceStateScope2;
            this.label = 1;
            Object objWithContext = BuildersKt.withContext(coroutineDispatcher, anonymousClass1, this);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
            produceStateScope = produceStateScope2;
            obj = objWithContext;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            produceStateScope = (ProduceStateScope) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        produceStateScope.setValue(obj);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.okinc.tradingbot.impl.planet.ui.BotChartViewComposeKt$BotChartView$pnlChartData$1$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends ShareChartDataPoint>>, Object> {
        final /* synthetic */ List<StrategyProfitResponse> $chartData;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(List<StrategyProfitResponse> list, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$chartData = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$chartData, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends ShareChartDataPoint>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super List<ShareChartDataPoint>>) continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super List<ShareChartDataPoint>> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            float fDjBIcL;
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                StrategyProfitResponse strategyProfitResponse = (StrategyProfitResponse) CollectionsKt___CollectionsKt.firstOrNull(this.$chartData);
                String sourceCcy = strategyProfitResponse != null ? strategyProfitResponse.getSourceCcy() : null;
                if (sourceCcy == null) {
                    sourceCcy = "";
                }
                boolean zFARcdN = StringsKt__StringsKt.fARcdN((CharSequence) sourceCcy);
                List<StrategyProfitResponse> list = this.$chartData;
                ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
                for (StrategyProfitResponse strategyProfitResponse2 : list) {
                    long jValueOf = C33129mqd.valueOf(strategyProfitResponse2.getCTime());
                    if (!zFARcdN) {
                        fDjBIcL = C33129mqd.djBIcL(strategyProfitResponse2.getTotalPnlInSourceCcy());
                    } else {
                        fDjBIcL = C33129mqd.djBIcL(strategyProfitResponse2.getTotalPnl());
                    }
                    arrayList.add(new ShareChartDataPoint(fDjBIcL, jValueOf, null, 4, null));
                }
                return arrayList;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
