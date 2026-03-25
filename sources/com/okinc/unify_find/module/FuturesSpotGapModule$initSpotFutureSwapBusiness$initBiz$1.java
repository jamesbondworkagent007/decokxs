package com.okinc.unify_find.module;

import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C55528xle;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC54577xNn;
import o.InterfaceC54581xNr;
import o.pWO;

/* JADX INFO: loaded from: classes11.dex */
public final class FuturesSpotGapModule$initSpotFutureSwapBusiness$initBiz$1 extends SuspendLambda implements Function1<Continuation<? super Boolean>, Object> {
    int label;
    final /* synthetic */ C55528xle this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FuturesSpotGapModule$initSpotFutureSwapBusiness$initBiz$1(C55528xle c55528xle, Continuation<? super FuturesSpotGapModule$initSpotFutureSwapBusiness$initBiz$1> continuation) {
        super(1, continuation);
        this.this$0 = c55528xle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new FuturesSpotGapModule$initSpotFutureSwapBusiness$initBiz$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super Boolean> continuation) {
        return ((FuturesSpotGapModule$initSpotFutureSwapBusiness$initBiz$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0077  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM8790ensureInitialize0E7RQCE$default;
        Boolean boolKWHzl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC54577xNn interfaceC54577xNnKWHzl = pWO.KWHzl();
            this.label = 1;
            objM8790ensureInitialize0E7RQCE$default = InterfaceC54577xNn.ActionBar.m8790ensureInitialize0E7RQCE$default(interfaceC54577xNnKWHzl, false, null, this, 3, null);
            if (objM8790ensureInitialize0E7RQCE$default == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                boolKWHzl = C56443yFo.KWHzl(((Boolean) obj).booleanValue());
                InterfaceC54581xNr interfaceC54581xNrOLrzqt = pWO.KWHzl().OLrzqt();
                return C56443yFo.KWHzl(interfaceC54581xNrOLrzqt != null && InterfaceC54581xNr.TaskDescription.isInit$default(interfaceC54581xNrOLrzqt, null, 1, null) && Intrinsics.EZpvd(boolKWHzl, C56443yFo.KWHzl(true)));
            }
            C56391yDq.AEQbTJ(obj);
            objM8790ensureInitialize0E7RQCE$default = ((Result) obj).m7386unboximpl();
        }
        if (Result.m7383isFailureimpl(objM8790ensureInitialize0E7RQCE$default)) {
            objM8790ensureInitialize0E7RQCE$default = null;
        }
        InterfaceC54581xNr interfaceC54581xNr = (InterfaceC54581xNr) objM8790ensureInitialize0E7RQCE$default;
        if (interfaceC54581xNr != null) {
            C55528xle c55528xle = this.this$0;
            this.label = 2;
            obj = c55528xle.OLrzqt(interfaceC54581xNr, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
            boolKWHzl = C56443yFo.KWHzl(((Boolean) obj).booleanValue());
            InterfaceC54581xNr interfaceC54581xNrOLrzqt2 = pWO.KWHzl().OLrzqt();
            return C56443yFo.KWHzl(interfaceC54581xNrOLrzqt2 != null && InterfaceC54581xNr.TaskDescription.isInit$default(interfaceC54581xNrOLrzqt2, null, 1, null) && Intrinsics.EZpvd(boolKWHzl, C56443yFo.KWHzl(true)));
        }
        boolKWHzl = null;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt22 = pWO.KWHzl().OLrzqt();
        return C56443yFo.KWHzl(interfaceC54581xNrOLrzqt22 != null && InterfaceC54581xNr.TaskDescription.isInit$default(interfaceC54581xNrOLrzqt22, null, 1, null) && Intrinsics.EZpvd(boolKWHzl, C56443yFo.KWHzl(true)));
    }
}
