package com.okinc.business.invest_biz.mln.repo;

import com.okinc.business.invest_biz.data.bean.InvestStOktDrawDetailParam;
import com.okinc.business.invest_biz.data.bean.InvestStOktDrawDetailResponse;
import com.okinc.business.invest_biz.data.bean.InvestWalletAddressInfo;
import com.okinc.network.okg.response.ResponseData;
import java.util.ArrayList;
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
public final class DeFiMiniDetailCacheRepo$getOktStakingDetail$2 extends SuspendLambda implements Function1<Continuation<? super InvestStOktDrawDetailResponse>, Object> {
    final /* synthetic */ long $chainId;
    int label;
    final /* synthetic */ C23932iOr this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeFiMiniDetailCacheRepo$getOktStakingDetail$2(long j, C23932iOr c23932iOr, Continuation<? super DeFiMiniDetailCacheRepo$getOktStakingDetail$2> continuation) {
        super(1, continuation);
        this.$chainId = j;
        this.this$0 = c23932iOr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new DeFiMiniDetailCacheRepo$getOktStakingDetail$2(this.$chainId, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super InvestStOktDrawDetailResponse> continuation) {
        return ((DeFiMiniDetailCacheRepo$getOktStakingDetail$2) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Exception {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        } else {
            C56391yDq.AEQbTJ(obj);
            List<InvestWalletAddressInfo> listAEQbTJ = C23580iBq.AEQbTJ.AEQbTJ();
            long j = this.$chainId;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : listAEQbTJ) {
                Long chainId = ((InvestWalletAddressInfo) obj2).getChainId();
                if (chainId != null && chainId.longValue() == j) {
                    arrayList.add(obj2);
                }
            }
            if (arrayList.isEmpty()) {
                throw new Exception("No wallet addresses found for chain " + this.$chainId);
            }
            InvestStOktDrawDetailParam investStOktDrawDetailParam = new InvestStOktDrawDetailParam(arrayList);
            InterfaceC25472ixP interfaceC25472ixPOLrzqt = this.this$0.OLrzqt.OLrzqt();
            this.label = 1;
            obj = interfaceC25472ixPOLrzqt.copydefault(investStOktDrawDetailParam, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        }
        InvestStOktDrawDetailResponse investStOktDrawDetailResponse = (InvestStOktDrawDetailResponse) iBL.unwrapResponseData$default((ResponseData) obj, null, 1, null);
        if (investStOktDrawDetailResponse != null) {
            return investStOktDrawDetailResponse;
        }
        throw new Exception("API response is null for chain " + this.$chainId);
    }
}
