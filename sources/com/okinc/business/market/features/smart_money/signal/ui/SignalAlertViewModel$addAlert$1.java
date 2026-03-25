package com.okinc.business.market.features.smart_money.signal.ui;

import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C23274hvD;
import o.C29461kuA;
import o.C29463kuC;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.pUU;
import o.yEJ;

/* JADX INFO: loaded from: classes7.dex */
public final class SignalAlertViewModel$addAlert$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ C29463kuC.Application $tokenAlert;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ SignalAlertViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignalAlertViewModel$addAlert$1(SignalAlertViewModel signalAlertViewModel, C29463kuC.Application application, Continuation<? super SignalAlertViewModel$addAlert$1> continuation) {
        super(2, continuation);
        this.this$0 = signalAlertViewModel;
        this.$tokenAlert = application;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SignalAlertViewModel$addAlert$1(this.this$0, this.$tokenAlert, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SignalAlertViewModel$addAlert$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0087 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f0  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        C29461kuA c29461kuA;
        String str;
        C29461kuA c29461kuA2;
        Object objKWHzl;
        Object value;
        C29463kuC c29463kuCCopy$default;
        Object obj2;
        Throwable thM7380exceptionOrNullimpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C29461kuA c29461kuA3 = this.this$0.DbNXlk;
            SignalAlertViewModel signalAlertViewModel = this.this$0;
            this.L$0 = c29461kuA3;
            this.label = 1;
            Object objCopydefault2 = signalAlertViewModel.copydefault(this);
            if (objCopydefault2 == objCopydefault) {
                return objCopydefault;
            }
            c29461kuA = c29461kuA3;
            obj = objCopydefault2;
        } else {
            if (i != 1) {
                if (i == 2) {
                    String str2 = (String) this.L$1;
                    c29461kuA2 = (C29461kuA) this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    str = str2;
                    long jLongValue = ((Number) obj).longValue();
                    C29463kuC.Application application = this.$tokenAlert;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 3;
                    objKWHzl = c29461kuA2.KWHzl(str, jLongValue, application, this);
                    if (objKWHzl == objCopydefault) {
                        return objCopydefault;
                    }
                    SignalAlertViewModel signalAlertViewModel2 = this.this$0;
                    C29463kuC.Application application2 = this.$tokenAlert;
                    if (Result.m7384isSuccessimpl(objKWHzl)) {
                    }
                    thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objKWHzl);
                    if (thM7380exceptionOrNullimpl != null) {
                    }
                    return Unit.INSTANCE;
                }
                if (i != 3) {
                    if (i != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj2 = this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    objKWHzl = obj2;
                    thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objKWHzl);
                    if (thM7380exceptionOrNullimpl != null) {
                        pUU.AEQbTJ("SignalAlertViewModel", "Failed to add alert - server error", thM7380exceptionOrNullimpl);
                    }
                    return Unit.INSTANCE;
                }
                C56391yDq.AEQbTJ(obj);
                objKWHzl = ((Result) obj).m7386unboximpl();
                SignalAlertViewModel signalAlertViewModel22 = this.this$0;
                C29463kuC.Application application22 = this.$tokenAlert;
                if (Result.m7384isSuccessimpl(objKWHzl)) {
                    if (((Boolean) objKWHzl).booleanValue()) {
                        MutableStateFlow mutableStateFlow = signalAlertViewModel22.EZpvd;
                        do {
                            value = mutableStateFlow.getValue();
                            C29463kuC c29463kuC = (C29463kuC) value;
                            if (application22 == null) {
                                c29463kuCCopy$default = C29463kuC.copy$default(c29463kuC, false, true, null, 5, null);
                            } else {
                                c29463kuCCopy$default = C29463kuC.copy$default(c29463kuC, false, false, yEJ.OLrzqt(c29463kuC.AEQbTJ(), application22), 3, null);
                            }
                        } while (!mutableStateFlow.compareAndSet(value, c29463kuCCopy$default));
                        MutableSharedFlow mutableSharedFlow = signalAlertViewModel22.AEQbTJ;
                        Integer numAEQbTJ = C56443yFo.AEQbTJ(application22 == null ? C23274hvD.Fragment.ixgjPv : C23274hvD.Fragment.zblBkD);
                        this.L$0 = objKWHzl;
                        this.label = 4;
                        if (mutableSharedFlow.emit(numAEQbTJ, this) == objCopydefault) {
                            return objCopydefault;
                        }
                        obj2 = objKWHzl;
                        objKWHzl = obj2;
                    } else {
                        pUU.copydefault("SignalAlertViewModel", "Failed to add alert - operation unsuccessful");
                    }
                }
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objKWHzl);
                if (thM7380exceptionOrNullimpl != null) {
                }
                return Unit.INSTANCE;
            }
            c29461kuA = (C29461kuA) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        String str3 = (String) obj;
        SignalAlertViewModel signalAlertViewModel3 = this.this$0;
        this.L$0 = c29461kuA;
        this.L$1 = str3;
        this.label = 2;
        Object objEZpvd = signalAlertViewModel3.EZpvd((Continuation<? super Long>) this);
        if (objEZpvd == objCopydefault) {
            return objCopydefault;
        }
        str = str3;
        obj = objEZpvd;
        c29461kuA2 = c29461kuA;
        long jLongValue2 = ((Number) obj).longValue();
        C29463kuC.Application application3 = this.$tokenAlert;
        this.L$0 = null;
        this.L$1 = null;
        this.label = 3;
        objKWHzl = c29461kuA2.KWHzl(str, jLongValue2, application3, this);
        if (objKWHzl == objCopydefault) {
        }
        SignalAlertViewModel signalAlertViewModel222 = this.this$0;
        C29463kuC.Application application222 = this.$tokenAlert;
        if (Result.m7384isSuccessimpl(objKWHzl)) {
        }
        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objKWHzl);
        if (thM7380exceptionOrNullimpl != null) {
        }
        return Unit.INSTANCE;
    }
}
