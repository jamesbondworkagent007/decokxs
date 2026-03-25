package com.okinc.ok_kyc_core.impl;

import android.app.Activity;
import com.okinc.ok_kyc_core.data.efr.EFRData;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.InterfaceC42438rSw;
import o.rCV;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class OKComplianceServiceImpl$initEFR$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ rCV this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OKComplianceServiceImpl$initEFR$1(rCV rcv, Continuation<? super OKComplianceServiceImpl$initEFR$1> continuation) {
        super(continuation);
        this.this$0 = rcv;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.OLrzqt((Activity) null, (EFRData) null, (InterfaceC42438rSw) null, this);
    }
}
