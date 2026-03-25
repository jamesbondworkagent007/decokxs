package com.okinc.business.invest_biz.ui.screens.home;

import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C23701iGc;
import o.C25542iyg;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC26470jct;
import o.iFZ;

/* JADX INFO: loaded from: classes6.dex */
public final class InvestHomeV2ViewModel$getInitDataAsync$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends C25542iyg>>, Object> {
    final /* synthetic */ boolean $forceRefresh;
    final /* synthetic */ boolean $needEmit;
    Object L$0;
    int label;
    final /* synthetic */ InvestHomeV2ViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestHomeV2ViewModel$getInitDataAsync$1(boolean z, InvestHomeV2ViewModel investHomeV2ViewModel, boolean z2, Continuation<? super InvestHomeV2ViewModel$getInitDataAsync$1> continuation) {
        super(2, continuation);
        this.$forceRefresh = z;
        this.this$0 = investHomeV2ViewModel;
        this.$needEmit = z2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InvestHomeV2ViewModel$getInitDataAsync$1(this.$forceRefresh, this.this$0, this.$needEmit, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends C25542iyg>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Result<C25542iyg>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Result<C25542iyg>> continuation) {
        return ((InvestHomeV2ViewModel$getInitDataAsync$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a6  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objEZpvd;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            if (!this.$forceRefresh || (this.this$0.KWHzl.getValue() instanceof InterfaceC26470jct.Application)) {
                MutableStateFlow mutableStateFlow = this.this$0.KWHzl;
                InterfaceC26470jct.TaskDescription taskDescription = InterfaceC26470jct.TaskDescription.EZpvd;
                this.label = 1;
                if (mutableStateFlow.emit(taskDescription, this) == objCopydefault) {
                    return objCopydefault;
                }
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    C56391yDq.AEQbTJ(obj);
                    objEZpvd = ((Result) obj).m7386unboximpl();
                    InvestHomeV2ViewModel investHomeV2ViewModel = this.this$0;
                    if (Result.m7384isSuccessimpl(objEZpvd)) {
                        MutableStateFlow mutableStateFlow2 = investHomeV2ViewModel.KWHzl;
                        InterfaceC26470jct.ActionBar actionBarAEQbTJ = C23701iGc.AEQbTJ((C25542iyg) objEZpvd);
                        this.L$0 = objEZpvd;
                        this.label = 3;
                        if (mutableStateFlow2.emit(actionBarAEQbTJ, this) == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                    InvestHomeV2ViewModel investHomeV2ViewModel2 = this.this$0;
                    if (Result.m7380exceptionOrNullimpl(objEZpvd) != null) {
                    }
                    return Result.m7376boximpl(objEZpvd);
                }
                if (i != 3) {
                    if (i == 4) {
                        Object obj2 = this.L$0;
                        C56391yDq.AEQbTJ(obj);
                        objEZpvd = obj2;
                    } else {
                        if (i != 5) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C56391yDq.AEQbTJ(obj);
                        objEZpvd = ((Result) obj).m7386unboximpl();
                    }
                    return Result.m7376boximpl(objEZpvd);
                }
                Object obj3 = this.L$0;
                C56391yDq.AEQbTJ(obj);
                objEZpvd = obj3;
                InvestHomeV2ViewModel investHomeV2ViewModel22 = this.this$0;
                if (Result.m7380exceptionOrNullimpl(objEZpvd) != null) {
                    MutableStateFlow mutableStateFlow3 = investHomeV2ViewModel22.KWHzl;
                    InterfaceC26470jct.Application application = InterfaceC26470jct.Application.OLrzqt;
                    this.L$0 = objEZpvd;
                    this.label = 4;
                    if (mutableStateFlow3.emit(application, this) == objCopydefault) {
                        return objCopydefault;
                    }
                }
                return Result.m7376boximpl(objEZpvd);
            }
            C56391yDq.AEQbTJ(obj);
        }
        if (this.$needEmit) {
            iFZ ifz = this.this$0.ejfBZ;
            this.label = 2;
            objEZpvd = ifz.EZpvd(this);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            InvestHomeV2ViewModel investHomeV2ViewModel3 = this.this$0;
            if (Result.m7384isSuccessimpl(objEZpvd)) {
            }
            InvestHomeV2ViewModel investHomeV2ViewModel222 = this.this$0;
            if (Result.m7380exceptionOrNullimpl(objEZpvd) != null) {
            }
            return Result.m7376boximpl(objEZpvd);
        }
        iFZ ifz2 = this.this$0.ejfBZ;
        this.label = 5;
        objEZpvd = ifz2.EZpvd(this);
        if (objEZpvd == objCopydefault) {
            return objCopydefault;
        }
        return Result.m7376boximpl(objEZpvd);
    }
}
