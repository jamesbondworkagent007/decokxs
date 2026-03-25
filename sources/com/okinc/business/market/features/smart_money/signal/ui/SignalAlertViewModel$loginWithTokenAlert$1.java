package com.okinc.business.market.features.smart_money.signal.ui;

import android.os.Bundle;
import com.okinc.business.market.features.identity.domain.DexUserIdentity;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC29476kuP;
import o.C28586kda;
import o.C28603kdr;
import o.C29463kuC;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: loaded from: classes7.dex */
public final class SignalAlertViewModel$loginWithTokenAlert$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Bundle $bundle;
    final /* synthetic */ C29463kuC.Application $tokenAlert;
    int label;
    final /* synthetic */ SignalAlertViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignalAlertViewModel$loginWithTokenAlert$1(Bundle bundle, SignalAlertViewModel signalAlertViewModel, C29463kuC.Application application, Continuation<? super SignalAlertViewModel$loginWithTokenAlert$1> continuation) {
        super(2, continuation);
        this.$bundle = bundle;
        this.this$0 = signalAlertViewModel;
        this.$tokenAlert = application;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SignalAlertViewModel$loginWithTokenAlert$1(this.$bundle, this.this$0, this.$tokenAlert, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SignalAlertViewModel$loginWithTokenAlert$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008c  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objOLrzqt;
        Object objKWHzl;
        Throwable thM7380exceptionOrNullimpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            if (this.$bundle != null) {
                C28586kda c28586kda = this.this$0.gEmmrt;
                this.label = 1;
                objOLrzqt = c28586kda.OLrzqt(this);
                if (objOLrzqt == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                return Unit.INSTANCE;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                objKWHzl = ((Result) obj).m7386unboximpl();
                SignalAlertViewModel signalAlertViewModel = this.this$0;
                C29463kuC.Application application = this.$tokenAlert;
                if (Result.m7384isSuccessimpl(objKWHzl)) {
                    signalAlertViewModel.copydefault.setValue(new AbstractC29476kuP.TaskDescription(application));
                }
                SignalAlertViewModel signalAlertViewModel2 = this.this$0;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objKWHzl);
                if (thM7380exceptionOrNullimpl != null) {
                    signalAlertViewModel2.copydefault.setValue(new AbstractC29476kuP.Activity(thM7380exceptionOrNullimpl));
                    pUU.AEQbTJ("SignalAlertViewModel", "Failed to sign message", thM7380exceptionOrNullimpl);
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
        if (dexUserIdentity == null) {
            return Unit.INSTANCE;
        }
        C28603kdr c28603kdr = this.this$0.djBIcL;
        String strEZpvd = dexUserIdentity.EZpvd();
        long jOLrzqt = dexUserIdentity.OLrzqt();
        Bundle bundle = this.$bundle;
        this.label = 2;
        objKWHzl = c28603kdr.KWHzl(strEZpvd, jOLrzqt, bundle, this);
        if (objKWHzl == objCopydefault) {
            return objCopydefault;
        }
        SignalAlertViewModel signalAlertViewModel3 = this.this$0;
        C29463kuC.Application application2 = this.$tokenAlert;
        if (Result.m7384isSuccessimpl(objKWHzl)) {
        }
        SignalAlertViewModel signalAlertViewModel22 = this.this$0;
        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objKWHzl);
        if (thM7380exceptionOrNullimpl != null) {
        }
        return Unit.INSTANCE;
    }
}
