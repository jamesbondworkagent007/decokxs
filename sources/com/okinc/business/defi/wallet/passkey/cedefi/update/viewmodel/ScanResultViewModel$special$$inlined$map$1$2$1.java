package com.okinc.business.defi.wallet.passkey.cedefi.update.viewmodel;

import com.okinc.business.defi.wallet.passkey.cedefi.update.viewmodel.ScanResultViewModel;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes5.dex */
public final class ScanResultViewModel$special$$inlined$map$1$2$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ScanResultViewModel.StateListAnimator.AnonymousClass4 this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScanResultViewModel$special$$inlined$map$1$2$1(ScanResultViewModel.StateListAnimator.AnonymousClass4 anonymousClass4, Continuation continuation) {
        super(continuation);
        this.this$0 = anonymousClass4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit(null, this);
    }
}
