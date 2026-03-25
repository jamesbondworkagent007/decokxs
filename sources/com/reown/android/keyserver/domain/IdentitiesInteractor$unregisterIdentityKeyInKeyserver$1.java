package com.reown.android.keyserver.domain;

import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C56442yFn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class IdentitiesInteractor$unregisterIdentityKeyInKeyserver$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ IdentitiesInteractor this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IdentitiesInteractor$unregisterIdentityKeyInKeyserver$1(IdentitiesInteractor identitiesInteractor, Continuation<? super IdentitiesInteractor$unregisterIdentityKeyInKeyserver$1> continuation) {
        super(continuation);
        this.this$0 = identitiesInteractor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM7297unregisterIdentityKeyInKeyserverslDN04U = this.this$0.m7297unregisterIdentityKeyInKeyserverslDN04U(null, null, null, this);
        return objM7297unregisterIdentityKeyInKeyserverslDN04U == C56442yFn.copydefault() ? objM7297unregisterIdentityKeyInKeyserverslDN04U : Result.m7376boximpl(objM7297unregisterIdentityKeyInKeyserverslDN04U);
    }
}
