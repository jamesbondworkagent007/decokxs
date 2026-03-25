package com.okinc.core.ok_app.modeswitch;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.AbstractC33240msi;
import o.AbstractC33249msr;
import o.C56390yDp;
import o.C56391yDq;
import o.C56442yFn;
import o.yHS;

/* JADX INFO: loaded from: classes8.dex */
public final class OKLiteSubModeUtilsKt$setupConfigCollector$2 extends SuspendLambda implements yHS<Unit, Integer, AbstractC33249msr, AbstractC33240msi, Continuation<? super Pair<? extends AbstractC33249msr, ? extends AbstractC33240msi>>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public OKLiteSubModeUtilsKt$setupConfigCollector$2(Continuation<? super OKLiteSubModeUtilsKt$setupConfigCollector$2> continuation) {
        super(5, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
    @Override // o.yHS
    public /* synthetic */ Object invoke(Unit unit, Integer num, AbstractC33249msr abstractC33249msr, AbstractC33240msi abstractC33240msi, Continuation<? super Pair<? extends AbstractC33249msr, ? extends AbstractC33240msi>> continuation) {
        return invoke(unit, num.intValue(), abstractC33249msr, abstractC33240msi, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Object invoke(Unit unit, int i, AbstractC33249msr abstractC33249msr, AbstractC33240msi abstractC33240msi, Continuation<? super Pair<? extends AbstractC33249msr, ? extends AbstractC33240msi>> continuation) {
        OKLiteSubModeUtilsKt$setupConfigCollector$2 oKLiteSubModeUtilsKt$setupConfigCollector$2 = new OKLiteSubModeUtilsKt$setupConfigCollector$2(continuation);
        oKLiteSubModeUtilsKt$setupConfigCollector$2.L$0 = abstractC33249msr;
        oKLiteSubModeUtilsKt$setupConfigCollector$2.L$1 = abstractC33240msi;
        return oKLiteSubModeUtilsKt$setupConfigCollector$2.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            return C56390yDp.OLrzqt((AbstractC33249msr) this.L$0, (AbstractC33240msi) this.L$1);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
