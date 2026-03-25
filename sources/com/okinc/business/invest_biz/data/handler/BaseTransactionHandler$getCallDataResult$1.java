package com.okinc.business.invest_biz.data.handler;

import com.okinc.business.invest_biz.data.bean.InvestCallDataResult;
import com.okinc.business.invest_biz.data.bean.InvestTxModel;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.AbstractC25522iyM;
import o.C56442yFn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class BaseTransactionHandler$getCallDataResult$1 extends ContinuationImpl {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ AbstractC25522iyM this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseTransactionHandler$getCallDataResult$1(AbstractC25522iyM abstractC25522iyM, Continuation<? super BaseTransactionHandler$getCallDataResult$1> continuation) {
        super(continuation);
        this.this$0 = abstractC25522iyM;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objEZpvd = this.this$0.EZpvd((InvestTxModel) null, (Continuation<? super Result<InvestCallDataResult>>) this);
        return objEZpvd == C56442yFn.copydefault() ? objEZpvd : Result.m7376boximpl(objEZpvd);
    }
}
