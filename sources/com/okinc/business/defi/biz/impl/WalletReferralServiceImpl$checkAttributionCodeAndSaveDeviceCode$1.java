package com.okinc.business.defi.biz.impl;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.cZS;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class WalletReferralServiceImpl$checkAttributionCodeAndSaveDeviceCode$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ cZS this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletReferralServiceImpl$checkAttributionCodeAndSaveDeviceCode$1(cZS czs, Continuation<? super WalletReferralServiceImpl$checkAttributionCodeAndSaveDeviceCode$1> continuation) {
        super(continuation);
        this.this$0 = czs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.copydefault(this);
    }
}
