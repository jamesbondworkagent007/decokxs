package com.okinc.business.dex.trade.common.boost.repository;

import com.okinc.business.dex.trade.common.boost.model.BoostEstimateVolumeParam;
import com.okinc.business.dex.trade.common.boost.model.BoostEstimateVolumeResponse;
import com.okinc.network.okg.response.ResponseData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import o.C19754gOb;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC23234huQ;

/* JADX INFO: loaded from: classes5.dex */
public final class BoostVolumeRepositoryImpl$estimateBoostVolume$2 extends SuspendLambda implements Function1<Continuation<? super ResponseData<BoostEstimateVolumeResponse>>, Object> {
    final /* synthetic */ int $chainId;
    final /* synthetic */ String $fromAmount;
    final /* synthetic */ String $fromTokenAddress;
    final /* synthetic */ String $refCode;
    final /* synthetic */ String $toAmount;
    final /* synthetic */ String $toTokenAddress;
    final /* synthetic */ String $tradeMode;
    final /* synthetic */ String $userWalletAddress;
    int label;
    final /* synthetic */ C19754gOb this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BoostVolumeRepositoryImpl$estimateBoostVolume$2(C19754gOb c19754gOb, int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, Continuation<? super BoostVolumeRepositoryImpl$estimateBoostVolume$2> continuation) {
        super(1, continuation);
        this.this$0 = c19754gOb;
        this.$chainId = i;
        this.$fromTokenAddress = str;
        this.$toTokenAddress = str2;
        this.$fromAmount = str3;
        this.$toAmount = str4;
        this.$tradeMode = str5;
        this.$userWalletAddress = str6;
        this.$refCode = str7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new BoostVolumeRepositoryImpl$estimateBoostVolume$2(this.this$0, this.$chainId, this.$fromTokenAddress, this.$toTokenAddress, this.$fromAmount, this.$toAmount, this.$tradeMode, this.$userWalletAddress, this.$refCode, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super ResponseData<BoostEstimateVolumeResponse>> continuation) {
        return ((BoostVolumeRepositoryImpl$estimateBoostVolume$2) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC23234huQ interfaceC23234huQ = this.this$0.KWHzl;
            BoostEstimateVolumeParam boostEstimateVolumeParam = new BoostEstimateVolumeParam(this.$chainId, this.$fromTokenAddress, this.$toTokenAddress, this.$fromAmount, this.$toAmount, this.$tradeMode, this.$userWalletAddress, this.$refCode);
            this.label = 1;
            obj = interfaceC23234huQ.KWHzl(boostEstimateVolumeParam, this);
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
