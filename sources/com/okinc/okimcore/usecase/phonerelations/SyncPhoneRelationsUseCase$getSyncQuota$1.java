package com.okinc.okimcore.usecase.phonerelations;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.sSC;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class SyncPhoneRelationsUseCase$getSyncQuota$1 extends ContinuationImpl {
    public int I$0;
    public long J$0;
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ sSC this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SyncPhoneRelationsUseCase$getSyncQuota$1(sSC ssc, Continuation<? super SyncPhoneRelationsUseCase$getSyncQuota$1> continuation) {
        super(continuation);
        this.this$0 = ssc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.KWHzl(0, this);
    }
}
