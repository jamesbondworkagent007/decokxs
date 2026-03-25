package com.okinc.business.trade.features.home.advanced.repository;

import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.network.okg.response.ResponseData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC23234huQ;
import o.kQE;

/* JADX INFO: loaded from: classes7.dex */
public final class AdvancedPlaceOrderRepositoryImpl$getTokenInfo$2 extends SuspendLambda implements Function1<Continuation<? super ResponseData<DexMultiTokenInfoBean>>, Object> {
    final /* synthetic */ String $chainId;
    final /* synthetic */ String $tokenAddress;
    final /* synthetic */ String $userUniqueId;
    final /* synthetic */ String $userWalletAddress;
    final /* synthetic */ String $walletId;
    int label;
    final /* synthetic */ kQE this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvancedPlaceOrderRepositoryImpl$getTokenInfo$2(kQE kqe, String str, String str2, String str3, String str4, String str5, Continuation<? super AdvancedPlaceOrderRepositoryImpl$getTokenInfo$2> continuation) {
        super(1, continuation);
        this.this$0 = kqe;
        this.$chainId = str;
        this.$walletId = str2;
        this.$tokenAddress = str3;
        this.$userUniqueId = str4;
        this.$userWalletAddress = str5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new AdvancedPlaceOrderRepositoryImpl$getTokenInfo$2(this.this$0, this.$chainId, this.$walletId, this.$tokenAddress, this.$userUniqueId, this.$userWalletAddress, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super ResponseData<DexMultiTokenInfoBean>> continuation) {
        return ((AdvancedPlaceOrderRepositoryImpl$getTokenInfo$2) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC23234huQ interfaceC23234huQ = this.this$0.KWHzl;
            String str = this.$chainId;
            String str2 = this.$walletId;
            String str3 = this.$tokenAddress;
            String str4 = this.$userUniqueId;
            String str5 = this.$userWalletAddress;
            this.label = 1;
            obj = interfaceC23234huQ.OLrzqt(str, str2, str3, str4, str5, this);
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
