package com.okinc.business.invest_biz.data.repository.defi_dashboard;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes6.dex */
public final class DashboardRepositoryImpl$getProtocolDetails$2$fetchAndCacheFromServer$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DashboardRepositoryImpl$getProtocolDetails$2$fetchAndCacheFromServer$1(Continuation<? super DashboardRepositoryImpl$getProtocolDetails$2$fetchAndCacheFromServer$1> continuation) {
        super(continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return DashboardRepositoryImpl$getProtocolDetails$2.invokeSuspend$fetchAndCacheFromServer(null, null, null, null, null, this);
    }
}
