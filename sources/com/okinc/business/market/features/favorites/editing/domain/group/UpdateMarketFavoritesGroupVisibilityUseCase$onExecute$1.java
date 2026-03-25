package com.okinc.business.market.features.favorites.editing.domain.group;

import java.util.List;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C26126jSx;
import o.C26170jUn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class UpdateMarketFavoritesGroupVisibilityUseCase$onExecute$1 extends ContinuationImpl {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ C26126jSx this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdateMarketFavoritesGroupVisibilityUseCase$onExecute$1(C26126jSx c26126jSx, Continuation<? super UpdateMarketFavoritesGroupVisibilityUseCase$onExecute$1> continuation) {
        super(continuation);
        this.this$0 = c26126jSx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.EZpvd((Pair<String, Boolean>) null, (Continuation<? super Pair<Pair<String, Boolean>, ? extends Pair<? extends List<C26170jUn>, ? extends List<C26170jUn>>>>) this);
    }
}
