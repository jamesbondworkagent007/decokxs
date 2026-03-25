package com.okinc.business.market.features.home_favorite_list.ui;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C28425kaY;

/* JADX INFO: loaded from: classes7.dex */
public final class HomeFavoriteListFragment$initView$$inlined$filter$1$2$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ C28425kaY.TaskDescription.AnonymousClass3 this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeFavoriteListFragment$initView$$inlined$filter$1$2$1(C28425kaY.TaskDescription.AnonymousClass3 anonymousClass3, Continuation continuation) {
        super(continuation);
        this.this$0 = anonymousClass3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit(null, this);
    }
}
