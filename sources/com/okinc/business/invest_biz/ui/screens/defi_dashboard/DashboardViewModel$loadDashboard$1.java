package com.okinc.business.invest_biz.ui.screens.defi_dashboard;

import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C24193iYi;
import o.C24204iYt;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC24202iYr;
import o.InterfaceC26363jas;
import o.pUU;

/* JADX INFO: loaded from: classes6.dex */
public final class DashboardViewModel$loadDashboard$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ long $chainId;
    int label;
    final /* synthetic */ C24204iYt this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DashboardViewModel$loadDashboard$1(C24204iYt c24204iYt, long j, Continuation<? super DashboardViewModel$loadDashboard$1> continuation) {
        super(2, continuation);
        this.this$0 = c24204iYt;
        this.$chainId = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DashboardViewModel$loadDashboard$1(this.this$0, this.$chainId, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DashboardViewModel$loadDashboard$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0096  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objEZpvd;
        boolean zEZpvd;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            this.this$0.djBIcL = this.$chainId;
            this.this$0.gEmmrt.setValue(InterfaceC24202iYr.StateListAnimator.copydefault);
            InterfaceC26363jas interfaceC26363jas = this.this$0.AhwBna;
            long j = this.$chainId;
            this.label = 1;
            objEZpvd = interfaceC26363jas.EZpvd(j, this);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objEZpvd = ((Result) obj).m7386unboximpl();
        }
        C24204iYt c24204iYt = this.this$0;
        if (Result.m7384isSuccessimpl(objEZpvd)) {
            InterfaceC24202iYr interfaceC24202iYr = (InterfaceC24202iYr) objEZpvd;
            c24204iYt.EZpvd.setValue(null);
            c24204iYt.gEmmrt.setValue(interfaceC24202iYr);
            MutableStateFlow mutableStateFlow = c24204iYt.copydefault;
            if (interfaceC24202iYr instanceof InterfaceC24202iYr.TaskDescription) {
                zEZpvd = C24193iYi.OLrzqt.AEQbTJ() ? false : ((InterfaceC24202iYr.TaskDescription) interfaceC24202iYr).EZpvd();
                mutableStateFlow.setValue(C56443yFo.KWHzl(zEZpvd));
            } else {
                if (interfaceC24202iYr instanceof InterfaceC24202iYr.Fragment) {
                    zEZpvd = ((InterfaceC24202iYr.Fragment) interfaceC24202iYr).copydefault();
                } else if (interfaceC24202iYr instanceof InterfaceC24202iYr.LoaderManager) {
                    zEZpvd = ((InterfaceC24202iYr.LoaderManager) interfaceC24202iYr).AEQbTJ();
                } else if (interfaceC24202iYr instanceof InterfaceC24202iYr.Application) {
                    zEZpvd = ((InterfaceC24202iYr.Application) interfaceC24202iYr).EZpvd();
                }
                mutableStateFlow.setValue(C56443yFo.KWHzl(zEZpvd));
            }
        }
        C24204iYt c24204iYt2 = this.this$0;
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objEZpvd);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.AEQbTJ("InvestDashboard", thM7380exceptionOrNullimpl);
            c24204iYt2.gEmmrt.setValue(InterfaceC24202iYr.ActionBar.EZpvd);
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }
}
