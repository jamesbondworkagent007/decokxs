package com.okinc.business.invest_biz.ui.viewmodel.token;

import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C27117jpD;
import o.C56442yFn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class DeFiTokenInvestViewModel$executeInvestFlow$1 extends ContinuationImpl {
    public long J$0;
    public Object L$0;
    public Object L$1;
    public boolean Z$0;
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ C27117jpD this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeFiTokenInvestViewModel$executeInvestFlow$1(C27117jpD c27117jpD, Continuation<? super DeFiTokenInvestViewModel$executeInvestFlow$1> continuation) {
        super(continuation);
        this.this$0 = c27117jpD;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objOLrzqt = this.this$0.OLrzqt(0L, null, false, false, null, this);
        return objOLrzqt == C56442yFn.copydefault() ? objOLrzqt : Result.m7376boximpl(objOLrzqt);
    }
}
