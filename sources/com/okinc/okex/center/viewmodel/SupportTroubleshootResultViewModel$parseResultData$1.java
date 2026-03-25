package com.okinc.okex.center.viewmodel;

import com.okinc.okex.center.bean.TroubleshootResultPageData;
import com.okinc.okex.center.ui.adapter.TroubleshootResultAdapter;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class SupportTroubleshootResultViewModel$parseResultData$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SupportTroubleshootResultViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SupportTroubleshootResultViewModel$parseResultData$1(SupportTroubleshootResultViewModel supportTroubleshootResultViewModel, Continuation<? super SupportTroubleshootResultViewModel$parseResultData$1> continuation) {
        super(continuation);
        this.this$0 = supportTroubleshootResultViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.OLrzqt((TroubleshootResultPageData) null, (Continuation<? super TroubleshootResultAdapter.TaskDescription>) this);
    }
}
