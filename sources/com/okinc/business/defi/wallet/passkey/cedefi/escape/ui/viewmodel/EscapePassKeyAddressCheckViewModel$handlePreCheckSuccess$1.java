package com.okinc.business.defi.wallet.passkey.cedefi.escape.ui.viewmodel;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class EscapePassKeyAddressCheckViewModel$handlePreCheckSuccess$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ EscapePassKeyAddressCheckViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EscapePassKeyAddressCheckViewModel$handlePreCheckSuccess$1(EscapePassKeyAddressCheckViewModel escapePassKeyAddressCheckViewModel, Continuation<? super EscapePassKeyAddressCheckViewModel$handlePreCheckSuccess$1> continuation) {
        super(continuation);
        this.this$0 = escapePassKeyAddressCheckViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.copydefault(null, null, this);
    }
}
