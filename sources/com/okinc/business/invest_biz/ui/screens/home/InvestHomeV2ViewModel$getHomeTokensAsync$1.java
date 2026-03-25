package com.okinc.business.invest_biz.ui.screens.home;

import com.okinc.business.invest_biz.data.bean.HomeTokensResponse;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC26474jcx;
import o.iFW;

/* JADX INFO: loaded from: classes6.dex */
public final class InvestHomeV2ViewModel$getHomeTokensAsync$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends HomeTokensResponse>>, Object> {
    final /* synthetic */ boolean $forceRefresh;
    final /* synthetic */ boolean $needEmit;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ InvestHomeV2ViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestHomeV2ViewModel$getHomeTokensAsync$1(boolean z, InvestHomeV2ViewModel investHomeV2ViewModel, boolean z2, Continuation<? super InvestHomeV2ViewModel$getHomeTokensAsync$1> continuation) {
        super(2, continuation);
        this.$forceRefresh = z;
        this.this$0 = investHomeV2ViewModel;
        this.$needEmit = z2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InvestHomeV2ViewModel$getHomeTokensAsync$1(this.$forceRefresh, this.this$0, this.$needEmit, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends HomeTokensResponse>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Result<HomeTokensResponse>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Result<HomeTokensResponse>> continuation) {
        return ((InvestHomeV2ViewModel$getHomeTokensAsync$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ab A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c7  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM8614invokegIAlus$default;
        Object objM8614invokegIAlus$default2;
        Object obj2;
        InvestHomeV2ViewModel investHomeV2ViewModel;
        Object objCopydefault = C56442yFn.copydefault();
        switch (this.label) {
            case 0:
                C56391yDq.AEQbTJ(obj);
                if (!this.$forceRefresh || (this.this$0.AYXKKw.getValue() instanceof InterfaceC26474jcx.ActionBar)) {
                    MutableStateFlow mutableStateFlow = this.this$0.AYXKKw;
                    InterfaceC26474jcx.TaskDescription taskDescription = InterfaceC26474jcx.TaskDescription.OLrzqt;
                    this.label = 1;
                    if (mutableStateFlow.emit(taskDescription, this) == objCopydefault) {
                        return objCopydefault;
                    }
                }
                if (!this.$needEmit) {
                    iFW ifw = this.this$0.AuCTelauCTel;
                    this.label = 2;
                    objM8614invokegIAlus$default2 = iFW.m8614invokegIAlus$default(ifw, false, this, 1, null);
                    if (objM8614invokegIAlus$default2 == objCopydefault) {
                        return objCopydefault;
                    }
                    obj2 = objM8614invokegIAlus$default2;
                    investHomeV2ViewModel = this.this$0;
                    if (Result.m7384isSuccessimpl(obj2)) {
                        investHomeV2ViewModel.djBIcL = (HomeTokensResponse) obj2;
                        this.L$0 = obj2;
                        this.L$1 = investHomeV2ViewModel;
                        this.label = 3;
                        if (investHomeV2ViewModel.OLrzqt((Continuation<? super Unit>) this) == objCopydefault) {
                            return objCopydefault;
                        }
                        this.L$0 = obj2;
                        this.L$1 = null;
                        this.label = 4;
                        if (investHomeV2ViewModel.AEQbTJ((Continuation<? super Unit>) this) == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                    objM8614invokegIAlus$default = obj2;
                    InvestHomeV2ViewModel investHomeV2ViewModel2 = this.this$0;
                    if (Result.m7380exceptionOrNullimpl(objM8614invokegIAlus$default) != null) {
                        MutableStateFlow mutableStateFlow2 = investHomeV2ViewModel2.AYXKKw;
                        InterfaceC26474jcx.ActionBar actionBar = InterfaceC26474jcx.ActionBar.EZpvd;
                        this.L$0 = objM8614invokegIAlus$default;
                        this.label = 5;
                        if (mutableStateFlow2.emit(actionBar, this) == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                    return Result.m7376boximpl(objM8614invokegIAlus$default);
                }
                iFW ifw2 = this.this$0.AuCTelauCTel;
                this.label = 6;
                objM8614invokegIAlus$default = iFW.m8614invokegIAlus$default(ifw2, false, this, 1, null);
                if (objM8614invokegIAlus$default == objCopydefault) {
                    return objCopydefault;
                }
                return Result.m7376boximpl(objM8614invokegIAlus$default);
            case 1:
                C56391yDq.AEQbTJ(obj);
                if (!this.$needEmit) {
                }
                break;
            case 2:
                C56391yDq.AEQbTJ(obj);
                objM8614invokegIAlus$default2 = ((Result) obj).m7386unboximpl();
                obj2 = objM8614invokegIAlus$default2;
                investHomeV2ViewModel = this.this$0;
                if (Result.m7384isSuccessimpl(obj2)) {
                }
                objM8614invokegIAlus$default = obj2;
                InvestHomeV2ViewModel investHomeV2ViewModel22 = this.this$0;
                if (Result.m7380exceptionOrNullimpl(objM8614invokegIAlus$default) != null) {
                }
                return Result.m7376boximpl(objM8614invokegIAlus$default);
            case 3:
                investHomeV2ViewModel = (InvestHomeV2ViewModel) this.L$1;
                obj2 = this.L$0;
                C56391yDq.AEQbTJ(obj);
                this.L$0 = obj2;
                this.L$1 = null;
                this.label = 4;
                if (investHomeV2ViewModel.AEQbTJ((Continuation<? super Unit>) this) == objCopydefault) {
                }
                objM8614invokegIAlus$default = obj2;
                InvestHomeV2ViewModel investHomeV2ViewModel222 = this.this$0;
                if (Result.m7380exceptionOrNullimpl(objM8614invokegIAlus$default) != null) {
                }
                return Result.m7376boximpl(objM8614invokegIAlus$default);
            case 4:
                Object obj3 = this.L$0;
                C56391yDq.AEQbTJ(obj);
                objM8614invokegIAlus$default = obj3;
                InvestHomeV2ViewModel investHomeV2ViewModel2222 = this.this$0;
                if (Result.m7380exceptionOrNullimpl(objM8614invokegIAlus$default) != null) {
                }
                return Result.m7376boximpl(objM8614invokegIAlus$default);
            case 5:
                Object obj4 = this.L$0;
                C56391yDq.AEQbTJ(obj);
                objM8614invokegIAlus$default = obj4;
                return Result.m7376boximpl(objM8614invokegIAlus$default);
            case 6:
                C56391yDq.AEQbTJ(obj);
                objM8614invokegIAlus$default = ((Result) obj).m7386unboximpl();
                return Result.m7376boximpl(objM8614invokegIAlus$default);
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
