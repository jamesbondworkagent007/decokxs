package com.reown.android.internal.common.explorer;

import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C56442yFn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class ExplorerProtocol$getProjects$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ ExplorerProtocol this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExplorerProtocol$getProjects$1(ExplorerProtocol explorerProtocol, Continuation<? super ExplorerProtocol$getProjects$1> continuation) {
        super(continuation);
        this.this$0 = explorerProtocol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objMo7190getProjectsyxL6bBk = this.this$0.mo7190getProjectsyxL6bBk(0, 0, false, false, this);
        return objMo7190getProjectsyxL6bBk == C56442yFn.copydefault() ? objMo7190getProjectsyxL6bBk : Result.m7376boximpl(objMo7190getProjectsyxL6bBk);
    }
}
