package com.okinc.unify_trade;

import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C54588xNy;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC54577xNn;
import o.InterfaceC54581xNr;
import o.pWO;
import o.yHT;

/* JADX INFO: loaded from: classes17.dex */
public final class TradeInitJob$marketEnsureOKTrade$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ C54588xNy $config;
    final /* synthetic */ yHT<Boolean, InterfaceC54581xNr, Exception, Continuation<? super Unit>, Object> $invokeCallBack;
    Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.yHT<? super java.lang.Boolean, ? super o.xNr, ? super java.lang.Exception, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TradeInitJob$marketEnsureOKTrade$2(yHT<? super Boolean, ? super InterfaceC54581xNr, ? super Exception, ? super Continuation<? super Unit>, ? extends Object> yht, C54588xNy c54588xNy, Continuation<? super TradeInitJob$marketEnsureOKTrade$2> continuation) {
        super(2, continuation);
        this.$invokeCallBack = yht;
        this.$config = c54588xNy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TradeInitJob$marketEnsureOKTrade$2(this.$invokeCallBack, this.$config, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TradeInitJob$marketEnsureOKTrade$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x007a  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objAEQbTJ;
        Object obj2;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = pWO.KWHzl().OLrzqt();
            if (interfaceC54581xNrOLrzqt == null || !interfaceC54581xNrOLrzqt.AEQbTJ(this.$config)) {
                interfaceC54581xNrOLrzqt = null;
            }
            if (interfaceC54581xNrOLrzqt != null) {
                yHT<Boolean, InterfaceC54581xNr, Exception, Continuation<? super Unit>, Object> yht = this.$invokeCallBack;
                Boolean boolKWHzl = C56443yFo.KWHzl(true);
                this.label = 1;
                if (yht.invoke(boolKWHzl, interfaceC54581xNrOLrzqt, null, this) == objCopydefault) {
                    return objCopydefault;
                }
                return Unit.INSTANCE;
            }
            InterfaceC54577xNn interfaceC54577xNnKWHzl = pWO.KWHzl();
            C54588xNy c54588xNy = this.$config;
            this.label = 2;
            objAEQbTJ = interfaceC54577xNnKWHzl.AEQbTJ(false, c54588xNy, this);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
            yHT<Boolean, InterfaceC54581xNr, Exception, Continuation<? super Unit>, Object> yht2 = this.$invokeCallBack;
            if (Result.m7384isSuccessimpl(objAEQbTJ)) {
            }
        } else {
            if (i == 1) {
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            if (i == 2) {
                C56391yDq.AEQbTJ(obj);
                objAEQbTJ = ((Result) obj).m7386unboximpl();
                yHT<Boolean, InterfaceC54581xNr, Exception, Continuation<? super Unit>, Object> yht22 = this.$invokeCallBack;
                if (Result.m7384isSuccessimpl(objAEQbTJ)) {
                    Boolean boolKWHzl2 = C56443yFo.KWHzl(true);
                    this.L$0 = objAEQbTJ;
                    this.label = 3;
                    if (yht22.invoke(boolKWHzl2, (InterfaceC54581xNr) objAEQbTJ, null, this) == objCopydefault) {
                        return objCopydefault;
                    }
                }
            } else {
                if (i != 3) {
                    if (i != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj2 = this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    objAEQbTJ = obj2;
                    Result.m7376boximpl(objAEQbTJ);
                    return Unit.INSTANCE;
                }
                Object obj3 = this.L$0;
                C56391yDq.AEQbTJ(obj);
                objAEQbTJ = obj3;
            }
        }
        yHT<Boolean, InterfaceC54581xNr, Exception, Continuation<? super Unit>, Object> yht3 = this.$invokeCallBack;
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objAEQbTJ);
        if (thM7380exceptionOrNullimpl != null) {
            Boolean boolKWHzl3 = C56443yFo.KWHzl(false);
            Exception exc = new Exception(thM7380exceptionOrNullimpl.getMessage());
            this.L$0 = objAEQbTJ;
            this.label = 4;
            if (yht3.invoke(boolKWHzl3, null, exc, this) == objCopydefault) {
                return objCopydefault;
            }
            obj2 = objAEQbTJ;
            objAEQbTJ = obj2;
        }
        Result.m7376boximpl(objAEQbTJ);
        return Unit.INSTANCE;
    }
}
