package com.okinc.business.market.features.smart_money.signal.ui;

import com.okinc.business.market.features.identity.domain.DexUserIdentity;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C28586kda;
import o.C29463kuC;
import o.C29502kup;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: loaded from: classes7.dex */
public final class SignalAlertViewModel$fetchAlerts$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ SignalAlertViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignalAlertViewModel$fetchAlerts$1(SignalAlertViewModel signalAlertViewModel, Continuation<? super SignalAlertViewModel$fetchAlerts$1> continuation) {
        super(2, continuation);
        this.this$0 = signalAlertViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SignalAlertViewModel$fetchAlerts$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SignalAlertViewModel$fetchAlerts$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0083  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objOLrzqt;
        String strEZpvd;
        Object objCopydefault;
        SignalAlertViewModel signalAlertViewModel;
        Throwable thM7380exceptionOrNullimpl;
        Object value;
        Object objCopydefault2 = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C28586kda c28586kda = this.this$0.gEmmrt;
            this.label = 1;
            objOLrzqt = c28586kda.OLrzqt(this);
            if (objOLrzqt == objCopydefault2) {
                return objCopydefault2;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                signalAlertViewModel = (SignalAlertViewModel) this.L$0;
                C56391yDq.AEQbTJ(obj);
                objCopydefault = ((Result) obj).m7386unboximpl();
                if (Result.m7384isSuccessimpl(objCopydefault)) {
                    C29463kuC c29463kuC = (C29463kuC) objCopydefault;
                    MutableStateFlow mutableStateFlow = signalAlertViewModel.EZpvd;
                    do {
                        value = mutableStateFlow.getValue();
                    } while (!mutableStateFlow.compareAndSet(value, c29463kuC));
                }
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objCopydefault);
                if (thM7380exceptionOrNullimpl != null) {
                    pUU.AEQbTJ("SignalAlertViewModel", "Failed to fetch signal alerts", thM7380exceptionOrNullimpl);
                }
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
            objOLrzqt = ((Result) obj).m7386unboximpl();
        }
        if (Result.m7383isFailureimpl(objOLrzqt)) {
            objOLrzqt = null;
        }
        DexUserIdentity dexUserIdentity = (DexUserIdentity) objOLrzqt;
        if (dexUserIdentity != null && (strEZpvd = dexUserIdentity.EZpvd()) != null) {
            SignalAlertViewModel signalAlertViewModel2 = this.this$0;
            C29502kup c29502kup = signalAlertViewModel2.AhwBna;
            this.L$0 = signalAlertViewModel2;
            this.label = 2;
            objCopydefault = c29502kup.copydefault(strEZpvd, this);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
            signalAlertViewModel = signalAlertViewModel2;
            if (Result.m7384isSuccessimpl(objCopydefault)) {
            }
            thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objCopydefault);
            if (thM7380exceptionOrNullimpl != null) {
            }
        }
        return Unit.INSTANCE;
    }
}
