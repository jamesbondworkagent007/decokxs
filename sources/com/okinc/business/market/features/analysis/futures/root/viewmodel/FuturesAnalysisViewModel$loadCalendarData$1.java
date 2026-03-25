package com.okinc.business.market.features.analysis.futures.root.viewmodel;

import java.util.Date;
import kotlin.Result;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C25876jJq;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC49371unL;
import o.jIU;

/* JADX INFO: loaded from: classes6.dex */
public final class FuturesAnalysisViewModel$loadCalendarData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Date $date;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ FuturesAnalysisViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FuturesAnalysisViewModel$loadCalendarData$1(FuturesAnalysisViewModel futuresAnalysisViewModel, Date date, Continuation<? super FuturesAnalysisViewModel$loadCalendarData$1> continuation) {
        super(2, continuation);
        this.this$0 = futuresAnalysisViewModel;
        this.$date = date;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        FuturesAnalysisViewModel$loadCalendarData$1 futuresAnalysisViewModel$loadCalendarData$1 = new FuturesAnalysisViewModel$loadCalendarData$1(this.this$0, this.$date, continuation);
        futuresAnalysisViewModel$loadCalendarData$1.L$0 = obj;
        return futuresAnalysisViewModel$loadCalendarData$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FuturesAnalysisViewModel$loadCalendarData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00a0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f6  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object obj2;
        Throwable thM7380exceptionOrNullimpl;
        CoroutineScope coroutineScope;
        String str;
        String str2;
        Object objCopydefault = C56442yFn.copydefault();
        try {
        } catch (Throwable th) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        switch (this.label) {
            case 0:
                C56391yDq.AEQbTJ(obj);
                coroutineScope = (CoroutineScope) this.L$0;
                FuturesAnalysisViewModel futuresAnalysisViewModel = this.this$0;
                this.L$0 = coroutineScope;
                this.label = 1;
                obj = futuresAnalysisViewModel.AEQbTJ(this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
                str = (String) obj;
                if (str != null || str.length() == 0) {
                    return Unit.INSTANCE;
                }
                FuturesAnalysisViewModel futuresAnalysisViewModel2 = this.this$0;
                InterfaceC49371unL.ActionBar actionBar = new InterfaceC49371unL.ActionBar(null, 1, null);
                this.L$0 = coroutineScope;
                this.L$1 = str;
                this.label = 2;
                if (futuresAnalysisViewModel2.AEQbTJ((InterfaceC49371unL<C25876jJq>) actionBar, (Continuation<? super Unit>) this) == objCopydefault) {
                    return objCopydefault;
                }
                str2 = str;
                FuturesAnalysisViewModel futuresAnalysisViewModel3 = this.this$0;
                Date date = this.$date;
                Result.Application application2 = Result.Companion;
                jIU jiu = futuresAnalysisViewModel3.djBIcL;
                Triple triple = new Triple(date, futuresAnalysisViewModel3.AEQbTJ().OLrzqt().getValue().getUnit(), str2);
                this.L$0 = null;
                this.L$1 = null;
                this.label = 3;
                obj = jiu.EZpvd(triple, (Continuation) this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
                objM7377constructorimpl = Result.m7377constructorimpl((C25876jJq) obj);
                obj2 = objM7377constructorimpl;
                FuturesAnalysisViewModel futuresAnalysisViewModel4 = this.this$0;
                if (Result.m7384isSuccessimpl(obj2)) {
                    C25876jJq c25876jJq = (C25876jJq) obj2;
                    if (c25876jJq.KWHzl().isEmpty()) {
                        InterfaceC49371unL.TaskDescription taskDescription = new InterfaceC49371unL.TaskDescription(null, 1, null);
                        this.L$0 = obj2;
                        this.L$1 = null;
                        this.label = 4;
                        if (futuresAnalysisViewModel4.AEQbTJ((InterfaceC49371unL<C25876jJq>) taskDescription, (Continuation<? super Unit>) this) == objCopydefault) {
                            return objCopydefault;
                        }
                    } else {
                        InterfaceC49371unL.Activity activity = new InterfaceC49371unL.Activity(c25876jJq);
                        this.L$0 = obj2;
                        this.L$1 = null;
                        this.label = 5;
                        if (futuresAnalysisViewModel4.AEQbTJ((InterfaceC49371unL<C25876jJq>) activity, (Continuation<? super Unit>) this) == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                }
                FuturesAnalysisViewModel futuresAnalysisViewModel5 = this.this$0;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj2);
                if (thM7380exceptionOrNullimpl != null) {
                    InterfaceC49371unL.Application application3 = new InterfaceC49371unL.Application(thM7380exceptionOrNullimpl, null, 2, null);
                    this.L$0 = obj2;
                    this.L$1 = null;
                    this.label = 6;
                    if (futuresAnalysisViewModel5.AEQbTJ((InterfaceC49371unL<C25876jJq>) application3, (Continuation<? super Unit>) this) == objCopydefault) {
                        return objCopydefault;
                    }
                }
                return Unit.INSTANCE;
            case 1:
                coroutineScope = (CoroutineScope) this.L$0;
                C56391yDq.AEQbTJ(obj);
                str = (String) obj;
                if (str != null) {
                    break;
                }
                return Unit.INSTANCE;
            case 2:
                str2 = (String) this.L$1;
                C56391yDq.AEQbTJ(obj);
                FuturesAnalysisViewModel futuresAnalysisViewModel32 = this.this$0;
                Date date2 = this.$date;
                Result.Application application22 = Result.Companion;
                jIU jiu2 = futuresAnalysisViewModel32.djBIcL;
                Triple triple2 = new Triple(date2, futuresAnalysisViewModel32.AEQbTJ().OLrzqt().getValue().getUnit(), str2);
                this.L$0 = null;
                this.L$1 = null;
                this.label = 3;
                obj = jiu2.EZpvd(triple2, (Continuation) this);
                if (obj == objCopydefault) {
                }
                objM7377constructorimpl = Result.m7377constructorimpl((C25876jJq) obj);
                obj2 = objM7377constructorimpl;
                FuturesAnalysisViewModel futuresAnalysisViewModel42 = this.this$0;
                if (Result.m7384isSuccessimpl(obj2)) {
                }
                FuturesAnalysisViewModel futuresAnalysisViewModel52 = this.this$0;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj2);
                if (thM7380exceptionOrNullimpl != null) {
                }
                return Unit.INSTANCE;
            case 3:
                C56391yDq.AEQbTJ(obj);
                objM7377constructorimpl = Result.m7377constructorimpl((C25876jJq) obj);
                obj2 = objM7377constructorimpl;
                FuturesAnalysisViewModel futuresAnalysisViewModel422 = this.this$0;
                if (Result.m7384isSuccessimpl(obj2)) {
                }
                FuturesAnalysisViewModel futuresAnalysisViewModel522 = this.this$0;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj2);
                if (thM7380exceptionOrNullimpl != null) {
                }
                return Unit.INSTANCE;
            case 4:
            case 5:
                obj2 = this.L$0;
                C56391yDq.AEQbTJ(obj);
                FuturesAnalysisViewModel futuresAnalysisViewModel5222 = this.this$0;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj2);
                if (thM7380exceptionOrNullimpl != null) {
                }
                return Unit.INSTANCE;
            case 6:
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
