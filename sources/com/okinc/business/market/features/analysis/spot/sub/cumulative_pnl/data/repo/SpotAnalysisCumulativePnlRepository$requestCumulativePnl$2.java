package com.okinc.business.market.features.analysis.spot.sub.cumulative_pnl.data.repo;

import com.okinc.business.market.features.analysis.spot.sub.cumulative_pnl.data.model.CumulativePnlPo;
import com.okinc.market.common.bean.PayloadPeriod;
import com.okinc.network.okg.response.ResponseData;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.jLQ;
import o.jLR;

/* JADX INFO: loaded from: classes6.dex */
public final class SpotAnalysisCumulativePnlRepository$requestCumulativePnl$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ResponseData<List<? extends CumulativePnlPo>>>, Object> {
    final /* synthetic */ PayloadPeriod $period;
    final /* synthetic */ String $uid;
    final /* synthetic */ String $valuationUnit;
    int label;
    final /* synthetic */ jLQ this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpotAnalysisCumulativePnlRepository$requestCumulativePnl$2(jLQ jlq, PayloadPeriod payloadPeriod, String str, String str2, Continuation<? super SpotAnalysisCumulativePnlRepository$requestCumulativePnl$2> continuation) {
        super(2, continuation);
        this.this$0 = jlq;
        this.$period = payloadPeriod;
        this.$valuationUnit = str;
        this.$uid = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SpotAnalysisCumulativePnlRepository$requestCumulativePnl$2(this.this$0, this.$period, this.$valuationUnit, this.$uid, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super ResponseData<List<? extends CumulativePnlPo>>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super ResponseData<List<CumulativePnlPo>>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super ResponseData<List<CumulativePnlPo>>> continuation) {
        return ((SpotAnalysisCumulativePnlRepository$requestCumulativePnl$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            jLR jlr = this.this$0.KWHzl;
            PayloadPeriod payloadPeriod = this.$period;
            String str = this.$valuationUnit;
            String str2 = this.$uid;
            this.label = 1;
            obj = jlr.KWHzl(payloadPeriod, str, str2, this);
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
