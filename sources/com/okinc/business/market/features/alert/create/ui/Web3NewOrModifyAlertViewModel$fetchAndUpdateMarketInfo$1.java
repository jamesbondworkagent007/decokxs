package com.okinc.business.market.features.alert.create.ui;

import com.okinc.business.market.data.model.alert.TokenInfoForAlert;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.jGX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class Web3NewOrModifyAlertViewModel$fetchAndUpdateMarketInfo$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ jGX this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Web3NewOrModifyAlertViewModel$fetchAndUpdateMarketInfo$1(jGX jgx, Continuation<? super Web3NewOrModifyAlertViewModel$fetchAndUpdateMarketInfo$1> continuation) {
        super(continuation);
        this.this$0 = jgx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.copydefault((TokenInfoForAlert) null, (Continuation<? super Unit>) this);
    }
}
