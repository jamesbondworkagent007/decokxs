package com.okinc.business.invest_biz.data.repository.product_details;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C23682iFk;
import o.iEP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class ProductDetailsRepositoryImpl$getProductDetailsAndBonusInternally$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ iEP this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductDetailsRepositoryImpl$getProductDetailsAndBonusInternally$1(iEP iep, Continuation<? super ProductDetailsRepositoryImpl$getProductDetailsAndBonusInternally$1> continuation) {
        super(continuation);
        this.this$0 = iep;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.AEQbTJ((C23682iFk) null, this);
    }
}
