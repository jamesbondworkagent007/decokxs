package com.okinc.business.trade.features.home.advanced.usecase;

import androidx.fragment.app.FragmentActivity;
import com.okinc.business.dex.trade.core.domain.model.V6BaseQuoteResponse;
import com.okinc.business.dex.trade.core.domain.model.V6CalldataResponseData;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C56442yFn;
import o.InterfaceC9740bbL;
import o.kRB;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class AdvancedMarketTxV6UseCase$submitOrderSingleSign$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ kRB this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvancedMarketTxV6UseCase$submitOrderSingleSign$1(kRB krb, Continuation<? super AdvancedMarketTxV6UseCase$submitOrderSingleSign$1> continuation) {
        super(continuation);
        this.this$0 = krb;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objKWHzl = this.this$0.KWHzl((V6BaseQuoteResponse) null, (V6CalldataResponseData) null, false, (FragmentActivity) null, false, (InterfaceC9740bbL.TaskDescription) null, (Continuation<? super Result<String>>) this);
        return objKWHzl == C56442yFn.copydefault() ? objKWHzl : Result.m7376boximpl(objKWHzl);
    }
}
