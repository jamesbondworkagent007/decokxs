package com.okinc.business.trade.features.home.advanced.repository;

import com.okinc.business.trade.features.home.ui.cefi.data.ValidateTokensRequest;
import com.okinc.business.trade.features.home.ui.cefi.data.ValidateTokensResponse;
import com.okinc.network.okg.response.ResponseData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import o.C33129mqd;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC23234huQ;
import o.kQE;

/* JADX INFO: loaded from: classes7.dex */
public final class AdvancedPlaceOrderRepositoryImpl$validateMarketTokens$2 extends SuspendLambda implements Function1<Continuation<? super ResponseData<ValidateTokensResponse>>, Object> {
    final /* synthetic */ ValidateTokensRequest $request;
    int label;
    final /* synthetic */ kQE this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvancedPlaceOrderRepositoryImpl$validateMarketTokens$2(kQE kqe, ValidateTokensRequest validateTokensRequest, Continuation<? super AdvancedPlaceOrderRepositoryImpl$validateMarketTokens$2> continuation) {
        super(1, continuation);
        this.this$0 = kqe;
        this.$request = validateTokensRequest;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new AdvancedPlaceOrderRepositoryImpl$validateMarketTokens$2(this.this$0, this.$request, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super ResponseData<ValidateTokensResponse>> continuation) {
        return ((AdvancedPlaceOrderRepositoryImpl$validateMarketTokens$2) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC23234huQ interfaceC23234huQ = this.this$0.KWHzl;
            String chainId = this.$request.getChainId();
            String strGEmmrt = C33129mqd.gEmmrt(this.$request.getQuoteTokenAddress());
            String strGEmmrt2 = C33129mqd.gEmmrt(this.$request.getBaseTokenAddress());
            String userUniqueId = this.$request.getUserUniqueId();
            String accountId = this.$request.getAccountId();
            this.label = 1;
            obj = InterfaceC23234huQ.Application.validateMarketTokens$default(interfaceC23234huQ, chainId, strGEmmrt, strGEmmrt2, userUniqueId, accountId, null, this, 32, null);
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
