package com.okinc.business.defi.wallet.home.usdgActivity.data.repository;

import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C18174fdS;
import o.C56442yFn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class WalletUsdgActivityRepository$queryAddressRegisterStatus$1 extends ContinuationImpl {
    public long J$0;
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ C18174fdS this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletUsdgActivityRepository$queryAddressRegisterStatus$1(C18174fdS c18174fdS, Continuation<? super WalletUsdgActivityRepository$queryAddressRegisterStatus$1> continuation) {
        super(continuation);
        this.this$0 = c18174fdS;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objOLrzqt = this.this$0.OLrzqt(0L, null, this);
        return objOLrzqt == C56442yFn.copydefault() ? objOLrzqt : Result.m7376boximpl(objOLrzqt);
    }
}
