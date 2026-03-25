package com.okinc.planet.service;

import com.okinc.planet.service.OKPlanetApplicationDelegate$observerModeSwitch$1;
import com.okinc.planet_api.model.WSMessageData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.DelayKt;
import o.AbstractC57556yke;
import o.C46418tTp;
import o.C54401xHa;
import o.C56391yDq;
import o.C56442yFn;
import o.C57567ykp;
import o.pUU;

/* JADX INFO: loaded from: classes10.dex */
public final class OKPlanetApplicationDelegate$observerModeSwitch$1 extends SuspendLambda implements Function2<Integer, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C46418tTp this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OKPlanetApplicationDelegate$observerModeSwitch$1(C46418tTp c46418tTp, Continuation<? super OKPlanetApplicationDelegate$observerModeSwitch$1> continuation) {
        super(2, continuation);
        this.this$0 = c46418tTp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OKPlanetApplicationDelegate$observerModeSwitch$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Object invoke(int i, Continuation<? super Unit> continuation) {
        return ((OKPlanetApplicationDelegate$observerModeSwitch$1) create(Integer.valueOf(i), continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* synthetic */ Object invoke(Integer num, Continuation<? super Unit> continuation) {
        return invoke(num.intValue(), continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            AbstractC57556yke abstractC57556ykeAYXKKw = C46418tTp.Companion.AYXKKw();
            if (abstractC57556ykeAYXKKw != null) {
                abstractC57556ykeAYXKKw.djBIcL();
            }
            this.label = 1;
            if (DelayKt.delay(500L, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        C46418tTp.Application application = C46418tTp.Companion;
        C46418tTp c46418tTp = this.this$0;
        C57567ykp v5Connection$default = C54401xHa.TaskDescription.getV5Connection$default(C54401xHa.Companion, null, true, false, false, false, null, 61, null);
        final C46418tTp c46418tTp2 = this.this$0;
        application.OLrzqt(c46418tTp.KWHzl(v5Connection$default, (Function1<? super WSMessageData, Unit>) new Function1() { // from class: o.tTC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return OKPlanetApplicationDelegate$observerModeSwitch$1.invokeSuspend$lambda$0(c46418tTp2, (WSMessageData) obj2);
            }
        }));
        AbstractC57556yke abstractC57556ykeAYXKKw2 = application.AYXKKw();
        if (abstractC57556ykeAYXKKw2 != null) {
            abstractC57556ykeAYXKKw2.AhwBna();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(C46418tTp c46418tTp, WSMessageData wSMessageData) {
        pUU.KWHzl("qjf", "OKPlanetApplicationDelegate-wsMsgData = " + wSMessageData);
        c46418tTp.EZpvd(wSMessageData);
        return Unit.INSTANCE;
    }
}
