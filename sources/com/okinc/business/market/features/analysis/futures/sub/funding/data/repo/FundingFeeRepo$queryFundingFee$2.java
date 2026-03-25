package com.okinc.business.market.features.analysis.futures.sub.funding.data.repo;

import com.okinc.business.market.features.analysis.futures.sub.funding.data.model.FundingFeePo;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C25877jJr;
import o.C25878jJs;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes6.dex */
public final class FundingFeeRepo$queryFundingFee$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends FundingFeePo>>, Object> {
    final /* synthetic */ String $instId;
    final /* synthetic */ String $period;
    final /* synthetic */ String $uid;
    final /* synthetic */ String $valuationUnit;
    int label;
    final /* synthetic */ C25878jJs this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FundingFeeRepo$queryFundingFee$2(C25878jJs c25878jJs, String str, String str2, String str3, String str4, Continuation<? super FundingFeeRepo$queryFundingFee$2> continuation) {
        super(2, continuation);
        this.this$0 = c25878jJs;
        this.$valuationUnit = str;
        this.$period = str2;
        this.$instId = str3;
        this.$uid = str4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FundingFeeRepo$queryFundingFee$2(this.this$0, this.$valuationUnit, this.$period, this.$instId, this.$uid, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends FundingFeePo>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super List<FundingFeePo>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super List<FundingFeePo>> continuation) {
        return ((FundingFeeRepo$queryFundingFee$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C25877jJr c25877jJr = this.this$0.OLrzqt;
            String str = this.$valuationUnit;
            String str2 = this.$period;
            String str3 = this.$instId;
            String str4 = this.$uid;
            this.label = 1;
            obj = c25877jJr.copydefault(str, str2, str3, str4, this);
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
