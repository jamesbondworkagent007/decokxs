package com.okinc.business.market.features.analysis.spot.sub.cumulative_pnl.ui.viewmodel;

import com.okinc.market.common.bean.PayloadPeriod;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes6.dex */
public final class SpotAnalysisCumulativePnlViewModel$requestCumulativePnlWithDebounce$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ long $delayMs;
    final /* synthetic */ PayloadPeriod $payloadPeriod;
    final /* synthetic */ String $uid;
    int label;
    final /* synthetic */ SpotAnalysisCumulativePnlViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpotAnalysisCumulativePnlViewModel$requestCumulativePnlWithDebounce$1(long j, SpotAnalysisCumulativePnlViewModel spotAnalysisCumulativePnlViewModel, String str, PayloadPeriod payloadPeriod, Continuation<? super SpotAnalysisCumulativePnlViewModel$requestCumulativePnlWithDebounce$1> continuation) {
        super(2, continuation);
        this.$delayMs = j;
        this.this$0 = spotAnalysisCumulativePnlViewModel;
        this.$uid = str;
        this.$payloadPeriod = payloadPeriod;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SpotAnalysisCumulativePnlViewModel$requestCumulativePnlWithDebounce$1(this.$delayMs, this.this$0, this.$uid, this.$payloadPeriod, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SpotAnalysisCumulativePnlViewModel$requestCumulativePnlWithDebounce$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            long j = this.$delayMs;
            this.label = 1;
            if (DelayKt.delay(j, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        SpotAnalysisCumulativePnlViewModel spotAnalysisCumulativePnlViewModel = this.this$0;
        String str = this.$uid;
        PayloadPeriod payloadPeriod = this.$payloadPeriod;
        this.label = 2;
        if (spotAnalysisCumulativePnlViewModel.EZpvd(str, payloadPeriod, this) == objCopydefault) {
            return objCopydefault;
        }
        return Unit.INSTANCE;
    }
}
