package com.okinc.business.trade.features.home.meme.usecase.transaction.v6;

import androidx.fragment.app.FragmentActivity;
import com.okinc.business.dex.trade.core.domain.model.V6BaseQuoteResponse;
import com.okinc.business.trade.features.home.meme.domain.model.V6CalldataParams;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.AbstractC28328kXi;
import o.C56442yFn;
import o.InterfaceC9740bbL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class MemeV6MarketTxV6UseCase$submitOrder$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public Object L$5;
    public boolean Z$0;
    public boolean Z$1;
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ AbstractC28328kXi this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MemeV6MarketTxV6UseCase$submitOrder$1(AbstractC28328kXi abstractC28328kXi, Continuation<? super MemeV6MarketTxV6UseCase$submitOrder$1> continuation) {
        super(continuation);
        this.this$0 = abstractC28328kXi;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objKWHzl = this.this$0.KWHzl((V6BaseQuoteResponse) null, (String) null, false, 0, (FragmentActivity) null, (V6CalldataParams) null, false, (InterfaceC9740bbL.TaskDescription) null, (Continuation<? super Result<String>>) this);
        return objKWHzl == C56442yFn.copydefault() ? objKWHzl : Result.m7376boximpl(objKWHzl);
    }
}
