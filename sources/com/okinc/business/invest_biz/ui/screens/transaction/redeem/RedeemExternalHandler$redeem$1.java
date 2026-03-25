package com.okinc.business.invest_biz.ui.screens.transaction.redeem;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.AbstractActivityC33041mov;
import o.C25476ixT;
import o.C26700jhK;
import o.InterfaceC25422iwS;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class RedeemExternalHandler$redeem$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ C26700jhK this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RedeemExternalHandler$redeem$1(C26700jhK c26700jhK, Continuation<? super RedeemExternalHandler$redeem$1> continuation) {
        super(continuation);
        this.this$0 = c26700jhK;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.EZpvd((AbstractActivityC33041mov) null, (C25476ixT) null, (InterfaceC25422iwS) null, this);
    }
}
