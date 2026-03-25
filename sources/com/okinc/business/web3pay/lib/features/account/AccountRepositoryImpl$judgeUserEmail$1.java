package com.okinc.business.web3pay.lib.features.account;

import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C31275lqu;
import o.C56442yFn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class AccountRepositoryImpl$judgeUserEmail$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ C31275lqu this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountRepositoryImpl$judgeUserEmail$1(C31275lqu c31275lqu, Continuation<? super AccountRepositoryImpl$judgeUserEmail$1> continuation) {
        super(continuation);
        this.this$0 = c31275lqu;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objDjBIcL = this.this$0.djBIcL(this);
        return objDjBIcL == C56442yFn.copydefault() ? objDjBIcL : Result.m7376boximpl(objDjBIcL);
    }
}
