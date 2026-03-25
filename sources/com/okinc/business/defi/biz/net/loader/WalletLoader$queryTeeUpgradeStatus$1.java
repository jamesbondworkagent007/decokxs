package com.okinc.business.defi.biz.net.loader;

import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C13934dbu;
import o.C56442yFn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class WalletLoader$queryTeeUpgradeStatus$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ C13934dbu this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletLoader$queryTeeUpgradeStatus$1(C13934dbu c13934dbu, Continuation<? super WalletLoader$queryTeeUpgradeStatus$1> continuation) {
        super(continuation);
        this.this$0 = c13934dbu;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objFetchVPNInfo = this.this$0.fetchVPNInfo(null, this);
        return objFetchVPNInfo == C56442yFn.copydefault() ? objFetchVPNInfo : Result.m7376boximpl(objFetchVPNInfo);
    }
}
