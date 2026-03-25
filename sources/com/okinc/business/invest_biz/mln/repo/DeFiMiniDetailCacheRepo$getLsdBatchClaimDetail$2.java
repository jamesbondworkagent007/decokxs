package com.okinc.business.invest_biz.mln.repo;

import com.okinc.business.invest_biz.data.bean.InvestUserClaimInfoResponse;
import com.okinc.business.invest_biz.data.bean.InvestWalletAddressInfo;
import com.okinc.business.invest_biz.data.bean.request.InvestUserUnstakeInfoParam;
import com.okinc.network.okg.response.ResponseData;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import o.C23580iBq;
import o.C23932iOr;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC25472ixP;
import o.iBL;

/* JADX INFO: loaded from: classes6.dex */
public final class DeFiMiniDetailCacheRepo$getLsdBatchClaimDetail$2 extends SuspendLambda implements Function1<Continuation<? super InvestUserClaimInfoResponse>, Object> {
    final /* synthetic */ long $chainId;
    final /* synthetic */ long $investmentId;
    int label;
    final /* synthetic */ C23932iOr this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeFiMiniDetailCacheRepo$getLsdBatchClaimDetail$2(long j, long j2, C23932iOr c23932iOr, Continuation<? super DeFiMiniDetailCacheRepo$getLsdBatchClaimDetail$2> continuation) {
        super(1, continuation);
        this.$chainId = j;
        this.$investmentId = j2;
        this.this$0 = c23932iOr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new DeFiMiniDetailCacheRepo$getLsdBatchClaimDetail$2(this.$chainId, this.$investmentId, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super InvestUserClaimInfoResponse> continuation) {
        return ((DeFiMiniDetailCacheRepo$getLsdBatchClaimDetail$2) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Exception {
        Object next;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            List<InvestWalletAddressInfo> listAEQbTJ = C23580iBq.AEQbTJ.AEQbTJ();
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
            if (investWalletAddressInfo == null) {
                throw new Exception("Wallet not found for chain " + this.$chainId);
            }
            InvestUserUnstakeInfoParam investUserUnstakeInfoParam = new InvestUserUnstakeInfoParam(investWalletAddressInfo.getWalletAddress(), this.$investmentId, 2);
            InterfaceC25472ixP interfaceC25472ixPOLrzqt = this.this$0.OLrzqt.OLrzqt();
            this.label = 1;
            obj = interfaceC25472ixPOLrzqt.OLrzqt(investUserUnstakeInfoParam, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        InvestUserClaimInfoResponse investUserClaimInfoResponse = (InvestUserClaimInfoResponse) iBL.unwrapResponseData$default((ResponseData) obj, null, 1, null);
        if (investUserClaimInfoResponse != null) {
            return investUserClaimInfoResponse;
        }
        throw new Exception("API response is null for claim info");
    }
}
