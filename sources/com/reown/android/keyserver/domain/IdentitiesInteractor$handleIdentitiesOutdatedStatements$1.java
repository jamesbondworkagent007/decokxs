package com.reown.android.keyserver.domain;

import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C56442yFn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class IdentitiesInteractor$handleIdentitiesOutdatedStatements$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public Object L$5;
    public Object L$6;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ IdentitiesInteractor this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IdentitiesInteractor$handleIdentitiesOutdatedStatements$1(IdentitiesInteractor identitiesInteractor, Continuation<? super IdentitiesInteractor$handleIdentitiesOutdatedStatements$1> continuation) {
        super(continuation);
        this.this$0 = identitiesInteractor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM7286handleIdentitiesOutdatedStatementsxVnHbc = this.this$0.m7286handleIdentitiesOutdatedStatementsxVnHbc(null, null, null, null, null, null, this);
        return objM7286handleIdentitiesOutdatedStatementsxVnHbc == C56442yFn.copydefault() ? objM7286handleIdentitiesOutdatedStatementsxVnHbc : Result.m7376boximpl(objM7286handleIdentitiesOutdatedStatementsxVnHbc);
    }
}
