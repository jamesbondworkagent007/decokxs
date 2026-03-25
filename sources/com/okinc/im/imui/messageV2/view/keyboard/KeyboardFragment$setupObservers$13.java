package com.okinc.im.imui.messageV2.view.keyboard;

import com.okinc.im.config.page.IMPageType;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import o.C36913ojt;
import o.C56391yDq;
import o.C56442yFn;
import o.yHO;

/* JADX INFO: loaded from: classes16.dex */
public final class KeyboardFragment$setupObservers$13 extends SuspendLambda implements yHO<CoroutineScope, IMPageType, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C36913ojt this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KeyboardFragment$setupObservers$13(C36913ojt c36913ojt, Continuation<? super KeyboardFragment$setupObservers$13> continuation) {
        super(3, continuation);
        this.this$0 = c36913ojt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.yHO
    public final Object invoke(CoroutineScope coroutineScope, IMPageType iMPageType, Continuation<? super Unit> continuation) {
        KeyboardFragment$setupObservers$13 keyboardFragment$setupObservers$13 = new KeyboardFragment$setupObservers$13(this.this$0, continuation);
        keyboardFragment$setupObservers$13.L$0 = iMPageType;
        return keyboardFragment$setupObservers$13.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            this.this$0.valueOf().copydefault((IMPageType) this.L$0);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
