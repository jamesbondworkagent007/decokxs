package com.okinc.business.invest_biz.ui.screens.defi_dashboard.use_case;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C26370jaz;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class DashboardTokenListUseCaseImpl$invoke$1 extends ContinuationImpl {
    public long J$0;
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ C26370jaz this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DashboardTokenListUseCaseImpl$invoke$1(C26370jaz c26370jaz, Continuation<? super DashboardTokenListUseCaseImpl$invoke$1> continuation) {
        super(continuation);
        this.this$0 = c26370jaz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.OLrzqt(null, 0L, this);
    }
}
