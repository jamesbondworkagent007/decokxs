package com.okinc.business.invest_biz.data.repository.product_details;

import com.okinc.business.invest_biz.data.bean.InvestPointsInfoResponse;
import com.okinc.business.invest_biz.data.bean.InvestWalletAddressInfo;
import com.okinc.network.okg.response.ResponseData;
import java.util.Iterator;
import java.util.List;
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
public final class ProductDetailsRepositoryImpl$getPointReward$2 extends SuspendLambda implements Function1<Continuation<? super InvestPointsInfoResponse>, Object> {
    final /* synthetic */ long $chainId;
    final /* synthetic */ long $investmentId;
    int label;
    final /* synthetic */ iEP this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductDetailsRepositoryImpl$getPointReward$2(iEP iep, long j, long j2, Continuation<? super ProductDetailsRepositoryImpl$getPointReward$2> continuation) {
        super(1, continuation);
        this.this$0 = iep;
        this.$investmentId = j;
        this.$chainId = j2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new ProductDetailsRepositoryImpl$getPointReward$2(this.this$0, this.$investmentId, this.$chainId, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super InvestPointsInfoResponse> continuation) {
        return ((ProductDetailsRepositoryImpl$getPointReward$2) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object next;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            List<InvestWalletAddressInfo> listAEQbTJ = this.this$0.AEQbTJ.AEQbTJ();
            long j = this.$chainId;
            Iterator<T> it = listAEQbTJ.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                Long chainId = ((InvestWalletAddressInfo) next).getChainId();
                if (chainId != null && chainId.longValue() == j) {
                    break;
                }
            }
            InvestWalletAddressInfo investWalletAddressInfo = (InvestWalletAddressInfo) next;
            String walletAddress = investWalletAddressInfo != null ? investWalletAddressInfo.getWalletAddress() : null;
            InterfaceC25472ixP interfaceC25472ixPOLrzqt = this.this$0.copydefault.OLrzqt();
            long j2 = this.$investmentId;
            long j3 = this.$chainId;
            this.label = 1;
            obj = interfaceC25472ixPOLrzqt.EZpvd(walletAddress, j2, j3, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        Object objUnwrapResponseData$default = iBL.unwrapResponseData$default((ResponseData) obj, null, 1, null);
        Intrinsics.copydefault(objUnwrapResponseData$default);
        return objUnwrapResponseData$default;
    }
}
