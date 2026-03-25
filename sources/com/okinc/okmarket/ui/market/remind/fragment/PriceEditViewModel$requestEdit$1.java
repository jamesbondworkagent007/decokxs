package com.okinc.okmarket.ui.market.remind.fragment;

import com.okinc.business.market.bean.TokenInfoForAlert;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class PriceEditViewModel$requestEdit$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PriceEditViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PriceEditViewModel$requestEdit$1(PriceEditViewModel priceEditViewModel, Continuation<? super PriceEditViewModel$requestEdit$1> continuation) {
        super(continuation);
        this.this$0 = priceEditViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.KWHzl(0, (TokenInfoForAlert) null, this);
    }
}
