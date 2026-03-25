package com.okinc.business.market.features.favorites.editing.domain.crypto;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C26119jSq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class RearrangeMarketFavoritesCryptosInGroupUseCase$onExecute$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ C26119jSq this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RearrangeMarketFavoritesCryptosInGroupUseCase$onExecute$1(C26119jSq c26119jSq, Continuation<? super RearrangeMarketFavoritesCryptosInGroupUseCase$onExecute$1> continuation) {
        super(continuation);
        this.this$0 = c26119jSq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.KWHzl(null, this);
    }
}
