package com.okinc.business.web3pay.lib.features.account;

import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C31275lqu;
import o.C56442yFn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class AccountRepositoryImpl$getUserKycInfo$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ C31275lqu this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountRepositoryImpl$getUserKycInfo$1(C31275lqu c31275lqu, Continuation<? super AccountRepositoryImpl$getUserKycInfo$1> continuation) {
        super(continuation);
        this.this$0 = c31275lqu;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objValueOf = this.this$0.valueOf(this);
        return objValueOf == C56442yFn.copydefault() ? objValueOf : Result.m7376boximpl(objValueOf);
    }
}
