package com.okinc.business.trade.features.home.meme.repository;

import com.okinc.business.trade.features.home.domain.model.TradingBizType;
import com.okinc.business.trade.features.home.ui.cefi.data.ValidateTokensResponse;
import com.okinc.network.okg.response.ResponseData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import o.C28280kVo;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC23234huQ;

/* JADX INFO: loaded from: classes7.dex */
public final class MemeCoinRepositoryImpl$checkTokenPair$2 extends SuspendLambda implements Function1<Continuation<? super ResponseData<ValidateTokensResponse>>, Object> {
    final /* synthetic */ String $accountId;
    final /* synthetic */ String $chainId;
    final /* synthetic */ String $currencyTokenAddress;
    final /* synthetic */ String $transactionTokenAddress;
    final /* synthetic */ String $userUniqueId;
    int label;
    final /* synthetic */ C28280kVo this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MemeCoinRepositoryImpl$checkTokenPair$2(C28280kVo c28280kVo, String str, String str2, String str3, String str4, String str5, Continuation<? super MemeCoinRepositoryImpl$checkTokenPair$2> continuation) {
        super(1, continuation);
        this.this$0 = c28280kVo;
        this.$chainId = str;
        this.$currencyTokenAddress = str2;
        this.$transactionTokenAddress = str3;
        this.$userUniqueId = str4;
        this.$accountId = str5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new MemeCoinRepositoryImpl$checkTokenPair$2(this.this$0, this.$chainId, this.$currencyTokenAddress, this.$transactionTokenAddress, this.$userUniqueId, this.$accountId, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super ResponseData<ValidateTokensResponse>> continuation) {
        return ((MemeCoinRepositoryImpl$checkTokenPair$2) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC23234huQ interfaceC23234huQ = this.this$0.KWHzl;
            String str = this.$chainId;
            String str2 = this.$currencyTokenAddress;
            String str3 = this.$transactionTokenAddress;
            String str4 = this.$userUniqueId;
            String str5 = this.$accountId;
            int tokenListType = TradingBizType.Meme.toTokenListType();
            this.label = 1;
            obj = interfaceC23234huQ.EZpvd(str, str2, str3, str4, str5, String.valueOf(tokenListType), this);
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
