package com.okinc.business.defi.wallet.home.addressDetail;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import o.eVR;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class DefiWalletProfileAssetDetailFragment$fetchJwt$1 extends ContinuationImpl {
    public long J$0;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ eVR this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefiWalletProfileAssetDetailFragment$fetchJwt$1(eVR evr, Continuation<? super DefiWalletProfileAssetDetailFragment$fetchJwt$1> continuation) {
        super(continuation);
        this.this$0 = evr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.KWHzl((Function0<Unit>) null, (Continuation<? super Unit>) this);
    }
}
