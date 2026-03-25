package com.okinc.business.defi.wallet.connect;

import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C16032ecK;
import o.C56442yFn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class AddressCheckUseCase$addressCheck$1 extends ContinuationImpl {
    public long J$0;
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ C16032ecK this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddressCheckUseCase$addressCheck$1(C16032ecK c16032ecK, Continuation<? super AddressCheckUseCase$addressCheck$1> continuation) {
        super(continuation);
        this.this$0 = c16032ecK;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objOLrzqt = this.this$0.OLrzqt(null, 0L, this);
        return objOLrzqt == C56442yFn.copydefault() ? objOLrzqt : Result.m7376boximpl(objOLrzqt);
    }
}
