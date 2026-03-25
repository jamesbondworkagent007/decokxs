package com.okinc.business.trade.features.home.advanced.viewmodel.delegate;

import androidx.fragment.app.FragmentActivity;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C28231kTt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class AdvancedOrderSubmissionDelegate$submitTeeLimitOrder$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ C28231kTt this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvancedOrderSubmissionDelegate$submitTeeLimitOrder$1(C28231kTt c28231kTt, Continuation<? super AdvancedOrderSubmissionDelegate$submitTeeLimitOrder$1> continuation) {
        super(continuation);
        this.this$0 = c28231kTt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.EZpvd((FragmentActivity) null, (C28231kTt.Activity) null, (C28231kTt.ActionBar) null, false, (Continuation<? super Unit>) this);
    }
}
