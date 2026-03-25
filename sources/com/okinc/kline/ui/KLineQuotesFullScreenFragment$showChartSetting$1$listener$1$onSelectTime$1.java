package com.okinc.kline.ui;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.ViewOnClickListenerC38659pdc;
import o.oYA;

/* JADX INFO: loaded from: classes8.dex */
public final class KLineQuotesFullScreenFragment$showChartSetting$1$listener$1$onSelectTime$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ long $selectTime;
    int label;
    final /* synthetic */ ViewOnClickListenerC38659pdc this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KLineQuotesFullScreenFragment$showChartSetting$1$listener$1$onSelectTime$1(ViewOnClickListenerC38659pdc viewOnClickListenerC38659pdc, long j, Continuation<? super KLineQuotesFullScreenFragment$showChartSetting$1$listener$1$onSelectTime$1> continuation) {
        super(2, continuation);
        this.this$0 = viewOnClickListenerC38659pdc;
        this.$selectTime = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KLineQuotesFullScreenFragment$showChartSetting$1$listener$1$onSelectTime$1(this.this$0, this.$selectTime, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((KLineQuotesFullScreenFragment$showChartSetting$1$listener$1$onSelectTime$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            ViewOnClickListenerC38659pdc viewOnClickListenerC38659pdc = this.this$0;
            this.label = 1;
            obj = viewOnClickListenerC38659pdc.KWHzl(this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        oYA.dealWithFastKlineTime$default(this.this$0, this.$selectTime, ((Number) obj).longValue(), null, null, false, 28, null);
        return Unit.INSTANCE;
    }
}
