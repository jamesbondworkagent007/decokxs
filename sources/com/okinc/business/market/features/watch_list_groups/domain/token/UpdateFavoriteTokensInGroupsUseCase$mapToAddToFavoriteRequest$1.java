package com.okinc.business.market.features.watch_list_groups.domain.token;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C27770kCs;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class UpdateFavoriteTokensInGroupsUseCase$mapToAddToFavoriteRequest$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ C27770kCs this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdateFavoriteTokensInGroupsUseCase$mapToAddToFavoriteRequest$1(C27770kCs c27770kCs, Continuation<? super UpdateFavoriteTokensInGroupsUseCase$mapToAddToFavoriteRequest$1> continuation) {
        super(continuation);
        this.this$0 = c27770kCs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.OLrzqt(null, null, this);
    }
}
