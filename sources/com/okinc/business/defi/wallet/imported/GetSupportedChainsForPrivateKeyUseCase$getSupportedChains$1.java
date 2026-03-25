package com.okinc.business.defi.wallet.imported;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C18374fhG;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class GetSupportedChainsForPrivateKeyUseCase$getSupportedChains$1 extends ContinuationImpl {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ C18374fhG this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetSupportedChainsForPrivateKeyUseCase$getSupportedChains$1(C18374fhG c18374fhG, Continuation<? super GetSupportedChainsForPrivateKeyUseCase$getSupportedChains$1> continuation) {
        super(continuation);
        this.this$0 = c18374fhG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.KWHzl((String) null, (String) null, this);
    }
}
