package com.okinc.im.imui.messageV2.view.keyboard;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import o.C35285nsT;
import o.C36403oaM;
import o.C36913ojt;
import o.C56391yDq;
import o.C56442yFn;
import o.yHO;

/* JADX INFO: loaded from: classes16.dex */
public final class KeyboardFragment$setupObservers$15 extends SuspendLambda implements yHO<CoroutineScope, C35285nsT, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C36913ojt this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KeyboardFragment$setupObservers$15(C36913ojt c36913ojt, Continuation<? super KeyboardFragment$setupObservers$15> continuation) {
        super(3, continuation);
        this.this$0 = c36913ojt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.yHO
    public final Object invoke(CoroutineScope coroutineScope, C35285nsT c35285nsT, Continuation<? super Unit> continuation) {
        KeyboardFragment$setupObservers$15 keyboardFragment$setupObservers$15 = new KeyboardFragment$setupObservers$15(this.this$0, continuation);
        keyboardFragment$setupObservers$15.L$0 = c35285nsT;
        return keyboardFragment$setupObservers$15.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            C35285nsT c35285nsT = (C35285nsT) this.L$0;
            C36403oaM c36403oaM = this.this$0.fJNWhG;
            if (c36403oaM != null) {
                c36403oaM.EZpvd(c35285nsT);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
