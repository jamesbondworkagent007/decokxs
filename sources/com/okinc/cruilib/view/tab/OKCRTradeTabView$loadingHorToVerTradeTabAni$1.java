package com.okinc.cruilib.view.tab;

import com.airbnb.lottie.LottieComposition;
import com.ibm.icu.text.DateFormat;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C31939mJn;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: loaded from: classes23.dex */
public final class OKCRTradeTabView$loadingHorToVerTradeTabAni$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ long $onDemandStartTime;
    int label;
    final /* synthetic */ C31939mJn this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OKCRTradeTabView$loadingHorToVerTradeTabAni$1(C31939mJn c31939mJn, long j, Continuation<? super OKCRTradeTabView$loadingHorToVerTradeTabAni$1> continuation) {
        super(2, continuation);
        this.this$0 = c31939mJn;
        this.$onDemandStartTime = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OKCRTradeTabView$loadingHorToVerTradeTabAni$1(this.this$0, this.$onDemandStartTime, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OKCRTradeTabView$loadingHorToVerTradeTabAni$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                C31939mJn c31939mJn = this.this$0;
                int iEZpvd = c31939mJn.EZpvd();
                this.label = 1;
                obj = c31939mJn.copydefault(iEZpvd, "horToVer-onDemand", this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            LottieComposition lottieComposition = (LottieComposition) obj;
            this.this$0.KWHzl = lottieComposition;
            this.this$0.AEQbTJ(lottieComposition, 1.0f);
            pUU.EZpvd("TradeTabView", "On-demand loading + rendering (horToVer): " + (System.currentTimeMillis() - this.$onDemandStartTime) + DateFormat.MINUTE_SECOND);
        } catch (Exception e) {
            pUU.AEQbTJ("TradeTabView", "On-demand loading failed (horToVer): " + (System.currentTimeMillis() - this.$onDemandStartTime) + DateFormat.MINUTE_SECOND, e);
        }
        return Unit.INSTANCE;
    }
}
