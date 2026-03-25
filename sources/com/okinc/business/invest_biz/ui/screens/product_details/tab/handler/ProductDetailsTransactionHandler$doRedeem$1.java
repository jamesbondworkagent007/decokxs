package com.okinc.business.invest_biz.ui.screens.product_details.tab.handler;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C26573jeq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class ProductDetailsTransactionHandler$doRedeem$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ C26573jeq this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductDetailsTransactionHandler$doRedeem$1(C26573jeq c26573jeq, Continuation<? super ProductDetailsTransactionHandler$doRedeem$1> continuation) {
        super(continuation);
        this.this$0 = c26573jeq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.EZpvd(null, false, null, this);
    }
}
