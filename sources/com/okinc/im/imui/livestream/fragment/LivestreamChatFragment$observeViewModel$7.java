package com.okinc.im.imui.livestream.fragment;

import android.text.Editable;
import com.okinc.uilab.edit.OKEditText;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import o.C34041nPf;
import o.C36536ocn;
import o.C56391yDq;
import o.C56442yFn;
import o.nJT;
import o.yHO;

/* JADX INFO: loaded from: classes16.dex */
public final class LivestreamChatFragment$observeViewModel$7 extends SuspendLambda implements yHO<CoroutineScope, Unit, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C36536ocn this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LivestreamChatFragment$observeViewModel$7(C36536ocn c36536ocn, Continuation<? super LivestreamChatFragment$observeViewModel$7> continuation) {
        super(3, continuation);
        this.this$0 = c36536ocn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.yHO
    public final Object invoke(CoroutineScope coroutineScope, Unit unit, Continuation<? super Unit> continuation) {
        return new LivestreamChatFragment$observeViewModel$7(this.this$0, continuation).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C34041nPf c34041nPf;
        OKEditText oKEditText;
        Editable text;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            nJT njtCopydefault = this.this$0.copydefault();
            if (njtCopydefault != null && (c34041nPf = njtCopydefault.AEQbTJ) != null && (oKEditText = c34041nPf.EZpvd) != null && (text = oKEditText.getText()) != null) {
                text.clear();
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
