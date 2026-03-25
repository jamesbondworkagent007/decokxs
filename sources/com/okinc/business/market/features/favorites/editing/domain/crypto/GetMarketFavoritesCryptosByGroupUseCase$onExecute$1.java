package com.okinc.business.market.features.favorites.editing.domain.crypto;

import java.util.List;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C26115jSm;
import o.C26170jUn;
import o.C26175jUs;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class GetMarketFavoritesCryptosByGroupUseCase$onExecute$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ C26115jSm this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetMarketFavoritesCryptosByGroupUseCase$onExecute$1(C26115jSm c26115jSm, Continuation<? super GetMarketFavoritesCryptosByGroupUseCase$onExecute$1> continuation) {
        super(continuation);
        this.this$0 = c26115jSm;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.KWHzl((String) null, (Continuation<? super Pair<C26170jUn, ? extends List<C26175jUs>>>) this);
    }
}
