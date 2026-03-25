package com.okinc.im.imui.messageV2.view.keyboard;

import com.okinc.im.widgets.inputpanel.InputMode;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import o.C35934oJc;
import o.C35935oJd;
import o.C36913ojt;
import o.C56391yDq;
import o.C56442yFn;
import o.nJW;

/* JADX INFO: loaded from: classes16.dex */
public final class KeyboardFragment$showKeyboardForMessage$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C36913ojt this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KeyboardFragment$showKeyboardForMessage$1(C36913ojt c36913ojt, Continuation<? super KeyboardFragment$showKeyboardForMessage$1> continuation) {
        super(2, continuation);
        this.this$0 = c36913ojt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KeyboardFragment$showKeyboardForMessage$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((KeyboardFragment$showKeyboardForMessage$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C35934oJc c35934oJc;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            this.label = 1;
            if (DelayKt.delay(200L, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        nJW njw = this.this$0.getNewProxyInstance;
        if (njw != null && (c35934oJc = njw.KWHzl) != null) {
            C36913ojt c36913ojt = this.this$0;
            c35934oJc.setState(C35935oJd.copydefault.EZpvd(InputMode.TextInput, c35934oJc.gEmmrt().AEQbTJ(), c36913ojt.AhwBna(), c36913ojt.ejfBZ(), c36913ojt.fARcdN(), c36913ojt.DbNXlk()));
        }
        return Unit.INSTANCE;
    }
}
