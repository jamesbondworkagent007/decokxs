package com.okinc.business.defi.wallet;

import android.os.Bundle;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class DefiWalletMainActivity$verifyOpenUrl$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DefiWalletMainActivity this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefiWalletMainActivity$verifyOpenUrl$1(DefiWalletMainActivity defiWalletMainActivity, Continuation<? super DefiWalletMainActivity$verifyOpenUrl$1> continuation) {
        super(continuation);
        this.this$0 = defiWalletMainActivity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return DefiWalletMainActivity.OLrzqt(this.this$0, (Bundle) null, this);
    }
}
