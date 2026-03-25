package com.okinc.cruilib.view.tab;

import com.airbnb.lottie.LottieComposition;
import com.ibm.icu.text.DateFormat;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import o.C31939mJn;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: loaded from: classes23.dex */
public final class OKCRTradeTabView$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    long J$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ C31939mJn this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OKCRTradeTabView$2(C31939mJn c31939mJn, Continuation<? super OKCRTradeTabView$2> continuation) {
        super(2, continuation);
        this.this$0 = c31939mJn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OKCRTradeTabView$2 oKCRTradeTabView$2 = new OKCRTradeTabView$2(this.this$0, continuation);
        oKCRTradeTabView$2.L$0 = obj;
        return oKCRTradeTabView$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OKCRTradeTabView$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        long jCurrentTimeMillis;
        C31939mJn c31939mJn;
        Object objAwait;
        Deferred deferred;
        Object objAwait2;
        C31939mJn c31939mJn2;
        long j;
        Exception e;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            jCurrentTimeMillis = System.currentTimeMillis();
            try {
                Deferred deferredAsync$default = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new OKCRTradeTabView$2$horToVerDeferred$1(this.this$0, null), 3, null);
                Deferred deferredAsync$default2 = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new OKCRTradeTabView$2$verToHorDeferred$1(this.this$0, null), 3, null);
                c31939mJn = this.this$0;
                this.L$0 = deferredAsync$default2;
                this.L$1 = c31939mJn;
                this.J$0 = jCurrentTimeMillis;
                this.label = 1;
                objAwait = deferredAsync$default.await(this);
                if (objAwait == objCopydefault) {
                    return objCopydefault;
                }
                deferred = deferredAsync$default2;
            } catch (Exception e2) {
                e = e2;
                j = jCurrentTimeMillis;
                pUU.AEQbTJ("TradeTabView", "Loading failed after " + (System.currentTimeMillis() - j) + DateFormat.MINUTE_SECOND, e);
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j = this.J$0;
                c31939mJn2 = (C31939mJn) this.L$0;
                try {
                    C56391yDq.AEQbTJ(obj);
                    jCurrentTimeMillis = j;
                    objAwait2 = obj;
                    c31939mJn2.AhwBna = (LottieComposition) objAwait2;
                    pUU.EZpvd("TradeTabView", "Total loading time: " + (System.currentTimeMillis() - jCurrentTimeMillis) + DateFormat.MINUTE_SECOND);
                } catch (Exception e3) {
                    e = e3;
                    pUU.AEQbTJ("TradeTabView", "Loading failed after " + (System.currentTimeMillis() - j) + DateFormat.MINUTE_SECOND, e);
                }
                return Unit.INSTANCE;
            }
            long j2 = this.J$0;
            C31939mJn c31939mJn3 = (C31939mJn) this.L$1;
            deferred = (Deferred) this.L$0;
            try {
                C56391yDq.AEQbTJ(obj);
                jCurrentTimeMillis = j2;
                c31939mJn = c31939mJn3;
                objAwait = obj;
            } catch (Exception e4) {
                e = e4;
                j = j2;
                pUU.AEQbTJ("TradeTabView", "Loading failed after " + (System.currentTimeMillis() - j) + DateFormat.MINUTE_SECOND, e);
            }
            pUU.AEQbTJ("TradeTabView", "Loading failed after " + (System.currentTimeMillis() - j) + DateFormat.MINUTE_SECOND, e);
            return Unit.INSTANCE;
        }
        c31939mJn.KWHzl = (LottieComposition) objAwait;
        C31939mJn c31939mJn4 = this.this$0;
        this.L$0 = c31939mJn4;
        this.L$1 = null;
        this.J$0 = jCurrentTimeMillis;
        this.label = 2;
        objAwait2 = deferred.await(this);
        if (objAwait2 == objCopydefault) {
            return objCopydefault;
        }
        c31939mJn2 = c31939mJn4;
        c31939mJn2.AhwBna = (LottieComposition) objAwait2;
        pUU.EZpvd("TradeTabView", "Total loading time: " + (System.currentTimeMillis() - jCurrentTimeMillis) + DateFormat.MINUTE_SECOND);
        return Unit.INSTANCE;
    }
}
