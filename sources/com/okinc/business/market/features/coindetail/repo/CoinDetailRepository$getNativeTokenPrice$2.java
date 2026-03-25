package com.okinc.business.market.features.coindetail.repo;

import com.okinc.business.market.data.model.history.NativeTokenPriceData;
import com.okinc.network.okg.response.ResponseData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC27595jyE;
import o.jNW;

/* JADX INFO: loaded from: classes6.dex */
public final class CoinDetailRepository$getNativeTokenPrice$2 extends SuspendLambda implements Function1<Continuation<? super ResponseData<NativeTokenPriceData>>, Object> {
    final /* synthetic */ String $chainId;
    int label;
    final /* synthetic */ jNW this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoinDetailRepository$getNativeTokenPrice$2(jNW jnw, String str, Continuation<? super CoinDetailRepository$getNativeTokenPrice$2> continuation) {
        super(1, continuation);
        this.this$0 = jnw;
        this.$chainId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new CoinDetailRepository$getNativeTokenPrice$2(this.this$0, this.$chainId, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super ResponseData<NativeTokenPriceData>> continuation) {
        return ((CoinDetailRepository$getNativeTokenPrice$2) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC27595jyE interfaceC27595jyE = this.this$0.AEQbTJ;
            String str = this.$chainId;
            this.label = 1;
            obj = interfaceC27595jyE.KWHzl(str, this);
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
