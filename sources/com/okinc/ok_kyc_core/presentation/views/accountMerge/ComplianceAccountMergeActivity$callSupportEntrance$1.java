package com.okinc.ok_kyc_core.presentation.views.accountMerge;

import com.okinc.biz.model.SupportService;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.rQV;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class ComplianceAccountMergeActivity$callSupportEntrance$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ rQV this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComplianceAccountMergeActivity$callSupportEntrance$1(rQV rqv, Continuation<? super ComplianceAccountMergeActivity$callSupportEntrance$1> continuation) {
        super(continuation);
        this.this$0 = rqv;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.EZpvd((String) null, (Continuation<? super SupportService>) this);
    }
}
