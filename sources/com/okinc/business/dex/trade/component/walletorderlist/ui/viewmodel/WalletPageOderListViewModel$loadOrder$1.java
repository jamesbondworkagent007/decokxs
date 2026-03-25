package com.okinc.business.dex.trade.component.walletorderlist.ui.viewmodel;

import com.okinc.business.dex.trade.order.domain.model.OpenOrderData;
import com.okinc.business.dex.trade.order.domain.model.OrderListPagerResult;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C56442yFn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class WalletPageOderListViewModel$loadOrder$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ WalletPageOderListViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletPageOderListViewModel$loadOrder$1(WalletPageOderListViewModel walletPageOderListViewModel, Continuation<? super WalletPageOderListViewModel$loadOrder$1> continuation) {
        super(continuation);
        this.this$0 = walletPageOderListViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objCopydefault = this.this$0.copydefault((Continuation<? super Result<OrderListPagerResult<OpenOrderData>>>) this);
        return objCopydefault == C56442yFn.copydefault() ? objCopydefault : Result.m7376boximpl(objCopydefault);
    }
}
