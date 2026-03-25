package com.okinc.business.market.features.smart_money.signal.ui.overview;

import com.okinc.business.market.features.smart_money.signal.ui.overview.chart.TimeIntervalSelector;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C29508kuv;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes7.dex */
public final class SignalOverviewViewModel$onOverviewChartIntervalSelected$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $chainId;
    final /* synthetic */ TimeIntervalSelector $timeIntervalSelector;
    final /* synthetic */ String $tokenContractAddress;
    int label;
    final /* synthetic */ SignalOverviewViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignalOverviewViewModel$onOverviewChartIntervalSelected$1(SignalOverviewViewModel signalOverviewViewModel, String str, String str2, TimeIntervalSelector timeIntervalSelector, Continuation<? super SignalOverviewViewModel$onOverviewChartIntervalSelected$1> continuation) {
        super(2, continuation);
        this.this$0 = signalOverviewViewModel;
        this.$chainId = str;
        this.$tokenContractAddress = str2;
        this.$timeIntervalSelector = timeIntervalSelector;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SignalOverviewViewModel$onOverviewChartIntervalSelected$1(this.this$0, this.$chainId, this.$tokenContractAddress, this.$timeIntervalSelector, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SignalOverviewViewModel$onOverviewChartIntervalSelected$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C29508kuv c29508kuv = this.this$0.AhwBna;
            String str = this.$chainId;
            String str2 = this.$tokenContractAddress;
            TimeIntervalSelector timeIntervalSelector = this.$timeIntervalSelector;
            this.label = 1;
            if (c29508kuv.KWHzl(str, str2, timeIntervalSelector, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }
}
