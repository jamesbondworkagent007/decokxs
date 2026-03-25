package com.okinc.dexkline.market.features.coincheck.repo;

import com.okinc.dexkline.market.data.model.CoinRiskData;
import com.okinc.network.okg.response.ResponseData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import o.C32298mWv;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC32162mRu;

/* JADX INFO: loaded from: classes8.dex */
public final class CoinCheckRepositoryImpl$getRiskCheck$2 extends SuspendLambda implements Function1<Continuation<? super ResponseData<CoinRiskData>>, Object> {
    final /* synthetic */ String $chainId;
    final /* synthetic */ String $tokenContractAddress;
    int label;
    final /* synthetic */ C32298mWv this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoinCheckRepositoryImpl$getRiskCheck$2(C32298mWv c32298mWv, String str, String str2, Continuation<? super CoinCheckRepositoryImpl$getRiskCheck$2> continuation) {
        super(1, continuation);
        this.this$0 = c32298mWv;
        this.$tokenContractAddress = str;
        this.$chainId = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new CoinCheckRepositoryImpl$getRiskCheck$2(this.this$0, this.$tokenContractAddress, this.$chainId, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super ResponseData<CoinRiskData>> continuation) {
        return ((CoinCheckRepositoryImpl$getRiskCheck$2) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC32162mRu interfaceC32162mRu = this.this$0.AEQbTJ;
            String str = this.$tokenContractAddress;
            String str2 = this.$chainId;
            this.label = 1;
            obj = interfaceC32162mRu.AEQbTJ(str, str2, this);
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
