package com.okinc.business.invest_biz.data.repository.product_details;

import com.okinc.business.invest_biz.data.bean.SecurityScoreInfo;
import com.okinc.business.invest_biz.data.bean.request.QueryInvestmentSecurityScoreParam;
import com.okinc.network.okg.response.ResponseData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.reactive.AwaitKt;
import o.AbstractC58185ywX;
import o.C56391yDq;
import o.C56442yFn;
import o.iBL;
import o.iEP;

/* JADX INFO: loaded from: classes6.dex */
public final class ProductDetailsRepositoryImpl$getSecurityScore$2 extends SuspendLambda implements Function1<Continuation<? super SecurityScoreInfo>, Object> {
    final /* synthetic */ long $investmentId;
    int label;
    final /* synthetic */ iEP this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductDetailsRepositoryImpl$getSecurityScore$2(long j, iEP iep, Continuation<? super ProductDetailsRepositoryImpl$getSecurityScore$2> continuation) {
        super(1, continuation);
        this.$investmentId = j;
        this.this$0 = iep;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new ProductDetailsRepositoryImpl$getSecurityScore$2(this.$investmentId, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super SecurityScoreInfo> continuation) {
        return ((ProductDetailsRepositoryImpl$getSecurityScore$2) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            AbstractC58185ywX<ResponseData<SecurityScoreInfo>> abstractC58185ywXEZpvd = this.this$0.copydefault.OLrzqt().EZpvd(new QueryInvestmentSecurityScoreParam(this.$investmentId));
            this.label = 1;
            obj = AwaitKt.awaitFirst(abstractC58185ywXEZpvd, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        Intrinsics.checkNotNullExpressionValue(obj, "");
        Object objUnwrapResponseData$default = iBL.unwrapResponseData$default((ResponseData) obj, null, 1, null);
        Intrinsics.copydefault(objUnwrapResponseData$default);
        return objUnwrapResponseData$default;
    }
}
