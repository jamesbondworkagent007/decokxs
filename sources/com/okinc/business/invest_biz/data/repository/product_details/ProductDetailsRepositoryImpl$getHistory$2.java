package com.okinc.business.invest_biz.data.repository.product_details;

import com.okinc.business.invest_biz.data.bean.response.ProductDetailsHistoryResponse;
import com.okinc.business.invest_biz.data.models.DetailOrderParam;
import com.okinc.network.okg.response.ResponseData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C56391yDq;
import o.C56402yEa;
import o.C56442yFn;
import o.InterfaceC25472ixP;
import o.InterfaceC9738bbJ;
import o.iBL;
import o.iEP;

/* JADX INFO: loaded from: classes6.dex */
public final class ProductDetailsRepositoryImpl$getHistory$2 extends SuspendLambda implements Function1<Continuation<? super ProductDetailsHistoryResponse>, Object> {
    final /* synthetic */ long $chainId;
    final /* synthetic */ long $investmentId;
    Object L$0;
    int label;
    final /* synthetic */ iEP this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductDetailsRepositoryImpl$getHistory$2(iEP iep, long j, long j2, Continuation<? super ProductDetailsRepositoryImpl$getHistory$2> continuation) {
        super(1, continuation);
        this.this$0 = iep;
        this.$chainId = j;
        this.$investmentId = j2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new ProductDetailsRepositoryImpl$getHistory$2(this.this$0, this.$chainId, this.$investmentId, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super ProductDetailsHistoryResponse> continuation) {
        return ((ProductDetailsRepositoryImpl$getHistory$2) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        DetailOrderParam detailOrderParam;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC9738bbJ interfaceC9738bbJOLrzqt = this.this$0.AEQbTJ.OLrzqt();
            Intrinsics.copydefault(interfaceC9738bbJOLrzqt);
            detailOrderParam = new DetailOrderParam(this.$chainId, this.$investmentId, C56402yEa.EZpvd(interfaceC9738bbJOLrzqt.EZpvd(this.$chainId)), 10, 1);
            iEP iep = this.this$0;
            this.L$0 = detailOrderParam;
            this.label = 1;
            obj = iep.EZpvd(this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                Object objUnwrapResponseData$default = iBL.unwrapResponseData$default((ResponseData) obj, null, 1, null);
                Intrinsics.copydefault(objUnwrapResponseData$default);
                return objUnwrapResponseData$default;
            }
            detailOrderParam = (DetailOrderParam) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        this.L$0 = null;
        this.label = 2;
        obj = ((InterfaceC25472ixP) obj).OLrzqt(detailOrderParam, this);
        if (obj == objCopydefault) {
            return objCopydefault;
        }
        Object objUnwrapResponseData$default2 = iBL.unwrapResponseData$default((ResponseData) obj, null, 1, null);
        Intrinsics.copydefault(objUnwrapResponseData$default2);
        return objUnwrapResponseData$default2;
    }
}
