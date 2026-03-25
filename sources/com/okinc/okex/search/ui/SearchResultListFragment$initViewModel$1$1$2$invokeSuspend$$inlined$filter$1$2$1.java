package com.okinc.okex.search.ui;

import com.okinc.okex.search.ui.SearchResultListFragment$initViewModel$1;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes19.dex */
public final class SearchResultListFragment$initViewModel$1$1$2$invokeSuspend$$inlined$filter$1$2$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SearchResultListFragment$initViewModel$1.AnonymousClass1.AnonymousClass2.Activity.AnonymousClass3 this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchResultListFragment$initViewModel$1$1$2$invokeSuspend$$inlined$filter$1$2$1(SearchResultListFragment$initViewModel$1.AnonymousClass1.AnonymousClass2.Activity.AnonymousClass3 anonymousClass3, Continuation continuation) {
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
