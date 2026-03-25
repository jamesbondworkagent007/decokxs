package com.okinc.business.invest_biz.ui.screens.home;

import com.okinc.business.invest_biz.ui.screens.home.InvestHomeV2ViewModel;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes6.dex */
public final class InvestHomeV2ViewModel$special$$inlined$map$3$2$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ InvestHomeV2ViewModel.PendingIntent.AnonymousClass4 this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestHomeV2ViewModel$special$$inlined$map$3$2$1(InvestHomeV2ViewModel.PendingIntent.AnonymousClass4 anonymousClass4, Continuation continuation) {
        super(continuation);
        this.this$0 = anonymousClass4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit(null, this);
    }
}
