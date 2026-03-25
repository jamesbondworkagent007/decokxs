package com.okinc.business.market.features.favorites.editing.domain.group;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C26121jSs;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class CreateNewMarketFavoritesGroupUseCase$onExecute$1 extends ContinuationImpl {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ C26121jSs this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateNewMarketFavoritesGroupUseCase$onExecute$1(C26121jSs c26121jSs, Continuation<? super CreateNewMarketFavoritesGroupUseCase$onExecute$1> continuation) {
        super(continuation);
        this.this$0 = c26121jSs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.KWHzl(null, this);
    }
}
