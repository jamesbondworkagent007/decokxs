package com.okinc.im.imui.broadcastmessages.inputpanel;

import android.widget.EditText;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.C33893nJt;
import o.C35454nvf;
import o.C35934oJc;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes15.dex */
public final class BroadcastMessageInputPanelFragment$initView$3 extends SuspendLambda implements Function2<Unit, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C35454nvf this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BroadcastMessageInputPanelFragment$initView$3(C35454nvf c35454nvf, Continuation<? super BroadcastMessageInputPanelFragment$initView$3> continuation) {
        super(2, continuation);
        this.this$0 = c35454nvf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BroadcastMessageInputPanelFragment$initView$3(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Unit unit, Continuation<? super Unit> continuation) {
        return ((BroadcastMessageInputPanelFragment$initView$3) create(unit, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C35934oJc c35934oJc;
        EditText editTextDjBIcL;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            C33893nJt c33893nJt = this.this$0.KWHzl;
            if (c33893nJt != null && (c35934oJc = c33893nJt.OLrzqt) != null && (editTextDjBIcL = c35934oJc.djBIcL()) != null) {
                editTextDjBIcL.setText((CharSequence) null);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
