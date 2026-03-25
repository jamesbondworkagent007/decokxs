package com.okinc.business.invest_biz.ui.screens.home;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class InvestHomeV2ViewModel$getTokenDetails$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ InvestHomeV2ViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestHomeV2ViewModel$getTokenDetails$1(InvestHomeV2ViewModel investHomeV2ViewModel, Continuation<? super InvestHomeV2ViewModel$getTokenDetails$1> continuation) {
        super(continuation);
        this.this$0 = investHomeV2ViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.AEQbTJ((Continuation<? super Unit>) this);
    }
}
