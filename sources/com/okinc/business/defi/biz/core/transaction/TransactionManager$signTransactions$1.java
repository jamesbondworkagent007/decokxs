package com.okinc.business.defi.biz.core.transaction;

import androidx.fragment.app.FragmentManager;
import java.util.List;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.AbstractC9836bdB;
import o.C56442yFn;
import o.C8396bBt;
import o.InterfaceC9738bbJ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class TransactionManager$signTransactions$1<T extends AbstractC9836bdB> extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ C8396bBt this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransactionManager$signTransactions$1(C8396bBt c8396bBt, Continuation<? super TransactionManager$signTransactions$1> continuation) {
        super(continuation);
        this.this$0 = c8396bBt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objEZpvd = this.this$0.EZpvd((FragmentManager) null, (InterfaceC9738bbJ) null, (List) null, false, (Continuation) this);
        return objEZpvd == C56442yFn.copydefault() ? objEZpvd : Result.m7376boximpl(objEZpvd);
    }
}
