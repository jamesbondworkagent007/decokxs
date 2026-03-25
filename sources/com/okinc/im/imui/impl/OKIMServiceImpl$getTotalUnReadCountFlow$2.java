package com.okinc.im.imui.impl;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.C32979mnm;
import o.C44124sEe;
import o.C56391yDq;
import o.C56442yFn;
import o.xVV;

/* JADX INFO: loaded from: classes8.dex */
public final class OKIMServiceImpl$getTotalUnReadCountFlow$2 extends SuspendLambda implements Function2<Integer, Continuation<? super Unit>, Object> {
    /* synthetic */ int I$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public OKIMServiceImpl$getTotalUnReadCountFlow$2(Continuation<? super OKIMServiceImpl$getTotalUnReadCountFlow$2> continuation) {
        super(2, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OKIMServiceImpl$getTotalUnReadCountFlow$2 oKIMServiceImpl$getTotalUnReadCountFlow$2 = new OKIMServiceImpl$getTotalUnReadCountFlow$2(continuation);
        oKIMServiceImpl$getTotalUnReadCountFlow$2.I$0 = ((Number) obj).intValue();
        return oKIMServiceImpl$getTotalUnReadCountFlow$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Object invoke(int i, Continuation<? super Unit> continuation) {
        return ((OKIMServiceImpl$getTotalUnReadCountFlow$2) create(Integer.valueOf(i), continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* synthetic */ Object invoke(Integer num, Continuation<? super Unit> continuation) {
        return invoke(num.intValue(), continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            int i = this.I$0;
            xVV.djBIcL(C32979mnm.EZpvd.OLrzqt(), i);
            C44124sEe.imLogGetAllUnreadCountFlow$default("OKIMServiceImpl - getTotalUnReadCountFlow - value update: " + i, null, 2, null);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
