package com.okinc.business.invest_biz.data.repository.product_details;

import com.okinc.business.invest_biz.data.bean.InvestmentBonusInfo;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C56391yDq;
import o.C56442yFn;
import o.iEO;
import o.iEP;

/* JADX INFO: loaded from: classes6.dex */
public final class ProductDetailsRepositoryImpl$getBonus$2 extends SuspendLambda implements Function1<Continuation<? super InvestmentBonusInfo>, Object> {
    final /* synthetic */ long $investmentId;
    int label;
    final /* synthetic */ iEP this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductDetailsRepositoryImpl$getBonus$2(iEP iep, long j, Continuation<? super ProductDetailsRepositoryImpl$getBonus$2> continuation) {
        super(1, continuation);
        this.this$0 = iep;
        this.$investmentId = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new ProductDetailsRepositoryImpl$getBonus$2(this.this$0, this.$investmentId, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super InvestmentBonusInfo> continuation) {
        return ((ProductDetailsRepositoryImpl$getBonus$2) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            iEO ieo = this.this$0.EZpvd;
            long j = this.$investmentId;
            this.label = 1;
            obj = ieo.EZpvd(j, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        Intrinsics.copydefault(obj);
        return obj;
    }
}
