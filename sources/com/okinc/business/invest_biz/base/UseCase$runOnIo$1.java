package com.okinc.business.invest_biz.base;

import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C56442yFn;
import o.InterfaceC25465ixI;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class UseCase$runOnIo$1<T> extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ InterfaceC25465ixI this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UseCase$runOnIo$1(InterfaceC25465ixI interfaceC25465ixI, Continuation<? super UseCase$runOnIo$1> continuation) {
        super(continuation);
        this.this$0 = interfaceC25465ixI;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objKWHzl = InterfaceC25465ixI.KWHzl(this.this$0, null, this);
        return objKWHzl == C56442yFn.copydefault() ? objKWHzl : Result.m7376boximpl(objKWHzl);
    }
}
