package com.okinc.im.imui.livestream.fragment;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import o.C33546myW;
import o.C36536ocn;
import o.C56391yDq;
import o.C56442yFn;
import o.nJT;
import o.yHO;

/* JADX INFO: loaded from: classes16.dex */
public final class LivestreamChatFragment$observeViewModel$3 extends SuspendLambda implements yHO<CoroutineScope, Boolean, Continuation<? super Unit>, Object> {
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ C36536ocn this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LivestreamChatFragment$observeViewModel$3(C36536ocn c36536ocn, Continuation<? super LivestreamChatFragment$observeViewModel$3> continuation) {
        super(3, continuation);
        this.this$0 = c36536ocn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
    @Override // o.yHO
    public /* synthetic */ Object invoke(CoroutineScope coroutineScope, Boolean bool, Continuation<? super Unit> continuation) {
        return invoke(coroutineScope, bool.booleanValue(), continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Object invoke(CoroutineScope coroutineScope, boolean z, Continuation<? super Unit> continuation) {
        LivestreamChatFragment$observeViewModel$3 livestreamChatFragment$observeViewModel$3 = new LivestreamChatFragment$observeViewModel$3(this.this$0, continuation);
        livestreamChatFragment$observeViewModel$3.Z$0 = z;
        return livestreamChatFragment$observeViewModel$3.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        nJT njtCopydefault;
        C33546myW c33546myW;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            if (!this.Z$0 && (njtCopydefault = this.this$0.copydefault()) != null && (c33546myW = njtCopydefault.valueOf) != null) {
                c33546myW.AEQbTJ();
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
