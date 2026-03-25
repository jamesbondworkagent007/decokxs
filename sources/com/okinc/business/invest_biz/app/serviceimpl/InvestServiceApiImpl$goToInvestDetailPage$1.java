package com.okinc.business.invest_biz.app.serviceimpl;

import android.content.Context;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C25596izh;
import o.C27508jwX;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.iBC;

/* JADX INFO: loaded from: classes6.dex */
public final class InvestServiceApiImpl$goToInvestDetailPage$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ Integer $investmentCategory;
    final /* synthetic */ long $investmentId;
    final /* synthetic */ String $source;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestServiceApiImpl$goToInvestDetailPage$1(Context context, long j, Integer num, String str, Continuation<? super InvestServiceApiImpl$goToInvestDetailPage$1> continuation) {
        super(2, continuation);
        this.$context = context;
        this.$investmentId = j;
        this.$investmentCategory = num;
        this.$source = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InvestServiceApiImpl$goToInvestDetailPage$1(this.$context, this.$investmentId, this.$investmentCategory, this.$source, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((InvestServiceApiImpl$goToInvestDetailPage$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            if (!C25596izh.OLrzqt(this.$context).KWHzl(this.$context, new iBC(0, 0, 0, null, null, 31, null))) {
                C27508jwX.startInvestDetailActivity$default(C27508jwX.AEQbTJ, this.$context, C56443yFo.KWHzl(this.$investmentId), this.$investmentCategory, this.$source, null, false, 24, null);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
