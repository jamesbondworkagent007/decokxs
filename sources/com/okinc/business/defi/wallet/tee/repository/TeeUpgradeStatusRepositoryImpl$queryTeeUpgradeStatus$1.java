package com.okinc.business.defi.wallet.tee.repository;

import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C56442yFn;
import o.fVT;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class TeeUpgradeStatusRepositoryImpl$queryTeeUpgradeStatus$1 extends ContinuationImpl {
    public static int AEQbTJ;
    public static int copydefault;
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ fVT this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TeeUpgradeStatusRepositoryImpl$queryTeeUpgradeStatus$1(fVT fvt, Continuation<? super TeeUpgradeStatusRepositoryImpl$queryTeeUpgradeStatus$1> continuation) {
        super(continuation);
        this.this$0 = fvt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objCopydefault = this.this$0.copydefault(null, this);
        return objCopydefault == C56442yFn.copydefault() ? objCopydefault : Result.m7376boximpl(objCopydefault);
    }

    public static int KWHzl() {
        int i = AEQbTJ;
        int i2 = i % 6831828;
        AEQbTJ = i + 1;
        if (i2 != 0) {
            return copydefault;
        }
        int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
        copydefault = iFreeMemory;
        return iFreeMemory;
    }
}
