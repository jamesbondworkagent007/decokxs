package com.okinc.kline.util;

import com.okinc.kline.library.data.ChartViewOutSideConfig;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C37883pEf;
import o.C56391yDq;
import o.C56442yFn;
import o.oUN;

/* JADX INFO: loaded from: classes9.dex */
public final class KlineConfigHandle$initKlineConfig$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ChartViewOutSideConfig $config;
    int label;
    final /* synthetic */ C37883pEf this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KlineConfigHandle$initKlineConfig$2(C37883pEf c37883pEf, ChartViewOutSideConfig chartViewOutSideConfig, Continuation<? super KlineConfigHandle$initKlineConfig$2> continuation) {
        super(2, continuation);
        this.this$0 = c37883pEf;
        this.$config = chartViewOutSideConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KlineConfigHandle$initKlineConfig$2(this.this$0, this.$config, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((KlineConfigHandle$initKlineConfig$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            oUN ounKWHzl = this.this$0.KWHzl();
            ChartViewOutSideConfig chartViewOutSideConfig = this.$config;
            this.label = 1;
            if (ounKWHzl.OLrzqt(chartViewOutSideConfig, this) == objCopydefault) {
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
