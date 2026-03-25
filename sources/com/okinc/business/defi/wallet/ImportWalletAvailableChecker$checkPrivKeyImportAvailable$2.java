package com.okinc.business.defi.wallet;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C13758dXe;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class ImportWalletAvailableChecker$checkPrivKeyImportAvailable$2 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ C13758dXe this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImportWalletAvailableChecker$checkPrivKeyImportAvailable$2(C13758dXe c13758dXe, Continuation<? super ImportWalletAvailableChecker$checkPrivKeyImportAvailable$2> continuation) {
        super(continuation);
        this.this$0 = c13758dXe;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.OLrzqt(null, this);
    }
}
