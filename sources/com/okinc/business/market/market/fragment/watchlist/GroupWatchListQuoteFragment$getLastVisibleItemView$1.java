package com.okinc.business.market.market.fragment.watchlist;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C27931kIq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class GroupWatchListQuoteFragment$getLastVisibleItemView$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ C27931kIq this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GroupWatchListQuoteFragment$getLastVisibleItemView$1(C27931kIq c27931kIq, Continuation<? super GroupWatchListQuoteFragment$getLastVisibleItemView$1> continuation) {
        super(continuation);
        this.this$0 = c27931kIq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.KWHzl((RecyclerView) null, (Continuation<? super View>) this);
    }
}
