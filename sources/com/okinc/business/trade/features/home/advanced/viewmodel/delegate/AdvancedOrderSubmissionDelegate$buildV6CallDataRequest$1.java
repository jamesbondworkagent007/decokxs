package com.okinc.business.trade.features.home.advanced.viewmodel.delegate;

import com.okinc.business.dex.trade.core.domain.model.V6BaseQuoteResponse;
import com.okinc.business.dex.trade.core.domain.model.V6CalldataRequest;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C28231kTt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class AdvancedOrderSubmissionDelegate$buildV6CallDataRequest$1 extends ContinuationImpl {
    public int I$0;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public Object L$5;
    public Object L$6;
    public Object L$7;
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ C28231kTt this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvancedOrderSubmissionDelegate$buildV6CallDataRequest$1(C28231kTt c28231kTt, Continuation<? super AdvancedOrderSubmissionDelegate$buildV6CallDataRequest$1> continuation) {
        super(continuation);
        this.this$0 = c28231kTt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.EZpvd((V6BaseQuoteResponse) null, (C28231kTt.Activity) null, (String) null, (Continuation<? super V6CalldataRequest>) this);
    }
}
