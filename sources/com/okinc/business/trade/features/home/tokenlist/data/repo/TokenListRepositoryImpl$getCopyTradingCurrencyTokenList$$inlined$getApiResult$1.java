package com.okinc.business.trade.features.home.tokenlist.data.repo;

import com.okinc.business.dexlogic.bean.MemeCurrencyBean;
import com.okinc.network.okg.response.ResponseData;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC28372kYz;
import o.kYH;

/* JADX INFO: loaded from: classes7.dex */
public final class TokenListRepositoryImpl$getCopyTradingCurrencyTokenList$$inlined$getApiResult$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ResponseData<List<? extends MemeCurrencyBean>>>, Object> {
    final /* synthetic */ String $accountId$inlined;
    final /* synthetic */ Integer $bizMode$inlined;
    final /* synthetic */ String $chainId$inlined;
    final /* synthetic */ String $userUniqueId$inlined;
    int label;
    final /* synthetic */ kYH this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TokenListRepositoryImpl$getCopyTradingCurrencyTokenList$$inlined$getApiResult$1(Continuation continuation, kYH kyh, String str, String str2, Integer num, String str3) {
        super(2, continuation);
        this.this$0 = kyh;
        this.$userUniqueId$inlined = str;
        this.$accountId$inlined = str2;
        this.$bizMode$inlined = num;
        this.$chainId$inlined = str3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TokenListRepositoryImpl$getCopyTradingCurrencyTokenList$$inlined$getApiResult$1(continuation, this.this$0, this.$userUniqueId$inlined, this.$accountId$inlined, this.$bizMode$inlined, this.$chainId$inlined);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ResponseData<List<? extends MemeCurrencyBean>>> continuation) {
        return ((TokenListRepositoryImpl$getCopyTradingCurrencyTokenList$$inlined$getApiResult$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC28372kYz interfaceC28372kYz = this.this$0.AEQbTJ;
            String str = this.$userUniqueId$inlined;
            String str2 = this.$accountId$inlined;
            Integer num = this.$bizMode$inlined;
            String str3 = this.$chainId$inlined;
            this.label = 1;
            obj = interfaceC28372kYz.KWHzl(str, str2, num, str3, this);
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
