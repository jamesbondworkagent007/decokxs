package com.okinc.business.market.home.favorites;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class MarketFavQuoteFragment$jumpToMarkets$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ MarketFavQuoteFragment this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketFavQuoteFragment$jumpToMarkets$1(MarketFavQuoteFragment marketFavQuoteFragment, Continuation<? super MarketFavQuoteFragment$jumpToMarkets$1> continuation) {
        super(continuation);
        this.this$0 = marketFavQuoteFragment;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.EZpvd((Continuation<? super String>) this);
    }
}
