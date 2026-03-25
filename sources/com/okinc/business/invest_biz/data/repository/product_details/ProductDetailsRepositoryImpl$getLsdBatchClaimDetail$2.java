package com.okinc.business.invest_biz.data.repository.product_details;

import com.okinc.business.invest_biz.data.bean.InvestUserClaimInfoResponse;
import com.okinc.business.invest_biz.data.bean.InvestWalletAddressInfo;
import com.okinc.business.invest_biz.data.bean.request.InvestUserUnstakeInfoParam;
import com.okinc.network.okg.response.ResponseData;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC25472ixP;
import o.iBL;
import o.iEP;

/* JADX INFO: loaded from: classes6.dex */
public final class ProductDetailsRepositoryImpl$getLsdBatchClaimDetail$2 extends SuspendLambda implements Function1<Continuation<? super InvestUserClaimInfoResponse>, Object> {
    final /* synthetic */ long $chainId;
    final /* synthetic */ long $investmentId;
    int label;
    final /* synthetic */ iEP this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductDetailsRepositoryImpl$getLsdBatchClaimDetail$2(iEP iep, long j, long j2, Continuation<? super ProductDetailsRepositoryImpl$getLsdBatchClaimDetail$2> continuation) {
        super(1, continuation);
        this.this$0 = iep;
        this.$investmentId = j;
        this.$chainId = j2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new ProductDetailsRepositoryImpl$getLsdBatchClaimDetail$2(this.this$0, this.$investmentId, this.$chainId, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super InvestUserClaimInfoResponse> continuation) {
        return ((ProductDetailsRepositoryImpl$getLsdBatchClaimDetail$2) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            List<InvestWalletAddressInfo> listAEQbTJ = this.this$0.AEQbTJ.AEQbTJ();
            long j = this.$chainId;
            for (InvestWalletAddressInfo investWalletAddressInfo : listAEQbTJ) {
                Long chainId = investWalletAddressInfo.getChainId();
                if (chainId != null && chainId.longValue() == j) {
                    InvestUserUnstakeInfoParam investUserUnstakeInfoParam = new InvestUserUnstakeInfoParam(investWalletAddressInfo.getWalletAddress(), this.$investmentId, 2);
                    InterfaceC25472ixP interfaceC25472ixPOLrzqt = this.this$0.copydefault.OLrzqt();
                    this.label = 1;
                    obj = interfaceC25472ixPOLrzqt.OLrzqt(investUserUnstakeInfoParam, this);
                    if (obj == objCopydefault) {
                        return objCopydefault;
                    }
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C56391yDq.AEQbTJ(obj);
        Object objUnwrapResponseData$default = iBL.unwrapResponseData$default((ResponseData) obj, null, 1, null);
        Intrinsics.copydefault(objUnwrapResponseData$default);
        return objUnwrapResponseData$default;
    }
}
