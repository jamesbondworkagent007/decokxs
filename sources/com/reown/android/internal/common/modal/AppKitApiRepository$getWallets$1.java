package com.reown.android.internal.common.modal;

import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C56442yFn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class AppKitApiRepository$getWallets$1 extends ContinuationImpl {
    public int I$0;
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ AppKitApiRepository this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppKitApiRepository$getWallets$1(AppKitApiRepository appKitApiRepository, Continuation<? super AppKitApiRepository$getWallets$1> continuation) {
        super(continuation);
        this.this$0 = appKitApiRepository;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM7208getWalletshUnOzRk = this.this$0.m7208getWalletshUnOzRk(null, 0, null, null, null, this);
        return objM7208getWalletshUnOzRk == C56442yFn.copydefault() ? objM7208getWalletshUnOzRk : Result.m7376boximpl(objM7208getWalletshUnOzRk);
    }
}
