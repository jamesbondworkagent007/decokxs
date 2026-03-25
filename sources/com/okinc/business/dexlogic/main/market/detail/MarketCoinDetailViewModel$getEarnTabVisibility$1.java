package com.okinc.business.dexlogic.main.market.detail;

import androidx.lifecycle.MutableLiveData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C33129mqd;
import o.C43251rlk;
import o.C56391yDq;
import o.C56442yFn;
import o.C56524yIo;
import o.InterfaceC25429iwZ;

/* JADX INFO: loaded from: classes6.dex */
public final class MarketCoinDetailViewModel$getEarnTabVisibility$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $chainId;
    final /* synthetic */ String $tokenContractAddress;
    Object L$0;
    int label;
    final /* synthetic */ MarketCoinDetailViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketCoinDetailViewModel$getEarnTabVisibility$1(MarketCoinDetailViewModel marketCoinDetailViewModel, String str, String str2, Continuation<? super MarketCoinDetailViewModel$getEarnTabVisibility$1> continuation) {
        super(2, continuation);
        this.this$0 = marketCoinDetailViewModel;
        this.$chainId = str;
        this.$tokenContractAddress = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MarketCoinDetailViewModel$getEarnTabVisibility$1(this.this$0, this.$chainId, this.$tokenContractAddress, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MarketCoinDetailViewModel$getEarnTabVisibility$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        MutableLiveData mutableLiveData;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC25429iwZ interfaceC25429iwZ = (InterfaceC25429iwZ) C43251rlk.OLrzqt(C56524yIo.AEQbTJ(InterfaceC25429iwZ.class));
            if (interfaceC25429iwZ != null) {
                MarketCoinDetailViewModel marketCoinDetailViewModel = this.this$0;
                String str = this.$chainId;
                String str2 = this.$tokenContractAddress;
                MutableLiveData<Boolean> mutableLiveDataFIwbmz = marketCoinDetailViewModel.fIwbmz();
                long jValueOf = C33129mqd.valueOf(str);
                this.L$0 = mutableLiveDataFIwbmz;
                this.label = 1;
                obj = interfaceC25429iwZ.OLrzqt(jValueOf, str2, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
                mutableLiveData = mutableLiveDataFIwbmz;
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        mutableLiveData = (MutableLiveData) this.L$0;
        C56391yDq.AEQbTJ(obj);
        mutableLiveData.setValue(obj);
        return Unit.INSTANCE;
    }
}
