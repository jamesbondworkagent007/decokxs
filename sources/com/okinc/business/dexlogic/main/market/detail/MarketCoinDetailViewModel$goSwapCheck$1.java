package com.okinc.business.dexlogic.main.market.detail;

import com.okinc.business.dexlogic.main.market.bean.CoinDetailTradeJumpBean;
import com.okinc.network.okg.response.OKServerException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C25624jAh;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC25627jAk;

/* JADX INFO: loaded from: classes6.dex */
public final class MarketCoinDetailViewModel$goSwapCheck$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $chainId;
    final /* synthetic */ Function1<CoinDetailTradeJumpBean, Unit> $openTrade;
    final /* synthetic */ String $tokenContractAddress;
    int label;
    final /* synthetic */ MarketCoinDetailViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.business.dexlogic.main.market.bean.CoinDetailTradeJumpBean, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MarketCoinDetailViewModel$goSwapCheck$1(MarketCoinDetailViewModel marketCoinDetailViewModel, String str, String str2, Function1<? super CoinDetailTradeJumpBean, Unit> function1, Continuation<? super MarketCoinDetailViewModel$goSwapCheck$1> continuation) {
        super(2, continuation);
        this.this$0 = marketCoinDetailViewModel;
        this.$chainId = str;
        this.$tokenContractAddress = str2;
        this.$openTrade = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MarketCoinDetailViewModel$goSwapCheck$1(this.this$0, this.$chainId, this.$tokenContractAddress, this.$openTrade, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MarketCoinDetailViewModel$goSwapCheck$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objEZpvd;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C25624jAh c25624jAh = this.this$0.uzCIH;
            String str = this.$chainId;
            String str2 = this.$tokenContractAddress;
            this.label = 1;
            objEZpvd = c25624jAh.EZpvd(str, str2, this);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objEZpvd = ((Result) obj).m7386unboximpl();
        }
        MarketCoinDetailViewModel marketCoinDetailViewModel = this.this$0;
        Function1<CoinDetailTradeJumpBean, Unit> function1 = this.$openTrade;
        if (Result.m7384isSuccessimpl(objEZpvd)) {
            InterfaceC25627jAk interfaceC25627jAk = (InterfaceC25627jAk) objEZpvd;
            marketCoinDetailViewModel.fJNWhG().postValue(C56443yFo.KWHzl(false));
            if (interfaceC25627jAk instanceof InterfaceC25627jAk.ActionBar) {
                function1.invoke(((InterfaceC25627jAk.ActionBar) interfaceC25627jAk).AEQbTJ());
            } else {
                if (!(interfaceC25627jAk instanceof InterfaceC25627jAk.Application)) {
                    throw new NoWhenBranchMatchedException();
                }
                marketCoinDetailViewModel.values().setValue(Unit.INSTANCE);
            }
        }
        MarketCoinDetailViewModel marketCoinDetailViewModel2 = this.this$0;
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objEZpvd);
        if (thM7380exceptionOrNullimpl != null) {
            marketCoinDetailViewModel2.fJNWhG().postValue(C56443yFo.KWHzl(false));
            if ((thM7380exceptionOrNullimpl instanceof OKServerException) && ((OKServerException) thM7380exceptionOrNullimpl).getCode() == 70002) {
                marketCoinDetailViewModel2.copydefault().postValue(C56443yFo.KWHzl(true));
            } else {
                marketCoinDetailViewModel2.values().setValue(Unit.INSTANCE);
            }
        }
        return Unit.INSTANCE;
    }
}
