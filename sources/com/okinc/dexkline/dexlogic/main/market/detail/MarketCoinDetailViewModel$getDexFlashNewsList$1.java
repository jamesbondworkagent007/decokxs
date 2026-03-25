package com.okinc.dexkline.dexlogic.main.market.detail;

import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56390yDp;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.mWA;
import o.pUU;
import o.yDY;

/* JADX INFO: loaded from: classes8.dex */
public final class MarketCoinDetailViewModel$getDexFlashNewsList$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $chainId;
    final /* synthetic */ String $token;
    final /* synthetic */ String $tokenAddress;
    int label;
    final /* synthetic */ MarketCoinDetailViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketCoinDetailViewModel$getDexFlashNewsList$1(MarketCoinDetailViewModel marketCoinDetailViewModel, String str, String str2, String str3, Continuation<? super MarketCoinDetailViewModel$getDexFlashNewsList$1> continuation) {
        super(2, continuation);
        this.this$0 = marketCoinDetailViewModel;
        this.$chainId = str;
        this.$tokenAddress = str2;
        this.$token = str3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MarketCoinDetailViewModel$getDexFlashNewsList$1(this.this$0, this.$chainId, this.$tokenAddress, this.$token, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MarketCoinDetailViewModel$getDexFlashNewsList$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objAEQbTJ;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            mWA mwa = this.this$0.ejfBZ;
            String str = this.$chainId;
            String str2 = this.$tokenAddress;
            String str3 = this.$token;
            this.label = 1;
            objAEQbTJ = mwa.AEQbTJ(str, str2, str3, (56 & 8) != 0 ? null : null, (56 & 16) != 0 ? null : null, (56 & 32) != 0 ? 20 : null, this);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objAEQbTJ = ((Result) obj).m7386unboximpl();
        }
        MarketCoinDetailViewModel marketCoinDetailViewModel = this.this$0;
        if (Result.m7384isSuccessimpl(objAEQbTJ)) {
            marketCoinDetailViewModel.KWHzl().postValue(C56390yDp.OLrzqt(C56443yFo.KWHzl(marketCoinDetailViewModel.KWHzl().getValue() == null), (List) objAEQbTJ));
        }
        MarketCoinDetailViewModel marketCoinDetailViewModel2 = this.this$0;
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objAEQbTJ);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.copydefault("MarketCoinDetailViewModel", "getDexFlashNewsList error: " + thM7380exceptionOrNullimpl.getMessage());
            marketCoinDetailViewModel2.KWHzl().postValue(C56390yDp.OLrzqt(C56443yFo.KWHzl(false), yDY.AhwBna()));
        }
        return Unit.INSTANCE;
    }
}
