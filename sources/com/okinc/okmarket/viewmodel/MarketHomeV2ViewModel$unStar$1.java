package com.okinc.okmarket.viewmodel;

import com.okinc.market.watch.data.MarketUserFavorite;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class MarketHomeV2ViewModel$unStar$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ MarketHomeV2ViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketHomeV2ViewModel$unStar$1(MarketHomeV2ViewModel marketHomeV2ViewModel, Continuation<? super MarketHomeV2ViewModel$unStar$1> continuation) {
        super(continuation);
        this.this$0 = marketHomeV2ViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.AEQbTJ((MarketUserFavorite) null, (String) null, this);
    }
}
