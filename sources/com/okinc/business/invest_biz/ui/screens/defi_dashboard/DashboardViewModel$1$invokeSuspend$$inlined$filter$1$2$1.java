package com.okinc.business.invest_biz.ui.screens.defi_dashboard;

import com.okinc.business.invest_biz.ui.screens.defi_dashboard.DashboardViewModel$1;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes6.dex */
public final class DashboardViewModel$1$invokeSuspend$$inlined$filter$1$2$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DashboardViewModel$1.StateListAnimator.AnonymousClass5 this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DashboardViewModel$1$invokeSuspend$$inlined$filter$1$2$1(DashboardViewModel$1.StateListAnimator.AnonymousClass5 anonymousClass5, Continuation continuation) {
        super(continuation);
        this.this$0 = anonymousClass5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit(null, this);
    }
}
