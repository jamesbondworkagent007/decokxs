package com.okinc.unify_find.data;

import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC54577xNn;
import o.InterfaceC54581xNr;
import o.pWO;
import o.xNE;

/* JADX INFO: loaded from: classes11.dex */
public final class RankListRepository$initSpot$initTrade$1 extends SuspendLambda implements Function1<Continuation<? super Boolean>, Object> {
    final /* synthetic */ Boolean $isHome;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RankListRepository$initSpot$initTrade$1(Boolean bool, Continuation<? super RankListRepository$initSpot$initTrade$1> continuation) {
        super(1, continuation);
        this.$isHome = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new RankListRepository$initSpot$initTrade$1(this.$isHome, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super Boolean> continuation) {
        return ((RankListRepository$initSpot$initTrade$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt2;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        boolean z = true;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            if (Intrinsics.EZpvd(this.$isHome, C56443yFo.KWHzl(true))) {
                InterfaceC54577xNn interfaceC54577xNnKWHzl = pWO.KWHzl();
                xNE xne = new xNE();
                this.label = 1;
                if (interfaceC54577xNnKWHzl.AEQbTJ(false, xne, this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                InterfaceC54577xNn interfaceC54577xNnKWHzl2 = pWO.KWHzl();
                this.label = 2;
                if (InterfaceC54577xNn.ActionBar.m8790ensureInitialize0E7RQCE$default(interfaceC54577xNnKWHzl2, false, null, this, 3, null) == objCopydefault) {
                    return objCopydefault;
                }
            }
        } else {
            if (i != 1 && i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            ((Result) obj).m7386unboximpl();
        }
        if (!Intrinsics.EZpvd(this.$isHome, C56443yFo.KWHzl(true)) ? (interfaceC54581xNrOLrzqt = pWO.KWHzl().OLrzqt()) == null || !InterfaceC54581xNr.TaskDescription.isInit$default(interfaceC54581xNrOLrzqt, null, 1, null) : (interfaceC54581xNrOLrzqt2 = pWO.KWHzl().OLrzqt()) == null || !interfaceC54581xNrOLrzqt2.AEQbTJ(new xNE())) {
            z = false;
        }
        return C56443yFo.KWHzl(z);
    }
}
