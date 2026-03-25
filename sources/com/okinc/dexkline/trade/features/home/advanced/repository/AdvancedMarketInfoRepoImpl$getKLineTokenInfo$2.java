package com.okinc.dexkline.trade.features.home.advanced.repository;

import com.okinc.dexkline.dexlogic.main.market.bean.LatestMarketInfoBean;
import com.okinc.network.okg.response.ResponseData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import o.C34678ngd;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC32162mRu;

/* JADX INFO: loaded from: classes8.dex */
public final class AdvancedMarketInfoRepoImpl$getKLineTokenInfo$2 extends SuspendLambda implements Function1<Continuation<? super ResponseData<LatestMarketInfoBean>>, Object> {
    final /* synthetic */ String $chainId;
    final /* synthetic */ String $tokenAddress;
    final /* synthetic */ String $walletAddress;
    final /* synthetic */ String $walletId;
    int label;
    final /* synthetic */ C34678ngd this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvancedMarketInfoRepoImpl$getKLineTokenInfo$2(C34678ngd c34678ngd, String str, String str2, String str3, String str4, Continuation<? super AdvancedMarketInfoRepoImpl$getKLineTokenInfo$2> continuation) {
        super(1, continuation);
        this.this$0 = c34678ngd;
        this.$tokenAddress = str;
        this.$walletId = str2;
        this.$chainId = str3;
        this.$walletAddress = str4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new AdvancedMarketInfoRepoImpl$getKLineTokenInfo$2(this.this$0, this.$tokenAddress, this.$walletId, this.$chainId, this.$walletAddress, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super ResponseData<LatestMarketInfoBean>> continuation) {
        return ((AdvancedMarketInfoRepoImpl$getKLineTokenInfo$2) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC32162mRu interfaceC32162mRu = this.this$0.AEQbTJ;
            String str = this.$tokenAddress;
            String str2 = this.$walletId;
            String str3 = this.$chainId;
            String str4 = this.$walletAddress;
            this.label = 1;
            obj = interfaceC32162mRu.AEQbTJ(str, str2, str3, str4, this);
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
