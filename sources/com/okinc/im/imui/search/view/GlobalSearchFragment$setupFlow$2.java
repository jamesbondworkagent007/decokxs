package com.okinc.im.imui.search.view;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.C33546myW;
import o.C37453ouC;
import o.C56391yDq;
import o.C56442yFn;
import o.nJS;

/* JADX INFO: loaded from: classes16.dex */
public final class GlobalSearchFragment$setupFlow$2 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ C37453ouC this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlobalSearchFragment$setupFlow$2(C37453ouC c37453ouC, Continuation<? super GlobalSearchFragment$setupFlow$2> continuation) {
        super(2, continuation);
        this.this$0 = c37453ouC;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        GlobalSearchFragment$setupFlow$2 globalSearchFragment$setupFlow$2 = new GlobalSearchFragment$setupFlow$2(this.this$0, continuation);
        globalSearchFragment$setupFlow$2.Z$0 = ((Boolean) obj).booleanValue();
        return globalSearchFragment$setupFlow$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
        return invoke(bool.booleanValue(), continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
        return ((GlobalSearchFragment$setupFlow$2) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C33546myW c33546myW;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            boolean z = this.Z$0;
            nJS njs = this.this$0.EZpvd;
            if (njs != null && (c33546myW = njs.EZpvd) != null) {
                c33546myW.AhwBna(z);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
