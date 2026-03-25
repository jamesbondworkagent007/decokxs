package com.okinc.tradingbot.impl.signalClone.ui;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.C52794wYp;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes16.dex */
public final class SignalCloneBottomSheet$onCreateContent$1$4 extends SuspendLambda implements Function2<Pair<? extends String, ? extends String>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SignalCloneBottomSheet this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignalCloneBottomSheet$onCreateContent$1$4(SignalCloneBottomSheet signalCloneBottomSheet, Continuation<? super SignalCloneBottomSheet$onCreateContent$1$4> continuation) {
        super(2, continuation);
        this.this$0 = signalCloneBottomSheet;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SignalCloneBottomSheet$onCreateContent$1$4 signalCloneBottomSheet$onCreateContent$1$4 = new SignalCloneBottomSheet$onCreateContent$1$4(this.this$0, continuation);
        signalCloneBottomSheet$onCreateContent$1$4.L$0 = obj;
        return signalCloneBottomSheet$onCreateContent$1$4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Pair<? extends String, ? extends String> pair, Continuation<? super Unit> continuation) {
        return invoke2((Pair<String, String>) pair, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Pair<String, String> pair, Continuation<? super Unit> continuation) {
        return ((SignalCloneBottomSheet$onCreateContent$1$4) create(pair, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            Pair pair = (Pair) this.L$0;
            String str = (String) pair.component1();
            String str2 = (String) pair.component2();
            C52794wYp c52794wYp = this.this$0.EZpvd;
            if (c52794wYp != null) {
                if (str == null || str.length() == 0) {
                    if (str2 == null) {
                        str2 = "";
                    }
                    boolean z = str2.length() > 0;
                    c52794wYp.setEnabled(z);
                }
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
