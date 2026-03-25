package com.okinc.business.market.home.favorites;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C27807kEa;
import o.C46688tbr;
import o.C56390yDp;
import o.C56391yDq;
import o.C56423yEv;
import o.C56442yFn;
import o.InterfaceC27808kEb;

/* JADX INFO: loaded from: classes7.dex */
public final class MarketFavQuoteFragment$itemMoreClick$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $reportTrack;
    int label;
    final /* synthetic */ MarketFavQuoteFragment this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketFavQuoteFragment$itemMoreClick$1(MarketFavQuoteFragment marketFavQuoteFragment, boolean z, Continuation<? super MarketFavQuoteFragment$itemMoreClick$1> continuation) {
        super(2, continuation);
        this.this$0 = marketFavQuoteFragment;
        this.$reportTrack = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MarketFavQuoteFragment$itemMoreClick$1(this.this$0, this.$reportTrack, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MarketFavQuoteFragment$itemMoreClick$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            MarketFavQuoteFragment marketFavQuoteFragment = this.this$0;
            this.label = 1;
            obj = marketFavQuoteFragment.EZpvd((Continuation<? super String>) this);
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
            interfaceC27808kEbEZpvd.OLrzqt("favorite", str);
        }
        if (this.$reportTrack) {
            C46688tbr.KWHzl.KWHzl("Home_Fav", C56423yEv.EZpvd(C56390yDp.OLrzqt("Home_Fav_View_More", str)));
        }
        return Unit.INSTANCE;
    }
}
