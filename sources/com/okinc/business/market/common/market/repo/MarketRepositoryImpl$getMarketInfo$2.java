package com.okinc.business.market.common.market.repo;

import com.okinc.business.dexlogic.main.market.bean.LatestMarketInfoBean;
import com.okinc.network.okg.response.ResponseData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import o.C27631jyo;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC27595jyE;

/* JADX INFO: loaded from: classes6.dex */
public final class MarketRepositoryImpl$getMarketInfo$2 extends SuspendLambda implements Function1<Continuation<? super ResponseData<LatestMarketInfoBean>>, Object> {
    final /* synthetic */ String $chainId;
    final /* synthetic */ String $tokenContractAddress;
    final /* synthetic */ String $walletId;
    int label;
    final /* synthetic */ C27631jyo this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketRepositoryImpl$getMarketInfo$2(C27631jyo c27631jyo, String str, String str2, String str3, Continuation<? super MarketRepositoryImpl$getMarketInfo$2> continuation) {
        super(1, continuation);
        this.this$0 = c27631jyo;
        this.$tokenContractAddress = str;
        this.$walletId = str2;
        this.$chainId = str3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new MarketRepositoryImpl$getMarketInfo$2(this.this$0, this.$tokenContractAddress, this.$walletId, this.$chainId, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super ResponseData<LatestMarketInfoBean>> continuation) {
        return ((MarketRepositoryImpl$getMarketInfo$2) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC27595jyE interfaceC27595jyE = this.this$0.copydefault;
            String str = this.$tokenContractAddress;
            String str2 = this.$walletId;
            String str3 = this.$chainId;
            this.label = 1;
            obj = interfaceC27595jyE.copydefault(str, str2, str3, this);
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
