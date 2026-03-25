package com.okinc.business.defi.common.track;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C14494dmX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class EventTrackerUtils$trackImportWalletConfirmButtonClick$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ C14494dmX this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EventTrackerUtils$trackImportWalletConfirmButtonClick$1(C14494dmX c14494dmX, Continuation<? super EventTrackerUtils$trackImportWalletConfirmButtonClick$1> continuation) {
        super(continuation);
        this.this$0 = c14494dmX;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.KWHzl((String) null, (String) null, (String) null, this);
    }
}
