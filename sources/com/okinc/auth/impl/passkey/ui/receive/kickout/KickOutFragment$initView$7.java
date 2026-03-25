package com.okinc.auth.impl.passkey.ui.receive.kickout;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.C52794wYp;
import o.C55178xez;
import o.C56391yDq;
import o.C56442yFn;
import o.C6232aLU;
import o.C8283azn;
import o.wYF;

/* JADX INFO: loaded from: classes14.dex */
public final class KickOutFragment$initView$7 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ C6232aLU this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KickOutFragment$initView$7(C6232aLU c6232aLU, Continuation<? super KickOutFragment$initView$7> continuation) {
        super(2, continuation);
        this.this$0 = c6232aLU;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        KickOutFragment$initView$7 kickOutFragment$initView$7 = new KickOutFragment$initView$7(this.this$0, continuation);
        kickOutFragment$initView$7.Z$0 = ((Boolean) obj).booleanValue();
        return kickOutFragment$initView$7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
        return invoke(bool.booleanValue(), continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
        return ((KickOutFragment$initView$7) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C55178xez c55178xez;
        wYF wyfOLrzqt;
        C52794wYp c52794wYpCopydefault;
        C55178xez c55178xez2;
        wYF wyfOLrzqt2;
        C52794wYp c52794wYpCopydefault2;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            if (this.Z$0) {
                C8283azn c8283azn = this.this$0.AhwBna;
                if (c8283azn != null && (c55178xez2 = c8283azn.OLrzqt) != null && (wyfOLrzqt2 = c55178xez2.OLrzqt()) != null && (c52794wYpCopydefault2 = wyfOLrzqt2.copydefault()) != null) {
                    C52794wYp.startLoading$default(c52794wYpCopydefault2, 0L, 1, null);
                }
            } else {
                C8283azn c8283azn2 = this.this$0.AhwBna;
                if (c8283azn2 != null && (c55178xez = c8283azn2.OLrzqt) != null && (wyfOLrzqt = c55178xez.OLrzqt()) != null && (c52794wYpCopydefault = wyfOLrzqt.copydefault()) != null) {
                    c52794wYpCopydefault.fIwbmz();
                }
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
