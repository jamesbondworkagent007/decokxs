package com.okinc.business.trade.features.home.advanced.repository;

import com.okinc.business.trade.features.home.ui.cefi.data.LimitPairRateRequest;
import com.okinc.business.trade.features.home.ui.cefi.data.LimitPairRateResponse;
import com.okinc.network.okg.response.ResponseData;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import o.C28155kQy;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC23225huH;

/* JADX INFO: loaded from: classes7.dex */
public final class AdvancedLimitOrderRepoImpl$getLimitPairRate$2 extends SuspendLambda implements Function1<Continuation<? super ResponseData<LimitPairRateResponse>>, Object> {
    final /* synthetic */ LimitPairRateRequest $request;
    int label;
    final /* synthetic */ C28155kQy this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvancedLimitOrderRepoImpl$getLimitPairRate$2(C28155kQy c28155kQy, LimitPairRateRequest limitPairRateRequest, Continuation<? super AdvancedLimitOrderRepoImpl$getLimitPairRate$2> continuation) {
        super(1, continuation);
        this.this$0 = c28155kQy;
        this.$request = limitPairRateRequest;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new AdvancedLimitOrderRepoImpl$getLimitPairRate$2(this.this$0, this.$request, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super ResponseData<LimitPairRateResponse>> continuation) {
        return ((AdvancedLimitOrderRepoImpl$getLimitPairRate$2) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            return obj;
        }
        C56391yDq.AEQbTJ(obj);
        InterfaceC23225huH interfaceC23225huH = this.this$0.copydefault;
        long chainId = this.$request.getChainId();
        String fromTokenAddress = this.$request.getFromTokenAddress();
        String toTokenAddress = this.$request.getToTokenAddress();
        String fromAmount = this.$request.getFromAmount();
        String userWalletAddress = this.$request.getUserWalletAddress();
        List<String> dexIds = this.$request.getDexIds();
        String strJoinToString$default = dexIds != null ? CollectionsKt___CollectionsKt.joinToString$default(dexIds, ",", null, null, 0, null, null, 62, null) : null;
        String refCode = this.$request.getRefCode();
        this.label = 1;
        Object objKWHzl = interfaceC23225huH.KWHzl(chainId, fromTokenAddress, toTokenAddress, fromAmount, userWalletAddress, strJoinToString$default, refCode, this);
        return objKWHzl == objCopydefault ? objCopydefault : objKWHzl;
    }
}
