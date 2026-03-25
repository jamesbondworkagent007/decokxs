package com.okinc.business.market.features.home_favorite_list.ui;

import com.okinc.business.market.features.home_token_list.domain.HomeToken;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C56442yFn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class HomeFavoriteListViewModel$pinWatchlistItem$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ HomeFavoriteListViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeFavoriteListViewModel$pinWatchlistItem$1(HomeFavoriteListViewModel homeFavoriteListViewModel, Continuation<? super HomeFavoriteListViewModel$pinWatchlistItem$1> continuation) {
        super(continuation);
        this.this$0 = homeFavoriteListViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objOLrzqt = this.this$0.OLrzqt((HomeToken) null, this);
        return objOLrzqt == C56442yFn.copydefault() ? objOLrzqt : Result.m7376boximpl(objOLrzqt);
    }
}
