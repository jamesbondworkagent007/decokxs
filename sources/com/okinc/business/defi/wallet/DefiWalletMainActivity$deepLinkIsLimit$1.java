package com.okinc.business.defi.wallet;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class DefiWalletMainActivity$deepLinkIsLimit$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DefiWalletMainActivity this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefiWalletMainActivity$deepLinkIsLimit$1(DefiWalletMainActivity defiWalletMainActivity, Continuation<? super DefiWalletMainActivity$deepLinkIsLimit$1> continuation) {
        super(continuation);
        this.this$0 = defiWalletMainActivity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return DefiWalletMainActivity.copydefault(this.this$0, (String) null, (String) null, this);
    }
}
