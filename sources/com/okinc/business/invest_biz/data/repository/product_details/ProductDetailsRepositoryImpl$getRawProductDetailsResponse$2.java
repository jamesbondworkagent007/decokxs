package com.okinc.business.invest_biz.data.repository.product_details;

import com.okinc.business.invest_biz.data.bean.InvestProductDetailResponse;
import com.okinc.business.invest_biz.data.bean.request.InvestProductDetailParam;
import com.okinc.network.okg.response.ResponseData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C23682iFk;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC25472ixP;
import o.iBL;
import o.iEO;
import o.iEP;

/* JADX INFO: loaded from: classes6.dex */
public final class ProductDetailsRepositoryImpl$getRawProductDetailsResponse$2 extends SuspendLambda implements Function1<Continuation<? super InvestProductDetailResponse>, Object> {
    final /* synthetic */ C23682iFk $params;
    Object L$0;
    int label;
    final /* synthetic */ iEP this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductDetailsRepositoryImpl$getRawProductDetailsResponse$2(iEP iep, C23682iFk c23682iFk, Continuation<? super ProductDetailsRepositoryImpl$getRawProductDetailsResponse$2> continuation) {
        super(1, continuation);
        this.this$0 = iep;
        this.$params = c23682iFk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new ProductDetailsRepositoryImpl$getRawProductDetailsResponse$2(this.this$0, this.$params, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super InvestProductDetailResponse> continuation) {
        return ((ProductDetailsRepositoryImpl$getRawProductDetailsResponse$2) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x009b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009c  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            iEO ieo = this.this$0.EZpvd;
            long jKWHzl = this.$params.KWHzl();
            this.label = 1;
            obj = ieo.OLrzqt(jKWHzl, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    InvestProductDetailResponse investProductDetailResponse = (InvestProductDetailResponse) this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    return investProductDetailResponse;
                }
                C56391yDq.AEQbTJ(obj);
                Object objUnwrapResponseData$default = iBL.unwrapResponseData$default((ResponseData) obj, null, 1, null);
                Intrinsics.copydefault(objUnwrapResponseData$default);
                InvestProductDetailResponse investProductDetailResponse2 = (InvestProductDetailResponse) objUnwrapResponseData$default;
                iEO ieo2 = this.this$0.EZpvd;
                long jKWHzl2 = this.$params.KWHzl();
                this.L$0 = investProductDetailResponse2;
                this.label = 3;
                return ieo2.copydefault(jKWHzl2, investProductDetailResponse2, this) != objCopydefault ? objCopydefault : investProductDetailResponse2;
            }
            C56391yDq.AEQbTJ(obj);
        }
        InvestProductDetailResponse investProductDetailResponse3 = (InvestProductDetailResponse) obj;
        if (investProductDetailResponse3 != null) {
            return investProductDetailResponse3;
        }
        InvestProductDetailParam investProductDetailParam = new InvestProductDetailParam(this.$params.KWHzl(), this.$params.copydefault().getValue(), this.this$0.AEQbTJ.AEQbTJ());
        InterfaceC25472ixP interfaceC25472ixPOLrzqt = this.this$0.copydefault.OLrzqt();
        this.label = 2;
        obj = interfaceC25472ixPOLrzqt.KWHzl(investProductDetailParam, this);
        if (obj == objCopydefault) {
            return objCopydefault;
        }
        Object objUnwrapResponseData$default2 = iBL.unwrapResponseData$default((ResponseData) obj, null, 1, null);
        Intrinsics.copydefault(objUnwrapResponseData$default2);
        InvestProductDetailResponse investProductDetailResponse22 = (InvestProductDetailResponse) objUnwrapResponseData$default2;
        iEO ieo22 = this.this$0.EZpvd;
        long jKWHzl22 = this.$params.KWHzl();
        this.L$0 = investProductDetailResponse22;
        this.label = 3;
        if (ieo22.copydefault(jKWHzl22, investProductDetailResponse22, this) != objCopydefault) {
        }
    }
}
