package com.okinc.business.market.home.favorites;

import com.okinc.business.market.bean.CoinQuote;
import com.okinc.okmarket.viewmodel.MarketHomeV2ViewModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C27807kEa;
import o.C27989kKu;
import o.C33129mqd;
import o.C46688tbr;
import o.C56390yDp;
import o.C56391yDq;
import o.C56424yEw;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC27808kEb;

/* JADX INFO: loaded from: classes7.dex */
public final class MarketFavQuoteFragment$itemClick$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ CoinQuote $item;
    final /* synthetic */ int $position;
    int label;
    final /* synthetic */ MarketFavQuoteFragment this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketFavQuoteFragment$itemClick$1(MarketFavQuoteFragment marketFavQuoteFragment, int i, CoinQuote coinQuote, Continuation<? super MarketFavQuoteFragment$itemClick$1> continuation) {
        super(2, continuation);
        this.this$0 = marketFavQuoteFragment;
        this.$position = i;
        this.$item = coinQuote;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MarketFavQuoteFragment$itemClick$1(this.this$0, this.$position, this.$item, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MarketFavQuoteFragment$itemClick$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            MarketHomeV2ViewModel marketHomeV2ViewModelEjfBZ = this.this$0.ejfBZ();
            this.label = 1;
            obj = marketHomeV2ViewModelEjfBZ.AEQbTJ(this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        String str = (String) obj;
        InterfaceC27808kEb interfaceC27808kEbEZpvd = C27807kEa.EZpvd(this.this$0);
        if (interfaceC27808kEbEZpvd != null) {
            String strGEmmrt = C33129mqd.gEmmrt(C56443yFo.AEQbTJ(this.$position + 1));
            String instId = this.$item.getInstId();
            String str2 = C27989kKu.Companion.AkhnZx().get(this.$item.isPreMarket() ? "pre_market" : this.$item.getInstType());
            if (str2 == null) {
                str2 = "";
            }
            InterfaceC27808kEb.StateListAnimator.trackRankingTradingPairClick$default(interfaceC27808kEbEZpvd, "favorite", str, strGEmmrt, instId, str2, null, null, 96, null);
        }
        C46688tbr.KWHzl.KWHzl("Home_Fav", C56424yEw.gEmmrt(C56390yDp.OLrzqt("sub_tab", str), C56390yDp.OLrzqt("deal_name", this.$item.getInstId())));
        return Unit.INSTANCE;
    }
}
