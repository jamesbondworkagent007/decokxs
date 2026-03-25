package com.okinc.business.market.features.position.repo;

import com.okinc.business.market.data.model.position_pnl.LimitOrderBalanceData;
import com.okinc.network.okg.response.ResponseData;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import o.C27610jyT;
import o.C29131knp;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC27595jyE;

/* JADX INFO: loaded from: classes7.dex */
public final class LimitOrderAssetRepositoryImpl$getLimitOrderBalance$2 extends SuspendLambda implements Function1<Continuation<? super ResponseData<LimitOrderBalanceData>>, Object> {
    final /* synthetic */ C27610jyT $limitOrderAssetRequest;
    int label;
    final /* synthetic */ C29131knp this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LimitOrderAssetRepositoryImpl$getLimitOrderBalance$2(C27610jyT c27610jyT, C29131knp c29131knp, Continuation<? super LimitOrderAssetRepositoryImpl$getLimitOrderBalance$2> continuation) {
        super(1, continuation);
        this.$limitOrderAssetRequest = c27610jyT;
        this.this$0 = c29131knp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new LimitOrderAssetRepositoryImpl$getLimitOrderBalance$2(this.$limitOrderAssetRequest, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super ResponseData<LimitOrderBalanceData>> continuation) {
        return ((LimitOrderAssetRepositoryImpl$getLimitOrderBalance$2) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            HashMap<String, String> map = new HashMap<>();
            map.put("chainId", this.$limitOrderAssetRequest.EZpvd());
            map.put("userWalletAddress", this.$limitOrderAssetRequest.KWHzl());
            map.put("tokenAddress", this.$limitOrderAssetRequest.AEQbTJ());
            InterfaceC27595jyE interfaceC27595jyE = this.this$0.EZpvd;
            this.label = 1;
            obj = interfaceC27595jyE.copydefault(map, (Continuation<? super ResponseData<LimitOrderBalanceData>>) this);
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
