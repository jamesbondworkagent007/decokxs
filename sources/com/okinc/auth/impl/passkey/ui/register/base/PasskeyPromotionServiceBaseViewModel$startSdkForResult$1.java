package com.okinc.auth.impl.passkey.ui.register.base;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class PasskeyPromotionServiceBaseViewModel$startSdkForResult$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PasskeyPromotionServiceBaseViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PasskeyPromotionServiceBaseViewModel$startSdkForResult$1(PasskeyPromotionServiceBaseViewModel passkeyPromotionServiceBaseViewModel, Continuation<? super PasskeyPromotionServiceBaseViewModel$startSdkForResult$1> continuation) {
        super(continuation);
        this.this$0 = passkeyPromotionServiceBaseViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.OLrzqt(null, this);
    }
}
