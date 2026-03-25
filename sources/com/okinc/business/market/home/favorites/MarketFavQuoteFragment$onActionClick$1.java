package com.okinc.business.market.home.favorites;

import com.okinc.business.market.bean.CoinQuote;
import com.okinc.market.watch.data.MarketUserFavorite;
import com.okinc.okmarket.viewmodel.MarketHomeV2ViewModel;
import com.okinc.unify_trade.biz.BizInstrument;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C46688tbr;
import o.C56390yDp;
import o.C56391yDq;
import o.C56423yEv;
import o.C56442yFn;
import o.qWJ;
import o.qWK;

/* JADX INFO: loaded from: classes7.dex */
public final class MarketFavQuoteFragment$onActionClick$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Object $actionCoinQuote;
    final /* synthetic */ String $bizType;
    final /* synthetic */ String $tokenPair;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ MarketFavQuoteFragment this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketFavQuoteFragment$onActionClick$1(Object obj, MarketFavQuoteFragment marketFavQuoteFragment, String str, String str2, Continuation<? super MarketFavQuoteFragment$onActionClick$1> continuation) {
        super(2, continuation);
        this.$actionCoinQuote = obj;
        this.this$0 = marketFavQuoteFragment;
        this.$tokenPair = str;
        this.$bizType = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MarketFavQuoteFragment$onActionClick$1(this.$actionCoinQuote, this.this$0, this.$tokenPair, this.$bizType, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MarketFavQuoteFragment$onActionClick$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        MarketUserFavorite marketUserFavoriteFIwbmz;
        MarketUserFavorite marketUserFavorite;
        MarketHomeV2ViewModel marketHomeV2ViewModel;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (Throwable th) {
            Result.Application application = Result.Companion;
            Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Object obj2 = this.$actionCoinQuote;
            if (obj2 instanceof CoinQuote) {
                BizInstrument bizInstrumentAEQbTJ = this.this$0.ejfBZ().AEQbTJ(((CoinQuote) this.$actionCoinQuote).getInstId(), ((CoinQuote) this.$actionCoinQuote).getInstType());
                marketUserFavoriteFIwbmz = bizInstrumentAEQbTJ != null ? qWJ.toMarketUserFavorite$default(bizInstrumentAEQbTJ, null, 1, null) : null;
            } else {
                if (!(obj2 instanceof qWK)) {
                    return Unit.INSTANCE;
                }
                marketUserFavoriteFIwbmz = ((qWK) obj2).fIwbmz();
            }
            C46688tbr.KWHzl.KWHzl("Home_Fav", C56423yEv.EZpvd(C56390yDp.OLrzqt("remove fav", this.$tokenPair + "-" + this.$bizType)));
            MarketFavQuoteFragment marketFavQuoteFragment = this.this$0;
            Result.Application application2 = Result.Companion;
            MarketHomeV2ViewModel marketHomeV2ViewModelEjfBZ = marketFavQuoteFragment.ejfBZ();
            MarketHomeV2ViewModel marketHomeV2ViewModelEjfBZ2 = marketFavQuoteFragment.ejfBZ();
            this.L$0 = marketUserFavoriteFIwbmz;
            this.L$1 = marketHomeV2ViewModelEjfBZ;
            this.label = 1;
            Object objAEQbTJ = marketHomeV2ViewModelEjfBZ2.AEQbTJ(this);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
            marketUserFavorite = marketUserFavoriteFIwbmz;
            obj = objAEQbTJ;
            marketHomeV2ViewModel = marketHomeV2ViewModelEjfBZ;
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                Result.m7377constructorimpl(Unit.INSTANCE);
                return Unit.INSTANCE;
            }
            marketHomeV2ViewModel = (MarketHomeV2ViewModel) this.L$1;
            marketUserFavorite = (MarketUserFavorite) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        this.L$0 = null;
        this.L$1 = null;
        this.label = 2;
        if (marketHomeV2ViewModel.AEQbTJ(marketUserFavorite, (String) obj, this) == objCopydefault) {
            return objCopydefault;
        }
        Result.m7377constructorimpl(Unit.INSTANCE);
        return Unit.INSTANCE;
    }
}
