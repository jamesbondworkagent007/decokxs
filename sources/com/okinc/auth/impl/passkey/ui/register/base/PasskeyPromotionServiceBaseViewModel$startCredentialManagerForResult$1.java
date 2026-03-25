package com.okinc.auth.impl.passkey.ui.register.base;

import com.okinc.auth.impl.passkey.ui.register.base.PasskeyPromotionServiceBaseViewModel;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.AbstractC5991aGs;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class PasskeyPromotionServiceBaseViewModel$startCredentialManagerForResult$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PasskeyPromotionServiceBaseViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PasskeyPromotionServiceBaseViewModel$startCredentialManagerForResult$1(PasskeyPromotionServiceBaseViewModel passkeyPromotionServiceBaseViewModel, Continuation<? super PasskeyPromotionServiceBaseViewModel$startCredentialManagerForResult$1> continuation) {
        super(continuation);
        this.this$0 = passkeyPromotionServiceBaseViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.KWHzl((PasskeyPromotionServiceBaseViewModel.Request) null, (Continuation<? super AbstractC5991aGs>) this);
    }
}
