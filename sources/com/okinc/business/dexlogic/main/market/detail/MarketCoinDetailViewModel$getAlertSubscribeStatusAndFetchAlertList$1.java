package com.okinc.business.dexlogic.main.market.detail;

import com.okinc.business.market.data.model.alert.CheckSubscribeRequest;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C25798jGt;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;

/* JADX INFO: loaded from: classes6.dex */
public final class MarketCoinDetailViewModel$getAlertSubscribeStatusAndFetchAlertList$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $chainId;
    final /* synthetic */ String $deviceId;
    final /* synthetic */ String $tokenAddress;
    int label;
    final /* synthetic */ MarketCoinDetailViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketCoinDetailViewModel$getAlertSubscribeStatusAndFetchAlertList$1(MarketCoinDetailViewModel marketCoinDetailViewModel, String str, String str2, String str3, Continuation<? super MarketCoinDetailViewModel$getAlertSubscribeStatusAndFetchAlertList$1> continuation) {
        super(2, continuation);
        this.this$0 = marketCoinDetailViewModel;
        this.$tokenAddress = str;
        this.$chainId = str2;
        this.$deviceId = str3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MarketCoinDetailViewModel$getAlertSubscribeStatusAndFetchAlertList$1(this.this$0, this.$tokenAddress, this.$chainId, this.$deviceId, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MarketCoinDetailViewModel$getAlertSubscribeStatusAndFetchAlertList$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault;
        Object objCopydefault2 = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C25798jGt c25798jGt = this.this$0.DbNXlk;
            CheckSubscribeRequest checkSubscribeRequest = new CheckSubscribeRequest(this.$tokenAddress, this.$chainId, this.$deviceId);
            this.label = 1;
            objCopydefault = c25798jGt.copydefault(checkSubscribeRequest, this);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objCopydefault = ((Result) obj).m7386unboximpl();
        }
        MarketCoinDetailViewModel marketCoinDetailViewModel = this.this$0;
        if (Result.m7384isSuccessimpl(objCopydefault)) {
            marketCoinDetailViewModel.copydefault.setValue(C56443yFo.KWHzl(((Number) objCopydefault).intValue() == 1));
        }
        MarketCoinDetailViewModel marketCoinDetailViewModel2 = this.this$0;
        if (Result.m7380exceptionOrNullimpl(objCopydefault) != null) {
            marketCoinDetailViewModel2.copydefault.setValue(C56443yFo.KWHzl(false));
        }
        return Unit.INSTANCE;
    }
}
